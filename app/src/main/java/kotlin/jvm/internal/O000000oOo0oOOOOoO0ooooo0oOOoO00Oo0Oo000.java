package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements FunctionBase, O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    private final int arity;
    private final int flags;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this(i, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO computeReflected() {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
            return getName().equals(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getName()) && getSignature().equals(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getSignature()) && this.flags == o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.flags && this.arity == o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.arity && O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getBoundReceiver(), o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getBoundReceiver()) && O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getOwner(), o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getOwner());
        }
        if (obj instanceof O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute = compute();
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute != this) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getReflected() {
        return (O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) super.getReflected();
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
