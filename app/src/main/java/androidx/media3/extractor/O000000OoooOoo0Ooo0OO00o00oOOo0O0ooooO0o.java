package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static Extractor[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ExtractorsFactory extractorsFactory, Uri uri, Map map) {
        return extractorsFactory.createExtractors();
    }

    public static /* synthetic */ Extractor[] O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        return new Extractor[0];
    }

    public static ExtractorsFactory O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ExtractorsFactory extractorsFactory, int i) {
        return extractorsFactory;
    }

    public static ExtractorsFactory O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ExtractorsFactory extractorsFactory, boolean z) {
        return extractorsFactory;
    }

    public static ExtractorsFactory O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
        return extractorsFactory;
    }
}
