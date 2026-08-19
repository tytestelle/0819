package O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, Serializable {
    private final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.completion = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getCallerFrame() {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.completion;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        return null;
    }

    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public abstract /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext();

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) getClass().getAnnotation(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class);
        String str = null;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            return null;
        }
        int iV = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.l()[iIntValue] : -1;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1668O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1667O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            try {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Class.class.getDeclaredMethod("getModule", null), 9, getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1668O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002;
            } catch (Exception unused2) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1668O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
            }
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
            Method method = (Method) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.c();
        } else {
            strC = str + '/' + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.c();
        }
        return new StackTraceElement(strC, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.m(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void resumeWith(Object obj) {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
        while (true) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.completion;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
            try {
                Object objInvokeSuspend = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invokeSuspend(obj);
                if (objInvokeSuspend == kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED) {
                    return;
                } else {
                    obj = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(objInvokeSuspend);
                }
            } catch (Throwable th) {
                obj = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th));
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.releaseIntercepted();
            if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.resumeWith(obj);
                return;
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
