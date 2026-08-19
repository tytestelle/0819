package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.UnstableApi;
import com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4TimestampData implements Metadata.Entry {
    public static final int TIMESCALE_UNSET = -1;
    private static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public Mp4TimestampData(long j, long j2) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ Format getWrappedMetadataFormat() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    public int hashCode() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.timescale) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.modificationTimestampSeconds) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.creationTimestampSeconds) + 527) * 31)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = j3;
    }
}
