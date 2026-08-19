package org.eclipse.jetty.util;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends HashMap {
    final /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, int i) {
        super(i);
        this.this$0 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (Object obj : keySet()) {
            if (sb.length() > 1) {
                sb.append(',');
            }
            sb.append(obj);
            sb.append('=');
            sb.append(Arrays.asList((Object[]) get(obj)));
        }
        sb.append('}');
        return sb.toString();
    }
}
