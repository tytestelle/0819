package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o extends O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, int i) {
        this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
            default:
                this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(obj);
            default:
                if (!(obj instanceof O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0)) {
                    return false;
                }
                O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) obj;
                if (o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount() <= 0) {
                    return false;
                }
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.count(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement()) == o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.elementIterator();
            default:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entryIterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(obj, Integer.MAX_VALUE) > 0;
            default:
                if (!(obj instanceof O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0)) {
                    return false;
                }
                O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) obj;
                Object element = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement();
                int count = o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount();
                if (count != 0) {
                    return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setCount(element, count, 0);
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3421O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entrySet().size();
            default:
                return this.f3422O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.distinctElements();
        }
    }
}
