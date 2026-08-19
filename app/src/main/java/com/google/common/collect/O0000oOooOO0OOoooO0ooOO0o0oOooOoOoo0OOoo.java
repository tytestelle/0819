package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return delegateCollection().contains(obj);
    }

    public abstract O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo delegateCollection();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return delegateCollection().isEmpty();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return delegateCollection().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return delegateCollection().size();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O(delegateCollection());
    }
}
