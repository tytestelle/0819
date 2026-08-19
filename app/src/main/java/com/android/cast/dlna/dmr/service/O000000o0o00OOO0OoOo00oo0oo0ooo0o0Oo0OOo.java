package com.android.cast.dlna.dmr.service;

import android.media.AudioManager;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.model.types.UnsignedIntegerTwoBytes;
import org.fourthline.cling.support.model.Channel;
import org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends AbstractAudioRenderingControl {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 audioControl) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(audioControl, "audioControl");
        this.f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = audioControl;
    }

    @Override // org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl
    public final Channel[] getCurrentChannels() {
        return new Channel[]{Channel.Master};
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeDelegator
    public final UnsignedIntegerFourBytes[] getCurrentInstanceIds() {
        return new UnsignedIntegerFourBytes[]{new UnsignedIntegerFourBytes(0L)};
    }

    @Override // org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl
    public final boolean getMute(UnsignedIntegerFourBytes instanceId, String channelName) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, "channelName");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
        AudioManager audioManager = (AudioManager) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Long value = new UnsignedIntegerTwoBytes((((long) audioManager.getStreamVolume(3)) * 100) / ((long) audioManager.getStreamMaxVolume(3))).getValue();
        return value != null && value.longValue() == 0;
    }

    @Override // org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl
    public final UnsignedIntegerTwoBytes getVolume(UnsignedIntegerFourBytes instanceId, String channelName) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, "channelName");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
        AudioManager audioManager = (AudioManager) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return new UnsignedIntegerTwoBytes((((long) audioManager.getStreamVolume(3)) * 100) / ((long) audioManager.getStreamMaxVolume(3)));
    }

    @Override // org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl
    public final void setMute(UnsignedIntegerFourBytes instanceId, String channelName, boolean z) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, "channelName");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "setMute: " + z);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, (UnsignedIntegerTwoBytes) (z ? o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
    }

    @Override // org.fourthline.cling.support.renderingcontrol.AbstractAudioRenderingControl
    public final void setVolume(UnsignedIntegerFourBytes instanceId, String channelName, UnsignedIntegerTwoBytes desiredVolume) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instanceId, "instanceId");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, "channelName");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(desiredVolume, "desiredVolume");
        this.f2811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, desiredVolume);
    }
}
