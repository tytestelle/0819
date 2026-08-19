package androidx.media3.extractor;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(18);

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    @CanIgnoreReturnValue
    ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

    @CanIgnoreReturnValue
    @Deprecated
    ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z);

    ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory);
}
