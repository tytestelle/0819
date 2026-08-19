package kotlinx.coroutines;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo implements kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo f4109O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo();

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object fold(Object obj, Function2 operation) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO get(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public final kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O getKey() {
        return this;
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo plus(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return context == kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? this : (kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) context.fold(this, kotlin.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.INSTANCE);
    }
}
