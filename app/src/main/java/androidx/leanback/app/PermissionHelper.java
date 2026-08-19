package androidx.leanback.app;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class PermissionHelper {
    private PermissionHelper() {
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static void requestPermissions(Fragment fragment, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            fragment.requestPermissions(strArr, i);
        }
    }
}
