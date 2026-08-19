package androidx.core.text.method;

import android.text.method.LinkMovementMethod;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    @NonNull
    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r2 <= r1.getLineRight(r0)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.Nullable android.widget.TextView widget, @androidx.annotation.Nullable android.text.Spannable buffer, @androidx.annotation.Nullable android.view.MotionEvent event) {
        if (!androidx.core.os.BuildCompat.isAtLeastV()) {
            int action = event.getAction();
            if (action == android.view.MotionEvent.ACTION_UP || action == android.view.MotionEvent.ACTION_DOWN) {
                int x = (int) event.getX() - widget.getTotalPaddingLeft() + widget.getScrollX();
                int y = (int) event.getY() - widget.getTotalPaddingTop() + widget.getScrollY();
                android.text.Layout layout = widget.getLayout();
                if (y < 0 || y > layout.getHeight()) {
                    android.text.Selection.removeSelection(buffer);
                    return android.text.method.Touch.onTouchEvent(widget, buffer, event);
                }
                int line = layout.getLineForVertical(y);
                if (x < layout.getLineLeft(line) || x > layout.getLineRight(line)) {
                    android.text.Selection.removeSelection(buffer);
                    return android.text.method.Touch.onTouchEvent(widget, buffer, event);
                }
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
