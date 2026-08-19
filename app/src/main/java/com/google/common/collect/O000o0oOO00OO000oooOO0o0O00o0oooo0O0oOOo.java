package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KEY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {
    public static final O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo KEY;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo[] f3616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public static final O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo VALUE;

    static {
        final String str = "KEY";
        final int i = 0;
        O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo = new O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo(str, i) { // from class: com.google.common.collect.O000o0OoooO0O0o0o00o0O0o0OooOOOOoo0o0O0o
            @Override // com.google.common.collect.O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        KEY = o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo;
        final String str2 = "VALUE";
        final int i2 = 1;
        O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo2 = new O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo(str2, i2) { // from class: com.google.common.collect.O000o0o0oO0o000Oo0oooO00oOo0OOoo00o0OOoO
            @Override // com.google.common.collect.O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo, com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        VALUE = o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo2;
        f3616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo[]{o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo, o000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo2};
    }

    public O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo(String str, int i, O000o0OoOoO00OOooOOo00oOoO0oo0O0o0000ooO o000o0OoOoO00OOooOOo00oOoO0oo0O0o0000ooO) {
        super(str, i);
    }

    public static O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo valueOf(String str) {
        return (O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo) Enum.valueOf(O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo.class, str);
    }

    public static O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo[] values() {
        return (O000o0oOO00OO000oooOO0o0O00o0oooo0O0oOOo[]) f3616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    public abstract /* synthetic */ Object apply(Object obj);
}
