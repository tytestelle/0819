package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsTrackMetadataEntry implements Metadata.Entry {

    @Nullable
    public final String groupId;

    @Nullable
    public final String name;
    public final List<VariantInfo> variantInfos;

    public static final class VariantInfo {

        @Nullable
        public final String audioGroupId;
        public final int averageBitrate;

        @Nullable
        public final String captionGroupId;
        public final int peakBitrate;

        @Nullable
        public final String subtitleGroupId;

        @Nullable
        public final String videoGroupId;

        public VariantInfo(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.averageBitrate = i;
            this.peakBitrate = i2;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.averageBitrate == variantInfo.averageBitrate && this.peakBitrate == variantInfo.peakBitrate && TextUtils.equals(this.videoGroupId, variantInfo.videoGroupId) && TextUtils.equals(this.audioGroupId, variantInfo.audioGroupId) && TextUtils.equals(this.subtitleGroupId, variantInfo.subtitleGroupId) && TextUtils.equals(this.captionGroupId, variantInfo.captionGroupId);
        }

        public int hashCode() {
            int i = ((this.averageBitrate * 31) + this.peakBitrate) * 31;
            String str = this.videoGroupId;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.audioGroupId;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.subtitleGroupId;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.captionGroupId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public HlsTrackMetadataEntry(@Nullable String str, @Nullable String str2, List<VariantInfo> list) {
        this.groupId = str;
        this.name = str2;
        this.variantInfos = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.groupId, hlsTrackMetadataEntry.groupId) && TextUtils.equals(this.name, hlsTrackMetadataEntry.name) && this.variantInfos.equals(hlsTrackMetadataEntry.variantInfos);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ Format getWrappedMetadataFormat() {
        return androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    public int hashCode() {
        String str = this.groupId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        return this.variantInfos.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    public String toString() {
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        if (this.groupId != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(this.groupId);
            sb2.append(", ");
            strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb2, this.name, "]");
        } else {
            strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = "";
        }
        sb.append(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        return sb.toString();
    }
}
