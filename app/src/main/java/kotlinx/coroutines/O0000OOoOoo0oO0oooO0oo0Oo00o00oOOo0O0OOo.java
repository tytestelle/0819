package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo extends kotlinx.coroutines.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 f4098O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 f4099O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo f4100O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO f4101O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
        this.f4100O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        this.f4101O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        this.f4098O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
    }

    @Override // kotlinx.coroutines.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, Object obj2) {
        kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
        boolean z = obj2 == null;
        O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = this.f4098O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = z ? o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 : this.f4099O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            while (!atomicReferenceFieldUpdater.compareAndSet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this, o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO)) {
                if (atomicReferenceFieldUpdater.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) != this) {
                    return;
                }
            }
            if (z) {
                O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = this.f4099O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
            }
        }
    }

    @Override // kotlinx.coroutines.internal.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        if (this.f4100O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000OOoOOO00O00o0ooooooooO000ooooO0000() == this.f4101O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            return null;
        }
        return kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4113O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
