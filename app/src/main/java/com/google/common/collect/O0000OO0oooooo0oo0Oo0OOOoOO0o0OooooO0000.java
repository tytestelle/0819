package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 implements BiConsumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Function f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(Function function, Object obj, int i) {
        this.f3436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = function;
        this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.common.collect.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f3436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O) obj).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj2), ((Function) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).apply(obj2));
                break;
            case 1:
                ((O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo) obj).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj2), ((Function) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).apply(obj2));
                break;
            case 2:
                ((O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO) obj).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj2), ((Function) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).apply(obj2));
                break;
            case 3:
                Function function = this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                Function function2 = (Function) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 = (O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0) obj;
                Object objApply = function.apply(obj2);
                Object objApply2 = function2.apply(obj2);
                int i = o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1;
                Object[] objArr = o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (i > objArr.length) {
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArr.length, i);
                    o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Arrays.copyOf(o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Arrays.copyOf(o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objApply, objApply2);
                Object[] objArr2 = o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3549O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                int i2 = o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                objArr2[i2] = objApply;
                o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3550O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2] = objApply2;
                o000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0.f3504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
                break;
            case 4:
                Function function3 = this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                Function function4 = (Function) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                final Collection collection = ((O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) obj).get(function3.apply(obj2));
                Stream streamO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = androidx.media3.decoder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(function4.apply(obj2));
                Objects.requireNonNull(collection);
                streamO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.forEachOrdered(new Consumer() { // from class: com.google.common.collect.O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        collection.add(obj3);
                    }
                });
                break;
            default:
                Function function5 = this.f3437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                ToIntFunction toIntFunction = (ToIntFunction) this.f3438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                Object objApply3 = function5.apply(obj2);
                objApply3.getClass();
                ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) obj).add(objApply3, toIntFunction.applyAsInt(obj2));
                break;
        }
    }
}
