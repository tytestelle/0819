package okhttp3.internal.http2;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode;
    private boolean hasResponseHeaders;
    private Header.Listener headersListener;
    private final Deque<Headers> headersQueue;
    final int id;
    final StreamTimeout readTimeout;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout;

    public final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        public FramingSink() {
        }

        private void emitFrame(boolean z) throws IOException {
            Http2Stream http2Stream;
            long jMin;
            Http2Stream http2Stream2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (true) {
                    try {
                        http2Stream = Http2Stream.this;
                        if (http2Stream.bytesLeftInWriteWindow > 0 || this.finished || this.closed || http2Stream.errorCode != null) {
                            break;
                        } else {
                            http2Stream.waitForIo();
                        }
                    } catch (Throwable th) {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                jMin = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                http2Stream2 = Http2Stream.this;
                http2Stream2.bytesLeftInWriteWindow -= jMin;
            }
            http2Stream2.writeTimeout.enter();
            try {
                Http2Stream http2Stream3 = Http2Stream.this;
                http2Stream3.connection.writeData(http2Stream3.id, z && jMin == this.sendBuffer.size(), this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Http2Stream.this) {
                try {
                    if (this.closed) {
                        return;
                    }
                    if (!Http2Stream.this.sink.finished) {
                        if (this.sendBuffer.size() > 0) {
                            while (this.sendBuffer.size() > 0) {
                                emitFrame(true);
                            }
                        } else {
                            Http2Stream http2Stream = Http2Stream.this;
                            http2Stream.connection.writeData(http2Stream.id, true, null, 0L);
                        }
                    }
                    synchronized (Http2Stream.this) {
                        this.closed = true;
                    }
                    Http2Stream.this.connection.flush();
                    Http2Stream.this.cancelStreamIfNecessary();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            this.sendBuffer.write(buffer, j);
            while (this.sendBuffer.size() >= 16384) {
                emitFrame(false);
            }
        }
    }

    public final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j) {
            this.maxByteCount = j;
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            ArrayList arrayList;
            Header.Listener listener;
            synchronized (Http2Stream.this) {
                try {
                    this.closed = true;
                    size = this.readBuffer.size();
                    this.readBuffer.clear();
                    if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                        arrayList = null;
                        listener = null;
                    } else {
                        arrayList = new ArrayList(Http2Stream.this.headersQueue);
                        Http2Stream.this.headersQueue.clear();
                        listener = Http2Stream.this.headersListener;
                    }
                    Http2Stream.this.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listener.onHeaders((Headers) it.next());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x00cb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
        @Override // okio.Source
        public long read(Buffer buffer, long j) throws StreamResetException {
            long j2;
            Headers headers;
            Header.Listener listener;
            if (j < 0) {
                throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("byteCount < 0: ", j));
            }
            while (true) {
                synchronized (Http2Stream.this) {
                    try {
                        Http2Stream.this.readTimeout.enter();
                        try {
                            Http2Stream http2Stream = Http2Stream.this;
                            ErrorCode errorCode = http2Stream.errorCode;
                            if (errorCode == null) {
                                errorCode = null;
                            }
                            if (this.closed) {
                                throw new IOException("stream closed");
                            }
                            if (!http2Stream.headersQueue.isEmpty() && Http2Stream.this.headersListener != null) {
                                headers = (Headers) Http2Stream.this.headersQueue.removeFirst();
                                listener = Http2Stream.this.headersListener;
                            } else if (this.readBuffer.size() > 0) {
                                Buffer buffer2 = this.readBuffer;
                                j2 = buffer2.read(buffer, Math.min(j, buffer2.size()));
                                Http2Stream http2Stream2 = Http2Stream.this;
                                long j3 = http2Stream2.unacknowledgedBytesRead + j2;
                                http2Stream2.unacknowledgedBytesRead = j3;
                                if (errorCode == null && j3 >= http2Stream2.connection.okHttpSettings.getInitialWindowSize() / 2) {
                                    Http2Stream http2Stream3 = Http2Stream.this;
                                    http2Stream3.connection.writeWindowUpdateLater(http2Stream3.id, http2Stream3.unacknowledgedBytesRead);
                                    Http2Stream.this.unacknowledgedBytesRead = 0L;
                                }
                                headers = null;
                                listener = null;
                                Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                if (headers != null || listener == null) {
                                    if (j2 != -1) {
                                        updateConnectionFlowControl(j2);
                                        return j2;
                                    }
                                    if (errorCode == null) {
                                        return -1L;
                                    }
                                    throw new StreamResetException(errorCode);
                                }
                                listener.onHeaders(headers);
                            } else if (this.finished || errorCode != null) {
                                headers = null;
                                listener = null;
                            } else {
                                Http2Stream.this.waitForIo();
                                Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                            }
                            j2 = -1;
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                            if (headers != null) {
                            }
                            if (j2 != -1) {
                                updateConnectionFlowControl(j2);
                                return j2;
                            }
                            if (errorCode == null) {
                                return -1L;
                            }
                            throw new StreamResetException(errorCode);
                        } catch (Throwable th) {
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public void receive(BufferedSource bufferedSource, long j) throws EOFException {
            boolean z;
            boolean z2;
            long size;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = this.readBuffer.size() + j > this.maxByteCount;
                }
                if (z2) {
                    bufferedSource.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long j2 = bufferedSource.read(this.receiveBuffer, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (Http2Stream.this) {
                    try {
                        if (this.closed) {
                            size = this.receiveBuffer.size();
                            this.receiveBuffer.clear();
                        } else {
                            boolean z3 = this.readBuffer.size() == 0;
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z3) {
                                Http2Stream.this.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size > 0) {
                    updateConnectionFlowControl(size);
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    public class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.connection.sendDegradedPingLater();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        this.errorCode = null;
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        }
        this.id = i;
        this.connection = http2Connection;
        this.bytesLeftInWriteWindow = http2Connection.peerSettings.getInitialWindowSize();
        FramingSource framingSource = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize());
        this.source = framingSource;
        FramingSink framingSink = new FramingSink();
        this.sink = framingSink;
        framingSource.finished = z2;
        framingSink.finished = z;
        if (headers != null) {
            arrayDeque.add(headers);
        }
        if (isLocallyInitiated() && headers != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!isLocallyInitiated() && headers == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            try {
                if (this.errorCode != null) {
                    return false;
                }
                if (this.source.finished && this.sink.finished) {
                    return false;
                }
                this.errorCode = errorCode;
                notifyAll();
                this.connection.removeStream(this.id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    public void cancelStreamIfNecessary() {
        boolean z;
        boolean zIsOpen;
        synchronized (this) {
            try {
                FramingSource framingSource = this.source;
                if (framingSource.finished || !framingSource.closed) {
                    z = false;
                } else {
                    FramingSink framingSink = this.sink;
                    if (framingSink.finished || framingSink.closed) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zIsOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream(this.id);
        }
    }

    public void checkOutNotClosed() throws IOException {
        FramingSink framingSink = this.sink;
        if (framingSink.closed) {
            throw new IOException("stream closed");
        }
        if (framingSink.finished) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public void close(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.id, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.id, errorCode);
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.id;
    }

    public Sink getSink() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    public Source getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        return this.connection.client == ((this.id & 1) == 1);
    }

    public synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            FramingSource framingSource = this.source;
            if (framingSource.finished || framingSource.closed) {
                FramingSink framingSink = this.sink;
                if ((framingSink.finished || framingSink.closed) && this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(BufferedSource bufferedSource, int i) throws EOFException {
        this.source.receive(bufferedSource, i);
    }

    public void receiveFin() {
        boolean zIsOpen;
        synchronized (this) {
            this.source.finished = true;
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream(this.id);
    }

    public void receiveHeaders(List<Header> list) {
        boolean zIsOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream(this.id);
    }

    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Header.Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    public synchronized Headers takeHeaders() {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            throw new StreamResetException(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (list == null) {
            throw new NullPointerException("headers == null");
        }
        synchronized (this) {
            z2 = true;
            try {
                this.hasResponseHeaders = true;
                if (z) {
                    z3 = false;
                    z4 = false;
                } else {
                    this.sink.finished = true;
                    z3 = true;
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            synchronized (this.connection) {
                if (this.connection.bytesLeftInWriteWindow != 0) {
                    z2 = false;
                }
            }
            z3 = z2;
        }
        this.connection.writeSynReply(this.id, z4, list);
        if (z3) {
            this.connection.flush();
        }
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
