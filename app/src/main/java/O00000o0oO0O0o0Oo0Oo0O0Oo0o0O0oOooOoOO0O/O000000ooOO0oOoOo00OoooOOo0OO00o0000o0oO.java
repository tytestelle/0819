package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ByteBuffer f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ByteBuffer.allocate(8);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.position(0);
            messageDigest.update(this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.putLong(l.longValue()).array());
        }
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() << 8) | O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public short O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        ByteBuffer byteBuffer = this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public int read(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(ByteBuffer byteBuffer) {
        this.f586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
