package org.eclipse.jetty.client;

import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f1794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
        this.f1795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
        this.f1796O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(SocketChannel socketChannel, Exception exc, Object obj) {
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.remove(socketChannel);
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (obj instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(exc);
            return;
        }
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(exc + "," + socketChannel + "," + obj, new Object[0]);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(exc);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
    public final boolean dispatch(Runnable runnable) {
        return this.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4215O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.dispatch(runnable);
    }
}
