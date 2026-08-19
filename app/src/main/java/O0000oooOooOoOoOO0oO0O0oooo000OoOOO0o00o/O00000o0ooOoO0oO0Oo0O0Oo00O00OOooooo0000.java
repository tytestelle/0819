package O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1935O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public ServerSocket f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O f1937O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, String str, Object[] objArr) {
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            System.err.printf("[ShutdownMonitor] " + str + "%n", objArr);
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, Socket socket) {
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.getClass();
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    public final String toString() {
        return String.format("%s[port=%d]", O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.class.getName(), Integer.valueOf(this.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }
}
