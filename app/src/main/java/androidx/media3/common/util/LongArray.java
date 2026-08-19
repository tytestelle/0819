package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j) {
        int i = this.size;
        long[] jArr = this.values;
        if (i == jArr.length) {
            this.values = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.values;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr2[i2] = j;
    }

    public void addAll(long[] jArr) {
        int length = this.size + jArr.length;
        long[] jArr2 = this.values;
        if (length > jArr2.length) {
            this.values = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.values, this.size, jArr.length);
        this.size = length;
    }

    public long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.values[i];
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Invalid index ", ", size is ");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this.size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i) {
        this.values = new long[i];
    }
}
