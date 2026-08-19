package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, Runnable, Comparable, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O f259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public com.bumptech.glide.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f263O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f264O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f265O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO f266O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public int f267O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public int f268O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f269O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f270O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 f271O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public int f272O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f274O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public long f275O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public Object f276O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public Thread f277O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f278O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f279O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    public Object O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
    public volatile O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;

    /* JADX INFO: renamed from: O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, reason: collision with root package name */
    public volatile boolean f282O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;

    /* JADX INFO: renamed from: O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, reason: collision with root package name */
    public volatile boolean f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;

    /* JADX INFO: renamed from: O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, reason: collision with root package name */
    public boolean f284O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ArrayList f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f261O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(1, false);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f262O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        this.f260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, Exception exc, com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000("Fetching data failed", exc);
        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setLoggingDetails(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
        this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000);
        if (Thread.currentThread() != this.f277O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SWITCH_TO_SOURCE_SERVICE);
        } else {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        }
    }

    @Override // O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, Object obj, com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2) {
        this.f278O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = obj;
        this.f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f279O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
        this.f284O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != this.f256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().get(0);
        if (Thread.currentThread() != this.f277O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.DECODE_DATA);
        } else {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        }
    }

    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        if (obj == null) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            return null;
        }
        try {
            int i = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f815O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            if (Log.isLoggable("DecodeJob", 2)) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(jElapsedRealtimeNanos, "Decoded result " + o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, null);
            }
            return o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        } finally {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        Class<?> cls = obj.getClass();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0oO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(cls);
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f270O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.RESOURCE_DISK_CACHE || o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f247O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f602O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            Boolean bool = (Boolean) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
            if (bool == null || (bool.booleanValue() && !z)) {
                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f270O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f196O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.putAll((SimpleArrayMap) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.put(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, Boolean.valueOf(z));
            }
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f263O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
        try {
            return o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0oO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f267O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f268O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this, (Object) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 1), o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        } finally {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (Log.isLoggable("DecodeJob", 2)) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f275O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, "Retrieved data", "data: " + this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O + ", cache key: " + this.f278O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 + ", fetcher: " + this.f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0);
        }
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = null;
        try {
            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, this.f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
        } catch (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 e) {
            e.setLoggingDetails(this.f279O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, this.f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
            this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(e);
            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        }
        if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            return;
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        boolean z = this.f284O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo instanceof O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
            ((O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).initialize();
        }
        boolean z2 = true;
        if (((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) this.f261O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) != null) {
            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f368O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.acquire();
            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f372O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f371O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = this.f271O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        synchronized (o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) {
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f337O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f338O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f345O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = z;
        }
        o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.ENCODE;
        try {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f261O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            if (((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) == null) {
                z2 = false;
            }
            if (z2) {
                O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f259O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f270O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getClass();
                try {
                    o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oooOoo00ooo0O0000000o00O0Oooo0OOO((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0, (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO));
                    ((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                } catch (Throwable th) {
                    ((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    throw th;
                }
            }
            if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 != null) {
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            }
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        } catch (Throwable th2) {
            if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 != null) {
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            }
            throw th2;
        }
    }

    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        int i = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f249O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.ordinal()];
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 1) {
            return new O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, this);
        }
        if (i == 2) {
            return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, this);
        }
        if (i == 3) {
            return new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
    }

    public final O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
        boolean z;
        boolean z2;
        int i = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f249O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.ordinal()];
        if (i == 1) {
            switch (this.f269O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f293O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                case 0:
                    z = false;
                    break;
                case 1:
                default:
                    z = true;
                    break;
            }
            return z ? O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.DATA_CACHE : O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.DATA_CACHE);
        }
        if (i == 2) {
            return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.SOURCE;
        }
        if (i == 3 || i == 4) {
            return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.FINISHED;
        }
        if (i != 5) {
            throw new IllegalArgumentException("Unrecognized stage: " + o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        }
        switch (this.f269O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f293O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
            case 1:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        return z2 ? O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.RESOURCE_CACHE : O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.RESOURCE_CACHE);
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(long j, String str, String str2) {
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, " in ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(j));
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(", load key: ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(this.f266O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(str2 != null ? ", ".concat(str2) : "");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(", thread: ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString());
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000("Failed to load resource", new ArrayList(this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = this.f271O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        synchronized (o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) {
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f340O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        }
        o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f262O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
            zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        }
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f262O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
            zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        }
    }

    public final void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f262O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
            zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        }
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f262O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f252O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f251O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f253O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f261O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f232O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f233O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f243O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f236O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f240O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f238O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f244O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f239O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f245O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f230O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f241O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = false;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f231O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f242O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
        this.f282O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = false;
        this.f263O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        this.f264O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        this.f270O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        this.f265O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;
        this.f266O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
        this.f271O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
        this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = null;
        this.f277O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = null;
        this.f278O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = null;
        this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = null;
        this.f280O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = null;
        this.f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = null;
        this.f275O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = 0L;
        this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = false;
        this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
        this.f260O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.release(this);
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.f274O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = this.f271O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        (o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f336O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo ? o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f332O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 : o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f331O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).execute(this);
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        this.f277O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = Thread.currentThread();
        int i = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f815O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f275O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = SystemClock.elapsedRealtimeNanos();
        boolean zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        while (!this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 && this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO != null && !(zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO())) {
            this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            if (this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o == O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.SOURCE) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o == O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.FINISHED || this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) && !zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        }
    }

    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        int i = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f248O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f274O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.ordinal()];
        if (i == 1) {
            this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INITIALIZE);
            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        } else if (i == 2) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        } else if (i == 3) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f274O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
        }
    }

    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() {
        Throwable th;
        this.f258O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (!this.f282O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            this.f282O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = true;
            return;
        }
        if (this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj;
        int iOrdinal = this.f265O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.ordinal() - o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f265O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.ordinal();
        return iOrdinal == 0 ? this.f272O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO - o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f272O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f281O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
        try {
            try {
                try {
                    if (this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            return;
                        }
                        return;
                    }
                    O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                    if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    }
                } catch (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 + ", stage: " + this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, th);
                }
                if (this.f273O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.ENCODE) {
                    this.f257O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(th);
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                }
                if (!this.f283O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            }
            throw th2;
        }
    }
}
