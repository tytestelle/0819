package com.google.common.collect;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRONG' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO[] f3593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public static final O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO STRONG;
    public static final O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO WEAK;

    static {
        final String str = "STRONG";
        final int i = 0;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO = new O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO(str, i) { // from class: com.google.common.collect.O000o0000oo0OoOoo0000oOOOoOoo00o0Oooo0Oo
            @Override // com.google.common.collect.O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO
            public com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO defaultEquivalence() {
                return com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.equals();
            }
        };
        STRONG = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO;
        final String str2 = "WEAK";
        final int i2 = 1;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 = new O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO(str2, i2) { // from class: com.google.common.collect.O000o000Oo0OoOoOooOOoO00o0O000000OooO0Oo
            @Override // com.google.common.collect.O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO
            public com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO defaultEquivalence() {
                return com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.identity();
            }
        };
        WEAK = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2;
        f3593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO[]{o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO, o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2};
    }

    public O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO(String str, int i, O000OooO0oOoooOOoooo0oo00oo0Oo0OOooOOo0o o000OooO0oOoooOOoooo0oo00oo0Oo0OOooOOo0o) {
        super(str, i);
    }

    public static O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO valueOf(String str) {
        return (O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO) Enum.valueOf(O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.class, str);
    }

    public static O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO[] values() {
        return (O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO[]) f3593O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    public abstract com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO defaultEquivalence();
}
