package org.fourthline.cling.transport.impl.jetty;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.client.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import org.eclipse.jetty.client.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import org.eclipse.jetty.http.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import org.eclipse.jetty.http.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.ContentTypeHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.AbstractStreamClient;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamClient;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class StreamClientImpl extends AbstractStreamClient<StreamClientConfigurationImpl, HttpContentExchange> {
    private static final Logger log = Logger.getLogger(StreamClient.class.getName());
    protected final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O client;
    protected final StreamClientConfigurationImpl configuration;

    public static class HttpContentExchange extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
        protected final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O client;
        protected final StreamClientConfigurationImpl configuration;
        protected Throwable exception;
        protected final StreamRequestMessage requestMessage;

        public HttpContentExchange(StreamClientConfigurationImpl streamClientConfigurationImpl, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, StreamRequestMessage streamRequestMessage) {
            super(0);
            this.configuration = streamClientConfigurationImpl;
            this.client = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            this.requestMessage = streamRequestMessage;
            applyRequestURLMethod();
            applyRequestHeaders();
            applyRequestBody();
        }

        public void applyRequestBody() {
            if (getRequestMessage().hasBody()) {
                if (getRequestMessage().getBodyType() == UpnpMessage.BodyType.STRING) {
                    if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                        StreamClientImpl.log.fine("Writing textual request body: " + getRequestMessage());
                    }
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO value = getRequestMessage().getContentTypeHeader() != null ? getRequestMessage().getContentTypeHeader().getValue() : ContentTypeHeader.DEFAULT_CONTENT_TYPE_UTF8;
                    String contentTypeCharset = getRequestMessage().getContentTypeCharset() != null ? getRequestMessage().getContentTypeCharset() : "UTF-8";
                    setRequestContentType(value.toString());
                    try {
                        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(getRequestMessage().getBodyString(), contentTypeCharset);
                        setRequestHeader("Content-Length", String.valueOf(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
                        setRequestContent(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                        return;
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Unsupported character encoding: ", contentTypeCharset), e);
                    }
                }
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Writing binary request body: " + getRequestMessage());
                }
                if (getRequestMessage().getContentTypeHeader() == null) {
                    throw new RuntimeException("Missing content type header in request message: " + this.requestMessage);
                }
                setRequestContentType(getRequestMessage().getContentTypeHeader().getValue().toString());
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(getRequestMessage().getBodyBytes());
                setRequestHeader("Content-Length", String.valueOf(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
                setRequestContent(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2);
            }
        }

        public void applyRequestHeaders() {
            UpnpHeaders headers = getRequestMessage().getHeaders();
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Writing headers on HttpContentExchange: " + headers.size());
            }
            UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
            if (!headers.containsKey(type)) {
                setRequestHeader(type.getHttpName(), getConfiguration().getUserAgentValue(getRequestMessage().getUdaMajorVersion(), getRequestMessage().getUdaMinorVersion()));
            }
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                        StreamClientImpl.log.fine("Setting header '" + key + "': " + str);
                    }
                    addRequestHeader(key, str);
                }
            }
        }

        public void applyRequestURLMethod() {
            UpnpRequest operation = getRequestMessage().getOperation();
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Preparing HTTP request message with method '" + operation.getHttpMethodName() + "': " + getRequestMessage());
            }
            setURL(operation.getURI().toString());
            setMethod(operation.getHttpMethodName());
        }

        public StreamResponseMessage createResponse() {
            ArrayList arrayList;
            UpnpResponse upnpResponse = new UpnpResponse(getResponseStatus(), UpnpResponse.Status.getByStatusCode(getResponseStatus()).getStatusMsg());
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Received response: " + upnpResponse);
            }
            StreamResponseMessage streamResponseMessage = new StreamResponseMessage(upnpResponse);
            UpnpHeaders upnpHeaders = new UpnpHeaders();
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO responseFields = getResponseFields();
            responseFields.getClass();
            ArrayList<O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0> arrayList2 = responseFields.f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            ArrayList<String> arrayList3 = new ArrayList(arrayList2.size());
            for (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 : arrayList2) {
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
                    arrayList3.add(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4287O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                }
            }
            for (String str : arrayList3) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = responseFields.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str);
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    while (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                        arrayList4.add(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    }
                    arrayList = arrayList4;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    upnpHeaders.add(str, (String) it.next());
                }
            }
            streamResponseMessage.setHeaders(upnpHeaders);
            byte[] responseContentBytes = getResponseContentBytes();
            if (responseContentBytes != null && responseContentBytes.length > 0 && streamResponseMessage.isContentTypeMissingOrText()) {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    streamResponseMessage.setBodyCharacters(responseContentBytes);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Unsupported character encoding: " + e, e);
                }
            } else if (responseContentBytes != null && responseContentBytes.length > 0) {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Response contains binary entity body, setting bytes on message");
                }
                streamResponseMessage.setBody(UpnpMessage.BodyType.BYTES, responseContentBytes);
            } else if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Response did not contain entity body");
            }
            if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                StreamClientImpl.log.fine("Response message complete: " + streamResponseMessage);
            }
            return streamResponseMessage;
        }

        public StreamClientConfigurationImpl getConfiguration() {
            return this.configuration;
        }

        public StreamRequestMessage getRequestMessage() {
            return this.requestMessage;
        }

        @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
        public void onConnectionFailed(Throwable th) {
            StreamClientImpl.log.log(Level.WARNING, "HTTP connection failed: " + this.requestMessage, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th));
        }

        @Override // org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000
        public void onException(Throwable th) {
            StreamClientImpl.log.log(Level.WARNING, "HTTP request failed: " + this.requestMessage, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th));
        }
    }

    public StreamClientImpl(StreamClientConfigurationImpl streamClientConfigurationImpl) {
        this.configuration = streamClientConfigurationImpl;
        log.info("Starting Jetty HttpClient...");
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        this.client = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getConfiguration().getRequestExecutorService()) { // from class: org.fourthline.cling.transport.impl.jetty.StreamClientImpl.1
            @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public void doStop() {
            }
        };
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4215O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4215O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4218O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (streamClientConfigurationImpl.getTimeoutSeconds() + 5) * 1000;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4219O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (streamClientConfigurationImpl.getTimeoutSeconds() + 5) * 1000;
        streamClientConfigurationImpl.getRequestRetryCount();
        try {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.start();
        } catch (Exception e) {
            throw new InitializationException(androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Could not start Jetty HTTP client: ", e), e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public boolean logExecutionException(Throwable th) {
        return false;
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public void stop() {
        try {
            this.client.stop();
        } catch (Exception e) {
            log.info("Error stopping HTTP client: " + e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public void abort(HttpContentExchange httpContentExchange) {
        httpContentExchange.cancel();
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public Callable<StreamResponseMessage> createCallable(final StreamRequestMessage streamRequestMessage, final HttpContentExchange httpContentExchange) {
        return new Callable<StreamResponseMessage>() { // from class: org.fourthline.cling.transport.impl.jetty.StreamClientImpl.2
            @Override // java.util.concurrent.Callable
            public StreamResponseMessage call() throws UnknownHostException {
                if (StreamClientImpl.log.isLoggable(Level.FINE)) {
                    StreamClientImpl.log.fine("Sending HTTP request: " + streamRequestMessage);
                }
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = StreamClientImpl.this.client;
                HttpContentExchange httpContentExchange2 = httpContentExchange;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                boolean zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f4347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(httpContentExchange2.getScheme());
                org.eclipse.jetty.client.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o address = httpContentExchange2.getAddress();
                if (address == null) {
                    throw new UnknownHostException("Remote socket address cannot be null.");
                }
                ConcurrentHashMap concurrentHashMap = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4214O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) concurrentHashMap.get(address);
                if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
                    o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, address, zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4222O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                    O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2 = (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) concurrentHashMap.putIfAbsent(address, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                    if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2 != null) {
                        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2;
                    }
                }
                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(httpContentExchange2);
                int iWaitForDone = httpContentExchange.waitForDone();
                if (iWaitForDone == 7) {
                    try {
                        return httpContentExchange.createResponse();
                    } catch (Throwable th) {
                        StreamClientImpl.log.log(Level.WARNING, "Error reading response: " + streamRequestMessage, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th));
                        return null;
                    }
                }
                if (iWaitForDone == 11 || iWaitForDone == 9) {
                    return null;
                }
                StreamClientImpl.log.warning("Unhandled HTTP exchange status: " + iWaitForDone);
                return null;
            }
        };
    }

    @Override // org.fourthline.cling.transport.spi.AbstractStreamClient
    public HttpContentExchange createRequest(StreamRequestMessage streamRequestMessage) {
        return new HttpContentExchange(getConfiguration(), this.client, streamRequestMessage);
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamClientConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
