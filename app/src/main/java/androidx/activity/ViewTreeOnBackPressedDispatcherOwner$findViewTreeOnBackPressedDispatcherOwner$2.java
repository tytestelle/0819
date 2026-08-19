package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<View, OnBackPressedDispatcherOwner> {
    public static final ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 INSTANCE = new ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2();

    public ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnBackPressedDispatcherOwner invoke(View it) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it, "it");
        Object tag = it.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
