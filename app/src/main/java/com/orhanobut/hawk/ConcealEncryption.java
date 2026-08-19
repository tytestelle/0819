package com.orhanobut.hawk;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import android.content.Context;
import android.util.Base64;
import com.facebook.crypto.cipher.NativeGCMCipher;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ConcealEncryption implements Encryption {
    private final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO crypto;

    public ConcealEncryption(Context context) {
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.KEY_256;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        synchronized (O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
            try {
                if (O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                    O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0);
                }
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.crypto = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // com.orhanobut.hawk.Encryption
    public String decrypt(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f847O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = bytes;
        byte[] bArrDecode = Base64.decode(str2, 2);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.crypto;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        int length = bArrDecode.length;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f844O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        byte b = (byte) byteArrayInputStream.read();
        byte b2 = (byte) byteArrayInputStream.read();
        boolean z = b == 1;
        String strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(b, "Unexpected crypto version ");
        if (!z) {
            throw new IOException(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        boolean z2 = b2 == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.cipherId;
        String strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(b2, "Unexpected cipher ID ");
        if (!z2) {
            throw new IOException(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1);
        }
        byte[] bArr = new byte[o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.ivLength];
        new DataInputStream(byteArrayInputStream).readFully(bArr);
        NativeGCMCipher nativeGCMCipher = new NativeGCMCipher((O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        nativeGCMCipher.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O00000OOoOOO00O00o0ooooooooO000ooooO0000(), bArr);
        byte[] bArr2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f847O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new byte[]{b}, 1);
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new byte[]{b2}, 1);
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(bArr2, bArr2.length);
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byteArrayInputStream, nativeGCMCipher, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.tagLength);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(length - ((o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.ivLength + 2) + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.tagLength));
        byte[] bArr3 = new byte[1024];
        while (true) {
            int i = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.read(bArr3, 0, 1024);
            if (i == -1) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.close();
                return new String(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.write(bArr3, 0, i);
        }
    }

    @Override // com.orhanobut.hawk.Encryption
    public String encrypt(String str, String str2) throws IOException {
        byte[] bytes = str.getBytes(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f847O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = bytes;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.crypto;
        byte[] bytes2 = str2.getBytes();
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        int length = bytes2.length;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f844O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.ivLength + 2 + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.tagLength + length);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.write(1);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.write(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.cipherId);
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        byte[] bArr = new byte[o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f838O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ivLength];
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f840O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.nextBytes(bArr);
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0("IV", ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).ivLength, bArr);
        NativeGCMCipher nativeGCMCipher = new NativeGCMCipher((O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        nativeGCMCipher.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(), bArr);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.write(bArr);
        byte b = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.cipherId;
        byte[] bArr2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f847O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new byte[]{1}, 1);
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new byte[]{b}, 1);
        nativeGCMCipher.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(bArr2, bArr2.length);
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = new O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2, nativeGCMCipher, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.tagLength);
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.write(bytes2, 0, bytes2.length);
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.close();
        return Base64.encodeToString(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), 2);
    }

    @Override // com.orhanobut.hawk.Encryption
    public boolean init() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.crypto;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        try {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f843O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
