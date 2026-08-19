package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ChunkExtractor {

    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);

        @CanIgnoreReturnValue
        Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        @CanIgnoreReturnValue
        Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

        Format getOutputTextFormat(Format format);

        @CanIgnoreReturnValue
        Factory setSubtitleParserFactory(SubtitleParser.Factory factory);
    }

    public interface TrackOutputProvider {
        TrackOutput track(int i, int i2);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(ExtractorInput extractorInput);

    void release();
}
