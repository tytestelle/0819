package androidx.media3.decoder;

import android.media.AudioRouting;
import android.media.MediaCodec;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static /* bridge */ /* synthetic */ AudioRouting.OnRoutingChangedListener O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj) {
        return (AudioRouting.OnRoutingChangedListener) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* bridge */ /* synthetic */ Stream O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Object obj) {
        return (Stream) obj;
    }

    public static /* synthetic */ void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
    }
}
