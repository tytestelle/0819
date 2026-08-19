package org.fourthline.cling.model.profile;

import java.net.InetAddress;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.message.header.UserAgentHeader;
import org.seamless.http.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteClientInfo extends ClientInfo {
    protected final Connection connection;
    protected final UpnpHeaders extraResponseHeaders;

    public RemoteClientInfo() {
        this(null);
    }

    public Connection getConnection() {
        return this.connection;
    }

    public UpnpHeaders getExtraResponseHeaders() {
        return this.extraResponseHeaders;
    }

    public InetAddress getLocalAddress() {
        return getConnection().getLocalAddress();
    }

    public InetAddress getRemoteAddress() {
        return getConnection().getRemoteAddress();
    }

    public boolean isPS3Request() {
        String requestUserAgent = getRequestUserAgent();
        String firstHeaderString = getRequestHeaders().getFirstHeaderString(UpnpHeader.Type.EXT_AV_CLIENT_INFO);
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4496O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return (requestUserAgent != null && requestUserAgent.contains("PLAYSTATION 3")) || (firstHeaderString != null && firstHeaderString.contains("PLAYSTATION 3"));
    }

    public boolean isRequestCancelled() {
        return !getConnection().isOpen();
    }

    public boolean isWMPRequest() {
        String requestUserAgent = getRequestUserAgent();
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4496O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return (requestUserAgent == null || !requestUserAgent.contains("Windows-Media-Player") || requestUserAgent.contains("J-River") || requestUserAgent.contains("J. River")) ? false : true;
    }

    public boolean isXbox360Request() {
        String requestUserAgent = getRequestUserAgent();
        String firstHeaderString = getRequestHeaders().getFirstHeaderString(UpnpHeader.Type.SERVER);
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4496O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return (requestUserAgent != null && (requestUserAgent.contains("Xbox") || requestUserAgent.contains("Xenon"))) || (firstHeaderString != null && firstHeaderString.contains("Xbox"));
    }

    public void setResponseUserAgent(String str) {
        setResponseUserAgent(new UserAgentHeader(str));
    }

    public void throwIfRequestCancelled() throws InterruptedException {
        if (isRequestCancelled()) {
            throw new InterruptedException("Client's request cancelled");
        }
    }

    @Override // org.fourthline.cling.model.profile.ClientInfo
    public String toString() {
        return "(" + getClass().getSimpleName() + ") Remote Address: " + getRemoteAddress();
    }

    public RemoteClientInfo(StreamRequestMessage streamRequestMessage) {
        this(streamRequestMessage != null ? streamRequestMessage.getConnection() : null, streamRequestMessage != null ? streamRequestMessage.getHeaders() : new UpnpHeaders());
    }

    public void setResponseUserAgent(UserAgentHeader userAgentHeader) {
        getExtraResponseHeaders().add(UpnpHeader.Type.USER_AGENT, userAgentHeader);
    }

    public RemoteClientInfo(Connection connection, UpnpHeaders upnpHeaders) {
        super(upnpHeaders);
        this.extraResponseHeaders = new UpnpHeaders();
        this.connection = connection;
    }
}
