package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoInfo;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final MediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;
    private int state;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O callbackThreadSupplier;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O queueingThreadSupplier;

        /* JADX WARN: Illegal instructions before constructor call */
        public Factory(final int i) {
            final int i2 = 0;
            final int i3 = 1;
            this(new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.mediacodec.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i);
                        default:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i);
                    }
                }
            }, new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.mediacodec.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i);
                        default:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$0(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$1(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i));
        }

        @ChecksSdkIntAtLeast(api = 34)
        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag(Format format) {
            int i = Build.VERSION.SDK_INT;
            if (i < 34) {
                return false;
            }
            return i >= 35 || MimeTypes.isVideo(format.sampleMimeType);
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z;
        }

        public Factory(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2) {
            this.callbackThreadSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
            this.queueingThreadSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            int i;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag(configuration.format)) {
                        asynchronousMediaCodecBufferEnqueuer = new SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (HandlerThread) this.queueingThreadSupplier.get());
                        i = 0;
                    }
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer, configuration.loudnessCodecController);
                    try {
                        TraceUtil.endSection();
                        Surface surface = configuration.surface;
                        if (surface == null && configuration.codecInfo.detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        asynchronousMediaCodecAdapter2.initialize(configuration.mediaFormat, surface, configuration.crypto, i);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e) {
                        e = e;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        LoudnessCodecController loudnessCodecController;
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i);
        TraceUtil.endSection();
        this.bufferEnqueuer.start();
        TraceUtil.beginSection("startCodec");
        this.codec.start();
        TraceUtil.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
            loudnessCodecController.addMediaCodec(this.codec);
        }
        this.state = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(35)
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @VisibleForTesting
    public void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    @VisibleForTesting
    public void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.bufferEnqueuer.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.bufferEnqueuer.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.codec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                    loudnessCodecController2.removeMediaCodec(this.codec);
                }
                this.codec.release();
                this.codecReleased = true;
            }
        } catch (Throwable th) {
            if (!this.codecReleased) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.codec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                        loudnessCodecController.removeMediaCodec(this.codec);
                    }
                    this.codec.release();
                    this.codecReleased = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.loudnessCodecController = loudnessCodecController;
        this.state = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }
}
