package O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;

/* JADX INFO: loaded from: classes.dex */
public enum O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    KEY_128((byte) 1, 16),
    KEY_256((byte) 2, 32);

    public final byte cipherId;
    public final int keyLength;
    public final int ivLength = 12;
    public final int tagLength = 16;

    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte b, int i) {
        this.cipherId = b;
        this.keyLength = i;
    }
}
