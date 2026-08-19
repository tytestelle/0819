package org.fourthline.cling.support.shared;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class NewPlatformApple {

    public static class AppListenerProxy implements InvocationHandler {
        private Object object;
        private ShutdownHandler shutdownHandler;

        private AppListenerProxy(Object obj, ShutdownHandler shutdownHandler) {
            this.object = obj;
            this.shutdownHandler = shutdownHandler;
        }

        public static Object newInstance(Object obj, ShutdownHandler shutdownHandler) {
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new AppListenerProxy(obj, shutdownHandler));
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object objInvoke = null;
            try {
                if ("handleQuit".equals(method.getName())) {
                    ShutdownHandler shutdownHandler = this.shutdownHandler;
                    if (shutdownHandler != null) {
                        shutdownHandler.shutdown();
                    }
                } else {
                    objInvoke = method.invoke(this.object, objArr);
                }
            } catch (Exception unused) {
            }
            return objInvoke;
        }
    }

    public static void setup(ShutdownHandler shutdownHandler, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", str);
        System.setProperty("apple.awt.showGrowBox", "true");
        Class<?> cls = Class.forName("com.apple.eawt.Application");
        cls.getDeclaredMethod("addApplicationListener", Class.forName("com.apple.eawt.ApplicationListener")).invoke(cls.newInstance(), AppListenerProxy.newInstance(Class.forName("com.apple.eawt.ApplicationAdapter").newInstance(), shutdownHandler));
    }
}
