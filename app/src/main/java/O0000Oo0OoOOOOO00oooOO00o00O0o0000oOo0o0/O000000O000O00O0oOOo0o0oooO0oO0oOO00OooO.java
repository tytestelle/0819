package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Bitmap f1581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ String f1582O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Bitmap bitmap, String str, int i) {
        this.f1580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = bitmap;
        this.f1582O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f1582O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Bitmap bitmap = this.f1581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                HashMap map = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), str, ".png")));
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            default:
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, bitmap);
                return;
        }
    }
}
