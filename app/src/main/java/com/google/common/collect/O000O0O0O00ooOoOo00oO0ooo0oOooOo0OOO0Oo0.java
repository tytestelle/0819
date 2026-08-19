package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0 extends O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0 {
    final /* synthetic */ O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o this$0;

    public O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o o000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o) {
        this.this$0 = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return this.this$0.containsKey(obj);
    }

    @Override // com.google.common.collect.O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0, com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createKeySet() {
        return this.this$0.keySet();
    }

    @Override // com.google.common.collect.O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo entryIterator() {
        return new O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo(this.this$0.entrySet().iterator(), 0);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public int hashCode() {
        return this.this$0.hashCode();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public boolean isHashCodeFast() {
        return this.this$0.isHashCodeFast();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public boolean isPartialView() {
        return this.this$0.isPartialView();
    }

    @Override // java.util.Map
    public int size() {
        return this.this$0.size();
    }

    @Override // com.google.common.collect.O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0, com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    @CheckForNull
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 get(@CheckForNull Object obj) {
        Object obj2 = this.this$0.get(obj);
        if (obj2 == null) {
            return null;
        }
        return O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(obj2);
    }
}
