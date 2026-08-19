package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
import android.os.Handler;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.quickjs.JSArray;
import java.util.HashMap;
import java.util.List;
import okhttp3.WebSocket;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 implements com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, Consumer, DefaultTrackSelector.TrackInfo.Factory, O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(Object obj, int i, Object obj2, Object obj3) {
        this.f1516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    @Override // com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JSArray jSArray) {
        O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(((O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        sb.append("-");
        boolean z = false;
        sb.append(jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0));
        String string = sb.toString();
        final String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(1);
        int iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = jSArray.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(2);
        if (jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() > 3 && jSArray.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(3)) {
            z = true;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1537O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (((HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).containsKey(string)) {
            throw new RuntimeException("Error: The task name is existed");
        }
        Handler handler = (Handler) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        HashMap map = (HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        final WebSocket webSocket = (WebSocket) this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (z) {
            final int i = 0;
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, new Runnable() { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            webSocket.send(ByteString.decodeHex(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.toLowerCase()));
                            break;
                        default:
                            webSocket.send(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                            break;
                    }
                }
            }, iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
            map.put(string, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
            handler.post(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
            return;
        }
        final int i2 = 1;
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, new Runnable() { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        webSocket.send(ByteString.decodeHex(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.toLowerCase()));
                        break;
                    default:
                        webSocket.send(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                        break;
                }
            }
        }, iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        map.put(string, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2);
        handler.post(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2);
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.f1516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                HlsInterstitialsAdsLoader.lambda$handleContentTimelineChanged$1((AdsMediaSource) this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Timeline) this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 2:
                ((HlsInterstitialsAdsLoader.Listener) obj).onStart((MediaItem) this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (AdViewProvider) this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((MediaSourceEventListener.EventDispatcher) this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$upstreamDiscarded$4((MediaSource.MediaPeriodId) this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (MediaLoadData) this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaSourceEventListener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (String) this.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (String) this.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, i, trackGroup, iArr);
    }
}
