package okio;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc = new CRC32();
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final BufferedSink sink;

    public GzipSink(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink);
        this.sink = bufferedSinkBuffer;
        this.deflaterSink = new DeflaterSink(bufferedSinkBuffer, deflater);
        writeHeader();
    }

    private void updateCrc(Buffer buffer, long j) {
        Segment segment = buffer.head;
        while (j > 0) {
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j -= (long) iMin;
            segment = segment.next;
        }
    }

    private void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    private void writeHeader() {
        Buffer buffer = this.sink.buffer();
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.deflaterSink.finishDeflate();
        writeFooter();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.deflaterSink.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("byteCount < 0: ", j));
        }
        if (j == 0) {
            return;
        }
        updateCrc(buffer, j);
        this.deflaterSink.write(buffer, j);
    }
}
