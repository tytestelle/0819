package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DiscardingTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public final /* synthetic */ void durationUs(long j) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, j);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, dataReader, i, z);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, parsableByteArray, i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z, int i2) throws EOFException {
        int i3 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.skipBytes(i);
    }
}
