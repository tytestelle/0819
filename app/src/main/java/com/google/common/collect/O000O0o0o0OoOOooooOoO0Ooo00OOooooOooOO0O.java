package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0o0o0OoOOooooOoO0Ooo00OOooooOooOO0O extends O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo {
    private static final long serialVersionUID = 0;

    @Weak
    final O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo multimap;

    public O000O0o0o0OoOOooooOoO0Ooo00OOooooOooOO0O(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.multimap = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.multimap.containsEntry(entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.multimap.isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.multimap.size();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.multimap.m738entryIterator();
    }
}
