package fi.iki.elonen;

import com.google.common.collect.O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3949O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final OutputStream f3950O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final BufferedInputStream f3951O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public String f3954O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public HashMap f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public HashMap f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo f3958O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public String f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final String f3960O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public String f3961O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final /* synthetic */ O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f3962O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f3962O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f3949O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f3951O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new BufferedInputStream(inputStream, 8192);
        this.f3950O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = outputStream;
        this.f3960O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new HashMap();
    }

    public static int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    public static int[] O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(ByteBuffer byteBuffer, byte[] bArr) {
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + 4096;
        byte[] bArr2 = new byte[length];
        int iRemaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
        byteBuffer.get(bArr2, 0, iRemaining);
        int length2 = iRemaining - bArr.length;
        int i = 0;
        do {
            for (int i2 = 0; i2 < length2; i2++) {
                for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                    if (i3 == bArr.length - 1) {
                        int[] iArr2 = new int[iArr.length + 1];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i + i2;
                        iArr = iArr2;
                    }
                }
            }
            i += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(63);
            if (iIndexOf >= 0) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(strNextToken.substring(iIndexOf + 1), map2);
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strNextToken.substring(0, iIndexOf));
            } else {
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.f3961O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = stringTokenizer.nextToken();
            } else {
                this.f3961O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = "HTTP/1.1";
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                }
                line2 = bufferedReader.readLine();
            }
            map.put("uri", strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        } catch (IOException e) {
            throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        String strGroup;
        String str = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3944O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        try {
            int[] iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(byteBuffer, str.getBytes());
            int i = 2;
            try {
                if (iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.length < 2) {
                    throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i2 = 1024;
                byte[] bArr = new byte[1024];
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.length - 1) {
                    byteBuffer.position(iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i4]);
                    int iRemaining = byteBuffer.remaining() < i2 ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i3, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i3, iRemaining), Charset.forName(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(str)) {
                        throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String line2 = bufferedReader.readLine();
                    String str2 = null;
                    String strTrim = null;
                    int i6 = i5;
                    int i7 = 2;
                    String strGroup2 = null;
                    while (line2 != null && line2.trim().length() > 0) {
                        Matcher matcher = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3978O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3980O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.matcher(matcher.group(i));
                            while (matcher2.find()) {
                                String strGroup3 = matcher2.group(1);
                                if ("name".equalsIgnoreCase(strGroup3)) {
                                    strGroup = matcher2.group(2);
                                } else if (TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME.equalsIgnoreCase(strGroup3)) {
                                    strGroup2 = matcher2.group(2);
                                    if (!strGroup2.isEmpty()) {
                                        if (i6 > 0) {
                                            strGroup = str2 + String.valueOf(i6);
                                            i6++;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                str2 = strGroup;
                            }
                        }
                        Matcher matcher3 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3979O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.matcher(line2);
                        if (matcher3.matches()) {
                            strTrim = matcher3.group(2).trim();
                        }
                        line2 = bufferedReader.readLine();
                        i7++;
                        i = 2;
                    }
                    int i8 = 0;
                    while (true) {
                        int i9 = i7 - 1;
                        if (i7 <= 0) {
                            break;
                        }
                        while (bArr[i8] != 10) {
                            i8++;
                        }
                        i8++;
                        i7 = i9;
                    }
                    if (i8 >= iRemaining - 4) {
                        throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i4] + i8;
                    i4++;
                    int i11 = iArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i4] - 4;
                    byteBuffer.position(i10);
                    List arrayList = (List) map.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(str2, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()));
                    } else {
                        String strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(byteBuffer, i10, i11 - i10);
                        if (map2.containsKey(str2)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(str2 + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(str2 + i12, strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        } else {
                            map2.put(str2, strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        }
                        arrayList.add(strGroup2);
                    }
                    i5 = i6;
                    i2 = 1024;
                    i = 2;
                    i3 = 0;
                }
            } catch (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O e) {
                throw e;
            } catch (Exception e2) {
                e = e2;
                throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, e.toString());
            }
        } catch (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, HashMap map) {
        String strTrim;
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (str == null) {
            this.f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = "";
            return;
        }
        this.f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                strTrim = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strNextToken.substring(0, iIndexOf)).trim();
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strNextToken.substring(iIndexOf + 1));
            } else {
                strTrim = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strNextToken).trim();
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "";
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3962O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3949O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        OutputStream outputStream = this.f3950O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = null;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
                        this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
                        BufferedInputStream bufferedInputStream = this.f3951O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        bufferedInputStream.mark(8192);
                        try {
                            int i = bufferedInputStream.read(bArr, 0, 8192);
                            if (i == -1) {
                                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bufferedInputStream);
                                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + i;
                                this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2;
                                int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bArr, i2);
                                this.f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > 0) {
                                    break;
                                }
                                int i3 = this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                i = bufferedInputStream.read(bArr, i3, 8192 - i3);
                            }
                            if (this.f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo < this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                            }
                            this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new HashMap();
                            HashMap map = this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                            if (map == null) {
                                this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)));
                            HashMap map2 = new HashMap();
                            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(bufferedReader, map2, this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                            String str = this.f3960O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            if (str != null) {
                                this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.put("remote-addr", str);
                                this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.put("http-client-ip", str);
                            }
                            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOLookup = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lookup((String) map2.get("method"));
                            this.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOLookup;
                            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOLookup == null) {
                                throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get("method")) + " unhandled.");
                            }
                            this.f3954O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (String) map2.get("uri");
                            this.f3958O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo(this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                            String str2 = (String) this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get("connection");
                            boolean z2 = "HTTP/1.1".equals(this.f3961O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) && (str2 == null || !str2.matches("(?i).*close.*"));
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this);
                            String str3 = (String) this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get("accept-encoding");
                            this.f3958O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                            if (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2) && str3 != null && str3.contains("gzip")) {
                                z = true;
                            }
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(z);
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(z2);
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                            if (!z2 || O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bufferedInputStream);
                            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (SocketTimeoutException e2) {
                        throw e2;
                    } catch (IOException e3) {
                        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage()).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                    }
                } catch (SocketException e4) {
                    throw e4;
                } catch (SSLException e5) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e5.getMessage()).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                }
            } catch (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O e6) {
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e6.getStatus(), "text/plain", e6.getMessage()).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
            }
        } catch (Throwable th) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(null);
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            throw th;
        }
    }

    public final HashMap O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        HashMap map = new HashMap();
        for (String str : this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.keySet()) {
            map.put(str, ((List) this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(str)).get(0));
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(HashMap map) {
        long j;
        DataOutput randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = 0;
        try {
            if (this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.containsKey("content-length")) {
                j = Long.parseLong((String) this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get("content-length"));
            } else {
                int i = this.f3952O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                int i2 = this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                j = i < i2 ? i2 - i : 0L;
            }
            if (j < 1024) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                randomAccessFile = new DataOutputStream(byteArrayOutputStream);
            } else {
                try {
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3949O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((File) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).add(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    randomAccessFile = new RandomAccessFile(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3947O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getAbsolutePath(), "rw");
                    byteArrayOutputStream = null;
                    randomAccessFile2 = randomAccessFile;
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
            byte[] bArr = new byte[512];
            while (this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 >= 0 && j > 0) {
                int i3 = this.f3951O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.read(bArr, 0, (int) Math.min(j, 512L));
                this.f3953O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i3;
                j -= (long) i3;
                if (i3 > 0) {
                    randomAccessFile.write(bArr, 0, i3);
                }
            }
            if (byteArrayOutputStream != null) {
                map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            } else {
                map2 = randomAccessFile2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile2.length());
                randomAccessFile2.seek(0L);
            }
            if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.POST.equals(this.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((String) this.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get("content-type"));
                String str = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3942O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!"multipart/form-data".equalsIgnoreCase(str)) {
                    byte[] bArr2 = new byte[map2.remaining()];
                    map2.get(bArr2);
                    String strTrim = new String(bArr2, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).trim();
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(str)) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(strTrim, this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    } else if (strTrim.length() != 0) {
                        map.put("postData", strTrim);
                    }
                } else {
                    if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3944O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                        throw new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                    }
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, map2, this.f3956O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, map);
                }
            } else if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.PUT.equals(this.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
                map.put("content", O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(map2, 0, map2.limit()));
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(randomAccessFile2);
        } catch (Throwable th) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(null);
            throw th;
        }
    }

    public final String O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(ByteBuffer byteBuffer, int i, int i2) throws Throwable {
        if (i2 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3949O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((File) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).add(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                File file = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3947O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath());
                try {
                    FileChannel channel = fileOutputStream2.getChannel();
                    byteBufferDuplicate.position(i).limit(i + i2);
                    channel.write(byteBufferDuplicate.slice());
                    String absolutePath = file.getAbsolutePath();
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(fileOutputStream2);
                    return absolutePath;
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
