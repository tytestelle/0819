package androidx.media3.extractor.ts;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.wav.WavExtractor;
import com.google.androidx.media3.exoplayer.extractor.ts.MyTsExtractor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements ExtractorsFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        switch (this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return Ac4Extractor.lambda$static$0();
            case 1:
                return AdtsExtractor.lambda$static$0();
            case 2:
                return PsExtractor.lambda$static$0();
            case 3:
                return TsExtractor.lambda$static$1();
            case 4:
                return WavExtractor.lambda$static$0();
            default:
                return MyTsExtractor.lambda$static$0();
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        int i2 = this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f2743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, uri, map);
    }
}
