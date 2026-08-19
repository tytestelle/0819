package O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static Integer f785O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ImageView f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ArrayList f787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(ImageView imageView) {
        this.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = imageView;
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        ImageView imageView = this.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (imageView.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f785O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f785O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f785O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.intValue();
    }
}
