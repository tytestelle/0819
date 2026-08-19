package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.collections.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener listener) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this.listeners); -1 < iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o; iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o--) {
            this.listeners.get(iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener listener) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(listener, "listener");
        this.listeners.remove(listener);
    }
}
