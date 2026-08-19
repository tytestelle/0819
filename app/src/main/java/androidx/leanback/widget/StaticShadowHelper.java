package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class StaticShadowHelper {

    public static class ShadowImpl {
        View mFocusShadow;
        View mNormalShadow;
    }

    private StaticShadowHelper() {
    }

    public static Object addStaticShadow(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
        LayoutInflater.from(viewGroup.getContext()).inflate(androidx.leanback.R.layout.lb_shadow, viewGroup, true);
        ShadowImpl shadowImpl = new ShadowImpl();
        shadowImpl.mNormalShadow = viewGroup.findViewById(androidx.leanback.R.id.lb_shadow_normal);
        shadowImpl.mFocusShadow = viewGroup.findViewById(androidx.leanback.R.id.lb_shadow_focused);
        return shadowImpl;
    }

    public static void prepareParent(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
    }

    public static void setShadowFocusLevel(Object obj, float f) {
        ShadowImpl shadowImpl = (ShadowImpl) obj;
        shadowImpl.mNormalShadow.setAlpha(1.0f - f);
        shadowImpl.mFocusShadow.setAlpha(f);
    }

    public static boolean supportsShadow() {
        return true;
    }
}
