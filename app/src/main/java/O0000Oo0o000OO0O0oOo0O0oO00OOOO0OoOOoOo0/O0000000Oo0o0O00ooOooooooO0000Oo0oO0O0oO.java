package O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;

import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f1592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    static {
        Pattern.compile("^http.*\\.(js|txt|json|m3u)$", 10);
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file2);
                    }
                }
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
