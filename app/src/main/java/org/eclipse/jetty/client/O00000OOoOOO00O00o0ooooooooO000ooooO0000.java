package org.eclipse.jetty.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo LOG;
    public static final int STATUS_CANCELLED = 11;
    public static final int STATUS_CANCELLING = 10;
    public static final int STATUS_COMPLETED = 7;
    public static final int STATUS_EXCEPTED = 9;
    public static final int STATUS_EXPIRED = 8;
    public static final int STATUS_PARSING_CONTENT = 6;
    public static final int STATUS_PARSING_HEADERS = 5;
    public static final int STATUS_SENDING_COMPLETED = 14;
    public static final int STATUS_SENDING_PARSING_CONTENT = 13;
    public static final int STATUS_SENDING_PARSING_HEADERS = 12;
    public static final int STATUS_SENDING_REQUEST = 3;
    public static final int STATUS_START = 0;
    public static final int STATUS_WAITING_FOR_COMMIT = 2;
    public static final int STATUS_WAITING_FOR_CONNECTION = 1;
    public static final int STATUS_WAITING_FOR_RESPONSE = 4;
    private O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o _address;
    private volatile O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO _connection;
    boolean _onDone;
    boolean _onRequestCompleteDone;
    boolean _onResponseCompleteDone;
    private O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 _requestContent;
    private InputStream _requestContentSource;
    private volatile O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO _timeoutTask;
    private String _uri;
    private String _method = "GET";
    private O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 _scheme = org.eclipse.jetty.http.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f4346O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private int _version = 11;
    private final org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO _requestFields = new org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
    private AtomicInteger _status = new AtomicInteger(0);
    private boolean _retryStatus = false;
    private boolean _configureListeners = true;
    private O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo _listener = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this);
    private O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o _localAddress = null;
    private long _timeout = -1;
    private long _lastStateChange = System.currentTimeMillis();
    private long _sent = -1;
    private int _lastState = -1;
    private int _lastStatePeriod = -1;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        LOG = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class.getName());
    }

    public static String toState(int i) {
        switch (i) {
            case 0:
                return "START";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            case 3:
                return "SENDING";
            case 4:
                return "WAITING";
            case 5:
                return "HEADERS";
            case 6:
                return "CONTENT";
            case 7:
                return "COMPLETED";
            case 8:
                return "EXPIRED";
            case 9:
                return "EXCEPTED";
            case 10:
                return "CANCELLING";
            case 11:
                return "CANCELLED";
            case 12:
                return "SENDING+HEADERS";
            case 13:
                return "SENDING+CONTENT";
            case 14:
                return "SENDING+COMPLETED";
            default:
                return "UNKNOWN";
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this._connection;
        try {
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                try {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                } catch (IOException e) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
                }
            }
        } finally {
            disassociate();
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        synchronized (this) {
            disassociate();
            this._onDone = true;
            notifyAll();
        }
    }

    public final boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2) {
        boolean zCompareAndSet = this._status.compareAndSet(i2, i);
        if (zCompareAndSet) {
            getEventListener().O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return zCompareAndSet;
    }

    public void addRequestHeader(String str, String str2) {
        org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO requestFields = getRequestFields();
        requestFields.getClass();
        if (str2 == null) {
            return;
        }
        requestFields.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(str), org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str2));
    }

    public void associate(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() != null) {
            this._localAddress = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLocalPort());
        }
        this._connection = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (getStatus() == 10) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
    }

    public void cancel() {
        setStatus(10);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public void cancelTimeout(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this._timeoutTask;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        this._timeoutTask = null;
    }

    public boolean configureListeners() {
        return this._configureListeners;
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO disassociate() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this._connection;
        this._connection = null;
        if (getStatus() == 10) {
            setStatus(11);
        }
        return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public void expire(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this._connection;
        int status = getStatus();
        if (status < 7 || status == 12 || status == 13 || status == 14) {
            setStatus(8);
        }
        synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(this);
        }
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this);
        }
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getAddress() {
        return this._address;
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getEventListener() {
        return this._listener;
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getLocalAddress() {
        return this._localAddress;
    }

    public String getMethod() {
        return this._method;
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 getRequestContent() {
        return this._requestContent;
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 getRequestContentChunk(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        synchronized (this) {
            try {
                if (this._requestContentSource != null) {
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(8192);
                    }
                    int i = this._requestContentSource.read(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(), ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000OOoOOO00O00o0ooooooooO000ooooO0000());
                    if (i >= 0) {
                        ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + i);
                        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InputStream getRequestContentSource() {
        return this._requestContentSource;
    }

    public org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO getRequestFields() {
        return this._requestFields;
    }

    public String getRequestURI() {
        return this._uri;
    }

    public boolean getRetryStatus() {
        return this._retryStatus;
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 getScheme() {
        return this._scheme;
    }

    public int getStatus() {
        return this._status.get();
    }

    public long getTimeout() {
        return this._timeout;
    }

    @Deprecated
    public String getURI() {
        return getRequestURI();
    }

    public int getVersion() {
        return this._version;
    }

    public boolean isAssociated() {
        return this._connection != null;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this) {
            z = this._onDone;
        }
        return z;
    }

    public abstract void onConnectionFailed(Throwable th);

    public abstract void onException(Throwable th);

    public void onExpire() {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("EXPIRED " + this, new Object[0]);
    }

    public void onRequestCommitted() {
    }

    public void onRequestComplete() {
    }

    public void onResponseComplete() {
    }

    public abstract void onResponseContent(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);

    public abstract void onResponseHeader(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);

    public void onResponseHeaderComplete() {
    }

    public abstract void onResponseStatus(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);

    public void onRetry() throws IOException {
        InputStream inputStream = this._requestContentSource;
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                throw new IOException("Unsupported retry attempt");
            }
            this._requestContent = null;
            this._requestContentSource.reset();
        }
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 onSwitchProtocol(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        return null;
    }

    public void reset() {
        synchronized (this) {
            this._timeoutTask = null;
            this._onRequestCompleteDone = false;
            this._onResponseCompleteDone = false;
            this._onDone = false;
            setStatus(0);
        }
    }

    public void scheduleTimeout(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        this._timeoutTask = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        long timeout = getTimeout();
        if (timeout <= 0) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4220O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this._timeoutTask, 0L);
        } else {
            O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this._timeoutTask;
            O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4220O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, timeout - o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2049O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public void setAddress(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this._address = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public void setConfigureListeners(boolean z) {
        this._configureListeners = z;
    }

    public void setEventListener(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this._listener = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    public void setMethod(String str) {
        this._method = str;
    }

    public void setRequestContent(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this._requestContent = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public void setRequestContentSource(InputStream inputStream) {
        this._requestContentSource = inputStream;
        if (inputStream == null || !inputStream.markSupported()) {
            return;
        }
        this._requestContentSource.mark(Integer.MAX_VALUE);
    }

    public void setRequestContentType(String str) {
        getRequestFields().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4320O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, str);
    }

    public void setRequestHeader(String str, String str2) {
        org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO requestFields = getRequestFields();
        requestFields.getClass();
        if (str2 == null) {
            requestFields.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(str));
        } else {
            requestFields.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(str), org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str2));
        }
    }

    public void setRequestURI(String str) {
        this._uri = str;
    }

    public void setRetryStatus(boolean z) {
        this._retryStatus = z;
    }

    public void setScheme(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this._scheme = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0180 A[Catch: IOException -> 0x0020, TryCatch #2 {IOException -> 0x0020, blocks: (B:3:0x0003, B:5:0x000c, B:7:0x001d, B:11:0x0027, B:12:0x002a, B:13:0x0043, B:15:0x0046, B:17:0x004a, B:19:0x0053, B:20:0x0058, B:29:0x0072, B:30:0x0079, B:31:0x007e, B:35:0x0090, B:43:0x00a9, B:44:0x00b0, B:45:0x00b5, B:49:0x00c7, B:58:0x00e4, B:65:0x00f6, B:66:0x00fa, B:69:0x0106, B:71:0x010a, B:75:0x0110, B:76:0x0118, B:80:0x0122, B:81:0x0123, B:82:0x012b, B:84:0x0130, B:85:0x0138, B:86:0x013e, B:92:0x0154, B:93:0x015c, B:94:0x0162, B:101:0x017a, B:102:0x0180, B:105:0x018c, B:107:0x0191, B:108:0x0199, B:109:0x019f, B:110:0x01a9, B:117:0x01c1, B:118:0x01c7, B:120:0x01d1, B:122:0x01d6, B:123:0x01dc, B:127:0x01ea, B:129:0x01ef, B:130:0x01f5, B:72:0x010b, B:73:0x010d), top: B:144:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7 A[Catch: IOException -> 0x0020, TryCatch #2 {IOException -> 0x0020, blocks: (B:3:0x0003, B:5:0x000c, B:7:0x001d, B:11:0x0027, B:12:0x002a, B:13:0x0043, B:15:0x0046, B:17:0x004a, B:19:0x0053, B:20:0x0058, B:29:0x0072, B:30:0x0079, B:31:0x007e, B:35:0x0090, B:43:0x00a9, B:44:0x00b0, B:45:0x00b5, B:49:0x00c7, B:58:0x00e4, B:65:0x00f6, B:66:0x00fa, B:69:0x0106, B:71:0x010a, B:75:0x0110, B:76:0x0118, B:80:0x0122, B:81:0x0123, B:82:0x012b, B:84:0x0130, B:85:0x0138, B:86:0x013e, B:92:0x0154, B:93:0x015c, B:94:0x0162, B:101:0x017a, B:102:0x0180, B:105:0x018c, B:107:0x0191, B:108:0x0199, B:109:0x019f, B:110:0x01a9, B:117:0x01c1, B:118:0x01c7, B:120:0x01d1, B:122:0x01d6, B:123:0x01dc, B:127:0x01ea, B:129:0x01ef, B:130:0x01f5, B:72:0x010b, B:73:0x010d), top: B:144:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01dc A[Catch: IOException -> 0x0020, TryCatch #2 {IOException -> 0x0020, blocks: (B:3:0x0003, B:5:0x000c, B:7:0x001d, B:11:0x0027, B:12:0x002a, B:13:0x0043, B:15:0x0046, B:17:0x004a, B:19:0x0053, B:20:0x0058, B:29:0x0072, B:30:0x0079, B:31:0x007e, B:35:0x0090, B:43:0x00a9, B:44:0x00b0, B:45:0x00b5, B:49:0x00c7, B:58:0x00e4, B:65:0x00f6, B:66:0x00fa, B:69:0x0106, B:71:0x010a, B:75:0x0110, B:76:0x0118, B:80:0x0122, B:81:0x0123, B:82:0x012b, B:84:0x0130, B:85:0x0138, B:86:0x013e, B:92:0x0154, B:93:0x015c, B:94:0x0162, B:101:0x017a, B:102:0x0180, B:105:0x018c, B:107:0x0191, B:108:0x0199, B:109:0x019f, B:110:0x01a9, B:117:0x01c1, B:118:0x01c7, B:120:0x01d1, B:122:0x01d6, B:123:0x01dc, B:127:0x01ea, B:129:0x01ef, B:130:0x01f5, B:72:0x010b, B:73:0x010d), top: B:144:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f5 A[Catch: IOException -> 0x0020, TRY_LEAVE, TryCatch #2 {IOException -> 0x0020, blocks: (B:3:0x0003, B:5:0x000c, B:7:0x001d, B:11:0x0027, B:12:0x002a, B:13:0x0043, B:15:0x0046, B:17:0x004a, B:19:0x0053, B:20:0x0058, B:29:0x0072, B:30:0x0079, B:31:0x007e, B:35:0x0090, B:43:0x00a9, B:44:0x00b0, B:45:0x00b5, B:49:0x00c7, B:58:0x00e4, B:65:0x00f6, B:66:0x00fa, B:69:0x0106, B:71:0x010a, B:75:0x0110, B:76:0x0118, B:80:0x0122, B:81:0x0123, B:82:0x012b, B:84:0x0130, B:85:0x0138, B:86:0x013e, B:92:0x0154, B:93:0x015c, B:94:0x0162, B:101:0x017a, B:102:0x0180, B:105:0x018c, B:107:0x0191, B:108:0x0199, B:109:0x019f, B:110:0x01a9, B:117:0x01c1, B:118:0x01c7, B:120:0x01d1, B:122:0x01d6, B:123:0x01dc, B:127:0x01ea, B:129:0x01ef, B:130:0x01f5, B:72:0x010b, B:73:0x010d), top: B:144:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean setStatus(int i) {
        boolean zCompareAndSet;
        boolean z;
        boolean z2;
        char c = 0;
        try {
            int i2 = this._status.get();
            if (i2 != i) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this._lastStatePeriod = (int) (jCurrentTimeMillis - this._lastStateChange);
                this._lastState = i2;
                this._lastStateChange = jCurrentTimeMillis;
                if (i == 3) {
                    this._sent = jCurrentTimeMillis;
                }
            }
            try {
                switch (i2) {
                    case 0:
                        if (i != 0 && i != 1 && i != 2) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z2 = false;
                        if (!zCompareAndSet || z2) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                            return zCompareAndSet;
                        }
                        throw new IllegalStateException(toState(i2) + " => " + toState(i));
                    case 1:
                        if (i != 2) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 2:
                        if (i != 3) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 3:
                        if (i == 4) {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                            if (zCompareAndSet) {
                                getEventListener().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            }
                        } else if (i != 5) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, 12);
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 4:
                        if (i != 5) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 5:
                        switch (i) {
                            case 6:
                                zCompareAndSet = this._status.compareAndSet(i2, i);
                                if (zCompareAndSet) {
                                    getEventListener().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                }
                                break;
                            case 7:
                            default:
                                zCompareAndSet = false;
                                break;
                            case 8:
                                zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                break;
                            case 9:
                            case 10:
                                zCompareAndSet = this._status.compareAndSet(i2, i);
                                break;
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 6:
                        switch (i) {
                            case 7:
                                zCompareAndSet = this._status.compareAndSet(i2, i);
                                if (zCompareAndSet) {
                                    getEventListener().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                                }
                                break;
                            case 8:
                                zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                break;
                            case 9:
                            case 10:
                                zCompareAndSet = this._status.compareAndSet(i2, i);
                                break;
                            default:
                                zCompareAndSet = false;
                                break;
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 7:
                        if (i != 0) {
                            if (i != 4) {
                                switch (i) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        zCompareAndSet = false;
                                        break;
                                }
                                if (zCompareAndSet) {
                                }
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                                return zCompareAndSet;
                            }
                            synchronized (this) {
                                z = this._onResponseCompleteDone;
                                break;
                            }
                            if (z) {
                                getEventListener().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            } else {
                                zCompareAndSet = this._status.compareAndSet(i2, i);
                            }
                            zCompareAndSet = false;
                            z2 = true;
                            if (zCompareAndSet) {
                            }
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                            return zCompareAndSet;
                        }
                        zCompareAndSet = this._status.compareAndSet(i2, i);
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 8:
                    case 9:
                    case 11:
                        if (i == 0) {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                            z2 = false;
                            if (zCompareAndSet) {
                            }
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                            return zCompareAndSet;
                        }
                        if (i == 7) {
                            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                        }
                        zCompareAndSet = false;
                        z2 = true;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 10:
                        if (i == 9 || i == 11) {
                            zCompareAndSet = this._status.compareAndSet(i2, i);
                            if (zCompareAndSet) {
                                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            }
                            z2 = false;
                        } else {
                            zCompareAndSet = false;
                            z2 = true;
                        }
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 12:
                        if (i == 4) {
                            zCompareAndSet = this._status.compareAndSet(i2, 5);
                            if (zCompareAndSet) {
                                getEventListener().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            }
                        } else if (i != 6) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, 13);
                            if (zCompareAndSet) {
                                getEventListener().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                            }
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 13:
                        if (i != 4) {
                            switch (i) {
                                case 7:
                                    zCompareAndSet = this._status.compareAndSet(i2, 14);
                                    if (zCompareAndSet) {
                                        getEventListener().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                                    }
                                    break;
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, 6);
                            if (zCompareAndSet) {
                                getEventListener().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            }
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    case 14:
                        if (i != 4) {
                            switch (i) {
                                case 8:
                                    zCompareAndSet = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2);
                                    break;
                                case 9:
                                case 10:
                                    zCompareAndSet = this._status.compareAndSet(i2, i);
                                    break;
                                default:
                                    zCompareAndSet = false;
                                    break;
                            }
                        } else {
                            zCompareAndSet = this._status.compareAndSet(i2, 7);
                            if (zCompareAndSet) {
                                getEventListener().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            }
                        }
                        z2 = false;
                        if (zCompareAndSet) {
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("setStatus {} {}", Integer.valueOf(i), this);
                        return zCompareAndSet;
                    default:
                        throw new AssertionError(i2 + " => " + i);
                }
            } catch (IOException e) {
                e = e;
                c = 3;
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                return c;
            }
        } catch (IOException e2) {
            e = e2;
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return c;
        }
    }

    public void setTimeout(long j) {
        this._timeout = j;
    }

    @Deprecated
    public void setURI(String str) {
        setRequestURI(str);
    }

    public void setURL(String str) {
        setURI(URI.create(str));
    }

    public void setVersion(int i) {
        this._version = i;
    }

    public String toString() {
        int i;
        String str;
        String state = toState(getStatus());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this._lastStateChange;
        if (this._lastState >= 0) {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this._method, this._address, this._uri, toState(this._lastState), Integer.valueOf(this._lastStatePeriod), state, Long.valueOf(j));
            i = 3;
        } else {
            i = 3;
            str = String.format("%s@%x=%s//%s%s#%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this._method, this._address, this._uri, state, Long.valueOf(j));
        }
        return (getStatus() < i || this._sent <= 0) ? str : O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, "sent="), jCurrentTimeMillis - this._sent, "ms");
    }

    public int waitForDone() {
        int i;
        synchronized (this) {
            while (!isDone()) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            i = this._status.get();
        }
        return i;
    }

    @Deprecated
    public void waitForStatus(int i) {
        throw new UnsupportedOperationException();
    }

    public void setScheme(String str) {
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                setScheme(org.eclipse.jetty.http.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f4346O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            } else if ("https".equalsIgnoreCase(str)) {
                setScheme(org.eclipse.jetty.http.O00000OOoOOO00O00o0ooooooooO000ooooO0000.f4347O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            } else {
                setScheme(new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(str));
            }
        }
    }

    public void setURI(URI uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("!Absolute URI: " + uri);
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("Opaque URI: " + uri);
        }
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = LOG;
        if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("URI = {}", uri.toASCIIString());
        }
        String scheme = uri.getScheme();
        int port = uri.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(scheme) ? 443 : 80;
        }
        setScheme(scheme);
        setAddress(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(uri.getHost(), port));
        org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new org.eclipse.jetty.http.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(uri);
        int i = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4359O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        int i2 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4363O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i == i2 ? null : o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2 - i);
        if (strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
            strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = ServiceReference.DELIMITER;
        }
        setRequestURI(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
    }

    public void setVersion(String str) {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = org.eclipse.jetty.http.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(str);
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
            this._version = 10;
        } else {
            this._version = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1711O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        }
    }

    @Deprecated
    public boolean isDone(int i) {
        return isDone();
    }

    public void addRequestHeader(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        getRequestFields().O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
    }

    public void setRequestHeader(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        getRequestFields().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
    }
}
