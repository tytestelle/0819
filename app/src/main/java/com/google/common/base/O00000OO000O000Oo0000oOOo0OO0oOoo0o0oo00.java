package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f3353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str) {
        str.getClass();
        this.f3353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f3353O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, it);
        return sb.toString();
    }
}
