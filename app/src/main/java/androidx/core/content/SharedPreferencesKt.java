package androidx.core.content;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z, Function1<? super SharedPreferences.Editor, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        function1.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        function1.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
