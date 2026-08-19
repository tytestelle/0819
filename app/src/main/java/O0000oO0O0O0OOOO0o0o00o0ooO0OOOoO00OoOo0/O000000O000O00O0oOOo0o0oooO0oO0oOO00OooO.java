package O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, Serializable {
    private final Object value;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        this.value = obj;
    }

    @Override // O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public Object getValue() {
        return this.value;
    }

    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
