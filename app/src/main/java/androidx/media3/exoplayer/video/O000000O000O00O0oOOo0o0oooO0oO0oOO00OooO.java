package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements VideoFrameMetadataListener {
    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
        DefaultVideoSink.lambda$new$1(j, j2, format, mediaFormat);
    }
}
