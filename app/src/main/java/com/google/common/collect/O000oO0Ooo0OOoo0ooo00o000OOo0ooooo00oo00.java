package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0Ooo0OOoo0ooo00o000OOo0ooooo00oo00 extends O000oO0Oo0oooo0oO00Ooo0o0O0o0000oOO0oOo0 implements Serializable {
    private static final long serialVersionUID = 0;
    private final int count;
    private final Object element;

    public O000oO0Ooo0OOoo0ooo00o000OOo0ooooo00oo00(Object obj, int i) {
        this.element = obj;
        this.count = i;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "count");
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final int getCount() {
        return this.count;
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final Object getElement() {
        return this.element;
    }

    @CheckForNull
    public O000oO0Ooo0OOoo0ooo00o000OOo0ooooo00oo00 nextInBucket() {
        return null;
    }
}
