package androidx.media3.extractor.mkv;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements ExtractorsFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ SubtitleParser.Factory f2735O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(SubtitleParser.Factory factory, int i) {
        this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2735O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        switch (this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return MatroskaExtractor.lambda$newFactory$0(this.f2735O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return FragmentedMp4Extractor.lambda$newFactory$0(this.f2735O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return Mp4Extractor.lambda$newFactory$0(this.f2735O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        int i2 = this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f2734O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, uri, map);
    }
}
