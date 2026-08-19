package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Charset f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
