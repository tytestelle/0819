package com.tencent.smtt.utils;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static i b;
    private String c;
    private String d;
    private String e;

    private i() {
        int iNextInt = new Random().nextInt(89999999) + 10000000;
        int iNextInt2 = new Random().nextInt(89999999) + 10000000;
        this.e = String.valueOf(iNextInt);
        this.c = this.e + String.valueOf(iNextInt2);
    }

    public static synchronized i a() {
        try {
            if (b == null) {
                b = new i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    private String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public String c() throws InvalidKeyException {
        Cipher cipher;
        if (this.d == null) {
            byte[] bytes = this.c.getBytes();
            try {
                try {
                    cipher = Cipher.getInstance("RSA/ECB/NoPadding");
                } catch (Exception unused) {
                    b();
                    cipher = Cipher.getInstance("RSA/ECB/NoPadding");
                }
            } catch (Exception e) {
                e.printStackTrace();
                cipher = null;
            }
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0))));
            this.d = b(cipher.doFinal(bytes));
        }
        return this.d;
    }

    public byte[] a(byte[] bArr) {
        return com.tencent.smtt.sdk.stat.a.a(this.e.getBytes(), bArr, 1);
    }

    public void b() {
        Security.addProvider((Provider) Class.forName("com.android.org.bouncycastle.jce.provider.BouncyCastleProvider", true, ClassLoader.getSystemClassLoader()).newInstance());
    }
}
