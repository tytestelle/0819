package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.header.ContentTypeHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class StreamResponseMessage extends UpnpMessage<UpnpResponse> {
    public StreamResponseMessage(StreamResponseMessage streamResponseMessage) {
        super(streamResponseMessage);
    }

    public StreamResponseMessage(UpnpResponse.Status status) {
        super(new UpnpResponse(status));
    }

    public StreamResponseMessage(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public StreamResponseMessage(UpnpResponse upnpResponse, String str) {
        super(upnpResponse, UpnpMessage.BodyType.STRING, str);
    }

    public StreamResponseMessage(String str) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.STRING, str);
    }

    public StreamResponseMessage(UpnpResponse upnpResponse, byte[] bArr) {
        super(upnpResponse, UpnpMessage.BodyType.BYTES, bArr);
    }

    public StreamResponseMessage(byte[] bArr) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.BYTES, bArr);
    }

    public StreamResponseMessage(String str, ContentTypeHeader contentTypeHeader) {
        this(str);
        getHeaders().add(UpnpHeader.Type.CONTENT_TYPE, contentTypeHeader);
    }

    public StreamResponseMessage(String str, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this(str, new ContentTypeHeader(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    public StreamResponseMessage(byte[] bArr, ContentTypeHeader contentTypeHeader) {
        this(bArr);
        getHeaders().add(UpnpHeader.Type.CONTENT_TYPE, contentTypeHeader);
    }

    public StreamResponseMessage(byte[] bArr, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this(bArr, new ContentTypeHeader(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }
}
