package com.sun.jna.ptr;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes2.dex */
public class PointerByReference extends ByReference {
    public PointerByReference() {
        this(null);
    }

    public Pointer getValue() {
        return getPointer().getPointer(0L);
    }

    public void setValue(Pointer pointer) {
        getPointer().setPointer(0L, pointer);
    }

    public PointerByReference(Pointer pointer) {
        super(Native.POINTER_SIZE);
        setValue(pointer);
    }
}
