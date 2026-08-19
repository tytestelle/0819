package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByReference extends PointerType {
    public ByReference(int i) {
        setPointer(new Memory(i));
    }

    @Override // com.sun.jna.PointerType
    public String toString() {
        try {
            Object objInvoke = getClass().getMethod("getValue", null).invoke(this, null);
            return objInvoke == null ? String.format("null@0x%x", Long.valueOf(Pointer.nativeValue(getPointer()))) : String.format("%s@0x%x=%s", objInvoke.getClass().getSimpleName(), Long.valueOf(Pointer.nativeValue(getPointer())), objInvoke);
        } catch (Exception e) {
            return "ByReference Contract violated - " + getClass().getName() + "#getValue raised exception: " + e.getMessage();
        }
    }
}
