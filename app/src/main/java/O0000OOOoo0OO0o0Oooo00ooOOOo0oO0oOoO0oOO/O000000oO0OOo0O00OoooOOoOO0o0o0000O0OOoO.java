package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import xyz.doikki.videoplayer.player.AbstractPlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f985O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ long f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, long j, int i) {
        this.f985O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f985O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                long j = this.f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.mPlayerEventListener.onInfo(j == 100 ? 702 : 701, (int) j);
                break;
            case 1:
                AbstractPlayer abstractPlayer = (AbstractPlayer) this.f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                abstractPlayer.seekTo(this.f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                abstractPlayer.start();
                break;
            case 2:
                ((AudioRendererEventListener.EventDispatcher) this.f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$positionAdvancing$3(this.f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((PreloadMediaSource) this.f987O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$preload$0(this.f986O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
