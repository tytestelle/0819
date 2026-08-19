package com.github.tvbox.osc.ui.dialog;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static String f3300O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static String f3301O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public static String f3302O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f3303O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3304O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f3305O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f3306O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public ProgressBar f3307O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f3308O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public int f3309O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public int f3310O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public String f3311O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public TextView f3312O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public TextView f3313O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public FrameLayout f3314O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public TextView f3315O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3316O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3317O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.cancel) {
            dismiss();
            return;
        }
        new Thread(this.f3316O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).start();
        this.f3314O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setVisibility(0);
        this.f3312O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setVisibility(8);
        this.f3313O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setVisibility(8);
    }
}
