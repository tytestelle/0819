package com.github.tvbox.osc.base;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.github.tvbox.osc.R$styleable;
import com.orhanobut.hawk.Hawk;
import java.util.Stack;
import me.jessyan.autosize.AutoSizeCompat;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import xyz.doikki.videoplayer.util.CutoutUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends AppCompatActivity implements CustomAdapt {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static float f2938O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -100.0f;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2939O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public abstract int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();

    public final int O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        return this.f2939O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.obtainStyledAttributes(R$styleable.themeColor).getColor(0, 0);
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(boolean z, View view) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility | 6405;
        int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        if ((iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == 0 && !z) || iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == 2) {
            i = systemUiVisibility | 6919;
        }
        view.setSystemUiVisibility(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(context, PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", "zh")));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int screenWidth = AutoSizeConfig.getInstance().getScreenWidth();
        int screenHeight = AutoSizeConfig.getInstance().getScreenHeight();
        int i = (-((Integer) Hawk.get("字体设置", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1455O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0))).intValue()) * 30;
        boolean z = screenWidth > screenHeight;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AutoSizeCompat.autoConvertDensity(super.getResources(), getSizeInDp() + i, z);
        }
        return super.getResources();
    }

    @Override // me.jessyan.autosize.internal.CustomAdapt
    public final float getSizeInDp() {
        return isBaseOnWidth() ? 960.0f : 720.0f;
    }

    public abstract void init();

    @Override // me.jessyan.autosize.internal.CustomAdapt
    public final boolean isBaseOnWidth() {
        return f2938O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < 4.0f;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            if (f2938O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < 0.0f) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                f2938O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Math.max(i, i2) / Math.min(i, i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        setTheme(((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1365O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.get(((Integer) Hawk.get("主题切换", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1440O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0))).intValue())).f965O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        super.onCreate(bundle);
        setContentView(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo());
        this.f2939O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this;
        CutoutUtil.adaptCutoutAboveAndroidP((Context) this, true);
        if (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2824O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2824O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Stack();
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2824O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(this);
        init();
        getWindow().addFlags(128);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(false, getWindow().getDecorView());
    }
}
