package androidx.activity;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {188}, m = "reportWhenComplete")
    public static final class AnonymousClass1 extends O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, Function1<? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        Object obj = anonymousClass1.result;
        kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            if (i2 == 0) {
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                }
                anonymousClass1.L$0 = fullyDrawnReporter;
                anonymousClass1.label = 1;
                if (function1.invoke(anonymousClass1) == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = (FullyDrawnReporter) anonymousClass1.L$0;
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            }
            fullyDrawnReporter.removeReporter();
            return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        } catch (Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, Function1<? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        fullyDrawnReporter.addReporter();
        boolean zIsFullyDrawnReported = fullyDrawnReporter.isFullyDrawnReported();
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zIsFullyDrawnReported) {
            return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
        try {
            function1.invoke(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        } finally {
            fullyDrawnReporter.removeReporter();
        }
    }
}
