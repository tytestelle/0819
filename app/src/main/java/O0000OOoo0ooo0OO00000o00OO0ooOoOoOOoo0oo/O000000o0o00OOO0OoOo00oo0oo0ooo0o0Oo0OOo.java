package O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Comparator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1056O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1056O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() && file2.isFile()) {
                    return -1;
                }
                if (file.isFile() && file2.isDirectory()) {
                    return 1;
                }
                return file.getName().compareTo(file2.getName());
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean zMatches = str.matches("\\d+#.*");
                boolean zMatches2 = str2.matches("\\d+#.*");
                if (zMatches && zMatches2) {
                    int i = Integer.parseInt(str.split("#")[0]);
                    int i2 = Integer.parseInt(str2.split("#")[0]);
                    return i == i2 ? str.split("#")[1].compareTo(str2.split("#")[1]) : Integer.compare(i, i2);
                }
                if (zMatches) {
                    return -1;
                }
                if (zMatches2) {
                    return 1;
                }
                return str.compareTo(str2);
            case 2:
                return Long.compare(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj).f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj2).f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            case 3:
                File file3 = (File) obj;
                File file4 = (File) obj2;
                if (file3.isDirectory() && file4.isFile()) {
                    return -1;
                }
                if (file3.isFile() && file4.isDirectory()) {
                    return 1;
                }
                return file4.getName().compareTo(file3.getName());
            default:
                return ((String) obj).compareToIgnoreCase((String) obj2);
        }
    }
}
