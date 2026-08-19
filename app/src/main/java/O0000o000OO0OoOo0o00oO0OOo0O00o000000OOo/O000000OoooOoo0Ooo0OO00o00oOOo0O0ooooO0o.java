package O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;

/* JADX INFO: loaded from: classes2.dex */
public enum O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    GET("GET"),
    POST(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST),
    PUT("PUT"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");

    private final String value;

    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) {
        this.value = str;
    }

    public boolean hasBody() {
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1618O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
