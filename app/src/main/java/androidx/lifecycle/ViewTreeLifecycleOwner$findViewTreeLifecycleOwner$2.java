package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<View, LifecycleOwner> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LifecycleOwner invoke(View viewParent) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(viewParent, "viewParent");
        Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
