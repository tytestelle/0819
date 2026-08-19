package org.fourthline.cling.transport.impl;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.http.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.model.message.StreamRequestMessage;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.transport.spi.UpnpStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncServletUpnpStream extends UpnpStream implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    private static final Logger log = Logger.getLogger(UpnpStream.class.getName());
    protected final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO asyncContext;
    protected final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO request;
    protected StreamResponseMessage responseMessage;

    public AsyncServletUpnpStream(ProtocolFactory protocolFactory, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        super(protocolFactory);
        this.asyncContext = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.request = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    public void complete() {
        try {
            ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.asyncContext).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        } catch (IllegalStateException e) {
            log.info("Error calling servlet container's AsyncContext#complete() method: " + e);
        }
    }

    public abstract Connection createConnection();

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO getRequest() {
        return this.request;
    }

    public O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getResponse() {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.asyncContext).f1877O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1861O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != null) {
            return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        }
        throw new IllegalStateException("Couldn't get response from asynchronous context, already timed out");
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void onComplete(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Completed asynchronous processing of HTTP request: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1654O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        responseSent(this.responseMessage);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void onError(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
            logger.finer("Asynchronous processing of HTTP request error: null");
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        responseException(null);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void onTimeout(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request timed out: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1654O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        responseException(new Exception("Asynchronous request timed out"));
    }

    public StreamRequestMessage readRequestMessage() throws IOException {
        Enumeration enumeration;
        String str = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).f1902O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        String strO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Processing HTTP request: " + str + " " + strO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        try {
            StreamRequestMessage streamRequestMessage = new StreamRequestMessage(UpnpRequest.Method.getByHttpName(str), URI.create(strO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
            if (((UpnpRequest) streamRequestMessage.getOperation()).getMethod().equals(UpnpRequest.Method.UNKNOWN)) {
                throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Method not supported: ", str));
            }
            streamRequestMessage.setConnection(createConnection());
            UpnpHeaders upnpHeaders = new UpnpHeaders();
            Enumeration enumeration2 = Collections.enumeration(((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1856O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keySet());
            while (enumeration2.hasMoreElements()) {
                String string = enumeration2.nextElement().toString();
                org.eclipse.jetty.http.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1856O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(string);
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                    enumeration = Collections.enumeration(Collections.emptyList());
                } else {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    enumeration = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                }
                if (enumeration == null) {
                    enumeration = Collections.enumeration(Collections.EMPTY_LIST);
                }
                while (enumeration.hasMoreElements()) {
                    upnpHeaders.add(string, (String) enumeration.nextElement());
                }
            }
            streamRequestMessage.setHeaders(upnpHeaders);
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
            try {
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.close();
                Logger logger2 = log;
                Level level = Level.FINER;
                if (logger2.isLoggable(level)) {
                    logger2.finer("Reading request body bytes: " + bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length);
                }
                if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length > 0 && streamRequestMessage.isContentTypeMissingOrText()) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request contains textual entity body, converting then setting string on message");
                    }
                    streamRequestMessage.setBodyCharacters(bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                } else if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length > 0) {
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Request contains binary entity body, setting bytes on message");
                    }
                    streamRequestMessage.setBody(UpnpMessage.BodyType.BYTES, bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                } else if (logger2.isLoggable(level)) {
                    logger2.finer("Request did not contain entity body");
                }
                return streamRequestMessage;
            } catch (Throwable th) {
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid request URI: ", strO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000), e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            StreamRequestMessage requestMessage = readRequestMessage();
            Logger logger = log;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Processing new request message: " + requestMessage);
            }
            StreamResponseMessage streamResponseMessageProcess = process(requestMessage);
            this.responseMessage = streamResponseMessageProcess;
            if (streamResponseMessageProcess != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Preparing HTTP response message: " + this.responseMessage);
                }
                writeResponseMessage(this.responseMessage);
            } else {
                if (logger.isLoggable(level)) {
                    logger.finer("Sending HTTP response status: 404");
                }
                getResponse().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST);
            }
        } catch (Throwable th) {
            try {
                Logger logger2 = log;
                logger2.info("Exception occurred during UPnP stream processing: " + th);
                Level level2 = Level.FINER;
                if (logger2.isLoggable(level2)) {
                    logger2.log(level2, "Cause: " + com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th), com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(th));
                }
                if (getResponse().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                    logger2.info("Could not return INTERNAL SERVER ERROR to client, response was already committed");
                } else {
                    logger2.finer("Response hasn't been committed, returning INTERNAL SERVER ERROR to client");
                    getResponse().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(TbsListener.ErrorCode.INFO_CODE_MINIQB);
                }
                responseException(th);
            } finally {
                complete();
            }
        }
    }

    public void writeResponseMessage(StreamResponseMessage streamResponseMessage) throws IOException {
        Logger logger = log;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Sending HTTP response status: " + streamResponseMessage.getOperation().getStatusCode());
        }
        getResponse().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(streamResponseMessage.getOperation().getStatusCode());
        for (Map.Entry<String, List<String>> entry : streamResponseMessage.getHeaders().entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                getResponse().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(entry.getKey(), it.next());
            }
        }
        getResponse().O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("Date", System.currentTimeMillis());
        byte[] bodyBytes = streamResponseMessage.hasBody() ? streamResponseMessage.getBodyBytes() : null;
        int length = bodyBytes != null ? bodyBytes.length : -1;
        if (length > 0) {
            getResponse().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(length);
            log.finer("Response message has body, writing bytes to stream...");
            O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(getResponse().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), bodyBytes);
        }
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void onStartAsync(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
    }
}
