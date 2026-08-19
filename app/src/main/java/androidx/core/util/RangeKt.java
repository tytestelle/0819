package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        return range.extend(t);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        return new Range<>(t, t2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO toClosedRange(final Range<T> range) {
        return new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable value) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(value, "value");
                return value.compareTo(getStart()) >= 0 && value.compareTo(getEndInclusive()) <= 0;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public Comparable getStart() {
                return range.getLower();
            }

            public boolean isEmpty() {
                return getStart().compareTo(getEndInclusive()) > 0;
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        return new Range<>(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getStart(), o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
