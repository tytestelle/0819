package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public class O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 extends AbstractSet implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Object f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient int[] f3466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient int f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient int f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @CheckForNull
    transient Object[] elements;

    public O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0() {
        init(3);
    }

    public static Object access$100(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, int i) {
        return o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()[i];
    }

    public static <E> O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 create() {
        return new O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0();
    }

    public static <E> O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 createWithExpectedSize(int i) {
        return new O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Invalid size: "));
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return (1 << (this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & 31)) - 1;
    }

    public final Object[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        int[] iArr = this.f3466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2, int i3, int i4) {
        Object objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, i3 & i5, i4 + 1);
        }
        Object obj = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        int[] iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        for (int i6 = 0; i6 <= i; i6++) {
            int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i6, obj);
            while (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0) {
                int i7 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
                int i8 = iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i10, objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, i10, iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0);
                iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i7] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i9, iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1, i5);
                iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i8 & i;
            }
        }
        this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(Object obj) {
        int iMin;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(obj);
        }
        int[] iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        Object[] objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        int i = this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i2 = i + 1;
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i3 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object obj2 = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj2);
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i3, obj2);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0) {
            int i4 = ~iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i5 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i4;
            int i6 = 0;
            while (true) {
                int i7 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
                int i8 = iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i7];
                if ((i8 & i4) == i5 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i7])) {
                    return false;
                }
                int i9 = i8 & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                i6++;
                if (i9 == 0) {
                    if (i6 < 9) {
                        if (i2 <= iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                            iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i7] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i8, i2, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                            break;
                        }
                        iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO), iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i);
                        break;
                    }
                    return convertToHashFloodingResistantImplementation().add(obj);
                }
                iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i9;
            }
        } else if (i2 > iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO), iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i);
        } else {
            Object obj3 = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            Objects.requireNonNull(obj3);
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(obj3, i3, i2);
        }
        int length = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(iMin);
        }
        insertEntry(i, obj, iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(needsAllocArrays(), "Arrays already allocated");
        int i = this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(i);
        this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo);
        this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 32 - Integer.numberOfLeadingZeros(iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo - 1), 31);
        this.f3466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new int[i];
        this.elements = new Object[i];
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(size(), 3);
            setDelegateOrNull.clear();
            this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
            this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
            return;
        }
        Arrays.fill(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), 0, this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Object) null);
        Object obj = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), 0, this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, 0);
        this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        Object obj2 = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj2);
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 == 0) {
            return false;
        }
        int i = ~iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i2 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i;
        do {
            int i3 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
            int i4 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()[i3];
            if ((i4 & i) == i2 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()[i3])) {
                return true;
            }
            iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i4 & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        } while (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0);
        return false;
    }

    @CanIgnoreReturnValue
    public Set<Object> convertToHashFloodingResistantImplementation() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() + 1, 1.0f);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            linkedHashSet.add(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()[iFirstEntryIndex]);
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = linkedHashSet;
        this.f3466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        this.elements = null;
        incrementModCount();
        return linkedHashSet;
    }

    @CheckForNull
    public Set<Object> delegateOrNull() {
        Object obj = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o += 32;
    }

    public void init(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Expected size must be >= 0", i >= 0);
        this.f3467O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, 1);
    }

    public void insertEntry(int i, Object obj, int i2, int i3) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()[i] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i2, 0, i3);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        Set<Object> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(this);
    }

    public void moveLastEntry(int i, int i2) {
        Object obj = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        int[] iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        Object[] objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = null;
            iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i] = 0;
            return;
        }
        Object obj2 = objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3];
        objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = obj2;
        objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] = null;
        iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i] = iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i3];
        iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i3] = 0;
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj2) & i2;
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, obj);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 == size) {
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(obj, iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i + 1);
            return;
        }
        while (true) {
            int i4 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
            int i5 = iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i4] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i5, i + 1, i2);
                return;
            }
            iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i6;
        }
    }

    public boolean needsAllocArrays() {
        return this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        Object obj2 = this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj2);
        int iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(obj, null, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), null);
        if (iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 == -1) {
            return false;
        }
        moveLastEntry(iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i) {
        this.f3466O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Arrays.copyOf(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), i);
        this.elements = Arrays.copyOf(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<Object> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(size(), 1.0f);
            linkedHashSet.addAll(setDelegateOrNull);
            this.f3465O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = linkedHashSet;
            return;
        }
        int i = this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i < O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().length) {
            resizeEntries(i);
        }
        int iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(i);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, 0, 0);
        }
    }

    public static <E> O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 create(Collection<? extends E> collection) {
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize = createWithExpectedSize(collection.size());
        o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize.addAll(collection);
        return o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize;
    }

    public O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0(int i) {
        init(i);
    }

    @SafeVarargs
    public static <E> O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 create(E... eArr) {
        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize, eArr);
        return o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0CreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<Object> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return (T[]) setDelegateOrNull.toArray(tArr);
        }
        Object[] objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        int i = this.f3468O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(0, i, objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.length);
        if (tArr.length < i) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, tArr, 0, i);
        return tArr;
    }
}
