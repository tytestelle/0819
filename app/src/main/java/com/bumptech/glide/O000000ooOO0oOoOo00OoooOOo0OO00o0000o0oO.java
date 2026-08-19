package com.bumptech.glide;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(@NonNull Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public <M> O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(@NonNull M m, @NonNull List<O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0> list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
    }

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }
}
