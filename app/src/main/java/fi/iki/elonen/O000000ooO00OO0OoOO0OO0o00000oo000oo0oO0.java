package fi.iki.elonen;

import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes2.dex */
public enum O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, "Created"),
    ACCEPTED(TbsListener.ErrorCode.APK_PATH_ERROR, "Accepted"),
    NO_CONTENT(TbsListener.ErrorCode.APK_INVALID, "No Content"),
    PARTIAL_CONTENT(TbsListener.ErrorCode.UNZIP_IO_ERROR, "Partial Content"),
    MULTI_STATUS(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(TbsListener.ErrorCode.INFO_CODE_BASE, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, "Not Found"),
    METHOD_NOT_ALLOWED(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, "Method Not Allowed"),
    NOT_ACCEPTABLE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, "Not Acceptable"),
    REQUEST_TIMEOUT(TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, "Request Timeout"),
    CONFLICT(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, "Conflict"),
    GONE(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, "Gone"),
    LENGTH_REQUIRED(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON, "Length Required"),
    PRECONDITION_FAILED(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(TbsListener.ErrorCode.INFO_CODE_MINIQB, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

    private final String description;
    private final int requestStatus;

    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, String str) {
        this.requestStatus = i;
        this.description = str;
    }

    public static O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 lookup(int i) {
        for (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 : values()) {
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getRequestStatus() == i) {
                return o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
        }
        return null;
    }

    public String getDescription() {
        return "" + this.requestStatus + " " + this.description;
    }

    public int getRequestStatus() {
        return this.requestStatus;
    }
}
