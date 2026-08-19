package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private static final String TAG = "MediaCodecAudioRenderer";
    private static final String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    private final Context context;
    private long currentPositionUs;

    @Nullable
    private Format decryptOnlyCodecFormat;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean hasPendingReportedSkippedSilence;

    @Nullable
    private Format inputFormat;
    private boolean isStarted;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;
    private long nextBufferToWritePresentationTimeUs;
    private int rendererPriority;

    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        public static void setAudioSinkPreferredDevice(AudioSink audioSink, @Nullable Object obj) {
            audioSink.setPreferredDevice(androidx.media3.common.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj));
        }
    }

    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            MediaCodecAudioRenderer.this.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSessionIdChanged(int i) {
            if (Build.VERSION.SDK_INT >= 35 && MediaCodecAudioRenderer.this.loudnessCodecController != null) {
                MediaCodecAudioRenderer.this.loudnessCodecController.setAudioSessionId(i);
            }
            MediaCodecAudioRenderer.this.eventDispatcher.audioSessionIdChanged(i);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            Log.e(MediaCodecAudioRenderer.TAG, "Audio sink error", exc);
            MediaCodecAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferEmptying() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onSleep();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j) {
            MediaCodecAudioRenderer.this.eventDispatcher.positionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            MediaCodecAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            MediaCodecAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            MediaCodecAudioRenderer.this.eventDispatcher.underrun(i, j, j2);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (Build.VERSION.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        if (Build.VERSION.SDK_INT == 23) {
            String str = Build.MODEL;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int getAudioOffloadSupport(Format format) {
        AudioOffloadSupport formatOffloadSupport = this.audioSink.getFormatOffloadSupport(format);
        if (!formatOffloadSupport.isFormatSupported) {
            return 0;
        }
        int i = formatOffloadSupport.isGaplessSupported ? 1536 : 512;
        return formatOffloadSupport.isSpeedChangeSupported ? i | 2048 : i;
    }

    private void setAudioSessionId(int i) {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.setAudioSessionId(i);
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.setAudioSessionId(i);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        if (isBypassPossible(format2)) {
            i |= 32768;
        }
        if (getCodecMaxInputSize(mediaCodecInfo, format2) > this.codecMaxInputSize) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i2);
    }

    public int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return codecMaxInputSize;
        }
        for (Format format2 : formatArr) {
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, format2));
            }
        }
        return codecMaxInputSize;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i = format2.sampleRate;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(mediaCodecSelector, format, z, this.audioSink), format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long getDurationToProgressUs(long j, long j2, boolean z) {
        boolean z2 = this.nextBufferToWritePresentationTimeUs != C.TIME_UNSET;
        if (!this.isStarted) {
            if (z2 || super.isEnded()) {
                return 1000000L;
            }
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        long audioTrackBufferSizeUs = this.audioSink.getAudioTrackBufferSizeUs();
        if (!z2 || audioTrackBufferSizeUs == C.TIME_UNSET) {
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        return Math.max(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, ((long) ((Math.min(audioTrackBufferSizeUs, this.nextBufferToWritePresentationTimeUs - j) / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f)) - (Util.msToUs(getClock().elapsedRealtime()) - j2));
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = codecNeedsVorbisToAndroidChannelMappingWorkaround(mediaCodecInfo.name);
        MediaFormat mediaFormat = getMediaFormat(format, mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f);
        this.decryptOnlyCodecFormat = (!MimeTypes.AUDIO_RAW.equals(mediaCodecInfo.mimeType) || MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) ? null : format;
        return MediaCodecAdapter.Configuration.createForAudioDecoding(mediaCodecInfo, mediaFormat, format, mediaCrypto, this.loudnessCodecController);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            mediaFormat.setInteger(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.PRIORITY, 0);
            if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
            if (codecProfileAndLevel != null) {
                MediaFormatUtil.maybeSetInteger(mediaFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
                MediaFormatUtil.maybeSetInteger(mediaFormat, "level", ((Integer) codecProfileAndLevel.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i2 >= 24 && this.audioSink.getFormatSupport(Util.getPcmFormat(4, format.channelCount, format.sampleRate)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        Format format;
        if (Build.VERSION.SDK_INT < 29 || (format = decoderInputBuffer.format) == null || !Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) || !isBypassEnabled()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
        int i = ((Format) Assertions.checkNotNull(decoderInputBuffer.format)).encoderDelay;
        if (byteBuffer.remaining() == 8) {
            this.audioSink.setOffloadDelayPadding(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) {
        if (i == 2) {
            this.audioSink.setVolume(((Float) Assertions.checkNotNull(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.audioSink.setAudioAttributes((AudioAttributes) Assertions.checkNotNull((AudioAttributes) obj));
            return;
        }
        if (i == 6) {
            this.audioSink.setAuxEffectInfo((AuxEffectInfo) Assertions.checkNotNull((AuxEffectInfo) obj));
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                Api23.setAudioSinkPreferredDevice(this.audioSink, obj);
            }
        } else if (i == 16) {
            this.rendererPriority = ((Integer) Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
        } else if (i == 9) {
            this.audioSink.setSkipSilenceEnabled(((Boolean) Assertions.checkNotNull(obj)).booleanValue());
        } else if (i != 10) {
            super.handleMessage(i, obj);
        } else {
            setAudioSessionId(((Integer) Assertions.checkNotNull(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        Log.e(TAG, "Audio codec error", exc);
        this.eventDispatcher.audioCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        try {
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        this.eventDispatcher.enabled(this.decoderCounters);
        if (getConfiguration().tunneling) {
            this.audioSink.enableTunnelingV21();
        } else {
            this.audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        this.inputFormat = format;
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(format, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int pcmEncoding;
        int i;
        Format format2 = this.decryptOnlyCodecFormat;
        int[] vorbisToAndroidChannelLayoutMapping = null;
        if (format2 != null) {
            format = format2;
        } else if (getCodec() != null) {
            Assertions.checkNotNull(mediaFormat);
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                pcmEncoding = format.pcmEncoding;
            } else if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                pcmEncoding = mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? Util.getPcmEncoding(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : 2;
            } else {
                pcmEncoding = mediaFormat.getInteger("pcm-encoding");
            }
            Format formatBuild = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(pcmEncoding).setEncoderDelay(format.encoderDelay).setEncoderPadding(format.encoderPadding).setMetadata(format.metadata).setCustomData(format.customData).setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.codecNeedsDiscardChannelsWorkaround && formatBuild.channelCount == 6 && (i = format.channelCount) < 6) {
                vorbisToAndroidChannelLayoutMapping = new int[i];
                for (int i2 = 0; i2 < format.channelCount; i2++) {
                    vorbisToAndroidChannelLayoutMapping[i2] = i2;
                }
            } else if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                vorbisToAndroidChannelLayoutMapping = VorbisUtil.getVorbisToAndroidChannelLayoutMapping(formatBuild.channelCount);
            }
            format = formatBuild;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) {
                    this.audioSink.setOffloadMode(0);
                } else {
                    this.audioSink.setOffloadMode(getConfiguration().offloadModePreferred);
                }
            }
            this.audioSink.configure(format, 0, vorbisToAndroidChannelLayoutMapping);
        } catch (AudioSink.ConfigurationException e) {
            throw createRendererException(e, e.format, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputStreamOffsetUsChanged(long j) {
        this.audioSink.setOutputStreamOffsetUs(j);
    }

    @CallSuper
    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z) {
        super.onPositionReset(j, z);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.hasPendingReportedSkippedSilence = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        this.audioSink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.release();
        if (Build.VERSION.SDK_INT < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        this.hasPendingReportedSkippedSilence = false;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        try {
            super.onReset();
        } finally {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        Assertions.checkNotNull(byteBuffer);
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        if (this.decryptOnlyCodecFormat != null && (i2 & 2) != 0) {
            ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.skippedOutputBufferCount += i3;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j3, i3)) {
                this.nextBufferToWritePresentationTimeUs = j3;
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.renderedOutputBufferCount += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw createRendererException(e, this.inputFormat, e.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e2) {
            throw createRendererException(e2, format, e2.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
            if (getLastBufferInStreamPresentationTimeUs() != C.TIME_UNSET) {
                this.nextBufferToWritePresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
            }
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable, isBypassEnabled() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldUseBypass(Format format) {
        if (getConfiguration().offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if ((audioOffloadSupport & 512) != 0) {
                if (getConfiguration().offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (format.encoderDelay == 0 && format.encoderPadding == 0) {
                    return true;
                }
            }
        }
        return this.audioSink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        int i;
        boolean z;
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
        }
        boolean z2 = true;
        boolean z3 = format.cryptoType != 0;
        boolean zSupportsFormatDrm = MediaCodecRenderer.supportsFormatDrm(format);
        int i2 = 8;
        if (!zSupportsFormatDrm || (z3 && MediaCodecUtil.getDecryptOnlyDecoderInfo() == null)) {
            i = 0;
        } else {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if (this.audioSink.supportsFormat(format)) {
                return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(4, 8, 32, audioOffloadSupport);
            }
            i = audioOffloadSupport;
        }
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) && !this.audioSink.supportsFormat(format)) {
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
        }
        if (!this.audioSink.supportsFormat(Util.getPcmFormat(2, format.channelCount, format.sampleRate))) {
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
        }
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, false, this.audioSink);
        if (decoderInfos.isEmpty()) {
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
        }
        if (!zSupportsFormatDrm) {
            return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!zIsFormatSupported) {
            int i3 = 1;
            while (true) {
                if (i3 >= decoderInfos.size()) {
                    z2 = zIsFormatSupported;
                    z = true;
                    break;
                }
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i3);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    mediaCodecInfo = mediaCodecInfo2;
                    z = false;
                    break;
                }
                i3++;
            }
        } else {
            z2 = zIsFormatSupported;
            z = true;
            break;
        }
        int i4 = z2 ? 4 : 3;
        if (z2 && mediaCodecInfo.isSeamlessAdaptationSupported(format)) {
            i2 = 16;
        }
        return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4, i2, 32, mediaCodecInfo.hardwareAccelerated ? 64 : 0, z ? 128 : 0, i);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder(context).build());
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, AudioSink audioSink) {
        MediaCodecInfo decryptOnlyDecoderInfo;
        if (format.sampleMimeType == null) {
            return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
        }
        if (audioSink.supportsFormat(format) && (decryptOnlyDecoderInfo = MediaCodecUtil.getDecryptOnlyDecoderInfo()) != null) {
            return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(decryptOnlyDecoderInfo);
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, false);
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder().setAudioCapabilities((AudioCapabilities) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).build());
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.name) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && Util.isTv(this.context))) {
            return format.maxInputSize;
        }
        return -1;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, androidx.media3.exoplayer.mediacodec.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context), mediaCodecSelector, false, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, androidx.media3.exoplayer.mediacodec.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, factory, mediaCodecSelector, z, handler, audioRendererEventListener, audioSink, Build.VERSION.SDK_INT >= 35 ? new LoudnessCodecController() : null);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink, @Nullable LoudnessCodecController loudnessCodecController) {
        super(1, factory, mediaCodecSelector, z, 44100.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.loudnessCodecController = loudnessCodecController;
        this.rendererPriority = -1000;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        audioSink.setListener(new AudioSinkListener());
    }
}
