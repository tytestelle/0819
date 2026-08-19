package androidx.media3.extractor.text.ttml;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
import com.google.common.collect.O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO;
import com.google.common.collect.O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 SINGLE_STYLE_VALUES = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 MARK_SHAPE_VALUES = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 MARK_FILL_VALUES = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 POSITION_VALUES = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str.trim());
        if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.isEmpty()) {
            return null;
        }
        return parseWords(O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf(TextUtils.split(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    private static TextEmphasis parseWords(O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0) {
        byte b;
        int i;
        String str;
        int iHashCode;
        String str2 = (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(POSITION_VALUES, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0)), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str2.hashCode();
        int i2 = -1;
        int i3 = 2;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b = 2;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(SINGLE_STYLE_VALUES, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0);
        if (!o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.isEmpty()) {
            String str3 = (String) new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000).next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i2 = 0;
            }
            return new TextEmphasis(i2, 0, i);
        }
        O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(MARK_FILL_VALUES, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0);
        O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(MARK_SHAPE_VALUES, o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0);
        if (o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.isEmpty() && o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.isEmpty()) {
            return new TextEmphasis(-1, 0, i);
        }
        String str4 = (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001), TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            int i4 = (iHashCode4 == 3417674 && str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) ? 2 : 1;
            str = (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002), TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 && str.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i2 = 0;
                    }
                } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i2 = 1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                i2 = 2;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
            }
            return new TextEmphasis(i3, i4, i);
        }
        str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        str = (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOOO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002), TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    i2 = 0;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i2 = 1;
            }
        } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            i2 = 2;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = 1;
            } else {
                i3 = 3;
            }
        }
        return new TextEmphasis(i3, i4, i);
    }
}
