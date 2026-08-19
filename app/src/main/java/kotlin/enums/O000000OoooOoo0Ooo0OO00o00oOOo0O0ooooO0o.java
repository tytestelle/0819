package kotlin.enums;

import java.io.Serializable;
import kotlin.collections.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Serializable {
    private volatile Enum<Object>[] _entries;
    private final Function0<Enum<Object>[]> entriesProvider;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Function0<Enum<Object>[]> entriesProvider) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(entriesProvider, "entriesProvider");
        this.entriesProvider = entriesProvider;
    }

    private final Object writeReplace() {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
    }

    public final Enum[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Enum<Object>[] enumArr = this._entries;
        if (enumArr != null) {
            return enumArr;
        }
        Enum<Object>[] enumArrInvoke = this.entriesProvider.invoke();
        this._entries = enumArrInvoke;
        return enumArrInvoke;
    }

    @Override // kotlin.collections.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum<Object>) obj);
        }
        return false;
    }

    @Override // kotlin.collections.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public int getSize() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().length;
    }

    @Override // kotlin.collections.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum<Object>) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum<Object>) obj);
        }
        return -1;
    }

    public boolean contains(Enum<Object> element) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        Enum<Object>[] enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int iOrdinal = element.ordinal();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "<this>");
        return ((iOrdinal < 0 || iOrdinal > enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length - 1) ? null : enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iOrdinal]) == element;
    }

    @Override // java.util.List
    public Enum<Object> get(int i) {
        Enum<Object>[] enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        kotlin.collections.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int length = enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        kotlin.collections.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, length);
        return enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
    }

    public int indexOf(Enum<Object> element) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        int iOrdinal = element.ordinal();
        Enum<Object>[] enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "<this>");
        if (((iOrdinal < 0 || iOrdinal > enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length + (-1)) ? null : enumArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iOrdinal]) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(Enum<Object> element) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        return indexOf((Object) element);
    }
}
