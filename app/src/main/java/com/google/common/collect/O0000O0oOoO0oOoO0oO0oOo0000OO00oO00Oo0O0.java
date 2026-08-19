package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public enum O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(boolean z) {
        this.inclusive = z;
    }

    public static O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 forBoolean(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
