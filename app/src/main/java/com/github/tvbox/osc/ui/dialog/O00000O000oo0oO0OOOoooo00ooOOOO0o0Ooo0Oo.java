package com.github.tvbox.osc.ui.dialog;

import androidx.lifecycle.Observer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements Observer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        this.f3030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f3030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
        ArrayList arrayList = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        arrayList.clear();
        arrayList.addAll((ArrayList) obj);
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.notifyDataSetChanged();
    }
}
