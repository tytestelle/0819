package com.facebook.crypto.cipher;

import O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes.dex */
@O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
public class NativeGCMCipher {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.UNINITIALIZED;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    private long mCtxPtr;

    public NativeGCMCipher(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.f2936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    private native int nativeDecryptFinal(byte[] bArr, int i);

    private native int nativeDecryptInit(byte[] bArr, byte[] bArr2);

    private native int nativeDestroy();

    private native int nativeEncryptFinal(byte[] bArr, int i);

    private native int nativeEncryptInit(byte[] bArr, byte[] bArr2);

    private static native int nativeFailure();

    private native int nativeGetCipherBlockSize();

    private native int nativeUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    private native int nativeUpdateAad(byte[] bArr, int i);

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(byte[] bArr, int i) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.DECRYPT_INITIALIZED, "Cipher has not been initialized");
        this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.DECRYPT_FINALIZED;
        if (nativeDecryptFinal(bArr, i) == nativeFailure()) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("The message could not be decrypted successfully.It has either been tampered with or the wrong resource is being decrypted.");
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte[] bArr, byte[] bArr2) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.UNINITIALIZED, "Cipher has already been initialized");
        this.f2936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (nativeDecryptInit(bArr, bArr2) == nativeFailure()) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("decryptInit");
        }
        this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.DECRYPT_INITIALIZED;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.DECRYPT_FINALIZED || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ENCRYPT_FINALIZED, "Cipher has not been finalized");
        if (nativeDestroy() == nativeFailure()) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("destroy");
        }
        this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.UNINITIALIZED;
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byte[] bArr, int i) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ENCRYPT_INITIALIZED, "Cipher has not been initialized");
        this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ENCRYPT_FINALIZED;
        if (nativeEncryptFinal(bArr, i) == nativeFailure()) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "encryptFinal: "));
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(byte[] bArr, byte[] bArr2) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.UNINITIALIZED, "Cipher has already been initialized");
        this.f2936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (nativeEncryptInit(bArr, bArr2) == nativeFailure()) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("encryptInit");
        }
        this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ENCRYPT_INITIALIZED;
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f2935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.DECRYPT_INITIALIZED || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ENCRYPT_INITIALIZED, "Cipher has not been initialized");
    }

    public final int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        return nativeGetCipherBlockSize();
    }

    public final int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        int iNativeUpdate = nativeUpdate(bArr, i, i2, bArr2, i3);
        if (iNativeUpdate >= 0) {
            return iNativeUpdate;
        }
        StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "update: Offset = ", "; DataLen = ", "; Result = ");
        sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(iNativeUpdate);
        throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(byte[] bArr, int i) throws O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        if (nativeUpdateAad(bArr, i) < 0) {
            throw new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "updateAAd: DataLen = "));
        }
    }
}
