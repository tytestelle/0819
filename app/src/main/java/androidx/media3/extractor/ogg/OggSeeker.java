package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes.dex */
interface OggSeeker {
    @Nullable
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput);

    void startSeek(long j);
}
