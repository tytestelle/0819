package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
    private final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        this.key = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <R> R fold(R r, Function2<? super R, ? super O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, ? extends R> operation) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        return operation.invoke(r, this);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO get(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo plus(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return context == O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? this : (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) context.fold(this, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.INSTANCE);
    }
}
