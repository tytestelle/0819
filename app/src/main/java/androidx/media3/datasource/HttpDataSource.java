package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends DataSource {

    @UnstableApi
    public static final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 REJECT_PAYWALL_TYPES = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(2);

    @UnstableApi
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        public abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        @UnstableApi
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1);
        }
    }

    public interface Factory extends DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        /* bridge */ /* synthetic */ DataSource createDataSource();

        @Override // androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        HttpDataSource createDataSource();

        @UnstableApi
        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;

        @UnstableApi
        public final DataSpec dataSpec;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i) {
            this(dataSpec, 2000, i);
        }

        private static int assignErrorCode(int i, int i2) {
            return (i == 2000 && i2 == 1) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i;
        }

        @UnstableApi
        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(message).matches("cleartext.*not permitted.*")) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED;
            }
            return i2 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i2, i);
        }

        @UnstableApi
        public HttpDataSourceException(DataSpec dataSpec, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i) {
            this(str, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            this(iOException, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i) {
            this(str, iOException, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(String str, @Nullable IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        @UnstableApi
        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid content type: ", str), dataSpec, PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        @UnstableApi
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;

        @Nullable
        public final String responseMessage;

        @UnstableApi
        public InvalidResponseCodeException(int i, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Response code: "), iOException, dataSpec, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    @UnstableApi
    void clearAllRequestProperties();

    @UnstableApi
    void clearRequestProperty(String str);

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    void close();

    @UnstableApi
    int getResponseCode();

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    Map<String, List<String>> getResponseHeaders();

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    long open(DataSpec dataSpec);

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    int read(byte[] bArr, int i, int i2);

    @UnstableApi
    void setRequestProperty(String str, String str2);

    @UnstableApi
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();

        @Nullable
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
