package androidx.core.graphics;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, Function1<? super Matrix, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        function1.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
