package androidx.core.view;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {
    public static /* synthetic */ WindowInsets.Builder O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
