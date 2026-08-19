package kotlin.sequences;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1 {
    public static final O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 INSTANCE = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
