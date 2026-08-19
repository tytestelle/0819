package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000O0OOoOOO0OoOo00oO00OOo00OOoOo0oOO00O extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = map().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return map().hashCode();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return map().isPartialView();
    }

    public abstract O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000O0OOO0OooOOO0oOOOoOo00o0Oo00Oo0Oo00O(map());
    }
}
