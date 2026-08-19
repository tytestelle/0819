package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String name, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(name, "name");
        Integer num = this.calledMethods.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & i) != 0;
        this.calledMethods.put(name, Integer.valueOf(i | iIntValue));
        return !z;
    }
}
