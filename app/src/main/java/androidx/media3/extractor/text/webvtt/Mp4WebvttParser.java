package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4WebvttParser implements SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i) {
        CharSequence cueText = null;
        Cue.Builder cueSettingsList = null;
        while (i > 0) {
            Assertions.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            int i4 = i2 - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i4);
            parsableByteArray.skipBytes(i4);
            i = (i - 8) - i4;
            if (i3 == TYPE_sttg) {
                cueSettingsList = WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i3 == TYPE_payl) {
                cueText = WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), Collections.emptyList());
            }
        }
        if (cueText == null) {
            cueText = "";
        }
        return cueSettingsList != null ? cueSettingsList.setText(cueText).build() : WebvttCueParser.newCueForText(cueText);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, bArr, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, bArr, i, i2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void reset() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i2 + i);
        this.parsableByteArray.setPosition(i);
        ArrayList arrayList = new ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i3 = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, i3 - 8));
            } else {
                this.parsableByteArray.skipBytes(i3 - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
