package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f572O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f573O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f574O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f574O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TRANSFORMED;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, File file, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) obj).get();
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = f573O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f815O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f572O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).intValue();
        OutputStream o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f574O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
                        try {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new com.bumptech.glide.load.data.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fileOutputStream, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                        } catch (IOException e) {
                            e = e;
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                                try {
                                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = fileOutputStream;
                            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                                try {
                                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
                    try {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap) + " in " + O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jElapsedRealtimeNanos) + ", options format: " + o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
