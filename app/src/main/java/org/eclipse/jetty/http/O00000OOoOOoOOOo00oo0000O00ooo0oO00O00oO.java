package org.eclipse.jetty.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes2.dex */
public enum O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO {
    CONTINUE(100, "Continue"),
    SWITCHING_PROTOCOLS(101, "Switching Protocols"),
    PROCESSING(102, "Processing"),
    OK(200, "OK"),
    CREATED(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, "Created"),
    ACCEPTED(TbsListener.ErrorCode.APK_PATH_ERROR, "Accepted"),
    NON_AUTHORITATIVE_INFORMATION(TbsListener.ErrorCode.APK_VERSION_ERROR, "Non Authoritative Information"),
    NO_CONTENT(TbsListener.ErrorCode.APK_INVALID, "No Content"),
    RESET_CONTENT(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "Reset Content"),
    PARTIAL_CONTENT(TbsListener.ErrorCode.UNZIP_IO_ERROR, "Partial Content"),
    MULTI_STATUS(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, "Multi-Status"),
    MULTIPLE_CHOICES(300, "Multiple Choices"),
    MOVED_PERMANENTLY(301, "Moved Permanently"),
    MOVED_TEMPORARILY(302, "Moved Temporarily"),
    FOUND(302, "Found"),
    SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    USE_PROXY(305, "Use Proxy"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(TbsListener.ErrorCode.INFO_CODE_BASE, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, "Not Found"),
    METHOD_NOT_ALLOWED(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, "Method Not Allowed"),
    NOT_ACCEPTABLE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, "Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, "Proxy Authentication Required"),
    REQUEST_TIMEOUT(TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, "Request Timeout"),
    CONFLICT(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, "Conflict"),
    GONE(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, "Gone"),
    LENGTH_REQUIRED(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON, "Length Required"),
    PRECONDITION_FAILED(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX, "Precondition Failed"),
    REQUEST_ENTITY_TOO_LARGE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX, "Request Entity Too Large"),
    REQUEST_URI_TOO_LONG(TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED, "Request-URI Too Long"),
    UNSUPPORTED_MEDIA_TYPE(TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, "Unsupported Media Type"),
    REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, "Expectation Failed"),
    UNPROCESSABLE_ENTITY(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity"),
    LOCKED(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked"),
    FAILED_DEPENDENCY(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency"),
    INTERNAL_SERVER_ERROR(TbsListener.ErrorCode.INFO_CODE_MINIQB, "Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    BAD_GATEWAY(502, "Bad Gateway"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    GATEWAY_TIMEOUT(504, "Gateway Timeout"),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported"),
    INSUFFICIENT_STORAGE(507, "Insufficient Storage");

    private final int _code;
    private final String _message;

    O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(int i, String str) {
        this._code = i;
        this._message = str;
    }

    public boolean equals(int i) {
        return this._code == i;
    }

    public int getCode() {
        return this._code;
    }

    public String getMessage() {
        return this._message;
    }

    public boolean isClientError() {
        int i = this._code;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return 400 <= i && i <= 499;
    }

    public boolean isInformational() {
        int i = this._code;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return 100 <= i && i <= 199;
    }

    public boolean isRedirection() {
        int i = this._code;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return 300 <= i && i <= 399;
    }

    public boolean isServerError() {
        int i = this._code;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return 500 <= i && i <= 599;
    }

    public boolean isSuccess() {
        int i = this._code;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4349O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return 200 <= i && i <= 299;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("[%03d %s]", Integer.valueOf(this._code), getMessage());
    }
}
