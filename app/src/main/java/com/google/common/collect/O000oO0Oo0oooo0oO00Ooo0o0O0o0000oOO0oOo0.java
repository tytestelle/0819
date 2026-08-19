package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000oO0Oo0oooo0oO00Ooo0o0O0o0000oOO0oOo0 implements O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 {
    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0)) {
            return false;
        }
        O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 = (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0) obj;
        return getCount() == o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount() && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(getElement(), o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement());
    }

    public int hashCode() {
        Object element = getElement();
        return (element == null ? 0 : element.hashCode()) ^ getCount();
    }

    public String toString() {
        String strValueOf = String.valueOf(getElement());
        int count = getCount();
        if (count == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + count;
    }
}
