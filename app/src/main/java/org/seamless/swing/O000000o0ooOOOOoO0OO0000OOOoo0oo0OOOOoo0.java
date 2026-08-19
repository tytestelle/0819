package org.seamless.swing;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    Set<O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> firedInControllers = new HashSet();
    Object payload;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str) {
        this.payload = str;
    }

    @Override // org.seamless.swing.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void addFiredInController(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.firedInControllers.add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // org.seamless.swing.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public boolean alreadyFired(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        return this.firedInControllers.contains(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public Object getPayload() {
        return this.payload;
    }

    public void setPayload(Object obj) {
        this.payload = obj;
    }
}
