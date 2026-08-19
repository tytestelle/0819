package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Paint f629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Paint(6);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Lock f630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        new Paint(7);
        f630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getWidth() + "x" + bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getHeight());
            StringBuilder sb = new StringBuilder("minPct:   ");
            sb.append(fMin);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(bitmap, bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, matrix);
        return bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }
}
