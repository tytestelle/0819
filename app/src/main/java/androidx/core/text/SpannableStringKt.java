package androidx.core.text;

import O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, Object obj) {
        spannable.setSpan(obj, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 17);
    }
}
