package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O00000OOoOOO00O00o0ooooooooO000ooooO0000;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Serializable {
    private final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO element;
    private final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo left;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo left, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO element) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(left, "left");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        this.left = left;
        this.element = element;
    }

    private final Object writeReplace() {
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO];
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        fold(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr, o00000OOoOOO00O00o0ooooooooO000ooooO0000));
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.element == iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i = 2;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this;
        while (true) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.left;
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO ? (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo : null;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (this != obj) {
            if (!(obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                return false;
            }
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() != O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                return false;
            }
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = this;
            while (true) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.element;
                if (!kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getKey()), o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                    zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = false;
                    break;
                }
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.left;
                if (!(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.getKey()), o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
                    break;
                }
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            }
            if (!zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <R> R fold(R r, Function2<? super R, ? super O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, ? extends R> operation) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        return operation.invoke(this.left.fold(r, operation), this.element);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <E extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO> E get(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this;
        while (true) {
            E e = (E) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.element.get(key);
            if (e != null) {
                return e;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.left;
            if (!(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                return (E) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.get(key);
            }
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoMinusKey = this.left.minusKey(key);
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoMinusKey == this.left) {
            return this;
        }
        return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoMinusKey == O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? this.element : new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoMinusKey, this.element);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo plus(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return context == O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? this : (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) context.fold(this, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.INSTANCE);
    }

    public String toString() {
        return "[" + ((String) fold("", O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.INSTANCE)) + ']';
    }
}
