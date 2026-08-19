package com.github.tvbox.osc.base;

import O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Message;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.ui.SubtitleView;
import com.android.cast.dlna.dmr.DLNARendererService;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.github.tvbox.osc.ui.dialog.C0016;
import com.github.tvbox.osc.ui.dialog.C0017;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import com.nagasoft.player.VJPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.tvbox.osc.base.ۣۤۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public class C0014 {

    /* JADX INFO: renamed from: ۦۦ۟ۧ, reason: contains not printable characters */
    public static int f3 = -215;

    /* JADX INFO: renamed from: ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m202(Object obj) {
        if (m245() <= 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int m203(Object obj) {
        if (m245() < 0) {
            return ((Point) obj).x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m204(Object obj) {
        if (C0016.m574() < 0) {
            return ((LivePlayActivity) obj).f2986O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m205() {
        if (C0015.m570() >= 0) {
            LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m206(Object obj, Object obj2, int i) {
        if (C0017.m717() < 0) {
            return ((JSONObject) obj).put((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m207(Object obj, int i, int i2) {
        if (C0015.m570() > 0) {
            ((Calendar) obj).set(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static App m208() {
        if (C0015.m570() >= 0) {
            return App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m209(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m210(Object obj) {
        if (C0017.m717() < 0) {
            ((FragmentManager) obj).popBackStack();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۤ, reason: not valid java name and contains not printable characters */
    public static TextView m211(Object obj) {
        if (C0017.m717() < 0) {
            return ((LivePlayActivity) obj).f2968O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m212(Object obj) {
        if (m245() <= 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m213(Object obj) {
        if (C0015.m570() >= 0) {
            return ((File) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m214(Object obj) {
        if (m245() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1493O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m215(Object obj, Object obj2) {
        if (C0015.m570() > 0) {
            return ((JSONObject) obj).getJSONObject((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ۠, reason: not valid java name and contains not printable characters */
    public static TextView m216(Object obj) {
        if (C0015.m570() > 0) {
            return ((LoginActivity) obj).f3013O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m217(Object obj) {
        if (C0015.m570() >= 0) {
            return ((Message) obj).what;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static DLNARendererService m218(Object obj) {
        if (C0016.m574() <= 0) {
            return ((LivePlayActivity) obj).f2990O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m219(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f3006O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m220(Object obj) {
        if (C0015.m570() >= 0) {
            ((Animator) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static com.github.tvbox.osc.ui.dialog.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m221(Object obj) {
        if (C0015.m570() >= 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m222(Object obj) {
        if (C0016.m574() < 0) {
            ((LivePlayActivity) obj).O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m223(Object obj, int i, int i2) {
        if (C0016.m574() <= 0) {
            ((Calendar) obj).add(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static SubtitleView m224() {
        if (C0016.m574() <= 0) {
            return LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static PopupWindow m225(Object obj) {
        if (m245() <= 0) {
            return ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) obj).f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m226(Object obj) {
        if (m245() <= 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m227(Object obj) {
        if (m245() <= 0) {
            return ((View) obj).requestFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۦ, reason: not valid java name and contains not printable characters */
    public static Integer m228(int i) {
        if (C0017.m717() < 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m229(Object obj) {
        if (C0016.m574() <= 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m230(Object obj) {
        if (m245() <= 0) {
            ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m231(Object obj, int i) {
        if (C0015.m570() > 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m232(Object obj) {
        if (C0017.m717() <= 0) {
            return ((KeyEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m233(Object obj, Object obj2, Object obj3) {
        if (m245() < 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m234(Object obj) {
        if (m245() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1494O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Context m235(Object obj) {
        if (C0015.m570() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m236(Object obj, int i) {
        if (C0017.m717() < 0) {
            ((ImageView) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m237(Object obj) {
        if (C0015.m570() >= 0) {
            ((PopupWindow) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۤ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m238(Object obj, Object obj2, Object obj3) {
        if (C0016.m574() <= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۡ, reason: not valid java name and contains not printable characters */
    public static FragmentTransaction m239(Object obj, int i, Object obj2) {
        if (C0017.m717() <= 0) {
            return ((FragmentTransaction) obj).replace(i, (Fragment) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m240(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Iterator m241(Object obj) {
        if (m245() < 0) {
            return ((JSONObject) obj).keys();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m242(Object obj, boolean z) {
        if (m245() < 0) {
            ((Dialog) obj).setCancelable(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m243(Object obj) {
        if (m245() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).f1499O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m244(Object obj, int i, Object obj2) {
        if (m245() <= 0) {
            ((Drawable) obj).setColorFilter(i, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m245() {
        return 236 ^ f3;
    }

    /* JADX INFO: renamed from: ۠ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m246(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m247(Object obj, Object obj2) {
        if (C0016.m574() <= 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m248(Object obj, Object obj2, Object obj3, int i) {
        if (m245() <= 0) {
            return ((Context) obj).bindService((Intent) obj2, (ServiceConnection) obj3, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static float m249(Object obj, Object obj2) {
        if (m245() <= 0) {
            return ((Paint) obj).measureText((String) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static Calendar m251() {
        if (C0015.m570() > 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO m252(Object obj) {
        if (C0015.m570() > 0) {
            return ((LivePlayActivity) obj).f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static void m253(Object obj) {
        if (m245() < 0) {
            ((ReentrantLock) obj).unlock();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static TextView m254(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m255() {
        if (C0015.m570() >= 0) {
            return LoginActivity.f3012O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m256() {
        if (C0017.m717() <= 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m257(Object obj) {
        if (C0016.m574() < 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 m258(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f3004O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m259(Object obj) {
        if (C0016.m574() < 0) {
            return ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) obj).O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static VJPlayer m260(Object obj) {
        if (C0016.m574() < 0) {
            return ((LivePlayActivity) obj).f3002O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static void m261(Object obj) {
        if (C0016.m574() < 0) {
            ((View) obj).clearAnimation();
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m262(Object obj) {
        if (m245() <= 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int m263(Object obj, Object obj2) {
        if (m245() < 0) {
            return ((JSONObject) obj).getInt((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m264(Object obj) {
        if (m245() <= 0) {
            return ((File) obj).canRead();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m265(Object obj, Object obj2) {
        if (m245() < 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m266(Object obj) {
        if (C0016.m574() <= 0) {
            ((LivePlayActivity) obj).O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static RelativeLayout m267(Object obj) {
        if (C0016.m574() < 0) {
            return ((LoginActivity) obj).f3016O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O m268(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).f3009O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m269(Object obj) {
        if (C0017.m717() < 0) {
            return ((LivePlayActivity) obj).f3001O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۡ, reason: contains not printable characters */
    public static JSONObject m270(Object obj, int i) {
        if (C0016.m574() <= 0) {
            return ((JSONArray) obj).optJSONObject(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۦ, reason: contains not printable characters */
    public static File m271(Object obj) {
        if (C0016.m574() <= 0) {
            return ((Context) obj).getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۢ, reason: contains not printable characters */
    public static String m272(Object obj, Object obj2, Object obj3) {
        if (C0017.m717() < 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۤ۟, reason: contains not printable characters */
    public static Drawable m273(Object obj, int i) {
        if (C0017.m717() < 0) {
            return ((Context) obj).getDrawable(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤ۠, reason: contains not printable characters */
    public static boolean m274(Object obj) {
        if (m245() <= 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۦۢ, reason: contains not printable characters */
    public static boolean m275(Object obj) {
        if (C0017.m717() <= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static int m276() {
        if (C0016.m574() < 0) {
            return O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۥ۟, reason: contains not printable characters */
    public static boolean m277(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۨ, reason: contains not printable characters */
    public static int m278() {
        if (C0017.m717() < 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۢ, reason: contains not printable characters */
    public static boolean m279(Object obj) {
        if (C0017.m717() < 0) {
            return ((Matcher) obj).matches();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۦ, reason: contains not printable characters */
    public static String[] m280(Object obj, Object obj2) {
        if (C0017.m717() <= 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static long m281(Object obj, Object obj2, long j) {
        if (m245() < 0) {
            return ((JSONObject) obj).optLong((String) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O m282(Object obj) {
        if (C0017.m717() < 0) {
            return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) obj).f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static TextView m283(Object obj) {
        if (C0017.m717() <= 0) {
            return ((LivePlayActivity) obj).O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m284(Object obj, Object obj2) {
        if (m245() < 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable.Orientation m285() {
        if (C0017.m717() < 0) {
            return GradientDrawable.Orientation.BL_TR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m286(Object obj) {
        if (C0017.m717() < 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static Locale m287() {
        if (C0015.m570() >= 0) {
            return Locale.CHINESE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m288() {
        if (C0015.m570() >= 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m289(Object obj) {
        if (C0015.m570() > 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Bitmap m290(Object obj, int i, int i2, int i3, int i4, Object obj2) {
        if (m245() <= 0) {
            return Bitmap.createBitmap((int[]) obj, i, i2, i3, i4, (Bitmap.Config) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۧ, reason: not valid java name and contains not printable characters */
    public static String m291() {
        if (C0017.m717() <= 0) {
            return LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Configuration m292(Object obj) {
        if (C0015.m570() >= 0) {
            return ((Resources) obj).getConfiguration();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m293(Object obj, Object obj2) {
        if (C0016.m574() < 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦ۠, reason: not valid java name and contains not printable characters */
    public static Boolean m294(boolean z) {
        if (C0016.m574() <= 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m250(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
