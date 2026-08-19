package com.tencent.smtt.sdk;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.util.Pair;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.UrlRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class UrlRequestBuilderImpl extends UrlRequest.Builder {
    private static final String a = "UrlRequestBuilderImpl";
    private final String b;
    private final UrlRequest.Callback c;
    private final Executor d;
    private String e;
    private boolean g;
    private String i;
    private byte[] j;
    private String k;
    private String l;
    private final ArrayList<Pair<String, String>> f = new ArrayList<>();
    private int h = 3;

    public UrlRequestBuilderImpl(String str, UrlRequest.Callback callback, Executor executor) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        }
        if (callback == null) {
            throw new NullPointerException("Callback is required.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor is required.");
        }
        this.b = str;
        this.c = callback;
        this.d = executor;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest build() {
        UrlRequestBuilderImpl urlRequestBuilderImpl;
        int i;
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            return null;
        }
        DexLoader dexLoaderB = uVarA.c().b();
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Boolean.TYPE;
        UrlRequest urlRequest = (UrlRequest) dexLoaderB.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class, byte[].class, String.class, String.class}, this.b, Integer.valueOf(this.h), this.c, this.d, Boolean.valueOf(this.g), this.e, this.f, this.i, this.j, this.k, this.l);
        if (urlRequest == null) {
            urlRequestBuilderImpl = this;
            i = 7;
            urlRequest = (UrlRequest) dexLoaderB.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class}, urlRequestBuilderImpl.b, Integer.valueOf(urlRequestBuilderImpl.h), urlRequestBuilderImpl.c, urlRequestBuilderImpl.d, Boolean.valueOf(urlRequestBuilderImpl.g), urlRequestBuilderImpl.e, urlRequestBuilderImpl.f, urlRequestBuilderImpl.i);
        } else {
            urlRequestBuilderImpl = this;
            i = 7;
        }
        if (urlRequest == null) {
            Class<?>[] clsArr = new Class[i];
            clsArr[0] = String.class;
            clsArr[1] = cls;
            clsArr[2] = UrlRequest.Callback.class;
            clsArr[3] = Executor.class;
            clsArr[4] = cls2;
            clsArr[5] = String.class;
            clsArr[6] = ArrayList.class;
            urlRequest = (UrlRequest) dexLoaderB.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", clsArr, urlRequestBuilderImpl.b, Integer.valueOf(urlRequestBuilderImpl.h), urlRequestBuilderImpl.c, urlRequestBuilderImpl.d, Boolean.valueOf(urlRequestBuilderImpl.g), urlRequestBuilderImpl.e, urlRequestBuilderImpl.f);
        }
        if (urlRequest == null) {
            urlRequest = (UrlRequest) dexLoaderB.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "UrlRequest_getX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class, byte[].class, String.class, String.class}, urlRequestBuilderImpl.b, Integer.valueOf(urlRequestBuilderImpl.h), urlRequestBuilderImpl.c, urlRequestBuilderImpl.d, Boolean.valueOf(urlRequestBuilderImpl.g), urlRequestBuilderImpl.e, urlRequestBuilderImpl.f, urlRequestBuilderImpl.i, urlRequestBuilderImpl.j, urlRequestBuilderImpl.k, urlRequestBuilderImpl.l);
        }
        if (urlRequest != null) {
            return urlRequest;
        }
        throw new NullPointerException("UrlRequest build fail");
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setHttpMethod(String str) {
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.e = str;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBody(String str) {
        if (str == null) {
            throw new NullPointerException("Body is required.");
        }
        this.i = str;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBodyBytes(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Body is required.");
        }
        this.j = bArr;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl addHeader(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        }
        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_ACCEPT_ENCODING.equalsIgnoreCase(str)) {
            return this;
        }
        this.f.add(Pair.create(str, str2));
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl disableCache() {
        this.g = true;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl setDns(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("host and address are required.");
        }
        this.k = str;
        this.l = str2;
        try {
            u uVarA = u.a();
            if (uVarA != null && uVarA.b()) {
                uVarA.c().b().invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "setDns", new Class[]{String.class, String.class}, this.k, this.l);
            }
        } catch (Exception unused) {
        }
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl setPriority(int i) {
        this.h = i;
        return this;
    }
}
