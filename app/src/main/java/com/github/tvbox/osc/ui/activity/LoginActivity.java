package com.github.tvbox.osc.ui.activity;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import com.bumptech.glide.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import com.github.tvbox.osc.base.C0013;
import com.github.tvbox.osc.base.C0014;
import com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.github.tvbox.osc.ui.dialog.C0016;
import com.github.tvbox.osc.ui.dialog.C0017;
import com.github.tvbox.osc.ui.dialog.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class LoginActivity extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Handler.Callback, Runnable {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static String f3011O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final Pattern f3012O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f5short;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public TextView f3013O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ProgressBar f3014O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final Handler f3015O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public RelativeLayout f3016O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3017O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    static {
        int iM573 = C0015.m573("ۢۡ");
        while (true) {
            switch (iM573) {
                case 56383:
                    f5short = new short[]{1449, 1442, 1489, 1466, 1447, 1459, 1515, 1447, 1516, 1483, 1447, 1484, 1495, 1521, 1468, 1527, 1526, 1489, 1466, 1447, 1459, 1515, 1447, 1516, 1483, 1447, 1484, 1495, 1521, 1458, 1527, 1443, 2913, 2926, 2916, 2930, 2927, 2921, 2916, 2862, 2928, 2917, 2930, 2925, 2921, 2931, 2931, 2921, 2927, 2926, 2862, 2898, 2885, 2881, 2884, 2911, 2885, 2904, 2900, 2885, 2898, 2894, 2881, 2892, 2911, 2899, 2900, 2895, 2898, 2881, 2887, 2885, 730, 725, 735, 713, 724, 722, 735, 661, 715, 734, 713, 726, 722, 712, 712, 722, 724, 725, 661, 748, 745, 754, 751, 766, 740, 766, 739, 751, 766, 745, 757, 762, 759, 740, 744, 751, 756, 745, 762, 764, 766, 1164, 1231, 1228, 1220, 1228, 875, 875, 875, 875, 863, 863, 886, 886, 858, 858, 895, 895, 865, 865, 1804, 1871, 1868, 1860, 1868, 1805, 1875, 1869, 1860, 22699, 24108, -29624, 27371, -30918, 29674, 21941, -32351, -3170, 24648, 23555, 22923, -31658, 28251, 26693, -3033, -32548, 28966, 24357, 2821, 2821, 2821, -29346, 22953, 21126, 22017, 24049, 25066, -28423, 18710, 18471, 28106, 22673, 18902, 29569, -1624, 23372, 20668, 27815, -25164, 26676, -25994, 3012, 3013, 29720, 22508, 21839, 27409, 493, 1648, 1584, 1585, 1587, 1595, 1594, 1591, 1599, 1139, 1121, 1126, 1138, 1133, 1121, 1139, 1115, 1134, 1143, 1127, 1131, 1120, 1121, 1066, 1134, 1143, 3232, 2507, 2483, -30245, 28536, -29851, 30188, -29769, 27924, -30455, 30592, 22886, 21168, 22637, 23169, -24990, 2944, 2944, 2944, 2944, 3028, 2996, 2996, 3028, 2973, 2973, 2601, 2623, 2614, 2623, 2617, 2606, 2650, 2585, 2578, 2587, 2580, 2580, 2591, 2582, 2597, 2577, 2591, 2563, 2650, 2620, 2600, 2613, 2615, 2650, 2591, 2570, 2589, 2597, 2590, 2587, 2574, 2587, 2650, 2605, 2610, 2623, 2600, 2623, 2650, 2590, 2587, 2574, 2591, 2650, 2630, 2650, 2629, 1950, 1931, 1948, 1956, 1951, 1946, 1935, 1946, 3293, 3288, 3277, 3292, 3225, 3205, 3225, 3206, 2492, 2473, 2494, 2438, 2493, 2488, 2477, 2488, 2551, 2483, 2474, 2486, 2487, 2234, 2223, 2232, 2220, 1578, 1573, 1577, 1569, 1563, 2171, 2104, 2107, 2099, 2107};
                    if (C0013.f2 + (C0015.f6 / (-8046)) <= 0) {
                        C0015.m570();
                    }
                    iM573 = C0014.m240("ۢۤۡ");
                    break;
                case 1749641:
                    iM573 = (C0013.f2 % C0014.f3) ^ 56343;
                    break;
                case 1749727:
                    f3012O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = C0014.m202(C0017.m693(m516(), 0, 32, 1418));
                    if (C0013.m114() >= 0) {
                    }
                    iM573 = C0016.m618("ۥۦۨ");
                    break;
                case 1752679:
                    return;
            }
        }
    }

    public LoginActivity() {
        int iM240 = C0014.m240("ۦۡ۠");
        while (true) {
            switch (iM240) {
                case 1746718:
                    return;
                case 1753477:
                    this.f3015O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new Handler(C0013.m190(), this);
                    iM240 = (C0017.f10 | (C0015.f6 + 7204)) < 0 ? C0017.m731("۟۠۟") : C0015.m573("ۨۧۦ");
                    break;
                case 1755591:
                    if (C0015.f6 / (C0016.f9 - 5690) == 0) {
                        iM240 = (C0014.f3 + C0015.f6) ^ (-1753779);
                    } else {
                        C0016.f9 = 5;
                        iM240 = C0013.m105("ۥ۟");
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m503() {
        String str;
        String str2;
        String str3;
        String str4;
        int iM618 = C0016.m618("ۥۣ۠");
        String str5 = null;
        String str6 = null;
        while (true) {
            switch (iM618) {
                case 56511:
                case 1750724:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 95;
                        str4 = "ۣۨۨ";
                        iM618 = C0014.m240(str4);
                    } else {
                        iM618 = (C0016.f9 | C0015.f6) + 1749760;
                    }
                    break;
                case 1749695:
                    break;
                case 1751680:
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        iM618 = C0016.m618("ۦۡۢ");
                    } else {
                        iM618 = C0017.m731("ۦۤۥ");
                    }
                    break;
                case 1752459:
                    iM618 = C0014.m240("ۣۥۦ");
                    break;
                case 1752578:
                    if (C0017.m717() > 0) {
                        str = "ۤۥۡ";
                        iM618 = C0016.m618(str);
                    } else if ((C0016.f9 | (C0013.f2 + 940)) <= 0) {
                        C0014.m245();
                        iM618 = C0014.m240("ۥ۟ۥ");
                    } else {
                        iM618 = (C0014.f3 * C0015.f6) + 1623632;
                    }
                    break;
                case 1752584:
                    if (C0016.f9 > 0) {
                        str4 = "ۣۢ۠";
                        str6 = str5;
                        iM618 = C0014.m240(str4);
                    } else {
                        str3 = "ۥۣۦ";
                        str2 = str5;
                        str6 = str5;
                        iM618 = C0014.m240(str3);
                        str5 = str2;
                    }
                    break;
                case 1753479:
                    str = "ۤۥۡ";
                    iM618 = C0016.m618(str);
                    break;
                case 1753575:
                    if (C0013.f2 <= 0) {
                        str6 = null;
                        iM618 = C0017.m731("ۦۤۥ");
                    } else {
                        iM618 = (C0015.f6 ^ C0016.f9) + 1752789;
                        str6 = null;
                    }
                    break;
                case 1754567:
                    str2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (C0016.f9 <= 0) {
                        iM618 = C0014.m240("ۥۣ۠");
                        str5 = str2;
                    } else {
                        str3 = "ۥۣۦ";
                        iM618 = C0014.m240(str3);
                        str5 = str2;
                    }
                    break;
                case 1754655:
                    str = C0015.f6 >= 0 ? "ۣۤۦ" : "ۥۣ۠";
                    iM618 = C0016.m618(str);
                    break;
                default:
                    break;
            }
            return str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO m504(Object obj) {
        String str;
        int iM618 = C0016.m618("ۢۥۨ");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        while (true) {
            switch (iM618) {
                case 56413:
                    if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM618 = C0013.m105("ۢۥ۠");
                    } else {
                        iM618 = (C0013.f2 % C0014.f3) + 1753381;
                    }
                    break;
                case 56474:
                    if ((C0017.f10 | (C0017.f10 + 9954)) >= 0) {
                        C0015.m570();
                        iM618 = C0016.m618("ۦۨۥ");
                    } else {
                        iM618 = (C0013.f2 | C0017.f10) ^ (-1755519);
                    }
                    break;
                case 1749757:
                case 1753421:
                    if (C0015.m570() <= 0) {
                        iM618 = C0017.m731("ۤۦۨ");
                    } else {
                        str = "ۤ۟ۦ";
                        iM618 = C0016.m618(str);
                    }
                    break;
                case 1749765:
                    if (C0014.m245() <= 0) {
                        if (C0017.f10 * (C0016.f9 + 9333) >= 0) {
                            C0016.f9 = 50;
                        } else {
                            iM618 = (C0016.f9 - C0013.f2) ^ (-1752634);
                        }
                    } else if ((C0017.f10 | (C0017.f10 + 9954)) >= 0) {
                        C0015.m570();
                        iM618 = C0016.m618("ۦۨۥ");
                    } else {
                        iM618 = (C0013.f2 | C0017.f10) ^ (-1755519);
                    }
                    break;
                case 1750785:
                    if (C0017.f10 * (C0017.f10 - 9119) <= 0) {
                        C0015.m570();
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM618 = C0014.m240("ۦۧۡ");
                    } else {
                        iM618 = 1750952 + (C0014.f3 ^ C0017.f10);
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    }
                    break;
                case 1751499:
                    break;
                case 1752675:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) obj).f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM618 = (C0015.f6 ^ (C0013.f2 + 140)) < 0 ? C0015.m573("ۣۧۥ") : C0014.m240("ۣ۠");
                    break;
                case 1753572:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 92;
                        str = "ۢۢ۠";
                        iM618 = C0016.m618(str);
                    } else {
                        iM618 = (C0014.f3 - C0015.f6) + 1749371;
                    }
                    break;
                case 1753664:
                    if (C0014.f3 % (C0013.f2 - 5790) >= 0) {
                        iM618 = C0013.m105("ۦۤۢ");
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                    } else {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                    }
                    break;
                case 1755407:
                    if (C0013.m114() >= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("ۥ۟");
                    } else {
                        iM618 = C0014.m240("ۦۧۡ");
                    }
                    break;
                default:
                    break;
            }
            return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x006d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m505() {
        String str;
        String str2;
        int iM105 = C0013.m105("ۥ۠ۨ");
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        while (true) {
            switch (iM105) {
                case 56385:
                    if (C0016.m574() >= 0) {
                        C0016.m574();
                        iM105 = C0014.m240("ۤۧۡ");
                    } else {
                        iM105 = (C0017.f10 / C0017.f10) ^ 1752492;
                    }
                    break;
                case 1746811:
                case 1753538:
                    iM105 = C0017.m731(C0016.f9 <= 0 ? "ۦۧۡ" : "ۢۢ۠");
                    break;
                case 1746966:
                    str = "ۢۢ۠";
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    iM105 = C0017.m731(str);
                    break;
                case 1749608:
                    if (C0016.m574() >= 0) {
                        C0013.f2 = 5;
                        iM105 = C0013.m105("ۡۡۦ");
                    } else {
                        iM105 = (C0015.f6 | C0017.f10) + 1754148;
                    }
                    break;
                case 1749664:
                    break;
                case 1749701:
                    if (C0017.f10 - (C0014.f3 / 5202) >= 0) {
                        C0014.m245();
                        iM105 = C0017.m731("ۥ۠ۨ");
                    } else {
                        iM105 = (C0014.f3 * C0017.f10) ^ 1621336;
                    }
                    break;
                case 1750539:
                    if ((C0014.f3 ^ (C0017.f10 / (-3707))) >= 0) {
                        str2 = "ۢۢ۠";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
                    } else {
                        str2 = "ۣۢۦ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
                    }
                    iM105 = C0016.m618(str2);
                    break;
                case 1750688:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    iM105 = (C0017.f10 * C0013.f2) + 2429166;
                    break;
                case 1752493:
                    if (C0017.m717() <= 0) {
                        str = C0016.f9 * (C0013.f2 ^ (-4912)) >= 0 ? "ۣۤۡ" : "ۣۤۡ";
                        iM105 = C0017.m731(str);
                    } else if (C0016.m574() >= 0) {
                        C0013.f2 = 5;
                        iM105 = C0013.m105("ۡۡۦ");
                    } else {
                        iM105 = (C0015.f6 | C0017.f10) + 1754148;
                    }
                    break;
                case 1753539:
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 4;
                        iM105 = C0014.m240("ۣ۟۟");
                    } else {
                        str2 = "ۣ۟ۧ";
                        iM105 = C0016.m618(str2);
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m506() {
        String str;
        String str2;
        String str3;
        String str4;
        int iM105 = C0013.m105("ۢۢۦ");
        String str5 = null;
        String str6 = null;
        while (true) {
            switch (iM105) {
                case 56350:
                    if ((C0014.f3 ^ (C0013.f2 + 5581)) >= 0) {
                        str4 = "ۢۢۦ";
                        str3 = str5;
                        str6 = str5;
                        iM105 = C0013.m105(str4);
                        str5 = str3;
                    } else {
                        iM105 = (C0016.f9 * C0016.f9) + 1096307;
                        str6 = str5;
                    }
                    break;
                case 1746913:
                    str3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1325O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    if (C0016.f9 % (C0013.f2 | 3856) <= 0) {
                        C0017.f10 = 42;
                        iM105 = C0013.m105("ۣۧۨ");
                        str5 = str3;
                    } else {
                        str4 = "ۡ۟";
                        iM105 = C0013.m105(str4);
                        str5 = str3;
                    }
                    break;
                case 1749670:
                    if (C0014.m245() < 0) {
                        iM105 = C0017.f10 - (C0016.f9 ^ 6695) >= 0 ? C0014.m240("ۨۥۡ") : (C0016.f9 + C0016.f9) ^ 1745331;
                    } else {
                        iM105 = (C0016.f9 * C0017.f10) + 2368746;
                    }
                    break;
                case 1750536:
                    iM105 = (C0016.f9 * C0017.f10) + 2368746;
                    break;
                case 1750788:
                    break;
                case 1752457:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        str = "ۨۦ";
                    } else {
                        str = "ۢۢۦ";
                    }
                    iM105 = C0013.m105(str);
                    break;
                case 1752639:
                case 1755469:
                    if (C0015.f6 % (C0013.f2 % (-828)) >= 0) {
                        C0014.f3 = 39;
                        str2 = "ۧ۟۠";
                    } else {
                        str2 = "ۣۧۨ";
                    }
                    iM105 = C0013.m105(str2);
                    break;
                case 1753608:
                    if (C0015.m570() <= 0) {
                        iM105 = C0014.m240("ۣۨۨ");
                        str6 = null;
                    } else {
                        iM105 = (C0015.f6 % C0017.f10) ^ (-1754893);
                        str6 = null;
                    }
                    break;
                case 1754476:
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        iM105 = C0017.m731("ۡ۟");
                    } else {
                        iM105 = (C0014.f3 + C0015.f6) ^ (-1752329);
                    }
                    break;
                case 1755524:
                    if ((C0013.f2 ^ (C0015.f6 | (-5735))) >= 0) {
                        C0017.m717();
                        iM105 = C0013.m105("ۧۢۧ");
                    } else {
                        iM105 = (C0015.f6 | C0017.f10) + 1754217;
                    }
                    break;
                default:
                    break;
            }
            return str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 m507(Object obj) {
        String str;
        String str2;
        String str3;
        int iM240 = C0014.m240("۟ۢۤ");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
        while (true) {
            switch (iM240) {
                case 56507:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        str = "ۡ۟ۡ";
                    } else {
                        str = "۟ۢۤ";
                    }
                    iM240 = C0017.m731(str);
                    break;
                case 56541:
                    str2 = "ۨۡ۠";
                    iM240 = C0016.m618(str2);
                    break;
                case 1746785:
                    if (C0016.m574() <= 0) {
                        iM240 = (C0017.f10 % C0015.f6) ^ (-1749617);
                    } else if (C0017.f10 % (C0016.f9 - 2803) >= 0) {
                        str3 = "ۦۣۣ";
                        iM240 = C0016.m618(str3);
                    } else {
                        iM240 = (C0014.f3 ^ C0017.f10) + 1750046;
                    }
                    break;
                case 1746874:
                    if (C0017.f10 % (C0016.f9 - 2803) >= 0) {
                        str3 = "ۦۣۣ";
                        iM240 = C0016.m618(str3);
                    } else {
                        iM240 = (C0014.f3 ^ C0017.f10) + 1750046;
                    }
                    break;
                case 1749732:
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Context) obj);
                    if (C0013.f2 <= 0) {
                        iM240 = C0013.m105("ۨ۟ۥ");
                    } else {
                        str = "ۦۦۡ";
                        iM240 = C0017.m731(str);
                    }
                    break;
                case 1750593:
                    iM240 = C0016.m618("ۨ۟ۥ");
                    break;
                case 1751746:
                    break;
                case 1753633:
                    if (C0014.m245() >= 0) {
                        iM240 = C0014.m240("ۦۦۡ");
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    } else {
                        str3 = "ۤۧۥ";
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM240 = C0016.m618(str3);
                    }
                    break;
                case 1753635:
                case 1755399:
                    if (C0013.f2 % (C0014.f3 * (-2531)) <= 0) {
                        C0017.f10 = 81;
                        str2 = "ۧۤۧ";
                        iM240 = C0016.m618(str2);
                    } else {
                        iM240 = (C0013.f2 * C0015.f6) + 2299846;
                    }
                    break;
                case 1755342:
                    str = "ۧۤ";
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
                    iM240 = C0017.m731(str);
                    break;
                default:
                    break;
            }
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m508() {
        String str = null;
        String str2 = null;
        int iM573 = C0015.m573("ۧۤ");
        while (true) {
            switch (iM573) {
                case 56541:
                    if (C0017.m717() <= 0) {
                        iM573 = (C0013.f2 / C0017.f10) + 1747899;
                    }
                    break;
                case 1747780:
                    if ((C0015.f6 | C0017.f10 | 6535) >= 0) {
                        C0017.f10 = 47;
                        str2 = null;
                        iM573 = C0017.m731("ۡۢۦ");
                    } else {
                        str2 = null;
                        iM573 = (C0015.f6 * C0014.f3) ^ 1783707;
                        continue;
                    }
                    break;
                case 1747898:
                    String str3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    iM573 = 1748709 + (C0015.f6 % C0015.f6);
                    str = str3;
                    continue;
                case 1748709:
                    str2 = str;
                    iM573 = C0016.m618(C0013.f2 <= 0 ? "ۧۨ۠" : "ۤ۟۟");
                    continue;
                case 1748800:
                case 1749733:
                    iM573 = (C0015.f6 | C0017.f10) ^ (-1751973);
                    continue;
                case 1751492:
                    return str2;
                case 1751554:
                    break;
                case 1753514:
                    iM573 = (C0013.f2 % C0017.f10) + 56399;
                    continue;
                case 1754655:
                    if (C0014.f3 - (C0015.f6 + 8535) >= 0) {
                        C0015.f6 = 66;
                    }
                    iM573 = C0014.m240("ۣ۠ۧ");
                    continue;
                case 1755372:
                    if (C0016.f9 / (C0013.f2 ^ (-9901)) != 0) {
                        C0017.m717();
                        iM573 = C0013.m105("ۧۤ");
                    } else {
                        iM573 = C0013.f2 + C0015.f6 + 1748509;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM573 = (C0014.f3 - C0015.f6) ^ 1755029;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static JsonObject m509() {
        String str;
        String str2;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
        int iM105 = C0013.m105("ۢۢۧ");
        while (true) {
            switch (iM105) {
                case 56353:
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        jsonObject2 = jsonObject;
                        iM105 = C0014.m240("ۤۧۦ");
                    } else {
                        jsonObject2 = jsonObject;
                        iM105 = (C0017.f10 / C0017.f10) + 1750654;
                    }
                    break;
                case 56421:
                    if ((C0013.f2 | C0014.f3 | 6533) >= 0) {
                        C0016.f9 = 11;
                        iM105 = C0016.m618("ۥۤۡ");
                    } else {
                        iM105 = (C0014.f3 ^ C0014.f3) + 1749671;
                    }
                    break;
                case 1747934:
                case 1750566:
                    if (C0017.f10 % (C0013.f2 * 6867) >= 0) {
                        C0017.m717();
                        str = "ۤۢۡ";
                        iM105 = C0014.m240(str);
                    } else {
                        iM105 = (C0013.f2 / C0017.f10) + 1750656;
                    }
                    break;
                case 1749671:
                    if (C0014.m245() > 0) {
                        iM105 = (C0015.f6 | C0017.f10) + 1752296;
                    } else if (C0013.f2 <= 0) {
                        C0016.f9 = 37;
                        str2 = "ۥ۟ۡ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = (C0016.f9 % C0015.f6) + 1751390;
                    }
                    break;
                case 1750655:
                    break;
                case 1751590:
                    JsonObject jsonObject3 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM105 = C0014.m240("ۡۢ");
                    jsonObject = jsonObject3;
                    break;
                case 1751687:
                    iM105 = C0013.f2 <= 0 ? C0015.m573("ۢۢۧ") : (C0016.f9 / C0015.f6) ^ (-1752456);
                    break;
                case 1751747:
                    iM105 = (C0015.f6 | C0017.f10) + 1752296;
                    break;
                case 1752455:
                    str2 = "ۨ۟ۥ";
                    jsonObject2 = null;
                    iM105 = C0015.m573(str2);
                    break;
                case 1755342:
                    str = "ۣۣ۠";
                    iM105 = C0014.m240(str);
                    break;
                default:
                    break;
            }
            return jsonObject2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m510(Object obj, Object obj2) {
        StringBuilder sb;
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = null;
        StringBuilder sb2 = null;
        int iM240 = C0014.m240("ۥۡۥ");
        while (true) {
            switch (iM240) {
                case 56417:
                    if (C0014.f3 * (C0016.f9 - 2866) <= 0) {
                        C0014.f3 = 58;
                        iM240 = C0014.m240("ۤۨۨ");
                    } else {
                        iM240 = (C0013.f2 | C0017.f10) + 1747051;
                    }
                    break;
                case 56572:
                    break;
                case 1746781:
                    sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000((String) obj, (String) obj2);
                    if (C0017.f10 >= 0) {
                    }
                    iM240 = C0014.m240("ۣۢۢ");
                    break;
                case 1746937:
                    iM240 = C0016.m618("ۣۧۦ");
                    break;
                case 1747688:
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        iM240 = C0017.m731("۠ۢۢ");
                    } else {
                        iM240 = C0014.f3 + C0014.f3 + 1755833;
                    }
                    break;
                case 1747744:
                case 1755403:
                    iM240 = (C0016.f9 * C0014.f3) + 230507;
                    break;
                case 1749696:
                    iM240 = (C0015.f6 ^ (C0014.f3 + 9741)) >= 0 ? C0015.m573("ۦۨ۠") : (C0017.f10 * C0017.f10) + 1177957;
                    break;
                case 1749697:
                    if (C0016.f9 * (C0015.f6 - 9744) >= 0) {
                        sb = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0013.m105("۟ۢ۠");
                        sb2 = sb;
                    } else {
                        sb2 = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0014.m240("ۨۤ");
                    }
                    break;
                case 1750786:
                    sb2 = null;
                    iM240 = (C0013.f2 - C0015.f6) + 1746179;
                    break;
                case 1752521:
                    if (C0014.m245() < 0) {
                        if (C0014.f3 >= 0) {
                            C0017.m717();
                            iM240 = C0015.m573("۠۠ۨ");
                        } else {
                            sb = sb2;
                            iM240 = C0013.m105("۟ۢ۠");
                            sb2 = sb;
                        }
                    } else if (C0014.f3 * (C0016.f9 - 2866) <= 0) {
                        C0014.f3 = 58;
                        iM240 = C0014.m240("ۤۨۨ");
                    } else {
                        iM240 = (C0013.f2 | C0017.f10) + 1747051;
                    }
                    break;
                default:
                    break;
            }
            return sb2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m511(Object obj) {
        String str;
        int iM573 = C0015.m573("ۧۤ۠");
        String asString = null;
        String str2 = null;
        while (true) {
            switch (iM573) {
                case 1747776:
                    if (C0015.f6 / (C0014.f3 + 2918) != 0) {
                        C0013.f2 = 14;
                        iM573 = C0016.m618("ۡ۟ۢ");
                    } else {
                        iM573 = C0013.m105("ۧۤ۠");
                    }
                    break;
                case 1747928:
                case 1752554:
                    iM573 = (C0014.f3 | C0015.f6) ^ (-1749735);
                    break;
                case 1748673:
                    if ((C0016.f9 | (C0017.f10 * (-3171))) <= 0) {
                        iM573 = C0014.m240("ۦۡۡ");
                        str2 = null;
                    } else {
                        iM573 = (C0014.f3 ^ C0015.f6) + 1752906;
                        str2 = null;
                    }
                    break;
                case 1749670:
                    break;
                case 1749858:
                    if (C0016.f9 + (C0017.f10 * (-8234)) <= 0) {
                        C0015.m570();
                        iM573 = C0016.m618("ۧۤ۠");
                        str2 = asString;
                    } else {
                        iM573 = (C0016.f9 + C0014.f3) ^ 1749236;
                        str2 = asString;
                    }
                    break;
                case 1753478:
                    iM573 = C0016.m618("ۡۡۡ");
                    break;
                case 1753600:
                    iM573 = C0013.f2 % (C0013.f2 * 8013) > 0 ? (C0014.f3 % C0017.f10) ^ (-1752381) : C0015.m573("ۢۨۨ");
                    break;
                case 1754377:
                    asString = ((JsonElement) obj).getAsString();
                    break;
                case 1754439:
                    if (C0016.f9 - (C0014.f3 * (-8878)) >= 0) {
                        C0017.m717();
                        str = "ۦۨ۟";
                    } else {
                        str = "ۦۡۡ";
                    }
                    iM573 = C0013.m105(str);
                    break;
                case 1754531:
                    if (C0016.m574() <= 0) {
                        str = "ۧ۟ۡ";
                    } else if (C0016.f9 - (C0014.f3 * (-8878)) >= 0) {
                        C0017.m717();
                        str = "ۦۨ۟";
                    } else {
                        str = "ۦۡۡ";
                    }
                    iM573 = C0013.m105(str);
                    break;
                default:
                    break;
            }
            return str2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m512(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        int iM105 = C0013.m105("ۦ۠۠");
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        String str4 = null;
        while (true) {
            switch (iM105) {
                case 56510:
                    if (C0013.f2 - (C0013.f2 - 9876) > 0) {
                        str = "ۣۤۤ";
                        str4 = strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM105 = C0013.m105(str);
                    } else {
                        C0016.m574();
                        str2 = "ۡۢۦ";
                        str3 = strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM105 = C0017.m731(str2);
                        str4 = str3;
                    }
                    break;
                case 1747680:
                case 1749602:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 91;
                        iM105 = C0013.m105("ۣۨۥ");
                    } else {
                        iM105 = C0014.m240("ۣۤۤ");
                    }
                    break;
                case 1748709:
                    if (C0015.f6 >= 0) {
                        C0015.f6 = 53;
                        iM105 = C0013.m105("۠۠۠");
                        str4 = null;
                    } else {
                        str4 = null;
                        iM105 = C0015.m573("ۨۦۥ");
                    }
                    break;
                case 1748739:
                    strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00((StringBuilder) obj, (String) obj2, (String) obj3);
                    if (C0014.f3 * (C0016.f9 ^ (-6640)) <= 0) {
                        C0017.f10 = 64;
                        iM105 = C0017.m731("ۣۣۤ");
                    } else {
                        iM105 = (C0015.f6 * C0013.f2) ^ (-557502);
                    }
                    break;
                case 1750690:
                    if (C0015.f6 < 0) {
                        str2 = "ۡۢۦ";
                        str3 = str4;
                        iM105 = C0017.m731(str2);
                        str4 = str3;
                    } else {
                        C0016.m574();
                        iM105 = C0015.m573("ۨۦۥ");
                    }
                    break;
                case 1750691:
                    break;
                case 1751530:
                    if (C0015.f6 % (C0014.f3 ^ (-9239)) >= 0) {
                        C0016.f9 = 3;
                        str = "ۦۣۧ";
                        iM105 = C0013.m105(str);
                    } else {
                        iM105 = (C0015.f6 % C0013.f2) + 1754055;
                    }
                    break;
                case 1753414:
                    iM105 = (C0014.f3 | C0016.f9) + 1750905;
                    break;
                case 1753446:
                    if (C0016.m574() >= 0) {
                        iM105 = (C0014.f3 | C0016.f9) + 1750905;
                    } else if (C0015.m570() <= 0) {
                        C0013.m114();
                        iM105 = C0016.m618("ۤ۠ۦ");
                    } else {
                        str = "ۣۡۥ";
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1755559:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        iM105 = C0015.m573("ۦۤ");
                    } else {
                        str = "ۢ۠۠";
                        iM105 = C0013.m105(str);
                    }
                    break;
                default:
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m513() {
        String str;
        int iM105 = C0013.m105("ۥۡۦ");
        while (true) {
            switch (iM105) {
                case 56538:
                    iM105 = C0016.m574() >= 0 ? C0015.m573("ۣ۟۠") : (C0017.f10 / C0014.f3) ^ 1747843;
                    break;
                case 1746812:
                    if (C0013.f2 + (C0017.f10 * 9912) >= 0) {
                        iM105 = C0015.m573("ۣۨۨ");
                    } else {
                        str = "ۧۡ";
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1747840:
                case 1753515:
                    iM105 = (C0014.f3 / C0016.f9) + 1754561;
                    break;
                case 1750721:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    iM105 = (C0014.f3 | C0014.f3) ^ (-1754392);
                    break;
                case 1752522:
                    if (C0015.m570() >= 0) {
                        if (C0013.f2 - (C0015.f6 % (-2566)) <= 0) {
                            C0016.m574();
                            iM105 = C0017.m731("۠ۥۥ");
                        } else {
                            iM105 = (C0013.f2 - C0015.f6) ^ 1749796;
                        }
                    } else if (C0013.f2 + (C0017.f10 * 9912) >= 0) {
                        iM105 = C0015.m573("ۣۨۨ");
                    } else {
                        str = "ۧۡ";
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1753539:
                    if (C0015.m570() <= 0) {
                        C0016.f9 = 25;
                        str = "ۦۦۦ";
                    } else {
                        str = "ۥۡۦ";
                    }
                    iM105 = C0013.m105(str);
                    break;
                case 1754561:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡۧۦۣ, reason: not valid java name and contains not printable characters */
    public static O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m514(Object obj, boolean z) {
        String str;
        String str2;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        int iM731 = C0017.m731("ۨۦۦ");
        while (true) {
            switch (iM731) {
                case 1747710:
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 95;
                        str = "ۨ۟۟";
                        iM731 = C0016.m618(str);
                    } else {
                        iM731 = C0013.m105("ۨۦۦ");
                    }
                    break;
                case 1747776:
                    iM731 = (C0013.f2 * C0016.f9) + 1025440;
                    break;
                case 1748615:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM731 = C0015.m573("ۦۧۦ");
                    break;
                case 1748678:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 66;
                        iM731 = C0015.m573("ۦۣۡ");
                    } else {
                        iM731 = C0013.f2 + C0016.f9 + 1747927;
                    }
                    break;
                case 1749636:
                    if (C0013.m114() >= 0) {
                        C0016.m574();
                        str2 = "ۧۢۥ";
                    } else {
                        str2 = "ۣۣ۠";
                    }
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
                    iM731 = C0013.m105(str2);
                    break;
                case 1753540:
                case 1754474:
                    if (C0017.f10 >= 0) {
                        iM731 = C0016.m618("ۣۡۧ");
                    } else {
                        str = "ۦۧۦ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1753669:
                    break;
                case 1754566:
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM731 = C0017.m731("ۧۨۨ");
                    } else {
                        iM731 = C0016.m618("ۡۡۦ");
                    }
                    break;
                case 1755559:
                    O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(z);
                    iM731 = 1749224 + (C0015.f6 % C0017.f10);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
                    break;
                case 1755560:
                    if (C0016.m574() <= 0) {
                        if (C0013.m114() >= 0) {
                            C0017.m717();
                        }
                        iM731 = C0013.m105("ۨۦۥ");
                    } else if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM731 = C0017.m731("ۧۨۨ");
                    } else {
                        iM731 = C0016.m618("ۡۡۦ");
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m515(Object obj) {
        String str;
        int iM618 = C0016.m618("۠۟ۦ");
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            switch (iM618) {
                case 56355:
                    if (C0016.m574() >= 0) {
                        C0014.m245();
                        iM618 = C0014.m240("ۡۤ");
                        obj3 = obj2;
                    } else {
                        iM618 = (C0014.f3 * C0017.f10) + 1584713;
                        obj3 = obj2;
                    }
                    break;
                case 1747655:
                    if (C0016.m574() >= 0) {
                        iM618 = C0017.f10 / (C0014.f3 * 2664) != 0 ? C0013.m105("ۣ۟ۤ") : (C0015.f6 | C0016.f9) + 1751597;
                    }
                    break;
                case 1747683:
                    break;
                case 1747837:
                    if (C0013.m114() >= 0) {
                        C0016.m574();
                        iM618 = C0013.m105("ۤ۠ۨ");
                        obj3 = null;
                    } else {
                        iM618 = (C0016.f9 | C0015.f6) ^ (-1755436);
                        obj3 = null;
                    }
                    break;
                case 1748646:
                    obj2 = ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) obj).f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    str = "ۡۤ";
                    iM618 = C0017.m731(str);
                    break;
                case 1751498:
                    if ((C0015.f6 ^ (C0014.f3 ^ 4084)) <= 0) {
                        C0016.f9 = 77;
                        str = "ۢۤۥ";
                    } else {
                        str = "۠۟ۦ";
                    }
                    iM618 = C0017.m731(str);
                    break;
                case 1751532:
                    iM618 = (C0016.f9 ^ (C0015.f6 | 5618)) >= 0 ? C0014.m240("ۡ۠ۥ") : C0016.m618("۠ۥۢ");
                    break;
                case 1753575:
                case 1755344:
                    iM618 = (C0017.f10 - C0016.f9) + 1749250;
                    break;
                case 1753695:
                    if (C0017.f10 / (C0014.f3 * 2664) != 0) {
                    }
                    break;
                case 1755499:
                    if (C0013.f2 * C0014.f3 * (-5652) <= 0) {
                        C0016.m574();
                        iM618 = C0013.m105("ۤ۟ۥ");
                    } else {
                        iM618 = (C0015.f6 / C0015.f6) + 1755343;
                    }
                    break;
                default:
                    break;
            }
            return obj3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۢۢۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m516() {
        String str;
        int iM731 = C0017.m731("ۤۧۡ");
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            switch (iM731) {
                case 1746724:
                    iM731 = C0017.f10 + C0016.f9 + 1748783;
                    break;
                case 1746942:
                case 1750664:
                    iM731 = C0013.f2 + C0013.f2 + 1751836;
                    break;
                case 1747718:
                    if ((C0013.f2 ^ (C0015.f6 - 5138)) >= 0) {
                        C0016.f9 = 87;
                        str = "ۧ۟ۨ";
                        iM731 = C0014.m240(str);
                    } else {
                        iM731 = C0017.m731("ۣۣۨ");
                    }
                    break;
                case 1748834:
                    if (C0016.f9 <= 0) {
                        C0013.m114();
                    }
                    iM731 = C0014.m240("ۤ۟ۧ");
                    break;
                case 1751500:
                    iM731 = C0017.m731("۠ۡۧ");
                    sArr2 = null;
                    break;
                case 1751617:
                    iM731 = (C0016.f9 % C0015.f6) + 1751542;
                    break;
                case 1751742:
                    if (C0014.m245() > 0) {
                        iM731 = C0017.f10 + C0016.f9 + 1748783;
                    } else if (C0017.f10 % (C0013.f2 ^ InputDeviceCompat.SOURCE_DPAD) >= 0) {
                        C0016.f9 = 60;
                        iM731 = C0015.m573("۠ۡۧ");
                    } else {
                        str = "ۧ۟ۨ";
                        iM731 = C0014.m240(str);
                    }
                    break;
                case 1753636:
                    break;
                case 1754384:
                    sArr = f5short;
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 74;
                        iM731 = C0016.m618("ۤۧۡ");
                    } else {
                        str = "ۨ۠ۡ";
                        iM731 = C0014.m240(str);
                    }
                    break;
                case 1755369:
                    iM731 = (C0013.f2 | C0013.f2) ^ 1753504;
                    sArr2 = sArr;
                    break;
                default:
                    break;
            }
            return sArr2;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m517(Object obj, Object obj2, Object obj3) {
        int iM240 = C0014.m240("۟۠ۥ");
        while (true) {
            switch (iM240) {
                case 1746724:
                    if (C0015.m570() < 0) {
                        break;
                    } else if (C0014.m245() >= 0) {
                        C0014.m245();
                        iM240 = C0015.m573("ۤۢ۟");
                    } else {
                        iM240 = (C0016.f9 | C0016.f9) ^ 1752407;
                    }
                    break;
                case 1748742:
                case 1753699:
                    iM240 = C0016.m618((C0013.f2 ^ (C0014.f3 + (-9204))) >= 0 ? "ۤ۟ۨ" : "ۤۢ۟");
                    continue;
                case 1749602:
                    if (C0016.m574() >= 0) {
                        C0014.m245();
                        iM240 = C0017.m731("ۣ۠۟");
                    } else {
                        iM240 = (C0014.f3 ^ C0015.f6) + 1746030;
                        continue;
                    }
                    break;
                case 1751585:
                    return;
                case 1752454:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۢ۠۠");
                    } else {
                        iM240 = (C0016.f9 | C0013.f2) + 1752758;
                        continue;
                    }
                    break;
                case 1752702:
                    ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) obj2, (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj3);
                    if ((C0017.f10 ^ (C0015.f6 * (-9888))) >= 0) {
                        C0014.f3 = 56;
                        iM240 = C0017.m731("۟۠ۥ");
                    } else {
                        iM240 = (C0013.f2 - C0016.f9) + 1751494;
                        continue;
                    }
                    break;
                case 1755405:
                    break;
                default:
                    continue;
            }
            if (C0015.f6 >= 0) {
                C0015.f6 = 19;
                iM240 = C0015.m573("ۣ۠۠");
            } else {
                iM240 = (C0014.f3 / C0017.f10) + 1752454;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m518(Object obj, Object obj2) {
        String str;
        String str2;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        int iM240 = C0014.m240("ۨۨ۠");
        while (true) {
            switch (iM240) {
                case 56416:
                    iM240 = (C0014.f3 / C0016.f9) ^ 1751625;
                    break;
                case 1750756:
                    if (C0015.f6 / (C0013.f2 - 816) >= 0) {
                        C0017.f10 = 75;
                    }
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM240 = C0016.m618("ۣۤ۟");
                    break;
                case 1751496:
                    break;
                case 1751625:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
                    iM240 = C0013.m105("ۦۡ۟");
                    break;
                case 1751681:
                case 1752490:
                    str = "ۣۤ۟";
                    iM240 = C0014.m240(str);
                    break;
                case 1753449:
                    O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) obj2);
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        iM240 = C0016.m618("ۧۡۨ");
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    } else {
                        iM240 = C0017.m731("ۣۦۧ");
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    }
                    break;
                case 1753476:
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM240 = C0014.m240("ۨۨ۠");
                    } else {
                        str = "ۥ۠ۥ";
                        iM240 = C0014.m240(str);
                    }
                    break;
                case 1753664:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        str = "۟ۨۧ";
                        iM240 = C0014.m240(str);
                    } else {
                        iM240 = (C0014.f3 | C0013.f2) ^ (-1755571);
                    }
                    break;
                case 1754446:
                    if (C0014.m245() >= 0) {
                        str2 = "ۨۤ۠";
                    } else {
                        str2 = "ۣۣ";
                    }
                    iM240 = C0015.m573(str2);
                    break;
                case 1755616:
                    if (C0016.m574() > 0) {
                        if (C0014.m245() >= 0) {
                            str2 = "ۨۤ۠";
                        } else {
                            str2 = "ۣۣ";
                        }
                        iM240 = C0015.m573(str2);
                    } else if (C0016.m574() >= 0) {
                        C0014.f3 = 88;
                        iM240 = C0017.m731("ۤۥۢ");
                    } else {
                        str = "ۦۣ۠";
                        iM240 = C0014.m240(str);
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m519(Object obj) {
        String str;
        String str2 = null;
        String str3 = null;
        int iM731 = C0017.m731("ۦۥۢ");
        while (true) {
            switch (iM731) {
                case 56353:
                    String strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000((String) obj);
                    if (C0014.f3 >= 0) {
                        C0014.m245();
                        iM731 = C0015.m573("ۡۢ");
                        str2 = strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    } else {
                        iM731 = 1747780 + (C0013.f2 % C0013.f2);
                        str2 = strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    }
                    break;
                case 1747780:
                    str3 = str2;
                    iM731 = C0013.m105(C0015.m570() <= 0 ? "ۧۢۦ" : "ۢۥۤ");
                    break;
                case 1748864:
                    iM731 = (C0013.f2 ^ (C0013.f2 / (-3131))) <= 0 ? C0014.m240("ۦۥۢ") : (C0016.f9 | C0013.f2) + 1754494;
                    break;
                case 1749761:
                    break;
                case 1750569:
                    iM731 = C0014.f3 + (C0015.f6 / (-903)) >= 0 ? C0013.m105("ۣ۠ۧ") : C0017.f10 + C0014.f3 + 1754578;
                    break;
                case 1751620:
                case 1755435:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        str = "ۤۦۢ";
                    } else {
                        str = "ۢۥۤ";
                    }
                    iM731 = C0017.m731(str);
                    break;
                case 1753603:
                    str = C0017.m717() < 0 ? "ۡۢ" : "ۣ۠ۦ";
                    iM731 = C0017.m731(str);
                    break;
                case 1753605:
                    if (C0013.m114() >= 0) {
                        C0015.m570();
                        str3 = null;
                        iM731 = C0015.m573("ۨ۠۟");
                    } else {
                        str3 = null;
                        iM731 = (C0013.f2 % C0017.f10) ^ 1748750;
                    }
                    break;
                case 1754475:
                    iM731 = (C0014.f3 * C0015.f6) + 1622668;
                    break;
                case 1755367:
                    iM731 = C0017.m731(str);
                    break;
                default:
                    break;
            }
            return str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m520(Object obj) {
        String str;
        String str2;
        String str3;
        int iM731 = C0017.m731("۠۠۟");
        while (true) {
            switch (iM731) {
                case 56482:
                case 1750751:
                    if (C0015.f6 * (C0017.f10 ^ 8847) <= 0) {
                        C0013.m114();
                        str3 = "ۡۦۤ";
                        iM731 = C0017.m731(str3);
                    } else {
                        iM731 = (C0013.f2 % C0014.f3) + 1748821;
                    }
                    break;
                case 1747679:
                    if (C0016.m574() < 0) {
                        str2 = "ۦۤۨ";
                    } else if (C0013.m114() >= 0) {
                        C0017.f10 = 22;
                        str2 = "ۣۧۨ";
                    } else {
                        iM731 = (C0016.f9 / C0017.f10) + 1747813;
                    }
                    iM731 = C0017.m731(str2);
                    break;
                case 1747812:
                    if (C0016.m574() >= 0) {
                        iM731 = C0014.m240("ۥۡ۠");
                    } else {
                        str3 = "ۣۦۢ";
                        iM731 = C0017.m731(str3);
                    }
                    break;
                case 1748826:
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 22;
                        str2 = "ۣۧۨ";
                        iM731 = C0017.m731(str2);
                    } else {
                        iM731 = (C0016.f9 / C0017.f10) + 1747813;
                    }
                    break;
                case 1748861:
                    break;
                case 1752516:
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 88;
                        str = "ۨ۟ۥ";
                    } else {
                        str = "۠۠۟";
                    }
                    iM731 = C0014.m240(str);
                    break;
                case 1753578:
                    ((com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj).show();
                    if (C0016.f9 - (C0013.f2 % (-5845)) >= 0) {
                        C0016.m574();
                        iM731 = C0016.m618("ۦۤۨ");
                    } else {
                        str2 = "ۣۡۧ";
                        iM731 = C0017.m731(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m521() {
        String str;
        HashMap map = null;
        HashMap map2 = null;
        int iM105 = C0013.m105("ۧۨ۟");
        while (true) {
            switch (iM105) {
                case 1747772:
                    return map2;
                case 1749605:
                    iM105 = (C0017.f10 + C0016.f9) ^ 1752592;
                    continue;
                case 1749664:
                    break;
                case 1750688:
                    iM105 = (C0017.f10 | C0014.f3) ^ (-1754429);
                    continue;
                case 1750692:
                    if (C0014.f3 >= 0) {
                        C0016.f9 = 47;
                        iM105 = C0015.m573("ۧۤۨ");
                    } else {
                        iM105 = (C0017.f10 % C0013.f2) + 1755412;
                        continue;
                    }
                    break;
                case 1750695:
                    if (C0015.f6 >= 0) {
                    }
                    map2 = map;
                    iM105 = C0014.m240("ۣ۠۟");
                    continue;
                case 1750755:
                    HashMap map3 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0014.f3 * (C0016.f9 ^ (-5553)) <= 0) {
                    }
                    iM105 = C0015.m573("ۣۤۨ");
                    map = map3;
                    continue;
                case 1752611:
                    map2 = null;
                    iM105 = (C0014.f3 % C0014.f3) + 1750688;
                    continue;
                case 1753578:
                case 1754600:
                    iM105 = (C0017.f10 ^ C0013.f2) ^ (-1747534);
                    continue;
                case 1754654:
                    if (C0015.m570() < 0) {
                        break;
                    } else if (C0014.f3 >= 0) {
                        C0017.f10 = 33;
                        iM105 = C0013.m105("ۣۤۥ");
                    } else {
                        iM105 = (C0014.f3 / C0017.f10) + 1750755;
                    }
                    break;
                default:
                    continue;
            }
            if (C0017.m717() >= 0) {
                C0013.m114();
                str = "۠ۡۡ";
            } else {
                str = "ۣۢ۠";
            }
            iM105 = C0014.m240(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۤۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m522(Object obj, boolean z, Object obj2) {
        String str;
        int iM573 = C0015.m573("۟ۥۧ");
        while (true) {
            switch (iM573) {
                case 1746881:
                    if (C0014.m245() > 0) {
                        iM573 = (C0013.f2 - C0016.f9) + 1755374;
                    } else if (C0017.f10 >= 0) {
                        iM573 = C0017.m731("ۤ۟ۨ");
                    } else {
                        str = "ۡۡۢ";
                        iM573 = C0016.m618(str);
                    }
                    break;
                case 1746944:
                    iM573 = C0014.m240("۟ۥۧ");
                    break;
                case 1747651:
                    iM573 = (C0013.f2 - C0016.f9) + 1755374;
                    break;
                case 1747934:
                case 1751501:
                    if ((C0017.f10 ^ (C0015.f6 % (-177))) <= 0) {
                        C0014.m245();
                        iM573 = C0017.m731("۠ۤۡ");
                    } else {
                        iM573 = (C0015.f6 * C0017.f10) + 1288044;
                    }
                    break;
                case 1748674:
                    ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(z, (View) obj2);
                    str = C0014.f3 - (C0013.f2 + (-4381)) <= 0 ? "۟ۧۨ" : "ۢۢۢ";
                    iM573 = C0016.m618(str);
                    break;
                case 1749666:
                    break;
                case 1755465:
                    iM573 = (C0017.f10 * C0015.f6) + 1286312;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static SQLiteDatabase m523(Object obj) {
        String str;
        SQLiteDatabase sQLiteDatabase = null;
        SQLiteDatabase sQLiteDatabase2 = null;
        int iM731 = C0017.m731("ۣۨ۠");
        while (true) {
            switch (iM731) {
                case 1746721:
                    iM731 = C0015.m573("۠۟ۤ");
                    continue;
                case 1747653:
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 21;
                        sQLiteDatabase2 = null;
                        iM731 = C0017.m731("ۧۨۥ");
                    } else {
                        sQLiteDatabase2 = null;
                        iM731 = (C0015.f6 | C0013.f2) + 1755465;
                        continue;
                    }
                    break;
                case 1750535:
                case 1754409:
                    if (C0017.f10 - (C0015.f6 % 5999) >= 0) {
                        C0016.f9 = 67;
                        iM731 = C0016.m618("ۥۦۤ");
                    } else {
                        iM731 = (C0013.f2 / C0013.f2) ^ 1755434;
                        continue;
                    }
                    break;
                case 1750538:
                    SQLiteDatabase writableDatabase = ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).getWritableDatabase();
                    if (C0017.f10 / (C0013.f2 - 3240) != 0) {
                        C0016.m574();
                        iM731 = C0016.m618("ۣۢۦ");
                        sQLiteDatabase = writableDatabase;
                    } else {
                        iM731 = 2436860 + (C0017.f10 * C0013.f2);
                        sQLiteDatabase = writableDatabase;
                        continue;
                    }
                    break;
                case 1750631:
                    break;
                case 1750811:
                    if (C0017.m717() <= 0) {
                        iM731 = C0013.m105("ۣ۟ۦ");
                    }
                    break;
                case 1754570:
                    if ((C0017.f10 ^ (C0016.f9 * (-8363))) <= 0) {
                        C0014.f3 = 91;
                        str = "ۧۢۨ";
                    } else {
                        str = "ۣۨ۠";
                    }
                    iM731 = C0017.m731(str);
                    continue;
                case 1754660:
                    if (C0014.f3 - (C0016.f9 ^ 52) >= 0) {
                        sQLiteDatabase2 = sQLiteDatabase;
                        iM731 = C0015.m573("۠۟ۤ");
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase;
                        iM731 = (C0015.f6 ^ C0013.f2) + 1755920;
                        continue;
                    }
                    break;
                case 1755368:
                    if (C0014.m245() >= 0) {
                        iM731 = C0015.m573("ۣۨ۠");
                    } else {
                        iM731 = (C0014.f3 - C0014.f3) + 1754409;
                        continue;
                    }
                    break;
                case 1755435:
                    return sQLiteDatabase2;
                default:
                    continue;
            }
            if (C0014.f3 / (C0016.f9 ^ 6763) != 0) {
                C0015.m570();
                iM731 = C0015.m573("ۤ۟ۢ");
            } else {
                iM731 = (C0014.f3 ^ C0017.f10) + 1746174;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۤۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO m524() {
        String str;
        String str2;
        int iM240 = C0014.m240("ۦۤ۠");
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        while (true) {
            switch (iM240) {
                case 56295:
                    if (C0015.f6 >= 0) {
                        C0016.f9 = 47;
                        str2 = "۠ۢ۠";
                    } else {
                        str2 = "ۦۤ۠";
                    }
                    iM240 = C0017.m731(str2);
                    break;
                case 1746940:
                    if (C0015.f6 + (C0014.f3 % (-7426)) >= 0) {
                        iM240 = C0015.m573("۟ۧۤ");
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    } else {
                        str = "ۥۦ۠";
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                        iM240 = C0013.m105(str);
                    }
                    break;
                case 1747778:
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    iM240 = C0013.m105("۟ۧۤ");
                    break;
                case 1748739:
                case 1749640:
                    iM240 = C0014.f3 + C0016.f9 + 1752077;
                    break;
                case 1749827:
                    iM240 = (C0014.f3 + C0016.f9) ^ 1751218;
                    break;
                case 1750692:
                    if (C0013.m114() >= 0) {
                        C0016.m574();
                        str = "ۧۨ";
                        iM240 = C0013.m105(str);
                    } else {
                        iM240 = (C0017.f10 * C0014.f3) ^ 1626073;
                    }
                    break;
                case 1751776:
                    iM240 = (C0017.f10 / C0015.f6) + 1753512;
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                    break;
                case 1752671:
                    break;
                case 1753513:
                    iM240 = C0014.m245() >= 0 ? C0015.m573("ۣۤۥ") : C0014.m240("ۢۡۧ");
                    break;
                case 1753570:
                    if (C0014.m245() <= 0) {
                        iM240 = (C0014.f3 ^ C0017.f10) + 1747231;
                    } else if (C0013.m114() >= 0) {
                        C0016.m574();
                        str = "ۧۨ";
                        iM240 = C0013.m105(str);
                    } else {
                        iM240 = (C0017.f10 * C0014.f3) ^ 1626073;
                    }
                    break;
                default:
                    break;
            }
            return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m525() {
        String str;
        String str2;
        String str3;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = null;
        int iM618 = C0016.m618("ۨۤۥ");
        while (true) {
            switch (iM618) {
                case 56386:
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3 = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2085O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    iM618 = (-1749185) ^ (C0015.f6 % C0016.f9);
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3;
                    break;
                case 1748832:
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = null;
                    iM618 = C0016.m618("ۣ۟ۦ");
                    break;
                case 1748864:
                    break;
                case 1749664:
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    iM618 = 1749013 + (C0017.f10 - C0015.f6);
                    break;
                case 1749671:
                case 1754475:
                    if (C0014.f3 >= 0) {
                        C0016.f9 = 52;
                        str = "ۥ۠ۦ";
                    } else {
                        str = "ۡۧۦ";
                    }
                    iM618 = C0015.m573(str);
                    break;
                case 1750538:
                    str2 = "ۢۢۧ";
                    iM618 = C0013.m105(str2);
                    break;
                case 1751593:
                    if (C0015.f6 * C0016.f9 * (-7036) >= 0) {
                        str = "ۨۢۢ";
                        iM618 = C0015.m573(str);
                    } else {
                        str3 = "ۥۢۢ";
                        iM618 = C0016.m618(str3);
                    }
                    break;
                case 1751777:
                    if (C0015.f6 / (C0017.f10 * 6692) != 0) {
                        C0014.m245();
                        str2 = "ۨۥ۠";
                    } else {
                        str2 = "ۨۤۥ";
                    }
                    iM618 = C0013.m105(str2);
                    break;
                case 1755432:
                    if (C0013.f2 > 0) {
                        str = "ۡۦۥ";
                        iM618 = C0015.m573(str);
                    } else {
                        iM618 = C0016.m618("ۣ۟ۦ");
                    }
                    break;
                case 1755497:
                    if (C0017.m717() < 0) {
                        str3 = "ۢۤ";
                    } else if (C0015.f6 * C0016.f9 * (-7036) >= 0) {
                        str = "ۨۢۢ";
                        iM618 = C0015.m573(str);
                    } else {
                        str3 = "ۥۢۢ";
                    }
                    iM618 = C0016.m618(str3);
                    break;
                default:
                    break;
            }
            return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m526() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        String str5 = null;
        int iM618 = C0016.m618("ۧۨۤ");
        while (true) {
            switch (iM618) {
                case 1746691:
                    if (C0015.f6 >= 0) {
                        C0017.m717();
                        iM618 = C0014.m240("ۣۨۨ");
                    } else {
                        iM618 = (C0014.f3 / C0014.f3) ^ 1754658;
                    }
                    break;
                case 1746971:
                    if (C0013.f2 > 0) {
                        str2 = "ۨۨ۠";
                        str5 = null;
                        iM618 = C0014.m240(str2);
                    } else {
                        C0016.f9 = 37;
                        str3 = null;
                        iM618 = C0016.m618("ۧ۟۟");
                        str5 = str3;
                    }
                    break;
                case 1747681:
                    if ((C0014.f3 | (C0015.f6 / (-8832))) >= 0) {
                        str5 = str4;
                        iM618 = C0016.m618("ۧۨۤ");
                    } else {
                        str3 = str4;
                        iM618 = C0016.m618("ۧ۟۟");
                        str5 = str3;
                    }
                    break;
                case 1748740:
                    if (C0013.f2 % (C0014.f3 * (-9634)) <= 0) {
                        C0017.m717();
                        iM618 = C0015.m573("ۣ۟۟");
                    } else {
                        str = "۟ۨۤ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1748796:
                    str4 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str = "ۣۧۡ";
                    } else {
                        str = "۠۠ۡ";
                    }
                    iM618 = C0014.m240(str);
                    break;
                case 1749792:
                case 1750781:
                    str2 = C0013.f2 / (C0017.f10 ^ (-5532)) != 0 ? "ۧۢۧ" : "ۧ۟۟";
                    iM618 = C0014.m240(str2);
                    break;
                case 1753445:
                    if (C0013.m114() >= 0) {
                        C0017.m717();
                        iM618 = C0015.m573("ۨۦۣ");
                    } else {
                        iM618 = (C0017.f10 ^ C0013.f2) ^ (-1748598);
                    }
                    break;
                case 1754375:
                    break;
                case 1754659:
                    if (C0015.m570() > 0) {
                        iM618 = (C0016.f9 | (C0015.f6 ^ (-8331))) <= 0 ? C0017.m731("ۣۡۦ") : (C0017.f10 / C0017.f10) + 1748795;
                    } else if (C0013.m114() >= 0) {
                        C0017.m717();
                        iM618 = C0015.m573("ۨۦۣ");
                    } else {
                        iM618 = (C0017.f10 ^ C0013.f2) ^ (-1748598);
                    }
                    break;
                case 1755616:
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        iM618 = C0014.m240("۟ۨۤ");
                    } else {
                        iM618 = (C0013.f2 - C0015.f6) + 1748283;
                    }
                    break;
                default:
                    break;
            }
            return str5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m527() {
        String str;
        int iM573 = C0015.m573("ۦۣ۟");
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (iM573) {
                case 56319:
                    iM573 = (C0017.f10 ^ C0014.f3) + 1746238;
                    break;
                case 56385:
                    if ((C0014.f3 ^ (C0017.f10 / (-2308))) >= 0) {
                        iM573 = C0014.m240("ۤۦۦ");
                        str3 = null;
                    } else {
                        str = "ۥۨۡ";
                        str3 = null;
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1746785:
                    str = "ۣۢ";
                    iM573 = C0017.m731(str);
                    break;
                case 1747905:
                    if (C0016.f9 - (C0013.f2 - 4446) <= 0) {
                        str = "ۦۣ۟";
                        str3 = str2;
                        iM573 = C0017.m731(str);
                    } else {
                        iM573 = (C0013.f2 | C0014.f3) + 1751799;
                        str3 = str2;
                    }
                    break;
                case 1749857:
                case 1755466:
                    iM573 = (C0013.f2 - C0016.f9) + 1751625;
                    break;
                case 1751586:
                    iM573 = (C0014.f3 + C0016.f9) ^ 1754000;
                    break;
                case 1751716:
                    break;
                case 1752460:
                    str2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    iM573 = (C0015.f6 % C0017.f10) + 1748514;
                    break;
                case 1752734:
                    iM573 = C0013.m105("ۣۨۥ");
                    break;
                case 1753538:
                    if (C0015.m570() > 0) {
                        if (C0015.f6 / (C0013.f2 * (-8906)) != 0) {
                        }
                        iM573 = C0013.m105("ۥ۟ۦ");
                    } else {
                        iM573 = (C0017.f10 ^ C0014.f3) + 1746238;
                    }
                    break;
                default:
                    break;
            }
            return str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m528() {
        HashMap map;
        String str;
        String str2;
        HashMap map2 = null;
        HashMap map3 = null;
        int iM573 = C0015.m573("ۣ۟ۧ");
        while (true) {
            switch (iM573) {
                case 56413:
                case 1752552:
                    if (C0013.f2 <= 0) {
                        C0016.m574();
                        str = "۠۟۠";
                    } else {
                        str = "ۦۤۢ";
                    }
                    iM573 = C0017.m731(str);
                    break;
                case 56416:
                    if (C0017.f10 + (C0013.f2 * 3425) <= 0) {
                        map3 = map2;
                        iM573 = C0015.m573("ۧۥۥ");
                    } else {
                        map3 = map2;
                        iM573 = (C0013.f2 - C0016.f9) + 1753481;
                    }
                    break;
                case 1746908:
                    iM573 = C0015.f6 >= 0 ? C0013.m105("ۣ۠ۥ") : C0016.m618("ۣ۠");
                    break;
                case 1746939:
                    if (C0016.m574() >= 0) {
                        if (C0015.f6 + (C0017.f10 | 287) >= 0) {
                            C0015.m570();
                            str2 = "ۦۣۢ";
                        } else {
                            str2 = "ۧۥۥ";
                        }
                        iM573 = C0016.m618(str2);
                    } else if (C0017.f10 >= 0) {
                        iM573 = C0017.m731("۟ۦۣ");
                    } else {
                        str = "ۣ۠ۥ";
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1750568:
                    map2 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    str = "ۣۣ";
                    iM573 = C0017.m731(str);
                    break;
                case 1752551:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        map = null;
                        iM573 = C0015.m573("ۥۢۤ");
                        map3 = map;
                    } else {
                        map3 = null;
                        iM573 = (C0013.f2 ^ C0017.f10) + 1747278;
                    }
                    break;
                case 1753418:
                    if (C0015.f6 + (C0017.f10 | 287) >= 0) {
                        C0015.m570();
                        str2 = "ۦۣۢ";
                    } else {
                        str2 = "ۧۥۥ";
                    }
                    iM573 = C0016.m618(str2);
                    break;
                case 1753572:
                    break;
                case 1754567:
                    map = map3;
                    iM573 = C0015.m573("ۥۢۤ");
                    map3 = map;
                    break;
                case 1755586:
                    iM573 = C0013.f2 + (C0014.f3 | 4466) <= 0 ? C0017.m731("ۡۦۤ") : (C0017.f10 / C0013.f2) + 1746939;
                    break;
                default:
                    break;
            }
            return map3;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m529(Object obj) {
        int iM618 = C0016.m618("ۨۢۡ");
        while (true) {
            switch (iM618) {
                case 56325:
                case 1746818:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        iM618 = C0015.m573("ۥۢ۟");
                    } else {
                        iM618 = (C0014.f3 / C0014.f3) + 1754437;
                        continue;
                    }
                    break;
                case 56537:
                    if (C0014.f3 + C0013.f2 + 6908 <= 0) {
                        iM618 = C0014.m240("ۨۢۡ");
                    } else {
                        iM618 = (C0017.f10 % C0014.f3) + 1746931;
                        continue;
                    }
                    break;
                case 1748893:
                    break;
                case 1754437:
                    ((O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                    if (C0016.f9 / (C0016.f9 + 6251) != 0) {
                        C0017.m717();
                        iM618 = C0014.m240("ۡۨۤ");
                    } else {
                        iM618 = (C0013.f2 - C0014.f3) + 1753323;
                        continue;
                    }
                    break;
                case 1754438:
                    return;
                case 1754476:
                    if (C0013.m114() >= 0) {
                        iM618 = C0016.m618("ۧۨ");
                    } else {
                        iM618 = (C0015.f6 - C0016.f9) ^ (-1756335);
                        continue;
                    }
                    break;
                case 1755431:
                    if (C0015.m570() <= 0) {
                        break;
                    } else if (C0013.f2 <= 0) {
                        C0017.f10 = 72;
                        iM618 = C0016.m618("ۧۢۧ");
                    } else {
                        iM618 = (C0015.f6 % C0015.f6) + 1754437;
                    }
                    break;
                default:
                    continue;
            }
            if (C0014.f3 >= 0) {
                C0016.f9 = 99;
                iM618 = C0013.m105("ۨۨۢ");
            } else {
                iM618 = (C0013.f2 - C0013.f2) ^ 56537;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m530(Object obj) {
        String str;
        String str2;
        int iM618 = C0016.m618("ۨۥ۠");
        while (true) {
            switch (iM618) {
                case 56296:
                    if (C0016.m574() >= 0) {
                        str2 = "ۣۢۥ";
                        iM618 = C0015.m573(str2);
                    } else {
                        iM618 = (C0015.f6 ^ C0014.f3) + 1752999;
                    }
                    break;
                case 1746693:
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO((Runnable) obj);
                    if ((C0013.f2 ^ (C0015.f6 + 7658)) <= 0) {
                        C0015.f6 = 71;
                    }
                    iM618 = C0014.m240("ۤۡۨ");
                    break;
                case 1747838:
                case 1753423:
                    str = "ۤۡۨ";
                    iM618 = C0016.m618(str);
                    break;
                case 1749663:
                    if (C0013.f2 * (C0016.f9 | (-7324)) >= 0) {
                        C0013.m114();
                        str = "ۦۣۨ";
                    } else {
                        str = "ۨۥ۠";
                    }
                    iM618 = C0016.m618(str);
                    break;
                case 1751563:
                    break;
                case 1753693:
                    str2 = "۠ۥۣ";
                    iM618 = C0015.m573(str2);
                    break;
                case 1755523:
                    if (C0017.m717() <= 0) {
                        if (C0017.f10 + (C0014.f3 * (-7630)) <= 0) {
                            C0014.f3 = 58;
                            iM618 = C0016.m618("۠ۥۣ");
                        } else {
                            str2 = "۟۟ۥ";
                            iM618 = C0015.m573(str2);
                        }
                    } else if (C0016.m574() >= 0) {
                        str2 = "ۣۢۥ";
                        iM618 = C0015.m573(str2);
                    } else {
                        iM618 = (C0015.f6 ^ C0014.f3) + 1752999;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m531() {
        int iM618 = C0016.m618("ۥۣۣ");
        while (true) {
            switch (iM618) {
                case 1747653:
                case 1752549:
                    if (C0016.f9 * (C0016.f9 ^ (-5568)) >= 0) {
                        iM618 = C0017.m731("ۥۧۤ");
                    } else {
                        iM618 = C0017.f10 + C0014.f3 + 1748815;
                        continue;
                    }
                    break;
                case 1747842:
                    return;
                case 1749607:
                    break;
                case 1749790:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    iM618 = (C0016.f9 / C0017.f10) + 1747843;
                    continue;
                case 1749857:
                    iM618 = (C0016.f9 * C0016.f9) + 1098100;
                    continue;
                case 1751625:
                    if (C0017.f10 >= 0) {
                        iM618 = C0017.m731("ۥۢۢ");
                    } else {
                        iM618 = C0013.m105("۠۟ۤ");
                        continue;
                    }
                    break;
                case 1752581:
                    if (C0016.m574() < 0) {
                        iM618 = C0016.f9 + C0016.f9 + 1748172;
                    }
                    break;
                default:
                    continue;
            }
            iM618 = C0017.f10 / (C0017.f10 * (-4593)) != 0 ? C0014.m240("ۤۦۦ") : C0015.m573("ۣۤۨ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦۥۤۧ, reason: not valid java name and contains not printable characters */
    public static JsonElement m532(Object obj, Object obj2) {
        JsonElement jsonElement;
        Object obj3;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        String str;
        JsonElement jsonElement4 = null;
        JsonElement jsonElement5 = null;
        int iM731 = C0017.m731("ۤۥۡ");
        while (true) {
            switch (iM731) {
                case 56536:
                case 1753663:
                    if ((C0015.f6 | (C0017.f10 + 6571)) >= 0) {
                        C0014.m245();
                        str = "ۧۢۤ";
                        iM731 = C0016.m618(str);
                    } else {
                        iM731 = (C0013.f2 % C0014.f3) + 1752577;
                    }
                    break;
                case 1746882:
                    if ((C0015.f6 | (C0017.f10 % (-3198))) >= 0) {
                        C0015.f6 = 43;
                        iM731 = C0016.m618("ۣۣۨ");
                    } else {
                        iM731 = (C0013.f2 + C0013.f2) ^ 1752463;
                    }
                    break;
                case 1747779:
                    jsonElement3 = ((JsonObject) obj).get((String) obj2);
                    if (C0014.f3 >= 0) {
                        C0014.m245();
                        obj3 = "ۣ۠ۦ";
                        jsonElement2 = jsonElement3;
                        jsonElement4 = jsonElement2;
                        iM731 = C0016.m618(obj3);
                    } else {
                        iM731 = (-1920098) ^ (C0016.f9 * C0015.f6);
                        jsonElement4 = jsonElement3;
                    }
                    break;
                case 1748741:
                    if (C0016.f9 % (C0013.f2 | (-1405)) <= 0) {
                        C0017.m717();
                        iM731 = C0015.m573("ۥ۠ۢ");
                    } else {
                        iM731 = (C0015.f6 / C0015.f6) + 1751679;
                    }
                    break;
                case 1751680:
                    if (C0015.m570() <= 0) {
                        if ((C0015.f6 | (C0017.f10 % (-3198))) >= 0) {
                            C0015.f6 = 43;
                            iM731 = C0016.m618("ۣۣۨ");
                        } else {
                            iM731 = (C0013.f2 + C0013.f2) ^ 1752463;
                        }
                    } else if (C0017.f10 % (C0017.f10 + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT) < 0) {
                        jsonElement3 = jsonElement4;
                        obj3 = "ۣ۠ۦ";
                        jsonElement2 = jsonElement3;
                        jsonElement4 = jsonElement2;
                        iM731 = C0016.m618(obj3);
                    } else {
                        C0013.f2 = 45;
                        jsonElement = jsonElement5;
                        iM731 = C0016.m618("ۥۤۨ");
                        jsonElement5 = jsonElement;
                    }
                    break;
                case 1751687:
                    if (C0015.f6 * (C0016.f9 - 147) >= 0) {
                        C0017.m717();
                        iM731 = C0015.m573("ۣۡۧ");
                    } else {
                        str = "ۥۡۧ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1752523:
                    jsonElement5 = null;
                    iM731 = (C0014.f3 | C0016.f9) + 1752919;
                    break;
                case 1752617:
                    break;
                case 1752704:
                    obj3 = "ۦۧ۠";
                    jsonElement2 = jsonElement4;
                    jsonElement4 = jsonElement2;
                    iM731 = C0016.m618(obj3);
                    break;
                case 1755369:
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                        jsonElement5 = jsonElement4;
                        iM731 = C0017.m731("ۥۡۧ");
                    } else {
                        jsonElement = jsonElement4;
                        iM731 = C0016.m618("ۥۤۨ");
                        jsonElement5 = jsonElement;
                    }
                    break;
                default:
                    break;
            }
            return jsonElement5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x005a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m533() {
        String str;
        String str2;
        int iM573 = C0015.m573("ۤۦۣ");
        while (true) {
            switch (iM573) {
                case 56358:
                    if ((C0014.f3 ^ (C0014.f3 | 83)) <= 0) {
                        C0017.m717();
                        iM573 = C0017.m731("ۤۦۣ");
                    } else {
                        str2 = "ۣۣۡ";
                        iM573 = C0017.m731(str2);
                    }
                    break;
                case 1746750:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                    if (C0014.f3 >= 0) {
                        C0016.f9 = 68;
                        iM573 = C0013.m105("ۡۧ");
                    } else {
                        str = "ۦۣۧ";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1746910:
                    if (C0015.m570() <= 0) {
                        C0013.f2 = 52;
                        iM573 = C0015.m573("ۡۦ۟");
                    } else {
                        iM573 = (C0015.f6 % C0014.f3) + 1751892;
                    }
                    break;
                case 1750597:
                case 1751532:
                    if (C0015.f6 / (C0016.f9 + 5588) != 0) {
                        C0017.f10 = 41;
                        str = "ۣ۠ۧ";
                        iM573 = C0013.m105(str);
                    } else {
                        iM573 = (C0015.f6 - C0015.f6) + 1753666;
                    }
                    break;
                case 1751500:
                    if ((C0015.f6 ^ (C0014.f3 / (-7611))) >= 0) {
                        C0013.f2 = 91;
                        str2 = "ۢ۠۠";
                        iM573 = C0017.m731(str2);
                    } else {
                        iM573 = (C0015.f6 * C0016.f9) + 549039;
                    }
                    break;
                case 1751713:
                    if (C0016.m574() <= 0) {
                        if (C0014.f3 * (C0013.f2 ^ 8511) >= 0) {
                            C0017.f10 = 72;
                            iM573 = C0013.m105("ۦۣۧ");
                        } else {
                            iM573 = (C0015.f6 ^ C0013.f2) + 1747235;
                        }
                    } else if ((C0015.f6 ^ (C0014.f3 / (-7611))) >= 0) {
                        C0013.f2 = 91;
                        str2 = "ۢ۠۠";
                        iM573 = C0017.m731(str2);
                    } else {
                        iM573 = (C0015.f6 * C0016.f9) + 549039;
                    }
                    break;
                case 1753666:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦۨۡۦ, reason: not valid java name and contains not printable characters */
    public static ReentrantLock m534(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        int iM240 = C0014.m240("ۤۨ");
        ReentrantLock reentrantLock = null;
        ReentrantLock reentrantLock2 = null;
        while (true) {
            switch (iM240) {
                case 56452:
                    if (C0016.m574() >= 0) {
                        str = "ۤۢۡ";
                        iM240 = C0015.m573(str);
                    } else if (C0016.f9 / (C0016.f9 * 2344) == 0) {
                        str4 = "۟ۨۦ";
                        iM240 = C0017.m731(str4);
                    } else {
                        str2 = "ۤۤۨ";
                        iM240 = C0015.m573(str2);
                    }
                    break;
                case 1746811:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        iM240 = C0017.m731("ۣۧۡ");
                        reentrantLock2 = reentrantLock;
                    } else {
                        str3 = "ۨۤۥ";
                        reentrantLock2 = reentrantLock;
                        iM240 = C0015.m573(str3);
                    }
                    break;
                case 1746973:
                    reentrantLock = ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM240 = C0016.m574() >= 0 ? C0016.m618("ۧ۠ۢ") : C0013.f2 + C0013.f2 + 1745011;
                    break;
                case 1749702:
                    if (C0014.f3 < 0) {
                        str = "ۤۤۨ";
                        iM240 = C0015.m573(str);
                    } else {
                        str4 = "ۨۤۥ";
                        iM240 = C0017.m731(str4);
                    }
                    break;
                case 1750781:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str3 = "۠ۦۤ";
                        iM240 = C0015.m573(str3);
                    } else {
                        iM240 = (C0013.f2 % C0014.f3) ^ 56492;
                    }
                    break;
                case 1751587:
                    if (C0013.f2 - (C0013.f2 / (-1600)) <= 0) {
                        C0016.m574();
                        iM240 = C0017.m731("ۨ۠ۢ");
                    } else {
                        str2 = "ۣۨۧ";
                        iM240 = C0015.m573(str2);
                    }
                    break;
                case 1751656:
                case 1755370:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str = "ۡۧۡ";
                        iM240 = C0015.m573(str);
                    } else {
                        iM240 = (C0015.f6 * C0017.f10) + 1293875;
                    }
                    break;
                case 1754409:
                    str = "ۤۢۡ";
                    iM240 = C0015.m573(str);
                    break;
                case 1755497:
                    break;
                case 1755588:
                    if (C0013.f2 <= 0) {
                    }
                    iM240 = C0014.m240("ۣۢۧ");
                    reentrantLock2 = null;
                    break;
                default:
                    break;
            }
            return reentrantLock2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static Point m535() {
        String str;
        Point point = null;
        Point point2 = null;
        int iM573 = C0015.m573("ۣۧۡ");
        while (true) {
            switch (iM573) {
                case 56326:
                case 1754659:
                    if (C0013.m114() >= 0) {
                        C0014.m245();
                        iM573 = C0017.m731("ۣ۠ۦ");
                    } else {
                        iM573 = C0013.m105("۠ۤۤ");
                    }
                    break;
                case 56389:
                    if ((C0014.f3 | (C0015.f6 * (-6068))) >= 0) {
                        C0016.f9 = 70;
                        point2 = point;
                        iM573 = C0013.m105("ۤۥۨ");
                    } else {
                        point2 = point;
                        iM573 = (C0015.f6 | C0014.f3) + 1747873;
                    }
                    break;
                case 1747808:
                    break;
                case 1749762:
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 40;
                        str = "ۦ۟ۦ";
                    } else {
                        str = "ۤۥۨ";
                    }
                    iM573 = C0013.m105(str);
                    break;
                case 1749853:
                    Point point3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1429O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0016.m574() >= 0) {
                    }
                    iM573 = C0015.m573("ۢۧ");
                    point = point3;
                    break;
                case 1751687:
                    if (C0014.m245() >= 0) {
                        C0014.f3 = 98;
                    }
                    iM573 = C0016.m618("ۣۧۦ");
                    break;
                case 1754408:
                    iM573 = (C0017.f10 / C0014.f3) + 1754438;
                    break;
                case 1754441:
                    if (C0016.m574() >= 0) {
                        if (C0013.m114() >= 0) {
                            C0013.f2 = 40;
                            str = "ۦ۟ۦ";
                        } else {
                            str = "ۤۥۨ";
                        }
                        iM573 = C0013.m105(str);
                    } else {
                        iM573 = C0013.m105("ۣۢۨ");
                    }
                    break;
                case 1754443:
                    if (C0013.f2 / (C0013.f2 | (-1327)) != 0) {
                        C0013.f2 = 48;
                        iM573 = C0013.m105("ۣۢۨ");
                    } else {
                        iM573 = (C0016.f9 | C0014.f3) + 56541;
                    }
                    break;
                case 1754506:
                    if (C0015.f6 * (C0013.f2 ^ 2068) >= 0) {
                        C0016.m574();
                        point2 = null;
                        iM573 = C0014.m240("ۧ۠ۡ");
                    } else {
                        point2 = null;
                        iM573 = (C0017.f10 ^ C0014.f3) ^ 1754984;
                    }
                    break;
                default:
                    break;
            }
            return point2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static LruCache m536(Object obj) {
        String str;
        String str2;
        String str3;
        LruCache lruCache;
        String str4;
        LruCache lruCache2 = null;
        LruCache lruCache3 = null;
        int iM618 = C0016.m618("ۧۧۢ");
        while (true) {
            switch (iM618) {
                case 1746750:
                    if (C0016.f9 > 0) {
                        str = "ۧۧۤ";
                        iM618 = C0014.m240(str);
                    } else {
                        C0017.m717();
                        lruCache = lruCache2;
                        iM618 = C0017.m731("ۣۢ۟");
                        lruCache2 = lruCache;
                    }
                    break;
                case 1747900:
                    if (C0014.f3 >= 0) {
                        str2 = "ۣۨ۠";
                        lruCache3 = null;
                        iM618 = C0014.m240(str2);
                    } else {
                        lruCache3 = null;
                        iM618 = (C0017.f10 / C0017.f10) + 1746749;
                    }
                    break;
                case 1749734:
                    lruCache = ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 63;
                        iM618 = C0016.m618("ۧۧۢ");
                        lruCache2 = lruCache;
                    } else {
                        iM618 = C0017.m731("ۣۢ۟");
                        lruCache2 = lruCache;
                    }
                    break;
                case 1750540:
                    if (C0016.f9 > 0) {
                        str4 = "ۣۨ۠";
                        iM618 = C0014.m240(str4);
                    } else {
                        C0016.f9 = 28;
                        str = "ۣۨۥ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1750602:
                case 1754628:
                    if (C0017.m717() < 0) {
                        str3 = "ۨۢ۟";
                        iM618 = C0013.m105(str3);
                    } else {
                        str4 = "ۥۦۥ";
                        iM618 = C0014.m240(str4);
                    }
                    break;
                case 1750624:
                    if (C0015.f6 - (C0017.f10 - 8833) <= 0) {
                        C0017.f10 = 10;
                        lruCache3 = lruCache2;
                        iM618 = C0017.m731("ۣ۠ۧ");
                    } else {
                        lruCache3 = lruCache2;
                        iM618 = (C0015.f6 + C0015.f6) ^ (-1756645);
                    }
                    break;
                case 1750811:
                    str = "ۣ۠ۧ";
                    iM618 = C0014.m240(str);
                    break;
                case 1751777:
                    if ((C0013.f2 ^ (C0013.f2 ^ 9280)) <= 0) {
                        C0014.m245();
                        str3 = "ۤۥۤ";
                        iM618 = C0013.m105(str3);
                    } else {
                        iM618 = (C0017.f10 / C0017.f10) + 1754625;
                    }
                    break;
                case 1754626:
                    if (C0014.m245() <= 0) {
                        if (C0016.f9 <= 0) {
                            C0015.m570();
                            iM618 = C0017.m731("ۢۤۨ");
                        } else {
                            str2 = "ۢۤۨ";
                            iM618 = C0014.m240(str2);
                        }
                    } else if (C0016.f9 > 0) {
                        C0016.f9 = 28;
                        str = "ۣۨۥ";
                        iM618 = C0014.m240(str);
                    } else {
                        str4 = "ۣۨ۠";
                        iM618 = C0014.m240(str4);
                    }
                    break;
                case 1755429:
                    break;
                default:
                    break;
            }
            return lruCache3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m537() {
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        int iM731 = C0017.m731("۠ۧۦ");
        while (true) {
            switch (iM731) {
                case 56327:
                case 1751687:
                    str = "ۣۣۧ";
                    iM731 = C0016.m618(str);
                    break;
                case 1747903:
                    if (C0014.m245() >= 0) {
                        if (C0016.f9 * C0016.f9 * 9426 <= 0) {
                            str2 = "ۧۦۡ";
                        } else {
                            str2 = "ۤۥۤ";
                        }
                        iM731 = C0014.m240(str2);
                    } else {
                        iM731 = C0015.m573(str);
                    }
                    break;
                case 1748895:
                    String str5 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1330O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                    if ((C0016.f9 | (C0017.f10 / (-3641))) <= 0) {
                        iM731 = C0016.m618("۠ۧ");
                        str3 = str5;
                    } else {
                        iM731 = 1750495 + (C0016.f9 % C0015.f6);
                        str3 = str5;
                    }
                    break;
                case 1749761:
                    str4 = null;
                    iM731 = C0014.m240(C0015.f6 * (C0015.f6 * (-3570)) >= 0 ? "ۨ۟ۦ" : "ۦۡۦ");
                    break;
                case 1750663:
                    break;
                case 1750695:
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 42;
                        str4 = str3;
                        iM731 = C0014.m240("ۥۨۢ");
                    } else {
                        str4 = str3;
                        iM731 = (C0013.f2 | C0016.f9) ^ 1750314;
                    }
                    break;
                case 1751683:
                    String str6 = C0015.f6 + (C0016.f9 ^ 9563) > 0 ? "ۢۥۤ" : "ۡۨۦ";
                    iM731 = C0015.m573(str6);
                    break;
                case 1752735:
                    if (C0016.f9 * C0016.f9 * 9426 <= 0) {
                        str2 = "ۧۦۡ";
                    } else {
                        str2 = "ۤۥۤ";
                    }
                    iM731 = C0014.m240(str2);
                    break;
                case 1753483:
                    if (C0014.f3 - (C0016.f9 * (-2581)) <= 0) {
                        C0015.f6 = 94;
                        iM731 = C0013.m105("ۣۤۨ");
                    } else {
                        iM731 = (C0014.f3 + C0014.f3) ^ (-1751851);
                    }
                    break;
                case 1755343:
                    if (C0015.f6 >= 0) {
                        str = "۟ۢۧ";
                        iM731 = C0016.m618(str);
                    } else {
                        iM731 = (C0014.f3 ^ C0017.f10) ^ 1747356;
                    }
                    break;
                default:
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String[] m538() {
        String str;
        String str2;
        int iM573 = C0015.m573("ۧۥ۟");
        String[] strArr = null;
        String[] strArr2 = null;
        while (true) {
            switch (iM573) {
                case 56320:
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 8;
                        iM573 = C0014.m240("۠۠");
                        strArr2 = null;
                    } else {
                        iM573 = (C0014.f3 ^ C0013.f2) + 1750638;
                        strArr2 = null;
                    }
                    break;
                case 1746752:
                    if (C0017.f10 >= 0) {
                        C0017.m717();
                        iM573 = C0017.m731("ۧۨۢ");
                    } else {
                        iM573 = (C0013.f2 * C0014.f3) + 1944319;
                    }
                    break;
                case 1747810:
                case 1748737:
                    if (C0015.f6 / (C0014.f3 - 9074) != 0) {
                        C0016.f9 = 16;
                        iM573 = C0013.m105("ۨۧ۟");
                    } else {
                        iM573 = (C0013.f2 / C0015.f6) + 1753482;
                    }
                    break;
                case 1749726:
                    if (C0016.f9 * (C0015.f6 - 893) >= 0) {
                        C0017.m717();
                        str = "ۡ۟ۡ";
                        iM573 = C0017.m731(str);
                    } else {
                        iM573 = (C0017.f10 / C0016.f9) ^ 1754561;
                    }
                    break;
                case 1749761:
                    strArr = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1333O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        str2 = "۟ۡۢ";
                        iM573 = C0013.m105(str2);
                    } else {
                        iM573 = (C0014.f3 - C0017.f10) + 1751166;
                    }
                    break;
                case 1749787:
                    if ((C0015.f6 | (C0016.f9 % (-9822))) >= 0) {
                        C0013.f2 = 72;
                        iM573 = C0016.m618("ۦۡۤ");
                    } else {
                        iM573 = C0013.m105("۠ۤۦ");
                    }
                    break;
                case 1750819:
                    str2 = "۠۠";
                    iM573 = C0013.m105(str2);
                    break;
                case 1751709:
                    if (C0016.f9 - (C0013.f2 - 1236) <= 0) {
                        C0015.m570();
                        iM573 = C0017.m731("ۢۤ۠");
                        strArr2 = strArr;
                    } else {
                        str = "ۦۡۤ";
                        strArr2 = strArr;
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1753481:
                    break;
                case 1754561:
                    if (C0017.m717() < 0) {
                        iM573 = C0013.f2 / (C0014.f3 + (-1727)) != 0 ? C0014.m240("ۤۦ۟") : (C0013.f2 / C0015.f6) + 1749762;
                    } else if (C0017.f10 >= 0) {
                        C0017.m717();
                        iM573 = C0017.m731("ۧۨۢ");
                    } else {
                        iM573 = (C0013.f2 * C0014.f3) + 1944319;
                    }
                    break;
                default:
                    break;
            }
            return strArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۠۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m539() {
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        int iM573 = C0015.m573("ۦۡ۟");
        while (true) {
            switch (iM573) {
                case 56384:
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 23;
                        iM573 = C0017.m731("۠ۧۢ");
                    } else {
                        str2 = "ۥۧۦ";
                        iM573 = C0013.m105(str2);
                    }
                    break;
                case 1746847:
                case 1747935:
                    if (C0017.f10 / (C0016.f9 | 5091) != 0) {
                        C0013.m114();
                        str2 = "ۣۥۧ";
                        iM573 = C0013.m105(str2);
                    } else {
                        iM573 = C0015.m573("ۣ۠ۤ");
                    }
                    break;
                case 1746966:
                    if (C0014.f3 * (C0013.f2 - 6362) <= 0) {
                        C0016.m574();
                        iM573 = C0017.m731("ۣۨ۟");
                    } else {
                        iM573 = C0015.m573("ۦۡ۟");
                    }
                    break;
                case 1747681:
                    iM573 = C0017.m731((C0015.f6 | (C0015.f6 ^ (-9895))) >= 0 ? "ۣۢۧ" : "۟ۤۤ");
                    break;
                case 1748617:
                    str = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    if (C0014.f3 / (C0017.f10 % 4358) != 0) {
                        C0017.m717();
                        iM573 = C0013.m105("ۢۢ");
                        str3 = str;
                    } else {
                        iM573 = C0015.m573("ۥ۟ۧ");
                        str3 = str;
                    }
                    break;
                case 1749822:
                    if (C0013.f2 / (C0017.f10 ^ (-2681)) != 0) {
                        C0015.f6 = 34;
                    }
                    str4 = null;
                    iM573 = C0016.m618("۠۠ۡ");
                    break;
                case 1750567:
                    break;
                case 1752461:
                    if (C0015.m570() <= 0) {
                        str4 = str3;
                        iM573 = C0017.m731("۠ۨۧ");
                    } else {
                        str4 = str3;
                        iM573 = C0015.m573("ۣ۠ۤ");
                    }
                    break;
                case 1752708:
                    if (C0017.m717() >= 0) {
                        str = str3;
                        iM573 = C0015.m573("ۥ۟ۧ");
                        str3 = str;
                    } else {
                        iM573 = (C0017.f10 % C0017.f10) + 1749822;
                    }
                    break;
                case 1753476:
                    if (C0014.m245() < 0) {
                        iM573 = C0014.f3 + (C0015.f6 ^ (-6015)) <= 0 ? C0015.m573("ۦۡ۟") : C0014.m240("ۡ۟ۧ");
                    } else if (C0017.m717() >= 0) {
                        C0014.f3 = 23;
                        iM573 = C0017.m731("۠ۧۢ");
                    } else {
                        str2 = "ۥۧۦ";
                        iM573 = C0013.m105(str2);
                    }
                    break;
                default:
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۡ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO m540() {
        String str;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int iM573 = C0015.m573("ۡ۠");
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = null;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = null;
        while (true) {
            switch (iM573) {
                case 56295:
                    iM573 = C0016.m618("ۥ۟ۤ");
                    break;
                case 56351:
                    if (C0015.m570() > 0) {
                        iM573 = (C0016.f9 ^ (C0016.f9 + (-324))) <= 0 ? C0017.m731("ۨ۠۠") : C0016.m618("ۨۥۨ");
                    } else {
                        iM573 = C0016.m618("ۥ۟ۤ");
                    }
                    break;
                case 1749788:
                case 1752487:
                    if (C0016.m574() >= 0) {
                        C0014.f3 = 7;
                        iM573 = C0014.m240("ۥۧۨ");
                    } else {
                        iM573 = (C0015.f6 | C0015.f6) + 1753346;
                    }
                    break;
                case 1751562:
                    if (C0013.f2 / (C0014.f3 + 8612) != 0) {
                        C0016.m574();
                        iM573 = C0016.m618("ۥ۟ۤ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = null;
                    } else {
                        str = "ۣۧۢ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
                        iM573 = C0017.m731(str);
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    }
                    break;
                case 1751680:
                    if ((C0017.f10 ^ (C0014.f3 / 805)) >= 0) {
                        C0013.m114();
                        iM573 = C0016.m618("ۣۧۢ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        iM573 = C0013.m105("ۥۨۤ");
                    }
                    break;
                case 1752458:
                    iM573 = (C0014.f3 % C0017.f10) + 1751777;
                    break;
                case 1752737:
                    break;
                case 1754502:
                    if (C0017.f10 - (C0015.f6 % 9346) >= 0) {
                        C0015.m570();
                        iM573 = C0013.m105("ۥۨۤ");
                    } else {
                        iM573 = (C0014.f3 ^ C0015.f6) + 1749094;
                    }
                    break;
                case 1755368:
                    if (C0017.f10 * (C0014.f3 ^ (-4833)) >= 0) {
                        C0016.m574();
                        str = "ۡۧۢ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3;
                        iM573 = C0017.m731(str);
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    } else {
                        iM573 = (C0015.f6 ^ C0016.f9) + 56681;
                    }
                    break;
                case 1755531:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f2863O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                    iM573 = (C0015.f6 / C0013.f2) + 1751680;
                    break;
                default:
                    break;
            }
            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static JsonArray m541(Object obj) {
        String str;
        JsonArray jsonArray = null;
        JsonArray jsonArray2 = null;
        int iM731 = C0017.m731("ۨۦ۠");
        while (true) {
            switch (iM731) {
                case 56544:
                    iM731 = C0016.f9 - (C0014.f3 / (-1816)) <= 0 ? C0015.m573("ۣۡۨ") : (C0016.f9 / C0014.f3) ^ (-1754440);
                    break;
                case 1746725:
                    if ((C0017.f10 | (C0017.f10 * 3542)) >= 0) {
                        jsonArray2 = null;
                        iM731 = C0016.m618("ۨۦ۠");
                    } else {
                        jsonArray2 = null;
                        iM731 = (C0015.f6 - C0016.f9) + 1754057;
                    }
                    break;
                case 1747930:
                case 1749730:
                    iM731 = C0016.f9 + C0013.f2 + 1746996;
                    break;
                case 1748705:
                    break;
                case 1751559:
                    if (C0017.m717() >= 0) {
                        jsonArray2 = jsonArray;
                        iM731 = C0015.m573("ۥۥ۟");
                    } else {
                        jsonArray2 = jsonArray;
                        iM731 = C0013.m105("ۡۢۢ");
                    }
                    break;
                case 1751748:
                    iM731 = (C0015.f6 ^ C0016.f9) + 1755884;
                    break;
                case 1752639:
                    str = "ۢۤۤ";
                    iM731 = C0016.m618(str);
                    break;
                case 1754437:
                    if (C0015.m570() <= 0) {
                    }
                    iM731 = C0016.m618("۟۠ۦ");
                    break;
                case 1755339:
                    JsonArray asJsonArray = ((JsonElement) obj).getAsJsonArray();
                    iM731 = C0014.m240("ۤۡۤ");
                    jsonArray = asJsonArray;
                    break;
                case 1755554:
                    if (C0017.m717() <= 0) {
                        if (C0016.f9 * (C0017.f10 - 9644) >= 0) {
                            str = "ۡۢۢ";
                            iM731 = C0016.m618(str);
                        } else {
                            iM731 = (C0014.f3 ^ C0017.f10) + 1754792;
                        }
                    } else if (C0016.f9 - (C0014.f3 / (-1816)) <= 0) {
                    }
                    break;
                default:
                    break;
            }
            return jsonArray2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m542(Object obj) {
        String str;
        String str2;
        int iM105 = C0013.m105("ۣۢ۟");
        while (true) {
            switch (iM105) {
                case 56293:
                    break;
                case 1746911:
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((File) obj);
                    if (C0013.f2 + (C0017.f10 ^ (-7526)) <= 0) {
                        iM105 = C0015.m573("ۣۣۥ");
                    } else {
                        str = "۟ۤ";
                        iM105 = C0016.m618(str);
                    }
                    break;
                case 1750624:
                    if (C0016.m574() >= 0) {
                        str = "ۣۣۥ";
                    } else if (C0013.f2 <= 0) {
                        str2 = "ۣۢ۟";
                        iM105 = C0015.m573(str2);
                    } else {
                        str = "۟ۦۦ";
                    }
                    iM105 = C0016.m618(str);
                    break;
                case 1750661:
                    str2 = "ۨۥۨ";
                    iM105 = C0015.m573(str2);
                    break;
                case 1751527:
                    iM105 = C0016.m618("ۣۢ۟");
                    break;
                case 1751746:
                    str = "ۣۣۥ";
                    iM105 = C0016.m618(str);
                    break;
                case 1754378:
                case 1755531:
                    if (C0015.f6 % (C0017.f10 ^ (-13)) >= 0) {
                        C0016.m574();
                        str = "ۦ۠۟";
                    } else {
                        str = "۟ۤ";
                    }
                    iM105 = C0016.m618(str);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m543() {
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        int iM731 = C0017.m731("ۦ۟ۤ");
        while (true) {
            switch (iM731) {
                case 56542:
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        str4 = str3;
                        iM731 = C0014.m240("۠ۨ۟");
                    } else {
                        str = str3;
                        iM731 = C0017.m731("۟ۢۥ");
                        str4 = str;
                    }
                    break;
                case 56572:
                    iM731 = (C0016.f9 % C0017.f10) + 1753368;
                    break;
                case 1746786:
                    break;
                case 1747927:
                    iM731 = C0017.f10 - (C0014.f3 + (-269)) >= 0 ? C0013.m105("ۦ۟ۤ") : C0014.m240("ۤۧۢ");
                    break;
                case 1748675:
                    break;
                case 1751554:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 88;
                        str = null;
                        iM731 = C0017.m731("۟ۢۥ");
                        str4 = str;
                    } else {
                        str4 = null;
                        iM731 = (C0013.f2 * C0017.f10) + 2430127;
                    }
                    break;
                case 1751743:
                case 1755406:
                    if (C0017.f10 - (C0013.f2 / (-4658)) >= 0) {
                        C0016.f9 = 29;
                        str2 = "ۦۤ";
                        iM731 = C0015.m573(str2);
                    } else {
                        iM731 = (C0014.f3 ^ C0017.f10) + 1746239;
                    }
                    break;
                case 1751745:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        iM731 = C0017.m731("ۧۥ");
                    } else {
                        str2 = "ۤۡ۟";
                        iM731 = C0015.m573(str2);
                    }
                    break;
                case 1753419:
                    iM731 = C0014.m245() < 0 ? (C0017.f10 | C0014.f3) + 1753723 : (C0014.f3 | C0013.f2) + 1751828;
                    break;
                case 1753510:
                    str3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1340O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                    iM731 = (C0014.f3 % C0017.f10) ^ (-56329);
                    break;
                default:
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۢۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m544(Object obj, Object obj2, int i) {
        String str;
        int iM618 = C0016.m618("ۦۨ");
        while (true) {
            switch (iM618) {
                case 56514:
                    if (C0016.m574() < 0) {
                        str = "ۧۡ۟";
                    } else if (C0014.f3 % (C0016.f9 + 8107) >= 0) {
                        C0014.f3 = 60;
                        str = "ۣۦۧ";
                    } else {
                        str = "ۧ۠ۡ";
                    }
                    iM618 = C0013.m105(str);
                    break;
                case 1748739:
                case 1751531:
                    iM618 = C0015.m573(C0017.f10 * (C0016.f9 / 4990) != 0 ? "ۨ۠ۦ" : "ۤ۠ۡ");
                    break;
                case 1749827:
                    if (C0014.f3 % (C0016.f9 + 8107) >= 0) {
                        C0014.f3 = 60;
                        str = "ۣۦۧ";
                    } else {
                        str = "ۧ۠ۡ";
                    }
                    iM618 = C0013.m105(str);
                    break;
                case 1750687:
                    iM618 = C0013.m105("ۦۨ");
                    break;
                case 1751525:
                    break;
                case 1754408:
                    if (C0015.m570() <= 0) {
                        C0016.f9 = 53;
                        iM618 = C0015.m573("ۧۡ۟");
                    } else {
                        iM618 = (C0015.f6 * C0015.f6) + 1380650;
                    }
                    break;
                case 1754437:
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O((Exception) obj, (StringBuilder) obj2, i);
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 86;
                        iM618 = C0015.m573("ۦۨ");
                    } else {
                        iM618 = (C0017.f10 % C0016.f9) ^ (-1751825);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۢۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m545() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        String str6 = null;
        int iM731 = C0017.m731("ۨۦ۠");
        while (true) {
            switch (iM731) {
                case 56508:
                case 1750687:
                    if (C0013.f2 + (C0014.f3 | (-8390)) <= 0) {
                        C0015.m570();
                        str4 = "ۣۡۤ";
                    } else {
                        str4 = "۠ۦۧ";
                    }
                    iM731 = C0014.m240(str4);
                    break;
                case 1747680:
                    iM731 = (C0016.f9 ^ (C0017.f10 + (-4840))) >= 0 ? C0013.m105("ۧۢ۟") : (C0015.f6 % C0014.f3) ^ (-1755409);
                    break;
                case 1747873:
                    break;
                case 1749850:
                    if (C0013.f2 <= 0) {
                        C0016.f9 = 83;
                        str3 = "ۡ۟۠";
                        iM731 = C0013.m105(str3);
                    } else {
                        iM731 = (C0015.f6 | C0013.f2) + 1754628;
                    }
                    break;
                case 1750779:
                    str = null;
                    iM731 = C0015.m573("ۨۨ۟");
                    str6 = str;
                    break;
                case 1754414:
                    if ((C0017.f10 ^ (C0017.f10 - 1309)) <= 0) {
                        C0015.f6 = 61;
                        str6 = str5;
                        iM731 = C0016.m618("ۧ۠ۧ");
                    } else {
                        str6 = str5;
                        iM731 = (C0015.f6 % C0014.f3) ^ (-1747732);
                    }
                    break;
                case 1754531:
                    if (C0016.f9 * C0013.f2 * (-4392) <= 0) {
                        str = str6;
                        iM731 = C0015.m573("ۨۨ۟");
                        str6 = str;
                    } else {
                        iM731 = (C0013.f2 ^ C0016.f9) + 1750606;
                    }
                    break;
                case 1755374:
                    str5 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if ((C0016.f9 ^ (C0013.f2 | (-5643))) < 0) {
                        str3 = "ۧ۠ۧ";
                        iM731 = C0013.m105(str3);
                    } else {
                        str2 = "ۣۤ۠";
                        iM731 = C0013.m105(str2);
                    }
                    break;
                case 1755554:
                    if (C0016.m574() < 0) {
                        iM731 = C0016.m618("ۨ۠ۦ");
                    } else if (C0013.f2 <= 0) {
                        C0016.f9 = 83;
                        str3 = "ۡ۟۠";
                        iM731 = C0013.m105(str3);
                    } else {
                        iM731 = (C0015.f6 | C0013.f2) + 1754628;
                    }
                    break;
                case 1755615:
                    if ((C0017.f10 ^ (C0014.f3 - 301)) <= 0) {
                        iM731 = C0016.m618("ۢۨ۠");
                    } else {
                        str2 = "ۦۢ";
                        iM731 = C0013.m105(str2);
                    }
                    break;
                default:
                    break;
            }
            return str6;
        }
    }

    /* JADX INFO: renamed from: ۢۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m546(Object obj, Object obj2) {
        String str;
        int iM105 = C0013.m105("ۣ۟۟");
        while (true) {
            switch (iM105) {
                case 1746811:
                    if (C0015.m570() <= 0) {
                        break;
                    } else if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("ۣۨ۟");
                    } else {
                        iM105 = (C0016.f9 - C0015.f6) ^ 1749642;
                    }
                    break;
                case 1746906:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        str = "ۦۤۧ";
                    } else {
                        str = "ۣ۟۟";
                    }
                    iM105 = C0014.m240(str);
                    continue;
                case 1750784:
                    ((LoginActivity) obj).requestPermissions((String[]) obj2, 7);
                    if ((C0013.f2 ^ (C0017.f10 % 4456)) >= 0) {
                        iM105 = C0017.m731("ۧۦۣ");
                    } else {
                        iM105 = (C0017.f10 - C0016.f9) + 1756907;
                        continue;
                    }
                    break;
                case 1751715:
                    iM105 = (C0013.f2 / C0016.f9) + 1755497;
                    continue;
                case 1754596:
                case 1755498:
                    if (C0017.f10 - (C0013.f2 % 7073) >= 0) {
                        C0016.f9 = 96;
                        iM105 = C0013.m105("ۣۡۧ");
                    } else {
                        iM105 = (C0016.f9 ^ C0016.f9) + 1755340;
                        continue;
                    }
                    break;
                case 1755340:
                    return;
                case 1755495:
                    break;
                default:
                    continue;
            }
            iM105 = (C0016.f9 / C0014.f3) + 1751718;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x003e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 m547(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int iM731 = C0017.m731("ۤۢۤ");
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        while (true) {
            switch (iM731) {
                case 56321:
                    if (C0013.m114() < 0) {
                        iM731 = C0013.m105("ۨۡۧ");
                    } else {
                        C0015.m570();
                        str = "ۥ۠";
                        iM731 = C0014.m240(str);
                    }
                    break;
                case 56448:
                    if (C0015.m570() <= 0) {
                        C0013.m114();
                        str3 = "ۣۣۢ";
                        iM731 = C0015.m573(str3);
                    } else {
                        iM731 = (C0014.f3 ^ C0015.f6) + 1750896;
                    }
                    break;
                case 56475:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj2);
                    if (C0014.f3 % (C0015.f6 / TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE) == 0) {
                        str2 = "ۣۧۤ";
                        iM731 = C0013.m105(str2);
                    } else {
                        C0015.f6 = 34;
                        iM731 = C0013.m105("ۨۡۧ");
                    }
                    break;
                case 1746690:
                    if (C0014.f3 * (C0017.f10 ^ 1391) <= 0) {
                        C0016.f9 = 38;
                        iM731 = C0013.m105("ۥۧۥ");
                    } else {
                        str = "ۨ۟ۥ";
                        iM731 = C0014.m240(str);
                    }
                    break;
                case 1748609:
                    break;
                case 1751590:
                    if (C0017.m717() <= 0) {
                        iM731 = C0013.f2 <= 0 ? C0016.m618("ۤۢۤ") : (C0016.f9 + C0015.f6) ^ 56403;
                    } else if (C0013.f2 > 0) {
                        C0016.f9 = 77;
                        str2 = "ۤۥۥ";
                        iM731 = C0013.m105(str2);
                    } else {
                        str3 = "۠ۡ";
                        iM731 = C0015.m573(str3);
                    }
                    break;
                case 1752707:
                    if (C0013.f2 > 0) {
                        str3 = "۠ۡ";
                        iM731 = C0015.m573(str3);
                    } else {
                        C0016.f9 = 77;
                        str2 = "ۤۥۥ";
                        iM731 = C0013.m105(str2);
                    }
                    break;
                case 1754504:
                    iM731 = (C0013.f2 / C0016.f9) + 1748608;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
                    break;
                case 1755342:
                case 1755556:
                    if (C0016.f9 <= 0) {
                        iM731 = C0017.m731("ۢۦ۠");
                    } else {
                        str3 = "ۡ۟۟";
                        iM731 = C0015.m573(str3);
                    }
                    break;
                case 1755406:
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        iM731 = C0016.m618("ۨۦۢ");
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                    } else {
                        iM731 = (C0015.f6 - C0013.f2) + 1748199;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                    }
                    break;
                default:
                    break;
            }
            return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 m548(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int iM105 = C0013.m105("۟۟ۦ");
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        while (true) {
            switch (iM105) {
                case 1746694:
                    if (C0016.m574() >= 0) {
                        if (C0013.m114() >= 0) {
                            C0017.f10 = 68;
                            iM105 = C0014.m240("ۦۢۨ");
                        } else {
                            iM105 = (C0014.f3 * C0014.f3) ^ 1704466;
                        }
                    } else if ((C0014.f3 | (C0015.f6 - 6032)) < 0) {
                        str2 = "ۣۨۧ";
                        iM105 = C0014.m240(str2);
                    } else {
                        str3 = "ۨۢۡ";
                        iM105 = C0013.m105(str3);
                    }
                    break;
                case 1747836:
                case 1753570:
                    str2 = C0013.m114() >= 0 ? "۠ۨۦ" : "ۨۢۡ";
                    iM105 = C0014.m240(str2);
                    break;
                case 1748769:
                    iM105 = C0013.m105("ۢۧۡ");
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                    break;
                case 1749663:
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 68;
                        iM105 = C0014.m240("ۦۢۨ");
                    } else {
                        iM105 = (C0014.f3 * C0014.f3) ^ 1704466;
                    }
                    break;
                case 1749820:
                    iM105 = C0016.m618("ۦۤ۠");
                    break;
                case 1750659:
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 50;
                    }
                    iM105 = C0014.m240("ۡۤۤ");
                    break;
                case 1750752:
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        str = "ۤۦۨ";
                    } else {
                        str = "۟۟ۦ";
                    }
                    iM105 = C0015.m573(str);
                    break;
                case 1752702:
                    str3 = "ۨۢۡ";
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
                    iM105 = C0013.m105(str3);
                    break;
                case 1755431:
                    break;
                case 1755468:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(obj2);
                    if (C0013.f2 <= 0) {
                        C0017.f10 = 73;
                        iM105 = C0014.m240("ۢۧۡ");
                    } else {
                        iM105 = C0016.f9 + C0014.f3 + 1752108;
                    }
                    break;
                default:
                    break;
            }
            return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Iterator m549(Object obj) {
        Iterator<JsonElement> it;
        String str;
        Iterator<JsonElement> it2 = null;
        Iterator<JsonElement> it3 = null;
        int iM240 = C0014.m240("ۦۣۡ");
        while (true) {
            switch (iM240) {
                case 56574:
                    iM240 = C0014.m240("ۦۣۡ");
                    break;
                case 1746724:
                    iM240 = C0016.f9 - (C0013.f2 * 3577) >= 0 ? C0017.m731("ۥ۠ۢ") : (C0016.f9 ^ C0017.f10) + 1749279;
                    break;
                case 1748613:
                case 1748796:
                    str = C0017.f10 >= 0 ? "ۦۨ۠" : "ۡۦۦ";
                    iM240 = C0015.m573(str);
                    break;
                case 1748678:
                    it2 = ((JsonArray) obj).iterator();
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 28;
                        iM240 = C0014.m240("ۡۥۦ");
                    } else {
                        iM240 = (C0013.f2 + C0015.f6) ^ 1751273;
                    }
                    break;
                case 1748802:
                    if (C0014.f3 % (C0014.f3 + 8473) >= 0) {
                        it3 = null;
                        iM240 = C0016.m618("ۡۥ۠");
                    } else {
                        it = null;
                        iM240 = C0016.m618("ۣۡۧ");
                        it3 = it;
                    }
                    break;
                case 1748833:
                    break;
                case 1748861:
                    if (C0015.f6 * (C0013.f2 + 9004) >= 0) {
                        C0016.m574();
                        iM240 = C0013.m105("ۣۡ۟");
                    } else {
                        iM240 = (C0014.f3 * C0014.f3) + 1702571;
                    }
                    break;
                case 1751498:
                    if (C0016.f9 * (C0016.f9 / (-5365)) == 0) {
                        str = "ۡۦۦ";
                        it3 = it2;
                        iM240 = C0015.m573(str);
                    } else {
                        C0014.f3 = 44;
                        it = it2;
                        iM240 = C0016.m618("ۣۡۧ");
                        it3 = it;
                    }
                    break;
                case 1752487:
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM240 = C0017.m731("ۦۡۤ");
                    } else {
                        str = "۟۠ۥ";
                        iM240 = C0015.m573(str);
                    }
                    break;
                case 1753480:
                    if (C0015.m570() >= 0) {
                        if (C0013.f2 / (C0015.f6 ^ 4135) != 0) {
                            C0016.f9 = 36;
                        }
                        iM240 = C0017.m731("ۡۡۦ");
                    } else if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM240 = C0017.m731("ۦۡۤ");
                    } else {
                        str = "۟۠ۥ";
                        iM240 = C0015.m573(str);
                    }
                    break;
                default:
                    break;
            }
            return it3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m550() {
        String str;
        String str2;
        String str3 = null;
        String str4 = null;
        int iM240 = C0014.m240("ۡۡۤ");
        while (true) {
            switch (iM240) {
                case 1747900:
                    break;
                case 1748676:
                    if (C0016.m574() >= 0) {
                        if (C0014.f3 - (C0016.f9 - 7082) <= 0) {
                            C0014.f3 = 93;
                            str2 = "ۦ۠۟";
                        } else {
                            str2 = "ۥۣ۟";
                        }
                        iM240 = C0016.m618(str2);
                    } else if (C0013.f2 * (C0017.f10 | (-9323)) >= 0) {
                        C0014.m245();
                        iM240 = C0017.m731("ۣ۠ۡ");
                    } else {
                        iM240 = (C0014.f3 / C0013.f2) ^ 1755343;
                    }
                    break;
                case 1748742:
                    iM240 = (C0014.f3 ^ C0017.f10) + 1748129;
                    break;
                case 1748772:
                    if (C0014.f3 - (C0016.f9 - 7082) <= 0) {
                        C0014.f3 = 93;
                        str2 = "ۦ۠۟";
                    } else {
                        str2 = "ۥۣ۟";
                    }
                    iM240 = C0016.m618(str2);
                    break;
                case 1749700:
                    iM240 = C0017.f10 + C0014.f3 + 1754669;
                    break;
                case 1749822:
                    if ((C0013.f2 | (C0016.f9 * (-1978))) < 0) {
                        str2 = "ۣ۠ۧ";
                        str4 = str3;
                        iM240 = C0016.m618(str2);
                    } else {
                        C0015.m570();
                        str = str3;
                        iM240 = C0016.m618("ۣۢۥ");
                        str4 = str;
                    }
                    break;
                case 1750564:
                    if (C0014.f3 - (C0014.f3 / 8929) >= 0) {
                        str4 = null;
                        iM240 = C0013.m105("ۡۤۧ");
                    } else {
                        str = null;
                        iM240 = C0016.m618("ۣۢۥ");
                        str4 = str;
                    }
                    break;
                case 1752577:
                    if (C0015.f6 * (C0016.f9 - 753) >= 0) {
                        C0015.f6 = 10;
                        iM240 = C0016.m618("ۡۡۤ");
                    } else {
                        iM240 = C0017.m731("ۣ۠ۡ");
                    }
                    break;
                case 1752702:
                case 1753696:
                    iM240 = (C0015.f6 + C0015.f6) ^ (-1748862);
                    break;
                case 1755343:
                    str3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                    iM240 = C0014.f3 * (C0016.f9 | (-2386)) <= 0 ? C0014.m240("ۣۡۨ") : (C0017.f10 - C0013.f2) + 1751480;
                    break;
                default:
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m551() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        String str5 = null;
        int iM240 = C0014.m240("ۨۧ۠");
        while (true) {
            switch (iM240) {
                case 56293:
                    if (C0017.f10 * (C0015.f6 % 7010) <= 0) {
                        C0015.m570();
                        iM240 = C0015.m573("ۨۧ۠");
                    }
                    break;
                case 1746970:
                case 1755559:
                    iM240 = C0014.m240(C0013.f2 <= 0 ? "ۨۢۤ" : "ۧ۟۟");
                    break;
                case 1748616:
                    if (C0017.m717() < 0) {
                        str3 = "ۥۣ۠";
                        str5 = null;
                        iM240 = C0013.m105(str3);
                    } else {
                        C0016.f9 = 75;
                        str2 = null;
                        iM240 = C0016.m618("ۧ۟۟");
                        str5 = str2;
                    }
                    break;
                case 1749670:
                    if (C0013.f2 <= 0) {
                        C0013.m114();
                        str3 = "ۥ۠۠";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0013.f2 % C0014.f3) + 56253;
                    }
                    break;
                case 1750693:
                    str4 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1337O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                    iM240 = C0015.m570() <= 0 ? C0014.m240("ۡ۟ۦ") : C0015.m573("ۥ۟۠");
                    break;
                case 1752454:
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 25;
                        str5 = str4;
                        iM240 = C0015.m573("ۥ۟۠");
                    } else {
                        str2 = str4;
                        iM240 = C0016.m618("ۧ۟۟");
                        str5 = str2;
                    }
                    break;
                case 1752488:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str = "ۨۦۥ";
                    } else {
                        str = "ۣ۟ۨ";
                    }
                    iM240 = C0014.m240(str);
                    break;
                case 1754375:
                    break;
                case 1754414:
                    iM240 = C0013.m105("ۨۧ۠");
                    break;
                case 1755585:
                    if (C0016.m574() < 0) {
                        if (C0015.f6 % (C0015.f6 + 4884) >= 0) {
                            iM240 = C0014.m240("ۣۤۦ");
                        } else {
                            str = "ۣۤۦ";
                            iM240 = C0014.m240(str);
                        }
                    } else if (C0013.f2 <= 0) {
                        C0013.m114();
                        str3 = "ۥ۠۠";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0013.f2 % C0014.f3) + 56253;
                    }
                    break;
                default:
                    break;
            }
            return str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m552(Object obj, Object obj2, Object obj3) {
        Object objFromJson;
        String str;
        String str2;
        int iM731 = C0017.m731("۟۟ۡ");
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            switch (iM731) {
                case 56572:
                    if (C0017.f10 >= 0) {
                        str = "ۤ۟۠";
                        objFromJson = obj4;
                        iM731 = C0013.m105(str);
                        obj4 = objFromJson;
                    } else {
                        iM731 = C0013.m105("۠ۤۤ");
                    }
                    break;
                case 1746689:
                    if (C0015.m570() >= 0) {
                        if ((C0013.f2 ^ (C0013.f2 % 9371)) != 0) {
                            C0013.f2 = 80;
                            iM731 = C0017.m731("۠ۧۤ");
                        } else {
                            iM731 = (C0014.f3 / C0016.f9) + 1752639;
                        }
                    } else if (C0017.f10 >= 0) {
                        str = "ۤ۟۠";
                        objFromJson = obj4;
                        iM731 = C0013.m105(str);
                        obj4 = objFromJson;
                    } else {
                        iM731 = C0013.m105("۠ۤۤ");
                    }
                    break;
                case 1746819:
                    if (C0014.f3 + (C0013.f2 ^ (-6118)) >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("ۨۤ");
                        obj5 = obj4;
                    } else {
                        str = "۠ۧۤ";
                        objFromJson = obj4;
                        obj5 = obj4;
                        iM731 = C0013.m105(str);
                        obj4 = objFromJson;
                    }
                    break;
                case 1747808:
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 84;
                        iM731 = C0013.m105("ۥۥ۟");
                    } else {
                        str2 = "ۡۡۢ";
                        iM731 = C0013.m105(str2);
                    }
                    break;
                case 1747901:
                    break;
                case 1748674:
                    if (C0017.f10 * (C0013.f2 / 7037) != 0) {
                        iM731 = C0013.m105("ۣ۟ۧ");
                        obj5 = null;
                    } else {
                        str2 = "ۥۤۡ";
                        obj5 = null;
                        iM731 = C0013.m105(str2);
                    }
                    break;
                case 1750536:
                case 1753602:
                    iM731 = C0016.m618("۠ۧۤ");
                    break;
                case 1750594:
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM731 = C0014.m240("ۣۦۥ");
                    } else {
                        iM731 = (C0014.f3 ^ C0014.f3) + 1746689;
                    }
                    break;
                case 1752610:
                    if (C0016.f9 + (C0013.f2 * (-8692)) >= 0) {
                        C0016.f9 = 50;
                        str2 = "ۡۡۢ";
                        iM731 = C0013.m105(str2);
                    } else {
                        iM731 = (C0015.f6 / C0016.f9) + 1753602;
                    }
                    break;
                case 1752639:
                    objFromJson = ((Gson) obj).fromJson((String) obj2, (Type) obj3);
                    str = "ۣ۟ۧ";
                    iM731 = C0013.m105(str);
                    obj4 = objFromJson;
                    break;
                default:
                    break;
            }
            return obj5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static String m553() {
        String str;
        String str2 = null;
        String str3 = null;
        int iM731 = C0017.m731("ۨۧ");
        while (true) {
            switch (iM731) {
                case 56575:
                    if (C0016.m574() <= 0) {
                        if ((C0013.f2 | (C0013.f2 % 767)) <= 0) {
                            C0016.f9 = 35;
                            iM731 = C0017.m731("ۡۨۦ");
                        } else {
                            iM731 = C0017.m731("ۨۡۦ");
                        }
                    } else if (C0015.f6 / (C0017.f10 - 9977) != 0) {
                        C0017.m717();
                        iM731 = C0013.m105("۟۟ۡ");
                    } else {
                        str = "ۡۨۦ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1746874:
                    iM731 = (C0015.f6 * C0013.f2) ^ (-557565);
                    break;
                case 1748895:
                    if (C0016.m574() >= 0) {
                        C0014.m245();
                        iM731 = C0014.m240("ۨۢۨ");
                    }
                    break;
                case 1749665:
                    if (C0013.f2 / (C0014.f3 | 5842) >= 0) {
                        C0017.m717();
                        str3 = str2;
                        iM731 = C0015.m573("ۨۡۦ");
                    } else {
                        str3 = str2;
                        iM731 = (C0016.f9 / C0016.f9) + 1752672;
                    }
                    break;
                case 1751562:
                    if (C0015.f6 / (C0017.f10 - 9977) != 0) {
                        C0017.m717();
                        iM731 = C0013.m105("۟۟ۡ");
                    } else {
                        str = "ۡۨۦ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1752673:
                    break;
                case 1753511:
                case 1754413:
                    if ((C0013.f2 | (C0013.f2 / 7696)) <= 0) {
                        C0016.m574();
                        str = "ۦۨ۠";
                    } else {
                        str = "ۥۦۢ";
                    }
                    iM731 = C0016.m618(str);
                    break;
                case 1754501:
                    str3 = null;
                    iM731 = (C0013.f2 - C0015.f6) + 1753929;
                    break;
                case 1755405:
                    String str4 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1327O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    if ((C0013.f2 | (C0016.f9 % 992)) <= 0) {
                        C0016.f9 = 13;
                    }
                    iM731 = C0017.m731("ۢۢۡ");
                    str2 = str4;
                    break;
                case 1755438:
                    iM731 = C0015.m570() <= 0 ? C0015.m573("ۣۧۡ") : C0014.m240("ۦۣۢ");
                    break;
                default:
                    break;
            }
            return str3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۤۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m554() {
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int iM240 = C0014.m240("ۣ۠ۤ");
        while (true) {
            switch (iM240) {
                case 56323:
                    iM240 = (C0014.f3 / C0017.f10) + 1755368;
                    break;
                case 56538:
                case 1753669:
                    if ((C0015.f6 | (C0017.f10 - 6791)) >= 0) {
                        C0014.m245();
                        str = "ۥ۠";
                        iM240 = C0017.m731(str);
                    } else {
                        iM240 = (C0017.f10 + C0016.f9) ^ 1749744;
                    }
                    break;
                case 1747807:
                    if (C0017.m717() > 0) {
                        iM240 = (C0014.f3 / C0017.f10) + 1755368;
                    } else if (C0013.f2 - (C0017.f10 % (-9423)) <= 0) {
                        iM240 = C0014.m240("ۨ۠۠");
                    } else {
                        str2 = "ۥۤۨ";
                        iM240 = C0017.m731(str2);
                    }
                    break;
                case 1749699:
                    break;
                case 1749726:
                    if (C0014.f3 >= 0) {
                        C0013.m114();
                        iM240 = C0016.m618("ۦۡ");
                    } else {
                        iM240 = (C0014.f3 | C0013.f2) + 1747890;
                    }
                    break;
                case 1751741:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        iM240 = C0015.m573("ۣۢۤ");
                    } else {
                        str = "ۧۡ";
                        iM240 = C0017.m731(str);
                    }
                    break;
                case 1752617:
                    arrayList2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1334O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    if (C0015.f6 * (C0015.f6 - 8736) <= 0) {
                        C0017.m717();
                        iM240 = C0017.m731("ۥۤۨ");
                    } else {
                        str = "ۨۢۤ";
                        iM240 = C0017.m731(str);
                    }
                    break;
                case 1755368:
                    if (C0015.f6 + (C0014.f3 * (-8022)) > 0) {
                        str = "ۨۦۥ";
                        iM240 = C0017.m731(str);
                    } else {
                        C0014.f3 = 59;
                        str2 = "ۨۢۤ";
                        iM240 = C0017.m731(str2);
                    }
                    break;
                case 1755434:
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 75;
                        arrayList = arrayList2;
                        iM240 = C0016.m618("ۤۧ۠");
                        arrayList3 = arrayList;
                    } else {
                        arrayList3 = arrayList2;
                        iM240 = (C0015.f6 * C0016.f9) ^ (-1914444);
                    }
                    break;
                case 1755559:
                    if (C0013.f2 * (C0017.f10 % 5134) >= 0) {
                        arrayList3 = null;
                        iM240 = C0013.m105("ۣ۠");
                    } else {
                        arrayList = null;
                        iM240 = C0016.m618("ۤۧ۠");
                        arrayList3 = arrayList;
                    }
                    break;
                default:
                    break;
            }
            return arrayList3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m555(Object obj) {
        String str;
        String str2;
        int iM573 = C0015.m573("ۣۨۦ");
        while (true) {
            switch (iM573) {
                case 56385:
                case 1747685:
                    if (C0013.m114() < 0) {
                        str2 = "ۣۦۨ";
                        iM573 = C0016.m618(str2);
                    } else {
                        str = "۟ۤۥ";
                        iM573 = C0016.m618(str);
                    }
                    break;
                case 1750630:
                    iM573 = (C0016.f9 | C0015.f6) ^ (-1752643);
                    break;
                case 1750757:
                    break;
                case 1750817:
                    if (C0016.m574() > 0) {
                        iM573 = (C0016.f9 | C0015.f6) ^ (-1752643);
                    } else if (C0015.f6 / (C0014.f3 % (-1417)) <= 0) {
                        iM573 = C0014.m240("ۣۢۥ");
                    } else {
                        str = "ۣۣۧ";
                        iM573 = C0016.m618(str);
                    }
                    break;
                case 1751618:
                    str2 = (C0016.f9 ^ (C0017.f10 | (-3087))) >= 0 ? "ۦۦۡ" : "ۣۨۦ";
                    iM573 = C0016.m618(str2);
                    break;
                case 1752578:
                    if (C0015.f6 >= 0) {
                        C0015.m570();
                        iM573 = C0017.m731("ۣۦۨ");
                    } else {
                        iM573 = (C0013.f2 | C0017.f10) ^ (-56369);
                    }
                    break;
                case 1754503:
                    ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    iM573 = C0013.f2 <= 0 ? C0014.m240("ۣۣۧ") : (C0016.f9 | C0017.f10) + 1750970;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۤۤۧۡ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m556() {
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Object obj;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str;
        String str2;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = null;
        int iM731 = C0017.m731("ۨۥ۠");
        while (true) {
            switch (iM731) {
                case 1747781:
                case 1751685:
                    if (C0016.f9 - (C0016.f9 ^ (-5418)) > 0) {
                        str = "ۧ۟ۥ";
                        iM731 = C0014.m240(str);
                    } else {
                        C0016.m574();
                        str2 = "۠ۤ۟";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                        iM731 = C0014.m240(str2);
                    }
                    break;
                case 1747901:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    if (C0016.f9 > 0) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM731 = C0017.m731("ۢۧۡ");
                    } else {
                        obj = "ۦۨۦ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM731 = C0014.m240(obj);
                    }
                    break;
                case 1748705:
                    iM731 = C0013.f2 - (C0016.f9 * 9554) >= 0 ? C0017.m731("ۦۢ") : (C0016.f9 ^ C0017.f10) + 1750118;
                    break;
                case 1749641:
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 97;
                        iM731 = C0015.m573("ۡۢۢ");
                    } else {
                        obj = "ۨۡۧ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM731 = C0014.m240(obj);
                    }
                    break;
                case 1749763:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM731 = C0017.m731("ۢۧۡ");
                    } else {
                        iM731 = (C0013.f2 | C0013.f2) + 1746881;
                    }
                    break;
                case 1749820:
                    if (C0017.f10 - (C0013.f2 ^ 7154) >= 0) {
                        C0015.f6 = 73;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
                        iM731 = C0017.m731("ۢۡۨ");
                    } else {
                        str2 = "ۧ۟ۥ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                        iM731 = C0014.m240(str2);
                    }
                    break;
                case 1753700:
                    if (C0017.m717() >= 0) {
                        C0016.f9 = 6;
                        str = "ۣۦۧ";
                    } else {
                        str = "ۨۥ۠";
                    }
                    iM731 = C0014.m240(str);
                    break;
                case 1754381:
                    break;
                case 1755406:
                    if (C0017.f10 - (C0015.f6 + 666) >= 0) {
                        C0016.m574();
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = null;
                        iM731 = C0013.m105("۠ۧۤ");
                    } else {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = null;
                        iM731 = (C0015.f6 | C0017.f10) + 1750372;
                    }
                    break;
                case 1755523:
                    if (C0017.m717() < 0) {
                        if (C0016.m574() >= 0) {
                            C0014.f3 = 15;
                            iM731 = C0016.m618("ۨۥ۠");
                        } else {
                            iM731 = C0013.m105("۠ۧۤ");
                        }
                    } else if (C0013.f2 - (C0016.f9 * 9554) >= 0) {
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static Context m557(Object obj) {
        String str;
        Context context;
        int iM573 = C0015.m573("ۡۨۢ");
        Context context2 = null;
        Context context3 = null;
        while (true) {
            switch (iM573) {
                case 56544:
                    if (C0016.f9 <= 0) {
                        C0017.m717();
                        iM573 = C0016.m618("ۧۨۤ");
                        context3 = context2;
                    } else {
                        str = "ۨۧۦ";
                        context = context2;
                        context3 = context2;
                        iM573 = C0014.m240(str);
                        context2 = context;
                    }
                    break;
                case 1746812:
                case 1755340:
                    iM573 = (C0014.f3 * C0014.f3) ^ 1736022;
                    break;
                case 1747717:
                    iM573 = (C0016.f9 ^ C0013.f2) ^ 1755233;
                    break;
                case 1748891:
                    if (C0016.m574() >= 0) {
                        iM573 = (C0016.f9 | C0014.f3) + 1749912;
                    } else if (C0016.m574() >= 0) {
                        C0016.f9 = 89;
                        iM573 = C0017.m731("ۣ۟۠");
                    } else {
                        iM573 = (C0016.f9 - C0013.f2) + 1753630;
                    }
                    break;
                case 1749697:
                    iM573 = (C0013.f2 / C0014.f3) ^ (-1754447);
                    break;
                case 1751687:
                    if (C0017.f10 + (C0017.f10 | 913) >= 0) {
                        C0017.f10 = 66;
                        str = "ۢۦۨ";
                        context = context2;
                        iM573 = C0014.m240(str);
                        context2 = context;
                    } else {
                        iM573 = (C0016.f9 ^ C0013.f2) + 1748718;
                    }
                    break;
                case 1753539:
                    context = ((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) obj).f2865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (C0015.f6 + (C0015.f6 * 1358) >= 0) {
                        iM573 = C0016.m618("ۣۢۢ");
                        context2 = context;
                    } else {
                        str = "ۧۧ";
                        iM573 = C0014.m240(str);
                        context2 = context;
                    }
                    break;
                case 1754445:
                    str = "۠ۡۦ";
                    context = context2;
                    context3 = null;
                    iM573 = C0014.m240(str);
                    context2 = context;
                    break;
                case 1754659:
                    iM573 = (C0016.f9 | C0014.f3) + 1749912;
                    break;
                case 1755591:
                    break;
                default:
                    break;
            }
            return context3;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static void m558() {
        String str;
        String str2;
        int iM731 = C0017.m731("۠۟۠");
        while (true) {
            switch (iM731) {
                case 56413:
                    return;
                case 1747649:
                    if (C0015.m570() >= 0) {
                        iM731 = (C0017.f10 % C0016.f9) + 1755415;
                    }
                    break;
                case 1749632:
                    break;
                case 1753419:
                case 1754500:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str2 = "ۨۢۧ";
                    } else {
                        str2 = "ۣ۠";
                    }
                    iM731 = C0016.m618(str2);
                    continue;
                case 1754508:
                    if (C0016.f9 - (C0015.f6 + 8146) >= 0) {
                        C0014.m245();
                        str = "ۣۣ۟";
                    } else {
                        str = "۠۟۠";
                    }
                    iM731 = C0016.m618(str);
                    continue;
                case 1754657:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                    if (C0014.m245() >= 0) {
                        iM731 = C0014.m240("ۢۡ۟");
                    } else {
                        iM731 = (C0015.f6 ^ C0015.f6) + 56413;
                        continue;
                    }
                    break;
                case 1755531:
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("ۦ۟ۤ");
                    } else {
                        iM731 = C0013.f2 + C0015.f6 + 1754209;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            if ((C0017.f10 | (C0016.f9 * 1361)) >= 0) {
                C0013.m114();
                iM731 = C0016.m618("ۤۢۢ");
            } else {
                iM731 = (C0014.f3 | C0017.f10) + 1755744;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۥۣۨ, reason: contains not printable characters */
    public static void m559() {
        String str;
        int iM618 = C0016.m618("۟ۥۥ");
        while (true) {
            switch (iM618) {
                case 56412:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                    iM618 = C0014.m245() >= 0 ? C0015.m573("ۢۧۢ") : (C0016.f9 - C0014.f3) + 1745916;
                    break;
                case 1746879:
                    if (C0015.m570() >= 0) {
                        if (C0017.f10 >= 0) {
                            C0013.f2 = 11;
                            iM618 = C0013.m105("ۨۦ۟");
                        } else {
                            iM618 = (C0013.f2 - C0017.f10) + 54754;
                        }
                    } else if (C0014.m245() >= 0) {
                        C0017.f10 = 80;
                        iM618 = C0017.m731("ۧۥۨ");
                    } else {
                        iM618 = (C0016.f9 / C0016.f9) + 1753545;
                    }
                    break;
                case 1746940:
                    break;
                case 1747839:
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 80;
                        iM618 = C0017.m731("ۧۥۨ");
                    } else {
                        iM618 = (C0016.f9 / C0016.f9) + 1753545;
                    }
                    break;
                case 1749572:
                case 1755553:
                    if (C0016.m574() >= 0) {
                        str = "ۧۦ۠";
                        iM618 = C0015.m573(str);
                    } else {
                        iM618 = (C0017.f10 / C0015.f6) ^ 1746941;
                    }
                    break;
                case 1749821:
                    iM618 = C0014.m240(C0017.m717() >= 0 ? "۠ۤۦ" : "۟ۥۥ");
                    break;
                case 1753546:
                    str = "ۢ۟ۡ";
                    iM618 = C0015.m573(str);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x005f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۥۤۨۧ, reason: contains not printable characters */
    public static Object m560(Object obj, Object obj2) {
        String str;
        String str2;
        Object obj3 = null;
        Object obj4 = null;
        int iM240 = C0014.m240("ۤۤۡ");
        while (true) {
            switch (iM240) {
                case 56418:
                case 1748610:
                    iM240 = (C0014.f3 | C0014.f3) + 1755615;
                    break;
                case 56478:
                    str = "ۨۢۥ";
                    obj4 = null;
                    iM240 = C0016.m618(str);
                    break;
                case 1746695:
                    iM240 = C0017.m731("ۥۣ");
                    break;
                case 1751649:
                    if (C0016.m574() < 0) {
                        if (C0016.f9 <= 0) {
                            C0016.m574();
                            iM240 = C0017.m731("ۡ۟۠");
                        } else {
                            str2 = "ۨۡۧ";
                            iM240 = C0015.m573(str2);
                        }
                    } else if (C0015.m570() <= 0) {
                        C0015.f6 = 22;
                        iM240 = C0016.m618("۠ۢۢ");
                    } else {
                        str = "۟۟ۧ";
                        iM240 = C0016.m618(str);
                    }
                    break;
                case 1752672:
                    obj4 = obj3;
                    iM240 = (C0017.f10 * C0013.f2) + 2437600;
                    break;
                case 1753547:
                    if ((C0015.f6 | (C0015.f6 % (-9699))) >= 0) {
                        C0015.m570();
                        str = "۠ۥۣ";
                    } else {
                        str = "ۤۤۡ";
                    }
                    iM240 = C0016.m618(str);
                    break;
                case 1754474:
                    if (C0015.m570() <= 0) {
                        C0015.f6 = 22;
                        iM240 = C0016.m618("۠ۢۢ");
                    } else {
                        str = "۟۟ۧ";
                        iM240 = C0016.m618(str);
                    }
                    break;
                case 1755400:
                    break;
                case 1755406:
                    Object obj5 = Hawk.get((String) obj, obj2);
                    if (C0015.m570() <= 0) {
                        iM240 = C0017.m731("ۨۢۥ");
                        obj3 = obj5;
                    } else {
                        iM240 = C0015.m573("ۥۦۡ");
                        obj3 = obj5;
                    }
                    break;
                case 1755435:
                    if ((C0013.f2 | (C0016.f9 ^ 4498)) <= 0) {
                        str2 = "ۦۣۨ";
                        iM240 = C0015.m573(str2);
                    } else {
                        iM240 = (C0016.f9 ^ C0016.f9) + 56418;
                    }
                    break;
                default:
                    break;
            }
            return obj4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x001c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۥۦ۟ۧ, reason: contains not printable characters */
    public static String m561(Object obj) {
        String str;
        String str2;
        String str3;
        int iM105 = C0013.m105("ۡ۟۠");
        String str4 = null;
        String str5 = null;
        while (true) {
            switch (iM105) {
                case 56320:
                    iM105 = C0014.f3 >= 0 ? C0017.m731("ۣ۟ۨ") : (C0013.f2 - C0015.f6) ^ 1749759;
                    break;
                case 1747683:
                    str4 = ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0014.f3 / (C0013.f2 ^ 375) != 0) {
                        C0014.f3 = 32;
                        iM105 = C0017.m731("ۣۨ۟");
                    } else {
                        str2 = "ۡۨۧ";
                        iM105 = C0015.m573(str2);
                    }
                    break;
                case 1747715:
                    if (C0014.f3 >= 0) {
                        C0013.m114();
                        str2 = "ۡ۟ۨ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = (C0013.f2 ^ C0017.f10) + 1752982;
                    }
                    break;
                case 1748610:
                    if (C0017.m717() < 0) {
                        str = "ۣ۠۠";
                        iM105 = C0016.m618(str);
                    } else if (C0014.f3 >= 0) {
                        C0013.m114();
                        str2 = "ۡ۟ۨ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = (C0013.f2 ^ C0017.f10) + 1752982;
                    }
                    break;
                case 1748644:
                    if (C0014.f3 >= 0) {
                        str = "ۢۤ۠";
                        iM105 = C0016.m618(str);
                    } else {
                        iM105 = C0015.f6 + C0014.f3 + 1749434;
                    }
                    break;
                case 1748896:
                    if (C0017.f10 - (C0017.f10 / (-1441)) >= 0) {
                        str3 = "۠ۡۤ";
                        str5 = str4;
                        iM105 = C0014.m240(str3);
                    } else {
                        iM105 = (C0013.f2 * C0014.f3) + 1947102;
                        str5 = str4;
                    }
                    break;
                case 1750540:
                    if (C0016.f9 - (C0016.f9 - 959) <= 0) {
                        C0013.m114();
                        iM105 = C0014.m240("ۣۡ۠");
                        str5 = null;
                    } else {
                        str3 = "۠۠";
                        str5 = null;
                        iM105 = C0014.m240(str3);
                    }
                    break;
                case 1750810:
                case 1753510:
                    str = "ۦۥۡ";
                    iM105 = C0016.m618(str);
                    break;
                case 1752612:
                    iM105 = C0016.m574() >= 0 ? C0017.m731("ۦۥۡ") : (C0017.f10 | C0014.f3) + 1750753;
                    break;
                case 1753602:
                    break;
                default:
                    break;
            }
            return str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static String m562() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        String str6 = null;
        int iM105 = C0013.m105("ۥ۟ۡ");
        while (true) {
            switch (iM105) {
                case 1747719:
                case 1750723:
                    str2 = "ۧۨ۟";
                    iM105 = C0014.m240(str2);
                    break;
                case 1748648:
                    if (C0017.f10 - (C0015.f6 % 2654) >= 0) {
                        C0017.f10 = 86;
                        str3 = "ۨ۟۠";
                        iM105 = C0014.m240(str3);
                    } else {
                        iM105 = (C0016.f9 ^ C0015.f6) ^ (-1747535);
                    }
                    break;
                case 1749764:
                    if (C0017.f10 >= 0) {
                        str6 = null;
                        iM105 = C0013.m105("۠ۡۨ");
                    } else {
                        str6 = null;
                        str4 = "ۡ۠ۧ";
                        iM105 = C0016.m618(str4);
                    }
                    break;
                case 1752455:
                    if (C0016.m574() <= 0) {
                        if (C0017.m717() >= 0) {
                            C0014.m245();
                            str4 = "ۡ۠ۧ";
                        } else {
                            str4 = "ۨۦ۠";
                        }
                        iM105 = C0016.m618(str4);
                    } else if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("ۣۨ۠");
                    } else {
                        iM105 = (C0014.f3 + C0016.f9) ^ 1755099;
                    }
                    break;
                case 1754505:
                    if ((C0015.f6 ^ (C0014.f3 / (-730))) >= 0) {
                        C0014.f3 = 19;
                        iM105 = C0017.m731("ۣۥۥ");
                    } else {
                        str3 = "ۢۥۧ";
                        iM105 = C0014.m240(str3);
                    }
                    break;
                case 1754506:
                    str = str5;
                    str6 = str5;
                    iM105 = C0015.m573("ۧۨ۟");
                    str5 = str;
                    break;
                case 1754654:
                    break;
                case 1755337:
                    if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("ۣۨ۠");
                    } else {
                        iM105 = (C0014.f3 + C0016.f9) ^ 1755099;
                    }
                    break;
                case 1755554:
                    str = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    if ((C0014.f3 | (C0013.f2 % 2976)) >= 0) {
                        C0014.f3 = 39;
                        iM105 = C0015.m573("ۧۨ۟");
                        str5 = str;
                    } else {
                        iM105 = 1754506 + (C0017.f10 ^ C0017.f10);
                        str5 = str;
                    }
                    break;
                case 1755562:
                    if (C0013.f2 - (C0017.f10 ^ (-2035)) >= 0) {
                        C0013.f2 = 51;
                        str2 = "ۤۡۡ";
                    } else {
                        str2 = "ۥ۟ۡ";
                    }
                    iM105 = C0014.m240(str2);
                    break;
                default:
                    break;
            }
            return str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m563(Object obj, Object obj2) {
        String str;
        int iM731 = C0017.m731("ۣۣۨ");
        while (true) {
            switch (iM731) {
                case 56356:
                    if (C0014.m245() >= 0) {
                        C0015.f6 = 12;
                        iM731 = C0014.m240("ۡۤۧ");
                    } else {
                        str = "ۦۧۥ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 56568:
                    iM731 = (C0014.f3 ^ C0016.f9) + 1751838;
                    break;
                case 1746845:
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((File) obj, (String) obj2);
                    iM731 = C0014.f3 + (C0014.f3 ^ (-7620)) <= 0 ? C0015.m573("ۣۣۨ") : (C0013.f2 | C0014.f3) + 1747056;
                    break;
                case 1746973:
                    break;
                case 1749575:
                case 1751649:
                    if (C0017.f10 / (C0013.f2 - 2449) != 0) {
                        C0017.f10 = 57;
                        str = "۟ۤ۠";
                        iM731 = C0016.m618(str);
                    } else {
                        iM731 = (C0014.f3 | C0015.f6) ^ (-1747038);
                    }
                    break;
                case 1750814:
                    if (C0014.m245() <= 0) {
                        if (C0013.f2 + (C0016.f9 | 4436) <= 0) {
                        }
                        iM731 = C0016.m618("۟ۤۢ");
                    } else if (C0014.m245() >= 0) {
                        C0015.f6 = 12;
                        iM731 = C0014.m240("ۡۤۧ");
                    } else {
                        str = "ۦۧۥ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1753668:
                    iM731 = C0013.m114() >= 0 ? C0014.m240("ۨ۠") : (C0013.f2 | C0016.f9) + 1750708;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o m564(Object obj) {
        String str;
        String str2;
        int iM618 = C0016.m618("ۤ۟۠");
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
        while (true) {
            switch (iM618) {
                case 56476:
                case 1749672:
                    if (C0014.f3 - (C0013.f2 / 8294) >= 0) {
                        C0015.m570();
                        iM618 = C0017.m731("ۨۨۨ");
                    } else {
                        iM618 = (C0013.f2 % C0015.f6) + 1750528;
                    }
                    break;
                case 1746846:
                    str = "ۣۦۨ";
                    iM618 = C0016.m618(str);
                    break;
                case 1746907:
                    if ((C0014.f3 ^ (C0016.f9 / 7508)) >= 0) {
                        C0014.f3 = 44;
                        str2 = "ۣۢ";
                    } else {
                        str2 = "ۤ۟۠";
                    }
                    iM618 = C0016.m618(str2);
                    break;
                case 1748801:
                    if (C0015.f6 / (C0013.f2 % 6044) != 0) {
                        C0017.m717();
                        iM618 = C0013.m105("ۥۥۣ");
                        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    } else {
                        str = "ۣۨۨ";
                        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM618 = C0016.m618(str);
                    }
                    break;
                case 1750757:
                    iM618 = C0015.f6 + C0014.f3 + 1753467;
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
                    break;
                case 1750819:
                    break;
                case 1751493:
                    if (C0015.m570() > 0) {
                        iM618 = (C0017.f10 / C0015.f6) ^ 1751686;
                    } else if (C0014.f3 % (C0016.f9 - 3771) >= 0) {
                        C0017.m717();
                        str = "ۤۦۥ";
                        iM618 = C0016.m618(str);
                    } else {
                        iM618 = C0016.m618("ۣ۟ۤ");
                    }
                    break;
                case 1751687:
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Context) obj);
                    if ((C0015.f6 ^ (C0013.f2 - 9476)) <= 0) {
                    }
                    iM618 = C0016.m618("ۡۥۥ");
                    break;
                case 1752643:
                    if (C0013.f2 * (C0015.f6 | (-2093)) >= 0) {
                        C0015.m570();
                        iM618 = C0015.m573("ۨۡۥ");
                    } else {
                        iM618 = (C0016.f9 - C0014.f3) + 1748648;
                    }
                    break;
                case 1755404:
                    if (C0014.f3 % (C0016.f9 - 3771) >= 0) {
                        C0017.m717();
                        str = "ۤۦۥ";
                        iM618 = C0016.m618(str);
                    } else {
                        iM618 = C0016.m618("ۣ۟ۤ");
                    }
                    break;
                default:
                    break;
            }
            return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۧۨۥۨ, reason: not valid java name and contains not printable characters */
    public static O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO m565() {
        String str;
        String str2;
        int iM618 = C0016.m618("ۥۧ۟");
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = null;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = null;
        while (true) {
            switch (iM618) {
                case 56418:
                    break;
                case 1747805:
                case 1751709:
                    if (C0014.f3 % (C0015.f6 - 4786) >= 0) {
                        C0015.m570();
                        str2 = "ۨ۟";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0015.f6 | C0017.f10) + 1753347;
                    }
                    break;
                case 1748677:
                    if ((C0017.f10 | C0014.f3 | 5560) >= 0) {
                        C0014.m245();
                        iM618 = C0017.m731("ۤۥۣ");
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    } else {
                        iM618 = (C0013.f2 | C0014.f3) ^ (-1752817);
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    }
                    break;
                case 1750718:
                    if (C0015.f6 - (C0013.f2 | PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT) >= 0) {
                        C0013.f2 = 58;
                        str = "ۨۦ";
                    } else {
                        str = "ۥۧ۟";
                    }
                    iM618 = C0013.m105(str);
                    break;
                case 1750814:
                    iM618 = (C0013.f2 - C0016.f9) ^ 1751769;
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = null;
                    break;
                case 1751682:
                    if ((C0013.f2 ^ (C0014.f3 ^ (-3410))) <= 0) {
                        C0016.m574();
                        iM618 = C0015.m573("ۤۦ۟");
                    } else {
                        str = "۠ۤۡ";
                        iM618 = C0013.m105(str);
                    }
                    break;
                case 1752551:
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f290O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    iM618 = C0015.m573("ۡۡۥ");
                    break;
                case 1752701:
                    iM618 = C0017.m717() <= 0 ? C0014.f3 / (C0015.f6 % 3467) != 0 ? C0017.m731("ۧ۟ۤ") : (C0016.f9 * C0013.f2) ^ 1155523 : (C0015.f6 - C0016.f9) + 1755798;
                    break;
                case 1752738:
                    break;
                case 1754380:
                    if (C0014.m245() < 0) {
                        str2 = "ۣۣۨ";
                        iM618 = C0013.m105(str2);
                    } else {
                        C0016.m574();
                        iM618 = C0015.m573("ۡۡۥ");
                    }
                    break;
                default:
                    break;
            }
            return o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۨ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO m566(Object obj) {
        String str;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        int iM731 = C0017.m731("۟ۨۥ");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        while (true) {
            switch (iM731) {
                case 56383:
                    if (C0013.m114() >= 0) {
                        C0014.m245();
                        iM731 = C0013.m105("ۧۧ۟");
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                    } else {
                        iM731 = (C0017.f10 % C0017.f10) + 1746842;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                    }
                    break;
                case 56542:
                case 1750570:
                    iM731 = (C0016.f9 ^ (C0013.f2 + (-9238))) >= 0 ? C0013.m105("ۧۥۨ") : C0015.m573("ۦۣۨ");
                    break;
                case 1746691:
                    if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM731 = C0014.m240("ۦۦۢ");
                    } else {
                        iM731 = (C0015.f6 / C0017.f10) + 1754623;
                    }
                    break;
                case 1746788:
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((Context) obj);
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 99;
                        iM731 = C0015.m573("۟ۢۧ");
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    } else {
                        str = "ۢۨۤ";
                        iM731 = C0017.m731(str);
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    }
                    break;
                case 1746842:
                    iM731 = C0013.m114() >= 0 ? C0014.m240("ۢۨۤ") : (C0017.f10 - C0017.f10) + 56542;
                    break;
                case 1746972:
                    if (C0015.m570() >= 0) {
                        iM731 = C0013.m105("۟ۢۧ");
                    } else if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM731 = C0014.m240("ۦۦۢ");
                    } else {
                        iM731 = (C0015.f6 / C0017.f10) + 1754623;
                    }
                    break;
                case 1749854:
                    str = "ۦۣۨ";
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    iM731 = C0017.m731(str);
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    break;
                case 1753446:
                    if (C0013.f2 <= 0) {
                        C0015.f6 = 9;
                        str = "ۡۤ۟";
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM731 = C0017.m731(str);
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    } else {
                        iM731 = (C0016.f9 ^ C0016.f9) + 1746972;
                    }
                    break;
                case 1753697:
                    break;
                case 1754623:
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        iM731 = C0014.m240("ۦ۠۠");
                    } else {
                        iM731 = (C0014.f3 % C0014.f3) + 56383;
                    }
                    break;
                default:
                    break;
            }
            return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m567() {
        String str;
        String str2;
        int i = 0;
        int iM240 = C0014.m240("ۧۨۨ");
        int i2 = 0;
        while (true) {
            switch (iM240) {
                case 1747716:
                case 1751745:
                    if (C0013.f2 - (C0013.f2 * 3729) >= 0) {
                        C0016.m574();
                        str2 = "۠ۧ";
                    } else {
                        str2 = "۠ۧ۠";
                    }
                    iM240 = C0017.m731(str2);
                    break;
                case 1747897:
                    break;
                case 1747929:
                    int i3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1434O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    if (C0015.f6 + (C0013.f2 ^ (-9340)) >= 0) {
                        C0014.f3 = 14;
                        iM240 = C0014.m240("ۧۧ۟");
                        i = i3;
                    } else {
                        iM240 = 1755593 + (C0014.f3 / C0013.f2);
                        i = i3;
                    }
                    break;
                case 1749764:
                    iM240 = (C0015.f6 ^ C0013.f2) + 1755148;
                    break;
                case 1749788:
                    if ((C0016.f9 ^ (C0017.f10 * (-5229))) <= 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۨۧۨ");
                        i2 = 0;
                    } else {
                        iM240 = C0013.m105("ۨ۟ۥ");
                        i2 = 0;
                    }
                    break;
                case 1753422:
                    if (C0015.f6 / (C0017.f10 + 2171) != 0) {
                        str2 = "ۧۧ۟";
                        iM240 = C0017.m731(str2);
                    } else {
                        str = "۠ۢۡ";
                        iM240 = C0013.m105(str);
                    }
                    break;
                case 1754623:
                    if ((C0016.f9 | (C0013.f2 + 8425)) <= 0) {
                        C0016.f9 = 87;
                        iM240 = C0015.m573("ۧۨۨ");
                    } else {
                        iM240 = (C0014.f3 * C0017.f10) + 1586818;
                    }
                    break;
                case 1754663:
                    if (C0014.m245() <= 0) {
                        str = "۠ۨۡ";
                    } else if (C0015.f6 / (C0017.f10 + 2171) != 0) {
                        str2 = "ۧۧ۟";
                        iM240 = C0017.m731(str2);
                    } else {
                        str = "۠ۢۡ";
                    }
                    iM240 = C0013.m105(str);
                    break;
                case 1755342:
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 20;
                        iM240 = C0014.m240("ۦ۟ۧ");
                    } else {
                        iM240 = (C0016.f9 * C0013.f2) + 1023645;
                    }
                    break;
                case 1755593:
                    if (C0014.f3 >= 0) {
                        C0013.f2 = 19;
                        iM240 = C0013.m105("ۢۦ۠");
                        i2 = i;
                    } else {
                        iM240 = (C0014.f3 * C0016.f9) + 1921832;
                        i2 = i;
                    }
                    break;
                default:
                    break;
            }
            return i2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static void m568(Object obj) {
        String str;
        String str2;
        int iM240 = C0014.m240("ۤ۟ۨ");
        while (true) {
            switch (iM240) {
                case 56414:
                    break;
                case 56419:
                    str = "ۧۡۦ";
                    iM240 = C0016.m618(str);
                    break;
                case 1746969:
                case 1754444:
                    if (C0013.m114() >= 0) {
                        C0014.m245();
                        str2 = "ۦۦۡ";
                    } else {
                        str2 = "ۣۡ";
                    }
                    iM240 = C0013.m105(str2);
                    break;
                case 1749639:
                    str2 = "ۣۦ";
                    iM240 = C0013.m105(str2);
                    break;
                case 1751501:
                    if (C0017.m717() <= 0) {
                        iM240 = (C0016.f9 * C0016.f9) + 1100182;
                    } else {
                        str2 = "ۣۦ";
                        iM240 = C0013.m105(str2);
                    }
                    break;
                case 1753538:
                    if (C0014.f3 >= 0) {
                        str = "ۣۨ";
                        iM240 = C0016.m618(str);
                    } else {
                        iM240 = C0016.m618("ۤ۟ۨ");
                    }
                    break;
                case 1754663:
                    ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    if (C0014.f3 / (C0013.f2 - 7955) != 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۦۣ۟");
                    } else {
                        iM240 = (C0016.f9 - C0015.f6) ^ 55764;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m569(int i) {
        String str;
        int iM105 = C0013.m105("ۤۦۡ");
        while (true) {
            switch (iM105) {
                case 56480:
                case 1755376:
                    str = "ۣۢۡ";
                    iM105 = C0017.m731(str);
                    break;
                case 1749572:
                    str = "ۥۥ";
                    iM105 = C0017.m731(str);
                    break;
                case 1750626:
                    break;
                case 1750695:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
                    iM105 = C0016.f9 <= 0 ? C0016.m618("ۢ۟ۡ") : (C0015.f6 ^ C0015.f6) + 1750626;
                    break;
                case 1751711:
                    iM105 = C0014.m245() <= 0 ? (C0016.f9 * C0016.f9) + 1096214 : (C0015.f6 | C0016.f9) ^ (-1749509);
                    break;
                case 1754501:
                    if (C0016.f9 + (C0017.f10 ^ 1699) >= 0) {
                        C0014.f3 = 50;
                        str = "ۢۢۤ";
                        iM105 = C0017.m731(str);
                    } else {
                        iM105 = C0014.f3 + C0013.f2 + 1751026;
                    }
                    break;
                case 1755591:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return R.layout.activity_login;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x004c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        int iM618 = C0016.m618("۟ۨ۟");
        String[] strArr = null;
        String str6 = null;
        String strM608 = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch (iM618) {
                case 56350:
                    iM618 = 56572 ^ (C0014.f3 / C0017.f10);
                    strArr = new String[2];
                    break;
                case 56512:
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        str4 = "ۧ۠ۦ";
                        iM618 = C0013.m105(str4);
                    } else {
                        iM618 = C0017.m731("ۤ۟ۥ");
                    }
                    break;
                case 56570:
                case 1750814:
                    if ((C0016.f9 | (C0013.f2 * (-3289))) >= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۣۨۢ");
                    } else {
                        iM618 = (C0016.f9 * C0017.f10) ^ (-1282724);
                    }
                    break;
                case 56572:
                    strArr[0] = str6;
                    iM618 = C0017.m731("ۣۣۡ");
                    break;
                case 1746966:
                    if (C0014.m288() < 23) {
                        if (C0013.m114() >= 0) {
                            C0013.m114();
                            str4 = "ۧ۠ۦ";
                            iM618 = C0013.m105(str4);
                        } else {
                            iM618 = C0017.m731("ۤ۟ۥ");
                        }
                    } else if (C0016.f9 - (C0015.f6 + 3029) < 0) {
                        str2 = "ۦ۠ۨ";
                        iM618 = C0017.m731(str2);
                    } else {
                        C0015.m570();
                        str3 = "ۣ۠ۢ";
                        iM618 = C0017.m731(str3);
                    }
                    break;
                case 1747716:
                    i2 = i3 + 1;
                    iM618 = C0015.m573("ۥۣ۟");
                    break;
                case 1747745:
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM618 = C0013.m105("ۨۦۣ");
                    } else {
                        str3 = "ۣۣۨ";
                        iM618 = C0017.m731(str3);
                    }
                    break;
                case 1749634:
                case 1752486:
                case 1753699:
                    if (C0013.f2 / (C0016.f9 * (-4627)) != 0) {
                        C0017.m717();
                        iM618 = C0014.m240("۠ۨ۠");
                    } else {
                        str4 = "ۢۧۤ";
                        iM618 = C0013.m105(str4);
                    }
                    break;
                case 1749725:
                    strM608 = C0016.m608(m516(), 72, 41, 699);
                    str2 = "ۡ۟";
                    iM618 = C0017.m731(str2);
                    break;
                case 1749823:
                    break;
                case 1750597:
                    strArr[1] = strM608;
                    if (C0015.f6 >= 0) {
                        C0013.f2 = 13;
                        str5 = "ۤۦۦ";
                        iM618 = C0016.m618(str5);
                    } else {
                        iM618 = C0015.f6 + C0013.f2 + 1752319;
                    }
                    break;
                case 1751498:
                    m530(this);
                    if (C0014.f3 % (C0016.f9 * 6718) >= 0) {
                        C0016.m574();
                        iM618 = C0017.m731("ۣۣۡ");
                    } else {
                        iM618 = C0015.m573("ۢۧۤ");
                    }
                    break;
                case 1751559:
                    m546(this, strArr);
                    iM618 = (C0016.f9 / C0017.f10) + 1751589;
                    break;
                case 1751588:
                    if (C0015.f6 >= 0) {
                        C0015.f6 = 58;
                        str = "۠ۡۥ";
                    } else {
                        str = "ۥ۠ۡ";
                    }
                    iM618 = C0015.m573(str);
                    break;
                case 1751716:
                    iM618 = C0014.m240("ۨۦۣ");
                    break;
                case 1752457:
                    if (C0017.f10 >= 0) {
                        i = i2;
                        iM618 = C0014.m240("ۥۣۦ");
                        i3 = i;
                    } else {
                        iM618 = (C0015.f6 ^ C0015.f6) + 1747745;
                        i3 = i2;
                    }
                    break;
                case 1752461:
                    if (C0016.f9 + (C0016.f9 % (-588)) <= 0) {
                        C0015.f6 = 26;
                        iM618 = C0016.m618("ۤ۟ۥ");
                    } else {
                        iM618 = (C0016.f9 / C0013.f2) + 1753699;
                    }
                    break;
                case 1752584:
                    if (C0017.m663(this, strArr[i3]) != 0) {
                        if (C0015.m570() <= 0) {
                            C0015.m570();
                            iM618 = C0016.m618("ۥۣ۟");
                        } else {
                            iM618 = C0016.m618("ۤۡۤ");
                        }
                    } else if ((C0015.f6 | (C0016.f9 / (-4437))) >= 0) {
                        C0014.f3 = 70;
                        iM618 = C0017.m731("ۦۧۢ");
                    } else {
                        iM618 = (C0017.f10 * C0015.f6) + 1286094;
                    }
                    break;
                case 1752610:
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        str2 = "ۦۦ";
                        iM618 = C0017.m731(str2);
                    } else {
                        iM618 = (C0017.f10 ^ C0015.f6) + 1752493;
                    }
                    break;
                case 1752642:
                    if (C0017.f10 >= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("ۡ۟");
                        i3 = 0;
                    } else {
                        iM618 = (C0016.f9 | C0017.f10) + 1755803;
                        i3 = 0;
                    }
                    break;
                case 1753454:
                    String strM693 = C0017.m693(m516(), 32, 40, 2816);
                    iM618 = C0016.m618("ۢۤ۟");
                    str6 = strM693;
                    break;
                case 1754599:
                    if ((C0015.f6 | (C0016.f9 / (-4437))) >= 0) {
                        C0014.f3 = 70;
                        iM618 = C0017.m731("ۦۧۢ");
                    } else {
                        iM618 = (C0017.f10 * C0015.f6) + 1286094;
                    }
                    break;
                case 1755406:
                    iM618 = (C0016.f9 % C0016.f9) + 1746966;
                    break;
                case 1755557:
                    m530(this);
                    if (C0015.f6 + (C0014.f3 * (-8213)) <= 0) {
                        C0016.m574();
                        iM618 = C0015.m573("ۢۡۡ");
                    } else {
                        str5 = "ۥ۟ۧ";
                        iM618 = C0016.m618(str5);
                    }
                    break;
                case 1755590:
                    if (i3 >= 2) {
                        iM618 = C0014.m240("ۨۦۣ");
                    } else if (C0013.f2 <= 0) {
                        C0013.m114();
                        iM618 = C0013.m105("ۨۤ");
                    } else {
                        i = i3;
                        iM618 = C0014.m240("ۥۣۦ");
                        i3 = i;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        int iM573 = C0015.m573("ۤۤۧ");
        while (true) {
            switch (iM573) {
                case 56414:
                    C0016.m628(this);
                    iM573 = C0013.f2 + C0016.f9 + 1748954;
                    break;
                case 1746749:
                    iM573 = C0017.m731("ۤۤۧ");
                    break;
                case 1748866:
                    if (C0016.f9 * (C0013.f2 % (-8967)) <= 0) {
                        C0015.f6 = 63;
                        str = "ۡۨ";
                    } else {
                        str = "ۣۣۧ";
                    }
                    iM573 = C0013.m105(str);
                    break;
                case 1750663:
                    break;
                case 1750695:
                    C0017.m706(this, 0, R.anim.activity_out_style);
                    if (C0017.f10 * (C0014.f3 % 8324) <= 0) {
                        C0014.f3 = 52;
                        iM573 = C0016.m618("ۤۤۧ");
                    } else {
                        str = "ۣۡ";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1751655:
                    if (C0014.m217(message) == 22) {
                        if (C0017.f10 >= 0) {
                        }
                        iM573 = C0013.m105("ۥۡۦ");
                    } else {
                        if (C0016.f9 * (C0013.f2 % (-8967)) <= 0) {
                            C0015.f6 = 63;
                            str = "ۡۨ";
                        } else {
                            str = "ۣۣۧ";
                        }
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1751679:
                    C0016.m615(this, new Intent(this, (Class<?>) LivePlayActivity.class));
                    iM573 = C0015.m573(C0015.m570() <= 0 ? "۟ۡ۟" : "ۣۤۨ");
                    break;
                case 1752522:
                    C0017.m697(C0013.m102(this), C0017.m654(this));
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 34;
                        str2 = "ۣۣۧ";
                    } else {
                        str2 = "ۤۥ۠";
                    }
                    iM573 = C0013.m105(str2);
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0824 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x081b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void init() {
        String str;
        String strM642;
        String str2;
        String str3;
        String str4;
        String strM234;
        String str5;
        String strM214;
        String str6;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        String strM250;
        String str7;
        Drawable drawableM620;
        Point pointM535;
        int iM203;
        String str8;
        String str9;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        String strM512;
        String str10;
        String str11;
        Exception e;
        String str12;
        String str13;
        Pattern pattern;
        String str14;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564;
        String str15;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        String str16;
        String str17;
        String str18 = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = null;
        Point point = null;
        int i = 0;
        int i2 = 0;
        StringBuilder sb = null;
        Drawable drawable = null;
        String strM153 = null;
        String str19 = null;
        boolean zM723 = false;
        String strM195 = null;
        Pattern patternM255 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = null;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = null;
        Exception exc = null;
        int iM573 = C0015.m573("ۦ۠");
        StringBuilder sb2 = null;
        String str23 = null;
        RelativeLayout relativeLayoutM267 = null;
        while (true) {
            switch (iM573) {
                case 56291:
                    this.f3013O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (TextView) C0016.m575(this, R.id.loadingText);
                    if (C0016.m574() >= 0) {
                        iM573 = C0017.m731("۟ۢۦ");
                    } else {
                        str5 = "ۥۣۨ";
                        strM214 = str21;
                        str21 = strM214;
                        iM573 = C0015.m573(str5);
                    }
                    break;
                case 56328:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1433O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2;
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2 / m567();
                    f3011O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = C0016.m610(new SimpleDateFormat(C0014.m250(m516(), 118, 14, 786), C0014.m287()), new Date());
                    this.f3016O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (RelativeLayout) C0016.m575(this, R.id.loginBackground);
                    iM573 = C0013.f2 % (C0014.f3 % 6494) <= 0 ? C0017.m731("ۣۨۥ") : (C0017.f10 / C0014.f3) ^ 56288;
                    break;
                case 56385:
                    if (C0014.f3 * (C0016.f9 - 1718) <= 0) {
                        C0015.m570();
                        iM573 = C0016.m618("ۦۨۥ");
                    } else {
                        str8 = "ۦۨۦ";
                        iM573 = C0014.m240(str8);
                    }
                    break;
                case 56420:
                    C0017.m734(C0013.m165(this), 0);
                    if (C0017.f10 % (C0015.f6 | (-6296)) != 0) {
                        C0017.m717();
                        iM573 = C0016.m618("ۣۨۨ");
                    } else {
                        iM573 = C0016.m618("ۤۨ");
                    }
                    break;
                case 56421:
                    if (drawable == null) {
                        iM573 = C0017.f10 % (C0013.f2 * 8251) >= 0 ? C0014.m240("ۡ۟ۢ") : C0016.m618("ۦۢۥ");
                    } else if (C0016.f9 <= 0) {
                        C0014.f3 = 38;
                        iM573 = C0016.m618("ۤۨ");
                    } else {
                        iM573 = (C0013.f2 ^ C0015.f6) + 1753908;
                    }
                    break;
                case 56452:
                    m521();
                    strM214 = C0014.m214(C0017.m681());
                    if (C0017.f10 * (C0016.f9 | 1199) >= 0) {
                        C0016.f9 = 73;
                        str5 = "ۨ۟ۥ";
                        str21 = strM214;
                        iM573 = C0015.m573(str5);
                    } else {
                        str21 = strM214;
                        iM573 = (C0017.f10 ^ C0015.f6) + 1754324;
                    }
                    break;
                case 56477:
                    iM573 = C0016.m618("ۣۡۤ");
                    break;
                case 56506:
                    strM250 = C0014.m250(m516(), 113, 5, 1187);
                    if (!C0013.m110(this)) {
                        C0016.m628(this);
                        if (C0016.f9 * (C0013.f2 ^ 5346) <= 0) {
                            str18 = strM250;
                            iM573 = C0014.m240("ۦۨۦ");
                        } else {
                            str7 = "۠ۧۥ";
                            drawableM620 = drawable;
                            str18 = strM250;
                            drawable = drawableM620;
                            iM573 = C0017.m731(str7);
                        }
                    } else if ((C0014.f3 ^ (C0014.f3 + 9917)) >= 0) {
                        C0016.f9 = 56;
                        str18 = strM250;
                        iM573 = C0013.m105("ۧ۠ۨ");
                    } else {
                        str18 = strM250;
                        iM573 = (C0013.f2 % C0013.f2) + 1746787;
                    }
                    break;
                case 56545:
                    if (C0017.m717() < 0) {
                        str10 = "ۡۥۧ";
                        strM512 = str22;
                        str22 = strM512;
                        iM573 = C0014.m240(str10);
                    } else {
                        C0015.f6 = 50;
                        str17 = "ۤ۠ۢ";
                        str13 = strM195;
                        pattern = patternM255;
                        strM195 = str13;
                        patternM255 = pattern;
                        iM573 = C0017.m731(str17);
                    }
                    break;
                case 1746690:
                    C0017.m734(C0014.m216(this), 0);
                    iM573 = C0017.m717() >= 0 ? C0013.m105("ۧ۠ۢ") : C0016.m618("ۣۧ");
                    break;
                case 1746725:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        str = "ۣۡ۠";
                        iM573 = C0014.m240(str);
                    } else {
                        iM573 = C0016.m618("ۣۨۥ");
                    }
                    break;
                case 1746787:
                    if (m525() == null) {
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(7, false);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new MutableLiveData();
                        str9 = "ۣ۠ۦ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        iM573 = C0017.m731(str9);
                    } else if (C0013.f2 * (C0014.f3 + 8938) <= 0) {
                        str8 = "ۨۤۨ";
                        iM573 = C0014.m240(str8);
                    } else {
                        iM573 = (C0014.f3 | C0013.f2) ^ (-1747020);
                    }
                    break;
                case 1746815:
                case 1753477:
                case 1754410:
                    iM573 = C0013.m114() >= 0 ? C0014.m240("۠۟ۦ") : (C0015.f6 ^ C0015.f6) + 1751531;
                    break;
                case 1746908:
                    C0013.m180(exc);
                    if (C0015.f6 * (C0013.f2 | 8184) >= 0) {
                        C0017.m717();
                        str16 = "ۦ۠";
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM573 = C0014.m240(str16);
                    } else {
                        iM573 = C0017.m731("ۤ۠ۧ");
                    }
                    break;
                case 1746969:
                    C0017.m698((MutableLiveData) m515(m525()), this, new Observer() { // from class: O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            String str24 = LoginActivity.f3011O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                            LoginActivity loginActivity = this.f1089O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            loginActivity.getClass();
                            if (((Boolean) obj).booleanValue()) {
                                loginActivity.f3015O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.sendEmptyMessageDelayed(22, O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1497O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO);
                            }
                        }
                    });
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 2);
                    this.f3017O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    C0013.m200(C0013.m102(this), o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 20000L);
                    if ((C0013.f2 ^ (C0014.f3 / (-2098))) <= 0) {
                        C0015.m570();
                        iM573 = C0016.m618("۟ۢ");
                    }
                    break;
                case 1747653:
                    if (relativeLayoutM267 != null) {
                        if (C0015.f6 * (C0017.f10 - 4605) <= 0) {
                            C0015.f6 = 54;
                            iM573 = C0016.m618("ۧۢۤ");
                        } else {
                            iM573 = C0014.f3 + C0015.f6 + 57245;
                        }
                    } else if (C0017.f10 % (C0013.f2 * 8251) >= 0) {
                    }
                    break;
                case 1747779:
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2085O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                    if (C0013.f2 % (C0014.f3 - 7371) <= 0) {
                        C0015.f6 = 72;
                        iM573 = C0013.m105("ۢۥ۠");
                    } else {
                        str5 = "۟ۨۢ";
                        strM214 = str21;
                        str21 = strM214;
                        iM573 = C0015.m573(str5);
                    }
                    break;
                case 1747804:
                    C0014.m209(sb, m551());
                    if (C0013.f2 <= 0) {
                        iM573 = C0013.m105("ۦ۟ۨ");
                    } else {
                        str10 = "ۦۤۡ";
                        strM512 = str22;
                        str22 = strM512;
                        iM573 = C0014.m240(str10);
                    }
                    break;
                case 1747869:
                    C0014.m244(C0016.m599(C0013.m165(this)), C0013.m194(str20), C0014.m256());
                    if (C0013.f2 % (C0016.f9 % 5572) <= 0) {
                        C0015.m570();
                        iM573 = C0015.m573("ۨ۟ۤ");
                    }
                    break;
                case 1747902:
                case 1751531:
                    break;
                case 1748618:
                    if (C0014.f3 / (C0013.f2 * 6164) != 0) {
                        C0015.m570();
                        iM573 = C0015.m573("ۧۧۤ");
                    } else {
                        iM573 = (C0017.f10 % C0017.f10) + 1750536;
                    }
                    break;
                case 1748765:
                    C0014.m209(sb2, str23);
                    str8 = "ۣۢۨ";
                    iM573 = C0014.m240(str8);
                    break;
                case 1748796:
                    int iM730 = C0017.m730(point);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iM730;
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i / 55;
                    int i3 = (int) (((double) iM730) * 0.9d);
                    if (C0017.f10 * C0016.f9 * 9766 >= 0) {
                        C0017.f10 = 46;
                        i2 = i3;
                        iM573 = C0016.m618("ۤۧۨ");
                    } else {
                        i2 = i3;
                        iM573 = C0017.m731("۠ۨ");
                    }
                    break;
                case 1748803:
                    strM153 = C0013.m153(m516(), TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, 13, 2859);
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 65;
                        iM573 = C0013.m105("ۣ۠ۢ");
                    } else {
                        iM573 = (C0017.f10 * C0017.f10) ^ 1211938;
                    }
                    break;
                case 1748857:
                    if (C0014.f3 >= 0) {
                        C0017.f10 = 96;
                        iM573 = C0016.m618("ۢ۟۠");
                    } else {
                        iM573 = (C0014.f3 / C0016.f9) + 1746815;
                    }
                    break;
                case 1749571:
                    strM642 = C0016.m642(C0017.m681());
                    if (C0014.m279(C0017.m677(patternM255, strM642)) && !C0013.m164(strM642)) {
                        C0017.m714(C0013.m165(this), true);
                        str20 = strM642;
                        iM573 = (C0015.f6 | C0017.f10) + 1748478;
                    } else if (C0014.f3 >= 0) {
                        C0017.f10 = 2;
                        str14 = "ۡۧۥ";
                        str20 = strM642;
                        iM573 = C0016.m618(str14);
                    } else {
                        str20 = strM642;
                        iM573 = (C0015.f6 | C0016.f9) + 1753761;
                    }
                    break;
                case 1749575:
                    if (C0013.f2 * (C0014.f3 + 8938) <= 0) {
                        str8 = "ۨۤۨ";
                        iM573 = C0014.m240(str8);
                    } else {
                        iM573 = (C0014.f3 | C0013.f2) ^ (-1747020);
                    }
                    break;
                case 1749606:
                    if (C0013.m164(strM195)) {
                        str13 = strM195;
                        pattern = patternM255;
                        if ((C0015.f6 | C0016.f9 | 9080) < 0) {
                            C0013.f2 = 8;
                            str12 = "ۣۡۥ";
                            strM195 = str13;
                            patternM255 = pattern;
                            iM573 = C0013.m105(str12);
                        } else {
                            str17 = "ۢ۟۠";
                            strM195 = str13;
                            patternM255 = pattern;
                            iM573 = C0017.m731(str17);
                        }
                    } else {
                        iM573 = C0016.f9 <= 0 ? C0014.m240("ۧۤۤ") : (C0015.f6 * C0017.f10) ^ 1953074;
                    }
                    break;
                case 1749636:
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) m518((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) m514(m548(m547(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, m540()), str21), true), m565());
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(str22);
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 10;
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03;
                        iM573 = C0017.m731("ۢ۟ۤ");
                    } else {
                        str6 = "ۢۥ۠";
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03;
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM573 = C0017.m731(str6);
                    }
                    break;
                case 1749757:
                    try {
                        m517(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02);
                        if (C0016.m574() >= 0) {
                            C0016.m574();
                            iM573 = C0016.m618("۠ۤ۠");
                        } else {
                            iM573 = C0013.f2 + C0014.f3 + 1748172;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (C0016.m574() >= 0) {
                            C0014.f3 = 22;
                            exc = e;
                            iM573 = C0015.m573("۠۟ۤ");
                        } else {
                            str11 = "ۣۤۢ";
                            exc = e;
                            iM573 = C0013.m105(str11);
                        }
                    } catch (OutOfMemoryError e3) {
                        m555(m566(C0014.m208()));
                        C0013.m174();
                        iM573 = (C0015.f6 / C0014.f3) + 1754408;
                    }
                    break;
                case 1749853:
                    try {
                        C0014.m209(sb2, C0013.m153(m516(), TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, 9, 1827));
                        drawableM620 = C0016.m620(C0013.m157(sb2));
                        if (C0016.f9 > 0) {
                            str15 = "ۣۨۨ";
                            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564 = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564;
                            drawable = drawableM620;
                            iM573 = C0013.m105(str15);
                        } else {
                            C0015.f6 = 91;
                            str7 = "۟ۨۢ";
                            strM250 = str18;
                            str18 = strM250;
                            drawable = drawableM620;
                            iM573 = C0017.m731(str7);
                        }
                        break;
                    } catch (Exception e4) {
                        m544(e4, new StringBuilder(C0016.m608(m516(), 141, 9, 3204)), 2);
                        if (C0016.f9 <= 0) {
                            C0017.f10 = 22;
                            iM573 = C0014.m240("ۣۡۤ");
                        } else {
                            pointM535 = point;
                            iM203 = i;
                            point = pointM535;
                            i = iM203;
                            iM573 = C0017.m731("ۨۦۨ");
                        }
                    }
                    break;
                case 1750534:
                    zM723 = C0017.m723(C0017.m681());
                    strM195 = C0013.m195(C0017.m681());
                    patternM255 = C0014.m255();
                    if (!C0014.m279(C0017.m677(patternM255, strM195))) {
                        str13 = strM195;
                        pattern = patternM255;
                        if ((C0015.f6 | C0016.f9 | 9080) < 0) {
                            C0013.f2 = 8;
                            str12 = "ۣۡۥ";
                            strM195 = str13;
                            patternM255 = pattern;
                            iM573 = C0013.m105(str12);
                        } else {
                            str17 = "ۢ۟۠";
                            strM195 = str13;
                            patternM255 = pattern;
                            iM573 = C0017.m731(str17);
                        }
                    } else if (C0017.m717() >= 0) {
                        C0016.f9 = 7;
                        iM573 = C0016.m618("ۥۣۣ");
                    } else {
                        str12 = "ۢ۠ۤ";
                        str13 = strM195;
                        pattern = patternM255;
                        strM195 = str13;
                        patternM255 = pattern;
                        iM573 = C0013.m105(str12);
                    }
                    break;
                case 1750536:
                case 1750725:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        iM573 = C0015.m573("ۨۤۡ");
                    } else {
                        str3 = "ۣ۟ۢ";
                        iM573 = C0016.m618(str3);
                    }
                    break;
                case 1750565:
                    if (C0017.f10 >= 0) {
                        C0017.m717();
                        str11 = "۠ۨۧ";
                        e = exc;
                        exc = e;
                        iM573 = C0013.m105(str11);
                    } else {
                        iM573 = (C0016.f9 | C0016.f9) + 1745881;
                    }
                    break;
                case 1750594:
                case 1750689:
                    if (C0015.f6 < 0) {
                        str8 = "۟ۦۣ";
                        iM573 = C0014.m240(str8);
                    } else {
                        C0015.m570();
                        str9 = "ۣۨۡ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        iM573 = C0017.m731(str9);
                    }
                    break;
                case 1750595:
                    if (C0016.m574() < 0) {
                        str3 = "ۤۦۦ";
                        iM573 = C0016.m618(str3);
                    } else {
                        C0014.f3 = 33;
                        str10 = "ۦۣۦ";
                        strM512 = str22;
                        str22 = strM512;
                        iM573 = C0014.m240(str10);
                    }
                    break;
                case 1750598:
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564 = m564(this);
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        str15 = "ۡۥۧ";
                        drawableM620 = drawable;
                        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564;
                        drawable = drawableM620;
                        iM573 = C0013.m105(str15);
                    } else {
                        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oM564;
                        iM573 = C0017.m731("ۨۧۥ");
                    }
                    break;
                case 1751622:
                    if (C0013.f2 <= 0) {
                        str4 = "ۣۢۡ";
                        strM234 = strM153;
                    } else {
                        str4 = "ۣ۟ۢ";
                        strM234 = strM153;
                    }
                    str19 = strM234;
                    iM573 = C0014.m240(str4);
                    break;
                case 1751715:
                    str13 = strM195;
                    pattern = patternM255;
                    if ((C0015.f6 | C0016.f9 | 9080) < 0) {
                        str17 = "ۢ۟۠";
                        strM195 = str13;
                        patternM255 = pattern;
                        iM573 = C0017.m731(str17);
                    } else {
                        C0013.f2 = 8;
                        str12 = "ۣۡۥ";
                        strM195 = str13;
                        patternM255 = pattern;
                        iM573 = C0013.m105(str12);
                    }
                    break;
                case 1751716:
                    str5 = "ۨ۟ۤ";
                    strM214 = str21;
                    str21 = strM214;
                    iM573 = C0015.m573(str5);
                    break;
                case 1751749:
                    strM642 = str20;
                    if (C0014.f3 >= 0) {
                        C0017.f10 = 2;
                        str14 = "ۡۧۥ";
                        str20 = strM642;
                        iM573 = C0016.m618(str14);
                    } else {
                        str20 = strM642;
                        iM573 = (C0015.f6 | C0016.f9) + 1753761;
                    }
                    break;
                case 1752581:
                    if ((C0013.f2 | (C0015.f6 % (-5091))) >= 0) {
                        C0017.f10 = 22;
                        iM573 = C0015.m573("ۢۤۡ");
                    } else {
                        iM573 = (C0017.f10 ^ C0014.f3) + 1748310;
                    }
                    break;
                case 1752736:
                    this.f3014O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ProgressBar) C0016.m575(this, R.id.loadingProgress);
                    if (C0017.f10 - (C0013.f2 - 8513) > 0) {
                        str14 = "ۦۨۦ";
                        iM573 = C0016.m618(str14);
                    } else {
                        str2 = "ۣۢ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1753423:
                    C0014.m247(relativeLayoutM267, drawable);
                    iM573 = (C0017.f10 | C0014.f3) + 1751929;
                    break;
                case 1753513:
                    C0016.m600(this);
                    strM234 = C0014.m234(C0017.m681());
                    if (C0013.m164(strM234)) {
                        if (C0017.m717() < 0) {
                            C0015.f6 = 50;
                            str17 = "ۤ۠ۢ";
                            str13 = strM195;
                            pattern = patternM255;
                            strM195 = str13;
                            patternM255 = pattern;
                            iM573 = C0017.m731(str17);
                        } else {
                            str10 = "ۡۥۧ";
                            strM512 = str22;
                            str22 = strM512;
                            iM573 = C0014.m240(str10);
                        }
                    } else if ((C0017.f10 | (C0013.f2 % (-6181))) >= 0) {
                        C0015.m570();
                        str19 = strM234;
                        iM573 = C0016.m618("ۦۢۥ");
                    } else {
                        str4 = "ۡ۟ۨ";
                        str19 = strM234;
                        iM573 = C0014.m240(str4);
                    }
                    break;
                case 1753571:
                    C0014.m209(sb, str18);
                    String strM157 = C0013.m157(sb);
                    StringBuilder sb3 = new StringBuilder();
                    if (C0016.f9 * (C0014.f3 - 5778) >= 0) {
                        C0016.f9 = 72;
                        sb2 = sb3;
                        str23 = strM157;
                        iM573 = C0017.m731("ۥۢ");
                    } else {
                        sb2 = sb3;
                        str23 = strM157;
                        iM573 = (C0016.f9 ^ C0017.f10) + 1749242;
                    }
                    break;
                case 1753696:
                    C0016.m635(C0014.m216(this), str19);
                    if (zM723) {
                        C0017.m734(C0014.m216(this), 8);
                        C0017.m734(C0013.m165(this), 8);
                        iM573 = C0013.f2 - (C0014.f3 * 1490) <= 0 ? C0013.m105("ۦۨۢ") : (C0013.f2 / C0015.f6) ^ (-1746726);
                    } else if (C0017.f10 >= 0) {
                        C0017.m717();
                        str11 = "۠ۨۧ";
                        e = exc;
                        exc = e;
                        iM573 = C0013.m105(str11);
                    } else {
                        iM573 = (C0016.f9 | C0016.f9) + 1745881;
                    }
                    break;
                case 1753700:
                    str2 = "۠ۤ۠";
                    sb = new StringBuilder();
                    iM573 = C0016.m618(str2);
                    break;
                case 1754409:
                    strM250 = str18;
                    if ((C0014.f3 ^ (C0014.f3 + 9917)) >= 0) {
                        C0016.f9 = 56;
                        str18 = strM250;
                        iM573 = C0013.m105("ۧ۠ۨ");
                    } else {
                        str18 = strM250;
                        iM573 = (C0013.f2 % C0013.f2) + 1746787;
                    }
                    break;
                case 1754473:
                    strM512 = m512(new StringBuilder(), m551(), str18);
                    str10 = "ۣۡۤ";
                    str22 = strM512;
                    iM573 = C0014.m240(str10);
                    break;
                case 1754535:
                    Display displayM631 = C0016.m631(C0013.m117(this));
                    pointM535 = m535();
                    C0013.m175(displayM631, pointM535);
                    iM203 = C0014.m203(pointM535);
                    if (C0016.f9 <= 0) {
                        C0013.m114();
                        point = pointM535;
                        i = iM203;
                        iM573 = C0017.m731("ۨۦۨ");
                    } else {
                        point = pointM535;
                        i = iM203;
                        iM573 = (C0013.f2 | C0017.f10) ^ (-1748814);
                    }
                    break;
                case 1754628:
                    C0013.m120(C0014.m216(this), C0013.m194(strM195));
                    if (C0017.m717() >= 0) {
                        iM573 = C0013.m105("ۨۧۥ");
                    } else {
                        str = "ۢ۟۠";
                        iM573 = C0014.m240(str);
                    }
                    break;
                case 1755341:
                case 1755562:
                    if (C0017.f10 % (C0013.f2 * 8251) >= 0) {
                    }
                    break;
                case 1755342:
                case 1755466:
                    if ((C0017.f10 ^ (C0017.f10 | (-2353))) <= 0) {
                        str6 = "ۢۨۡ";
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM573 = C0017.m731(str6);
                    } else {
                        iM573 = (C0017.f10 - C0017.f10) + 56452;
                    }
                    break;
                case 1755407:
                    if ((C0016.f9 | (C0015.f6 / (-8717))) <= 0) {
                        str3 = "ۥۤۡ";
                        iM573 = C0016.m618(str3);
                    } else {
                        iM573 = C0014.m240("ۦ۠");
                    }
                    break;
                case 1755590:
                    C0013.m137(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(m504(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o), o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, Bitmap.class, m557(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o));
                    if (C0017.m717() >= 0) {
                        C0017.f10 = 71;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM573 = C0013.m105("ۣ۟ۢ");
                    } else {
                        str16 = "ۣۢۡ";
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM573 = C0014.m240(str16);
                    }
                    break;
                case 1755619:
                    relativeLayoutM267 = C0014.m267(this);
                    iM573 = (C0013.f2 | C0013.f2) + 1746753;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        String str;
        Handler handlerM102;
        String str2;
        Handler handler = null;
        RelativeLayout relativeLayout = null;
        int iM573 = C0015.m573("ۣۥۢ");
        while (true) {
            switch (iM573) {
                case 56514:
                    C0017.m697(handler, C0017.m654(this));
                    if (C0016.f9 * (C0017.f10 % (-9817)) >= 0) {
                        C0015.m570();
                        iM573 = C0013.m105("۠ۨۥ");
                    } else {
                        str2 = "۠ۧۡ";
                        iM573 = C0013.m105(str2);
                    }
                    break;
                case 1746879:
                    RelativeLayout relativeLayoutM267 = C0014.m267(this);
                    iM573 = 1748082 + (C0015.f6 - C0014.f3);
                    relativeLayout = relativeLayoutM267;
                    break;
                case 1747688:
                    if (relativeLayout != null) {
                        iM573 = (C0014.f3 ^ (C0017.f10 / (-3973))) >= 0 ? C0017.m731("۠ۧۡ") : C0017.m731("ۦۢۧ");
                    } else {
                        iM573 = (C0016.f9 | C0015.f6) + 1747998;
                    }
                    break;
                case 1747898:
                    C0016.m612(handler, 22);
                    if ((C0017.f10 | (C0017.f10 % 53)) >= 0) {
                        C0014.m245();
                        str = "ۣۥۢ";
                    } else {
                        str = "۟ۥۥ";
                    }
                    iM573 = C0017.m731(str);
                    break;
                case 1747933:
                    m555(m566(C0014.m208()));
                    if (C0016.f9 / (C0013.f2 % 9116) != 0) {
                        C0015.f6 = 96;
                    } else {
                        iM573 = C0015.f6 + C0014.f3 + 1749527;
                    }
                    break;
                case 1748647:
                    iM573 = (C0016.f9 | C0015.f6) + 1747998;
                    break;
                case 1748703:
                    break;
                case 1749670:
                    handlerM102 = C0013.m102(this);
                    if ((C0014.f3 | C0013.f2 | (-4146)) >= 0) {
                        C0014.f3 = 72;
                        iM573 = C0014.m240("ۡ۠ۦ");
                        handler = handlerM102;
                    } else {
                        iM573 = C0017.m731("ۦۨ");
                        handler = handlerM102;
                    }
                    break;
                case 1750720:
                    super.onDestroy();
                    if ((C0013.f2 ^ (C0014.f3 + 3009)) <= 0) {
                        C0014.m245();
                        handlerM102 = handler;
                        iM573 = C0017.m731("ۦۨ");
                        handler = handlerM102;
                    } else {
                        iM573 = (C0016.f9 % C0014.f3) + 1749506;
                    }
                    break;
                case 1753515:
                    C0014.m247(relativeLayout, null);
                    if (C0016.m574() >= 0) {
                        C0014.f3 = 66;
                        iM573 = C0017.m731("۟ۥۥ");
                    } else {
                        iM573 = (C0017.f10 ^ C0016.f9) ^ (-1747458);
                    }
                    break;
                case 1754503:
                    if (C0017.f10 + (C0013.f2 | TsExtractor.TS_STREAM_TYPE_DTS_UHD) <= 0) {
                        C0014.m245();
                        str2 = "ۨۨۨ";
                    } else {
                        str2 = "ۣۥۢ";
                    }
                    iM573 = C0013.m105(str2);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        String str;
        TextView textView;
        int length;
        String str2;
        String str3;
        TextView textView2;
        String str4;
        TextView textView3 = null;
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        int i2 = 0;
        int iM105 = C0013.m105("ۧۡۢ");
        int i3 = 0;
        while (true) {
            switch (iM105) {
                case 56288:
                case 1748891:
                    if (C0017.f10 >= 0) {
                        str2 = "ۢ۟۠";
                        iM105 = C0013.m105(str2);
                    } else {
                        iM105 = (C0015.f6 * C0014.f3) + 1615883;
                    }
                    break;
                case 56573:
                case 1751714:
                    break;
                case 1746818:
                    if (i3 < i2) {
                        if (iArr[i3] != -1) {
                            str2 = "ۣۢۧ";
                            iM105 = C0013.m105(str2);
                        } else if ((C0013.f2 | C0015.f6 | (-9774)) >= 0) {
                            C0014.m245();
                            iM105 = C0013.m105("ۤۦۤ");
                        } else {
                            iM105 = (C0017.f10 % C0015.f6) ^ (-1750603);
                        }
                    } else if (C0016.m574() >= 0) {
                        iM105 = C0014.m240("ۦۧۦ");
                    } else {
                        str = "ۨ۠ۨ";
                        iM105 = C0017.m731(str);
                    }
                    break;
                case 1746879:
                    C0016.m635(textView5, C0013.m153(m516(), 185, 2, 3190));
                    C0016.m635(textView4, C0016.m608(m516(), 187, 2, 1689));
                    if ((C0013.f2 | (C0015.f6 * (-9797))) <= 0) {
                        C0016.f9 = 13;
                        iM105 = C0013.m105("۟۟");
                    } else {
                        iM105 = (C0015.f6 - C0014.f3) + 1752043;
                    }
                    break;
                case 1746911:
                    C0017.m703(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2, true);
                    textView = (TextView) C0016.m584(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2, R.id.title);
                    if ((C0017.f10 ^ (C0017.f10 ^ (-823))) >= 0) {
                        C0013.m114();
                        str4 = "ۣ۟ۦ";
                        textView3 = textView;
                        textView2 = textView4;
                        textView4 = textView2;
                        iM105 = C0015.m573(str4);
                    } else {
                        textView3 = textView;
                        iM105 = (C0013.f2 * C0013.f2) + 943577;
                    }
                    break;
                case 1747834:
                    textView = textView3;
                    i3 = 0;
                    str4 = "ۣ۟ۦ";
                    textView3 = textView;
                    textView2 = textView4;
                    textView4 = textView2;
                    iM105 = C0015.m573(str4);
                    break;
                case 1748671:
                    if (C0017.f10 % (C0015.f6 ^ (-4784)) >= 0) {
                        C0017.m717();
                    } else {
                        iM105 = (C0016.f9 % C0015.f6) + 1747634;
                    }
                    break;
                case 1749665:
                    if (C0014.f3 + (C0014.f3 | 6370) >= 0) {
                        C0016.f9 = 15;
                        iM105 = C0017.m731("ۦۤۧ");
                    } else {
                        str3 = "ۡۨۢ";
                        o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2;
                        o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                        iM105 = C0013.m105(str3);
                    }
                    break;
                case 1749794:
                    C0014.m284(textView4, o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2);
                    m520(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2);
                    iM105 = (C0014.f3 ^ (C0013.f2 | (-2728))) <= 0 ? C0014.m240("ۤۤۡ") : C0015.m573("ۨۥ");
                    break;
                case 1749822:
                    i3++;
                    o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2;
                    str3 = "ۢۢۡ";
                    o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                    iM105 = C0013.m105(str3);
                    break;
                case 1750750:
                    o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, R.style.CustomDialogStyleDim);
                    C0017.m675(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, R.layout.dialog_delete);
                    if (C0014.f3 >= 0) {
                        str3 = "ۢۢۡ";
                        o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                        iM105 = C0013.m105(str3);
                    } else {
                        str = "۟ۦۦ";
                        o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                        iM105 = C0017.m731(str);
                    }
                    break;
                case 1751649:
                    o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2.f3109O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
                    C0014.m284(textView5, o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2);
                    if ((C0017.f10 | (C0016.f9 % 3020)) >= 0) {
                        length = i2;
                        i2 = length;
                        iM105 = C0014.m240("ۡۡ۟");
                    } else {
                        iM105 = (C0013.f2 % C0016.f9) + 1749703;
                    }
                    break;
                case 1752582:
                    str2 = "ۣۢۧ";
                    iM105 = C0013.m105(str2);
                    break;
                case 1752613:
                    if (C0016.m574() >= 0) {
                        iM105 = C0014.m240("ۦۧۦ");
                    } else {
                        str = "ۨ۠ۨ";
                        iM105 = C0017.m731(str);
                    }
                    break;
                case 1753577:
                    C0016.m635((TextView) C0016.m584(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2, R.id.mes), C0014.m250(m516(), 163, 14, 1705));
                    TextView textView6 = (TextView) C0016.m584(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2, R.id.ok);
                    if (C0013.f2 <= 0) {
                        C0016.f9 = 99;
                        textView5 = textView6;
                        iM105 = C0014.m240("ۣۦۡ");
                    } else {
                        textView5 = textView6;
                        iM105 = (C0016.f9 ^ C0016.f9) ^ 1755561;
                    }
                    break;
                case 1754440:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    length = iArr.length;
                    if ((C0013.f2 | (C0016.f9 ^ (-9640))) >= 0) {
                        C0016.m574();
                        i2 = length;
                        iM105 = C0013.m105("ۨۦۧ");
                    } else {
                        i2 = length;
                        iM105 = C0014.m240("ۡۡ۟");
                    }
                    break;
                case 1755376:
                    m530(this);
                    if ((C0017.f10 ^ (C0017.f10 - 7198)) <= 0) {
                        C0013.f2 = 77;
                        iM105 = C0015.m573("ۨ۠ۨ");
                    } else {
                        iM105 = C0013.m105("ۤۦۤ");
                    }
                    break;
                case 1755553:
                    if (C0017.f10 + (C0014.f3 * 1001) >= 0) {
                        str = "ۦۡۡ";
                        iM105 = C0017.m731(str);
                    } else {
                        iM105 = (C0015.f6 - C0013.f2) + 1755949;
                    }
                    break;
                case 1755561:
                    TextView textView7 = (TextView) C0016.m584(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2, R.id.cancel);
                    C0016.m635(textView3, C0016.m608(m516(), TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, 8, 3044));
                    textView2 = textView7;
                    str4 = "۟ۥۥ";
                    textView4 = textView2;
                    iM105 = C0015.m573(str4);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    @Override // com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        int iM105 = C0013.m105("ۣ۠ۨ");
        while (true) {
            switch (iM105) {
                case 1746749:
                    if (C0013.f2 % (C0013.f2 + 1612) <= 0) {
                        str = "ۨۢۧ";
                    } else {
                        iM105 = (C0013.f2 ^ C0017.f10) ^ (-1750875);
                    }
                    break;
                case 1748733:
                    return;
                case 1750571:
                    super.onResume();
                    if (C0015.f6 + (C0015.f6 - 7356) < 0) {
                        str = "ۣۣۡ";
                    } else {
                        iM105 = C0015.m573("ۣۡ۟");
                    }
                    break;
                case 1750657:
                    m522(this, true, C0016.m617(C0013.m156(this)));
                    if (C0016.f9 / (C0014.f3 | 8224) >= 0) {
                        C0013.f2 = 18;
                        iM105 = C0013.m105("۟ۡ۟");
                    } else {
                        iM105 = C0013.f2 + C0015.f6 + 1748442;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM105 = C0016.m618(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:340:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:341:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:664:0x08d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0727 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0be7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x101b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x08e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x0dfc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x0df2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x0b81 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x0bd7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:0x1012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x0bca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:0x0980 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:0x0973 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:0x0bf1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:838:0x0ddc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:0x0dd2 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        String str2;
        String[] strArrM280;
        String str3;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507;
        ReentrantLock reentrantLockM534;
        String str4;
        String str5;
        String str6;
        String strM512;
        File file;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        File file2;
        String str15;
        String[] strArrM538;
        String str16;
        GradientDrawable.Orientation orientationM285;
        String str17;
        String str18;
        String str19;
        JsonObject jsonObject;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        File file3;
        String str28;
        GradientDrawable.Orientation orientationM145;
        String str29;
        String strM545;
        String strM553;
        String str30;
        Exception e;
        String strM562;
        String strM539;
        String strM543;
        Integer num;
        String str31;
        String str32;
        String str33;
        Calendar calendarM251;
        SimpleDateFormat simpleDateFormat;
        String str34;
        String str35 = null;
        String strM561 = null;
        String strM527 = null;
        String strM508 = null;
        String strM503 = null;
        String strM506 = null;
        String str36 = null;
        String str37 = null;
        String str38 = null;
        String str39 = null;
        String str40 = null;
        String str41 = null;
        int i = 0;
        int i2 = 0;
        String str42 = null;
        File file4 = null;
        int i3 = 0;
        File file5 = null;
        IOException iOException = null;
        File file6 = null;
        String str43 = null;
        String[] strArr = null;
        String[] strArrM281 = null;
        String str44 = null;
        GradientDrawable.Orientation orientation = null;
        GradientDrawable.Orientation orientation2 = null;
        Exception exc = null;
        Integer num2 = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = null;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
        ReentrantLock reentrantLock = null;
        SQLiteDatabase sQLiteDatabaseM523 = null;
        SimpleDateFormat simpleDateFormat2 = null;
        Calendar calendar = null;
        String str45 = null;
        Cursor cursor = null;
        String str46 = null;
        JsonObject jsonObject2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String[] strArr2 = null;
        int i7 = 0;
        String str47 = null;
        File file7 = null;
        int i8 = 0;
        int iM240 = C0014.m240("ۥۣۧ");
        String[] strArr3 = null;
        Iterator itM549 = null;
        JsonObject jsonObject3 = null;
        Throwable th = null;
        while (true) {
            switch (iM240) {
                case 56294:
                case 1754623:
                    strArrM538 = strArr2;
                    if ((C0013.f2 | (C0017.f10 ^ 5860)) >= 0) {
                        strArr2 = strArrM538;
                        iM240 = C0014.m240("ۥۥۧ");
                    } else {
                        strArr2 = strArrM538;
                        iM240 = (C0016.f9 | C0017.f10) + 1751928;
                    }
                    break;
                case 56320:
                    if (C0014.m245() >= 0) {
                        iM240 = C0015.m573("ۦۡۨ");
                    } else {
                        str13 = "ۥ۠ۧ";
                        str14 = str44;
                        str44 = str14;
                        iM240 = C0015.m573(str13);
                    }
                    break;
                case 56355:
                case 1750815:
                    iM240 = (C0016.f9 * C0015.f6) + 2248203;
                    break;
                case 56359:
                    if (C0013.m131(str43, C0017.m693(m516(), TbsListener.ErrorCode.COPY_EXCEPTION, 1, 3204))) {
                        strArrM280 = C0014.m280(str43, C0017.m693(m516(), TbsListener.ErrorCode.INCR_UPDATE_ERROR, 2, 2455));
                        if (C0017.f10 + C0014.f3 + 1113 <= 0) {
                            C0015.f6 = 55;
                            strArr = strArrM280;
                            iM240 = C0016.m618("ۢۧ");
                        } else {
                            str3 = "ۣ۟ۡ";
                            strArr = strArrM280;
                            iM240 = C0014.m240(str3);
                        }
                    } else if (C0016.m574() >= 0) {
                        C0017.m717();
                        str13 = "ۣ۟ۨ";
                        str14 = str44;
                        str44 = str14;
                        iM240 = C0015.m573(str13);
                    } else {
                        iM240 = (C0014.f3 | C0017.f10) + 56602;
                    }
                    break;
                case 56382:
                    throw th;
                case 56389:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1362O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = C0014.m280(str43, str35);
                    if ((C0017.f10 | (C0016.f9 / (-2212))) >= 0) {
                        C0014.f3 = 77;
                        iM240 = C0014.m240("۠۠ۤ");
                    }
                    break;
                case 56449:
                    if ((C0015.f6 ^ (C0013.f2 ^ (-2353))) <= 0) {
                        C0016.m574();
                        str10 = "ۡۡۦ";
                        iM240 = C0014.m240(str10);
                    } else {
                        iM240 = (C0015.f6 - C0017.f10) + 1752436;
                    }
                    break;
                case 56450:
                    if ((C0013.f2 ^ (C0014.f3 / (-5365))) <= 0) {
                        C0016.m574();
                        str24 = "ۣۨۡ";
                        iM240 = C0016.m618(str24);
                    } else {
                        iM240 = (C0015.f6 * C0014.f3) ^ 1785139;
                    }
                    break;
                case 56452:
                    strArrM538 = strArr2;
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        str6 = "ۡۨ۟";
                        strArr2 = strArrM538;
                        iM240 = C0017.m731(str6);
                    } else {
                        strArr2 = strArrM538;
                        iM240 = (C0016.f9 % C0015.f6) + 1750519;
                    }
                    break;
                case 56481:
                    C0014.m274(file4);
                    str25 = "ۣ۠۟";
                    iM240 = C0016.m618(str25);
                    break;
                case 56483:
                    iM240 = C0013.f2 <= 0 ? C0014.m240("ۤۢۨ") : (C0014.f3 / C0016.f9) + 1754502;
                    break;
                case 56510:
                    iM240 = C0016.m574() >= 0 ? C0016.m618("ۥۨۢ") : (C0017.f10 - C0016.f9) ^ (-1748360);
                    break;
                case 56540:
                case 1755497:
                    if (C0013.f2 > 0) {
                        str17 = "ۣ۟ۤ";
                        iM240 = C0016.m618(str17);
                    } else {
                        C0015.f6 = 37;
                        str29 = "ۧ۠";
                        iM240 = C0014.m240(str29);
                    }
                    break;
                case 56569:
                    file3 = new File(str42);
                    if (C0013.m172(file3) || C0013.m109(file3)) {
                        file4 = file3;
                        str23 = "ۣ۠۟";
                        iM240 = C0016.m618(str23);
                    } else if ((C0016.f9 ^ (C0013.f2 / (-4438))) <= 0) {
                        C0017.m717();
                        file4 = file3;
                        iM240 = C0015.m573("ۥۧۨ");
                    } else {
                        str22 = "ۥۦ";
                        file4 = file3;
                        iM240 = C0014.m240(str22);
                    }
                    break;
                case 56572:
                    m569(C0014.m286((Integer) m560(C0017.m693(m516(), TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 4, 2327), num2)));
                    if (C0015.m570() <= 0) {
                        str32 = "ۡۥۣ";
                        iM240 = C0015.m573(str32);
                    } else {
                        iM240 = (C0015.f6 - C0015.f6) + 56450;
                    }
                    break;
                case 56576:
                    C0017.m695(sQLiteDatabaseM523, C0017.m693(m516(), 288, 8, 2043), C0017.m693(m516(), 296, 8, 3257), new String[]{str45});
                    iM240 = (C0017.f10 * C0013.f2) + 2428989;
                    break;
                case 1746687:
                    C0014.m253(reentrantLock);
                    if (C0016.f9 <= 0) {
                        C0015.m570();
                        iM240 = C0014.m240("ۤۡۢ");
                    } else {
                        iM240 = C0015.m573("ۣۢ۟");
                    }
                    break;
                case 1746719:
                    if (C0014.m245() >= 0) {
                        C0016.m574();
                        iM240 = C0014.m240("ۨۢۡ");
                        i6 = i5;
                    } else {
                        iM240 = (C0013.f2 / C0016.f9) + 1754600;
                        i6 = i5;
                    }
                    break;
                case 1746720:
                    str22 = "ۡۤ";
                    iM240 = C0014.m240(str22);
                    break;
                case 1746726:
                case 1754502:
                    if ((C0015.f6 ^ (C0017.f10 + 4053)) >= 0) {
                        str17 = "ۨۥۡ";
                    } else {
                        str17 = "۟ۤۨ";
                    }
                    iM240 = C0016.m618(str17);
                    break;
                case 1746753:
                    strArrM281 = C0014.m280(strArr[0], str35);
                    str4 = "ۥۢۨ";
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    reentrantLockM534 = reentrantLock;
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507;
                    reentrantLock = reentrantLockM534;
                    iM240 = C0013.m105(str4);
                    break;
                case 1746756:
                    C0016.m613(cursor);
                    iM240 = C0013.f2 <= 0 ? C0014.m240("۟ۤۨ") : C0016.m618("ۨۨ");
                    break;
                case 1746780:
                    if (C0017.f10 * (C0017.f10 % 258) <= 0) {
                        C0016.f9 = 52;
                        iM240 = C0014.m240("ۥ۟ۨ");
                        i3 = i2;
                    } else {
                        iM240 = (C0016.f9 ^ C0016.f9) + 1750664;
                        i3 = i2;
                    }
                    break;
                case 1746789:
                    str23 = "ۣۡ۟";
                    iM240 = C0016.m618(str23);
                    break;
                case 1746851:
                    try {
                        C0017.m702(file5);
                        if ((C0013.f2 | (C0015.f6 / 9775)) > 0) {
                            str7 = "ۢۨۥ";
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                            iM240 = C0016.m618(str7);
                        } else {
                            C0015.f6 = 13;
                            str3 = "ۥ۠ۤ";
                            strArrM280 = strArr;
                            strArr = strArrM280;
                            iM240 = C0014.m240(str3);
                        }
                        break;
                    } catch (IOException e2) {
                        if (C0017.f10 - (C0013.f2 ^ (-4422)) <= 0) {
                            iOException = e2;
                            iM240 = C0014.m240("ۥ۠ۧ");
                        } else {
                            iOException = e2;
                            iM240 = (C0014.f3 - C0013.f2) + 1756612;
                        }
                    }
                    break;
                case 1746881:
                    String strM546 = m545();
                    File file8 = new File(strM546);
                    m563(file8, strM546);
                    m542(file8);
                    strArrM538 = m538();
                    if (strArrM538 != null) {
                        if (strArrM538.length == 0) {
                            strArr2 = strArrM538;
                            iM240 = (C0016.f9 | C0013.f2) ^ 1753544;
                        } else if (C0017.f10 >= 0) {
                            C0015.m570();
                            str6 = "ۡۨ۟";
                            strArr2 = strArrM538;
                            iM240 = C0017.m731(str6);
                        } else {
                            strArr2 = strArrM538;
                            iM240 = (C0016.f9 % C0015.f6) + 1750519;
                        }
                    } else if ((C0013.f2 | (C0017.f10 ^ 5860)) >= 0) {
                        strArr2 = strArrM538;
                        iM240 = C0014.m240("ۥۥۧ");
                    } else {
                        strArr2 = strArrM538;
                        iM240 = (C0016.f9 | C0017.f10) + 1751928;
                    }
                    break;
                case 1746882:
                    if (C0017.f10 + (C0017.f10 / (-438)) >= 0) {
                        str17 = "ۧۨۡ";
                        iM240 = C0016.m618(str17);
                    } else {
                        str18 = "ۨۤۧ";
                        iM240 = C0015.m573(str18);
                    }
                    break;
                case 1746940:
                    sQLiteDatabaseM523 = m523(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    iM240 = (C0017.f10 ^ C0017.f10) ^ 1753415;
                    break;
                case 1746944:
                case 1750534:
                    if (C0013.m114() >= 0) {
                        C0015.f6 = 7;
                        iM240 = C0013.m105("ۡ۟۠");
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) ^ (-1745983);
                    }
                    break;
                case 1746974:
                case 1748764:
                    if (C0016.f9 <= 0) {
                        C0013.m114();
                        iM240 = C0013.m105("ۥۨۤ");
                    } else {
                        iM240 = (C0015.f6 / C0014.f3) + 1753668;
                    }
                    break;
                case 1747684:
                    if (C0013.m109(file6)) {
                        if ((C0014.f3 ^ (C0015.f6 - 2608)) <= 0) {
                            iM240 = C0015.m573("ۡ۟ۤ");
                        } else {
                            str27 = "ۧۨۡ";
                            iM240 = C0015.m573(str27);
                        }
                    } else if (C0015.f6 % (C0015.f6 ^ 736) >= 0) {
                        C0016.f9 = 2;
                        iM240 = C0014.m240("ۤۧۡ");
                    } else {
                        str10 = "ۨۥۥ";
                        iM240 = C0014.m240(str10);
                    }
                    break;
                case 1747712:
                    C0016.m577(m536(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000), str46);
                    if (C0015.f6 / (C0015.f6 % 9949) <= 0) {
                        C0016.f9 = 59;
                        iM240 = C0017.m731("ۦۥۢ");
                    } else {
                        iM240 = (C0015.f6 / C0017.f10) ^ 1754655;
                    }
                    break;
                case 1747745:
                    str22 = "ۡ۠ۡ";
                    iM240 = C0014.m240(str22);
                    break;
                case 1747773:
                case 1750749:
                    strM512 = str47;
                    file = file7;
                    str23 = "ۤۦۢ";
                    str47 = strM512;
                    file7 = file;
                    iM240 = C0016.m618(str23);
                    break;
                case 1747807:
                case 1751557:
                    if (C0016.f9 - (C0014.f3 / (-3640)) <= 0) {
                        iM240 = C0013.m105("ۣۢۡ");
                    } else {
                        str21 = "ۤۤۧ";
                        iM240 = C0016.m618(str21);
                    }
                    break;
                case 1747811:
                case 1748829:
                    if (C0015.m570() <= 0) {
                        C0016.f9 = 89;
                        iM240 = C0013.m105("ۣۧۦ");
                    } else {
                        iM240 = (C0015.f6 % C0017.f10) ^ (-1750249);
                    }
                    break;
                case 1747865:
                    C0016.m602((MutableLiveData) m515(m525()), C0016.m607());
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507 = m507(this);
                    reentrantLockM534 = m534(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507);
                    if (C0014.m245() >= 0) {
                        C0015.f6 = 26;
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507;
                        reentrantLock = reentrantLockM534;
                        iM240 = C0014.m240("۟ۢۨ");
                    } else {
                        str4 = "ۣۡ۟";
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507;
                        reentrantLock = reentrantLockM534;
                        iM240 = C0013.m105(str4);
                    }
                    break;
                case 1747928:
                    strM562 = m562();
                    strM539 = m539();
                    strM543 = m543();
                    String strM537 = m537();
                    i2 = 0;
                    if (C0014.m245() < 0) {
                        str41 = strM537;
                        str31 = "۟ۢ۟";
                        i = 0;
                        str39 = strM539;
                        str38 = strM562;
                        str40 = strM543;
                        iM240 = C0013.m105(str31);
                    } else {
                        C0015.f6 = 41;
                        str38 = strM562;
                        str41 = strM537;
                        num = num2;
                        i = 0;
                        str39 = strM539;
                        str40 = strM543;
                        num2 = num;
                        iM240 = C0017.m731("ۨۤ");
                    }
                    break;
                case 1747932:
                    str18 = "ۡ۠ۨ";
                    iM240 = C0015.m573(str18);
                    break;
                case 1747936:
                    if (C0016.m609(cursor)) {
                        String strM125 = C0013.m125(cursor, 0);
                        if (C0017.f10 >= 0) {
                            str46 = strM125;
                            iM240 = C0015.m573("ۨۡ");
                        } else {
                            str46 = strM125;
                            iM240 = (C0016.f9 ^ C0014.f3) ^ (-1747200);
                        }
                    } else if (C0016.f9 <= 0) {
                        C0013.f2 = 32;
                        iM240 = C0013.m105("ۢۢ");
                    } else {
                        str16 = "۟ۡۦ";
                        orientationM285 = orientation2;
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    }
                    break;
                case 1748614:
                    try {
                        orientationM145 = C0013.m145(str44);
                        if (C0015.m570() <= 0) {
                            str28 = "ۧۧۢ";
                            orientation = orientationM145;
                            iM240 = C0015.m573(str28);
                        } else {
                            orientation = orientationM145;
                            iM240 = C0013.m105("ۤ۟ۦ");
                        }
                    } catch (IllegalArgumentException e3) {
                        orientationM285 = C0014.m285();
                        str16 = "ۣۨۤ";
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    }
                    break;
                case 1748642:
                    m563(file7, str47);
                    if ((C0016.f9 ^ (C0015.f6 + 8573)) > 0) {
                        str18 = "ۣۨ۠";
                        iM240 = C0015.m573(str18);
                    } else {
                        C0013.m114();
                        str19 = "ۣ۟ۡ";
                        jsonObject = jsonObject2;
                        jsonObject2 = jsonObject;
                        iM240 = C0017.m731(str19);
                    }
                    break;
                case 1748645:
                case 1753668:
                    if (C0017.f10 / (C0015.f6 * (-5947)) != 0) {
                        C0015.f6 = 35;
                        str21 = "ۤۤ۟";
                        iM240 = C0016.m618(str21);
                    } else {
                        iM240 = C0013.f2 + C0016.f9 + 1751928;
                    }
                    break;
                case 1748649:
                    if (C0014.m275(itM549)) {
                        JsonObject jsonObject4 = (JsonObject) ((JsonElement) C0013.m115(itM549));
                        String[] strArrM282 = C0014.m280(C0013.m130(m511(m532(jsonObject4, C0017.m693(m516(), TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, 4, 1604)))), str35);
                        int length = strArrM282.length;
                        if (C0014.m245() >= 0) {
                            iM240 = C0014.m240("ۣ۟ۤ");
                            strArr3 = strArrM282;
                            jsonObject3 = jsonObject4;
                            i4 = length;
                            i5 = 0;
                        } else {
                            iM240 = (C0013.f2 % C0014.f3) + 1746679;
                            strArr3 = strArrM282;
                            jsonObject3 = jsonObject4;
                            i4 = length;
                            i5 = 0;
                        }
                    } else if (C0013.m114() >= 0) {
                        C0015.f6 = 7;
                        iM240 = C0013.m105("ۡ۟۠");
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) ^ (-1745983);
                    }
                    break;
                case 1748671:
                    if (C0015.f6 - (C0013.f2 | (-3142)) <= 0) {
                        C0014.m245();
                        iM240 = C0015.m573("ۥ۟ۧ");
                    } else {
                        iM240 = C0014.m240("ۤۦ");
                    }
                    break;
                case 1748673:
                    str28 = "ۣ۠۠";
                    orientationM145 = orientation;
                    orientation = orientationM145;
                    iM240 = C0015.m573(str28);
                    break;
                case 1748733:
                case 1753512:
                    if (C0013.f2 * (C0014.f3 - 8564) >= 0) {
                        str7 = "ۣۧۨ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        iM240 = C0016.m618(str7);
                    } else {
                        iM240 = (C0013.f2 / C0013.f2) + 1746686;
                    }
                    break;
                case 1748799:
                    file5 = new File(m545(), C0016.m608(m516(), 190, 8, 1630));
                    iM240 = (C0014.f3 ^ C0017.f10) + 1752156;
                    break;
                case 1748834:
                    iM240 = C0014.f3 >= 0 ? C0016.m618("ۣۥۡ") : (C0017.f10 | C0014.f3) + 1748977;
                    break;
                case 1748835:
                    if (!C0013.m164(str43)) {
                        if (C0015.f6 < 0) {
                            str20 = "ۡۨ";
                            iM240 = C0013.m105(str20);
                        } else {
                            C0015.m570();
                            str31 = "۠۠";
                            strM539 = str39;
                            strM562 = str38;
                            strM543 = str40;
                            str39 = strM539;
                            str38 = strM562;
                            str40 = strM543;
                            iM240 = C0013.m105(str31);
                        }
                    } else if (C0016.f9 % (C0016.f9 - 5553) <= 0) {
                        C0017.f10 = 30;
                        str15 = "ۣۨۤ";
                        file2 = file6;
                        file6 = file2;
                        iM240 = C0013.m105(str15);
                    } else {
                        iM240 = (C0013.f2 - C0017.f10) ^ 1752144;
                    }
                    break;
                case 1748858:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        str13 = "ۣ۟ۨ";
                        str14 = str44;
                        str44 = str14;
                        iM240 = C0015.m573(str13);
                    } else {
                        iM240 = (C0014.f3 | C0017.f10) + 56602;
                    }
                    break;
                case 1749574:
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 99;
                        iM240 = C0014.m240("ۥۢ۟");
                    } else {
                        str2 = "ۤۡۢ";
                        iM240 = C0013.m105(str2);
                    }
                    break;
                case 1749578:
                case 1754501:
                    if (C0016.f9 % (C0016.f9 - 5553) <= 0) {
                        C0017.f10 = 30;
                        str15 = "ۣۨۤ";
                        file2 = file6;
                        file6 = file2;
                        iM240 = C0013.m105(str15);
                    } else {
                        iM240 = (C0013.f2 - C0017.f10) ^ 1752144;
                    }
                    break;
                case 1749601:
                case 1754379:
                    if (C0015.f6 >= 0) {
                        iM240 = C0016.m618("ۥۥۡ");
                    } else {
                        str23 = "ۡۥۣ";
                        iM240 = C0016.m618(str23);
                    }
                    break;
                case 1749666:
                    if (C0016.f9 > 0) {
                        str17 = "ۦ۟۠";
                        iM240 = C0016.m618(str17);
                    } else {
                        C0017.f10 = 73;
                        str16 = "۠ۥ۟";
                        orientationM285 = orientation2;
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    }
                    break;
                case 1749667:
                case 1753601:
                    if ((C0017.f10 ^ (C0017.f10 % (-2254))) == 0) {
                        str = "ۥۡۡ";
                        iM240 = C0016.m618(str);
                    } else {
                        C0016.f9 = 87;
                        str2 = "ۣۡۢ";
                        iM240 = C0013.m105(str2);
                    }
                    break;
                case 1749758:
                case 1753508:
                    if (C0017.f10 < 0) {
                        str15 = "ۧۦۨ";
                        file2 = file6;
                        file6 = file2;
                        iM240 = C0013.m105(str15);
                    } else {
                        C0014.m245();
                        str22 = "ۡ۟ۢ";
                        iM240 = C0014.m240(str22);
                    }
                    break;
                case 1749820:
                    C0014.m223(calendar, 6, -6);
                    String strM610 = C0016.m610(simpleDateFormat2, C0016.m633(calendar));
                    if (C0016.f9 - (C0014.f3 / 67) <= 0) {
                        C0014.f3 = 60;
                        str45 = strM610;
                        iM240 = C0016.m618("ۧۧ۟");
                    } else {
                        str45 = strM610;
                        iM240 = (C0014.f3 * C0016.f9) + 1926397;
                    }
                    break;
                case 1749855:
                    file2 = new File(m543(), C0014.m250(m516(), 198, 17, AnalyticsListener.EVENT_PLAYER_RELEASED));
                    str15 = "ۤۥۢ";
                    file6 = file2;
                    iM240 = C0013.m105(str15);
                    break;
                case 1750536:
                    C0013.m180(iOException);
                    str27 = "ۨۥۥ";
                    iM240 = C0015.m573(str27);
                    break;
                case 1750562:
                    int i9 = i3 + 1;
                    if ((C0013.f2 ^ (C0015.f6 - 3611)) >= 0) {
                        iM240 = C0014.m240("۟ۥۨ");
                        i3 = i9;
                    } else {
                        iM240 = (C0013.f2 % C0014.f3) + 1752483;
                        i3 = i9;
                    }
                    break;
                case 1750565:
                    if (C0014.f3 - (C0017.f10 % (-2189)) <= 0) {
                        str4 = "۠ۢۧ";
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        reentrantLockM534 = reentrantLock;
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000M507;
                        reentrantLock = reentrantLockM534;
                        iM240 = C0013.m105(str4);
                    } else {
                        iM240 = C0016.f9 + C0013.f2 + 1746905;
                    }
                    break;
                case 1750593:
                    C0016.m649(reentrantLock);
                    iM240 = (C0015.f6 | C0014.f3) + 1747005;
                    break;
                case 1750664:
                    if (i3 < 11) {
                        str12 = new String[]{strM561, strM527, strM508, strM503, strM506, str36, str37, str38, str39, str40, str41}[i3];
                        if (str12 != null) {
                            str11 = "ۨۡ";
                            str42 = str12;
                            iM240 = C0013.m105(str11);
                        } else {
                            str26 = "ۨۢۡ";
                            str42 = str12;
                            iM240 = C0017.m731(str26);
                        }
                    } else if (C0015.f6 >= 0) {
                        iM240 = C0016.m618("ۥۥۡ");
                    } else {
                        str23 = "ۡۥۣ";
                        iM240 = C0016.m618(str23);
                    }
                    break;
                case 1750687:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1362O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = strArrM281;
                    if (C0014.m245() < 0) {
                        str5 = "ۥ۠ۤ";
                        iM240 = C0014.m240(str5);
                    } else {
                        str34 = "۠ۦ۟";
                        iM240 = C0014.m240(str34);
                    }
                    break;
                case 1750693:
                    if ((C0017.f10 | (C0017.f10 / (-711))) >= 0) {
                        C0015.m570();
                        iM240 = C0016.m618("ۣۧ۟");
                        i8 = i;
                    } else {
                        iM240 = (C0017.f10 ^ C0015.f6) + 1753521;
                        i8 = i;
                    }
                    break;
                case 1750719:
                    int length2 = strArr2.length;
                    if (C0015.f6 + (C0017.f10 * (-4813)) <= 0) {
                        C0015.m570();
                        i7 = length2;
                        iM240 = C0017.m731("ۤۨ");
                    } else {
                        i7 = length2;
                        iM240 = (C0015.f6 % C0016.f9) ^ (-1750214);
                    }
                    break;
                case 1750726:
                    iM240 = C0017.f10 >= 0 ? C0016.m618("ۥۣ۟") : C0017.m731("ۥۧۨ");
                    break;
                case 1750812:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 32;
                        iM240 = C0013.m105("ۢۢ");
                    } else {
                        str16 = "۟ۡۦ";
                        orientationM285 = orientation2;
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    }
                    break;
                case 1750819:
                    String strM149 = C0013.m149(C0017.m681());
                    if (C0016.f9 / (C0014.f3 ^ 9572) != 0) {
                        str43 = strM149;
                        iM240 = C0014.m240("۟ۧۨ");
                    } else {
                        str43 = strM149;
                        iM240 = (C0017.f10 % C0017.f10) + 1748835;
                    }
                    break;
                case 1751499:
                    if ((C0017.f10 | (C0013.f2 % 4520)) >= 0) {
                        C0017.m717();
                        orientation2 = orientation;
                        iM240 = C0014.m240("۟ۢ۟");
                    } else {
                        orientation2 = orientation;
                        iM240 = C0016.m618("۟۠ۡ");
                    }
                    break;
                case 1751523:
                    str = "ۣۤۨ";
                    iM240 = C0016.m618(str);
                    break;
                case 1751525:
                    if (!C0013.m109(file5)) {
                        str23 = "ۢۨۥ";
                        iM240 = C0016.m618(str23);
                    } else if (C0017.m717() < 0) {
                        str15 = "ۥۨ";
                        file2 = file6;
                        file6 = file2;
                        iM240 = C0013.m105(str15);
                    } else {
                        C0016.m574();
                        str20 = "ۦۧ۟";
                        iM240 = C0013.m105(str20);
                    }
                    break;
                case 1751560:
                case 1751775:
                    if (C0016.m574() >= 0) {
                        C0014.f3 = 22;
                        str11 = "ۨۦۨ";
                        str12 = str42;
                        str42 = str12;
                        iM240 = C0013.m105(str11);
                    } else {
                        iM240 = C0016.m618("ۨۦۤ");
                    }
                    break;
                case 1751590:
                    file3 = file4;
                    file4 = file3;
                    str23 = "ۣ۠۟";
                    iM240 = C0016.m618(str23);
                    break;
                case 1751594:
                    try {
                        Integer numM228 = C0014.m228(C0013.m97(C0017.m681()));
                        if (C0014.m245() >= 0) {
                            num2 = numM228;
                            iM240 = C0015.m573("ۣۨۡ");
                        } else {
                            strM539 = str39;
                            strM543 = str40;
                            num = numM228;
                            str39 = strM539;
                            str40 = strM543;
                            num2 = num;
                            iM240 = C0017.m731("ۨۤ");
                        }
                    } catch (Exception e4) {
                        e = e4;
                        if (C0016.f9 <= 0) {
                            C0015.f6 = 83;
                            exc = e;
                            iM240 = C0016.m618("ۡۦۨ");
                        } else {
                            str30 = "ۦۢۡ";
                            exc = e;
                            iM240 = C0017.m731(str30);
                        }
                    }
                    break;
                case 1751655:
                    if (m509() != null) {
                        if (C0014.f3 >= 0) {
                            C0017.m717();
                            iM240 = C0013.m105("ۥۨ");
                        } else {
                            iM240 = C0013.m105("ۧۢ۟");
                        }
                    } else if (C0014.m245() >= 0) {
                        iM240 = C0015.m573("ۦۡۨ");
                    } else {
                        str13 = "ۥ۠ۧ";
                        str14 = str44;
                        str44 = str14;
                        iM240 = C0015.m573(str13);
                    }
                    break;
                case 1751681:
                    if (!C0013.m172(file6)) {
                        if (C0017.f10 + (C0017.f10 / (-438)) >= 0) {
                            str17 = "ۧۨۡ";
                            iM240 = C0016.m618(str17);
                        } else {
                            str18 = "ۨۤۧ";
                            iM240 = C0015.m573(str18);
                        }
                    } else if (C0017.f10 * C0014.f3 * 6769 > 0) {
                        str6 = "۠۠ۤ";
                        iM240 = C0017.m731(str6);
                    } else {
                        str5 = "ۣۨۤ";
                        iM240 = C0014.m240(str5);
                    }
                    break;
                case 1751712:
                    int i10 = i8 + 1;
                    if (C0013.f2 * C0014.f3 * (-7202) <= 0) {
                        C0013.f2 = 72;
                        iM240 = C0016.m618("ۥۡۧ");
                        i8 = i10;
                    } else {
                        iM240 = (C0014.f3 ^ C0017.f10) ^ 1748289;
                        i8 = i10;
                    }
                    break;
                case 1751715:
                    return;
                case 1751780:
                    if (m525() == null) {
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(7, false);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new MutableLiveData();
                        str7 = "ۧۤۡ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        iM240 = C0016.m618(str7);
                    } else if (C0016.m574() >= 0) {
                    }
                    break;
                case 1752462:
                    try {
                        Cursor cursorM701 = C0017.m701(sQLiteDatabaseM523, C0017.m693(m516(), TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 47, 2682), new String[]{str45});
                        if (C0017.m717() >= 0) {
                            C0016.f9 = 66;
                            cursor = cursorM701;
                            iM240 = C0016.m618("ۦۣ۟");
                        } else {
                            cursor = cursorM701;
                            iM240 = C0014.f3 + C0014.f3 + 1748366;
                        }
                    } catch (Throwable th2) {
                        if (C0015.f6 + C0013.f2 + 3983 <= 0) {
                            C0017.m717();
                            th = th2;
                            iM240 = C0016.m618("ۨۦ۠");
                        } else {
                            th = th2;
                            iM240 = C0015.m573("ۦۥ۠");
                        }
                    }
                    break;
                case 1752489:
                    if (C0016.f9 * (C0014.f3 ^ (-1239)) <= 0) {
                        C0013.m114();
                        iM240 = C0015.m573("۟ۥ");
                    } else {
                        iM240 = (C0013.f2 * C0017.f10) ^ (-1104542);
                    }
                    break;
                case 1752492:
                    String strM519 = m519(C0017.m693(m516(), 304, 13, 2521));
                    if (!C0016.m622(strM519)) {
                        jsonObject = (JsonObject) m552(new Gson(), strM519, JsonObject.class);
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jsonObject;
                        if (C0015.f6 >= 0) {
                            C0017.f10 = 69;
                            jsonObject2 = jsonObject;
                            iM240 = C0016.m618("۟۠۠");
                        } else {
                            str19 = "ۨۦ۠";
                            jsonObject2 = jsonObject;
                            iM240 = C0017.m731(str19);
                        }
                    } else if (C0013.m114() >= 0) {
                        C0015.f6 = 7;
                        iM240 = C0013.m105("ۡ۟۠");
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) ^ (-1745983);
                    }
                    break;
                case 1752493:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = m551();
                    str6 = "ۦۥۢ";
                    iM240 = C0017.m731(str6);
                    break;
                case 1752515:
                case 1754438:
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM240 = C0016.m618("ۦ۠ۨ");
                    } else {
                        iM240 = (C0017.f10 - C0016.f9) + 1749503;
                    }
                    break;
                case 1752517:
                    C0014.m253(reentrantLock);
                    if (C0016.f9 > 0) {
                        iM240 = C0016.m618("ۢ۠");
                    } else {
                        str26 = "ۡۤ۟";
                        str12 = str42;
                        str42 = str12;
                        iM240 = C0017.m731(str26);
                    }
                    break;
                case 1752523:
                    if (C0017.f10 % (C0015.f6 * (-1276)) >= 0) {
                        C0014.f3 = 47;
                        iM240 = C0013.m105("ۨۤۦ");
                    } else {
                        str15 = "ۡۦۢ";
                        file2 = file6;
                        file6 = file2;
                        iM240 = C0013.m105(str15);
                    }
                    break;
                case 1752546:
                    if ((C0016.f9 | (C0013.f2 - 1791)) < 0) {
                        str16 = "ۧۧۢ";
                        orientationM285 = orientation2;
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    } else {
                        C0015.m570();
                        str25 = "۟ۨۡ";
                        iM240 = C0016.m618(str25);
                    }
                    break;
                case 1752555:
                    str14 = strArr[1];
                    if (C0015.f6 < 0) {
                        str13 = "ۡ۟ۤ";
                        str44 = str14;
                        iM240 = C0015.m573(str13);
                    } else {
                        str27 = "ۣۡ۟";
                        str44 = str14;
                        iM240 = C0015.m573(str27);
                    }
                    break;
                case 1752585:
                    String strM153 = C0013.m153(m516(), PsExtractor.PRIVATE_STREAM_1, 1, 449);
                    String strM526 = m526();
                    if (strM526 != null) {
                        File file9 = new File(strM526);
                        if (C0014.m264(file9) && C0013.m183(file9)) {
                            if (C0013.f2 - (C0017.f10 - 9986) <= 0) {
                                str35 = strM153;
                                iM240 = C0014.m240("ۣۧ");
                            } else {
                                str8 = strM153;
                                str9 = "ۤ۠۟";
                                str35 = str8;
                                iM240 = C0013.m105(str9);
                            }
                        }
                        break;
                    }
                    str35 = strM153;
                    if ((C0015.f6 ^ (C0016.f9 % (-5681))) >= 0) {
                        str10 = "ۥ۠ۨ";
                        iM240 = C0014.m240(str10);
                    } else {
                        C0014.m245();
                        str23 = "ۦۧۡ";
                        iM240 = C0016.m618(str23);
                    }
                    break;
                case 1752612:
                    if (C0013.m114() >= 0) {
                        C0016.f9 = 5;
                        str = "ۨۨۨ";
                        iM240 = C0016.m618(str);
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) + 1752523;
                    }
                    break;
                case 1752613:
                    str12 = str42;
                    str11 = "ۨۡ";
                    str42 = str12;
                    iM240 = C0013.m105(str11);
                    break;
                case 1752703:
                    if (C0013.m172(file5)) {
                        iM240 = (C0015.f6 - C0017.f10) ^ 1751408;
                    } else {
                        if ((C0015.f6 ^ (C0017.f10 + 4053)) >= 0) {
                            str17 = "ۨۥۡ";
                        } else {
                            str17 = "۟ۤۨ";
                        }
                        iM240 = C0016.m618(str17);
                    }
                    break;
                case 1752710:
                    iM240 = (C0015.f6 | (C0013.f2 * (-9180))) >= 0 ? C0014.m240("ۣۢۢ") : (C0017.f10 * C0017.f10) + 1179974;
                    break;
                case 1753415:
                    if (sQLiteDatabaseM523 == null) {
                        if (C0016.f9 <= 0) {
                            C0015.f6 = 68;
                            iM240 = C0017.m731("ۢۢۢ");
                        } else {
                            str24 = "۟۟۟";
                            iM240 = C0016.m618(str24);
                        }
                    } else if ((C0016.f9 | (C0013.f2 - 1791)) < 0) {
                        C0015.m570();
                        str25 = "۟ۨۡ";
                        iM240 = C0016.m618(str25);
                    } else {
                        str16 = "ۧۧۢ";
                        orientationM285 = orientation2;
                        orientation2 = orientationM285;
                        iM240 = C0016.m618(str16);
                    }
                    break;
                case 1753509:
                case 1753662:
                    iM240 = C0015.f6 + C0013.f2 + 1755207;
                    break;
                case 1753538:
                    iM240 = C0013.f2 + C0015.f6 + 1750528;
                    break;
                case 1753603:
                    m568(m556());
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 26;
                        iM240 = C0016.m618("ۢ۠");
                    } else {
                        iM240 = C0013.f2 + C0016.f9 + 1753849;
                    }
                    break;
                case 1753637:
                    C0013.m137(m556());
                    C0013.m168(m554());
                    m531();
                    m513();
                    m559();
                    m558();
                    m529(m505());
                    strM545 = str36;
                    strM553 = str37;
                    str36 = strM545;
                    str37 = strM553;
                    iM240 = C0014.m240("ۤۨۨ");
                    break;
                case 1753670:
                    if (i8 < i7) {
                        strM512 = m512(m510(strArr2[i8], C0016.m608(m516(), TbsListener.ErrorCode.THROWABLE_INITX5CORE, 1, 1588)), m550(), C0016.m608(m516(), TbsListener.ErrorCode.ERROR_CPU_NOT_SUPPORT, 5, 2132));
                        file = new File(strM512);
                        if (!C0013.m172(file)) {
                            str23 = "ۤۦۢ";
                            str47 = strM512;
                            file7 = file;
                            iM240 = C0016.m618(str23);
                        } else if (C0013.m109(file)) {
                            str47 = strM512;
                            file7 = file;
                            str22 = "ۡ۠ۡ";
                            iM240 = C0014.m240(str22);
                        } else {
                            str47 = strM512;
                            file7 = file;
                            iM240 = C0014.m240("ۡۡۡ");
                        }
                    } else {
                        strArrM538 = strArr2;
                        if ((C0013.f2 | (C0017.f10 ^ 5860)) >= 0) {
                            strArr2 = strArrM538;
                            iM240 = C0014.m240("ۥۥۧ");
                        } else {
                            strArr2 = strArrM538;
                            iM240 = (C0016.f9 | C0017.f10) + 1751928;
                        }
                    }
                    break;
                case 1753701:
                    iM240 = C0014.f3 + C0017.f10 + 57267;
                    break;
                case 1754413:
                    C0013.m137(m524());
                    iM240 = (C0017.f10 - C0016.f9) + 1752386;
                    break;
                case 1754446:
                    if ((C0015.f6 ^ (C0016.f9 % (-5681))) >= 0) {
                        str10 = "ۥ۠ۨ";
                        iM240 = C0014.m240(str10);
                    } else {
                        C0014.m245();
                        str23 = "ۦۧۡ";
                        iM240 = C0016.m618(str23);
                    }
                    break;
                case 1754468:
                    str32 = "ۣ۟ۢ";
                    iM240 = C0015.m573(str32);
                    break;
                case 1754477:
                    iM240 = (C0014.f3 - C0017.f10) + 1746397;
                    break;
                case 1754532:
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2085O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                    if (C0015.m570() <= 0) {
                        C0017.m717();
                        iM240 = C0016.m618("ۣ۠ۢ");
                    } else {
                        iM240 = C0015.m573("۠ۦ۟");
                    }
                    break;
                case 1754538:
                case 1755462:
                    if (C0015.f6 % (C0015.f6 ^ 736) >= 0) {
                        C0016.f9 = 2;
                        iM240 = C0014.m240("ۤۧۡ");
                    } else {
                        str10 = "ۨۥۥ";
                        iM240 = C0014.m240(str10);
                    }
                    break;
                case 1754563:
                    str23 = "ۢۨۥ";
                    iM240 = C0016.m618(str23);
                    break;
                case 1754601:
                    if (i6 < i4) {
                        C0014.m233(m528(), C0017.m718(strArr3[i6]), jsonObject3);
                        iM240 = (C0016.f9 * C0014.f3) + 1928597;
                        i6++;
                    } else {
                        str18 = "ۡ۠ۨ";
                        iM240 = C0015.m573(str18);
                    }
                    break;
                case 1754626:
                    simpleDateFormat = new SimpleDateFormat(C0017.m693(m516(), TbsListener.ErrorCode.RENAME_FAIL, 10, 3065));
                    calendarM251 = C0014.m251();
                    if (C0014.f3 * C0014.f3 * 5330 <= 0) {
                        C0014.f3 = 82;
                        calendar = calendarM251;
                        simpleDateFormat2 = simpleDateFormat;
                        iM240 = C0017.m731("ۤۢۤ");
                    } else {
                        str9 = "ۢۧۡ";
                        str8 = str35;
                        calendar = calendarM251;
                        simpleDateFormat2 = simpleDateFormat;
                        str35 = str8;
                        iM240 = C0013.m105(str9);
                    }
                    break;
                case 1754655:
                    iM240 = (C0016.f9 * C0017.f10) ^ (-1304231);
                    break;
                case 1754656:
                    C0017.m702(file6);
                    if (C0016.f9 + (C0016.f9 % (-3672)) <= 0) {
                        C0015.m570();
                        calendarM251 = calendar;
                        simpleDateFormat = simpleDateFormat2;
                        str9 = "ۢۧۡ";
                        str8 = str35;
                        calendar = calendarM251;
                        simpleDateFormat2 = simpleDateFormat;
                        str35 = str8;
                        iM240 = C0013.m105(str9);
                    } else {
                        iM240 = (C0013.f2 % C0015.f6) + 1752419;
                    }
                    break;
                case 1754662:
                    if (C0014.m245() >= 0) {
                        C0014.f3 = 64;
                        iM240 = C0014.m240("ۥۢۨ");
                    } else {
                        str33 = "ۢۥۡ";
                        iM240 = C0013.m105(str33);
                    }
                    break;
                case 1755431:
                    if (C0015.f6 - (C0017.f10 * 568) <= 0) {
                        C0016.f9 = 51;
                        iM240 = C0014.m240("ۨۨ");
                    } else {
                        str34 = "ۢ۠۟";
                        iM240 = C0014.m240(str34);
                    }
                    break;
                case 1755461:
                    m542(file7);
                    if (C0017.f10 / (C0014.f3 - 4998) != 0) {
                        C0016.f9 = 95;
                        str33 = "ۡ۠ۨ";
                        iM240 = C0013.m105(str33);
                    } else {
                        iM240 = (C0015.f6 - C0014.f3) + 1752106;
                    }
                    break;
                case 1755465:
                    if (C0015.m570() > 0) {
                        str29 = "۟ۢۨ";
                        iM240 = C0014.m240(str29);
                    } else {
                        C0017.m717();
                        str30 = "ۣۧۤ";
                        e = exc;
                        exc = e;
                        iM240 = C0017.m731(str30);
                    }
                    break;
                case 1755498:
                    m544(exc, new StringBuilder(C0013.m153(m516(), TbsListener.ErrorCode.UNLZMA_FAIURE, 9, 2939)), 1);
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 17;
                        iM240 = C0014.m240("ۤۡۥ");
                    } else {
                        iM240 = (C0016.f9 ^ C0013.f2) ^ 1753736;
                    }
                    break;
                case 1755522:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1363O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = orientation2;
                    if ((C0017.f10 ^ (C0016.f9 | 3301)) >= 0) {
                        C0017.m717();
                        iM240 = C0014.m240("۟ۨۧ");
                    } else {
                        iM240 = (C0014.f3 | C0017.f10) + 1750900;
                    }
                    break;
                case 1755528:
                    C0013.m137(m556());
                    m533();
                    C0016.m636(C0017.m681());
                    if (C0014.f3 + (C0017.f10 % 3863) >= 0) {
                        iM240 = C0017.m731("ۡۡۡ");
                    } else {
                        str8 = str35;
                        str9 = "ۧ۠ۦ";
                        str35 = str8;
                        iM240 = C0013.m105(str9);
                    }
                    break;
                case 1755554:
                    itM549 = m549(m541(m532(jsonObject2, C0014.m250(m516(), TypedValues.AttributesType.TYPE_EASING, 4, 2271))));
                    iM240 = (C0013.f2 * C0015.f6) + 2296749;
                    break;
                case 1755558:
                    strM561 = m561(m556());
                    strM527 = m527();
                    strM508 = m508();
                    strM503 = m503();
                    strM506 = m506();
                    strM545 = m545();
                    strM553 = m553();
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 72;
                        str36 = strM545;
                        str37 = strM553;
                        iM240 = C0014.m240("ۤۨۨ");
                    } else {
                        str36 = strM545;
                        str37 = strM553;
                        iM240 = (C0015.f6 / C0017.f10) + 1747928;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
