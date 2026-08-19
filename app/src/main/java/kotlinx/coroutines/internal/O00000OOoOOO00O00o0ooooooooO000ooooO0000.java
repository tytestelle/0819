package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function2 {
    public static final O00000OOoOOO00O00o0ooooooooO000ooooO0000 INSTANCE = new O00000OOoOOO00O00o0ooooooooO000ooooO0000();

    public O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        if (!(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO instanceof O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO : Integer.valueOf(iIntValue + 1);
    }
}
