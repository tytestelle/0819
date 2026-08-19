package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOo0ooO0o000o0Oo000000OOOo0OooOo0o0O extends O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Comparable f3650O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 f3651O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000oOo0ooO0o000o0Oo000000OOOo0OooOo0o0O(O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0, Comparable comparable) {
        super(comparable);
        this.f3651O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0;
        this.f3650O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.first();
    }

    @Override // com.google.common.collect.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000
    public final Comparable O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.access$000(comparable, this.f3650O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
            return null;
        }
        return this.f3651O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.domain.previous(comparable);
    }
}
