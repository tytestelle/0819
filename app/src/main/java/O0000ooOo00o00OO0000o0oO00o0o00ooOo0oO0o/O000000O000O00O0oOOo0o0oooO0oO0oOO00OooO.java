package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O00000OOoOOO00O00o0ooooooooO000ooooO0000 {

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final SocketChannel f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ByteBuffer[] f1742O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ByteBuffer[2];

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Socket f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final InetSocketAddress f1744O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final InetSocketAddress f1745O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public volatile int f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public volatile boolean f1747O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public volatile boolean f1748O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class.getName());
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(SocketChannel socketChannel, int i) throws SocketException {
        this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = socketChannel;
        this.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
        Socket socket = socketChannel instanceof SocketChannel ? socketChannel.socket() : null;
        this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = socket;
        if (socket == null) {
            this.f1745O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
            this.f1744O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        } else {
            this.f1744O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (InetSocketAddress) socket.getLocalSocketAddress();
            this.f1745O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (InetSocketAddress) socket.getRemoteSocketAddress();
            socket.setSoTimeout(this.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        Socket socket;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("ishut {}", this);
        this.f1747O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
        if (!this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen() || (socket = this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) == null) {
            return;
        }
        try {
            if (!socket.isInputShutdown()) {
                this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.shutdownInput();
            }
        } catch (SocketException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(e.toString(), new Object[0]);
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
        } finally {
            if (this.f1748O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                close();
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        SocketChannel socketChannel = this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return !(socketChannel instanceof SelectableChannel) || socketChannel.isBlocking();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        if (this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f1744O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || inetSocketAddress.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        return this.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        Socket socket;
        return this.f1748O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo || !this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen() || ((socket = this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null && socket.isOutputShutdown());
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        Socket socket;
        return this.f1747O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || !this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen() || ((socket = this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null && socket.isInputShutdown());
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        Socket socket;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("oshut {}", this);
        this.f1748O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
        if (!this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen() || (socket = this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) == null) {
            return;
        }
        try {
            if (!socket.isOutputShutdown()) {
                this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.shutdownOutput();
            }
        } catch (SocketException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(e.toString(), new Object[0]);
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
        } finally {
            if (this.f1747O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                close();
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public int O00000OOoOOO00O00o0ooooooooO000ooooO0000(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        int iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null ? null : o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer();
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null ? o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.buffer() : null;
        int iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 = 0;
        if (!(this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof GatheringByteChannel) || o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null || ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0 || !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) || o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 == null || ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0 || !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer2 instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() > 0) {
                iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            }
            iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = ((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null || ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0) && o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() > 0) ? O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) + iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 : iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1;
            if ((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null || ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0) && o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null) {
                ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
            }
        } else {
            ByteBuffer byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            ByteBuffer byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer2).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            synchronized (this) {
                try {
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    byteBufferAsReadOnlyBuffer.limit(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer2.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    byteBufferAsReadOnlyBuffer2.limit(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    ByteBuffer[] byteBufferArr = this.f1742O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    byteBufferArr[0] = byteBufferAsReadOnlyBuffer;
                    byteBufferArr[1] = byteBufferAsReadOnlyBuffer2;
                    iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = (int) this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.write(byteBufferArr);
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                    if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.clear();
                        ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 - iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                    } else if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > 0) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        InetSocketAddress inetSocketAddress;
        if (this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null || (inetSocketAddress = this.f1745O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int getLocalPort() {
        if (this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this.f1744O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final Object getTransport() {
        return this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean isOpen() {
        return this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void flush() {
    }
}
