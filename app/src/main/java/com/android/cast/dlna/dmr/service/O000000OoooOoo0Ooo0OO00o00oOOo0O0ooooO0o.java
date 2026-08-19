package com.android.cast.dlna.dmr.service;

import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.avtransport.AVTransportException;
import org.fourthline.cling.support.avtransport.AbstractAVTransportService;
import org.fourthline.cling.support.model.DeviceCapabilities;
import org.fourthline.cling.support.model.MediaInfo;
import org.fourthline.cling.support.model.PositionInfo;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportInfo;
import org.fourthline.cling.support.model.TransportSettings;
import org.fourthline.cling.support.model.TransportState;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends AbstractAVTransportService {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO avTransportControl) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(avTransportControl, "avTransportControl");
        this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = avTransportControl;
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeDelegator
    public final UnsignedIntegerFourBytes[] getCurrentInstanceIds() {
        return new UnsignedIntegerFourBytes[]{new UnsignedIntegerFourBytes(0L)};
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final TransportAction[] getCurrentTransportActions(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        TransportState currentTransportState = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().getCurrentTransportState();
        int i = currentTransportState == null ? -1 : O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[currentTransportState.ordinal()];
        if (i != 1) {
            return i != 2 ? O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2795O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo : O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2797O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2796O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final DeviceCapabilities getDeviceCapabilities(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        return this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2803O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final MediaInfo getMediaInfo(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        return this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final PositionInfo getPositionInfo(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return new PositionInfo();
        }
        LivePlayActivity livePlayActivity = (LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        long j = 1000;
        String timeString = ModelUtil.toTimeString(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getDuration() / j);
        String timeString2 = ModelUtil.toTimeString(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getCurrentPosition() / j);
        return new PositionInfo(0L, timeString, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, timeString2, timeString2);
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final TransportInfo getTransportInfo(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        return this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final TransportSettings getTransportSettings(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        return this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2802O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void next(UnsignedIntegerFourBytes instanceId) throws AVTransportException {
        String str;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "next");
        String str2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2806O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (str2 != null && (str = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2807O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) != null) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2808O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2809O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str2, str);
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2806O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2807O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void pause(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "pause");
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pause();
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void play(UnsignedIntegerFourBytes instanceId, String str) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "play: speed=" + str);
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void previous(UnsignedIntegerFourBytes instanceId) throws AVTransportException {
        String str;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "previous");
        String str2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2808O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (str2 != null && (str = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2809O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) != null) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2806O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2804O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2807O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2805O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str2, str);
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2808O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2809O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void record(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void seek(UnsignedIntegerFourBytes instanceId, String str, String str2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, "seek: unit=" + str + ", target=" + str2);
        try {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
                ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.seekTo(ModelUtil.fromTimeString(str2) * ((long) 1000));
            }
        } catch (Exception e) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, "seek failed: " + e);
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void setAVTransportURI(UnsignedIntegerFourBytes instanceId, String currentURI, String str) throws AVTransportException {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(currentURI, "currentURI");
        this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(currentURI, str);
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void setNextAVTransportURI(UnsignedIntegerFourBytes instanceId, String nextURI, String str) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(nextURI, "nextURI");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        String strConcat = "setNextAVTransportURI: nextURI=".concat(nextURI);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, strConcat);
        if (str != null) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, "setNextAVTransportURI: nextURIMetaData=".concat(str));
        }
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(nextURI, str));
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2806O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = nextURI;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2807O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = str;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void setPlayMode(UnsignedIntegerFourBytes instanceId, String newPlayMode) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(newPlayMode, "newPlayMode");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "setPlayMode: newPlayMode=".concat(newPlayMode));
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void setRecordQualityMode(UnsignedIntegerFourBytes instanceId, String newRecordQualityMode) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(newRecordQualityMode, "newRecordQualityMode");
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public final void stop(UnsignedIntegerFourBytes instanceId) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2810O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2801O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "stop");
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2799O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            ((LivePlayActivity) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.release();
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2800O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new MediaInfo();
        new PositionInfo();
    }
}
