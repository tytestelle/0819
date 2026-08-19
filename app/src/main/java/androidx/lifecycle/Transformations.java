package androidx.lifecycle;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.jvm.internal.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1, reason: invalid class name */
    public static final class AnonymousClass1<X> extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<X, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
        final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediatorLiveData<X> mediatorLiveData, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            super(1);
            this.$outputLiveData = mediatorLiveData;
            this.$firstTime = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(Object obj) {
            invoke2(obj);
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            X value = this.$outputLiveData.getValue();
            if (this.$firstTime.element || ((value == null && x != null) || !(value == null || value.equals(x)))) {
                this.$firstTime.element = false;
                this.$outputLiveData.setValue(x);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00381<X> extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<X, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function1<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00381(MediatorLiveData<Y> mediatorLiveData, Function1<X, Y> function1) {
            super(1);
            this.$result = mediatorLiveData;
            this.$transform = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(Object obj) {
            invoke2(obj);
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            this.$result.setValue((Y) this.$transform.invoke(x));
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2, reason: invalid class name */
    public static final class AnonymousClass2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1 {
        final /* synthetic */ Function $mapFunction;
        final /* synthetic */ MediatorLiveData $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediatorLiveData mediatorLiveData, Function function) {
            super(1);
            this.$result = mediatorLiveData;
            this.$mapFunction = function;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m44invoke(obj);
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m44invoke(Object obj) {
            this.$result.setValue(this.$mapFunction.apply(obj));
        }
    }

    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.element = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.element = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(mediatorLiveData, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, Function1<X, Y> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(liveData, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C00381(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final Function1<X, LiveData<Y>> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(liveData, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.switchMap.1
            private LiveData<Y> liveData;

            public final LiveData<Y> getLiveData() {
                return this.liveData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                LiveData<Y> liveData2 = (LiveData) transform.invoke(x);
                Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(liveData, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(liveData, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations.switchMap.2
            private LiveData liveData;

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) switchMapFunction.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                if (liveData3 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(liveData3);
                    mediatorLiveData2.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData3 = mediatorLiveData;
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
