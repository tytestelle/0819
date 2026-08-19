package androidx.collection;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntSet {
    public int _capacity;
    public int _size;
    public int[] elements;
    public long[] metadata;

    public /* synthetic */ IntSet(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntSet intSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return intSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean all(Function1<? super Integer, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && !predicate.invoke(Integer.valueOf(iArr[(i << 3) + i3])).booleanValue()) {
                        return false;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ScatterMapKt.MurmurHashC1 * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.elements[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public final int count() {
        return this._size;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntSet)) {
            return false;
        }
        IntSet intSet = (IntSet) obj;
        if (intSet._size != this._size) {
            return false;
        }
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !intSet.contains(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final int findElementIndex$collection(int i) {
        int i2 = ScatterMapKt.MurmurHashC1 * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.elements[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[LOOP:0: B:5:0x000b->B:16:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[SYNTHETIC] */
    public final int first() {
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return iArr[(i << 3) + i3];
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        throw new NoSuchElementException("The IntSet is empty");
    }

    public final void forEach(Function1<? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachIndex(Function1<? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i << 3, i3, block);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public final int getCapacity() {
        return this._capacity;
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            i3 += iArr[(i2 << 3) + i5];
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    i = i3;
                }
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = IntSetKt.getEmptyIntArray();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[LOOP:0: B:5:0x0014->B:18:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[SYNTHETIC] */
    public final boolean any(Function1<? super Integer, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && predicate.invoke(Integer.valueOf(iArr[(i << 3) + i3])).booleanValue()) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public final int count(Function1<? super Integer, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && predicate.invoke(Integer.valueOf(iArr[(i2 << 3) + i5])).booleanValue()) {
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    i = i3;
                }
            }
        }
        return i;
    }

    public final String joinToString(CharSequence separator) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[DONT_INVERT, PHI: r11
  0x00a4: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x0064, B:40:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[LOOP:0: B:27:0x0053->B:42:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[SYNTHETIC] */
    public static /* synthetic */ String joinToString$default(IntSet intSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            CharSequence separator = (i2 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i2 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i2 & 4) == 0 ? charSequence3 : "";
            int i3 = (i2 & 8) != 0 ? -1 : i;
            CharSequence charSequence5 = (i2 & 16) != 0 ? "..." : charSequence4;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
            StringBuilder sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(charSequence5, "truncated", function1, "transform", prefix);
            int[] iArr = intSet.elements;
            long[] jArr = intSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
                break;
            }
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j & 255) < 128) {
                            int i9 = iArr[(i4 << 3) + i8];
                            if (i5 == i3) {
                                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence5);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(separator);
                            }
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) function1.invoke(Integer.valueOf(i9)));
                            i5++;
                            i6 = 8;
                        }
                        j >>= i6;
                    }
                    if (i7 == i6) {
                        if (i4 == length) {
                            i4++;
                        }
                    }
                    sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
                    break;
                }
                if (i4 == length) {
                    sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
                    break;
                }
                i4++;
            }
            String string = sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.toString();
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(charSequence, "postfix", charSequence2, "truncated", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((j & 255) < 128) {
                        int i6 = iArr[(i2 << 3) + i5];
                        if (i3 == i) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence2);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(separator);
                        }
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(i6);
                        i3++;
                    }
                    j >>= 8;
                }
                if (i4 == 8) {
                }
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            if (i2 == length) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            i2++;
        }
        String string = sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[LOOP:0: B:5:0x0014->B:17:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[SYNTHETIC] */
    public final int first(Function1<? super Integer, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = iArr[(i << 3) + i3];
                            if (predicate.invoke(Integer.valueOf(i4)).booleanValue()) {
                                return i4;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence, Function1<? super Integer, ? extends CharSequence> function1) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        StringBuilder sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(charSequence, "truncated", function1, "transform", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((j & 255) < 128) {
                        int i6 = iArr[(i2 << 3) + i5];
                        if (i3 == i) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(separator);
                        }
                        sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(function1.invoke(Integer.valueOf(i6)));
                        i3++;
                    }
                    j >>= 8;
                }
                if (i4 == 8) {
                }
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
                break;
            }
            if (i2 == length) {
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(postfix);
                break;
            }
            i2++;
        }
        String string = sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, Function1<? super Integer, ? extends CharSequence> function1) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(charSequence, "postfix", function1, "transform", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((j & 255) < 128) {
                        int i7 = iArr[(i2 << 3) + i6];
                        if (i3 == i) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(separator);
                        }
                        sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(function1.invoke(Integer.valueOf(i7)));
                        i3++;
                        i4 = 8;
                    }
                    j >>= i4;
                }
                if (i5 == i4) {
                }
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
                break;
            }
            if (i2 == length) {
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
                break;
            }
            i2++;
        }
        String string = sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[DONT_INVERT, PHI: r10
  0x0076: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0035, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0078 A[LOOP:0: B:5:0x0027->B:20:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007b A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, Function1<? super Integer, ? extends CharSequence> function1) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(charSequence, "postfix", function1, "transform", prefix);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(separator);
                        }
                        sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(function1.invoke(Integer.valueOf(i5)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
                break;
            }
            if (i == length) {
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(charSequence);
                break;
            }
            i++;
        }
        String string = sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[DONT_INVERT, PHI: r9
  0x006d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002e, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[LOOP:0: B:5:0x0020->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, Function1<? super Integer, ? extends CharSequence> function1) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        StringBuilder sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(charSequence, "prefix", function1, "transform", charSequence);
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(separator);
                        }
                        sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append(function1.invoke(Integer.valueOf(i5)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sbO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[DONT_INVERT, PHI: r10
  0x0071: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073 A[LOOP:0: B:5:0x0022->B:20:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, Function1<? super Integer, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(separator);
                        }
                        sb.append(transform.invoke(Integer.valueOf(i5)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sb.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a A[DONT_INVERT, PHI: r9
  0x006a: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0029, B:18:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:0: B:5:0x001b->B:20:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[SYNTHETIC] */
    public final String joinToString(Function1<? super Integer, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(transform.invoke(Integer.valueOf(i5)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sb.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
