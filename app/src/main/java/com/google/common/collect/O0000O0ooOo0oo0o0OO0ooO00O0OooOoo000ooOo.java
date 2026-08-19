package com.google.common.collect;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo implements BiConsumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3431O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(int i) {
        this.f3431O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f3431O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0 = (O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0) obj;
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj2;
                o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0.getClass();
                if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isEmpty()) {
                    throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("range must not be empty, but was %s", o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0));
                }
                o000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0.f3535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                return;
            case 1:
                ((O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO) obj).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj2);
                return;
            case 2:
                ((O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj2);
                return;
            default:
                ((O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO) obj).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(obj2);
                return;
        }
    }
}
