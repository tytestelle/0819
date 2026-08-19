package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0 extends AbstractSet {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
            default:
                this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO;
        Object obj2;
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO = this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(key)) != null && o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.valueEquivalence().equivalent(entry.getValue(), obj2);
            default:
                return this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000OooOoOO0O00O00OoooOOO00O0OO0OO000o00(this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0);
            default:
                return new O000OooOoOO0O00O00OoooOOO00O0OO0OO000o00(this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(key, entry.getValue());
            default:
                return this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(obj) != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3591O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return this.f3592O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
    }
}
