package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.UnstableApi;
import com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MotionPhotoMetadata implements Metadata.Entry {
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.photoStartPosition = j;
        this.photoSize = j2;
        this.photoPresentationTimestampUs = j3;
        this.videoStartPosition = j4;
        this.videoSize = j5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize;
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
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.videoSize) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.videoStartPosition) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.photoPresentationTimestampUs) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.photoSize) + ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.photoStartPosition) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.photoStartPosition + ", photoSize=" + this.photoSize + ", photoPresentationTimestampUs=" + this.photoPresentationTimestampUs + ", videoStartPosition=" + this.videoStartPosition + ", videoSize=" + this.videoSize;
    }
}
