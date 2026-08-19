package com.android.cast.dlna.dmr.service;

import android.content.Context;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.net.URI;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.support.avtransport.AVTransportException;
import org.fourthline.cling.support.model.DeviceCapabilities;
import org.fourthline.cling.support.model.MediaInfo;
import org.fourthline.cling.support.model.PositionInfo;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportInfo;
import org.fourthline.cling.support.model.TransportSettings;
import org.fourthline.cling.support.model.TransportStatus;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public static final TransportAction[] f2795O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static final TransportAction[] f2796O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public static final TransportAction[] f2797O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f2798O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public MediaInfo f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final TransportSettings f2802O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final DeviceCapabilities f2803O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public String f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public String f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public String f2806O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public String f2807O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public String f2808O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public String f2809O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    static {
        TransportAction transportAction = TransportAction.Play;
        f2795O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new TransportAction[]{transportAction};
        TransportAction transportAction2 = TransportAction.Stop;
        TransportAction transportAction3 = TransportAction.Seek;
        f2796O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new TransportAction[]{transportAction2, TransportAction.Pause, transportAction3};
        f2797O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new TransportAction[]{transportAction, transportAction3, transportAction2};
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context) {
        this.f2798O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
        new PositionInfo();
        this.f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new MediaInfo();
        this.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("AVTransportController", 0);
        this.f2802O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new TransportSettings();
        this.f2803O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new DeviceCapabilities(new StorageMedium[]{StorageMedium.UNKNOWN});
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    public final TransportInfo O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int currentPlayState;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return new TransportInfo();
        }
        VideoView videoView = ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (videoView == null || (currentPlayState = videoView.getCurrentPlayState()) == -1 || currentPlayState == 0) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.IDLE;
        } else if (currentPlayState == 1) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.PREPARING;
        } else if (currentPlayState == 3) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.PLAYING;
        } else if (currentPlayState == 4) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.PAUSED;
        } else if (currentPlayState != 6) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.STOPPED;
        } else {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.PREPARING;
        }
        return new TransportInfo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.toTransportState(), TransportStatus.OK, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String currentURI, String str) throws AVTransportException {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(currentURI, "currentURI");
        String strConcat = "setAVTransportURI: currentURI=".concat(currentURI);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, strConcat);
        if (str != null) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "setAVTransportURI: currentURIMetaData=".concat(str));
        }
        try {
            new URI(currentURI);
            O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f2812O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.invoke(currentURI, str);
            } else {
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(currentURI, str));
            }
            this.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = currentURI;
            this.f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = str;
        } catch (Exception unused) {
            throw new AVTransportException(ErrorCode.INVALID_ARGS, "CurrentURI can not be null or malformed");
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            this.f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new MediaInfo(this.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, this.f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            new PositionInfo(0L, this.f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        } else {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = this.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 != null) {
                ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.release();
            }
            this.f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new MediaInfo();
            new PositionInfo();
        }
        this.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
