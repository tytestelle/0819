package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    public static /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        if (str == null) {
            return false;
        }
        String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str);
        if (TextUtils.isEmpty(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o)) {
            return false;
        }
        return ((strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.contains("text") && !strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.contains(MimeTypes.TEXT_VTT)) || strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.contains("html") || strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.contains("xml")) ? false : true;
    }
}
