package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ANY_PRESENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 {
    public static final O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 ANY_PRESENT;
    public static final O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 FIRST_AFTER;
    public static final O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 FIRST_PRESENT;
    public static final O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 LAST_BEFORE;
    public static final O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 LAST_PRESENT;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0[] f3676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        final String str = "ANY_PRESENT";
        final int i = 0;
        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(str, i) { // from class: com.google.common.collect.O000ooooOOoOo0oooOOoooOOoO00OOOO0OOO0ooo
            @Override // com.google.common.collect.O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i2) {
                return i2;
            }
        };
        ANY_PRESENT = o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0;
        final String str2 = "LAST_PRESENT";
        final int i2 = 1;
        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO1 = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(str2, i2) { // from class: com.google.common.collect.O000ooooOooOoO0OOoOooO0OooOoOoOo0oO0OO0O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i3) {
                int size = list.size() - 1;
                while (i3 < size) {
                    int i4 = ((i3 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i4), e) > 0) {
                        size = i4 - 1;
                    } else {
                        i3 = i4;
                    }
                }
                return i3;
            }
        };
        LAST_PRESENT = o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO1;
        final String str3 = "FIRST_PRESENT";
        final int i3 = 2;
        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO2 = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(str3, i3) { // from class: com.google.common.collect.O000oooooOO00oO0o0oOOoo00OO0Ooo0OoO0O0O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i4) {
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = (i5 + i4) >>> 1;
                    if (comparator.compare(list.get(i6), e) < 0) {
                        i5 = i6 + 1;
                    } else {
                        i4 = i6;
                    }
                }
                return i5;
            }
        };
        FIRST_PRESENT = o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO2;
        final String str4 = "FIRST_AFTER";
        final int i4 = 3;
        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO3 = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(str4, i4) { // from class: com.google.common.collect.O000oooooOOoOoo0OOoOooOOoo0o0oOO0oOOOo00
            @Override // com.google.common.collect.O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i5) {
                return O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.LAST_PRESENT.resultIndex(comparator, e, list, i5) + 1;
            }
        };
        FIRST_AFTER = o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO3;
        final String str5 = "LAST_BEFORE";
        final int i5 = 4;
        O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO4 = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(str5, i5) { // from class: com.google.common.collect.O00O0000OO000oooOOo0o0OoOOooO00O0ooooO0o
            @Override // com.google.common.collect.O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i6) {
                return O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.FIRST_PRESENT.resultIndex(comparator, e, list, i6) - 1;
            }
        };
        LAST_BEFORE = o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO4;
        f3676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0[]{o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0, o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO1, o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO2, o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO3, o00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO4};
    }

    public O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0(String str, int i, O000ooo0oO0oOO000OooO0ooo0ooOooooOOOo00O o000ooo0oO0oOO000OooO0ooo0ooOooooOOOo00O) {
        super(str, i);
    }

    public static O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0 valueOf(String str) {
        return (O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0) Enum.valueOf(O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0.class, str);
    }

    public static O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0[] values() {
        return (O00O0000o00O0OOoo0o0ooO00oo000oo00oOOoO0[]) f3676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    public abstract <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
}
