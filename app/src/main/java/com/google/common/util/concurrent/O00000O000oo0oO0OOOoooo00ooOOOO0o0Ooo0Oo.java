package com.google.common.util.concurrent;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements PrivilegedExceptionAction {
    public static Unsafe O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }
}
