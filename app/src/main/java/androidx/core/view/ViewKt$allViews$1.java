package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON}, m = "invokeSuspend")
public final class ViewKt$allViews$1 extends O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Function2<kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.$this_allViews = view;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        Object obj2;
        kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
        int i = this.label;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i != 0) {
            if (i == 1) {
                o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.L$0;
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            }
            return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.L$0;
        View view = this.$this_allViews;
        this.L$0 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.label = 1;
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(view, this) == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
            Iterator it = descendants.iterator();
            kotlin.sequences.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (kotlin.sequences.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (it.hasNext()) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4022O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = it;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this;
                obj2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            } else {
                obj2 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            }
            if (obj2 != o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                obj2 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            }
            if (obj2 == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
        }
        return o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return ((ViewKt$allViews$1) create(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }
}
