package com.google.common.collect;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NEXT_LOWER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo {
    public static final O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo INVERTED_INSERTION_INDEX;
    public static final O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo NEXT_HIGHER;
    public static final O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo NEXT_LOWER;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo[] f3675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        final String str = "NEXT_LOWER";
        final int i = 0;
        O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo = new O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo(str, i) { // from class: com.google.common.collect.O000ooo0oOOOooOO0O0o000OoOOOooOOoo0ooo00
            @Override // com.google.common.collect.O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo
            public int resultIndex(int i2) {
                return i2 - 1;
            }
        };
        NEXT_LOWER = o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo;
        final String str2 = "NEXT_HIGHER";
        final int i2 = 1;
        O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo2 = new O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo(str2, i2) { // from class: com.google.common.collect.O000oooOoOOO0OOo00O0000oOoOO0o0O00ooOo0o
            @Override // com.google.common.collect.O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo
            public int resultIndex(int i3) {
                return i3;
            }
        };
        NEXT_HIGHER = o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo2;
        final String str3 = "INVERTED_INSERTION_INDEX";
        final int i3 = 2;
        O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo3 = new O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo(str3, i3) { // from class: com.google.common.collect.O000oooOoOOOooO0oOooOOoO00ooO0o0oOOoO0O0
            @Override // com.google.common.collect.O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo
            public int resultIndex(int i4) {
                return ~i4;
            }
        };
        INVERTED_INSERTION_INDEX = o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo3;
        f3675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo[]{o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo, o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo2, o000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo3};
    }

    public O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo(String str, int i, O000ooo0oO0oOO000OooO0ooo0ooOooooOOOo00O o000ooo0oO0oOO000OooO0ooo0ooOooooOOOo00O) {
        super(str, i);
    }

    public static O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo valueOf(String str) {
        return (O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo) Enum.valueOf(O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo.class, str);
    }

    public static O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo[] values() {
        return (O000oooOooOo0Oo0OoO000O0o00o0o0ooOO000oo[]) f3675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    public abstract int resultIndex(int i);
}
