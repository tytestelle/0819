package org.seamless.xml;

import java.io.InputStream;
import java.io.Reader;
import org.w3c.dom.ls.LSInput;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements LSInput {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public InputStream f4519O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // org.w3c.dom.ls.LSInput
    public final String getBaseURI() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final InputStream getByteStream() {
        return this.f4519O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final boolean getCertifiedText() {
        return false;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final Reader getCharacterStream() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final String getEncoding() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final String getPublicId() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final String getStringData() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final String getSystemId() {
        return null;
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setBaseURI(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setByteStream(InputStream inputStream) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setCertifiedText(boolean z) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setCharacterStream(Reader reader) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setEncoding(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setPublicId(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setStringData(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public final void setSystemId(String str) {
    }
}
