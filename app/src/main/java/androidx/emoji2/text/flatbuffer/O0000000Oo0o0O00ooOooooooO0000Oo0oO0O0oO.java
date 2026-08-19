package androidx.emoji2.text.flatbuffer;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static /* synthetic */ NotificationChannel O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() {
    }
}
