package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(@IntRange(from = 1) int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.pool = new Object[i];
        }

        private final boolean isInPool(T t) {
            int i = this.poolSize;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.pool[i2] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i = this.poolSize;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.pool[i2];
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i2] = null;
            this.poolSize--;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instance, "instance");
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.poolSize;
            Object[] objArr = this.pool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.poolSize = i + 1;
            return true;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i) {
            super(i);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.lock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean zRelease;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(instance, "instance");
            synchronized (this.lock) {
                zRelease = super.release(instance);
            }
            return zRelease;
        }
    }

    private Pools() {
    }
}
