package androidx.media3.container;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i, int i2, String str) {
        this.profile = i;
        this.level = i2;
        this.codecs = str;
    }

    @Nullable
    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(i < 10 ? ".0" : ".");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(i);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(unsignedByte2 < 10 ? ".0" : ".");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(unsignedByte2);
        return new DolbyVisionConfig(i, unsignedByte2, sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString());
    }
}
