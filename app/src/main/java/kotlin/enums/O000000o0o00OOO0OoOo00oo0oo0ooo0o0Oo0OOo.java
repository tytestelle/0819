package kotlin.enums;

import java.io.Serializable;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<Enum<Object>> c;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Enum<Object>[] entries) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(entries, "entries");
        Class componentType = entries.getClass().getComponentType();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(componentType);
        this.c = componentType;
    }

    private final Object readResolve() {
        Enum<Object>[] enumConstants = this.c.getEnumConstants();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(enumConstants, "c.enumConstants");
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(enumConstants));
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
        return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }
}
