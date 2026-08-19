package O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;

import android.util.Log;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Pools.Pool {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f829O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f830O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Pools.SynchronizedPool f831O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Pools.SynchronizedPool synchronizedPool, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f831O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = synchronizedPool;
        this.f829O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f830O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // androidx.core.util.Pools.Pool
    public final Object acquire() {
        Object objAcquire = this.f831O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.acquire();
        if (objAcquire == null) {
            objAcquire = this.f829O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) objAcquire).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f833O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools.Pool
    public final boolean release(Object obj) {
        if (obj instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f833O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        }
        this.f830O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
        return this.f831O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.release(obj);
    }
}
