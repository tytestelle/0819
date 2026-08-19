package androidx.leanback.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class RoundedRectHelper {
    private RoundedRectHelper() {
    }

    public static void setClipToRoundedOutline(View view, boolean z, int i) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z, i);
    }

    public static boolean supportsRoundedCorner() {
        return true;
    }

    public static void setClipToRoundedOutline(View view, boolean z) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z, view.getResources().getDimensionPixelSize(androidx.leanback.R.dimen.lb_rounded_rect_corner_radius));
    }
}
