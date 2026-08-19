package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements List {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Object obj, List list, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        super(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, obj, list, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        this.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        boolean zIsEmpty = this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
        ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add(i, obj);
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$208(this.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        if (zIsEmpty) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).addAll(i, collection);
        if (zAddAll) {
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$212(this.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() - size);
            if (size == 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        Object objRemove = ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).remove(i);
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$210(this.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        List<Object> listSubList = ((List) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).subList(i, i2);
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        }
        return this.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.wrapList(this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, listSubList, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, i);
    }
}
