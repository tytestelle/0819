package androidx.media3.exoplayer;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ AudioFocusManager f2318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(AudioFocusManager audioFocusManager) {
        this.f2318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f2318O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.handlePlatformAudioFocusChange(i);
    }
}
