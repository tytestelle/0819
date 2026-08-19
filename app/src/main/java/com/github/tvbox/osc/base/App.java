package com.github.tvbox.osc.base;

import O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import android.content.Context;
import androidx.media3.exoplayer.Renderer;
import androidx.multidex.MultiDexApplication;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.dialog.C0016;
import com.github.tvbox.osc.ui.dialog.C0017;
import com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.unit.UnitsManager;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import xyz.doikki.videoplayer.exo.ExoMediaSourceHelper;

/* JADX INFO: loaded from: classes3.dex */
public class App extends MultiDexApplication implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static App f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f1short = {782, 836, 851, 851, 846, 851, 877, 846, 838, 3072, 3081, 3083, 21370, 21937, 23528, 23843, 26557, -30881, 2638, 2628, 2653, 1504, 452, 2828, 2841, 2843, 2893, 2835, 2828, 2841, 2843, 2893, -25967, -28691, 25023, 22387, 23505, 25128, 2670, 2660, 2660, 2179, 2193, 21461, -26805, -31663, -29056, -25322, -25883, 428, 425, 431, 3150, 3174, 3174, 3182, 3173, 3180, 2293, 2256, 2291, 2241, 2261, 2246, 2256, 1020, 984, 972, 969, 916, 2503, 2531, 2509, 2544, 2535, 2520, 2532, 2537, 2545, 2541, 2554, 1603, 1608, 1615, 1604, 1606, 1604, 1615, 1602, 2426, 2406, 2406, 2402, 2401, 2344, 2365, 2365, 2422, 2428, 2401, 2364, 2403, 2407, 2419, 2422, 2347, 2364, 2428, 2423, 2406, 2365, 2422, 2428, 2401, 2367, 2403, 2407, 2423, 2400, 2411, 815, 819, 819, 823, 820, 893, 872, 872, 803, 809, 820, 873, 806, 803, 800, 818, 806, 821, 803, 873, 804, 808, 810, 872, 803, 809, 820, 874, 822, 818, 802, 821, 830, 2846, 2818, 2818, 2822, 2821, 2892, 2905, 2905, 2834, 2840, 2821, 2904, 2833, 2841, 2841, 2833, 2842, 2835, 2905, 2834, 2840, 2821, 2907, 2823, 2819, 2835, 2820, 2831, 779, 791, 791, 787, 784, 857, 844, 844, 775, 780, 779, 845, 848, 853, 851, 845, 768, 781, 844, 775, 781, 784, 846, 786, 790, 774, 785, 794, 2206, 2178, 2178, 2182, 2181, 2252, 2265, 2265, 2194, 2200, 2181, 2264, 2199, 2202, 2207, 2194, 2200, 2181, 2264, 2197, 2201, 2203, 2265, 2194, 2200, 2181, 2267, 2183, 2179, 2195, 2180, 2191, 3134, 3106, 3106, 3110, 3109, 3180, 3193, 3193, 3122, 3129, 3134, 3192, 3110, 3107, 3124, 3193, 3122, 3128, 3109, 3195, 3111, 3107, 3123, 3108, 3119, 1548, 1576, 1540, 1580, 1281, 1285, 1318, 1306, 1306, 1310, 1325, 1282, 1287, 1291, 1280, 1306, 1358, 1363, 1363, 1358, 1280, 1307, 1282, 1282};

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static UnitsManager m46(Object obj, Object obj2) {
        String str;
        UnitsManager unitsManager;
        Object obj3;
        UnitsManager unitsManager2;
        int iM731 = C0017.m731("ۡۡۢ");
        UnitsManager supportSubunits = null;
        UnitsManager unitsManager3 = null;
        while (true) {
            switch (iM731) {
                case 56575:
                    iM731 = (C0013.f2 ^ C0017.f10) + 1749044;
                    break;
                case 1746875:
                    break;
                case 1746942:
                    if (C0016.f9 > 0) {
                        unitsManager = unitsManager3;
                        obj3 = "ۡ۠ۥ";
                        unitsManager2 = unitsManager;
                        iM731 = C0014.m240(obj3);
                        unitsManager3 = unitsManager2;
                    } else {
                        C0015.m570();
                        str = "ۨۧ";
                        iM731 = C0013.m105(str);
                    }
                    break;
                case 1747685:
                    iM731 = C0017.m717() >= 0 ? C0014.m240("ۡۧ۠") : (C0017.f10 / C0015.f6) + 1747741;
                    break;
                case 1747742:
                case 1748889:
                    if (C0015.m570() <= 0) {
                        C0013.m114();
                        iM731 = C0015.m573("ۧۧۨ");
                    } else {
                        iM731 = (C0014.f3 % C0017.f10) + 1747090;
                    }
                    break;
                case 1748646:
                    str = "۠۠ۥ";
                    unitsManager3 = null;
                    iM731 = C0013.m105(str);
                    break;
                case 1748674:
                    if (C0016.m574() >= 0) {
                        iM731 = (C0016.f9 - C0013.f2) ^ (-1746853);
                    } else {
                        str = "ۦۢۥ";
                        iM731 = C0013.m105(str);
                    }
                    break;
                case 1748858:
                    if (C0015.f6 % (C0016.f9 + 730) >= 0) {
                        unitsManager = supportSubunits;
                        obj3 = "ۡ۠ۥ";
                        unitsManager2 = unitsManager;
                        iM731 = C0014.m240(obj3);
                        unitsManager3 = unitsManager2;
                    } else {
                        iM731 = (C0015.f6 * C0013.f2) + 2294975;
                        unitsManager3 = supportSubunits;
                    }
                    break;
                case 1750756:
                    iM731 = (C0016.f9 - C0013.f2) ^ (-1746853);
                    break;
                case 1753513:
                    supportSubunits = ((UnitsManager) obj).setSupportSubunits((Subunits) obj2);
                    obj3 = "ۡۧ۠";
                    unitsManager2 = unitsManager3;
                    iM731 = C0014.m240(obj3);
                    unitsManager3 = unitsManager2;
                    break;
                default:
                    break;
            }
            return unitsManager3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m47(Object obj, long j, Object obj2) {
        String str;
        OkHttpClient.Builder builderWriteTimeout;
        int iM240 = C0014.m240("۠ۡۧ");
        OkHttpClient.Builder builder = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM240) {
                case 56506:
                case 1747841:
                    if ((C0015.f6 | (C0015.f6 / 1371)) >= 0) {
                        C0017.f10 = 51;
                        str = "ۢۨۨ";
                        builderWriteTimeout = builder;
                        iM240 = C0016.m618(str);
                        builder = builderWriteTimeout;
                    } else {
                        iM240 = (C0015.f6 % C0014.f3) + 1750779;
                    }
                    break;
                case 1746786:
                    iM240 = (C0015.f6 % C0014.f3) + 1748020;
                    break;
                case 1746973:
                    if (C0016.f9 <= 0) {
                        iM240 = C0017.m731("۠ۥۦ");
                        builder2 = builder;
                    } else {
                        str = "ۣۡۦ";
                        builderWriteTimeout = builder;
                        builder2 = builder;
                        iM240 = C0016.m618(str);
                        builder = builderWriteTimeout;
                    }
                    break;
                case 1747718:
                    if (C0017.m717() <= 0) {
                        if ((C0015.f6 | (C0016.f9 / 9656)) >= 0) {
                            C0015.m570();
                            iM240 = C0016.m618("ۦ۠");
                        } else {
                            iM240 = (C0016.f9 ^ C0013.f2) + 1751539;
                        }
                    } else if (C0015.f6 + (C0016.f9 ^ 6930) <= 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۦۤۢ");
                    } else {
                        iM240 = C0014.m240("ۥ۟ۤ");
                    }
                    break;
                case 1747749:
                    iM240 = (C0015.f6 - C0015.f6) + 1747718;
                    break;
                case 1750570:
                    if (C0015.f6 + (C0016.f9 ^ 6930) <= 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۦۤۢ");
                    } else {
                        iM240 = C0014.m240("ۥ۟ۤ");
                    }
                    break;
                case 1750600:
                    break;
                case 1751712:
                    builderWriteTimeout = ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
                    str = "۟ۨۦ";
                    iM240 = C0016.m618(str);
                    builder = builderWriteTimeout;
                    break;
                case 1751778:
                    if (C0015.f6 >= 0) {
                        C0017.f10 = 31;
                        iM240 = C0013.m105("۠ۡۧ");
                        builder2 = null;
                    } else {
                        str = "۟ۢۥ";
                        builderWriteTimeout = builder;
                        builder2 = null;
                        iM240 = C0016.m618(str);
                        builder = builderWriteTimeout;
                    }
                    break;
                case 1752458:
                    iM240 = C0017.m731("ۤۨۦ");
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x004a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static DnsOverHttps.Builder m48(Object obj, Object obj2) {
        String str;
        DnsOverHttps.Builder builder;
        String str2;
        int iM240 = C0014.m240("ۣۣ۠");
        DnsOverHttps.Builder builderUrl = null;
        DnsOverHttps.Builder builder2 = null;
        while (true) {
            switch (iM240) {
                case 1746873:
                    if (C0015.f6 - (C0013.f2 / 8923) >= 0) {
                        C0015.m570();
                        str2 = "۟ۥۤ";
                    } else {
                        str2 = "ۣۤۧ";
                    }
                    iM240 = C0016.m618(str2);
                    break;
                case 1746878:
                    iM240 = C0017.f10 / (C0016.f9 % 7691) != 0 ? C0016.m618("۟ۨۦ") : C0013.f2 + C0015.f6 + 1755235;
                    break;
                case 1747651:
                    iM240 = (C0015.f6 | C0013.f2) + 1750753;
                    break;
                case 1747812:
                    builderUrl = ((DnsOverHttps.Builder) obj).url((HttpUrl) obj2);
                    iM240 = C0014.m245() >= 0 ? C0014.m240("ۣۤۧ") : (C0014.f3 ^ C0015.f6) + 1751021;
                    break;
                case 1750656:
                    if (C0017.m717() <= 0) {
                        if ((C0017.f10 | (C0017.f10 ^ (-5955))) >= 0) {
                            str = "ۧۥۨ";
                            builder = builder2;
                            iM240 = C0015.m573(str);
                            builder2 = builder;
                        } else {
                            iM240 = (C0016.f9 / C0017.f10) + 1747813;
                        }
                    } else if (C0017.f10 / (C0016.f9 % 7691) != 0) {
                    }
                    break;
                case 1751715:
                    str = "ۥۣۢ";
                    builder = builderUrl;
                    iM240 = C0015.m573(str);
                    builder2 = builder;
                    break;
                case 1751744:
                case 1754570:
                    iM240 = C0017.m731((C0013.f2 | (C0017.f10 / (-750))) <= 0 ? "ۤ۠۟" : "ۥۣۢ");
                    break;
                case 1752550:
                    break;
                case 1755526:
                    iM240 = C0016.m618("ۨۧۨ");
                    break;
                case 1755593:
                    if (C0017.m717() >= 0) {
                        C0014.m245();
                        iM240 = C0017.m731("ۣۣ۠");
                        builder2 = null;
                    } else {
                        iM240 = (C0013.f2 | C0015.f6) + 1746970;
                        builder2 = null;
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m49() {
        String str;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        int iM105 = C0013.m105("۟۠ۡ");
        while (true) {
            switch (iM105) {
                case 1746720:
                    if (C0017.m717() <= 0) {
                        str = "ۨ۟ۤ";
                    } else if (C0014.f3 * (C0015.f6 + 2208) >= 0) {
                        C0014.f3 = 2;
                        iM105 = C0013.m105("ۢۡۢ");
                    } else {
                        str = "ۣۤۤ";
                    }
                    iM105 = C0014.m240(str);
                    break;
                case 1746723:
                    if (C0013.f2 * (C0015.f6 | (-4857)) >= 0) {
                        C0014.f3 = 72;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM105 = C0013.m105("۠ۤۦ");
                    } else {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM105 = (C0017.f10 - C0014.f3) + 1749435;
                    }
                    break;
                case 1746750:
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 50;
                        str = "ۧ۟ۤ";
                        iM105 = C0014.m240(str);
                    } else {
                        iM105 = (C0016.f9 ^ C0013.f2) ^ 1746829;
                    }
                    break;
                case 1747810:
                case 1750818:
                    if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM105 = C0015.m573("۟ۧ۠");
                    } else {
                        iM105 = C0017.m731("ۣۡۨ");
                    }
                    break;
                case 1748892:
                    break;
                case 1750531:
                    if (C0014.f3 * (C0015.f6 + 2208) >= 0) {
                        C0014.f3 = 2;
                        iM105 = C0013.m105("ۢۡۢ");
                    } else {
                        str = "ۣۤۤ";
                        iM105 = C0014.m240(str);
                    }
                    break;
                case 1751651:
                    if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("ۨ۟ۤ");
                    } else {
                        iM105 = (C0017.f10 + C0017.f10) ^ (-1756205);
                    }
                    break;
                case 1753640:
                    if ((C0017.f10 ^ (C0014.f3 / 6245)) >= 0) {
                        C0013.f2 = 75;
                        iM105 = C0017.m731("۟۠ۡ");
                    } else {
                        iM105 = C0017.m731("ۣۨۧ");
                    }
                    break;
                case 1755341:
                    O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NONE;
                    iM105 = 1746722 ^ (C0016.f9 / C0016.f9);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
                    break;
                case 1755591:
                    if (C0017.f10 % (C0015.f6 - 3143) >= 0) {
                        C0013.f2 = 89;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
                        iM105 = C0014.m240("ۣۤۤ");
                    } else {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
                        iM105 = (C0013.f2 - C0016.f9) + 1753549;
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟۠ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Subunits m50() {
        String str;
        int iM618 = C0016.m618("ۡۧۢ");
        Subunits subunits = null;
        Subunits subunits2 = null;
        while (true) {
            switch (iM618) {
                case 1747873:
                case 1749667:
                    if ((C0017.f10 | C0015.f6 | (-9781)) >= 0) {
                        C0015.f6 = 60;
                        str = "ۧۥۧ";
                        iM618 = C0016.m618(str);
                    } else {
                        iM618 = (C0013.f2 - C0016.f9) + 1754507;
                    }
                    break;
                case 1748860:
                    if (C0017.m717() < 0) {
                        iM618 = (C0015.f6 / C0014.f3) + 1753663;
                    } else if (C0015.f6 * (C0017.f10 ^ (-6105)) >= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۡۢۨ");
                    } else {
                        iM618 = (C0013.f2 % C0017.f10) ^ 1753832;
                    }
                    break;
                case 1749633:
                    if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM618 = C0017.m731("ۨۢۢ");
                        subunits2 = subunits;
                    } else {
                        subunits2 = subunits;
                        iM618 = C0016.m618("ۧۦۥ");
                    }
                    break;
                case 1751618:
                    if (C0013.f2 - (C0016.f9 | (-881)) <= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("ۧۦۥ");
                    } else {
                        iM618 = (C0016.f9 | C0014.f3) + 1749882;
                    }
                    break;
                case 1752648:
                    str = "ۣۤۡ";
                    subunits2 = null;
                    iM618 = C0016.m618(str);
                    break;
                case 1753665:
                    subunits = Subunits.MM;
                    if (C0016.f9 - (C0017.f10 | 841) <= 0) {
                        C0013.f2 = 42;
                    }
                    iM618 = C0016.m618("ۢۡ۠");
                    break;
                case 1753702:
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 39;
                        iM618 = C0015.m573("ۡۧۢ");
                    } else {
                        iM618 = (C0015.f6 / C0017.f10) + 1752648;
                    }
                    break;
                case 1754380:
                    if (C0015.f6 * (C0017.f10 ^ (-6105)) >= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۡۢۨ");
                    } else {
                        iM618 = (C0013.f2 % C0017.f10) ^ 1753832;
                    }
                    break;
                case 1754598:
                    break;
                case 1755432:
                    if ((C0016.f9 | (C0016.f9 + 5945)) <= 0) {
                        C0013.m114();
                        iM618 = C0013.m105("ۥۤۢ");
                    } else {
                        iM618 = C0015.m573("ۡۧۢ");
                    }
                    break;
                default:
                    break;
            }
            return subunits2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m51(Object obj) {
        String str;
        String str2;
        String str3;
        List list = null;
        List list2 = null;
        int iM573 = C0015.m573("ۥۦۧ");
        while (true) {
            switch (iM573) {
                case 1746727:
                    str3 = "ۤۨ۟";
                    iM573 = C0014.m240(str3);
                    break;
                case 1746940:
                case 1750539:
                    str2 = C0013.m114() >= 0 ? "۠۠۟" : "ۧۧۥ";
                    iM573 = C0016.m618(str2);
                    break;
                case 1748734:
                    List listImmutableList = Util.immutableList((Object[]) obj);
                    if (C0016.f9 / (C0016.f9 * 8748) != 0) {
                        iM573 = C0014.m240("ۤۨ۟");
                        list = listImmutableList;
                    } else {
                        iM573 = (-1749767) ^ (C0015.f6 ^ C0013.f2);
                        list = listImmutableList;
                    }
                    break;
                case 1749730:
                    if (C0015.m570() <= 0) {
                        C0016.m574();
                        list2 = list;
                        iM573 = C0014.m240("ۥۦۧ");
                    } else {
                        list2 = list;
                        iM573 = (C0016.f9 - C0017.f10) ^ 1753114;
                    }
                    break;
                case 1750540:
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 37;
                        iM573 = C0017.m731("ۥۦۦ");
                    } else {
                        str = "ۣ۟ۧ";
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1751771:
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 99;
                    }
                    list2 = null;
                    iM573 = C0016.m618("ۣ۟ۨ");
                    break;
                case 1752677:
                    if (C0017.f10 + (C0016.f9 | (-9624)) < 0) {
                        str2 = "۟۠ۨ";
                        iM573 = C0016.m618(str2);
                    } else {
                        C0014.f3 = 91;
                        str = "ۢ۟";
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1752678:
                    if (C0014.m245() < 0) {
                        if ((C0014.f3 ^ (C0017.f10 / 6622)) >= 0) {
                            str3 = "۟ۧۤ";
                            iM573 = C0014.m240(str3);
                        } else {
                            iM573 = C0013.m105("ۣۡ۠");
                        }
                    } else if (C0017.f10 + (C0016.f9 | (-9624)) < 0) {
                        C0014.f3 = 91;
                        str = "ۢ۟";
                        iM573 = C0017.m731(str);
                    } else {
                        str2 = "۟۠ۨ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1753516:
                    iM573 = (C0015.f6 * C0017.f10) + 1291056;
                    break;
                case 1754629:
                    break;
                default:
                    break;
            }
            return list2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡۧۨ۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m52(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        int iM573 = C0015.m573("ۥۨۤ");
        OkHttpClient okHttpClientBuild = null;
        OkHttpClient okHttpClient = null;
        while (true) {
            switch (iM573) {
                case 1746749:
                    if (C0014.m245() >= 0) {
                        str3 = "ۦۡۤ";
                        iM573 = C0015.m573(str3);
                    } else {
                        iM573 = (C0015.f6 | C0016.f9) + 1752802;
                    }
                    break;
                case 1747779:
                    if (C0017.f10 >= 0) {
                        C0016.f9 = 17;
                        str2 = "ۧۥۦ";
                    } else {
                        str2 = "ۨۥ۟";
                    }
                    iM573 = C0015.m573(str2);
                    break;
                case 1748826:
                    break;
                case 1750562:
                    okHttpClientBuild = ((OkHttpClient.Builder) obj).build();
                    if (C0017.m717() < 0) {
                        str2 = "ۧۥۦ";
                        iM573 = C0015.m573(str2);
                    } else {
                        C0017.f10 = 45;
                        str = "۟ۡ۟";
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1750662:
                    if (C0014.m245() >= 0) {
                        iM573 = C0013.m105("ۥۣ۟");
                    } else {
                        str4 = "ۥۣ۟";
                        iM573 = C0017.m731(str4);
                    }
                    break;
                case 1750814:
                    if (C0015.f6 >= 0) {
                        C0016.f9 = 51;
                        str4 = "ۡۤۨ";
                    } else {
                        str4 = "ۣۣۦ";
                    }
                    iM573 = C0017.m731(str4);
                    break;
                case 1752577:
                    if (C0014.f3 >= 0) {
                        iM573 = C0014.m240("ۡۦ۟");
                        okHttpClient = null;
                    } else {
                        str = "ۣ۠ۦ";
                        okHttpClient = null;
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1752737:
                    if (C0015.m570() < 0) {
                        if (C0015.f6 >= 0) {
                            C0016.f9 = 51;
                            str4 = "ۡۤۨ";
                        } else {
                            str4 = "ۣۣۦ";
                        }
                        iM573 = C0017.m731(str4);
                    } else if (C0014.f3 >= 0) {
                        C0013.m114();
                        iM573 = C0017.m731("ۣۣۨ");
                    } else {
                        str4 = "ۣ۠۟";
                        iM573 = C0017.m731(str4);
                    }
                    break;
                case 1753480:
                case 1755522:
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 66;
                        iM573 = C0015.m573("ۢۢۤ");
                    } else {
                        str3 = "ۡۦ۟";
                        iM573 = C0015.m573(str3);
                    }
                    break;
                case 1754568:
                    str4 = "ۡۦ۟";
                    okHttpClient = okHttpClientBuild;
                    iM573 = C0017.m731(str4);
                    break;
                default:
                    break;
            }
            return okHttpClient;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static void m53(Object obj, Object obj2) {
        int iM618 = C0016.m618("۟ۦۦ");
        while (true) {
            switch (iM618) {
                case 1746911:
                    if (C0017.m717() <= 0) {
                        iM618 = C0014.f3 / (C0017.f10 ^ 1917) != 0 ? C0016.m618("ۣ۠۠") : (C0015.f6 | C0014.f3) + 1748923;
                    }
                    break;
                case 1747773:
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 86;
                        iM618 = C0014.m240("ۨۡ۟");
                    } else {
                        iM618 = (C0017.f10 ^ C0014.f3) ^ 1746428;
                        continue;
                    }
                    break;
                case 1748858:
                    ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj2);
                    if (C0016.f9 + C0013.f2 + 359 <= 0) {
                        C0014.f3 = 95;
                    }
                    iM618 = C0014.m240("ۥۡ۟");
                    continue;
                case 1751648:
                    break;
                case 1752488:
                    iM618 = (C0014.f3 % C0016.f9) + 1753848;
                    continue;
                case 1752515:
                    return;
                case 1752708:
                case 1753633:
                    if (C0015.f6 % (C0013.f2 * 9419) >= 0) {
                        C0014.f3 = 38;
                        iM618 = C0015.m573("ۢۥۦ");
                    } else {
                        iM618 = (C0017.f10 / C0013.f2) + 1752515;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM618 = C0014.f3 >= 0 ? C0016.m618("ۡ۟۟") : (C0017.f10 | C0017.f10) ^ (-1752926);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m54() {
        String str;
        String str2;
        String str3;
        int iM618 = C0016.m618("ۤ۟ۥ");
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            switch (iM618) {
                case 56475:
                case 1755500:
                    iM618 = (C0013.f2 * C0014.f3) ^ (-1594521);
                    break;
                case 1746755:
                    break;
                case 1747777:
                    if ((C0016.f9 ^ (C0014.f3 + 7825)) <= 0) {
                        C0017.m717();
                        str3 = "ۨۦ۟";
                    } else {
                        str3 = "ۤ۟ۥ";
                    }
                    iM618 = C0013.m105(str3);
                    break;
                case 1747896:
                    if (C0017.f10 + (C0013.f2 - 6140) >= 0) {
                        C0016.m574();
                        str = "ۤۦۦ";
                        arrayList2 = null;
                    } else {
                        str = "ۤۢۨ";
                        arrayList2 = null;
                    }
                    iM618 = C0015.m573(str);
                    break;
                case 1750748:
                    arrayList = O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if ((C0014.f3 ^ (C0017.f10 / (-9815))) >= 0) {
                        str2 = "ۤ۟ۥ";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0013.f2 ^ C0015.f6) + 1752201;
                    }
                    break;
                case 1751498:
                    if (C0014.m245() < 0) {
                        if (C0015.f6 >= 0) {
                            C0017.m717();
                            iM618 = C0017.m731("ۥۨۨ");
                        } else {
                            str = "ۣۦ۟";
                            iM618 = C0015.m573(str);
                        }
                    } else if (C0013.f2 - (C0015.f6 / 3150) <= 0) {
                        C0016.m574();
                        iM618 = C0017.m731("ۨ۠ۢ");
                    } else {
                        iM618 = (C0016.f9 / C0014.f3) + 1755564;
                    }
                    break;
                case 1751594:
                    iM618 = C0014.f3 / (C0013.f2 * 16) != 0 ? C0015.m573("۟ۡۥ") : (C0016.f9 + C0013.f2) ^ 1757121;
                    break;
                case 1751716:
                    iM618 = (C0013.f2 - C0015.f6) ^ 1745574;
                    arrayList2 = arrayList;
                    break;
                case 1752741:
                    if (C0013.f2 - (C0015.f6 / 3150) <= 0) {
                        C0016.m574();
                        iM618 = C0017.m731("ۨ۠ۢ");
                    } else {
                        iM618 = (C0016.f9 / C0014.f3) + 1755564;
                    }
                    break;
                case 1755561:
                    if (C0016.f9 <= 0) {
                        C0016.m574();
                        iM618 = C0014.m240("ۥ۠");
                    } else {
                        str2 = "۠ۧ۟";
                        iM618 = C0013.m105(str2);
                    }
                    break;
                default:
                    break;
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m55() {
        int iM573 = C0015.m573("ۧ۠ۤ");
        String strUserAgent = null;
        String str = null;
        while (true) {
            switch (iM573) {
                case 56477:
                    strUserAgent = Version.userAgent();
                    break;
                case 56575:
                    str = strUserAgent;
                    iM573 = C0015.m573("ۢۢۥ");
                    break;
                case 1746724:
                    iM573 = C0013.m105("ۢۨۨ");
                    break;
                case 1746876:
                    if (C0016.f9 <= 0) {
                        C0016.f9 = 46;
                        iM573 = C0015.m573("۟ۥۢ");
                        str = null;
                    } else {
                        iM573 = C0017.m731("ۥۣۤ");
                        str = null;
                    }
                    break;
                case 1748646:
                case 1754570:
                    iM573 = C0014.m240(C0015.f6 * (C0014.f3 % 6456) <= 0 ? "ۡۤۡ" : "ۢۢۥ");
                    break;
                case 1749669:
                    break;
                case 1749858:
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 44;
                        iM573 = C0015.m573("ۢۢۥ");
                    } else {
                        iM573 = (C0015.f6 / C0013.f2) ^ 1746876;
                    }
                    break;
                case 1751559:
                    iM573 = (C0016.f9 - C0016.f9) + 1754411;
                    break;
                case 1752612:
                    iM573 = C0016.m574() >= 0 ? C0015.m573("ۧ۠ۤ") : (C0017.f10 - C0014.f3) + 1749189;
                    break;
                case 1754411:
                    if (C0014.m245() < 0) {
                        iM573 = C0017.f10 - (C0013.f2 + 5835) < 0 ? (C0017.f10 * C0017.f10) - 518087 : C0014.m240("ۨۧ");
                    } else {
                        iM573 = C0013.m105("ۢۨۨ");
                    }
                    break;
                default:
                    break;
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۢۦۣۤ, reason: not valid java name and contains not printable characters */
    public static UnitsManager m56(Object obj, boolean z) {
        UnitsManager unitsManager;
        String str;
        String str2;
        UnitsManager supportDP = null;
        UnitsManager unitsManager2 = null;
        int iM573 = C0015.m573("ۧۦ");
        while (true) {
            switch (iM573) {
                case 56350:
                case 1752523:
                    iM573 = C0013.f2 <= 0 ? C0017.m731("ۣۥ۟") : (C0015.f6 * C0014.f3) ^ 1787222;
                    break;
                case 56543:
                    if (C0016.m574() < 0) {
                        if (C0014.f3 * C0016.f9 * 5276 >= 0) {
                            iM573 = C0015.m573("ۣ۠ۤ");
                        } else {
                            unitsManager = unitsManager2;
                            iM573 = C0017.m731("ۡۧۦ");
                            unitsManager2 = unitsManager;
                        }
                    } else if (C0014.f3 < 0) {
                        C0015.f6 = 56;
                        str = "ۣۣ";
                        iM573 = C0017.m731(str);
                    } else {
                        str2 = "ۢۢۧ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1746935:
                    if (C0014.m245() >= 0) {
                        C0017.m717();
                        unitsManager2 = supportDP;
                        iM573 = C0017.m731("ۤۧۤ");
                    } else {
                        unitsManager2 = supportDP;
                        iM573 = (C0013.f2 * C0016.f9) ^ 1156613;
                    }
                    break;
                case 1747807:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        unitsManager = null;
                        iM573 = C0017.m731("ۡۧۦ");
                        unitsManager2 = unitsManager;
                    } else {
                        unitsManager2 = null;
                        iM573 = (C0017.f10 + C0017.f10) ^ (-1752982);
                    }
                    break;
                case 1748864:
                    supportDP = ((UnitsManager) obj).setSupportDP(z);
                    iM573 = C0017.m731(C0013.f2 <= 0 ? "ۥۡۧ" : "۟ۧ۟");
                    break;
                case 1749671:
                    str = "ۣ۠ۤ";
                    iM573 = C0017.m731(str);
                    break;
                case 1751585:
                    break;
                case 1751678:
                    iM573 = (C0016.f9 - C0015.f6) ^ 55700;
                    break;
                case 1751745:
                    if (C0014.f3 < 0) {
                        str2 = "ۢۢۧ";
                        iM573 = C0016.m618(str2);
                    } else {
                        C0015.f6 = 56;
                        str = "ۣۣ";
                        iM573 = C0017.m731(str);
                    }
                    break;
                case 1752518:
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        str2 = "ۣ۟۠";
                    } else {
                        str2 = "ۧۦ";
                    }
                    iM573 = C0016.m618(str2);
                    break;
                default:
                    break;
            }
            return unitsManager2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m57(Object obj, boolean z) {
        OkHttpClient.Builder builder;
        String str;
        OkHttpClient.Builder builderFollowRedirects = null;
        OkHttpClient.Builder builder2 = null;
        int iM731 = C0017.m731("ۧۢۤ");
        while (true) {
            switch (iM731) {
                case 1746937:
                    break;
                case 1748678:
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        builder = null;
                        iM731 = C0015.m573("ۢ۠ۧ");
                        builder2 = builder;
                    } else {
                        builder2 = null;
                        iM731 = (C0017.f10 * C0013.f2) ^ (-1104435);
                    }
                    break;
                case 1748705:
                    if ((C0013.f2 ^ (C0013.f2 % (-8165))) != 0) {
                    }
                    iM731 = C0015.m573("ۡۡۦ");
                    break;
                case 1748710:
                    iM731 = (C0016.f9 + C0014.f3) ^ 1748147;
                    break;
                case 1749609:
                    builder2 = builderFollowRedirects;
                    iM731 = (C0016.f9 | C0015.f6) + 1747002;
                    break;
                case 1749634:
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        str = "ۨۤ";
                        iM731 = C0015.m573(str);
                    } else {
                        iM731 = C0016.m618("ۧۢۤ");
                    }
                    break;
                case 1749663:
                    builderFollowRedirects = ((OkHttpClient.Builder) obj).followRedirects(z);
                    if (C0013.m114() < 0) {
                        builder = builder2;
                        iM731 = C0015.m573("ۢ۠ۧ");
                        builder2 = builder;
                    } else {
                        C0013.f2 = 91;
                        iM731 = C0016.m618("ۢۢ۟");
                    }
                    break;
                case 1749733:
                    iM731 = C0013.m105("ۥ۟ۢ");
                    break;
                case 1750633:
                case 1752456:
                    str = "۟ۧۡ";
                    iM731 = C0015.m573(str);
                    break;
                case 1754473:
                    if (C0015.m570() <= 0) {
                        iM731 = (C0016.f9 + C0014.f3) ^ 1748147;
                    } else if (C0015.f6 >= 0) {
                        C0016.f9 = 39;
                        iM731 = C0017.m731("ۢۡۡ");
                    } else {
                        iM731 = C0016.m618("ۢۢ۟");
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m58(Object obj, boolean z) {
        String str;
        String str2;
        String str3;
        int iM573 = C0015.m573("ۧۦۨ");
        OkHttpClient.Builder builderRetryOnConnectionFailure = null;
        OkHttpClient.Builder builder = null;
        while (true) {
            switch (iM573) {
                case 1747774:
                    str3 = (C0017.f10 | (C0016.f9 + (-3824))) >= 0 ? "ۧۨۢ" : "ۧۦۨ";
                    iM573 = C0015.m573(str3);
                    break;
                case 1747898:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 18;
                        str = "ۣ۠ۡ";
                        builder = null;
                        iM573 = C0016.m618(str);
                    } else {
                        iM573 = (C0017.f10 ^ C0015.f6) ^ 1753803;
                        builder = null;
                    }
                    break;
                case 1747902:
                    if (C0015.f6 + (C0017.f10 ^ 3963) >= 0) {
                        C0017.m717();
                        iM573 = C0017.m731("ۥۧۡ");
                    } else {
                        str = "۠ۧۡ";
                        iM573 = C0016.m618(str);
                    }
                    break;
                case 1752640:
                    break;
                case 1752703:
                    if ((C0016.f9 | (C0013.f2 - 7972)) >= 0) {
                        str2 = "۠ۢۨ";
                        iM573 = C0014.m240(str2);
                    } else {
                        iM573 = (C0017.f10 ^ C0015.f6) ^ 1747755;
                    }
                    break;
                case 1753578:
                    iM573 = C0015.m573("ۥۥ۠");
                    builder = builderRetryOnConnectionFailure;
                    break;
                case 1753669:
                case 1755401:
                    str3 = "ۥۥ۠";
                    iM573 = C0015.m573(str3);
                    break;
                case 1753694:
                    iM573 = (C0016.f9 - C0016.f9) + 1753669;
                    break;
                case 1754601:
                    if (C0017.m717() < 0) {
                        if (C0013.f2 / (C0016.f9 - 3419) != 0) {
                            C0013.m114();
                            iM573 = C0015.m573("ۦۤۨ");
                        } else {
                            iM573 = (C0015.f6 * C0014.f3) ^ 1783517;
                        }
                    } else if ((C0016.f9 | (C0013.f2 - 7972)) >= 0) {
                        str2 = "۠ۢۨ";
                        iM573 = C0014.m240(str2);
                    } else {
                        iM573 = (C0017.f10 ^ C0015.f6) ^ 1747755;
                    }
                    break;
                case 1755562:
                    builderRetryOnConnectionFailure = ((OkHttpClient.Builder) obj).retryOnConnectionFailure(z);
                    str2 = "ۦۤۨ";
                    iM573 = C0014.m240(str2);
                    break;
                default:
                    break;
            }
            return builder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x002c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m59(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int iM573 = C0015.m573("ۡۡۧ");
        while (true) {
            switch (iM573) {
                case 1747867:
                    str3 = "ۧۤۢ";
                    iM573 = C0015.m573(str3);
                    break;
                case 1748679:
                    if (C0015.m570() >= 0) {
                        if (C0015.f6 >= 0) {
                            C0014.m245();
                            iM573 = C0015.m573("ۣۡۢ");
                        } else {
                            iM573 = (C0013.f2 % C0013.f2) ^ 1752584;
                        }
                    } else if (C0017.m717() < 0) {
                        C0014.f3 = 2;
                        str3 = "ۣۨۨ";
                        iM573 = C0015.m573(str3);
                    } else {
                        str2 = "۠ۦۡ";
                        iM573 = C0013.m105(str2);
                    }
                    break;
                case 1748706:
                    if (C0017.m717() < 0) {
                        str2 = "۠ۦۡ";
                        iM573 = C0013.m105(str2);
                    } else {
                        C0014.f3 = 2;
                        str3 = "ۣۨۨ";
                        iM573 = C0015.m573(str3);
                    }
                    break;
                case 1751715:
                    break;
                case 1752485:
                case 1754533:
                    if (C0013.f2 > 0) {
                        str2 = "ۤۦۥ";
                        iM573 = C0013.m105(str2);
                    } else {
                        C0015.m570();
                        str = "۠ۦۥ";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1752584:
                    ((AddressItem) obj).setLiveUrlName((String) obj2);
                    if (C0016.f9 + (C0014.f3 | (-81)) <= 0) {
                        C0013.m114();
                        iM573 = C0014.m240("ۤۦۥ");
                    } else {
                        str = "ۤۦۥ";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1754383:
                    if ((C0016.f9 | (C0017.f10 / (-5747))) <= 0) {
                        C0013.f2 = 36;
                        str2 = "ۨۢ۠";
                        iM573 = C0013.m105(str2);
                    } else {
                        iM573 = (C0015.f6 ^ C0017.f10) + 1748530;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x002f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m60(Object obj, Object obj2) {
        int iM618 = C0016.m618("ۣۡۤ");
        while (true) {
            switch (iM618) {
                case 56352:
                    ((AddressItem) obj).setLiveUrl((String) obj2);
                    if ((C0013.f2 ^ (C0013.f2 * TbsListener.ErrorCode.INFO_CORE_NOT_EXIST)) <= 0) {
                        C0015.m570();
                        iM618 = C0016.m618("ۣۡۤ");
                    } else {
                        iM618 = C0014.f3 + C0014.f3 + 1747400;
                    }
                    break;
                case 56357:
                    if (C0013.f2 - (C0016.f9 | 9758) >= 0) {
                        C0016.f9 = 71;
                        iM618 = C0013.m105("۠ۨۤ");
                    } else {
                        iM618 = (C0017.f10 * C0014.f3) ^ 1619409;
                    }
                    break;
                case 1746904:
                case 1748863:
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 78;
                        iM618 = C0016.m618("ۨۡۤ");
                    } else {
                        iM618 = (C0013.f2 * C0015.f6) + 2295070;
                    }
                    break;
                case 1746970:
                    break;
                case 1747718:
                    if ((C0014.f3 | (C0017.f10 % (-2185))) >= 0) {
                        C0013.m114();
                        iM618 = C0014.m240("ۣۣۨ");
                    } else {
                        iM618 = (C0013.f2 - C0016.f9) ^ 1748859;
                    }
                    break;
                case 1748768:
                    if (C0016.m574() <= 0) {
                        if (C0015.f6 % (C0015.f6 % 2140) != 0) {
                            iM618 = C0014.m240("ۡۧۥ");
                        } else {
                            iM618 = C0015.m573(str);
                        }
                    } else if (C0013.f2 - (C0016.f9 | 9758) >= 0) {
                        C0016.f9 = 71;
                        iM618 = C0013.m105("۠ۨۤ");
                    } else {
                        iM618 = (C0017.f10 * C0014.f3) ^ 1619409;
                    }
                    break;
                case 1755467:
                    String str = C0014.m245() >= 0 ? "ۡۡ" : "ۡۧۥ";
                    iM618 = C0015.m573(str);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static void m61(Object obj) {
        String str;
        String str2;
        int iM105 = C0013.m105("ۦۡۤ");
        while (true) {
            switch (iM105) {
                case 56414:
                case 1746967:
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        iM105 = C0016.m618("ۣۢۦ");
                    } else {
                        str2 = "ۧۡۨ";
                        iM105 = C0016.m618(str2);
                    }
                    break;
                case 1751777:
                    if ((C0016.f9 ^ (C0016.f9 / 4163)) <= 0) {
                        C0014.m245();
                        iM105 = C0013.m105("ۡۢۧ");
                    } else {
                        iM105 = (C0014.f3 * C0015.f6) ^ 1785595;
                    }
                    break;
                case 1753481:
                    if (C0017.m717() <= 0) {
                        iM105 = C0016.f9 % (C0016.f9 ^ 1230) <= 0 ? C0017.m731("ۦۡۧ") : C0016.f9 + C0015.f6 + 1755233;
                    } else if ((C0016.f9 ^ (C0016.f9 / 4163)) <= 0) {
                        C0014.m245();
                        iM105 = C0013.m105("ۡۢۧ");
                    } else {
                        iM105 = (C0014.f3 * C0015.f6) ^ 1785595;
                    }
                    break;
                case 1753484:
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        str = "ۦۤۧ";
                    } else {
                        str = "ۣۡ";
                    }
                    iM105 = C0016.m618(str);
                    break;
                case 1753577:
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 93;
                        str2 = "ۣۧۡ";
                        iM105 = C0016.m618(str2);
                    } else {
                        iM105 = (C0016.f9 / C0015.f6) ^ (-1753482);
                    }
                    break;
                case 1754446:
                    break;
                case 1755433:
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO((Runnable) obj);
                    if (C0017.f10 - (C0016.f9 / TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAX_TRIED_ERR) >= 0) {
                        C0017.f10 = 49;
                        iM105 = C0017.m731("۟ۨ۠");
                    } else {
                        iM105 = (C0013.f2 / C0017.f10) + 1754447;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static AutoSizeConfig m62() {
        String str;
        String str2;
        String str3;
        int iM240 = C0014.m240("ۨۥ۟");
        AutoSizeConfig autoSizeConfig = null;
        AutoSizeConfig autoSizeConfig2 = null;
        while (true) {
            switch (iM240) {
                case 1746812:
                    if (C0013.f2 % (C0013.f2 + 1769) <= 0) {
                        iM240 = C0016.m618("ۤۥۧ");
                        autoSizeConfig2 = null;
                    } else {
                        iM240 = C0016.m618("ۣۨۨ");
                        autoSizeConfig2 = null;
                    }
                    break;
                case 1747712:
                case 1751686:
                    if ((C0013.f2 | (C0014.f3 * 3403)) >= 0) {
                        C0015.f6 = 7;
                        str3 = "ۣۢۥ";
                        iM240 = C0016.m618(str3);
                    } else {
                        iM240 = (C0013.f2 ^ C0014.f3) + 1756287;
                    }
                    break;
                case 1748769:
                    str3 = "ۢۥۧ";
                    iM240 = C0016.m618(str3);
                    break;
                case 1749764:
                    iM240 = C0016.f9 <= 0 ? C0013.m105("ۥۦۦ") : (C0013.f2 / C0013.f2) ^ 1746813;
                    break;
                case 1750694:
                    if (C0017.f10 - (C0014.f3 - 5167) > 0) {
                        autoSizeConfig2 = autoSizeConfig;
                        str2 = "ۨۢۦ";
                        iM240 = C0014.m240(str2);
                    } else {
                        C0013.f2 = 50;
                        str = "ۨۥ۟";
                        autoSizeConfig2 = autoSizeConfig;
                        iM240 = C0013.m105(str);
                    }
                    break;
                case 1750819:
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        str2 = "ۨۢۦ";
                    } else {
                        str2 = "ۤۥۧ";
                    }
                    iM240 = C0014.m240(str2);
                    break;
                case 1752677:
                    autoSizeConfig = AutoSizeConfig.getInstance();
                    iM240 = C0014.m240(C0013.f2 <= 0 ? "ۡۤۤ" : "ۣۤۧ");
                    break;
                case 1754378:
                    iM240 = C0013.f2 + C0013.f2 + 1753722;
                    break;
                case 1755436:
                    break;
                case 1755522:
                    if (C0016.m574() > 0) {
                        str3 = "ۢۥۧ";
                        iM240 = C0016.m618(str3);
                    } else if (C0015.f6 / (C0013.f2 | 7189) != 0) {
                        C0014.m245();
                        iM240 = C0016.m618("۠ۡۡ");
                    } else {
                        str = "ۥۦۦ";
                        iM240 = C0013.m105(str);
                    }
                    break;
                default:
                    break;
            }
            return autoSizeConfig2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static UnitsManager m63(Object obj, boolean z) {
        String str;
        int iM105 = C0013.m105("ۡ۠۟");
        UnitsManager supportSP = null;
        UnitsManager unitsManager = null;
        while (true) {
            switch (iM105) {
                case 1746692:
                    iM105 = (C0017.f10 % C0013.f2) + 1756344;
                    unitsManager = null;
                    break;
                case 1746882:
                    iM105 = C0015.f6 + C0017.f10 + 1750007;
                    break;
                case 1748640:
                    iM105 = C0014.m245() <= 0 ? C0016.m618("ۦۤۡ") : (C0013.f2 | C0017.f10) ^ (-1753715);
                    break;
                case 1748860:
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("ۡ۠۟");
                        unitsManager = supportSP;
                    } else {
                        iM105 = (C0015.f6 | C0015.f6) + 1756140;
                        unitsManager = supportSP;
                    }
                    break;
                case 1750755:
                case 1755616:
                    iM105 = C0014.m240("ۨۥۨ");
                    break;
                case 1753571:
                    supportSP = ((UnitsManager) obj).setSupportSP(z);
                    str = C0017.f10 - (C0016.f9 / (-2402)) >= 0 ? "ۨۥۨ" : "ۡۧۢ";
                    iM105 = C0014.m240(str);
                    break;
                case 1753603:
                    str = "۟۟ۤ";
                    iM105 = C0014.m240(str);
                    break;
                case 1755531:
                    break;
                case 1755585:
                    break;
                case 1755586:
                    if ((C0014.f3 | C0016.f9 | (-9511)) >= 0) {
                        C0014.f3 = 87;
                        iM105 = C0014.m240("۟۟ۤ");
                    } else {
                        iM105 = (C0015.f6 * C0015.f6) + 1384735;
                    }
                    break;
                default:
                    break;
            }
            return unitsManager;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۤۦۡۡ, reason: not valid java name and contains not printable characters */
    public static ConnectionSpec m64() {
        String str;
        ConnectionSpec connectionSpec = null;
        ConnectionSpec connectionSpec2 = null;
        int iM105 = C0013.m105("ۤ۠ۡ");
        while (true) {
            switch (iM105) {
                case 56448:
                    iM105 = (C0017.f10 % C0015.f6) + 1755704;
                    break;
                case 1747899:
                case 1752550:
                    iM105 = (C0015.f6 ^ C0015.f6) + 1752643;
                    break;
                case 1749671:
                    ConnectionSpec connectionSpec3 = ConnectionSpec.RESTRICTED_TLS;
                    iM105 = 1750815 + (C0013.f2 % C0013.f2);
                    connectionSpec = connectionSpec3;
                    break;
                case 1750536:
                    if (C0013.f2 <= 0) {
                        C0015.f6 = 42;
                        connectionSpec2 = null;
                        iM105 = C0017.m731("ۧۨۧ");
                    } else {
                        connectionSpec2 = null;
                        iM105 = C0014.m240("ۨۡۧ");
                    }
                    break;
                case 1750815:
                    if (C0015.f6 - (C0013.f2 * (-6654)) <= 0) {
                        C0015.f6 = 94;
                        connectionSpec2 = connectionSpec;
                        iM105 = C0014.m240("ۣ۟ۤ");
                    } else {
                        connectionSpec2 = connectionSpec;
                        iM105 = 1752302 ^ (C0013.f2 + C0014.f3);
                    }
                    break;
                case 1751525:
                    if (C0014.m245() <= 0) {
                        iM105 = C0017.m731(C0015.m570() <= 0 ? "۠ۧۢ" : "ۢۢۧ");
                    } else {
                        iM105 = (C0017.f10 % C0015.f6) + 1755704;
                    }
                    break;
                case 1752643:
                    break;
                case 1754662:
                    if ((C0017.f10 | (C0017.f10 ^ 1168)) >= 0) {
                        C0013.m114();
                        str = "ۢۨۨ";
                    } else {
                        str = "ۤ۠ۡ";
                    }
                    iM105 = C0014.m240(str);
                    break;
                case 1755406:
                    if ((C0015.f6 | (C0015.f6 / 4391)) >= 0) {
                        C0017.m717();
                        iM105 = C0015.m573("ۨۦۡ");
                    } else {
                        iM105 = (C0015.f6 / C0013.f2) + 1752550;
                    }
                    break;
                case 1755555:
                    if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM105 = C0014.m240("ۨۡۧ");
                    } else {
                        iM105 = (C0017.f10 - C0017.f10) + 1750536;
                    }
                    break;
                default:
                    break;
            }
            return connectionSpec2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static ConnectionSpec m65() {
        String str;
        String str2;
        int iM618 = C0016.m618("ۡۨ");
        ConnectionSpec connectionSpec = null;
        ConnectionSpec connectionSpec2 = null;
        while (true) {
            switch (iM618) {
                case 56359:
                    if (C0016.m574() < 0) {
                        if (C0016.m574() >= 0) {
                            C0013.f2 = 3;
                            iM618 = C0014.m240("ۢ۟۠");
                        } else {
                            str2 = "ۣۢۧ";
                            iM618 = C0013.m105(str2);
                        }
                    } else if (C0013.m114() >= 0) {
                        C0016.f9 = 23;
                        iM618 = C0017.m731("ۥۢۥ");
                    } else {
                        iM618 = (C0013.f2 - C0013.f2) + 1746906;
                    }
                    break;
                case 56542:
                    if (C0013.f2 * (C0013.f2 ^ (-8496)) >= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۡۡۨ");
                    } else {
                        iM618 = (C0016.f9 | C0016.f9) + 55550;
                    }
                    break;
                case 1746906:
                    if (C0015.m570() <= 0) {
                        C0016.f9 = 58;
                        str2 = "ۨۢۥ";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = C0014.m240("ۣ۟ۨ");
                    }
                    break;
                case 1749571:
                    str = "ۦۦ۟";
                    connectionSpec2 = connectionSpec;
                    iM618 = C0014.m240(str);
                    break;
                case 1749702:
                    connectionSpec = ConnectionSpec.MODERN_TLS;
                    if (C0015.m570() <= 0) {
                        C0014.f3 = 1;
                        iM618 = C0015.m573("ۣۣ۟");
                    } else {
                        iM618 = (C0016.f9 * C0013.f2) + 1021471;
                    }
                    break;
                case 1750540:
                    iM618 = (C0017.f10 ^ C0016.f9) + 1755882;
                    connectionSpec2 = null;
                    break;
                case 1750655:
                    if (C0013.m114() >= 0) {
                        C0016.f9 = 23;
                        iM618 = C0017.m731("ۥۢۥ");
                    } else {
                        iM618 = (C0013.f2 - C0013.f2) + 1746906;
                    }
                    break;
                case 1753631:
                    break;
                case 1755405:
                    iM618 = (C0013.f2 - C0014.f3) + 1754349;
                    break;
                case 1755435:
                case 1755464:
                    if (C0017.m717() >= 0) {
                        str = "ۦۧۦ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = (C0014.f3 + C0013.f2) ^ 1753266;
                    }
                    break;
                default:
                    break;
            }
            return connectionSpec2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x005f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m66() {
        String str;
        String str2;
        String str3;
        int iM618 = C0016.m618("ۢۧ۟");
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            switch (iM618) {
                case 56480:
                case 1754442:
                    if (C0013.m114() < 0) {
                        str2 = "ۢۨ۟";
                        iM618 = C0013.m105(str2);
                    } else {
                        C0015.f6 = 17;
                        str3 = "ۨۨۧ";
                        iM618 = C0017.m731(str3);
                    }
                    break;
                case 1746786:
                    if (C0017.f10 / (C0015.f6 - 3866) != 0) {
                        C0013.m114();
                        iM618 = C0015.m573("ۧۡۤ");
                    } else {
                        iM618 = (C0017.f10 - C0016.f9) + 58047;
                    }
                    break;
                case 1747746:
                    if (C0017.m717() >= 0) {
                        C0016.f9 = 6;
                        iM618 = C0014.m240("ۥۦۧ");
                    } else {
                        iM618 = C0017.f10 + C0017.f10 + 1753290;
                    }
                    break;
                case 1749818:
                    if (C0015.m570() <= 0) {
                        if (C0017.m717() >= 0) {
                            C0016.f9 = 6;
                            iM618 = C0014.m240("ۥۦۧ");
                        } else {
                            iM618 = C0017.f10 + C0017.f10 + 1753290;
                        }
                    } else if ((C0013.f2 ^ (C0017.f10 / (-8089))) > 0) {
                        str3 = "ۧ۠ۢ";
                        iM618 = C0017.m731(str3);
                    } else {
                        C0017.f10 = 96;
                        str = "ۦۡۤ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1749849:
                    break;
                case 1749854:
                    if ((C0016.f9 ^ (C0014.f3 * (-9848))) <= 0) {
                        C0015.m570();
                        iM618 = C0014.m240("۟ۢۥ");
                        sArr2 = null;
                    } else {
                        str = "۟ۢۥ";
                        sArr2 = null;
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1751774:
                    if (C0015.f6 - (C0015.f6 % (-4762)) != 0) {
                        C0015.m570();
                        iM618 = C0017.m731("ۢۧ۟");
                    } else {
                        str2 = "ۢۨۤ";
                        iM618 = C0013.m105(str2);
                    }
                    break;
                case 1753476:
                    str = "ۢۨ۟";
                    sArr2 = sArr;
                    iM618 = C0014.m240(str);
                    break;
                case 1753481:
                    if (C0014.f3 % (C0013.f2 | (-4323)) >= 0) {
                        C0017.m717();
                        str2 = "ۥۦۥ";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0016.f9 % C0014.f3) + 1749654;
                    }
                    break;
                case 1754409:
                    sArr = f1short;
                    iM618 = (C0017.f10 * C0013.f2) + 2435676;
                    break;
                default:
                    break;
            }
            return sArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static DnsOverHttps m67() {
        String str;
        DnsOverHttps dnsOverHttps;
        String str2;
        int iM731 = C0017.m731("ۣۢۥ");
        DnsOverHttps dnsOverHttps2 = null;
        DnsOverHttps dnsOverHttps3 = null;
        while (true) {
            switch (iM731) {
                case 1747807:
                    if (C0014.f3 >= 0) {
                        iM731 = C0016.m618("ۣۡۨ");
                        dnsOverHttps3 = dnsOverHttps2;
                    } else {
                        str2 = "ۢ۠ۤ";
                        dnsOverHttps = dnsOverHttps2;
                        dnsOverHttps3 = dnsOverHttps2;
                        iM731 = C0014.m240(str2);
                        dnsOverHttps2 = dnsOverHttps;
                    }
                    break;
                case 1747834:
                case 1750539:
                    iM731 = C0015.f6 + C0014.f3 + 1750430;
                    break;
                case 1748892:
                    iM731 = C0014.f3 + (C0014.f3 / 295) >= 0 ? C0013.m105("ۣۧۨ") : (C0014.f3 % C0013.f2) ^ (-1751703);
                    break;
                case 1749606:
                    break;
                case 1749700:
                    if (C0014.m245() < 0) {
                        iM731 = C0015.f6 - (C0013.f2 / (-1180)) >= 0 ? C0014.m240("ۢ۠ۤ") : (C0014.f3 + C0016.f9) ^ 1751253;
                    } else if (C0014.f3 + (C0014.f3 / 295) >= 0) {
                    }
                    break;
                case 1751616:
                    if (C0017.f10 >= 0) {
                        C0017.f10 = 66;
                        iM731 = C0015.m573("ۤۥۢ");
                    } else {
                        iM731 = C0016.f9 + C0014.f3 + 1754000;
                    }
                    break;
                case 1751681:
                    iM731 = (C0015.f6 | C0017.f10) + 1750309;
                    break;
                case 1751687:
                    dnsOverHttps = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0013.f2 % (C0014.f3 | 7402) <= 0) {
                        C0015.f6 = 19;
                        str2 = "ۣۤ۟";
                        iM731 = C0014.m240(str2);
                        dnsOverHttps2 = dnsOverHttps;
                    } else {
                        iM731 = C0014.m240("ۣ۠ۤ");
                        dnsOverHttps2 = dnsOverHttps;
                    }
                    break;
                case 1754594:
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 17;
                        iM731 = C0017.m731("ۣ۟ۧ");
                        dnsOverHttps3 = null;
                    } else {
                        iM731 = (C0017.f10 % C0013.f2) ^ (-1755966);
                        dnsOverHttps3 = null;
                    }
                    break;
                case 1755592:
                    if ((C0015.f6 | C0015.f6 | 9852) >= 0) {
                        C0013.m114();
                        str = "ۣۢۥ";
                    } else {
                        str = "ۣ۟ۧ";
                    }
                    iM731 = C0015.m573(str);
                    break;
                default:
                    break;
            }
            return dnsOverHttps3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m68() {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int iM618 = C0016.m618("ۨ۟");
        while (true) {
            switch (iM618) {
                case 56352:
                    if (C0017.f10 >= 0) {
                        arrayList3 = null;
                        iM618 = C0014.m240("ۡۤۤ");
                    } else {
                        arrayList3 = null;
                        iM618 = (C0017.f10 ^ C0017.f10) + 1747781;
                    }
                    break;
                case 56567:
                    if (C0014.m245() < 0) {
                        arrayList = arrayList2;
                        iM618 = C0013.m105("۟ۨۡ");
                        arrayList2 = arrayList;
                    } else if ((C0014.f3 | (C0013.f2 - 4446)) >= 0) {
                        C0017.f10 = 65;
                        iM618 = C0013.m105("ۡۥ");
                    } else {
                        iM618 = C0014.m240("ۡۤۤ");
                    }
                    break;
                case 1746968:
                    arrayList = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1587O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (C0015.f6 >= 0) {
                        C0016.f9 = 1;
                        iM618 = C0013.m105("۟ۨۡ");
                        arrayList2 = arrayList;
                    } else {
                        iM618 = C0013.m105("ۢۦ۠");
                        arrayList2 = arrayList;
                    }
                    break;
                case 1747781:
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 93;
                        iM618 = C0017.m731("ۨ۠ۥ");
                    } else {
                        iM618 = (C0015.f6 / C0016.f9) + 1751557;
                    }
                    break;
                case 1747927:
                    if ((C0014.f3 | (C0013.f2 - 4446)) >= 0) {
                        C0017.f10 = 65;
                        iM618 = C0013.m105("ۡۥ");
                    } else {
                        iM618 = C0014.m240("ۡۤۤ");
                    }
                    break;
                case 1748769:
                    iM618 = (C0017.f10 % C0015.f6) ^ (-56501);
                    break;
                case 1749788:
                    if (C0013.f2 <= 0) {
                        C0013.f2 = 73;
                        arrayList3 = arrayList2;
                        iM618 = C0015.m573("ۣ۠ۨ");
                    } else {
                        arrayList3 = arrayList2;
                        iM618 = (C0017.f10 ^ C0017.f10) + 1753609;
                    }
                    break;
                case 1750757:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۣ۠۟");
                    } else {
                        iM618 = C0016.m618("ۨ۟");
                    }
                    break;
                case 1751557:
                case 1755373:
                    if (C0014.f3 + (C0016.f9 * (-8282)) >= 0) {
                        C0016.f9 = 20;
                        str = "ۥ۟ۡ";
                    } else {
                        str = "ۦۥۨ";
                    }
                    iM618 = C0017.m731(str);
                    break;
                case 1753609:
                    break;
                default:
                    break;
            }
            return arrayList3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static DnsOverHttps.Builder m69(Object obj, Object obj2) {
        DnsOverHttps.Builder builder;
        String str;
        DnsOverHttps.Builder builderClient = null;
        DnsOverHttps.Builder builder2 = null;
        int iM105 = C0013.m105("۠ۢۨ");
        while (true) {
            switch (iM105) {
                case 56352:
                    builderClient = ((DnsOverHttps.Builder) obj).client((OkHttpClient) obj2);
                    if (C0016.f9 % (C0014.f3 ^ 1849) <= 0) {
                        C0015.f6 = 7;
                    }
                    iM105 = C0013.m105("ۣۢۥ");
                    break;
                case 1746813:
                    iM105 = (C0016.f9 | C0013.f2) + 1747920;
                    break;
                case 1747750:
                    if (C0015.m570() < 0) {
                        iM105 = (C0016.f9 | (C0017.f10 % 9217)) >= 0 ? C0017.m731("۠ۢۤ") : (C0014.f3 / C0017.f10) ^ 1752707;
                    } else {
                        str = "ۡۡ";
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 1748861:
                case 1754508:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM105 = C0013.m105("ۣۧ۟");
                    } else {
                        iM105 = (C0014.f3 | C0017.f10) + 1754628;
                    }
                    break;
                case 1749819:
                    if ((C0016.f9 | (C0017.f10 % 9217)) >= 0) {
                    }
                    break;
                case 1750630:
                    if (C0013.m114() >= 0) {
                        C0017.m717();
                        builder = builderClient;
                        iM105 = C0017.m731("ۧ۠ۦ");
                        builder2 = builder;
                    } else {
                        builder2 = builderClient;
                        iM105 = (C0015.f6 - C0013.f2) ^ (-1753292);
                    }
                    break;
                case 1752554:
                    if (C0014.f3 % (C0014.f3 + 9254) >= 0) {
                        str = "۠۟۟";
                        iM105 = C0015.m573(str);
                    } else {
                        iM105 = C0013.m105("۠ۢۨ");
                    }
                    break;
                case 1752707:
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM105 = C0016.m618("ۧ۠ۨ");
                    } else {
                        builder = builder2;
                        iM105 = C0017.m731("ۧ۠ۦ");
                        builder2 = builder;
                    }
                    break;
                case 1754413:
                    if (C0016.f9 + (C0017.f10 | (-4499)) <= 0) {
                        C0016.m574();
                        builder2 = null;
                        iM105 = C0014.m240("ۡۡ");
                    } else {
                        builder2 = null;
                        iM105 = (C0015.f6 - C0015.f6) ^ 1746813;
                    }
                    break;
                case 1754415:
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۥۦۢ, reason: not valid java name and contains not printable characters */
    public static AutoSizeConfig m70(Object obj, boolean z) {
        String str;
        String str2;
        String str3;
        AutoSizeConfig autoSizeConfig = null;
        AutoSizeConfig autoSizeConfig2 = null;
        int iM618 = C0016.m618("ۦۦۢ");
        while (true) {
            switch (iM618) {
                case 56445:
                case 1753663:
                    iM618 = (C0015.f6 % C0016.f9) ^ (-1747080);
                    break;
                case 56512:
                    if (C0017.f10 / (C0017.f10 % 649) <= 0) {
                        C0014.f3 = 17;
                        str3 = "ۧۤۦ";
                    } else {
                        str3 = "۟۟۠";
                    }
                    iM618 = C0017.m731(str3);
                    break;
                case 1746688:
                    str2 = "ۧۢ۟";
                    iM618 = C0013.m105(str2);
                    break;
                case 1746882:
                    AutoSizeConfig customFragment = ((AutoSizeConfig) obj).setCustomFragment(z);
                    if (C0015.f6 + (C0015.f6 - 8021) >= 0) {
                        iM618 = C0017.m731("ۤۡ");
                        autoSizeConfig = customFragment;
                    } else {
                        iM618 = C0014.m240("ۥۤۧ");
                        autoSizeConfig = customFragment;
                    }
                    break;
                case 1747687:
                    break;
                case 1747931:
                    iM618 = (C0016.f9 / C0014.f3) ^ (-56448);
                    break;
                case 1752616:
                    if (C0013.f2 <= 0) {
                        C0014.m245();
                        autoSizeConfig2 = autoSizeConfig;
                        iM618 = C0015.m573("ۣ۠ۨ");
                    } else {
                        autoSizeConfig2 = autoSizeConfig;
                        iM618 = (C0013.f2 | C0015.f6) + 1747784;
                    }
                    break;
                case 1753634:
                    if (C0016.m574() >= 0) {
                        if (C0017.f10 / (C0017.f10 % 649) <= 0) {
                            C0014.f3 = 17;
                            str3 = "ۧۤۦ";
                        } else {
                            str3 = "۟۟۠";
                        }
                        iM618 = C0017.m731(str3);
                    } else if (C0014.f3 >= 0) {
                        C0015.m570();
                        iM618 = C0014.m240("۟۟۠");
                    } else {
                        str = "۟ۥۨ";
                        iM618 = C0013.m105(str);
                    }
                    break;
                case 1754468:
                    if ((C0014.f3 | (C0014.f3 ^ (-792))) >= 0) {
                        str2 = "۟ۥۨ";
                        autoSizeConfig2 = null;
                    } else {
                        str2 = "ۣ۠ۨ";
                        autoSizeConfig2 = null;
                    }
                    iM618 = C0013.m105(str2);
                    break;
                case 1755371:
                    if (C0017.f10 - (C0013.f2 ^ 7434) >= 0) {
                        C0017.m717();
                        str = "ۡۦ۠";
                    } else {
                        str = "ۦۦۢ";
                    }
                    iM618 = C0013.m105(str);
                    break;
                default:
                    break;
            }
            return autoSizeConfig2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۧۤۢ, reason: not valid java name and contains not printable characters */
    public static UnitsManager m71(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        int iM618 = C0016.m618("ۦۢۢ");
        UnitsManager unitsManager = null;
        UnitsManager unitsManager2 = null;
        while (true) {
            switch (iM618) {
                case 56420:
                    unitsManager = ((AutoSizeConfig) obj).getUnitsManager();
                    if (C0013.f2 <= 0) {
                        C0013.m114();
                        str4 = "ۧۥۣ";
                    } else {
                        str4 = "ۣ۟ۦ";
                    }
                    iM618 = C0016.m618(str4);
                    break;
                case 1746818:
                    str = "۠ۦ۠";
                    unitsManager2 = unitsManager;
                    iM618 = C0017.m731(str);
                    break;
                case 1747809:
                    if (C0013.m114() >= 0) {
                        str3 = "ۣۤۧ";
                        iM618 = C0016.m618(str3);
                    } else {
                        iM618 = (C0013.f2 ^ C0015.f6) + 1755883;
                    }
                    break;
                case 1747866:
                    break;
                case 1750563:
                    iM618 = C0013.m105(C0014.f3 >= 0 ? "ۤۡۦ" : "ۦۢۢ");
                    break;
                case 1752553:
                case 1755435:
                    iM618 = (C0014.f3 - C0013.f2) + 1748981;
                    break;
                case 1753510:
                    if (C0016.m574() >= 0) {
                        if (C0013.m114() >= 0) {
                            str3 = "ۣۤۧ";
                        } else {
                            iM618 = (C0013.f2 ^ C0015.f6) + 1755883;
                        }
                    } else if (C0016.f9 / (C0017.f10 % 7207) >= 0) {
                        C0016.f9 = 51;
                        str2 = "ۣۧ";
                        iM618 = C0016.m618(str2);
                    } else {
                        str3 = "ۣۧ";
                    }
                    iM618 = C0016.m618(str3);
                    break;
                case 1753701:
                    if (C0015.f6 + (C0014.f3 / (-1759)) < 0) {
                        str2 = "ۧۥۣ";
                        unitsManager2 = null;
                        iM618 = C0016.m618(str2);
                    } else {
                        C0015.m570();
                        str = "ۣ۟ۦ";
                        unitsManager2 = null;
                        iM618 = C0017.m731(str);
                    }
                    break;
                case 1754565:
                    iM618 = (C0013.f2 / C0015.f6) + 1755436;
                    break;
                case 1755398:
                    iM618 = C0014.f3 + C0016.f9 + 1753107;
                    break;
                default:
                    break;
            }
            return unitsManager2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۥۧۤۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m72(Object obj, Object obj2) {
        String str;
        OkHttpClient.Builder builder;
        String str2;
        int iM240 = C0014.m240("ۧۦ۠");
        OkHttpClient.Builder builderAddInterceptor = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM240) {
                case 56350:
                    if (C0017.f10 * (C0015.f6 ^ 3063) <= 0) {
                        C0014.m245();
                        iM240 = C0013.m105("ۢۢ۠");
                    } else {
                        iM240 = C0017.f10 + C0013.f2 + 1749714;
                    }
                    break;
                case 1746751:
                    iM240 = (C0013.f2 ^ C0017.f10) ^ (-1749971);
                    break;
                case 1748613:
                case 1749856:
                    if ((C0016.f9 ^ (C0016.f9 / 4728)) <= 0) {
                        C0017.f10 = 31;
                        str2 = "ۣۦۨ";
                        iM240 = C0016.m618(str2);
                    } else {
                        iM240 = (C0017.f10 | C0017.f10) + 1750484;
                    }
                    break;
                case 1749664:
                    if (C0013.m114() >= 0) {
                        C0016.f9 = 49;
                        str = "ۡۥۤ";
                        builder = builder2;
                        iM240 = C0015.m573(str);
                        builder2 = builder;
                    } else {
                        iM240 = C0016.m618("۟ۡۡ");
                    }
                    break;
                case 1749667:
                    str = "ۡ۟";
                    builder = null;
                    iM240 = C0015.m573(str);
                    builder2 = builder;
                    break;
                case 1749694:
                    builderAddInterceptor = ((OkHttpClient.Builder) obj).addInterceptor((Interceptor) obj2);
                    iM240 = (C0015.f6 ^ C0014.f3) ^ 1753971;
                    break;
                case 1749726:
                    break;
                case 1752677:
                    iM240 = C0017.m731(C0017.f10 * (C0014.f3 / (-2493)) != 0 ? "ۥۡ۟" : "ۧۦ۠");
                    break;
                case 1753541:
                    str = "ۢۤ۠";
                    builder = builderAddInterceptor;
                    iM240 = C0015.m573(str);
                    builder2 = builder;
                    break;
                case 1754593:
                    if (C0017.m717() < 0) {
                        str2 = "ۣۢ۟";
                        iM240 = C0016.m618(str2);
                    } else if (C0013.m114() >= 0) {
                        C0016.f9 = 49;
                        str = "ۡۥۤ";
                        builder = builder2;
                        iM240 = C0015.m573(str);
                        builder2 = builder;
                    } else {
                        iM240 = C0016.m618("۟ۡۡ");
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m73(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int iM105 = C0013.m105("۟ۡ");
        OkHttpClient.Builder builderConnectionSpecs = null;
        OkHttpClient.Builder builder = null;
        while (true) {
            switch (iM105) {
                case 56290:
                    if (C0016.m574() < 0) {
                        iM105 = (C0016.f9 + C0016.f9) ^ 1745168;
                    } else {
                        str3 = "ۣۧۢ";
                        iM105 = C0017.m731(str3);
                    }
                    break;
                case 56320:
                    str3 = "ۣۧۢ";
                    iM105 = C0017.m731(str3);
                    break;
                case 56479:
                case 1749573:
                    str3 = C0015.m570() <= 0 ? "ۦۨ۠" : "ۦۨۧ";
                    iM105 = C0017.m731(str3);
                    break;
                case 1746754:
                    builderConnectionSpecs = ((OkHttpClient.Builder) obj).connectionSpecs((List) obj2);
                    if (C0015.m570() > 0) {
                        str = "ۥۡۦ";
                        iM105 = C0017.m731(str);
                    } else {
                        str2 = "ۥۤ";
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1747838:
                    iM105 = C0013.m114() >= 0 ? C0014.m240("ۤ۟ۥ") : (C0014.f3 % C0013.f2) + 56505;
                    break;
                case 1747933:
                    str2 = "ۢۡۤ";
                    builder = null;
                    iM105 = C0017.m731(str2);
                    break;
                case 1749637:
                    if (C0014.f3 % (C0013.f2 | 3994) >= 0) {
                        C0015.f6 = 27;
                        str = "ۦۨۧ";
                        iM105 = C0017.m731(str);
                    } else {
                        iM105 = C0014.m240("ۥۤ");
                    }
                    break;
                case 1752522:
                    if (C0017.f10 >= 0) {
                        iM105 = C0016.m618("۟ۡ");
                        builder = builderConnectionSpecs;
                    } else {
                        iM105 = (C0016.f9 - C0014.f3) + 1752677;
                        builder = builderConnectionSpecs;
                    }
                    break;
                case 1753701:
                    break;
                case 1754472:
                    iM105 = C0017.m731("۠ۨۥ");
                    break;
                default:
                    break;
            }
            return builder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۠ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO m74() {
        String str;
        String str2;
        String str3;
        String str4;
        int iM618 = C0016.m618("ۣۤۡ");
        O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        while (true) {
            switch (iM618) {
                case 56571:
                    iM618 = (C0015.f6 * C0016.f9) + 2245199;
                    break;
                case 1746719:
                case 1749761:
                    str2 = "ۣۨۡ";
                    iM618 = C0014.m240(str2);
                    break;
                case 1746878:
                    if (C0017.m717() >= 0) {
                        str4 = "ۣۨۧ";
                        iM618 = C0016.m618(str4);
                    } else {
                        iM618 = (C0014.f3 | C0013.f2) + 56654;
                    }
                    break;
                case 1746881:
                    if (C0015.f6 < 0) {
                        str3 = "ۣۨۡ";
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM618 = C0015.m573(str3);
                    } else {
                        str = "۟ۥۤ";
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM618 = C0016.m618(str);
                    }
                    break;
                case 1747648:
                    if ((C0017.f10 ^ (C0015.f6 * 8811)) <= 0) {
                        C0013.m114();
                        iM618 = C0014.m240("۟ۥۧ");
                    } else {
                        str = "ۢۥۤ";
                        iM618 = C0016.m618(str);
                    }
                    break;
                case 1747936:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        str2 = "ۥۤ۠";
                        iM618 = C0014.m240(str2);
                    } else {
                        iM618 = C0016.f9 + C0017.f10 + 1751567;
                    }
                    break;
                case 1749641:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 67;
                        iM618 = C0013.m105("ۣۨۡ");
                    } else {
                        iM618 = (C0016.f9 + C0014.f3) ^ 1746323;
                    }
                    break;
                case 1751618:
                    if (C0016.m574() < 0) {
                        if (C0013.f2 - (C0015.f6 + 8184) >= 0) {
                            C0015.f6 = 22;
                            iM618 = C0014.m240("ۣۤۡ");
                        } else {
                            str4 = "ۢۡۨ";
                            iM618 = C0016.m618(str4);
                        }
                    } else if (C0017.m717() >= 0) {
                        str4 = "ۣۨۧ";
                        iM618 = C0016.m618(str4);
                    } else {
                        iM618 = (C0014.f3 | C0013.f2) + 56654;
                    }
                    break;
                case 1752518:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        str3 = "۟۠۠";
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0017.f10 * C0017.f10) + 1173084;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                    }
                    break;
                case 1755402:
                    break;
                default:
                    break;
            }
            return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static ConnectionSpec m75() {
        String str;
        String str2;
        int iM731 = C0017.m731("ۡۤ");
        ConnectionSpec connectionSpec = null;
        ConnectionSpec connectionSpec2 = null;
        while (true) {
            switch (iM731) {
                case 56291:
                case 1747900:
                    if (C0016.f9 % (C0014.f3 + 5916) <= 0) {
                        C0013.f2 = 6;
                        str2 = "۠ۡۨ";
                        iM731 = C0016.m618(str2);
                    } else {
                        iM731 = (C0017.f10 | C0013.f2) + 1755736;
                    }
                    break;
                case 56355:
                    if (C0016.m574() <= 0) {
                        iM731 = C0015.m570() <= 0 ? C0013.m105("ۢۧۥ") : C0017.m731("ۡۥۡ");
                    } else {
                        iM731 = (C0015.f6 % C0014.f3) + 1748081;
                    }
                    break;
                case 1746880:
                    iM731 = (C0015.f6 % C0014.f3) + 1748081;
                    break;
                case 1747682:
                    iM731 = C0016.m618("ۨۨۦ");
                    connectionSpec2 = connectionSpec;
                    break;
                case 1747902:
                    if ((C0014.f3 ^ (C0017.f10 ^ 720)) <= 0) {
                        C0013.f2 = 51;
                        str = "۟ۥۦ";
                        iM731 = C0013.m105(str);
                    } else {
                        iM731 = (C0015.f6 * C0016.f9) + 2242349;
                    }
                    break;
                case 1748797:
                    connectionSpec = ConnectionSpec.CLEARTEXT;
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 99;
                        iM731 = C0015.m573("۠ۧۥ");
                    } else {
                        str2 = "۠۠ۢ";
                        iM731 = C0016.m618(str2);
                    }
                    break;
                case 1749668:
                    if (C0015.m570() <= 0) {
                        iM731 = C0015.m573("ۣ۠ۧ");
                        connectionSpec2 = null;
                    } else {
                        str = "ۨۤۤ";
                        connectionSpec2 = null;
                        iM731 = C0013.m105(str);
                    }
                    break;
                case 1749824:
                    iM731 = (C0014.f3 ^ (C0015.f6 + 9304)) >= 0 ? C0014.m240("ۤ۠ۧ") : (C0015.f6 * C0014.f3) ^ 74580;
                    break;
                case 1755496:
                    if (C0017.f10 - (C0015.f6 | (-5660)) < 0) {
                        iM731 = (C0016.f9 - C0013.f2) + 56382;
                    }
                    break;
                case 1755622:
                    break;
                default:
                    break;
            }
            return connectionSpec2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m76(Object obj, long j, Object obj2) {
        String str;
        OkHttpClient.Builder builder = null;
        OkHttpClient.Builder builder2 = null;
        int iM105 = C0013.m105("ۨۨۥ");
        while (true) {
            switch (iM105) {
                case 1746691:
                    break;
                case 1747717:
                case 1747899:
                    if (C0014.f3 % (C0015.f6 % (-5509)) >= 0) {
                        C0017.m717();
                        str = "ۦۣۣ";
                        iM105 = C0015.m573(str);
                    } else {
                        iM105 = (C0015.f6 | C0014.f3) ^ (-1746756);
                    }
                    break;
                case 1747929:
                    if ((C0015.f6 ^ (C0013.f2 ^ 3615)) >= 0) {
                        iM105 = C0014.m240("۠ۡۡ");
                    } else {
                        str = "ۨۥ۠";
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 1749602:
                    OkHttpClient.Builder builderConnectTimeout = ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
                    if (C0014.m245() >= 0) {
                        iM105 = C0013.m105("ۢۡۢ");
                        builder = builderConnectTimeout;
                    } else {
                        iM105 = 1754420 + (C0017.f10 | C0017.f10);
                        builder = builderConnectTimeout;
                    }
                    break;
                case 1749635:
                    iM105 = (C0016.f9 - C0017.f10) + 1754054;
                    break;
                case 1750539:
                    if ((C0017.f10 | (C0014.f3 + 4044)) >= 0) {
                        C0015.f6 = 80;
                        iM105 = C0014.m240("ۣ۟ۧ");
                    } else {
                        iM105 = (C0015.f6 % C0013.f2) + 1748326;
                    }
                    break;
                case 1753662:
                    if (C0017.f10 / (C0014.f3 % 9230) <= 0) {
                    }
                    builder2 = builder;
                    iM105 = C0014.m240("ۣ۟۟");
                    break;
                case 1755523:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        iM105 = C0014.m240("۠ۧۢ");
                    } else {
                        iM105 = (C0015.f6 - C0017.f10) + 1755376;
                    }
                    break;
                case 1755525:
                    builder2 = null;
                    iM105 = C0016.m618(C0014.f3 >= 0 ? "ۨۥۢ" : "ۣ۟ۧ");
                    break;
                case 1755621:
                    if (C0016.m574() <= 0) {
                        iM105 = (C0016.f9 ^ (C0014.f3 + 7517)) <= 0 ? C0017.m731("۠ۡۦ") : C0016.f9 + C0016.f9 + 1747984;
                    } else if ((C0015.f6 ^ (C0013.f2 ^ 3615)) >= 0) {
                        iM105 = C0014.m240("۠ۡۡ");
                    } else {
                        str = "ۨۥ۠";
                        iM105 = C0015.m573(str);
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static HttpUrl m77(Object obj) {
        int iM240 = C0014.m240("ۥۣۢ");
        HttpUrl httpUrl = null;
        HttpUrl httpUrl2 = null;
        while (true) {
            switch (iM240) {
                case 56514:
                    break;
                case 56573:
                    iM240 = (C0014.f3 + C0014.f3) ^ (-1752140);
                    continue;
                case 1746756:
                    iM240 = (C0017.f10 ^ C0017.f10) + 1747657;
                    continue;
                case 1747657:
                case 1754566:
                    if (C0017.f10 + (C0014.f3 - 9458) >= 0) {
                        C0016.f9 = 79;
                        iM240 = C0013.m105("ۣ۠ۨ");
                    } else {
                        iM240 = (C0015.f6 | C0014.f3) + 1747968;
                        continue;
                    }
                    break;
                case 1747903:
                    return httpUrl2;
                case 1749702:
                    if ((C0013.f2 | (C0014.f3 + 3213)) <= 0) {
                        C0013.m114();
                    }
                    iM240 = C0013.m105("ۥۤۢ");
                    continue;
                case 1752550:
                    if (C0017.m717() <= 0) {
                        iM240 = C0014.f3 + (C0016.f9 + 2614) <= 0 ? C0017.m731("ۨۥ") : (C0015.f6 | C0014.f3) + 1754480;
                    }
                    break;
                case 1752611:
                    iM240 = 1745047 + C0016.f9 + C0013.f2;
                    httpUrl2 = null;
                    continue;
                case 1754415:
                    httpUrl = HttpUrl.get((String) obj);
                    if (C0014.m245() >= 0) {
                        C0015.m570();
                        iM240 = C0013.m105("ۧ۠ۨ");
                    } else {
                        iM240 = (C0013.f2 + C0015.f6) ^ 1755146;
                        continue;
                    }
                    break;
                case 1755433:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM240 = C0017.m731("۠۟ۨ");
                        httpUrl2 = httpUrl;
                    } else {
                        iM240 = 1747003 + (C0013.f2 | C0013.f2);
                        httpUrl2 = httpUrl;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM240 = (C0016.f9 | C0013.f2) + 1748761;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO m78() {
        String str;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        int iM731 = C0017.m731("ۢ۟ۧ");
        while (true) {
            switch (iM731) {
                case 1746912:
                    break;
                case 1746937:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    iM731 = 1292791 + (C0015.f6 * C0017.f10);
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    break;
                case 1747807:
                    iM731 = (C0016.f9 % C0015.f6) ^ 1749634;
                    break;
                case 1749578:
                    if (C0017.m717() >= 0) {
                        iM731 = (C0016.f9 / C0014.f3) ^ (-1755561);
                    } else if (C0013.m114() >= 0) {
                        C0015.m570();
                        iM731 = C0015.m573("۟ۦۧ");
                    } else {
                        iM731 = (C0015.f6 % C0017.f10) + 1747546;
                    }
                    break;
                case 1750633:
                    iM731 = (C0016.f9 / C0014.f3) ^ (-1755561);
                    break;
                case 1751775:
                case 1752524:
                    iM731 = (C0015.f6 % C0016.f9) + 1747521;
                    break;
                case 1752580:
                    if (C0014.f3 + (C0015.f6 * 9097) >= 0) {
                        C0017.f10 = 41;
                        str = "ۢ۟ۧ";
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                        iM731 = C0016.m618(str);
                    } else {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
                        iM731 = (C0015.f6 / C0017.f10) + 1752617;
                    }
                    break;
                case 1752617:
                    if (C0013.f2 <= 0) {
                        C0016.f9 = 22;
                        iM731 = C0014.m240("ۥۤۨ");
                    } else {
                        str = "ۥۡۨ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1754413:
                    if (C0013.f2 % (C0013.f2 | (-1059)) <= 0) {
                        C0014.f3 = 50;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM731 = C0016.m618("ۣۤۨ");
                    } else {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM731 = (C0015.f6 ^ C0016.f9) + 1747242;
                    }
                    break;
                case 1755562:
                    if (C0015.f6 - (C0016.f9 | (-8564)) <= 0) {
                        C0015.f6 = 11;
                        iM731 = C0013.m105("ۨۦۨ");
                    } else {
                        iM731 = (C0015.f6 | C0013.f2) + 1752677;
                    }
                    break;
                default:
                    break;
            }
            return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۤ۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m79(Object obj, boolean z) {
        String str;
        String str2;
        String str3;
        OkHttpClient.Builder builderFollowSslRedirects;
        int iM618 = C0016.m618("۟ۧۢ");
        OkHttpClient.Builder builder = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM618) {
                case 1746719:
                    builderFollowSslRedirects = ((OkHttpClient.Builder) obj).followSslRedirects(z);
                    if (C0015.m570() <= 0) {
                        C0016.m574();
                        str3 = "۟۠۠";
                        iM618 = C0013.m105(str3);
                        builder = builderFollowSslRedirects;
                    } else {
                        iM618 = (C0013.f2 | C0015.f6) + 1753608;
                        builder = builderFollowSslRedirects;
                    }
                    break;
                case 1746873:
                case 1754470:
                    iM618 = C0013.m105("ۨۤۨ");
                    break;
                case 1746938:
                    if (C0016.m574() < 0) {
                        str = "۟۠۠";
                        iM618 = C0015.m573(str);
                    } else if (C0014.f3 + C0016.f9 + 9099 <= 0) {
                        C0017.f10 = 93;
                        iM618 = C0013.m105("ۨ۟ۢ");
                    } else {
                        iM618 = C0017.m731("ۥۥۣ");
                    }
                    break;
                case 1746966:
                    if (C0015.m570() <= 0) {
                        C0013.f2 = 51;
                        str2 = "۠۠۟";
                    } else {
                        str2 = "۟ۥ۟";
                    }
                    iM618 = C0017.m731(str2);
                    break;
                case 1747679:
                    if (C0014.f3 + C0016.f9 + 9099 <= 0) {
                        C0017.f10 = 93;
                        iM618 = C0013.m105("ۨ۟ۢ");
                    } else {
                        iM618 = C0017.m731("ۥۥۣ");
                    }
                    break;
                case 1751562:
                    iM618 = (C0015.f6 * C0014.f3) + 1616003;
                    break;
                case 1752643:
                    if (C0017.m717() >= 0) {
                        C0017.f10 = 43;
                        iM618 = C0014.m240("۟ۧۢ");
                    } else {
                        iM618 = (C0013.f2 / C0016.f9) + 1755371;
                    }
                    break;
                case 1753511:
                    if (C0017.f10 % (C0013.f2 - 430) < 0) {
                        str3 = "ۨۤۨ";
                        builderFollowSslRedirects = builder;
                        builder2 = builder;
                        iM618 = C0013.m105(str3);
                        builder = builderFollowSslRedirects;
                    } else {
                        C0016.f9 = 8;
                        str = "ۨۤۨ";
                        builder2 = builder;
                        iM618 = C0015.m573(str);
                    }
                    break;
                case 1755372:
                    str3 = "۟ۨ۟";
                    builderFollowSslRedirects = builder;
                    builder2 = null;
                    iM618 = C0013.m105(str3);
                    builder = builderFollowSslRedirects;
                    break;
                case 1755500:
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x008b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۤۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Context m80(Object obj, Object obj2) {
        String str;
        String str2;
        int iM240 = C0014.m240("ۡۨۥ");
        Context contextO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = null;
        Context context = null;
        while (true) {
            switch (iM240) {
                case 56512:
                    if (C0016.f9 <= 0) {
                        iM240 = C0013.m105("ۦۦ");
                        context = null;
                    } else {
                        iM240 = (C0013.f2 + C0014.f3) ^ 1748467;
                        context = null;
                    }
                    break;
                case 1746752:
                    break;
                case 1747656:
                    contextO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0((Context) obj, (String) obj2);
                    str2 = "ۣۡۤ";
                    iM240 = C0017.m731(str2);
                    break;
                case 1747749:
                case 1749729:
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 95;
                        iM240 = C0016.m618("ۤ۟ۧ");
                    } else {
                        iM240 = C0017.m731("۟ۡۢ");
                    }
                    break;
                case 1747899:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 55;
                        iM240 = C0013.m105("ۨۡ");
                    } else {
                        iM240 = (C0017.f10 % C0014.f3) + 1754553;
                    }
                    break;
                case 1748738:
                    if (C0013.f2 - (C0015.f6 | (-6630)) <= 0) {
                        C0013.f2 = 10;
                        iM240 = C0017.m731("ۥۧۦ");
                        context = contextO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    } else {
                        iM240 = (C0016.f9 | C0014.f3) + 1746967;
                        context = contextO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    }
                    break;
                case 1748830:
                    if (C0017.f10 - (C0015.f6 % 3932) >= 0) {
                        C0014.f3 = 19;
                        iM240 = C0016.m618("ۡۨۥ");
                    } else {
                        str = "ۣۢۤ";
                        iM240 = C0017.m731(str);
                    }
                    break;
                case 1748894:
                    if (C0017.m717() <= 0) {
                        iM240 = (C0016.f9 - C0014.f3) + 1746632;
                    } else if (C0016.f9 <= 0) {
                        C0013.f2 = 55;
                        iM240 = C0013.m105("ۨۡ");
                    } else {
                        iM240 = (C0017.f10 % C0014.f3) + 1754553;
                    }
                    break;
                case 1752708:
                    if ((C0013.f2 | (C0015.f6 - 2122)) >= 0) {
                        C0015.f6 = 82;
                        str2 = "ۣۣ۟";
                        iM240 = C0017.m731(str2);
                    } else {
                        iM240 = (C0014.f3 / C0017.f10) ^ 1748894;
                    }
                    break;
                case 1754440:
                    if (C0017.f10 + (C0014.f3 / 9715) >= 0) {
                        C0013.m114();
                        str = "۠ۢۧ";
                        iM240 = C0017.m731(str);
                    } else {
                        iM240 = C0013.m105("ۦۦ");
                    }
                    break;
                default:
                    break;
            }
            return context;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۤۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m81(Object obj, Object obj2) {
        String str;
        String str2;
        OkHttpClient.Builder builder;
        String str3;
        String str4;
        int iM618 = C0016.m618("ۣۢۢ");
        OkHttpClient.Builder builderDns = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM618) {
                case 56417:
                case 1755337:
                    iM618 = (C0015.f6 % C0017.f10) + 1753069;
                    break;
                case 1747842:
                    builderDns = ((OkHttpClient.Builder) obj).dns((Dns) obj2);
                    if (C0017.f10 * (C0015.f6 % (-7904)) <= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("۠ۦۡ");
                    } else {
                        str = "ۥۥۨ";
                        iM618 = C0017.m731(str);
                    }
                    break;
                case 1747867:
                    if (C0015.m570() <= 0) {
                        str3 = "ۨۡۨ";
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0014.f3 | C0014.f3) + 1749912;
                    }
                    break;
                case 1748830:
                    if ((C0014.f3 ^ (C0016.f9 / (-9270))) >= 0) {
                        C0017.f10 = 80;
                        iM618 = C0015.m573("ۥ۟ۦ");
                    } else {
                        str = "ۥۣۤ";
                        iM618 = C0017.m731(str);
                    }
                    break;
                case 1749697:
                    if (C0014.m245() <= 0) {
                        str2 = "۠ۥۧ";
                        builder = builder2;
                        iM618 = C0013.m105(str2);
                        builder2 = builder;
                    } else if (C0015.f6 * (C0015.f6 % (-2620)) <= 0) {
                        str3 = "ۡۦۣ";
                        iM618 = C0015.m573(str3);
                    } else {
                        C0017.m717();
                        str4 = "۠۟ۢ";
                        iM618 = C0013.m105(str4);
                    }
                    break;
                case 1749853:
                    str3 = "ۨ۟۠";
                    iM618 = C0015.m573(str3);
                    break;
                case 1750627:
                    if (C0015.f6 * (C0015.f6 % (-2620)) <= 0) {
                        str3 = "ۡۦۣ";
                        iM618 = C0015.m573(str3);
                    } else {
                        C0017.m717();
                        str4 = "۠۟ۢ";
                        iM618 = C0013.m105(str4);
                    }
                    break;
                case 1752460:
                    break;
                case 1752582:
                    if (C0013.m114() >= 0) {
                        C0016.m574();
                        builder2 = null;
                        str = "ۥۣۤ";
                        iM618 = C0017.m731(str);
                    } else {
                        iM618 = (C0013.f2 * C0013.f2) + 939853;
                        builder2 = null;
                    }
                    break;
                case 1752648:
                    if (C0017.f10 < 0) {
                        str4 = "ۥ۟ۦ";
                        builder2 = builderDns;
                        iM618 = C0013.m105(str4);
                    } else {
                        C0015.f6 = 45;
                        str2 = "۠ۥۧ";
                        builder = builderDns;
                        iM618 = C0013.m105(str2);
                        builder2 = builder;
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۥ۟ۧ۠, reason: contains not printable characters */
    public static void m82(Object obj, Object obj2) {
        String str;
        int iM731 = C0017.m731("ۨۤ");
        while (true) {
            switch (iM731) {
                case 56319:
                    ((ExoMediaSourceHelper) obj).setOkClient((OkHttpClient) obj2);
                    iM731 = C0017.f10 * (C0014.f3 + (-1797)) <= 0 ? C0017.m731("۠۟") : (C0017.f10 | C0016.f9) ^ (-1748946);
                    break;
                case 56572:
                    if (C0015.m570() < 0) {
                        str = "ۢۧۦ";
                        iM731 = C0013.m105(str);
                    } else if ((C0014.f3 ^ (C0016.f9 * 1880)) >= 0) {
                        iM731 = C0014.m240("ۢۥ۟");
                    }
                    break;
                case 1746727:
                case 1749756:
                    if (C0015.m570() <= 0) {
                        C0015.f6 = 33;
                        str = "ۨۥۥ";
                        iM731 = C0013.m105(str);
                    } else {
                        iM731 = (C0013.f2 * C0015.f6) + 2296841;
                    }
                    break;
                case 1746780:
                    iM731 = C0015.m573("ۨۤ");
                    break;
                case 1747838:
                    str = "ۢۧۦ";
                    iM731 = C0013.m105(str);
                    break;
                case 1748741:
                    break;
                case 1749825:
                    iM731 = C0014.f3 + (C0013.f2 / (-1229)) >= 0 ? C0017.m731("ۣۡۧ") : (C0016.f9 + C0017.f10) ^ 1746708;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007d A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۥۤۤ۠, reason: contains not printable characters */
    public static ExoMediaSourceHelper m83(Object obj) {
        String str;
        String str2;
        ExoMediaSourceHelper exoMediaSourceHelper = null;
        ExoMediaSourceHelper exoMediaSourceHelper2 = null;
        int iM105 = C0013.m105("ۣۧ");
        while (true) {
            switch (iM105) {
                case 56413:
                    exoMediaSourceHelper2 = null;
                    iM105 = (C0015.f6 % C0017.f10) + 1750241;
                    break;
                case 56540:
                    if (C0016.m574() < 0) {
                        str = "ۡۡۢ";
                    } else if ((C0017.f10 | (C0014.f3 / (-7193))) >= 0) {
                        str = "ۥۡۢ";
                    } else {
                        iM105 = C0014.m240("ۧ۟ۡ");
                    }
                    iM105 = C0017.m731(str);
                    break;
                case 56543:
                    exoMediaSourceHelper2 = exoMediaSourceHelper;
                    iM105 = C0013.f2 + C0015.f6 + 1755139;
                    break;
                case 1748674:
                    ExoMediaSourceHelper exoMediaSourceHelper3 = ExoMediaSourceHelper.getInstance((Context) obj);
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM105 = C0015.m573("ۨۢ۠");
                        exoMediaSourceHelper = exoMediaSourceHelper3;
                    } else {
                        iM105 = 56657 + (C0017.f10 | C0013.f2);
                        exoMediaSourceHelper = exoMediaSourceHelper3;
                    }
                    break;
                case 1749632:
                    if (C0013.f2 <= 0) {
                        C0013.f2 = 20;
                        iM105 = C0015.m573("ۣ۟ۦ");
                    } else {
                        iM105 = C0017.m731("ۥۣۧ");
                    }
                    break;
                case 1749760:
                case 1752705:
                    if ((C0015.f6 ^ (C0017.f10 * 2624)) <= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("ۧۤۢ");
                    } else {
                        str2 = "ۨۢ۠";
                        iM105 = C0014.m240(str2);
                    }
                    break;
                case 1750538:
                    if ((C0017.f10 | (C0014.f3 / (-7193))) >= 0) {
                        str = "ۥۡۢ";
                        iM105 = C0017.m731(str);
                    } else {
                        iM105 = C0014.m240("ۧ۟ۡ");
                    }
                    break;
                case 1754377:
                    str2 = "ۣ۠";
                    iM105 = C0014.m240(str2);
                    break;
                case 1754472:
                    if (C0015.m570() <= 0) {
                        C0017.m717();
                        str2 = "ۣ۠ۤ";
                        iM105 = C0014.m240(str2);
                    } else {
                        iM105 = (C0016.f9 * C0014.f3) ^ (-162739);
                    }
                    break;
                case 1755430:
                    break;
                default:
                    break;
            }
            return exoMediaSourceHelper2;
        }
    }

    /* JADX INFO: renamed from: ۥۥۨۨ, reason: contains not printable characters */
    public static void m84(Object obj, Object obj2) {
        String str;
        String str2;
        int iM618 = C0016.m618("ۥۨۨ");
        while (true) {
            switch (iM618) {
                case 1748741:
                case 1748802:
                    if (C0015.m570() <= 0) {
                        C0016.f9 = 55;
                        str2 = "ۤ۟۟";
                    } else {
                        str2 = "ۤۢ۠";
                    }
                    iM618 = C0014.m240(str2);
                    continue;
                case 1751586:
                    return;
                case 1752741:
                    if (C0017.m717() < 0) {
                        iM618 = (C0013.f2 % C0014.f3) + 1753662;
                    }
                    break;
                case 1753606:
                    break;
                case 1753702:
                    O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, (String) obj2);
                    iM618 = (C0014.f3 - C0015.f6) + 1751192;
                    continue;
                case 1754592:
                    if (C0016.f9 <= 0) {
                        C0015.f6 = 89;
                        str = "ۤۢ۠";
                    } else {
                        str = "ۣۡۧ";
                    }
                    iM618 = C0013.m105(str);
                    continue;
                case 1755399:
                    if (C0015.f6 % (C0014.f3 ^ (-5726)) >= 0) {
                        iM618 = C0016.m618("ۤ۠ۢ");
                    } else {
                        iM618 = C0015.m573("ۥۨۨ");
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM618 = (C0014.f3 / C0015.f6) ^ 1754592;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۦۣۧۦ, reason: contains not printable characters */
    public static void m85(Object obj) {
        String str;
        String str2;
        int iM573 = C0015.m573("ۨ۠ۡ");
        while (true) {
            switch (iM573) {
                case 56476:
                    iM573 = C0017.f10 >= 0 ? C0015.m573("ۥ۠ۡ") : (C0015.f6 * C0015.f6) + 1384488;
                    break;
                case 1750539:
                case 1751493:
                    if ((C0014.f3 ^ (C0017.f10 + 1942)) >= 0) {
                        C0016.f9 = 26;
                        str = "ۧۧۤ";
                    } else {
                        str = "ۧ۠ۥ";
                    }
                    iM573 = C0013.m105(str);
                    break;
                case 1751679:
                    IjkMediaPlayer.loadLibrariesOnce((IjkLibLoader) obj);
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 38;
                        iM573 = C0014.m240("ۧ۠ۥ");
                    } else {
                        str2 = "ۧ۠ۥ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1752546:
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 74;
                        str2 = "ۡ۠ۦ";
                        iM573 = C0016.m618(str2);
                    } else {
                        iM573 = (C0016.f9 - C0015.f6) + 1754108;
                    }
                    break;
                case 1754412:
                    break;
                case 1755369:
                    if (C0017.m717() < 0) {
                        iM573 = (C0015.f6 / C0016.f9) + 1751679;
                    } else if (C0013.m114() >= 0) {
                        C0014.f3 = 74;
                        str2 = "ۡ۠ۦ";
                        iM573 = C0016.m618(str2);
                    } else {
                        iM573 = (C0016.f9 - C0015.f6) + 1754108;
                    }
                    break;
                case 1755526:
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM573 = C0017.m731("ۤ۟۠");
                    } else {
                        str2 = "ۣ۟ۧ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static OkHttpClient.Builder m86(Object obj, Object obj2) {
        String str;
        OkHttpClient.Builder builderCache;
        String str2;
        int iM731 = C0017.m731("ۡۨ");
        OkHttpClient.Builder builder = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM731) {
                case 56359:
                    if (C0014.m245() >= 0) {
                        iM731 = C0017.f10 + C0014.f3 + 1753556;
                    } else if (C0014.f3 >= 0) {
                        C0015.m570();
                        iM731 = C0015.m573("ۦ۟ۦ");
                    } else {
                        iM731 = (C0017.f10 - C0017.f10) + 1750531;
                    }
                    break;
                case 56452:
                case 1751585:
                    iM731 = (C0015.f6 | C0013.f2) ^ (-1753390);
                    break;
                case 1747835:
                    iM731 = C0017.f10 + C0014.f3 + 1753556;
                    break;
                case 1748679:
                    iM731 = C0013.m105("ۣۨ۟");
                    builder2 = null;
                    break;
                case 1749823:
                    iM731 = (C0015.f6 + C0014.f3) ^ (-57105);
                    break;
                case 1750531:
                    builderCache = ((OkHttpClient.Builder) obj).cache((Cache) obj2);
                    if (C0016.m574() < 0) {
                        str = "ۦۣ۟";
                        iM731 = C0016.m618(str);
                        builder = builderCache;
                    } else {
                        C0016.f9 = 17;
                        str2 = "ۡۨ";
                        iM731 = C0013.m105(str2);
                        builder = builderCache;
                    }
                    break;
                case 1752583:
                    if (C0017.f10 - (C0016.f9 / 3240) >= 0) {
                        iM731 = C0015.m573("ۤۨ");
                    } else {
                        str = "ۡۡۧ";
                        builderCache = builder;
                        iM731 = C0016.m618(str);
                        builder = builderCache;
                    }
                    break;
                case 1753421:
                    break;
                case 1753538:
                    if (C0017.m717() >= 0) {
                        C0016.f9 = 59;
                        str = "ۦۣ۟";
                        builderCache = builder;
                        builder2 = builder;
                        iM731 = C0016.m618(str);
                        builder = builderCache;
                    } else {
                        iM731 = C0014.m240("ۦ۟ۦ");
                        builder2 = builder;
                    }
                    break;
                case 1755460:
                    if (C0014.m245() >= 0) {
                        C0013.f2 = 15;
                        iM731 = C0015.m573("۠ۥ۠");
                    } else {
                        str2 = "ۤۢ۟";
                        builderCache = builder;
                        iM731 = C0013.m105(str2);
                        builder = builderCache;
                    }
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x006f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۧۡۤۨ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m87() {
        String str;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str2;
        String str3;
        int iM618 = C0016.m618("ۦۧۡ");
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        while (true) {
            switch (iM618) {
                case 1748738:
                case 1748771:
                    iM618 = (C0014.f3 ^ (C0014.f3 / 7104)) >= 0 ? C0016.m618("ۣۤۤ") : (C0017.f10 ^ C0013.f2) ^ (-1752947);
                    break;
                case 1748862:
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        str2 = "ۥ۟ۡ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    } else {
                        str2 = "ۥۣۡ";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    }
                    iM618 = C0013.m105(str2);
                    break;
                case 1749697:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    iM618 = (C0017.f10 - C0017.f10) + 1748862;
                    break;
                case 1750531:
                    if (C0016.f9 * (C0015.f6 - 8783) >= 0) {
                        str = "ۢۦۧ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = (C0013.f2 / C0013.f2) + 1753663;
                    }
                    break;
                case 1750662:
                    iM618 = C0016.f9 + C0015.f6 + 1751301;
                    break;
                case 1751501:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
                    str2 = "ۥ۟ۡ";
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM618 = C0013.m105(str2);
                    break;
                case 1752455:
                    str = "ۡۤۦ";
                    iM618 = C0014.m240(str);
                    break;
                case 1752579:
                    break;
                case 1753664:
                    if (C0017.m717() < 0) {
                        if (C0014.f3 >= 0) {
                            C0015.m570();
                            str3 = "ۥۣۡ";
                        } else {
                            str3 = "ۣۢۢ";
                        }
                        iM618 = C0013.m105(str3);
                    } else if ((C0014.f3 | (C0016.f9 / 817)) >= 0) {
                        C0013.f2 = 40;
                        iM618 = C0015.m573("ۦۣۢ");
                    } else {
                        iM618 = (C0015.f6 % C0014.f3) + 1750841;
                    }
                    break;
                case 1754502:
                    if ((C0014.f3 | (C0016.f9 / 817)) >= 0) {
                        C0013.f2 = 40;
                        iM618 = C0015.m573("ۦۣۢ");
                    } else {
                        iM618 = (C0015.f6 % C0014.f3) + 1750841;
                    }
                    break;
                default:
                    break;
            }
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x003a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static ConnectionSpec m88() {
        String str;
        String str2;
        ConnectionSpec connectionSpec = null;
        ConnectionSpec connectionSpec2 = null;
        int iM618 = C0016.m618("ۤۧۥ");
        while (true) {
            switch (iM618) {
                case 1747649:
                case 1750533:
                    if (C0016.f9 + (C0013.f2 / 3366) <= 0) {
                        C0017.f10 = 64;
                        str = "ۢۤ۠";
                        iM618 = C0015.m573(str);
                    } else {
                        iM618 = (C0017.f10 | C0016.f9) + 1753722;
                    }
                    break;
                case 1747872:
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 70;
                        iM618 = C0013.m105("ۥۥۥ");
                    } else {
                        iM618 = (C0015.f6 | C0015.f6) ^ (-1751203);
                    }
                    break;
                case 1749761:
                    if (C0017.f10 >= 0) {
                        iM618 = C0016.m618("ۣ۟ۡ");
                    } else {
                        str = "ۧۨۨ";
                        iM618 = C0015.m573(str);
                    }
                    break;
                case 1751713:
                    iM618 = C0013.f2 <= 0 ? C0015.m573("۟ۧۡ") : (C0013.f2 / C0014.f3) + 1749765;
                    break;
                case 1751746:
                    if (C0017.m717() < 0) {
                        if (C0013.f2 + (C0013.f2 / 8401) <= 0) {
                            C0015.m570();
                            iM618 = C0015.m573("ۦۢۡ");
                        } else {
                            str2 = "ۣۨۢ";
                            iM618 = C0016.m618(str2);
                        }
                    } else if (C0013.f2 <= 0) {
                    }
                    break;
                case 1752738:
                    if (C0017.f10 / (C0013.f2 - 8453) != 0) {
                        connectionSpec2 = connectionSpec;
                        iM618 = C0013.m105("ۥۨۥ");
                    } else {
                        connectionSpec2 = connectionSpec;
                        iM618 = (C0015.f6 * C0017.f10) + 1291887;
                    }
                    break;
                case 1753509:
                    break;
                case 1753668:
                    iM618 = (C0014.f3 * C0016.f9) ^ (-1576368);
                    break;
                case 1754663:
                    if (C0014.m245() >= 0) {
                        C0013.f2 = 30;
                    }
                    str2 = "ۦۧۥ";
                    connectionSpec2 = null;
                    iM618 = C0016.m618(str2);
                    break;
                case 1755463:
                    ConnectionSpec connectionSpec3 = ConnectionSpec.COMPATIBLE_TLS;
                    if (C0013.f2 + (C0013.f2 ^ 5715) <= 0) {
                        iM618 = C0017.m731("ۤۦۣ");
                        connectionSpec = connectionSpec3;
                    } else {
                        iM618 = (-1915435) ^ (C0016.f9 * C0015.f6);
                        connectionSpec = connectionSpec3;
                    }
                    break;
                default:
                    break;
            }
            return connectionSpec2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x001e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m89(Object obj) {
        String str;
        int iM573 = C0015.m573("ۨۦۢ");
        while (true) {
            switch (iM573) {
                case 1747930:
                    break;
                case 1748676:
                    iM573 = C0017.f10 >= 0 ? C0017.m731("ۣۢۤ") : (C0014.f3 | C0014.f3) + 1750871;
                    break;
                case 1749604:
                case 1750656:
                    iM573 = (C0014.f3 ^ C0015.f6) + 1747236;
                    break;
                case 1750629:
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((OkHttpClient.Builder) obj);
                    if (C0016.f9 <= 0) {
                        C0014.m245();
                        iM573 = C0014.m240("ۦۨۡ");
                    } else {
                        iM573 = C0014.m240("۠ۨۢ");
                    }
                    break;
                case 1753420:
                    iM573 = (C0017.f10 - C0015.f6) + 1755705;
                    break;
                case 1753695:
                    if ((C0013.f2 | (C0014.f3 % 6478)) >= 0) {
                        C0013.m114();
                        str = "ۨ۟ۤ";
                        iM573 = C0017.m731(str);
                    } else {
                        iM573 = (C0014.f3 / C0014.f3) + 1748675;
                    }
                    break;
                case 1755556:
                    if (C0016.m574() < 0) {
                        str = "ۣۢۤ";
                    } else if ((C0013.f2 | (C0014.f3 % 6478)) >= 0) {
                        C0013.m114();
                        str = "ۨ۟ۤ";
                    } else {
                        iM573 = (C0014.f3 / C0014.f3) + 1748675;
                    }
                    iM573 = C0017.m731(str);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۡۧۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m90(Object obj, long j, Object obj2) {
        String str;
        OkHttpClient.Builder builder;
        int iM240 = C0014.m240("ۥۥ۟");
        OkHttpClient.Builder timeout = null;
        OkHttpClient.Builder builder2 = null;
        while (true) {
            switch (iM240) {
                case 1746725:
                    timeout = ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                    } else {
                        iM240 = (C0017.f10 ^ C0015.f6) ^ 1754590;
                    }
                    break;
                case 1746850:
                    break;
                case 1746967:
                case 1751748:
                    iM240 = (C0013.f2 ^ C0015.f6) + 1747335;
                    break;
                case 1749757:
                    str = "ۦۦۤ";
                    builder = null;
                    iM240 = C0014.m240(str);
                    builder2 = builder;
                    break;
                case 1752520:
                    iM240 = (C0015.f6 - C0017.f10) ^ 1752746;
                    break;
                case 1752639:
                    if (C0014.m245() < 0) {
                        iM240 = C0015.m570() <= 0 ? C0013.m105("ۥۨ۠") : C0014.m240("۟۠ۦ");
                    } else if (C0016.f9 <= 0) {
                        C0013.m114();
                        str = "ۦۡۨ";
                        builder = builder2;
                        iM240 = C0014.m240(str);
                        builder2 = builder;
                    } else {
                        iM240 = (C0014.f3 * C0013.f2) + 1947106;
                    }
                    break;
                case 1752733:
                    if (C0016.f9 <= 0) {
                        C0013.m114();
                        str = "ۦۡۨ";
                        builder = builder2;
                        iM240 = C0014.m240(str);
                        builder2 = builder;
                    } else {
                        iM240 = (C0014.f3 * C0013.f2) + 1947106;
                    }
                    break;
                case 1753606:
                    iM240 = (C0014.f3 - C0013.f2) + 1750872;
                    break;
                case 1753636:
                    iM240 = C0016.m618(C0013.f2 <= 0 ? "ۥۡۤ" : "ۤۧۧ");
                    break;
                case 1754443:
                    str = "۟ۤۧ";
                    builder = timeout;
                    iM240 = C0014.m240(str);
                    builder2 = builder;
                    break;
                default:
                    break;
            }
            return builder2;
        }
    }

    /* JADX INFO: renamed from: ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static void m91(Object obj) {
        int iM618 = C0016.m618("ۣۡۥ");
        while (true) {
            switch (iM618) {
                case 1746877:
                case 1752487:
                    iM618 = (C0017.f10 * C0015.f6) ^ 1946098;
                    continue;
                case 1748707:
                    break;
                case 1748858:
                    O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setUserAgent((String) obj);
                    if (C0013.f2 <= 0) {
                        iM618 = C0015.m573("۟ۥۣ");
                    } else {
                        iM618 = (C0014.f3 | C0014.f3) + 1751963;
                        continue;
                    }
                    break;
                case 1750534:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        iM618 = C0016.m618("ۨۧۥ");
                    } else {
                        iM618 = (C0013.f2 + C0016.f9) ^ 1749226;
                        continue;
                    }
                    break;
                case 1750599:
                    if (C0015.m570() <= 0) {
                        break;
                    } else if (C0015.f6 >= 0) {
                        C0017.m717();
                        iM618 = C0016.m618("ۤۧۧ");
                    } else {
                        iM618 = (C0015.f6 * C0016.f9) + 2241539;
                    }
                    break;
                case 1751748:
                    return;
                case 1754446:
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        iM618 = C0013.m105("ۣ۟ۢ");
                    } else {
                        iM618 = (C0014.f3 * C0016.f9) + 1926422;
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            iM618 = C0017.m731(C0013.f2 - (C0016.f9 % (-4820)) <= 0 ? "ۡۥۥ" : "ۧۡۨ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static DnsOverHttps m92(Object obj) {
        String str;
        DnsOverHttps dnsOverHttps;
        String str2;
        String str3;
        int iM618 = C0016.m618("ۢ۟ۢ");
        DnsOverHttps dnsOverHttpsBuild = null;
        DnsOverHttps dnsOverHttps2 = null;
        while (true) {
            switch (iM618) {
                case 56357:
                case 1755523:
                    if (C0014.f3 % (C0015.f6 + 174) >= 0) {
                        str2 = "ۧۥ۟";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0014.f3 / C0013.f2) + 1750563;
                    }
                    break;
                case 1748648:
                    iM618 = (C0013.f2 ^ (C0017.f10 / 8424)) <= 0 ? C0014.m240("ۨۥۡ") : C0016.m618("ۧۦۦ");
                    break;
                case 1749573:
                    if (C0016.m574() <= 0) {
                        if (C0013.f2 / (C0016.f9 + 675) != 0) {
                            C0014.f3 = 67;
                            iM618 = C0017.m731("ۢ۟ۢ");
                        } else {
                            str2 = "ۦۣۦ";
                            iM618 = C0013.m105(str2);
                        }
                    } else if ((C0013.f2 ^ (C0017.f10 / 8424)) <= 0) {
                    }
                    break;
                case 1750563:
                    break;
                case 1750724:
                    if (C0017.f10 >= 0) {
                        C0017.m717();
                        str3 = "ۧۡۢ";
                    } else {
                        str3 = "ۢ۟ۢ";
                    }
                    iM618 = C0014.m240(str3);
                    break;
                case 1753545:
                    dnsOverHttpsBuild = ((DnsOverHttps.Builder) obj).build();
                    if (C0017.f10 + C0014.f3 + 7285 <= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("ۧۦۦ");
                    } else {
                        iM618 = (C0014.f3 ^ C0013.f2) ^ (-1754801);
                    }
                    break;
                case 1754594:
                    if (C0013.f2 + (C0013.f2 | (-6040)) >= 0) {
                        C0014.f3 = 59;
                        dnsOverHttps = dnsOverHttpsBuild;
                        str = "ۨۦۨ";
                        dnsOverHttps2 = dnsOverHttps;
                    } else {
                        str = "ۣ۠۠";
                        dnsOverHttps2 = dnsOverHttpsBuild;
                    }
                    iM618 = C0017.m731(str);
                    break;
                case 1754599:
                    iM618 = (C0014.f3 ^ (C0017.f10 / 7997)) >= 0 ? C0016.m618("ۦۣۦ") : (C0017.f10 - C0013.f2) + 1757121;
                    break;
                case 1755463:
                    if (C0017.f10 - (C0013.f2 / (-6481)) >= 0) {
                        C0016.m574();
                        iM618 = C0014.m240("ۡ۠ۧ");
                        dnsOverHttps2 = null;
                    } else {
                        dnsOverHttps = null;
                        str = "ۨۦۨ";
                        dnsOverHttps2 = dnsOverHttps;
                        iM618 = C0017.m731(str);
                    }
                    break;
                case 1755562:
                    iM618 = (C0015.f6 % C0017.f10) + 56966;
                    break;
                default:
                    break;
            }
            return dnsOverHttps2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    @Override // android.app.Application
    public final void onCreate() {
        String str;
        O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str2;
        String str3;
        String str4;
        String str5;
        int iM573 = C0015.m573("ۦۡ۠");
        StringBuilder sb = null;
        O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        while (true) {
            switch (iM573) {
                case 56508:
                    O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0013.m157(sb);
                    if (C0016.f9 > 0) {
                        str3 = "ۣۣ۠";
                        iM573 = C0013.m105(str3);
                    } else {
                        C0015.f6 = 38;
                        str5 = "ۣ۟ۧ";
                        iM573 = C0014.m240(str5);
                    }
                    break;
                case 56536:
                    C0013.m197(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
                    if (C0017.f10 / (C0016.f9 | (-7167)) != 0) {
                        C0016.m574();
                        str4 = "ۢۢۦ";
                    } else {
                        str4 = "ۣۨ";
                    }
                    iM573 = C0013.m105(str4);
                    break;
                case 56571:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f886O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = C0014.m235(this);
                    iM573 = C0017.f10 >= 0 ? C0017.m731("۠ۢ۠") : C0013.m105("ۣ۟ۧ");
                    break;
                case 1746939:
                    StringBuilder sb2 = new StringBuilder();
                    if (C0015.f6 % (C0015.f6 * (-9127)) >= 0) {
                        C0013.f2 = 27;
                        iM573 = C0013.m105("ۣۣ۠");
                        sb = sb2;
                    } else {
                        iM573 = (C0013.f2 / C0017.f10) ^ (-1755373);
                        sb = sb2;
                    }
                    break;
                case 1747716:
                case 1755589:
                    if ((C0013.f2 ^ (C0014.f3 ^ (-5952))) <= 0) {
                        str3 = "ۨۡ";
                        iM573 = C0013.m105(str3);
                    } else {
                        iM573 = (C0015.f6 ^ C0014.f3) ^ 1751249;
                    }
                    break;
                case 1747742:
                    C0017.m661();
                    iM573 = (C0016.f9 ^ C0014.f3) + 57560;
                    break;
                case 1748771:
                    try {
                        m46(m63(m56(m71(m70(m62(), true)), true), true), m50());
                        if (C0013.m114() < 0) {
                            str2 = "ۣۧۨ";
                            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                            iM573 = C0015.m573(str2);
                            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        } else {
                            C0017.m717();
                        }
                    } catch (IllegalStateException e) {
                        C0013.m180(e);
                        iM573 = (C0014.f3 % C0016.f9) ^ (-1755412);
                    }
                    break;
                case 1749670:
                    C0014.m209(sb, C0017.m693(m66(), 0, 9, 801));
                    if (C0017.f10 / (C0016.f9 + 3740) != 0) {
                        C0016.f9 = 31;
                        iM573 = C0013.m105("ۣۨ");
                    } else {
                        iM573 = (C0016.f9 - C0016.f9) + 56508;
                    }
                    break;
                case 1750566:
                    C0017.m686(C0014.m250(m66(), 9, 5, 3194), C0016.m608(m66(), 14, 4, 1256));
                    str5 = "ۥ۟۟";
                    iM573 = C0014.m240(str5);
                    break;
                case 1751655:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    if (C0015.f6 >= 0) {
                        iM573 = C0014.m240("ۦۡ۠");
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    } else {
                        str2 = "۠ۢ۠";
                        iM573 = C0015.m573(str2);
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                    break;
                case 1751714:
                    if (C0016.m574() >= 0) {
                        C0013.f2 = 72;
                        str = "ۡۨۢ";
                        iM573 = C0017.m731(str);
                    } else {
                        iM573 = C0016.m618("ۦۡ۠");
                    }
                    break;
                case 1752453:
                    m61(this);
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM573 = C0016.m618("۠ۡۥ");
                    } else {
                        iM573 = C0016.m618("ۦۦۧ");
                    }
                    break;
                case 1752524:
                    f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this;
                    iM573 = C0017.f10 - (C0013.f2 / (-2033)) >= 0 ? C0015.m573("ۥ۟۟") : (C0017.f10 / C0014.f3) + 1748768;
                    break;
                case 1753477:
                    super.onCreate();
                    iM573 = (C0016.f9 | (C0013.f2 + 9927)) <= 0 ? C0013.m105("ۣۧۨ") : C0014.m240("ۥۡۨ");
                    break;
                case 1753482:
                    if (C0017.m717() >= 0) {
                        str2 = "ۥۣ۠";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                        iM573 = C0015.m573(str2);
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    } else {
                        iM573 = (C0016.f9 / C0014.f3) ^ (-1754511);
                    }
                    break;
                case 1753601:
                    str = "ۡۤۦ";
                    iM573 = C0017.m731(str);
                    break;
                case 1753639:
                    break;
                case 1754508:
                    if (C0015.f6 / (C0017.f10 * (-8400)) != 0) {
                        C0015.f6 = 92;
                        iM573 = C0016.m618("ۦۦۧ");
                    } else {
                        iM573 = (C0016.f9 - C0016.f9) + 1747716;
                    }
                    break;
                case 1755372:
                    C0014.m209(sb, C0014.m213(C0017.m726(this)));
                    str4 = "ۢۢۦ";
                    iM573 = C0013.m105(str4);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:411:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x08fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x01b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004e. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        AddressItem addressItem;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        OkHttpClient.Builder builderM72;
        TimeUnit timeUnitM129;
        String str7;
        ArrayList arrayListM68;
        OkHttpClient okHttpClientM52;
        StringBuilder sb;
        String str8;
        ConnectionSpec connectionSpecM88;
        String str9;
        String str10;
        StringBuilder sb2;
        String strM693;
        String str11;
        TimeZone timeZoneM187;
        String strM153;
        String str12;
        int i;
        String str13;
        OkHttpClient.Builder builder;
        String strM250;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String str14;
        String str15;
        int i2;
        OkHttpClient.Builder builderM81;
        String str16;
        String str17;
        OkHttpClient.Builder builder2;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
        String str18;
        String str19;
        String str20;
        TimeZone timeZone = null;
        String str21 = null;
        StringBuilder sb3 = null;
        String str22 = null;
        String strM154 = null;
        String str23 = null;
        int i3 = 0;
        String str24 = null;
        AddressItem addressItem2 = null;
        String str25 = null;
        String str26 = null;
        StringBuilder sb4 = null;
        int i4 = 0;
        int i5 = 0;
        ArrayList arrayList = null;
        OkHttpClient.Builder builder3 = null;
        String str27 = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = null;
        ConnectionSpec connectionSpecM64 = null;
        ConnectionSpec connectionSpec = null;
        ConnectionSpec connectionSpec2 = null;
        ConnectionSpec connectionSpecM75 = null;
        OkHttpClient okHttpClient = null;
        String strM694 = null;
        String strM155 = null;
        DnsOverHttps.Builder builderM69 = null;
        HttpUrl httpUrlM77 = null;
        HttpUrl httpUrl = null;
        OkHttpClient.Builder builder4 = null;
        OkHttpClient.Builder builder5 = null;
        TimeUnit timeUnit = null;
        OkHttpClient.Builder builder6 = null;
        OkHttpClient.Builder builder7 = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = null;
        int iM105 = C0013.m105("ۣۧ۟");
        String str28 = null;
        AddressItem addressItem3 = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = null;
        ArrayList arrayList2 = null;
        while (true) {
            switch (iM105) {
                case 56320:
                    builderM81 = m81(m76(m47(m90(builder5, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, timeUnit), Renderer.DEFAULT_DURATION_TO_PROGRESS_US, timeUnit), Renderer.DEFAULT_DURATION_TO_PROGRESS_US, timeUnit), m67());
                    if (C0014.f3 + (C0014.f3 * 5539) >= 0) {
                        C0016.f9 = 92;
                        i2 = i4;
                        builder6 = builderM81;
                        i4 = i2;
                        iM105 = C0013.m105("ۡۢۧ");
                    } else {
                        builder6 = builderM81;
                        iM105 = (C0014.f3 ^ C0015.f6) + 1746278;
                    }
                    break;
                case 56322:
                case 56449:
                    if (C0013.f2 * (C0017.f10 | 7461) >= 0) {
                        C0015.f6 = 92;
                        str13 = "ۣۨۥ";
                        iM105 = C0013.m105(str13);
                    } else {
                        iM105 = (C0013.f2 ^ C0013.f2) + 1746912;
                    }
                    break;
                case 56326:
                case 1752488:
                    if ((C0016.f9 ^ (C0013.f2 % 8000)) <= 0) {
                        C0017.f10 = 63;
                        iM105 = C0016.m618("ۡ۠");
                    } else {
                        iM105 = (C0017.f10 % C0017.f10) + 1746877;
                    }
                    break;
                case 56359:
                    sb2 = sb3;
                    strM693 = str22;
                    sb3 = sb2;
                    str22 = strM693;
                    iM105 = (C0015.f6 % C0017.f10) + 1747332;
                    break;
                case 56421:
                    builderM69 = m69(new DnsOverHttps.Builder(), okHttpClient);
                    if (C0016.m622(strM155)) {
                        if (C0014.f3 >= 0) {
                            C0015.f6 = 16;
                            httpUrl = null;
                            iM105 = C0013.m105("ۣۡۨ");
                        } else {
                            httpUrl = null;
                            iM105 = (C0015.f6 | C0014.f3) + 1755533;
                        }
                    } else if (C0015.m570() <= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("۠ۥ۠");
                    } else {
                        iM105 = C0016.f9 + C0016.f9 + 1750002;
                    }
                    break;
                case 56446:
                    try {
                        m89(builder7);
                        if (C0017.f10 < 0) {
                            iM105 = C0013.m105("ۥۤۨ");
                        } else {
                            builderM72 = builder5;
                            timeUnitM129 = timeUnit;
                            str6 = "۠۠";
                            builder5 = builderM72;
                            timeUnit = timeUnitM129;
                            iM105 = C0013.m105(str6);
                        }
                        break;
                    } catch (Throwable th) {
                        C0013.m180(th);
                        if (C0017.f10 >= 0) {
                            C0016.m574();
                            iM105 = C0015.m573("۟ۤ۠");
                        } else {
                            str17 = "۠ۦ";
                            iM105 = C0013.m105(str17);
                        }
                    }
                    break;
                case 56511:
                    str13 = "ۣۨۢ";
                    iM105 = C0013.m105(str13);
                    break;
                case 56513:
                    if (C0014.f3 >= 0) {
                        C0016.f9 = 97;
                        iM105 = C0015.m573("ۡۦ۟");
                    } else {
                        iM105 = (C0017.f10 * C0014.f3) + 1588716;
                    }
                    break;
                case 56537:
                    if (C0017.m717() >= 0) {
                        str5 = "ۦۥ";
                        iM105 = C0017.m731(str5);
                    } else {
                        iM105 = (C0016.f9 * C0016.f9) + 1094135;
                    }
                    break;
                case 56568:
                    strM694 = C0017.m693(m66(), TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 25, 3158);
                    if ((C0017.f10 | (C0016.f9 % (-5089))) < 0) {
                        str11 = "ۦۨۨ";
                        iM105 = C0015.m573(str11);
                    } else {
                        C0017.f10 = 11;
                        str14 = "ۥۣۨ";
                        strM250 = str27;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3;
                        builder = builder3;
                        str27 = strM250;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        builder3 = builder;
                        iM105 = C0016.m618(str14);
                    }
                    break;
                case 1746690:
                case 1751774:
                    iM105 = (C0017.f10 - C0016.f9) ^ (-1754008);
                    break;
                case 1746723:
                    strM154 = C0013.m153(m66(), 22, 1, 489);
                    if (C0014.f3 < 0) {
                        str20 = "ۣۧۡ";
                        iM105 = C0017.m731(str20);
                    } else {
                        C0017.f10 = 12;
                        str19 = strM155;
                        strM155 = str19;
                        iM105 = C0017.m731("ۣ۠ۥ");
                    }
                    break;
                case 1746780:
                    if ((C0017.f10 ^ (C0014.f3 % (-4988))) <= 0) {
                        httpUrl = httpUrlM77;
                        iM105 = C0017.m731("۠ۨ۟");
                    } else {
                        httpUrl = httpUrlM77;
                        iM105 = (C0016.f9 / C0017.f10) + 1751777;
                    }
                    break;
                case 1746781:
                    if (C0014.f3 - (C0017.f10 % (-6226)) > 0) {
                        str17 = "۟۟ۢ";
                        iM105 = C0013.m105(str17);
                    } else {
                        C0014.m245();
                        iM105 = C0013.m105("ۥۤۨ");
                    }
                    break;
                case 1746788:
                    str20 = C0014.f3 >= 0 ? "۟ۨ۟" : "۟ۢ۠";
                    iM105 = C0017.m731(str20);
                    break;
                case 1746815:
                case 1746941:
                    iM105 = C0016.f9 + C0017.f10 + 1751725;
                    break;
                case 1746843:
                    iM105 = C0015.f6 * (C0015.f6 * (-9619)) <= 0 ? C0013.m105("ۣۦ۠") : C0017.f10 + C0013.f2 + 1752475;
                    break;
                case 1746877:
                    m81(builder7, m67());
                    m82(m83(C0014.m208()), m52(builder7));
                    O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1048O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this;
                    m85(null);
                    if (C0016.f9 <= 0) {
                        iM105 = C0015.m573("ۨۢ۟");
                    } else {
                        str10 = "۠ۢۨ";
                        iM105 = C0016.m618(str10);
                    }
                    break;
                case 1746912:
                    String strM732 = C0017.m732();
                    if (i5 <= 12) {
                        addressItem = new AddressItem();
                        if (i5 <= 0) {
                            str = strM732;
                            str24 = strM732;
                            if (C0014.f3 * (C0015.f6 ^ 2216) <= 0) {
                                str2 = "ۤۨۥ";
                            } else {
                                str2 = "ۡ۟ۡ";
                            }
                            addressItem2 = addressItem;
                            str26 = str;
                            iM105 = C0013.m105(str2);
                        } else if (C0016.f9 <= 0) {
                            addressItem2 = addressItem;
                            str26 = strM732;
                            str25 = str22;
                            str24 = strM732;
                            iM105 = C0016.m618("ۢۧۢ");
                        } else {
                            str3 = "ۢۥۧ";
                            addressItem2 = addressItem;
                            str26 = strM732;
                            str4 = str22;
                            str24 = strM732;
                            str25 = str4;
                            iM105 = C0017.m731(str3);
                        }
                    } else {
                        str24 = strM732;
                        if (C0016.m574() >= 0) {
                            C0017.f10 = 68;
                            str10 = "۟۠ۧ";
                            iM105 = C0016.m618(str10);
                        } else {
                            iM105 = (C0015.f6 | C0015.f6) ^ (-1755014);
                        }
                    }
                    break;
                case 1746935:
                    iM105 = C0016.m574() >= 0 ? C0015.m573("۟ۧ۠") : (C0016.f9 - C0013.f2) + 56537;
                    break;
                case 1746972:
                    try {
                        m89(builder6);
                        if ((C0014.f3 ^ (C0015.f6 * 1548)) <= 0) {
                            C0013.m114();
                            str9 = "ۧۨ۟";
                            connectionSpecM88 = connectionSpec2;
                            connectionSpec2 = connectionSpecM88;
                            iM105 = C0017.m731(str9);
                        } else {
                            iM105 = (C0016.f9 * C0015.f6) + 2239462;
                        }
                    } catch (Throwable th2) {
                        C0013.m180(th2);
                        if (C0016.f9 - (C0014.f3 / (-9655)) <= 0) {
                            C0013.m114();
                            iM105 = C0013.m105("۠ۢۨ");
                        } else {
                            iM105 = (C0014.f3 / C0013.f2) ^ 1751774;
                        }
                    }
                    break;
                case 1746975:
                case 1752645:
                    str16 = "ۨۢ۟";
                    iM105 = C0014.m240(str16);
                    break;
                case 1747686:
                case 1748616:
                case 1750655:
                case 1750722:
                case 1751686:
                case 1755374:
                case 1755525:
                    str10 = "ۣۨ";
                    iM105 = C0016.m618(str10);
                    break;
                case 1747742:
                    strM155 = C0013.m153(m66(), 89, 31, 2322);
                    str15 = "ۧ۠";
                    iM105 = C0017.m731(str15);
                    break;
                case 1747750:
                    break;
                case 1747927:
                    C0016.m581(arrayList, C0017.m693(m66(), 52, 6, 3081));
                    C0016.m581(arrayList, C0016.m608(m66(), 58, 7, 2228));
                    C0016.m581(arrayList, C0013.m153(m66(), 65, 5, 941));
                    builder = new OkHttpClient.Builder();
                    strM250 = C0014.m250(m66(), 70, 11, 2440);
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strM250);
                    str14 = "ۨۡ۟";
                    str27 = strM250;
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    builder3 = builder;
                    iM105 = C0016.m618(str14);
                    break;
                case 1747930:
                    m60(addressItem3, str28);
                    m59(addressItem3, C0016.m608(m66(), 32, 4, 1097));
                    ArrayList arrayListM54 = m54();
                    C0016.m581(arrayListM54, addressItem3);
                    i3 = -12;
                    arrayList2 = arrayListM54;
                    iM105 = C0013.m105("ۣ۟ۧ");
                    break;
                case 1748611:
                    StringBuilder sb5 = new StringBuilder();
                    C0014.m209(sb5, str26);
                    C0016.m579(sb5, i5);
                    C0014.m209(sb5, C0014.m250(m66(), 36, 2, 2014));
                    m59(addressItem2, C0013.m157(sb5));
                    sb = new StringBuilder(str21);
                    if (C0015.f6 >= 0) {
                        sb4 = sb;
                        iM105 = C0014.m240("۟ۥۣ");
                    } else {
                        str8 = "ۣۥ۠";
                        sb4 = sb;
                        iM105 = C0015.m573(str8);
                    }
                    break;
                case 1748617:
                    iM105 = (C0016.f9 % C0013.f2) + 1749046;
                    break;
                case 1748710:
                    timeZoneM187 = timeZone;
                    strM153 = str21;
                    str12 = "ۣۡۢ";
                    i = i4;
                    timeZone = timeZoneM187;
                    str21 = strM153;
                    iM105 = C0015.m573(str12);
                    i5 = i;
                    break;
                case 1748737:
                    okHttpClientM52 = m52(builder3);
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        arrayListM68 = arrayList;
                        str7 = "ۢ۟ۧ";
                        arrayList = arrayListM68;
                        okHttpClient = okHttpClientM52;
                        iM105 = C0015.m573(str7);
                    } else {
                        okHttpClient = okHttpClientM52;
                        iM105 = (C0014.f3 * C0017.f10) + 1592497;
                    }
                    break;
                case 1748773:
                    iM105 = (C0015.f6 * C0016.f9) + 2239653;
                    break;
                case 1748826:
                    strM155 = C0013.m153(m66(), 181, 28, 867);
                    iM105 = (C0016.f9 * C0014.f3) + 1928374;
                    break;
                case 1748892:
                    sb2 = new StringBuilder(str21);
                    int iM128 = C0013.m128(timeZone);
                    strM693 = C0017.m693(m66(), 21, 1, 1483);
                    if (iM128 < 0) {
                        sb3 = sb2;
                        str22 = strM693;
                        iM105 = (C0015.f6 % C0017.f10) + 1747332;
                    } else if (C0013.f2 % (C0015.f6 - 5168) <= 0) {
                        C0017.f10 = 1;
                        sb3 = sb2;
                        str23 = strM693;
                        str22 = strM693;
                        iM105 = C0013.m105("ۧۥۧ");
                    } else {
                        sb3 = sb2;
                        str23 = strM693;
                        str22 = strM693;
                        iM105 = 1752188 + (C0013.f2 - C0015.f6);
                    }
                    break;
                case 1749578:
                    iM105 = C0015.m570() <= 0 ? C0017.m731("ۨۡ۟") : (C0016.f9 % C0017.f10) ^ 1750801;
                    break;
                case 1749764:
                    if (C0016.f9 <= 0) {
                        str26 = str25;
                        iM105 = C0013.m105("ۦ۠ۧ");
                    } else {
                        str26 = str25;
                        iM105 = C0014.m240("ۡ۟ۡ");
                    }
                    break;
                case 1749821:
                    addressItem = addressItem2;
                    str = str26;
                    if (C0014.f3 * (C0015.f6 ^ 2216) <= 0) {
                        str2 = "ۤۨۥ";
                    } else {
                        str2 = "ۡ۟ۡ";
                    }
                    addressItem2 = addressItem;
                    str26 = str;
                    iM105 = C0013.m105(str2);
                    break;
                case 1749823:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("۠ۥ۠");
                    } else {
                        iM105 = C0016.f9 + C0016.f9 + 1750002;
                    }
                    break;
                case 1749855:
                    try {
                        m89(builder3);
                        if (C0014.f3 >= 0) {
                            C0016.f9 = 76;
                            iM105 = C0017.m731("ۤۧۡ");
                        } else {
                            str18 = "ۢ۟ۧ";
                            builder2 = builder7;
                            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4;
                            builder7 = builder2;
                            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                            iM105 = C0013.m105(str18);
                        }
                    } catch (Throwable th3) {
                        C0013.m180(th3);
                        if (C0017.f10 - (C0017.f10 - 7418) <= 0) {
                            C0016.m574();
                            iM105 = C0013.m105("ۨ۠");
                        } else {
                            connectionSpecM88 = connectionSpec2;
                            connectionSpec2 = connectionSpecM88;
                            iM105 = C0017.m731("ۦۨ۟");
                        }
                    }
                    break;
                case 1750539:
                    i5 = i3;
                    iM105 = C0015.m573("۟ۦۧ");
                    break;
                case 1750568:
                    iM105 = (C0013.f2 | C0013.f2) + 1749822;
                    break;
                case 1750569:
                    strM155 = C0017.m693(m66(), TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 28, 2934);
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("ۣۧۨ");
                    } else {
                        iM105 = (C0013.f2 / C0016.f9) + 1755491;
                    }
                    break;
                case 1750596:
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        str11 = "ۣۧۡ";
                        iM105 = C0015.m573(str11);
                    } else {
                        iM105 = C0013.m105("۠ۢ");
                    }
                    break;
                case 1750718:
                    C0014.m209(sb4, str26);
                    C0016.m579(sb4, i5);
                    C0014.m209(sb4, C0017.m693(m66(), 38, 3, 2644));
                    m60(addressItem2, C0013.m157(sb4));
                    C0016.m581(arrayList2, addressItem2);
                    i2 = i5 + 1;
                    if ((C0013.f2 ^ (C0015.f6 / (-4193))) <= 0) {
                        C0014.f3 = 39;
                        i4 = i2;
                        iM105 = C0016.m618("ۣۧ۟");
                    } else {
                        builderM81 = builder6;
                        builder6 = builderM81;
                        i4 = i2;
                        iM105 = C0013.m105("ۡۢۧ");
                    }
                    break;
                case 1750781:
                    if (C0013.f2 + (C0016.f9 - 4456) >= 0) {
                        C0014.f3 = 23;
                        str23 = strM154;
                        iM105 = C0015.m573("ۣۥ۠");
                    } else {
                        str9 = "ۨۢ۟";
                        connectionSpecM88 = connectionSpec2;
                        str23 = strM154;
                        connectionSpec2 = connectionSpecM88;
                        iM105 = C0017.m731(str9);
                    }
                    break;
                case 1750788:
                    if (C0013.m114() < 0) {
                        C0017.m717();
                        str15 = "۠۠۠";
                        iM105 = C0017.m731(str15);
                    } else {
                        iM105 = C0013.f2 + C0013.f2 + 1750933;
                    }
                    break;
                case 1750813:
                    strM155 = C0013.m153(m66(), TbsListener.ErrorCode.DEXOPT_EXCEPTION, 32, 2294);
                    str6 = "ۦۧ";
                    builderM72 = builder5;
                    timeUnitM129 = timeUnit;
                    builder5 = builderM72;
                    timeUnit = timeUnitM129;
                    iM105 = C0013.m105(str6);
                    break;
                case 1750818:
                case 1753693:
                    iM105 = (C0013.f2 | C0017.f10) + 1755482;
                    break;
                case 1751620:
                    httpUrlM77 = m77(strM155);
                    if (C0016.m574() < 0) {
                        str8 = "۟ۢ۟";
                        sb = sb4;
                        sb4 = sb;
                        iM105 = C0015.m573(str8);
                    } else {
                        C0016.f9 = 50;
                        iM105 = C0015.m573("۟ۦۧ");
                    }
                    break;
                case 1751652:
                    if (C0013.m114() < 0) {
                        iM105 = C0015.m573("ۧۢۧ");
                    } else {
                        str15 = "ۨ۠";
                        iM105 = C0017.m731(str15);
                    }
                    break;
                case 1751742:
                    str10 = "ۡۦ۟";
                    iM105 = C0016.m618(str10);
                    break;
                case 1751776:
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = m92(m48(builderM69, httpUrl));
                    OkHttpClient.Builder builder8 = new OkHttpClient.Builder();
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6 = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(C0017.m693(m66(), 266, 4, 1603));
                    m53(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6, m49());
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6.f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0016.m580();
                    m73(builder8, m51(new ConnectionSpec[]{connectionSpecM64, connectionSpec, connectionSpec2, connectionSpecM75}));
                    if (C0016.m574() >= 0) {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6;
                        builder4 = builder8;
                        iM105 = C0013.m105("ۨۦۣ");
                    } else {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6;
                        builder4 = builder8;
                        iM105 = (C0016.f9 - C0013.f2) + 1752827;
                    }
                    break;
                case 1752617:
                    if (C0013.f2 * (C0015.f6 % (-2646)) >= 0) {
                        iM105 = C0013.m105("ۤۥ");
                    } else {
                        str7 = "ۥۣ۠";
                        arrayListM68 = arrayList;
                        okHttpClientM52 = okHttpClient;
                        arrayList = arrayListM68;
                        okHttpClient = okHttpClientM52;
                        iM105 = C0015.m573(str7);
                    }
                    break;
                case 1752640:
                    m57(builder6, false);
                    m79(builder6, false);
                    m52(builder6);
                    builder2 = new OkHttpClient.Builder();
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str27);
                    m53(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, m49());
                    if (C0013.m114() >= 0) {
                        str18 = "ۨ۠۠";
                        builder7 = builder2;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                        iM105 = C0013.m105(str18);
                    } else {
                        builder7 = builder2;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                        iM105 = (C0013.f2 / C0013.f2) + 1752674;
                    }
                    break;
                case 1752675:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0016.m580();
                    m72(builder7, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4);
                    m73(builder7, m51(new ConnectionSpec[]{m64(), m65(), m88(), m75()}));
                    m58(builder7, true);
                    m57(builder7, true);
                    if (C0017.m717() >= 0) {
                        C0016.f9 = 26;
                        iM105 = C0014.m240("ۦۢ۟");
                    } else {
                        iM105 = (C0015.f6 - C0015.f6) + 1754569;
                    }
                    break;
                case 1752701:
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 68;
                        str10 = "۟۠ۧ";
                        iM105 = C0016.m618(str10);
                    } else {
                        iM105 = (C0015.f6 | C0015.f6) ^ (-1755014);
                    }
                    break;
                case 1752733:
                    strM155 = C0016.m608(m66(), 120, 33, 839);
                    if (C0014.m245() >= 0) {
                        C0016.m574();
                        str17 = "۠ۦ";
                        iM105 = C0013.m105(str17);
                    } else {
                        iM105 = (C0013.f2 ^ C0017.f10) ^ (-1753299);
                    }
                    break;
                case 1752736:
                    builderM72 = m72(builder4, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5);
                    timeUnitM129 = C0013.m129();
                    str6 = "۠۠";
                    builder5 = builderM72;
                    timeUnit = timeUnitM129;
                    iM105 = C0013.m105(str6);
                    break;
                case 1753453:
                    m72(builder3, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3);
                    iM105 = C0016.f9 + C0016.f9 + 1748237;
                    break;
                case 1753507:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 10;
                        iM105 = C0017.m731("ۦۧۢ");
                    } else {
                        iM105 = C0015.m573("ۣۣ۟");
                    }
                    break;
                case 1753604:
                    if (C0015.f6 + C0015.f6 + 7437 <= 0) {
                        C0014.m245();
                        str16 = "ۦۣۡ";
                        iM105 = C0014.m240(str16);
                    } else {
                        iM105 = (C0014.f3 | C0016.f9) + 1754594;
                    }
                    break;
                case 1753665:
                    if (C0015.f6 - (C0013.f2 ^ 880) >= 0) {
                        C0017.f10 = 30;
                        iM105 = C0014.m240("ۥۨۨ");
                    } else {
                        iM105 = (C0016.f9 % C0017.f10) + 1749527;
                    }
                    break;
                case 1753666:
                    if ((C0015.f6 ^ (C0014.f3 - 6139)) > 0) {
                        C0016.m574();
                        str3 = "ۥۧۢ";
                        str4 = str25;
                        str25 = str4;
                        iM105 = C0017.m731(str3);
                    } else {
                        iM105 = (C0017.f10 ^ C0016.f9) + 1756037;
                    }
                    break;
                case 1753697:
                    iM105 = C0017.m731("۟ۨۨ");
                    break;
                case 1753702:
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        strM155 = strM694;
                    } else {
                        strM155 = strM694;
                        iM105 = (C0016.f9 / C0015.f6) + 56422;
                    }
                    break;
                case 1754379:
                    m87();
                    C0016.m636(C0017.m681());
                    m78();
                    m54();
                    timeZoneM187 = C0013.m187();
                    strM153 = C0013.m153(m66(), 18, 3, 2569);
                    if (C0013.f2 * (C0016.f9 - 892) >= 0) {
                        C0016.f9 = 9;
                        str12 = "ۣۥۤ";
                        i = i5;
                        timeZone = timeZoneM187;
                        str21 = strM153;
                        iM105 = C0015.m573(str12);
                        i5 = i;
                    } else {
                        timeZone = timeZoneM187;
                        str21 = strM153;
                        iM105 = (C0016.f9 % C0014.f3) + 1748728;
                    }
                    break;
                case 1754439:
                    if (C0017.f10 >= 0) {
                        C0015.m570();
                        iM105 = C0013.m105("ۦۣۨ");
                    } else {
                        str2 = "ۨ۠ۦ";
                        addressItem = addressItem2;
                        str = str26;
                        addressItem2 = addressItem;
                        str26 = str;
                        iM105 = C0013.m105(str2);
                    }
                    break;
                case 1754505:
                    m91(m55());
                    OkHttpClient okHttpClientM53 = m52(builder6);
                    O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOM74 = m74();
                    C0013.m137(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOM74);
                    m84(okHttpClientM53, C0014.m250(m66(), 270, 20, 1390));
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOM74.f1601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = okHttpClientM53;
                    if (C0015.f6 + (C0016.f9 - 8376) >= 0) {
                        str8 = "۟ۢ۟";
                        sb = sb4;
                        sb4 = sb;
                        iM105 = C0015.m573(str8);
                    } else {
                        iM105 = C0015.f6 + C0014.f3 + 1753464;
                    }
                    break;
                case 1754569:
                    m79(builder7, true);
                    iM105 = C0014.m245() >= 0 ? C0017.m731("ۣ۠ۦ") : C0015.m573("ۤۢ");
                    break;
                case 1754597:
                    m80(this, C0017.m693(m66(), 41, 2, 2297));
                    arrayListM68 = m68();
                    C0016.m581(arrayListM68, C0014.m250(m66(), 43, 2, 678));
                    C0016.m581(arrayListM68, C0017.m693(m66(), 45, 2, 1327));
                    C0016.m581(arrayListM68, C0013.m153(m66(), 47, 2, 2857));
                    C0016.m581(arrayListM68, C0013.m153(m66(), 49, 3, TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT));
                    if (C0016.f9 + (C0013.f2 / 9573) <= 0) {
                        C0014.m245();
                        arrayList = arrayListM68;
                        iM105 = C0015.m573("ۥۦۤ");
                    } else {
                        okHttpClientM52 = okHttpClient;
                        str7 = "۠ۨ۟";
                        arrayList = arrayListM68;
                        okHttpClient = okHttpClientM52;
                        iM105 = C0015.m573(str7);
                    }
                    break;
                case 1754654:
                    iM105 = (C0014.f3 | C0017.f10) ^ (-1750782);
                    break;
                case 1755368:
                    connectionSpecM64 = m64();
                    ConnectionSpec connectionSpecM65 = m65();
                    connectionSpecM88 = m88();
                    connectionSpecM75 = m75();
                    m73(builder3, m51(new ConnectionSpec[]{connectionSpecM64, connectionSpecM65, connectionSpecM88, connectionSpecM75}));
                    m86(builder3, new Cache(new File(C0014.m257(C0014.m271(C0014.m208())), C0013.m153(m66(), 81, 8, 1575)), 10485760L));
                    if (C0015.f6 % (C0017.f10 + 1721) < 0) {
                        str9 = "ۣۣۡ";
                        connectionSpec = connectionSpecM65;
                        connectionSpec2 = connectionSpecM88;
                        iM105 = C0017.m731(str9);
                    } else {
                        C0015.f6 = 80;
                        connectionSpec = connectionSpecM65;
                        connectionSpec2 = connectionSpecM88;
                        iM105 = C0017.m731("ۦۨ۟");
                    }
                    break;
                case 1755398:
                    m53(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3, m49());
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0016.m580();
                    str5 = "ۦ۠ۧ";
                    iM105 = C0017.m731(str5);
                    break;
                case 1755429:
                    C0014.m209(sb3, str23);
                    C0014.m209(sb3, C0017.m652(C0014.m250(m66(), 23, 9, 2857), new Object[]{C0014.m228(C0017.m709(C0013.m128(timeZone)) / 3600000), C0014.m228((C0017.m709(C0013.m128(timeZone)) / 60000) % 60)}));
                    String strM157 = C0013.m157(sb3);
                    AddressItem addressItem4 = new AddressItem();
                    if (C0015.f6 * (C0013.f2 + 8739) >= 0) {
                        str28 = strM157;
                        addressItem3 = addressItem4;
                        iM105 = C0013.m105("۠ۢ");
                    } else {
                        str28 = strM157;
                        addressItem3 = addressItem4;
                        iM105 = (C0017.f10 * C0017.f10) + 1173366;
                    }
                    break;
                case 1755467:
                    switch (C0017.m725(C0017.m681())) {
                        case 1:
                            if (C0013.m114() < 0) {
                                str15 = "ۨ۠";
                                iM105 = C0017.m731(str15);
                            } else {
                                iM105 = C0015.m573("ۧۢۧ");
                            }
                            break;
                        case 2:
                            str13 = "ۣۨۢ";
                            iM105 = C0013.m105(str13);
                            break;
                        case 3:
                            str10 = "ۡۦ۟";
                            iM105 = C0016.m618(str10);
                            break;
                        case 4:
                            iM105 = (C0014.f3 | C0017.f10) ^ (-1750782);
                            break;
                        case 5:
                            if (C0013.m114() < 0) {
                                iM105 = C0013.f2 + C0013.f2 + 1750933;
                            } else {
                                C0017.m717();
                                str15 = "۠۠۠";
                                iM105 = C0017.m731(str15);
                            }
                            break;
                        case 6:
                            iM105 = C0014.m240("۠ۢ۠");
                            break;
                        default:
                            if ((C0015.f6 ^ (C0014.f3 - 6139)) > 0) {
                                iM105 = (C0017.f10 ^ C0016.f9) + 1756037;
                            } else {
                                C0016.m574();
                                str3 = "ۥۧۢ";
                                str4 = str25;
                                str25 = str4;
                                iM105 = C0017.m731(str3);
                            }
                            break;
                    }
                    break;
                case 1755468:
                    str17 = "ۣۣ۟";
                    iM105 = C0013.m105(str17);
                    break;
                case 1755492:
                    iM105 = (C0015.f6 ^ C0015.f6) + 1747686;
                    break;
                case 1755557:
                    iM105 = C0014.m240("۠ۢ۠");
                    break;
                case 1755560:
                    str19 = str24;
                    strM155 = str19;
                    iM105 = C0017.m731("ۣ۠ۥ");
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
