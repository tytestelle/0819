package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final Bitmap.Config f417O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Set f419O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f420O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final long f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public long f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f423O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public int f424O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public int f425O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public int f426O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(long j) {
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = j;
        this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f419O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = setUnmodifiableSet;
        this.f420O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(6);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Log.v("LruBitmapPool", "Hits=" + this.f423O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + ", misses=" + this.f424O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + ", puts=" + this.f425O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + ", evictions=" + this.f426O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + ", currentSize=" + this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ", maxSize=" + this.f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + "\nStrategy=" + this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public final synchronized Bitmap O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, i2, config != null ? config : f417O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            if (bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                    sb.append(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f424O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000++;
            } else {
                this.f423O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO++;
                long j = this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = j - ((long) O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                this.f420O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setHasAlpha(true);
                bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                sb2.append(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final Bitmap O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, i2, config);
        if (bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            return bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        if (config == null) {
            config = f417O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final synchronized void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                if (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap) <= this.f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo && this.f419O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(bitmap.getConfig())) {
                    this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap);
                    this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bitmap);
                    this.f420O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                    this.f425O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo++;
                    this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += (long) iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                        sb.append(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                sb2.append(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f419O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(long j) {
        while (this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > j) {
            try {
                O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                Bitmap bitmap = (Bitmap) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                if (bitmap != null) {
                    o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Integer.valueOf(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                    this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0L;
                    return;
                }
                this.f420O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                long j2 = this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                this.f422O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = j2 - ((long) O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap));
                this.f426O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f418O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                    sb.append(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final Bitmap O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, i2, config);
        if (bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.eraseColor(0);
            return bitmapO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        if (config == null) {
            config = f417O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(0L);
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        } else if (i >= 20 || i == 15) {
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f421O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo / 2);
        }
    }
}
