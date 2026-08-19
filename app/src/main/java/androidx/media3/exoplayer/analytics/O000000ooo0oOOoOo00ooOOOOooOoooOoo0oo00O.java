package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements ListenerSet.Event, Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f2451O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2452O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ IOException f2453O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ boolean f2454O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f2455O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f2455O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
        this.f2451O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = loadEventInfo;
        this.f2452O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = mediaLoadData;
        this.f2453O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iOException;
        this.f2454O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f2455O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).lambda$loadError$3(this.f2451O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f2452O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2453O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2454O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f2455O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2451O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f2452O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2453O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2454O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }
}
