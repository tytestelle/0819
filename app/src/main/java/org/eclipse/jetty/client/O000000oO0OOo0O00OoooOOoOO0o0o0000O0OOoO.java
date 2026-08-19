package org.eclipse.jetty.client;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    private final org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO _responseFields;
    private volatile int _responseStatus;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(boolean z) {
        this._responseFields = z ? new org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() : null;
    }

    public synchronized org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO getResponseFields() {
        if (getStatus() < 6) {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this._responseFields;
    }

    public synchronized int getResponseStatus() {
        if (getStatus() < 5) {
            throw new IllegalStateException("Response not received yet");
        }
        return this._responseStatus;
    }

    @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onResponseHeader(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this._responseFields;
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o());
        }
    }

    @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onResponseStatus(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        this._responseStatus = i;
    }
}
