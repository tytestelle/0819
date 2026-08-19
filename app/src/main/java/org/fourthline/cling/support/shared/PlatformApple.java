package org.fourthline.cling.support.shared;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformApple {

    public static class AppListenerProxy implements InvocationHandler {
        private O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o appController;
        private Object object;

        private AppListenerProxy(Object obj, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.object = obj;
            this.appController = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }

        public static Object newInstance(Object obj, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new AppListenerProxy(obj, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object objInvoke = null;
            try {
                if ("handleQuit".equals(method.getName())) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.appController;
                    if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dispose();
                        this.appController.getView().dispose();
                    }
                } else {
                    objInvoke = method.invoke(this.object, objArr);
                }
            } catch (Exception unused) {
            }
            return objInvoke;
        }
    }

    public static void setup(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", str);
        System.setProperty("apple.awt.showGrowBox", "true");
        Class<?> cls = Class.forName("com.apple.eawt.Application");
        cls.getDeclaredMethod("addApplicationListener", Class.forName("com.apple.eawt.ApplicationListener")).invoke(cls.newInstance(), AppListenerProxy.newInstance(Class.forName("com.apple.eawt.ApplicationAdapter").newInstance(), o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
    }
}
