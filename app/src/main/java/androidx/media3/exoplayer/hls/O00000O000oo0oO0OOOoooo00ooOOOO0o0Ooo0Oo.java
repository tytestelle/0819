package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements HlsExtractorFactory {
    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, z);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ Format getOutputTextFormat(Format format) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, format);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }
}
