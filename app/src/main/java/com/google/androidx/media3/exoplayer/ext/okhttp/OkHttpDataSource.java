package com.google.androidx.media3.exoplayer.ext.okhttp;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpUtil;
import androidx.media3.datasource.TransferListener;
import com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class OkHttpDataSource extends BaseDataSource implements HttpDataSource {
    private long bytesRead;
    private long bytesToRead;

    @Nullable
    private final CacheControl cacheControl;
    private final Call.Factory callFactory;

    @Nullable
    private O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 contentTypePredicate;

    @Nullable
    private DataSpec dataSpec;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private boolean opened;
    private final HttpDataSource.RequestProperties requestProperties;

    @Nullable
    private Response response;

    @Nullable
    private InputStream responseByteStream;

    @Nullable
    private final String userAgent;

    @UnstableApi
    public static final class Factory implements HttpDataSource.Factory {

        @Nullable
        private CacheControl cacheControl;
        private final Call.Factory callFactory;

        @Nullable
        private O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 contentTypePredicate;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;

        public Factory(Call.Factory factory) {
            this.callFactory = factory;
        }

        public Factory setCacheControl(@Nullable CacheControl cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        public Factory setContentTypePredicate(@Nullable O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
            this.contentTypePredicate = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public OkHttpDataSource createDataSource() {
            OkHttpDataSource okHttpDataSource = new OkHttpDataSource(this.callFactory, this.userAgent, this.cacheControl, this.defaultRequestProperties, this.contentTypePredicate, 0);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                okHttpDataSource.addTransferListener(transferListener);
            }
            return okHttpDataSource;
        }
    }

    static {
        MediaLibraryInfo.registerModule("goog.exo.okhttp");
    }

    public /* synthetic */ OkHttpDataSource(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.RequestProperties requestProperties, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, int i) {
        this(factory, str, cacheControl, requestProperties, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
    }

    private void closeConnectionQuietly() {
        Response response = this.response;
        if (response != null) {
            ((ResponseBody) Assertions.checkNotNull(response.body())).close();
            this.response = null;
        }
        this.responseByteStream = null;
    }

    private Request makeRequest(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        HttpUrl httpUrl = HttpUrl.parse(dataSpec.uri.toString());
        if (httpUrl == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", dataSpec, 1004, 1);
        }
        Request.Builder builderUrl = new Request.Builder().url(httpUrl);
        CacheControl cacheControl = this.cacheControl;
        if (cacheControl != null) {
            builderUrl.cacheControl(cacheControl);
        }
        HashMap map = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.requestProperties.getSnapshot());
        map.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : map.entrySet()) {
            builderUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j, j2);
        if (strBuildRangeRequestHeader != null) {
            builderUrl.addHeader("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            builderUrl.addHeader("User-Agent", str);
        }
        if (!dataSpec.isFlagSet(1)) {
            builderUrl.addHeader(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_ACCEPT_ENCODING, "identity");
        }
        byte[] bArr = dataSpec.httpBody;
        RequestBody requestBodyCreate = null;
        if (bArr != null) {
            requestBodyCreate = RequestBody.create((MediaType) null, bArr);
        } else if (dataSpec.httpMethod == 2) {
            requestBodyCreate = RequestBody.create((MediaType) null, Util.EMPTY_BYTE_ARRAY);
        }
        builderUrl.method(dataSpec.getHttpMethodString(), requestBodyCreate);
        return builderUrl.build();
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) Util.castNonNull(this.responseByteStream)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.bytesRead += (long) i3;
        bytesTransferred(i3);
        return i3;
    }

    private void skipFully(long j, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int i = ((InputStream) Util.castNonNull(this.responseByteStream)).read(bArr, 0, (int) Math.min(j, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
                }
                j -= (long) i;
                bytesTransferred(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource.HttpDataSourceException)) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2000, 1);
                }
                throw ((HttpDataSource.HttpDataSourceException) e);
            }
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
            closeConnectionQuietly();
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        Response response = this.response;
        if (response == null) {
            return -1;
        }
        return response.code();
    }

    @Override // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        Response response = this.response;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        Response response = this.response;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().toString());
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] byteArray;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            Response responseExecute = this.callFactory.newCall(makeRequest(dataSpec)).execute();
            this.response = responseExecute;
            ResponseBody responseBody = (ResponseBody) Assertions.checkNotNull(responseExecute.body());
            this.responseByteStream = responseBody.byteStream();
            int iCode = responseExecute.code();
            if (!responseExecute.isSuccessful()) {
                if (iCode == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(responseExecute.headers().get(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_CONTENT_RANGE))) {
                        this.opened = true;
                        transferStarted(dataSpec);
                        long j2 = dataSpec.length;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                try {
                    byteArray = Util.toByteArray((InputStream) Assertions.checkNotNull(this.responseByteStream));
                } catch (IOException unused) {
                    byteArray = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = byteArray;
                Map<String, List<String>> multimap = responseExecute.headers().toMultimap();
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidResponseCodeException(iCode, responseExecute.message(), iCode == 416 ? new DataSourceException(2008) : null, multimap, dataSpec, bArr);
            }
            MediaType mediaTypeContentType = responseBody.contentType();
            String string = mediaTypeContentType != null ? mediaTypeContentType.toString() : "";
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.contentTypePredicate;
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null && !o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.apply(string)) {
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidContentTypeException(string, dataSpec);
            }
            if (iCode == 200) {
                long j3 = dataSpec.position;
                if (j3 != 0) {
                    j = j3;
                }
            }
            long j4 = dataSpec.length;
            if (j4 != -1) {
                this.bytesToRead = j4;
            } else {
                long jContentLength = responseBody.contentLength();
                this.bytesToRead = jContentLength != -1 ? jContentLength - j : -1L;
            }
            this.opened = true;
            transferStarted(dataSpec);
            try {
                skipFully(j, dataSpec);
                return this.bytesToRead;
            } catch (HttpDataSource.HttpDataSourceException e) {
                closeConnectionQuietly();
                throw e;
            }
        } catch (IOException e2) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e2, dataSpec, 1);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(@Nullable O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.contentTypePredicate = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    @Deprecated
    public OkHttpDataSource(Call.Factory factory) {
        this(factory, null);
    }

    @Deprecated
    public OkHttpDataSource(Call.Factory factory, @Nullable String str) {
        this(factory, str, null, null);
    }

    @Deprecated
    public OkHttpDataSource(Call.Factory factory, @Nullable String str, @Nullable CacheControl cacheControl, @Nullable HttpDataSource.RequestProperties requestProperties) {
        this(factory, str, cacheControl, requestProperties, null);
    }

    @OptIn(markerClass = {UnstableApi.class})
    private OkHttpDataSource(Call.Factory factory, @Nullable String str, @Nullable CacheControl cacheControl, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        super(true);
        this.callFactory = (Call.Factory) Assertions.checkNotNull(factory);
        this.userAgent = str;
        this.cacheControl = cacheControl;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.requestProperties = new HttpDataSource.RequestProperties();
    }
}
