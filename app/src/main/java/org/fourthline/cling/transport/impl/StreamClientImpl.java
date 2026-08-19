package org.fourthline.cling.transport.impl;

import O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamClient;
import org.seamless.http.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.seamless.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class StreamClientImpl implements StreamClient {
    static final String HACK_STREAM_HANDLER_SYSTEM_PROPERTY = "hackStreamHandlerProperty";
    private static final Logger log = Logger.getLogger(StreamClient.class.getName());
    protected final StreamClientConfigurationImpl configuration;

    public StreamClientImpl(StreamClientConfigurationImpl streamClientConfigurationImpl) {
        this.configuration = streamClientConfigurationImpl;
        if (ModelUtil.ANDROID_EMULATOR || ModelUtil.ANDROID_RUNTIME) {
            throw new InitializationException("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
        }
        Logger logger = log;
        logger.fine("Using persistent HTTP stream client connections: " + streamClientConfigurationImpl.isUsePersistentConnections());
        System.setProperty("http.keepAlive", Boolean.toString(streamClientConfigurationImpl.isUsePersistentConnections()));
        if (System.getProperty(HACK_STREAM_HANDLER_SYSTEM_PROPERTY) == null) {
            logger.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
            try {
                int i = FixedSunURLStreamHandler.f4492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) FixedSunURLStreamHandler.class.newInstance());
                System.setProperty(HACK_STREAM_HANDLER_SYSTEM_PROPERTY, "alreadyWorkedAroundTheEvilJDK");
            } catch (Throwable unused) {
                throw new InitializationException("Failed to set modified URLStreamHandlerFactory in this environment. Can't use bundled default client based on HTTPURLConnection, see manual.");
            }
        }
    }

    public void applyHeaders(HttpURLConnection httpURLConnection, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        log.fine("Writing headers on HttpURLConnection: " + o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size());
        for (Map.Entry<String, List<String>> entry : o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.entrySet()) {
            for (String str : entry.getValue()) {
                String key = entry.getKey();
                log.fine("Setting header '" + key + "': " + str);
                httpURLConnection.setRequestProperty(key, str);
            }
        }
    }

    public void applyRequestBody(HttpURLConnection httpURLConnection, StreamRequestMessage streamRequestMessage) throws IOException {
        if (!streamRequestMessage.hasBody()) {
            httpURLConnection.setDoOutput(false);
            return;
        }
        httpURLConnection.setDoOutput(true);
        if (streamRequestMessage.getBodyType().equals(UpnpMessage.BodyType.STRING)) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            String bodyString = streamRequestMessage.getBodyString();
            int i = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (bodyString != null) {
                outputStream.write(bodyString.getBytes("UTF-8"));
            }
        } else if (streamRequestMessage.getBodyType().equals(UpnpMessage.BodyType.BYTES)) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(httpURLConnection.getOutputStream(), streamRequestMessage.getBodyBytes());
        }
        httpURLConnection.getOutputStream().flush();
    }

    public void applyRequestProperties(HttpURLConnection httpURLConnection, StreamRequestMessage streamRequestMessage) {
        httpURLConnection.setInstanceFollowRedirects(false);
        UpnpHeaders headers = streamRequestMessage.getHeaders();
        UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
        if (!headers.containsKey(type)) {
            httpURLConnection.setRequestProperty(type.getHttpName(), getConfiguration().getUserAgentValue(streamRequestMessage.getUdaMajorVersion(), streamRequestMessage.getUdaMinorVersion()));
        }
        applyHeaders(httpURLConnection, streamRequestMessage.getHeaders());
    }

    public StreamResponseMessage createResponse(HttpURLConnection httpURLConnection, InputStream inputStream) throws IOException {
        byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = log;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            logger.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        UpnpResponse upnpResponse = new UpnpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = log;
        logger2.fine("Received response: " + upnpResponse);
        StreamResponseMessage streamResponseMessage = new StreamResponseMessage(upnpResponse);
        streamResponseMessage.setHeaders(new UpnpHeaders(httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null && bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length > 0 && streamResponseMessage.isContentTypeMissingOrText()) {
            logger2.fine("Response contains textual entity body, converting then setting string on message");
            streamResponseMessage.setBodyCharacters(bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        } else if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length <= 0) {
            logger2.fine("Response did not contain entity body");
        } else {
            logger2.fine("Response contains binary entity body, setting bytes on message");
            streamResponseMessage.setBody(UpnpMessage.BodyType.BYTES, bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        logger2.fine("Response message complete: " + streamResponseMessage);
        return streamResponseMessage;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamResponseMessage sendRequest(StreamRequestMessage streamRequestMessage) throws Throwable {
        URL url;
        HttpURLConnection httpURLConnection;
        UpnpRequest operation = streamRequestMessage.getOperation();
        Logger logger = log;
        logger.fine("Preparing HTTP request message with method '" + operation.getHttpMethodName() + "': " + streamRequestMessage);
        URI uri = operation.getURI();
        org.seamless.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4517O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        HttpURLConnection httpURLConnection2 = null;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = uri.toURL();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                try {
                    httpURLConnection.setRequestMethod(operation.getHttpMethodName());
                    httpURLConnection.setReadTimeout(this.configuration.getTimeoutSeconds() * 1000);
                    httpURLConnection.setConnectTimeout(this.configuration.getTimeoutSeconds() * 1000);
                    applyRequestProperties(httpURLConnection, streamRequestMessage);
                    applyRequestBody(httpURLConnection, streamRequestMessage);
                    logger.fine("Sending HTTP request: " + streamRequestMessage);
                    StreamResponseMessage streamResponseMessageCreateResponse = createResponse(httpURLConnection, httpURLConnection.getInputStream());
                    httpURLConnection.disconnect();
                    return streamResponseMessageCreateResponse;
                } catch (ProtocolException e2) {
                    e = e2;
                    log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    if (httpURLConnection == null) {
                        log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                    if (e instanceof SocketTimeoutException) {
                        log.info("Timeout of " + getConfiguration().getTimeoutSeconds() + " seconds while waiting for HTTP request to complete, aborting: " + streamRequestMessage);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    Logger logger2 = log;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Exception occurred, trying to read the error stream: " + com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
                    }
                    try {
                        StreamResponseMessage streamResponseMessageCreateResponse2 = createResponse(httpURLConnection, httpURLConnection.getErrorStream());
                        httpURLConnection.disconnect();
                        return streamResponseMessageCreateResponse2;
                    } catch (Exception e4) {
                        Logger logger3 = log;
                        if (logger3.isLoggable(Level.FINE)) {
                            logger3.fine("Could not read error stream: " + e4);
                        }
                        httpURLConnection.disconnect();
                        return null;
                    }
                } catch (Exception e5) {
                    e = e5;
                    log.log(Level.WARNING, "HTTP request failed: " + streamRequestMessage, com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (ProtocolException e6) {
            e = e6;
            httpURLConnection = null;
        } catch (IOException e7) {
            e = e7;
            httpURLConnection = null;
        } catch (Exception e8) {
            e = e8;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public void stop() {
    }

    @Override // org.fourthline.cling.transport.spi.StreamClient
    public StreamClientConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
