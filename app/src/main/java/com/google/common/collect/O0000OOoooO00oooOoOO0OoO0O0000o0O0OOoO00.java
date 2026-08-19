package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 extends AbstractSet {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, int i) {
        this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
            default:
                this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                Map<Object, Object> mapDelegateOrNull = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.delegateOrNull();
                if (mapDelegateOrNull != null) {
                    return mapDelegateOrNull.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(entry.getKey());
                    if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != -1 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$600(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entrySetIterator();
            default:
                return this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keySetIterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                Map<Object, Object> mapDelegateOrNull = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.delegateOrNull();
                if (mapDelegateOrNull != null) {
                    return mapDelegateOrNull.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.needsAllocArrays()) {
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        int iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(entry.getKey(), entry.getValue(), iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$800(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo), o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
                        if (iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 != -1) {
                            o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.moveLastEntry(iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                            O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$1210(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                            o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.incrementModCount();
                            return true;
                        }
                    }
                }
                return false;
            default:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                Map<Object, Object> mapDelegateOrNull2 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.delegateOrNull();
                if (mapDelegateOrNull2 != null) {
                    return mapDelegateOrNull2.keySet().remove(obj);
                }
                return o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj) != O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3454O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3447O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return this.f3448O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
    }
}
