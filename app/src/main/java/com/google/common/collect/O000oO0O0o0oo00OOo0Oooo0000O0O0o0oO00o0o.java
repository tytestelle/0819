package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o extends Collection {
    int add(Object obj, int i);

    int count(Object obj);

    Set elementSet();

    Set entrySet();

    int remove(Object obj, int i);

    int setCount(Object obj, int i);

    boolean setCount(Object obj, int i, int i2);
}
