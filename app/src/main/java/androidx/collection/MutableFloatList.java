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
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final boolean add(float f) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = f;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, float[] elements) {
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
        float[] fArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(fArr, fArr, elements.length + i, i, i3);
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(elements, fArr, i, 0, elements.length);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        float[] fArr = this.content;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(FloatList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f) {
        int iIndexOf = indexOf(f);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this._size)) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        float[] fArr = this.content;
        float f = fArr[i];
        if (i != i2 - 1) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(fArr, fArr, i, i + 1, i2);
        }
        this._size--;
        return f;
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
                float[] fArr = this.content;
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(fArr, fArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(float[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = -1;
            if (-1 >= i2) {
                break;
            }
            float f = fArr[i2];
            int length = elements.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (elements[i4] == f) {
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

    public final float set(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, float f) {
        if (i < 0 || i >= this._size) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "set index ", " must be between 0 .. ");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
            throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        float[] fArr = this.content;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public final void sort() {
        float[] fArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
    }

    public final void sortDescending() {
        float[] fArr = this.content;
        int i = this._size;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int length = fArr.length;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            float f = fArr[i4];
            fArr[i4] = fArr[i3];
            fArr[i3] = f;
            i3--;
        }
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(fArrCopyOf, "copyOf(this, newSize)");
            this.content = fArrCopyOf;
        }
    }

    public /* synthetic */ MutableFloatList(int i, int i2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(float[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void plusAssign(float[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final void plusAssign(float f) {
        add(f);
    }

    public final void add(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, float f) {
        int i2;
        if (i >= 0 && i <= (i2 = this._size)) {
            ensureCapacity(i2 + 1);
            float[] fArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(fArr, fArr, i + 1, i, i3);
            }
            fArr[i] = f;
            this._size++;
            return;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final void minusAssign(FloatList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public final boolean removeAll(FloatList elements) {
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

    public final boolean retainAll(FloatList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, FloatList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        if (i >= 0 && i <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            float[] fArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(fArr, fArr, elements._size + i, i, i2);
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(elements.content, fArr, i, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final boolean addAll(FloatList elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        return addAll(this._size, elements);
    }
}
