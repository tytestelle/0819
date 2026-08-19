package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;

    @Nullable
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final /* synthetic */ void clearListener() {
        O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.checkState(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z);
        replaceStream(formatArr, sampleStream, j2, j3, mediaPeriodId);
        onPositionReset(j, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final /* synthetic */ void enableMayRenderStartOfStream() {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Nullable
    public final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final /* synthetic */ long getDurationToProgressUs(long j, long j2) {
        return O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, j2);
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.stream;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, PlayerId playerId, Clock clock) {
        this.index = i;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z) {
    }

    public void onPositionReset(long j, boolean z) {
    }

    public void onRendererOffsetChanged(long j) {
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final /* synthetic */ void release() {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.checkState(this.state == 0);
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) {
        this.streamIsFinal = false;
        onPositionReset(j, false);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final /* synthetic */ void setListener(RendererCapabilities.Listener listener) {
        O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, listener);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final /* synthetic */ void setPlaybackSpeed(float f, float f2) {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, f, f2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setTimeline(Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }
}
