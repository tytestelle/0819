package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    private static String b = "";
    private static byte[] c;
    private static String g;
    private Cipher d;
    private Cipher e;
    protected static final char[] a = "0123456789abcdef".toCharArray();
    private static h f = null;

    private h() throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        this.d = null;
        this.e = null;
        g = String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000);
        String string = "00000000";
        for (int i = 0; i < 12; i++) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(String.valueOf(new Random().nextInt(89999999) + 10000000));
            string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2.append(g);
        c = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2.toString().getBytes();
        this.d = Cipher.getInstance("RSA/ECB/NoPadding");
        this.d.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode((d() + e()).getBytes(), 0))));
        b = b(this.d.doFinal(c));
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(g.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        this.e = cipher;
        cipher.init(1, secretKeyGenerateSecret);
    }

    public static h a() {
        try {
            if (f == null) {
                f = new h();
            }
            return f;
        } catch (Exception e) {
            f = null;
            e.printStackTrace();
            return null;
        }
    }

    public static String c() {
        return g;
    }

    private String d() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDcEQ3TCNWPBqgIiY7WQ/IqTOTTV2w8aZ/GPm68FK0";
    }

    private String e() {
        return "fAJBemZKtYR3Li46VJ+Hwnor7ZpQnblGWPFaLv5JoPqvavgB0GInuhm+T+syPs1mw0uPLWaqwvZsCfoaIvUuxy5xHJgmWARrK4/9pHyDxRlZte0PCIoR1ko5B8lVVH1X1dQIDAQAB";
    }

    public String b() {
        return b;
    }

    public static String b(byte[] bArr) {
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

    public byte[] a(byte[] bArr) {
        return this.e.doFinal(bArr);
    }

    public byte[] c(byte[] bArr) {
        TbsLog.i("Post3DESEncryption", "DesDecrypt deskeys is " + g);
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(g.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            try {
                TbsLog.i("Post3DESEncryption", "DesDecrypt exception,  content is " + d(bArr));
            } catch (Throwable unused) {
            }
            TbsLog.i(e);
            return null;
        }
    }

    public String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            sb.append("0x");
            String hexString = Integer.toHexString(i2);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
            if (i != bArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(1, secretKeyGenerateSecret);
        return cipher.doFinal(bArr);
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
