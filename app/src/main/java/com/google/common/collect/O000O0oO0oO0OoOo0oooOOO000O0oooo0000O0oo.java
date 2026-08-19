package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0oO0oO0OoOo0oooOOO000O0oooo0000O0oo extends O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 {
    final /* synthetic */ O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo this$0;

    public O000O0oO0oO0OoOo0oooOOO000O0oooo0000O0oo(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.this$0 = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use KeysSerializedForm");
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.this$0.containsKey(obj);
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public int count(@CheckForNull Object obj) {
        Collection collection = (Collection) this.this$0.map.get(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0
    public O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 getEntry(int i) {
        Map.Entry entry = (Map.Entry) this.this$0.map.entrySet().asList().get(i);
        return new O000oO0Ooo0OOoo0ooo00o000OOo0ooooo00oo00(entry.getKey(), ((Collection) entry.getValue()).size());
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.this$0.size();
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000O0oOOO00ooO0OOooo000OOoooooo0o0o0oOo(this.this$0);
    }

    @Override // com.google.common.collect.O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 elementSet() {
        return this.this$0.keySet();
    }
}
