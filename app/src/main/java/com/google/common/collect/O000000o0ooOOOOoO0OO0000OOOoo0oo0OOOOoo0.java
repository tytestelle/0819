package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Iterator f3373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f3374O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Collection f3375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Iterator f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo.INSTANCE;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3377O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ int f3378O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, int i) {
        this.f3378O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
        this.f3377O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        this.f3373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3405O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext() || this.f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next();
            this.f3374O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f3375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = collection;
            this.f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = collection.iterator();
        }
        Object obj = this.f3374O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object next = this.f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.next();
        switch (this.f3378O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            case 0:
                return next;
            default:
                return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3376O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove();
        Collection collection = this.f3375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f3373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove();
        }
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$210(this.f3377O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }
}
