package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends HashMap {
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        put(200, "OK");
        put(301, "Moved Permanently");
        put(302, "Found");
        put(Integer.valueOf(TbsListener.ErrorCode.INFO_CODE_BASE), "Bad Request");
        put(401, "Unauthorized");
        put(403, "Forbidden");
        put(Integer.valueOf(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST), "Not Found");
        put(429, "Too Many Requests");
        put(Integer.valueOf(TbsListener.ErrorCode.INFO_CODE_MINIQB), "Internal Server Error");
        put(502, "Bad Gateway");
        put(503, "Service Unavailable");
        put(504, "Gateway Timeout");
    }
}
