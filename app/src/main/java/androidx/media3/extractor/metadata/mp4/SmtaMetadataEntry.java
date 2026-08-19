package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SmtaMetadataEntry implements Metadata.Entry {
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    public SmtaMetadataEntry(float f, int i) {
        this.captureFrameRate = f;
        this.svcTemporalLayerCount = i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount;
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
        return ((Float.valueOf(this.captureFrameRate).hashCode() + 527) * 31) + this.svcTemporalLayerCount;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.captureFrameRate + ", svcTemporalLayerCount=" + this.svcTemporalLayerCount;
    }
}
