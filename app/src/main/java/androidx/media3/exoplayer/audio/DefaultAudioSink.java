package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.OpusUtil;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    private static final int AUDIO_TRACK_VOLUME_RAMP_TIME_MS = 20;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;

    @GuardedBy("releaseExecutorLock")
    private static int pendingReleaseCount;

    @Nullable
    @GuardedBy("releaseExecutorLock")
    private static ScheduledExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private long accumulatedSkippedSilenceDurationUs;

    @Nullable
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;

    @Nullable
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final AudioOffloadSupportProvider audioOffloadSupportProvider;
    private AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @Nullable
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private final AudioTrackProvider audioTrackProvider;
    private AuxEffectInfo auxEffectInfo;

    @Nullable
    private ByteBuffer avSyncHeader;
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O availableAudioProcessors;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;

    @Nullable
    private final Context context;
    private final int contextDeviceId;

    @Nullable
    private Context contextWithDeviceId;
    private final boolean enableFloatOutput;
    private boolean enableOnAudioPositionAdvancingFix;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private long lastTunnelingAvSyncPresentationTimeUs;

    @Nullable
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;

    @Nullable
    private OnRoutingChangedListenerApi24 onRoutingChangedListener;

    @Nullable
    private ByteBuffer outputBuffer;
    private boolean pendingAudioSessionIdChangeConfirmation;

    @Nullable
    private Configuration pendingConfiguration;

    @Nullable
    private Looper playbackLooper;
    private PlaybackParameters playbackParameters;

    @Nullable
    private PlayerId playerId;
    private boolean playing;
    private final boolean preferAudioTrackPlaybackParams;

    @Nullable
    private AudioDeviceInfoApi23 preferredDevice;
    private Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final ToFloatPcmAudioProcessor toFloatPcmAudioProcessor;
    private final ToInt16PcmAudioProcessor toInt16PcmAudioProcessor;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        public static long getAudioTrackBufferSizeUs(AudioTrack audioTrack, Configuration configuration) {
            return configuration.outputMode == 0 ? configuration.framesToDurationUs(audioTrack.getBufferSizeInFrames()) : Util.scaleLargeValue(audioTrack.getBufferSizeInFrames(), 1000000L, DefaultAudioSink.getNonPcmMaximumEncodedRateBytesPerSecond(configuration.outputEncoding), RoundingMode.DOWN);
        }

        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes);
    }

    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    public interface AudioTrackProvider {
        public static final AudioTrackProvider DEFAULT = new DefaultAudioTrackProvider();

        AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, @Nullable Context context);

        int getAudioTrackChannelConfig(int i);
    }

    public static final class Configuration {
        public final AudioProcessingPipeline audioProcessingPipeline;
        public final int bufferSize;
        public final boolean enableAudioTrackPlaybackParams;
        public final boolean enableOffloadGapless;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;
        public final boolean tunneling;

        public Configuration(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, AudioProcessingPipeline audioProcessingPipeline, boolean z, boolean z2, boolean z3) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i;
            this.outputMode = i2;
            this.outputPcmFrameSize = i3;
            this.outputSampleRate = i4;
            this.outputChannelConfig = i5;
            this.outputEncoding = i6;
            this.bufferSize = i7;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.enableAudioTrackPlaybackParams = z;
            this.enableOffloadGapless = z2;
            this.tunneling = z3;
        }

        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            return new AudioSink.AudioTrackConfig(this.outputEncoding, this.outputSampleRate, this.outputChannelConfig, this.tunneling, this.outputMode == 1, this.bufferSize);
        }

        public boolean canReuseAudioTrack(Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize && configuration.enableAudioTrackPlaybackParams == this.enableAudioTrackPlaybackParams && configuration.enableOffloadGapless == this.enableOffloadGapless;
        }

        public Configuration copyWithBufferSize(int i) {
            return new Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i, this.audioProcessingPipeline, this.enableAudioTrackPlaybackParams, this.enableOffloadGapless, this.tunneling);
        }

        public long framesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.outputSampleRate);
        }

        public long inputFramesToDurationUs(long j) {
            return Util.sampleCountToDurationUs(j, this.inputFormat.sampleRate);
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;

        private MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioTrackPositionUs = j2;
        }
    }

    @RequiresApi(24)
    public static final class OnRoutingChangedListenerApi24 {
        private final AudioTrack audioTrack;
        private final AudioCapabilitiesReceiver capabilitiesReceiver;

        @Nullable
        private AudioRouting.OnRoutingChangedListener listener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f2529O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onRoutingChanged(audioRouting);
            }
        };

        public OnRoutingChangedListenerApi24(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.audioTrack = audioTrack;
            this.capabilitiesReceiver = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.listener, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.listener == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.capabilitiesReceiver.setRoutedDevice(routedDevice);
        }

        public void release() {
            this.audioTrack.removeOnRoutingChangedListener(androidx.media3.decoder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Assertions.checkNotNull(this.listener)));
            this.listener = null;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {
        private static final int RETRY_DELAY_MS = 50;
        private static final int RETRY_DURATION_MS = 200;

        @Nullable
        private T pendingException;
        private long throwDeadlineMs = C.TIME_UNSET;
        private long earliestNextRetryTimeMs = C.TIME_UNSET;

        public void clear() {
            this.pendingException = null;
            this.throwDeadlineMs = C.TIME_UNSET;
            this.earliestNextRetryTimeMs = C.TIME_UNSET;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.pendingException == null) {
                return false;
            }
            return DefaultAudioSink.hasPendingAudioTrackReleases() || SystemClock.elapsedRealtime() < this.earliestNextRetryTimeMs;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
            }
            if (this.throwDeadlineMs == C.TIME_UNSET && !DefaultAudioSink.hasPendingAudioTrackReleases()) {
                this.throwDeadlineMs = 200 + jElapsedRealtime;
            }
            long j = this.throwDeadlineMs;
            if (j == C.TIME_UNSET || jElapsedRealtime < j) {
                this.earliestNextRetryTimeMs = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.pendingException;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.pendingException;
            clear();
            throw t3;
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j2);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j3);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j4);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(DefaultAudioSink.this.getSubmittedFrames());
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(DefaultAudioSink.this.getWrittenFrames());
            String string = sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j2);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j3);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j4);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(DefaultAudioSink.this.getSubmittedFrames());
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(", ");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(DefaultAudioSink.this.getWrittenFrames());
            String string = sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i, long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    @RequiresApi(29)
    public final class StreamEventCallbackV29 {
        private final AudioTrack.StreamEventCallback callback;
        private final Handler handler = new Handler(Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new AudioTrack.StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onPresentationEnded(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack)) {
                        DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(handler), this.callback);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        PlaybackParameters playbackParametersApplyPlaybackParameters;
        if (useAudioTrackPlaybackParams()) {
            playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
        } else {
            playbackParametersApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParametersApplyPlaybackParameters;
        }
        PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParameters, Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j2 = j - mediaPositionParameters.audioTrackPositionUs;
        long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j2, mediaPositionParameters.playbackParameters.speed);
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            MediaPositionParameters mediaPositionParameters2 = this.mediaPositionParameters;
            return mediaPositionParameters2.mediaTimeUs + mediaDurationForPlayoutDuration + mediaPositionParameters2.mediaPositionDriftUs;
        }
        long mediaDuration = this.audioProcessorChain.getMediaDuration(j2);
        MediaPositionParameters mediaPositionParameters3 = this.mediaPositionParameters;
        long j3 = mediaPositionParameters3.mediaTimeUs + mediaDuration;
        mediaPositionParameters3.mediaPositionDriftUs = mediaDuration - mediaDurationForPlayoutDuration;
        return j3;
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j2 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j2) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j2);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private AudioTrack buildAudioTrack(Configuration configuration) throws AudioSink.InitializationException {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.audioSessionId;
            int i3 = this.contextDeviceId;
            if (i3 == -1 || (context2 = this.context) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.contextWithDeviceId == null) {
                    this.contextWithDeviceId = context2.createDeviceContext(i3);
                }
                context = this.contextWithDeviceId;
                i = 0;
            }
            AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configuration.buildAudioTrackConfig(), this.audioAttributes, i, configuration.inputFormat, context);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener != null) {
                audioOffloadListener.onOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            }
            return audioTrackBuildAudioTrack;
        } catch (AudioSink.InitializationException e) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((Configuration) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e) {
            Configuration configuration = this.configuration;
            if (configuration.bufferSize > 1000000) {
                Configuration configurationCopyWithBufferSize = configuration.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configurationCopyWithBufferSize);
                    this.configuration = configurationCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void drainOutputBuffer(long j) throws T, AudioSink.WriteException {
        int iWriteNonBlocking;
        AudioSink.Listener listener;
        if (this.outputBuffer == null || this.writeExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return;
        }
        int iRemaining = this.outputBuffer.remaining();
        boolean z = false;
        if (this.tunneling) {
            Assertions.checkState(j != C.TIME_UNSET);
            if (j == Long.MIN_VALUE) {
                j = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j;
            }
            iWriteNonBlocking = writeNonBlockingWithAvSync(this.audioTrack, this.outputBuffer, iRemaining, j);
        } else {
            iWriteNonBlocking = writeNonBlocking(this.audioTrack, this.outputBuffer, iRemaining);
        }
        this.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
        if (iWriteNonBlocking < 0) {
            if (isAudioTrackDeadObject(iWriteNonBlocking)) {
                if (getWrittenFrames() > 0) {
                    z = true;
                } else if (isOffloadedPlayback(this.audioTrack)) {
                    maybeDisableOffload();
                    z = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlocking, this.configuration.inputFormat, z);
            AudioSink.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onAudioSinkError(writeException);
            }
            if (!writeException.isRecoverable || this.context == null) {
                this.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            }
            AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioCapabilities = audioCapabilities;
            this.audioCapabilitiesReceiver.overrideCapabilities(audioCapabilities);
            throw writeException;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        if (isOffloadedPlayback(this.audioTrack)) {
            if (this.writtenEncodedFrames > 0) {
                this.isWaitingForOffloadEndOfStreamHandled = false;
            }
            if (this.playing && (listener = this.listener) != null && iWriteNonBlocking < iRemaining && !this.isWaitingForOffloadEndOfStreamHandled) {
                listener.onOffloadBufferFull();
            }
        }
        int i = this.configuration.outputMode;
        if (i == 0) {
            this.writtenPcmBytes += (long) iWriteNonBlocking;
        }
        if (iWriteNonBlocking == iRemaining) {
            if (i != 0) {
                Assertions.checkState(this.outputBuffer == this.inputBuffer);
                this.writtenEncodedFrames = (((long) this.framesPerEncodedSample) * ((long) this.inputBufferAccessUnitCount)) + this.writtenEncodedFrames;
            }
            this.outputBuffer = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private boolean drainToEndOfStream() throws T, AudioSink.WriteException {
        if (!this.audioProcessingPipeline.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.isEnded()) {
            return false;
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    @RequiresApi(34)
    private static int getDeviceIdFromContext(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (mpegAudioFrameSampleCount != -1) {
                        return mpegAudioFrameSampleCount;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                            if (iFindTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Unexpected audio encoding: "));
                    }
                    break;
            }
            return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    private static String getLooperThreadName(@Nullable Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i);
        Assertions.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.submittedPcmBytes / ((long) configuration.inputPcmFrameSize) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? Util.ceilDivide(this.writtenPcmBytes, configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void handleSkippedSilence(long j) {
        this.accumulatedSkippedSilenceDurationUs += j;
        if (this.reportSkippedSilenceHandler == null) {
            this.reportSkippedSilenceHandler = new Handler(Looper.myLooper());
        }
        this.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
            @Override // java.lang.Runnable
            public final void run() {
                this.f2527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPendingAudioTrackReleases() {
        boolean z;
        synchronized (releaseExecutorLock) {
            z = pendingReleaseCount > 0;
        }
        return z;
    }

    private boolean initializeAudioTrack() throws AudioSink.InitializationException {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        PlayerId playerId;
        if (this.initializationExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            Configuration configuration = this.configuration;
            if (configuration.enableOffloadGapless) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = configuration.inputFormat;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (playerId = this.playerId) != null) {
            Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        Configuration configuration2 = this.configuration;
        audioTrackPositionTracker.setAudioTrack(audioTrack2, configuration2.outputMode == 2, configuration2.outputEncoding, configuration2.outputPcmFrameSize, configuration2.bufferSize, this.enableOnAudioPositionAdvancingFix);
        setVolumeInternal();
        int i2 = this.auxEffectInfo.effectId;
        if (i2 != 0) {
            this.audioTrack.attachAuxEffect(i2);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.preferredDevice;
        if (audioDeviceInfoApi23 != null && i >= 23) {
            Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, audioDeviceInfoApi23);
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = this.audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver2 != null) {
                audioCapabilitiesReceiver2.setRoutedDevice(this.preferredDevice.audioDeviceInfo);
            }
        }
        if (i >= 24 && (audioCapabilitiesReceiver = this.audioCapabilitiesReceiver) != null) {
            this.onRoutingChangedListener = new OnRoutingChangedListenerApi24(this.audioTrack, audioCapabilitiesReceiver);
        }
        this.startMediaTimeUsNeedsInit = true;
        int audioSessionId = this.audioTrack.getAudioSessionId();
        boolean z = audioSessionId != this.audioSessionId;
        this.audioSessionId = audioSessionId;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
            if (z) {
                this.pendingAudioSessionIdChangeConfirmation = true;
                this.listener.onAudioSessionIdChanged(this.audioSessionId);
            }
        }
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (Build.VERSION.SDK_INT >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, AudioSink.Listener listener, Handler handler, AudioSink.AudioTrackConfig audioTrackConfig) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(listener, audioTrackConfig, 18));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(listener, audioTrackConfig, 18));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i2 = pendingReleaseCount - 1;
                    pendingReleaseCount = i2;
                    if (i2 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private ByteBuffer maybeRampUpVolume(ByteBuffer byteBuffer) {
        if (this.configuration.outputMode != 0) {
            return byteBuffer;
        }
        int iDurationUsToSampleCount = (int) Util.durationUsToSampleCount(Util.msToUs(20L), this.configuration.outputSampleRate);
        long writtenFrames = getWrittenFrames();
        if (writtenFrames >= iDurationUsToSampleCount) {
            return byteBuffer;
        }
        Configuration configuration = this.configuration;
        return PcmAudioUtil.rampUpVolume(byteBuffer, configuration.outputEncoding, configuration.outputPcmFrameSize, (int) writtenFrames, iDurationUsToSampleCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    @EnsuresNonNull({"audioCapabilities"})
    private void maybeStartAudioCapabilitiesReceiver() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        Assertions.checkState(this.audioCapabilitiesReceiver == null || this.playbackLooper == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + getLooperThreadName(this.playbackLooper) + " and " + getLooperThreadName(looperMyLooper));
        if (this.audioCapabilitiesReceiver == null && (context = this.context) != null) {
            this.playbackLooper = looperMyLooper;
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new AudioCapabilitiesReceiver.Listener() { // from class: androidx.media3.exoplayer.audio.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
                @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
                public final void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                    this.f2528O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onAudioCapabilitiesChanged(audioCapabilities);
                }
            }, this.audioAttributes, this.preferredDevice);
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver;
            this.audioCapabilities = audioCapabilitiesReceiver.register();
        }
        Assertions.checkNotNull(this.audioCapabilities);
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        if (isOffloadedPlayback(this.audioTrack)) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void processBuffers(long j) throws T, AudioSink.WriteException {
        drainOutputBuffer(j);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer != null) {
                setOutputBuffer(byteBuffer);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                ByteBuffer output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    setOutputBuffer(output);
                    drainOutputBuffer(j);
                } else {
                    ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    @RequiresApi(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, @Nullable final AudioSink.Listener listener, final AudioSink.AudioTrackConfig audioTrackConfig) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (releaseExecutorLock) {
            try {
                if (releaseExecutor == null) {
                    releaseExecutor = Util.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                pendingReleaseCount++;
                releaseExecutor.schedule(new Runnable() { // from class: androidx.media3.exoplayer.audio.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.lambda$releaseAudioTrackAsync$1(audioTrack, listener, handler, audioTrackConfig);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioProcessorPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, C.TIME_UNSET, C.TIME_UNSET);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    @RequiresApi(23)
    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(androidx.media3.common.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO().allowDefaults().setSpeed(this.playbackParameters.speed).setPitch(this.playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.w(TAG, "Failed to set playback params", e);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.playbackParameters = playbackParameters;
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
    }

    private void setOutputBuffer(ByteBuffer byteBuffer) {
        Assertions.checkState(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            this.outputBuffer = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            this.audioTrack.setVolume(this.volume);
        }
    }

    private void setupAudioProcessors() {
        AudioProcessingPipeline audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (!this.tunneling) {
            Configuration configuration = this.configuration;
            if (configuration.outputMode == 0 && !shouldUseFloatOutput(configuration.inputFormat.pcmEncoding)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i);
    }

    private boolean useAudioTrackPlaybackParams() {
        Configuration configuration = this.configuration;
        return configuration != null && configuration.enableAudioTrackPlaybackParams && Build.VERSION.SDK_INT >= 23;
    }

    private static int writeNonBlocking(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlocking = writeNonBlocking(audioTrack, byteBuffer, i);
        if (iWriteNonBlocking < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlocking;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlocking;
        return iWriteNonBlocking;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessingPipeline audioProcessingPipeline;
        int i2;
        int iIntValue;
        int i3;
        boolean z;
        int pcmFrameSize;
        int pcmFrameSize2;
        int i4;
        boolean z2;
        int bufferSizeInBytes;
        maybeStartAudioCapabilitiesReceiver();
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO(4);
            o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this.availableAudioProcessors);
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.toFloatPcmAudioProcessor);
            } else {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.toInt16PcmAudioProcessor);
                AudioProcessor[] audioProcessors = this.audioProcessorChain.getAudioProcessors();
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(audioProcessors.length, audioProcessors);
            }
            AudioProcessingPipeline audioProcessingPipeline2 = new AudioProcessingPipeline(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            this.channelMappingAudioProcessor.setChannelMap(iArr);
            try {
                AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline2.configure(new AudioProcessor.AudioFormat(format));
                int i5 = audioFormatConfigure.encoding;
                int i6 = audioFormatConfigure.sampleRate;
                int audioTrackChannelConfig = this.audioTrackProvider.getAudioTrackChannelConfig(audioFormatConfigure.channelCount);
                pcmFrameSize2 = Util.getPcmFrameSize(i5, audioFormatConfigure.channelCount);
                audioProcessingPipeline = audioProcessingPipeline2;
                i2 = i6;
                iIntValue = audioTrackChannelConfig;
                z = this.preferAudioTrackPlaybackParams;
                i4 = 0;
                z2 = false;
                i3 = i5;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, format);
            }
        } else {
            AudioProcessingPipeline audioProcessingPipeline3 = new AudioProcessingPipeline(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
            int i7 = format.sampleRate;
            AudioOffloadSupport formatOffloadSupport = this.offloadMode != 0 ? getFormatOffloadSupport(format) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (this.offloadMode == 0 || !formatOffloadSupport.isFormatSupported) {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, this.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                audioProcessingPipeline = audioProcessingPipeline3;
                i2 = i7;
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i3 = iIntValue2;
                z = this.preferAudioTrackPlaybackParams;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i4 = 2;
                z2 = false;
            } else {
                int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                int audioTrackChannelConfig2 = this.audioTrackProvider.getAudioTrackChannelConfig(format.channelCount);
                audioProcessingPipeline = audioProcessingPipeline3;
                i2 = i7;
                z2 = formatOffloadSupport.isGaplessSupported;
                i3 = encoding;
                iIntValue = audioTrackChannelConfig2;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i4 = 1;
                z = true;
            }
        }
        if (i3 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + format, format);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + format, format);
        }
        int i8 = format.bitrate;
        int i9 = (MimeTypes.AUDIO_DTS_EXPRESS.equals(format.sampleMimeType) && i8 == -1) ? 768000 : i8;
        if (i != 0) {
            bufferSizeInBytes = i;
        } else {
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, iIntValue, i3), i3, i4, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i2, i9, z ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        Configuration configuration = new Configuration(format, pcmFrameSize, i4, pcmFrameSize2, i2, iIntValue, i3, bufferSizeInBytes, audioProcessingPipeline, z, z2, this.tunneling);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = configuration;
        } else {
            this.configuration = configuration;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((StreamEventCallbackV29) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            AudioSink.AudioTrackConfig audioTrackConfigBuildAudioTrackConfig = this.configuration.buildAudioTrackConfig();
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            if (Build.VERSION.SDK_INT >= 24 && (onRoutingChangedListenerApi24 = this.onRoutingChangedListener) != null) {
                onRoutingChangedListenerApi24.release();
                this.onRoutingChangedListener = null;
            }
            releaseAudioTrackAsync(this.audioTrack, this.listener, audioTrackConfigBuildAudioTrackConfig);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            ((Handler) Assertions.checkNotNull(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        if (!isAudioTrackInitialized()) {
            return C.TIME_UNSET;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23.getAudioTrackBufferSizeUs(this.audioTrack, this.configuration);
        }
        Configuration configuration = this.configuration;
        return Util.scaleLargeValue(this.configuration.bufferSize, 1000000L, configuration.outputMode == 0 ? ((long) configuration.outputSampleRate) * ((long) configuration.outputPcmFrameSize) : getNonPcmMaximumEncodedRateBytesPerSecond(configuration.outputEncoding), RoundingMode.DOWN);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return this.offloadDisabledUntilNextConfiguration ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : this.audioOffloadSupportProvider.getAudioOffloadSupport(format, this.audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        maybeStartAudioCapabilitiesReceiver();
        if (!MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(format, this.audioAttributes) ? 2 : 0;
        }
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            int i = format.pcmEncoding;
            return (i == 2 || (this.enableFloatOutput && i == 4)) ? 2 : 1;
        }
        Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws T, AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.configuration.enableOffloadGapless) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    Format format = this.configuration.inputFormat;
                    audioTrack2.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            Assertions.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            Configuration configuration = this.configuration;
            if (configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j) > 200000) {
                AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j2 = j - jInputFramesToDurationUs;
                this.startMediaTimeUs += j2;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j2 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames = (((long) this.framesPerEncodedSample) * ((long) i)) + this.submittedEncodedFrames;
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i;
        }
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && !(Build.VERSION.SDK_INT >= 29 && this.audioTrack.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.handledEndOfStream && !hasPendingData());
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.checkState(this.playbackLooper == looperMyLooper, "Current looper (" + getLooperThreadName(looperMyLooper) + ") is not the playback looper (" + getLooperThreadName(this.playbackLooper) + ")");
        AudioCapabilities audioCapabilities2 = this.audioCapabilities;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.pause();
            if (!this.stoppedAudioTrack || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            if (!this.stoppedAudioTrack || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.play();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.availableAudioProcessors.iterator();
        while (it.hasNext()) {
            ((AudioProcessor) it.next()).reset();
        }
        this.toInt16PcmAudioProcessor.reset();
        this.toFloatPcmAudioProcessor.reset();
        AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setAudioAttributes(audioAttributes);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.pendingAudioSessionIdChangeConfirmation) {
            if (this.audioSessionId != i) {
                return;
            } else {
                this.pendingAudioSessionIdChangeConfirmation = false;
            }
        }
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioTrack.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.audioTrackPositionTracker.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadDelayPadding(int i, int i2) {
        Configuration configuration;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (configuration = this.configuration) == null || !configuration.enableOffloadGapless) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadMode(int i) {
        Assertions.checkState(Build.VERSION.SDK_INT >= 29);
        this.offloadMode = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final /* synthetic */ void setOutputStreamOffsetUs(long j) {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, j);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.playbackParameters = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(playbackParameters);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            Api23.setPreferredDeviceOnAudioTrack(audioTrack, this.preferredDevice);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.skipSilenceEnabled = z;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(Builder builder) {
        Context applicationContext = builder.context == null ? null : builder.context.getApplicationContext();
        this.context = applicationContext;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioCapabilities = applicationContext != null ? null : builder.audioCapabilities;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = builder.enableFloatOutput;
        int i = Build.VERSION.SDK_INT;
        this.preferAudioTrackPlaybackParams = i >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.audioOffloadSupportProvider = (AudioOffloadSupportProvider) Assertions.checkNotNull(builder.audioOffloadSupportProvider);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        this.toFloatPcmAudioProcessor = new ToFloatPcmAudioProcessor();
        this.availableAudioProcessors = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of((ChannelMappingAudioProcessor) trimmingAudioProcessor, channelMappingAudioProcessor);
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.audioOffloadListener = builder.audioOffloadListener;
        this.audioTrackProvider = builder.audioTrackProvider;
        this.contextDeviceId = (i < 34 || builder.context == null) ? -1 : getDeviceIdFromContext(builder.context);
        this.enableOnAudioPositionAdvancingFix = builder.enableOnAudioPositionAdvancingFix;
    }

    public static final class Builder {
        private AudioCapabilities audioCapabilities;

        @Nullable
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;

        @Nullable
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private AudioTrackProvider audioTrackProvider;
        private boolean buildCalled;

        @Nullable
        private final Context context;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private boolean enableOnAudioPositionAdvancingFix;

        @Deprecated
        public Builder() {
            this.enableOnAudioPositionAdvancingFix = true;
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
            this.audioTrackProvider = AudioTrackProvider.DEFAULT;
        }

        public DefaultAudioSink build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new DefaultAudioSink(this);
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }

        @CanIgnoreReturnValue
        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAudioTrackProvider(AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEnableAudioTrackPlaybackParams(boolean z) {
            this.enableAudioTrackPlaybackParams = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEnableOnAudioPositionAdvancingFix(boolean z) {
            this.enableOnAudioPositionAdvancingFix = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setExperimentalAudioOffloadListener(@Nullable ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder(Context context) {
            this.enableOnAudioPositionAdvancingFix = true;
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
            this.audioTrackProvider = AudioTrackProvider.DEFAULT;
        }
    }

    private AudioTrack buildAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, Format format, @Nullable Context context) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrack = this.audioTrackProvider.getAudioTrack(audioTrackConfig, audioAttributes, i, context);
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding, audioTrackConfig.bufferSize, format, audioTrackConfig.offload, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink.InitializationException(0, audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding, audioTrackConfig.bufferSize, format, audioTrackConfig.offload, e);
        }
    }
}
