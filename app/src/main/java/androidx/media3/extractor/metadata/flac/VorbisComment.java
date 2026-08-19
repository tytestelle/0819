package androidx.media3.extractor.metadata.flac;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(str);
        this.value = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
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
        return this.value.hashCode() + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(527, 31, this.key);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.value);
                if (numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != null) {
                    builder.setTotalTrackCount(numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.value);
                if (numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 != null) {
                    builder.setTotalDiscCount(numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o3 = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.value);
                if (numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o3 != null) {
                    builder.setTrackNumber(numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o4 = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.value);
                if (numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o4 != null) {
                    builder.setDiscNumber(numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
