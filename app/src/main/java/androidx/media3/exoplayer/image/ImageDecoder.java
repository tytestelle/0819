package androidx.media3.exoplayer.image;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    public interface Factory {

        @Deprecated
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(Format format);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    ImageOutputBuffer dequeueOutputBuffer();

    @Override // androidx.media3.decoder.Decoder
    @Nullable
    /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer();

    /* JADX WARN: Can't rename method to resolve collision */
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    /* bridge */ /* synthetic */ void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);
}
