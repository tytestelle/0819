package com.github.tvbox.osc.ui.tv.CustomView;

import O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class TopLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, recyclerView.getContext());
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setTargetPosition(i);
        startSmoothScroll(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }
}
