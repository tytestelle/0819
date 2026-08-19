package O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Interceptor {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final Charset f1612O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public volatile O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NONE;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Level f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Logger f1615O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        this.f1615O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Logger.getLogger(str);
    }

    public static boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(MediaType mediaType) {
        if (mediaType == null) {
            return false;
        }
        if (mediaType.type() != null && mediaType.type().equals("text")) {
            return true;
        }
        String strSubtype = mediaType.subtype();
        if (strSubtype != null) {
            String lowerCase = strSubtype.toLowerCase();
            if (lowerCase.contains("x-www-form-urlencoded") || lowerCase.contains("json") || lowerCase.contains("xml") || lowerCase.contains("html")) {
                return true;
            }
        }
        return false;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Request request) {
        try {
            RequestBody requestBodyBody = request.newBuilder().build().body();
            if (requestBodyBody == null) {
                return;
            }
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            Charset charset = f1612O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            Charset charset2 = mediaTypeContentType != null ? mediaTypeContentType.charset(charset) : charset;
            if (charset2 != null) {
                charset = charset2;
            }
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tbody:" + buffer.readString(charset));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) {
        this.f1615O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.log(this.f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, str);
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        if (this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            throw new NullPointerException("printLevel == null. Use Level.NONE instead.");
        }
        this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        StringBuilder sb;
        Request request = chain.request();
        if (this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NONE) {
            return chain.proceed(request);
        }
        Connection connection = chain.connection();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.BODY;
        boolean z = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        boolean z2 = this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 || this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEADERS;
        RequestBody requestBodyBody = request.body();
        boolean z3 = requestBodyBody != null;
        try {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("--> " + request.method() + ' ' + request.url() + ' ' + (connection != null ? connection.protocol() : Protocol.HTTP_1_1));
            if (z2) {
                if (z3) {
                    if (requestBodyBody.contentType() != null) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tContent-Type: " + requestBodyBody.contentType());
                    }
                    if (requestBodyBody.contentLength() != -1) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tContent-Length: " + requestBodyBody.contentLength());
                    }
                }
                Headers headers = request.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strName = headers.name(i);
                    if (!"Content-Type".equalsIgnoreCase(strName) && !"Content-Length".equalsIgnoreCase(strName)) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\t" + strName + ": " + headers.value(i));
                    }
                }
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(" ");
                if (z && z3) {
                    if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(requestBodyBody.contentType())) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(request);
                    } else {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tbody: maybe [binary body], omitted!");
                    }
                }
            }
            sb = new StringBuilder("--> END ");
        } catch (Exception e) {
            e.printStackTrace();
            sb = new StringBuilder("--> END ");
        } finally {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("--> END " + request.method());
        }
        sb.append(request.method());
        String string = sb.toString();
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            Response responseBuild = responseProceed.newBuilder().build();
            ResponseBody responseBodyBody = responseBuild.body();
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.BODY;
            boolean z4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4;
            boolean z5 = this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 || this.f1613O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEADERS;
            try {
                try {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("<-- " + responseBuild.code() + ' ' + responseBuild.message() + ' ' + responseBuild.request().url() + " (" + millis + "ms）");
                    if (z5) {
                        Headers headers2 = responseBuild.headers();
                        int size2 = headers2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\t" + headers2.name(i2) + ": " + headers2.value(i2));
                        }
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(" ");
                        if (z4 && HttpHeaders.hasBody(responseBuild) && responseBodyBody != null) {
                            if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(responseBodyBody.contentType())) {
                                InputStream inputStreamByteStream = responseBodyBody.byteStream();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i3 = inputStreamByteStream.read(bArr);
                                    if (i3 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                }
                                byteArrayOutputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                MediaType mediaTypeContentType = responseBodyBody.contentType();
                                Charset charset = f1612O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                Charset charset2 = mediaTypeContentType != null ? mediaTypeContentType.charset(charset) : charset;
                                if (charset2 != null) {
                                    charset = charset2;
                                }
                                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tbody:" + new String(byteArray, charset));
                                responseProceed = responseProceed.newBuilder().body(ResponseBody.create(responseBodyBody.contentType(), byteArray)).build();
                            } else {
                                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("\tbody: maybe [binary body], omitted!");
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return responseProceed;
            } finally {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("<-- END HTTP");
            }
        } catch (Exception e3) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("<-- HTTP FAILED: " + e3);
            throw e3;
        }
    }
}
