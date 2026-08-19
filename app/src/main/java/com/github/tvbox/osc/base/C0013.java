package com.github.tvbox.osc.base;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.github.tvbox.osc.ui.dialog.C0016;
import com.github.tvbox.osc.ui.dialog.C0017;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: renamed from: com.github.tvbox.osc.base.ۣۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0013 {

    /* JADX INFO: renamed from: ۟ۦ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int f2 = 900;

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m93(Object obj) {
        if (C0015.m570() > 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m94(Object obj) {
        if (C0014.m245() < 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static long m95(Object obj) {
        if (C0016.m574() < 0) {
            return ((LivePlayActivity) obj).f2995O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m96(Object obj) {
        if (C0014.m245() <= 0) {
            return ((FragmentManager) obj).getBackStackEntryCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m97(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1441O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m98(Object obj) {
        if (C0014.m245() < 0) {
            return URLEncoder.encode((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static void m99(Object obj, int i) {
        if (C0015.m570() > 0) {
            ((RecyclerView.Adapter) obj).notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m100(Object obj, Object obj2) {
        if (C0017.m717() <= 0) {
            ((RecyclerView) obj).setAdapter((RecyclerView.Adapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo m101(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) obj).f3265O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Handler m102(Object obj) {
        if (C0015.m570() >= 0) {
            return ((LoginActivity) obj).f3015O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static VideoView m103(Object obj) {
        if (C0015.m570() > 0) {
            return ((LivePlayActivity) obj).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 m104(Object obj) {
        if (C0017.m717() < 0) {
            return ((LivePlayActivity) obj).f2960O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m105(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 m106(Object obj) {
        if (C0016.m574() <= 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static LinearLayout m107(Object obj) {
        if (C0014.m245() <= 0) {
            return ((LivePlayActivity) obj).f2963O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۥ, reason: not valid java name and contains not printable characters */
    public static void m108(Object obj, int i, float f) {
        if (C0017.m717() < 0) {
            ((TextView) obj).setTextSize(i, f);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m109(Object obj) {
        if (C0015.m570() > 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m110(Object obj) {
        if (C0014.m245() <= 0) {
            return ((Activity) obj).isTaskRoot();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static View m111(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m112(Object obj, int i) {
        if (C0015.m570() >= 0) {
            return ((Resources) obj).getColor(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m113(Object obj, int i, long j) {
        if (C0016.m574() <= 0) {
            return ((Handler) obj).sendEmptyMessageDelayed(i, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m114() {
        return 293 ^ C0017.f10;
    }

    /* JADX INFO: renamed from: ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m115(Object obj) {
        if (C0015.m570() > 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m116(Object obj) {
        if (C0016.m574() < 0) {
            return ((Configuration) obj).orientation;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۨ, reason: not valid java name and contains not printable characters */
    public static WindowManager m117(Object obj) {
        if (C0014.m245() <= 0) {
            return ((Activity) obj).getWindowManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m118(Object obj) {
        if (C0015.m570() >= 0) {
            return ((Cursor) obj).moveToFirst();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۦ, reason: not valid java name and contains not printable characters */
    public static PackageManager m119(Object obj) {
        if (C0017.m717() <= 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static void m120(Object obj, int i) {
        if (C0016.m574() <= 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m121(int i) {
        if (C0017.m717() < 0) {
            return Integer.toString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static TimeZone m122(Object obj) {
        if (C0015.m570() > 0) {
            return TimeZone.getTimeZone((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m123(Object obj) {
        if (C0015.m570() >= 0) {
            ((LivePlayActivity) obj).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m124(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            return ((JSONObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m125(Object obj, int i) {
        if (C0016.m574() < 0) {
            return ((Cursor) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m126(Object obj) {
        if (C0015.m570() > 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1488O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static FragmentTransaction m127(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            return ((FragmentTransaction) obj).addToBackStack((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m128(Object obj) {
        if (C0016.m574() <= 0) {
            return ((TimeZone) obj).getRawOffset();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m129() {
        if (C0017.m717() < 0) {
            return TimeUnit.MILLISECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m130(Object obj) {
        if (C0014.m245() <= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m131(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m132(Object obj, Object obj2, Object obj3) {
        if (C0015.m570() > 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m133(int i) {
        if (C0015.m570() >= 0) {
            System.exit(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ۠, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m134(Object obj) {
        if (C0016.m574() <= 0) {
            return ((LivePlayActivity) obj).f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m135(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۡ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m136(Object obj) {
        if (C0016.m574() < 0) {
            return ((View) obj).getLayoutParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۨ, reason: not valid java name and contains not printable characters */
    public static Class m137(Object obj) {
        if (C0015.m570() >= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۥ, reason: not valid java name and contains not printable characters */
    public static TextClock m138(Object obj) {
        if (C0016.m574() < 0) {
            return ((LivePlayActivity) obj).f2975O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m139(Object obj, Object obj2) {
        if (C0015.m570() > 0) {
            return ((JSONArray) obj).put(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m140(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m141(Object obj, Object obj2) {
        if (C0017.m717() < 0) {
            ((TextClock) obj).setFormat24Hour((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m142() {
        if (C0017.m717() <= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m143(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m144(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            return ((ConcurrentHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static GradientDrawable.Orientation m145(Object obj) {
        if (C0014.m245() <= 0) {
            return GradientDrawable.Orientation.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m146(Object obj) {
        if (C0014.m245() <= 0) {
            ((HashMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m147(Object obj) {
        if (C0014.m245() <= 0) {
            ((View) obj).requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m148(Object obj, Object obj2) {
        if (C0017.m717() < 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m149(Object obj) {
        if (C0017.m717() <= 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1500O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m150(Object obj) {
        if (C0014.m245() < 0) {
            return ((Matcher) obj).find();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m151(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            return ((Calendar) obj).compareTo((Calendar) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧ۟, reason: not valid java name and contains not printable characters */
    public static FragmentManager m152(Object obj) {
        if (C0016.m574() <= 0) {
            return ((FragmentActivity) obj).getSupportFragmentManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m154() {
        if (C0014.m245() <= 0) {
            return LivePlayActivity.f2953O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static TextView m155(Object obj) {
        if (C0014.m245() <= 0) {
            return ((LivePlayActivity) obj).f2959O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static Window m156(Object obj) {
        if (C0015.m570() >= 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m157(Object obj) {
        if (C0017.m717() < 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m158(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m159() {
        if (C0014.m245() <= 0) {
            return Environment.DIRECTORY_DOCUMENTS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static TextView m160(Object obj) {
        if (C0016.m574() < 0) {
            return ((LivePlayActivity) obj).f2987O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m161(Object obj, boolean z) {
        if (C0015.m570() > 0) {
            ((LivePlayActivity) obj).O00000OOoOOO00O00o0ooooooooO000ooooO0000(z);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m162(Object obj) {
        if (C0014.m245() <= 0) {
            return ((LivePlayActivity) obj).O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m163(Object obj, int i) {
        if (C0016.m574() <= 0) {
            return ((Handler) obj).sendEmptyMessage(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m164(Object obj) {
        if (C0017.m717() < 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static ProgressBar m165(Object obj) {
        if (C0016.m574() <= 0) {
            return ((LoginActivity) obj).f3014O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 m166(Object obj) {
        if (C0015.m570() >= 0) {
            return ((LivePlayActivity) obj).f2992O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static int m167(Object obj) {
        if (C0016.m574() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m168(Object obj) {
        if (C0014.m245() <= 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۡۦۨۨ, reason: not valid java name and contains not printable characters */
    public static TextView m169(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f2977O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m170(Object obj, Object obj2) {
        if (C0017.m717() < 0) {
            ((LivePlayActivity) obj).O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m171(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            ((Calendar) obj).setTime((Date) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m172(Object obj) {
        if (C0016.m574() < 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Message m173(Object obj, int i, int i2, int i3, Object obj2) {
        if (C0014.m245() < 0) {
            return ((Handler) obj).obtainMessage(i, i2, i3, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m174() {
        if (C0015.m570() > 0) {
            System.gc();
        }
    }

    /* JADX INFO: renamed from: ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m175(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            ((Display) obj).getSize((Point) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m176(Object obj) {
        if (C0017.m717() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1503O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static HashSet m177() {
        if (C0016.m574() <= 0) {
            return LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m178(Object obj) {
        if (C0014.m245() < 0) {
            return ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) obj).f3287O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟۠, reason: not valid java name and contains not printable characters */
    public static O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o m179(Object obj) {
        if (C0017.m717() <= 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۦ۟, reason: not valid java name and contains not printable characters */
    public static void m180(Object obj) {
        if (C0015.m570() >= 0) {
            ((Throwable) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۤ۠۟۠, reason: not valid java name and contains not printable characters */
    public static Iterator m181(Object obj) {
        if (C0014.m245() <= 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m182(Object obj) {
        if (C0014.m245() <= 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m183(Object obj) {
        if (C0016.m574() <= 0) {
            return ((File) obj).canWrite();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۦ, reason: contains not printable characters */
    public static int m184(Object obj) {
        if (C0017.m717() < 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۢ۟, reason: contains not printable characters */
    public static boolean m185(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            return ((Handler) obj).sendMessage((Message) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static PopupWindow m186(Object obj) {
        if (C0016.m574() <= 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۤ, reason: contains not printable characters */
    public static TimeZone m187() {
        if (C0015.m570() > 0) {
            return TimeZone.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static void m188(Object obj, int i) {
        if (C0015.m570() >= 0) {
            ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) obj).O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i);
        }
    }

    /* JADX INFO: renamed from: ۦۢ۟۠, reason: contains not printable characters */
    public static int m189(Object obj) {
        if (C0014.m245() <= 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1457O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static Looper m190() {
        if (C0017.m717() <= 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۧ, reason: contains not printable characters */
    public static void m191(Object obj) {
        if (C0016.m574() <= 0) {
            ((LivePlayActivity) obj).O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
        }
    }

    /* JADX INFO: renamed from: ۦۦۣۨ, reason: contains not printable characters */
    public static String m192(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Context m193(Object obj) {
        if (C0016.m574() <= 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m194(Object obj) {
        if (C0017.m717() < 0) {
            return Color.parseColor((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m195(Object obj) {
        if (C0014.m245() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1496O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m196(Object obj, int i) {
        if (C0014.m245() <= 0) {
            ((ViewGroup) obj).setDescendantFocusability(i);
        }
    }

    /* JADX INFO: renamed from: ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m197(Object obj) {
        if (C0016.m574() <= 0) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) obj);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m198(Object obj) {
        if (C0014.m245() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m199(Object obj, int i, int i2, int i3) {
        if (C0015.m570() > 0) {
            ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۨۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m200(Object obj, Object obj2, long j) {
        if (C0016.m574() <= 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m201(Object obj) {
        if (C0015.m570() >= 0) {
            ((LivePlayActivity) obj).O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m153(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
