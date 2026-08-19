package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final ByteBuffer f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public ReadableByteChannel f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public InputStream f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public WritableByteChannel f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public OutputStream f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getName());
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        super(2, false);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = byteBufferAllocateDirect;
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(byteBufferAllocateDirect.capacity());
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.capacity();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, int i3, byte[] bArr) {
        if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            throw new IllegalStateException("READONLY");
        }
        if (i < 0) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "index<0: ", "<0"));
        }
        int i4 = i + i3;
        ByteBuffer byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (i4 > byteBuffer.capacity() && (i3 = byteBuffer.capacity() - i) < 0) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "index>capacity(): ", ">");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(byteBuffer.capacity());
            throw new IllegalArgumentException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        try {
            byteBuffer.position(i);
            int iRemaining = byteBuffer.remaining();
            if (i3 > iRemaining) {
                i3 = iRemaining;
            }
            if (i3 > 0) {
                byteBuffer.put(bArr, i2, i3);
            }
            return i3;
        } finally {
            byteBuffer.position(0);
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(OutputStream outputStream) {
        int iWrite;
        WritableByteChannel writableByteChannel = this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        if (writableByteChannel == null || !writableByteChannel.isOpen() || outputStream != this.f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = Channels.newChannel(outputStream);
            this.f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000 = outputStream;
        }
        synchronized (this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            loop0: while (true) {
                int i = 0;
                while (true) {
                    try {
                        try {
                            try {
                                if (!O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() || !this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.isOpen()) {
                                    break loop0;
                                }
                                this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.position(this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.limit(this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                iWrite = this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.write(this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                                if (iWrite < 0) {
                                    break loop0;
                                }
                                if (iWrite > 0) {
                                    break;
                                }
                                int i2 = i + 1;
                                if (i > 1) {
                                    break loop0;
                                } else {
                                    i = i2;
                                }
                            } catch (IOException e) {
                                this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                                this.f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
                                throw e;
                            }
                        } catch (Throwable th) {
                            WritableByteChannel writableByteChannel2 = this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                            if (writableByteChannel2 != null && !writableByteChannel2.isOpen()) {
                                this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                                this.f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
                            }
                            this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.position(0);
                            ByteBuffer byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            byteBuffer.limit(byteBuffer.capacity());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iWrite);
            }
            WritableByteChannel writableByteChannel3 = this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (writableByteChannel3 != null && !writableByteChannel3.isOpen()) {
                this.f1752O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
                this.f1753O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
            }
            this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.position(0);
            ByteBuffer byteBuffer2 = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            byteBuffer2.limit(byteBuffer2.capacity());
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final byte O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        return this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.get(i);
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final byte[] O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return null;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        ByteBuffer byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if ((i4 > byteBuffer.capacity() && (i3 = byteBuffer.capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        try {
            byteBuffer.position(i);
            byteBuffer.get(bArr, i2, i3);
            return i3;
        } finally {
            byteBuffer.position(0);
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i, byte b) {
        if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            throw new IllegalStateException("READONLY");
        }
        if (i < 0) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "index<0: ", "<0"));
        }
        ByteBuffer byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (i <= byteBuffer.capacity()) {
            byteBuffer.put(i, b);
        } else {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "index>capacity(): ", ">");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(byteBuffer.capacity());
            throw new IllegalArgumentException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(InputStream inputStream, int i) {
        ByteBuffer byteBuffer;
        ReadableByteChannel readableByteChannel = this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (readableByteChannel == null || !readableByteChannel.isOpen() || inputStream != this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = Channels.newChannel(inputStream);
            this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
        }
        if (i < 0 || i > O00000OOoOOO00O00o0ooooooooO000ooooO0000()) {
            i = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        }
        int i2 = this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        do {
            byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            if (i4 >= i) {
                break;
            }
            try {
                try {
                    byteBuffer.position(i2);
                    byteBuffer.limit(i2 + i3);
                    i6 = this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.read(byteBuffer);
                    if (i6 < 0) {
                        this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                        this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
                        break;
                    }
                    if (i6 > 0) {
                        i2 += i6;
                        i4 += i6;
                        i3 -= i6;
                        O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(i2);
                        i5 = 0;
                    } else {
                        int i7 = i5 + 1;
                        if (i5 > 1) {
                            break;
                        }
                        i5 = i7;
                    }
                } catch (IOException e) {
                    this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                    this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
                    throw e;
                }
            } catch (Throwable th) {
                ReadableByteChannel readableByteChannel2 = this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (readableByteChannel2 != null && !readableByteChannel2.isOpen()) {
                    this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                    this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
                }
                byteBuffer.position(0);
                byteBuffer.limit(byteBuffer.capacity());
                throw th;
            }
        } while (inputStream.available() > 0);
        if (i6 >= 0 || i4 != 0) {
            ReadableByteChannel readableByteChannel3 = this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (readableByteChannel3 != null && !readableByteChannel3.isOpen()) {
                this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
            }
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            return i4;
        }
        ReadableByteChannel readableByteChannel4 = this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (readableByteChannel4 != null && !readableByteChannel4.isOpen()) {
            this.f1750O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            this.f1751O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = inputStream;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        return -1;
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final ByteBuffer O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        return this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            throw new IllegalStateException("READONLY");
        }
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer();
        int i2 = 0;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            ByteBuffer byteBufferDuplicate = ((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer).f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            ByteBuffer byteBuffer = this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            if (byteBufferDuplicate == byteBuffer) {
                byteBufferDuplicate = byteBuffer.duplicate();
            }
            try {
                byteBuffer.position(i);
                int iRemaining = byteBuffer.remaining();
                int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                if (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O <= iRemaining) {
                    iRemaining = iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                }
                byteBufferDuplicate.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                byteBufferDuplicate.limit(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + iRemaining);
                byteBuffer.put(byteBufferDuplicate);
                return iRemaining;
            } finally {
                byteBuffer.position(0);
                byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
                byteBufferDuplicate.position(0);
            }
        }
        this.f1696O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        if (i + iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 > O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() - i;
        }
        byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        if (bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 != null) {
            int i3 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            while (i2 < iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2) {
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i, bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2[i3]);
                i2++;
                i++;
                i3++;
            }
        } else {
            int i4 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            while (i2 < iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2) {
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i4));
                i2++;
                i++;
                i4++;
            }
        }
        return iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2;
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ByteBuffer byteBuffer) {
        super(0, false);
        if (byteBuffer.isDirect()) {
            this.f1749O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = byteBuffer;
            O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(byteBuffer.position());
            O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(byteBuffer.limit());
            return;
        }
        throw new IllegalArgumentException();
    }
}
