package androidx.leanback.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ShadowHelper {
    private ShadowHelper() {
    }

    public static Object addDynamicShadow(View view, float f, float f2, int i) {
        return ShadowHelperApi21.addDynamicShadow(view, f, f2, i);
    }

    public static void setShadowFocusLevel(Object obj, float f) {
        ShadowHelperApi21.setShadowFocusLevel(obj, f);
    }

    public static boolean supportsDynamicShadow() {
        return true;
    }
}
