package com.google.common.collect;

import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Serializable f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
        this.f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
        this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public abstract Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i);

    public abstract Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (((O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).backingMap.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    return this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 0;
                }
                throw new ConcurrentModificationException();
            default:
                return this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                int i = this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
                this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).backingMap.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i);
                return objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            default:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
                Object objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2);
                this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.getSuccessor(this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    throw new ConcurrentModificationException();
                }
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != -1);
                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.size -= (long) o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
                this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.backingMap.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                return;
            default:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    throw new ConcurrentModificationException();
                }
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo >= 0);
                this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += 32;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.remove(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$100(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
                this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.adjustAfterRemove(this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
                return;
        }
    }

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) {
        this.f3409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f3413O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        this.f3410O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3411O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.firstEntryIndex();
        this.f3412O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
    }
}
