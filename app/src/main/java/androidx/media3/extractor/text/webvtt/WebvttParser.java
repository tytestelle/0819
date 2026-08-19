package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WebvttParser implements SubtitleParser {
    private static final String COMMENT_START = "NOTE";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final String STYLE_START = "STYLE";
    private final ParsableByteArray parsableWebvttData = new ParsableByteArray();
    private final WebvttCssParser cssParser = new WebvttCssParser();

    private static int getNextEvent(ParsableByteArray parsableByteArray) {
        int i = -1;
        int position = 0;
        while (i == -1) {
            position = parsableByteArray.getPosition();
            String line = parsableByteArray.readLine();
            if (line == null) {
                i = 0;
            } else if (STYLE_START.equals(line)) {
                i = 2;
            } else {
                i = line.startsWith(COMMENT_START) ? 1 : 3;
            }
        }
        parsableByteArray.setPosition(position);
        return i;
    }

    private static void skipComment(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
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
        WebvttCueInfo cue;
        this.parsableWebvttData.reset(bArr, i2 + i);
        this.parsableWebvttData.setPosition(i);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            while (!TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    LegacySubtitleUtil.toCuesWithTiming(new WebvttSubtitle(arrayList2), outputOptions, consumer);
                    return;
                }
                if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (cue = WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
