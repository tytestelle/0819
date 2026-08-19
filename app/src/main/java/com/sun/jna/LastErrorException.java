package com.sun.jna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class LastErrorException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private int errorCode;

    public LastErrorException(String str) {
        super(parseMessage(str.trim()));
        try {
            this.errorCode = Integer.parseInt(str.startsWith("[") ? str.substring(1, str.indexOf("]")) : str);
        } catch (NumberFormatException unused) {
            this.errorCode = -1;
        }
    }

    private static String formatMessage(int i) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, Platform.isWindows() ? "GetLastError() returned " : "errno was ");
    }

    private static String parseMessage(String str) {
        try {
            return formatMessage(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public LastErrorException(int i) {
        this(i, formatMessage(i));
    }

    public LastErrorException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
