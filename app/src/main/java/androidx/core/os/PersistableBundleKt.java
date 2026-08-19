package androidx.core.os;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0... o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr.length);
        for (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, (String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2());
        }
        return persistableBundleCreatePersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundleCreatePersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
