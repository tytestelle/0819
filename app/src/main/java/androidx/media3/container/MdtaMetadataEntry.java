package androidx.media3.container;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final byte AUXILIARY_TRACKS_SAMPLES_INTERLEAVED = 1;
    public static final byte AUXILIARY_TRACKS_SAMPLES_NOT_INTERLEAVED = 0;
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final String KEY_AUXILIARY_TRACKS_INTERLEAVED = "auxiliary.tracks.interleaved";
    public static final String KEY_AUXILIARY_TRACKS_LENGTH = "auxiliary.tracks.length";
    public static final String KEY_AUXILIARY_TRACKS_MAP = "auxiliary.tracks.map";
    public static final String KEY_AUXILIARY_TRACKS_OFFSET = "auxiliary.tracks.offset";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("track types = ");
        new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String.valueOf(',')).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, list.iterator());
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    private static void validateData(String str, byte[] bArr, int i) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                Assertions.checkArgument(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                Assertions.checkArgument(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                Assertions.checkArgument(z);
                break;
            case "auxiliary.tracks.map":
                Assertions.checkArgument(i == 0);
                break;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        Assertions.checkState(this.key.equals(KEY_AUXILIARY_TRACKS_MAP), "Metadata is not an auxiliary tracks map");
        byte b = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(this.value[i + 2]));
        }
        return arrayList;
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
        return ((((Arrays.hashCode(this.value) + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(527, 31, this.key)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, builder);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    public String toString() {
        String formattedValueForAuxiliaryTracksMap;
        int i = this.typeIndicator;
        if (i != 0) {
            if (i == 1) {
                formattedValueForAuxiliaryTracksMap = Util.fromUtf8Bytes(this.value);
            } else if (i == 23) {
                byte[] bArr = this.value;
                boolean z = bArr.length >= 4;
                int length = bArr.length;
                if (!z) {
                    throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("array too small: %s < %s", Integer.valueOf(length), 4));
                }
                formattedValueForAuxiliaryTracksMap = String.valueOf(Float.intBitsToFloat(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                byte[] bArr2 = this.value;
                boolean z2 = bArr2.length >= 4;
                int length2 = bArr2.length;
                if (!z2) {
                    throw new IllegalArgumentException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("array too small: %s < %s", Integer.valueOf(length2), 4));
                }
                formattedValueForAuxiliaryTracksMap = String.valueOf(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bArr2[0], bArr2[1], bArr2[2], bArr2[3]));
            } else if (i == 75) {
                formattedValueForAuxiliaryTracksMap = String.valueOf(this.value[0] & 255);
            } else if (i != 78) {
                formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
            } else {
                formattedValueForAuxiliaryTracksMap = String.valueOf(new ParsableByteArray(this.value).readUnsignedLongToLong());
            }
        } else if (this.key.equals(KEY_AUXILIARY_TRACKS_MAP)) {
            formattedValueForAuxiliaryTracksMap = getFormattedValueForAuxiliaryTracksMap(getAuxiliaryTrackTypesFromMap());
        } else {
            formattedValueForAuxiliaryTracksMap = Util.toHexString(this.value);
        }
        return "mdta: key=" + this.key + ", value=" + formattedValueForAuxiliaryTracksMap;
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        validateData(str, bArr, i2);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }
}
