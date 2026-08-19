package androidx.media3.exoplayer.mediacodec;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    static {
        MediaCodecAdapter.Factory factory = MediaCodecAdapter.Factory.DEFAULT;
    }

    public static MediaCodecAdapter.Factory O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context) {
        return new DefaultMediaCodecAdapterFactory(context);
    }
}
