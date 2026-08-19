package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandlesProvider$viewModel$2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function0<SavedStateHandlesVM> {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
