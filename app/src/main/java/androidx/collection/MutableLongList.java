package androidx.collection;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.collections.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import kotlin.collections.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.collections.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final boolean add(long j) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = j;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, long[] elements) {
        int i2;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (i < 0 || i > (i2 = this._size)) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i2 + elements.length);
        long[] jArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(jArr, jArr, elements.length + i, i, i3);
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(elements, jArr, i, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        long[] jArr = this.content;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j) {
        remove(j);
    }

    public final void plusAssign(LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j) {
        int iIndexOf = indexOf(j);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        for (long j : elements) {
            remove(j);
        }
        return i != this._size;
    }

    public final long removeAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        long[] jArr = this.content;
        long j = jArr[i];
        if (i != i2 - 1) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(jArr, jArr, i, i + 1, i2);
        }
        this._size--;
        return j;
    }

    public final void removeRange(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i2) {
        int i3;
        if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(this._size);
            throw new IndexOutOfBoundsException(sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.content;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(jArr, jArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(long[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = -1;
            if (-1 >= i2) {
                break;
            }
            long j = jArr[i2];
            int length = elements.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (elements[i4] == j) {
                    i3 = i4;
                    break;
                }
            }
            if (i3 < 0) {
                removeAt(i2);
            }
            i2--;
        }
        return i != this._size;
    }

    public final long set(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, long j) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "set index ", " must be between 0 .. ");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        long[] jArr = this.content;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public final void sort() {
        long[] jArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
    }

    public final void sortDescending() {
        long[] jArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int length = jArr.length;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4];
            jArr[i4] = jArr[i3];
            jArr[i3] = j;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jArrCopyOf, "copyOf(this, newSize)");
            this.content = jArrCopyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i, int i2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(long[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        for (long j : elements) {
            remove(j);
        }
    }

    public final void plusAssign(long[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableLongList(int i) {
        super(i, null);
    }

    public final void plusAssign(long j) {
        add(j);
    }

    public final void add(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, long j) {
        int i2;
        if (i >= 0 && i <= (i2 = this._size)) {
            ensureCapacity(i2 + 1);
            long[] jArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(jArr, jArr, i + 1, i, i3);
            }
            jArr[i] = j;
            this._size++;
            return;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final void minusAssign(LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        long[] jArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    public final boolean removeAll(LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        int i2 = elements._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(elements.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(jArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(jArr, jArr, elements._size + i, i, i2);
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(elements.content, jArr, i, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final boolean addAll(LongList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }
}
