package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    final transient int length;
    final transient int offset;
    final /* synthetic */ O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O this$0;

    public O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, int i, int i2) {
        this.this$0 = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.util.List
    public Object get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.length);
        return this.this$0.get(i + this.offset);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    @CheckForNull
    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayEnd() {
        return this.this$0.internalArrayStart() + this.offset + this.length;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int internalArrayStart() {
        return this.this$0.internalArrayStart() + this.offset;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.length;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O subList(int i, int i2) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2, this.length);
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.this$0;
        int i3 = this.offset;
        return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.subList(i + i3, i2 + i3);
    }
}
