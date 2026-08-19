package O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements InvocationHandler {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final Logger f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Logger.getLogger(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ConcurrentHashMap f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(List list, Class cls, Class[] clsArr, Object[] objArr) {
        f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.fine("Creating state machine with initial state: " + cls);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            try {
                Object objNewInstance = cls2.getConstructor(clsArr).newInstance(objArr);
                f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.fine("Adding state instance: " + objNewInstance.getClass().getName());
                this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.put(cls2, objNewInstance);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("State " + cls2.getName() + " has the wrong constructor: " + e, e);
            } catch (Exception e2) {
                throw new RuntimeException("State " + cls2.getName() + " can't be instantiated: " + e2, e2);
            }
        }
        if (!this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.containsKey(cls)) {
            throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Initial state not in list of states: "));
        }
        this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(cls);
        synchronized (this) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        String strConcat = "Trying to invoke entry method of state: ".concat(obj.getClass().getName());
        Logger logger = f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        logger.fine(strConcat);
        try {
            obj.getClass().getMethod("onEntry", null).invoke(obj, null);
        } catch (NoSuchMethodException unused) {
            logger.finer("No entry method found on state: ".concat(obj.getClass().getName()));
        } catch (Exception e) {
            throw new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("State '" + obj.getClass().getName() + "' entry method threw exception: " + e, e);
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        String strConcat = "Trying to invoking exit method of state: ".concat(obj.getClass().getName());
        Logger logger = f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        logger.finer(strConcat);
        try {
            obj.getClass().getMethod("onExit", null).invoke(obj, null);
        } catch (NoSuchMethodException unused) {
            logger.finer("No exit method found on state: ".concat(obj.getClass().getName()));
        } catch (Exception e) {
            throw new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("State '" + obj.getClass().getName() + "' exit method threw exception: " + e, e);
        }
    }

    public final Method O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Method method) {
        try {
            return this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass().getMethod(method.getName(), method.getParameterTypes());
        } catch (NoSuchMethodException unused) {
            throw new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("State '" + this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass().getName() + "' doesn't support signal '" + method.getName() + "'");
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        synchronized (this) {
            try {
                if ("getCurrentState".equals(method.getName()) && method.getParameterTypes().length == 0) {
                    return this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
                if ("forceState".equals(method.getName()) && method.getParameterTypes().length == 1 && objArr.length == 1 && (obj2 = objArr[0]) != null && (obj2 instanceof Class)) {
                    Object obj3 = this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get((Class) obj2);
                    if (obj3 == null) {
                        throw new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Can't force to invalid state: " + objArr[0]);
                    }
                    f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.finer("Forcing state machine into state: ".concat(obj3.getClass().getName()));
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj3;
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj3);
                    return null;
                }
                Method methodO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(method);
                Logger logger = f2112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                logger.fine("Invoking signal method of current state: " + methodO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString());
                Object objInvoke = methodO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invoke(this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, objArr);
                if (objInvoke != null && (objInvoke instanceof Class)) {
                    Class cls = (Class) objInvoke;
                    if (this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.containsKey(cls)) {
                        logger.fine("Executing transition to next state: ".concat(cls.getName()));
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        Object obj4 = this.f2113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(cls);
                        this.f2114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj4;
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj4);
                    }
                }
                return objInvoke;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
