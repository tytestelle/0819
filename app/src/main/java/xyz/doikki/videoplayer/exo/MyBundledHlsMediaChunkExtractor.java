package xyz.doikki.videoplayer.exo;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.hls.HlsMediaChunkExtractor;
import androidx.media3.exoplayer.hls.WebvttExtractor;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import com.google.androidx.media3.exoplayer.extractor.ts.MyTsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class MyBundledHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();

    @VisibleForTesting
    final Extractor extractor;
    private final Format masterPlaylistFormat;
    private final TimestampAdjuster timestampAdjuster;

    public MyBundledHlsMediaChunkExtractor(Extractor extractor, Format format, TimestampAdjuster timestampAdjuster) {
        this.extractor = extractor;
        this.masterPlaylistFormat = format;
        this.timestampAdjuster = timestampAdjuster;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        Extractor extractor = this.extractor;
        return (extractor instanceof AdtsExtractor) || (extractor instanceof Ac3Extractor) || (extractor instanceof Ac4Extractor) || (extractor instanceof Mp3Extractor);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        Extractor extractor = this.extractor;
        return (extractor instanceof MyTsExtractor) || (extractor instanceof FragmentedMp4Extractor);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.extractor.seek(0L, 0L);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        try {
            return this.extractor.read(extractorInput, POSITION_HOLDER) == 0;
        } catch (IOException e) {
            e.printStackTrace();
            if (e instanceof ParserException) {
                return false;
            }
            throw e;
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public HlsMediaChunkExtractor recreate() {
        Extractor mp3Extractor;
        Assertions.checkState(!isReusable());
        Extractor extractor = this.extractor;
        if (extractor instanceof WebvttExtractor) {
            mp3Extractor = new WebvttExtractor(this.masterPlaylistFormat.language, this.timestampAdjuster);
        } else if (extractor instanceof AdtsExtractor) {
            mp3Extractor = new AdtsExtractor();
        } else if (extractor instanceof Ac3Extractor) {
            mp3Extractor = new Ac3Extractor();
        } else if (extractor instanceof Ac4Extractor) {
            mp3Extractor = new Ac4Extractor();
        } else {
            if (!(extractor instanceof Mp3Extractor)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(this.extractor.getClass().getSimpleName()));
            }
            mp3Extractor = new Mp3Extractor();
        }
        return new MyBundledHlsMediaChunkExtractor(mp3Extractor, this.masterPlaylistFormat, this.timestampAdjuster);
    }
}
