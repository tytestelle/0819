package O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f2123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        stringWriter.toString();
    }

    public static byte[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Inputstream was null");
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append(System.getProperty("line.separator"));
        }
        return sb.length() > 0 ? sb.toString() : "";
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(OutputStream outputStream, byte[] bArr) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
