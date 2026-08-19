package com.orhanobut.hawk;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface Parser {
    <T> T fromJson(String str, Type type);

    String toJson(Object obj);
}
