package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ByteBuffer f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ByteBuffer.allocate(4);
    }

    public short O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        ByteBuffer byteBuffer = this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.position(0);
            messageDigest.update(this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.putInt(num.intValue()).array());
        }
    }

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(byte[] bArr, int i) {
        this.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }
}
