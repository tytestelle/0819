package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(TrackOutput trackOutput, DataReader dataReader, int i, boolean z) {
        return trackOutput.sampleData(dataReader, i, z, 0);
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i) {
        trackOutput.sampleData(parsableByteArray, i, 0);
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(TrackOutput trackOutput, long j) {
    }
}
