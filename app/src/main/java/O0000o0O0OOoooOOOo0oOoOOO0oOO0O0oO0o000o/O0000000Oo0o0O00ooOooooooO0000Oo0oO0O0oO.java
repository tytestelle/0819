package O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends IOException {
    public static final int CONNECTION_LOST = -14;
    public static final int DNS_NOT_REACHABLE = -6;
    public static final int HANDSHAKE_CONNECT_FAIL = -11;
    public static final int HANDSHAKE_FAIL = -12;
    public static final int NO_SSL_TLS_SUPP = -10;
    public static final int OPEN_ALLOC = -2;
    public static final int OPEN_CONNECT_STREAM = -3;
    public static final int RTMP_AMF_ENCODE_FAIL = -21;
    public static final int RTMP_CONNECT_FAIL = -13;
    public static final int RTMP_GENERIC_ERROR = -26;
    public static final int RTMP_IGNORED = -25;
    public static final int RTMP_KEYFRAME_TS_MISMATCH = -15;
    public static final int RTMP_MEM_ALLOC_FAIL = -17;
    public static final int RTMP_PACKET_TOO_SMALL = -19;
    public static final int RTMP_READ_CORRUPT_STREAM = -16;
    public static final int RTMP_SANITY_FAIL = -27;
    public static final int RTMP_SEND_PACKET_FAIL = -20;
    public static final int RTMP_STREAM_BAD_DATASIZE = -18;
    public static final int SOCKET_CONNECT_FAIL = -7;
    public static final int SOCKET_CREATE_FAIL = -9;
    public static final int SOCKS_NEGOTIATION_FAIL = -8;
    public static final int UNKNOWN_RTMP_AMF_TYPE = -5;
    public static final int UNKNOWN_RTMP_OPTION = -4;
    public static final int URL_INCORRECT_PORT = -24;
    public static final int URL_MISSING_HOSTNAME = -23;
    public static final int URL_MISSING_PROTOCOL = -22;
    public final int errorCode;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        super(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "RTMP error: "));
        this.errorCode = i;
    }
}
