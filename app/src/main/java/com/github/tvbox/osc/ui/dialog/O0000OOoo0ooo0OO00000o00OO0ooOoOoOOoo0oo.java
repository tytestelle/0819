package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import com.github.tvbox.osc.base.C0013;
import com.github.tvbox.osc.base.C0014;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomLayoutManager;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsListener;
import com.warkiz.widget.IndicatorSeekBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.dnsoverhttps.DnsOverHttps;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import xyz.doikki.videoplayer.player.VideoView;
import xyz.doikki.videoplayer.render.RenderViewFactory;
import xyz.doikki.videoplayer.render.TextureRenderViewFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo implements View.OnKeyListener, View.OnClickListener {
    public static int O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = 0;

    /* JADX INFO: renamed from: O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, reason: collision with root package name */
    public static int f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = 0;

    /* JADX INFO: renamed from: O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, reason: collision with root package name */
    public static int f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = 0;

    /* JADX INFO: renamed from: O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, reason: collision with root package name */
    public static int f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = 1;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f8short = {27323, 21845, 30702, 30793, 32408, 22803, 18305, 26639, 32132, -28972, -27854, 25042, 24668, 25039, -28849, 31647, 23302, 30075, 29345, 32006, -32270, -25515, 29169, 32342, 28048, 29332, -32752, 29888, 23628, 21886, -30787, 29549, 23246, -32591, -31897, 30647, 22941, 17981, -31915, 30597, 23114, 27050, -30934, 29690, 27086, 30147, -30842, 29526, -29317, 31897, 24865, 23447, 32361, -25552, 24710, 17625, -31607, 27898, 27246, 26524, 28362, 30168, -25942, -31559, 27059, 24658, 31738, 20490, 1462, 1456, 1463, 1460, -27138, -27209, 24953, -31234, 23987, 25614, 22148, 30969, -27185, 31724, 24980, -28099, -25939, -28049, -27790, -25680, 28671, 30401, 22351, -29392, -28934, -27811, 1268, 1249, 1270, -28909, -27980, 524, 533, 521, 520, -29787, 26070, 3056, 3030, 3008, 3031, 3044, 3010, 3008, 3019, 3025, 1738, 1767, 1763, 1766, 1767, 1776, 1777, 24116, -31669, 3143, 3142, 3152, 3136, 22057, -26540, 2264, 2265, 2255, 2271, 25183, 32091, 24983, -28267, 27855, 29643, 30112, -25874, 20585, -30186, 21632, 27257, 23336, -27307, 21315, 28090, 22581, -25429, 2307, 2326, 2305, 22692, -25542, 27873, -29672, -25401, -28776, 21720, 22944, 22455, 25687, 26990, -30033, 22825, 26037, -31458, 21911, 32572, -25243, -24826, 20893, -26850, -28862, 25957, 25793, -27275, -26089, 24265, 19803, -29382, 31960, -28823, 23327, 27620, 23414, 23371, -30742, -31009, -25794, 22833, 30540, 23439, -24815, 20794, 29437, 23951, 23153, 21902, 29462, 21917, -26007, -25994, 23436, 22417, 23742, 28007, 29034, -32668, 26194, 32365, 23078, -31869, 30292, -32676, -30838, -28834, 23336, 24052, 27262, -29295, 23015, -30214, 22663, -25542, 24561, 21869, 25319, 25009, 20909, -28837, -25076, -25342, -25610, 24964, 21674, 21695, 30845, 31426, 20786, 1478, 1491, 1476, 22998, 31929, 21870, 27543, -30674, 31998, 27878, 30649, 27539, 21833, 28591, 27057, 21464, 17442, -31941, -25600, 24148, 28465, 32181, -24677, 18114, -28575, -31354, 20547, -28718, 31490, 26915, -28350, 25174, 25672, 20660, 23125, 2937, 2931, 2926, -31810, -27927, 25215, 28934, 22687, -32439, 26946, 23660, 24298, 19243, 19353, 25623, -29287, 24352, 18886, 26184, 2402, 2419, 2419, 18114, 26956, 2482, 2479, 2473, 29075, -32740, 2979, 3006, 3000, -31615, -32243, 30672, 30196, -32056, 29482, 1679, 1676, 1677, 32426, -28891, 1788, 1791, 1790, -30246, -28842, 772, 793, 782, 31533, -30046, 2985, 2996, 2979, -31613, -32241, -30120, 20723, 28960, 23396, -25258, -30678, 1448, 1455, 1443, 1440, 983, 985, 976, 20698, 23028, 21777, 24389, 1975, 1968, 2038, 345, 346, 281, 2967, 3025, 2932, 2933, 2870, 1857, 1861, 1795, 3257, 3259, 3320, 431, 430, 30796, 21904, -28589, -29120, 2943, 2941, 29343, 24387, -25984, -31597, 23440, -24818, -25810, -31427, 2027, 32264, 21460, -27113, -30716, 2656, 29569, 24157, -25698, -31347, 1239, 32048, 20716, -27345, -29892, 2618, 2571, 2582, 2586, 2587, 2588, 2571, 3137, 3175, 3168, 3188, 3187, 3185, 3191, 1494, 1473, 1490, 2218, 2235, 2223, 30229, 29745, 23403, 25302, 1477, 1448, 21528, 28069, 949, 899, 914, -28702, -30668, -25096, -31928, 27075, 30158, 3168, 3175, 3193, 24724, 24839, 21073, 1130, 1116, 1116, 1106, 1133, 1110, 27860, 28889, 30705, 28285, -26385, -31137, 30202, 27766, -31491, 24055, 32221, 28548, 17682, 30009, 22936, 30042, 2991, 18484, 30751, 21694, 30844, 1674, 19661, 32050, 20971, 32041, 22062, -29615, 22079, 31485, 2332, 2313, 2334, 27585, 23225, 21772, 28771, 706, 727, 704, 19591, 29811, 24274, 31677, -26789, -32217, -28651, 21204, 29938, 20665, 23839, 25574, 3215, 3313, 3223, 23100, 25797, 17370, 23946, 2272, 2245, 2278, 2260, 2240, 2259, 2245, 2328, 2364, 2344, 2349, 2416, 22524, -27806, -32599, -30088, -28480, -26829, 1023, 1018, 1020, 3035, 3059, 3059, 3067, 3056, 3065, 31448, 21608, 28624, 23294, 25554, 24053, 27779, 22957, 27242, 22035, 25221, 32129, 18720, 29140, 24862, 32282, -28965, 25413, 24835, 32263, 23082, -32557, 21611, 27729, -30079, 24388, -32222, 21059, 476, 453, 21915, -32641, 21946, 26591, -24642, 24356, 25053, 27741, 18220, 28151, -27242, 947, 930, 930, 31969, 22698, 27883, -27510, 20729, -30074, 19685, -29293, 27333, -27996, 25580, 21488, 22231, -29528, 28544, -26655, 448, 469, 450, 32406, 23261, 28148, 29424, 29851, -25643, 23201, 26945, 25720, -30791, 29457, -28344, -27861, 23984, 23024, -25234, 21317, 28802, 24445, 22659, 22396, 29156, 22645, -26751, -26722, 22116, -32119, 25791, 31872, 22731, -31467, 28866, -31030, -32484, -31805, 22453, 20841, 26339, -27698, 20485, 23193, 27923, 22512, 23775, 28636, 24512, -32458, -28575, -27499, -25609, 24361, 19643, 23708, 25189, -27660, 20789, 23891, 25961, -31815, 22140, 27801, 20690, -31667, 21548, -30574, -26711, 18459, 26517, 26092, 18935, 25301, 25851, 27806, -29159, 32763, 2508, 2525, 2525, 18028, 27106, 29933, 24969, 28612, 27776, 27861, 22247, -2518, 2362, 25779, 26615, 26530, 23952, -675, 589, 630, 12870, 19881, 23370, 24501, 30114, -26711, -25889, 28601, -30726, 18019, 24431, 17947, 2273, 2292, 2302, 2292, 2290, 2288, 2299, 2220, 2220, 22421, 26117, 22022, -2151, 23423, 27461, 18190, -30513, 23709, 21696, 29103, 23050, -30616, -2151, 27349, 28572, -31279, 26117, 28656, -30337, 30660, 18079, 2233, 2229, -30726, 18019, 18072, 23383, 18075, 18030, 18368, 23203, 18377, 2233, 2229, 18079, 18357, 2233, 2229, 22589, 21453, 2233, 2229, 18078, -30744, 29660, 22800, 21292, 14487, -30726, 18019, 23000, -31316, 18049, 18000, 18190, 26078, -31936, 18410, 32189, 2233, 2229, -31902, 17947, 21276, -32688, 23707, 2215, 2209, 21658, 28003, 22800, 23221, -24847, 14487, -30726, 18019, 18410, 32189, -31902, -26400, 21277, 32365, 23014, 25664, 22302, 25664, -32431, -2151, 28948, 25591, 27823, 22195, 18030, 18368, -31279, 26117, -30898, -32551, 18357, 27704, -2151, 28067, -31316, 27267, 23995, 23491, 29660, 14487, 2207, -30726, 18019, 28021, 23182, 22127, 18030, 18368, -26142, 2220, 23704, 18140, 32273, 21261, 27948, 30513, 14484, 23033, 18306, 23394, 27267, 30660, 29260, -2151, -31555, -24921, 18079, 22470, 23362, -28158, -2156, 20759, 28572, 31396, 20968, -30576, -30337, 22127, 30289, 30290, -2151, -31902, -26400, 21277, 18079, -30875, -32431, 23180, 14487, 2207, 27334, 23440, 23187, 23364, -31902, 18248, 32204, 22895, 20881, 2207, 2301, 2273, 2273, 2277, 2278, 2223, 2234, 2234, 2290, 2300, 2273, 2301, 2272, 2295, 2235, 2294, 2298, 2296, 2234, 2262, 2292, 2273, 2243, 2298, 2289, 2241, 2243, 2266, 2291, 2291, 2300, 2294, 2300, 2292, 2297, 2234, 2241, 2243, 2263, 2298, 2285, 2266, 2246, 2262, 2207, 2301, 2273, 2273, 2277, 2278, 2223, 2234, 2234, 2290, 2300, 2273, 2301, 2272, 2295, 2235, 2294, 2298, 2296, 2234, 2273, 2292, 2302, 2292, 2290, 2288, 2299, 2220, 2220, 2234, 2263, 2298, 2285, 2207, -30726, 18019, -26499, 23187, 2300, 2294, 2298, 2299, 30133, 28613, 28656, -30337, 2300, 2294, 2298, 2299, 2291, 2298, 2299, 2273, 22246, 23397, -2151, 30133, 28613, 18000, 18190, 22250, 20914, 32189, 27298, 17969, 26068, 21491, 18165, 18410, 32189, -2151, 28607, 
    30298, 2300, 2294, 2298, 2299, 2291, 2298, 2299, 2273, 27267, 23011, 23014, -30527, 23033, 23405, 18163, -24585, 27421, 28630, -31955, 23418, -2151, 18072, 22274, 32189, 17947, 18030, 18368, 24019, 18063, 32189, -26495, 14487, -30657, -26264, 27134, 31367, 20714, -27532, 23695, 22432, -25503, -27901, 22493, 17487, -25966, -32050, 26857, 26957, 1076, 19153, 24891, 26389, 1117, 1118, 1119, -29193, 31765, -25369, -26093, 24673, 21839, 1925, 18784, 25226, 25764, 2016, 2045, 2026, -29114, 32676, 22456, 23703, 28564, 24456, -32386, -28631, -27053, 21912, 24324, 26766, -29054, 23284, -29975, 23444, 1244, 1221, 1230, 1242, 1253, 1273, 1251, 1278, 1251, 1253, 1252, -31974, 22380, 20912, 26170, -30305, 31816, -30144, -29290, -30423, 31998, -29962, -29408, 23303, 23029, 21210, -1543, -29438, 27165, 26618, 21823, 25347, 22406, -27880, -30055, 27823, 29840, 20699, 21397, 22714, 26979, 30062, 21632, -25740, -25749, 23185, 20609, 22399, 22656, 32280, 22439, -27847, 23826, 32469, -31038, -25821, 22828, 30545, 25057, 20851, 20814, -29201, -29363, 22843, -28898, 32508, 23821, -27792, 988, 989, 971, 987, 22216, -29513, 1179, 1178, 1164, 1180, 29596, -28219, -27738, 23869, 21318, 28634, -28815, 24568, 20634, 25466, 28227, -29310, -28229, -32028, 22948, 21724, 21062, -26920, 26115, -30982, 22384, -27666, 1606, 1619, 1604, 21702, -25925, 23725, 25172, 21548, -29101, 20677, 28220, 25489, 31893, 31486, -27216, 24707, 32647, 25419, -27831, 2859, 2852, 2859, 22285, 27841, 29637, 20919, 30142, -26079, 27797, -30702, 20575, 27106, 27748, 25989, 32301, 21981, 26467, 21866, 28489, -26840, 269, 284, 284, 32351, 23060, -429, 28258, 23659, 26184, -25047, 24243, 24650, 28106, 18107, -2222, 25190, 20591, 27212, -28115, 1036, 1049, 1038, 31578, 24337, 25038, 19135, -1194, 26059, 22466, 28129, -27264, 25800, 21716, 20979, -29812, 26211, 19730, -773, 25371, 20754, 27441, -27824, 22726, 19263, -30135, 29616, 31333, 31720, 22307, -29348, 24755, 19394, -1493, -31441, 21838, 1745, 1736, 21142, -30862, 21175, 21517, -28940, 23116, 25206, -31578, 20835, 24762, 28755, 24580, 22592, 24698, -31062, 21359, 24084, -30782, 28135, 28617, 23271, -29240, -25441, 27657, 32624, 22653, 21148, 944, 954, 935, 739, 767, 767, 763, 760, 689, 676, 676, 751, 741, 760, 677, 762, 766, 746, 751, 690, 677, 741, 750, 767, 676, 751, 741, 760, 678, 762, 766, 750, 761, 754, 2265, 2245, 2245, 2241, 2242, 2187, 2206, 2206, 2261, 2271, 2242, 2207, 2256, 2261, 2262, 2244, 2256, 2243, 2261, 2207, 2258, 2270, 2268, 2206, 2261, 2271, 2242, 2204, 2240, 2244, 2260, 2243, 2248, 566, 554, 554, 558, 557, 612, 625, 625, 570, 560, 557, 624, 569, 561, 561, 569, 562, 571, 625, 570, 560, 557, 627, 559, 555, 571, 556, 551, 728, 708, 708, 704, 707, 650, 671, 671, 724, 735, 728, 670, 643, 646, 640, 670, 723, 734, 671, 724, 734, 707, 669, 705, 709, 725, 706, 713, 1732, 1752, 1752, 1756, 1759, 1686, 1667, 1667, 1736, 1730, 1759, 1666, 1741, 1728, 1733, 1736, 1730, 1759, 1666, 1743, 1731, 1729, 1667, 1736, 1730, 1759, 1665, 1757, 1753, 1737, 1758, 1749, 1789, 1761, 1761, 1765, 1766, 1711, 1722, 1722, 1777, 1786, 1789, 1723, 1765, 1760, 1783, 1722, 1777, 1787, 1766, 1720, 1764, 1760, 1776, 1767, 1772, 20834, 28571, -25078, 23755, 2259, 2221, 2251, 24160, 24729, 18310, 22998, 23160, 32449, 29589, 22494, 21382, 24053, 23130, 22696, 21383, 20822, 28591, 30907, 23792, -1884, 23470, 18851, -30507, 20822, 28591, -31141, 24708, 20632, 310, 291, 308, 23846, 30793, 27727, 23635, 22885, 30119, 21442, 24610, 24741, 23059, 26159, 31266, 32010, 25734, 26484, 26343, -30617, 31927, 26547, -31948, 23417, 25284, 717, 721, 721, 725, 726, 671, 650, 650, 705, 704, 711, 720, 706, 721, 711, 726, 651, 724, 724, 651, 710, 714, 712, 20795, 24670, 868, 777, 21177, 27396, 24876, 20899, 1293, 1376, 21712, 28013, 24757, 27008, 22517, -30168, -1447, 18986, 28797, 31150, 31626, 21712, 28013, 1194, 1196, 1210, 1152, 1196, 1199, 1210, 1210, 1211, 1190, 1152, 1212, 1203, 1214, 1196, 1196, 1203, 1200, 1214, 1211, 1210, 1197, 1113, 1119, 1097, 1139, 1096, 1097, 1108, 1088, 1091, 1101, 1096, 1097, 1118, 1139, 1119, 1097, 1118, 1114, 1093, 1103, 1097, 536, 629, 21445, 27256, 22985, -30075, 23409, -28827, 634, 608, 22985, -30075, 20805, 19533, 22808, 21864, 1104, 1085, 21901, 27696, 25378, 24449, -29491, -1276, 23304, 24003, 24449, -29491, 20885, 24816, 32617, 32077, 21015, 27562, 24962, 20749, 267, 269, 266, 265, -28349, -28406, 26664, 25033, 31329, 20881, 26217, 32123, -28151, -29670, -32452, 26959, 28635, 25129, -32477, 21402, 17788, 27378, -31822, 20747, 23757, 31296, 2102, 2092, 2092, -29543, 24096, 20652, 21712, 1821, 1799, 1799, 2507, 2524, 2515, 31696, 28340, 2466, 2488, 2488, 23164, 21158, 29629, 26329, 463, 469, 469, 30517, 30392, 29727, 24559, 2142, 2116, 2116, 30088, 29701, 24276, 29481, 2787, 2809, 2809, 28586, 29941, 29979, 29846, 2401, 2431, 2416, 2431, 1820, 1877, 1870, 1867, 1870, 1871, 1879, 1870, 1792, 1875, 1875, 1865, 1860, 1822, 1132, 3109, 3099, 3124, 3099, 2368, 2370, 2383, 2372, 2369, 2376, 1448, 1444, 1445, 1445, 1454, 1448, 1471, 1442, 1469, 1442, 1471, 1458, 29810, 30207, 31125, 27426, 2841, 2819, 2819, 24640, 21787, 32175, 31778, 28744, 25343, 708, 734, 734, 26398, 32175, 31778, 2438, 2463, 2543, 2543, 2543, 2543, 24319, 24207, 2549, 2543, 2543, 22471, 17347, -30930, 29694, 21744, -25971, 17796, 27146, 25194, 20952, 21699, 17621, -28042, 22761, 27020, -30343, 28634, -29753, 30030, 1205, 1196, 1200, 1201, -29412, 25455, 21215, 21167, 1479, 30038, 21524, 22537, 19016, 26175, 31957, 26342, -28351, -27486, 31361, 1415, 1418, 1422, 1419, 1418, 1437, 1436, 1478, 1786, 1791, 1760, 1779, 1737, 1788, 1765, 1785, 1784, 1737, 1786, 1791, 1765, 1762, 25589, 31135, -29171, 20731, 438, 28967, 20581, 20242, 32618, 31135, 26235, 30357, -30102, 26512, 439, 404, 541, 513, 524, 532, 520, 543, 549, 524, 542, 517, 544, 524, 541, 3275, 3287, -29601, 32189, 24581, 23219, 29831, -26914, 27240, 20023, 23804, -29441, 30767, 18810, -31587, 21524, 29125, 23804, 1907, 20604, -32641, 29871, 20625, -30691, 22676, 32069, 20604, 3059, 22586, -30663, 31977, 22743, -32677, 20690, 29955, 22586, 20775, -26888, 949, 3219, 3239, 3221, 3235, 3242, 3235, 3237, 3250, 3235, 3234};

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final CustomRecyclerView f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final CustomRecyclerView f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final LinearLayout f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final LinearLayout f3271O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final LinearLayout f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final LinearLayout f3273O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final LinearLayout f3274O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final LinearLayout f3275O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final PopupWindow f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final Handler f3277O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 f3281O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    public final View O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3287O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public TextView f3288O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;

    /* JADX WARN: Code duplicated, block: B:335:0x0f96 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0fdc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x1b37 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x1b2e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0fe6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0fa0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x10d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x10ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x145d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x08ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x1453 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0091. Please report as an issue. */
    public O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(LivePlayActivity livePlayActivity) {
        ArrayList arrayList;
        ArrayList arrayList2;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        LinearLayout linearLayout;
        ArrayList arrayList5;
        ArrayList arrayList6;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        Object obj;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str5;
        String str6;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        String str7;
        String str8;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
        boolean z;
        String str9;
        String str10;
        ViewGroup.LayoutParams layoutParams;
        int i;
        ArrayList arrayList19;
        ArrayList arrayList20;
        String str11;
        String str12;
        int i2;
        String str13;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
        String str14;
        int i3;
        String str15;
        String str16;
        String str17;
        LinearLayout linearLayout2 = null;
        int i4 = 0;
        ViewGroup.LayoutParams layoutParams2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = null;
        ArrayList arrayList21 = null;
        ArrayList arrayList22 = null;
        ArrayList arrayList23 = null;
        ArrayList arrayList24 = null;
        ArrayList arrayList25 = null;
        ArrayList arrayList26 = null;
        ArrayList arrayList27 = null;
        ArrayList arrayList28 = null;
        ArrayList arrayList29 = null;
        ArrayList arrayList30 = null;
        ArrayList arrayList31 = null;
        ArrayList arrayList32 = null;
        ArrayList arrayList33 = null;
        ArrayList arrayList34 = null;
        ArrayList arrayList35 = null;
        ArrayList arrayList36 = null;
        ArrayList arrayList37 = null;
        ArrayList arrayList38 = null;
        ArrayList arrayList39 = null;
        ArrayList arrayList40 = null;
        ArrayList arrayList41 = null;
        ArrayList arrayList42 = null;
        ArrayList arrayList43 = null;
        ArrayList arrayList44 = null;
        ArrayList arrayList45 = null;
        String str18 = null;
        ArrayList arrayList46 = null;
        ArrayList arrayList47 = null;
        ArrayList arrayList48 = null;
        ArrayList arrayList49 = null;
        ArrayList arrayList50 = null;
        ArrayList arrayList51 = null;
        ArrayList arrayList52 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = null;
        ArrayList arrayList53 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = null;
        ArrayList arrayList54 = null;
        ArrayList arrayList55 = null;
        ArrayList arrayList56 = null;
        int i5 = 0;
        ArrayList arrayList57 = null;
        ArrayList arrayList58 = null;
        ArrayList arrayList59 = null;
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList60 = null;
        ArrayList arrayList61 = null;
        int i8 = 0;
        int i9 = 0;
        ArrayList arrayList62 = null;
        ArrayList arrayList63 = null;
        int i10 = 0;
        ArrayList arrayList64 = null;
        int i11 = 0;
        ArrayList arrayList65 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7 = null;
        boolean z2 = false;
        int iM105 = C0013.m105("۠ۥ۟");
        String str19 = null;
        String str20 = null;
        ArrayList arrayList66 = null;
        ArrayList arrayList67 = null;
        String str21 = null;
        ArrayList arrayList68 = null;
        while (true) {
            switch (iM105) {
                case 56291:
                case 1747685:
                    if (C0013.f2 - (C0013.f2 | (-8839)) <= 0) {
                        C0014.m245();
                        str14 = "ۨۧۤ";
                        iM105 = C0013.m105(str14);
                    } else {
                        iM105 = (C0017.f10 - C0014.f3) ^ (-1752154);
                    }
                    break;
                case 56420:
                    if ((C0017.f10 | C0013.f2 | (-1679)) >= 0) {
                        C0016.m574();
                        arrayList62 = arrayList63;
                        iM105 = C0016.m618("ۥۦۨ");
                    } else {
                        arrayList62 = arrayList63;
                        iM105 = (C0017.f10 - C0017.f10) ^ 1747652;
                    }
                    break;
                case 56573:
                    if (i11 != 8 || i10 >= arrayList22.size()) {
                        arrayList = arrayList57;
                        arrayList62 = arrayList57;
                        if (C0017.f10 % (C0017.f10 * (-7669)) < 0) {
                            C0014.f3 = 28;
                            str17 = "ۨ۠ۡ";
                            arrayList57 = arrayList;
                            iM105 = C0016.m618(str17);
                        } else {
                            str13 = "۟ۤۤ";
                            arrayList57 = arrayList;
                            iM105 = C0015.m573(str13);
                        }
                    } else {
                        ArrayList arrayList69 = (ArrayList) arrayList22.get(i10);
                        ArrayList arrayList70 = new ArrayList();
                        i8 = 0;
                        if (C0016.f9 - (C0016.f9 - 3011) <= 0) {
                            arrayList61 = arrayList70;
                            arrayList60 = arrayList69;
                            arrayList62 = arrayList57;
                            iM105 = C0014.m240("ۢۥۤ");
                        } else {
                            arrayList61 = arrayList70;
                            arrayList60 = arrayList69;
                            arrayList62 = arrayList57;
                            iM105 = (C0015.f6 / C0017.f10) ^ 1749663;
                        }
                    }
                    break;
                case 1746847:
                    arrayList53.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5);
                    i10++;
                    if ((C0015.f6 ^ (C0014.f3 | (-4735))) <= 0) {
                        C0015.f6 = 45;
                        arrayList63 = arrayList62;
                        iM105 = C0015.m573("ۣ۠۠");
                    } else {
                        arrayList63 = arrayList62;
                        iM105 = (C0015.f6 ^ C0015.f6) + 1750755;
                    }
                    break;
                case 1746875:
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setAnimationStyle(R.style.Set_Group_PopupAnimation);
                    if ((C0016.f9 ^ (C0015.f6 | (-9699))) < 0) {
                        str16 = "ۣۨۡ";
                        iM105 = C0015.m573(str16);
                    } else {
                        C0014.m245();
                        str15 = "ۥۣ۟";
                        i3 = i7;
                        iM105 = C0015.m573(str15);
                        i7 = i3;
                    }
                    break;
                case 1746942:
                    iM105 = C0015.f6 + C0016.f9 + 1747485;
                    break;
                case 1746967:
                    if ((C0017.f10 ^ (C0013.f2 % 6416)) >= 0) {
                        iM105 = C0016.m618("ۥۢ۠");
                        i7 = i6;
                    } else {
                        iM105 = (C0015.f6 | C0015.f6) + 1753256;
                        i7 = i6;
                    }
                    break;
                case 1747652:
                    if (C0016.f9 - (C0013.f2 - 9508) <= 0) {
                        C0014.f3 = 93;
                        iM105 = C0014.m240("ۣۧ");
                    } else {
                        str6 = "۠۟ۥ";
                        iM105 = C0014.m240(str6);
                    }
                    break;
                case 1747654:
                case 1747843:
                case 1748675:
                case 1753448:
                    arrayList = arrayList57;
                    if (C0017.f10 % (C0017.f10 * (-7669)) < 0) {
                        str13 = "۟ۤۤ";
                        arrayList57 = arrayList;
                        iM105 = C0015.m573(str13);
                    } else {
                        C0014.f3 = 28;
                        str17 = "ۨ۠ۡ";
                        arrayList57 = arrayList;
                        iM105 = C0016.m618(str17);
                    }
                    break;
                case 1747657:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(0)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(1)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0017.m693(f8short, 600, 4, 3018), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1459O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(2)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(3)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(4)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(5)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(6)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(7)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0013.m153(f8short, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 4, 3199), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1467O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000))).booleanValue();
                    iM105 = C0013.m105("ۢۤ۠");
                    break;
                case 1747712:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0016.m608(f8short, 654, 4, 595), Boolean.valueOf(z2))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(8)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(3)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(1)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                    if (C0016.f9 - (C0017.f10 + 5864) >= 0) {
                        C0017.f10 = 91;
                        iM105 = C0016.m618("ۥۧ۟");
                    } else {
                        iM105 = (C0013.f2 | C0013.f2) ^ 1748257;
                    }
                    break;
                case 1747746:
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 77;
                        str9 = "۟ۥۧ";
                        arrayList2 = arrayList52;
                        arrayList52 = arrayList2;
                        iM105 = C0013.m105(str9);
                    } else {
                        iM105 = C0016.f9 + C0013.f2 + 1753756;
                    }
                    break;
                case 1747750:
                    if ((C0016.f9 ^ (C0014.f3 | (-3092))) >= 0) {
                        C0013.f2 = 36;
                        iM105 = C0013.m105("ۢۤ۠");
                    } else {
                        iM105 = (C0013.f2 ^ C0013.f2) + 1749762;
                    }
                    break;
                case 1747773:
                case 1754561:
                    if (C0016.f9 + (C0013.f2 | (-3638)) < 0) {
                        str5 = "ۤ۠ۡ";
                        iM105 = C0016.m618(str5);
                    } else {
                        str3 = "ۧ۟ۥ";
                        iM105 = C0014.m240(str3);
                    }
                    break;
                case 1747834:
                    this.f3277O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new Handler();
                    this.f3287O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 17);
                    this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    View viewInflate = LayoutInflater.from(livePlayActivity).inflate(R.layout.dialog_set_group, (ViewGroup) null);
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = viewInflate;
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (CustomRecyclerView) viewInflate.findViewById(R.id.mSettingGroupView);
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (CustomRecyclerView) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSettingItemView);
                    this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (CustomRecyclerView) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSettingSecondItemView);
                    linearLayout = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mPoPuLayout);
                    this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupLeftLayout);
                    this.f3271O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupRightLayout);
                    this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupSecondLeftLayout);
                    if (C0016.m574() >= 0) {
                        C0014.m245();
                        linearLayout2 = linearLayout;
                        iM105 = C0015.m573("۠ۥۣ");
                    } else {
                        str = "ۦۢۤ";
                        arrayList5 = arrayList56;
                        arrayList6 = arrayList63;
                        linearLayout2 = linearLayout;
                        arrayList56 = arrayList5;
                        arrayList63 = arrayList6;
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1747838:
                    ArrayList arrayList71 = new ArrayList(Arrays.asList(C0016.m608(f8short, 339, 2, 910), C0017.m693(f8short, 341, 4, 1433), C0016.m608(f8short, 345, 3, 995), C0017.m693(f8short, 348, 2, 2225), C0016.m608(f8short, 350, 2, 1678), C0013.m153(f8short, 335, 2, 665), C0014.m250(f8short, 337, 2, 1045)));
                    arrayList15 = new ArrayList(Arrays.asList(C0013.m153(f8short, 358, 2, 2978), C0014.m250(f8short, 360, 3, 2885), C0013.m153(f8short, 363, 3, 1904), C0017.m693(f8short, 366, 3, 3211), C0014.m250(f8short, 352, 3, 1925), C0013.m153(f8short, 355, 3, 362)));
                    arrayList13 = new ArrayList(Arrays.asList(C0017.m693(f8short, 381, 4, 2787), C0013.m153(f8short, 385, 5, 2010), C0017.m693(f8short, 390, 5, 2643), C0013.m153(f8short, 395, 5, 1250), C0016.m608(f8short, 369, 6, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED), C0017.m693(f8short, 375, 6, 2893)));
                    arrayList11 = new ArrayList(Arrays.asList(C0014.m250(f8short, TbsListener.ErrorCode.INFO_CODE_BASE, 7, 2670), C0014.m250(f8short, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, 7, 3090)));
                    arrayList12 = new ArrayList(Arrays.asList(C0014.m250(f8short, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED, 3, 1410), C0013.m153(f8short, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, 3, 2303)));
                    arrayList14 = new ArrayList(Arrays.asList(C0013.m153(f8short, TypedValues.CycleType.TYPE_EASING, 4, 2798), C0016.m608(f8short, TypedValues.CycleType.TYPE_WAVE_OFFSET, 4, 1437), C0016.m608(f8short, 428, 5, 993)));
                    arrayList36 = arrayList71;
                    str4 = "ۢۧۨ";
                    arrayList39 = arrayList11;
                    arrayList40 = arrayList12;
                    arrayList38 = arrayList13;
                    arrayList41 = arrayList14;
                    arrayList37 = arrayList15;
                    iM105 = C0016.m618(str4);
                    break;
                case 1747842:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(13)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(14)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(15)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0017.m693(f8short, 646, 4, 870), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1486O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(6)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(2)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(0)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(6)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(2)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(1)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(str18, Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1479O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(6)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(2)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(2)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0016.m608(f8short, TbsListener.ErrorCode.STATIC_TBS_INSTALL_CORE_SHARE_DIR_NULL, 4, 2658), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1484O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo))).booleanValue();
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO8 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(8)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(3)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(0);
                    z = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1463O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    if (C0015.f6 % (C0016.f9 * 9804) >= 0) {
                        C0015.f6 = 44;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO8;
                        z2 = z;
                        iM105 = C0015.m573("۠ۥۧ");
                    } else {
                        str8 = "۠ۡۡ";
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO8;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
                        z2 = z;
                        iM105 = C0013.m105(str8);
                    }
                    break;
                case 1747866:
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setOnItemClickListener(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(this));
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo();
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f1206O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.setHasStableIds(true);
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setAdapter(o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo);
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.addOnScrollListener(new O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(this));
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setOnItemClickListener(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(this));
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0();
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.f1210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.setHasStableIds(true);
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                    if (C0013.f2 <= 0) {
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        iM105 = C0013.m105("ۥۥ۟");
                    } else {
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        iM105 = (C0015.f6 + C0014.f3) ^ (-1751370);
                    }
                    break;
                case 1747898:
                    if (i11 != 6) {
                        arrayList57 = arrayList63;
                        if (C0016.m574() >= 0) {
                            C0015.f6 = 64;
                            str16 = "ۡ۟ۨ";
                            iM105 = C0015.m573(str16);
                        } else {
                            iM105 = (C0016.f9 ^ C0017.f10) + 57050;
                        }
                    } else if (i10 < arrayList24.size()) {
                        arrayList9 = (ArrayList) arrayList24.get(i10);
                        arrayList10 = new ArrayList();
                        i6 = 0;
                        if (C0016.f9 <= 0) {
                            C0014.m245();
                            arrayList58 = arrayList9;
                            arrayList59 = arrayList10;
                            arrayList57 = arrayList63;
                            arrayList62 = arrayList63;
                            iM105 = C0017.m731("ۢۧۧ");
                        } else {
                            str2 = "۟ۨ۠";
                            arrayList57 = arrayList63;
                            arrayList62 = arrayList63;
                            arrayList58 = arrayList9;
                            arrayList59 = arrayList10;
                            iM105 = C0017.m731(str2);
                        }
                    } else {
                        arrayList = arrayList63;
                        arrayList62 = arrayList63;
                        if (C0017.f10 % (C0017.f10 * (-7669)) < 0) {
                            C0014.f3 = 28;
                            str17 = "ۨ۠ۡ";
                            arrayList57 = arrayList;
                            iM105 = C0016.m618(str17);
                        } else {
                            str13 = "۟ۤۤ";
                            arrayList57 = arrayList;
                            iM105 = C0015.m573(str13);
                        }
                    }
                    break;
                case 1748641:
                    if (i9 < arrayList60.size()) {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO9 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO9.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i9;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO9.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) arrayList60.get(i9);
                        arrayList61.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO9);
                        i9++;
                        iM105 = C0014.m245() >= 0 ? C0013.m105("ۤ۠ۡ") : C0014.f3 + C0017.f10 + 1754638;
                    } else if (C0013.m114() >= 0) {
                        C0017.f10 = 77;
                        str9 = "۟ۥۧ";
                        arrayList2 = arrayList52;
                        arrayList52 = arrayList2;
                        iM105 = C0013.m105(str9);
                    } else {
                        iM105 = C0016.f9 + C0013.f2 + 1753756;
                    }
                    break;
                case 1748645:
                    break;
                case 1749663:
                    str4 = "ۡ۠۠";
                    arrayList11 = arrayList39;
                    arrayList12 = arrayList40;
                    arrayList13 = arrayList38;
                    arrayList14 = arrayList41;
                    arrayList15 = arrayList37;
                    i9 = i8;
                    arrayList39 = arrayList11;
                    arrayList40 = arrayList12;
                    arrayList38 = arrayList13;
                    arrayList41 = arrayList14;
                    arrayList37 = arrayList15;
                    iM105 = C0016.m618(str4);
                    break;
                case 1749665:
                    if (i10 < ((ArrayList) arrayList67.get(i11)).size()) {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i10;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) ((ArrayList) arrayList67.get(i11)).get(i10);
                        if (i11 != 1) {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                            iM105 = (C0017.f10 / C0014.f3) ^ 1747897;
                        } else if (i10 < arrayList63.size()) {
                            arrayList20 = (ArrayList) arrayList63.get(i10);
                            arrayList19 = new ArrayList();
                            i5 = 0;
                            if ((C0015.f6 ^ (C0013.f2 / 1543)) >= 0) {
                                C0014.f3 = 15;
                                arrayList55 = arrayList19;
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                                arrayList54 = arrayList20;
                                iM105 = C0016.m618("ۣۢۥ");
                            } else {
                                str11 = "ۨ۟ۡ";
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                                arrayList55 = arrayList19;
                                arrayList54 = arrayList20;
                                iM105 = C0016.m618(str11);
                            }
                        } else {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                            iM105 = (C0017.f10 | C0015.f6) ^ (-56837);
                        }
                    } else if (C0015.m570() <= 0) {
                        C0015.f6 = 29;
                        iM105 = C0015.m573("ۥۨۨ");
                    } else {
                        iM105 = (C0013.f2 ^ C0014.f3) + 1750551;
                    }
                    break;
                case 1749700:
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList53;
                    arrayList52.add(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1);
                    int i12 = i11 + 1;
                    if ((C0017.f10 ^ (C0017.f10 / (-6148))) >= 0) {
                        C0017.m717();
                        arrayList64 = arrayList63;
                        iM105 = C0016.m618("ۤۢۦ");
                        i11 = i12;
                    } else {
                        arrayList64 = arrayList63;
                        iM105 = (C0017.f10 % C0017.f10) + 1753415;
                        i11 = i12;
                    }
                    break;
                case 1749726:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(8)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(9)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0013.m153(f8short, TypedValues.MotionType.TYPE_DRAW_PATH, 4, 1578), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1481O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(10)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(4)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(11)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(0)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(1)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(2)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(3)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0016.m608(f8short, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 4, 2179), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1461O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0))).booleanValue();
                    str3 = "ۢۤۨ";
                    iM105 = C0014.m240(str3);
                    break;
                case 1749734:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(4)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0017.m693(f8short, 616, 4, 2931), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(5)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0013.m153(f8short, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_TMP_FAILURE, 4, 1950), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1462O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(6)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(7)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0017.m693(f8short, 624, 4, 915), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1471O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo))).booleanValue();
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(8);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if (C0017.f10 >= 0) {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                        iM105 = C0014.m240("۟ۨ۠");
                    } else {
                        arrayList7 = arrayList52;
                        arrayList8 = arrayList53;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
                        obj = "ۤۢۦ";
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                        arrayList52 = arrayList7;
                        arrayList53 = arrayList8;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        iM105 = C0013.m105(obj);
                    }
                    break;
                case 1749761:
                case 1749762:
                    if (C0017.f10 >= 0) {
                        str4 = "ۡۥ";
                        arrayList11 = arrayList39;
                        arrayList12 = arrayList40;
                        arrayList13 = arrayList38;
                        arrayList14 = arrayList41;
                        arrayList15 = arrayList37;
                        arrayList39 = arrayList11;
                        arrayList40 = arrayList12;
                        arrayList38 = arrayList13;
                        arrayList41 = arrayList14;
                        arrayList37 = arrayList15;
                        iM105 = C0016.m618(str4);
                    } else {
                        iM105 = (C0014.f3 / C0017.f10) ^ 1750818;
                    }
                    break;
                case 1749793:
                    if ((C0014.f3 | C0015.f6 | (-2637)) < 0) {
                        str14 = "ۦ۠۟";
                        iM105 = C0013.m105(str14);
                    } else {
                        str6 = "ۧۤۥ";
                        iM105 = C0014.m240(str6);
                    }
                    break;
                case 1749826:
                case 1751532:
                    if (C0015.f6 >= 0) {
                        str13 = "ۢ۠ۨ";
                        iM105 = C0015.m573(str13);
                    } else {
                        iM105 = C0013.m105("ۡ۠۠");
                    }
                    break;
                case 1749827:
                    arrayList42 = new ArrayList(Arrays.asList(C0017.m693(f8short, 433, 7, 3125), C0013.m153(f8short, 440, 9, 1081)));
                    arrayList43 = new ArrayList(Arrays.asList(C0014.m250(f8short, 449, 6, 2338), C0013.m153(f8short, 455, 6, 2857)));
                    ArrayList arrayList72 = new ArrayList(Arrays.asList(C0014.m250(f8short, 471, 4, AnalyticsListener.EVENT_UPSTREAM_DISCARDED), C0014.m250(f8short, 475, 4, 1081), C0013.m153(f8short, 461, 5, 2974), C0017.m693(f8short, 466, 5, 1720)));
                    ArrayList arrayList73 = new ArrayList(Arrays.asList(C0016.m608(f8short, 479, 7, 2393), C0016.m608(f8short, 486, 7, 647)));
                    String strM693 = C0017.m693(f8short, 493, 4, 2435);
                    String strM608 = C0016.m608(f8short, 497, 4, 3041);
                    String strM153 = C0013.m153(f8short, 501, 7, 3266);
                    ArrayList arrayList74 = new ArrayList(Arrays.asList(strM608, strM153, strM693));
                    String strM609 = C0016.m608(f8short, 508, 7, 2209);
                    String strM694 = C0017.m693(f8short, 515, 5, 2377);
                    if (C0015.f6 / (C0017.f10 | 6721) <= 0) {
                        C0016.m574();
                        iM105 = C0014.m240("ۤۥۧ");
                        str19 = strM694;
                        str20 = strM609;
                        arrayList66 = arrayList74;
                        arrayList44 = arrayList72;
                        arrayList45 = arrayList73;
                        str18 = strM153;
                    } else {
                        iM105 = C0014.m240("ۣۣۢ");
                        str19 = strM694;
                        str20 = strM609;
                        arrayList66 = arrayList74;
                        arrayList44 = arrayList72;
                        arrayList45 = arrayList73;
                        str18 = strM153;
                    }
                    break;
                case 1750601:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5.f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList55;
                    arrayList62 = arrayList56;
                    iM105 = (C0013.f2 - C0016.f9) ^ 1752696;
                    break;
                case 1750658:
                    ArrayList arrayList75 = new ArrayList(Arrays.asList(C0016.m608(f8short, 520, 2, 1679), C0013.m153(f8short, 522, 2, 471), C0013.m153(f8short, 524, 2, 1791), C0014.m250(f8short, 526, 3, 972), C0014.m250(f8short, 529, 6, 2972), str20, str19));
                    ArrayList arrayList76 = new ArrayList(Arrays.asList(C0016.m608(f8short, 535, 4, 1521), C0013.m153(f8short, 539, 4, 1698)));
                    ArrayList arrayList77 = new ArrayList(Arrays.asList(C0014.m250(f8short, 543, 4, 1211), C0014.m250(f8short, 547, 4, 1824), C0017.m693(f8short, 551, 4, 1853)));
                    ArrayList arrayList78 = new ArrayList(Arrays.asList(C0014.m250(f8short, 555, 6, 2923), C0014.m250(f8short, 561, 7, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS)));
                    ArrayList arrayList79 = new ArrayList(Arrays.asList(C0013.m153(f8short, 581, 6, 750), C0014.m250(f8short, 587, 6, 1216), C0013.m153(f8short, 593, 7, 389), C0017.m693(f8short, 568, 6, 2522), C0016.m608(f8short, 574, 7, 1010)));
                    arrayList67.add(arrayList68);
                    arrayList67.add(arrayList25);
                    arrayList67.add(arrayList26);
                    arrayList67.add(arrayList27);
                    arrayList67.add(arrayList28);
                    arrayList50 = arrayList79;
                    arrayList49 = arrayList78;
                    arrayList47 = arrayList76;
                    arrayList46 = arrayList75;
                    arrayList48 = arrayList77;
                    iM105 = C0013.f2 + C0014.f3 + 1749974;
                    break;
                case 1750659:
                    arrayList67.add(arrayList29);
                    arrayList67.add(arrayList30);
                    arrayList67.add(arrayList32);
                    arrayList67.add(arrayList33);
                    arrayList67.add(arrayList34);
                    arrayList23.add(arrayList35);
                    arrayList23.add(arrayList36);
                    arrayList23.add(arrayList37);
                    arrayList23.add(arrayList38);
                    arrayList23.add(arrayList39);
                    arrayList23.add(arrayList40);
                    arrayList51 = arrayList23;
                    iM105 = (C0016.f9 % C0017.f10) ^ 1752588;
                    break;
                case 1750755:
                    str12 = "ۣۤۢ";
                    i2 = i5;
                    iM105 = C0015.m573(str12);
                    i5 = i2;
                    break;
                case 1750818:
                    if (i5 < arrayList54.size()) {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO10 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO10.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i5;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO10.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) arrayList54.get(i5);
                        arrayList55.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO10);
                        i2 = i5 + 1;
                        if ((C0013.f2 | C0016.f9 | 5185) <= 0) {
                            str12 = "ۡ۠۠";
                            iM105 = C0015.m573(str12);
                            i5 = i2;
                        } else {
                            iM105 = (C0016.f9 / C0015.f6) + 1747751;
                            i5 = i2;
                        }
                    } else if (C0014.f3 < 0) {
                        str = "ۣۨۢ";
                        linearLayout = linearLayout2;
                        arrayList5 = arrayList56;
                        arrayList6 = arrayList63;
                        linearLayout2 = linearLayout;
                        arrayList56 = arrayList5;
                        arrayList63 = arrayList6;
                        iM105 = C0013.m105(str);
                    } else {
                        str5 = "ۣۡۧ";
                        iM105 = C0016.m618(str5);
                    }
                    break;
                case 1751525:
                    int size = arrayList65.size();
                    arrayList7 = livePlayActivity.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (i11 < size) {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                        arrayList8 = new ArrayList();
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f957O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (String) arrayList65.get(i11);
                        i10 = 0;
                        if (C0014.m245() >= 0) {
                            C0017.m717();
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6;
                            obj = "ۢۢۡ";
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                            arrayList52 = arrayList7;
                            arrayList53 = arrayList8;
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                            iM105 = C0013.m105(obj);
                        } else {
                            arrayList52 = arrayList7;
                            arrayList53 = arrayList8;
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                            iM105 = (C0013.f2 | C0014.f3) + 1752784;
                        }
                    } else {
                        arrayList2 = arrayList7;
                        if (C0016.m574() < 0) {
                            C0016.f9 = 63;
                            str8 = "۟ۥ۟";
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7;
                            arrayList52 = arrayList2;
                            z = z2;
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
                            z2 = z;
                            iM105 = C0013.m105(str8);
                        } else {
                            str9 = "۠۟ۨ";
                            arrayList52 = arrayList2;
                            iM105 = C0013.m105(str9);
                        }
                    }
                    break;
                case 1751592:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0016.m608(f8short, 628, 4, 2761), Boolean.FALSE)).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(9)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0016.m608(f8short, 632, 4, 2163), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1472O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(10)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(11)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0017.m693(f8short, 636, 4, 899), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1474O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0))).booleanValue();
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList52.get(5)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(12)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((Boolean) Hawk.get(C0014.m250(f8short, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 6, 2288), Boolean.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1480O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000))).booleanValue();
                    if (C0016.f9 <= 0) {
                        C0015.m570();
                        iM105 = C0016.m618("ۢۥۥ");
                    } else {
                        iM105 = (C0016.f9 + C0016.f9) ^ 1748432;
                    }
                    break;
                case 1751619:
                case 1752641:
                    if (C0015.f6 / (C0014.f3 * (-7968)) != 0) {
                        C0016.m574();
                        iM105 = C0015.m573("ۦ۠ۤ");
                    } else {
                        iM105 = (C0017.f10 * C0017.f10) + 1175101;
                    }
                    break;
                case 1751678:
                    this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setAdapter(o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0);
                    this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.addOnScrollListener(new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(this));
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setOnItemClickListener(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(this));
                    arrayList21 = new ArrayList(Arrays.asList(C0017.m693(f8short, 8, 4, 827), C0013.m153(f8short, 12, 4, 1265), C0016.m608(f8short, 16, 4, 2304), C0014.m250(f8short, 20, 4, 2640), C0017.m693(f8short, 24, 4, 2990), C0016.m608(f8short, 28, 4, 3075), C0014.m250(f8short, 32, 4, 2265), C0013.m153(f8short, 36, 4, 2283), C0014.m250(f8short, 0, 4, 3151), C0017.m693(f8short, 4, 4, 2144)));
                    ArrayList arrayList80 = new ArrayList();
                    ArrayList arrayList81 = new ArrayList();
                    ArrayList arrayList82 = new ArrayList();
                    ArrayList arrayList83 = new ArrayList();
                    ArrayList arrayList84 = new ArrayList();
                    String strM250 = C0014.m250(f8short, 40, 4, 3220);
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 46;
                        iM105 = C0014.m240("ۣۡۧ");
                        arrayList67 = arrayList80;
                        str21 = strM250;
                        arrayList68 = arrayList84;
                        arrayList24 = arrayList83;
                        arrayList22 = arrayList81;
                        arrayList23 = arrayList82;
                    } else {
                        iM105 = (C0015.f6 - C0013.f2) + 1753195;
                        arrayList67 = arrayList80;
                        str21 = strM250;
                        arrayList68 = arrayList84;
                        arrayList24 = arrayList83;
                        arrayList22 = arrayList81;
                        arrayList23 = arrayList82;
                    }
                    break;
                case 1751686:
                    ArrayList arrayList85 = new ArrayList(Arrays.asList(C0013.m153(f8short, 48, 4, 1176), C0013.m153(f8short, 52, 4, 2898), C0016.m608(f8short, 56, 4, 2316), C0017.m693(f8short, 60, 4, 2919), C0014.m250(f8short, 64, 4, 1921), C0014.m250(f8short, 68, 6, 1508), C0016.m608(f8short, 74, 4, 3126), str21, C0016.m608(f8short, 44, 4, 3128)));
                    arrayList26 = new ArrayList();
                    ArrayList arrayList86 = new ArrayList(Arrays.asList(C0017.m693(f8short, 86, 4, 3043), C0016.m608(f8short, 90, 4, 1368), C0016.m608(f8short, 94, 5, 1201), C0017.m693(f8short, 99, 6, 582), C0013.m153(f8short, 105, 9, 2981), C0014.m250(f8short, 114, 7, 1666), C0014.m250(f8short, 78, 4, 1154), C0017.m693(f8short, 82, 4, 572)));
                    arrayList4 = new ArrayList(Arrays.asList(C0016.m608(f8short, 133, 4, 1121), C0017.m693(f8short, 137, 4, 2801), C0013.m153(f8short, 141, 4, 638), C0016.m608(f8short, 145, 4, 1469), C0017.m693(f8short, 149, 5, 2374), C0013.m153(f8short, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 4, 2519), C0016.m608(f8short, 158, 4, 2647), C0013.m153(f8short, 162, 4, 361), C0017.m693(f8short, 166, 4, 1730), C0014.m250(f8short, 170, 4, 2567), C0016.m608(f8short, 121, 6, 3107), C0016.m608(f8short, 127, 6, 2236)));
                    arrayList3 = new ArrayList(Arrays.asList(C0013.m153(f8short, 182, 4, 1241), C0014.m250(f8short, 186, 4, 2182), C0014.m250(f8short, 190, 4, 2871), C0013.m153(f8short, 194, 4, 2812), C0017.m693(f8short, 198, 4, 2433), C0013.m153(f8short, TbsListener.ErrorCode.APK_PATH_ERROR, 4, 2678), C0017.m693(f8short, TbsListener.ErrorCode.UNZIP_IO_ERROR, 4, 2193), C0014.m250(f8short, TbsListener.ErrorCode.ROM_NOT_ENOUGH, 4, 382), C0016.m608(f8short, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, 4, 3167), C0016.m608(f8short, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 4, 1262), C0017.m693(f8short, TbsListener.ErrorCode.UNLZMA_FAIURE, 4, 1569), C0016.m608(f8short, TbsListener.ErrorCode.DEXOAT_EXCEPTION, 4, 3191), C0017.m693(f8short, TbsListener.ErrorCode.RENAME_SUCCESS, 4, 1693), C0017.m693(f8short, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 4, 2981), C0014.m250(f8short, 174, 4, 1806), C0017.m693(f8short, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, 4, 646)));
                    arrayList27 = arrayList86;
                    arrayList25 = arrayList85;
                    arrayList29 = arrayList3;
                    arrayList28 = arrayList4;
                    iM105 = C0016.m618("ۧۨۦ");
                    break;
                case 1751741:
                    layoutParams2.height = i4;
                    this.f3274O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = this.f3275O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getLayoutParams();
                    layoutParams3.height = i4;
                    this.f3275O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setLayoutParams(layoutParams3);
                    O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO();
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.f1202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.setHasStableIds(true);
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setAdapter(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.addOnScrollListener(new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this));
                    if (C0014.f3 / (C0015.f6 + 1796) == 0) {
                        str15 = "۠ۦ۠";
                        i3 = i7;
                        iM105 = C0015.m573(str15);
                        i7 = i3;
                    } else {
                        C0016.f9 = 66;
                        str2 = "۠۟ۨ";
                        arrayList9 = arrayList58;
                        arrayList10 = arrayList59;
                        arrayList58 = arrayList9;
                        arrayList59 = arrayList10;
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1752547:
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 71;
                        str5 = "ۢۨ";
                        iM105 = C0016.m618(str5);
                    } else {
                        iM105 = (C0015.f6 ^ C0015.f6) + 1747834;
                    }
                    break;
                case 1752577:
                    if (C0013.f2 <= 0) {
                        C0014.m245();
                        iM105 = C0013.m105("ۦ۠ۢ");
                    } else {
                        str = "۠ۥۨ";
                        linearLayout = linearLayout2;
                        arrayList5 = arrayList56;
                        arrayList6 = arrayList63;
                        linearLayout2 = linearLayout;
                        arrayList56 = arrayList5;
                        arrayList63 = arrayList6;
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1752579:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5;
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                    iM105 = (C0017.f10 | C0015.f6) ^ (-56837);
                    break;
                case 1752611:
                    iM105 = (C0017.f10 ^ C0014.f3) + 1752901;
                    break;
                case 1752639:
                    arrayList51.add(arrayList41);
                    arrayList51.add(arrayList42);
                    arrayList51.add(arrayList43);
                    arrayList24.add(arrayList44);
                    arrayList24.add(arrayList45);
                    arrayList24.add(arrayList66);
                    arrayList22.add(arrayList46);
                    arrayList22.add(arrayList47);
                    arrayList22.add(arrayList48);
                    arrayList22.add(arrayList49);
                    arrayList22.add(arrayList50);
                    livePlayActivity.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.clear();
                    if (C0013.m114() >= 0) {
                        iM105 = C0014.m240("۟ۧۦ");
                    } else {
                        str5 = "ۦۣ۠";
                        iM105 = C0016.m618(str5);
                    }
                    break;
                case 1752647:
                    if (i7 < arrayList58.size()) {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO11 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO11.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i7;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO11.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) arrayList58.get(i7);
                        arrayList59.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO11);
                        i3 = i7 + 1;
                        if (C0014.f3 >= 0) {
                            iM105 = C0017.m731("ۡ۠ۤ");
                            i7 = i3;
                        } else {
                            str15 = "۟ۧۦ";
                            iM105 = C0015.m573(str15);
                            i7 = i3;
                        }
                    } else if ((C0014.f3 | C0015.f6 | (-2637)) < 0) {
                        str6 = "ۧۤۥ";
                        iM105 = C0014.m240(str6);
                    } else {
                        str14 = "ۦ۠۟";
                        iM105 = C0013.m105(str14);
                    }
                    break;
                case 1752679:
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 64;
                        str16 = "ۡ۟ۨ";
                        iM105 = C0015.m573(str16);
                    } else {
                        iM105 = (C0016.f9 ^ C0017.f10) + 57050;
                    }
                    break;
                case 1752701:
                    if (C0016.f9 / (C0015.f6 + 7221) == 0) {
                        str = "ۢۢۡ";
                        linearLayout = linearLayout2;
                        arrayList5 = arrayList56;
                        arrayList6 = arrayList64;
                        linearLayout2 = linearLayout;
                        arrayList56 = arrayList5;
                        arrayList63 = arrayList6;
                        iM105 = C0013.m105(str);
                    } else {
                        C0014.f3 = 35;
                        arrayList19 = arrayList55;
                        arrayList20 = arrayList54;
                        str11 = "ۥۥۡ";
                        arrayList63 = arrayList64;
                        arrayList55 = arrayList19;
                        arrayList54 = arrayList20;
                        iM105 = C0016.m618(str11);
                    }
                    break;
                case 1752705:
                    arrayList2 = arrayList52;
                    if (C0016.m574() < 0) {
                        str9 = "۠۟ۨ";
                        arrayList52 = arrayList2;
                        iM105 = C0013.m105(str9);
                    } else {
                        C0016.f9 = 63;
                        str8 = "۟ۥ۟";
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7;
                        arrayList52 = arrayList2;
                        z = z2;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO7 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
                        z2 = z;
                        iM105 = C0013.m105(str8);
                    }
                    break;
                case 1753415:
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        arrayList3 = arrayList29;
                        arrayList4 = arrayList28;
                        arrayList29 = arrayList3;
                        arrayList28 = arrayList4;
                        iM105 = C0016.m618("ۧۨۦ");
                    } else {
                        iM105 = (C0013.f2 ^ C0016.f9) + 1747600;
                    }
                    break;
                case 1753445:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5.f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList59;
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 49;
                        arrayList62 = arrayList57;
                        iM105 = C0014.m240("ۨۥ");
                    } else {
                        arrayList62 = arrayList57;
                        str15 = "ۥۣ۟";
                        i3 = i7;
                        iM105 = C0015.m573(str15);
                        i7 = i3;
                    }
                    break;
                case 1753512:
                    this.f3273O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupLeftHeight);
                    this.f3274O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupRightHeight);
                    this.f3275O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (LinearLayout) this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.findViewById(R.id.mSetGroupSecondLeftHeight);
                    this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1358O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    this.f3271O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1360O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
                    this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1357O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                    PopupWindow popupWindow = new PopupWindow(this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, -1, -1);
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = popupWindow;
                    popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setFocusable(true);
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setOutsideTouchable(true);
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setClippingEnabled(false);
                    if ((C0017.f10 | (C0017.f10 % 6477)) >= 0) {
                        str7 = "۠ۧۡ";
                        arrayList18 = arrayList35;
                        arrayList17 = arrayList34;
                        arrayList16 = arrayList33;
                        arrayList35 = arrayList18;
                        arrayList34 = arrayList17;
                        arrayList33 = arrayList16;
                        iM105 = C0015.m573(str7);
                    } else {
                        iM105 = (C0016.f9 - C0017.f10) + 1753839;
                    }
                    break;
                case 1753539:
                    if (C0013.f2 * (C0014.f3 - 362) >= 0) {
                        arrayList65 = arrayList31;
                        iM105 = C0014.m240("ۣۦۦ");
                        i11 = 0;
                    } else {
                        arrayList65 = arrayList31;
                        iM105 = C0013.f2 + C0013.f2 + 1751806;
                        i11 = 0;
                    }
                    break;
                case 1753601:
                    if (C0015.m570() <= 0) {
                        C0015.f6 = 29;
                        iM105 = C0015.m573("ۥۨۨ");
                    } else {
                        iM105 = (C0013.f2 ^ C0014.f3) + 1750551;
                    }
                    break;
                case 1753606:
                    str17 = "ۤ۠ۡ";
                    arrayList64 = arrayList51;
                    iM105 = C0016.m618(str17);
                    break;
                case 1753665:
                    iM105 = C0016.m618("ۢۧۧ");
                    break;
                case 1753666:
                    if (C0014.f3 < 0) {
                        str5 = "ۣۡۧ";
                        iM105 = C0016.m618(str5);
                    } else {
                        str = "ۣۨۢ";
                        linearLayout = linearLayout2;
                        arrayList5 = arrayList56;
                        arrayList6 = arrayList63;
                        linearLayout2 = linearLayout;
                        arrayList56 = arrayList5;
                        arrayList63 = arrayList6;
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1754407:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5;
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    iM105 = (C0017.f10 / C0014.f3) ^ 1747897;
                    break;
                case 1754661:
                    arrayList30 = new ArrayList(Arrays.asList(C0017.m693(f8short, TbsListener.ErrorCode.TPATCH_FAIL, 4, 1721), C0017.m693(f8short, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 5, 1411), C0013.m153(f8short, 247, 4, 912)));
                    arrayList32 = new ArrayList(Arrays.asList(C0017.m693(f8short, 259, 4, 3155), C0013.m153(f8short, 263, 4, 2297), C0016.m608(f8short, 251, 4, 2310), C0013.m153(f8short, 255, 4, 2783)));
                    arrayList16 = new ArrayList(Arrays.asList(C0014.m250(f8short, 275, 5, 2877), C0017.m693(f8short, 280, 4, 2680), C0013.m153(f8short, 284, 4, 867), C0017.m693(f8short, 267, 4, 1132), C0013.m153(f8short, 271, 4, 1830)));
                    arrayList17 = new ArrayList(Arrays.asList(C0014.m250(f8short, 288, 4, 1144), C0016.m608(f8short, 292, 4, 1575), C0017.m693(f8short, 296, 5, 2339)));
                    arrayList18 = new ArrayList(Arrays.asList(C0014.m250(f8short, 311, 4, 2859), C0016.m608(f8short, 315, 5, 1734), C0014.m250(f8short, TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE, 5, 1717), C0013.m153(f8short, TbsListener.ErrorCode.THROWABLE_INITX5CORE, 5, 833), C0014.m250(f8short, 330, 5, 3052), C0016.m608(f8short, 301, 5, 2559), C0016.m608(f8short, 306, 5, 3054)));
                    if (C0016.f9 <= 0) {
                        arrayList35 = arrayList18;
                        arrayList34 = arrayList17;
                        arrayList33 = arrayList16;
                        arrayList31 = arrayList21;
                        iM105 = C0014.m240("ۢۦۥ");
                    } else {
                        str7 = "۠ۥۣ";
                        arrayList31 = arrayList21;
                        arrayList35 = arrayList18;
                        arrayList34 = arrayList17;
                        arrayList33 = arrayList16;
                        iM105 = C0015.m573(str7);
                    }
                    break;
                case 1755337:
                    if (C0014.f3 / (C0013.f2 % (-8913)) != 0) {
                        C0017.m717();
                        arrayList62 = arrayList57;
                        iM105 = C0015.m573("ۨ۟۠");
                    } else {
                        arrayList62 = arrayList57;
                        iM105 = (C0013.f2 - C0014.f3) ^ 1745860;
                    }
                    break;
                case 1755338:
                    str = "ۣۨۧ";
                    linearLayout = linearLayout2;
                    arrayList5 = arrayList63;
                    arrayList6 = arrayList63;
                    linearLayout2 = linearLayout;
                    arrayList56 = arrayList5;
                    arrayList63 = arrayList6;
                    iM105 = C0013.m105(str);
                    break;
                case 1755406:
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setTouchable(true);
                    if (this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.isShowing()) {
                        iM105 = C0013.f2 + C0015.f6 + 1755171;
                    } else if (C0016.m574() >= 0) {
                        C0016.f9 = 29;
                        str10 = "ۧ۠۠";
                        layoutParams = layoutParams2;
                        i = i4;
                        layoutParams2 = layoutParams;
                        i4 = i;
                        iM105 = C0015.m573(str10);
                    } else {
                        iM105 = (C0013.f2 | C0017.f10) + 1746989;
                    }
                    break;
                case 1755462:
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.setOnKeyListener(this);
                    linearLayout2.setOnClickListener(this);
                    this.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(livePlayActivity);
                    this.f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(livePlayActivity);
                    this.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(livePlayActivity);
                    this.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(livePlayActivity);
                    this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(livePlayActivity);
                    i = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1433O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    ViewGroup.LayoutParams layoutParams4 = this.f3273O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getLayoutParams();
                    layoutParams4.height = i;
                    this.f3273O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setLayoutParams(layoutParams4);
                    layoutParams = this.f3274O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getLayoutParams();
                    if (C0013.f2 / (C0016.f9 * 8630) != 0) {
                        C0015.f6 = 24;
                        layoutParams2 = layoutParams;
                        i4 = i;
                        iM105 = C0014.m240("۟ۢ");
                    } else {
                        str10 = "ۤۧ۠";
                        layoutParams2 = layoutParams;
                        i4 = i;
                        iM105 = C0015.m573(str10);
                    }
                    break;
                case 1755465:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5.f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList61;
                    if ((C0016.f9 | C0014.f3 | (-2720)) >= 0) {
                        iM105 = C0015.m573("۠۟ۥ");
                    } else {
                        arrayList19 = arrayList55;
                        arrayList20 = arrayList54;
                        str11 = "ۨ۟۠";
                        arrayList55 = arrayList19;
                        arrayList54 = arrayList20;
                        iM105 = C0016.m618(str11);
                    }
                    break;
                case 1755530:
                    iM105 = C0013.f2 + C0015.f6 + 1755171;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        String str;
        CustomRecyclerView customRecyclerView;
        ArrayList arrayList;
        String str2;
        String str3;
        int i = 21;
        CustomRecyclerView customRecyclerView2 = null;
        ArrayList arrayList2 = null;
        LivePlayActivity livePlayActivity = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = null;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 = null;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo1 = null;
        CustomRecyclerView customRecyclerView3 = null;
        List<O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> list = null;
        int iM618 = C0016.m618("ۡۦۡ");
        while (true) {
            switch (iM618) {
                case 56417:
                    if (list.isEmpty()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0016.m608(f8short, 658, 15, 2042));
                        iM618 = (C0016.f9 / C0013.f2) + 1750812;
                    } else if (C0014.m245() >= 0) {
                        C0015.f6 = 44;
                        str3 = "ۥۤ۟";
                        iM618 = C0017.m731(str3);
                    } else {
                        iM618 = C0015.m573("ۧۧۦ");
                    }
                    break;
                case 56477:
                    customRecyclerView3.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                    O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo2 = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0();
                    if (C0013.f2 <= 0) {
                        C0015.f6 = 9;
                        o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo2;
                        iM618 = C0014.m240("ۧ۠ۨ");
                    } else {
                        o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo2;
                        iM618 = C0015.m573("ۨۡ");
                    }
                    break;
                case 56512:
                    o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.setContentView(R.layout.dialog_track);
                    o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.setCanceledOnTouchOutside(true);
                    String str4 = C0017.f10 % (C0013.f2 + (-5886)) >= 0 ? "ۥۢ" : "ۧ۠ۨ";
                    iM618 = C0017.m731(str4);
                    break;
                case 56569:
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();
                    if (C0013.m114() >= 0) {
                        C0017.f10 = 11;
                        iM618 = C0013.m105("ۣۨۡ");
                    } else {
                        iM618 = (C0014.f3 + C0016.f9) ^ 1755832;
                    }
                    break;
                case 1746690:
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo1 = this.f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3294O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    arrayList = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo1.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if ((C0015.f6 ^ (C0013.f2 / 1774)) >= 0) {
                        C0016.m574();
                        arrayList2 = arrayList;
                        iM618 = C0015.m573("ۣ۟ۧ");
                    } else {
                        str2 = "ۢۨ۠";
                        arrayList2 = arrayList;
                        iM618 = C0013.m105(str2);
                    }
                    break;
                case 1746727:
                    customRecyclerView = this.f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f3293O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (customRecyclerView != null) {
                        customRecyclerView2 = customRecyclerView;
                        iM618 = (C0015.f6 / C0016.f9) + 1754472;
                    } else if (C0014.f3 * (C0016.f9 / (-3855)) != 0) {
                        C0014.f3 = 19;
                        customRecyclerView2 = customRecyclerView;
                        iM618 = C0014.m240("ۥۦ");
                    } else {
                        customRecyclerView2 = customRecyclerView;
                        iM618 = C0014.m240("ۣ۟ۧ");
                    }
                    break;
                case 1746939:
                case 1750812:
                    break;
                case 1747809:
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.setOnTrackItemClickListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0, i));
                    if (C0013.f2 <= 0) {
                    }
                    iM618 = C0016.m618("۠ۥ۠");
                    break;
                case 1747835:
                    this.f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    if (C0015.f6 % (C0014.f3 * (-708)) >= 0) {
                        C0015.f6 = 96;
                        iM618 = C0014.m240("۟۠ۨ");
                    } else {
                        iM618 = (C0013.f2 % C0016.f9) + 1746599;
                    }
                    break;
                case 1748644:
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo1.notifyDataSetChanged();
                    this.f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.show();
                    if (C0013.f2 <= 0) {
                        C0014.m245();
                        iM618 = C0015.m573("ۤۥۢ");
                    } else {
                        str3 = "۟۠ۨ";
                        iM618 = C0017.m731(str3);
                    }
                    break;
                case 1748828:
                    LivePlayActivity livePlayActivity2 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    List<O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> trackData = livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getTrackData();
                    iM618 = (C0013.f2 - C0013.f2) ^ 56417;
                    livePlayActivity = livePlayActivity2;
                    list = trackData;
                    break;
                case 1749850:
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    iM618 = C0015.f6 + C0017.f10 + 1750011;
                    break;
                case 1750725:
                    customRecyclerView3.setAdapter(o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0);
                    customRecyclerView3.setOnItemListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 20));
                    if ((C0014.f3 ^ (C0017.f10 | (-6120))) <= 0) {
                        C0016.m574();
                        str = "ۨۡ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = (C0016.f9 % C0015.f6) + 1747609;
                    }
                    break;
                case 1751649:
                    if (C0014.m245() >= 0) {
                        C0015.f6 = 44;
                        str3 = "ۥۤ۟";
                        iM618 = C0017.m731(str3);
                    } else {
                        iM618 = C0015.m573("ۧۧۦ");
                    }
                    break;
                case 1751652:
                    iM618 = (C0015.f6 | (C0017.f10 * 8860)) >= 0 ? C0016.m618("ۣۧۦ") : C0014.m240("ۡۦۡ");
                    break;
                case 1751681:
                    customRecyclerView = customRecyclerView2;
                    if (C0014.f3 * (C0016.f9 / (-3855)) != 0) {
                        C0014.f3 = 19;
                        customRecyclerView2 = customRecyclerView;
                        iM618 = C0014.m240("ۥۦ");
                    } else {
                        customRecyclerView2 = customRecyclerView;
                        iM618 = C0014.m240("ۣ۟ۧ");
                    }
                    break;
                case 1754379:
                    if ((C0013.f2 | (C0017.f10 % (-9826))) >= 0) {
                        C0014.f3 = 72;
                        str2 = "۟ۢۨ";
                        arrayList = arrayList2;
                        arrayList2 = arrayList;
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0014.f3 | C0017.f10) + 1746903;
                    }
                    break;
                case 1754415:
                    customRecyclerView3 = (CustomRecyclerView) o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.findViewById(R.id.track_GridView);
                    o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f3293O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView3;
                    if ((C0016.f9 | C0013.f2 | (-574)) >= 0) {
                        iM618 = C0014.m240("ۣۤ");
                    } else {
                        iM618 = C0017.m731(str4);
                    }
                    break;
                case 1754472:
                    customRecyclerView2.setSelection(0);
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 21;
                        iM618 = C0016.m618("۠ۤۥ");
                    } else {
                        str = "ۣ۟ۧ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1754630:
                    if (this.f3283O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 == null) {
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(livePlayActivity);
                        if (C0013.f2 + (C0013.f2 - 5091) >= 0) {
                            o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2;
                            iM618 = C0017.m731("ۧۧۦ");
                        } else {
                            o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo2;
                            iM618 = (C0016.f9 + C0017.f10) ^ 56563;
                        }
                    } else if ((C0013.f2 | (C0017.f10 % (-9826))) >= 0) {
                        C0014.f3 = 72;
                        str2 = "۟ۢۨ";
                        arrayList = arrayList2;
                        arrayList2 = arrayList;
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = (C0014.f3 | C0017.f10) + 1746903;
                    }
                    break;
                case 1755370:
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1302O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f3294O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;
                    iM618 = C0013.f2 + (C0013.f2 * (-6792)) >= 0 ? C0016.m618("ۡۦۡ") : (C0016.f9 % C0015.f6) ^ 1750541;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        String str4;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        StringBuilder sb2;
        String str5;
        String str6;
        String strM250;
        String str7;
        LivePlayActivity livePlayActivity = null;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        PackageManager packageManager = null;
        String str8 = null;
        String str9 = null;
        boolean zIsEmpty = false;
        String str10 = null;
        StringBuilder sb3 = null;
        StringBuilder sb4 = null;
        String str11 = null;
        TextView textView = null;
        int iM105 = C0013.m105("ۣ۠۠");
        while (true) {
            switch (iM105) {
                case 56325:
                case 1746757:
                    iM105 = (C0015.f6 / C0015.f6) + 1751622;
                    break;
                case 56448:
                    break;
                case 56505:
                    iM105 = (C0013.f2 ^ C0015.f6) ^ (-1750887);
                    break;
                case 1746818:
                case 1750687:
                    str = "ۦۢۤ";
                    iM105 = C0016.m618(str);
                    break;
                case 1748737:
                    sb3.append(str9);
                    sb3.append(C0013.m153(f8short, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAX_TRIED_ERR, 6, 2352));
                    iM105 = (C0014.f3 / C0015.f6) ^ 1754377;
                    break;
                case 1748772:
                    if (!zIsEmpty) {
                        sb = new StringBuilder(str10);
                        if (C0014.f3 / (C0016.f9 * 7926) == 0) {
                            str = "ۣۣۡ";
                            sb3 = sb;
                            iM105 = C0016.m618(str);
                        } else {
                            str3 = "ۨۤۤ";
                            str4 = str9;
                            sb3 = sb;
                            str9 = str4;
                            iM105 = C0015.m573(str3);
                        }
                    } else {
                        iM105 = (C0013.f2 ^ C0015.f6) ^ (-1750887);
                    }
                    break;
                case 1748894:
                    str2 = "ۨۤۤ";
                    packageManager = livePlayActivity.getPackageManager();
                    iM105 = C0015.m573(str2);
                    break;
                case 1749665:
                    str = (C0017.f10 ^ (C0016.f9 * 8546)) >= 0 ? "ۢ۟ۡ" : "ۨۤۤ";
                    iM105 = C0016.m618(str);
                    break;
                case 1750563:
                    livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(livePlayActivity);
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                        sb2 = sb4;
                        str5 = "ۣۤ۠";
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        sb4 = sb2;
                        iM105 = C0014.m240(str5);
                    } else {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM105 = C0016.m618("ۦۦۡ");
                    }
                    break;
                case 1750658:
                    sb2 = new StringBuilder(str10);
                    sb2.append(str9);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                    str5 = "ۤۤۨ";
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    sb4 = sb2;
                    iM105 = C0014.m240(str5);
                    break;
                case 1751623:
                    TextView textView2 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.findViewById(R.id.Update_log);
                    str11 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3302O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                    textView = textView2;
                    iM105 = (C0016.f9 - C0017.f10) + 1751172;
                    break;
                case 1751656:
                    sb4.append(C0013.m153(f8short, 686, 14, 583));
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 42;
                        iM105 = C0015.m573("ۣۣۡ");
                    } else {
                        str = "ۧۤۡ";
                        iM105 = C0016.m618(str);
                    }
                    break;
                case 1752679:
                    ((TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.findViewById(R.id.about_title)).setText(C0016.m608(f8short, 673, 5, 2445));
                    int i = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1579O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0014.f3 * (C0016.f9 ^ 2791) < 0) {
                        strM250 = str10;
                        str2 = "ۡۨۥ";
                        str10 = strM250;
                        iM105 = C0015.m573(str2);
                    } else {
                        C0015.f6 = 78;
                        str7 = str9;
                        str9 = str7;
                        iM105 = C0013.m105("۟ۡۧ");
                    }
                    break;
                case 1752702:
                    iM105 = (C0016.f9 ^ C0015.f6) + 1750893;
                    break;
                case 1752739:
                    zIsEmpty = TextUtils.isEmpty(str11);
                    strM250 = C0014.m250(f8short, 678, 2, 1701);
                    if (C0016.f9 / (C0013.f2 ^ (-4765)) != 0) {
                        C0014.f3 = 31;
                        str2 = "ۡۨۥ";
                        str10 = strM250;
                        iM105 = C0015.m573(str2);
                    } else {
                        str10 = strM250;
                        iM105 = 1748772 ^ (C0017.f10 / C0016.f9);
                    }
                    break;
                case 1753414:
                    str5 = "ۣ۟ۦ";
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                    sb2 = sb4;
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    sb4 = sb2;
                    iM105 = C0014.m240(str5);
                    break;
                case 1753512:
                    ((TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.findViewById(R.id.about_text)).setText(C0014.m250(f8short, 700, 333, 2197));
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.show();
                    if (C0013.f2 % (C0015.f6 | (-8696)) <= 0) {
                        C0014.m245();
                        iM105 = C0013.m105("ۣۣۢ");
                    } else {
                        str2 = "ۤۤ";
                        iM105 = C0015.m573(str2);
                    }
                    break;
                case 1753633:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.setContentView(R.layout.dialog_about);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.setCanceledOnTouchOutside(true);
                    if ((C0013.f2 | (C0017.f10 + 3233)) <= 0) {
                        C0016.f9 = 5;
                        iM105 = C0017.m731("ۧ۟ۡ");
                    } else {
                        str2 = "ۥۦۨ";
                        iM105 = C0015.m573(str2);
                    }
                    break;
                case 1754377:
                    sb3.append(str11);
                    textView.setText(sb3.toString());
                    if (C0015.f6 >= 0) {
                        C0014.f3 = 19;
                        iM105 = C0013.m105("ۨۤۨ");
                    } else {
                        str6 = "ۦ۟۟";
                        iM105 = C0013.m105(str6);
                    }
                    break;
                case 1754532:
                    textView.setText(sb4.toString());
                    if (C0016.f9 + (C0013.f2 ^ 908) <= 0) {
                        str6 = "ۣۤۦ";
                        iM105 = C0013.m105(str6);
                    } else {
                        iM105 = (C0016.f9 | C0014.f3) + 1753727;
                    }
                    break;
                case 1755371:
                    if (C0015.f6 / (C0013.f2 ^ (-8216)) != 0) {
                        iM105 = C0017.m731("ۦ۟۟");
                    } else {
                        str3 = "۠ۥ";
                        sb = sb3;
                        str4 = str9;
                        sb3 = sb;
                        str9 = str4;
                        iM105 = C0015.m573(str3);
                    }
                    break;
                case 1755404:
                    iM105 = (C0017.f10 / C0014.f3) + 1755497;
                    break;
                case 1755496:
                    try {
                        str8 = packageManager.getPackageInfo(livePlayActivity.getPackageName(), 0).versionName;
                        iM105 = C0013.f2 - (C0014.f3 + 8563) >= 0 ? C0015.m573("ۧۤۡ") : (C0013.f2 | C0016.f9) ^ 1755841;
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        str7 = "";
                        if (C0017.f10 >= 0) {
                            C0014.m245();
                            str9 = "";
                            iM105 = C0014.m240("ۢۢۡ");
                        } else {
                            str9 = str7;
                            iM105 = C0013.m105("۟ۡۧ");
                        }
                    }
                    break;
                case 1755500:
                    if (C0016.f9 <= 0) {
                        C0016.f9 = 6;
                        str9 = str8;
                        iM105 = C0016.m618("ۦ۟");
                    } else {
                        sb = sb3;
                        str3 = "ۣۨ۠";
                        str4 = str8;
                        sb3 = sb;
                        str9 = str4;
                        iM105 = C0015.m573(str3);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x025b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        String str;
        String str2;
        int i;
        CustomRecyclerView customRecyclerView;
        String str3;
        String str4;
        String str5;
        String str6;
        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
        String str7;
        CustomRecyclerView customRecyclerView2 = null;
        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = null;
        ArrayList arrayList = null;
        int i2 = 0;
        int iM240 = C0014.m240("ۣۢۢ");
        int i3 = 0;
        while (true) {
            switch (iM240) {
                case 56475:
                    i2 = i3 + 1;
                    if ((C0014.f3 ^ (C0017.f10 | (-4817))) <= 0) {
                        C0015.f6 = 95;
                        iM240 = C0014.m240("ۢۢۧ");
                    } else {
                        iM240 = (C0017.f10 ^ C0014.f3) ^ 1751203;
                    }
                    break;
                case 56476:
                    if (C0013.f2 + (C0017.f10 % 6913) <= 0) {
                        iM240 = C0015.m573("ۣۡۥ");
                    } else {
                        str = "ۨۧۦ";
                        iM240 = C0016.m618(str);
                    }
                    break;
                case 1746784:
                    if (i3 < arrayList.size()) {
                        if (C0014.f3 >= 0) {
                            C0015.f6 = 99;
                            iM240 = C0013.m105("ۦۧۨ");
                        } else {
                            str7 = "ۣ۠ۦ";
                            iM240 = C0016.m618(str7);
                        }
                    } else if (C0017.f10 >= 0) {
                        C0016.m574();
                        str3 = "ۤ۟ۡ";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0017.f10 | C0015.f6) ^ (-1756035);
                    }
                    break;
                case 1746811:
                    ArrayList arrayList2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3196O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (C0016.f9 % (C0017.f10 % 7219) <= 0) {
                        arrayList = arrayList2;
                        iM240 = C0016.m618("۟ۤۢ");
                    } else {
                        arrayList = arrayList2;
                        iM240 = (C0015.f6 ^ C0017.f10) + 1751410;
                    }
                    break;
                case 1746845:
                    if ((C0014.f3 ^ (C0017.f10 + 5941)) >= 0) {
                        C0017.f10 = 16;
                        iM240 = C0013.m105("ۤۥۡ");
                    } else {
                        iM240 = (C0015.f6 * C0016.f9) + 2248243;
                    }
                    break;
                case 1746970:
                case 1755562:
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                        str3 = "ۤ۟ۡ";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0017.f10 | C0015.f6) ^ (-1756035);
                    }
                    break;
                case 1747841:
                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    str4 = "ۦۧۡ";
                    iM240 = C0015.m573(str4);
                    break;
                case 1747929:
                    customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i3);
                    if ((C0016.f9 | (C0013.f2 * 8020)) <= 0) {
                        C0015.m570();
                        iM240 = C0013.m105("ۤۡۤ");
                    } else {
                        iM240 = (C0016.f9 % C0017.f10) + 1752655;
                    }
                    break;
                case 1748739:
                    this.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.show();
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        iM240 = C0016.m618("ۣۢۢ");
                    } else {
                        str4 = "ۤۧۤ";
                        iM240 = C0015.m573(str4);
                    }
                    break;
                case 1748796:
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM240 = C0016.m618("ۤۤ");
                    } else {
                        iM240 = (C0017.f10 * C0016.f9) + 2361961;
                    }
                    break;
                case 1748801:
                    str = C0014.m245() >= 0 ? "ۦ۠ۥ" : "ۦۧۨ";
                    iM240 = C0016.m618(str);
                    break;
                case 1749671:
                    if (C0015.f6 >= 0) {
                        C0017.f10 = 73;
                        str5 = "۠ۥۤ";
                    } else {
                        str5 = "ۣۢۢ";
                    }
                    iM240 = C0016.m618(str5);
                    break;
                case 1749697:
                    if (this.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == null) {
                        if (C0014.f3 >= 0) {
                            C0016.f9 = 41;
                            iM240 = C0016.m618("ۥ۠");
                        } else {
                            iM240 = (C0013.f2 * C0014.f3) + 1944313;
                        }
                    } else if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM240 = C0016.m618("ۤۤ");
                    } else {
                        iM240 = (C0017.f10 * C0016.f9) + 2361961;
                    }
                    break;
                case 1750569:
                    if (!((AddressItem) arrayList.get(i3)).isSelected()) {
                        if (C0014.f3 % (C0016.f9 * (-9391)) >= 0) {
                            C0017.m717();
                            iM240 = C0013.m105("ۢۤ۠");
                        } else {
                            iM240 = (C0013.f2 / C0017.f10) ^ (-56476);
                        }
                    } else if (C0013.f2 - (C0013.f2 * 1346) >= 0) {
                        C0013.m114();
                        str6 = "۠ۥۦ";
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2;
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
                        iM240 = C0015.m573(str6);
                    }
                    break;
                case 1750813:
                    this.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    str3 = "ۣۡۥ";
                    iM240 = C0013.m105(str3);
                    break;
                case 1751524:
                    if (C0015.f6 >= 0) {
                        str4 = "ۧ۟ۡ";
                        iM240 = C0015.m573(str4);
                    } else {
                        iM240 = (C0014.f3 ^ C0014.f3) ^ 1752582;
                    }
                    break;
                case 1751559:
                    if (arrayList.isEmpty()) {
                        if (C0017.f10 >= 0) {
                            C0016.m574();
                            str3 = "ۤ۟ۡ";
                            iM240 = C0013.m105(str3);
                        } else {
                            iM240 = (C0017.f10 | C0015.f6) ^ (-1756035);
                        }
                    } else if (C0017.m717() >= 0) {
                        customRecyclerView = customRecyclerView2;
                        customRecyclerView2 = customRecyclerView;
                        iM240 = C0015.m573("ۦۨۧ");
                    } else {
                        iM240 = (C0014.f3 * C0015.f6) ^ 1790006;
                    }
                    break;
                case 1751680:
                    str2 = "ۥۡ";
                    i = i2;
                    iM240 = C0015.m573(str2);
                    i3 = i;
                    break;
                case 1751745:
                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = this.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    if ((C0017.f10 | (C0017.f10 - 7286)) >= 0) {
                        C0016.m574();
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
                        iM240 = C0014.m240("ۤۧۤ");
                    } else {
                        str6 = "ۥۧ۠";
                        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
                        iM240 = C0015.m573(str6);
                    }
                    break;
                case 1752582:
                    customRecyclerView = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3197O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if ((C0015.f6 ^ (C0013.f2 | 4612)) >= 0) {
                        C0015.f6 = 33;
                        customRecyclerView2 = customRecyclerView;
                        iM240 = C0014.m240("ۣۨۢ");
                    } else {
                        customRecyclerView2 = customRecyclerView;
                        iM240 = C0015.m573("ۦۨۧ");
                    }
                    break;
                case 1752702:
                    if (o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3198O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 0) {
                        if (C0014.f3 % (C0013.f2 % 4917) >= 0) {
                            iM240 = C0013.m105("ۥۣۤ");
                        } else {
                            str6 = "۠ۥۦ";
                            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2;
                            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2 = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
                            iM240 = C0015.m573(str6);
                        }
                    } else if (C0015.f6 >= 0) {
                        str4 = "ۧ۟ۡ";
                        iM240 = C0015.m573(str4);
                    } else {
                        iM240 = (C0014.f3 ^ C0014.f3) ^ 1752582;
                    }
                    break;
                case 1752706:
                    customRecyclerView2.setSelection(i3);
                    iM240 = (C0013.f2 | C0015.f6) ^ (-1746942);
                    break;
                case 1753451:
                case 1755591:
                    if (C0014.f3 >= 0) {
                        str2 = "ۢۧۢ";
                        i = i3;
                        iM240 = C0015.m573(str2);
                        i3 = i;
                    } else {
                        iM240 = C0017.m731("ۣ۟ۢ");
                    }
                    break;
                case 1753664:
                    o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo2.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    iM240 = C0015.f6 * (C0017.f10 * 3858) <= 0 ? C0016.m618("۠ۨۡ") : (C0016.f9 ^ C0016.f9) + 1752582;
                    break;
                case 1753671:
                    iM240 = C0013.f2 + C0017.f10 + 1746642;
                    i3 = 0;
                    break;
                case 1753701:
                    if (customRecyclerView2 != null) {
                        if (C0016.f9 - (C0015.f6 | 9139) <= 0) {
                            C0017.f10 = 98;
                            str7 = "ۣ۠ۦ";
                        } else {
                            str7 = "ۣ۟۟";
                        }
                        iM240 = C0016.m618(str7);
                    } else if (C0017.f10 >= 0) {
                        C0016.m574();
                        str3 = "ۤ۟ۡ";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0017.f10 | C0015.f6) ^ (-1756035);
                    }
                    break;
                case 1754562:
                    if (C0014.f3 % (C0016.f9 * (-9391)) >= 0) {
                        C0017.m717();
                        iM240 = C0013.m105("ۢۤ۠");
                    } else {
                        iM240 = (C0013.f2 / C0017.f10) ^ (-56476);
                    }
                    break;
                case 1755618:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        String str;
        TextView textView;
        CustomRecyclerView customRecyclerView;
        LivePlayActivity livePlayActivity;
        String str2;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String str3;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String str4;
        String str5;
        LivePlayActivity livePlayActivity2 = null;
        CustomRecyclerView customRecyclerView2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
        TextView textView2 = null;
        int iM731 = C0017.m731("۟ۡ۟");
        while (true) {
            switch (iM731) {
                case 56383:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(livePlayActivity2);
                    if (C0017.f10 + (C0014.f3 * 6850) >= 0) {
                        C0015.m570();
                        str2 = "۟ۦ۟";
                        livePlayActivity = livePlayActivity2;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        livePlayActivity2 = livePlayActivity;
                        iM731 = C0016.m618(str2);
                    } else {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM731 = (C0013.f2 * C0017.f10) ^ (-1104543);
                    }
                    break;
                case 56419:
                    customRecyclerView2.setAdapter(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1);
                    str = "ۡۥۡ";
                    textView = textView2;
                    textView2 = textView;
                    iM731 = C0017.m731(str);
                    break;
                case 1746688:
                    iM731 = (C0016.f9 | C0014.f3) ^ (-1746924);
                    break;
                case 1746749:
                    LivePlayActivity livePlayActivity3 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0016.f9 % (C0017.f10 * 1846) <= 0) {
                        C0016.m574();
                        livePlayActivity2 = livePlayActivity3;
                        iM731 = C0014.m240("ۢۡ");
                    } else {
                        livePlayActivity = livePlayActivity3;
                        str2 = "ۢۡ";
                        livePlayActivity2 = livePlayActivity;
                        iM731 = C0016.m618(str2);
                    }
                    break;
                case 1746904:
                    textView = (TextView) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.findViewById(R.id.backup);
                    if (C0015.m570() > 0) {
                        textView2 = textView;
                        iM731 = (C0017.f10 % C0015.f6) ^ (-1755547);
                    } else {
                        str = "ۡۡۡ";
                        textView2 = textView;
                        iM731 = C0017.m731(str);
                    }
                    break;
                case 1747839:
                    customRecyclerView = (CustomRecyclerView) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.findViewById(R.id.mBackupGridView);
                    str3 = "ۥۡۡ";
                    customRecyclerView2 = customRecyclerView;
                    iM731 = C0013.m105(str3);
                    break;
                case 1748673:
                    customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2;
                    str2 = "۟ۦ۟";
                    livePlayActivity = livePlayActivity2;
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    livePlayActivity2 = livePlayActivity;
                    iM731 = C0016.m618(str2);
                    break;
                case 1748797:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
                    if (C0016.f9 / (C0016.f9 % (-7778)) <= 0) {
                        C0016.f9 = 61;
                        str4 = "ۤ۠ۡ";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM731 = C0016.m618(str4);
                    } else {
                        iM731 = (C0016.f9 - C0016.f9) + 1755465;
                    }
                    break;
                case 1749577:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.setContentView(R.layout.dialog_backup);
                    if (C0015.f6 - (C0014.f3 + 9847) >= 0) {
                        C0016.m574();
                        iM731 = C0014.m240("ۣۦ");
                    } else {
                        iM731 = (C0015.f6 | C0015.f6) + 1751391;
                    }
                    break;
                case 1750752:
                    textView2.requestFocus();
                    iM731 = C0015.m573("ۤۡۡ");
                    break;
                case 1750754:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.setHasStableIds(true);
                    if (C0017.f10 % (C0013.f2 % 4998) >= 0) {
                        C0014.f3 = 20;
                        str5 = "ۣۦۣ";
                        iM731 = C0015.m573(str5);
                    } else {
                        iM731 = (C0016.f9 * C0015.f6) + 2244243;
                    }
                    break;
                case 1750782:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.setCanceledOnTouchOutside(true);
                    iM731 = C0017.m731("۠ۥۤ");
                    break;
                case 1751525:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f1102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity2;
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        customRecyclerView = customRecyclerView2;
                        str3 = "ۥۡۡ";
                        customRecyclerView2 = customRecyclerView;
                        iM731 = C0013.m105(str3);
                    } else {
                        iM731 = (C0015.f6 ^ C0017.f10) + 1750605;
                    }
                    break;
                case 1751556:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.show();
                    if (C0013.m114() >= 0) {
                        iM731 = C0016.m618("۟ۡ۟");
                    } else {
                        str5 = "ۦۤۤ";
                        iM731 = C0015.m573(str5);
                    }
                    break;
                case 1751562:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f3019O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    iM731 = C0014.m240("ۣۦ");
                    break;
                case 1752517:
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f3018O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = customRecyclerView2;
                    if (C0016.f9 <= 0) {
                        iM731 = C0017.m731("ۣۦۥ");
                    } else {
                        textView = textView2;
                        str = "ۡۡۡ";
                        textView2 = textView;
                        iM731 = C0017.m731(str);
                    }
                    break;
                case 1753574:
                    break;
                case 1754663:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
                    iM731 = C0015.m573(C0014.f3 >= 0 ? "ۢ۟ۦ" : "ۤ۠ۡ");
                    break;
                case 1755406:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 84;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM731 = C0017.m731("ۣۨۤ");
                    } else {
                        str4 = "ۧۨۨ";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM731 = C0016.m618(str4);
                    }
                    break;
                case 1755465:
                    textView2.setOnClickListener(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
                    if (C0015.m570() <= 0) {
                        C0017.m717();
                        iM731 = C0016.m618("ۨۡۧ");
                    } else {
                        str3 = "ۣۦۣ";
                        customRecyclerView = customRecyclerView2;
                        customRecyclerView2 = customRecyclerView;
                        iM731 = C0013.m105(str3);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        boolean z;
        boolean z2;
        int i2 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        if (i2 == 0) {
            this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, true, true);
        }
        LivePlayActivity livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ArrayList arrayList = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) livePlayActivity.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(i2)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (arrayList.isEmpty()) {
            this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
            this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1358O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
        } else {
            this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i);
            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.getClass();
            ArrayList arrayList2 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f1209O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.notifyDataSetChanged();
            this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(0);
            this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1359O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        }
        int iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
        switch (i2) {
            case 0:
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i;
                    this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00, true, false);
                }
                break;
            case 1:
                switch (i) {
                    case 0:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        break;
                    case 1:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        break;
                    case 2:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                        break;
                    case 3:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                        break;
                    case 4:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = ((Integer) Hawk.get(C0013.m153(f8short, 1217, 4, 598), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o))).intValue();
                        break;
                    case 5:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                        break;
                    case 6:
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = ((Integer) Hawk.get(C0016.m608(f8short, 1213, 4, 474), 0)).intValue();
                        break;
                    case 7:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        break;
                    case 8:
                        iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                        break;
                }
                this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, true, true);
                break;
            case 2:
                boolean z3 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(i)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                ArrayList arrayList3 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (i >= arrayList3.size()) {
                    return;
                }
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList3.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                sb.append(C0016.m608(f8short, 1204, 3, 2827));
                sb.append(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                sb.append(z3 ? C0016.m608(f8short, 1207, 3, 2815) : C0014.m250(f8short, 1210, 3, 3141));
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, sb.toString());
                boolean z4 = !z3;
                String str = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f926O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Hawk.put(str, Boolean.valueOf(z4));
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f910O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = z4;
                this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, z4, false);
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                ArrayList arrayList4 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i3 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                if (size > i3) {
                    arrayList5 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) arrayList4.get(i3)).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList5);
                O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
                ArrayList arrayList6 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                arrayList6.clear();
                arrayList6.addAll(arrayList4);
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyDataSetChanged();
                break;
            case 3:
                switch (i) {
                    case 0:
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                        break;
                    case 1:
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        break;
                    case 2:
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                        break;
                    case 3:
                        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                        break;
                    case 4:
                        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
                        break;
                    case 5:
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        break;
                    case 6:
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                        break;
                    case 7:
                        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                        break;
                }
                break;
            case 4:
                switch (i) {
                    case 0:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(C0016.m608(f8short, 1200, 4, 1725), Boolean.valueOf(z));
                        livePlayActivity.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                        break;
                    case 1:
                        boolean z5 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1459O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                        String strM250 = C0014.m250(f8short, 1196, 4, 1455);
                        z = !((Boolean) Hawk.get(strM250, Boolean.valueOf(z5))).booleanValue();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(strM250, Boolean.valueOf(z));
                        livePlayActivity.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
                        break;
                    case 2:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0013.m153(f8short, 1192, 4, 1595), z);
                        break;
                    case 3:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(C0016.m608(f8short, 1188, 4, 2643), Boolean.valueOf(z));
                        livePlayActivity.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                        break;
                    case 4:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0013.m153(f8short, 1183, 5, 1539), z);
                        break;
                    case 5:
                        boolean z6 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(C0013.m153(f8short, 1179, 4, 821), Boolean.valueOf(z6));
                        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                        ArrayList arrayList7 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        ArrayList arrayList8 = new ArrayList();
                        int size2 = arrayList7.size();
                        int i4 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                        if (size2 > i4) {
                            arrayList8 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) arrayList7.get(i4)).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        }
                        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList8);
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.getClass();
                        ArrayList arrayList9 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList7);
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.notifyDataSetChanged();
                        z = z6;
                        break;
                    case 6:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0017.m693(f8short, 1175, 4, 1835), z);
                        break;
                    case 7:
                        boolean z7 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1467O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                        String strM608 = C0016.m608(f8short, 1171, 4, 1604);
                        z = !((Boolean) Hawk.get(strM608, Boolean.valueOf(z7))).booleanValue();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(strM608, Boolean.valueOf(z));
                        livePlayActivity.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
                        break;
                    case 8:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0016.m608(f8short, 1167, 4, 3245), z);
                        break;
                    case 9:
                        boolean z8 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1481O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        String strM251 = C0014.m250(f8short, 1163, 4, 1703);
                        z = !((Boolean) Hawk.get(strM251, Boolean.valueOf(z8))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM251, z);
                        break;
                    case 10:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0013.m153(f8short, 1157, 6, 1247), z);
                        break;
                    case 11:
                        z = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0014.m250(f8short, 1151, 6, 920), z);
                        break;
                    default:
                        z = false;
                        break;
                }
                this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, z, false);
                break;
            case 5:
                String strM153 = C0013.m153(f8short, 1037, 2, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE);
                String strM154 = C0013.m153(f8short, 1039, 2, 911);
                switch (i) {
                    case 0:
                        z2 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0016.m608(f8short, 1147, 4, 1789), z2);
                        break;
                    case 1:
                        z2 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0016.m608(f8short, 1143, 4, 643), z2);
                        break;
                    case 2:
                        z2 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0016.m608(f8short, 1139, 4, 2858), z2);
                        break;
                    case 3:
                        boolean z9 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1461O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                        String strM252 = C0014.m250(f8short, 1135, 4, 1748);
                        z2 = !((Boolean) Hawk.get(strM252, Boolean.valueOf(z9))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM252, z2);
                        break;
                    case 4:
                        boolean z10 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        String strM609 = C0016.m608(f8short, 1131, 4, 1167);
                        z2 = !((Boolean) Hawk.get(strM609, Boolean.valueOf(z10))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM609, z2);
                        break;
                    case 5:
                        boolean z11 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1462O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                        String strM6010 = C0016.m608(f8short, 1127, 4, 2923);
                        z2 = !((Boolean) Hawk.get(strM6010, Boolean.valueOf(z11))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM6010, z2);
                        break;
                    case 6:
                        z2 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0017.m693(f8short, 1123, 4, 3221), z2);
                        break;
                    case 7:
                        boolean z12 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1471O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
                        String strM155 = C0013.m153(f8short, 1119, 4, 2947);
                        boolean zBooleanValue = ((Boolean) Hawk.get(strM155, Boolean.valueOf(z12))).booleanValue();
                        z2 = !zBooleanValue;
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM155, z2);
                        if (zBooleanValue) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.clear();
                        }
                        break;
                    case 8:
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Boolean bool = Boolean.FALSE;
                        String strM693 = C0017.m693(f8short, 1100, 4, 1603);
                        boolean zBooleanValue2 = ((Boolean) Hawk.get(strM693, bool)).booleanValue();
                        z2 = !zBooleanValue2;
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM693, z2);
                        if (!zBooleanValue2) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0017.m693(f8short, 1104, 15, 1781));
                        }
                        break;
                    case 9:
                        boolean z13 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1472O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o;
                        String strM694 = C0017.m693(f8short, 1096, 4, 2218);
                        z2 = !((Boolean) Hawk.get(strM694, Boolean.valueOf(z13))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM694, z2);
                        break;
                    case 10:
                        boolean zO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0();
                        z2 = !zO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0014.m250(f8short, 1081, 4, 1330), z2);
                        if (zO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                            Hawk.delete(C0014.m250(f8short, 1085, 11, 1162));
                        }
                        break;
                    case 11:
                        boolean z14 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1474O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
                        String strM253 = C0014.m250(f8short, 1077, 4, 1566);
                        z2 = !((Boolean) Hawk.get(strM253, Boolean.valueOf(z14))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM253, z2);
                        break;
                    case 12:
                        boolean z15 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1480O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
                        String strM254 = C0014.m250(f8short, 1071, 6, 2232);
                        z2 = !((Boolean) Hawk.get(strM254, Boolean.valueOf(z15))).booleanValue();
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.put(strM254, Boolean.valueOf(z2));
                        livePlayActivity.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(3);
                        break;
                    case 13:
                        boolean zO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
                        boolean z16 = !zO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        String strM695 = C0017.m693(f8short, 1058, 4, 2624);
                        Hawk.put(strM695, Boolean.valueOf(z16));
                        StringBuilder sb2 = new StringBuilder(strM695);
                        if (zO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
                            strM154 = strM153;
                        }
                        sb2.append(strM154);
                        sb2.append(C0016.m608(f8short, 1062, 9, 1957));
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, sb2.toString());
                        if (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 3) {
                            livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.release();
                            livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
                        }
                        z2 = z16;
                        break;
                    case 14:
                        boolean zO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                        boolean z17 = !zO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        String strM156 = C0013.m153(f8short, 1045, 4, 2690);
                        Hawk.put(strM156, Boolean.valueOf(z17));
                        StringBuilder sb3 = new StringBuilder(strM156);
                        if (zO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
                            strM154 = strM153;
                        }
                        sb3.append(strM154);
                        sb3.append(C0016.m608(f8short, 1049, 9, 1044));
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, sb3.toString());
                        z2 = z17;
                        break;
                    case 15:
                        boolean z18 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1486O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                        String strM6011 = C0016.m608(f8short, 1041, 4, 2962);
                        z2 = !((Boolean) Hawk.get(strM6011, Boolean.valueOf(z18))).booleanValue();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM6011, z2);
                        break;
                    default:
                        z2 = false;
                        break;
                }
                this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, z2, false);
                break;
            case 6:
                if (i == 0) {
                    iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                } else if (i == 1) {
                    iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                if (i > 1) {
                    return;
                } else {
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, true, true);
                }
                break;
            case 7:
                if (i == 0) {
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                } else if (i == 1) {
                    O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                } else if (i == 2) {
                    livePlayActivity.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                } else if (i == 3) {
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                break;
            case 8:
                if (i == 0) {
                    iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                } else if (i == 1) {
                    iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = ((Integer) Hawk.get(C0013.m153(f8short, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, 4, 505), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1453O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o))).intValue();
                } else if (i == 2) {
                    iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                }
                if (i > 2) {
                    return;
                } else {
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, true, true);
                }
                break;
            case 9:
                if (i == 0) {
                    new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).show();
                } else if (i == 1) {
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                } else if (i == 2) {
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                }
                break;
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
    }

    /* JADX WARN: Code duplicated, block: B:1003:0x1340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1005:0x1339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1007:0x0e39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1008:0x0c83 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1010:0x0806 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1011:0x0c7a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1012:0x0e46 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1023:0x11f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1041:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1042:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1043:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1061:0x08c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1070:0x0823 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1072:0x081a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1073:0x0d5e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1075:0x0d52 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1078:0x1437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1079:0x142f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1086:0x0aa2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1087:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1088:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1089:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1092:0x06cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1093:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1094:0x10c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1095:0x10bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1097:0x12e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1098:0x11aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1099:0x119d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1100:0x12db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1135:0x1306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1137:0x12f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1139:0x0a90 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1144:0x0d17 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1145:0x0d0e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1155:0x0d7d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1157:0x0d70 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1161:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1171:0x0e83 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:877:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:878:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:880:0x0e76 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:882:0x0e72 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:883:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:893:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:899:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:900:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:901:0x0c4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:902:0x0c44 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:905:0x0e8b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:908:0x0f48 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:909:0x0f40 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:912:0x0f12 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:921:0x148a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:923:0x1483 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:932:0x079c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:944:0x0c9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:946:0x0c94 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:948:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:950:0x1359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:951:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:954:0x0f0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:955:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:957:0x11f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:959:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:963:0x1350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:967:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:972:0x1245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:973:0x1237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:978:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:994:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:995:0x02de A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:259:0x06c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        RenderViewFactory renderViewFactory;
        boolean z;
        boolean z2;
        LivePlayActivity livePlayActivity;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
        HttpUrl httpUrl;
        int i2;
        String str;
        String str2;
        HttpUrl httpUrl2;
        DnsOverHttps dnsOverHttps;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        String str14;
        String str15;
        HttpUrl httpUrl3;
        String str16;
        DnsOverHttps dnsOverHttps2;
        String str17;
        String str18;
        VideoView videoView;
        String str19;
        String str20;
        String str21;
        String str22;
        boolean z3;
        String str23;
        String strM693;
        String str24;
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        String str25;
        String str26;
        String str27;
        boolean z4;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String strM250;
        String str35;
        String str36;
        String str37;
        com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String strM694;
        String str38;
        String str39;
        String str40;
        boolean z5;
        String str41;
        String str42;
        boolean z6 = false;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = null;
        int i3 = 0;
        LivePlayActivity livePlayActivity2 = null;
        RenderViewFactory renderViewFactory2 = null;
        HttpUrl httpUrl4 = null;
        boolean z7 = false;
        boolean z8 = false;
        String str43 = null;
        String strM153 = null;
        DnsOverHttps dnsOverHttps3 = null;
        HttpUrl httpUrl5 = null;
        HttpUrl httpUrl6 = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str44 = null;
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = null;
        com.github.tvbox.osc.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = null;
        VideoView videoView2 = null;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = null;
        RenderViewFactory renderViewFactoryCreate = null;
        int iM731 = C0017.m731("ۡۡۦ");
        while (true) {
            switch (iM731) {
                case 56288:
                    if (i == 0) {
                        if (C0015.f6 >= 0) {
                            str20 = "ۢۡۦ";
                            iM731 = C0015.m573(str20);
                        } else {
                            iM731 = C0016.m618("۠ۢۡ");
                        }
                    } else if (i != 1) {
                        z8 = false;
                        str35 = "ۣۨۨ";
                        iM731 = C0016.m618(str35);
                    } else if (C0014.f3 - (C0014.f3 - 5694) <= 0) {
                        C0016.f9 = 31;
                        iM731 = C0016.m618("ۦۣۣ");
                    } else {
                        iM731 = (C0016.f9 % C0013.f2) + 1749729;
                    }
                    break;
                case 56289:
                case 1747712:
                case 1749818:
                case 1753414:
                    iM731 = C0016.f9 * (C0016.f9 / (-197)) >= 0 ? C0013.m105("ۣۧ۠") : (C0014.f3 | C0015.f6) ^ (-1751557);
                    break;
                case 56293:
                    iM731 = C0016.m618("ۨ۠ۡ");
                    break;
                case 56295:
                case 1747930:
                case 1750717:
                case 1753634:
                    break;
                case 56297:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0014.m250(f8short, 1527, 4, 2915), Integer.valueOf(i));
                    iM731 = (C0015.f6 ^ C0017.f10) + 1755222;
                    break;
                case 56319:
                case 1746718:
                case 1746788:
                case 1746843:
                case 1746944:
                case 1747713:
                case 1747835:
                case 1747839:
                case 1748702:
                case 1748772:
                case 1748894:
                case 1749827:
                case 1749851:
                case 1750598:
                case 1750689:
                case 1750812:
                case 1751532:
                case 1751621:
                case 1751745:
                case 1752520:
                case 1753702:
                case 1754533:
                case 1755339:
                case 1755374:
                case 1755531:
                    iM731 = C0015.f6 + C0013.f2 + 1749531;
                    break;
                case 56324:
                    str13 = "ۨ۠ۦ";
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    iM731 = C0014.m240(str13);
                    break;
                case 56357:
                    if (C0017.f10 * (C0015.f6 ^ 8925) <= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("ۤۥۣ");
                    } else {
                        str9 = "ۢۨۡ";
                        iM731 = C0017.m731(str9);
                    }
                    break;
                case 56382:
                    strM694 = C0017.m693(f8short, 1464, 25, 1685);
                    if (C0013.m114() >= 0) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        str43 = strM694;
                        iM731 = C0015.m573("ۣ۠ۡ");
                    } else {
                        str43 = strM694;
                        iM731 = C0016.m618("ۣۡ۟");
                    }
                    break;
                case 56386:
                    strM693 = str44;
                    str44 = strM693;
                    iM731 = C0017.f10 + C0016.f9 + 1748655;
                    break;
                case 56388:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0017.m693(f8short, 1307, 5, 1012), Integer.valueOf(i));
                    DnsOverHttps dnsOverHttps4 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    iM731 = C0014.m245() >= 0 ? C0015.m573("ۧۥۡ") : (C0017.f10 - C0016.f9) + 1756071;
                    break;
                case 56413:
                    strM250 = C0014.m250(f8short, 1404, 28, 688);
                    str34 = "۠ۧ۠";
                    strM153 = strM250;
                    iM731 = C0013.m105(str34);
                    break;
                case 56417:
                    iM731 = (C0013.f2 % C0017.f10) ^ 56174;
                    break;
                case 56444:
                    if (C0014.f3 + C0016.f9 + 4401 <= 0) {
                        C0017.f10 = 84;
                        str3 = "ۡۨۡ";
                        iM731 = C0016.m618(str3);
                    } else {
                        iM731 = (C0015.f6 + C0014.f3) ^ (-1746063);
                    }
                    break;
                case 56445:
                    if (C0015.f6 < 0) {
                        str39 = "ۦۨۨ";
                        iM731 = C0014.m240(str39);
                    } else {
                        C0014.m245();
                        str5 = "ۥۦ۠";
                        iM731 = C0016.m618(str5);
                    }
                    break;
                case 56476:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0013.m153(f8short, 1535, 8, 985), Integer.valueOf(i));
                    if (C0014.f3 * (C0014.f3 ^ (-3800)) >= 0) {
                        iM731 = C0014.m240("ۨۢۤ");
                    } else {
                        str32 = "ۡۦۡ";
                        iM731 = C0015.m573(str32);
                    }
                    break;
                case 56480:
                    strM153 = C0017.m693(f8short, 1312, 31, 651);
                    if ((C0014.f3 ^ (C0017.f10 | 7535)) <= 0) {
                        C0016.m574();
                        iM731 = C0013.m105("ۦۥۡ");
                    } else {
                        iM731 = (C0013.f2 * C0014.f3) ^ (-1594504);
                    }
                    break;
                case 56506:
                    livePlayActivity2.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(-1, C0014.m250(f8short, 1547, 23, 677));
                    iM731 = (C0013.f2 ^ C0015.f6) + 1747367;
                    break;
                case 56510:
                    if (C0015.m570() <= 0) {
                        C0017.f10 = 57;
                        iM731 = C0015.m573("ۢۨۤ");
                    } else {
                        iM731 = (C0013.f2 * C0017.f10) ^ (-701239);
                    }
                    break;
                case 56537:
                    if ((C0017.f10 | C0015.f6 | (-5170)) >= 0) {
                        C0016.m574();
                        livePlayActivity = livePlayActivity2;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        str8 = "ۢۡ۠";
                        i2 = i3;
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i3 = i2;
                        iM731 = C0017.m731(str8);
                    } else {
                        iM731 = (C0017.f10 | C0016.f9) + 1753783;
                    }
                    break;
                case 56539:
                    iM731 = (C0015.f6 ^ C0015.f6) + 1751589;
                    break;
                case 56543:
                    iM731 = C0017.f10 >= 0 ? C0015.m573("۠ۦۡ") : (C0014.f3 * C0013.f2) + 1943072;
                    break;
                case 56545:
                    if (C0015.f6 % (C0016.f9 | (-2044)) >= 0) {
                        C0015.f6 = 66;
                        iM731 = C0017.m731("۠ۤ");
                    } else {
                        iM731 = (C0014.f3 ^ C0015.f6) ^ 55625;
                    }
                    break;
                case 56570:
                    if ((C0015.f6 | (C0014.f3 - 4190)) < 0) {
                        str20 = "ۤۧۤ";
                        iM731 = C0015.m573(str20);
                    } else {
                        C0015.f6 = 48;
                        str21 = "۠ۨ۠";
                        iM731 = C0014.m240(str21);
                    }
                    break;
                case 56573:
                    if (C0016.f9 + (C0016.f9 | (-9157)) >= 0) {
                        str26 = "ۢۨۤ";
                        z2 = z12;
                        z12 = z2;
                        iM731 = C0013.m105(str26);
                    } else {
                        str40 = "ۧۨ۠";
                        iM731 = C0016.m618(str40);
                    }
                    break;
                case 1746726:
                    HashMap map = new HashMap();
                    Boolean bool = Boolean.TRUE;
                    map.put(C0016.m608(f8short, 1593, 22, 1247), bool);
                    map.put(C0014.m250(f8short, 1615, 21, 1068), bool);
                    QbSdk.initTbsSettings(map);
                    QbSdk.setTbsListener(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(22));
                    if (!new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1336O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO).exists()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, C0016.m608(f8short, 1636, 16, 576));
                        iM731 = C0013.f2 + (C0014.f3 * (-7200)) <= 0 ? C0013.m105("۟ۡۤ") : C0013.m105("ۨ۟ۦ");
                    } else if (C0015.m570() <= 0) {
                        C0017.f10 = 43;
                        iM731 = C0014.m240("ۥۤۢ");
                    } else {
                        iM731 = C0017.m731("ۣۤۥ");
                    }
                    break;
                case 1746750:
                case 1754409:
                    iM731 = (C0014.f3 ^ (C0016.f9 ^ 3529)) >= 0 ? C0016.m618("ۥۧۨ") : (C0014.f3 | C0015.f6) + 1749792;
                    break;
                case 1746754:
                    if (i3 == 0) {
                        iM731 = C0017.f10 + C0015.f6 + 57755;
                    } else if (i3 == 1) {
                        iM731 = C0013.m105("ۣۣۣ");
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            iM731 = (C0013.f2 % C0017.f10) ^ 56174;
                        } else if (i3 != 4) {
                            if ((C0013.f2 ^ (C0015.f6 % (-6861))) >= 0) {
                                iM731 = C0016.m618("۠ۨۨ");
                            } else {
                                str41 = "ۣ۠۟";
                                iM731 = C0016.m618(str41);
                            }
                        } else if (C0013.f2 <= 0) {
                            C0017.m717();
                            str37 = "ۥۣۧ";
                            iM731 = C0013.m105(str37);
                        } else {
                            iM731 = (C0014.f3 - C0016.f9) + 1753604;
                        }
                    } else if ((C0017.f10 | C0015.f6 | (-5170)) >= 0) {
                        C0016.m574();
                        livePlayActivity = livePlayActivity2;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        str8 = "ۢۡ۠";
                        i2 = i3;
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i3 = i2;
                        iM731 = C0017.m731(str8);
                    } else {
                        iM731 = (C0017.f10 | C0016.f9) + 1753783;
                    }
                    break;
                case 1746780:
                    iM731 = (C0015.f6 - C0013.f2) + 1752200;
                    break;
                case 1746817:
                    switch (i3) {
                        case 0:
                            iM731 = C0017.f10 + C0015.f6 + 1754071;
                            break;
                        case 1:
                            str41 = "ۢۨۦ";
                            iM731 = C0016.m618(str41);
                            break;
                        case 2:
                            if (C0013.f2 / (C0015.f6 * (-5467)) == 0) {
                                iM731 = (C0016.f9 % C0017.f10) + 1746919;
                            } else {
                                C0017.m717();
                                str9 = "۟۟ۥ";
                                iM731 = C0017.m731(str9);
                            }
                            break;
                        case 3:
                            iM731 = (C0017.f10 - C0017.f10) + 1751680;
                            break;
                        case 4:
                            if (C0014.f3 / (C0017.f10 * (-8227)) == 0) {
                                iM731 = (C0017.f10 ^ C0017.f10) + 1746937;
                            } else {
                                C0014.f3 = 72;
                                iM731 = C0014.m240("۠ۢۦ");
                            }
                            break;
                        case 5:
                            str16 = "ۣۡۡ";
                            iM731 = C0017.m731(str16);
                            break;
                        case 6:
                            if (C0013.f2 <= 0) {
                                str33 = "ۧ۠ۡ";
                                iM731 = C0017.m731(str33);
                            } else {
                                C0016.f9 = 84;
                                str36 = "ۣۤۨ";
                                iM731 = C0017.m731(str36);
                            }
                            break;
                        case 7:
                            if ((C0017.f10 ^ (C0016.f9 + (-6331))) > 0) {
                            }
                            break;
                        case 8:
                            iM731 = (C0017.f10 / C0014.f3) + 56473;
                            break;
                        default:
                            if (C0017.f10 < 0) {
                                iM731 = (C0013.f2 + C0016.f9) ^ 1748464;
                            } else {
                                str32 = "ۢۨۥ";
                                iM731 = C0015.m573(str32);
                            }
                            break;
                    }
                    break;
                case 1746851:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                    if (C0014.f3 / (C0015.f6 ^ (-190)) != 0) {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        iM731 = C0014.m240("ۣۧۧ");
                    } else {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        iM731 = (C0017.f10 * C0013.f2) + 2428926;
                    }
                    break;
                case 1746873:
                    if (i3 == 0) {
                        if (C0013.f2 <= 0) {
                            C0013.f2 = 17;
                            iM731 = C0016.m618("ۣۢۨ");
                        } else {
                            str40 = "۟ۨ";
                            iM731 = C0016.m618(str40);
                        }
                    } else if (i3 == 1) {
                        if (C0016.f9 + (C0016.f9 | (-9157)) >= 0) {
                            str26 = "ۢۨۤ";
                            z2 = z12;
                            z12 = z2;
                            iM731 = C0013.m105(str26);
                        } else {
                            str40 = "ۧۨ۠";
                            iM731 = C0016.m618(str40);
                        }
                    } else if (i3 != 2) {
                        str24 = "ۡ۠ۨ";
                        iM731 = C0015.m573(str24);
                    } else if (C0013.m114() >= 0) {
                        C0016.m574();
                        str22 = "ۡۡۧ";
                        iM731 = C0014.m240(str22);
                    } else {
                        iM731 = (C0013.f2 - C0017.f10) ^ 1753941;
                    }
                    break;
                case 1746874:
                    iM731 = C0014.f3 + C0016.f9 + 1755027;
                    break;
                case 1746882:
                    if ((C0013.f2 | C0013.f2 | 3894) <= 0) {
                        C0015.m570();
                        str38 = "ۦۤ";
                    } else {
                        str38 = "۠ۡۡ";
                    }
                    iM731 = C0014.m240(str38);
                    break;
                case 1746908:
                    iM731 = (C0016.f9 * C0016.f9) ^ 1261942;
                    break;
                case 1746911:
                case 1747936:
                case 1750691:
                case 1750788:
                case 1751589:
                case 1751718:
                case 1754659:
                    if ((C0017.f10 ^ (C0017.f10 * 1852)) > 0) {
                        dnsOverHttps2 = dnsOverHttps3;
                        str17 = "ۥۦ۟";
                        dnsOverHttps3 = dnsOverHttps2;
                        iM731 = C0015.m573(str17);
                    } else {
                        C0017.f10 = 4;
                        str33 = "ۤۡۨ";
                        iM731 = C0017.m731(str33);
                    }
                    break;
                case 1746937:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0016.m608(f8short, 1678, 4, 1562), Integer.valueOf(i));
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = livePlayActivity2.f2960O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    videoView = livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getClass();
                    if (i == 0) {
                        renderViewFactoryCreate = TextureRenderViewFactory.create();
                        if (C0015.m570() <= 0) {
                            videoView2 = videoView;
                            iM731 = C0013.m105("ۨۥۨ");
                        } else {
                            videoView2 = videoView;
                            iM731 = (C0017.f10 | C0017.f10) + 1748507;
                        }
                    } else {
                        videoView2 = videoView;
                        iM731 = C0016.m618("ۣ۠ۢ");
                    }
                    break;
                case 1746967:
                    livePlayActivity = livePlayActivity2;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                    httpUrl = httpUrl4;
                    i2 = i3;
                    livePlayActivity2 = livePlayActivity;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                    httpUrl4 = httpUrl;
                    i3 = i2;
                    iM731 = (C0016.f9 % C0017.f10) + 1749555;
                    break;
                case 1746968:
                    boolean z13 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1479O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
                    String strM695 = C0017.m693(f8short, 1493, 7, 2206);
                    z12 = !((Boolean) Hawk.get(strM695, Boolean.valueOf(z13))).booleanValue();
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM695, z12);
                    iM731 = C0013.f2 + (C0016.f9 | 6602) <= 0 ? C0016.m618("ۧ۠") : C0017.m731("۟ۦۣ");
                    break;
                case 1746970:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0013.m153(f8short, 1686, 4, 3257), Integer.valueOf(i));
                    if (C0014.m245() < 0) {
                        str11 = "ۡۦ";
                        iM731 = C0015.m573(str11);
                    } else {
                        iM731 = C0017.m731("ۦۦۢ");
                    }
                    break;
                case 1747648:
                    str10 = "۟ۦۦ";
                    iM731 = C0014.m240(str10);
                    break;
                case 1747688:
                    strM153 = C0014.m250(f8short, 1343, 33, 2225);
                    iM731 = C0017.m731("ۧۢ");
                    break;
                case 1747714:
                    QbSdk.installLocalTbsCore(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2, 46294, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1336O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    str18 = "ۣۥ۟";
                    iM731 = C0014.m240(str18);
                    break;
                case 1747716:
                    videoView = videoView2;
                    videoView2 = videoView;
                    iM731 = C0016.m618("ۣ۠ۢ");
                    break;
                case 1747743:
                    boolean z14 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1463O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    String strM154 = C0013.m153(f8short, 1294, 4, 1856);
                    z7 = !((Boolean) Hawk.get(strM154, Boolean.valueOf(z14))).booleanValue();
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM154, z7);
                    iM731 = (C0013.f2 / C0016.f9) ^ 1753632;
                    break;
                case 1747744:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, true, true);
                    iM731 = C0015.m573("۟ۡۤ");
                    break;
                case 1747745:
                    if (i == 1) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        if ((C0016.f9 | C0017.f10 | (-8278)) >= 0) {
                            C0013.f2 = 61;
                            str13 = "ۣۢۢ";
                            renderViewFactoryCreate = renderViewFactory2;
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            iM731 = C0014.m240(str13);
                        } else {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            renderViewFactoryCreate = renderViewFactory2;
                            iM731 = (C0016.f9 - C0013.f2) + 1748709;
                        }
                    } else {
                        renderViewFactory = renderViewFactory2;
                        str19 = "ۨۨۧ";
                        renderViewFactoryCreate = renderViewFactory;
                        iM731 = C0013.m105(str19);
                    }
                    break;
                case 1747749:
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 64;
                        iM731 = C0016.m618("ۢۧ۟");
                    } else {
                        str34 = "ۢۦۥ";
                        strM250 = strM153;
                        strM153 = strM250;
                        iM731 = C0013.m105(str34);
                    }
                    break;
                case 1747772:
                    if (C0015.f6 >= 0) {
                        C0014.m245();
                        str = "ۢۢۦ";
                        iM731 = C0014.m240(str);
                    } else {
                        iM731 = (C0014.f3 ^ C0013.f2) + 1748564;
                    }
                    break;
                case 1747781:
                case 1754505:
                case 1755337:
                    if ((C0013.f2 | (C0013.f2 / 4420)) <= 0) {
                        C0016.m574();
                        iM731 = C0013.m105("ۤۦ۠");
                    } else {
                        iM731 = (C0017.f10 % C0015.f6) ^ (-1754774);
                    }
                    break;
                case 1747805:
                    iM731 = C0013.f2 <= 0 ? C0013.m105("ۦۥ۠") : (C0016.f9 * C0014.f3) + 1922707;
                    break;
                case 1747806:
                    new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, livePlayActivity2, C0013.m153(f8short, 1252, 11, 996)).show();
                    if (C0015.f6 + C0017.f10 + 1764 <= 0) {
                        C0013.m114();
                        iM731 = C0013.m105("ۣۧۨ");
                    } else {
                        str29 = "ۢۤۦ";
                        iM731 = C0015.m573(str29);
                    }
                    break;
                case 1747809:
                case 1749820:
                case 1754471:
                    iM731 = C0016.m574() >= 0 ? C0016.m618("ۢۧ") : C0017.m731("ۣۥ۟");
                    break;
                case 1747896:
                    if (C0017.f10 + (C0015.f6 * 2009) >= 0) {
                        str39 = "ۦۧۡ";
                        iM731 = C0014.m240(str39);
                    } else {
                        iM731 = (C0016.f9 % C0014.f3) + 1747645;
                    }
                    break;
                case 1747897:
                    if (C0017.f10 < 0) {
                        str6 = "ۧۨۤ";
                        iM731 = C0014.m240(str6);
                    } else {
                        C0017.m717();
                        str35 = "ۨۥ";
                        iM731 = C0016.m618(str35);
                    }
                    break;
                case 1747903:
                    if (C0016.f9 + C0015.f6 + 6743 <= 0) {
                        C0016.f9 = 14;
                        z12 = z11;
                        iM731 = C0016.m618("ۤ۠");
                    } else {
                        str21 = "ۥۥ۟";
                        z12 = z11;
                        iM731 = C0014.m240(str21);
                    }
                    break;
                case 1747928:
                    if (C0014.f3 >= 0) {
                        C0017.f10 = 77;
                        str42 = "ۢۨ۟";
                        strM693 = str44;
                        str44 = strM693;
                        iM731 = C0013.m105(str42);
                    } else {
                        iM731 = (C0016.f9 % C0016.f9) + 1754632;
                    }
                    break;
                case 1747931:
                    if (C0013.m114() < 0) {
                        C0016.f9 = 52;
                        iM731 = C0015.m573("۟ۡۥ");
                    } else {
                        iM731 = (C0014.f3 % C0017.f10) ^ (-56553);
                    }
                    break;
                case 1747935:
                    iM731 = C0017.f10 + C0015.f6 + 1754071;
                    break;
                case 1748610:
                    str20 = "ۣ۠ۨ";
                    iM731 = C0015.m573(str20);
                    break;
                case 1748618:
                    renderViewFactoryCreate = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    iM731 = (C0013.f2 * C0013.f2) + 945623;
                    break;
                case 1748641:
                    if (C0013.m114() < 0) {
                        str37 = "ۨۧۨ";
                        iM731 = C0013.m105(str37);
                    } else {
                        C0015.f6 = 64;
                        str41 = "ۨۢۥ";
                        iM731 = C0016.m618(str41);
                    }
                    break;
                case 1748649:
                    iM731 = C0013.m114() >= 0 ? C0017.m731("ۣۥ۟") : C0017.m731("۟ۢۧ");
                    break;
                case 1748675:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0016.m608(f8short, 1672, 6, 345), Integer.valueOf(i));
                    livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.release();
                    livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
                    str22 = "ۡۤۤ";
                    iM731 = C0014.m240(str22);
                    break;
                case 1748678:
                    z6 = true;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    i2 = f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                    int i4 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    renderViewFactory2 = null;
                    httpUrl = null;
                    if (i4 == 1) {
                        str8 = "ۦۧۨ";
                        httpUrl4 = httpUrl;
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i3 = i2;
                        iM731 = C0017.m731(str8);
                    } else if (i4 == 6) {
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = httpUrl;
                        i3 = i2;
                        iM731 = (C0016.f9 % C0017.f10) + 1749555;
                    } else if (i4 != 8) {
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = null;
                        i3 = i2;
                        iM731 = (C0014.f3 * C0013.f2) + 250045;
                    } else if ((C0013.f2 ^ (C0015.f6 * 6700)) >= 0) {
                        C0014.f3 = 36;
                        str17 = "ۣۨ";
                        dnsOverHttps2 = dnsOverHttps3;
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = httpUrl;
                        i3 = i2;
                        dnsOverHttps3 = dnsOverHttps2;
                        iM731 = C0015.m573(str17);
                    } else {
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = httpUrl;
                        i3 = i2;
                        iM731 = (C0013.f2 % C0016.f9) + 1755310;
                    }
                    break;
                case 1748704:
                case 1749663:
                case 1752551:
                case 1753574:
                    z = z11;
                    z2 = z12;
                    if (C0014.m245() >= 0) {
                        str26 = "ۣۦۤ";
                        z11 = z;
                        z12 = z2;
                        iM731 = C0013.m105(str26);
                    } else {
                        z11 = z;
                        z12 = z2;
                        iM731 = (C0016.f9 / C0016.f9) + 1752638;
                    }
                    break;
                case 1748706:
                    if (QbSdk.getTbsVersion(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1589O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1590O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) > 0) {
                        QbSdk.unForceSysWebView();
                        if (QbSdk.canLoadX5(livePlayActivity2.getApplicationContext())) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                            Hawk.put(str44, Integer.valueOf(i));
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, C0014.m250(f8short, 1570, 8, 828));
                            if (C0017.f10 / (C0017.f10 + 8892) != 0) {
                                C0017.f10 = 12;
                                iM731 = C0016.m618("۟ۧۡ");
                            } else {
                                str32 = "ۥ۠ۡ";
                                iM731 = C0015.m573(str32);
                            }
                        } else if (C0014.f3 >= 0) {
                            C0017.f10 = 77;
                            str42 = "ۢۨ۟";
                            strM693 = str44;
                            str44 = strM693;
                            iM731 = C0013.m105(str42);
                        } else {
                            iM731 = (C0016.f9 % C0016.f9) + 1754632;
                        }
                    } else if (C0013.m114() < 0) {
                        C0015.f6 = 64;
                        str41 = "ۨۢۥ";
                        iM731 = C0016.m618(str41);
                    } else {
                        str37 = "ۨۧۨ";
                        iM731 = C0013.m105(str37);
                    }
                    break;
                case 1748711:
                    if ((C0013.f2 | C0014.f3 | (-1257)) >= 0) {
                        C0014.f3 = 74;
                        iM731 = C0017.m731("ۧۧۡ");
                    } else {
                        str14 = "ۡۨۥ";
                        iM731 = C0016.m618(str14);
                    }
                    break;
                case 1748736:
                    if (C0017.f10 - (C0014.f3 / 4103) >= 0) {
                        C0016.f9 = 62;
                        httpUrl6 = httpUrl5;
                        iM731 = C0014.m240("ۥۢۨ");
                    } else {
                        str2 = "ۨۡۤ";
                        httpUrl2 = httpUrl5;
                        httpUrl6 = httpUrl2;
                        iM731 = C0014.m240(str2);
                    }
                    break;
                case 1748740:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, true, true);
                    if (C0013.f2 + (C0016.f9 - 2038) >= 0) {
                        C0017.m717();
                    } else {
                        iM731 = C0015.m573("ۨۢۢ");
                    }
                    break;
                case 1748764:
                case 1755369:
                    if (C0016.f9 * (C0015.f6 | (-4630)) >= 0) {
                        C0017.m717();
                        str7 = "ۢۥۡ";
                        iM731 = C0017.m731(str7);
                    } else {
                        iM731 = (C0013.f2 * C0017.f10) ^ (-1090013);
                    }
                    break;
                case 1748766:
                case 1749793:
                    renderViewFactory = renderViewFactoryCreate;
                    str19 = "ۨۨۧ";
                    renderViewFactoryCreate = renderViewFactory;
                    iM731 = C0013.m105(str19);
                    break;
                case 1748769:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str24 = "ۦۦۧ";
                        iM731 = C0015.m573(str24);
                    } else {
                        iM731 = (C0014.f3 / C0014.f3) ^ 1755338;
                    }
                    break;
                case 1748828:
                    iM731 = (C0014.f3 ^ (C0014.f3 / (-4994))) >= 0 ? C0014.m240("ۡۡۦ") : (C0013.f2 % C0014.f3) ^ 1746984;
                    break;
                case 1748859:
                    if (C0016.f9 <= 0) {
                        C0013.m114();
                        iM731 = C0015.m573("ۢ۠ۡ");
                    } else {
                        iM731 = (C0014.f3 ^ C0015.f6) ^ 1750057;
                    }
                    break;
                case 1749572:
                    new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, livePlayActivity2, C0013.m153(f8short, 1221, 10, 332)).show();
                    if (C0017.m717() < 0) {
                        str9 = "ۨۥۥ";
                        iM731 = C0017.m731(str9);
                    } else {
                        str30 = "ۧۡۡ";
                        iM731 = C0016.m618(str30);
                    }
                    break;
                case 1749604:
                    if ((C0014.f3 ^ (C0013.f2 * (-4371))) <= 0) {
                        C0015.f6 = 74;
                        iM731 = C0013.m105("ۤۢ۟");
                    } else {
                        str30 = "ۧۤۢ";
                        iM731 = C0016.m618(str30);
                    }
                    break;
                case 1749606:
                    if (i3 < 2) {
                        iM731 = (C0014.f3 * C0015.f6) ^ 1784144;
                    } else if (C0014.f3 + C0016.f9 + 4401 <= 0) {
                        C0017.f10 = 84;
                        str3 = "ۡۨۡ";
                        iM731 = C0016.m618(str3);
                    } else {
                        iM731 = (C0015.f6 + C0014.f3) ^ (-1746063);
                    }
                    break;
                case 1749664:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    iM731 = C0016.f9 + (C0017.f10 | (-8027)) <= 0 ? C0014.m240("ۧۡۨ") : C0017.m731("ۧۧۦ");
                    break;
                case 1749670:
                    livePlayActivity = livePlayActivity2;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                    httpUrl = httpUrl4;
                    i2 = i3;
                    str8 = "ۦۧۨ";
                    httpUrl4 = httpUrl;
                    livePlayActivity2 = livePlayActivity;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                    i3 = i2;
                    iM731 = C0017.m731(str8);
                    break;
                case 1749727:
                    IjkMediaPlayer.toggleDotPort(z10);
                    iM731 = C0013.m105("ۢ۠ۢ");
                    break;
                case 1749731:
                    str18 = "۟ۡۤ";
                    iM731 = C0014.m240(str18);
                    break;
                case 1749732:
                    iM731 = C0013.m114() >= 0 ? C0014.m240("۠ۡۢ") : (C0013.f2 ^ C0015.f6) ^ (-1749672);
                    break;
                case 1749821:
                    if (C0014.f3 - (C0014.f3 - 5694) <= 0) {
                        C0016.f9 = 31;
                        iM731 = C0016.m618("ۦۣۣ");
                    } else {
                        iM731 = (C0016.f9 % C0013.f2) + 1749729;
                    }
                    break;
                case 1749822:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    if (C0015.f6 * C0017.f10 * (-845) >= 0) {
                        C0013.f2 = 96;
                        str4 = "ۥۡ";
                        iM731 = C0016.m618(str4);
                    } else {
                        iM731 = (C0013.f2 ^ C0017.f10) + 56665;
                    }
                    break;
                case 1749854:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0016.m608(f8short, 1522, 5, 371), Integer.valueOf(i));
                    if (C0015.f6 >= 0) {
                        C0017.m717();
                        iM731 = C0017.m731("ۣۤۦ");
                    } else {
                        str9 = "ۡۢۨ";
                        iM731 = C0017.m731(str9);
                    }
                    break;
                case 1749856:
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(i);
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                    } else {
                        iM731 = C0015.m573("ۧ۠ۧ");
                    }
                    break;
                case 1750538:
                    z3 = !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0013.m153(f8short, 1278, 7, 1688), Boolean.valueOf(z3));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0016.m608(f8short, 1285, 9, 1356));
                    str23 = "ۡ۟۠";
                    strM693 = str44;
                    str44 = strM693;
                    z8 = z3;
                    iM731 = C0016.m618(str23);
                    break;
                case 1750569:
                    str16 = "ۣۡۡ";
                    iM731 = C0017.m731(str16);
                    break;
                case 1750571:
                    if (C0013.f2 <= 0) {
                        str33 = "ۧ۠ۡ";
                        iM731 = C0017.m731(str33);
                    } else {
                        C0016.f9 = 84;
                        str36 = "ۣۤۨ";
                        iM731 = C0017.m731(str36);
                    }
                    break;
                case 1750593:
                    strM153 = str43;
                    iM731 = (C0015.f6 | C0016.f9) + 1752735;
                    break;
                case 1750601:
                    if (C0017.f10 < 0) {
                        str32 = "ۢۨۥ";
                        iM731 = C0015.m573(str32);
                    } else {
                        iM731 = (C0013.f2 + C0016.f9) ^ 1748464;
                    }
                    break;
                case 1750627:
                    if ((C0015.f6 ^ (C0017.f10 / 9968)) >= 0) {
                        C0017.f10 = 46;
                        str25 = "ۣۧ";
                        iM731 = C0016.m618(str25);
                    } else {
                        iM731 = (C0014.f3 * C0016.f9) ^ (-1601261);
                    }
                    break;
                case 1750628:
                    if (C0014.f3 % (C0013.f2 | 284) >= 0) {
                        iM731 = C0014.m240("ۧ۠ۡ");
                    } else {
                        str12 = "ۤ۠ۨ";
                        iM731 = C0013.m105(str12);
                    }
                    break;
                case 1750659:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0017.m693(f8short, 1303, 4, 1038), Integer.valueOf(i));
                    if (C0013.m114() >= 0) {
                        C0017.m717();
                        iM731 = C0014.m240("ۦۤۦ");
                    } else {
                        iM731 = C0017.m731("۠ۤ");
                    }
                    break;
                case 1750687:
                    new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, livePlayActivity2, C0016.m608(f8short, 1231, 9, 2125)).show();
                    if ((C0014.f3 ^ (C0013.f2 + 7686)) >= 0) {
                        C0014.f3 = 83;
                        str28 = "۟ۨ";
                        iM731 = C0014.m240(str28);
                    }
                    break;
                case 1750694:
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        str37 = "ۥۣۧ";
                        iM731 = C0013.m105(str37);
                    } else {
                        iM731 = (C0014.f3 - C0016.f9) + 1753604;
                    }
                    break;
                case 1750721:
                    iM731 = C0017.f10 + C0015.f6 + 57755;
                    break;
                case 1750723:
                    if (C0014.m245() >= 0) {
                        iM731 = C0014.m240("ۣۢۧ");
                    } else {
                        str37 = "ۨۢۢ";
                        iM731 = C0013.m105(str37);
                    }
                    break;
                case 1750724:
                    if (C0014.f3 / (C0017.f10 * (-8227)) == 0) {
                        C0014.f3 = 72;
                        iM731 = C0014.m240("۠ۢۦ");
                    } else {
                        iM731 = (C0017.f10 ^ C0017.f10) + 1746937;
                    }
                    break;
                case 1750752:
                    if (C0017.m717() < 0) {
                        C0016.f9 = 82;
                        str6 = "ۧۦۣ";
                        iM731 = C0014.m240(str6);
                    } else {
                        iM731 = (C0013.f2 / C0016.f9) ^ 1752670;
                    }
                    break;
                case 1750756:
                    iM731 = C0013.m105("ۣۣۣ");
                    break;
                case 1750819:
                    iM731 = C0014.f3 + C0015.f6 + 1754398;
                    break;
                case 1751499:
                    new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, livePlayActivity2, C0013.m153(f8short, 1240, 12, 1097)).show();
                    if (C0016.f9 % (C0017.f10 - 6730) <= 0) {
                        C0015.m570();
                        iM731 = C0015.m573("ۣۧۤ");
                    } else {
                        str = "ۧۢ۠";
                        iM731 = C0014.m240(str);
                    }
                    break;
                case 1751556:
                    if (C0013.f2 / (C0015.f6 * (-5467)) == 0) {
                        C0017.m717();
                        str9 = "۟۟ۥ";
                        iM731 = C0017.m731(str9);
                    } else {
                        iM731 = (C0016.f9 % C0017.f10) + 1746919;
                    }
                    break;
                case 1751559:
                    iM731 = (C0017.f10 / C0014.f3) + 56473;
                    break;
                case 1751585:
                    livePlayActivity = livePlayActivity2;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                    httpUrl = httpUrl4;
                    i2 = i3;
                    if ((C0013.f2 ^ (C0015.f6 * 6700)) >= 0) {
                        C0014.f3 = 36;
                        str17 = "ۣۨ";
                        dnsOverHttps2 = dnsOverHttps3;
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = httpUrl;
                        i3 = i2;
                        dnsOverHttps3 = dnsOverHttps2;
                        iM731 = C0015.m573(str17);
                    } else {
                        livePlayActivity2 = livePlayActivity;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        httpUrl4 = httpUrl;
                        i3 = i2;
                        iM731 = (C0013.f2 % C0016.f9) + 1755310;
                    }
                    break;
                case 1751620:
                    if (i == 2) {
                        if ((C0013.f2 ^ (C0013.f2 - 585)) <= 0) {
                            C0013.f2 = 36;
                            iM731 = C0017.m731("۟ۢۧ");
                        } else {
                            iM731 = C0017.m731("ۦۦۢ");
                        }
                    } else if (C0016.f9 <= 0) {
                        C0013.f2 = 54;
                        str16 = "ۢۢۥ";
                        iM731 = C0017.m731(str16);
                    } else {
                        iM731 = (C0015.f6 ^ C0013.f2) ^ (-1751906);
                    }
                    break;
                case 1751622:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0017.m693(f8short, 1652, 12, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED));
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f1590O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    QbSdk.reset(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0016.f9 * (C0016.f9 / 6489) != 0) {
                        C0014.f3 = 7;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        iM731 = C0014.m240("ۢۦ");
                    } else {
                        strM694 = str43;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        str43 = strM694;
                        iM731 = C0015.m573("ۣ۠ۡ");
                    }
                    break;
                case 1751623:
                    iM731 = C0013.m114() >= 0 ? C0017.m731("ۤۢ۠") : (C0014.f3 ^ C0016.f9) ^ (-1747944);
                    break;
                case 1751680:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0013.m153(f8short, 1682, 4, 964), Integer.valueOf(i));
                    if (C0014.f3 + (C0017.f10 / (-6187)) >= 0) {
                        C0017.f10 = 91;
                        str29 = "ۢۤۦ";
                        iM731 = C0015.m573(str29);
                    } else {
                        iM731 = (C0014.f3 * C0016.f9) + 1929461;
                    }
                    break;
                case 1751682:
                    z5 = false;
                    if (C0015.f6 / (C0017.f10 % 8214) != 0) {
                        C0016.f9 = 92;
                        z9 = false;
                        iM731 = C0017.m731("ۡۤۧ");
                    } else {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        z9 = z5;
                        iM731 = C0013.m105("ۦۨ۠");
                    }
                    break;
                case 1751685:
                    this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00, true, false);
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 22;
                        iM731 = C0017.m731("ۣۢۧ");
                    } else {
                        iM731 = (C0014.f3 ^ C0015.f6) + 1751767;
                    }
                    break;
                case 1751741:
                    if (C0015.f6 >= 0) {
                        str20 = "ۢۡۦ";
                        iM731 = C0015.m573(str20);
                    } else {
                        iM731 = C0016.m618("۠ۢۡ");
                    }
                    break;
                case 1751744:
                    iM731 = C0017.m717() < 0 ? C0015.m573("ۣۨ۟") : C0016.m618("ۣ۠");
                    break;
                case 1752461:
                    if ((C0015.f6 ^ (C0014.f3 / 7815)) >= 0) {
                        C0016.m574();
                        iM731 = C0016.m618("ۥۣ۟");
                    } else {
                        iM731 = (C0014.f3 * C0015.f6) + 1615783;
                    }
                    break;
                case 1752462:
                    dnsOverHttps = dnsOverHttps3;
                    dnsOverHttps2 = dnsOverHttps;
                    str17 = "ۧ۟۠";
                    dnsOverHttps3 = dnsOverHttps2;
                    iM731 = C0015.m573(str17);
                    break;
                case 1752486:
                    iM731 = (C0017.f10 * C0015.f6) + 1291792;
                    break;
                case 1752487:
                    if (C0015.f6 >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("۠ۢۧ");
                    } else {
                        str36 = "ۤۦۨ";
                        iM731 = C0017.m731(str36);
                    }
                    break;
                case 1752524:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(str44, Integer.valueOf(i));
                    QbSdk.forceSysWebView();
                    iM731 = (C0017.f10 | C0016.f9) + 1755620;
                    break;
                case 1752555:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 54;
                        str16 = "ۢۢۥ";
                        iM731 = C0017.m731(str16);
                    } else {
                        iM731 = (C0015.f6 ^ C0013.f2) ^ (-1751906);
                    }
                    break;
                case 1752577:
                    if (C0013.f2 <= 0) {
                        C0013.f2 = 17;
                        iM731 = C0016.m618("ۣۢۨ");
                    } else {
                        str40 = "۟ۨ";
                        iM731 = C0016.m618(str40);
                    }
                    break;
                case 1752580:
                    if (i != 0) {
                        if (i == 1) {
                            dnsOverHttps2 = dnsOverHttps3;
                            str17 = "۠ۤۢ";
                            dnsOverHttps3 = dnsOverHttps2;
                            iM731 = C0015.m573(str17);
                        } else if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (C0017.f10 - (C0014.f3 | 8206) >= 0) {
                                        C0017.f10 = 86;
                                        iM731 = C0013.m105("ۧۨۤ");
                                    } else {
                                        iM731 = (C0014.f3 / C0017.f10) + 1755467;
                                    }
                                } else if (C0017.f10 >= 0) {
                                }
                            } else if (C0016.f9 <= 0) {
                                C0013.m114();
                                iM731 = C0015.m573("ۢ۠ۡ");
                            } else {
                                iM731 = (C0014.f3 ^ C0015.f6) ^ 1750057;
                            }
                        } else if (C0016.f9 <= 0) {
                            C0014.f3 = 23;
                            str31 = "۟ۤۢ";
                            iM731 = C0016.m618(str31);
                        } else {
                            iM731 = C0016.m618("ۤ۟ۦ");
                        }
                    } else if ((C0015.f6 ^ (C0017.f10 / 9968)) >= 0) {
                        C0017.f10 = 46;
                        str25 = "ۣۧ";
                        iM731 = C0016.m618(str25);
                    } else {
                        iM731 = (C0014.f3 * C0016.f9) ^ (-1601261);
                    }
                    break;
                case 1752639:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, z12, false);
                    if (C0016.f9 <= 0) {
                        iM731 = C0016.m618("ۣۡۧ");
                    } else {
                        str6 = "ۨۢ";
                        iM731 = C0014.m240(str6);
                    }
                    break;
                case 1752670:
                    dnsOverHttps = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (strM153.isEmpty()) {
                        dnsOverHttps3 = dnsOverHttps;
                        httpUrl6 = httpUrl4;
                        iM731 = (C0015.f6 / C0014.f3) + 56291;
                    } else {
                        dnsOverHttps2 = dnsOverHttps;
                        str17 = "ۧ۟۠";
                        dnsOverHttps3 = dnsOverHttps2;
                        iM731 = C0015.m573(str17);
                    }
                    break;
                case 1752671:
                    strM153 = C0013.m153(f8short, 1376, 28, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                    if (C0017.f10 * (C0015.f6 ^ (-6027)) >= 0) {
                        C0014.m245();
                        iM731 = C0013.m105("ۤ۟ۦ");
                    } else {
                        iM731 = C0014.m240("۠۟۟");
                    }
                    break;
                case 1752704:
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i);
                    if (C0017.m717() >= 0) {
                        C0017.f10 = 45;
                        iM731 = C0013.m105("۟ۥ۠");
                    } else {
                        iM731 = C0017.m731("ۣۢۧ");
                    }
                    break;
                case 1752734:
                    if (C0013.m114() >= 0) {
                        C0016.m574();
                        str22 = "ۡۡۧ";
                        iM731 = C0014.m240(str22);
                    } else {
                        iM731 = (C0013.f2 - C0017.f10) ^ 1753941;
                    }
                    break;
                case 1753453:
                    if (C0016.f9 * (C0015.f6 % 7908) < 0) {
                        iM731 = C0013.m105("ۢۧ۠");
                    } else {
                        str19 = "ۦۤۦ";
                        iM731 = C0013.m105(str19);
                    }
                    break;
                case 1753484:
                    iM731 = (C0013.f2 / C0017.f10) ^ (-1746818);
                    break;
                case 1753544:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 23;
                        str31 = "۟ۤۢ";
                        iM731 = C0016.m618(str31);
                    } else {
                        iM731 = C0016.m618("ۤ۟ۦ");
                    }
                    break;
                case 1753570:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(C0016.m608(f8short, 1298, 5, 1512), Integer.valueOf(i));
                    livePlayActivity2.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3047O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = true;
                    if (C0014.f3 - (C0016.f9 | (-6126)) <= 0) {
                        C0017.m717();
                        str2 = "ۦۨۨ";
                        httpUrl2 = httpUrl6;
                        httpUrl6 = httpUrl2;
                        iM731 = C0014.m240(str2);
                    } else {
                        iM731 = (C0015.f6 - C0017.f10) + 1750479;
                    }
                    break;
                case 1753576:
                    strM153 = C0013.m153(f8short, 1432, 32, 1708);
                    if ((C0016.f9 ^ (C0015.f6 | 8497)) < 0) {
                        str3 = "ۥ۠ۢ";
                        iM731 = C0016.m618(str3);
                    } else {
                        iM731 = C0013.m105("ۢ۠ۢ");
                    }
                    break;
                case 1753601:
                    iM731 = (C0017.f10 - C0017.f10) + 1751680;
                    break;
                case 1753602:
                    strM693 = str44;
                    if (C0016.m574() < 0) {
                        str42 = "ۥۡۨ";
                        str44 = strM693;
                        iM731 = C0013.m105(str42);
                    } else {
                        C0017.f10 = 82;
                        str23 = "ۣۤ۟";
                        z3 = z8;
                        str44 = strM693;
                        z8 = z3;
                        iM731 = C0016.m618(str23);
                    }
                    break;
                case 1753633:
                    if ((C0014.f3 ^ (C0014.f3 ^ 5644)) <= 0) {
                        z8 = z7;
                        iM731 = C0016.m618("ۥۡۤ");
                    } else {
                        str25 = "ۧۧۡ";
                        z8 = z7;
                        iM731 = C0016.m618(str25);
                    }
                    break;
                case 1753639:
                    strM693 = str44;
                    if (C0013.f2 <= 0) {
                        C0013.f2 = 12;
                        str44 = strM693;
                        iM731 = C0015.m573("۠ۧۥ");
                    } else {
                        str37 = "ۦ۠";
                        str44 = strM693;
                        iM731 = C0013.m105(str37);
                    }
                    break;
                case 1753663:
                    dnsOverHttps2 = dnsOverHttps3;
                    str17 = "۠ۤۢ";
                    dnsOverHttps3 = dnsOverHttps2;
                    iM731 = C0015.m573(str17);
                    break;
                case 1753664:
                    if ((C0013.f2 ^ (C0016.f9 % (-5604))) > 0) {
                        C0017.f10 = 10;
                        str19 = "ۥۤۦ";
                        iM731 = C0013.m105(str19);
                    } else {
                        iM731 = (C0015.f6 | C0014.f3) ^ (-56545);
                    }
                    break;
                case 1753671:
                    if (i3 == 6) {
                        iM731 = (C0013.f2 / C0017.f10) ^ (-1746818);
                    } else {
                        str28 = "ۧۡۡ";
                        iM731 = C0014.m240(str28);
                    }
                    break;
                case 1753694:
                    str29 = "ۢۤۡ";
                    z10 = z9;
                    iM731 = C0015.m573(str29);
                    break;
                case 1754375:
                    if (C0016.f9 / (C0014.f3 - 7695) != 0) {
                        C0014.f3 = 8;
                        iM731 = C0013.m105("ۧۦ۟");
                    } else {
                        iM731 = (C0015.f6 % C0017.f10) ^ (-1753001);
                    }
                    break;
                case 1754376:
                    httpUrl3 = HttpUrl.get(strM153);
                    if ((C0013.f2 ^ (C0015.f6 * 6717)) >= 0) {
                        C0014.f3 = 77;
                        httpUrl5 = httpUrl3;
                        iM731 = C0013.m105("۟ۨۡ");
                    } else {
                        str15 = "ۣۡۢ";
                        httpUrl5 = httpUrl3;
                        iM731 = C0016.m618(str15);
                    }
                    break;
                case 1754408:
                    if (i < 2) {
                        if (C0015.f6 >= 0) {
                            C0016.m574();
                            iM731 = C0017.m731("ۨ۟ۢ");
                        } else {
                            str16 = "ۣۡۦ";
                            iM731 = C0017.m731(str16);
                        }
                    } else if (C0014.m245() >= 0) {
                        iM731 = C0014.m240("ۣۢۧ");
                    } else {
                        str37 = "ۨۢۢ";
                        iM731 = C0013.m105(str37);
                    }
                    break;
                case 1754414:
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 89;
                        iM731 = C0013.m105("ۡۢۡ");
                    } else {
                        str39 = "۟ۤ۠";
                        iM731 = C0014.m240(str39);
                    }
                    break;
                case 1754415:
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                z12 = false;
                                if (C0013.f2 + (C0013.f2 * (-4909)) >= 0) {
                                    C0013.f2 = 1;
                                    iM731 = C0014.m240("ۤۥۦ");
                                } else {
                                    iM731 = (C0017.f10 | C0016.f9) + 1755650;
                                }
                            } else {
                                iM731 = C0014.f3 + C0016.f9 + 1755027;
                            }
                        } else if (C0013.m114() >= 0) {
                        }
                    } else if (C0015.f6 < 0) {
                        C0015.f6 = 58;
                        str34 = "ۧۨۦ";
                        strM250 = strM153;
                        strM153 = strM250;
                        iM731 = C0013.m105(str34);
                    } else {
                        str25 = "ۨۡۧ";
                        iM731 = C0016.m618(str25);
                    }
                    break;
                case 1754439:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, true, true);
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("ۢۨۦ");
                    } else {
                        iM731 = (C0013.f2 | C0014.f3) ^ (-1746900);
                    }
                    break;
                case 1754446:
                    if (C0015.f6 < 0) {
                        str25 = "ۨۡۧ";
                        iM731 = C0016.m618(str25);
                    } else {
                        C0015.f6 = 58;
                        str34 = "ۧۨۦ";
                        strM250 = strM153;
                        strM153 = strM250;
                        iM731 = C0013.m105(str34);
                    }
                    break;
                case 1754469:
                    iM731 = C0016.m574() >= 0 ? C0017.m731("ۢۢ۟") : (C0014.f3 ^ C0015.f6) ^ 1755965;
                    break;
                case 1754474:
                    iM731 = (C0016.f9 - C0015.f6) ^ 1745588;
                    break;
                case 1754501:
                    if (C0015.f6 % (C0016.f9 + 5667) < 0) {
                        C0014.f3 = 10;
                        iM731 = C0015.m573("ۤۦۡ");
                    } else {
                        iM731 = (C0014.f3 / C0017.f10) + 1747688;
                    }
                    break;
                case 1754504:
                    switch (i) {
                        case 1:
                            if (C0013.m114() < 0) {
                                iM731 = (C0014.f3 % C0017.f10) ^ (-56553);
                            } else {
                                C0016.f9 = 52;
                                iM731 = C0015.m573("۟ۡۥ");
                            }
                            break;
                        case 2:
                            if (C0016.f9 * (C0015.f6 % 7908) < 0) {
                                str19 = "ۦۤۦ";
                                iM731 = C0013.m105(str19);
                            } else {
                                iM731 = C0013.m105("ۢۧ۠");
                            }
                            break;
                        case 3:
                            if (C0017.m717() < 0) {
                            }
                            break;
                        case 4:
                            if (C0017.m717() < 0) {
                                iM731 = (C0013.f2 / C0016.f9) ^ 1752670;
                            } else {
                                C0016.f9 = 82;
                                str6 = "ۧۦۣ";
                                iM731 = C0014.m240(str6);
                            }
                            break;
                        case 5:
                            if (C0015.f6 % (C0016.f9 + 5667) < 0) {
                                iM731 = (C0014.f3 / C0017.f10) + 1747688;
                            } else {
                                C0014.f3 = 10;
                                iM731 = C0015.m573("ۤۦۡ");
                            }
                            break;
                        case 6:
                            if ((C0013.f2 ^ (C0016.f9 % (-5604))) > 0) {
                                iM731 = (C0015.f6 | C0014.f3) ^ (-56545);
                            } else {
                                C0017.f10 = 10;
                                str19 = "ۥۤۦ";
                                iM731 = C0013.m105(str19);
                            }
                            break;
                        default:
                            if (C0014.m245() < 0) {
                                iM731 = (C0014.f3 ^ C0015.f6) + 1753814;
                            } else {
                                C0015.m570();
                                str12 = "ۣ۠ۧ";
                                iM731 = C0013.m105(str12);
                            }
                            break;
                    }
                    break;
                case 1754508:
                    strM153 = "";
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("۠ۥ۠");
                    } else {
                        str31 = "ۨۤ۠";
                        iM731 = C0016.m618(str31);
                    }
                    break;
                case 1754536:
                    str41 = "ۢۨۦ";
                    iM731 = C0016.m618(str41);
                    break;
                case 1754537:
                    iM731 = (C0017.f10 ^ (C0016.f9 + (-6331))) > 0 ? C0016.m618("۟ۢ۠") : (C0014.f3 | C0016.f9) + 1749879;
                    break;
                case 1754563:
                    if (C0014.f3 * (C0016.f9 % 6050) >= 0) {
                        C0013.f2 = 13;
                        iM731 = C0016.m618("ۢۤۥ");
                    } else {
                        iM731 = (C0014.f3 * C0014.f3) ^ 1704845;
                    }
                    break;
                case 1754592:
                    if (C0014.m245() < 0) {
                        C0015.m570();
                        str12 = "ۣ۠ۧ";
                        iM731 = C0013.m105(str12);
                    } else {
                        iM731 = (C0014.f3 ^ C0015.f6) + 1753814;
                    }
                    break;
                case 1754598:
                    if (C0015.m570() <= 0) {
                        C0017.f10 = 43;
                        iM731 = C0014.m240("ۥۤۢ");
                    } else {
                        iM731 = C0017.m731("ۣۤۥ");
                    }
                    break;
                case 1754625:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, z8, false);
                    if (C0014.f3 >= 0) {
                        C0015.f6 = 82;
                        iM731 = C0014.m240("ۦ۠");
                    } else {
                        str4 = "ۤۡ";
                        iM731 = C0016.m618(str4);
                    }
                    break;
                case 1754630:
                    Hawk.put(C0014.m250(f8short, 1531, 4, 1308), Integer.valueOf(i));
                    if (C0014.f3 >= 0) {
                        iM731 = C0017.m731("ۣۨۨ");
                    } else {
                        str12 = "ۥۡ";
                        iM731 = C0013.m105(str12);
                    }
                    break;
                case 1754632:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0013.m153(f8short, 1578, 15, 1365));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(str44, 0);
                    iM731 = C0014.f3 - (C0017.f10 + 1661) >= 0 ? C0014.m240("ۣۣۢ") : (C0015.f6 ^ C0016.f9) + 1748260;
                    break;
                case 1754663:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, true, true);
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM731 = C0015.m573("ۣۨۤ");
                    } else {
                        iM731 = (C0013.f2 / C0017.f10) ^ (-1746874);
                    }
                    break;
                case 1755343:
                    if (C0016.f9 - (C0017.f10 | 8902) <= 0) {
                        str14 = "ۢ۟ۡ";
                        iM731 = C0016.m618(str14);
                    } else {
                        iM731 = (C0017.f10 % C0014.f3) ^ (-1749837);
                    }
                    break;
                case 1755370:
                    if (C0013.f2 - (C0017.f10 | 8335) <= 0) {
                        str18 = "۠ۢۥ";
                        iM731 = C0014.m240(str18);
                    } else {
                        iM731 = (C0017.f10 / C0017.f10) + 1748677;
                    }
                    break;
                case 1755371:
                    if ((C0014.f3 ^ (C0017.f10 ^ 9642)) <= 0) {
                        C0016.f9 = 19;
                        iM731 = C0016.m618("ۦۡۧ");
                    } else {
                        iM731 = (C0015.f6 * C0016.f9) + 2240520;
                    }
                    break;
                case 1755401:
                    if (i3 >= 3) {
                        str18 = "۟ۡۤ";
                        iM731 = C0014.m240(str18);
                    } else if (C0016.f9 <= 0) {
                        C0013.m114();
                        iM731 = C0016.m618("۟۟");
                    } else {
                        str10 = "۠ۢۢ";
                        iM731 = C0014.m240(str10);
                    }
                    break;
                case 1755403:
                    dnsOverHttps3.setUrl(httpUrl6);
                    if (i <= 0) {
                        iM731 = (C0017.f10 / C0014.f3) + 1751679;
                    } else if (C0016.m574() >= 0) {
                        C0013.f2 = 49;
                        str27 = "ۣۥۣ";
                        z4 = z6;
                        z10 = z4;
                        iM731 = C0013.m105(str27);
                    } else {
                        z10 = z6;
                        iM731 = (C0017.f10 ^ C0017.f10) + 1754474;
                    }
                    break;
                case 1755406:
                    boolean zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    boolean z15 = !zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(C0014.m250(f8short, 1500, 6, 3206), z15);
                    if (zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
                        z = z15;
                        z2 = z15;
                        if (C0014.m245() >= 0) {
                            str26 = "ۣۦۤ";
                            z11 = z;
                            z12 = z2;
                            iM731 = C0013.m105(str26);
                        } else {
                            z11 = z;
                            z12 = z2;
                            iM731 = (C0016.f9 / C0016.f9) + 1752638;
                        }
                    } else {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0013.m153(f8short, 1506, 16, 1960));
                        if (C0013.f2 % (C0015.f6 + 767) <= 0) {
                            C0016.f9 = 66;
                            z11 = z15;
                            z12 = z15;
                            iM731 = C0016.m618("ۡۦۡ");
                        } else {
                            str27 = "۠ۧۦ";
                            z11 = z15;
                            z4 = z10;
                            z12 = z15;
                            z10 = z4;
                            iM731 = C0013.m105(str27);
                        }
                    }
                    break;
                case 1755407:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, C0016.m608(f8short, 1664, 8, 914));
                    if (C0014.m245() >= 0) {
                        C0015.f6 = 71;
                        iM731 = C0014.m240("۠ۤۡ");
                    } else {
                        iM731 = C0015.m573("ۣۣۤ");
                    }
                    break;
                case 1755432:
                    strM693 = C0017.m693(f8short, 1543, 4, 2812);
                    if (i != 0) {
                        if (i == 1) {
                            str44 = strM693;
                            iM731 = C0017.f10 + C0016.f9 + 1748655;
                        } else if (i != 2) {
                            if (C0013.m114() >= 0) {
                                C0014.m245();
                                str44 = strM693;
                                iM731 = C0015.m573("۟ۤۨ");
                            } else {
                                str44 = strM693;
                                iM731 = (C0016.f9 ^ C0015.f6) + 56840;
                            }
                        } else if (C0013.f2 <= 0) {
                            C0013.f2 = 12;
                            str44 = strM693;
                            iM731 = C0015.m573("۠ۧۥ");
                        } else {
                            str37 = "ۦ۠";
                            str44 = strM693;
                            iM731 = C0013.m105(str37);
                        }
                    } else if (C0016.m574() < 0) {
                        C0017.f10 = 82;
                        str23 = "ۣۤ۟";
                        z3 = z8;
                        str44 = strM693;
                        z8 = z3;
                        iM731 = C0016.m618(str23);
                    } else {
                        str42 = "ۥۡۨ";
                        str44 = strM693;
                        iM731 = C0013.m105(str42);
                    }
                    break;
                case 1755434:
                    if (C0015.f6 >= 0) {
                        C0016.m574();
                        iM731 = C0013.m105("ۨۡۤ");
                    } else {
                        iM731 = (C0015.f6 / C0014.f3) ^ 1748700;
                    }
                    break;
                case 1755437:
                    if (C0017.f10 * (C0014.f3 ^ 3594) <= 0) {
                        C0013.f2 = 69;
                        str15 = "ۥۥ۟";
                        httpUrl3 = httpUrl5;
                        httpUrl5 = httpUrl3;
                        iM731 = C0016.m618(str15);
                    } else {
                        iM731 = (C0015.f6 ^ C0015.f6) + 1748704;
                    }
                    break;
                case 1755467:
                    str22 = "ۣۡۤ";
                    iM731 = C0014.m240(str22);
                    break;
                case 1755492:
                    if (C0017.f10 - (C0013.f2 ^ (-3796)) <= 0) {
                        C0014.m245();
                        iM731 = C0015.m573("ۣۣۤ");
                    } else {
                        iM731 = C0015.m573("ۣۧۨ");
                    }
                    break;
                case 1755495:
                    iM731 = (C0017.f10 / C0014.f3) + 1751679;
                    break;
                case 1755522:
                    new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, livePlayActivity2, C0016.m608(f8short, 1263, 15, 1332)).show();
                    if (C0014.f3 >= 0) {
                        C0013.m114();
                        iM731 = C0015.m573("ۧ۟۠");
                    } else {
                        iM731 = C0017.m731("ۧ۟۟");
                    }
                    break;
                case 1755526:
                    if (C0014.f3 + (C0016.f9 * (-3072)) >= 0) {
                        C0015.f6 = 51;
                        iM731 = C0014.m240("ۣۨۨ");
                    } else {
                        str5 = "ۣۤۤ";
                        iM731 = C0016.m618(str5);
                    }
                    break;
                case 1755528:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 73;
                        str11 = "۠ۧۦ";
                        iM731 = C0015.m573(str11);
                    } else {
                        iM731 = (C0015.f6 * C0016.f9) + 2243370;
                    }
                    break;
                case 1755593:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1589O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (QbSdk.getTbsVersion(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1590O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) > 0) {
                        if (C0017.f10 >= 0) {
                            z5 = z9;
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                            z9 = z5;
                            iM731 = C0013.m105("ۦۨ۠");
                        } else {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                            iM731 = C0017.m731("۠ۧ۟");
                        }
                    } else if (C0014.f3 / (C0015.f6 ^ (-190)) != 0) {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        iM731 = C0014.m240("ۣۧۧ");
                    } else {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        iM731 = (C0017.f10 * C0013.f2) + 2428926;
                    }
                    break;
                case 1755619:
                    iM731 = C0016.f9 <= 0 ? C0015.m573("ۣۤۢ") : (C0013.f2 | C0013.f2) + 1753605;
                    break;
                case 1755621:
                    boolean z16 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1484O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    String strM155 = C0013.m153(f8short, 1489, 4, 1948);
                    z12 = !((Boolean) Hawk.get(strM155, Boolean.valueOf(z16))).booleanValue();
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strM155, z12);
                    iM731 = C0015.m573("ۣۨۨ");
                    break;
                case 1755623:
                    videoView2.setRenderViewFactory(renderViewFactoryCreate);
                    videoView2.initRenderView();
                    livePlayActivity2.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    str7 = "ۨۢۤ";
                    iM731 = C0017.m731(str7);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x014b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        ArrayList arrayList;
        String str;
        int i;
        String str2;
        Object obj;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        String str8;
        int iM618 = C0016.m618("ۣۣۣ");
        O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = null;
        ArrayList arrayList2 = null;
        CustomRecyclerView customRecyclerView = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch (iM618) {
                case 56446:
                    if (C0015.f6 * (C0015.f6 ^ (-4623)) >= 0) {
                        str3 = "۟ۢۢ";
                        iM618 = C0017.m731(str3);
                    } else {
                        iM618 = (C0013.f2 / C0013.f2) + 1749632;
                    }
                    break;
                case 56450:
                case 1751775:
                    break;
                case 1746783:
                    if (C0017.f10 / (C0017.f10 * 3792) != 0) {
                        C0013.m114();
                        str = "ۣۦ۟";
                    } else {
                        str = "ۣۣۣ";
                    }
                    iM618 = C0016.m618(str);
                    break;
                case 1746975:
                    if (C0016.f9 + (C0016.f9 - 2517) >= 0) {
                        C0016.m574();
                        iM618 = C0014.m240("ۣۣۨ");
                    } else {
                        str5 = "ۤۦ";
                        iM618 = C0013.m105(str5);
                    }
                    break;
                case 1747773:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM618 = C0017.m731("ۦۢۧ");
                        i4 = i3;
                    } else {
                        i = i3;
                        obj = "ۤۢ";
                        i2 = i;
                        iM618 = C0016.m618(obj);
                        i4 = i2;
                    }
                    break;
                case 1747867:
                    break;
                case 1748739:
                    customRecyclerView.setSelection(i4);
                    if (C0014.m245() < 0) {
                        str2 = "۟ۨۨ";
                        iM618 = C0015.m573(str2);
                    } else {
                        C0015.f6 = 31;
                        str8 = "ۥ۠ۨ";
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001;
                        iM618 = C0016.m618(str8);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    }
                    break;
                case 1748826:
                    if (o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3147O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 1) {
                        iM618 = C0014.f3 + C0017.f10 + 1755628;
                    } else if (C0016.f9 <= 0) {
                        C0016.m574();
                        str2 = "ۦۡۤ";
                        iM618 = C0015.m573(str2);
                    } else {
                        iM618 = (C0013.f2 * C0016.f9) ^ 1156704;
                    }
                    break;
                case 1749633:
                case 1750664:
                    if (C0015.m570() > 0) {
                        str4 = "ۦۧۢ";
                        iM618 = C0016.m618(str4);
                    } else {
                        C0013.f2 = 45;
                        str5 = "ۦ۟ۢ";
                        iM618 = C0013.m105(str5);
                    }
                    break;
                case 1749727:
                    obj = "ۣۣۡ";
                    i2 = i4;
                    iM618 = C0016.m618(obj);
                    i4 = i2;
                    break;
                case 1750570:
                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3142O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    if ((C0014.f3 | (C0013.f2 * 8289)) >= 0) {
                        C0017.f10 = 65;
                        str6 = "۟ۨۨ";
                        iM618 = C0014.m240(str6);
                    } else {
                        iM618 = C0017.m731("ۣۣۤ");
                    }
                    break;
                case 1750597:
                    if (C0017.f10 >= 0) {
                        iM618 = C0013.m105("ۧۨ۠");
                        i4 = 0;
                    } else {
                        iM618 = (C0016.f9 % C0016.f9) + 1753665;
                        i4 = 0;
                    }
                    break;
                case 1750659:
                    if (this.f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != null) {
                        if ((C0013.f2 | (C0013.f2 ^ (-4764))) >= 0) {
                            C0013.f2 = 42;
                            str4 = "ۨۨۢ";
                            iM618 = C0016.m618(str4);
                        } else {
                            iM618 = (C0014.f3 ^ C0014.f3) + 1752493;
                        }
                    } else if (C0014.f3 * (C0016.f9 | 727) < 0) {
                        str = "ۥۤ۠";
                        iM618 = C0016.m618(str);
                    } else {
                        C0015.f6 = 50;
                        iM618 = C0017.m731("ۤۤۨ");
                    }
                    break;
                case 1750661:
                    if ((C0013.f2 | (C0013.f2 ^ (-4764))) >= 0) {
                        C0013.f2 = 42;
                        str4 = "ۨۨۢ";
                        iM618 = C0016.m618(str4);
                    } else {
                        iM618 = (C0014.f3 ^ C0014.f3) + 1752493;
                    }
                    break;
                case 1750687:
                    if (customRecyclerView != null) {
                        if (C0016.m574() < 0) {
                            str6 = "ۥۢۢ";
                            iM618 = C0014.m240(str6);
                        } else {
                            str7 = "ۤۡۡ";
                            iM618 = C0013.m105(str7);
                        }
                    }
                    break;
                case 1751556:
                    i3 = i4 + 1;
                    iM618 = (C0017.f10 ^ C0013.f2) ^ (-1747533);
                    break;
                case 1751620:
                    customRecyclerView = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3148O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    if (C0016.f9 - (C0017.f10 / 6660) <= 0) {
                        C0015.f6 = 28;
                        iM618 = C0014.m240("ۦ۟ۦ");
                    } else {
                        arrayList = arrayList2;
                        iM618 = C0017.m731("ۣۤ۠");
                        arrayList2 = arrayList;
                    }
                    break;
                case 1751656:
                    customRecyclerView.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i4);
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM618 = C0013.m105("ۧۡۡ");
                    } else {
                        iM618 = (C0014.f3 - C0016.f9) ^ (-1748221);
                    }
                    break;
                case 1751684:
                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = this.f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                    str8 = "ۡۦ۟";
                    iM618 = C0016.m618(str8);
                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    break;
                case 1752493:
                    this.f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.show();
                    if (C0016.m574() < 0) {
                        str3 = "ۤۥۥ";
                        iM618 = C0017.m731(str3);
                    } else {
                        C0016.f9 = 22;
                        i = i4;
                        obj = "ۤۢ";
                        i2 = i;
                        iM618 = C0016.m618(obj);
                        i4 = i2;
                    }
                    break;
                case 1752549:
                    arrayList = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3144O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (C0013.f2 + (C0017.f10 % (-8943)) <= 0) {
                        iM618 = C0017.m731("ۣۤ۠");
                        arrayList2 = arrayList;
                    } else {
                        iM618 = (-1753470) ^ (C0014.f3 | C0016.f9);
                        arrayList2 = arrayList;
                    }
                    break;
                case 1752609:
                    this.f3280O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0014.f3 + C0013.f2 + 4491 <= 0) {
                        C0016.f9 = 29;
                        iM618 = C0015.m573("ۥۢۢ");
                    } else {
                        str8 = "ۥ۠ۨ";
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001;
                        iM618 = C0016.m618(str8);
                        o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001 = o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    }
                    break;
                case 1753421:
                    if (C0016.f9 <= 0) {
                        C0016.m574();
                        str2 = "ۦۡۤ";
                        iM618 = C0015.m573(str2);
                    } else {
                        iM618 = (C0013.f2 * C0016.f9) ^ 1156704;
                    }
                    break;
                case 1753515:
                    iM618 = arrayList2.isEmpty() ? (C0013.f2 + C0016.f9) ^ 1748278 : C0015.m570() <= 0 ? C0017.m731("ۥۤ۠") : (C0013.f2 % C0017.f10) + 1749585;
                    break;
                case 1753665:
                    if (i4 < arrayList2.size()) {
                        if (C0015.m570() <= 0) {
                            iM618 = C0013.m105("ۣۣۡ");
                        } else {
                            str6 = "ۨۦۨ";
                            iM618 = C0014.m240(str6);
                        }
                    }
                    break;
                case 1754439:
                    if (C0016.f9 * (C0016.f9 | (-6344)) >= 0) {
                        C0015.f6 = 51;
                        iM618 = C0016.m618("ۤۤۢ");
                    } else {
                        iM618 = (C0017.f10 | C0014.f3) + 1751769;
                    }
                    break;
                case 1754655:
                    o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o001.f3141O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    if (C0013.f2 / (C0016.f9 ^ 4757) != 0) {
                        C0015.f6 = 84;
                        iM618 = C0014.m240("ۡۦ۟");
                    } else {
                        str7 = "ۣ۠ۧ";
                        iM618 = C0013.m105(str7);
                    }
                    break;
                case 1755562:
                    if (((AddressItem) arrayList2.get(i4)).isSelected()) {
                        if (C0014.f3 + (C0014.f3 % (-9931)) >= 0) {
                            C0015.m570();
                            iM618 = C0015.m573("ۤۦ");
                        } else {
                            iM618 = C0017.m731("ۤۤۨ");
                        }
                    } else if (C0016.f9 * (C0016.f9 | (-6344)) >= 0) {
                        C0015.f6 = 51;
                        iM618 = C0016.m618("ۤۤۢ");
                    } else {
                        iM618 = (C0017.f10 | C0014.f3) + 1751769;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0460  */
    /* JADX WARN: Code duplicated, block: B:107:0x0469  */
    /* JADX WARN: Code duplicated, block: B:185:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0024. Please report as an issue. */
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        WifiInfo connectionInfo;
        TextView textView;
        StringBuilder sb;
        TextView textView2;
        LivePlayActivity livePlayActivity;
        TextView textView3;
        String str;
        String str2;
        TextView textView4;
        String str3;
        String str4;
        StringBuilder sb2;
        TextView textView5;
        String str5;
        String str6;
        String str7;
        String str8;
        LivePlayActivity livePlayActivity2 = null;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        TextView textView6 = null;
        StringBuilder sb3 = null;
        TextView textView7 = null;
        StringBuilder sb4 = null;
        TextView textView8 = null;
        TextView textView9 = null;
        StringBuilder sb5 = null;
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        WifiInfo wifiInfo = null;
        String ssid = null;
        String strM608 = null;
        String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        TextView textView10 = null;
        TextView textView11 = null;
        StringBuilder sb6 = null;
        int iM731 = C0017.m731("ۦۥۤ");
        String str9 = null;
        TextView textView12 = null;
        while (true) {
            switch (iM731) {
                case 56293:
                    textView11.setText(sb6.toString());
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.show();
                    iM731 = C0013.m105((C0017.f10 ^ (C0014.f3 + (-1297))) <= 0 ? "۠ۧ۟" : "ۤۨۥ");
                    break;
                case 56322:
                    iM731 = C0017.m717() >= 0 ? C0013.m105("ۦۦۥ") : (C0015.f6 | C0017.f10) + 1749282;
                    break;
                case 56477:
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) livePlayActivity2.getSystemService(C0013.m153(f8short, 1770, 12, 1483))).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        if ((C0016.f9 | (C0013.f2 ^ (-5513))) >= 0) {
                            C0015.m570();
                            iM731 = C0015.m573("ۦۧۤ");
                        } else {
                            iM731 = (C0016.f9 % C0013.f2) ^ 1754784;
                        }
                    } else if (C0016.m574() >= 0) {
                        C0016.m574();
                        str = "ۤۨۥ";
                        iM731 = C0013.m105(str);
                    } else {
                        iM731 = (C0013.f2 - C0016.f9) + 1747777;
                    }
                    break;
                case 56569:
                    sb4.append(Build.VERSION.SDK_INT);
                    textView7.setText(sb4.toString());
                    TextView textView13 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_System_version);
                    if (C0014.f3 - (C0014.f3 ^ 9479) <= 0) {
                        C0016.f9 = 70;
                        textView8 = textView13;
                        iM731 = C0015.m573("ۡ۠۟");
                    } else {
                        textView = textView13;
                        str8 = "ۤۧۧ";
                        textView8 = textView;
                        iM731 = C0014.m240(str8);
                    }
                    break;
                case 1746688:
                    if ((C0016.f9 | (C0013.f2 ^ (-5513))) >= 0) {
                        C0015.m570();
                        iM731 = C0015.m573("ۦۧۤ");
                    } else {
                        iM731 = (C0016.f9 % C0013.f2) ^ 1754784;
                    }
                    break;
                case 1746691:
                case 1754568:
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 65;
                        str4 = "ۢۥۧ";
                        sb2 = sb4;
                        textView5 = textView7;
                        iM731 = C0016.m618(str4);
                        sb4 = sb2;
                        textView7 = textView5;
                    } else {
                        iM731 = (C0016.f9 ^ C0015.f6) + 1752047;
                    }
                    break;
                case 1746940:
                    strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 1, ssid);
                    sb = sb6;
                    textView2 = textView11;
                    str5 = "ۣ۠ۤ";
                    sb6 = sb;
                    textView11 = textView2;
                    iM731 = C0017.m731(str5);
                    break;
                case 1747777:
                    if (C0016.f9 % (C0017.f10 ^ (-3783)) <= 0) {
                        C0015.m570();
                        iM731 = C0014.m240("ۥۧۥ");
                    } else {
                        iM731 = (C0013.f2 ^ C0017.f10) + 1751002;
                    }
                    break;
                case 1747866:
                    iM731 = C0013.f2 + C0013.f2 + 1751805;
                    break;
                case 1747868:
                    textView10.setText(C0014.m250(f8short, 1782, 9, 2851));
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        iM731 = C0013.m105("ۣۧۥ");
                    } else {
                        iM731 = (C0013.f2 | C0017.f10) + 1748045;
                    }
                    break;
                case 1747896:
                    textView6.setText(sb3.toString());
                    textView5 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_SDK_version);
                    sb2 = new StringBuilder(C0016.m608(f8short, 1708, 8, 2456));
                    str4 = "ۨۡ";
                    iM731 = C0016.m618(str4);
                    sb4 = sb2;
                    textView7 = textView5;
                    break;
                case 1747931:
                    iM731 = C0016.f9 <= 0 ? C0015.m573("ۤۦۧ") : (C0014.f3 % C0013.f2) + 1754783;
                    break;
                case 1748640:
                case 1750632:
                case 1754662:
                    iM731 = (C0013.f2 * C0014.f3) + 1943075;
                    break;
                case 1748673:
                    strM608 = C0016.m608(f8short, 1764, 6, 2317);
                    iM731 = C0015.f6 >= 0 ? C0013.m105("ۣ۟۠") : (C0017.f10 * C0016.f9) ^ (-1284443);
                    break;
                case 1748895:
                    TextView textView14 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_Network_name);
                    sb5 = new StringBuilder(C0014.m250(f8short, 1730, 7, 2777));
                    strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(livePlayActivity2);
                    if ((C0017.f10 ^ (C0017.f10 * 2484)) <= 0) {
                        livePlayActivity = livePlayActivity2;
                        textView3 = textView14;
                        str2 = "ۢۢۡ";
                        livePlayActivity2 = livePlayActivity;
                        textView9 = textView3;
                        textView4 = textView10;
                        textView10 = textView4;
                        iM731 = C0017.m731(str2);
                    } else {
                        textView9 = textView14;
                        iM731 = (C0013.f2 / C0014.f3) + 1753643;
                    }
                    break;
                case 1749575:
                    sb5.append(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    textView9.setText(sb5.toString());
                    textView4 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_Network_status);
                    str2 = "ۥۢ";
                    textView10 = textView4;
                    iM731 = C0017.m731(str2);
                    break;
                case 1749665:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setCanceledOnTouchOutside(true);
                    ((TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_title)).setText(C0016.m608(f8short, 1690, 4, 2717));
                    textView12 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_Brand);
                    iM731 = C0015.f6 + C0017.f10 + 1754012;
                    break;
                case 1749795:
                    if (ssid.equals(C0017.m693(f8short, 1745, 14, 1824))) {
                        connectionInfo = wifiInfo;
                        if ((C0017.f10 | (C0017.f10 + 2649)) >= 0) {
                            C0016.f9 = 13;
                            str3 = "ۧۧۦ";
                            wifiInfo = connectionInfo;
                        } else {
                            str3 = "ۥۤۡ";
                            wifiInfo = connectionInfo;
                        }
                        iM731 = C0017.m731(str3);
                    } else {
                        String strM693 = C0017.m693(f8short, 1759, 1, 1102);
                        if (C0016.f9 <= 0) {
                            str9 = strM693;
                            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ssid;
                            iM731 = C0017.m731("ۦۨۦ");
                        } else {
                            str9 = strM693;
                            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ssid;
                            iM731 = (C0015.f6 ^ C0013.f2) + 1753192;
                        }
                    }
                    break;
                case 1750532:
                    iM731 = (C0014.f3 / C0017.f10) + 1754662;
                    break;
                case 1751717:
                    textView2 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_IP_address);
                    sb = new StringBuilder(C0014.m250(f8short, 1801, 11, 2511));
                    sb.append(O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(livePlayActivity2));
                    if ((C0017.f10 ^ (C0016.f9 / (-1756))) >= 0) {
                        C0017.m717();
                        str5 = "ۣ۠ۤ";
                        sb6 = sb;
                        textView11 = textView2;
                        iM731 = C0017.m731(str5);
                    } else {
                        iM731 = (C0015.f6 / C0014.f3) + 56291;
                        sb6 = sb;
                        textView11 = textView2;
                    }
                    break;
                case 1751748:
                    textView8.setText(C0014.m250(f8short, 1716, 7, 501) + Build.VERSION.RELEASE);
                    if (C0015.f6 >= 0) {
                        C0015.f6 = 77;
                        iM731 = C0014.m240("۠ۦ۠");
                    } else {
                        iM731 = (C0015.f6 - C0016.f9) + 1755860;
                    }
                    break;
                case 1751772:
                    connectionInfo = wifiInfo;
                    if ((C0017.f10 | (C0017.f10 + 2649)) >= 0) {
                        C0016.f9 = 13;
                        str3 = "ۧۧۦ";
                        wifiInfo = connectionInfo;
                    } else {
                        str3 = "ۥۤۡ";
                        wifiInfo = connectionInfo;
                    }
                    iM731 = C0017.m731(str3);
                    break;
                case 1751777:
                    break;
                case 1752610:
                    strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = C0016.m608(f8short, 1760, 4, 3186);
                    iM731 = (C0015.f6 - C0014.f3) + 1750926;
                    break;
                case 1752645:
                    textView12.setText(C0013.m153(f8short, 1694, 7, 2060) + Build.BRAND);
                    str8 = "ۨۢۨ";
                    iM731 = C0014.m240(str8);
                    break;
                case 1752707:
                    if (ssid.startsWith(str9)) {
                        if (ssid.endsWith(str9)) {
                            str6 = "۟ۧۤ";
                            str7 = ssid;
                            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str7;
                            iM731 = C0013.m105(str6);
                        } else {
                            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ssid;
                        }
                        break;
                    }
                    iM731 = (C0013.f2 * C0014.f3) + 1943075;
                    break;
                case 1753605:
                    LivePlayActivity livePlayActivity3 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(livePlayActivity3);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setContentView(R.layout.dialog_system_information);
                    if (C0016.f9 <= 0) {
                        C0016.m574();
                        livePlayActivity2 = livePlayActivity3;
                        iM731 = C0017.m731("ۣ۠ۨ");
                    } else {
                        livePlayActivity = livePlayActivity3;
                        textView3 = textView9;
                        str2 = "ۢۢۡ";
                        livePlayActivity2 = livePlayActivity;
                        textView9 = textView3;
                        textView4 = textView10;
                        textView10 = textView4;
                        iM731 = C0017.m731(str2);
                    }
                    break;
                case 1753639:
                    if (C0013.m153(f8short, 1737, 4, 2634).equals(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                        connectionInfo = ((WifiManager) livePlayActivity2.getApplicationContext().getSystemService(C0016.m608(f8short, 1741, 4, 2326))).getConnectionInfo();
                        if (connectionInfo == null) {
                            if ((C0017.f10 | (C0017.f10 + 2649)) >= 0) {
                                C0016.f9 = 13;
                                str3 = "ۧۧۦ";
                                wifiInfo = connectionInfo;
                            } else {
                                str3 = "ۥۤۡ";
                                wifiInfo = connectionInfo;
                            }
                            iM731 = C0017.m731(str3);
                        } else if ((C0014.f3 ^ (C0013.f2 * 7981)) >= 0) {
                            C0013.f2 = 89;
                            textView = textView8;
                            wifiInfo = connectionInfo;
                            str8 = "ۤۧۧ";
                            textView8 = textView;
                            iM731 = C0014.m240(str8);
                        } else {
                            wifiInfo = connectionInfo;
                            iM731 = 1753792 ^ (C0016.f9 % C0014.f3);
                        }
                    } else if (C0017.m717() >= 0) {
                    }
                    break;
                case 1753663:
                    if (C0013.f2 - (C0014.f3 | 4718) > 0) {
                        str5 = "ۢ۟ۤ";
                        strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = strM608;
                        iM731 = C0017.m731(str5);
                    } else {
                        str6 = "ۣ۟۟";
                        str7 = strM608;
                        strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str7;
                        iM731 = C0013.m105(str6);
                    }
                    break;
                case 1753700:
                    ssid = wifiInfo.getSSID();
                    if (ssid == null || ssid.isEmpty()) {
                        connectionInfo = wifiInfo;
                        if ((C0017.f10 | (C0017.f10 + 2649)) >= 0) {
                            C0016.f9 = 13;
                            str3 = "ۧۧۦ";
                            wifiInfo = connectionInfo;
                        } else {
                            str3 = "ۥۤۡ";
                            wifiInfo = connectionInfo;
                        }
                        iM731 = C0017.m731(str3);
                    } else {
                        iM731 = (C0014.f3 | C0015.f6) + 1749860;
                    }
                    break;
                case 1754442:
                    ((TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_Network_type)).setText(C0016.m608(f8short, 1723, 7, 2148).concat(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(livePlayActivity2)));
                    iM731 = C0017.m731("ۡۨۦ");
                    break;
                case 1754505:
                    textView10.setText(C0014.m250(f8short, 1791, 10, 766));
                    if (C0016.f9 + (C0014.f3 / (-6100)) <= 0) {
                        C0016.f9 = 17;
                        iM731 = C0013.m105("۠ۦۢ");
                    } else {
                        str = "ۤۦۧ";
                        iM731 = C0013.m105(str);
                    }
                    break;
                case 1755438:
                    TextView textView15 = (TextView) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.findViewById(R.id.about_Models);
                    sb3 = new StringBuilder(C0017.m693(f8short, 1701, 7, 1831));
                    sb3.append(Build.MODEL);
                    if (C0015.m570() <= 0) {
                        C0015.f6 = 55;
                        textView6 = textView15;
                        iM731 = C0017.m731("ۦۥۤ");
                    } else {
                        str3 = "۠ۧ۟";
                        textView6 = textView15;
                        iM731 = C0017.m731(str3);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01da A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        int iM105 = C0013.m105("ۥۧۢ");
        ArrayList arrayList2 = null;
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = null;
        Iterator it = null;
        while (true) {
            switch (iM105) {
                case 56452:
                    if (it.hasNext()) {
                        if (C0013.m114() >= 0) {
                            C0014.m245();
                            iM105 = C0017.m731("۟۠ۢ");
                        } else {
                            iM105 = C0014.m240("ۨۤۧ");
                        }
                    } else if ((C0013.f2 ^ (C0014.f3 % (-8149))) >= 0) {
                        C0015.f6 = 38;
                        iM105 = C0016.m618("ۣۢۨ");
                    } else {
                        str4 = "۠ۤ۟";
                        iM105 = C0017.m731(str4);
                    }
                    break;
                case 56483:
                    arrayList2.clear();
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 75;
                        str3 = "ۤۨ";
                    } else {
                        str3 = "ۡ۠۠";
                    }
                    iM105 = C0013.m105(str3);
                    break;
                case 1746692:
                    this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2;
                    iM105 = C0013.m105("ۦۦۨ");
                    o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                    break;
                case 1746695:
                    o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    iM105 = C0017.f10 * (C0014.f3 * (-9480)) >= 0 ? C0014.m240("ۤۥۥ") : C0016.m618("ۡ۠۟");
                    break;
                case 1746721:
                    if (C0014.f3 * (C0015.f6 ^ 4145) <= 0) {
                        C0017.f10 = 50;
                        iM105 = C0013.m105("ۨۤۥ");
                    } else {
                        iM105 = C0015.m573("ۡ۠۟");
                    }
                    break;
                case 1746723:
                    if (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3116O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 4) {
                        iM105 = C0015.f6 >= 0 ? C0015.m573("۟۟ۧ") : (C0016.f9 * C0017.f10) + 2362114;
                    } else if (C0014.f3 * (C0015.f6 ^ 4145) <= 0) {
                        C0017.f10 = 50;
                        iM105 = C0013.m105("ۨۤۥ");
                    } else {
                        iM105 = C0015.m573("ۡ۠۟");
                    }
                    break;
                case 1747685:
                    if ((C0015.f6 | (C0014.f3 - 3611)) >= 0) {
                        C0014.m245();
                        str2 = "ۡۤۢ";
                        iM105 = C0013.m105(str2);
                    } else {
                        iM105 = C0017.f10 + C0014.f3 + 1754613;
                    }
                    break;
                case 1747803:
                    this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.show();
                    if (C0015.f6 / (C0016.f9 * 6928) != 0) {
                        C0017.f10 = 6;
                        iM105 = C0015.m573("ۡ۠۠");
                    } else {
                        iM105 = (C0013.f2 * C0014.f3) ^ (-1591839);
                    }
                    break;
                case 1748640:
                    break;
                case 1748641:
                    it = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
                    if (C0016.f9 - (C0013.f2 ^ 3505) >= 0) {
                        iM105 = C0015.m573("ۤ۟۠");
                    } else {
                        str = "ۤۨ";
                        arrayList = arrayList2;
                        iM105 = C0013.m105(str);
                        arrayList2 = arrayList;
                    }
                    break;
                case 1748831:
                    if (C0016.m574() >= 0) {
                        C0016.f9 = 67;
                        iM105 = C0014.m240("ۥۧۢ");
                    } else {
                        iM105 = (C0015.f6 / C0015.f6) ^ 1751591;
                    }
                    break;
                case 1748892:
                    o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    iM105 = (C0013.f2 / C0017.f10) ^ (-1746696);
                    break;
                case 1751493:
                    o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    if (C0014.f3 >= 0) {
                        C0013.f2 = 16;
                        iM105 = C0013.m105("ۦۦۨ");
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                    } else {
                        iM105 = (C0014.f3 / C0016.f9) ^ 1746723;
                        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                    }
                    break;
                case 1751590:
                case 1754624:
                    if ((C0013.f2 ^ (C0016.f9 + 5850)) > 0) {
                        str2 = "ۤۨ";
                        iM105 = C0013.m105(str2);
                    } else {
                        C0014.f3 = 79;
                        str4 = "ۡۢۡ";
                        iM105 = C0017.m731(str4);
                    }
                    break;
                case 1751684:
                    iM105 = (C0013.f2 / C0013.f2) ^ 1752705;
                    break;
                case 1752704:
                    if (this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == null) {
                        if (C0017.f10 >= 0) {
                            C0013.m114();
                            iM105 = C0015.m573("ۡۦۤ");
                        } else {
                            str2 = "۟۟ۤ";
                            iM105 = C0013.m105(str2);
                        }
                    } else if ((C0015.f6 | (C0014.f3 - 3611)) >= 0) {
                        C0014.m245();
                        str2 = "ۡۤۢ";
                        iM105 = C0013.m105(str2);
                    } else {
                        iM105 = C0017.f10 + C0014.f3 + 1754613;
                    }
                    break;
                case 1753640:
                    arrayList = this.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3114O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (C0016.m574() >= 0) {
                        str = "ۡ۠۟";
                        iM105 = C0013.m105(str);
                        arrayList2 = arrayList;
                    } else {
                        iM105 = 56574 + (C0016.f9 - C0013.f2);
                        arrayList2 = arrayList;
                    }
                    break;
                case 1754476:
                    if ((C0013.f2 ^ (C0014.f3 % (-8149))) >= 0) {
                        C0015.f6 = 38;
                        iM105 = C0016.m618("ۣۢۨ");
                    } else {
                        str4 = "۠ۤ۟";
                        iM105 = C0017.m731(str4);
                    }
                    break;
                case 1755499:
                    arrayList2.addAll(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) it.next()).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (C0016.f9 - (C0016.f9 * (-9762)) <= 0) {
                        iM105 = C0013.m105("۟۟ۤ");
                    } else {
                        str = "ۡۦۤ";
                        arrayList = arrayList2;
                        iM105 = C0013.m105(str);
                        arrayList2 = arrayList;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        int iIndexOf;
        String str;
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        int i = 0;
        int iM240 = C0014.m240("ۨۨ");
        CustomRecyclerView customRecyclerView = null;
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = null;
        ArrayList arrayList2 = null;
        while (true) {
            switch (iM240) {
                case 56381:
                    arrayList = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3156O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    str3 = "ۧ۠ۧ";
                    iM240 = C0017.m731(str3);
                    arrayList2 = arrayList;
                    break;
                case 56576:
                    if (this.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
                        iM240 = (C0017.f10 ^ (C0017.f10 / 2592)) >= 0 ? C0016.m618("ۣۨۨ") : C0016.m618("۟ۢۦ");
                    } else if (C0017.f10 >= 0) {
                        C0014.f3 = 6;
                        iM240 = C0017.m731("ۤۨ۟");
                    } else {
                        iIndexOf = i;
                        iM240 = C0015.m573("ۦ۟ۡ");
                        i = iIndexOf;
                    }
                    break;
                case 1746787:
                    this.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.show();
                    iM240 = (C0016.f9 / C0015.f6) + 1752741;
                    break;
                case 1746942:
                    CustomRecyclerView customRecyclerView2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3157O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    iM240 = (C0016.f9 * C0014.f3) + 1927353;
                    customRecyclerView = customRecyclerView2;
                    break;
                case 1750686:
                    if ((C0017.f10 ^ (C0017.f10 / 2592)) >= 0) {
                    }
                    break;
                case 1750783:
                    customRecyclerView.setSelection(i);
                    if (C0015.f6 - (C0015.f6 - 7449) <= 0) {
                        C0017.m717();
                        str = "ۤۡۢ";
                        iM240 = C0013.m105(str);
                    } else {
                        iM240 = (C0015.f6 | C0013.f2) ^ (-1755438);
                    }
                    break;
                case 1751557:
                    if (C0014.f3 + (C0015.f6 % (-661)) >= 0) {
                        C0016.f9 = 30;
                        iM240 = C0017.m731("ۣۧۨ");
                    } else {
                        iM240 = (C0013.f2 | C0014.f3) ^ (-56659);
                    }
                    break;
                case 1751771:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if (C0016.f9 - (C0013.f2 - 1276) <= 0) {
                        C0014.f3 = 84;
                        iM240 = C0013.m105("۟ۢۦ");
                    } else {
                        iM240 = C0013.m105("ۧۦۨ");
                    }
                    break;
                case 1752672:
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    iM240 = (C0015.f6 ^ C0015.f6) + 1754656;
                    break;
                case 1752740:
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                    if (C0015.f6 / (C0016.f9 | 9190) != 0) {
                        C0015.f6 = 7;
                        iM240 = C0015.m573("۟ۧۦ");
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    } else {
                        str2 = "ۨۨۨ";
                        iM240 = C0016.m618(str2);
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    }
                    break;
                case 1753416:
                    this.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    iM240 = C0013.m105("۟ۢۦ");
                    break;
                case 1753418:
                    if (customRecyclerView != null) {
                        if (C0015.f6 >= 0) {
                            str2 = "ۣۣۧ";
                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2;
                            iM240 = C0016.m618(str2);
                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                        } else {
                            iM240 = (C0017.f10 / C0015.f6) ^ 56380;
                        }
                    } else if (C0016.f9 <= 0) {
                        C0014.f3 = 85;
                        str3 = "ۣۣۡ";
                        arrayList = arrayList2;
                        iM240 = C0017.m731(str3);
                        arrayList2 = arrayList;
                    } else {
                        iM240 = (C0016.f9 | C0014.f3) + 1755684;
                    }
                    break;
                case 1753577:
                    customRecyclerView.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
                    str2 = "ۣۣۧ";
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2;
                    iM240 = C0016.m618(str2);
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    break;
                case 1754414:
                    if (arrayList2.isEmpty()) {
                        if (C0016.f9 <= 0) {
                            C0014.f3 = 85;
                            str3 = "ۣۣۡ";
                            arrayList = arrayList2;
                            iM240 = C0017.m731(str3);
                            arrayList2 = arrayList;
                        } else {
                            iM240 = (C0016.f9 | C0014.f3) + 1755684;
                        }
                    } else if (C0014.f3 * (C0015.f6 | 9532) <= 0) {
                        C0016.m574();
                        iM240 = C0015.m573("ۧ۠ۧ");
                    } else {
                        str4 = "ۤۨ۟";
                        iM240 = C0013.m105(str4);
                    }
                    break;
                case 1754592:
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 26;
                        str4 = "ۣۤ";
                        iM240 = C0013.m105(str4);
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) + 1747966;
                    }
                    break;
                case 1754601:
                    iIndexOf = arrayList2.indexOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
                    if (C0017.m717() < 0) {
                        str = "ۦۤۧ";
                        i = iIndexOf;
                        iM240 = C0013.m105(str);
                    } else {
                        C0017.m717();
                        iM240 = C0015.m573("ۦ۟ۡ");
                        i = iIndexOf;
                    }
                    break;
                case 1754656:
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    iM240 = (C0014.f3 | (C0015.f6 ^ (-3951))) >= 0 ? C0013.m105("ۣۤ۟") : C0015.f6 + C0015.f6 + 1748160;
                    break;
                case 1755398:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 85;
                        str3 = "ۣۣۡ";
                        arrayList = arrayList2;
                        iM240 = C0017.m731(str3);
                        arrayList2 = arrayList;
                    } else {
                        iM240 = (C0016.f9 | C0014.f3) + 1755684;
                    }
                    break;
                case 1755469:
                    break;
                case 1755624:
                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f3158O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 3) {
                        iM240 = (C0016.f9 - C0014.f3) + 1751648;
                    } else if (C0017.f10 >= 0) {
                        C0015.f6 = 26;
                        str4 = "ۣۤ";
                        iM240 = C0013.m105(str4);
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) + 1747966;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x048b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0033. Please report as an issue. */
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        String str;
        O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
        int iIntValue;
        IndicatorSeekBar indicatorSeekBar;
        TextView textView;
        String str2;
        int i;
        int iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        String str3;
        int iIntValue2;
        int i2 = 0;
        LivePlayActivity livePlayActivity = null;
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = null;
        LinearLayout linearLayout = null;
        TextView textView2 = null;
        IndicatorSeekBar indicatorSeekBar2 = null;
        TextView textView3 = null;
        IndicatorSeekBar indicatorSeekBar3 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        CustomRecyclerView customRecyclerView = null;
        O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2 = null;
        CustomRecyclerView customRecyclerView2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int iIntValue3 = 0;
        int i3 = 0;
        int i4 = 0;
        StringBuilder sb = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int iM105 = C0013.m105("ۦۡۡ");
        TextView textView7 = null;
        IndicatorSeekBar indicatorSeekBar4 = null;
        while (true) {
            switch (iM105) {
                case 56413:
                case 1753450:
                    i = i8;
                    if (C0014.m245() >= 0) {
                        iM105 = C0016.m618("ۨۡۢ");
                        i8 = i;
                    } else {
                        iM105 = (C0014.f3 * C0017.f10) ^ 1629061;
                        i8 = i;
                    }
                    break;
                case 56474:
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3125O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = indicatorSeekBar3;
                    TextView textView8 = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.bottomWidth);
                    IndicatorSeekBar indicatorSeekBar5 = (IndicatorSeekBar) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.bottomWidthSeekBar);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3126O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = indicatorSeekBar5;
                    if (C0016.m574() >= 0) {
                        C0015.f6 = 45;
                        iM105 = C0015.m573("۟ۢ۠");
                        textView7 = textView8;
                        indicatorSeekBar4 = indicatorSeekBar5;
                    } else {
                        iM105 = (C0016.f9 * C0015.f6) + 2242384;
                        textView7 = textView8;
                        indicatorSeekBar4 = indicatorSeekBar5;
                    }
                    break;
                case 56505:
                    indicatorSeekBar3.setMin(f);
                    indicatorSeekBar3.setMax(f2);
                    iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    indicatorSeekBar3.setProgress(iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    if ((C0013.f2 | (C0013.f2 / (-6554))) > 0) {
                        str2 = "۟ۡۧ";
                        i3 = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM105 = C0014.m240(str2);
                    } else {
                        i3 = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM105 = C0013.m105("ۨۤۥ");
                    }
                    break;
                case 1746719:
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = i8;
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i8);
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = i5;
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000 = i6;
                    iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i3;
                    i3 = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    iM105 = C0013.m105("ۨۤۥ");
                    break;
                case 1746726:
                    textView4.setText(iIntValue3 + "");
                    iM105 = (C0013.f2 | (C0016.f9 + 9036)) <= 0 ? C0016.m618("ۣۢۨ") : C0014.m240("ۦ۟");
                    break;
                case 1746757:
                    textView5.setText(i3 + "");
                    if (C0015.f6 < 0) {
                        indicatorSeekBar = indicatorSeekBar2;
                        textView = textView3;
                        iM105 = C0016.m618("ۡۨۡ");
                        indicatorSeekBar2 = indicatorSeekBar;
                        textView3 = textView;
                    } else {
                        C0013.m114();
                    }
                    break;
                case 1746781:
                    customRecyclerView.setAdapter(o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2);
                    o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2.setOnSelectListener(new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O));
                    CustomRecyclerView customRecyclerView3 = (CustomRecyclerView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.backgroundTheme_GridView);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3130O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = customRecyclerView3;
                    customRecyclerView2 = customRecyclerView3;
                    iM105 = C0013.m105("ۨۧ۟");
                    break;
                case 1746943:
                    indicatorSeekBar2.setMax(f2);
                    iIntValue3 = ((Integer) Hawk.get(C0013.m153(f8short, 1812, 4, 3216), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1455O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0))).intValue();
                    indicatorSeekBar2.setProgress(iIntValue3);
                    if (C0017.f10 % (C0013.f2 + 1352) >= 0) {
                        iM105 = C0014.m240("ۡۤۤ");
                    } else {
                        str = "۟۠ۧ";
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2;
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2 = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 1747779:
                    customRecyclerView.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i5 - 2));
                    int iIntValue4 = ((Integer) Hawk.get(C0014.m250(f8short, 1827, 4, 2485), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1441O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO))).intValue();
                    customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, iIntValue4 - 2));
                    if (C0016.f9 % (C0014.f3 - 7069) <= 0) {
                        C0014.m245();
                        i6 = iIntValue4;
                        iM105 = C0017.m731("ۥۨۢ");
                    } else {
                        i6 = iIntValue4;
                        iM105 = (C0017.f10 / C0016.f9) ^ 1750686;
                    }
                    break;
                case 1748675:
                    linearLayout.setOnKeyListener(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.show();
                    iIntValue = ((Integer) Hawk.get(C0017.m693(f8short, 1823, 4, 2798), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1440O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0))).intValue();
                    if (C0014.f3 < 0) {
                        i5 = iIntValue;
                        iM105 = (C0013.f2 | C0014.f3) + 1747862;
                    } else {
                        str2 = "ۣ۟۠";
                        i5 = iIntValue;
                        iM105 = C0014.m240(str2);
                    }
                    break;
                case 1748738:
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3132O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = customRecyclerView;
                    customRecyclerView.setLayoutManager(new CustomLayoutManager(livePlayActivity, 0));
                    o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = new O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO(livePlayActivity, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1365O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3133O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
                    if ((C0014.f3 ^ (C0017.f10 * 8229)) <= 0) {
                        C0017.f10 = 19;
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2 = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
                        iM105 = C0016.m618("۟۠ۧ");
                    } else {
                        str = "۟ۢ۠";
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2 = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 1748769:
                    i7 = -1;
                    iM105 = (C0014.f3 / C0016.f9) + 1754440;
                    break;
                case 1748890:
                    indicatorSeekBar4.setMin(f);
                    indicatorSeekBar4.setMax(f2);
                    iIntValue2 = ((Integer) Hawk.get(C0017.m693(f8short, 1816, 7, 2661), Integer.valueOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1457O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O))).intValue();
                    if (C0017.f10 >= 0) {
                        C0016.f9 = 72;
                        str3 = "ۦۡۡ";
                        i4 = iIntValue2;
                        iM105 = C0014.m240(str3);
                    } else {
                        i4 = iIntValue2;
                        iM105 = (C0013.f2 | C0013.f2) + 1751677;
                    }
                    break;
                case 1749703:
                    TextView textView9 = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textSizeTick);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3127O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = textView9;
                    TextView textView10 = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.listWidthTick);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3128O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = textView10;
                    iM105 = C0017.f10 + C0013.f2 + 1752474;
                    textView5 = textView10;
                    textView4 = textView9;
                    break;
                case 1750532:
                    iM105 = (C0015.f6 | C0013.f2) ^ (-56382);
                    break;
                case 1750686:
                    if (f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == 0) {
                        i = i2;
                        if (C0014.m245() >= 0) {
                            iM105 = C0016.m618("ۨۡۢ");
                            i8 = i;
                        } else {
                            iM105 = (C0014.f3 * C0017.f10) ^ 1629061;
                            i8 = i;
                        }
                    } else if (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 4) {
                        i8 = i2;
                        if (C0015.f6 >= 0) {
                            C0017.m717();
                            iM105 = C0017.m731("ۡۤ۠");
                        } else {
                            iM105 = C0013.f2 + C0014.f3 + 1748084;
                        }
                    } else {
                        iIntValue = i5;
                        i8 = i2;
                        str2 = "ۣ۟۠";
                        i5 = iIntValue;
                        iM105 = C0014.m240(str2);
                    }
                    break;
                case 1752493:
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setOnSelectListener(new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O));
                    f = -12;
                    indicatorSeekBar2.setMin(f);
                    f2 = 12;
                    str2 = "۟ۧۧ";
                    iM105 = C0014.m240(str2);
                    break;
                case 1752577:
                    indicatorSeekBar4.setProgress(i4);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i4);
                    sb2.append("");
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        sb = sb2;
                        iM105 = C0014.m240("ۥ۟");
                    } else {
                        sb = sb2;
                        iM105 = (C0013.f2 * C0013.f2) ^ 1499791;
                    }
                    break;
                case 1752616:
                    TextView textView11 = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.bottomWidthTick);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3129O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = textView11;
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3134O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new TextView[]{(TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textTheme), (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textBackgroundTheme), textView2, textView3, textView7};
                    CustomRecyclerView customRecyclerView4 = (CustomRecyclerView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textTheme_GridView);
                    if (C0017.f10 * (C0014.f3 + 5153) >= 0) {
                        C0016.m574();
                        iM105 = C0017.m731("ۣۡۡ");
                        customRecyclerView = customRecyclerView4;
                        textView6 = textView11;
                    } else {
                        iM105 = C0017.m731("ۣۡۤ");
                        customRecyclerView = customRecyclerView4;
                        textView6 = textView11;
                    }
                    break;
                case 1752735:
                    textView6.setText(sb.toString());
                    indicatorSeekBar2.setOnSeekChangeListener(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    indicatorSeekBar3.setOnSeekChangeListener(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    indicatorSeekBar4.setOnSeekChangeListener(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    if (C0016.f9 <= 0) {
                        iM105 = C0014.m240("ۨۤۦ");
                    } else {
                        str3 = "ۣۡۡ";
                        iIntValue2 = i4;
                        i4 = iIntValue2;
                        iM105 = C0014.m240(str3);
                    }
                    break;
                case 1753478:
                    i2 = 0;
                    LivePlayActivity livePlayActivity2 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(livePlayActivity2);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2.setContentView(R.layout.dialog_interface_setting);
                    iM105 = (C0013.f2 | C0015.f6) + 1755495;
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
                    livePlayActivity = livePlayActivity2;
                    break;
                case 1753509:
                    if (C0015.f6 >= 0) {
                        C0017.m717();
                        iM105 = C0017.m731("ۡۤ۠");
                    } else {
                        iM105 = C0013.f2 + C0014.f3 + 1748084;
                    }
                    break;
                case 1754440:
                    if (C0015.f6 - (C0014.f3 / (-689)) >= 0) {
                        C0015.f6 = 81;
                        iM105 = C0015.m573("ۥۣ۟");
                        i8 = i7;
                    } else {
                        iM105 = (C0016.f9 - C0016.f9) + 1746719;
                        i8 = i7;
                    }
                    break;
                case 1755398:
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setCanceledOnTouchOutside(true);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    LinearLayout linearLayout2 = (LinearLayout) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.interface_layout);
                    TextView textView12 = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textSize);
                    iM105 = (C0017.f10 | C0014.f3) ^ (-1755538);
                    textView2 = textView12;
                    linearLayout = linearLayout2;
                    break;
                case 1755461:
                    indicatorSeekBar = (IndicatorSeekBar) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.textSizeSeekBar);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3124O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = indicatorSeekBar;
                    textView = (TextView) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.ListWidth);
                    indicatorSeekBar3 = (IndicatorSeekBar) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.findViewById(R.id.listWidthSeekBar);
                    if ((C0016.f9 | (C0016.f9 + 7876)) <= 0) {
                        C0016.m574();
                        iM105 = C0016.m618("ۡۨۡ");
                        indicatorSeekBar2 = indicatorSeekBar;
                        textView3 = textView;
                    } else {
                        iM105 = C0016.f9 + C0016.f9 + 54856;
                        indicatorSeekBar2 = indicatorSeekBar;
                        textView3 = textView;
                    }
                    break;
                case 1755497:
                    break;
                case 1755498:
                    if (C0016.f9 <= 0) {
                        C0015.m570();
                        str = "ۣ۟ۥ";
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2;
                        o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO2 = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
                        iM105 = C0015.m573(str);
                    } else {
                        iM105 = (C0016.f9 % C0015.f6) + 1753278;
                    }
                    break;
                case 1755584:
                    customRecyclerView2.setLayoutManager(new CustomLayoutManager(livePlayActivity, 0));
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f3131O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    customRecyclerView2.setAdapter(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2);
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    iM105 = (C0014.f3 / C0016.f9) + 1752493;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x025b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001c. Please report as an issue. */
    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        String str;
        ArrayList arrayList;
        ImageView imageView;
        String str2;
        StringBuilder sb;
        TextView textView;
        String str3;
        String str4;
        LivePlayActivity livePlayActivity;
        String str5;
        String str6;
        CustomRecyclerView customRecyclerView;
        String str7;
        String str8;
        TextView textView2;
        String str9;
        LivePlayActivity livePlayActivity2 = null;
        O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = null;
        ImageView imageView2 = null;
        TextView textView3 = null;
        CustomRecyclerView customRecyclerView2 = null;
        ImageView imageView3 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        ArrayList arrayList2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = null;
        String str10 = null;
        StringBuilder sb2 = null;
        int iM573 = C0015.m573("ۢۦۧ");
        ArrayList arrayList3 = null;
        EditText editText = null;
        ImageView imageView4 = null;
        while (true) {
            switch (iM573) {
                case 56290:
                    final int i = 2;
                    final O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.github.tvbox.osc.ui.dialog.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1;
                                    String strTrim = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                                    String strTrim2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                                    AddressItem addressItem = new AddressItem();
                                    if (TextUtils.isEmpty(strTrim2)) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                                    } else {
                                        if (strTrim.isEmpty()) {
                                            strTrim = strTrim2;
                                        }
                                        addressItem.setLiveUrl(strTrim2);
                                        addressItem.setLiveUrlName(strTrim);
                                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        boolean z = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        ArrayList<AddressItem> arrayList4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        if (!z && arrayList4.contains(addressItem)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                        } else if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                            AddressItem addressItem2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1196O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                            int iIndexOf = arrayList4.indexOf(addressItem2);
                                            if (iIndexOf != -1) {
                                                for (AddressItem addressItem3 : arrayList4) {
                                                    if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                        break;
                                                    }
                                                }
                                                arrayList4.set(iIndexOf, addressItem);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.notifyItemChanged(iIndexOf);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                                Hawk.put("live_json_list", arrayList4);
                                            } else {
                                                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            }
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                        } else {
                                            o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                        }
                                    }
                                    break;
                                case 1:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    break;
                                default:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.getClass();
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3169O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(6, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.dismiss();
                                    break;
                            }
                        }
                    });
                    if (!O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0)) {
                        iM573 = (C0015.f6 - C0015.f6) ^ 1755494;
                    } else if (C0015.f6 >= 0) {
                        C0017.m717();
                        str9 = "ۦۧۧ";
                        textView2 = textView4;
                        textView4 = textView2;
                        iM573 = C0013.m105(str9);
                    } else {
                        iM573 = (C0017.f10 % C0014.f3) ^ (-1746861);
                    }
                    break;
                case 56327:
                    editText.setHint(C0013.m153(f8short, 1837, 21, 1519));
                    customRecyclerView = (CustomRecyclerView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.mLiveUrlGridView);
                    if (C0013.m114() < 0) {
                        str4 = "۟ۨۧ";
                        livePlayActivity = livePlayActivity2;
                        customRecyclerView2 = customRecyclerView;
                        livePlayActivity2 = livePlayActivity;
                        iM573 = C0017.m731(str4);
                    } else {
                        C0013.f2 = 60;
                        str7 = "ۤۨۢ";
                        customRecyclerView2 = customRecyclerView;
                        iM573 = C0015.m573(str7);
                    }
                    break;
                case 1746874:
                    textView3.setText(sb2.toString());
                    imageView2.setImageBitmap(LivePlayActivity.f2946O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
                    iM573 = C0017.f10 / (C0015.f6 ^ (-4082)) != 0 ? C0014.m240("۠ۥۥ") : (C0013.f2 ^ C0014.f3) + 57141;
                    break;
                case 1746908:
                    this.f3281O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
                    if (C0013.f2 % (C0015.f6 * 2288) <= 0) {
                        C0014.f3 = 77;
                        imageView = imageView3;
                        str5 = "ۡۤۢ";
                        imageView3 = imageView;
                        iM573 = C0016.m618(str5);
                    } else {
                        iM573 = (C0014.f3 % C0014.f3) + 1752515;
                    }
                    break;
                case 1746939:
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1191O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1192O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity2;
                    str7 = "ۦۣ۟";
                    customRecyclerView = customRecyclerView2;
                    customRecyclerView2 = customRecyclerView;
                    iM573 = C0015.m573(str7);
                    break;
                case 1746974:
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3168O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = customRecyclerView2;
                    imageView = (ImageView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.urlTypeButton);
                    if (C0014.m245() >= 0) {
                        C0015.m570();
                        imageView3 = imageView;
                        iM573 = C0013.m105("ۤۥۣ");
                    } else {
                        str5 = "ۡۤۢ";
                        imageView3 = imageView;
                        iM573 = C0016.m618(str5);
                    }
                    break;
                case 1747716:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    arrayList = new ArrayList();
                    if (C0015.m570() > 0) {
                        str6 = "ۤۥۣ";
                        arrayList2 = arrayList;
                        iM573 = C0015.m573(str6);
                    } else {
                        C0014.m245();
                        str = "ۣۣۧ";
                        arrayList2 = arrayList;
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1747776:
                    if (C0016.f9 / (C0015.f6 % 6490) >= 0) {
                        C0015.f6 = 69;
                        str6 = "ۧ۟ۦ";
                        arrayList = arrayList2;
                    } else {
                        str6 = "ۢۦۧ";
                        arrayList = arrayList2;
                    }
                    arrayList2 = arrayList;
                    iM573 = C0015.m573(str6);
                    break;
                case 1747840:
                    str6 = "ۥۡ۟";
                    arrayList = arrayList2;
                    arrayList2 = arrayList;
                    iM573 = C0015.m573(str6);
                    break;
                case 1747900:
                    final int i2 = 0;
                    final O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: com.github.tvbox.osc.ui.dialog.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2;
                                    String strTrim = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                                    String strTrim2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                                    AddressItem addressItem = new AddressItem();
                                    if (TextUtils.isEmpty(strTrim2)) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                                    } else {
                                        if (strTrim.isEmpty()) {
                                            strTrim = strTrim2;
                                        }
                                        addressItem.setLiveUrl(strTrim2);
                                        addressItem.setLiveUrlName(strTrim);
                                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        boolean z = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        ArrayList<AddressItem> arrayList4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        if (!z && arrayList4.contains(addressItem)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                        } else if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                            AddressItem addressItem2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1196O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                            int iIndexOf = arrayList4.indexOf(addressItem2);
                                            if (iIndexOf != -1) {
                                                for (AddressItem addressItem3 : arrayList4) {
                                                    if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                        break;
                                                    }
                                                }
                                                arrayList4.set(iIndexOf, addressItem);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.notifyItemChanged(iIndexOf);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                                Hawk.put("live_json_list", arrayList4);
                                            } else {
                                                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            }
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                        } else {
                                            o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                        }
                                    }
                                    break;
                                case 1:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    break;
                                default:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO2;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.getClass();
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.f3169O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(6, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.dismiss();
                                    break;
                            }
                        }
                    });
                    final int i3 = 1;
                    final O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
                    imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.github.tvbox.osc.ui.dialog.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3;
                                    String strTrim = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getText().toString().trim();
                                    String strTrim2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getText().toString().trim();
                                    AddressItem addressItem = new AddressItem();
                                    if (TextUtils.isEmpty(strTrim2)) {
                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "请输入地址后保存");
                                    } else {
                                        if (strTrim.isEmpty()) {
                                            strTrim = strTrim2;
                                        }
                                        addressItem.setLiveUrl(strTrim2);
                                        addressItem.setLiveUrlName(strTrim);
                                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        boolean z = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        ArrayList<AddressItem> arrayList4 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                        if (!z && arrayList4.contains(addressItem)) {
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                        } else if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                            AddressItem addressItem2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1196O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                                            int iIndexOf = arrayList4.indexOf(addressItem2);
                                            if (iIndexOf != -1) {
                                                for (AddressItem addressItem3 : arrayList4) {
                                                    if (!addressItem3.equals(addressItem2) && addressItem3.getLiveUrlName().equals(strTrim)) {
                                                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同名称");
                                                        break;
                                                    }
                                                }
                                                arrayList4.set(iIndexOf, addressItem);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.notifyItemChanged(iIndexOf);
                                                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                                                Hawk.put("live_json_list", arrayList4);
                                            } else {
                                                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            }
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "修改成功");
                                        } else {
                                            o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加");
                                        }
                                    }
                                    break;
                                case 1:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO5.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                                    break;
                                default:
                                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO6 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO3;
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO6.getClass();
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO6.f3169O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(6, LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
                                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO6.dismiss();
                                    break;
                            }
                        }
                    });
                    iM573 = (C0015.f6 / C0016.f9) ^ 1750662;
                    break;
                case 1748767:
                    imageView3.setVisibility(0);
                    ImageView imageView5 = (ImageView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.urlClearButton);
                    if (C0017.m717() >= 0) {
                        C0014.m245();
                    }
                    imageView4 = imageView5;
                    iM573 = C0016.m618("ۥ۠ۢ");
                    break;
                case 1749793:
                    EditText editText2 = (EditText) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.input_live);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = editText2;
                    if (C0014.f3 >= 0) {
                        C0015.m570();
                        str8 = "۟ۦۣ";
                    } else {
                        str8 = "۠ۧ";
                    }
                    editText = editText2;
                    iM573 = C0013.m105(str8);
                    break;
                case 1749795:
                    if (this.f3281O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                        LivePlayActivity livePlayActivity3 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        if (C0015.m570() <= 0) {
                            C0014.f3 = 42;
                            str4 = "۟ۥ۠";
                            livePlayActivity = livePlayActivity3;
                            livePlayActivity2 = livePlayActivity;
                            iM573 = C0017.m731(str4);
                        } else {
                            livePlayActivity2 = livePlayActivity3;
                            iM573 = (C0013.f2 % C0017.f10) + 1751544;
                        }
                    } else {
                        str6 = "ۥۡ۟";
                        arrayList = arrayList2;
                        arrayList2 = arrayList;
                        iM573 = C0015.m573(str6);
                    }
                    break;
                case 1750659:
                    break;
                case 1750662:
                    imageView3.setOnClickListener(new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0, 1));
                    str3 = LivePlayActivity.f2947O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;
                    if (C0014.m245() >= 0) {
                        textView = textView5;
                        textView5 = textView;
                        str10 = str3;
                        iM573 = C0017.m731("۠ۡۥ");
                    } else {
                        str10 = str3;
                        iM573 = (C0014.f3 % C0016.f9) + 1753663;
                    }
                    break;
                case 1750783:
                    if (C0015.f6 >= 0) {
                        C0017.m717();
                        str9 = "ۦۧۧ";
                        textView2 = textView4;
                        textView4 = textView2;
                        iM573 = C0013.m105(str9);
                    } else {
                        iM573 = (C0017.f10 % C0014.f3) ^ (-1746861);
                    }
                    break;
                case 1751590:
                    ((TextView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.title)).setText(C0016.m608(f8short, 1831, 6, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD));
                    ImageView imageView6 = (ImageView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.ivQRCode);
                    if (C0014.f3 - (C0014.f3 ^ (-770)) >= 0) {
                        C0016.f9 = 28;
                        imageView2 = imageView6;
                        iM573 = C0017.m731("ۥۡ۟");
                    } else {
                        str2 = "ۦۣۧ";
                        sb = sb2;
                        imageView2 = imageView6;
                        sb2 = sb;
                        iM573 = C0017.m731(str2);
                    }
                    break;
                case 1751682:
                    ArrayList arrayList4 = (ArrayList) Hawk.get(C0017.m693(f8short, 1858, 14, 1686), arrayList2);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList4;
                    arrayList3 = arrayList4;
                    iM573 = C0016.f9 + C0016.f9 + 1750156;
                    break;
                case 1751686:
                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4 = new O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(livePlayActivity2);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4.f3169O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = livePlayActivity2;
                    if (C0016.f9 <= 0) {
                        C0017.m717();
                        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4;
                        iM573 = C0016.m618("ۣۣ۠");
                    } else {
                        o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO4;
                        iM573 = (C0015.f6 - C0014.f3) + 1755956;
                    }
                    break;
                case 1751774:
                    customRecyclerView2.addItemDecoration(new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(6));
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo();
                    iM573 = (C0014.f3 % C0014.f3) + 1746939;
                    break;
                case 1752454:
                    textView = (TextView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.jsonButton);
                    textView.setVisibility(0);
                    str3 = str10;
                    textView5 = textView;
                    str10 = str3;
                    iM573 = C0017.m731("۠ۡۥ");
                    break;
                case 1752487:
                    imageView4.requestFocus();
                    textView2 = (TextView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.okButton);
                    str9 = "ۥ۟۠";
                    textView4 = textView2;
                    iM573 = C0013.m105(str9);
                    break;
                case 1752515:
                    this.f3281O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.show();
                    iM573 = (C0015.f6 ^ C0013.f2) ^ (-1750888);
                    break;
                case 1753448:
                    StringBuilder sb3 = new StringBuilder(C0016.m608(f8short, 1872, 16, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED));
                    sb3.append(str10);
                    if (C0014.m245() >= 0) {
                        C0015.f6 = 5;
                        sb = sb3;
                        str2 = "ۤۥۧ";
                    } else {
                        sb = sb3;
                        str2 = "۟ۥ۠";
                    }
                    sb2 = sb;
                    iM573 = C0017.m731(str2);
                    break;
                case 1753450:
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.setHasStableIds(true);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
                    iM573 = C0014.f3 - (C0016.f9 | (-2107)) <= 0 ? C0017.m731("۟ۨۧ") : C0014.f3 + C0017.f10 + 1755477;
                    break;
                case 1753538:
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1193O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1195O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList3;
                    if (C0016.f9 / (C0017.f10 * (-1592)) != 0) {
                        C0013.m114();
                        iM573 = C0013.m105("ۨۦۨ");
                    } else {
                        str5 = "ۦ۠ۤ";
                        imageView = imageView3;
                        imageView3 = imageView;
                        iM573 = C0016.m618(str5);
                    }
                    break;
                case 1753546:
                    TextView textView6 = (TextView) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.tvAddress);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (EditText) o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.findViewById(R.id.input_liveName);
                    textView3 = textView6;
                    iM573 = (C0016.f9 / C0017.f10) + 1749794;
                    break;
                case 1754504:
                    customRecyclerView2.setAdapter(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo);
                    textView5.setOnClickListener(new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0, livePlayActivity2, 0));
                    iM573 = (C0013.f2 | C0013.f2) ^ 1747000;
                    break;
                case 1755494:
                    O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0);
                    if (C0016.f9 + C0014.f3 + 6132 <= 0) {
                        iM573 = C0016.m618("ۦۣۧ");
                    } else {
                        str = "۟ۦۣ";
                        arrayList = arrayList2;
                        arrayList2 = arrayList;
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1755562:
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.setContentView(R.layout.dialog_url_edit);
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.setCanceledOnTouchOutside(true);
                    iM573 = (C0015.f6 ^ C0017.f10) ^ 1751731;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    public final void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        String str;
        String str2;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        LivePlayActivity livePlayActivity;
        HashMap map;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        String str3;
        String str4;
        String str5;
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String str6;
        String str7;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = null;
        LivePlayActivity livePlayActivity2 = null;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = null;
        String str8 = null;
        String str9 = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
        HashMap map2 = null;
        boolean z = false;
        int iM240 = C0014.m240("ۣۢۤ");
        JSONException jSONException = null;
        HashMap map3 = null;
        JSONObject jSONObject = null;
        while (true) {
            switch (iM240) {
                case 56419:
                case 56505:
                    iM240 = (C0014.f3 ^ C0014.f3) + 1748888;
                    break;
                case 1746693:
                    livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = livePlayActivity.f2960O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    if (C0014.m245() >= 0) {
                        str2 = "ۤۥ۠";
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        livePlayActivity2 = livePlayActivity;
                        iM240 = C0015.m573(str2);
                    } else {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        livePlayActivity2 = livePlayActivity;
                        iM240 = C0014.m240("ۦۤۥ");
                    }
                    break;
                case 1746749:
                    str6 = "ۥۣۤ";
                    iM240 = C0014.m240(str6);
                    break;
                case 1747743:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    HashMap map4 = new HashMap();
                    if (C0015.f6 + (C0016.f9 | 7094) <= 0) {
                        C0013.f2 = 21;
                        map3 = map4;
                        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                        iM240 = C0014.m240("ۥۡ۠");
                    } else {
                        map3 = map4;
                        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                        iM240 = C0013.m105("ۦۦ۠");
                    }
                    break;
                case 1747778:
                    try {
                        map2.put(str8, jSONObject);
                        iM240 = (C0014.f3 | C0014.f3) ^ (-1755584);
                    } catch (JSONException e) {
                        if (C0013.f2 - (C0016.f9 * (-937)) <= 0) {
                            jSONException = e;
                            iM240 = C0013.m105("ۦۢۤ");
                        } else {
                            jSONException = e;
                            iM240 = (C0016.f9 | C0014.f3) ^ (-56432);
                        }
                    }
                    break;
                case 1747903:
                case 1752738:
                    break;
                case 1747932:
                    String strM153 = C0013.m153(f8short, 1888, 13, 621);
                    if (C0013.f2 + C0017.f10 + 9692 <= 0) {
                        C0015.m570();
                        str4 = strM153;
                        str3 = "ۥۨۨ";
                        str9 = str4;
                        iM240 = C0014.m240(str3);
                    } else {
                        str9 = strM153;
                        iM240 = (C0014.f3 / C0013.f2) + 1747743;
                    }
                    break;
                case 1748857:
                    iM240 = C0014.f3 + (C0017.f10 + 8621) <= 0 ? C0016.m618("ۣۧۨ") : (C0013.f2 ^ C0013.f2) + 1750629;
                    break;
                case 1748888:
                    jSONException.printStackTrace();
                    if ((C0017.f10 | (C0016.f9 % (-1387))) < 0) {
                        str6 = "ۨ۠ۤ";
                        iM240 = C0014.m240(str6);
                    } else {
                        strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str8;
                        str8 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM240 = C0015.m573("۠ۨۤ");
                    }
                    break;
                case 1749818:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        str = "ۤۦۡ";
                        iM240 = C0016.m618(str);
                    } else {
                        iM240 = (C0015.f6 | C0014.f3) ^ (-1747808);
                    }
                    break;
                case 1749820:
                    map2.clear();
                    if (C0013.f2 + (C0015.f6 / 9481) <= 0) {
                        iM240 = C0015.m573("۠ۢۡ");
                    } else {
                        str5 = "ۤۧۨ";
                        iM240 = C0014.m240(str5);
                    }
                    break;
                case 1750629:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                        str3 = "۠ۧۦ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        str4 = str9;
                        str9 = str4;
                        iM240 = C0014.m240(str3);
                    } else if ((C0015.f6 ^ (C0015.f6 | (-1341))) <= 0) {
                        str5 = "ۢۨۢ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM240 = C0014.m240(str5);
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM240 = 1746693 + (C0014.f3 - C0014.f3);
                    }
                    break;
                case 1751528:
                case 1753512:
                    if (C0016.m574() >= 0) {
                        C0014.m245();
                        iM240 = C0014.m240("ۦۣۢ");
                    } else {
                        iM240 = (C0014.f3 | C0017.f10) ^ (-1751570);
                    }
                    break;
                case 1751679:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                    if ((C0015.f6 ^ (C0015.f6 | (-1341))) <= 0) {
                        str5 = "ۢۨۢ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM240 = C0014.m240(str5);
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM240 = 1746693 + (C0014.f3 - C0014.f3);
                    }
                    break;
                case 1751749:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if (C0014.f3 >= 0) {
                        iM240 = C0013.m105("ۡۨ۟");
                    } else {
                        str4 = str9;
                        str3 = "ۥۢۦ";
                        str9 = str4;
                        iM240 = C0014.m240(str3);
                    }
                    break;
                case 1752516:
                case 1752612:
                    iM240 = (C0015.f6 ^ C0017.f10) ^ 1755257;
                    break;
                case 1752553:
                    Hawk.put(str9, map2);
                    if (C0015.m570() <= 0) {
                        iM240 = C0014.m240("ۣۢۤ");
                    } else {
                        str7 = "۟ۡ۟";
                        iM240 = C0015.m573(str7);
                    }
                    break;
                case 1752741:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    str2 = "ۨۤۢ";
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
                    livePlayActivity = livePlayActivity2;
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    livePlayActivity2 = livePlayActivity;
                    iM240 = C0015.m573(str2);
                    break;
                case 1753507:
                    jSONObject.put(C0017.m693(f8short, 1901, 2, 3259), i);
                    if (C0015.f6 + (C0015.f6 * (-7630)) > 0) {
                        str = "ۣ۠ۥ";
                        iM240 = C0016.m618(str);
                    } else {
                        C0013.f2 = 94;
                        str6 = "ۨ۠ۤ";
                        iM240 = C0014.m240(str6);
                    }
                    break;
                case 1753569:
                    boolean zO0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
                    jSONObject = new JSONObject();
                    z = zO0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    iM240 = (C0016.f9 | C0015.f6) + 1755689;
                    break;
                case 1753575:
                    strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.getClass();
                    if ((C0016.f9 | (C0013.f2 * (-5999))) >= 0) {
                        C0016.f9 = 32;
                        str8 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM240 = C0016.m618("ۥۨۥ");
                    } else {
                        str8 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM240 = C0015.m573("۠ۨۤ");
                    }
                    break;
                case 1753632:
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getClass();
                    map = (HashMap) Hawk.get(str9, map3);
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 7;
                        map2 = map;
                        iM240 = C0016.m618("ۡۧ۟");
                    } else {
                        map2 = map;
                        iM240 = C0014.m240("ۦۤ۟");
                    }
                    break;
                case 1755372:
                    livePlayActivity2.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 61;
                        iM240 = C0017.m731("ۨۨۨ");
                    } else {
                        iM240 = (C0017.f10 * C0014.f3) + 1589768;
                    }
                    break;
                case 1755399:
                    if (C0015.f6 - (C0015.f6 / (-5685)) >= 0) {
                        C0014.f3 = 9;
                        str7 = "ۣ۠";
                        iM240 = C0015.m573(str7);
                    } else {
                        iM240 = C0016.m618("ۥۨۨ");
                    }
                    break;
                case 1755494:
                    Hawk.put(C0017.m693(f8short, 1903, 4, 1468), Integer.valueOf(i));
                    str5 = "ۢۧۡ";
                    iM240 = C0014.m240(str5);
                    break;
                case 1755497:
                    if (C0014.m245() >= 0) {
                        map = map2;
                        map2 = map;
                        iM240 = C0014.m240("ۦۤ۟");
                    } else {
                        iM240 = (C0015.f6 + C0016.f9) ^ 1751328;
                    }
                    break;
                case 1755585:
                    iM240 = C0013.m105("۟ۡ۟");
                    break;
                case 1755624:
                    if (z) {
                        if (C0015.f6 >= 0) {
                            C0016.f9 = 78;
                            iM240 = C0014.m240("ۤ۠ۤ");
                        } else {
                            iM240 = C0016.m618("ۦۢ۟");
                        }
                    } else if (C0015.f6 - (C0015.f6 / (-5685)) >= 0) {
                        C0014.f3 = 9;
                        str7 = "ۣ۠";
                        iM240 = C0015.m573(str7);
                    } else {
                        iM240 = C0016.m618("ۥۨۨ");
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i) {
        String str;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String str2;
        String str3;
        String str4;
        int i2 = 0;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        VideoView videoView = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iM105 = C0013.m105("ۡ۟ۧ");
        LivePlayActivity livePlayActivity = null;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        while (true) {
            switch (iM105) {
                case 56324:
                    i4 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f914O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    iM105 = C0017.m731("ۥۢۤ");
                    break;
                case 56413:
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getClass();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if (C0017.m717() >= 0) {
                        C0015.m570();
                        iM105 = C0013.m105("۠ۤ");
                    } else {
                        iM105 = (C0015.f6 - C0016.f9) + 1749256;
                    }
                    break;
                case 56545:
                    if (C0013.f2 <= 0) {
                        C0014.m245();
                        str3 = "ۨۦۦ";
                        iM105 = C0013.m105(str3);
                    } else {
                        iM105 = (C0013.f2 | C0014.f3) + 1751611;
                    }
                    break;
                case 1747653:
                    if (C0014.m245() >= 0) {
                        C0013.f2 = 47;
                        iM105 = C0015.m573("ۦۡ۠");
                    } else {
                        str2 = "ۥۥۧ";
                        iM105 = C0014.m240(str2);
                    }
                    break;
                case 1747688:
                    VideoView videoView2 = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                    if (C0015.f6 % (C0015.f6 + 5826) < 0) {
                        str = "ۣ۠";
                        videoView = videoView2;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM105 = C0016.m618(str);
                    } else {
                        C0014.f3 = 47;
                        videoView = videoView2;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM105 = C0017.m731("ۨۡۢ");
                    }
                    break;
                case 1747838:
                    Hawk.put(C0014.m250(f8short, 1907, 4, 444), Integer.valueOf(i2));
                    i3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
                    str2 = "ۣ۠ۥ";
                    iM105 = C0014.m240(str2);
                    break;
                case 1747929:
                    if (C0016.f9 - (C0016.f9 | 7648) >= 0) {
                        str4 = "ۣۢۨ";
                        iM105 = C0014.m240(str4);
                    } else {
                        iM105 = (C0015.f6 % C0015.f6) ^ 56324;
                    }
                    break;
                case 1748617:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    if (C0017.f10 * (C0017.f10 ^ (-6937)) >= 0) {
                        C0014.f3 = 84;
                        i2 = i;
                        iM105 = C0017.m731("ۥۢۤ");
                    } else {
                        iM105 = 1755559 + (C0017.f10 / C0017.f10);
                        i2 = i;
                    }
                    break;
                case 1748643:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    i6 = i5;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    iM105 = C0017.m731("ۨۡۢ");
                    break;
                case 1748647:
                case 1752460:
                    iM105 = (C0015.f6 | C0013.f2) + 1754542;
                    break;
                case 1749702:
                case 1749733:
                    break;
                case 1749849:
                    if ((C0017.f10 ^ (C0017.f10 | 8892)) <= 0) {
                        C0014.f3 = 63;
                        str2 = "ۤۦۧ";
                        iM105 = C0014.m240(str2);
                    } else {
                        iM105 = C0015.m573("ۡ۟ۧ");
                    }
                    break;
                case 1750568:
                    if (i3 != -1) {
                        iM105 = C0015.m573("ۤۡۦ");
                        i5 = i3;
                    } else if (C0016.f9 - (C0016.f9 | 7648) >= 0) {
                        str4 = "ۣۢۨ";
                        iM105 = C0014.m240(str4);
                    } else {
                        iM105 = (C0015.f6 % C0015.f6) ^ 56324;
                    }
                    break;
                case 1751528:
                case 1752523:
                    str4 = "ۦۧۨ";
                    iM105 = C0014.m240(str4);
                    break;
                case 1751561:
                    iM105 = C0017.f10 * (C0013.f2 * (-7955)) <= 0 ? C0014.m240("۠ۨۡ") : (C0013.f2 | C0014.f3) + 1748730;
                    break;
                case 1752551:
                    if (C0013.f2 + (C0016.f9 - 2426) >= 0) {
                        iM105 = C0016.m618("ۦۧۨ");
                        i5 = i4;
                    } else {
                        iM105 = C0015.m573("ۧۡۧ");
                        i5 = i4;
                    }
                    break;
                case 1752647:
                    LivePlayActivity livePlayActivity2 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = livePlayActivity2.f2960O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    if ((C0014.f3 | (C0017.f10 - 4635)) >= 0) {
                        C0014.f3 = 93;
                        iM105 = C0017.m731("ۧۨ");
                        livePlayActivity = livePlayActivity2;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
                    } else {
                        iM105 = (C0017.f10 ^ C0014.f3) ^ 1747147;
                        livePlayActivity = livePlayActivity2;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
                    }
                    break;
                case 1753671:
                    videoView.setScreenScaleType(i7);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i7;
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 22;
                        str = "ۣ۠";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM105 = C0016.m618(str);
                    } else {
                        iM105 = C0017.m731("ۢۤۧ");
                    }
                    break;
                case 1754445:
                    if (i5 != -1) {
                        str2 = "ۡ۠ۢ";
                        iM105 = C0014.m240(str2);
                    } else if (C0014.f3 + C0016.f9 + 9210 <= 0) {
                        C0014.m245();
                        iM105 = C0016.m618("ۣۢۧ");
                        i7 = i2;
                    } else {
                        iM105 = C0016.m618("ۧۨ");
                        i7 = i2;
                    }
                    break;
                case 1754627:
                    str2 = "ۡ۠ۢ";
                    iM105 = C0014.m240(str2);
                    break;
                case 1755401:
                    if (C0013.f2 <= 0) {
                        C0017.f10 = 62;
                        iM105 = C0015.m573("ۥۡۧ");
                        i7 = i6;
                    } else {
                        str3 = "ۦۧۨ";
                        i7 = i6;
                        iM105 = C0013.m105(str3);
                    }
                    break;
                case 1755560:
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                        if ((C0015.f6 ^ (C0013.f2 * (-3240))) <= 0) {
                            C0014.f3 = 2;
                            iM105 = C0014.m240("ۥ۟ۦ");
                        } else {
                            iM105 = (C0017.f10 - C0014.f3) + 1750245;
                        }
                    } else if (C0014.m245() >= 0) {
                        C0013.f2 = 47;
                        iM105 = C0015.m573("ۦۡ۠");
                    } else {
                        str2 = "ۥۥۧ";
                        iM105 = C0014.m240(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        String str;
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        String str2;
        String str3;
        String str4;
        int iM240 = C0014.m240("ۣۧ۠");
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = null;
        LivePlayActivity livePlayActivity = null;
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = null;
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01 = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O02 = null;
        while (true) {
            switch (iM240) {
                case 56387:
                    if (C0014.m245() < 0) {
                        str2 = "ۨۢۧ";
                        iM240 = C0017.m731(str2);
                    } else {
                        C0017.m717();
                        str = "ۤۡۡ";
                        iM240 = C0014.m240(str);
                    }
                    break;
                case 56450:
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = this.f3287O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                    iM240 = (C0017.f10 % C0017.f10) + 1749669;
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                    break;
                case 1747927:
                    livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        iM240 = C0017.m731("ۤۢۦ");
                    } else {
                        iM240 = (C0016.f9 % C0017.f10) + 1749738;
                    }
                    break;
                case 1748611:
                    if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O02 == null) {
                        iM240 = (C0015.f6 - C0016.f9) + 1755981;
                    } else if (C0014.m245() < 0) {
                        C0017.m717();
                        str = "ۤۡۡ";
                        iM240 = C0014.m240(str);
                    } else {
                        str2 = "ۨۢۧ";
                        iM240 = C0017.m731(str2);
                    }
                    break;
                case 1749638:
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                    if (C0013.f2 <= 0) {
                        iM240 = C0013.m105("ۡ۟ۡ");
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    } else {
                        str4 = "ۤۦ";
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM240 = C0016.m618(str4);
                    }
                    break;
                case 1749669:
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.removeCallbacks(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0016.m574() >= 0) {
                        C0013.m114();
                        iM240 = C0016.m618("ۨۢۡ");
                    } else {
                        iM240 = C0015.m573("۠ۨ۟");
                    }
                    break;
                case 1749789:
                    break;
                case 1750602:
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, 13));
                    if (C0015.m570() > 0) {
                        str = "ۢۡۥ";
                        iM240 = C0014.m240(str);
                    } else {
                        C0014.m245();
                    }
                    break;
                case 1750629:
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01.f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
                    break;
                case 1750780:
                    O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O03 = this.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                    if ((C0017.f10 | (C0013.f2 / 1543)) >= 0) {
                        iM240 = C0014.m240("۠ۨ۟");
                        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O02 = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O03;
                    } else {
                        str4 = "ۨۧۤ";
                        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O02 = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O03;
                        iM240 = C0016.m618(str4);
                    }
                    break;
                case 1751592:
                    this.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01;
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 32;
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
                        str4 = "ۤۦ";
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM240 = C0016.m618(str4);
                    } else {
                        iM240 = C0015.m573("ۣۢۤ");
                    }
                    break;
                case 1751774:
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = this.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                    iM240 = C0015.f6 % (C0014.f3 % (-5042)) >= 0 ? C0014.m240("ۨۢۧ") : C0016.m618("ۨۧۦ");
                    break;
                case 1754563:
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O01 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(livePlayActivity);
                    if ((C0016.f9 | (C0017.f10 * (-6972))) <= 0) {
                        iM240 = C0015.m573("ۢۢۥ");
                    } else {
                        str3 = "ۤۢۦ";
                        iM240 = C0014.m240(str3);
                    }
                    break;
                case 1755431:
                    if (C0017.f10 * (C0017.f10 + 6504) >= 0) {
                        C0016.m574();
                        str2 = "ۨۢ۟";
                    } else {
                        str2 = "ۣۧ۠";
                    }
                    iM240 = C0017.m731(str2);
                    break;
                case 1755437:
                    this.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    iM240 = (C0015.f6 ^ C0016.f9) + 1752104;
                    break;
                case 1755589:
                    LivePlayActivity livePlayActivity2 = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if ((C0014.f3 ^ (C0017.f10 - 9384)) <= 0) {
                        C0017.m717();
                        iM240 = C0015.m573("ۣۧ۠");
                        livePlayActivity = livePlayActivity2;
                    } else {
                        iM240 = (C0017.f10 ^ C0015.f6) + 1748462;
                        livePlayActivity = livePlayActivity2;
                    }
                    break;
                case 1755591:
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getClass();
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 98;
                    }
                    str3 = "ۣۡۨ";
                    iM240 = C0014.m240(str3);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x001b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(int i) {
        String str;
        String str2;
        LivePlayActivity livePlayActivity;
        int i2;
        String str3;
        int i3;
        String str4;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        String str5;
        String str6;
        LivePlayActivity livePlayActivity2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = null;
        int i4 = 0;
        int i5 = 0;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = null;
        int i6 = 0;
        int i7 = 0;
        int iM731 = C0017.m731("ۧۥ۠");
        ArrayList arrayList = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = null;
        while (true) {
            switch (iM731) {
                case 56294:
                case 56570:
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM731 = C0014.m240("ۢۥۤ");
                    } else {
                        str3 = "ۦۧۢ";
                        iM731 = C0013.m105(str3);
                    }
                    break;
                case 56295:
                    if (i7 < O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size()) {
                        this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i7, ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(i7)).f910O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, false);
                        if (C0013.f2 - (C0013.f2 / (-2703)) <= 0) {
                            C0015.m570();
                            iM731 = C0015.m573("ۣ۠ۢ");
                        } else {
                            iM731 = (C0015.f6 + C0013.f2) ^ 1748935;
                        }
                    } else if (C0015.f6 >= 0) {
                        C0013.f2 = 75;
                        iM731 = C0016.m618("ۢ۟۠");
                    } else {
                        iM731 = C0013.f2 + C0013.f2 + 1747062;
                    }
                    break;
                case 56319:
                    f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = 0;
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        iM731 = C0015.m573("۠ۨ");
                    } else {
                        iM731 = (C0013.f2 + C0014.f3) ^ 1755744;
                    }
                    break;
                case 56326:
                case 1752546:
                    str4 = "۠ۨ";
                    iM731 = C0013.m105(str4);
                    break;
                case 56328:
                    f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = -1;
                    iM731 = (C0015.f6 - C0014.f3) + 1753130;
                    break;
                case 56352:
                case 1747717:
                case 1750755:
                    if (C0013.f2 <= 0) {
                        C0013.m114();
                        iM731 = C0017.m731("ۣۤۢ");
                    } else {
                        iM731 = (C0017.f10 * C0016.f9) ^ (-1304006);
                    }
                    break;
                case 56414:
                    if (i4 != -1) {
                        iM731 = C0017.f10 + (C0013.f2 ^ (-5605)) >= 0 ? C0016.m618("ۣۧۦ") : (C0014.f3 + C0015.f6) ^ (-1755763);
                    } else if (C0017.f10 * (C0014.f3 - 9045) <= 0) {
                        C0013.m114();
                        str4 = "ۥۦ";
                        iM731 = C0013.m105(str4);
                    } else {
                        iM731 = (C0013.f2 | C0015.f6) ^ (-56539);
                    }
                    break;
                case 56506:
                    i2 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    if (i2 == -1) {
                        if (C0017.f10 >= 0) {
                            C0017.m717();
                            str5 = "ۧۦۨ";
                            i5 = i2;
                        } else {
                            str5 = "ۥۥۢ";
                            i5 = i2;
                        }
                        iM731 = C0017.m731(str5);
                    } else if (C0014.f3 - (C0017.f10 ^ (-9056)) >= 0) {
                        C0017.f10 = 0;
                        i5 = i2;
                        iM731 = C0017.m731("ۦ۠");
                    } else {
                        i5 = i2;
                        iM731 = (C0014.f3 * C0017.f10) + 1592525;
                    }
                    break;
                case 1746813:
                    if (i == 8) {
                        if ((C0016.f9 ^ (C0013.f2 / (-4426))) <= 0) {
                            C0014.f3 = 25;
                            iM731 = C0016.m618("ۦۧۢ");
                        } else {
                            iM731 = (C0014.f3 ^ C0014.f3) + 1751530;
                        }
                    } else if (C0016.f9 <= 0) {
                        C0013.f2 = 74;
                        iM731 = C0017.m731("ۦ۠ۡ");
                    } else {
                        str3 = "۠۟";
                        iM731 = C0013.m105(str3);
                    }
                    break;
                case 1747745:
                    if (C0017.m717() < 0) {
                        str4 = "ۨۨۧ";
                        iM731 = C0013.m105(str4);
                    } else {
                        str = "ۣ۟ۨ";
                        iM731 = C0015.m573(str);
                    }
                    break;
                case 1747839:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, true, true);
                    iM731 = (C0015.f6 * C0017.f10) + 1287240;
                    break;
                case 1747928:
                    livePlayActivity = livePlayActivity2;
                    livePlayActivity2 = livePlayActivity;
                    iM731 = (C0014.f3 - C0013.f2) + 1755555;
                    break;
                case 1748708:
                    i7++;
                    if ((C0013.f2 ^ (C0017.f10 % 8559)) >= 0) {
                        C0016.m574();
                        livePlayActivity = livePlayActivity2;
                        str2 = "ۦۡ۠";
                        livePlayActivity2 = livePlayActivity;
                        iM731 = C0015.m573(str2);
                    } else {
                        iM731 = C0017.m731("ۨۧۥ");
                    }
                    break;
                case 1748862:
                    if (i == 0) {
                        this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 4));
                        f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        if (C0016.m574() >= 0) {
                            C0013.m114();
                            iM731 = C0014.m240("ۨۨۧ");
                        } else {
                            str3 = "ۣۡۡ";
                            iM731 = C0013.m105(str3);
                        }
                    } else if (C0014.m245() < 0) {
                        str3 = "ۣۤ۟";
                        iM731 = C0013.m105(str3);
                    } else {
                        str4 = "ۨۨۡ";
                        iM731 = C0013.m105(str4);
                    }
                    break;
                case 1748863:
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.getClass();
                    i3 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = i;
                    i4 = i3;
                    iM731 = C0015.m573("ۣۡ");
                    break;
                case 1749700:
                    if (C0017.f10 * (C0014.f3 - 9045) <= 0) {
                        C0013.m114();
                        str4 = "ۥۦ";
                        iM731 = C0013.m105(str4);
                    } else {
                        iM731 = (C0013.f2 | C0015.f6) ^ (-56539);
                    }
                    break;
                case 1749733:
                    i2 = i5;
                    if (C0017.f10 >= 0) {
                        C0017.m717();
                        str5 = "ۧۦۨ";
                        i5 = i2;
                    } else {
                        str5 = "ۥۥۢ";
                        i5 = i2;
                    }
                    iM731 = C0017.m731(str5);
                    break;
                case 1750571:
                case 1750786:
                    iM731 = (C0013.f2 | C0013.f2) + 55395;
                    break;
                case 1750595:
                    iM731 = C0014.f3 >= 0 ? C0015.m573("۠ۥۤ") : (C0013.f2 % C0015.f6) + 1747426;
                    break;
                case 1750689:
                    if (C0014.m245() < 0) {
                        str4 = "ۨۨۡ";
                        iM731 = C0013.m105(str4);
                    } else {
                        str3 = "ۣۤ۟";
                        iM731 = C0013.m105(str3);
                    }
                    break;
                case 1751530:
                    if ((C0015.f6 | (C0016.f9 / (-3939))) >= 0) {
                        C0017.f10 = 18;
                        iM731 = C0017.m731("ۨۨ۠");
                    } else {
                        str2 = "۠ۦ";
                        livePlayActivity = livePlayActivity2;
                        livePlayActivity2 = livePlayActivity;
                        iM731 = C0015.m573(str2);
                    }
                    break;
                case 1751748:
                    ArrayList arrayList2 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (C0015.m570() <= 0) {
                        C0013.f2 = 61;
                        iM731 = C0015.m573("۠۟");
                    } else {
                        iM731 = C0016.m618("ۨۧۧ");
                    }
                    break;
                case 1752614:
                    iM731 = C0016.m618("ۧۥ۠");
                    break;
                case 1752642:
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2 = this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    ArrayList arrayList3 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) livePlayActivity2.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(i)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2.getClass();
                    iM731 = (C0015.f6 ^ C0013.f2) + 1752233;
                    arrayList = arrayList3;
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2;
                    break;
                case 1752736:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    iM731 = (C0015.f6 % C0016.f9) + 1754274;
                    break;
                case 1753477:
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 20;
                        iM731 = C0014.m240("ۥۢ۟");
                    } else {
                        str = "ۨۢ";
                        iM731 = C0015.m573(str);
                    }
                    break;
                case 1753479:
                case 1753605:
                    if (C0015.f6 >= 0) {
                        C0013.f2 = 75;
                        iM731 = C0016.m618("ۢ۟۠");
                    } else {
                        iM731 = C0013.f2 + C0013.f2 + 1747062;
                    }
                    break;
                case 1753664:
                    if (i != 0) {
                        if (i != 2) {
                            if (C0017.m717() >= 0) {
                                C0014.m245();
                                iM731 = C0014.m240("ۡۡ");
                            } else {
                                iM731 = C0013.f2 + C0013.f2 + 1752699;
                            }
                        } else if (C0017.m717() < 0) {
                            str = "ۣ۟ۨ";
                            iM731 = C0015.m573(str);
                        } else {
                            str4 = "ۨۨۧ";
                            iM731 = C0013.m105(str4);
                        }
                    } else if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM731 = C0017.m731("ۣۧ۠");
                    } else {
                        str4 = "۠ۥۤ";
                        iM731 = C0013.m105(str4);
                    }
                    break;
                case 1753665:
                    break;
                case 1754440:
                    this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
                    this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1358O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    iM731 = (C0016.f9 * C0016.f9) ^ 1266670;
                    break;
                case 1754499:
                    iM731 = C0013.m114() >= 0 ? C0013.m105("۟ۥ") : (C0016.f9 % C0014.f3) ^ 1753761;
                    break;
                case 1754507:
                    if (C0013.f2 <= 0) {
                        C0017.f10 = 28;
                        i3 = i4;
                        i7 = i6;
                        i4 = i3;
                        iM731 = C0015.m573("ۣۡ");
                    } else {
                        iM731 = (C0013.f2 / C0014.f3) + 56299;
                        i7 = i6;
                    }
                    break;
                case 1754562:
                    if (i != -1) {
                        livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        if (i < livePlayActivity.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size()) {
                            livePlayActivity2 = livePlayActivity;
                            iM731 = (C0014.f3 - C0013.f2) + 1755555;
                        } else if (C0017.f10 % (C0014.f3 | (-706)) >= 0) {
                            C0016.f9 = 54;
                            livePlayActivity2 = livePlayActivity;
                            iM731 = C0015.m573("ۨۨۡ");
                        } else {
                            str2 = "ۦۡ۠";
                            livePlayActivity2 = livePlayActivity;
                            iM731 = C0015.m573(str2);
                        }
                    } else if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM731 = C0014.m240("ۢۥۤ");
                    } else {
                        str3 = "ۦۧۢ";
                        iM731 = C0013.m105(str3);
                    }
                    break;
                case 1754627:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 74;
                        iM731 = C0017.m731("ۦ۠ۡ");
                    } else {
                        str3 = "۠۟";
                        iM731 = C0013.m105(str3);
                    }
                    break;
                case 1755341:
                    if (C0013.f2 <= 0) {
                        C0015.f6 = 77;
                        iM731 = C0014.m240("ۣۤۢ");
                    } else {
                        str6 = "ۣۦۦ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM731 = C0014.m240(str6);
                    }
                    break;
                case 1755461:
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.notifyItemChanged(i4);
                    i2 = i5;
                    i5 = i2;
                    iM731 = C0017.m731("ۦ۠");
                    break;
                case 1755495:
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.notifyItemChanged(i5);
                    if (C0015.f6 >= 0) {
                        C0015.f6 = 2;
                        iM731 = C0016.m618("ۨۧۧ");
                    } else {
                        iM731 = (C0016.f9 % C0015.f6) + 1752442;
                    }
                    break;
                case 1755590:
                    iM731 = (C0014.f3 * C0015.f6) ^ 1788021;
                    break;
                case 1755592:
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.notifyDataSetChanged();
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        if (C0016.m574() >= 0) {
                            C0015.m570();
                            iM731 = C0014.m240("ۢۥۤ");
                        } else {
                            str3 = "ۦۧۢ";
                            iM731 = C0013.m105(str3);
                        }
                    } else if ((C0014.f3 | (C0015.f6 * 897)) >= 0) {
                        C0017.f10 = 52;
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM731 = C0014.m240("ۧۥ۠");
                    } else {
                        str6 = "ۦۧۡ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM731 = C0014.m240(str6);
                    }
                    break;
                case 1755616:
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM731 = C0017.m731("ۣۧ۠");
                    } else {
                        str4 = "۠ۥۤ";
                        iM731 = C0013.m105(str4);
                    }
                    break;
                case 1755617:
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    if (i == 1 || i == 6) {
                        str4 = "۠ۨ";
                        iM731 = C0013.m105(str4);
                    } else {
                        iM731 = C0017.m717() >= 0 ? C0016.m618("ۥۤۥ") : C0014.m240("ۣ۟ۡ");
                    }
                    break;
                case 1755623:
                    i6 = 0;
                    if ((C0016.f9 ^ (C0014.f3 ^ 3735)) < 0) {
                        str5 = "ۣۧۧ";
                        iM731 = C0017.m731(str5);
                    } else {
                        C0016.f9 = 49;
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        str6 = "ۦۧۡ";
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        iM731 = C0014.m240(str6);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        int iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        String str;
        String str2;
        ViewGroup.LayoutParams layoutParams;
        String str3;
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = null;
        ViewGroup.LayoutParams layoutParams4 = null;
        TextPaint textPaint = null;
        int i = 0;
        int iM105 = C0013.m105("ۣ۟ۤ");
        while (true) {
            switch (iM105) {
                case 56323:
                    ViewGroup.LayoutParams layoutParams5 = this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getLayoutParams();
                    if (C0013.f2 + (C0016.f9 | (-5592)) >= 0) {
                        C0016.m574();
                        layoutParams3 = layoutParams5;
                        iM105 = C0014.m240("ۡۥۧ");
                    } else {
                        layoutParams3 = layoutParams5;
                        iM105 = (C0015.f6 | C0015.f6) + 1747579;
                    }
                    break;
                case 56505:
                    this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setLayoutParams(layoutParams3);
                    iM105 = (C0017.f10 % C0015.f6) + 1753657;
                    break;
                case 1746757:
                    if ((C0017.f10 ^ (C0016.f9 + 4642)) >= 0) {
                        str = "۠ۢۢ";
                        iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i;
                        i = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM105 = C0015.m573(str);
                    } else {
                        iM105 = (C0017.f10 | C0014.f3) ^ (-1750749);
                    }
                    break;
                case 1746904:
                    layoutParams4.width = (int) textPaint.measureText(C0013.m153(f8short, 1911, 9, 1857));
                    if (C0014.f3 * (C0016.f9 + 9940) >= 0) {
                        C0013.f2 = 87;
                        iM105 = C0015.m573("ۦۢ۠");
                    }
                    break;
                case 1746967:
                    this.f3288O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = new TextView(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    iM105 = (C0014.f3 ^ C0015.f6) ^ 1752888;
                    break;
                case 1746970:
                    layoutParams3.width = (int) textPaint.measureText(C0013.m153(f8short, 1920, 9, 3009));
                    iM105 = C0017.f10 * (C0017.f10 | 659) <= 0 ? C0013.m105("۟ۨۧ") : (C0017.f10 | C0015.f6) + 57114;
                    break;
                case 1746974:
                    break;
                case 1748741:
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        iM105 = C0016.m618("ۧۢۥ");
                    } else {
                        iM105 = C0014.m240("ۥ۟ۨ");
                    }
                    break;
                case 1748803:
                    TextPaint paint = this.f3288O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getPaint();
                    if ((C0014.f3 | (C0017.f10 ^ 6393)) >= 0) {
                        C0013.m114();
                        str3 = "ۣ۠";
                    } else {
                        str3 = "ۣۤۢ";
                    }
                    textPaint = paint;
                    iM105 = C0014.m240(str3);
                    break;
                case 1750536:
                    if (this.f3288O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 == null) {
                        iM105 = C0016.m574() >= 0 ? C0013.m105("ۣ۠ۡ") : C0017.f10 + C0014.f3 + 1747940;
                    } else if (C0013.f2 <= 0) {
                        C0017.m717();
                        iM105 = C0016.m618("ۧۢۥ");
                    } else {
                        iM105 = C0014.m240("ۥ۟ۨ");
                    }
                    break;
                case 1750564:
                    this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setLayoutParams(layoutParams2);
                    iM105 = (C0014.f3 * C0017.f10) + 1584004;
                    break;
                case 1750689:
                    ViewGroup.LayoutParams layoutParams6 = this.f3271O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getLayoutParams();
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 63;
                        layoutParams4 = layoutParams6;
                        iM105 = C0013.m105("۟ۡۧ");
                    } else {
                        layoutParams4 = layoutParams6;
                        iM105 = (C0013.f2 ^ C0015.f6) + 1747389;
                    }
                    break;
                case 1752462:
                    iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    if ((C0013.f2 ^ (C0016.f9 ^ (-5967))) >= 0) {
                        C0014.m245();
                        i = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM105 = C0016.m618("۟ۦ۟");
                    } else {
                        str = "ۨۥۥ";
                        i = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 1753508:
                    layoutParams = this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getLayoutParams();
                    if (C0016.f9 <= 0) {
                        C0014.m245();
                        layoutParams2 = layoutParams;
                        iM105 = C0015.m573("ۣۡۧ");
                    } else {
                        str2 = "ۧۤۡ";
                        layoutParams2 = layoutParams;
                        iM105 = C0013.m105(str2);
                    }
                    break;
                case 1754532:
                    layoutParams2.width = (int) textPaint.measureText(C0017.m693(f8short, 1929, 11, TypedValues.Custom.TYPE_STRING));
                    if (C0013.f2 * (C0015.f6 - 8351) >= 0) {
                        C0014.f3 = 14;
                        iM105 = C0013.m105("ۣ۟ۨ");
                    } else {
                        iM105 = (C0017.f10 - C0017.f10) ^ 1750564;
                    }
                    break;
                case 1755341:
                    this.f3271O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setLayoutParams(layoutParams4);
                    iM105 = C0015.f6 - (C0014.f3 ^ (-9227)) >= 0 ? C0017.m731("ۨ۟ۤ") : C0016.f9 + C0013.f2 + 54614;
                    break;
                case 1755528:
                    this.f3288O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + i);
                    if (C0013.f2 * (C0014.f3 / 8742) != 0) {
                        C0013.f2 = 15;
                        str2 = "ۣۤۢ";
                        layoutParams = layoutParams2;
                        layoutParams2 = layoutParams;
                        iM105 = C0013.m105(str2);
                    } else {
                        iM105 = (C0017.f10 * C0014.f3) + 1585833;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() {
        String str;
        int iM573 = C0015.m573("ۣۣۢ");
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        Handler handler = null;
        while (true) {
            switch (iM573) {
                case 1746849:
                    handler.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                    if (C0016.f9 > 0) {
                        str = "۠ۨۢ";
                    } else {
                        C0013.m114();
                        iM573 = C0014.m240("ۨ۟ۦ");
                    }
                    break;
                case 1747654:
                    iM573 = (C0014.f3 | C0015.f6) + 1750693;
                    continue;
                case 1747930:
                    return;
                case 1749640:
                    handler.removeCallbacks(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    iM573 = (C0014.f3 % C0014.f3) ^ 1746849;
                    continue;
                case 1750628:
                    Handler handler2 = this.f3277O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    iM573 = (-1756175) ^ (C0015.f6 + C0015.f6);
                    handler = handler2;
                    continue;
                case 1755343:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f3287O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                    if (C0016.f9 * (C0014.f3 + 4885) > 0) {
                        str = "ۢۡۧ";
                    } else {
                        C0016.m574();
                        str = "۟ۤۦ";
                    }
                    break;
                default:
                    continue;
            }
            iM573 = C0015.m573(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(int i) {
        String str;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        PopupWindow popupWindow;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        LivePlayActivity livePlayActivity;
        ArrayList arrayList3;
        String str9;
        String str10;
        int i3 = 0;
        LivePlayActivity livePlayActivity2 = null;
        int visibility = 0;
        Handler handler = null;
        PopupWindow popupWindow2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        int i4 = 0;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList7 = null;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        int i7 = 0;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        int i8 = 0;
        int i9 = 0;
        int iM240 = C0014.m240("ۥۣۥ");
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = null;
        ArrayList arrayList10 = null;
        while (true) {
            switch (iM240) {
                case 56291:
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.notifyDataSetChanged();
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(0);
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    iM240 = (C0013.f2 ^ (C0015.f6 + 9840)) <= 0 ? C0013.m105("ۦ۠ۤ") : C0015.m573("ۢۢۢ");
                    break;
                case 56327:
                    break;
                case 56351:
                    str8 = "۠ۢۨ";
                    iM240 = C0014.m240(str8);
                    break;
                case 56511:
                case 56545:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        str9 = "۟ۡۥ";
                        arrayList3 = arrayList7;
                        arrayList7 = arrayList3;
                        iM240 = C0015.m573(str9);
                    } else {
                        iM240 = (C0015.f6 / C0014.f3) + 1755432;
                    }
                    break;
                case 56513:
                case 56541:
                    str = "ۢ۠ۧ";
                    i2 = i9;
                    iM240 = C0014.m240(str);
                    i9 = i2;
                    break;
                case 56514:
                    if (popupWindow2.isShowing()) {
                        iM240 = (C0013.f2 * C0016.f9) + 1022440;
                    } else {
                        popupWindow = popupWindow2;
                        if (C0013.f2 % (C0016.f9 ^ 4639) <= 0) {
                            str7 = "ۣۢۤ";
                            popupWindow2 = popupWindow;
                            iM240 = C0016.m618(str7);
                        } else {
                            popupWindow2 = popupWindow;
                            iM240 = 1754021 + (C0017.f10 ^ C0016.f9);
                        }
                    }
                    break;
                case 56544:
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.getClass();
                    arrayList3 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    arrayList3.clear();
                    if (C0015.f6 >= 0) {
                        C0015.m570();
                        arrayList7 = arrayList3;
                        iM240 = C0015.m573("ۦۣۢ");
                    } else {
                        str9 = "ۣۡ۠";
                        arrayList7 = arrayList3;
                        iM240 = C0015.m573(str9);
                    }
                    break;
                case 1746721:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f910O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    arrayList9.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
                    int i10 = i9 + 1;
                    if (C0016.f9 + (C0015.f6 ^ 339) >= 0) {
                        C0016.m574();
                        i8 = i10;
                        iM240 = C0013.m105("ۦۤۡ");
                    } else {
                        i8 = i10;
                        iM240 = C0016.m618("ۦۡۡ");
                    }
                    break;
                case 1746906:
                    iM240 = C0017.f10 + (C0015.f6 % 8986) >= 0 ? C0013.m105("ۦۦۡ") : (C0014.f3 - C0016.f9) + 1752711;
                    break;
                case 1747652:
                    popupWindow = popupWindow2;
                    if (C0013.f2 % (C0016.f9 ^ 4639) <= 0) {
                        str7 = "ۣۢۤ";
                        popupWindow2 = popupWindow;
                        iM240 = C0016.m618(str7);
                    } else {
                        popupWindow2 = popupWindow;
                        iM240 = 1754021 + (C0017.f10 ^ C0016.f9);
                    }
                    break;
                case 1747679:
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) arrayList5.get(i6);
                    arrayList6.add(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                    i5 = i6 + 1;
                    if (C0014.m245() >= 0) {
                        C0016.m574();
                        arrayList = arrayList8;
                        arrayList2 = arrayList9;
                        str3 = "ۣۨۡ";
                        arrayList8 = arrayList;
                        arrayList9 = arrayList2;
                        iM240 = C0016.m618(str3);
                    } else {
                        iM240 = (C0013.f2 ^ C0017.f10) + 1750220;
                    }
                    break;
                case 1747685:
                    livePlayActivity2.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(true, this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getContentView());
                    iM240 = C0014.m240("ۤۥۨ");
                    break;
                case 1747718:
                    handler.post(livePlayActivity2.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                    if (C0013.f2 > 0) {
                        str6 = "ۥ۠ۦ";
                        iM240 = C0013.m105(str6);
                    } else {
                        C0016.m574();
                        str4 = "۟۠ۢ";
                        iM240 = C0017.m731(str4);
                    }
                    break;
                case 1747750:
                case 1749790:
                    if (C0013.f2 % (C0014.f3 * (-400)) <= 0) {
                        C0013.m114();
                        str = "ۢۦۡ";
                        i2 = i9;
                        iM240 = C0014.m240(str);
                        i9 = i2;
                    } else {
                        iM240 = (C0016.f9 % C0014.f3) + 1750650;
                    }
                    break;
                case 1747838:
                    ArrayList arrayList11 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f938O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    ArrayList arrayList12 = new ArrayList();
                    iM240 = (C0017.f10 | C0015.f6) ^ (-1753988);
                    arrayList6 = arrayList12;
                    arrayList5 = arrayList11;
                    i4 = 0;
                    break;
                case 1748734:
                    arrayList7.addAll(arrayList10);
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.notifyDataSetChanged();
                    iM240 = (C0014.f3 - C0014.f3) + 1753604;
                    break;
                case 1749609:
                    if (i9 < arrayList8.size()) {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList8.get(i9);
                        if (C0016.f9 - (C0017.f10 / (-5069)) <= 0) {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
                            iM240 = C0016.m618("ۢۢۧ");
                        } else {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3;
                            iM240 = (C0015.f6 * C0017.f10) ^ 1952471;
                        }
                    } else if (C0014.m245() >= 0) {
                        iM240 = C0014.m240("ۧۡۢ");
                    } else {
                        str9 = "ۦۤۦ";
                        arrayList3 = arrayList7;
                        arrayList7 = arrayList3;
                        iM240 = C0015.m573(str9);
                    }
                    break;
                case 1749666:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    if (C0013.f2 <= 0) {
                        C0013.m114();
                        iM240 = C0013.m105("ۦۨ");
                    } else {
                        iM240 = (C0013.f2 / C0013.f2) + 56326;
                    }
                    break;
                case 1749671:
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                        iM240 = (C0017.f10 | C0016.f9) + 1748051;
                    } else if (C0017.m717() >= 0) {
                        iM240 = C0014.m240("ۣ۠۟");
                    } else {
                        str5 = "ۢۦ۠";
                        iM240 = C0017.m731(str5);
                    }
                    break;
                case 1749788:
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        iM240 = C0016.m618("ۦۧ");
                    } else {
                        str10 = "ۦۥ";
                        iM240 = C0013.m105(str10);
                    }
                    break;
                case 1749850:
                    iM240 = C0017.f10 + C0014.f3 + 57324;
                    i6 = i5;
                    break;
                case 1750540:
                    handler.post(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                    if (C0016.m574() < 0) {
                        str8 = "ۦۣۥ";
                        iM240 = C0014.m240(str8);
                    } else {
                        C0015.m570();
                        str5 = "ۢۦ۠";
                        iM240 = C0017.m731(str5);
                    }
                    break;
                case 1750694:
                    ArrayList arrayList13 = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.f1201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    arrayList13.clear();
                    arrayList13.addAll(arrayList4);
                    livePlayActivity = livePlayActivity2;
                    iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i3;
                    livePlayActivity2 = livePlayActivity;
                    i3 = iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    iM240 = C0014.m240("۟ۢ");
                    break;
                case 1750750:
                    str4 = "ۧۤ";
                    iM240 = C0017.m731(str4);
                    break;
                case 1750812:
                    if ((C0014.f3 ^ (C0016.f9 | (-5833))) <= 0) {
                        C0015.m570();
                        iM240 = C0014.m240("ۥۡۢ");
                        i9 = i7;
                    } else {
                        str = "ۢ۠ۧ";
                        i2 = i7;
                        iM240 = C0014.m240(str);
                        i9 = i2;
                    }
                    break;
                case 1750814:
                    if (i6 >= arrayList5.size()) {
                        iM240 = C0015.f6 >= 0 ? C0016.m618("ۡۨۤ") : (C0015.f6 - C0016.f9) + 1754929;
                    } else {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i6;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4;
                        str3 = "۠۠۟";
                        iM240 = C0016.m618(str3);
                    }
                    break;
                case 1751687:
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.update();
                    visibility = livePlayActivity2.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility();
                    handler = this.f3277O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    if (C0015.f6 < 0) {
                        str7 = "ۦۧۡ";
                        popupWindow = popupWindow2;
                        popupWindow2 = popupWindow;
                        iM240 = C0016.m618(str7);
                    } else {
                        C0017.f10 = 0;
                        str6 = "ۢ۠ۧ";
                        iM240 = C0013.m105(str6);
                    }
                    break;
                case 1752491:
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.showAtLocation(livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 8388629, 0, 0);
                    popupWindow = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    if (popupWindow != null) {
                        if (C0014.m245() >= 0) {
                            C0014.f3 = 23;
                            str2 = "ۦ۠ۧ";
                        } else {
                            str2 = "ۦۨ";
                        }
                        int iM618 = C0016.m618(str2);
                        popupWindow2 = popupWindow;
                        iM240 = iM618;
                    } else if (C0013.f2 % (C0016.f9 ^ 4639) <= 0) {
                        str7 = "ۣۢۤ";
                        popupWindow2 = popupWindow;
                        iM240 = C0016.m618(str7);
                    } else {
                        popupWindow2 = popupWindow;
                        iM240 = 1754021 + (C0017.f10 ^ C0016.f9);
                    }
                    break;
                case 1752518:
                    if (C0014.m245() >= 0) {
                        iM240 = C0014.m240("ۧۡۢ");
                    } else {
                        str9 = "ۦۤۦ";
                        arrayList3 = arrayList7;
                        arrayList7 = arrayList3;
                        iM240 = C0015.m573(str9);
                    }
                    break;
                case 1752577:
                    iM240 = (C0015.f6 - C0014.f3) ^ (-1752099);
                    break;
                case 1752583:
                    f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = i;
                    iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    livePlayActivity = this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0015.f6 + (C0017.f10 % 6997) >= 0) {
                        C0016.f9 = 22;
                        livePlayActivity2 = livePlayActivity;
                        i3 = iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        iM240 = C0014.m240("۟ۢ");
                    } else {
                        livePlayActivity2 = livePlayActivity;
                        i3 = iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        iM240 = (C0016.f9 | C0014.f3) + 1753731;
                    }
                    break;
                case 1753450:
                    iM240 = (C0017.f10 | C0016.f9) + 1748051;
                    break;
                case 1753453:
                    if (C0013.m114() >= 0) {
                        C0013.m114();
                        str8 = "ۣۥۦ";
                        iM240 = C0014.m240(str8);
                    } else {
                        iM240 = (C0014.f3 - C0016.f9) + 1753607;
                    }
                    break;
                case 1753478:
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM240 = C0015.m573("ۢۢۢ");
                        i9 = i8;
                    } else {
                        iM240 = (C0016.f9 / C0015.f6) ^ (-1750751);
                        i9 = i8;
                    }
                    break;
                case 1753511:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList4.get(0)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList6;
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2 = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    ArrayList arrayList14 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList4.get(0)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (C0015.f6 * (C0015.f6 ^ 7974) <= 0) {
                        C0013.m114();
                        o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2;
                        arrayList10 = arrayList14;
                        iM240 = C0015.m573("ۣ۟ۨ");
                    } else {
                        o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo2;
                        arrayList10 = arrayList14;
                        iM240 = (C0016.f9 | C0014.f3) + 56759;
                    }
                    break;
                case 1753513:
                    if (C0015.f6 >= 0) {
                    }
                    break;
                case 1753516:
                    if (i3 != 2) {
                        str5 = "۠۠ۥ";
                        iM240 = C0017.m731(str5);
                    } else if (C0017.f10 + (C0015.f6 % 8986) >= 0) {
                    }
                    break;
                case 1753544:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    ArrayList arrayList15 = livePlayActivity2.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (C0015.f6 >= 0) {
                        C0014.m245();
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        arrayList4 = arrayList15;
                        iM240 = C0014.m240("ۥۣۥ");
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        arrayList4 = arrayList15;
                        iM240 = (C0014.f3 * C0013.f2) ^ (-1589629);
                    }
                    break;
                case 1753569:
                    String str11 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i9;
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str11;
                    iM240 = (C0015.f6 % C0014.f3) + 1746900;
                    break;
                case 1753571:
                    iM240 = (C0013.f2 - C0016.f9) + 1750723;
                    i6 = i4;
                    break;
                case 1753576:
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList4.get(2)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList9;
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 = this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2.getClass();
                    if (C0014.f3 >= 0) {
                        o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2;
                        iM240 = C0014.m240("۠۠۟");
                    } else {
                        o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2;
                        iM240 = (C0013.f2 + C0013.f2) ^ 1749422;
                    }
                    break;
                case 1753604:
                    LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, true, true);
                    if ((C0013.f2 ^ (C0014.f3 % 6673)) >= 0) {
                        C0014.m245();
                        str10 = "ۧۤ";
                        iM240 = C0013.m105(str10);
                    } else {
                        iM240 = (C0016.f9 % C0014.f3) ^ 1755534;
                    }
                    break;
                case 1753664:
                    if (visibility != 0 || !livePlayActivity2.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) {
                        iM240 = (C0015.f6 - C0014.f3) ^ (-1752099);
                    } else if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM240 = C0014.m240("ۦۢۨ");
                    } else {
                        iM240 = (C0017.f10 + C0017.f10) ^ (-1748718);
                    }
                    break;
                case 1755434:
                    arrayList = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    arrayList2 = new ArrayList();
                    i7 = 0;
                    if (C0017.m717() >= 0) {
                        arrayList8 = arrayList;
                        arrayList9 = arrayList2;
                        iM240 = C0014.m240("۠ۧ");
                    } else {
                        str3 = "ۣۨۡ";
                        arrayList8 = arrayList;
                        arrayList9 = arrayList2;
                        iM240 = C0016.m618(str3);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    public final void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        String str;
        String str2;
        int iM573 = C0015.m573("۠ۦۡ");
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = null;
        while (true) {
            switch (iM573) {
                case 56537:
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    if (C0013.m114() >= 0) {
                    }
                    iM573 = C0013.m105("ۣۢ۠");
                    break;
                case 1747686:
                    this.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.show();
                    if (C0015.f6 / (C0017.f10 * (-2778)) == 0) {
                        str = "۠ۡۡ";
                        iM573 = C0013.m105(str);
                    } else {
                        C0016.f9 = 57;
                        iM573 = C0013.m105("۠۠ۦ");
                    }
                    break;
                case 1747712:
                    O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2 = this.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                    if (C0015.m570() <= 0) {
                        C0013.m114();
                        iM573 = C0017.m731("ۣ۠ۦ");
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2;
                    } else {
                        iM573 = 1747888 + (C0017.f10 | C0013.f2);
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo2;
                    }
                    break;
                case 1747774:
                    if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3178O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 5) {
                        if (C0017.m717() >= 0) {
                            str2 = "۠ۦۡ";
                            iM573 = C0014.m240(str2);
                        } else {
                            iM573 = C0017.m731("ۧ۠");
                        }
                    } else if (C0014.f3 >= 0) {
                        str = "ۤۦۥ";
                        iM573 = C0013.m105(str);
                    } else {
                        iM573 = (C0013.f2 | C0015.f6) + 1748032;
                    }
                    break;
                case 1747867:
                    if (this.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo == null) {
                        iM573 = (C0015.f6 % C0015.f6) + 1751556;
                    } else if (C0017.f10 % (C0013.f2 % (-5591)) >= 0) {
                        C0014.f3 = 73;
                        iM573 = C0013.m105("ۢ۟ۥ");
                    } else {
                        iM573 = C0017.m731("ۣ۠ۦ");
                    }
                    break;
                case 1747935:
                    break;
                case 1749695:
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    str2 = "۠ۨۧ";
                    iM573 = C0014.m240(str2);
                    break;
                case 1750569:
                    this.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    iM573 = C0013.m105("۠۠ۦ");
                    break;
                case 1750630:
                    if (C0017.f10 % (C0013.f2 % (-5591)) >= 0) {
                        C0014.f3 = 73;
                        iM573 = C0013.m105("ۢ۟ۥ");
                    } else {
                        iM573 = C0017.m731("ۣ۠ۦ");
                    }
                    break;
                case 1750786:
                    iM573 = C0015.f6 % (C0013.f2 + (-3482)) >= 0 ? C0013.m105("۟۠ۢ") : (C0014.f3 - C0013.f2) ^ (-1748930);
                    break;
                case 1751556:
                    this.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0014.f3 >= 0) {
                        C0013.f2 = 87;
                        iM573 = C0016.m618("۠ۡۡ");
                    } else {
                        str2 = "ۣ۠ۦ";
                        iM573 = C0014.m240(str2);
                    }
                    break;
                case 1754375:
                    if (C0014.f3 >= 0) {
                        str = "ۤۦۥ";
                        iM573 = C0013.m105(str);
                    } else {
                        iM573 = (C0013.f2 | C0015.f6) + 1748032;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    public final void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() {
        CustomRecyclerView customRecyclerView;
        String str;
        String str2;
        String str3;
        String str4;
        int iM105 = C0013.m105("ۧۧ");
        CustomRecyclerView customRecyclerView2 = null;
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = null;
        int iIntValue = 0;
        while (true) {
            switch (iM105) {
                case 56390:
                    if (C0013.m114() >= 0) {
                        C0015.m570();
                        str3 = "ۨۥۨ";
                    } else {
                        str3 = "ۧۧ";
                    }
                    iM105 = C0015.m573(str3);
                    break;
                case 56444:
                    customRecyclerView2.setSelection(iIntValue);
                    if (C0014.f3 + (C0017.f10 | 6454) >= 0) {
                        C0013.f2 = 97;
                        iM105 = C0015.m573("ۡ۠ۨ");
                    } else {
                        iM105 = (C0014.f3 * C0013.f2) + 1947942;
                    }
                    break;
                case 56448:
                    iIntValue = ((Integer) Hawk.get(C0014.m250(f8short, 1940, 10, 3270), 0)).intValue();
                    if ((C0015.f6 ^ (C0013.f2 / 8611)) >= 0) {
                        C0013.m114();
                        iM105 = C0015.m573("ۧۡۤ");
                    } else {
                        customRecyclerView = customRecyclerView2;
                        str = "ۦۦۨ";
                        iM105 = C0016.m618(str);
                        customRecyclerView2 = customRecyclerView;
                    }
                    break;
                case 56539:
                    if (o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3186O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3010O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo != 2) {
                        if (C0013.f2 / (C0013.f2 | 1674) != 0) {
                            C0013.f2 = 38;
                            iM105 = C0015.m573("ۢۨ");
                        } else {
                            iM105 = C0014.m240("ۥۤۦ");
                        }
                    } else if (C0016.m574() >= 0) {
                        C0016.f9 = 9;
                        str2 = "ۡۦۢ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = (C0016.f9 | C0016.f9) + 1753728;
                    }
                    break;
                case 56544:
                    if (this.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null) {
                        iM105 = (C0017.f10 | C0015.f6) ^ (-1752133);
                    } else if (C0015.f6 - (C0017.f10 / (-8535)) >= 0) {
                        C0013.f2 = 95;
                        iM105 = C0016.m618("ۦۤۦ");
                    } else {
                        iM105 = (C0016.f9 * C0017.f10) + 2362800;
                    }
                    break;
                case 1746935:
                    o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText("");
                    if (C0017.m717() >= 0) {
                        C0017.f10 = 77;
                        iM105 = C0015.m573("ۤۤ");
                    } else {
                        iM105 = (C0015.f6 ^ C0017.f10) + 1754388;
                    }
                    break;
                case 1748649:
                    o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = this.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    str = "ۧۢ";
                    customRecyclerView = customRecyclerView2;
                    iM105 = C0016.m618(str);
                    customRecyclerView2 = customRecyclerView;
                    break;
                case 1749578:
                    this.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.show();
                    str4 = "ۡ۠ۨ";
                    iM105 = C0016.m618(str4);
                    break;
                case 1750533:
                    if (customRecyclerView2 == null) {
                        str2 = "ۧۡۤ";
                        iM105 = C0015.m573(str2);
                    } else if (C0013.m114() >= 0) {
                        C0013.f2 = 41;
                        iM105 = C0014.m240("ۥۤۦ");
                    } else {
                        iM105 = (C0015.f6 / C0016.f9) + 1754437;
                    }
                    break;
                case 1752586:
                    if (C0015.f6 - (C0017.f10 / (-8535)) >= 0) {
                        C0013.f2 = 95;
                        iM105 = C0016.m618("ۦۤۦ");
                    } else {
                        iM105 = (C0016.f9 * C0017.f10) + 2362800;
                    }
                    break;
                case 1752608:
                    str2 = "ۧۡۤ";
                    iM105 = C0015.m573(str2);
                    break;
                case 1752612:
                    this.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0016.f9 % (C0016.f9 * 8908) <= 0) {
                        C0015.m570();
                        iM105 = C0014.m240("۟ۧ۟");
                    } else {
                        iM105 = (C0016.f9 - C0016.f9) ^ 1749578;
                    }
                    break;
                case 1752615:
                    o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("");
                    if (C0013.f2 <= 0) {
                        C0016.m574();
                        str4 = "ۦۨۧ";
                    } else {
                        str4 = "۟ۧ۟";
                    }
                    iM105 = C0016.m618(str4);
                    break;
                case 1753640:
                    customRecyclerView = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3185O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (C0017.f10 >= 0) {
                        C0017.f10 = 51;
                        str = "ۦۦۨ";
                    } else {
                        str = "ۣ۟ۡ";
                    }
                    iM105 = C0016.m618(str);
                    customRecyclerView2 = customRecyclerView;
                    break;
                case 1753701:
                    if (C0016.m574() >= 0) {
                        C0016.f9 = 9;
                        str2 = "ۡۦۢ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = (C0016.f9 | C0016.f9) + 1753728;
                    }
                    break;
                case 1754437:
                    if (o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3184O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty()) {
                        str2 = "ۧۡۤ";
                        iM105 = C0015.m573(str2);
                    } else {
                        iM105 = C0016.f9 <= 0 ? C0015.m573("ۥۣۤ") : C0014.m240("ۣۣۨ");
                    }
                    break;
                case 1754442:
                    break;
                case 1754537:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if ((C0013.f2 ^ (C0017.f10 - 3073)) >= 0) {
                        iM105 = C0014.m240("ۥۣۨ");
                    } else {
                        str3 = "ۤۤ";
                        iM105 = C0015.m573(str3);
                    }
                    break;
                case 1755464:
                    customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iIntValue);
                    if (C0014.m245() >= 0) {
                        C0013.f2 = 43;
                        iM105 = C0013.m105("ۧۡ۟");
                    } else {
                        iM105 = (C0016.f9 / C0014.f3) + 56447;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        PopupWindow popupWindow = null;
        int iM731 = C0017.m731("ۤۦۥ");
        while (true) {
            switch (iM731) {
                case 56383:
                    this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.dismiss();
                    iM731 = (C0014.f3 ^ C0013.f2) + 57238;
                    break;
                case 56387:
                    break;
                case 1746968:
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 60;
                        iM731 = C0013.m105("ۣۢۨ");
                    } else {
                        iM731 = (C0013.f2 * C0015.f6) ^ (-557377);
                    }
                    break;
                case 1748616:
                    popupWindow = this.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    iM731 = (C0016.f9 ^ (C0016.f9 % 367)) <= 0 ? C0014.m240("ۤۦۥ") : C0013.m105("ۦۣۡ");
                    break;
                case 1749604:
                    if (popupWindow.isShowing()) {
                        if (C0014.m245() >= 0) {
                            C0017.m717();
                            str2 = "۟ۨۡ";
                        } else {
                            str2 = "ۢۡ";
                        }
                        iM731 = C0014.m240(str2);
                    } else if (C0013.f2 <= 0) {
                        C0014.f3 = 60;
                        iM731 = C0013.m105("ۣۢۨ");
                    } else {
                        iM731 = (C0013.f2 * C0015.f6) ^ (-557377);
                    }
                    break;
                case 1750632:
                    if (C0014.m245() >= 0) {
                        C0016.m574();
                        iM731 = C0014.m240("ۤۡ۠");
                    } else {
                        iM731 = (C0017.f10 - C0016.f9) + 1753282;
                    }
                    break;
                case 1751715:
                    if (view.getId() == R.id.mPoPuLayout) {
                        if (C0014.f3 >= 0) {
                            C0014.f3 = 84;
                            str = "ۢ۠ۢ";
                        } else {
                            str = "ۡ۟ۦ";
                        }
                        iM731 = C0015.m573(str);
                    } else if (C0013.f2 <= 0) {
                        C0014.f3 = 60;
                        iM731 = C0013.m105("ۣۢۨ");
                    } else {
                        iM731 = (C0013.f2 * C0015.f6) ^ (-557377);
                    }
                    break;
                case 1753540:
                    if (popupWindow == null) {
                        if (C0013.f2 <= 0) {
                            C0014.f3 = 60;
                            iM731 = C0013.m105("ۣۢۨ");
                        } else {
                            iM731 = (C0013.f2 * C0015.f6) ^ (-557377);
                        }
                    } else if (C0017.f10 < 0) {
                        str = "ۢ۠ۢ";
                        iM731 = C0015.m573(str);
                    } else {
                        C0015.f6 = 90;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:596:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x040e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0959 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0950 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0b87 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x081f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x0813 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0ac4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0abd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x09d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x09c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x096e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0b08 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0588 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0b7c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x0a16 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x0a09 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:0x0b66 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:0x0b61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:0x0b03 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:790:0x097a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0bd2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x0bc5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:0x09f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:0x09ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:0x0a74 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x0a67 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003d. Please report as an issue. */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        String str3;
        String str4;
        String str5;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
        int i5;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
        int i6;
        String str6;
        String str7;
        int i7;
        String str8;
        int i8;
        String str9;
        String str10;
        int i9;
        String str11;
        String str12;
        String str13;
        int i10;
        int i11;
        String str14;
        String str15;
        int i12;
        int i13;
        int i14;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int iM731 = C0017.m731("ۡۡۦ");
        while (true) {
            switch (iM731) {
                case 56358:
                case 1746970:
                    if (C0015.f6 / (C0017.f10 - 820) != 0) {
                        C0016.m574();
                        iM731 = C0015.m573("ۣ۠ۤ");
                    } else {
                        iM731 = C0016.m618("ۨۦ۟");
                    }
                    break;
                case 56418:
                    if (C0014.m245() < 0) {
                        str10 = "ۧۥۦ";
                        iM731 = C0013.m105(str10);
                    } else {
                        str11 = "ۥ۟ۤ";
                        iM731 = C0014.m240(str11);
                    }
                    break;
                case 56446:
                    iM731 = C0014.f3 < 0 ? C0013.m105("۟ۥ۟") : (C0015.f6 % C0015.f6) + 1754407;
                    break;
                case 56476:
                    if (i15 == 2) {
                        f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = 0;
                        this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                        if (C0017.f10 * (C0016.f9 - 3338) <= 0) {
                            C0017.f10 = 34;
                            iM731 = C0016.m618("ۣ۠ۨ");
                        } else {
                            iM731 = (C0017.f10 * C0016.f9) + 2362017;
                        }
                    }
                    break;
                case 56509:
                    if (i16 == 6) {
                        i13 = i16;
                        if (C0013.f2 > 0) {
                            C0014.m245();
                            str18 = "۠۟ۢ";
                            i16 = i13;
                            iM731 = C0014.m240(str18);
                        } else {
                            str19 = "ۣۦۥ";
                            i16 = i13;
                            iM731 = C0015.m573(str19);
                        }
                    } else if (C0014.f3 * (C0015.f6 | 74) <= 0) {
                        C0014.m245();
                        iM731 = C0017.m731("ۤ۠ۥ");
                    } else {
                        iM731 = (C0017.f10 / C0016.f9) + 1751588;
                    }
                    break;
                case 56574:
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    if ((C0017.f10 | (C0014.f3 ^ 1404)) >= 0) {
                        C0016.m574();
                        iM731 = C0014.m240("ۤۨ۠");
                    } else {
                        iM731 = C0014.f3 + C0016.f9 + 1752976;
                    }
                    break;
                case 1746726:
                    O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getItemCount() - 1;
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(0);
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 14;
                        iM731 = C0015.m573("ۡۧ");
                    } else {
                        str = "ۣ۠ۨ";
                        i2 = i18;
                        i3 = i17;
                        iM731 = C0017.m731(str);
                        i18 = i2;
                        i17 = i3;
                    }
                    break;
                case 1746783:
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    if (C0014.f3 - (C0015.f6 / 2234) >= 0) {
                        C0014.m245();
                        iM731 = C0014.m240("ۧۥۦ");
                    } else {
                        iM731 = (C0015.f6 % C0013.f2) + 1753220;
                    }
                    break;
                case 1746785:
                    if (i20 != 8) {
                        i11 = i22;
                        if (C0014.f3 >= 0) {
                            C0014.m245();
                            i22 = i11;
                            iM731 = C0014.m240("ۡۧ۠");
                        } else {
                            str12 = "ۦۡ۠";
                            i22 = i11;
                            iM731 = C0017.m731(str12);
                        }
                    } else {
                        str5 = "ۣۢ۟";
                        iM731 = C0015.m573(str5);
                    }
                    break;
                case 1746874:
                    i8 = i27;
                    if (C0017.m717() >= 0) {
                        C0014.m245();
                        i27 = i8;
                        iM731 = C0016.m618("۠ۢ۠");
                    } else {
                        i27 = i8;
                        iM731 = (C0017.f10 ^ C0013.f2) + 1754998;
                    }
                    break;
                case 1746877:
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    int i28 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.getClass();
                    i5 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = i28;
                    if (i5 != -1) {
                        if (C0017.f10 >= 0) {
                            iM731 = C0017.m731("ۥۣۧ");
                            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                            i21 = i5;
                        } else {
                            iM731 = (C0013.f2 / C0013.f2) ^ 1755460;
                            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                            i21 = i5;
                        }
                    } else if (C0014.f3 >= 0) {
                        C0014.m245();
                        str21 = "ۥۥۣ";
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i21 = i5;
                        iM731 = C0013.m105(str21);
                    } else {
                        iM731 = C0015.m573("ۧۨۧ");
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i21 = i5;
                    }
                    break;
                case 1746975:
                case 1750630:
                    iM731 = C0015.m573("ۥۤۢ");
                    break;
                case 1747711:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3.notifyItemChanged(i25);
                    iM731 = C0013.m114() >= 0 ? C0014.m240("ۥۢۨ") : (C0014.f3 % C0016.f9) ^ (-1747886);
                    break;
                case 1747718:
                    i2 = i18;
                    i3 = i17;
                    iM731 = (C0017.f10 % C0014.f3) ^ (-1749528);
                    i18 = i2;
                    i17 = i3;
                    break;
                case 1747750:
                case 1749672:
                case 1754661:
                    i7 = i26;
                    if (C0016.f9 <= 0) {
                        C0014.m245();
                        i26 = i7;
                        iM731 = C0017.m731("ۣۦۤ");
                    } else {
                        str12 = "ۤۤۦ";
                        i26 = i7;
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1747772:
                    i13 = i16;
                    if (C0013.f2 > 0) {
                        str19 = "ۣۦۥ";
                        i16 = i13;
                        iM731 = C0015.m573(str19);
                    } else {
                        C0014.m245();
                        str18 = "۠۟ۢ";
                        i16 = i13;
                        iM731 = C0014.m240(str18);
                    }
                    break;
                case 1747779:
                    return true;
                case 1747781:
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                    iM731 = (C0015.f6 * C0017.f10) ^ 1953361;
                    break;
                case 1747809:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2.notifyItemChanged(i22);
                    if (C0014.f3 / (C0016.f9 * (-3844)) == 0) {
                        str21 = "ۦۡ۠";
                        iM731 = C0013.m105(str21);
                    } else {
                        str23 = "ۧۨۧ";
                        iM731 = C0013.m105(str23);
                    }
                    break;
                case 1747835:
                    i7 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    if (i7 != -1) {
                        i26 = i7;
                        iM731 = C0017.m731("ۤۥۢ");
                    } else if (C0016.f9 <= 0) {
                        C0014.m245();
                        i26 = i7;
                        iM731 = C0017.m731("ۣۦۤ");
                    } else {
                        str12 = "ۤۤۦ";
                        i26 = i7;
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1747870:
                case 1750785:
                    break;
                case 1747898:
                    if (C0017.f10 - (C0017.f10 / (-3260)) >= 0) {
                        C0014.m245();
                        iM731 = C0016.m618("۟ۥ۠");
                    } else {
                        str2 = "ۤۦۧ";
                        iM731 = C0016.m618(str2);
                    }
                    break;
                case 1747902:
                    iM731 = C0017.m731("ۤۦۤ");
                    break;
                case 1748678:
                    if (keyEvent.getAction() != 0) {
                        if (C0013.m114() >= 0) {
                            str16 = "ۡۥۧ";
                            iM731 = C0013.m105(str16);
                        } else {
                            C0015.m570();
                            str14 = "ۡۧۥ";
                        }
                    } else if (i != 66) {
                        str14 = "ۣۡۤ";
                    } else if (C0014.f3 < 0) {
                    }
                    iM731 = C0016.m618(str14);
                    break;
                case 1748735:
                    if (C0014.m245() >= 0) {
                        C0015.m570();
                        iM731 = C0016.m618("ۢۡ۟");
                    } else {
                        iM731 = C0016.m618("۟۠ۧ");
                    }
                    break;
                case 1748795:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    str5 = "ۣۢۤ";
                    iM731 = C0015.m573(str5);
                    break;
                case 1748803:
                    return false;
                case 1748804:
                    if (i18 == 8) {
                        if (C0014.m245() >= 0) {
                            C0014.m245();
                            iM731 = C0017.m731("ۢۧۦ");
                        } else {
                            str20 = "ۢ۠ۥ";
                            iM731 = C0014.m240(str20);
                        }
                    } else if (C0017.f10 >= 0) {
                        C0013.m114();
                        str3 = "۟ۤۨ";
                        iM731 = C0016.m618(str3);
                    } else {
                        iM731 = (C0013.f2 ^ C0014.f3) ^ (-57261);
                    }
                    break;
                case 1748832:
                case 1750788:
                    if (C0016.f9 <= 0) {
                        C0016.f9 = 59;
                        str5 = "ۥۣ۠";
                        iM731 = C0015.m573(str5);
                    } else {
                        iM731 = (C0014.f3 ^ C0014.f3) ^ 1749703;
                    }
                    break;
                case 1748833:
                    f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getItemCount() - 1;
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(0);
                    if (C0013.f2 * (C0015.f6 - 1335) >= 0) {
                        C0013.m114();
                        i7 = i26;
                        i26 = i7;
                        iM731 = C0017.m731("ۤۥۢ");
                    } else {
                        iM731 = (C0016.f9 * C0015.f6) ^ (-1911572);
                    }
                    break;
                case 1748859:
                    i4 = i20;
                    i20 = i4;
                    iM731 = (C0015.f6 | C0013.f2) ^ (-1749727);
                    break;
                case 1748891:
                    this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                    iM731 = C0017.f10 >= 0 ? C0013.m105("ۦۡ۠") : C0016.m618("ۨۦ۟");
                    break;
                case 1748894:
                    i9 = i23;
                    str15 = "ۧۡۦ";
                    i23 = i9;
                    iM731 = C0015.m573(str15);
                    break;
                case 1749607:
                    f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = 0;
                    str8 = "ۣۡۨ";
                    i3 = i17;
                    i17 = i3;
                    iM731 = C0016.m618(str8);
                    break;
                case 1749634:
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    if (C0017.f10 + (C0015.f6 % 3219) >= 0) {
                        iM731 = C0014.m240("ۤۢۡ");
                    } else {
                        str6 = "ۣۢۨ";
                        iM731 = C0015.m573(str6);
                    }
                    break;
                case 1749694:
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    if ((C0016.f9 ^ (C0017.f10 - 329)) >= 0) {
                        C0017.m717();
                        iM731 = C0015.m573("ۣۡۨ");
                    } else {
                        iM731 = (C0016.f9 - C0015.f6) ^ 55784;
                    }
                    break;
                case 1749695:
                    if (C0015.f6 - (C0016.f9 - 307) >= 0) {
                        C0016.m574();
                        iM731 = C0015.m573("ۨۦ");
                    } else {
                        str13 = "ۤۧۡ";
                        iM731 = C0014.m240(str13);
                    }
                    break;
                case 1749703:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    i4 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    if (i4 == 1 || i4 == 6) {
                        i20 = i4;
                        iM731 = (C0015.f6 | C0013.f2) ^ (-1749727);
                    } else if (C0016.m574() >= 0) {
                        i20 = i4;
                        iM731 = C0014.m240("۟۠ۧ");
                    } else {
                        i20 = i4;
                        iM731 = (C0015.f6 ^ C0016.f9) ^ (-1746473);
                    }
                    break;
                case 1749729:
                    return true;
                case 1749825:
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    if (C0017.f10 >= 0) {
                        C0017.f10 = 58;
                        iM731 = C0014.m240("ۨۥۤ");
                    } else {
                        iM731 = (C0013.f2 | C0013.f2) ^ 1752357;
                    }
                    break;
                case 1749850:
                    if (C0017.f10 + (C0016.f9 - 3364) < 0) {
                        str5 = "ۦۧۢ";
                        iM731 = C0015.m573(str5);
                    } else {
                        C0016.f9 = 10;
                        iM731 = C0014.m240("ۨۦۢ");
                    }
                    break;
                case 1749851:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 15;
                        iM731 = C0017.m731("۠ۡۧ");
                    } else {
                        iM731 = C0015.m573("ۨ۟ۦ");
                    }
                    break;
                case 1750571:
                    this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    if (C0015.f6 + (C0016.f9 ^ (-6635)) >= 0) {
                        iM731 = C0017.m731("۠ۥ۠");
                    } else {
                        str4 = "ۤۥۤ";
                        iM731 = C0015.m573(str4);
                    }
                    break;
                case 1750598:
                    switch (i) {
                        case 19:
                            iM731 = C0017.m731("ۥۥۤ");
                            break;
                        case 20:
                            if (C0013.f2 * C0016.f9 * (-4938) > 0) {
                                iM731 = (C0013.f2 / C0016.f9) + 1752647;
                            } else {
                                C0015.f6 = 17;
                                str22 = "ۡ۠ۦ";
                                iM731 = C0014.m240(str22);
                            }
                            break;
                        case 21:
                            if (C0013.f2 <= 0) {
                                str18 = "ۣۦۡ";
                                iM731 = C0014.m240(str18);
                            } else {
                                str9 = "ۥۥۦ";
                                iM731 = C0015.m573(str9);
                            }
                            break;
                        case 22:
                            if (C0015.f6 % (C0013.f2 - 7019) < 0) {
                                iM731 = (C0016.f9 * C0013.f2) ^ 1155589;
                            } else {
                                C0016.f9 = 30;
                                str19 = "ۦۡۧ";
                                i13 = i16;
                                i16 = i13;
                                iM731 = C0015.m573(str19);
                            }
                            break;
                        case 23:
                            if (C0014.f3 < 0) {
                            }
                            break;
                        default:
                            if (C0015.m570() > 0) {
                                iM731 = (C0017.f10 + C0016.f9) ^ 1755572;
                            } else {
                                C0016.f9 = 25;
                                str15 = "ۡ۟ۢ";
                                i9 = i23;
                                i23 = i9;
                                iM731 = C0015.m573(str15);
                            }
                            break;
                    }
                    break;
                case 1750602:
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(0);
                    if (C0017.f10 - (C0017.f10 / 9798) >= 0) {
                        iM731 = C0015.m573("ۧۨ۠");
                    } else {
                        str2 = "ۨۦ";
                        iM731 = C0016.m618(str2);
                    }
                    break;
                case 1750624:
                    i12 = i15;
                    if ((C0017.f10 ^ (C0015.f6 ^ 9184)) <= 0) {
                        i15 = i12;
                        iM731 = C0016.m618("ۨۡۥ");
                    } else {
                        i15 = i12;
                        iM731 = (C0014.f3 * C0014.f3) + 10251;
                    }
                    break;
                case 1750656:
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        str16 = "ۨ۠۟";
                        iM731 = C0013.m105(str16);
                    } else {
                        iM731 = (C0015.f6 + C0014.f3) ^ (-1751805);
                    }
                    break;
                case 1750691:
                    return true;
                case 1750718:
                    f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = 2;
                    f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = 0;
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(0);
                    iM731 = C0017.m731("ۥۣۧ");
                    break;
                case 1750723:
                    iM731 = C0017.m731("ۥۥۤ");
                    break;
                case 1750750:
                    i3 = f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    if (i3 == 1) {
                        f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = i3 - 1;
                        i2 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        if (i2 == 1 || i2 == 6) {
                            iM731 = (C0017.f10 % C0014.f3) ^ (-1749528);
                            i18 = i2;
                            i17 = i3;
                        } else if ((C0015.f6 ^ (C0017.f10 / (-7161))) >= 0) {
                            C0014.f3 = 72;
                            str = "ۢ۠ۥ";
                            iM731 = C0017.m731(str);
                            i18 = i2;
                            i17 = i3;
                        } else {
                            iM731 = (C0015.f6 ^ C0013.f2) + 1749289;
                            i18 = i2;
                            i17 = i3;
                        }
                    } else if (C0013.f2 <= 0) {
                        C0016.m574();
                        str8 = "۟ۦۤ";
                        i17 = i3;
                        iM731 = C0016.m618(str8);
                    } else {
                        i17 = i3;
                        iM731 = (C0014.f3 / C0016.f9) + 1755466;
                    }
                    break;
                case 1750751:
                    O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = 0;
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.notifyItemChanged(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.getItemCount() - 1);
                    if (C0014.f3 - (C0016.f9 - 9050) <= 0) {
                        C0013.f2 = 62;
                        iM731 = C0013.m105("ۥۣۡ");
                    } else {
                        iM731 = C0014.m240("۟ۢۢ");
                    }
                    break;
                case 1750754:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(-1);
                    this.f3272O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
                    this.f3270O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1358O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    str15 = "ۤۢۡ";
                    i9 = i23;
                    i23 = i9;
                    iM731 = C0015.m573(str15);
                    break;
                case 1750786:
                    i10 = i24;
                    if ((C0015.f6 ^ (C0017.f10 - 4659)) <= 0) {
                        C0016.f9 = 29;
                        str17 = "ۧۧۧ";
                        i24 = i10;
                        iM731 = C0015.m573(str17);
                    } else {
                        i24 = i10;
                        iM731 = (C0017.f10 % C0014.f3) ^ (-1749810);
                    }
                    break;
                case 1750816:
                    iM731 = C0015.m573("ۡۧ");
                    break;
                case 1751499:
                    if (i23 == 2) {
                        int i29 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                        if (i29 > 0) {
                            f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = i29 - 1;
                            this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(i29);
                            this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                            if (C0016.f9 * (C0016.f9 ^ 9221) <= 0) {
                                iM731 = C0015.m573("ۥۥۡ");
                            } else {
                                str3 = "ۣۨۥ";
                                iM731 = C0016.m618(str3);
                            }
                        } else if (C0014.f3 * (C0016.f9 | (-8561)) <= 0) {
                            C0014.f3 = 91;
                            iM731 = C0014.m240("ۡۨۡ");
                        } else {
                            iM731 = (C0016.f9 * C0014.f3) + 1922768;
                        }
                    } else {
                        i7 = i26;
                        if (C0016.f9 <= 0) {
                            C0014.m245();
                            i26 = i7;
                            iM731 = C0017.m731("ۣۦۤ");
                        } else {
                            str12 = "ۤۤۦ";
                            i26 = i7;
                            iM731 = C0017.m731(str12);
                        }
                    }
                    break;
                case 1751529:
                case 1755343:
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 59;
                        iM731 = C0014.m240("۠ۡۡ");
                    } else {
                        iM731 = C0014.m240("ۧۢۢ");
                    }
                    break;
                case 1751558:
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        str3 = "۟ۤۨ";
                        iM731 = C0016.m618(str3);
                    } else {
                        iM731 = (C0013.f2 ^ C0014.f3) ^ (-57261);
                    }
                    break;
                case 1751562:
                    f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemCount() - 1;
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(0);
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 63;
                        iM731 = C0015.m573("ۥ۟ۦ");
                    } else {
                        iM731 = C0015.m573("ۦۡۤ");
                    }
                    break;
                case 1751585:
                    return true;
                case 1751587:
                    if (C0014.f3 + (C0016.f9 / 2443) >= 0) {
                        C0013.f2 = 14;
                        iM731 = C0015.m573("ۤۡۧ");
                    } else {
                        iM731 = (C0016.f9 ^ C0014.f3) + 1748894;
                    }
                    break;
                case 1751588:
                    iM731 = i16 == 8 ? C0015.m573("ۣۦۥ") : C0014.m240("ۣۢۤ");
                    break;
                case 1751650:
                    if (C0013.f2 <= 0) {
                        str18 = "ۣۦۡ";
                        iM731 = C0014.m240(str18);
                    } else {
                        str9 = "ۥۥۦ";
                        iM731 = C0015.m573(str9);
                    }
                    break;
                case 1751654:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    if ((C0013.f2 ^ (C0015.f6 + 9851)) <= 0) {
                        C0015.f6 = 9;
                        iM731 = C0013.m105("ۧۢۢ");
                    } else {
                        str5 = "ۤۢ۟";
                        iM731 = C0015.m573(str5);
                    }
                    break;
                case 1751681:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3.notifyItemChanged(i26);
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        iM731 = C0014.m240("ۨ۟ۦ");
                    } else {
                        iM731 = (C0016.f9 - C0016.f9) + 1751654;
                    }
                    break;
                case 1751683:
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    if (C0013.f2 % (C0016.f9 - 3895) > 0) {
                        str17 = "ۨۦ۠";
                        iM731 = C0015.m573(str17);
                    } else {
                        C0013.f2 = 91;
                        str13 = "ۧ۠ۥ";
                        iM731 = C0014.m240(str13);
                    }
                    break;
                case 1751714:
                    f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = 0;
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO4 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO4.notifyItemChanged(o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO4.getItemCount() - 1);
                    str9 = "ۣۨۨ";
                    iM731 = C0015.m573(str9);
                    break;
                case 1751717:
                case 1753450:
                    str9 = "۟ۥۣ";
                    iM731 = C0015.m573(str9);
                    break;
                case 1751742:
                case 1753423:
                case 1754568:
                    i11 = i22;
                    if (C0014.f3 >= 0) {
                        C0014.m245();
                        i22 = i11;
                        iM731 = C0014.m240("ۡۧ۠");
                    } else {
                        str12 = "ۦۡ۠";
                        i22 = i11;
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1751748:
                    str22 = "ۣۦۢ";
                    iM731 = C0014.m240(str22);
                    break;
                case 1751772:
                    if (C0013.m114() >= 0) {
                        C0014.f3 = 91;
                        iM731 = C0015.m573("۟ۡ۠");
                    } else {
                        iM731 = (C0015.f6 ^ C0013.f2) ^ (-1754049);
                    }
                    break;
                case 1752458:
                    i14 = i19;
                    i19 = i14;
                    iM731 = C0013.m105("ۨ۠ۥ");
                    break;
                case 1752460:
                case 1753665:
                    if (C0016.f9 <= 0) {
                        str20 = "ۥ۟ۨ";
                        iM731 = C0014.m240(str20);
                    } else {
                        iM731 = (C0014.f3 | C0017.f10) + 1751896;
                    }
                    break;
                case 1752487:
                case 1754623:
                    if (C0013.m114() >= 0) {
                        str16 = "ۡۥۧ";
                        iM731 = C0013.m105(str16);
                    } else {
                        C0015.m570();
                        str14 = "ۡۧۥ";
                        iM731 = C0016.m618(str14);
                    }
                    break;
                case 1752492:
                    i14 = i19;
                    i19 = i14;
                    iM731 = (C0017.f10 | C0013.f2) + 1754520;
                    break;
                case 1752518:
                    if (C0015.m570() > 0) {
                        C0016.f9 = 25;
                        str15 = "ۡ۟ۢ";
                        i9 = i23;
                        i23 = i9;
                        iM731 = C0015.m573(str15);
                    } else {
                        iM731 = (C0017.f10 + C0016.f9) ^ 1755572;
                    }
                    break;
                case 1752555:
                    if (C0017.f10 >= 0) {
                        str12 = "ۡۦۨ";
                        iM731 = C0017.m731(str12);
                    } else {
                        iM731 = (C0016.f9 % C0015.f6) + 1750518;
                    }
                    break;
                case 1752579:
                    if (C0015.f6 % (C0013.f2 - 7019) < 0) {
                        C0016.f9 = 30;
                        str19 = "ۦۡۧ";
                        i13 = i16;
                        i16 = i13;
                        iM731 = C0015.m573(str19);
                    } else {
                        iM731 = (C0016.f9 * C0013.f2) ^ 1155589;
                    }
                    break;
                case 1752581:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2;
                    i5 = i21;
                    if (C0014.f3 >= 0) {
                        C0014.m245();
                        str21 = "ۥۥۣ";
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i21 = i5;
                        iM731 = C0013.m105(str21);
                    } else {
                        iM731 = C0015.m573("ۧۨۧ");
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
                        i21 = i5;
                    }
                    break;
                case 1752585:
                case 1752641:
                    if (C0017.f10 % (C0014.f3 | 9894) >= 0) {
                        C0017.m717();
                        iM731 = C0016.m618("ۣۥۣ");
                    } else {
                        str12 = "ۨۦۢ";
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1752609:
                    i12 = f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    if (i12 == 0) {
                        f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = i12 + 1;
                        this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                        this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                        i13 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        if (i13 == 1) {
                            i15 = i12;
                            if (C0013.f2 > 0) {
                                C0014.m245();
                                str18 = "۠۟ۢ";
                                i16 = i13;
                                iM731 = C0014.m240(str18);
                            } else {
                                str19 = "ۣۦۥ";
                                i16 = i13;
                                iM731 = C0015.m573(str19);
                            }
                        } else if (C0014.m245() >= 0) {
                            C0016.m574();
                            iM731 = C0013.m105("ۣۨ۟");
                            i15 = i12;
                            i16 = i13;
                        } else {
                            iM731 = (C0017.f10 - C0014.f3) + 57052;
                            i15 = i12;
                            i16 = i13;
                        }
                    } else if ((C0017.f10 ^ (C0015.f6 ^ 9184)) <= 0) {
                        i15 = i12;
                        iM731 = C0016.m618("ۨۡۥ");
                    } else {
                        i15 = i12;
                        iM731 = (C0014.f3 * C0014.f3) + 10251;
                    }
                    break;
                case 1752611:
                    this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                    iM731 = C0016.f9 / (C0013.f2 + (-9744)) != 0 ? C0014.m240("ۤۧۧ") : (C0013.f2 % C0014.f3) + 1749655;
                    break;
                case 1752644:
                    i9 = f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    if (i9 != 0) {
                        str15 = "ۧۡۦ";
                        i23 = i9;
                        iM731 = C0015.m573(str15);
                    } else {
                        int i30 = f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                        if (i30 > 0) {
                            f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = i30 - 1;
                            this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(i30);
                            this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                            if (C0017.m717() < 0) {
                                str11 = "ۨۤ۟";
                                i23 = i9;
                                iM731 = C0014.m240(str11);
                            } else {
                                i23 = i9;
                                iM731 = C0017.m731("ۥۣۧ");
                            }
                        } else if (C0014.f3 * C0015.f6 * (-6794) >= 0) {
                            C0017.f10 = 17;
                            i23 = i9;
                            iM731 = C0013.m105("۟ۧۨ");
                        } else {
                            i23 = i9;
                            iM731 = 1156654 ^ (C0013.f2 * C0016.f9);
                        }
                    }
                    break;
                case 1752648:
                    i14 = f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    if (i14 == 0) {
                        int i31 = f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                        if (i31 < this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemCount() - 1) {
                            f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o++;
                            this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(i31);
                            this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                            i19 = i14;
                            iM731 = (C0016.f9 - C0017.f10) + 1751977;
                        } else {
                            i19 = i14;
                            iM731 = (C0017.f10 | C0013.f2) + 1754520;
                        }
                    } else {
                        i19 = i14;
                        iM731 = C0013.m105("ۨ۠ۥ");
                    }
                    break;
                case 1752673:
                    iM731 = (C0013.f2 + C0017.f10) ^ 1748552;
                    break;
                case 1752705:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    iM731 = C0014.m240("ۨۦۢ");
                    break;
                case 1752709:
                    if (i24 != 8) {
                        i7 = i26;
                        if (C0016.f9 <= 0) {
                            C0014.m245();
                            i26 = i7;
                            iM731 = C0017.m731("ۣۦۤ");
                        } else {
                            str12 = "ۤۤۦ";
                            i26 = i7;
                            iM731 = C0017.m731(str12);
                        }
                    } else if (C0016.f9 <= 0) {
                        iM731 = C0017.m731("ۥۡۢ");
                    } else {
                        str9 = "ۢۧۦ";
                        iM731 = C0015.m573(str9);
                    }
                    break;
                case 1752737:
                    iM731 = (C0014.f3 - C0014.f3) + 1747750;
                    break;
                case 1753477:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    if (C0014.m245() >= 0) {
                        C0016.f9 = 34;
                        str7 = "ۣۡۡ";
                        iM731 = C0016.m618(str7);
                    } else {
                        iM731 = (C0013.f2 | C0016.f9) ^ 1750286;
                    }
                    break;
                case 1753481:
                    this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    if (C0015.f6 - (C0016.f9 | 4740) >= 0) {
                        C0014.f3 = 2;
                        iM731 = C0017.m731("ۧۦۣ");
                    } else {
                        iM731 = C0013.f2 + C0013.f2 + 1752855;
                    }
                    break;
                case 1753485:
                case 1754596:
                    if ((C0015.f6 | (C0015.f6 + 1815)) >= 0) {
                        C0015.f6 = 25;
                        iM731 = C0017.m731("ۧ۟۟");
                    } else {
                        iM731 = (C0013.f2 + C0014.f3) ^ 1754290;
                    }
                    break;
                case 1753544:
                    if (C0014.f3 % (C0013.f2 ^ (-9154)) >= 0) {
                        C0013.f2 = 55;
                        iM731 = C0014.m240("ۨۦ۟");
                    } else {
                        iM731 = (C0016.f9 | C0015.f6) + 1748897;
                    }
                    break;
                case 1753570:
                    if ((C0013.f2 | (C0014.f3 ^ 8853)) >= 0) {
                        C0016.m574();
                        iM731 = C0017.m731("ۢۨ۠");
                    } else {
                        iM731 = (C0016.f9 % C0015.f6) + 1752385;
                    }
                    break;
                case 1753600:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 10;
                        iM731 = C0016.m618("ۣۧۦ");
                    } else {
                        iM731 = (C0015.f6 % C0013.f2) + 1747584;
                    }
                    break;
                case 1753636:
                    if (i19 != 2) {
                        i11 = i22;
                        if (C0014.f3 >= 0) {
                            C0014.m245();
                            i22 = i11;
                            iM731 = C0014.m240("ۡۧ۠");
                        } else {
                            str12 = "ۦۡ۠";
                            i22 = i11;
                            iM731 = C0017.m731(str12);
                        }
                    } else {
                        int i32 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                        if (i32 >= this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getItemCount() - 1) {
                            iM731 = C0017.m731("ۤۦۤ");
                        } else {
                            f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0++;
                            this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(i32);
                            this.f3268O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                            if (C0015.f6 < 0) {
                                iM731 = C0015.m573("۠ۧۡ");
                            } else {
                                C0015.f6 = 75;
                                str2 = "ۦ۠ۤ";
                                iM731 = C0016.m618(str2);
                            }
                        }
                    }
                    break;
                case 1753667:
                    if (C0014.f3 * (C0016.f9 | (-8561)) <= 0) {
                        C0014.f3 = 91;
                        iM731 = C0014.m240("ۡۨۡ");
                    } else {
                        iM731 = (C0016.f9 * C0014.f3) + 1922768;
                    }
                    break;
                case 1753669:
                    i9 = i23;
                    if (C0014.f3 * C0015.f6 * (-6794) >= 0) {
                        C0017.f10 = 17;
                        i23 = i9;
                        iM731 = C0013.m105("۟ۧۨ");
                    } else {
                        i23 = i9;
                        iM731 = 1156654 ^ (C0013.f2 * C0016.f9);
                    }
                    break;
                case 1753693:
                    if (C0013.f2 * C0016.f9 * (-4938) > 0) {
                        C0015.f6 = 17;
                        str22 = "ۡ۠ۦ";
                        iM731 = C0014.m240(str22);
                    } else {
                        iM731 = (C0013.f2 / C0016.f9) + 1752647;
                    }
                    break;
                case 1754406:
                    f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = 0;
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.notifyItemChanged(o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.getItemCount() - 1);
                    str15 = "ۢۡۡ";
                    i9 = i23;
                    i23 = i9;
                    iM731 = C0015.m573(str15);
                    break;
                case 1754407:
                    i8 = f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    if (i8 == 0) {
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                        if (C0017.f10 + (C0014.f3 / 6136) >= 0) {
                            C0016.f9 = 96;
                            i27 = i8;
                            iM731 = C0015.m573("ۥ۠ۢ");
                        } else {
                            i27 = i8;
                            iM731 = (C0016.f9 % C0014.f3) + 1749687;
                        }
                    } else if (C0017.m717() >= 0) {
                        C0014.m245();
                        i27 = i8;
                        iM731 = C0016.m618("۠ۢ۠");
                    } else {
                        i27 = i8;
                        iM731 = (C0017.f10 ^ C0013.f2) + 1754998;
                    }
                    break;
                case 1754412:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3;
                    i6 = i25;
                    if (C0017.f10 + C0013.f2 + 6961 <= 0) {
                        str6 = "ۣ۟";
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        i25 = i6;
                        iM731 = C0015.m573(str6);
                    } else {
                        iM731 = (C0014.f3 * C0015.f6) + 1616900;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        i25 = i6;
                    }
                    break;
                case 1754444:
                    if (i23 == 1) {
                        int i33 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        if (i33 > 0) {
                            O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = i33 - 1;
                            this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(i33);
                            this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                            if ((C0017.f10 ^ (C0015.f6 - 7751)) <= 0) {
                                iM731 = C0017.m731("ۤۢ");
                            } else {
                                str23 = "ۢۨ۠";
                                iM731 = C0013.m105(str23);
                            }
                        } else if (C0014.m245() >= 0) {
                            C0015.m570();
                            iM731 = C0016.m618("ۢۡ۟");
                        } else {
                            iM731 = C0016.m618("۟۠ۧ");
                        }
                    } else if (C0015.m570() <= 0) {
                        C0014.m245();
                        str16 = "ۨ۠۟";
                        iM731 = C0013.m105(str16);
                    } else {
                        iM731 = (C0015.f6 + C0014.f3) ^ (-1751805);
                    }
                    break;
                case 1754471:
                    return true;
                case 1754628:
                    if (i27 != 2) {
                        if (C0017.f10 >= 0) {
                            C0015.f6 = 59;
                            iM731 = C0014.m240("۠ۡۡ");
                        } else {
                            iM731 = C0014.m240("ۧۢۢ");
                        }
                    } else if ((C0013.f2 | (C0013.f2 / (-8193))) > 0) {
                        str9 = "ۣ۠ۨ";
                        iM731 = C0015.m573(str9);
                    } else {
                        str10 = "ۧ۠۟";
                        iM731 = C0013.m105(str10);
                    }
                    break;
                case 1754655:
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    this.f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    i10 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    if (i10 != 1 && i10 != 6) {
                        i24 = i10;
                        iM731 = C0017.m731("ۥۧۧ");
                    } else if ((C0015.f6 ^ (C0017.f10 - 4659)) <= 0) {
                        C0016.f9 = 29;
                        str17 = "ۧۧۧ";
                        i24 = i10;
                        iM731 = C0015.m573(str17);
                    } else {
                        i24 = i10;
                        iM731 = (C0017.f10 % C0014.f3) ^ (-1749810);
                    }
                    break;
                case 1754662:
                    i11 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    if (i11 != -1) {
                        i22 = i11;
                        iM731 = (C0017.f10 / C0017.f10) + 1747808;
                    } else if (C0014.f3 >= 0) {
                        C0014.m245();
                        i22 = i11;
                        iM731 = C0014.m240("ۡۧ۠");
                    } else {
                        str12 = "ۦۡ۠";
                        i22 = i11;
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1755340:
                    i3 = i17;
                    if (C0013.f2 <= 0) {
                        C0016.m574();
                        str8 = "۟ۦۤ";
                        i17 = i3;
                        iM731 = C0016.m618(str8);
                    } else {
                        i17 = i3;
                        iM731 = (C0014.f3 / C0016.f9) + 1755466;
                    }
                    break;
                case 1755373:
                    if (i19 == 1) {
                        int i34 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                        if (i34 < this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getItemCount() - 1) {
                            O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO++;
                            this.f3264O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.notifyItemChanged(i34);
                            this.f3267O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
                            if (C0014.m245() >= 0) {
                                C0013.f2 = 25;
                                str4 = "ۤ۟ۦ";
                                iM731 = C0015.m573(str4);
                            } else {
                                iM731 = (C0017.f10 + C0015.f6) ^ (-1754967);
                            }
                        } else {
                            str22 = "ۣۦۢ";
                            iM731 = C0014.m240(str22);
                        }
                    } else if (C0013.m114() >= 0) {
                        C0014.f3 = 91;
                        iM731 = C0015.m573("۟ۡ۠");
                    } else {
                        iM731 = (C0015.f6 ^ C0013.f2) ^ (-1754049);
                    }
                    break;
                case 1755461:
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO2.notifyItemChanged(i21);
                    if ((C0013.f2 ^ (C0015.f6 / 2991)) <= 0) {
                        C0014.m245();
                        iM731 = C0015.m573("ۣۧۨ");
                    } else {
                        str15 = "ۧۨۧ";
                        i9 = i23;
                        i23 = i9;
                        iM731 = C0015.m573(str15);
                    }
                    break;
                case 1755466:
                    if (i17 == 0) {
                        if (((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2956O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO)).f958O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty()) {
                            if (C0017.f10 >= 0) {
                                C0017.m717();
                                iM731 = C0014.m240("ۥۥۨ");
                            } else {
                                iM731 = (C0014.f3 / C0014.f3) ^ 1747778;
                            }
                        } else if (C0017.f10 >= 0) {
                            str12 = "ۡۦۨ";
                            iM731 = C0017.m731(str12);
                        } else {
                            iM731 = (C0016.f9 % C0015.f6) + 1750518;
                        }
                    } else if (C0017.f10 % (C0014.f3 | 9894) >= 0) {
                        C0017.m717();
                        iM731 = C0016.m618("ۣۥۣ");
                    } else {
                        str12 = "ۨۦۢ";
                        iM731 = C0017.m731(str12);
                    }
                    break;
                case 1755469:
                    this.f3269O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                    iM731 = C0015.f6 >= 0 ? C0014.m240("ۡۧۡ") : (C0016.f9 * C0014.f3) + 1920812;
                    break;
                case 1755491:
                    if (C0014.f3 >= 0) {
                        iM731 = C0016.m618("ۡۥۧ");
                    } else {
                        str7 = "ۦۡۨ";
                        iM731 = C0016.m618(str7);
                    }
                    break;
                case 1755527:
                    iM731 = C0017.f10 + C0013.f2 + 1754481;
                    break;
                case 1755553:
                    this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.notifyItemChanged(f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1 = this.f3266O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    int i35 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1.getClass();
                    i6 = f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = i35;
                    if (i6 != -1) {
                        if (C0016.f9 <= 0) {
                            iM731 = C0014.m240("ۨۦ۠");
                            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                            i25 = i6;
                        } else {
                            iM731 = (C0013.f2 * C0017.f10) ^ (-1098281);
                            o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                            i25 = i6;
                        }
                    } else if (C0017.f10 + C0013.f2 + 6961 <= 0) {
                        str6 = "ۣ۟";
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        i25 = i6;
                        iM731 = C0015.m573(str6);
                    } else {
                        iM731 = (C0014.f3 * C0015.f6) + 1616900;
                        o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO3 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO1;
                        i25 = i6;
                    }
                    break;
                case 1755554:
                    if (C0016.f9 - (C0015.f6 ^ 5851) <= 0) {
                        C0014.f3 = 44;
                        iM731 = C0015.m573("۠ۧۡ");
                    } else {
                        iM731 = (C0015.f6 % C0014.f3) + 1754840;
                    }
                    break;
                case 1755556:
                    return true;
                default:
                    break;
            }
        }
    }
}
