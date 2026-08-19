package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view, "<this>");
        return (ViewModelStoreOwner) kotlin.sequences.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(kotlin.sequences.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(kotlin.sequences.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
