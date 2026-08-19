package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Decoder<I, O, E extends DecoderException> {
    @Nullable
    I dequeueInputBuffer();

    @Nullable
    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i);

    void release();

    void setOutputStartTimeUs(long j);
}
