package com.google.common.collect;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3381O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Iterator f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        Collection collection = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = collection;
        this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$100(collection);
    }

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != ((Collection) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3381O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            case 1:
                break;
            default:
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                break;
        }
        return this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3381O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
                this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (Collection) entry.getValue();
                return ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
                this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = entry2;
                return entry2.getKey();
            default:
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                return this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3381O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(((Collection) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null, "no calls to next() since the last call to remove()");
                this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove();
                O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$220(((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, ((Collection) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).size());
                ((Collection) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).clear();
                this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                break;
            case 1:
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(((Map.Entry) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getValue();
                this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove();
                O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$220(((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3389O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, collection.size());
                collection.clear();
                this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                break;
            default:
                this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove();
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$210(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3399O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                break;
        }
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Iterator it) {
        this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f3383O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = it;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, Iterator it) {
        this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = it;
        this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f3384O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.entrySet().iterator();
    }
}
