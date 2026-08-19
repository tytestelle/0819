package androidx.media3.extractor.text;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import androidx.media3.common.util.Consumer;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(SubtitleParser subtitleParser, byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        subtitleParser.parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    public static Subtitle O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(SubtitleParser subtitleParser, byte[] bArr, int i, int i2) {
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
        SubtitleParser.OutputOptions outputOptions = SubtitleParser.OutputOptions.ALL;
        Objects.requireNonNull(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder);
        subtitleParser.parse(bArr, i, i2, outputOptions, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder, 11));
        return new CuesWithTimingSubtitle(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(SubtitleParser subtitleParser) {
    }
}
