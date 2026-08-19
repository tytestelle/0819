package com.quickjs;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.tencent.smtt.sdk.TbsVideoCacheTask;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ long f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.f3794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventTime;
        this.f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj;
        this.f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onRenderedFirstFrame((AnalyticsListener.EventTime) this.f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public Object run() {
        switch (this.f3794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return Boolean.valueOf(((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._contains(this.f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (JSObject) this.f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME));
            default:
                return ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._getKeys(this.f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (JSObject) this.f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
    }

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, long j, JSObject jSObject, int i) {
        this.f3794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3795O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f3796O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        this.f3797O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = jSObject;
    }
}
