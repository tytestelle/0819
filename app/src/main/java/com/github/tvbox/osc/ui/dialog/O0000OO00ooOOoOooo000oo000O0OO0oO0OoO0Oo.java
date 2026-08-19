package com.github.tvbox.osc.ui.dialog;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnLongClickListener {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final HashMap f3201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f3202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, 1);
        this.f3203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f3202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        if (LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o == null) {
            return;
        }
        setContentView(R.layout.dialog_play_messgae);
        setCanceledOnTouchOutside(true);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.sendEmptyMessage(0);
    }

    public static String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(String str) {
        String str2 = (String) f3201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(str);
        return str2 != null ? str2 : "";
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        ((ScrollView) findViewById(R.id.scrollView)).setVisibility(0);
        ((TextView) findViewById(R.id.title)).setText("媒体信息");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.seekbackurlGroup);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.fpsGroup);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.videoBitrateGroup);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.userAgentGroup);
        LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.headersGroup);
        LinearLayout linearLayout6 = (LinearLayout) findViewById(R.id.jsNameGroup);
        LinearLayout linearLayout7 = (LinearLayout) findViewById(R.id.jsUrlGroup);
        LinearLayout linearLayout8 = (LinearLayout) findViewById(R.id.jsReturnGroup);
        LinearLayout linearLayout9 = (LinearLayout) findViewById(R.id.hostGroup);
        LinearLayout linearLayout10 = (LinearLayout) findViewById(R.id.groupConfigurationGroup);
        ((TextView) findViewById(R.id.name)).setText("频道名称:  ");
        ((TextView) findViewById(R.id.num)).setText("频道序号:  ");
        ((TextView) findViewById(R.id.grp)).setText("分组名称:  ");
        ((TextView) findViewById(R.id.decoding)).setText("解码方式:  ");
        ((TextView) findViewById(R.id.scale)).setText("画面比例:  ");
        ((TextView) findViewById(R.id.groupConfiguration)).setText("分组配置:  ");
        ((TextView) findViewById(R.id.url)).setText("频道地址:  ");
        ((TextView) findViewById(R.id.seekbackurl)).setText("回看地址:  ");
        ((TextView) findViewById(R.id.videoResolution)).setText("视频质量:  ");
        ((TextView) findViewById(R.id.fps)).setText("视频帧率:  ");
        ((TextView) findViewById(R.id.videoBitrate)).setText("视频码率:  ");
        ((TextView) findViewById(R.id.audioTrack)).setText("声道信息:  ");
        ((TextView) findViewById(R.id.userAgent)).setText("用户代理:  ");
        ((TextView) findViewById(R.id.headers)).setText("请求参数:  ");
        ((TextView) findViewById(R.id.host)).setText("域名映射:  ");
        ((TextView) findViewById(R.id.jsName)).setText("脚本名称:  ");
        ((TextView) findViewById(R.id.jsUrl)).setText("请求地址:  ");
        ((TextView) findViewById(R.id.jsReturn)).setText("返回内容:  ");
        TextView textView = (TextView) findViewById(R.id.nameTxt);
        textView.setText(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        TextView textView2 = (TextView) findViewById(R.id.numTxt);
        textView2.setText(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f936O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + "");
        TextView textView3 = (TextView) findViewById(R.id.grpTxt);
        textView3.setText(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        TextView textView4 = (TextView) findViewById(R.id.decodingTxt);
        textView4.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000());
        TextView textView5 = (TextView) findViewById(R.id.scaleTxt);
        textView5.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00());
        TextView textView6 = (TextView) findViewById(R.id.groupConfigurationTxt);
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null || TextUtils.isEmpty(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO())) ? null : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        textView6.setText(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null ? strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : "");
        linearLayout10.setVisibility(TextUtils.isEmpty(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) ? 8 : 0);
        TextView textView7 = (TextView) findViewById(R.id.urlTxt);
        textView7.setText(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
        TextView textView8 = (TextView) findViewById(R.id.videoResolutionTxt);
        LivePlayActivity livePlayActivity = this.f3202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getVideoSize().length >= 2) {
            textView8.setText(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getVideoSize()[0] + "x" + livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getVideoSize()[1]);
        }
        TextView textView9 = (TextView) findViewById(R.id.seekbackurlTxt);
        textView9.setText(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("SeekBackUrl"));
        if (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        TextView textView10 = (TextView) findViewById(R.id.fpsTxt);
        int videoFps = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getVideoFps();
        textView10.setText(videoFps + "FPS");
        linearLayout2.setVisibility(videoFps == 0 ? 8 : 0);
        TextView textView11 = (TextView) findViewById(R.id.videoBitrateTxt);
        String videoBitrate = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getVideoBitrate();
        textView11.setText(videoBitrate);
        linearLayout3.setVisibility(0);
        linearLayout3.setVisibility(TextUtils.isEmpty(videoBitrate) ? 8 : 0);
        TextView textView12 = (TextView) findViewById(R.id.audioTrackTxt);
        String audioTrack = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getAudioTrack();
        if (audioTrack == null) {
            audioTrack = "N/A";
        }
        textView12.setText(audioTrack);
        TextView textView13 = (TextView) findViewById(R.id.userAgentTxt);
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("User_Agent");
        textView13.setText(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        linearLayout4.setVisibility(TextUtils.isEmpty(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ? 8 : 0);
        TextView textView14 = (TextView) findViewById(R.id.headersTxt);
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("Headers");
        textView14.setText(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2);
        linearLayout5.setVisibility((TextUtils.isEmpty(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2) || "{}".equals(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2)) ? 8 : 0);
        TextView textView15 = (TextView) findViewById(R.id.hostTxt);
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("Host");
        textView15.setText(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3);
        linearLayout9.setVisibility(TextUtils.isEmpty(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3) ? 8 : 0);
        TextView textView16 = (TextView) findViewById(R.id.jsNameTxt);
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("JsName");
        textView16.setText(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4);
        linearLayout6.setVisibility(TextUtils.isEmpty(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4) ? 8 : 0);
        TextView textView17 = (TextView) findViewById(R.id.jsUrlTxt);
        String str = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getmUrl();
        textView17.setText(str);
        linearLayout7.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        TextView textView18 = (TextView) findViewById(R.id.jsReturnTxt);
        String strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("JsReturn");
        textView18.setText(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5);
        linearLayout8.setVisibility(TextUtils.isEmpty(strO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5) ? 8 : 0);
        textView.setOnLongClickListener(this);
        textView2.setOnLongClickListener(this);
        textView3.setOnLongClickListener(this);
        textView6.setOnLongClickListener(this);
        textView7.setOnLongClickListener(this);
        textView9.setOnLongClickListener(this);
        textView8.setOnLongClickListener(this);
        textView10.setOnLongClickListener(this);
        textView12.setOnLongClickListener(this);
        textView13.setOnLongClickListener(this);
        textView14.setOnLongClickListener(this);
        textView15.setOnLongClickListener(this);
        textView16.setOnLongClickListener(this);
        textView17.setOnLongClickListener(this);
        textView18.setOnLongClickListener(this);
        textView4.setOnLongClickListener(this);
        textView5.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        try {
            ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", ((TextView) view).getText().toString()));
        } catch (Exception e) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 0);
        }
        switch (id) {
            case R.id.audioTrackTxt /* 2131427440 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "声道信息已复制到剪贴板");
                break;
            case R.id.decodingTxt /* 2131427539 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "解码方式已复制到剪贴板");
                break;
            case R.id.fpsTxt /* 2131427659 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "视频FPS已复制到剪贴板");
                break;
            case R.id.groupConfigurationTxt /* 2131427671 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "分组配置已复制到剪贴板");
                break;
            case R.id.grpTxt /* 2131427677 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "分组名称已复制到剪贴板");
                break;
            case R.id.headersTxt /* 2131427705 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "请求参数已复制到剪贴板");
                break;
            case R.id.hostTxt /* 2131427714 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "host已复制到剪贴板");
                break;
            case R.id.jsNameTxt /* 2131427755 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "脚本名称已复制到剪贴板");
                break;
            case R.id.jsReturnTxt /* 2131427758 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "返回内容已复制到剪贴板");
                break;
            case R.id.jsUrlTxt /* 2131427761 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "请求地址已复制到剪贴板");
                break;
            case R.id.nameTxt /* 2131427888 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "节目名称已复制到剪贴板");
                break;
            case R.id.numTxt /* 2131427904 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "节目序号已复制到剪贴板");
                break;
            case R.id.scaleTxt /* 2131427958 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "画面比例已复制到剪贴板");
                break;
            case R.id.seekbackurlTxt /* 2131427993 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "回看URL已复制到剪贴板");
                break;
            case R.id.urlTxt /* 2131428158 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "节目URL已复制到剪贴板");
                break;
            case R.id.userAgentTxt /* 2131428163 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "用户代理已复制到剪贴板");
                break;
            case R.id.videoResolutionTxt /* 2131428170 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "视频分辨率已复制到剪贴板");
                break;
        }
        return true;
    }
}
