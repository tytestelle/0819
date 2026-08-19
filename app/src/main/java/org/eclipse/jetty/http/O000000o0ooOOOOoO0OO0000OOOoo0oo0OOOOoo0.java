package org.eclipse.jetty.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends IOException {
    String _reason;
    int _status;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        this._status = i;
        this._reason = null;
    }

    public String getReason() {
        return this._reason;
    }

    public int getStatus() {
        return this._status;
    }

    public void setReason(String str) {
        this._reason = str;
    }

    public void setStatus(int i) {
        this._status = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HttpException(" + this._status + "," + this._reason + "," + getCause() + ")";
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, String str) {
        this._status = i;
        this._reason = str;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, String str, Throwable th) {
        this._status = i;
        this._reason = str;
        initCause(th);
    }
}
