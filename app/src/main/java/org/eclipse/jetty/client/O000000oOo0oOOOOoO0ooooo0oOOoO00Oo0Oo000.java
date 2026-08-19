package org.eclipse.jetty.client;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    private int _bufferSize;
    private String _encoding;
    private File _fileForUpload;
    private ByteArrayOutputStream _responseContent;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        super(true);
        this._bufferSize = 4096;
        this._encoding = "utf-8";
    }

    public final synchronized FileInputStream O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return new FileInputStream(this._fileForUpload);
    }

    public synchronized File getFileForUpload() {
        return this._fileForUpload;
    }

    public synchronized String getResponseContent() {
        ByteArrayOutputStream byteArrayOutputStream = this._responseContent;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toString(this._encoding);
    }

    public synchronized byte[] getResponseContentBytes() {
        ByteArrayOutputStream byteArrayOutputStream = this._responseContent;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onResponseContent(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        try {
            if (this._responseContent == null) {
                this._responseContent = new ByteArrayOutputStream(this._bufferSize);
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this._responseContent);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.client.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onResponseHeader(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iIndexOf;
        try {
            super.onResponseHeader(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
            int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            if (iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 12) {
                this._bufferSize = O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
            } else if (iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 16 && (iIndexOf = (strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.toString())).indexOf("charset=")) > 0) {
                String strSubstring = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.substring(iIndexOf + 8);
                this._encoding = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(59);
                if (iIndexOf2 > 0) {
                    this._encoding = this._encoding.substring(0, iIndexOf2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.client.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onResponseStatus(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = this._responseContent;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.reset();
            }
            super.onResponseStatus(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, i, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public synchronized void onRetry() {
        try {
            if (this._fileForUpload != null) {
                setRequestContent(null);
                setRequestContentSource(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
            } else {
                super.onRetry();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setFileForUpload(File file) {
        this._fileForUpload = file;
        setRequestContentSource(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
    }
}
