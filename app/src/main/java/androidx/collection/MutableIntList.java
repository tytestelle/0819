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
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final boolean add(int i) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i2 = this._size;
        iArr[i2] = i;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, int[] elements) {
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
        int[] iArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(elements.length + i, i, i3, iArr, iArr);
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i, 0, 12, elements, iArr);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.content;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(IntList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        for (int i2 : elements) {
            remove(i2);
        }
        return i != this._size;
    }

    public final int removeAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, i + 1, i2, iArr, iArr);
        }
        this._size--;
        return i3;
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
                int[] iArr = this.content;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, i2, i3, iArr, iArr);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(int[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = -1;
            if (-1 >= i2) {
                break;
            }
            int i4 = iArr[i2];
            int length = elements.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (elements[i5] == i4) {
                    i3 = i5;
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

    public final int set(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, int i2) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "set index ", " must be between 0 .. ");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public final void sort() {
        int[] iArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
    }

    public final void sortDescending() {
        int[] iArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int length = iArr.length;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[i3];
            iArr[i3] = i5;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i, int i2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(int[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        for (int i : elements) {
            remove(i);
        }
    }

    public final void plusAssign(int[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void plusAssign(int i) {
        add(i);
    }

    public final void add(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this._size)) {
            ensureCapacity(i3 + 1);
            int[] iArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i + 1, i, i4, iArr, iArr);
            }
            iArr[i] = i2;
            this._size++;
            return;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final void minusAssign(IntList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public final boolean removeAll(IntList elements) {
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

    public final boolean retainAll(IntList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, IntList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(elements._size + i, i, i2, iArr, iArr);
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, 0, elements._size, elements.content, iArr);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final boolean addAll(IntList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }
}
