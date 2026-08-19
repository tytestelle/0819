package androidx.emoji2.text;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
