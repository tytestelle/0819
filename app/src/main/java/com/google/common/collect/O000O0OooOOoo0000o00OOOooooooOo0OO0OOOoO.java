package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0OooOOoo0000o00OOOooooooOo0OO0OOOoO extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    final /* synthetic */ O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o this$0;
    final /* synthetic */ O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O val$entryList;

    public O000O0OooOOoo0000o00OOOooooooOo0OO0OOOoO(O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o o000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this.val$entryList = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        this.this$0 = o000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o;
    }

    @Override // java.util.List
    public Object get(int i) {
        return ((Map.Entry) this.val$entryList.get(i)).getValue();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.val$entryList.size();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }
}
