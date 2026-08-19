package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o implements O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) {
            return asRanges().equals(((O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public final String toString() {
        return asRanges().toString();
    }
}
