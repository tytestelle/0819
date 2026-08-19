package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public interface MediaSourceFactory extends MediaSource.Factory {

    @UnstableApi
    public static final MediaSourceFactory UNSUPPORTED = new MediaSourceFactory() { // from class: androidx.media3.exoplayer.source.MediaSourceFactory.1
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
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
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
        }
    };
}
