package com.lzy.okgo.request.base;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Serializable {
    private static final long serialVersionUID = -7174118653689916252L;
    protected String baseUrl;
    protected String cacheKey;
    protected O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO cacheMode;
    protected transient O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO cachePolicy;
    protected long cacheTime;
    protected transient O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o call;
    protected transient O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO callback;
    protected transient OkHttpClient client;
    protected transient O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO converter;
    protected transient Request mRequest;
    protected int retryCount;
    protected transient Object tag;
    protected transient O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o uploadInterceptor;
    protected String url;
    protected O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params = new O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
    protected O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO headers = new O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str) {
        this.url = str;
        this.baseUrl = str;
        O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String acceptLanguage = O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getAcceptLanguage();
        if (!TextUtils.isEmpty(acceptLanguage)) {
            headers(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_ACCEPT_LANGUAGE, acceptLanguage);
        }
        String userAgent = O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            headers("User-Agent", userAgent);
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        this.retryCount = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.cacheMode = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1603O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.cacheTime = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1604O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o adapt() {
        O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.call;
        return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null ? new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this) : o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 addUrlParams(String str, List<String> list) {
        this.params.putUrlParams(str, list);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 cacheKey(String str) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, "cacheKey == null");
        this.cacheKey = str;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 cacheMode(O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.cacheMode = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 cachePolicy(O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "cachePolicy == null");
        this.cachePolicy = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 cacheTime(long j) {
        if (j <= -1) {
            j = -1;
        }
        this.cacheTime = j;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 call(O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, "call == null");
        this.call = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 client(OkHttpClient okHttpClient) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(okHttpClient, "OkHttpClient == null");
        this.client = okHttpClient;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 converter(O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "converter == null");
        return this;
    }

    public Response execute() {
        return getRawCall().execute();
    }

    public abstract Request generateRequest(RequestBody requestBody);

    public abstract RequestBody generateRequestBody();

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getCacheMode() {
        return this.cacheMode;
    }

    public O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getCachePolicy() {
        return this.cachePolicy;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getConverter() {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(null, "converter == null, do you forget to call Request#converter(Converter<T>) ?");
        throw null;
    }

    public O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getFileParam(String str) {
        List<O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> list = this.params.fileParamsMap.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getHeaders() {
        return this.headers;
    }

    public abstract O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getMethod();

    public O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 getParams() {
        return this.params;
    }

    public Call getRawCall() {
        RequestBody requestBodyGenerateRequestBody = generateRequestBody();
        if (requestBodyGenerateRequestBody != null) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3775O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = requestBodyGenerateRequestBody;
            this.mRequest = generateRequest(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        } else {
            this.mRequest = generateRequest(null);
        }
        if (this.client == null) {
            O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "please call OkGo.getInstance().setOkHttpClient() first in application!");
            this.client = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        return this.client.newCall(this.mRequest);
    }

    public Request getRequest() {
        return this.mRequest;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public Object getTag() {
        return this.tag;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlParam(String str) {
        List<String> list = this.params.urlParamsMap.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 headers(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.headers.put(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.params.put(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 removeAllHeaders() {
        this.headers.clear();
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 removeAllParams() {
        this.params.clear();
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 removeHeader(String str) {
        this.headers.remove(str);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 removeParam(String str) {
        this.params.remove(str);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 retryCount(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("retryCount must > 0");
        }
        this.retryCount = i;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 tag(Object obj) {
        this.tag = obj;
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 uploadInterceptor(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        return this;
    }

    public void execute(O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "callback == null");
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) adapt();
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) ((O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) ((O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCacheKey() == null) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.cacheKey(O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getBaseUrl(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getParams().urlParamsMap));
        }
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCacheMode() == null) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.cacheMode(O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NO_CACHE);
        }
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCacheMode() == O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NO_CACHE) {
            ((O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        } else {
            int i = O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1608O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCacheKey();
            throw null;
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 headers(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(Map<String, String> map, boolean... zArr) {
        this.params.put(map, zArr);
        return this;
    }

    public <E> E adapt(O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (this.call == null) {
            int i = O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1605O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[getCacheMode().ordinal()];
            if (i == 1) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 0);
            } else if (i == 2) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 2);
            } else if (i == 3) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 3);
            } else if (i != 4) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i != 5 ? null : new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 4);
            } else {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 1);
            }
            if (getCachePolicy() != null) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = getCachePolicy();
            }
            O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "policy == null");
        }
        return (E) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, String str2, boolean... zArr) {
        this.params.put(str, str2, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, int i, boolean... zArr) {
        this.params.put(str, i, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, float f, boolean... zArr) {
        this.params.put(str, f, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, double d, boolean... zArr) {
        this.params.put(str, d, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, long j, boolean... zArr) {
        this.params.put(str, j, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, char c, boolean... zArr) {
        this.params.put(str, c, zArr);
        return this;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 params(String str, boolean z, boolean... zArr) {
        this.params.put(str, z, zArr);
        return this;
    }

    public <E> E adapt(O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (this.call == null) {
            int i = O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1605O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[getCacheMode().ordinal()];
            if (i == 1) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 0);
            } else if (i == 2) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 2);
            } else if (i == 3) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 3);
            } else if (i != 4) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i != 5 ? null : new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 4);
            } else {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 1);
            }
            if (getCachePolicy() != null) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = getCachePolicy();
            }
            O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "policy == null");
        }
        return (E) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public void setCallback(O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
    }
}
