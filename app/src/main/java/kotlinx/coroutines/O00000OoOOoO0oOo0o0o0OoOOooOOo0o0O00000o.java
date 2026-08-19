package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o extends kotlin.coroutines.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    public static final O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o Key = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.INSTANCE);

    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() {
        super(kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public abstract void dispatch(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable);

    public void dispatchYield(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        dispatch(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, runnable);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO] */
    @Override // kotlin.coroutines.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public <E extends kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO> E get(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        if (!(key instanceof O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o)) {
            if (kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == key) {
                return this;
            }
            return null;
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) key;
        kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key2 = getKey();
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key2, "key");
        if (key2 != o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o && o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4061O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != key2) {
            return null;
        }
        E e = (E) o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4060O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invoke(this);
        if (e instanceof kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            return e;
        }
        return null;
    }

    @Override // kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final <T> kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 interceptContinuation(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return new kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public boolean isDispatchNeeded(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        return !(this instanceof O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
    }

    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o limitedParallelism(int i) {
        kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
        return new kotlinx.coroutines.internal.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, i);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO] */
    @Override // kotlin.coroutines.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        if (key instanceof O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) key;
            kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O key2 = getKey();
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key2, "key");
            if ((key2 == o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o || o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4061O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == key2) && ((kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4060O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invoke(this)) != null) {
                return kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
            }
        } else if (kotlin.coroutines.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == key) {
            return kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
        }
        return this;
    }

    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o plus(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
        return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    @Override // kotlin.coroutines.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void releaseInterceptedContinuation(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        ((kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }
}
