package androidx.core.graphics;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, Function1<? super Canvas, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1) {
        try {
            function1.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
