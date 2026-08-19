package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
import kotlinx.coroutines.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import kotlinx.coroutines.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
import kotlinx.coroutines.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
import kotlinx.coroutines.O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 implements O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4115O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = AtomicReferenceFieldUpdater.newUpdater(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class, Object.class, "_reusableCancellableContinuation");

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public Object f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final Object f4119O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(-1);
        this.f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        this.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object objFold = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext().fold(0, O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(objFold);
        this.f4119O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = objFold;
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, CancellationException cancellationException) {
        if (obj instanceof kotlinx.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            ((kotlinx.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj).f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.invoke(cancellationException);
        }
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this;
    }

    @Override // kotlinx.coroutines.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final Object O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        Object obj = this.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return obj;
    }

    public final boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(CancellationException cancellationException) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4115O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, cancellationException)) {
                    if (atomicReferenceFieldUpdater.get(this) != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return false;
        }
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
        Object obj = this._reusableCancellableContinuation;
        kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj instanceof kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 ? (kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) obj : null;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null || (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) == null) {
            return;
        }
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.dispose();
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4047O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final Throwable O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4115O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (obj == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                    if (atomicReferenceFieldUpdater.get(this) != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getCallerFrame() {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return (O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        return null;
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        return this.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContext();
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void resumeWith(Object obj) {
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
        Throwable thM4exceptionOrNullimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(obj);
        Object o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = thM4exceptionOrNullimpl == null ? obj : new kotlinx.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thM4exceptionOrNullimpl, false);
        kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.isDispatchNeeded(context)) {
            this.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.dispatch(context, this);
            return;
        }
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            this.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
            o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
            return;
        }
        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(true);
        try {
            kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
            Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context2, this.f4119O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            try {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(obj);
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                while (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
                }
            } catch (Throwable th) {
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th2, null);
            } finally {
                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + ", " + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) + ']';
    }
}
