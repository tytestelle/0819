package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ExternallyLoadedImageDecoder implements ImageDecoder {
    private final BitmapResolver bitmapResolver;
    private final DecoderInputBuffer inputBuffer;
    private final ImageOutputBuffer outputBuffer;

    @Nullable
    private O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 pendingDecode;
    private long pendingDecodeTimeUs;
    private boolean pendingEndOfStream;

    public interface BitmapResolver {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 resolve(ExternalImageRequest externalImageRequest);
    }

    public static final class ExternalImageRequest {
        public final Uri uri;

        public ExternalImageRequest(Uri uri) {
            this.uri = uri;
        }
    }

    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapResolver bitmapResolver;

        public Factory(BitmapResolver bitmapResolver) {
            this.bitmapResolver = bitmapResolver;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            int i;
            if (Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
                i = 4;
            } else {
                i = MimeTypes.isImage(format.sampleMimeType) ? 1 : 0;
            }
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public ExternallyLoadedImageDecoder createImageDecoder() {
            return new ExternallyLoadedImageDecoder(this.bitmapResolver);
        }
    }

    private void resetState() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = this.pendingDecode;
        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 != null) {
            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.cancel(false);
            this.pendingDecode = null;
        }
        this.pendingEndOfStream = false;
        this.inputBuffer.clear();
        this.outputBuffer.release();
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public void setOutputStartTimeUs(long j) {
    }

    private ExternallyLoadedImageDecoder(BitmapResolver bitmapResolver) {
        this.bitmapResolver = bitmapResolver;
        this.inputBuffer = new DecoderInputBuffer(1);
        this.outputBuffer = new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                clear();
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public DecoderInputBuffer dequeueInputBuffer() {
        if (this.pendingDecode == null) {
            return this.inputBuffer;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public ImageOutputBuffer dequeueOutputBuffer() {
        if (this.pendingEndOfStream) {
            this.outputBuffer.addFlag(4);
            this.pendingEndOfStream = false;
            return this.outputBuffer;
        }
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = this.pendingDecode;
        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 != null) {
            try {
                if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isDone()) {
                    try {
                        ImageOutputBuffer imageOutputBuffer = this.outputBuffer;
                        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = this.pendingDecode;
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Future was expected to be done: %s", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001.isDone(), o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001);
                        imageOutputBuffer.bitmap = (Bitmap) O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001);
                        ImageOutputBuffer imageOutputBuffer2 = this.outputBuffer;
                        imageOutputBuffer2.timeUs = this.pendingDecodeTimeUs;
                        this.pendingDecode = null;
                        return imageOutputBuffer2;
                    } catch (CancellationException e) {
                        throw new ImageDecoderException(e);
                    } catch (ExecutionException e2) {
                        throw new ImageDecoderException(e2.getCause());
                    }
                }
            } catch (Throwable th) {
                this.pendingDecode = null;
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            this.pendingEndOfStream = true;
            decoderInputBuffer.clear();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        Assertions.checkState(byteBuffer.hasArray());
        this.pendingDecode = this.bitmapResolver.resolve(new ExternalImageRequest(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.pendingDecodeTimeUs = decoderInputBuffer.timeUs;
        decoderInputBuffer.clear();
    }
}
