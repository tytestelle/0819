package com.sun.jna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointerType implements NativeMapped {
    private Pointer pointer;

    public PointerType() {
        this.pointer = Pointer.NULL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PointerType)) {
            return false;
        }
        Pointer pointer = ((PointerType) obj).getPointer();
        Pointer pointer2 = this.pointer;
        if (pointer2 == null) {
            return pointer == null;
        }
        return pointer2.equals(pointer);
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        if (obj == null) {
            return null;
        }
        PointerType pointerType = (PointerType) Klass.newInstance(getClass());
        pointerType.pointer = (Pointer) obj;
        return pointerType;
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    public int hashCode() {
        Pointer pointer = this.pointer;
        if (pointer != null) {
            return pointer.hashCode();
        }
        return 0;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return Pointer.class;
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return getPointer();
    }

    public String toString() {
        if (this.pointer == null) {
            return "NULL";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.pointer.toString());
        sb.append(" (");
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, super.toString(), ")");
    }

    public PointerType(Pointer pointer) {
        this.pointer = pointer;
    }
}
