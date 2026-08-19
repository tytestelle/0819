package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import androidx.media3.common.text.Cue;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;
import xyz.doikki.videoplayer.ijk.IjkPlayer;
import xyz.doikki.videoplayer.ijk.RawDataSourceProvider;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends IjkPlayer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f979O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f980O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context, int i, String str) {
        super(context);
        this.f979O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f980O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    private void setDataSourceHeader(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = map.get("User-Agent");
        if (!TextUtils.isEmpty(str)) {
            this.mMediaPlayer.setOption(1, "user_agent", str);
            map.remove("User-Agent");
        }
        if (map.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getValue());
                }
                sb.append("\r\n");
                this.mMediaPlayer.setOption(1, "headers", sb.toString());
            }
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.mMediaPlayer.deselectTrack(i);
    }

    public List<O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> getTrackInfo() {
        IjkTrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
        if (trackInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int selectedTrack = this.mMediaPlayer.getSelectedTrack(3);
        int selectedTrack2 = this.mMediaPlayer.getSelectedTrack(2);
        int selectedTrack3 = this.mMediaPlayer.getSelectedTrack(1);
        int i = 0;
        while (i < trackInfo.length) {
            IjkTrackInfo ijkTrackInfo = trackInfo[i];
            if (ijkTrackInfo.getTrackType() == 1) {
                String infoInline = ijkTrackInfo.getInfoInline();
                boolean z = i == selectedTrack3;
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.VIDEO;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = infoInline;
                ijkTrackInfo.getLanguage();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z;
                arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                if (z) {
                    O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("videoSelected", Integer.valueOf(i));
                }
            } else if (ijkTrackInfo.getTrackType() == 2) {
                String infoInline2 = ijkTrackInfo.getInfoInline();
                boolean z2 = i == selectedTrack2;
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.AUDIO;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = infoInline2;
                ijkTrackInfo.getLanguage();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z2;
                arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO1);
                if (z2) {
                    O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("audioSelected", Integer.valueOf(i));
                }
            } else if (ijkTrackInfo.getTrackType() == 3) {
                String infoInline3 = ijkTrackInfo.getInfoInline();
                boolean z3 = i == selectedTrack;
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO2 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SUBTITLE;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = infoInline3;
                ijkTrackInfo.getLanguage();
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z3;
                arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO2);
                if (z3) {
                    O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("subSelected", Integer.valueOf(i));
                }
            }
            i++;
        }
        return arrayList;
    }

    @Override // xyz.doikki.videoplayer.ijk.IjkPlayer, tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public final void onPrepared(IMediaPlayer iMediaPlayer) {
        super.onPrepared(iMediaPlayer);
        this.mPlayerEventListener.onTrackList(getTrackInfo());
    }

    @Override // xyz.doikki.videoplayer.ijk.IjkPlayer, tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
    public final void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
        super.onTimedText(iMediaPlayer, ijkTimedText);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Cue.Builder().setText(ijkTimedText.getText().replaceAll("\\{\\\\.*?\\}", "")).build());
        if (TextUtils.isEmpty(ijkTimedText.getText())) {
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
        } else {
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setCues(arrayList);
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(0);
        }
    }

    @Override // xyz.doikki.videoplayer.ijk.IjkPlayer, xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setDataSource(String str, Map map) {
        setDataSourceHeader(map);
        super.setDataSource(str, map);
    }

    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        this.mMediaPlayer.setOnTimedTextListener(onTimedTextListener);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
    @Override // xyz.doikki.videoplayer.ijk.IjkPlayer, xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setOptions() {
        String str;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.mMediaPlayer.setOption(4, "subtitle", 1L);
        this.mMediaPlayer.setOption(4, "framedrop", 5L);
        this.mMediaPlayer.setOption(4, "overlay-format", 842225234L);
        this.mMediaPlayer.setOption(4, "packet-buffering", 0L);
        this.mMediaPlayer.setOption(4, "soundtouch", 1L);
        this.mMediaPlayer.setOption(4, "start-on-prepared", 1L);
        this.mMediaPlayer.setOption(4, "opensles", 0L);
        this.mMediaPlayer.setOption(4, "enable-accurate-seek", 0L);
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o()) {
            this.mMediaPlayer.setOption(4, "vf0", "yadif=2");
        }
        this.mMediaPlayer.setOption(2, "skip_loop_filter", 0L);
        this.mMediaPlayer.setOption(1, "reconnect", 1L);
        this.mMediaPlayer.setOption(1, "dns_cache_clear", 1L);
        this.mMediaPlayer.setOption(1, "dns_cache_timeout", -1L);
        this.mMediaPlayer.setOption(1, "safe", 0L);
        this.mMediaPlayer.setOption(1, "http-detect-range-support", 0L);
        this.mMediaPlayer.setOption(1, "delay-optimization", 1L);
        this.mMediaPlayer.setOption(1, "cache-buffer-duration", 20000L);
        this.mMediaPlayer.setOption(1, "fflags", "fastseek");
        long j = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1489O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        long j2 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1490O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        int i = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f187O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i != -1) {
            j = i;
        }
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) == null || (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000) == null) {
            str = "";
        } else {
            String str2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f931O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
            if (str2 == null) {
                str2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f919O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            }
            if (!TextUtils.isEmpty(str2) || O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() > 0) {
                str = "http://127.0.0.1:" + O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1057O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            } else {
                str = "";
            }
        }
        this.mMediaPlayer.setOption(1, "http_proxy", str);
        this.mMediaPlayer.setOption(1, "analyzeduration", j);
        IjkMediaPlayer ijkMediaPlayer = this.mMediaPlayer;
        long j3 = this.f979O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ijkMediaPlayer.setOption(4, "mediacodec", j3);
        this.mMediaPlayer.setOption(4, "mediacodec-hevc", j3);
        this.mMediaPlayer.setOption(4, "mediacodec-all-videos", j3);
        this.mMediaPlayer.setOption(4, "mediacodec-auto-rotate", j3);
        this.mMediaPlayer.setOption(4, "mediacodec-handle-resolution-change", j3);
        this.mMediaPlayer.setOption(4, "enable-accurate-seek", 1L);
        this.mMediaPlayer.setOption(1, "infbuf", 1L);
        this.mMediaPlayer.setOption(4, "hdr", 1L);
        if (j2 >= 0) {
            this.mMediaPlayer.setOption(1, "probesize", j2);
        }
        String str3 = this.f980O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (str3.contains("rtsp") || str3.contains("udp") || str3.contains(CmcdConfiguration.KEY_MAXIMUM_REQUESTED_BITRATE)) {
            this.mMediaPlayer.setOption(1, "rtsp_flags", "prefer_tcp");
            this.mMediaPlayer.setOption(1, "rtsp_transport", O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() == 0 ? "tcp" : "udp");
        }
        super.setOptions();
    }

    public void setTrack(int i) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
        this.mMediaPlayer.selectTrack(i);
    }

    @Override // xyz.doikki.videoplayer.ijk.IjkPlayer, xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.mMediaPlayer.setDataSource(new RawDataSourceProvider(assetFileDescriptor));
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
