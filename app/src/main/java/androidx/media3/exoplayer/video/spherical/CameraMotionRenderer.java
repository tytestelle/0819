package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CameraMotionRenderer extends BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final String TAG = "CameraMotionRenderer";
    private final DecoderInputBuffer buffer;
    private long lastTimestampUs;

    @Nullable
    private CameraMotionListener listener;
    private final ParsableByteArray scratch;

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new DecoderInputBuffer(1);
        this.scratch = new ParsableByteArray();
    }

    @Nullable
    private float[] parseMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) {
        if (i == 8) {
            this.listener = (CameraMotionListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        resetListener();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z) {
        this.lastTimestampUs = Long.MIN_VALUE;
        resetListener();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.lastTimestampUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j) {
            this.buffer.clear();
            if (readSource(getFormatHolder(), this.buffer, 0) != -4 || this.buffer.isEndOfStream()) {
                return;
            }
            long j3 = this.buffer.timeUs;
            this.lastTimestampUs = j3;
            boolean z = j3 < getLastResetPositionUs();
            if (this.listener != null && !z) {
                this.buffer.flip();
                float[] metadata = parseMetadata((ByteBuffer) Util.castNonNull(this.buffer.data));
                if (metadata != null) {
                    ((CameraMotionListener) Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - getStreamOffsetUs(), metadata);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(format.sampleMimeType) ? O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(4) : O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
    }
}
