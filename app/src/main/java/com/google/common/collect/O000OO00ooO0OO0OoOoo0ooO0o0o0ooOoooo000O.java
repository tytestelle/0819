package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO00ooO0OO0OoOoo0ooO0o0o0ooOoooo000O extends O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo {
    private static final long serialVersionUID = 0;
    final /* synthetic */ O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 this$0;

    public O000OO00ooO0OO0OoOoo0ooO0o0o0ooOoooo000O(O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0, O000OO000O0oooOOO0oO000oOOo00OO0OoOoOooo o000OO000O0oooOOO0oO000oOOo00OO0OoOoOooo) {
        this.this$0 = o000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0)) {
            return false;
        }
        O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) obj;
        return o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount() > 0 && this.this$0.count(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement()) == o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.this$0.hashCode();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.this$0.isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.elementSet().size();
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000OO0O0oOo0oooOo0oO0oo00O0OOo000oOOo0o(this.this$0);
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo
    public O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 get(int i) {
        return this.this$0.getEntry(i);
    }
}
