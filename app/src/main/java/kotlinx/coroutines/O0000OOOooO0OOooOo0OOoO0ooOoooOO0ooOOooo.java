package kotlinx.coroutines;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo implements O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 f4097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private volatile /* synthetic */ Object _rootCause;
    private volatile /* synthetic */ int _isCompleting = 0;
    private volatile /* synthetic */ Object _exceptionsHolder = null;

    public O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, Throwable th) {
        this.f4097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
        this._rootCause = th;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
            return;
        }
        if (th == th2) {
            return;
        }
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th;
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        this._exceptionsHolder = arrayList;
    }

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f4097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final Throwable O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return (Throwable) this._rootCause;
    }

    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return ((Throwable) this._rootCause) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        return this._isCompleting;
    }

    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return this._exceptionsHolder == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4072O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public final ArrayList O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !th.equals(th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4072O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        return arrayList;
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        this._isCompleting = 1;
    }

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final boolean isActive() {
        return ((Throwable) this._rootCause) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f4097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ']';
    }
}
