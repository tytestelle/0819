package androidx.media3.extractor.text.ssa;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;

/* JADX INFO: loaded from: classes.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int layerIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i2, int i3, int i4, int i5, int i6) {
        this.layerIndex = i;
        this.startTimeIndex = i2;
        this.endTimeIndex = i3;
        this.styleIndex = i4;
        this.textIndex = i5;
        this.length = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strArrSplit[i6].trim());
            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
            switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
