package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o f3653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final transient Object[] f3654O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient int f3655O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final transient int f3656O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, Object[] objArr, int i, int i2) {
        this.f3653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
        this.f3654O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = objArr;
        this.f3655O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
        this.f3656O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i2;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f3653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(key));
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return new O000oo0O00OOo0oOoOooO0o0O00o0oOo0o0O00oo(this);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f3656O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return asList().iterator();
    }
}
