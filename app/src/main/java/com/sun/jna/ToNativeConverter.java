package com.sun.jna;

/* JADX INFO: loaded from: classes2.dex */
public interface ToNativeConverter {
    Class<?> nativeType();

    Object toNative(Object obj, ToNativeContext toNativeContext);
}
