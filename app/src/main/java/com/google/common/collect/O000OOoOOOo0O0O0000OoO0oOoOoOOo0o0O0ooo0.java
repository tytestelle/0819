package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoOOOo0O0O0000OoO0oOoOoOOo0o0O0ooo0 extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    final /* synthetic */ O000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0 this$1;

    public O000OOoOOOo0O0O0000OoO0oOoOoOOo0o0O0ooo0(O000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0 o000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0) {
        this.this$1 = o000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.this$1.this$0.size();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.List
    public Map.Entry<Object, Object> get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.this$1.this$0.f3554O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.asList().get(i), this.this$1.this$0.f3555O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(i));
    }
}
