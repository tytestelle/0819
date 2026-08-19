package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<View, ViewModelStoreOwner> {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    public ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewModelStoreOwner invoke(View view) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view, "view");
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
