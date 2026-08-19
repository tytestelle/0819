package io.antmedia.rtmp_client;

import O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class RtmpClient {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public long f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativeRead(byte[] bArr, int i, int i2, long j);

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        nativeClose(this.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0L;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) throws O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        long jNativeAlloc = nativeAlloc();
        this.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jNativeAlloc;
        if (jNativeAlloc == 0) {
            throw new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(-2);
        }
        int iNativeOpen = nativeOpen(str, false, jNativeAlloc, 10000, 10000);
        if (iNativeOpen == 0) {
            return;
        }
        this.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0L;
        throw new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iNativeOpen);
    }

    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(byte[] bArr, int i, int i2) throws O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        int iNativeRead = nativeRead(bArr, i, i2, this.f3986O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (iNativeRead >= 0 || iNativeRead == -1) {
            return iNativeRead;
        }
        throw new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iNativeRead);
    }
}
