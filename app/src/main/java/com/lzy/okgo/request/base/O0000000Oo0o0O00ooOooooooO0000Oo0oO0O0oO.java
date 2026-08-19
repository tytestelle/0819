package com.lzy.okgo.request.base;

import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    private static final long serialVersionUID = 1200621102761691196L;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public RequestBody generateRequestBody() {
        return null;
    }

    public Request.Builder generateRequestBuilder(RequestBody requestBody) {
        this.url = O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.baseUrl, this.params.urlParamsMap);
        Request.Builder builder = new Request.Builder();
        O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.headers;
        if (!o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.headersMap.isEmpty()) {
            Headers.Builder builder2 = new Headers.Builder();
            try {
                for (Map.Entry<String, String> entry : o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.headersMap.entrySet()) {
                    builder2.add(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            builder.headers(builder2.build());
        }
        return builder;
    }
}
