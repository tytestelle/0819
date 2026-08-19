package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        return new android.util.Pair<>(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getFirst(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSecond());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        return new Pair<>(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getFirst(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSecond());
    }

    public static final <F, S> O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 toKotlinPair(Pair<F, S> pair) {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 toKotlinPair(android.util.Pair<F, S> pair) {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(pair.first, pair.second);
    }
}
