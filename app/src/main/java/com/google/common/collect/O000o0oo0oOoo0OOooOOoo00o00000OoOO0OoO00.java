package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 {
    Map asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection entries();

    Collection get(Object obj);

    boolean isEmpty();

    Set keySet();

    boolean put(Object obj, Object obj2);

    boolean putAll(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
