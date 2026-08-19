package org.fourthline.cling.support.model;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public enum SeekMode {
    TRACK_NR("TRACK_NR"),
    ABS_TIME("ABS_TIME"),
    REL_TIME("REL_TIME"),
    ABS_COUNT("ABS_COUNT"),
    REL_COUNT("REL_COUNT"),
    CHANNEL_FREQ("CHANNEL_FREQ"),
    TAPE_INDEX("TAPE-INDEX"),
    FRAME("FRAME");

    private String protocolString;

    SeekMode(String str) {
        this.protocolString = str;
    }

    public static SeekMode valueOrExceptionOf(String str) {
        for (SeekMode seekMode : values()) {
            if (seekMode.protocolString.equals(str)) {
                return seekMode;
            }
        }
        throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid seek mode string: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocolString;
    }
}
