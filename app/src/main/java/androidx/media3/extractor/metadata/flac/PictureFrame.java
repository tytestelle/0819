package androidx.media3.extractor.metadata.flac;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PictureFrame implements Metadata.Entry {
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.pictureType = i;
        this.mimeType = str;
        this.description = str2;
        this.width = i2;
        this.height = i3;
        this.depth = i4;
        this.colors = i5;
        this.pictureData = bArr;
    }

    public static PictureFrame fromPictureBlock(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(parsableByteArray.readString(parsableByteArray.readInt(), StandardCharsets.US_ASCII));
        String string = parsableByteArray.readString(parsableByteArray.readInt());
        int i2 = parsableByteArray.readInt();
        int i3 = parsableByteArray.readInt();
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        byte[] bArr = new byte[i6];
        parsableByteArray.readBytes(bArr, 0, i6);
        return new PictureFrame(i, strNormalizeMimeType, string, i2, i3, i4, i5, bArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData);
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
        return Arrays.hashCode(this.pictureData) + ((((((((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
