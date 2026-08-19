package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresExtension;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresExtension(extension = 31, version = 7)
@UnstableApi
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private long bytesRemaining;
    private final Clock clock;
    private final int connectTimeoutMs;

    @Nullable
    private O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 contentTypePredicate;
    private volatile long currentConnectTimeoutMs;

    @Nullable
    private DataSpec currentDataSpec;

    @Nullable
    private UrlRequestWrapper currentUrlRequestWrapper;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private IOException exception;
    private final Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final HttpEngine httpEngine;
    private final boolean keepPostFor302Redirects;
    private final ConditionVariable operation;

    @Nullable
    private ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;

    @Nullable
    private UrlResponseInfo responseInfo;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {

        @Nullable
        private O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 contentTypePredicate;
        private final Executor executor;
        private boolean handleSetCookieRequests;
        private final HttpEngine httpEngine;
        private boolean keepPostFor302Redirects;
        private boolean resetTimeoutOnRedirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int requestPriority = 3;
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        public Factory(HttpEngine httpEngine, Executor executor) {
            this.httpEngine = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Assertions.checkNotNull(httpEngine));
            this.executor = executor;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setConnectionTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setContentTypePredicate(@Nullable O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
            this.contentTypePredicate = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setHandleSetCookieRequests(boolean z) {
            this.handleSetCookieRequests = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setRequestPriority(int i) {
            this.requestPriority = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setResetTimeoutOnRedirects(boolean z) {
            this.resetTimeoutOnRedirects = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public HttpDataSource createDataSource() {
            HttpEngineDataSource httpEngineDataSource = new HttpEngineDataSource(this.httpEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                httpEngineDataSource.addTransferListener(transferListener);
            }
            return httpEngineDataSource;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    public final class UrlRequestCallback implements UrlRequest.Callback {
        private volatile boolean isClosed = false;

        public UrlRequestCallback() {
        }

        public void close() {
            this.isClosed = true;
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onCanceled(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo) {
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onFailed(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (this.isClosed) {
                    return;
                }
                if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(httpException) && O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(httpException).getErrorCode() == 1) {
                    HttpEngineDataSource.this.exception = new UnknownHostException();
                } else {
                    HttpEngineDataSource.this.exception = httpException;
                }
                HttpEngineDataSource.this.operation.open();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (this.isClosed) {
                return;
            }
            DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(HttpEngineDataSource.this.currentDataSpec);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                HttpEngineDataSource.this.exception = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), dataSpec, Util.EMPTY_BYTE_ARRAY);
                HttpEngineDataSource.this.operation.open();
                return;
            }
            if (HttpEngineDataSource.this.resetTimeoutOnRedirects) {
                HttpEngineDataSource.this.resetConnectTimeout();
            }
            CookieHandler cookieManager = CookieHandler.getDefault();
            if (cookieManager == null && HttpEngineDataSource.this.handleSetCookieRequests) {
                cookieManager = new CookieManager();
            }
            String url = urlResponseInfo.getUrl();
            Map asMap = urlResponseInfo.getHeaders().getAsMap();
            HttpUtil.storeCookiesFromHeaders(url, asMap, cookieManager);
            String cookieHeader = HttpUtil.getCookieHeader(url, asMap, cookieManager);
            boolean z = HttpEngineDataSource.this.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302;
            if (!z && (!HttpEngineDataSource.this.handleSetCookieRequests || TextUtils.isEmpty(cookieHeader))) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest.cancel();
            DataSpec dataSpecWithUri = (z || dataSpec.httpMethod != 2) ? dataSpec.withUri(Uri.parse(str)) : dataSpec.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
            if (!TextUtils.isEmpty(cookieHeader)) {
                HashMap map = new HashMap();
                map.putAll(dataSpec.httpRequestHeaders);
                map.put(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_COOKIE, cookieHeader);
                dataSpecWithUri = dataSpecWithUri.buildUpon().setHttpRequestHeaders(map).build();
            }
            try {
                UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = HttpEngineDataSource.this.buildRequestWrapper(dataSpecWithUri);
                if (HttpEngineDataSource.this.currentUrlRequestWrapper != null) {
                    HttpEngineDataSource.this.currentUrlRequestWrapper.close();
                }
                HttpEngineDataSource.this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
                HttpEngineDataSource.this.currentUrlRequestWrapper.start();
            } catch (IOException e) {
                HttpEngineDataSource.this.exception = e;
            }
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpUtil.storeCookiesFromHeaders(urlResponseInfo.getUrl(), urlResponseInfo.getHeaders().getAsMap(), CookieHandler.getDefault());
            HttpEngineDataSource.this.responseInfo = urlResponseInfo;
            HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.finished = true;
            HttpEngineDataSource.this.operation.open();
        }
    }

    public static final class UrlRequestWrapper {
        private final UrlRequest urlRequest;
        private final UrlRequestCallback urlRequestCallback;

        public UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.urlRequest = urlRequest;
            this.urlRequestCallback = urlRequestCallback;
        }

        public void close() {
            this.urlRequestCallback.close();
            this.urlRequest.cancel();
        }

        public int getStatus() {
            final ConditionVariable conditionVariable = new ConditionVariable();
            final int[] iArr = new int[1];
            this.urlRequest.getStatus(new UrlRequest.StatusListener() { // from class: androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1
                @Override // android.net.http.UrlRequest.StatusListener
                public void onStatus(int i) {
                    iArr[0] = i;
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            return iArr[0];
        }

        public UrlRequestCallback getUrlRequestCallback() {
            return this.urlRequestCallback;
        }

        public void read(ByteBuffer byteBuffer) {
            this.urlRequest.read(byteBuffer);
        }

        public void start() {
            this.urlRequest.start();
        }
    }

    @UnstableApi
    public HttpEngineDataSource(HttpEngine httpEngine, Executor executor, int i, int i2, int i3, boolean z, boolean z2, @Nullable String str, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, boolean z3) {
        super(true);
        this.httpEngine = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Assertions.checkNotNull(httpEngine));
        this.executor = (Executor) Assertions.checkNotNull(executor);
        this.requestPriority = i;
        this.connectTimeoutMs = i2;
        this.readTimeoutMs = i3;
        this.resetTimeoutOnRedirects = z;
        this.handleSetCookieRequests = z2;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.keepPostFor302Redirects = z3;
        this.clock = Clock.DEFAULT;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.operation = new ConditionVariable();
    }

    private boolean blockUntilConnectTimeout() {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean zBlock = false;
        while (!zBlock && jElapsedRealtime < this.currentConnectTimeoutMs) {
            zBlock = this.operation.block((this.currentConnectTimeoutMs - jElapsedRealtime) + 5);
            jElapsedRealtime = this.clock.elapsedRealtime();
        }
        return zBlock;
    }

    private UrlRequest.Builder buildRequestBuilder(DataSpec dataSpec, UrlRequest.Callback callback) throws OpenException {
        UrlRequest.Builder directExecutorAllowed = this.httpEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.executor, callback).setPriority(this.requestPriority).setDirectExecutorAllowed(true);
        HashMap map = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.requestProperties.getSnapshot());
        map.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !map.containsKey("Content-Type")) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (strBuildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            directExecutorAllowed.addHeader("User-Agent", str);
        }
        directExecutorAllowed.setHttpMethod(dataSpec.getHttpMethodString());
        if (dataSpec.httpBody != null) {
            directExecutorAllowed.setUploadDataProvider(new ByteArrayUploadDataProvider(dataSpec.httpBody), this.executor);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UrlRequestWrapper buildRequestWrapper(DataSpec dataSpec) {
        UrlRequestCallback urlRequestCallback = new UrlRequestCallback();
        return new UrlRequestWrapper(buildRequestBuilder(dataSpec, urlRequestCallback).build(), urlRequestCallback);
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    @Nullable
    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.readBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        for (Map.Entry entry : urlResponseInfo.getHeaders().getAsList()) {
            if (((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                return !((String) entry.getValue()).equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private void readInternal(ByteBuffer byteBuffer, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        ((UrlRequestWrapper) Util.castNonNull(this.currentUrlRequestWrapper)).read(byteBuffer);
        try {
            if (!this.operation.block(this.readTimeoutMs)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            Thread.currentThread().interrupt();
            this.exception = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new HttpDataSource.HttpDataSourceException(e, dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2);
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource.HttpDataSourceException)) {
                throw HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
            }
            throw ((HttpDataSource.HttpDataSourceException) iOException);
        }
    }

    private byte[] readResponseBody() throws HttpDataSource.HttpDataSourceException {
        byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, orCreateReadBuffer.remaining() + bArrCopyOf.length);
                orCreateReadBuffer.get(bArrCopyOf, length, orCreateReadBuffer.remaining());
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + ((long) this.connectTimeoutMs);
    }

    private void skipFully(long j, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.finished) {
                    throw new OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                Assertions.checkState(orCreateReadBuffer.hasRemaining());
                int iMin = (int) Math.min(orCreateReadBuffer.remaining(), j);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + iMin);
                j -= (long) iMin;
            } catch (IOException e) {
                if (e instanceof HttpDataSource.HttpDataSourceException) {
                    throw ((HttpDataSource.HttpDataSourceException) e);
                }
                throw new OpenException(e, dataSpec, e instanceof SocketTimeoutException ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT : PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, 14);
            }
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public synchronized void close() {
        try {
            UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
            if (urlRequestWrapper != null) {
                urlRequestWrapper.close();
                this.currentUrlRequestWrapper = null;
            }
            ByteBuffer byteBuffer = this.readBuffer;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.currentDataSpec = null;
            this.responseInfo = null;
            this.exception = null;
            this.finished = false;
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    @VisibleForTesting
    @UnstableApi
    public UrlRequestCallback getCurrentUrlRequestCallback() {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper == null) {
            return null;
        }
        return urlRequestWrapper.getUrlRequestCallback();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.responseInfo.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        DataSpec dataSpec = this.currentDataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] responseBody;
        String firstHeader;
        Assertions.checkNotNull(dataSpec);
        Assertions.checkState(!this.transferStarted);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = buildRequestWrapper(dataSpec);
            this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
            urlRequestWrapperBuildRequestWrapper.start();
            transferInitializing(dataSpec);
            try {
                boolean zBlockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.exception;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(message).contains("err_cleartext_not_permitted")) {
                        throw new OpenException(iOException, dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, urlRequestWrapperBuildRequestWrapper.getStatus());
                    }
                    throw new HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                }
                if (!zBlockUntilConnectTimeout) {
                    throw new OpenException(new SocketTimeoutException(), dataSpec, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, urlRequestWrapperBuildRequestWrapper.getStatus());
                }
                UrlResponseInfo urlResponseInfoO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Assertions.checkNotNull(this.responseInfo));
                int httpStatusCode = urlResponseInfoO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getHttpStatusCode();
                Map asMap = urlResponseInfoO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getHeaders().getAsMap();
                long j = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == HttpUtil.getDocumentSize(getFirstHeader(asMap, O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_CONTENT_RANGE))) {
                            this.transferStarted = true;
                            transferStarted(dataSpec);
                            long j2 = dataSpec.length;
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    try {
                        responseBody = readResponseBody();
                    } catch (IOException unused) {
                        responseBody = Util.EMPTY_BYTE_ARRAY;
                    }
                    throw new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfoO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getHttpStatusText(), httpStatusCode == 416 ? new DataSourceException(2008) : null, asMap, dataSpec, responseBody);
                }
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.contentTypePredicate;
                if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(firstHeader)) {
                    throw new HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200) {
                    long j3 = dataSpec.position;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                if (isCompressed(urlResponseInfoO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo)) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long j4 = dataSpec.length;
                    if (j4 != -1) {
                        this.bytesRemaining = j4;
                    } else {
                        long contentLength = HttpUtil.getContentLength(getFirstHeader(asMap, "Content-Length"), getFirstHeader(asMap, O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_CONTENT_RANGE));
                        this.bytesRemaining = contentLength != -1 ? contentLength - j : -1L;
                    }
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                skipFully(j, dataSpec);
                return this.bytesRemaining;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new OpenException(new InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (IOException e) {
            if (e instanceof HttpDataSource.HttpDataSourceException) {
                throw ((HttpDataSource.HttpDataSourceException) e);
            }
            throw new OpenException(e, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        Assertions.checkState(this.transferStarted);
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            Assertions.checkState(orCreateReadBuffer.hasRemaining());
        }
        long j = this.bytesRemaining;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long[] jArr = {j, orCreateReadBuffer.remaining(), i2};
        long j2 = jArr[0];
        for (int i3 = 1; i3 < 3; i3++) {
            long j3 = jArr[i3];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i4 = (int) j2;
        orCreateReadBuffer.get(bArr, i, i4);
        long j4 = this.bytesRemaining;
        if (j4 != -1) {
            this.bytesRemaining = j4 - ((long) i4);
        }
        bytesTransferred(i4);
        return i4;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        this.requestProperties.set(str, str2);
    }

    @UnstableApi
    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
        public final int httpEngineConnectionStatus;

        public OpenException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }

        public OpenException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }

        public OpenException(DataSpec dataSpec, int i, int i2) {
            super(dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }
    }

    @UnstableApi
    public int read(ByteBuffer byteBuffer) throws HttpDataSource.HttpDataSourceException {
        int iCopyByteBuffer;
        Assertions.checkState(this.transferStarted);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.bytesRemaining == 0) {
                return -1;
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.readBuffer;
            if (byteBuffer2 != null && (iCopyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j = this.bytesRemaining;
                if (j != -1) {
                    this.bytesRemaining = j - ((long) iCopyByteBuffer);
                }
                bytesTransferred(iCopyByteBuffer);
                return iCopyByteBuffer;
            }
            this.operation.close();
            readInternal(byteBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            Assertions.checkState(iRemaining > byteBuffer.remaining());
            int iRemaining2 = iRemaining - byteBuffer.remaining();
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - ((long) iRemaining2);
            }
            bytesTransferred(iRemaining2);
            return iRemaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
