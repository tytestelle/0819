package androidx.media3.exoplayer.hls.playlist;

import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements HlsPlaylistTracker.Factory {
    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
    public final HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration);
    }
}
