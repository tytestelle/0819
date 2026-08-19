package okhttp3;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    @Nullable
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        MediaType mediaTypeContentType = contentType();
        return mediaTypeContentType != null ? mediaTypeContentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        Buffer bufferWriteString = new Buffer().writeString(str, charset);
        return create(mediaType, bufferWriteString.size(), bufferWriteString);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            Util.closeQuietly(bufferedSourceSource);
            if (jContentLength == -1 || jContentLength == byteArray.length) {
                return byteArray;
            }
            throw new IOException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(jContentLength, "Content-Length (", ") and stream length ("), ") disagree", byteArray.length));
        } catch (Throwable th) {
            Util.closeQuietly(bufferedSourceSource);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() {
        BufferedSource bufferedSourceSource = source();
        try {
            return bufferedSourceSource.readString(Util.bomAwareCharset(bufferedSourceSource, charset()));
        } finally {
            Util.closeQuietly(bufferedSourceSource);
        }
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new Buffer().write(bArr));
    }

    public static ResponseBody create(@Nullable MediaType mediaType, ByteString byteString) {
        return create(mediaType, byteString.size(), new Buffer().write(byteString));
    }

    public static ResponseBody create(@Nullable final MediaType mediaType, final long j, final BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody.1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
