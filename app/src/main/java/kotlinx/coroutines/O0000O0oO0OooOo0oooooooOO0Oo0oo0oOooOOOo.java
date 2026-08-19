package kotlinx.coroutines;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo extends O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public long f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f4085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        long j = this.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO - IjkMediaMeta.AV_CH_WIDE_RIGHT;
        this.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = j;
        if (j <= 0 && this.f4085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            shutdown();
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f803O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Object[16];
            this.f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        Object[] objArr = (Object[]) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f803O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        objArr[i] = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
        int length = (objArr.length - 1) & (i + 1);
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = length;
        int i2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            kotlin.collections.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = (Object[]) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f803O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int length3 = objArr3.length;
            int i3 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            kotlin.collections.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(objArr3, objArr2, length3 - i3, 0, i3, 4);
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f803O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = objArr2;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = length2;
        }
    }

    public abstract Thread O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(boolean z) {
        this.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (z ? IjkMediaMeta.AV_CH_WIDE_RIGHT : 1L) + this.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            return;
        }
        this.f4085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
    }

    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            return false;
        }
        int i = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object obj = null;
        if (i != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            Object[] objArr = (Object[]) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f803O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            Object obj2 = objArr[i];
            objArr[i] = null;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (i + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            obj = obj2;
        }
        O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = (O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) obj;
        if (o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 == null) {
            return false;
        }
        o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.run();
        return true;
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o limitedParallelism(int i) {
        kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
        return this;
    }

    public abstract void shutdown();
}
