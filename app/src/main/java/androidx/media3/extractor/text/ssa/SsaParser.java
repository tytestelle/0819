package androidx.media3.extractor.text.ssa;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SsaParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaParser";

    @Nullable
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private final ParsableByteArray parsableByteArray;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaParser() {
        this(null);
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return DEFAULT_MARGIN;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue createCue(String str, int i, @Nullable SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder zIndex = new Cue.Builder().setText(spannableString).setZIndex(i);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = ssaStyle.fontSize;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                zIndex.setTextSize(f3 / f2, 1);
            }
            boolean z = ssaStyle.bold;
            if (z && ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = overrides.alignment;
        if (i2 == -1) {
            i2 = ssaStyle != null ? ssaStyle.alignment : -1;
        }
        zIndex.setTextAlignment(toTextAlignment(i2)).setPositionAnchor(toPositionAnchor(i2)).setLineAnchor(toLineAnchor(i2));
        PointF pointF = overrides.position;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            zIndex.setPosition(computeDefaultLineOrPosition(zIndex.getPositionAnchor()));
            zIndex.setLine(computeDefaultLineOrPosition(zIndex.getLineAnchor()), 0);
        } else {
            zIndex.setPosition(pointF.x / f);
            zIndex.setLine(overrides.position.y / f2, 0);
        }
        return zIndex.build();
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) {
        int i;
        int i2;
        Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] strArrSplit = str.substring(9).split(",", ssaDialogueFormat.length);
        if (strArrSplit.length != ssaDialogueFormat.length) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        int i3 = ssaDialogueFormat.layerIndex;
        if (i3 != -1) {
            try {
                i = Integer.parseInt(strArrSplit[i3].trim());
            } catch (RuntimeException unused) {
                Log.w(TAG, "Fail to parse layer: " + strArrSplit[ssaDialogueFormat.layerIndex]);
                i = 0;
            }
        } else {
            i = 0;
        }
        long timecodeUs = parseTimecodeUs(strArrSplit[ssaDialogueFormat.startTimeIndex]);
        if (timecodeUs == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: ".concat(str));
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[ssaDialogueFormat.endTimeIndex]);
        if (timecodeUs2 == C.TIME_UNSET || timecodeUs2 <= timecodeUs) {
            Log.w(TAG, "Skipping invalid timing: ".concat(str));
            return;
        }
        Map<String, SsaStyle> map = this.styles;
        SsaStyle ssaStyle = (map == null || (i2 = ssaDialogueFormat.styleIndex) == -1) ? null : map.get(strArrSplit[i2].trim());
        String str2 = strArrSplit[ssaDialogueFormat.textIndex];
        Cue cueCreateCue = createCue(SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i, ssaStyle, SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2, Charset charset) {
        SsaDialogueFormat ssaDialogueFormatFromFormatLine = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormatFromFormatLine = SsaDialogueFormat.fromFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormatFromFormatLine == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    parseDialogueLine(line, ssaDialogueFormatFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91) {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strArrSplit[0].trim());
                strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
                if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.equals("playresx")) {
                    this.screenWidth = Float.parseFloat(strArrSplit[1].trim());
                } else if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.equals("playresy")) {
                    try {
                        this.screenHeight = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format formatFromFormatLine = null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91)) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                formatFromFormatLine = SsaStyle.Format.fromFormatLine(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (formatFromFormatLine == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: ".concat(line));
                } else {
                    SsaStyle ssaStyleFromStyleLine = SsaStyle.fromStyleLine(line, formatFromFormatLine);
                    if (ssaStyleFromStyleLine != null) {
                        linkedHashMap.put(ssaStyleFromStyleLine.name, ssaStyleFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 3600000000L);
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, "Unknown alignment: ", TAG);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, "Unknown alignment: ", TAG);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @Nullable
    private static Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, "Unknown alignment: ", TAG);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
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

    public SsaParser(@Nullable List<byte[]> list) {
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        this.parsableByteArray = new ParsableByteArray();
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        this.dialogueFormatFromInitializationData = (SsaDialogueFormat) Assertions.checkNotNull(SsaDialogueFormat.fromFormatLine(strFromUtf8Bytes));
        parseHeader(new ParsableByteArray(list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        if (!this.haveInitializationData) {
            parseHeader(this.parsableByteArray, charsetDetectUtfCharset);
        }
        parseEventBody(this.parsableByteArray, arrayList, arrayList2, charsetDetectUtfCharset);
        ArrayList arrayList3 = (outputOptions.startTimeUs == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List list = (List) arrayList.get(i3);
            if (!list.isEmpty() || i3 == 0) {
                if (i3 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList2.get(i3)).longValue();
                long jLongValue2 = ((Long) arrayList2.get(i3 + 1)).longValue();
                CuesWithTiming cuesWithTiming = new CuesWithTiming(list, jLongValue, jLongValue2 - jLongValue);
                long j = outputOptions.startTimeUs;
                if (j == C.TIME_UNSET || jLongValue2 >= j) {
                    consumer.accept(cuesWithTiming);
                } else if (arrayList3 != null) {
                    arrayList3.add(cuesWithTiming);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }
}
