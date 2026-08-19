package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import javax.net.ssl.SSLEngineResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int[] f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final /* synthetic */ int[] f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        int[] iArr = new int[SSLEngineResult.Status.values().length];
        f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iArr;
        try {
            iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[SSLEngineResult.Status.OK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
        f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iArr2;
        try {
            iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
