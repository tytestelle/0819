package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O extends AbstractCollection {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, int i) {
        this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
            default:
                this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsEntry(entry.getKey(), entry.getValue());
            default:
                return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entryIterator();
            default:
                return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.valueIterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(entry.getKey(), entry.getValue());
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return this.f3415O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
    }
}
