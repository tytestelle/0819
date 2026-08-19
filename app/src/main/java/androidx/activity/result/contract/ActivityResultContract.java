package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public SynchronousResult<O> getSynchronousResult(Context context, I i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
