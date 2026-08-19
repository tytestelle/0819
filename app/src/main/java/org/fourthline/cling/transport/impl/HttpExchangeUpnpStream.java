package org.fourthline.cling.transport.impl;

import O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.sun.net.httpserver.HttpExchange;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.transport.spi.UpnpStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HttpExchangeUpnpStream extends UpnpStream {
    private static Logger log = Logger.getLogger(UpnpStream.class.getName());
    private HttpExchange httpExchange;

    public HttpExchangeUpnpStream(ProtocolFactory protocolFactory, HttpExchange httpExchange) {
        super(protocolFactory);
        this.httpExchange = httpExchange;
    }

    public abstract Connection createConnection();

    public HttpExchange getHttpExchange() {
        return this.httpExchange;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            log.fine("Processing HTTP request: " + getHttpExchange().getRequestMethod() + " " + getHttpExchange().getRequestURI());
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.getByHttpName(getHttpExchange().getRequestMethod()), getHttpExchange().getRequestURI());
            if (((UpnpRequest) streamRequestMessage.getOperation()).getMethod().equals(UpnpRequest.Method.UNKNOWN)) {
                log.fine("Method not supported by UPnP stack: " + getHttpExchange().getRequestMethod());
                throw new RuntimeException("Method not supported: " + getHttpExchange().getRequestMethod());
            }
            ((UpnpRequest) streamRequestMessage.getOperation()).setHttpMinorVersion(getHttpExchange().getProtocol().toUpperCase(Locale.ROOT).equals("HTTP/1.1") ? 1 : 0);
            log.fine("Created new request message: " + streamRequestMessage);
            streamRequestMessage.setConnection(createConnection());
            streamRequestMessage.setHeaders(new UpnpHeaders((Map<String, List<String>>) getHttpExchange().getRequestHeaders()));
            InputStream inputStream = null;
            OutputStream responseBody = null;
            try {
                InputStream requestBody = getHttpExchange().getRequestBody();
                try {
                    byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(requestBody);
                    requestBody.close();
                    log.fine("Reading request body bytes: " + bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length);
                    if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length > 0 && streamRequestMessage.isContentTypeMissingOrText()) {
                        log.fine("Request contains textual entity body, converting then setting string on message");
                        streamRequestMessage.setBodyCharacters(bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    } else if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length > 0) {
                        log.fine("Request contains binary entity body, setting bytes on message");
                        streamRequestMessage.setBody(UpnpMessage.BodyType.BYTES, bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    } else {
                        log.fine("Request did not contain entity body");
                    }
                    StreamResponseMessage streamResponseMessageProcess = process(streamRequestMessage);
                    if (streamResponseMessageProcess != null) {
                        log.fine("Preparing HTTP response message: " + streamResponseMessageProcess);
                        getHttpExchange().getResponseHeaders().putAll(streamResponseMessageProcess.getHeaders());
                        byte[] bodyBytes = streamResponseMessageProcess.hasBody() ? streamResponseMessageProcess.getBodyBytes() : null;
                        int length = bodyBytes != null ? bodyBytes.length : -1;
                        log.fine("Sending HTTP response message: " + streamResponseMessageProcess + " with content length: " + length);
                        getHttpExchange().sendResponseHeaders(streamResponseMessageProcess.getOperation().getStatusCode(), (long) length);
                        if (length > 0) {
                            log.fine("Response message has body, writing bytes to stream...");
                            try {
                                responseBody = getHttpExchange().getResponseBody();
                                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(responseBody, bodyBytes);
                                responseBody.flush();
                                responseBody.close();
                            } catch (Throwable th) {
                                if (responseBody != null) {
                                    responseBody.close();
                                }
                                throw th;
                            }
                        }
                    } else {
                        log.fine("Sending HTTP response status: 404");
                        getHttpExchange().sendResponseHeaders(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, -1L);
                    }
                    responseSent(streamResponseMessageProcess);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = requestBody;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            log.fine("Exception occured during UPnP stream processing: " + th4);
            Logger logger = log;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                log.log(level, "Cause: " + com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th4), com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th4));
            }
            try {
                this.httpExchange.sendResponseHeaders(TbsListener.ErrorCode.INFO_CODE_MINIQB, -1L);
            } catch (IOException e) {
                log.warning("Couldn't send error response: " + e);
            }
            responseException(th4);
        }
    }
}
