package O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Serializable {
    private final Object first;
    private final Object second;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 copy$default(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.first;
        }
        if ((i & 2) != 0) {
            obj2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.second;
        }
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.copy(obj, obj2);
    }

    public final Object component1() {
        return this.first;
    }

    public final Object component2() {
        return this.second;
    }

    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 copy(Object obj, Object obj2) {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
            return false;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) obj;
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.first, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.first) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.second, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.second);
    }

    public final Object getFirst() {
        return this.first;
    }

    public final Object getSecond() {
        return this.second;
    }

    public int hashCode() {
        Object obj = this.first;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ')';
    }
}
