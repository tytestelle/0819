package com.github.tvbox.osc.ui.dialog;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3298O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 f3299O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, int i) {
        this.f3298O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3299O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3298O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = this.f3299O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                LivePlayActivity livePlayActivity = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3303O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                try {
                    String str = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1502O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;
                    if (!TextUtils.isEmpty(str)) {
                        String strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(str, null);
                        if (strO00000OOoOOO00O00o0ooooooooO000ooooO0000 != null && strO00000OOoOOO00O00o0ooooooooO000ooooO0000.startsWith("\ufeff")) {
                            strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = strO00000OOoOOO00O00o0ooooooooO000ooooO0000.substring(1);
                        }
                        if (!TextUtils.isEmpty(strO00000OOoOOO00O00o0ooooooooO000ooooO0000)) {
                            JSONObject jSONObject = new JSONObject(strO00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            if (jSONObject.has("Update")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("Update");
                                o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3308O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jSONObject2.getBoolean("hasUpdate");
                                o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3309O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = jSONObject2.getInt("versionCode");
                                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3302O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = jSONObject2.getString("updateLog");
                                o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3311O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jSONObject2.getString("apkSize");
                                o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3305O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = jSONObject2.getString("apkUrl");
                            }
                        }
                        PackageManager packageManager = livePlayActivity.getPackageManager();
                        o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3310O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 0;
                        try {
                            o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3310O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = packageManager.getPackageInfo(livePlayActivity.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                        }
                        if (o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3310O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo < o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3309O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3308O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                            o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3304O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
                        }
                        livePlayActivity.runOnUiThread(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, 1));
                        break;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            default:
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1 = this.f3299O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3304O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    ((TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.title)).setText("发现新版本");
                    TextView textView = (TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.size);
                    textView.setText(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3311O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    if (TextUtils.isEmpty(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3311O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = (TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.mes);
                    textView2.setText(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3302O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                    textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
                    TextView textView3 = (TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.ok);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3312O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = textView3;
                    textView3.setText("更新");
                    TextView textView4 = (TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.cancel);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3313O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = textView4;
                    textView4.setText("取消");
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3307O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (ProgressBar) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.update_progressbar);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3315O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (TextView) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.percentage);
                    FrameLayout frameLayout = (FrameLayout) o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.findViewById(R.id.frameLayout);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3314O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = frameLayout;
                    frameLayout.setVisibility(8);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3312O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setOnClickListener(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.f3313O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setOnClickListener(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o1.show();
                }
                break;
        }
    }
}
