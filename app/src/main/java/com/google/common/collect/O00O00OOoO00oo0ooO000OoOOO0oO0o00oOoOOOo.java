package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00OOoO00oo0ooO000OoOOO0oO0o00oOoOOOo extends O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 {
    private final O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 restriction;
    final /* synthetic */ O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00O00OOoO00oo0ooO000OoOOO0oO0o00oOoOOOo(O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        super(new O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all(), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.rangesByLowerBound));
        this.this$0 = o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0;
        this.restriction = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public void add(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.restriction.encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0), "Cannot add range %s to subRangeSet(%s)", o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, this.restriction);
        this.this$0.add(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public void clear() {
        this.this$0.remove(this.restriction);
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public boolean contains(Comparable<?> comparable) {
        return this.restriction.contains(comparable) && this.this$0.contains(comparable);
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0, com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public boolean encloses(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Access$600;
        return (this.restriction.isEmpty() || !this.restriction.encloses(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) || (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Access$600 = O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.access$600(this.this$0, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) == null || o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Access$600.intersection(this.restriction).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    @CheckForNull
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 rangeContaining(Comparable<?> comparable) {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0RangeContaining;
        if (this.restriction.contains(comparable) && (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0RangeContaining = this.this$0.rangeContaining(comparable)) != null) {
            return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0RangeContaining.intersection(this.restriction);
        }
        return null;
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public void remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isConnected(this.restriction)) {
            this.this$0.remove(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.intersection(this.restriction));
        }
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 subRangeSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.encloses(this.restriction)) {
            return this;
        }
        return o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.isConnected(this.restriction) ? new O00O00OOoO00oo0ooO000OoOOO0oO0o00oOoOOOo(this, this.restriction.intersection(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0)) : O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.of();
    }
}
