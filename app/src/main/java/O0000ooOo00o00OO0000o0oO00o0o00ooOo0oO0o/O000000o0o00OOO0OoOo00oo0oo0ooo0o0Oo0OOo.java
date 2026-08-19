package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final ByteBuffer f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        super(new byte[i], 2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f1718O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        this.f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = byteBufferWrap;
        byteBufferWrap.position(0);
        byteBufferWrap.limit(byteBufferWrap.capacity());
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final ByteBuffer O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        return this.f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), 0);
        if (!byteBuffer.isDirect()) {
            this.f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = byteBuffer;
            this.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = byteBuffer.position();
            this.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = byteBuffer.limit();
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException();
    }
}
