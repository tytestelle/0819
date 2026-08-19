package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo0O00OOo0oOoOooO0o0O00o0oOo0o0O00oo extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    final /* synthetic */ O000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO this$0;

    public O000oo0O00OOo0oOoOooO0o0O00o0oOo0o0O00oo(O000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO o000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO) {
        this.this$0 = o000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.this$0.f3656O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.List
    public Map.Entry<Object, Object> get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.this$0.f3656O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        int i2 = i * 2;
        Object obj = this.this$0.f3654O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[this.this$0.f3655O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.this$0.f3654O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2 + (this.this$0.f3655O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
