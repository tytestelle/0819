package org.fourthline.cling.support.model.dlna;

import androidx.media3.common.C;

/* JADX INFO: loaded from: classes2.dex */
public enum DLNAFlags {
    SENDER_PACED(Integer.MIN_VALUE),
    TIME_BASED_SEEK(1073741824),
    BYTE_BASED_SEEK(C.BUFFER_FLAG_LAST_SAMPLE),
    FLAG_PLAY_CONTAINER(268435456),
    S0_INCREASE(C.BUFFER_FLAG_FIRST_SAMPLE),
    SN_INCREASE(67108864),
    RTSP_PAUSE(33554432),
    STREAMING_TRANSFER_MODE(16777216),
    INTERACTIVE_TRANSFERT_MODE(8388608),
    BACKGROUND_TRANSFERT_MODE(4194304),
    CONNECTION_STALL(2097152),
    DLNA_V15(1048576);

    private int code;

    DLNAFlags(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public static DLNAFlags valueOf(int i) {
        for (DLNAFlags dLNAFlags : values()) {
            if (dLNAFlags.getCode() == i) {
                return dLNAFlags;
            }
        }
        return null;
    }
}
