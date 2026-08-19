package O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, TbsListener, O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static int f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static int f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static int f187O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static int f188O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static int f189O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        this.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public static String O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        switch (f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            case 0:
                return "默认";
            case 1:
                return "16:9";
            case 2:
                return "4:3";
            case 3:
                return "填充";
            case 4:
                return "原始";
            case 5:
                return "裁剪";
            case 6:
                return "电影";
            default:
                return "未知比例";
        }
    }

    public static String O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        int i = f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 101) {
            return "浏览模式";
        }
        switch (i) {
            case 0:
                return "系统解码";
            case 1:
                return "IJK硬解";
            case 2:
                return "IJK软解";
            case 3:
                return "EXO硬解";
            case 4:
                return "EXO软解";
            case 5:
                return "MPV硬解";
            case 6:
                return "MPV软解";
            default:
                return "未知解码";
        }
    }

    public static int O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.SOURCE;
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public Bitmap O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public Object O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        switch (this.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 4:
                return new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
            default:
                try {
                    return new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override // O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public File O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        return null;
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public Bitmap O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, File file, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws Throwable {
        try {
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) obj).get()).f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        return new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class, InputStream.class), 1);
    }

    public void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Level level, String str) {
        switch (this.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 25:
                System.out.println("[" + level + "] " + str);
                break;
            default:
                if (level != Level.OFF) {
                    Log.println(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(level), "EventBus", str);
                }
                break;
        }
    }

    public void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Level level, String str, Throwable th) {
        switch (this.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 25:
                PrintStream printStream = System.out;
                printStream.println("[" + level + "] " + str);
                th.printStackTrace(printStream);
                break;
            default:
                if (level != Level.OFF) {
                    int iO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(level);
                    StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, "\n");
                    sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(Log.getStackTraceString(th));
                    Log.println(iO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, "EventBus", sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString());
                }
                break;
        }
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onInstallFinish(int i) {
        Log.d("WebViewUtil", "X5内核安装完成: " + i);
        if (i == 200) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "X5内核安装完成，请重启应用");
        } else {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "X5内核安装失败");
        }
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
    }

    @Override // O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadFinish(int i) {
    }

    @Override // com.tencent.smtt.sdk.TbsListener
    public void onDownloadProgress(int i) {
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public void trimMemory(int i) {
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap) {
    }

    @Override // O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
