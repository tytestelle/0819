package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<View, View> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View currentView) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(currentView, "currentView");
        Object parent = currentView.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
