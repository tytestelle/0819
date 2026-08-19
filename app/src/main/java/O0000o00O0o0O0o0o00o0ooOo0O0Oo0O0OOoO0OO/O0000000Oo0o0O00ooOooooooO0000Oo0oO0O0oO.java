package O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends com.lzy.okgo.request.base.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public Request generateRequest(RequestBody requestBody) {
        return generateRequestBuilder(requestBody).get().url(this.url).tag(this.tag).build();
    }

    @Override // com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getMethod() {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.GET;
    }
}
