package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j, long j2) {
        StringBuilder sb = new StringBuilder("Unexpected sample timestamp: ");
        sb.append(Util.usToMs(j2));
        sb.append(" in chunk [");
        sb.append(mediaChunk.startTimeUs);
        sb.append(", ");
        super(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sb, mediaChunk.endTimeUs, "]"));
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
