package androidx.core.view;

import android.os.Build;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        public static void setDimens(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        @DoNotInline
        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private ViewStructureCompat(@NonNull ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setClassName(androidx.appcompat.widget.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.mWrappedObj), str);
        }
    }

    public void setContentDescription(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setContentDescription(androidx.appcompat.widget.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.mWrappedObj), charSequence);
        }
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setDimens(androidx.appcompat.widget.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.mWrappedObj), i, i2, i3, i4, i5, i6);
        }
    }

    public void setText(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setText(androidx.appcompat.widget.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.mWrappedObj), charSequence);
        }
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return androidx.appcompat.widget.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.mWrappedObj);
    }
}
