package okhttp3.dnsoverhttps;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer;
import okio.ByteString;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
class DnsRecordCodec {
    private static final Charset ASCII = StandardCharsets.US_ASCII;
    private static final byte NXDOMAIN = 3;
    private static final byte SERVFAIL = 2;
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    private static final int TYPE_PTR = 12;

    private DnsRecordCodec() {
    }

    public static List<InetAddress> decodeAnswers(String str, ByteString byteString) throws EOFException, UnknownHostException {
        ArrayList arrayList = new ArrayList();
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.readShort();
        short s = buffer.readShort();
        if (((s & ISelectionInterface.HELD_NOTHING) >> 15) == 0) {
            throw new IllegalArgumentException("not a response");
        }
        byte b = (byte) (s & 15);
        if (b == 3) {
            throw new UnknownHostException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, ": NXDOMAIN"));
        }
        if (b == 2) {
            throw new UnknownHostException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, ": SERVFAIL"));
        }
        int i = buffer.readShort() & ISelectionInterface.HELD_NOTHING;
        int i2 = buffer.readShort() & ISelectionInterface.HELD_NOTHING;
        buffer.readShort();
        buffer.readShort();
        for (int i3 = 0; i3 < i; i3++) {
            skipName(buffer);
            buffer.readShort();
            buffer.readShort();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            skipName(buffer);
            int i5 = buffer.readShort() & ISelectionInterface.HELD_NOTHING;
            buffer.readShort();
            buffer.readInt();
            int i6 = buffer.readShort() & ISelectionInterface.HELD_NOTHING;
            if (i5 == 1 || i5 == 28) {
                byte[] bArr = new byte[i6];
                buffer.read(bArr);
                arrayList.add(InetAddress.getByAddress(bArr));
            } else {
                buffer.skip(i6);
            }
        }
        return arrayList;
    }

    public static ByteString encodeQuery(String str, int i) {
        Buffer buffer = new Buffer();
        buffer.writeShort(0);
        buffer.writeShort(256);
        buffer.writeShort(1);
        buffer.writeShort(0);
        buffer.writeShort(0);
        buffer.writeShort(0);
        Buffer buffer2 = new Buffer();
        for (String str2 : str.split("\\.")) {
            long size = Utf8.size(str2);
            if (size != str2.length()) {
                throw new IllegalArgumentException("non-ascii hostname: ".concat(str));
            }
            buffer2.writeByte((int) ((byte) size));
            buffer2.writeUtf8(str2);
        }
        buffer2.writeByte(0);
        buffer2.copyTo(buffer, 0L, buffer2.size());
        buffer.writeShort(i);
        buffer.writeShort(1);
        return buffer.readByteString();
    }

    private static void skipName(Buffer buffer) throws EOFException {
        byte b = buffer.readByte();
        if (b < 0) {
            buffer.skip(1L);
            return;
        }
        while (b > 0) {
            buffer.skip(b);
            b = buffer.readByte();
        }
    }
}
