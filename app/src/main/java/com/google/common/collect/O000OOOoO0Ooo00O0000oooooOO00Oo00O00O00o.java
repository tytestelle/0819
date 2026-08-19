package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO f3543O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000OOOoO0Ooo00O0000oooooOO00Oo00O00O00o(O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO) {
        this.f3543O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f3543O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.containsEntry(entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f3543O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.f3543O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.m738entryIterator();
    }
}
