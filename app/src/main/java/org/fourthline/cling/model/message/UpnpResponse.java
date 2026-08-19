package org.fourthline.cling.model.message;

import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes2.dex */
public class UpnpResponse extends UpnpOperation {
    private int statusCode;
    private String statusMessage;

    public enum Status {
        OK(200, "OK"),
        BAD_REQUEST(TbsListener.ErrorCode.INFO_CODE_BASE, "Bad Request"),
        NOT_FOUND(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, "Not Found"),
        METHOD_NOT_SUPPORTED(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, "Method Not Supported"),
        PRECONDITION_FAILED(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(TbsListener.ErrorCode.INFO_CODE_MINIQB, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented");

        private int statusCode;
        private String statusMsg;

        Status(int i, String str) {
            this.statusCode = i;
            this.statusMsg = str;
        }

        public static Status getByStatusCode(int i) {
            for (Status status : values()) {
                if (status.getStatusCode() == i) {
                    return status;
                }
            }
            return null;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public String getStatusMsg() {
            return this.statusMsg;
        }
    }

    public UpnpResponse(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }

    public String getResponseDetails() {
        return getStatusCode() + " " + getStatusMessage();
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public boolean isFailed() {
        return this.statusCode >= 300;
    }

    public String toString() {
        return getResponseDetails();
    }

    public UpnpResponse(Status status) {
        this.statusCode = status.getStatusCode();
        this.statusMessage = status.getStatusMsg();
    }
}
