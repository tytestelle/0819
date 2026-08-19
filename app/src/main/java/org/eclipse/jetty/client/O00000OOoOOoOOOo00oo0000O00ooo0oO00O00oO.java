package org.eclipse.jetty.client;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final SocketChannel f4241O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f4242O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f4243O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, SocketChannel socketChannel, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        this.f4243O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f4241O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = socketChannel;
        this.f4242O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        SocketChannel socketChannel = this.f4241O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (socketChannel.isConnectionPending()) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Channel {} timed out while connecting, closing it", socketChannel);
            try {
                socketChannel.close();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
            this.f4243O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.remove(socketChannel);
            this.f4242O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new SocketTimeoutException());
        }
    }
}
