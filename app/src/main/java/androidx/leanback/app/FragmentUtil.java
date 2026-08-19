package androidx.leanback.app;

import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
class FragmentUtil {

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Context getContext(Fragment fragment) {
            return fragment.getContext();
        }
    }

    private FragmentUtil() {
    }

    public static Context getContext(Fragment fragment) {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.getContext(fragment) : fragment.getActivity();
    }
}
