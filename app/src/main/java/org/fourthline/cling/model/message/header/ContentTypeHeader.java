package org.fourthline.cling.model.message.header;

import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class ContentTypeHeader extends UpnpHeader<O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> {
    public static final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO DEFAULT_CONTENT_TYPE = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("text/xml");
    public static final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO DEFAULT_CONTENT_TYPE_UTF8 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("text/xml;charset=\"utf-8\"");

    public ContentTypeHeader() {
        setValue(DEFAULT_CONTENT_TYPE);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    public boolean isText() {
        return getValue() != null && getValue().f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(DEFAULT_CONTENT_TYPE.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public boolean isUDACompliantXML() {
        return isText() && getValue().f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(DEFAULT_CONTENT_TYPE.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        setValue(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str));
    }

    public ContentTypeHeader(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        setValue(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public ContentTypeHeader(String str) {
        setString(str);
    }
}
