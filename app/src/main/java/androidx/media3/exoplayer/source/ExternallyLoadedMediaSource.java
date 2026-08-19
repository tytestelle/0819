package androidx.media3.exoplayer.source;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    private final ExternalLoader externalLoader;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final long timelineDurationUs;

    public static final class Factory implements MediaSource.Factory {
        private final ExternalLoader externalLoader;
        private final long timelineDurationUs;

        public Factory(long j, ExternalLoader externalLoader) {
            this.timelineDurationUs = j;
            this.externalLoader = externalLoader;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ExternallyLoadedMediaSource createMediaSource(MediaItem mediaItem) {
            return new ExternallyLoadedMediaSource(mediaItem, this.timelineDurationUs, this.externalLoader);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        MediaItem.LocalConfiguration localConfiguration2 = (MediaItem.LocalConfiguration) Assertions.checkNotNull(getMediaItem().localConfiguration);
        if (localConfiguration != null && localConfiguration.uri.equals(localConfiguration2.uri) && Objects.equals(localConfiguration.mimeType, localConfiguration2.mimeType)) {
            long j = localConfiguration.imageDurationMs;
            if (j == C.TIME_UNSET || Util.msToUs(j) == this.timelineDurationUs) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaItem mediaItem = getMediaItem();
        Assertions.checkNotNull(mediaItem.localConfiguration);
        Assertions.checkNotNull(mediaItem.localConfiguration.mimeType, "Externally loaded mediaItems require a MIME type.");
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        return new ExternallyLoadedMediaPeriod(localConfiguration.uri, localConfiguration.mimeType, this.externalLoader);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.timelineDurationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ExternallyLoadedMediaPeriod) mediaPeriod).releasePeriod();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private ExternallyLoadedMediaSource(MediaItem mediaItem, long j, ExternalLoader externalLoader) {
        this.mediaItem = mediaItem;
        this.timelineDurationUs = j;
        this.externalLoader = externalLoader;
    }
}
