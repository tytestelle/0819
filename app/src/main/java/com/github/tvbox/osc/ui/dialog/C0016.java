package com.github.tvbox.osc.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.east.android.zlive.ZLives;
import com.github.tvbox.osc.base.C0014;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.tvbox.osc.ui.dialog.ۧۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0016 {

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static int f9 = 809;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m574() {
        return 494 ^ C0014.f3;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static View m575(Object obj, int i) {
        if (C0015.m570() >= 0) {
            return ((AppCompatActivity) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m576(Object obj, int i) {
        if (m574() <= 0) {
            return ((Matcher) obj).group(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m577(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            return ((LruCache) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m578(Object obj, float f) {
        if (C0014.m245() <= 0) {
            ((GradientDrawable) obj).setCornerRadius(f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m579(Object obj, int i) {
        if (C0014.m245() < 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static Level m580() {
        if (C0014.m245() <= 0) {
            return Level.OFF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m581(Object obj, Object obj2) {
        if (C0017.m717() <= 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m582(Object obj) {
        if (C0017.m717() <= 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۤ, reason: not valid java name and contains not printable characters */
    public static int m583() {
        if (C0014.m245() <= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static View m584(Object obj, int i) {
        if (C0017.m717() <= 0) {
            return ((Dialog) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m585(Object obj) {
        if (C0015.m570() > 0) {
            return ((LivePlayActivity) obj).f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m586(Object obj, Object obj2) {
        if (C0017.m717() < 0) {
            ((RecyclerView) obj).addItemDecoration((RecyclerView.ItemDecoration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m587(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static File m588(Object obj, Object obj2) {
        if (C0015.m570() >= 0) {
            return ((Context) obj).getExternalFilesDir((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static void m589(Object obj) {
        if (C0017.m717() < 0) {
            ((LivePlayActivity) obj).O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m590(Object obj, int i, int i2, int i3, boolean z) {
        if (m574() < 0) {
            ((LivePlayActivity) obj).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(i, i2, i3, z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m591(Object obj) {
        if (C0017.m717() < 0) {
            return ((HashSet) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m592(Object obj) {
        if (m574() <= 0) {
            return ((LivePlayActivity) obj).f2974O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m593() {
        if (m574() < 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m594(Object obj) {
        if (m574() <= 0) {
            return ((LivePlayActivity) obj).f2957O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static int m595(Object obj) {
        if (C0017.m717() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo m596() {
        if (C0014.m245() <= 0) {
            return LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m597(Object obj) {
        if (C0017.m717() < 0) {
            return ((SQLiteDatabase) obj).isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO m598(Object obj) {
        if (m574() <= 0) {
            return ((LivePlayActivity) obj).f3008O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m599(Object obj) {
        if (m574() < 0) {
            return ((ProgressBar) obj).getIndeterminateDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m600(Object obj) {
        if (m574() <= 0) {
            ((LoginActivity) obj).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m601(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1472O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m602(Object obj, Object obj2) {
        if (m574() <= 0) {
            ((MutableLiveData) obj).postValue(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ۟, reason: not valid java name and contains not printable characters */
    public static Level m603() {
        if (m574() < 0) {
            return Level.WARNING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m604(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1459O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m605(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m606() {
        if (C0017.m717() <= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3047O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m607() {
        if (C0017.m717() < 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m609(Object obj) {
        if (C0015.m570() >= 0) {
            return ((Cursor) obj).moveToNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m610(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m611(Object obj) {
        if (C0017.m717() < 0) {
            return ((PopupWindow) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static void m612(Object obj, int i) {
        if (m574() <= 0) {
            ((Handler) obj).removeMessages(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m613(Object obj) {
        if (C0014.m245() < 0) {
            ((Cursor) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m614(Object obj) {
        if (C0015.m570() >= 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m615(Object obj, Object obj2) {
        if (C0014.m245() < 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m616(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static View m617(Object obj) {
        if (C0015.m570() > 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m618(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m619(Object obj) {
        if (m574() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m620(Object obj) {
        if (C0014.m245() < 0) {
            return Drawable.createFromPath((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static TextView m621(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f2982O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m622(Object obj) {
        if (m574() <= 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static JSONArray m623(Object obj, Object obj2) {
        if (m574() < 0) {
            return ((JSONObject) obj).getJSONArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o m624(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2955O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m625(Object obj) {
        if (m574() < 0) {
            ((LivePlayActivity) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۢ, reason: not valid java name and contains not printable characters */
    public static String m626(String str) {
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

    /* JADX INFO: renamed from: ۣۦۣۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m627(Object obj) {
        if (C0014.m245() < 0) {
            return ((LivePlayActivity) obj).f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥ۟, reason: not valid java name and contains not printable characters */
    public static void m628(Object obj) {
        if (C0014.m245() < 0) {
            ((Activity) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۣۦۥۧ, reason: not valid java name and contains not printable characters */
    public static FragmentTransaction m629(Object obj) {
        if (C0017.m717() < 0) {
            return ((FragmentManager) obj).beginTransaction();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m630() {
        if (C0015.m570() >= 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Display m631(Object obj) {
        if (C0014.m245() <= 0) {
            return ((WindowManager) obj).getDefaultDisplay();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m632(Object obj, Object obj2, Object obj3) {
        if (m574() <= 0) {
            return ((LruCache) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥ۟, reason: not valid java name and contains not printable characters */
    public static Date m633(Object obj) {
        if (C0017.m717() <= 0) {
            return ((Calendar) obj).getTime();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static void m634(Object obj, Object obj2) {
        if (m574() <= 0) {
            ((DateFormat) obj).setTimeZone((TimeZone) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۨ, reason: contains not printable characters */
    public static void m635(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۧۥ, reason: contains not printable characters */
    public static void m636(Object obj) {
        if (C0014.m245() <= 0) {
            ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0();
        }
    }

    /* JADX INFO: renamed from: ۦۡ۠ۤ, reason: contains not printable characters */
    public static ZLives m637(Object obj) {
        if (m574() <= 0) {
            return ((LivePlayActivity) obj).f3003O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۦ, reason: contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m638(Object obj) {
        if (C0017.m717() < 0) {
            return ((LivePlayActivity) obj).f2998O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥۥ, reason: contains not printable characters */
    public static int m639() {
        if (C0014.m245() <= 0) {
            return O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۧۥ, reason: contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m640(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f2996O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢ, reason: contains not printable characters */
    public static String m641(Object obj, Object obj2) {
        if (m574() < 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۨ, reason: contains not printable characters */
    public static String m642(Object obj) {
        if (m574() <= 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m643(Object obj) {
        if (C0014.m245() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1462O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m644(Object obj, Object obj2) {
        if (m574() < 0) {
            return ((LruCache) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m645(Object obj) {
        if (C0014.m245() <= 0) {
            return ((LivePlayActivity) obj).f2999O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m646(Object obj) {
        if (m574() < 0) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1501O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m647(Object obj, int i, int i2, int i3, boolean z, boolean z2) {
        if (C0014.m245() < 0) {
            ((LivePlayActivity) obj).O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i, i2, i3, z, z2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m648(Object obj) {
        if (C0014.m245() <= 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۨ, reason: not valid java name and contains not printable characters */
    public static void m649(Object obj) {
        if (C0014.m245() <= 0) {
            ((ReentrantLock) obj).lock();
        }
    }

    /* JADX INFO: renamed from: ۨۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m650(Object obj, Object obj2) {
        if (C0014.m245() <= 0) {
            ((Context) obj).unbindService((ServiceConnection) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Object m651(Object obj, int i) {
        if (C0014.m245() < 0) {
            return ((List) obj).remove(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m608(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
