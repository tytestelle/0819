package kotlinx.coroutines;

import androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 implements O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4043O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = AtomicIntegerFieldUpdater.newUpdater(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class, "_decision");

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4044O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = AtomicReferenceFieldUpdater.newUpdater(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class, Object.class, "_state");

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(1);
        this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
        this._decision = 0;
        this._state = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static void O00000OOoOOO00O00o0ooooooooO000ooooO0000(ContextAwareKt$withContextAvailable$2$1 contextAwareKt$withContextAvailable$2$1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + contextAwareKt$withContextAvailable$2$1 + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                return;
            }
            boolean z = obj2 instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4044O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (!z) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj2, (O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) null, (Function1) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj2;
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                    O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 != null) {
                        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, cancellationException);
                    }
                    Function1 function1 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (function1 != null) {
                        try {
                            function1.invoke(cancellationException);
                            return;
                        } catch (Throwable th) {
                            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in resume onCancellation handler for " + this, th));
                            return;
                        }
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Throwable O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = super.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj);
        if (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
            return thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return null;
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        return obj instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO ? ((O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj).f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : obj;
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Object O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return this._state;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(ContextAwareKt$withContextAvailable$2$1 contextAwareKt$withContextAvailable$2$1, Throwable th) {
        try {
            contextAwareKt$withContextAvailable$2$1.invoke(th);
        } catch (Throwable th2) {
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, Throwable th) {
        try {
            o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.f4089O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.invoke(th);
        } catch (Throwable th2) {
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo)) {
                return;
            }
            boolean z = obj instanceof O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, th, z);
            do {
                atomicReferenceFieldUpdater = f4044O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
                    O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = z ? (O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) obj : null;
                    if (o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 != null) {
                        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, th);
                    }
                    if (!O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() && (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) != null) {
                        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.dispose();
                        this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                boolean z = i == 4;
                if (z || !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) || O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i) != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, z);
                    return;
                }
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = ((kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = ((kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContext();
                if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.isDispatchNeeded(context)) {
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.dispatch(context, this);
                    return;
                }
                O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
                    return;
                }
                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(true);
                try {
                    O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, true);
                    do {
                    } while (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0());
                } catch (Throwable th) {
                    try {
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th, null);
                    } finally {
                        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                }
                return;
            }
        } while (!f4043O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareAndSet(this, 0, 2));
    }

    public final Object O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() throws Throwable {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Throwable thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        Throwable thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
        boolean zO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        do {
            int i = this._decision;
            o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                    kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? (kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : null;
                    if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && (thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this)) != null) {
                        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 != null) {
                            o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.dispose();
                            this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                        }
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                    }
                }
                Object obj = this._state;
                if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                    throw ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
                if (!O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) || (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) == null || o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.isActive()) {
                    return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
                }
                CancellationException cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                throw cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            }
        } while (!f4043O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareAndSet(this, 0, 1));
        if (this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        }
        if (zO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 instanceof kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? (kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 : null;
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && (thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this)) != null) {
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 != null) {
                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001.dispose();
                    this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(thO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
            }
        }
        return kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null || (this._state instanceof O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo)) {
            return;
        }
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.dispose();
        this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 == null) {
            return null;
        }
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, true, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this), 2);
        this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        return o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(ContextAwareKt$withContextAvailable$2$1 contextAwareKt$withContextAvailable$2$1) {
        O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(contextAwareKt$withContextAvailable$2$1);
        while (true) {
            Object obj = this._state;
            boolean z = obj instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4044O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (z) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000(contextAwareKt$withContextAvailable$2$1, obj);
                throw null;
            }
            if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                if (!O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4056O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.compareAndSet(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, 0, 1)) {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(contextAwareKt$withContextAvailable$2$1, obj);
                    throw null;
                }
                if (obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    if (!(obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(contextAwareKt$withContextAvailable$2$1, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj, o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, (Function1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj;
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000(contextAwareKt$withContextAvailable$2$1, obj);
                throw null;
            }
            Throwable th = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (th != null) {
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(contextAwareKt$withContextAvailable$2$1, th);
                return;
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2, o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        return this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 2 && ((kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getCallerFrame() {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return (O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        return null;
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        return this.f4046O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void resumeWith(Object obj) {
        Object o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        Throwable thM4exceptionOrNullimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(obj);
        if (thM4exceptionOrNullimpl != null) {
            obj = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thM4exceptionOrNullimpl, false);
        }
        int i = this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo)) {
                if (obj2 instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj2;
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
                    if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4048O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.compareAndSet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) obj2;
            if (!(obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) && O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i) && (o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo instanceof O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00)) {
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj, o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo instanceof O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 ? (O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo : null, (Function1) null, (CancellationException) null, 16);
            } else {
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = obj;
            }
            do {
                atomicReferenceFieldUpdater = f4044O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                    if (!O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() && (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) != null) {
                        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.dispose();
                        this.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f4045O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) {
            str = "Active";
        } else {
            str = obj instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this));
        return sb.toString();
    }
}
