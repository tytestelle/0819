package com.github.tvbox.osc.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.Process;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.github.tvbox.osc.base.C0014;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.tvbox.osc.ui.dialog.ۨۥۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int f10 = -758;

    /* JADX INFO: renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m652(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static View m653(Object obj) {
        if (m717() < 0) {
            return ((LivePlayActivity) obj).f2976O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o m654(Object obj) {
        if (m717() <= 0) {
            return ((LoginActivity) obj).f3017O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static void m655(Object obj) {
        if (m717() <= 0) {
            ((LivePlayActivity) obj).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m656(int i, int i2) {
        if (C0016.m574() <= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m657(Object obj) {
        if (m717() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o m658(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2989O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m659(Object obj, Object obj2) {
        if (C0015.m570() > 0) {
            ((LivePlayActivity) obj).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m660(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            ((LivePlayActivity) obj).setTimeAbdSpeedColor((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m661() {
        if (C0016.m574() <= 0) {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m662(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m663(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            return ((Context) obj).checkCallingOrSelfPermission((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m664() {
        if (C0015.m570() > 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m665(Object obj, int i) {
        if (m717() <= 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m666(Object obj) {
        if (m717() < 0) {
            return ((LivePlayActivity) obj).O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ۠, reason: not valid java name and contains not printable characters */
    public static O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 m667() {
        if (C0014.m245() <= 0) {
            return LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m668(int i) {
        if (m717() <= 0) {
            Process.killProcess(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m669(Object obj, float f) {
        if (C0015.m570() > 0) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap.Config m670() {
        if (C0014.m245() < 0) {
            return Bitmap.Config.RGB_565;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m671(Object obj, int i) {
        if (C0015.m570() > 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m672(Object obj) {
        if (C0016.m574() <= 0) {
            ((LivePlayActivity) obj).O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int m673(Object obj) {
        if (C0014.m245() <= 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m674(Object obj) {
        if (C0016.m574() <= 0) {
            ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m675(Object obj, int i) {
        if (m717() < 0) {
            ((Dialog) obj).setContentView(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Integer[] m676(int i) {
        if (C0014.m245() <= 0) {
            return LivePlayActivity.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static Matcher m677(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static TextPaint m678(Object obj) {
        if (C0015.m570() > 0) {
            return ((TextView) obj).getPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 m679(Object obj) {
        if (m717() < 0) {
            return ((LivePlayActivity) obj).f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m680(Object obj) {
        if (C0015.m570() > 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o m681() {
        if (C0016.m574() <= 0) {
            return O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m682(Object obj) {
        if (C0015.m570() > 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m683(Object obj) {
        if (C0014.m245() <= 0) {
            return ((View) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m684(Object obj, Object obj2) {
        if (m717() <= 0) {
            return ((HashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۨ, reason: not valid java name and contains not printable characters */
    public static TextView m685(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2966O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m686(Object obj, Object obj2) {
        if (C0015.m570() > 0) {
            return Log.e((String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m687(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1467O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m688(Object obj) {
        if (C0016.m574() <= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۥ, reason: not valid java name and contains not printable characters */
    public static Set m689(Object obj) {
        if (C0014.m245() <= 0) {
            return ((ConcurrentHashMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۣ, reason: not valid java name and contains not printable characters */
    public static void m690(Object obj, Object obj2) {
        if (C0015.m570() > 0) {
            ((TextClock) obj).setFormat12Hour((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۧ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m691(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۥ, reason: not valid java name and contains not printable characters */
    public static O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 m692() {
        if (m717() <= 0) {
            return LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m694(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m695(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0015.m570() > 0) {
            return ((SQLiteDatabase) obj).delete((String) obj2, (String) obj3, (String[]) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static float m696(Object obj) {
        if (m717() <= 0) {
            return ((DisplayMetrics) obj).density;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m697(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            ((Handler) obj).removeCallbacks((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m698(Object obj, Object obj2, Object obj3) {
        if (C0016.m574() < 0) {
            ((LiveData) obj).observe((LifecycleOwner) obj2, (Observer) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m699(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            ((Executor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static int m700(Object obj) {
        if (C0014.m245() < 0) {
            return ((FragmentTransaction) obj).commit();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static Cursor m701(Object obj, Object obj2, Object obj3) {
        if (m717() < 0) {
            return ((SQLiteDatabase) obj).rawQuery((String) obj2, (String[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m702(Object obj) {
        if (C0014.m245() <= 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m703(Object obj, boolean z) {
        if (m717() <= 0) {
            ((Dialog) obj).setCanceledOnTouchOutside(z);
        }
    }

    /* JADX INFO: renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO m704(Object obj) {
        if (C0015.m570() > 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static String m705(String str) {
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

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m706(Object obj, int i, int i2) {
        if (m717() < 0) {
            ((Activity) obj).overridePendingTransition(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static TextView m707(Object obj) {
        if (C0014.m245() <= 0) {
            return ((LivePlayActivity) obj).f2981O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static long m708() {
        if (C0014.m245() < 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m709(int i) {
        if (C0016.m574() <= 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m710(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m711(Object obj) {
        if (C0014.m245() <= 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۥ, reason: contains not printable characters */
    public static boolean m712(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۢۥ, reason: contains not printable characters */
    public static ArrayList m713(int i, int i2) {
        if (C0015.m570() >= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۦ, reason: contains not printable characters */
    public static void m714(Object obj, boolean z) {
        if (C0016.m574() <= 0) {
            ((ProgressBar) obj).setIndeterminate(z);
        }
    }

    /* JADX INFO: renamed from: ۥۨۤۡ, reason: contains not printable characters */
    public static Object m715(Object obj, Object obj2) {
        if (m717() <= 0) {
            return ((HashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static boolean m716(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2997O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۤ۟, reason: contains not printable characters */
    public static int m717() {
        return 232 ^ C0014.f3;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۥ, reason: contains not printable characters */
    public static String m718(Object obj) {
        if (C0016.m574() <= 0) {
            return ((String) obj).toLowerCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۡ, reason: contains not printable characters */
    public static String m719(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1498O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۡ, reason: contains not printable characters */
    public static void m720(Object obj) {
        if (m717() <= 0) {
            LivePlayActivity.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00((JSONObject) obj);
        }
    }

    /* JADX INFO: renamed from: ۦۢ۟۟, reason: contains not printable characters */
    public static int m721(Object obj, int i) {
        if (C0016.m574() <= 0) {
            return ((Resources) obj).getDimensionPixelSize(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static TextView m722(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2967O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m723(Object obj) {
        if (m717() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1495O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m724(Object obj) {
        if (C0015.m570() > 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m725(Object obj) {
        if (m717() <= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۥ۟, reason: not valid java name and contains not printable characters */
    public static File m726(Object obj) {
        if (m717() <= 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡ۟, reason: not valid java name and contains not printable characters */
    public static ImageView m727(Object obj) {
        if (C0015.m570() >= 0) {
            return ((LivePlayActivity) obj).f2964O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m728(Object obj) {
        if (C0014.m245() < 0) {
            ((HashSet) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۨ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m729(Object obj, Object obj2, int i) {
        if (C0014.m245() < 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m730(Object obj) {
        if (C0016.m574() <= 0) {
            return ((Point) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m731(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static String m732() {
        if (C0014.m245() < 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m733(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            return ((JSONObject) obj).has((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m734(Object obj, int i) {
        if (m717() <= 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۨۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m735(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            ((Handler) obj).removeCallbacksAndMessages(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۢ, reason: not valid java name and contains not printable characters */
    public static String m693(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
