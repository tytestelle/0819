package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.Renderer;
import com.github.tvbox.osc.base.C0013;
import com.github.tvbox.osc.base.C0014;
import com.github.tvbox.osc.bean.Appoint;
import com.github.tvbox.osc.bean.ShortcutsMenuItem;
import com.github.tvbox.osc.ui.activity.C0015;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import com.tencent.smtt.sdk.TbsListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements View.OnClickListener, View.OnKeyListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0, reason: collision with root package name */
    public static boolean f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = false;

    /* JADX INFO: renamed from: O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, reason: collision with root package name */
    public static boolean f3033O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = false;

    /* JADX INFO: renamed from: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO, reason: collision with root package name */
    public static boolean f3034O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO = false;

    /* JADX INFO: renamed from: O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, reason: collision with root package name */
    public static int f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 1;

    /* JADX INFO: renamed from: O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, reason: collision with root package name */
    public static int f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = 0;

    /* JADX INFO: renamed from: O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, reason: collision with root package name */
    public static int f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = 0;

    /* JADX INFO: renamed from: O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00, reason: collision with root package name */
    public static int f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 = -1;

    /* JADX INFO: renamed from: O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, reason: collision with root package name */
    public static int f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = 0;

    /* JADX INFO: renamed from: O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, reason: collision with root package name */
    public static int f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = 0;

    /* JADX INFO: renamed from: O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, reason: collision with root package name */
    public static int f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 0;

    /* JADX INFO: renamed from: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, reason: collision with root package name */
    public static int f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = 0;

    /* JADX INFO: renamed from: O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, reason: collision with root package name */
    public static int f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = 6;

    /* JADX INFO: renamed from: O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, reason: collision with root package name */
    public static int f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = 0;

    /* JADX INFO: renamed from: O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo, reason: collision with root package name */
    public static int f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = -1;

    /* JADX INFO: renamed from: O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo, reason: collision with root package name */
    public static int f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = -1;

    /* JADX INFO: renamed from: O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO, reason: collision with root package name */
    public static boolean f3047O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
    public static long O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;

    /* JADX INFO: renamed from: O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO, reason: collision with root package name */
    public static long f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;

    /* JADX INFO: renamed from: O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo, reason: collision with root package name */
    public static long f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;

    /* JADX INFO: renamed from: O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, reason: collision with root package name */
    public static long f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f7short;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final CustomRecyclerView f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final CustomRecyclerView f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final CustomRecyclerView f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final CustomRecyclerView f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final CustomRecyclerView f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final CustomRecyclerView f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final LinearLayout f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final LinearLayout f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final LinearLayout f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final LinearLayout f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final LinearLayout f3062O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final LinearLayout f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final LinearLayout f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final LinearLayout f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public final LinearLayout f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public final LinearLayout f3067O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public final LinearLayout f3068O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public final LinearLayout f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public final TextView f3070O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public final TextView f3071O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public final TextView f3072O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public final PopupWindow f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    public final EditText O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public final TextView f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public final O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;

    /* JADX INFO: renamed from: O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;

    /* JADX INFO: renamed from: O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;

    /* JADX INFO: renamed from: O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

    /* JADX INFO: renamed from: O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, reason: collision with root package name */
    public final O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;

    /* JADX INFO: renamed from: O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, reason: collision with root package name */
    public O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;

    /* JADX INFO: renamed from: O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, reason: collision with root package name */
    public final Handler f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

    /* JADX INFO: renamed from: O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, reason: collision with root package name */
    public final View f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;

    /* JADX INFO: renamed from: O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0, reason: collision with root package name */
    public final long f3084O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;

    /* JADX INFO: renamed from: O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o, reason: collision with root package name */
    public TextView f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;

    /* JADX INFO: renamed from: O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, reason: collision with root package name */
    public final LinearLayout f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;

    /* JADX INFO: renamed from: O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o, reason: collision with root package name */
    public final O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f3087O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o;

    /* JADX INFO: renamed from: O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, reason: collision with root package name */
    public long f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

    /* JADX INFO: renamed from: O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0, reason: collision with root package name */
    public boolean f3089O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;

    /* JADX INFO: renamed from: O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

    /* JADX INFO: renamed from: O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3091O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;

    /* JADX INFO: renamed from: O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3092O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;

    /* JADX INFO: renamed from: O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3093O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;

    /* JADX INFO: renamed from: O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3094O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;

    /* JADX INFO: renamed from: O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000, reason: collision with root package name */
    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3095O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    static {
        String str;
        String str2;
        String str3;
        String str4;
        int iM105 = C0013.m105("ۣۡۦ");
        while (true) {
            switch (iM105) {
                case 56570:
                    f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 0;
                    if (C0013.f2 / (C0017.f10 % 7973) >= 0) {
                        iM105 = C0016.m618("ۣۡۦ");
                    } else {
                        str = "ۡۤۢ";
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 56572:
                    if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
                        iM105 = (C0013.f2 ^ C0017.f10) + 1747314;
                    } else if (C0015.f6 + (C0014.f3 | (-963)) >= 0) {
                        C0013.m114();
                        str = "ۡۤۢ";
                        iM105 = C0013.m105(str);
                    } else {
                        iM105 = (C0016.f9 % C0015.f6) + 56370;
                    }
                    break;
                case 1746944:
                    f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 1;
                    if (C0017.f10 >= 0) {
                        C0014.f3 = 71;
                        iM105 = C0015.m573("ۣۣۨ");
                    } else {
                        str2 = "ۢۥۡ";
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1748642:
                    iM105 = (C0013.f2 ^ C0017.f10) + 1747314;
                    break;
                case 1748740:
                    f7short = new short[]{884, 847, 840, 853, 851, 836, 850, 851, 852, 888, 866, 873, 882, 888, 843, 846, 852, 851, 1942, 1942, 1939, 1939, 2035, 1978, 1978, 19750, 23237, 28128, 21191, 20844, 23627, 23037, -25245, 21320, 28815, 429, 444, 444, 419, 421, 418, 440, 417, 425, 418, 440, 483, 18072, 28090, 27540, 25585, -28668, -26426, 26117, 24139, 32670, 21644, 30041, 29200, 24649, 2360, 2367, 2344, 2353, 2348, 2385, 1912, -28126, -25888, 22337, 22885, 26427, 28549, -28804, -24819, -26673, 23150, 25258, -32173, 28090, -25160, -2218, 2089, 21347, 28671, -28844, 24541, 19210, 31661, 22284, 31694, 29582, 24247, 23468, -24720, -26702, 21991, 31013, 29029, 23644, 22855, 3229, 3229, 3229, 3228, 3200, -27588, -25346, -29137, 31299, 24250, -31547, 31273, 22288, 21003, 25062, -25246, 23123, 25770, 361, 361, 361, 360, 372, -26168, -28406, -31781, 30647, 21326, -30415, 30685, 23268, 24575, 27666, -28522, 317, 316, 2497, 2497, 2497, 2496, 2524, -28320, -26206, -29837, 32543, 23526, -32359, 32629, 21068, 22359, 25786, -26562, 2314, 2314, 2314, 2315, 2327, -28245, -26263, -29768, 32724, 23341, -32430, 32702, 21127, 22428, 1606, 1606, 1606, 1607, 23984, 32375, 28208, 24011, 28558, 28302, 32533, 21036, 1891, 1891, 1891, 1890, 1918, 1814, 1795, 1812, 18610, 26428, 21828, -28869, 29143, 23790, 23029, 27160, -26980, 2661, 2660, 2674, 2658, 2593, 2645, 2664, 2668, 2660, -2789, 2609, 2609, 2609, 2609, 2593, 2604, 2593, 2609, 2609, 2609, 2609, 1227, 1264, 1271, 1258, 1260, 1275, 1261, 1260, 1259, 1223, 1245, 1238, 1229, 1223, 1268, 1265, 1259, 1260, 25425, 26117, 22091, 1115, 1778, 21581, -31185, 24322, 31941, -28195, -28885, 2934, 2929, 2927, 2922, 2923, 2880, 2930, 2938, 2923, 2935, 2928, 2939};
                    if (C0015.f6 >= 0) {
                        C0017.f10 = 42;
                        iM105 = C0015.m573("ۨۢ");
                    } else {
                        str = "ۨۤ";
                        iM105 = C0013.m105(str);
                    }
                    break;
                case 1748767:
                    if (C0017.f10 * (C0014.f3 ^ (-5897)) >= 0) {
                        C0013.f2 = 41;
                        str3 = "ۥۥۨ";
                        iM105 = C0014.m240(str3);
                    } else {
                        iM105 = C0014.m240("ۦۤۨ");
                    }
                    break;
                case 1749758:
                    O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = 0L;
                    str3 = "ۣۥۧ";
                    iM105 = C0014.m240(str3);
                    break;
                case 1750664:
                    break;
                case 1750725:
                    f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = 0L;
                    iM105 = (C0014.f3 | (C0013.f2 * 8296)) >= 0 ? C0013.m105("ۨۤ") : C0016.m618("ۦۤ۟");
                    break;
                case 1752648:
                case 1753578:
                    iM105 = C0013.m105("ۢۥۡ");
                    break;
                case 1753569:
                    f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = 0L;
                    if ((C0014.f3 | C0015.f6 | 3171) < 0) {
                        str4 = "ۧ۠ۦ";
                        iM105 = C0016.m618(str4);
                    } else {
                        C0016.m574();
                        str2 = "۟ۧۨ";
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1753634:
                    iM105 = (C0016.f9 / C0015.f6) + 1748741;
                    break;
                case 1754413:
                    f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = 0L;
                    if (C0013.f2 * (C0013.f2 ^ 4854) <= 0) {
                        C0017.m717();
                        str4 = "ۧ۠ۦ";
                    } else {
                        str4 = "ۣۣۨ";
                    }
                    iM105 = C0016.m618(str4);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:225:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001b. Please report as an issue. */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(LivePlayActivity livePlayActivity) {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        String str;
        Calendar calendar;
        O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
        ViewGroup.LayoutParams layoutParams;
        String str2;
        String str3;
        String str4;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        ArrayList arrayList;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        String str5;
        String str6;
        ArrayList arrayList2;
        String str7;
        String str8;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        int i = 0;
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = null;
        O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO2 = null;
        String str9 = null;
        ArrayList arrayList3 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = null;
        Calendar calendar2 = null;
        int iM240 = C0014.m240("ۦۨۢ");
        ViewGroup.LayoutParams layoutParams4 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = null;
        while (true) {
            switch (iM240) {
                case 56322:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1142O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() + O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setAdapter(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.addOnScrollListener(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this));
                    this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setOnItemClickListener(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this));
                    iM240 = C0014.f3 >= 0 ? C0014.m240("ۢۦ۠") : C0015.m573("ۨ۠ۤ");
                    break;
                case 56450:
                    layoutParams3.height = i;
                    this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams5 = this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getLayoutParams();
                    layoutParams5.height = i;
                    this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setLayoutParams(layoutParams5);
                    O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                    if (C0016.f9 > 0) {
                        str = "۟ۧۧ";
                        iM240 = C0013.m105(str);
                    } else {
                        C0016.f9 = 87;
                        iM240 = C0015.m573("ۥۨ۠");
                    }
                    break;
                case 1746687:
                    this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.addOnScrollListener(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this));
                    this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setOnItemClickListener(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this));
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setHasStableIds(true);
                    this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setAdapter(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    iM240 = C0016.f9 * (C0017.f10 ^ 780) >= 0 ? C0017.m731("ۡۨ۟") : C0016.m618("ۦۤۨ");
                    break;
                case 1746842:
                    PopupWindow popupWindow = new PopupWindow(this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, -1, -1);
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = popupWindow;
                    popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setFocusable(true);
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setOutsideTouchable(true);
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setClippingEnabled(false);
                    if (C0016.f9 <= 0) {
                        C0016.m574();
                        str8 = "ۧۨۤ";
                        iM240 = C0016.m618(str8);
                    }
                    break;
                case 1746935:
                    if (arrayList3.isEmpty()) {
                        arrayList3.add(0, ShortcutsMenuItem.MENU);
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        if (C0014.f3 + (C0013.f2 | 7979) <= 0) {
                            C0017.f10 = 91;
                            o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO2;
                            o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO2 = o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
                            iM240 = C0013.m105("ۢۦ۟");
                        } else {
                            iM240 = (C0016.f9 / C0013.f2) ^ 1749695;
                        }
                    } else {
                        str6 = "ۣۣۨ";
                        iM240 = C0015.m573(str6);
                    }
                    break;
                case 1746937:
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setTouchable(true);
                    if (!this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.isShowing()) {
                        layoutParams = layoutParams3;
                        str2 = "ۣۨۤ";
                        layoutParams3 = layoutParams;
                        iM240 = C0014.m240(str2);
                    } else if (C0016.m574() >= 0) {
                        str = "ۣۦۧ";
                        iM240 = C0013.m105(str);
                    } else {
                        C0013.m114();
                        str6 = "۟ۢ";
                        iM240 = C0015.m573(str6);
                    }
                    break;
                case 1746942:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.setHasStableIds(true);
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1142O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                        str5 = "۠ۢ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0015.m573(str5);
                    } else if ((C0017.f10 ^ (C0013.f2 % 8622)) < 0) {
                        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
                        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                        iM240 = C0015.m573("ۤۨ۠");
                    } else {
                        C0014.f3 = 28;
                    }
                    break;
                case 1746943:
                    if (this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 == null) {
                        o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = new O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO();
                        o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.setHasStableIds(true);
                        o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO2 = o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
                        iM240 = C0013.m105("ۢۦ۟");
                    } else if (C0016.m574() >= 0) {
                        str5 = "ۡۢ۠";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0015.m573(str5);
                    } else {
                        iM240 = (C0015.f6 + C0017.f10) ^ (-1750931);
                    }
                    break;
                case 1747718:
                    this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setAdapter(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1);
                    this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.addOnScrollListener(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this));
                    this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.setOnItemClickListener(new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 11));
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1143O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
                    if (C0014.m245() < 0) {
                        str5 = "۟ۧۦ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0015.m573(str5);
                    } else {
                        C0015.m570();
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0016.m618("ۣۢۥ");
                    }
                    break;
                case 1747867:
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.setOnKeyListener(this);
                    this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setOnKeyListener(this);
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.setOnFocusChangeListener(this);
                    this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setOnFocusChangeListener(this);
                    int i2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1433O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    ViewGroup.LayoutParams layoutParams6 = this.f3062O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getLayoutParams();
                    if (C0015.m570() <= 0) {
                        iM240 = C0017.m731("ۧۢۥ");
                        layoutParams2 = layoutParams6;
                        i = i2;
                    } else {
                        iM240 = C0017.m731("ۦۤ۠");
                        layoutParams2 = layoutParams6;
                        i = i2;
                    }
                    break;
                case 1748859:
                    this.f3093O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 3);
                    this.f3094O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 4);
                    this.f3095O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 5);
                    this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) new ViewModelProvider(livePlayActivity).get(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class);
                    this.f3087O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                    if (C0017.m717() < 0) {
                        arrayList = arrayList3;
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                        arrayList3 = arrayList;
                        iM240 = C0013.m105("ۧۥۢ");
                    } else {
                        C0015.f6 = 8;
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                        iM240 = C0015.m573("ۣۧۡ");
                    }
                    break;
                case 1748888:
                    this.f3062O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mShortcutsMenuHeight);
                    this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mLargeChannelGroupLeftLayout);
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mChannelGroupLeftLayout);
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mChannelLayout);
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mGroupEpgLayout);
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000 = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mGroupEPGtext);
                    if (C0017.f10 * C0013.f2 * 7777 >= 0) {
                        str4 = "۟ۧۦ";
                        iM240 = C0014.m240(str4);
                    } else {
                        iM240 = (C0016.f9 | C0016.f9) + 1753665;
                    }
                    break;
                case 1748895:
                    break;
                case 1749695:
                    Hawk.put(str9, arrayList3);
                    iM240 = C0013.m114() >= 0 ? C0015.m573("۟ۧۡ") : (C0013.f2 + C0015.f6) ^ 1750589;
                    break;
                case 1749700:
                    this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setAdapter(this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    ArrayList arrayList4 = new ArrayList();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    String strM153 = C0013.m153(f7short, 0, 18, 807);
                    arrayList2 = (ArrayList) Hawk.get(strM153, arrayList4);
                    if ((C0016.f9 ^ (C0017.f10 % 1177)) < 0) {
                        str7 = "۟ۧ۟";
                        str9 = strM153;
                        arrayList3 = arrayList2;
                        iM240 = C0016.m618(str7);
                    } else {
                        C0015.m570();
                        arrayList = arrayList2;
                        str9 = strM153;
                        arrayList3 = arrayList;
                        iM240 = C0013.m105("ۧۥۢ");
                    }
                    break;
                case 1749787:
                    this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO2;
                    iM240 = C0016.m618("ۣۢۥ");
                    break;
                case 1749788:
                    str6 = "ۣۣۨ";
                    iM240 = C0015.m573(str6);
                    break;
                case 1750562:
                    str = C0016.m574() >= 0 ? "ۣۢۨ" : "ۦۨۢ";
                    iM240 = C0013.m105(str);
                    break;
                case 1750626:
                    if (C0013.f2 + C0015.f6 + 4271 <= 0) {
                        C0014.f3 = 32;
                        iM240 = C0015.m573("ۢۧۦ");
                    } else {
                        str = "ۡۨۦ";
                        iM240 = C0013.m105(str);
                    }
                    break;
                case 1750661:
                    layoutParams4.height = i;
                    this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setLayoutParams(layoutParams4);
                    ViewGroup.LayoutParams layoutParams7 = this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getLayoutParams();
                    layoutParams7.height = i;
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setLayoutParams(layoutParams7);
                    layoutParams = this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getLayoutParams();
                    if (C0014.f3 - (C0017.f10 - 2573) <= 0) {
                        C0015.f6 = 51;
                        str2 = "ۣۨۤ";
                    } else {
                        str2 = "ۤۦ";
                    }
                    layoutParams3 = layoutParams;
                    iM240 = C0014.m240(str2);
                    break;
                case 1750686:
                    str5 = "۠ۢ";
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    iM240 = C0015.m573(str5);
                    break;
                case 1750689:
                    this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(livePlayActivity);
                    if (C0014.f3 % (C0015.f6 * (-8870)) >= 0) {
                        C0016.f9 = 12;
                        iM240 = C0013.m105("ۦۨۢ");
                    } else {
                        str4 = "ۡۨۦ";
                        iM240 = C0014.m240(str4);
                    }
                    break;
                case 1750756:
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.github.tvbox.osc.ui.dialog.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                            if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                                return;
                            }
                            PopupWindow popupWindow2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                                LivePlayActivity livePlayActivity2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                livePlayActivity2.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.setVisibility(8);
                                LinearLayout linearLayout = livePlayActivity2.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                                if (linearLayout == null || linearLayout.getVisibility() != 0) {
                                    livePlayActivity2.f2977O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setVisibility(8);
                                    livePlayActivity2.f2976O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setVisibility(8);
                                    livePlayActivity2.f2974O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setVisibility(8);
                                } else {
                                    livePlayActivity2.f2977O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setVisibility(0);
                                    livePlayActivity2.f2976O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setVisibility(livePlayActivity2.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.getVisibility() == 0 ? 0 : 8);
                                    livePlayActivity2.f2974O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setVisibility(0);
                                }
                            }
                        }
                    });
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnClickListener(this);
                    this.f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setOnClickListener(this);
                    this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setOnClickListener(this);
                    this.f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.setOnClickListener(this);
                    this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setOnKeyListener(this);
                    iM240 = C0017.f10 - (C0016.f9 + 4284) >= 0 ? C0017.m731("ۦۥۦ") : (C0016.f9 - C0015.f6) + 1746449;
                    break;
                case 1750781:
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setOnItemClickListener(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this));
                    calendar = Calendar.getInstance();
                    calendar.set(11, 23);
                    calendar.set(12, 59);
                    calendar.set(13, 59);
                    calendar.set(14, 999);
                    if (C0016.f9 * (C0016.f9 % 4287) <= 0) {
                        calendar2 = calendar;
                        iM240 = C0014.m240("۠ۦۡ");
                    } else {
                        calendar2 = calendar;
                        iM240 = C0017.m731("ۤ۠ۢ");
                    }
                    break;
                case 1750814:
                    O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO3 = this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                    o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO3.getClass();
                    ArrayList arrayList5 = O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.f1285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList3);
                    o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO3.notifyDataSetChanged();
                    if (C0016.f9 - (C0017.f10 | (-8227)) <= 0) {
                        C0015.f6 = 37;
                        iM240 = C0014.m240("۟ۤ۟");
                    } else {
                        str8 = "۟۟۟";
                        iM240 = C0016.m618(str8);
                    }
                    break;
                case 1751526:
                    this.f3084O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = calendar2.getTimeInMillis() / 1000;
                    if (this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo != null) {
                        if (C0013.f2 + C0015.f6 + 4271 <= 0) {
                            C0014.f3 = 32;
                            iM240 = C0015.m573("ۢۧۦ");
                        } else {
                            str = "ۡۨۦ";
                            iM240 = C0013.m105(str);
                        }
                    } else if (C0017.f10 * (C0017.f10 | (-9547)) > 0) {
                        str3 = "ۣۤۢ";
                        iM240 = C0016.m618(str3);
                    }
                    break;
                case 1751709:
                    if ((C0015.f6 | C0015.f6 | 5737) >= 0) {
                        C0016.m574();
                        str7 = "ۤۥ۟";
                        arrayList2 = arrayList3;
                        arrayList3 = arrayList2;
                        iM240 = C0016.m618(str7);
                    } else {
                        iM240 = C0015.m573("ۥۦۥ");
                    }
                    break;
                case 1751772:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f1142O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new TextView(livePlayActivity);
                    str3 = "۠ۢ";
                    iM240 = C0016.m618(str3);
                    break;
                case 1752676:
                    this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setAdapter(this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000);
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    ArrayList arrayListO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    ArrayList arrayList6 = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    arrayList6.clear();
                    arrayList6.addAll(arrayListO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2;
                    iM240 = C0013.m105("ۦۤۡ");
                    break;
                case 1752733:
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2.f1151O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = livePlayActivity;
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2.setHasStableIds(true);
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
                    this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setAdapter(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2);
                    this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.addOnScrollListener(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this));
                    if (C0013.f2 - (C0017.f10 | (-3021)) <= 0) {
                        C0017.f10 = 7;
                        iM240 = C0017.m731("ۡۨۦ");
                    } else {
                        iM240 = C0015.m573("ۣۧۡ");
                    }
                    break;
                case 1752734:
                    this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();
                    if (C0016.f9 <= 0) {
                        calendar = calendar2;
                        calendar2 = calendar;
                        iM240 = C0017.m731("ۤ۠ۢ");
                    } else {
                        iM240 = (C0013.f2 * C0016.f9) + 1024576;
                    }
                    break;
                case 1753570:
                    layoutParams2.height = i;
                    this.f3062O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams8 = this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getLayoutParams();
                    layoutParams8.height = i;
                    this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setLayoutParams(layoutParams8);
                    layoutParams4 = this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getLayoutParams();
                    iM240 = (C0015.f6 % C0017.f10) + 1751270;
                    break;
                case 1753571:
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyDataSetChanged();
                    this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.addOnScrollListener(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this));
                    this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setOnItemClickListener(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this));
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
                    if (C0013.m114() < 0) {
                        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                        iM240 = C0015.m573("ۥۨ۠");
                    } else {
                        C0013.f2 = 90;
                        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                        iM240 = C0015.m573("ۤۨ۠");
                    }
                    break;
                case 1753578:
                    this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.addOnScrollListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this));
                    this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.setOnItemClickListener(new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 9));
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setHasStableIds(true);
                    this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    iM240 = C0016.m618("۠ۡۧ");
                    break;
                case 1753607:
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mChannelGridView);
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mDivRight);
                    this.f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mDivLeft);
                    this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mEpgDateGridView);
                    this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mEpgInfoGridView);
                    this.f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mShortcutsMenuLayout);
                    if (C0015.f6 - (C0014.f3 + 6040) >= 0) {
                        C0015.m570();
                        str3 = "ۣۤۢ";
                        iM240 = C0016.m618(str3);
                    } else {
                        iM240 = C0013.f2 + C0014.f3 + 1748203;
                    }
                    break;
                case 1753696:
                    this.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = null;
                    this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = new Handler();
                    this.f3088O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = 0L;
                    this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 0);
                    this.f3091O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 1);
                    this.f3092O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, 2);
                    if (C0016.f9 / (C0016.f9 / 344) <= 0) {
                        C0016.f9 = 40;
                        iM240 = C0013.m105("۠ۢ");
                    } else {
                        iM240 = C0013.m105("ۡۧۡ");
                    }
                    break;
                case 1754468:
                    this.f3071O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = (TextView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.epgText);
                    this.f3072O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = (TextView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.epgTime);
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1350O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    this.f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1347O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    this.f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1342O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1361O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                    if ((C0015.f6 ^ (C0015.f6 % 3013)) != 0) {
                        C0013.m114();
                        iM240 = C0016.m618("ۣ۠۟");
                    } else {
                        iM240 = C0015.f6 + C0013.f2 + 1746551;
                    }
                    break;
                case 1754474:
                    this.f3067O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mEmptyChannelLayout);
                    this.f3068O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mPasswordLayout);
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = (EditText) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mPasswordEdit);
                    this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (TextView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.passwordOkButton);
                    this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = (LinearLayout) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mDescChannelLayout);
                    this.f3070O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = (TextView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mDescText);
                    str2 = "ۧۢ۟";
                    layoutParams = layoutParams3;
                    layoutParams3 = layoutParams;
                    iM240 = C0014.m240(str2);
                    break;
                case 1754564:
                    View viewInflate = LayoutInflater.from(livePlayActivity).inflate(R.layout.dialog_channel_group, (ViewGroup) null);
                    this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = viewInflate;
                    this.f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = (LinearLayout) viewInflate.findViewById(R.id.mPoPuLayout);
                    this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mShortcutsMenuGridView);
                    this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mFirstGroupGridView);
                    this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (CustomRecyclerView) this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.findViewById(R.id.mGroupGridView);
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1;
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                        iM240 = C0016.m618("۠ۡۧ");
                    } else {
                        iM240 = C0014.m240("ۦۥۦ");
                    }
                    break;
                case 1754659:
                    if (C0016.m574() >= 0) {
                        str = "ۣۦۧ";
                        iM240 = C0013.m105(str);
                    } else {
                        C0013.m114();
                        str6 = "۟ۢ";
                        iM240 = C0015.m573(str6);
                    }
                    break;
                case 1755372:
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1370O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.observe(livePlayActivity, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this));
                    if (this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == null) {
                        if (C0013.f2 * C0015.f6 * 3885 >= 0) {
                            C0015.f6 = 74;
                            iM240 = C0015.m573("ۤۦ");
                        } else {
                            iM240 = C0017.m731("ۥۨۡ");
                        }
                    } else if ((C0015.f6 | C0015.f6 | 5737) >= 0) {
                        C0016.m574();
                        str7 = "ۤۥ۟";
                        arrayList2 = arrayList3;
                        arrayList3 = arrayList2;
                        iM240 = C0016.m618(str7);
                    } else {
                        iM240 = C0015.m573("ۥۦۥ");
                    }
                    break;
                case 1755465:
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setAnimationStyle(R.style.Channel_Group_PopupAnimation);
                    if (C0015.f6 >= 0) {
                        C0015.f6 = 61;
                        iM240 = C0017.m731("ۥۨۡ");
                    } else {
                        iM240 = (C0015.f6 % C0015.f6) ^ 1750756;
                    }
                    break;
                case 1755585:
                    if (C0016.m574() >= 0) {
                        str5 = "ۡۢ۠";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        iM240 = C0015.m573(str5);
                    } else {
                        iM240 = (C0015.f6 + C0017.f10) ^ (-1750931);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, int i) {
        String str;
        String str2;
        int i2;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        String str3;
        String str4;
        Integer num;
        int iM105 = C0013.m105("ۥۤۨ");
        Integer num2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            switch (iM105) {
                case 56288:
                    iM105 = C0013.f2 + C0014.f3 + 1751932;
                    break;
                case 1747656:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.getClass();
                    iM105 = C0017.m731("ۨۤۦ");
                    break;
                case 1747682:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i;
                    if (C0016.f9 * (C0014.f3 + 5741) <= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("ۤ۟ۦ");
                    } else {
                        iM105 = C0014.m240("ۦۡۥ");
                    }
                    break;
                case 1747842:
                    if (i3 != -1) {
                        if (C0013.f2 - (C0014.f3 + 6080) >= 0) {
                            C0015.m570();
                            str4 = "ۥۤۨ";
                            iM105 = C0014.m240(str4);
                        } else {
                            iM105 = (C0015.f6 ^ C0016.f9) + 1749936;
                        }
                    } else if (C0014.m245() >= 0) {
                        C0015.m570();
                        str3 = "ۣ۠ۦ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        iM105 = C0016.m618(str3);
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    } else {
                        iM105 = (C0014.f3 % C0014.f3) + 1750631;
                    }
                    break;
                case 1748894:
                    break;
                case 1749606:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.notifyItemChanged(i3, num2);
                    if (C0015.f6 + (C0013.f2 / 7331) >= 0) {
                        C0014.f3 = 10;
                        iM105 = C0016.m618("ۦۡۥ");
                    } else {
                        str4 = "ۣۢۦ";
                        iM105 = C0014.m240(str4);
                    }
                    break;
                case 1749792:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.post(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                    num = num2;
                    str2 = "ۧۢۧ";
                    num2 = num;
                    i2 = i3;
                    i3 = i2;
                    iM105 = C0013.m105(str2);
                    break;
                case 1750565:
                    if (i4 != -1) {
                        iM105 = (C0014.f3 | C0015.f6) + 1755467;
                    } else if (C0013.f2 * (C0017.f10 / (-8626)) != 0) {
                        iM105 = C0015.m573("ۧۤ");
                    } else {
                        str3 = "ۢۦۤ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        iM105 = C0016.m618(str3);
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    }
                    break;
                case 1750631:
                    int i7 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                    iM105 = (C0014.f3 % C0017.f10) + 1750780;
                    i4 = i7;
                    break;
                case 1751499:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i5, i6, i, false, false);
                    if (C0016.f9 - (C0016.f9 + 7312) >= 0) {
                        C0013.m114();
                        iM105 = C0016.m618("ۨۤۡ");
                    } else {
                        iM105 = (C0016.f9 + C0016.f9) ^ 1755130;
                    }
                    break;
                case 1752610:
                    i6 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    if ((C0013.f2 ^ (C0014.f3 / (-1794))) > 0) {
                        iM105 = C0015.m573("ۤ۟ۦ");
                    } else {
                        C0013.f2 = 62;
                        str = "ۦۢۤ";
                        iM105 = C0016.m618(str);
                    }
                    break;
                case 1752616:
                    if (C0014.m245() >= 0) {
                        C0015.m570();
                        str3 = "ۣ۠ۦ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        iM105 = C0016.m618(str3);
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    } else {
                        iM105 = (C0014.f3 % C0014.f3) + 1750631;
                    }
                    break;
                case 1752617:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    str3 = "۠۟ۧ";
                    iM105 = C0016.m618(str3);
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    break;
                case 1753482:
                    num = 0;
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 12;
                        str2 = "ۧۢۧ";
                        num2 = num;
                        i2 = i3;
                        i3 = i2;
                        iM105 = C0013.m105(str2);
                    } else {
                        iM105 = (C0016.f9 % C0015.f6) + 1747642;
                        num2 = num;
                    }
                    break;
                case 1753512:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    if (C0014.f3 / (C0013.f2 + 3902) != 0) {
                        C0016.m574();
                        iM105 = C0017.m731("ۨۤۦ");
                    } else {
                        iM105 = (C0014.f3 ^ C0014.f3) ^ 1748894;
                    }
                    break;
                case 1754476:
                    i5 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    str = "ۥۤۡ";
                    iM105 = C0016.m618(str);
                    break;
                case 1755402:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.notifyItemChanged(i4, num2);
                    str2 = "ۢۦۤ";
                    i2 = i3;
                    i3 = i2;
                    iM105 = C0013.m105(str2);
                    break;
                case 1755493:
                    if (C0013.f2 * (C0017.f10 / (-8626)) != 0) {
                        iM105 = C0015.m573("ۧۤ");
                    } else {
                        str3 = "ۢۦۤ";
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        iM105 = C0016.m618(str3);
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    }
                    break;
                case 1755498:
                    i2 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                    if (C0015.f6 + (C0014.f3 - 4959) >= 0) {
                        i3 = i2;
                        iM105 = C0015.m573("ۥۤۧ");
                    } else {
                        str2 = "۠۠ۢ";
                        i3 = i2;
                        iM105 = C0013.m105(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x0176  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iM240 = C0014.m240("۠ۧۦ");
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch (iM240) {
                case 56476:
                    if (i3 == -1) {
                        iM240 = C0016.m618("ۣۥۧ");
                    } else if (C0017.f10 * (C0017.f10 ^ 7649) <= 0) {
                        iM240 = C0016.m618("ۦ۟ۤ");
                    } else {
                        str5 = "ۦ۟ۤ";
                        iM240 = C0013.m105(str5);
                    }
                    break;
                case 1746849:
                    i3 = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    if (C0015.f6 + (C0013.f2 - 5514) >= 0) {
                        str5 = "ۦۡۢ";
                        iM240 = C0013.m105(str5);
                    } else {
                        iM240 = (C0013.f2 - C0014.f3) + 55361;
                    }
                    break;
                case 1746941:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i, f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo), O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo));
                    if (C0014.f3 + (C0014.f3 % (-9859)) >= 0) {
                        C0016.m574();
                        str6 = "ۨ۠۠";
                    } else {
                        str6 = "ۣ۠۠";
                    }
                    iM240 = C0016.m618(str6);
                    break;
                case 1746969:
                    if (C0017.f10 * C0013.f2 * 9492 <= 0) {
                        C0013.f2 = 21;
                        str3 = "ۡۤۥ";
                    } else {
                        str3 = "ۥۦۤ";
                    }
                    iM240 = C0013.m105(str3);
                    break;
                case 1746974:
                    i2 = f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                    if (C0015.f6 * (C0015.f6 ^ (-9322)) >= 0) {
                        C0017.f10 = 10;
                        iM240 = C0016.m618("ۣۧۨ");
                    } else {
                        str3 = "ۨ۠۠";
                        iM240 = C0013.m105(str3);
                    }
                    break;
                case 1747683:
                    break;
                case 1747776:
                    iM240 = (C0016.f9 * C0015.f6) + 2243221;
                    break;
                case 1747903:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    if (C0015.f6 >= 0) {
                        C0016.m574();
                        iM240 = C0016.m618("ۥۦۤ");
                    } else {
                        str2 = "ۦۡۢ";
                        iM240 = C0015.m573(str2);
                    }
                    break;
                case 1749731:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 16;
                        str4 = "ۣۧۢ";
                        iM240 = C0017.m731(str4);
                    } else {
                        iM240 = (C0016.f9 ^ C0014.f3) ^ (-1750457);
                    }
                    break;
                case 1750540:
                case 1750756:
                    iM240 = C0017.f10 / (C0015.f6 ^ (-1451)) != 0 ? C0014.m240("ۧۢۨ") : (C0017.f10 ^ C0014.f3) + 1746394;
                    break;
                case 1750599:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = -1;
                    iM240 = (C0015.f6 - C0017.f10) + 1746792;
                    break;
                case 1750725:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    if (C0016.f9 * (C0016.f9 ^ (-8289)) >= 0) {
                        C0015.m570();
                        iM240 = C0014.m240("ۣۣ۠");
                    } else {
                        str = "۟ۨۧ";
                        iM240 = C0016.m618(str);
                    }
                    break;
                case 1752461:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList);
                    if (C0013.f2 - (C0015.f6 % (-8178)) <= 0) {
                        C0017.f10 = 24;
                        iM240 = C0014.m240("ۥۣۧ");
                    } else {
                        iM240 = (C0017.f10 / C0014.f3) + 1754655;
                    }
                    break;
                case 1752675:
                    f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                    str4 = "ۣۣ۠";
                    iM240 = C0017.m731(str4);
                    break;
                case 1752705:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    if (C0014.f3 >= 0) {
                        str = "۠ۧۦ";
                        iM240 = C0016.m618(str);
                    } else {
                        iM240 = (C0017.f10 | C0015.f6) + 1754149;
                    }
                    break;
                case 1753419:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i3 - 4));
                    if (C0014.f3 >= 0) {
                        C0015.f6 = 8;
                        iM240 = C0017.m731("ۨۦۧ");
                    } else {
                        iM240 = (C0013.f2 - C0017.f10) ^ 1749183;
                    }
                    break;
                case 1753423:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i2 - 4));
                    if (C0013.f2 <= 0) {
                        C0013.f2 = 57;
                        iM240 = C0013.m105("۟ۤۦ");
                    } else {
                        iM240 = C0014.m240("ۥۦۤ");
                    }
                    break;
                case 1753479:
                    ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
                    if ((C0015.f6 | C0017.f10 | (-4812)) >= 0) {
                        C0013.f2 = 93;
                        iM240 = C0013.m105("ۣۥۧ");
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    } else {
                        iM240 = 1751918 + (C0014.f3 - C0017.f10);
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    }
                    break;
                case 1753540:
                    f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 0;
                    iM240 = (C0014.f3 * C0016.f9) + 1923666;
                    break;
                case 1753669:
                    iM240 = C0014.f3 + C0017.f10 + 1748876;
                    break;
                case 1754472:
                    str3 = "ۥۣۧ";
                    iM240 = C0013.m105(str3);
                    break;
                case 1754658:
                    if (i != f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo) {
                        str3 = "ۥۣۧ";
                        iM240 = C0013.m105(str3);
                    } else if (C0015.f6 >= 0) {
                        iM240 = C0015.m573("ۥۡ");
                    } else {
                        str4 = "۟ۤۦ";
                        iM240 = C0017.m731(str4);
                    }
                    break;
                case 1755368:
                    if (i2 == -1) {
                        if (C0017.f10 * C0013.f2 * 9492 <= 0) {
                            C0013.f2 = 21;
                            str3 = "ۡۤۥ";
                        } else {
                            str3 = "ۥۦۤ";
                        }
                        iM240 = C0013.m105(str3);
                    } else if (C0016.m574() >= 0) {
                        C0017.m717();
                        str2 = "ۣۦۧ";
                        iM240 = C0015.m573(str2);
                    } else {
                        iM240 = (C0016.f9 ^ C0014.f3) + 1754447;
                    }
                    break;
                case 1755561:
                    iM240 = C0016.m618("ۣۥۧ");
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, TextView textView) {
        int iM240 = C0014.m240("ۨۢ۠");
        TextUtils.TruncateAt truncateAt = null;
        TextUtils.TruncateAt truncateAt2 = null;
        while (true) {
            switch (iM240) {
                case 1747867:
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (C0017.m717() >= 0) {
                        C0013.m114();
                        iM240 = C0013.m105("ۤ۟ۧ");
                        truncateAt2 = ellipsize;
                    } else {
                        iM240 = 1750332 + (C0016.f9 ^ C0017.f10);
                        truncateAt2 = ellipsize;
                        continue;
                    }
                    break;
                case 1748710:
                    if (C0013.f2 <= 0) {
                        C0017.m717();
                        iM240 = C0013.m105("ۡۧ۠");
                    } else {
                        iM240 = (C0016.f9 * C0017.f10) + 2368652;
                        continue;
                    }
                    break;
                case 1748892:
                    if (truncateAt2 == truncateAt) {
                        break;
                    } else if (C0014.m245() >= 0) {
                        C0017.f10 = 80;
                        iM240 = C0017.m731("ۣۡۨ");
                    } else {
                        iM240 = (C0016.f9 * C0014.f3) ^ (-1578380);
                    }
                    break;
                case 1749733:
                    textView.setEllipsize(truncateAt);
                    if (C0016.m574() >= 0) {
                        C0017.f10 = 56;
                        iM240 = C0016.m618("ۨۢ۠");
                    } else {
                        iM240 = (C0013.f2 * C0016.f9) + 1023485;
                        continue;
                    }
                    break;
                case 1749855:
                    truncateAt = TextUtils.TruncateAt.MARQUEE;
                    if ((C0015.f6 | C0017.f10 | 9581) >= 0) {
                        iM240 = C0015.m573("ۡۢۧ");
                    } else {
                        iM240 = (C0014.f3 ^ C0016.f9) + 1749916;
                        continue;
                    }
                    break;
                case 1751500:
                    break;
                case 1751585:
                    return;
                case 1755430:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    if (C0014.m245() >= 0) {
                        C0017.f10 = 93;
                    }
                    iM240 = C0015.m573("۠ۦۡ");
                    continue;
                default:
                    continue;
            }
            if (C0017.f10 - (C0016.f9 ^ 1694) >= 0) {
                C0017.f10 = 31;
                iM240 = C0013.m105("ۦۣۨ");
            } else {
                iM240 = (C0015.f6 - C0016.f9) ^ (-1753001);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x009a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, View view, boolean z) {
        String str;
        String str2;
        String str3;
        int iM240 = C0014.m240("۠ۢ");
        ColorDrawable colorDrawable = null;
        Drawable drawable = null;
        Drawable drawable2 = null;
        while (true) {
            switch (iM240) {
                case 56295:
                    if (C0013.m114() >= 0) {
                        C0013.f2 = 69;
                        str = "۟۟ۦ";
                        iM240 = C0015.m573(str);
                    } else {
                        iM240 = C0014.m240("ۡۢۨ");
                    }
                    break;
                case 56322:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    if (C0017.f10 >= 0) {
                        C0016.f9 = 69;
                        iM240 = C0013.m105("ۣۨ۠");
                    } else {
                        iM240 = C0015.m573("ۡۧۢ");
                    }
                    break;
                case 56452:
                    iM240 = (C0015.f6 | C0013.f2) ^ (-1747064);
                    break;
                case 1746694:
                    colorDrawable = LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO;
                    if (C0016.f9 + (C0015.f6 % 6401) <= 0) {
                        C0013.f2 = 62;
                        iM240 = C0017.m731("۟ۤۧ");
                    } else {
                        iM240 = (C0016.f9 ^ C0017.f10) + 1749244;
                    }
                    break;
                case 1746753:
                    drawable = LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;
                    str3 = "۟ۦۡ";
                    iM240 = C0013.m105(str3);
                    break;
                case 1746850:
                case 1748711:
                    iM240 = C0017.m731("ۣۨۤ");
                    break;
                case 1746906:
                    if (C0013.f2 - (C0015.f6 | 2244) <= 0) {
                        drawable2 = drawable;
                        iM240 = C0014.m240("ۡۤۢ");
                    } else {
                        drawable2 = drawable;
                        iM240 = (C0015.f6 ^ C0015.f6) + 56295;
                    }
                    break;
                case 1746967:
                    break;
                case 1748767:
                    if (C0015.m570() <= 0) {
                        C0017.f10 = 73;
                        drawable2 = colorDrawable;
                        iM240 = C0013.m105("ۣ۟ۡ");
                    } else {
                        str = "ۣۨۤ";
                        drawable2 = colorDrawable;
                        iM240 = C0015.m573(str);
                    }
                    break;
                case 1748860:
                    if (z) {
                        iM240 = (C0015.f6 | C0017.f10) + 1747362;
                    } else if (C0014.f3 + (C0016.f9 % (-5937)) <= 0) {
                        C0013.m114();
                        str3 = "ۡۤ";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0016.f9 - C0014.f3) + 1745670;
                    }
                    break;
                case 1749640:
                    if (C0014.f3 + (C0016.f9 % (-5937)) <= 0) {
                        C0013.m114();
                        str3 = "ۡۤ";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0016.f9 - C0014.f3) + 1745670;
                    }
                    break;
                case 1755340:
                    view.setBackground(drawable2);
                    if (C0016.f9 + (C0016.f9 - 6877) >= 0) {
                        C0017.m717();
                        str2 = "۠ۢ";
                        iM240 = C0014.m240(str2);
                    } else {
                        iM240 = (C0013.f2 * C0013.f2) ^ 1504263;
                    }
                    break;
                case 1755371:
                    iM240 = C0015.f6 - (C0017.f10 | (-1760)) <= 0 ? C0014.m240("ۡ۟ۢ") : (C0017.f10 + C0015.f6) ^ (-55637);
                    break;
                case 1755495:
                    if (view.getBackground() == drawable2) {
                        iM240 = (C0015.f6 | C0013.f2) ^ (-1747064);
                    } else if (C0016.f9 * C0017.f10 * 3721 > 0) {
                        str2 = "ۣۨ۟";
                        iM240 = C0014.m240(str2);
                    } else {
                        C0013.f2 = 48;
                        iM240 = C0015.m573("ۡۧۢ");
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, TextView textView, int i) {
        String str;
        String str2;
        int iM240 = C0014.m240("ۥۣۥ");
        while (true) {
            switch (iM240) {
                case 1746908:
                    if (C0016.f9 + (C0015.f6 | (-920)) <= 0) {
                        C0017.m717();
                        iM240 = C0014.m240("ۧۦ۠");
                    } else {
                        iM240 = (C0017.f10 - C0014.f3) ^ (-1755996);
                    }
                    break;
                case 1749791:
                    if (C0017.f10 * (C0015.f6 ^ (-5591)) >= 0) {
                        C0016.f9 = 91;
                        str = "ۢۤۢ";
                        iM240 = C0013.m105(str);
                    } else {
                        iM240 = (C0015.f6 * C0014.f3) + 1621648;
                    }
                    break;
                case 1752583:
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    if ((C0013.f2 | (C0016.f9 ^ (-1253))) >= 0) {
                        iM240 = C0014.m240("ۥۣۥ");
                    } else {
                        str = "ۦۡۢ";
                        iM240 = C0013.m105(str);
                    }
                    break;
                case 1753479:
                    if (textView.getCurrentTextColor() != i) {
                        if (C0016.m574() >= 0) {
                            C0017.f10 = 68;
                            str2 = "ۦۡۢ";
                        } else {
                            str2 = "ۧۦۥ";
                        }
                        iM240 = C0013.m105(str2);
                    } else if (C0016.f9 + (C0015.f6 | (-920)) <= 0) {
                        C0017.m717();
                        iM240 = C0014.m240("ۧۦ۠");
                    } else {
                        iM240 = (C0017.f10 - C0014.f3) ^ (-1755996);
                    }
                    break;
                case 1754598:
                    textView.setTextColor(i);
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        iM240 = C0015.m573("ۧۦۥ");
                    } else {
                        iM240 = C0013.m105("ۣۨ۠");
                    }
                    break;
                case 1755461:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x016c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0015. Please report as an issue. */
    public static ArrayList O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        Locale locale;
        String str;
        Date time;
        String str2;
        String str3;
        String str4;
        String str5;
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        String str6;
        Date date = null;
        SimpleDateFormat simpleDateFormat3 = null;
        Locale locale2 = null;
        Calendar calendar = null;
        ArrayList arrayList = null;
        SimpleDateFormat simpleDateFormat4 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
        int iM105 = C0013.m105("ۣ۠ۤ");
        int i = 0;
        while (true) {
            switch (iM105) {
                case 56445:
                    if (i == 6) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f952O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0016.m608(f7short, 25, 2, 1004);
                        if ((C0016.f9 | (C0013.f2 / 9183)) > 0) {
                            str2 = "ۣۦ۟";
                            iM105 = C0015.m573(str2);
                        } else {
                            C0013.m114();
                            iM105 = C0014.m240("ۡۤۡ");
                        }
                    } else if (C0016.m574() >= 0) {
                        str6 = "ۢۥۢ";
                        iM105 = C0015.m573(str6);
                    } else {
                        iM105 = C0016.f9 + C0015.f6 + 1752261;
                    }
                    break;
                case 56451:
                    if (C0016.f9 * (C0017.f10 % PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED) < 0) {
                        str2 = "۠ۢۡ";
                        iM105 = C0015.m573(str2);
                    } else {
                        str3 = "ۣۥۡ";
                        iM105 = C0013.m105(str3);
                    }
                    break;
                case 56569:
                    calendar.add(5, -6);
                    iM105 = (C0015.f6 - C0014.f3) + 1749973;
                    break;
                case 1746912:
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.f951O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
                    iM105 = (C0016.f9 - C0015.f6) + 55027;
                    break;
                case 1747743:
                    break;
                case 1747777:
                    arrayList = new ArrayList();
                    calendar = Calendar.getInstance();
                    iM105 = C0014.m240("ۡۤۡ");
                    break;
                case 1747933:
                    simpleDateFormat2 = new SimpleDateFormat(C0014.m250(f7short, 18, 2, PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE), locale2);
                    simpleDateFormat = new SimpleDateFormat(C0014.m250(f7short, 20, 5, 2014), locale2);
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        iM105 = C0016.m618("ۣۥۤ");
                        simpleDateFormat3 = simpleDateFormat;
                        simpleDateFormat4 = simpleDateFormat2;
                    } else {
                        iM105 = C0014.m240("ۨۡ");
                        simpleDateFormat3 = simpleDateFormat;
                        simpleDateFormat4 = simpleDateFormat2;
                    }
                    break;
                case 1748679:
                    if (i == 8) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f952O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0013.m153(f7short, 29, 2, 1378);
                        iM105 = C0016.f9 <= 0 ? C0017.m731("ۣۨۧ") : C0017.m731("ۥۣ۟");
                    } else if (C0017.f10 % (C0014.f3 * 5905) >= 0) {
                        C0013.f2 = 78;
                        iM105 = C0014.m240("ۣۨ۟");
                    } else {
                        iM105 = (C0014.f3 / C0015.f6) ^ 1749605;
                    }
                    break;
                case 1748766:
                    calendar.setTime(new Date());
                    locale = Locale.SIMPLIFIED_CHINESE;
                    str = "۠ۨۥ";
                    locale2 = locale;
                    iM105 = C0017.m731(str);
                    break;
                case 1748767:
                    str2 = C0014.f3 >= 0 ? "ۡۡ۟" : "ۣ۠ۤ";
                    iM105 = C0015.m573(str2);
                    break;
                case 1748830:
                    i++;
                    if (C0015.f6 - (C0017.f10 ^ (-9355)) >= 0) {
                        C0013.f2 = 24;
                        iM105 = C0017.m731("۟ۦۧ");
                    } else {
                        time = date;
                        date = time;
                        iM105 = C0013.m105("ۨۨۤ");
                    }
                    break;
                case 1749579:
                    if ((C0014.f3 ^ (C0017.f10 - 7798)) > 0) {
                        i = 0;
                        iM105 = C0017.m731("ۦۤۧ");
                    } else {
                        simpleDateFormat = simpleDateFormat3;
                        simpleDateFormat2 = simpleDateFormat4;
                        i = 0;
                        iM105 = C0014.m240("ۨۡ");
                        simpleDateFormat3 = simpleDateFormat;
                        simpleDateFormat4 = simpleDateFormat2;
                    }
                    break;
                case 1749605:
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f952O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = simpleDateFormat4.format(date);
                    if (C0014.m245() >= 0) {
                        C0016.f9 = 20;
                        iM105 = C0015.m573("ۡۡۧ");
                    } else {
                        str4 = "ۦۥۡ";
                        iM105 = C0013.m105(str4);
                    }
                    break;
                case 1749758:
                case 1751559:
                case 1751647:
                case 1754537:
                    iM105 = C0014.f3 >= 0 ? C0015.m573("ۣۤ") : (C0017.f10 * C0016.f9) ^ (-1284456);
                    break;
                case 1750722:
                case 1751557:
                    if ((C0016.f9 ^ (C0014.f3 / (-1062))) <= 0) {
                        C0013.f2 = 95;
                        iM105 = C0016.m618("۠۟۟");
                    } else {
                        iM105 = (C0014.f3 | C0015.f6) + 1753642;
                    }
                    break;
                case 1750748:
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM105 = C0016.m618("ۥۣ۟");
                    } else {
                        iM105 = (C0014.f3 * C0017.f10) ^ 1623749;
                    }
                    break;
                case 1750818:
                    arrayList.add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    calendar.add(5, 1);
                    if ((C0017.f10 ^ (C0013.f2 ^ 7958)) >= 0) {
                        str4 = "ۧ۟۟";
                        iM105 = C0013.m105(str4);
                    } else {
                        iM105 = (C0017.f10 * C0015.f6) ^ 1942632;
                    }
                    break;
                case 1752461:
                    if (i == 7) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f952O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = C0014.m250(f7short, 27, 2, 3054);
                        iM105 = (C0013.f2 % C0014.f3) ^ 1754436;
                    } else if (C0013.m114() < 0) {
                        C0015.m570();
                        str = "ۨ۟ۡ";
                        locale = locale2;
                        locale2 = locale;
                        iM105 = C0017.m731(str);
                    } else {
                        str6 = "ۡۡۧ";
                        iM105 = C0015.m573(str6);
                    }
                    break;
                case 1752577:
                    if (C0013.f2 <= 0) {
                        C0016.m574();
                        iM105 = C0017.m731("ۧۢۧ");
                    } else {
                        str5 = "ۤۡۤ";
                        iM105 = C0015.m573(str5);
                    }
                    break;
                case 1752615:
                    if (C0013.m114() < 0) {
                        str6 = "ۡۡۧ";
                        iM105 = C0015.m573(str6);
                    } else {
                        C0015.m570();
                        str = "ۨ۟ۡ";
                        locale = locale2;
                        locale2 = locale;
                        iM105 = C0017.m731(str);
                    }
                    break;
                case 1752706:
                    if (C0016.m574() >= 0) {
                        str6 = "ۢۥۢ";
                        iM105 = C0015.m573(str6);
                    } else {
                        iM105 = C0016.f9 + C0015.f6 + 1752261;
                    }
                    break;
                case 1753577:
                    if (i < 9) {
                        time = calendar.getTime();
                        if (C0015.f6 < 0) {
                            date = time;
                            iM105 = (C0013.f2 * C0015.f6) + 2295012;
                        } else {
                            date = time;
                            iM105 = C0013.m105("ۨۨۤ");
                        }
                    } else if (C0016.f9 * (C0017.f10 % PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED) < 0) {
                        str3 = "ۣۥۡ";
                        iM105 = C0013.m105(str3);
                    } else {
                        str2 = "۠ۢۡ";
                        iM105 = C0015.m573(str2);
                    }
                    break;
                case 1753602:
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f953O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = simpleDateFormat3.format(date);
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f954O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = date;
                    if (C0015.f6 + (C0014.f3 % (-9048)) >= 0) {
                        C0016.f9 = 12;
                        str5 = "ۣۢ۠";
                        iM105 = C0015.m573(str5);
                    } else {
                        iM105 = (C0016.f9 / C0015.f6) ^ (-1750819);
                    }
                    break;
                case 1754375:
                    if (C0017.f10 % (C0014.f3 * 5905) >= 0) {
                        C0013.f2 = 78;
                        iM105 = C0014.m240("ۣۨ۟");
                    } else {
                        iM105 = (C0014.f3 / C0015.f6) ^ 1749605;
                    }
                    break;
                case 1754476:
                    str3 = "ۢۥۡ";
                    iM105 = C0013.m105(str3);
                    break;
                case 1755620:
                    if (C0013.f2 + C0013.f2 + 4197 <= 0) {
                        C0014.m245();
                        iM105 = C0017.m731("ۦۤۧ");
                    } else {
                        iM105 = C0014.m240("ۣۥۤ");
                    }
                    break;
                default:
                    break;
            }
            return arrayList;
        }
    }

    public static ArrayList O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i, int i2) {
        int iM618 = C0016.m618("ۤۦۤ");
        while (true) {
            switch (iM618) {
                case 1746848:
                    return new ArrayList();
                case 1751714:
                    if (!O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i, i2)) {
                        break;
                    } else if (C0013.f2 + (C0015.f6 - 30) <= 0) {
                        C0013.m114();
                        iM618 = C0014.m240("ۨ۟ۡ");
                    } else {
                        iM618 = (C0017.f10 | C0015.f6) + 1747457;
                    }
                    break;
                case 1753573:
                    break;
                case 1754501:
                    iM618 = (C0014.f3 % C0017.f10) + 1751929;
                    continue;
                case 1755338:
                    return O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, i2);
                default:
                    continue;
            }
            if (C0015.m570() <= 0) {
                C0015.m570();
                iM618 = C0017.m731("ۦۣۨ");
            } else {
                iM618 = (C0013.f2 * C0014.f3) + 1948838;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    public static boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i, int i2) {
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String str;
        Object obj;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        String str7;
        ArrayList arrayList = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int iM618 = C0016.m618("ۡۨ۟");
        while (true) {
            switch (iM618) {
                case 56509:
                    str3 = "ۢ۟۟";
                    iM618 = C0015.m573(str3);
                    break;
                case 56542:
                    if ((C0015.f6 | (C0017.f10 % 482)) >= 0) {
                        C0013.f2 = 0;
                        iM618 = C0016.m618("۟ۤۥ");
                    } else {
                        str = "ۣۢۨ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1746689:
                    str6 = "۟ۤۥ";
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = null;
                    iM618 = C0013.m105(str6);
                    break;
                case 1746843:
                case 1747842:
                    if (C0015.f6 + (C0014.f3 % (-7465)) >= 0) {
                        C0014.f3 = 45;
                        str2 = "ۨۤۡ";
                        iM618 = C0016.m618(str2);
                    } else {
                        iM618 = C0016.m618("ۥۧۡ");
                    }
                    break;
                case 1746848:
                    if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 == null) {
                        iM618 = (C0016.f9 | C0017.f10) + 1747956;
                    } else if (C0013.f2 <= 0) {
                        iM618 = C0014.m240("۟ۦۣ");
                    } else {
                        str3 = "ۨ۠ۨ";
                        iM618 = C0015.m573(str3);
                    }
                    break;
                case 1746908:
                    if (i2 != -1) {
                        if (C0015.m570() <= 0) {
                            C0016.m574();
                            iM618 = C0015.m573("۠ۤ۠");
                        } else {
                            iM618 = (C0017.f10 * C0015.f6) ^ 1947688;
                        }
                    } else if (C0015.f6 >= 0) {
                        str3 = "ۣ۠ۨ";
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0016.f9 % C0014.f3) + 1750623;
                    }
                    break;
                case 1747686:
                    if (C0013.f2 <= 0) {
                        iM618 = C0013.m105("ۡۥۦ");
                    } else {
                        str4 = "۠ۥۧ";
                        iM618 = C0015.m573(str4);
                    }
                    break;
                case 1747743:
                    str7 = "۠ۤ۠";
                    iM618 = C0013.m105(str7);
                    break;
                case 1747747:
                case 1750562:
                    if (C0014.f3 >= 0) {
                        str4 = "ۦۡۡ";
                        iM618 = C0015.m573(str4);
                    } else {
                        iM618 = (C0016.f9 - C0016.f9) + 1746848;
                    }
                    break;
                case 1747804:
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        str = "ۤۡۨ";
                        z3 = false;
                        iM618 = C0014.m240(str);
                    } else {
                        z3 = false;
                        iM618 = C0014.f3 + C0014.f3 + 1753133;
                    }
                    break;
                case 1748618:
                    if (((Boolean) Hawk.get(C0016.m608(f7short, 31, 4, 2190), Boolean.valueOf(z))).booleanValue()) {
                        iM618 = (C0016.f9 | C0017.f10) + 1747956;
                    } else {
                        if (C0014.f3 * (C0016.f9 % (-5880)) >= 0) {
                            C0015.m570();
                        }
                        iM618 = C0014.m240("ۨۨ۟");
                    }
                    break;
                case 1748802:
                    iM618 = (C0014.f3 - C0014.f3) + 1748888;
                    break;
                case 1748888:
                    arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
                    if (C0013.f2 % (C0015.f6 ^ 8513) <= 0) {
                        C0014.m245();
                        iM618 = C0017.m731("ۦۦ۟");
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    } else {
                        iM618 = C0013.m105("ۤۥۥ");
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    }
                    break;
                case 1749570:
                    z2 = true;
                    if (C0017.f10 >= 0) {
                        iM618 = C0017.m731("ۣۧۧ");
                    } else {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3;
                        iM618 = C0013.m105("ۧ۠ۦ");
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    }
                    break;
                case 1749698:
                    if (C0014.f3 + (C0014.f3 | 3854) < 0) {
                        str2 = "۠ۢۥ";
                        iM618 = C0016.m618(str2);
                    } else {
                        C0013.f2 = 80;
                        obj = "ۣۣۢ";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                        iM618 = C0014.m240(obj);
                    }
                    break;
                case 1749731:
                    obj = "ۥۣۤ";
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(i2);
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    iM618 = C0014.m240(obj);
                    break;
                case 1749790:
                    if (arrayList.size() > i2) {
                        if (C0016.m574() >= 0) {
                            C0017.f10 = 28;
                            iM618 = C0017.m731("۠ۢۡ");
                        } else {
                            iM618 = C0013.f2 + C0017.f10 + 1749589;
                        }
                    } else if (C0015.f6 >= 0) {
                        str3 = "ۣ۠ۨ";
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0016.f9 % C0014.f3) + 1750623;
                    }
                    break;
                case 1750633:
                case 1751563:
                    iM618 = (C0016.f9 | C0017.f10) + 1747956;
                    break;
                case 1750787:
                    if (C0015.m570() <= 0) {
                        C0017.m717();
                        arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
                        iM618 = C0013.m105("ۤۥۥ");
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    } else {
                        iM618 = (C0016.f9 / C0013.f2) + 1746689;
                    }
                    break;
                case 1751498:
                    z = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1461O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM618 = C0015.m573("۠۠ۦ");
                    } else {
                        str4 = "ۡ۟ۨ";
                        iM618 = C0015.m573(str4);
                    }
                    break;
                case 1751684:
                    if (i != -1) {
                        if ((C0014.f3 ^ (C0015.f6 % 8359)) <= 0) {
                            C0015.f6 = 28;
                            iM618 = C0016.m618("ۢ۟۟");
                        } else {
                            iM618 = (C0015.f6 - C0016.f9) + 1748326;
                        }
                    } else if (C0015.f6 >= 0) {
                        str3 = "ۣ۠ۨ";
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0016.f9 % C0014.f3) + 1750623;
                    }
                    break;
                case 1752582:
                    if (C0013.f2 / (C0017.f10 | 4406) < 0) {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2;
                        obj = "ۣۣۢ";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                        iM618 = C0014.m240(obj);
                    } else {
                        C0014.m245();
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2;
                        iM618 = C0013.m105("ۧ۠ۦ");
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    }
                    break;
                case 1752703:
                    break;
                case 1753631:
                    if (C0015.f6 >= 0) {
                        str3 = "ۣ۠ۨ";
                        iM618 = C0015.m573(str3);
                    } else {
                        iM618 = (C0016.f9 % C0014.f3) + 1750623;
                    }
                    break;
                case 1754413:
                    if (C0013.f2 * (C0017.f10 | 8038) >= 0) {
                        C0016.f9 = 83;
                        str7 = "ۡۨ۟";
                        z3 = z2;
                        iM618 = C0013.m105(str7);
                    } else {
                        z3 = z2;
                        iM618 = C0016.m618("۠۠ۦ");
                    }
                    break;
                case 1755376:
                    if (TextUtils.isEmpty(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3.f908O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                        iM618 = (C0016.f9 | C0017.f10) + 1747956;
                    } else {
                        if (C0015.m570() <= 0) {
                            C0014.f3 = 19;
                            str5 = "ۧۥ";
                        } else {
                            str5 = "ۤ۟ۥ";
                        }
                        iM618 = C0015.m573(str5);
                    }
                    break;
                case 1755615:
                    if (!o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3.f925O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                        str3 = "ۢ۟۟";
                        iM618 = C0015.m573(str3);
                    } else if (C0017.f10 >= 0) {
                        C0014.m245();
                        str6 = "۟ۤ۠";
                        iM618 = C0013.m105(str6);
                    } else {
                        iM618 = (C0016.f9 % C0016.f9) + 56542;
                    }
                    break;
                default:
                    break;
            }
            return z3;
        }
    }

    public static void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(View view, int i) {
        int iM105 = C0013.m105("ۣۨۢ");
        while (true) {
            switch (iM105) {
                case 56536:
                    break;
                case 1747901:
                    view.setVisibility(i);
                    iM105 = C0016.f9 + C0013.f2 + 1750809;
                    continue;
                case 1750633:
                    iM105 = C0014.m240("ۣۨۢ");
                    continue;
                case 1750813:
                    if (view.getVisibility() != i) {
                        if ((C0015.f6 ^ (C0016.f9 / (-6370))) >= 0) {
                        }
                        iM105 = C0016.m618("۠ۧۤ");
                    }
                    break;
                case 1752518:
                    return;
                default:
                    continue;
            }
            iM105 = (C0016.f9 ^ C0017.f10) ^ (-1752091);
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x07b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x079e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0841 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x07ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x061f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x07a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0042. Please report as an issue. */
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList;
        String str;
        String strM608;
        Appoint appoint;
        long j;
        String str2;
        String str3;
        ArrayList arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        String str4;
        String str5;
        String str6;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i6;
        LivePlayActivity livePlayActivity;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        int epgIndex;
        int epgDateIndex;
        ArrayList arrayList2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = null;
        int i7 = 0;
        LivePlayActivity livePlayActivity2 = null;
        long j2 = 0;
        Appoint appoint2 = null;
        String str15 = null;
        long j3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean zIsEmpty = false;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        ArrayList arrayList3 = null;
        StringBuilder sb = null;
        String string = null;
        String str19 = null;
        String str20 = null;
        int iM618 = C0016.m618("ۢۦۢ");
        ArrayList arrayList4 = null;
        Appoint appoint3 = null;
        String strM250 = null;
        Handler handler = null;
        String strM251 = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        while (true) {
            switch (iM618) {
                case 56294:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(str15, appoint3);
                    iM618 = C0013.f2 * (C0016.f9 * (-1357)) >= 0 ? C0016.m618("ۦۨۧ") : (C0014.f3 + C0014.f3) ^ (-1754118);
                    break;
                case 56505:
                    arrayList = arrayList3;
                    if ((C0015.f6 | (C0014.f3 - 5910)) < 0) {
                        str12 = "۠ۢۡ";
                        arrayList3 = arrayList;
                        iM618 = C0016.m618(str12);
                    } else {
                        C0017.m717();
                        str13 = "ۨۢ۠";
                        arrayList3 = arrayList;
                        iM618 = C0017.m731(str13);
                    }
                    break;
                case 56510:
                    this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i3, i4, i5, false, true);
                    livePlayActivity2.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(str20);
                    iM618 = C0014.m240("ۣ۟ۤ");
                    break;
                case 1746722:
                    if (i != 6) {
                        iM618 = (C0014.f3 ^ C0017.f10) + 1752162;
                    } else if (i7 > i2) {
                        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                            LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = strM251;
                            if ((C0016.f9 | (C0014.f3 % (-3448))) >= 0) {
                                iM618 = C0016.m618("ۥۥۨ");
                            } else {
                                str11 = str19;
                                str19 = str11;
                                iM618 = C0013.m105("ۦ۟ۧ");
                            }
                        } else if (C0013.m114() >= 0) {
                            C0016.f9 = 46;
                            str9 = "ۧۨۤ";
                            str10 = str17;
                            str17 = str10;
                            iM618 = C0016.m618(str9);
                        } else {
                            iM618 = (C0014.f3 - C0014.f3) ^ 1748736;
                        }
                    } else if (C0013.f2 - (C0016.f9 + 4889) >= 0) {
                        iM618 = C0014.m240("۟ۤۨ");
                    } else {
                        str13 = "ۤۡۧ";
                        iM618 = C0017.m731(str13);
                    }
                    break;
                case 1746750:
                    if (i9 == f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && i10 == f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 && i11 == f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 && i2 == i12) {
                        appoint3.setTime(-1L);
                        if ((C0014.f3 ^ (C0013.f2 | TbsListener.ErrorCode.RENAME_FAIL)) >= 0) {
                            C0014.m245();
                            iM618 = C0014.m240("ۡ۠ۦ");
                        } else {
                            str14 = "ۣۧۦ";
                            iM618 = C0017.m731(str14);
                        }
                    } else {
                        iM618 = (C0017.f10 ^ C0017.f10) ^ 1750692;
                    }
                    break;
                case 1746816:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 39;
                        iM618 = C0017.m731("ۤۤۡ");
                    } else {
                        iM618 = (C0017.f10 - C0015.f6) ^ (-1755229);
                    }
                    break;
                case 1746875:
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        iM618 = C0016.m618("ۤۥۣ");
                    } else {
                        iM618 = C0013.m105("۠ۥۡ");
                    }
                    break;
                case 1747743:
                    appoint3.setTimeStr(str19);
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, true);
                    livePlayActivity2.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.removeMessages(26248);
                    if (C0016.f9 % (C0014.f3 + 2008) <= 0) {
                        C0013.m114();
                        iM618 = C0017.m731("ۨۨ۠");
                    } else {
                        iM618 = C0015.m573("ۡۤۧ");
                    }
                    break;
                case 1747809:
                case 1747834:
                case 1750601:
                case 1752547:
                case 1753421:
                case 1755336:
                case 1755345:
                    arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = arrayList2;
                    if (C0013.m114() >= 0) {
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0016.m618("۟ۤۢ");
                    } else {
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = (C0017.f10 + C0016.f9) ^ 1748722;
                    }
                    break;
                case 1747836:
                    j = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo / 1000;
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    appoint = new Appoint();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    strM608 = C0016.m608(f7short, 35, 11, 460);
                    if (C0013.m114() < 0) {
                        strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = str20;
                        str15 = strM608;
                        str20 = strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        appoint2 = appoint;
                        j2 = j;
                        iM618 = C0017.m731("ۣ۠ۧ");
                    } else {
                        str15 = strM608;
                        appoint2 = appoint;
                        j2 = j;
                        iM618 = C0014.m240("ۡۡۡ");
                    }
                    break;
                case 1747866:
                    if (C0013.m114() >= 0) {
                        C0016.f9 = 46;
                        str9 = "ۧۨۤ";
                        str10 = str17;
                        str17 = str10;
                        iM618 = C0016.m618(str9);
                    } else {
                        iM618 = (C0014.f3 - C0014.f3) ^ 1748736;
                    }
                    break;
                case 1748614:
                    if (C0016.f9 * (C0013.f2 % (-1218)) <= 0) {
                        C0015.m570();
                        iM618 = C0013.m105("ۣۧ");
                    } else {
                        iM618 = (C0017.f10 - C0015.f6) + 1749013;
                    }
                    break;
                case 1748616:
                    iM618 = C0016.f9 + C0013.f2 + 1750778;
                    break;
                case 1748618:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayList2.get(i5);
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i2);
                    i6 = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    livePlayActivity = this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (i == 6) {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        livePlayActivity2 = livePlayActivity;
                        i7 = i6;
                        iM618 = (C0014.f3 * C0013.f2) ^ (-1590781);
                    } else if (C0015.f6 >= 0) {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        livePlayActivity2 = livePlayActivity;
                        i7 = i6;
                        iM618 = C0017.m731("۟۠ۧ");
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        livePlayActivity2 = livePlayActivity;
                        i7 = i6;
                        iM618 = (C0016.f9 - C0016.f9) + 1748647;
                    }
                    break;
                case 1748647:
                    if (i <= 6) {
                        if (C0013.m114() >= 0) {
                            str5 = "ۦۨ۠";
                            iM618 = C0017.m731(str5);
                        } else {
                            str6 = "ۣۢۦ";
                            iM618 = C0016.m618(str6);
                        }
                    } else if ((C0017.f10 | C0017.f10 | 2709) >= 0) {
                        iM618 = C0015.m573("ۣ۟۟");
                    } else {
                        str3 = "۠ۥۡ";
                        arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = arrayList2;
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0014.m240(str3);
                    }
                    break;
                case 1748673:
                case 1754536:
                    break;
                case 1748736:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, strM250);
                    if (C0014.f3 * (C0017.f10 + 8848) >= 0) {
                        C0013.f2 = 49;
                        iM618 = C0015.m573("ۢۥۤ");
                    } else {
                        str14 = "ۦۨۧ";
                        iM618 = C0017.m731(str14);
                    }
                    break;
                case 1748765:
                    iM618 = C0016.m618("ۢۦۢ");
                    break;
                case 1748772:
                    livePlayActivity2.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.sendEmptyMessageDelayed(26248, (j2 - j3) * 1000);
                    if ((C0015.f6 ^ (C0016.f9 + 2875)) >= 0) {
                        iM618 = C0017.m731("ۡۤ۠");
                    } else {
                        str6 = "۟ۥ";
                        iM618 = C0016.m618(str6);
                    }
                    break;
                case 1748863:
                    if (C0017.m717() >= 0) {
                        C0013.f2 = 97;
                        str8 = "۠ۢۡ";
                        iM618 = C0015.m573(str8);
                    } else {
                        iM618 = (C0016.f9 / C0013.f2) + 1750601;
                    }
                    break;
                case 1748864:
                    arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i3, i4);
                    if (arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.isEmpty()) {
                        if (C0013.m114() >= 0) {
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = C0016.m618("۟ۤۢ");
                        } else {
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = (C0017.f10 + C0016.f9) ^ 1748722;
                        }
                    } else if (i5 >= arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size()) {
                        if (C0013.f2 <= 0) {
                            C0015.m570();
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = C0017.m731("ۥ۠ۢ");
                        } else {
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = (C0015.f6 / C0015.f6) ^ 1749760;
                        }
                    } else if (C0013.m114() >= 0) {
                        C0015.f6 = 5;
                        str3 = "ۧ۟ۥ";
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0014.m240(str3);
                    } else {
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0014.m240("ۡ۟ۨ");
                    }
                    break;
                case 1749733:
                    if (C0015.f6 < 0) {
                        str4 = "۠ۢۡ";
                        str19 = string;
                        iM618 = C0017.m731(str4);
                    } else {
                        C0015.f6 = 84;
                        str11 = string;
                        str19 = str11;
                        iM618 = C0013.m105("ۦ۟ۧ");
                    }
                    break;
                case 1749761:
                    iM618 = (C0015.f6 / C0015.f6) + 1753420;
                    break;
                case 1749788:
                    arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = arrayList2;
                    if (C0013.m114() >= 0) {
                        C0015.f6 = 5;
                        str3 = "ۧ۟ۥ";
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0014.m240(str3);
                    } else {
                        arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM618 = C0014.m240("ۡ۟ۨ");
                    }
                    break;
                case 1749790:
                    if (i == -1 || i2 == -1 || i4 == -1) {
                        arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = arrayList2;
                        if (C0013.m114() >= 0) {
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = C0016.m618("۟ۤۢ");
                        } else {
                            arrayList2 = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            iM618 = (C0017.f10 + C0016.f9) ^ 1748722;
                        }
                    } else if (i5 == -1) {
                        if (C0015.f6 >= 0) {
                            C0015.m570();
                            iM618 = C0017.m731("۟ۥ");
                        } else {
                            iM618 = (C0017.f10 ^ C0016.f9) + 1751107;
                        }
                    } else if (C0016.f9 * (C0013.f2 % (-1218)) <= 0) {
                        C0015.m570();
                        iM618 = C0013.m105("ۣۧ");
                    } else {
                        iM618 = (C0017.f10 - C0015.f6) + 1749013;
                    }
                    break;
                case 1749821:
                    epgDateIndex = appoint3.getEpgDateIndex();
                    epgIndex = appoint3.getEpgIndex();
                    if (appoint3.getTime() != -1 && appoint3.getTime() > j3 && i8 == f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo) {
                        i12 = epgIndex;
                        i11 = epgDateIndex;
                        iM618 = C0014.m240("۟ۡ۠");
                    } else {
                        i12 = epgIndex;
                        i11 = epgDateIndex;
                        iM618 = (C0017.f10 ^ C0017.f10) ^ 1750692;
                    }
                    break;
                case 1750531:
                    appoint3.setTime(j2);
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    int i14 = f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                    ArrayList arrayList5 = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    arrayList4 = arrayList5;
                    zIsEmpty = arrayList5.isEmpty();
                    i13 = i14;
                    iM618 = (C0017.f10 ^ C0014.f3) + 1751016;
                    break;
                case 1750567:
                    if (i7 < i2) {
                        if (C0017.f10 >= 0) {
                            C0013.m114();
                            iM618 = C0016.m618("ۤۥۣ");
                        } else {
                            iM618 = C0013.m105("۠ۥۡ");
                        }
                    } else if (C0016.m574() < 0) {
                        str7 = "ۡ۠ۦ";
                        iM618 = C0015.m573(str7);
                    } else {
                        C0015.m570();
                        str4 = "ۣۡۢ";
                        iM618 = C0017.m731(str4);
                    }
                    break;
                case 1750570:
                    Appoint appoint4 = (Appoint) Hawk.get(str15, appoint2);
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    int largeGroupIndex = appoint4.getLargeGroupIndex();
                    int groupIndex = appoint4.getGroupIndex();
                    int itemIndex = appoint4.getItemIndex();
                    iM618 = (C0013.f2 ^ C0016.f9) + 1749648;
                    appoint3 = appoint4;
                    j3 = jCurrentTimeMillis;
                    i8 = largeGroupIndex;
                    i9 = groupIndex;
                    i10 = itemIndex;
                    break;
                case 1750593:
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o);
                    Handler handler2 = this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                    strM250 = C0014.m250(f7short, 47, 9, 2197);
                    handler = handler2;
                    strM251 = C0014.m250(f7short, 56, 2, 594);
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                    iM618 = C0014.f3 + C0014.f3 + 1747152;
                    break;
                case 1750630:
                    if (C0013.f2 <= 0) {
                        C0016.m574();
                        iM618 = C0015.m573("ۡ۟ۨ");
                    } else {
                        iM618 = C0014.m240("۠ۤۥ");
                    }
                    break;
                case 1750692:
                    appoint3.setLargeGroupIndex(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                    appoint3.setGroupIndex(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                    appoint3.setItemIndex(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                    appoint3.setEpgDateIndex(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0);
                    appoint3.setEpgIndex(i2);
                    iM618 = C0015.m573("ۣ۟۟");
                    break;
                case 1751562:
                    this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i3, i4, i5, false, false);
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getClass();
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = C0014.m250(f7short, 58, 2, 1252);
                    if (C0014.m245() >= 0) {
                        C0017.m717();
                        iM618 = C0017.m731("۠ۥۡ");
                    } else {
                        str4 = "ۡۧۥ";
                        iM618 = C0017.m731(str4);
                    }
                    break;
                case 1751563:
                    if (zIsEmpty) {
                        str = null;
                        if (C0017.f10 >= 0) {
                            C0015.f6 = 13;
                            str5 = "ۣ۠ۡ";
                            str16 = str;
                            iM618 = C0017.m731(str5);
                        } else {
                            str16 = str;
                            iM618 = C0014.f3 + C0017.f10 + 1752653;
                        }
                    } else {
                        String str21 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) arrayList4.get(i13)).f953O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (C0015.f6 - (C0014.f3 ^ 5900) <= 0) {
                            C0014.m245();
                            str16 = null;
                            str18 = str21;
                            iM618 = C0017.m731("۟ۥۡ");
                        } else {
                            str16 = null;
                            str18 = str21;
                            iM618 = (C0014.f3 | C0016.f9) ^ (-1755613);
                        }
                    }
                    break;
                case 1751647:
                    if (C0015.f6 >= 0) {
                        str18 = str17;
                        iM618 = C0016.m618("ۧۨۡ");
                    } else {
                        str18 = str17;
                        iM618 = (C0013.f2 % C0017.f10) + 1754457;
                    }
                    break;
                case 1751649:
                    str = str16;
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 13;
                        str5 = "ۣ۠ۡ";
                        str16 = str;
                        iM618 = C0017.m731(str5);
                    } else {
                        str16 = str;
                        iM618 = C0014.f3 + C0017.f10 + 1752653;
                    }
                    break;
                case 1751680:
                    str10 = null;
                    str9 = "ۤۤ۟";
                    str17 = str10;
                    iM618 = C0016.m618(str9);
                    break;
                case 1752456:
                    if (C0013.m114() < 0) {
                        str8 = "ۥۣۤ";
                        iM618 = C0015.m573(str8);
                    } else {
                        C0013.m114();
                        epgIndex = i12;
                        epgDateIndex = i11;
                        i12 = epgIndex;
                        i11 = epgDateIndex;
                        iM618 = C0014.m240("۟ۡ۠");
                    }
                    break;
                case 1752487:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, strM250);
                    if ((C0016.f9 | C0017.f10 | (-6054)) < 0) {
                        strM608 = str15;
                        appoint = appoint2;
                        j = j2;
                        str15 = strM608;
                        appoint2 = appoint;
                        j2 = j;
                        iM618 = C0014.m240("ۡۡۡ");
                    } else {
                        C0014.m245();
                        str2 = "ۡۧۥ";
                        iM618 = C0014.m240(str2);
                    }
                    break;
                case 1752520:
                    if (C0013.f2 / (C0013.f2 | 6844) != 0) {
                        C0016.f9 = 53;
                        iM618 = C0014.m240("ۨ۠ۡ");
                    } else {
                        iM618 = (C0016.f9 * C0017.f10) + 2361056;
                    }
                    break;
                case 1752582:
                case 1754656:
                    str5 = "۟ۥ";
                    iM618 = C0017.m731(str5);
                    break;
                case 1752609:
                    iM618 = (C0017.f10 ^ C0017.f10) ^ 1750692;
                    break;
                case 1752648:
                    sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList3.get(i2)).f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    sb.append(C0016.m608(f7short, 46, 1, 462));
                    sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList3.get(i2)).f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    string = sb.toString();
                    if (C0013.f2 <= 0) {
                        C0014.m245();
                        iM618 = C0013.m105("ۡ۟ۤ");
                    } else {
                        iM618 = (C0014.f3 % C0017.f10) + 1749948;
                    }
                    break;
                case 1752704:
                    iM618 = (C0014.f3 ^ C0017.f10) + 1752162;
                    break;
                case 1752709:
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                        iM618 = C0016.f9 + C0013.f2 + 1750778;
                    } else {
                        LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = strM251;
                        this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i2);
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i2);
                        if (C0015.m570() <= 0) {
                            C0017.f10 = 16;
                            iM618 = C0017.m731("ۢۦۢ");
                        } else {
                            str7 = "ۨۥ۟";
                            iM618 = C0015.m573(str7);
                        }
                    }
                    break;
                case 1753422:
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i2);
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i2);
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3227O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i2);
                    handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, true);
                    if (C0016.f9 % (C0016.f9 | (-7205)) <= 0) {
                        C0014.f3 = 18;
                        strM608 = str15;
                        appoint = appoint2;
                        j = j2;
                        str15 = strM608;
                        str20 = strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        appoint2 = appoint;
                        j2 = j;
                        iM618 = C0017.m731("ۣ۠ۧ");
                    } else {
                        str20 = strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        iM618 = (C0013.f2 * C0015.f6) + 604610;
                    }
                    break;
                case 1753694:
                    O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo / 1000;
                    f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 / 1000;
                    f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = 0L;
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
                    if (C0013.f2 > 0) {
                        str8 = "ۣۡ۟";
                        iM618 = C0015.m573(str8);
                    } else {
                        str14 = "ۣۧۦ";
                        iM618 = C0017.m731(str14);
                    }
                    break;
                case 1753701:
                    str2 = "ۥۢ۠";
                    iM618 = C0014.m240(str2);
                    break;
                case 1753702:
                    if (C0013.f2 - (C0016.f9 + 4889) >= 0) {
                        iM618 = C0014.m240("۟ۤۨ");
                    } else {
                        str13 = "ۤۡۧ";
                        iM618 = C0017.m731(str13);
                    }
                    break;
                case 1754506:
                    this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, false);
                    livePlayActivity2.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.removeMessages(26248);
                    if (C0013.f2 <= 0) {
                        C0015.f6 = 95;
                        str7 = "ۦ۟";
                        iM618 = C0015.m573(str7);
                    } else {
                        iM618 = C0017.f10 + C0015.f6 + 1753823;
                    }
                    break;
                case 1754599:
                    appoint3.setDateStr(str18);
                    arrayList = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (arrayList.isEmpty()) {
                        str19 = str16;
                        if ((C0015.f6 | (C0014.f3 - 5910)) < 0) {
                            C0017.m717();
                            str13 = "ۨۢ۠";
                            arrayList3 = arrayList;
                            iM618 = C0017.m731(str13);
                        } else {
                            str12 = "۠ۢۡ";
                            arrayList3 = arrayList;
                            iM618 = C0016.m618(str12);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if (C0016.f9 <= 0) {
                            C0015.f6 = 0;
                            arrayList3 = arrayList;
                            sb = sb2;
                            str19 = str16;
                            iM618 = C0017.m731("ۣۡ۟");
                        } else {
                            arrayList3 = arrayList;
                            sb = sb2;
                            str19 = str16;
                            iM618 = (C0014.f3 - C0017.f10) + 1752105;
                        }
                    }
                    break;
                case 1755339:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    livePlayActivity = livePlayActivity2;
                    i6 = i7;
                    if (C0015.f6 >= 0) {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        livePlayActivity2 = livePlayActivity;
                        i7 = i6;
                        iM618 = C0017.m731("۟۠ۧ");
                    } else {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        livePlayActivity2 = livePlayActivity;
                        i7 = i6;
                        iM618 = (C0016.f9 - C0016.f9) + 1748647;
                    }
                    break;
                case 1755369:
                case 1755616:
                    if (C0013.f2 + (C0013.f2 | 3276) <= 0) {
                        str12 = "ۣۨۢ";
                        arrayList = arrayList3;
                        arrayList3 = arrayList;
                        iM618 = C0016.m618(str12);
                    } else {
                        iM618 = (C0014.f3 / C0014.f3) + 1754598;
                    }
                    break;
                case 1755402:
                    if (C0014.f3 * C0013.f2 * (-9516) <= 0) {
                        C0014.m245();
                        iM618 = C0016.m618("ۤۡۧ");
                    } else {
                        iM618 = (C0014.f3 | C0013.f2) ^ (-1755324);
                    }
                    break;
                case 1755522:
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3227O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i2);
                    handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, true);
                    this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i3, i4, i5, false, true);
                    livePlayActivity2.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
                    iM618 = C0016.f9 + (C0015.f6 % 8146) <= 0 ? C0016.m618("ۨۧۦ") : (C0017.f10 - C0017.f10) + 1752520;
                    break;
                case 1755591:
                    if (C0013.m114() >= 0) {
                        str5 = "ۦۨ۠";
                        iM618 = C0017.m731(str5);
                    } else {
                        str6 = "ۣۢۦ";
                        iM618 = C0016.m618(str6);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        String str;
        int iM618 = C0016.m618("ۥ۠ۦ");
        Handler handler = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        while (true) {
            switch (iM618) {
                case 56325:
                    handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    iM618 = (C0013.f2 * C0015.f6) + 2297829;
                    continue;
                case 1746847:
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                    str = "۠ۥ";
                    break;
                case 1749665:
                    return;
                case 1749729:
                    handler.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                    if (C0013.f2 - (C0013.f2 + 2324) >= 0) {
                        C0015.m570();
                        str = "۟ۤۤ";
                    } else {
                        iM618 = (C0016.f9 - C0015.f6) + 1748247;
                    }
                    break;
                case 1749756:
                    iM618 = (C0017.f10 | C0013.f2) + 1752605;
                    continue;
                case 1752491:
                    Handler handler2 = this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                    iM618 = (-1745610) ^ (C0017.f10 + C0015.f6);
                    handler = handler2;
                    continue;
                default:
                    continue;
            }
            iM618 = C0016.m618(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:221:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x047d A[SYNTHETIC] */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0022. Please report as an issue. */
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        int i;
        String str;
        Integer num;
        int i2;
        String str2;
        String str3;
        int i3;
        String str4;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        Integer num2 = null;
        int i10 = 0;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = null;
        int i11 = 0;
        int i12 = 0;
        Integer num3 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iM731 = C0017.m731("ۥۡ");
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = null;
        Integer num4 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = null;
        while (true) {
            switch (iM731) {
                case 56413:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i14;
                    if (C0017.m717() >= 0) {
                        C0015.f6 = 45;
                    }
                    num4 = 0;
                    iM731 = C0016.m618("۠۠ۨ");
                    break;
                case 56476:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo);
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                    iM731 = (C0016.f9 / C0016.f9) + 1752519;
                    break;
                case 56480:
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyItemChanged(i9, num2);
                    if (C0014.f3 >= 0) {
                        C0017.m717();
                        iM731 = C0016.m618("ۨ۠");
                    } else {
                        str3 = "۟ۥۡ";
                        iM731 = C0017.m731(str3);
                    }
                    break;
                case 56545:
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.notifyItemChanged(i13, num3);
                    if (C0013.f2 * C0016.f9 * (-242) >= 0) {
                        str4 = "ۢ۟ۢ";
                        i3 = i12;
                        i12 = i3;
                        iM731 = C0013.m105(str4);
                    } else {
                        iM731 = (C0015.f6 * C0014.f3) + 1622673;
                    }
                    break;
                case 56568:
                    i7 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    if (i7 != -1) {
                        if (C0013.f2 + (C0015.f6 - 1263) >= 0) {
                            i13 = i7;
                            iM731 = C0015.m573("۟ۧۢ");
                        } else {
                            i13 = i7;
                            iM731 = (-56064) ^ (C0017.f10 - C0016.f9);
                        }
                    } else if (C0017.m717() >= 0) {
                        i13 = i7;
                        iM731 = C0017.m731("ۢۨ");
                    } else {
                        i13 = i7;
                        iM731 = 1753608 + (C0017.f10 - C0017.f10);
                    }
                    break;
                case 1746816:
                    i5 = i10;
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                        i10 = i5;
                        iM731 = C0014.m240("ۤۡۦ");
                    } else {
                        obj = "ۥۥۧ";
                        i6 = i5;
                        i10 = i6;
                        iM731 = C0017.m731(obj);
                    }
                    break;
                case 1746848:
                    i4 = f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                    if (i4 > -1) {
                        i18 = i4;
                        iM731 = C0016.f9 + C0013.f2 + 1746163;
                    } else if (C0017.f10 / (C0017.f10 % (-2720)) <= 0) {
                        i18 = i4;
                        iM731 = C0015.m573("ۢۧۡ");
                    } else {
                        i18 = i4;
                        iM731 = (C0013.f2 ^ C0015.f6) + 1749159;
                    }
                    break;
                case 1746875:
                    i5 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    if (i5 != -1) {
                        if (C0014.m245() >= 0) {
                            C0015.f6 = 98;
                            i10 = i5;
                            iM731 = C0014.m240("ۤۦۣ");
                        } else {
                            i10 = i5;
                            iM731 = 1749792 + C0016.f9 + C0013.f2;
                        }
                    } else if (C0015.m570() <= 0) {
                        C0014.m245();
                        i10 = i5;
                        iM731 = C0014.m240("ۤۡۦ");
                    } else {
                        obj = "ۥۥۧ";
                        i6 = i5;
                        i10 = i6;
                        iM731 = C0017.m731(obj);
                    }
                    break;
                case 1746904:
                    this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i19 - 4));
                    if (C0014.f3 >= 0) {
                        C0013.f2 = 51;
                        iM731 = C0017.m731("ۣۨۦ");
                    } else {
                        iM731 = (C0013.f2 - C0014.f3) ^ 1750545;
                    }
                    break;
                case 1746938:
                    iM731 = C0013.f2 <= 0 ? C0013.m105("۟ۨۨ") : C0017.f10 + C0017.f10 + 1751094;
                    break;
                case 1747656:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.notifyItemChanged(i15, num4);
                    if ((C0017.f10 | (C0013.f2 ^ (-4324))) >= 0) {
                        C0016.f9 = 89;
                        iM731 = C0013.m105("ۣۨۨ");
                    } else {
                        iM731 = (C0017.f10 * C0014.f3) + 1591564;
                    }
                    break;
                case 1747683:
                    f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = i11;
                    num3 = 0;
                    iM731 = C0016.f9 / (C0017.f10 + (-215)) != 0 ? C0015.m573("ۣ۟ۤ") : C0015.m573("ۤۨۦ");
                    break;
                case 1747688:
                    if (i15 != -1) {
                        iM731 = C0016.f9 <= 0 ? C0016.m618("ۣۧۤ") : (C0016.f9 % C0017.f10) ^ 1747707;
                    } else if (C0017.m717() >= 0) {
                        iM731 = C0016.m618("ۦۣۡ");
                    } else {
                        str = "ۣۧۤ";
                        i = i17;
                        i17 = i;
                        iM731 = C0015.m573(str);
                    }
                    break;
                case 1747750:
                    int i20 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = i8;
                    i9 = i20;
                    iM731 = (C0014.f3 % C0015.f6) + 1751928;
                    break;
                case 1747872:
                    this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i18 - 4));
                    iM731 = (C0017.f10 % C0015.f6) ^ (-1748567);
                    break;
                case 1748674:
                    i19 = f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
                    if (i19 > -1) {
                        iM731 = C0017.f10 - (C0013.f2 % (-2894)) >= 0 ? C0015.m573("ۥۥۧ") : (C0015.f6 | C0017.f10) ^ (-1746361);
                    } else if (C0013.f2 <= 0) {
                    }
                    break;
                case 1748795:
                    i = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    if (i <= -1) {
                        str = "۟ۤۥ";
                        i17 = i;
                        iM731 = C0015.m573(str);
                    } else if (C0017.m717() >= 0) {
                        C0017.f10 = 14;
                        i17 = i;
                        iM731 = C0015.m573("۟ۦ۟");
                    } else {
                        i17 = i;
                        iM731 = C0015.m573("ۨۨۨ");
                    }
                    break;
                case 1748800:
                    if (C0015.f6 / (C0016.f9 | 2183) != 0) {
                        C0017.f10 = 38;
                        iM731 = C0015.m573("ۣۡۥ");
                    } else {
                        iM731 = (C0016.f9 % C0015.f6) ^ 56368;
                    }
                    break;
                case 1749573:
                    i2 = i16;
                    if (C0015.f6 % (C0015.f6 * 4563) >= 0) {
                        C0016.m574();
                        i16 = i2;
                        iM731 = C0017.m731("۟ۦۦ");
                    } else {
                        i16 = i2;
                        iM731 = (C0017.f10 | C0016.f9) + 1749008;
                    }
                    break;
                case 1749578:
                    iM731 = (f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 <= -1 || !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00()) ? C0015.f6 / (C0016.f9 * (-8106)) != 0 ? C0017.m731("۟ۦۤ") : (C0014.f3 % C0014.f3) ^ 1751558 : (C0013.f2 / C0017.f10) ^ (-1750657);
                    break;
                case 1749610:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.notifyItemChanged(i16, num4);
                    iM731 = (C0014.f3 * C0017.f10) + 1585825;
                    break;
                case 1750656:
                    this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 - 4));
                    if (C0014.m245() >= 0) {
                        C0013.m114();
                        iM731 = C0014.m240("ۥۥ");
                    } else {
                        iM731 = C0013.f2 + C0014.f3 + 1750873;
                    }
                    break;
                case 1750689:
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.getClass();
                    i15 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                    if (C0016.f9 > 0) {
                        iM731 = (C0015.f6 * C0013.f2) + 604513;
                    }
                    break;
                case 1751492:
                    i7 = i13;
                    if (C0017.m717() >= 0) {
                        i13 = i7;
                        iM731 = C0017.m731("ۢۨ");
                    } else {
                        i13 = i7;
                        iM731 = 1753608 + (C0017.f10 - C0017.f10);
                    }
                    break;
                case 1751501:
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyItemChanged(i10, num2);
                    if (C0016.f9 * (C0014.f3 ^ 6731) >= 0) {
                        C0014.f3 = 41;
                        iM731 = C0017.m731("ۥۧۥ");
                    } else {
                        iM731 = (C0016.f9 / C0015.f6) + 1752648;
                    }
                    break;
                case 1751558:
                    break;
                case 1751562:
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.notifyItemChanged(i12, num3);
                    if (C0015.f6 % (C0015.f6 | 771) >= 0) {
                        C0014.f3 = 16;
                        iM731 = C0014.m240("ۣ۠۠");
                    } else {
                        iM731 = (C0016.f9 | C0013.f2) ^ 57173;
                    }
                    break;
                case 1751713:
                    num = 0;
                    if (i9 != -1) {
                        if (C0017.f10 >= 0) {
                            C0014.m245();
                            num2 = num;
                            iM731 = C0015.m573("۟ۤۥ");
                        } else {
                            num2 = num;
                            iM731 = (C0017.f10 * C0014.f3) - 106490;
                        }
                    } else if (C0013.f2 % (C0014.f3 * 2271) <= 0) {
                        C0015.f6 = 48;
                        str = "ۨ۠ۡ";
                        num2 = num;
                        i = i17;
                        i17 = i;
                        iM731 = C0015.m573(str);
                    } else {
                        num2 = num;
                        iM731 = C0015.m573("۟ۥۡ");
                    }
                    break;
                case 1751778:
                    if (i12 != -1) {
                        if (C0013.m114() >= 0) {
                            C0016.f9 = 92;
                            iM731 = C0016.m618("ۣ۠");
                        } else {
                            iM731 = (C0014.f3 / C0015.f6) + 1751562;
                        }
                    } else if (C0015.f6 / (C0016.f9 | 2183) != 0) {
                        C0017.f10 = 38;
                        iM731 = C0015.m573("ۣۡۥ");
                    } else {
                        iM731 = (C0016.f9 % C0015.f6) ^ 56368;
                    }
                    break;
                case 1752520:
                    i8 = f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
                    if (C0014.f3 < 0) {
                        str2 = "۠ۢۨ";
                        iM731 = C0016.m618(str2);
                    } else {
                        C0013.m114();
                        str3 = "ۡۡۢ";
                        iM731 = C0017.m731(str3);
                    }
                    break;
                case 1752645:
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
                    i3 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    if (C0015.f6 / (C0014.f3 * 3336) != 0) {
                        i12 = i3;
                        iM731 = C0015.m573("۠ۦۦ");
                    } else {
                        str4 = "ۣ۠۠";
                        i12 = i3;
                        iM731 = C0013.m105(str4);
                    }
                    break;
                case 1752647:
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                    int i21 = f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                    if (C0016.f9 + C0015.f6 + 8034 <= 0) {
                        C0014.m245();
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1;
                        i11 = i21;
                        iM731 = C0014.m240("۟ۥۡ");
                    } else {
                        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1;
                        i11 = i21;
                        iM731 = (C0016.f9 ^ C0013.f2) ^ 1752808;
                    }
                    break;
                case 1752707:
                    if (C0013.f2 * (C0017.f10 / (-1975)) != 0) {
                        obj = "ۣۤۤ";
                        i6 = i10;
                        i10 = i6;
                        iM731 = C0017.m731(obj);
                    } else {
                        iM731 = (C0013.f2 | C0016.f9) + 55535;
                    }
                    break;
                case 1753608:
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    int i22 = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    if ((C0017.f10 | (C0017.f10 - 7335)) >= 0) {
                        C0014.f3 = 91;
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        i14 = i22;
                        iM731 = C0015.m573("ۢ۟ۧ");
                    } else {
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                        i14 = i22;
                        iM731 = C0015.m573("ۣۤۢ");
                    }
                    break;
                case 1753701:
                    num = num2;
                    if (C0013.f2 % (C0014.f3 * 2271) <= 0) {
                        C0015.f6 = 48;
                        str = "ۨ۠ۡ";
                        num2 = num;
                        i = i17;
                        i17 = i;
                        iM731 = C0015.m573(str);
                    } else {
                        num2 = num;
                        iM731 = C0015.m573("۟ۥۡ");
                    }
                    break;
                case 1754438:
                    if (C0015.f6 / (C0016.f9 * (-8106)) != 0) {
                    }
                    break;
                case 1754468:
                    i = i17;
                    str = "۟ۤۥ";
                    i17 = i;
                    iM731 = C0015.m573(str);
                    break;
                case 1754534:
                    i2 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                    if (i2 != -1) {
                        if ((C0013.f2 | (C0014.f3 ^ 5791)) >= 0) {
                            i16 = i2;
                            iM731 = C0017.m731("ۥۡۤ");
                        } else {
                            i16 = i2;
                            iM731 = C0015.f6 + C0016.f9 + 1749410;
                        }
                    } else if (C0015.f6 % (C0015.f6 * 4563) >= 0) {
                        C0016.m574();
                        i16 = i2;
                        iM731 = C0017.m731("۟ۦۦ");
                    } else {
                        i16 = i2;
                        iM731 = (C0017.f10 | C0016.f9) + 1749008;
                    }
                    break;
                case 1755467:
                    i4 = i18;
                    if (C0017.f10 / (C0017.f10 % (-2720)) <= 0) {
                        i18 = i4;
                        iM731 = C0015.m573("ۢۧۡ");
                    } else {
                        i18 = i4;
                        iM731 = (C0013.f2 ^ C0015.f6) + 1749159;
                    }
                    break;
                case 1755469:
                    if (C0017.m717() >= 0) {
                        iM731 = C0016.m618("ۦۣۡ");
                    } else {
                        str = "ۣۧۤ";
                        i = i17;
                        i17 = i;
                        iM731 = C0015.m573(str);
                    }
                    break;
                case 1755624:
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i17 - 4));
                    if (C0017.f10 < 0) {
                        iM731 = C0015.m573("۟ۤۥ");
                    } else {
                        str2 = "ۧۢ۟";
                        iM731 = C0016.m618(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        String str;
        int iM240 = C0014.m240("ۨۧۡ");
        while (true) {
            switch (iM240) {
                case 1746692:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() != 2) {
                        iM240 = C0014.f3 / (C0013.f2 % (-355)) >= 0 ? C0016.m618("ۣۣۧ") : C0016.f9 + C0013.f2 + 1745110;
                    }
                    break;
                case 1746819:
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
                    iM240 = C0014.m240(C0013.f2 <= 0 ? "۠ۡۦ" : "۟ۤۢ");
                    continue;
                case 1746845:
                    if (C0015.f6 - (C0015.f6 + 3190) >= 0) {
                        C0017.m717();
                        iM240 = C0017.m731("ۣۢۨ");
                    } else {
                        iM240 = (C0013.f2 % C0016.f9) ^ 1752639;
                        continue;
                    }
                    break;
                case 1747717:
                    break;
                case 1748895:
                    if (C0015.f6 >= 0) {
                        iM240 = C0015.m573("ۢ۟");
                    } else {
                        iM240 = (C0017.f10 / C0016.f9) + 1755586;
                        continue;
                    }
                    break;
                case 1749853:
                    if (this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() == 1) {
                        iM240 = C0017.m717() >= 0 ? C0015.m573("۟ۤۢ") : (C0017.f10 % C0015.f6) + 1746841;
                    }
                    break;
                case 1750783:
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(0);
                    if (C0016.f9 % (C0016.f9 * (-2923)) <= 0) {
                        iM240 = C0016.m618("ۡۨۦ");
                    } else {
                        iM240 = (C0017.f10 % C0015.f6) + 1752889;
                        continue;
                    }
                    break;
                case 1752676:
                case 1754437:
                    if (C0015.m570() <= 0) {
                        C0013.f2 = 52;
                        str = "ۥ۠";
                    } else {
                        str = "ۥۨۧ";
                    }
                    iM240 = C0014.m240(str);
                    continue;
                case 1752740:
                    return;
                case 1755586:
                    O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                    if (C0016.m574() >= 0) {
                        iM240 = C0017.m731("۟۟ۤ");
                    } else {
                        iM240 = C0016.m618("ۣۢۨ");
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            if (C0017.f10 >= 0) {
                C0014.f3 = 37;
                iM240 = C0014.m240("ۣۣۦ");
            } else {
                iM240 = (C0017.f10 | C0013.f2) + 1750897;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        String str;
        int iM573 = C0015.m573("ۤۤ۠");
        while (true) {
            switch (iM573) {
                case 56419:
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1355O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                    if (C0014.f3 - (C0016.f9 - 8848) <= 0) {
                        C0013.m114();
                        iM573 = C0013.m105("ۣۨۤ");
                    } else {
                        iM573 = C0013.m105("ۣۨۧ");
                    }
                    break;
                case 1747842:
                    iM573 = C0016.f9 - (C0014.f3 + 5074) >= 0 ? C0017.m731("۟ۥۦ") : (C0015.f6 % C0015.f6) + 1751648;
                    break;
                case 1748734:
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(0);
                    iM573 = (C0017.f10 ^ C0017.f10) + 1750562;
                    break;
                case 1748767:
                    break;
                case 1748859:
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setVisibility(8);
                    if ((C0015.f6 | (C0014.f3 + 1607)) >= 0) {
                        iM573 = C0015.m573("ۣۨۧ");
                    } else {
                        str = "ۣۨۤ";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1749606:
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(0);
                    if (C0017.f10 >= 0) {
                        iM573 = C0016.m618("ۡۤۢ");
                    } else {
                        str = "ۣۡ۠";
                        iM573 = C0013.m105(str);
                    }
                    break;
                case 1749734:
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1346O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    iM573 = (C0015.f6 % C0017.f10) ^ (-56836);
                    break;
                case 1750562:
                    this.f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setVisibility(0);
                    if (C0016.m574() >= 0) {
                        C0015.m570();
                        iM573 = C0016.m618("۠ۥۧ");
                    } else {
                        iM573 = (C0017.f10 % C0014.f3) + 1748972;
                    }
                    break;
                case 1751648:
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
                    if (C0014.f3 * (C0014.f3 % (-177)) <= 0) {
                        C0017.f10 = 15;
                    }
                    iM573 = C0016.m618("ۧۡۥ");
                    break;
                case 1754443:
                    this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setVisibility(8);
                    if (C0014.f3 >= 0) {
                        str = "ۣۡ۠";
                        iM573 = C0013.m105(str);
                    } else {
                        iM573 = (C0016.f9 + C0013.f2) ^ 1750219;
                    }
                    break;
                case 1755465:
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1356O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                    if (C0016.f9 <= 0) {
                        C0014.m245();
                    }
                    iM573 = C0013.m105("ۢۤۨ");
                    break;
                case 1755588:
                    f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = true;
                    iM573 = (C0016.f9 / C0016.f9) + 1748766;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i, int i2, int i3) {
        String str;
        String str2;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        String str3;
        int iM731 = C0017.m731("ۡ۟");
        ArrayList arrayList = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = null;
        LivePlayActivity livePlayActivity = null;
        while (true) {
            switch (iM731) {
                case 56350:
                    ArrayList arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, i2);
                    iM731 = 1752753 ^ (C0016.f9 + C0017.f10);
                    arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                    break;
                case 1746967:
                    livePlayActivity.getClass();
                    break;
                case 1747744:
                    livePlayActivity = this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        str2 = "ۤۧۡ";
                    } else {
                        str2 = "۟ۨ۠";
                    }
                    iM731 = C0014.m240(str2);
                    break;
                case 1747837:
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != null) {
                        iM731 = (C0016.f9 * C0017.f10) ^ (-1306022);
                    } else if (C0013.f2 % (C0017.f10 + 7177) <= 0) {
                        C0017.f10 = 65;
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        iM731 = C0013.m105("۠ۢۢ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    }
                    break;
                case 1749855:
                    iM731 = (C0016.f9 * C0017.f10) ^ (-1306022);
                    break;
                case 1750693:
                case 1754474:
                    if (C0013.f2 * C0016.f9 * (-5323) <= 0) {
                        str3 = "ۧۥۢ";
                    } else {
                        str3 = "ۤۧۡ";
                    }
                    iM731 = C0017.m731(str3);
                    break;
                case 1750720:
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, 1, 0));
                    iM731 = (C0016.f9 / C0013.f2) ^ 1751742;
                    break;
                case 1751619:
                    if (arrayList.size() <= i3) {
                        if (C0013.f2 * C0016.f9 * (-5323) <= 0) {
                            str3 = "ۧۥۢ";
                        } else {
                            str3 = "ۤۧۡ";
                        }
                        iM731 = C0017.m731(str3);
                    } else if ((C0016.f9 ^ (C0013.f2 / 1593)) <= 0) {
                        C0014.m245();
                        iM731 = C0017.m731("ۦۣ۠");
                    } else {
                        str = "ۥۦۨ";
                        iM731 = C0016.m618(str);
                    }
                    break;
                case 1751741:
                    if (i3 == -1) {
                        if (C0013.f2 * C0016.f9 * (-5323) <= 0) {
                            str3 = "ۧۥۢ";
                        } else {
                            str3 = "ۤۧۡ";
                        }
                        iM731 = C0017.m731(str3);
                    } else if (C0016.f9 % (C0013.f2 | (-3093)) <= 0) {
                        C0017.f10 = 36;
                        iM731 = C0014.m240("ۤۧ۠");
                    } else {
                        iM731 = (C0017.f10 % C0016.f9) + 1752377;
                    }
                    break;
                case 1751742:
                    break;
                case 1752639:
                    iM731 = C0015.m570() <= 0 ? C0015.m573("ۥۥ۟") : (C0016.f9 % C0016.f9) + 1754474;
                    break;
                case 1752679:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayList.get(i3);
                    if (C0014.m245() >= 0) {
                        C0014.f3 = 2;
                        iM731 = C0015.m573("ۥۦۨ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    } else {
                        iM731 = C0013.m105("۠ۢۢ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    }
                    break;
                case 1752706:
                    if (arrayList.isEmpty()) {
                        if (C0013.f2 * C0016.f9 * (-5323) <= 0) {
                            str3 = "ۧۥۢ";
                        } else {
                            str3 = "ۤۧۡ";
                        }
                        iM731 = C0017.m731(str3);
                    } else {
                        iM731 = C0013.f2 * (C0015.f6 + 6937) <= 0 ? C0013.m105("۠ۥۢ") : (C0017.f10 - C0016.f9) + 1753308;
                    }
                    break;
                case 1753449:
                    str = C0015.f6 >= 0 ? "ۨۥ۠" : "ۡ۟";
                    iM731 = C0016.m618(str);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i) {
        String strM153;
        String str;
        boolean zBooleanValue;
        ArrayList arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        String str2;
        String string;
        Boolean bool;
        Object obj;
        String str3;
        String str4;
        ArrayList arrayList = null;
        String str5 = null;
        String str6 = null;
        Boolean bool2 = null;
        boolean z = false;
        boolean z2 = false;
        StringBuilder sb = null;
        int iM105 = C0013.m105("ۣۨۢ");
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        StringBuilder sb2 = null;
        String str7 = null;
        while (true) {
            switch (iM105) {
                case 56351:
                    arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = arrayList;
                    if (C0017.f10 % (C0013.f2 + 6720) >= 0) {
                        arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM105 = C0017.m731("ۥۧۥ");
                    } else {
                        arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM105 = (C0016.f9 | C0014.f3) + 1753725;
                    }
                    break;
                case 56446:
                    sb2.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    sb2.append(str5);
                    sb2.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    str = "ۥۥۥ";
                    strM153 = str5;
                    str5 = strM153;
                    iM105 = C0016.m618(str);
                    break;
                case 56448:
                case 1748772:
                case 1750752:
                case 1755623:
                    break;
                case 1746757:
                    sb2.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                    strM153 = C0013.m153(f7short, 66, 1, 1877);
                    sb2.append(strM153);
                    if (C0014.f3 + (C0017.f10 % (-1566)) >= 0) {
                        C0015.f6 = 58;
                        str = "ۣۣۣ";
                        str5 = strM153;
                        iM105 = C0016.m618(str);
                    } else {
                        str5 = strM153;
                        iM105 = C0015.m573("ۤۢ");
                    }
                    break;
                case 1746817:
                    if (f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo == 0 && this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() > i) {
                        this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                        iM105 = (C0013.f2 + C0016.f9) ^ 1750244;
                    } else if ((C0016.f9 | (C0017.f10 * 7331)) < 0) {
                        C0017.f10 = 28;
                        str2 = "ۦۦۧ";
                        iM105 = C0016.m618(str2);
                    } else {
                        str3 = "ۨۤۡ";
                        iM105 = C0015.m573(str3);
                    }
                    break;
                case 1747835:
                case 1754654:
                    iM105 = (C0016.f9 * C0016.f9) + 1098129;
                    break;
                case 1748826:
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f942O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = z2;
                    this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(i, 0);
                    O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(0)).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (C0013.f2 / (C0013.f2 % 4957) <= 0) {
                        C0014.m245();
                        iM105 = C0016.m618("ۤ۟۟");
                    } else {
                        iM105 = (C0013.f2 * C0014.f3) ^ (-1596672);
                    }
                    break;
                case 1749577:
                    this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemRemoved(i);
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.notifyItemRangeChanged(i, o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size());
                    str3 = "ۦۨۤ";
                    iM105 = C0015.m573(str3);
                    break;
                case 1750532:
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        str4 = "ۢ۟ۡ";
                    } else {
                        str4 = "ۦ۠ۡ";
                    }
                    iM105 = C0015.m573(str4);
                    break;
                case 1750659:
                    if (i == -1) {
                        iM105 = C0017.f10 + C0015.f6 + 1756990;
                    } else {
                        if (C0016.m574() >= 0) {
                            C0017.m717();
                            str4 = "ۢ۟ۡ";
                        } else {
                            str4 = "ۦ۠ۡ";
                        }
                        iM105 = C0015.m573(str4);
                    }
                    break;
                case 1750813:
                    iM105 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() ? (C0017.f10 | C0015.f6) ^ (-57057) : (C0017.f10 / C0014.f3) + 1750656;
                    break;
                case 1751492:
                    if ((C0016.f9 | (C0017.f10 * 7331)) < 0) {
                        str3 = "ۨۤۡ";
                        iM105 = C0015.m573(str3);
                    } else {
                        C0017.f10 = 28;
                        str2 = "ۦۦۧ";
                        iM105 = C0016.m618(str2);
                    }
                    break;
                case 1751499:
                    String string2 = sb.toString();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put(string2, Boolean.valueOf(z2));
                    if (C0013.f2 * (C0013.f2 ^ (-7278)) >= 0) {
                        C0014.f3 = 12;
                        iM105 = C0013.m105("ۣۧۥ");
                    } else {
                        iM105 = (C0013.f2 * C0016.f9) ^ 1160062;
                    }
                    break;
                case 1751594:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    bool = Boolean.FALSE;
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    if (C0016.f9 <= 0) {
                        C0014.m245();
                        string = str6;
                        obj = "ۦۨۤ";
                        bool2 = bool;
                        str6 = string;
                        iM105 = C0016.m618(obj);
                    } else {
                        bool2 = bool;
                        iM105 = (C0017.f10 % C0015.f6) + 1754652;
                    }
                    break;
                case 1751771:
                    zBooleanValue = z;
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 87;
                        z = zBooleanValue;
                        iM105 = C0013.m105("ۡۦۧ");
                    } else {
                        z = zBooleanValue;
                        iM105 = (C0013.f2 % C0017.f10) + 1754330;
                    }
                    break;
                case 1751779:
                    sb.append(str5);
                    sb.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    sb.append(str5);
                    iM105 = C0013.f2 <= 0 ? C0017.m731("ۥۣ۟") : (C0014.f3 | C0017.f10) + 1753791;
                    break;
                case 1752457:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, C0013.m153(f7short, 74, 5, 1948));
                    iM105 = C0016.f9 <= 0 ? C0017.m731("ۣ۟ۥ") : C0013.m105("ۥۤۡ");
                    break;
                case 1752459:
                    break;
                case 1752610:
                    StringBuilder sb3 = new StringBuilder(str7);
                    sb3.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                    sb = sb3;
                    z2 = !z;
                    iM105 = (C0017.f10 % C0016.f9) + 1752537;
                    break;
                case 1752645:
                    sb2.append(str5);
                    sb2.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    string = sb2.toString();
                    bool = bool2;
                    obj = "ۤۢۨ";
                    bool2 = bool;
                    str6 = string;
                    iM105 = C0016.m618(obj);
                    break;
                case 1753447:
                    arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                    if (i >= arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size()) {
                        str2 = "ۣۦۣ";
                        arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM105 = C0016.m618(str2);
                    } else if (C0017.f10 % (C0013.f2 + 6720) >= 0) {
                        arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM105 = C0017.m731("ۥۧۥ");
                    } else {
                        arrayList = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        iM105 = (C0016.f9 | C0014.f3) + 1753725;
                    }
                    break;
                case 1753483:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(0, 0);
                    iM105 = C0017.f10 + C0017.f10 + 1757009;
                    break;
                case 1753510:
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayList.get(i);
                    String strM250 = C0014.m250(f7short, 60, 6, 2430);
                    StringBuilder sb4 = new StringBuilder(strM250);
                    if (C0014.m245() >= 0) {
                        C0013.f2 = 18;
                        iM105 = C0016.m618("ۦۢۢ");
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        sb2 = sb4;
                        str7 = strM250;
                    } else {
                        iM105 = C0014.f3 + C0016.f9 + 1746163;
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        sb2 = sb4;
                        str7 = strM250;
                    }
                    break;
                case 1753578:
                    sb.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    sb.append(str5);
                    sb.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    if (C0014.f3 >= 0) {
                        C0016.f9 = 93;
                        iM105 = C0015.m573("۟ۡۧ");
                    } else {
                        iM105 = C0016.f9 + C0013.f2 + 1749790;
                    }
                    break;
                case 1753671:
                    if ((C0016.f9 ^ (C0017.f10 % (-6959))) >= 0) {
                        C0013.m114();
                    } else {
                        iM105 = C0013.m105("۠ۥ۠");
                    }
                    break;
                case 1753698:
                    if (this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty()) {
                        if (C0015.m570() <= 0) {
                            C0014.f3 = 93;
                            iM105 = C0015.m573("۠ۥ۠");
                        } else {
                            iM105 = (C0013.f2 / C0015.f6) + 1753484;
                        }
                    } else if ((C0016.f9 | (C0017.f10 * 7331)) < 0) {
                        C0017.f10 = 28;
                        str2 = "ۦۦۧ";
                        iM105 = C0016.m618(str2);
                    } else {
                        str3 = "ۨۤۡ";
                        iM105 = C0015.m573(str3);
                    }
                    break;
                case 1754472:
                    if (f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo != 0) {
                        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(0, 0).add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                        if ((C0015.f6 | C0017.f10 | 7143) >= 0) {
                            C0016.m574();
                            iM105 = C0014.m240("ۣۣۧ");
                        }
                    } else {
                        iM105 = (C0016.f9 * C0016.f9) + 1098129;
                    }
                    break;
                case 1754503:
                    zBooleanValue = ((Boolean) Hawk.get(str6, bool2)).booleanValue();
                    if (zBooleanValue) {
                        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(0, 0).remove(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                        z = zBooleanValue;
                        iM105 = (C0016.f9 | C0016.f9) ^ 1746088;
                    } else if (C0014.f3 >= 0) {
                        C0014.f3 = 87;
                        z = zBooleanValue;
                        iM105 = C0013.m105("ۡۦۧ");
                    } else {
                        z = zBooleanValue;
                        iM105 = (C0013.f2 % C0017.f10) + 1754330;
                    }
                    break;
                case 1754505:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 7;
                        str3 = "ۨۡۡ";
                        iM105 = C0015.m573(str3);
                    } else {
                        iM105 = (C0014.f3 | C0014.f3) + 1751028;
                    }
                    break;
                case 1755493:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, C0013.m153(f7short, 67, 7, 2739));
                    iM105 = (C0013.f2 / C0017.f10) + 1753672;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:217:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0020. Please report as an issue. */
    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(boolean z, ArrayList arrayList) {
        int i;
        boolean z2;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        CustomRecyclerView customRecyclerView;
        String str5;
        String str6;
        String str7;
        int i3;
        String str8;
        String str9;
        String str10;
        boolean zIsEmpty = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        CustomRecyclerView customRecyclerView2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        LinearLayout linearLayout = null;
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        int iM573 = C0015.m573("ۥۨ۟");
        LinearLayout linearLayout2 = null;
        boolean z7 = false;
        while (true) {
            switch (iM573) {
                case 56324:
                    i11 = 0;
                    if (C0015.f6 + (C0015.f6 | 3968) >= 0) {
                        C0016.m574();
                        iM573 = C0013.m105("ۣۢۤ");
                    } else {
                        str9 = "ۣۧۢ";
                        iM573 = C0016.m618(str9);
                    }
                    break;
                case 56328:
                    if ((C0017.f10 | (C0014.f3 ^ 9581)) >= 0) {
                        C0014.f3 = 62;
                        str9 = "ۢۦۤ";
                        iM573 = C0016.m618(str9);
                    } else {
                        iM573 = (C0014.f3 + C0014.f3) ^ (-1749681);
                    }
                    break;
                case 56415:
                    i9 = 8;
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 46;
                        iM573 = C0014.m240("ۧۨۡ");
                    } else {
                        iM573 = (C0017.f10 | C0015.f6) + 1753249;
                    }
                    break;
                case 1746813:
                    i10 = i8;
                    iM573 = C0013.m105("۟ۧۡ");
                    break;
                case 1746937:
                    if (C0014.m245() >= 0) {
                        iM573 = C0014.m240("۠۠ۤ");
                    } else {
                        str2 = "ۤۧۥ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1747684:
                    z4 = false;
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        iM573 = C0014.m240("ۧۨۤ");
                    } else {
                        iM573 = (C0013.f2 / C0015.f6) ^ (-1749639);
                    }
                    break;
                case 1747717:
                    if (z) {
                        i12 = i4;
                        if (C0013.f2 % (C0017.f10 * (-1968)) <= 0) {
                            C0013.f2 = 42;
                            iM573 = C0014.m240("۠ۦۨ");
                        } else {
                            iM573 = (C0015.f6 * C0013.f2) + 2302539;
                        }
                    } else if (C0016.f9 / (C0016.f9 * (-6577)) != 0) {
                        C0015.m570();
                        iM573 = C0016.m618("ۧۥۤ");
                        i12 = i4;
                    } else {
                        str7 = "۠ۤ";
                        i3 = i8;
                        i12 = i4;
                        i8 = i3;
                        iM573 = C0013.m105(str7);
                    }
                    break;
                case 1747780:
                    f3034O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO = z7;
                    if (!z5) {
                        iM573 = C0015.f6 + (C0016.f9 * (-9469)) >= 0 ? C0015.m573("ۣ۟") : (C0016.f9 - C0016.f9) + 1747928;
                    } else if (C0017.f10 / (C0013.f2 | 4399) != 0) {
                        C0016.m574();
                    } else {
                        iM573 = (C0016.f9 ^ C0014.f3) + 1750656;
                    }
                    break;
                case 1747928:
                    break;
                case 1747933:
                    if (C0013.f2 <= 0) {
                        z2 = z3;
                        z7 = z2;
                        iM573 = C0014.m240("ۣ۠ۧ");
                    } else {
                        z7 = z3;
                        iM573 = (C0016.f9 / C0016.f9) ^ 1748802;
                    }
                    break;
                case 1748611:
                    if (z) {
                        i2 = 0;
                        if (C0013.m114() < 0) {
                            str3 = "ۢۨۧ";
                            i5 = i2;
                            iM573 = C0013.m105(str3);
                        } else {
                            C0014.f3 = 77;
                            str2 = "ۣۦۡ";
                            i5 = 0;
                            iM573 = C0016.m618(str2);
                        }
                    } else if ((C0017.f10 | (C0014.f3 ^ 9581)) >= 0) {
                        C0014.f3 = 62;
                        str9 = "ۢۦۤ";
                        iM573 = C0016.m618(str9);
                    } else {
                        iM573 = (C0014.f3 + C0014.f3) ^ (-1749681);
                    }
                    break;
                case 1748803:
                    iM573 = (C0015.f6 | C0013.f2) + 1750698;
                    break;
                case 1748831:
                    str6 = "۠۠ۤ";
                    iM573 = C0015.m573(str6);
                    break;
                case 1748833:
                    if (C0016.m574() >= 0) {
                        z7 = z6;
                        iM573 = C0016.m618("ۢ۟ۥ");
                    } else {
                        z2 = z6;
                        z7 = z2;
                        iM573 = C0014.m240("ۣ۠ۧ");
                    }
                    break;
                case 1748859:
                    if (z5) {
                        i3 = 0;
                        if ((C0017.f10 ^ (C0015.f6 | (-6725))) <= 0) {
                            str7 = "ۢ۠ۨ";
                            i8 = i3;
                            iM573 = C0013.m105(str7);
                        } else {
                            i8 = 0;
                            iM573 = 1746878 + (C0015.f6 | C0016.f9);
                        }
                    } else if (C0017.f10 % (C0017.f10 * (-5733)) >= 0) {
                        str3 = "۠ۡ۠";
                        i2 = i5;
                        i5 = i2;
                        iM573 = C0013.m105(str3);
                    } else {
                        iM573 = (C0014.f3 / C0015.f6) ^ 56415;
                    }
                    break;
                case 1749576:
                    iM573 = (C0017.f10 - C0017.f10) + 1754531;
                    break;
                case 1749610:
                    iM573 = (C0016.f9 - C0014.f3) ^ 1751525;
                    break;
                case 1749632:
                    this.f3087O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.f1370O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setValue(arrayList);
                    if (C0015.m570() <= 0) {
                        C0015.m570();
                        iM573 = C0015.m573("ۣۨۥ");
                    } else {
                        iM573 = (C0016.f9 * C0014.f3) + 1921863;
                    }
                    break;
                case 1749638:
                    str3 = "ۣۤۦ";
                    i2 = i5;
                    z5 = z4;
                    i5 = i2;
                    iM573 = C0013.m105(str3);
                    break;
                case 1749671:
                    z6 = false;
                    if (C0015.f6 >= 0) {
                        C0017.f10 = 94;
                        iM573 = C0015.m573("ۦۥ۠");
                    } else {
                        str2 = "ۡۦۦ";
                        iM573 = C0016.m618(str2);
                    }
                    break;
                case 1749765:
                    if (!zIsEmpty || z) {
                        if (C0013.f2 / (C0015.f6 + 4816) != 0) {
                            C0016.m574();
                            str4 = "۠ۧۡ";
                            iM573 = C0014.m240(str4);
                        } else {
                            iM573 = C0015.m573("ۢۢۧ");
                        }
                    } else if (C0017.f10 - (C0016.f9 | (-5744)) <= 0) {
                        C0015.f6 = 5;
                        iM573 = C0016.m618("ۣ۟ۡ");
                    } else {
                        iM573 = (C0013.f2 | C0015.f6) + 1748030;
                    }
                    break;
                case 1749789:
                    i6 = 8;
                    if (C0016.f9 > 0) {
                        iM573 = C0013.m105("ۤۤۡ");
                    } else {
                        str = "ۢۢۧ";
                        iM573 = C0015.m573(str);
                    }
                    break;
                case 1749857:
                    if (C0014.f3 - (C0013.f2 / 3519) >= 0) {
                        iM573 = C0017.m731("۠ۡۦ");
                        i7 = i5;
                    } else {
                        str = "ۢ۠ۨ";
                        i7 = i5;
                        iM573 = C0015.m573(str);
                    }
                    break;
                case 1750598:
                    linearLayout2.setVisibility(i7);
                    customRecyclerView = this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (C0014.m245() >= 0) {
                        customRecyclerView2 = customRecyclerView;
                        iM573 = C0016.m618("۠ۤ");
                    } else {
                        str5 = "ۡۧۡ";
                        customRecyclerView2 = customRecyclerView;
                        iM573 = C0015.m573(str5);
                    }
                    break;
                case 1750601:
                case 1753601:
                    str4 = "ۣ۠ۧ";
                    iM573 = C0014.m240(str4);
                    break;
                case 1750629:
                    if (zIsEmpty || z) {
                        str6 = "۠۠ۤ";
                        iM573 = C0015.m573(str6);
                    } else {
                        iM573 = C0016.f9 * (C0014.f3 + (-921)) >= 0 ? C0013.m105("ۥۨ۟") : C0013.m105("ۥۧ۠");
                    }
                    break;
                case 1750688:
                    if (C0013.f2 / (C0015.f6 + 4816) != 0) {
                        C0016.m574();
                        str4 = "۠ۧۡ";
                        iM573 = C0014.m240(str4);
                    } else {
                        iM573 = C0015.m573("ۢۢۧ");
                    }
                    break;
                case 1750693:
                    LinearLayout linearLayout3 = this.f3068O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                    i4 = 8;
                    if (C0014.m245() >= 0) {
                        C0016.f9 = 73;
                        linearLayout2 = linearLayout3;
                        iM573 = C0013.m105("ۥۥ۠");
                    } else {
                        linearLayout2 = linearLayout3;
                        iM573 = (C0013.f2 | C0015.f6) + 1748708;
                    }
                    break;
                case 1750750:
                    if (C0013.f2 % (C0017.f10 * (-1968)) <= 0) {
                        C0013.f2 = 42;
                        iM573 = C0014.m240("۠ۦۨ");
                    } else {
                        iM573 = (C0015.f6 * C0013.f2) + 2302539;
                    }
                    break;
                case 1750816:
                case 1752549:
                    if (C0017.f10 / (C0014.f3 - 6018) != 0) {
                        C0015.f6 = 27;
                        str10 = "ۧ۠";
                    } else {
                        str10 = "ۣۡۤ";
                    }
                    iM573 = C0016.m618(str10);
                    break;
                case 1751648:
                    customRecyclerView2.setVisibility(i10);
                    linearLayout = this.f3067O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    if ((C0015.f6 ^ (C0013.f2 ^ 7700)) >= 0) {
                        C0013.f2 = 22;
                        iM573 = C0013.m105("۟ۧۡ");
                    } else {
                        iM573 = (C0015.f6 ^ C0013.f2) ^ (-1755077);
                    }
                    break;
                case 1751649:
                    i = i6;
                    iM573 = C0014.m240("ۣۡۤ");
                    i7 = i;
                    break;
                case 1751746:
                case 1752617:
                    iM573 = C0015.m570() <= 0 ? C0016.m618("ۨۦۧ") : (C0017.f10 - C0017.f10) + 1751648;
                    break;
                case 1752640:
                    if (C0015.f6 >= 0) {
                        C0017.m717();
                        i10 = i9;
                        i = i7;
                        iM573 = C0014.m240("ۣۡۤ");
                        i7 = i;
                    } else {
                        iM573 = (-1752090) ^ (C0017.f10 - C0013.f2);
                        i10 = i9;
                    }
                    break;
                case 1752702:
                    z5 = true;
                    if (C0015.f6 + (C0016.f9 | 4687) <= 0) {
                        C0016.f9 = 62;
                        iM573 = C0014.m240("ۦ۠ۤ");
                    } else {
                        iM573 = (C0017.f10 - C0016.f9) + 1751143;
                    }
                    break;
                case 1752732:
                    zIsEmpty = arrayList.isEmpty();
                    z3 = true;
                    if (C0017.f10 / (C0016.f9 + 5500) != 0) {
                        C0013.m114();
                        iM573 = C0014.m240("ۡۥۧ");
                    } else {
                        str5 = "ۣۢۤ";
                        iM573 = C0015.m573(str5);
                    }
                    break;
                case 1753450:
                case 1754531:
                    if (C0017.m717() >= 0) {
                        C0016.m574();
                        str8 = "ۦۨ۟";
                    } else {
                        str8 = "ۣۤۦ";
                    }
                    iM573 = C0015.m573(str8);
                    break;
                case 1754378:
                    if (C0017.f10 % (C0017.f10 * (-5733)) >= 0) {
                        str3 = "۠ۡ۠";
                        i2 = i5;
                        i5 = i2;
                        iM573 = C0013.m105(str3);
                    } else {
                        iM573 = (C0014.f3 / C0015.f6) ^ 56415;
                    }
                    break;
                case 1754439:
                    linearLayout.setVisibility(i12);
                    f3033O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = z;
                    str6 = "ۢۥۨ";
                    iM573 = C0015.m573(str6);
                    break;
                case 1754502:
                    if (C0014.f3 - (C0013.f2 ^ TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE) >= 0) {
                        C0013.m114();
                        customRecyclerView = customRecyclerView2;
                        i12 = i11;
                        str5 = "ۡۧۡ";
                        customRecyclerView2 = customRecyclerView;
                        iM573 = C0015.m573(str5);
                    } else {
                        iM573 = (C0017.f10 * C0015.f6) + 1292817;
                        i12 = i11;
                    }
                    break;
                case 1754566:
                    if ((C0016.f9 | (C0014.f3 ^ 5633)) >= 0) {
                        str6 = "ۢۤ";
                        iM573 = C0015.m573(str6);
                    } else {
                        iM573 = C0014.m240("ۥۨ۟");
                    }
                    break;
                case 1754656:
                    if (!zIsEmpty) {
                        i12 = i4;
                        if (C0013.f2 % (C0017.f10 * (-1968)) <= 0) {
                            C0013.f2 = 42;
                            iM573 = C0014.m240("۠ۦۨ");
                        } else {
                            iM573 = (C0015.f6 * C0013.f2) + 2302539;
                        }
                    } else if (C0015.f6 >= 0) {
                        C0013.m114();
                        i12 = i4;
                        iM573 = C0013.m105("ۤۤۡ");
                    } else {
                        iM573 = (C0016.f9 / C0017.f10) + 1747718;
                        i12 = i4;
                    }
                    break;
                case 1754659:
                    if (C0015.f6 + (C0016.f9 * (-9469)) >= 0) {
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iM240 = C0014.m240("۟ۧ۟");
        int i3 = 0;
        while (true) {
            switch (iM240) {
                case 56289:
                    if (i != f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo) {
                        if (C0017.f10 >= 0) {
                            C0013.m114();
                            str6 = "ۥۥۢ";
                        } else {
                            str6 = "ۢۢۢ";
                        }
                        iM240 = C0017.m731(str6);
                    } else if (C0014.f3 >= 0) {
                        str5 = "ۤ۟ۦ";
                        iM240 = C0015.m573(str5);
                    } else {
                        iM240 = (C0013.f2 / C0015.f6) ^ (-1752551);
                    }
                    break;
                case 1746782:
                    i3 = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    if (C0013.m114() >= 0) {
                        iM240 = C0014.m240("ۣ۠ۢ");
                    } else {
                        str2 = "ۣۧ۟";
                        iM240 = C0017.m731(str2);
                    }
                    break;
                case 1746847:
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i, i2), O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, i2));
                    if (C0017.f10 * (C0014.f3 + 1544) >= 0) {
                        C0015.m570();
                        str3 = "ۡ۟۠";
                        iM240 = C0013.m105(str3);
                    } else {
                        iM240 = (C0013.f2 * C0017.f10) ^ (-701239);
                    }
                    break;
                case 1746935:
                    if (i2 >= 0) {
                        iM240 = (C0016.f9 | C0013.f2) + 1745906;
                    } else if (C0015.f6 - (C0013.f2 / 4265) >= 0) {
                        C0016.m574();
                        iM240 = C0015.m573("ۦۣۣ");
                    } else {
                        str3 = "ۣۣۧ";
                        iM240 = C0013.m105(str3);
                    }
                    break;
                case 1747653:
                    iM240 = (C0017.f10 / C0016.f9) ^ 1746935;
                    break;
                case 1747775:
                    if (C0017.f10 >= 0) {
                        C0013.m114();
                        str6 = "ۥۥۢ";
                    } else {
                        str6 = "ۢۢۢ";
                    }
                    iM240 = C0017.m731(str6);
                    break;
                case 1747838:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                    iM240 = (C0015.f6 / C0014.f3) ^ 1749817;
                    break;
                case 1748610:
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i3 - 4));
                    if (C0015.m570() <= 0) {
                        iM240 = C0017.m731("۟ۧ۟");
                    } else {
                        str = "۠ۥۣ";
                        iM240 = C0015.m573(str);
                    }
                    break;
                case 1749666:
                    this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    iM240 = (C0015.f6 * C0015.f6) + 1379688;
                    break;
                case 1749819:
                    if (C0017.f10 < 0) {
                        str = "ۦۣۣ";
                        iM240 = C0015.m573(str);
                    } else {
                        str2 = "۠۟ۤ";
                        iM240 = C0017.m731(str2);
                    }
                    break;
                case 1750569:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = -1;
                    if (C0017.m717() >= 0) {
                        C0017.m717();
                        iM240 = C0014.m240("ۢۢۢ");
                    } else {
                        str4 = "ۥ۟ۨ";
                        iM240 = C0017.m731(str4);
                    }
                    break;
                case 1750663:
                case 1752462:
                    break;
                case 1751499:
                    if (C0016.f9 <= 0) {
                        C0013.f2 = 60;
                        str4 = "ۦ۟";
                        iM240 = C0017.m731(str4);
                    } else {
                        iM240 = (C0014.f3 * C0017.f10) ^ 1628132;
                    }
                    break;
                case 1752550:
                    if (i2 == f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) {
                        iM240 = (C0013.f2 * C0017.f10) ^ (-1101706);
                    } else {
                        if (C0017.f10 >= 0) {
                            C0013.m114();
                            str6 = "ۥۥۢ";
                        } else {
                            str6 = "ۢۢۢ";
                        }
                        iM240 = C0017.m731(str6);
                    }
                    break;
                case 1753542:
                case 1754501:
                    if (C0017.m717() >= 0) {
                        str = "۠ۦۡ";
                        iM240 = C0015.m573(str);
                    } else {
                        iM240 = (C0013.f2 ^ C0016.f9) + 1752289;
                    }
                    break;
                case 1754499:
                    if (i3 != -1) {
                        if (C0015.f6 >= 0) {
                            C0017.f10 = 11;
                            iM240 = C0015.m573("ۣۣۧ");
                        } else {
                            str5 = "ۡ۟۠";
                            iM240 = C0015.m573(str5);
                        }
                    } else if (C0016.f9 <= 0) {
                        C0013.f2 = 60;
                        str4 = "ۦ۟";
                        iM240 = C0017.m731(str4);
                    } else {
                        iM240 = (C0014.f3 * C0017.f10) ^ 1628132;
                    }
                    break;
                case 1754655:
                    iM240 = (C0016.f9 | C0013.f2) + 1745906;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(int i, int i2) {
        boolean zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        String str;
        String str2;
        boolean z = false;
        int iM731 = C0017.m731("ۧ۠ۤ");
        ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        ArrayList arrayListO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        while (true) {
            switch (iM731) {
                case 1746911:
                    this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    iM731 = (C0014.f3 / C0016.f9) + 1754593;
                    break;
                case 1747841:
                    break;
                case 1747867:
                    if (C0013.f2 <= 0) {
                        C0015.m570();
                        str2 = "۟ۧ";
                    } else {
                        str2 = "ۧ۠ۤ";
                    }
                    iM731 = C0016.m618(str2);
                    break;
                case 1750570:
                    arrayListO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, i2);
                    str = "ۤۨۤ";
                    iM731 = C0017.m731(str);
                    break;
                case 1751776:
                    zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i, i2);
                    if ((C0014.f3 ^ (C0016.f9 / (-8479))) >= 0) {
                        C0016.f9 = 3;
                        iM731 = C0017.m731("۠ۥۦ");
                        z = zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    } else {
                        iM731 = (-1746219) ^ (C0017.f10 | C0017.f10);
                        z = zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    }
                    break;
                case 1754411:
                    arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
                    str = "ۣ۠ۧ";
                    iM731 = C0017.m731(str);
                    break;
                case 1754593:
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(z, arrayListO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    if ((C0017.f10 | (C0017.f10 ^ 2060)) < 0) {
                        zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = z;
                        iM731 = C0017.m731("۠ۥۦ");
                        z = zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    } else {
                        C0015.f6 = 92;
                        str = "۟ۦۦ";
                        iM731 = C0017.m731(str);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(int i) {
        Handler handler;
        String str;
        String str2;
        String str3;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int iM573 = C0015.m573("۠ۦۦ");
        StringBuilder sb = null;
        TextView textView = null;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        Handler handler2 = null;
        while (true) {
            switch (iM573) {
                case 56356:
                    if (C0017.m717() >= 0) {
                        C0014.f3 = 71;
                        iM573 = C0017.m731("ۣ۠۠");
                    } else {
                        iM573 = (C0015.f6 * C0016.f9) ^ (-1918319);
                    }
                    break;
                case 56415:
                    TextView textView2 = this.f3072O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                    iM573 = C0017.m731("ۨ۟۟");
                    textView = textView2;
                    break;
                case 56420:
                    if (C0017.f10 >= 0) {
                        C0014.m245();
                        str5 = "ۢۤ۠";
                        iM573 = C0017.m731(str5);
                    } else {
                        iM573 = C0013.m105("ۢۡ۟");
                    }
                    break;
                case 56445:
                    if (this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getVisibility() != 0) {
                        iM573 = C0017.f10 + (C0016.f9 | (-1812)) >= 0 ? C0016.m618("۟ۨۥ") : C0014.m240("ۣۤ۟");
                    } else if (C0014.f3 * (C0014.f3 / 852) == 0) {
                        C0013.m114();
                        str = "۟ۡۤ";
                        iM573 = C0015.m573(str);
                    } else {
                        str7 = "ۣۧۡ";
                        iM573 = C0016.m618(str7);
                    }
                    break;
                case 56573:
                    handler2.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                    if (C0017.m717() < 0) {
                        str5 = "ۣۡۡ";
                        iM573 = C0017.m731(str5);
                    } else {
                        str8 = "ۣۢۢ";
                        iM573 = C0014.m240(str8);
                    }
                    break;
                case 1746878:
                    sb.append(C0016.m608(f7short, 82, 1, 2052));
                    if (C0014.f3 / (C0014.f3 % (-7721)) <= 0) {
                        iM573 = C0013.m105("ۨۧۦ");
                    } else {
                        str4 = "ۣۧۤ";
                        iM573 = C0014.m240(str4);
                    }
                    break;
                case 1746972:
                    break;
                case 1747834:
                case 1753574:
                    if (C0014.f3 * (C0014.f3 / 852) == 0) {
                        str7 = "ۣۧۡ";
                        iM573 = C0016.m618(str7);
                    } else {
                        C0013.m114();
                        str = "۟ۡۤ";
                        iM573 = C0015.m573(str);
                    }
                    break;
                case 1747872:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                        if (C0014.f3 - (C0013.f2 + 4893) >= 0) {
                            iM573 = C0016.m618("ۤۧ۟");
                        } else {
                            str3 = "ۨۧۦ";
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                            iM573 = C0015.m573(str3);
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        }
                    } else if (C0017.f10 >= 0) {
                        C0014.m245();
                        str5 = "ۢۤ۠";
                        iM573 = C0017.m731(str5);
                    } else {
                        iM573 = C0013.m105("ۢۡ۟");
                    }
                    break;
                case 1748735:
                    handler2.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2, 5000L);
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                    } else {
                        iM573 = (C0013.f2 + C0013.f2) ^ 1748756;
                    }
                    break;
                case 1749632:
                    if (this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getVisibility() != 8) {
                        iM573 = (C0013.f2 * C0015.f6) + 2297958;
                    } else if (C0014.f3 * (C0014.f3 / 852) == 0) {
                        C0013.m114();
                        str = "۟ۡۤ";
                        iM573 = C0015.m573(str);
                    } else {
                        str7 = "ۣۧۡ";
                        iM573 = C0016.m618(str7);
                    }
                    break;
                case 1749697:
                    sb.append(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    if (C0017.f10 >= 0) {
                        C0015.f6 = 40;
                        iM573 = C0013.m105("۠ۥ۟");
                    } else {
                        str6 = "۟ۥۤ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        iM573 = C0017.m731(str6);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    }
                    break;
                case 1749856:
                    if (C0017.f10 >= 0) {
                        str7 = "ۤۤۢ";
                        iM573 = C0016.m618(str7);
                    } else {
                        iM573 = (C0015.f6 | C0015.f6) + 1748481;
                    }
                    break;
                case 1749858:
                    this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setVisibility(8);
                    iM573 = C0014.m245() >= 0 ? C0016.m618("۠ۦۦ") : C0014.m240("ۣۧۡ");
                    break;
                case 1750563:
                    textView.setText(sb.toString());
                    if (C0015.f6 - (C0015.f6 % 1265) != 0) {
                        C0017.f10 = 64;
                        iM573 = C0016.m618("ۣۡۡ");
                    } else {
                        iM573 = C0016.f9 + C0013.f2 + 1752667;
                    }
                    break;
                case 1750686:
                    this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setVisibility(0);
                    iM573 = (C0015.f6 % C0015.f6) + 56356;
                    break;
                case 1751740:
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3093O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
                    if ((C0017.f10 | (C0013.f2 + 9709)) < 0) {
                        str6 = "ۨۥ";
                        iM573 = C0017.m731(str6);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    } else {
                        str3 = "ۧ۟۠";
                        iM573 = C0015.m573(str3);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    }
                    break;
                case 1754376:
                    this.f3070O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f895O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    if ((C0013.f2 ^ (C0014.f3 * 1732)) < 0) {
                        str2 = "ۤۡ";
                        handler = handler2;
                        iM573 = C0016.m618(str2);
                        handler2 = handler;
                    } else {
                        C0016.f9 = 66;
                        str4 = "ۨۥ";
                        iM573 = C0014.m240(str4);
                    }
                    break;
                case 1754409:
                    this.f3071O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    if ((C0017.f10 ^ (C0016.f9 + 332)) < 0) {
                        str8 = "ۣۢ";
                        iM573 = C0014.m240(str8);
                    } else {
                        C0016.m574();
                        str6 = "۟ۥۤ";
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        iM573 = C0017.m731(str6);
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    }
                    break;
                case 1754501:
                    handler = this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                    if (C0013.f2 > 0) {
                        str = "ۤۧ۟";
                        handler2 = handler;
                        iM573 = C0015.m573(str);
                    } else {
                        C0015.m570();
                        str2 = "ۣۢ";
                        iM573 = C0016.m618(str2);
                        handler2 = handler;
                    }
                    break;
                case 1754504:
                    sb.append(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    iM573 = (C0013.f2 / C0017.f10) + 1750564;
                    break;
                case 1755336:
                    StringBuilder sb2 = new StringBuilder(C0017.m693(f7short, 79, 3, 2124));
                    if (C0016.f9 <= 0) {
                        C0017.m717();
                        iM573 = C0016.m618("ۣۧ");
                        sb = sb2;
                    } else {
                        iM573 = (C0016.f9 | C0016.f9) ^ 1749480;
                        sb = sb2;
                    }
                    break;
                case 1755591:
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i);
                    if (C0016.m574() >= 0) {
                        C0017.m717();
                        iM573 = C0015.m573("ۨ۟۟");
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    } else {
                        iM573 = (C0013.f2 % C0015.f6) + 1754118;
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    public final void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        String str;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        String str2;
        String str3;
        ViewGroup.LayoutParams layoutParams3 = null;
        ViewGroup.LayoutParams layoutParams4 = null;
        ViewGroup.LayoutParams layoutParams5 = null;
        ViewGroup.LayoutParams layoutParams6 = null;
        ViewGroup.LayoutParams layoutParams7 = null;
        ViewGroup.LayoutParams layoutParams8 = null;
        int iM105 = C0013.m105("ۦۣۢ");
        ViewGroup.LayoutParams layoutParams9 = null;
        ViewGroup.LayoutParams layoutParams10 = null;
        while (true) {
            switch (iM105) {
                case 56351:
                    layoutParams3 = this.f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getLayoutParams();
                    layoutParams3.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0014.m250(f7short, 83, 4, 3208));
                    if (C0013.m114() >= 0) {
                        C0017.m717();
                        iM105 = C0014.m240("۠ۤۢ");
                    } else {
                        str = "ۦۥۤ";
                        iM105 = C0015.m573(str);
                    }
                    break;
                case 56421:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() || !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
                        iM105 = C0013.f2 <= 0 ? C0017.m731("ۤۧ۠") : (C0015.f6 * C0016.f9) + 2247337;
                    } else if (C0016.m574() >= 0) {
                        C0013.m114();
                    } else {
                        iM105 = (C0015.f6 ^ C0014.f3) ^ 1749109;
                    }
                    break;
                case 56475:
                    if (C0017.m717() >= 0) {
                        str2 = "۠ۥۦ";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    } else {
                        iM105 = (C0016.f9 * C0013.f2) + 1026399;
                    }
                    break;
                case 56569:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
                        iM105 = C0014.f3 - (C0016.f9 | (-5581)) <= 0 ? C0014.m240("ۣۣۧ") : C0014.m240("ۣ۠ۦ");
                    } else if (C0015.f6 >= 0) {
                        C0013.m114();
                        iM105 = C0014.m240("ۨۦ۠");
                    } else {
                        iM105 = (C0013.f2 | C0013.f2) ^ 1748300;
                    }
                    break;
                case 1746847:
                    layoutParams5.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0016.m608(f7short, 167, 8, 1654));
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.setLayoutParams(layoutParams5);
                    if (C0015.m570() <= 0) {
                        C0014.m245();
                    }
                    iM105 = C0014.m240("ۣۡۢ");
                    break;
                case 1746880:
                    this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setLayoutParams(layoutParams8);
                    str3 = "ۨ۟ۢ";
                    iM105 = C0017.m731(str3);
                    break;
                case 1747711:
                    layoutParams10.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0014.m250(f7short, 137, 16, 2545));
                    if (C0016.f9 <= 0) {
                        C0017.m717();
                        iM105 = C0014.m240("ۧۨۡ");
                    } else {
                        iM105 = C0013.m105("ۡ۠ۥ");
                    }
                    break;
                case 1747806:
                    if (C0013.f2 - (C0015.f6 - 2486) <= 0) {
                        iM105 = C0015.m573("ۡۨۥ");
                    } else {
                        str2 = "ۦۨۧ";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1747898:
                    this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() + O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (C0016.f9 - (C0013.f2 | (-6588)) <= 0) {
                        C0015.m570();
                        iM105 = C0013.m105("ۢۧۦ");
                    } else {
                        iM105 = C0014.f3 + C0013.f2 + 55666;
                    }
                    break;
                case 1748646:
                    if ((C0017.f10 ^ (C0014.f3 + 5644)) >= 0) {
                        C0017.f10 = 53;
                        iM105 = C0013.m105("ۥۣ۟");
                    } else {
                        iM105 = (C0017.f10 + C0015.f6) ^ (-1753210);
                    }
                    break;
                case 1748680:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
                        if (C0015.f6 * (C0017.f10 - 5376) <= 0) {
                            str = "ۡۡۨ";
                            iM105 = C0015.m573(str);
                        } else {
                            iM105 = (C0014.f3 ^ C0013.f2) + 1750546;
                        }
                    } else if (C0017.m717() >= 0) {
                        str2 = "۠ۥۦ";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    } else {
                        iM105 = (C0016.f9 * C0013.f2) + 1026399;
                    }
                    break;
                case 1748706:
                    ViewGroup.LayoutParams layoutParams11 = this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getLayoutParams();
                    layoutParams11.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0017.m693(f7short, 175, 4, 2449));
                    if (C0016.f9 - (C0016.f9 * (-1906)) <= 0) {
                        C0017.m717();
                        layoutParams6 = layoutParams11;
                        iM105 = C0015.m573("ۦۨۨ");
                    } else {
                        layoutParams6 = layoutParams11;
                        iM105 = C0017.m731("ۥ۟۟");
                    }
                    break;
                case 1748893:
                    iM105 = (C0013.f2 | C0016.f9) + 1752570;
                    break;
                case 1748894:
                case 1753701:
                case 1753702:
                case 1754415:
                    if (C0013.f2 <= 0) {
                    }
                    break;
                case 1749601:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        iM105 = C0014.m240("ۨۦ۠");
                    } else {
                        iM105 = (C0013.f2 | C0013.f2) ^ 1748300;
                    }
                    break;
                case 1749695:
                    layoutParams10.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0017.m693(f7short, 119, 18, 345));
                    iM105 = C0013.f2 + C0014.f3 + 1754751;
                    break;
                case 1749699:
                    layoutParams10.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0014.m250(f7short, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 14, 2362));
                    if (C0015.m570() <= 0) {
                        C0013.m114();
                        iM105 = C0015.m573("ۣ۟۟");
                    } else {
                        iM105 = (C0017.f10 / C0014.f3) + 1754653;
                    }
                    break;
                case 1749825:
                    layoutParams8 = this.f3069O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getLayoutParams();
                    layoutParams8.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0016.m608(f7short, 196, 21, 2561));
                    if (C0017.m717() < 0) {
                        str = "۟ۥۦ";
                        iM105 = C0015.m573(str);
                    } else {
                        C0015.m570();
                        iM105 = C0013.m105("ۡ۠ۥ");
                    }
                    break;
                case 1750531:
                    layoutParams4.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0014.m250(f7short, 87, 7, 1290));
                    this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setLayoutParams(layoutParams4);
                    iM105 = (C0015.f6 | (C0016.f9 + 1663)) >= 0 ? C0017.m731("ۣۨۡ") : (C0014.f3 ^ C0015.f6) + 1751883;
                    break;
                case 1750569:
                    layoutParams10.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0017.m693(f7short, 101, 18, 3245));
                    iM105 = (C0017.f10 - C0015.f6) + 1747955;
                    break;
                case 1750725:
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setLayoutParams(layoutParams9);
                    ViewGroup.LayoutParams layoutParams12 = this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getLayoutParams();
                    if (C0016.f9 <= 0) {
                        layoutParams10 = layoutParams12;
                        iM105 = C0013.m105("ۡ۠");
                    } else {
                        layoutParams10 = layoutParams12;
                        iM105 = (C0017.f10 - C0013.f2) ^ (-55937);
                    }
                    break;
                case 1750813:
                    if (C0013.f2 + (C0014.f3 ^ (-1212)) <= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("ۥۦۤ");
                    } else {
                        iM105 = (C0014.f3 | C0014.f3) + 1748113;
                    }
                    break;
                case 1752453:
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setLayoutParams(layoutParams6);
                    layoutParams = this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.getLayoutParams();
                    if (C0015.m570() <= 0) {
                        C0013.m114();
                        layoutParams7 = layoutParams;
                        iM105 = C0014.m240("ۣۢۤ");
                    } else {
                        layoutParams7 = layoutParams;
                        iM105 = C0015.m573("ۥ۠ۤ");
                    }
                    break;
                case 1752489:
                    layoutParams7.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0017.m693(f7short, 179, 17, 1875));
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setLayoutParams(layoutParams7);
                    if (C0014.m245() >= 0) {
                        C0014.m245();
                        iM105 = C0014.m240("ۦۥۤ");
                    } else {
                        iM105 = C0013.m105("ۢۧۦ");
                    }
                    break;
                case 1752577:
                    ViewGroup.LayoutParams layoutParams13 = this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getLayoutParams();
                    layoutParams13.width = (int) this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.getPaint().measureText(C0017.m693(f7short, 94, 7, 2017));
                    if ((C0015.f6 ^ (C0017.f10 / 6167)) >= 0) {
                        layoutParams9 = layoutParams13;
                        iM105 = C0016.m618("ۦۨۧ");
                    } else {
                        layoutParams9 = layoutParams13;
                        iM105 = (C0015.f6 / C0016.f9) + 1750725;
                    }
                    break;
                case 1753511:
                    if (this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o == null) {
                        str2 = "ۣۨۡ";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    } else if (C0013.f2 + (C0014.f3 ^ (-1212)) <= 0) {
                        C0015.m570();
                        iM105 = C0015.m573("ۥۦۤ");
                    } else {
                        iM105 = (C0014.f3 | C0014.f3) + 1748113;
                    }
                    break;
                case 1753605:
                    this.f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams14 = this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getLayoutParams();
                    if (C0013.f2 % (C0016.f9 + 8334) <= 0) {
                        C0017.m717();
                        layoutParams4 = layoutParams14;
                        iM105 = C0014.m240("ۨ۟ۢ");
                    } else {
                        layoutParams4 = layoutParams14;
                        iM105 = C0013.m105("ۣ۟۟");
                    }
                    break;
                case 1754499:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() || O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
                        if (C0014.m245() < 0) {
                            str3 = "ۣۨۡ";
                            iM105 = C0017.m731(str3);
                        } else {
                            str2 = "ۣۨ";
                            layoutParams2 = layoutParams5;
                            layoutParams5 = layoutParams2;
                            iM105 = C0017.m731(str2);
                        }
                    } else if (C0015.f6 + (C0014.f3 / 7403) >= 0) {
                        iM105 = C0015.m573("ۥ۠");
                    } else {
                        str2 = "۠ۡ۠";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1754503:
                    if (C0014.m245() < 0) {
                        str2 = "ۣۨ";
                        layoutParams2 = layoutParams5;
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    } else {
                        str3 = "ۣۨۡ";
                        iM105 = C0017.m731(str3);
                    }
                    break;
                case 1754656:
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setLayoutParams(layoutParams10);
                    layoutParams2 = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.getLayoutParams();
                    if (C0017.f10 >= 0) {
                        layoutParams5 = layoutParams2;
                        iM105 = C0016.m618("۠ۡ۠");
                    } else {
                        str2 = "۟ۤۤ";
                        layoutParams5 = layoutParams2;
                        iM105 = C0017.m731(str2);
                    }
                    break;
                case 1755339:
                    break;
                case 1755436:
                    if (C0013.f2 <= 0) {
                        C0014.f3 = 54;
                        iM105 = C0013.m105("ۣۨ");
                    } else {
                        iM105 = (C0014.f3 ^ C0015.f6) + 1753008;
                    }
                    break;
                case 1755462:
                    this.f3085O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o = new TextView(this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0017.f10 - (C0016.f9 / (-7467)) >= 0) {
                        C0017.f10 = 67;
                        layoutParams = layoutParams7;
                        layoutParams7 = layoutParams;
                        iM105 = C0015.m573("ۥ۠ۤ");
                    } else {
                        iM105 = (C0015.f6 % C0017.f10) ^ (-1747419);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    public final void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(int i) {
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        int iM618 = C0016.m618("۠ۢۤ");
        Runnable runnable = null;
        StringBuilder sb = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
        while (true) {
            switch (iM618) {
                case 1746754:
                    sb.append((String) arrayList2.get(i));
                    iM618 = C0015.f6 >= 0 ? C0014.m240("ۦۨ۠") : C0013.m105("ۧ۠۟");
                    break;
                case 1746756:
                    this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3199O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setSelection(0);
                    if (C0017.f10 * (C0017.f10 + 5939) >= 0) {
                        C0015.f6 = 6;
                        str2 = "۠ۢۤ";
                        iM618 = C0013.m105(str2);
                    } else {
                        iM618 = C0014.m240("ۣۡۥ");
                    }
                    break;
                case 1747714:
                case 1750599:
                case 1752736:
                    break;
                case 1747746:
                    this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.post(this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                    if (C0014.m245() >= 0) {
                        C0016.f9 = 94;
                        iM618 = C0014.m240("ۣ۠ۡ");
                    } else {
                        iM618 = C0017.m731("ۡۦۨ");
                    }
                    break;
                case 1748644:
                    if (this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo == null) {
                        if (C0014.m245() >= 0) {
                        }
                        iM618 = C0015.m573("ۨۢ۟");
                    } else {
                        iM618 = C0016.f9 - (C0014.f3 / 5580) <= 0 ? C0014.m240("۠ۥۨ") : (C0016.f9 ^ C0016.f9) + 1751741;
                    }
                    break;
                case 1748735:
                case 1754539:
                    if ((C0016.f9 | (C0017.f10 - 2242)) >= 0) {
                        str = "ۦۦۣ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = C0015.f6 + C0016.f9 + 1747514;
                    }
                    break;
                case 1748835:
                    iM618 = i == 0 ? C0014.f3 >= 0 ? C0014.m240("ۣۢۢ") : C0016.f9 + C0013.f2 + 1746935 : (C0013.f2 | (C0014.f3 % (-5275))) >= 0 ? C0015.m573("ۣۤۨ") : (C0013.f2 % C0017.f10) + 1750422;
                    break;
                case 1749667:
                    iM618 = (C0017.f10 ^ C0013.f2) + 1754909;
                    break;
                case 1749734:
                    if ((C0013.f2 | (C0014.f3 % (-5275))) >= 0) {
                    }
                    break;
                case 1749759:
                    StringBuilder sb2 = new StringBuilder(C0014.m250(f7short, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, 4, 1147));
                    if (C0013.f2 * (C0017.f10 / 4614) != 0) {
                        iM618 = C0013.m105("ۢۧۤ");
                        sb = sb2;
                    } else {
                        iM618 = C0013.m105("۟ۡۤ");
                        sb = sb2;
                    }
                    break;
                case 1749823:
                    iM618 = C0017.f10 + C0015.f6 + 1749113;
                    break;
                case 1750538:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, sb.toString());
                    iM618 = (C0016.f9 ^ C0016.f9) + 1747714;
                    break;
                case 1750564:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    iM618 = (C0015.f6 | C0014.f3) + 1753636;
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    break;
                case 1751532:
                    if (i >= arrayList2.size()) {
                        if (C0016.f9 / (C0016.f9 | 2603) != 0) {
                            C0014.m245();
                            iM618 = C0013.m105("ۧۤۨ");
                        } else {
                            str3 = "ۥۣۨ";
                            iM618 = C0013.m105(str3);
                        }
                    } else if (C0017.f10 >= 0) {
                        C0016.m574();
                        str4 = "ۦۢ";
                        iM618 = C0013.m105(str4);
                    } else {
                        iM618 = (C0014.f3 % C0015.f6) + 1755803;
                    }
                    break;
                case 1751741:
                    this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.show();
                    if (C0013.m114() < 0) {
                        str4 = "۟ۡۦ";
                        iM618 = C0013.m105(str4);
                    } else {
                        C0015.f6 = 14;
                        iM618 = C0017.m731("ۡۦۨ");
                    }
                    break;
                case 1752701:
                    runnable.run();
                    iM618 = (C0013.f2 % C0014.f3) + 1749627;
                    break;
                case 1753482:
                    if (runnable == null) {
                        iM618 = C0016.f9 % (C0013.f2 | (-1692)) <= 0 ? C0017.m731("ۣۡۦ") : (C0014.f3 - C0016.f9) + 1750783;
                    } else if ((C0016.f9 | (C0013.f2 % (-5557))) <= 0) {
                        C0015.m570();
                        arrayList = arrayList2;
                        str3 = "ۤ۠ۨ";
                        arrayList2 = arrayList;
                        iM618 = C0013.m105(str3);
                    } else {
                        iM618 = (C0017.f10 - C0015.f6) ^ (-1752810);
                    }
                    break;
                case 1753484:
                    if (C0016.f9 - (C0014.f3 / 5580) <= 0) {
                    }
                    break;
                case 1753571:
                    ArrayList arrayList4 = new ArrayList();
                    if (C0017.m717() >= 0) {
                        C0017.f10 = 28;
                        iM618 = C0013.m105("ۣۡۡ");
                        arrayList3 = arrayList4;
                    } else {
                        iM618 = (C0015.f6 % C0017.f10) + 1755019;
                        arrayList3 = arrayList4;
                    }
                    break;
                case 1753667:
                    if (C0016.f9 % (C0013.f2 | (-1692)) <= 0) {
                    }
                    break;
                case 1753694:
                    if (C0017.f10 >= 0) {
                        C0016.m574();
                        str4 = "ۦۢ";
                        iM618 = C0013.m105(str4);
                    } else {
                        iM618 = (C0014.f3 % C0015.f6) + 1755803;
                    }
                    break;
                case 1753696:
                    arrayList = (ArrayList) Hawk.get(C0014.m250(f7short, TbsListener.ErrorCode.INCR_UPDATE_FAIL, 18, 1176), arrayList3);
                    if (C0016.f9 / (C0013.f2 * (-2044)) != 0) {
                        C0013.m114();
                        iM618 = C0014.m240("ۢۤۨ");
                        arrayList2 = arrayList;
                    } else {
                        str3 = "ۤ۠ۨ";
                        arrayList2 = arrayList;
                        iM618 = C0013.m105(str3);
                    }
                    break;
                case 1754406:
                    sb.append(C0016.m608(f7short, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 3, 1746));
                    iM618 = C0016.f9 <= 0 ? C0013.m105("ۥۧ۟") : C0013.m105("ۣ۟ۦ");
                    break;
                case 1754410:
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getClass();
                    if (C0014.m245() < 0) {
                        str = "ۦۨۢ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1755429:
                    this.f3074O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (C0014.f3 % (C0013.f2 % (-6073)) < 0) {
                        str2 = "ۤۧ۠";
                        iM618 = C0013.m105(str2);
                    } else {
                        C0015.f6 = 54;
                    }
                    break;
                case 1755588:
                    Runnable runnable2 = ShortcutsMenuItem.functionMap.get(arrayList2.get(i));
                    iM618 = (C0014.f3 - C0013.f2) ^ (-1754577);
                    runnable = runnable2;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0028. Please report as an issue. */
    public final void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() {
        String str;
        String str2;
        Handler handler;
        int visibility;
        Object obj;
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        boolean zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        String str3;
        String str4;
        LinearLayout linearLayout;
        String str5;
        Integer num;
        int i;
        int i2;
        String str6;
        int i3;
        String str7;
        String str8;
        String str9;
        Object obj2;
        int i4;
        String str10;
        LivePlayActivity livePlayActivity = null;
        int i5 = 0;
        Handler handler2 = null;
        int i6 = 0;
        boolean z = false;
        LinearLayout linearLayout2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = null;
        int i13 = 0;
        Integer num2 = null;
        int i14 = 0;
        int iM618 = C0016.m618("۟ۧۢ");
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = null;
        while (true) {
            switch (iM618) {
                case 56320:
                case 1746905:
                case 1748709:
                    if (C0013.f2 <= 0) {
                        iM618 = C0013.m105("ۥۣۣ");
                    } else {
                        str9 = "ۧ۟ۤ";
                        iM618 = C0013.m105(str9);
                    }
                    break;
                case 1746692:
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setVisibility(8);
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1354O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    iM618 = (C0013.f2 * C0013.f2) + 942516;
                    break;
                case 1746720:
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.update();
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.showAtLocation(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 8388627, 0, 0);
                    visibility = livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility();
                    handler = this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
                    str2 = "ۨۤۥ";
                    handler2 = handler;
                    i5 = visibility;
                    iM618 = C0016.m618(str2);
                    break;
                case 1746755:
                    if (C0013.f2 % (C0016.f9 + 2888) <= 0) {
                        C0014.m245();
                        iM618 = C0017.m731("۟ۡۥ");
                    } else {
                        iM618 = (C0017.f10 * C0015.f6) ^ 1946025;
                    }
                    break;
                case 1746816:
                    iM618 = C0014.f3 + C0015.f6 + 57144;
                    break;
                case 1746881:
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i14, num2);
                    if ((C0013.f2 | (C0015.f6 * 3818)) >= 0) {
                        C0016.f9 = 53;
                    } else {
                        iM618 = C0017.m731("ۥۥۥ");
                    }
                    break;
                case 1746907:
                    i3 = f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                    if (i3 != -1) {
                        i14 = i3;
                        iM618 = C0015.m573("۟ۥۧ");
                    } else {
                        i14 = i3;
                        iM618 = 1752975 + (C0015.f6 ^ C0016.f9);
                    }
                    break;
                case 1746938:
                    int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    livePlayActivity = this.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != 2) {
                        if (C0014.f3 >= 0) {
                            C0015.f6 = 82;
                            iM618 = C0014.m240("ۦۥۦ");
                        } else {
                            iM618 = (C0015.f6 ^ C0014.f3) ^ 1756017;
                        }
                    } else if (C0013.f2 > 0) {
                        str6 = "ۥۡۦ";
                        iM618 = C0014.m240(str6);
                    } else {
                        str2 = "۟۠ۡ";
                        handler = handler2;
                        visibility = i5;
                        handler2 = handler;
                        i5 = visibility;
                        iM618 = C0016.m618(str2);
                    }
                    break;
                case 1746968:
                    iM618 = C0016.m618("ۢۦ۟");
                    break;
                case 1746970:
                case 1753415:
                    if (C0013.f2 - (C0013.f2 ^ 9532) >= 0) {
                        C0015.f6 = 31;
                        str3 = "ۢۧۧ";
                        zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = z;
                        iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i6;
                        z = zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                        i6 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM618 = C0017.m731(str3);
                    } else {
                        iM618 = (C0015.f6 * C0015.f6) + 1380835;
                    }
                    break;
                case 1747680:
                    num = 0;
                    if (i13 != -1) {
                        if (C0015.f6 % (C0017.f10 + 9230) >= 0) {
                            C0013.m114();
                            num2 = num;
                            iM618 = C0015.m573("ۨۤۥ");
                        } else {
                            num2 = num;
                            obj = "ۨۧۧ";
                            iM618 = C0017.m731(obj);
                        }
                    } else if ((C0014.f3 | (C0014.f3 ^ 286)) >= 0) {
                        C0013.f2 = 35;
                        num2 = num;
                        iM618 = C0015.m573("۠ۥۤ");
                    } else {
                        num2 = num;
                        iM618 = 1746906 + (C0016.f9 / C0016.f9);
                    }
                    break;
                case 1747712:
                    if (C0015.f6 >= 0) {
                        C0015.m570();
                        str2 = "ۤۧۤ";
                        handler = handler2;
                        visibility = i5;
                        handler2 = handler;
                        i5 = visibility;
                        iM618 = C0016.m618(str2);
                    } else {
                        iM618 = (C0013.f2 ^ C0015.f6) + 1747423;
                    }
                    break;
                case 1747743:
                    if (C0013.m114() < 0) {
                        str5 = "ۤۦۦ";
                        i9 = i8;
                        iM618 = C0015.m573(str5);
                    } else {
                        C0017.m717();
                        i = i8;
                        i2 = i8;
                        obj2 = "۠ۢۡ";
                        i4 = i;
                        i9 = i2;
                        i8 = i4;
                        iM618 = C0014.m240(obj2);
                    }
                    break;
                case 1747903:
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1345O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1348O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1349O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = false;
                    if (C0013.f2 * (C0013.f2 % 4236) <= 0) {
                        C0016.f9 = 55;
                        iM618 = C0014.m240("ۡ۟ۢ");
                    }
                    break;
                case 1748612:
                    linearLayout = linearLayout2;
                    if (C0016.f9 / (C0016.f9 % (-6819)) <= 0) {
                        str4 = "ۥۢ۟";
                        linearLayout2 = linearLayout;
                        iM618 = C0016.m618(str4);
                    } else {
                        linearLayout2 = linearLayout;
                        iM618 = (-1748757) ^ (C0017.f10 - C0015.f6);
                    }
                    break;
                case 1748768:
                    if (C0014.m245() < 0) {
                        str6 = "ۢ۠ۦ";
                        iM618 = C0014.m240(str6);
                    } else {
                        C0014.m245();
                        str9 = "ۣۡۧ";
                        iM618 = C0013.m105(str9);
                    }
                    break;
                case 1748864:
                    i = 8;
                    i2 = i9;
                    obj2 = "۠ۢۡ";
                    i4 = i;
                    i9 = i2;
                    i8 = i4;
                    iM618 = C0014.m240(obj2);
                    break;
                case 1748896:
                case 1751711:
                    iM618 = C0014.f3 * (C0016.f9 * 3065) >= 0 ? C0015.m573("ۥۥ۟") : C0017.m731("ۥۦۡ");
                    break;
                case 1749608:
                    handler2.postDelayed(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 11), 150L);
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
                    if ((C0014.f3 ^ (C0014.f3 | (-2592))) > 0) {
                        str3 = "ۧۥۧ";
                        z = zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                        i6 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM618 = C0017.m731(str3);
                    } else {
                        C0016.m574();
                        obj = "ۣ۟ۨ";
                        z = zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
                        i6 = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM618 = C0017.m731(obj);
                    }
                    break;
                case 1749635:
                    iM618 = C0015.f6 + C0015.f6 + 1748188;
                    break;
                case 1749671:
                    handler2.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    if (C0014.f3 >= 0) {
                        C0014.f3 = 37;
                        iM618 = C0017.m731("ۦ۟۠");
                    } else {
                        iM618 = (C0015.f6 / C0017.f10) + 1752553;
                    }
                    break;
                case 1749787:
                    i11 = 6;
                    str10 = "ۤۢۢ";
                    iM618 = C0017.m731(str10);
                    break;
                case 1749853:
                    LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.clear();
                    if (C0016.f9 <= 0) {
                        C0017.f10 = 73;
                        iM618 = C0017.m731("۟ۦ۠");
                    } else {
                        iM618 = (C0017.f10 % C0017.f10) + 1752453;
                    }
                    break;
                case 1750532:
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1348O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    if (C0015.f6 - (C0013.f2 * 5999) >= 0) {
                        C0017.m717();
                        iM618 = C0015.m573("۟ۨۡ");
                    } else {
                        str7 = "ۥۣۢ";
                        iM618 = C0015.m573(str7);
                    }
                    break;
                case 1750538:
                    if ((C0014.f3 ^ (C0016.f9 - 7379)) <= 0) {
                        C0015.m570();
                        iM618 = C0017.m731("ۣۣۤ");
                        i9 = i7;
                    } else {
                        iM618 = C0017.m731("ۢۡۢ");
                        i9 = i7;
                    }
                    break;
                case 1750690:
                    iM618 = (C0014.f3 - C0016.f9) ^ (-1753531);
                    break;
                case 1750721:
                    if (i6 != 0) {
                        iM618 = (C0014.f3 - C0016.f9) ^ (-1753531);
                    } else {
                        this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(8);
                        this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
                        this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setVisibility(0);
                        str = "۠ۧۦ";
                        iM618 = C0014.m240(str);
                    }
                    break;
                case 1751499:
                    num = num2;
                    if ((C0014.f3 | (C0014.f3 ^ 286)) >= 0) {
                        C0013.f2 = 35;
                        num2 = num;
                        iM618 = C0015.m573("۠ۥۤ");
                    } else {
                        num2 = num;
                        iM618 = 1746906 + (C0016.f9 / C0016.f9);
                    }
                    break;
                case 1751588:
                    if (C0016.f9 <= 0) {
                        C0014.f3 = 26;
                        iM618 = C0014.m240("ۦۧۦ");
                        i12 = i11;
                    } else {
                        str9 = "ۥۦۡ";
                        i12 = i11;
                        iM618 = C0013.m105(str9);
                    }
                    break;
                case 1751616:
                    break;
                case 1751716:
                    linearLayout2.setVisibility(i9);
                    if (z) {
                        this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(8);
                        this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
                        if ((C0017.f10 ^ (C0014.f3 - 8951)) <= 0) {
                            C0014.f3 = 69;
                        }
                        iM618 = C0014.m240("۟۟ۤ");
                    } else if (C0017.f10 % (C0015.f6 % TypedValues.Custom.TYPE_STRING) < 0) {
                        C0016.f9 = 35;
                        str5 = "ۧۨ۠";
                        iM618 = C0015.m573(str5);
                    } else {
                        str4 = "ۣۥۣ";
                        linearLayout = linearLayout2;
                        linearLayout2 = linearLayout;
                        iM618 = C0016.m618(str4);
                    }
                    break;
                case 1751774:
                    if (C0014.f3 - (C0015.f6 % 6881) > 0) {
                        str6 = "ۥ۟۟";
                        iM618 = C0014.m240(str6);
                    } else {
                        C0017.f10 = 22;
                        str8 = "۟ۥۦ";
                        iM618 = C0013.m105(str8);
                    }
                    break;
                case 1752453:
                    if (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo == f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 == f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000) {
                        i10 = f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                        if (C0015.m570() <= 0) {
                            C0014.f3 = 28;
                            iM618 = C0015.m573("ۧۥۧ");
                        } else {
                            iM618 = (C0015.f6 / C0016.f9) + 1753577;
                        }
                    } else {
                        iM618 = C0016.m618("ۢۦ۟");
                    }
                    break;
                case 1752516:
                    iM618 = (C0016.f9 % C0016.f9) + 1748709;
                    break;
                case 1752550:
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1349O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    if (C0016.f9 <= 0) {
                        iM618 = C0015.m573("ۤۦۦ");
                    } else {
                        obj2 = "ۧ۟ۤ";
                        i4 = i8;
                        i8 = i4;
                        iM618 = C0014.m240(obj2);
                    }
                    break;
                case 1752553:
                    if (System.currentTimeMillis() / 1000 > this.f3084O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) {
                        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3 = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                        ArrayList arrayListO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                        ArrayList arrayList3 = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        if (C0014.f3 >= 0) {
                            arrayList = arrayListO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                            arrayList2 = arrayList3;
                            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3;
                            iM618 = C0014.m240("ۥ۟۟");
                        } else {
                            arrayList = arrayListO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                            arrayList2 = arrayList3;
                            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3;
                            iM618 = (C0014.f3 ^ C0013.f2) ^ (-1754452);
                        }
                    } else if (C0014.f3 - (C0015.f6 % 6881) > 0) {
                        C0017.f10 = 22;
                        str8 = "۟ۥۦ";
                        iM618 = C0013.m105(str8);
                    } else {
                        str6 = "ۥ۟۟";
                        iM618 = C0014.m240(str6);
                    }
                    break;
                case 1752645:
                    break;
                case 1752672:
                    O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4 = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4.getClass();
                    int i15 = f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                    f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = i12;
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4;
                    i13 = i15;
                    iM618 = (C0017.f10 % C0017.f10) + 1747680;
                    break;
                case 1752673:
                    if (C0016.f9 <= 0) {
                        C0017.m717();
                        str = "ۤۥ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = C0015.f6 + C0016.f9 + 1754395;
                    }
                    break;
                case 1753577:
                    if (C0016.f9 <= 0) {
                        C0015.f6 = 25;
                        str7 = "ۥۦۢ";
                        i12 = i10;
                        iM618 = C0015.m573(str7);
                    } else {
                        iM618 = (C0015.f6 % C0016.f9) + 1747364;
                        i12 = i10;
                    }
                    break;
                case 1753578:
                    if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                        str6 = "ۦۥۦ";
                        iM618 = C0014.m240(str6);
                    } else if (C0016.f9 <= 0) {
                        C0017.m717();
                        str = "ۤۥ";
                        iM618 = C0014.m240(str);
                    } else {
                        iM618 = C0015.f6 + C0016.f9 + 1754395;
                    }
                    break;
                case 1753607:
                    iM618 = this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getVisibility() == 8 ? (C0017.f10 - C0014.f3) + 1755138 : (C0015.f6 ^ C0013.f2) + 1753038;
                    break;
                case 1753669:
                    this.f3066O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(0);
                    this.f3060O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(0);
                    this.f3059O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setVisibility(8);
                    this.f3065O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1346O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    iM618 = (C0016.f9 ^ (C0014.f3 + 5002)) <= 0 ? C0015.m573("ۣۢۨ") : C0016.m618("ۣ۟۠");
                    break;
                case 1753702:
                    if (C0013.f2 > 0) {
                        str2 = "۟۠ۡ";
                        handler = handler2;
                        visibility = i5;
                        handler2 = handler;
                        i5 = visibility;
                        iM618 = C0016.m618(str2);
                    } else {
                        str6 = "ۥۡۦ";
                        iM618 = C0014.m240(str6);
                    }
                    break;
                case 1754380:
                    this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setVisibility(0);
                    this.f3063O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1343O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1344O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    this.f3058O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setVisibility(8);
                    iM618 = C0017.f10 / (C0014.f3 + (-3063)) != 0 ? C0015.m573("ۣ۟ۤ") : (C0014.f3 * C0016.f9) + 1927513;
                    break;
                case 1754569:
                    boolean zO0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00();
                    linearLayout = this.f3061O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                    if (zO0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
                        linearLayout2 = linearLayout;
                        i7 = 0;
                        iM618 = 1748880 + (C0013.f2 - C0017.f10);
                    } else if (C0016.f9 / (C0016.f9 % (-6819)) <= 0) {
                        str4 = "ۥۢ۟";
                        linearLayout2 = linearLayout;
                        iM618 = C0016.m618(str4);
                    } else {
                        linearLayout2 = linearLayout;
                        iM618 = (-1748757) ^ (C0017.f10 - C0015.f6);
                    }
                    break;
                case 1754595:
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = this.f3093O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
                    handler2.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                    if (C0014.f3 >= 0) {
                        C0016.m574();
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        iM618 = C0016.m618("۟ۥۧ");
                    } else {
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2;
                        iM618 = C0017.m731("ۢۢۧ");
                    }
                    break;
                case 1754625:
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.notifyDataSetChanged();
                    if (C0014.f3 >= 0) {
                        C0015.f6 = 92;
                        iM618 = C0015.m573("ۤۦۡ");
                    } else {
                        str8 = "ۣۢۨ";
                        iM618 = C0013.m105(str8);
                    }
                    break;
                case 1755435:
                    i3 = i14;
                    i14 = i3;
                    iM618 = 1752975 + (C0015.f6 ^ C0016.f9);
                    break;
                case 1755493:
                    handler2.post(livePlayActivity.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                    if (C0016.f9 <= 0) {
                        str10 = "ۣ۟ۦ";
                        iM618 = C0017.m731(str10);
                    } else {
                        iM618 = (C0016.f9 | C0014.f3) ^ (-1749695);
                    }
                    break;
                case 1755497:
                    if (i5 == 0 && livePlayActivity.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) {
                        iM618 = C0017.m731("ۨۤۡ");
                    } else if (C0014.m245() < 0) {
                        C0014.m245();
                        str9 = "ۣۡۧ";
                        iM618 = C0013.m105(str9);
                    } else {
                        str6 = "ۢ۠ۦ";
                        iM618 = C0014.m240(str6);
                    }
                    break;
                case 1755522:
                    if (C0017.f10 % (C0015.f6 % TypedValues.Custom.TYPE_STRING) < 0) {
                        str4 = "ۣۥۣ";
                        linearLayout = linearLayout2;
                        linearLayout2 = linearLayout;
                        iM618 = C0016.m618(str4);
                    } else {
                        C0016.f9 = 35;
                        str5 = "ۧۨ۠";
                        iM618 = C0015.m573(str5);
                    }
                    break;
                case 1755591:
                    livePlayActivity.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(true, this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.getContentView());
                    obj = "۟۠ۡ";
                    iM618 = C0017.m731(obj);
                    break;
                case 1755592:
                    o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i13, num2);
                    if ((C0015.f6 ^ (C0017.f10 - 6275)) <= 0) {
                        C0015.m570();
                        iM618 = C0014.m240("ۡۢۦ");
                    } else {
                        iM618 = C0015.m573("۟ۦۢ");
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
    public final void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000() {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i;
        String str;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        String str2;
        ArrayList arrayList = null;
        String strTrim = null;
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = null;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = null;
        int i2 = 0;
        int i3 = 0;
        int iM573 = C0015.m573("ۡۨ۠");
        while (true) {
            switch (iM573) {
                case 56388:
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2.f925O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = true;
                    str2 = "ۢۧۨ";
                    iM573 = C0013.m105(str2);
                    break;
                case 56511:
                    if (i3 != -1) {
                        str2 = "ۣۢ۠";
                        iM573 = C0013.m105(str2);
                    }
                    break;
                case 56512:
                    iM573 = i2 != -1 ? (C0017.f10 | C0014.f3) ^ (-56428) : (C0017.f10 ^ C0016.f9) + 1752005;
                    break;
                case 1746750:
                    i = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    if (C0014.f3 - (C0013.f2 / (-7229)) >= 0) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        i2 = i;
                        iM573 = C0016.m618("۟ۡ۠");
                    } else {
                        i2 = i;
                        iM573 = C0013.m105("ۢۤۥ");
                    }
                    break;
                case 1746935:
                    arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i2);
                    if (C0014.f3 * (C0013.f2 + 6787) >= 0) {
                        C0013.f2 = 66;
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM573 = C0015.m573("۠ۨۤ");
                    } else {
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM573 = C0016.m618("ۦۦ");
                    }
                    break;
                case 1747682:
                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = -1;
                    if ((C0014.f3 ^ (C0013.f2 % 4316)) >= 0) {
                        C0013.m114();
                        iM573 = C0016.m618("۠ۢ۟");
                    } else {
                        str = "ۣۣۣ";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM573 = C0015.m573(str);
                    }
                    break;
                case 1747716:
                case 1748671:
                    iM573 = (C0016.f9 | C0016.f9) + 1750777;
                    break;
                case 1747741:
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(i3);
                    if ((C0017.f10 ^ (C0015.f6 | 5913)) <= 0) {
                        C0015.f6 = 4;
                        str = "ۦۦ۠";
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        iM573 = C0015.m573(str);
                    } else {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3;
                        iM573 = 1748179 ^ (C0014.f3 + C0016.f9);
                    }
                    break;
                case 1747932:
                case 1751593:
                    if (C0015.m570() <= 0) {
                        C0014.f3 = 31;
                        str2 = "ۧۨۨ";
                        iM573 = C0013.m105(str2);
                    } else {
                        iM573 = (C0017.f10 / C0013.f2) ^ 1753662;
                    }
                    break;
                case 1748609:
                    str2 = "ۣۥۤ";
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    iM573 = C0013.m105(str2);
                    break;
                case 1748737:
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    if (C0016.m574() >= 0) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        iM573 = C0017.m731("ۤۢۧ");
                    } else {
                        i = i2;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        i2 = i;
                        iM573 = C0016.m618("۟ۡ۠");
                    }
                    break;
                case 1748889:
                    str = "ۣۣۡ";
                    strTrim = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.getText().toString().trim();
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    iM573 = C0015.m573(str);
                    break;
                case 1749605:
                    if (arrayList.size() > i3) {
                        iM573 = C0013.m105(C0014.f3 * (C0015.f6 % (-1347)) <= 0 ? "ۤ۟۟" : "۠ۢ۟");
                    }
                    break;
                case 1749731:
                    i3 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    str = "۟ۧ۟";
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    iM573 = C0015.m573(str);
                    break;
                case 1749827:
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                    str2 = "۠۠ۢ";
                    iM573 = C0013.m105(str2);
                    break;
                case 1750659:
                    iM573 = (C0016.f9 - C0015.f6) + 1750175;
                    break;
                case 1750722:
                    iM573 = (C0015.f6 | C0015.f6) ^ (-1748192);
                    break;
                case 1751492:
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, C0013.m153(f7short, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 4, 1220));
                    iM573 = C0013.f2 / (C0015.f6 * 7413) != 0 ? C0017.m731("ۣۨۨ") : (C0013.f2 | C0017.f10) + 1753776;
                    break;
                case 1751528:
                    iM573 = C0013.m105("ۦۦ۠");
                    break;
                case 1751586:
                    iM573 = strTrim.equals(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2.f908O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) ? C0016.f9 + C0014.f3 + 55794 : (C0015.f6 % C0013.f2) + 1752101;
                    break;
                case 1753632:
                    if (C0013.f2 <= 0) {
                        C0013.m114();
                        arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = null;
                        arrayList = arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        iM573 = C0016.m618("ۦۦ");
                    } else {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = null;
                        iM573 = C0016.f9 + C0014.f3 + 1750992;
                    }
                    break;
                case 1753637:
                    break;
                case 1753662:
                    break;
                case 1753693:
                    break;
                case 1755619:
                    iM573 = C0013.m105("ۡۨ۠");
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        int i;
        String str;
        int id;
        String str2;
        String str3;
        int i2 = 0;
        int iM240 = C0014.m240("ۨۨۢ");
        PopupWindow popupWindow = null;
        while (true) {
            switch (iM240) {
                case 56481:
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    str3 = "ۣۧۦ";
                    iM240 = C0016.m618(str3);
                    break;
                case 56538:
                    if (i2 == R.id.passwordOkButton) {
                        if ((C0013.f2 ^ (C0015.f6 / (-2974))) <= 0) {
                            C0016.f9 = 62;
                            iM240 = C0015.m573("۠ۨۥ");
                        } else {
                            iM240 = C0016.m618("ۣ۟ۡ");
                        }
                    }
                    break;
                case 1746720:
                    iM240 = i2 == R.id.mDivLeft ? C0015.f6 / (C0016.f9 * (-5474)) != 0 ? C0014.m240("۟۠ۡ") : C0016.m618("ۥۦ") : (C0013.f2 | C0013.f2) + 1753662;
                    break;
                case 1746726:
                    iM240 = (C0016.f9 | (C0013.f2 | 3200)) <= 0 ? C0016.m618("ۣۧۦ") : (C0016.f9 - C0017.f10) + 1750922;
                    break;
                case 1746813:
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                    iM240 = (C0015.f6 % C0014.f3) + 1748112;
                    break;
                case 1746881:
                    if (i2 != R.id.mDivRight) {
                        iM240 = C0015.f6 % (C0016.f9 % (-587)) >= 0 ? C0015.m573("۠۠ۤ") : C0017.m731("۟۠ۡ");
                    } else if (C0013.f2 + (C0013.f2 / (-6691)) <= 0) {
                        C0017.f10 = 69;
                        str = "ۨۨۢ";
                        iM240 = C0015.m573(str);
                    } else {
                        iM240 = (C0016.f9 * C0017.f10) + 2367600;
                    }
                    break;
                case 1747807:
                    this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.dismiss();
                    id = i2;
                    obj = "ۨۨۦ";
                    i = id;
                    i2 = i;
                    iM240 = C0017.m731(obj);
                    break;
                case 1747933:
                    break;
                case 1747936:
                    str2 = "ۧۡ";
                    iM240 = C0016.m618(str2);
                    break;
                case 1748803:
                    if (C0015.f6 * (C0015.f6 / 6804) != 0) {
                        C0014.m245();
                        str2 = "ۣ۠ۧ";
                        iM240 = C0016.m618(str2);
                    } else {
                        iM240 = (C0014.f3 / C0014.f3) + 1755617;
                    }
                    break;
                case 1749759:
                    if (C0017.f10 % (C0017.f10 * (-6143)) >= 0) {
                        C0015.m570();
                        iM240 = C0017.m731("ۡۥۧ");
                    } else {
                        iM240 = C0013.f2 + C0014.f3 + 1750007;
                    }
                    break;
                case 1750692:
                case 1751591:
                case 1752489:
                case 1755524:
                    break;
                case 1750786:
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00);
                    if (C0017.f10 % (C0015.f6 ^ (-462)) >= 0) {
                        iM240 = C0016.m618("ۧۤۧ");
                    } else {
                        str = "ۢۥۢ";
                        iM240 = C0015.m573(str);
                    }
                    break;
                case 1754378:
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                    iM240 = C0014.f3 + C0015.f6 + 1747550;
                    break;
                case 1754413:
                    PopupWindow popupWindow2 = this.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    if (C0014.f3 % (C0015.f6 ^ 6678) >= 0) {
                        C0016.m574();
                    }
                    iM240 = C0014.m240("ۨۡۨ");
                    popupWindow = popupWindow2;
                    break;
                case 1754538:
                    if (C0015.f6 % (C0016.f9 % (-587)) >= 0) {
                    }
                    break;
                case 1754562:
                    if (i2 != R.id.mPoPuLayout) {
                        str2 = "ۧۡ";
                        iM240 = C0016.m618(str2);
                    } else if ((C0015.f6 ^ (C0016.f9 % (-3847))) >= 0) {
                        iM240 = C0016.m618("ۣۤۥ");
                    } else {
                        obj = "ۧ۠ۦ";
                        i = i2;
                        i2 = i;
                        iM240 = C0017.m731(obj);
                    }
                    break;
                case 1755376:
                    iM240 = popupWindow.isShowing() ? C0015.f6 * (C0016.f9 + (-798)) >= 0 ? C0016.m618("ۨۥۡ") : C0015.f6 + C0017.f10 + 1749174 : C0017.m731("۠ۨۥ");
                    break;
                case 1755407:
                    if (popupWindow != null) {
                        if (C0014.f3 >= 0) {
                            C0015.m570();
                            str3 = "ۤۢۥ";
                            iM240 = C0016.m618(str3);
                        } else {
                            iM240 = (C0017.f10 | C0017.f10) + 1756134;
                        }
                    }
                    break;
                case 1755498:
                    break;
                case 1755618:
                    id = view.getId();
                    if (C0015.f6 - (C0016.f9 - 4348) <= 0) {
                        obj = "ۨۨۦ";
                        i = id;
                        i2 = i;
                        iM240 = C0017.m731(obj);
                    } else {
                        iM240 = 1746946 + (C0014.f3 | C0015.f6);
                        i2 = id;
                    }
                    break;
                case 1755622:
                    if (C0015.f6 < 0) {
                        str2 = "ۨۥۡ";
                        iM240 = C0016.m618(str2);
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x002c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str;
        String str2;
        int iM618 = C0016.m618("ۣۡ۟");
        while (true) {
            switch (iM618) {
                case 1748613:
                    if (view != this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
                        str2 = "ۤ۟ۥ";
                        iM618 = C0016.m618(str2);
                    } else if (C0015.f6 >= 0) {
                        C0013.m114();
                        str = "ۦۣۤ";
                        iM618 = C0017.m731(str);
                    } else {
                        iM618 = (C0013.f2 - C0016.f9) ^ 1751687;
                    }
                    break;
                case 1749641:
                    this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.removeCallbacks(this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                    if (C0013.f2 % (C0013.f2 - 7159) <= 0) {
                        C0016.m574();
                        iM618 = C0013.m105("ۤۨ۠");
                    } else {
                        str = "ۦۣۦ";
                        iM618 = C0017.m731(str);
                    }
                    break;
                case 1750787:
                    if (C0014.f3 + (C0013.f2 * 1182) <= 0) {
                        C0014.f3 = 71;
                        str2 = "ۥۢۢ";
                    } else {
                        str2 = "ۣۡ۟";
                    }
                    iM618 = C0016.m618(str2);
                    break;
                case 1751498:
                    iM618 = view == this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O ? C0014.m245() >= 0 ? C0016.m618("ۢۡۨ") : (C0014.f3 ^ C0013.f2) + 1752623 : (C0017.f10 / C0017.f10) + 1753544;
                    break;
                case 1751772:
                    if (z) {
                        if (C0015.f6 + (C0016.f9 - 188) <= 0) {
                            C0016.m574();
                            iM618 = C0016.m618("ۣۧۧ");
                        }
                    }
                    break;
                case 1751773:
                    if (C0015.f6 >= 0) {
                        C0013.m114();
                        str = "ۦۣۤ";
                        iM618 = C0017.m731(str);
                    } else {
                        iM618 = (C0013.f2 - C0016.f9) ^ 1751687;
                    }
                    break;
                case 1752704:
                    break;
                case 1753545:
                    break;
                default:
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        TextView textView = this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        Handler handler = this.f3082O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        if (view == textView || view == this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i != 66) {
                switch (i) {
                    case 19:
                    case 20:
                        EditText editText = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
                        if (view == editText) {
                            this.f3075O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.requestFocus();
                        } else {
                            editText.requestFocus();
                        }
                        return true;
                    case 21:
                        this.f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.setDescendantFocusability(393216);
                        this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.requestFocus();
                        if (this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getVisibility() == 8) {
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 5;
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                        } else {
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo--;
                            this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                        }
                        return true;
                    case 22:
                        return true;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (view == this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(C0016.m608(f7short, 246, 12, 2847));
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, 1);
                }
            } else {
                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
            }
            handler.removeCallbacks(this.f3090O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
            return true;
        }
        if (view != this.f3083O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) {
            return false;
        }
        int action = keyEvent.getAction();
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3094O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        if (action != 0) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i != 22) {
                if (i != 23 && i != 66) {
                    return false;
                }
                this.f3089O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = false;
                return true;
            }
            int i2 = f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
            if (i2 == 1 || i2 == 2) {
                handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            return true;
        }
        if (i != 66) {
            if (i == 82) {
                if (f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 1) {
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                }
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                return true;
            }
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = this.f3092O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3 = this.f3091O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
            switch (i) {
                case 19:
                    int i3 = f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    if (i3 == 5) {
                        int i4 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                        if (i4 > 0) {
                            f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = i4 - 1;
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(i4, 0);
                            this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                        } else {
                            f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.getItemCount() - 1;
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(0, 0);
                            this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                        }
                        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3);
                    } else if (i3 == 0) {
                        int i5 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                        if (i5 > 0) {
                            f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = i5 - 1;
                            this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i5, 0);
                            this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                        } else {
                            f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getItemCount() - 1;
                            this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(0, 0);
                            this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                        }
                        this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                    } else if (i3 == 1) {
                        int i6 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                        if (i6 > 0) {
                            f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i6 - 1;
                            this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(i6, 0);
                            this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        } else {
                            f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount() - 1;
                            this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(0, 0);
                            this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        }
                        this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    } else if (i3 == 2) {
                        int i7 = f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                        if (i7 > 0) {
                            f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = i7 - 1;
                            this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(i7, 0);
                            this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0);
                        } else {
                            f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.getItemCount() - 1;
                            this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(0, 0);
                            this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0);
                        }
                        this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    } else if (i3 == 3) {
                        int i8 = f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
                        if (i8 > 0) {
                            f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = i8 - 1;
                            this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(i8, 0);
                            this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                        } else {
                            f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getItemCount() - 1;
                            this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(0, 0);
                            this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                        }
                        this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, 0);
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                    } else if (i3 == 4) {
                        int i9 = f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
                        if (i9 > 0) {
                            f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = i9 - 1;
                            this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(i9, 0);
                            this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                        } else {
                            f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getItemCount() - 1;
                            this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(0, 0);
                            this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                        }
                        this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, 0);
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    return true;
                case 20:
                    int i10 = f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    if (i10 == 5) {
                        int i11 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                        if (i11 < this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.getItemCount() - 1) {
                            f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo++;
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(i11, 0);
                            this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                        } else {
                            f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = 0;
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyItemChanged(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getItemCount() - 1, 0);
                            this.f3053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
                        }
                        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3);
                    } else if (i10 == 0) {
                        int i12 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                        if (i12 < this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getItemCount() - 1) {
                            f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo++;
                            this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i12, 0);
                            this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                        } else {
                            f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 0;
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.notifyItemChanged(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getItemCount() - 1, 0);
                            this.f3054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                        }
                        this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
                    } else if (i10 == 1) {
                        int i13 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                        if (i13 < this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount() - 1) {
                            f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000++;
                            this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(i13, 0);
                            this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        } else {
                            f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = 0;
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
                            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.notifyItemChanged(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.getItemCount() - 1, 0);
                            this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        }
                        this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    } else if (i10 == 2) {
                        int i14 = f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                        if (i14 < this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.getItemCount() - 1) {
                            f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0++;
                            this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(i14, 0);
                            this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0);
                        } else {
                            f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = 0;
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getItemCount() - 1, 0);
                            this.f3056O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0);
                        }
                        this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    } else if (i10 == 3) {
                        int i15 = f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
                        if (i15 < this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getItemCount() - 1) {
                            f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0++;
                            this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(i15, 0);
                            this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                        } else {
                            f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = 0;
                            O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
                            o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.notifyItemChanged(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.getItemCount() - 1, 0);
                            this.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                        }
                        this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, 0);
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                    } else if (i10 == 4) {
                        int i16 = f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
                        if (i16 < this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getItemCount() - 1) {
                            f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00++;
                            this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(i16, 0);
                            this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                        } else {
                            f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = 0;
                            O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                            o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.notifyItemChanged(o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.getItemCount() - 1, 0);
                            this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                        }
                        this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, 0);
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    return true;
                case 21:
                    int i17 = f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    if (i17 == 5) {
                        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00()) {
                            if (this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getItemCount() != 0) {
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo--;
                                int i18 = f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
                                if (i18 < 0 || i18 >= this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getItemCount()) {
                                    f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = 0;
                                }
                            }
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                            this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, 0);
                            this.f3052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
                        }
                    } else if (i17 == 0) {
                        f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 5;
                        this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                    } else if (i17 == 1) {
                        if (f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 && O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() == 0) {
                            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                        } else {
                            if (this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getVisibility() == 8) {
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 5;
                                this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                            } else {
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo--;
                                this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                            }
                            this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                        }
                    } else if (i17 == 2) {
                        f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = i17 - 1;
                        this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                        this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                    } else if (i17 == 3) {
                        f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = i17 - 1;
                        this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, 0);
                        this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo4 = this.f3093O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
                        handler.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo4);
                        handler.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo4);
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    return true;
                case 22:
                    int i19 = f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
                    if (i19 == 4) {
                        if (this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.getItemCount() > 0) {
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo++;
                            int i20 = f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                            if (i20 < 0 || i20 >= this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.getItemCount()) {
                                f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = 0;
                            }
                        }
                        this.f3076O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.notifyItemChanged(f3039O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, 0);
                        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                    } else if (i19 == 5) {
                        if (this.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getVisibility() == 8) {
                            if (f3033O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
                                this.f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.setDescendantFocusability(131072);
                                this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.requestFocus();
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 1;
                            } else if (!f3034O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO && this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount() > 0) {
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 1;
                                int i21 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                                if (i21 < 0 || i21 >= this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount()) {
                                    f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = 0;
                                }
                            }
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                            this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                            this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        } else {
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 0;
                            int i22 = f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                            if (i22 < 0 || i22 >= this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getItemCount()) {
                                f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = 0;
                            }
                            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.notifyItemChanged(f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, 0);
                            this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                        }
                    } else if (i19 == 0) {
                        if (f3033O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
                            this.f3086O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.setDescendantFocusability(131072);
                            this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.requestFocus();
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo++;
                        } else if (!f3034O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO && this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount() > 0) {
                            f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo++;
                            int i23 = f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                            if (i23 < 0 || i23 >= this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getItemCount()) {
                                f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = 0;
                            }
                        }
                        this.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 0);
                        this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                        this.f3055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                    } else if (i19 == 1) {
                        if (!f3033O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 && !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o()) {
                            if (f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 || O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() == 1) {
                                f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo++;
                                this.f3078O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.notifyItemChanged(f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, 0);
                                this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                            } else {
                                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                            }
                        }
                    } else if (i19 == 2 && this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getItemCount() > 0) {
                        f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo++;
                        int i24 = f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;
                        if (i24 < 0 || i24 >= this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getItemCount()) {
                            f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = 0;
                        }
                        this.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.notifyItemChanged(f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 0);
                        this.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.notifyItemChanged(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, 0);
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0);
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    return true;
                case 23:
                    break;
                default:
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    return false;
            }
        }
        if (!this.f3089O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) {
            this.f3089O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = true;
            handler.post(this.f3095O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000);
        }
        return true;
    }
}
