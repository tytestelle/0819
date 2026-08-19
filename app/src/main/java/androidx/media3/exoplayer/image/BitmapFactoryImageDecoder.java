package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {

    @Nullable
    private final BitmapDecoder bitmapDecoder;

    @Nullable
    private final Context context;
    private final int maxOutputSize;

    @VisibleForTesting
    @Deprecated
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i);
    }

    public static final class Factory implements ImageDecoder.Factory {

        @Nullable
        private final BitmapDecoder bitmapDecoder;

        @Nullable
        private final Context context;
        private int maxOutputSize;

        @Deprecated
        public Factory() {
            this(null, null);
        }

        @CanIgnoreReturnValue
        public Factory setMaxOutputSize(int i) {
            Assertions.checkArgument(i == -1 || i > 0);
            this.maxOutputSize = i;
            return this;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (str == null || !MimeTypes.isImage(str)) {
                return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
            }
            return Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(4) : O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
        }

        public Factory(Context context) {
            this(context, null);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.context, this.bitmapDecoder, this.maxOutputSize);
        }

        @Deprecated
        public Factory(BitmapDecoder bitmapDecoder) {
            this(null, bitmapDecoder);
        }

        private Factory(@Nullable Context context, @Nullable BitmapDecoder bitmapDecoder) {
            this.context = context;
            this.bitmapDecoder = bitmapDecoder;
            this.maxOutputSize = -1;
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(@Nullable Context context, @Nullable BitmapDecoder bitmapDecoder, int i) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.context = context;
        this.bitmapDecoder = bitmapDecoder;
        this.maxOutputSize = i;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        Assertions.checkState(byteBuffer.hasArray());
        Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
        BitmapDecoder bitmapDecoder = this.bitmapDecoder;
        if (bitmapDecoder != null) {
            try {
                imageOutputBuffer.bitmap = bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            } catch (ImageDecoderException e) {
                return e;
            }
        } else {
            try {
                int iMax = this.maxOutputSize;
                if (iMax == -1) {
                    Context context = this.context;
                    if (context != null) {
                        Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
                        int i = currentDisplayModeSize.x;
                        int i2 = currentDisplayModeSize.y;
                        Format format = decoderInputBuffer.format;
                        if (format != null) {
                            int i3 = format.tileCountHorizontal;
                            if (i3 != -1) {
                                i *= i3;
                            }
                            int i4 = format.tileCountVertical;
                            if (i4 != -1) {
                                i2 *= i4;
                            }
                        }
                        iMax = (Math.max(i, i2) * 2) - 1;
                    } else {
                        iMax = 4096;
                    }
                }
                imageOutputBuffer.bitmap = BitmapUtil.decode(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            } catch (ParserException e2) {
                return new ImageDecoderException("Could not decode image data with BitmapFactory.", e2);
            } catch (IOException e3) {
                return new ImageDecoderException(e3);
            }
        }
        imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
        return null;
    }
}
