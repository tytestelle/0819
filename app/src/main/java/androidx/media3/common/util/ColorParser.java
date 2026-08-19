package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-983041, map, "azure", -657956, "beige");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-6972, map, "bisque", -16777216, "black");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-38476, map, "hotpink", -3318692, "indianred");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-11861886, map, "indigo", -16, "ivory");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-989556, map, "khaki", -1644806, "lavender");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-8531, map, "navajowhite", -16777088, "navy");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-133658, map, "oldlace", -8355840, "olive");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-9728477, map, "olivedrab", -23296, "orange");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-47872, map, "orangered", -2461482, "orchid");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-3308225, map, "peru", -16181, "pink");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-2252579, map, "plum", -5185306, "powderblue");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-360334, map, "salmon", -744352, "sandybrown");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-13726889, map, "seagreen", -2578, "seashell");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-6270419, map, "sienna", -4144960, "silver");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-12156236, map, "steelblue", -2968436, "tan");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-16744320, map, "teal", -2572328, "thistle");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-40121, map, "tomato", 0, "transparent");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-12525360, map, "turquoise", -1146130, "violet");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-663885, map, "wheat", -1, "white");
        androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    @ColorInt
    private static int parseColorInternal(String str, boolean z) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i;
            }
            if (strReplace.length() == 9) {
                return ((i & 255) << 24) | (i >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return Color.argb(z ? (int) (Float.parseFloat((String) Assertions.checkNotNull(matcher.group(4))) * 255.0f) : Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(3)), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(3)), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    @ColorInt
    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    @ColorInt
    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }
}
