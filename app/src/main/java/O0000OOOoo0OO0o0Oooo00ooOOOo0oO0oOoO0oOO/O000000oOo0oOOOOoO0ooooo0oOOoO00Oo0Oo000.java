package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import is.xyz.mpv.MPVLib;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends AbstractPlayer implements MPVLib.EventObserver, MPVLib.LogObserver {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f988O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Handler f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Context context) {
        super(context);
        this.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Handler(Looper.getMainLooper());
        this.f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        this.f988O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
    }

    public static /* synthetic */ void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (!o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.mPlayerEventListener.onCompletion();
        } else {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.mPlayerEventListener.onError();
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        }
    }

    public static String O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(long j) {
        if (j >= 1000000) {
            return String.format(Locale.getDefault(), "%.2f Mbps", Double.valueOf(j / 1000000.0d));
        }
        if (j >= 1000) {
            return String.format(Locale.getDefault(), "%.2f Kbps", Double.valueOf(j / 1000.0d));
        }
        return j + " bps";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f3  */
    private void getTrackInfo() {
        byte b;
        String str;
        int i;
        Object obj;
        String strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        byte b2;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
        String str2 = "type";
        String propertyString = MPVLib.getPropertyString("track-list");
        if (propertyString == null) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(propertyString);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                String string = jSONObject.getString(str2);
                int iHashCode = string.hashCode();
                if (iHashCode != 114240) {
                    if (iHashCode != 93166550) {
                        if (iHashCode == 112202875 && string.equals("video")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (string.equals("audio")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (string.equals("sub")) {
                    b = 2;
                } else {
                    b = -1;
                }
                JSONArray jSONArray2 = jSONArray;
                if (b != 0) {
                    i = i2;
                    obj = "video";
                    str = str2;
                    if (b == 1) {
                        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.AUDIO;
                        long jOptLong = jSONObject.optLong("demux-bitrate", 0L);
                        strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jOptLong > 0 ? O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(jOptLong) : "N/A";
                        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = "Audio, " + jSONObject.optString("codec", "Unknown") + ", " + strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + ", " + jSONObject.optString("demux-samplerate", SessionDescription.SUPPORTED_SDP_VERSION) + " Hz";
                        String strOptString = jSONObject.optString("lang", "");
                        if (!TextUtils.isEmpty(strOptString) && !C.LANGUAGE_UNDETERMINED.equals(strOptString)) {
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += " [" + strOptString + "]";
                        }
                    } else if (b == 2) {
                        try {
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SUBTITLE;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = "Subtitle, " + jSONObject.optString("codec", "Unknown") + ", " + jSONObject.optString("decoder-desc", "N/A");
                            String strOptString2 = jSONObject.optString("lang", "");
                            if (!TextUtils.isEmpty(strOptString2) && !C.LANGUAGE_UNDETERMINED.equals(strOptString2)) {
                                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 += " [" + strOptString2 + "]";
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.e("MPVPlayer", "解析 track-list 失败: " + e.getMessage());
                            return;
                        }
                    }
                } else {
                    str = str2;
                    i = i2;
                    obj = "video";
                    o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.VIDEO;
                    long jOptLong2 = jSONObject.optLong("demux-bitrate", 0L);
                    strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jOptLong2 > 0 ? O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(jOptLong2) : "N/A";
                    o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = "Video, " + jSONObject.optString("codec", "Unknown") + ", " + strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + ", " + jSONObject.optString("demux-w", SessionDescription.SUPPORTED_SDP_VERSION) + " x " + jSONObject.optString("demux-h", SessionDescription.SUPPORTED_SDP_VERSION);
                }
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = jSONObject.getInt(TtmlNode.ATTR_ID);
                jSONObject.optString("lang", "");
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jSONObject.getBoolean("selected");
                arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                if (o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    str2 = str;
                    String string2 = jSONObject.getString(str2);
                    int iHashCode2 = string2.hashCode();
                    if (iHashCode2 != 114240) {
                        if (iHashCode2 != 93166550) {
                            if (iHashCode2 == 112202875 && string2.equals(obj)) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                        } else if (string2.equals("audio")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (string2.equals("sub")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("audioSelected", Integer.valueOf(i));
                        } else if (b2 == 2) {
                            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("subSelected", Integer.valueOf(i));
                        }
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
                    } else {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.mPlayerEventListener.onFps(jSONObject.optInt("demux-fps", 0));
                        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("videoSelected", Integer.valueOf(i));
                    }
                } else {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this;
                    str2 = str;
                }
                i2 = i + 1;
                jSONArray = jSONArray2;
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, arrayList, 4));
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void event(int i) {
        Log.e("MPVPlayer", "event: " + i);
        if (this.mPlayerEventListener == null) {
            return;
        }
        Handler handler = this.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i != 7) {
            if (i == 8) {
                handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, 0));
                return;
            } else if (i != 11) {
                return;
            }
        }
        handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, 1));
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void eventProperty(String str) {
        Log.e("MPVPlayer", "eventProperty: " + str);
        if (this.mPlayerEventListener != null && "track-list".equals(str)) {
            Log.e("MPVPlayer", "eventProperty: " + MPVLib.getPropertyString("track-list"));
            getTrackInfo();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public int getBufferedPercentage() {
        Integer propertyInt = MPVLib.getPropertyInt("cache-percent");
        if (propertyInt != null) {
            return propertyInt.intValue();
        }
        return 0;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getCurrentPosition() {
        Double propertyDouble = MPVLib.getPropertyDouble("time-pos");
        if (propertyDouble != null) {
            return (long) (propertyDouble.doubleValue() * 1000.0d);
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getDuration() {
        Double propertyDouble = MPVLib.getPropertyDouble(TypedValues.TransitionType.S_DURATION);
        if (propertyDouble != null) {
            return (long) (propertyDouble.doubleValue() * 1000.0d);
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public float getSpeed() {
        Double propertyDouble = MPVLib.getPropertyDouble("speed");
        if (propertyDouble != null) {
            return propertyDouble.floatValue();
        }
        return 0.0f;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getTcpSpeed() {
        return PlayerUtils.getNetSpeed(this.f988O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public String getVideoBitrate() {
        Double propertyDouble = MPVLib.getPropertyDouble("video-bitrate");
        if (propertyDouble != null) {
            return String.format(Locale.getDefault(), "%.2f Mbps", Double.valueOf(propertyDouble.doubleValue() / 1000000.0d));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void initPlayer() {
        String str;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        MPVLib.create(this.f988O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        MPVLib.init();
        MPVLib.setOptionString("profile", "fast");
        MPVLib.setOptionString("vo", "gpu");
        MPVLib.setOptionString("gpu-api", "vulkan");
        MPVLib.setOptionString("gpu-context", "android");
        MPVLib.setOptionString("ao", "audiotrack,opensles");
        MPVLib.setOptionString("audio-set-media-role", "yes");
        MPVLib.setPropertyString("sub-auto", TtmlNode.COMBINE_ALL);
        int i = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 5) {
            MPVLib.setOptionString("hwdec", "auto-safe");
            MPVLib.setOptionString("hwdec-codecs", TtmlNode.COMBINE_ALL);
        } else if (i == 6) {
            MPVLib.setOptionString("hwdec", "no");
        }
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() == 0) {
            MPVLib.setOptionString("rtsp-transport", "tcp");
        } else {
            MPVLib.setOptionString("rtsp-transport", "udp");
        }
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o()) {
            MPVLib.setOptionString("deinterlace", "yes");
        }
        int i2 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f188O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        MPVLib.setPropertyString("demuxer-lavf-analyzeduration", String.valueOf(i2 == -1 ? O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1492O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 : i2));
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
        MPVLib.setOptionString("http-proxy", str);
        MPVLib.observeProperty("track-list", 0);
        MPVLib.observeProperty("cache-buffering-state", 4);
        MPVLib.observeProperty("width", 4);
        MPVLib.observeProperty("height", 4);
        MPVLib.observeProperty("audio-params/channel-count", 4);
        MPVLib.observeProperty("core-idle", 3);
        MPVLib.observeProperty("video", 3);
        MPVLib.observeProperty("eof-reached", 3);
        MPVLib.addObserver(this);
        MPVLib.addLogObserver(this);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean isAudio() {
        Boolean propertyBoolean = MPVLib.getPropertyBoolean("video");
        return (propertyBoolean == null || propertyBoolean.booleanValue()) ? false : true;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean isPlaying() {
        return !MPVLib.getPropertyBoolean("pause").booleanValue();
    }

    @Override // is.xyz.mpv.MPVLib.LogObserver
    public final void logMessage(String str, int i, String str2) {
        if (i == 20) {
            this.f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void pause() {
        MPVLib.setPropertyBoolean("pause", true);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void prepareAsync() {
        start();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void release() {
        MPVLib.detachSurface();
        MPVLib.destroy();
        MPVLib.removeObserver(this);
        MPVLib.removeLogObserver(this);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void reset() {
        stop();
        this.f990O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void seekTo(long j) {
        Log.e("MPVPlayer", "seekTo: " + j);
        MPVLib.command(new String[]{"seek", String.valueOf(((double) j) / 1000.0d), "absolute"});
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setDataSource(String str, Map map) {
        Log.e("MPVPlayer", "setDataSource: " + map);
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append("\r\n");
            }
            MPVLib.setPropertyString("http-header-fields", sb.toString());
        }
        MPVLib.command(new String[]{"loadfile", str, "replace"});
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            setSurface(surfaceHolder.getSurface());
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setLooping(boolean z) {
        MPVLib.setPropertyString("loop-file", z ? "inf" : "no");
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final boolean setScaleType(int i) {
        switch (i) {
            case 1:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "0.0");
                MPVLib.setPropertyString("video-aspect-override", "16:9");
                break;
            case 2:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "0.0");
                MPVLib.setPropertyString("video-aspect-override", "4:3");
                break;
            case 3:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "no");
                MPVLib.setPropertyString("panscan", SessionDescription.SUPPORTED_SDP_VERSION);
                MPVLib.setPropertyString("video-aspect-override", "-1");
                break;
            case 4:
                MPVLib.setPropertyString("video-unscaled", "yes");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "0.0");
                MPVLib.setPropertyString("video-aspect-override", "-1");
                break;
            case 5:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "1.0");
                MPVLib.setPropertyString("video-aspect-override", "-1");
                break;
            case 6:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "0.0");
                MPVLib.setPropertyString("video-aspect-override", "2.35:1");
                break;
            default:
                MPVLib.setPropertyString("video-unscaled", "no");
                MPVLib.setPropertyString("keepaspect", "yes");
                MPVLib.setPropertyString("panscan", "0.0");
                MPVLib.setPropertyString("video-aspect-override", "-1");
                break;
        }
        return true;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSpeed(float f) {
        MPVLib.setPropertyDouble("speed", f);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSurface(Surface surface) {
        if (surface != null) {
            MPVLib.attachSurface(surface);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setVolume(float f, float f2) {
        MPVLib.setPropertyInt("volume", (int) (((f + f2) / 2.0f) * 100.0f));
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void start() {
        MPVLib.setPropertyBoolean("pause", false);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void stop() {
        MPVLib.command(new String[]{"stop"});
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void eventProperty(String str, long j) {
        String str2;
        int i = 1;
        int i2 = 0;
        Log.e("MPVPlayer", "eventProperty: " + str + "LL" + j);
        if (this.mPlayerEventListener == null) {
        }
        str.getClass();
        Handler handler = this.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (str) {
            case "height":
            case "width":
                Integer propertyInt = MPVLib.getPropertyInt("height");
                Integer propertyInt2 = MPVLib.getPropertyInt("width");
                if (propertyInt != null && propertyInt2 != null && propertyInt.intValue() > 0 && propertyInt2.intValue() > 0) {
                    handler.post(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i, propertyInt2, propertyInt));
                    break;
                }
                break;
            case "cache-buffering-state":
                handler.post(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, j, i2));
                break;
            case "audio-params/channel-count":
                if (j == 1) {
                    str2 = "单声道";
                } else if (j == 2) {
                    str2 = "立体声";
                } else if (j == 3) {
                    str2 = "2.1 声道";
                } else if (j == 4) {
                    str2 = "4.0 四声道";
                } else if (j == 5) {
                    str2 = "5.0 环绕声";
                } else if (j == 6) {
                    str2 = "5.1环绕声";
                } else if (j == 7) {
                    str2 = "6.1环绕声";
                } else if (j == 8) {
                    str2 = "7.1环绕声";
                } else {
                    str2 = j >= 10 ? "三维菁彩声" : null;
                }
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, str2, 5));
                break;
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public final void setOptions() {
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void eventProperty(String str, boolean z) {
        Log.e("MPVPlayer", "eventProperty: " + str + "BB" + z);
        if (this.mPlayerEventListener == null) {
            return;
        }
        str.getClass();
        Handler handler = this.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (str.equals("core-idle")) {
            if (z) {
                return;
            }
            handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, 2));
        } else if (str.equals("eof-reached") && z) {
            handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, 3));
        }
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void eventProperty(String str, String str2) {
        Log.e("MPVPlayer", "eventProperty: " + str + "SS" + str2);
        if (this.mPlayerEventListener != null && "sub-text".equals(str)) {
            Handler handler = this.f989O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (str2 != null && !str2.isEmpty()) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str2.replaceAll("\\{\\\\.*?\\}", "").replaceAll("\\\\N", "\n"), 0));
            } else {
                handler.post(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(16));
            }
        }
    }

    @Override // is.xyz.mpv.MPVLib.EventObserver
    public final void eventProperty(String str, double d) {
        Log.e("MPVPlayer", "eventProperty: " + str + "DD" + d);
    }
}
