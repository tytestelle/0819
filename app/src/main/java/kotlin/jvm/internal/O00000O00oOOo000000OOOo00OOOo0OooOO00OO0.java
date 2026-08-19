package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {
    private final boolean syntheticJavaProperty;

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) obj;
            return getOwner().equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getOwner()) && getName().equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getName()) && getSignature().equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getSignature()) && O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getBoundReceiver(), o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getBoundReceiver());
        }
        if (obj instanceof O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            return obj.equals(compute());
        }
        return false;
    }

    public abstract /* synthetic */ O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 getGetter();

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public boolean isConst() {
        return ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) getReflected()).isConst();
    }

    public boolean isLateinit() {
        return ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) getReflected()).isLateinit();
    }

    public String toString() {
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute = compute();
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute != this) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) super.getReflected();
    }

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
