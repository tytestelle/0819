package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public class O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo extends AbstractMap implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Object f3454O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new Object();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Object f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient int f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient int f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient Set f3458O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public transient Set f3459O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient Collection f3460O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    @CheckForNull
    transient int[] entries;

    @CheckForNull
    transient Object[] keys;

    @CheckForNull
    transient Object[] values;

    public O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo() {
        init(3);
    }

    public static Object access$100(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, int i) {
        return o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()[i];
    }

    public static /* synthetic */ int access$1210(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) {
        int i = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i - 1;
        return i;
    }

    public static void access$1300(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, int i, Object obj) {
        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[i] = obj;
    }

    public static Object access$600(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, int i) {
        return o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[i];
    }

    public static Object access$800(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) {
        Object obj = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static <K, V> O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo create() {
        return new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo();
    }

    public static <K, V> O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo createWithExpectedSize(int i) {
        return new O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Invalid size: "));
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<Object, Object>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<Object, Object> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return (1 << (this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO & 31)) - 1;
    }

    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        Object obj2 = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj2);
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 == 0) {
            return -1;
        }
        int i = ~iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i2 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i;
        do {
            int i3 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
            int i4 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()[i3];
            if ((i4 & i) == i2 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()[i3])) {
                return i3;
            }
            iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i4 & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        } while (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0);
        return -1;
    }

    public final Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        boolean zNeedsAllocArrays = needsAllocArrays();
        Object obj2 = f3454O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (zNeedsAllocArrays) {
            return obj2;
        }
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        Object obj3 = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj3);
        int iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(obj, null, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj3, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), null);
        if (iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 == -1) {
            return obj2;
        }
        Object obj4 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0];
        moveLastEntry(iO0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o--;
        incrementModCount();
        return obj4;
    }

    public final int[] O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, int i2, int i3, int i4) {
        Object objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, i3 & i5, i4 + 1);
        }
        Object obj = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        int[] iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        for (int i6 = 0; i6 <= i; i6++) {
            int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i6, obj);
            while (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0) {
                int i7 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
                int i8 = iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i10, objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, i10, iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0);
                iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i7] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i9, iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO1, i5);
                iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i8 & i;
            }
        }
        this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = objO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public void accessEntry(int i) {
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(needsAllocArrays(), "Arrays already allocated");
        int i = this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(i);
        this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo);
        this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 32 - Integer.numberOfLeadingZeros(iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo - 1), 31);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(size(), 3);
            mapDelegateOrNull.clear();
            this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
            this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
            return;
        }
        Arrays.fill(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), 0, this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Object) null);
        Arrays.fill(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), 0, this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Object) null);
        Object obj = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), 0, this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0);
        this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(obj);
        }
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i++) {
            if (com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[i])) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public Map<Object, Object> convertToHashFloodingResistantImplementation() {
        Map<Object, Object> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()[iFirstEntryIndex], O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[iFirstEntryIndex]);
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<Object, Object>> createEntrySet() {
        return new O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(this, 0);
    }

    public Map<Object, Object> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<Object> createKeySet() {
        return new O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(this, 1);
    }

    public Collection<Object> createValues() {
        return new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this, 0);
    }

    @CheckForNull
    public Map<Object, Object> delegateOrNull() {
        Object obj = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> set = this.f3459O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<Object, Object>> setCreateEntrySet = createEntrySet();
        this.f3459O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<Object, Object>> entrySetIterator() {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(this, 1);
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == -1) {
            return null;
        }
        accessEntry(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO];
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += 32;
    }

    public void init(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Expected size must be >= 0", i >= 0);
        this.f3456O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, 1);
    }

    public void insertEntry(int i, Object obj, Object obj2, int i2, int i3) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()[i] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i2, 0, i3);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()[i] = obj;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()[i] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        Set<Object> set = this.f3458O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (set != null) {
            return set;
        }
        Set<Object> setCreateKeySet = createKeySet();
        this.f3458O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<Object> keySetIterator() {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(this, 0);
    }

    public void moveLastEntry(int i, int i2) {
        Object obj = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj);
        int[] iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        Object[] objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        Object[] objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i] = null;
            objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i] = null;
            iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i] = 0;
            return;
        }
        Object obj2 = objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i3];
        objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i] = obj2;
        objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i] = objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i3];
        objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i3] = null;
        objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i3] = null;
        iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i] = iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i3];
        iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i3] = 0;
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj2) & i2;
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, obj);
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 == size) {
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(obj, iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i + 1);
            return;
        }
        while (true) {
            int i4 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - 1;
            int i5 = iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i4] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i5, i + 1, i2);
                return;
            }
            iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i6;
        }
    }

    public boolean needsAllocArrays() {
        return this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object put(Object obj, Object obj2) {
        int iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        int iMin;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(obj, obj2);
        }
        int[] iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        Object[] objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        Object[] objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        int i = this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i2 = i + 1;
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i3 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object obj3 = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Objects.requireNonNull(obj3);
        int iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(i3, obj3);
        int i4 = 1;
        if (iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 != 0) {
            int i5 = ~iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            int i6 = iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o & i5;
            int i7 = 0;
            while (true) {
                int i8 = iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 - i4;
                int i9 = iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i8];
                if ((i9 & i5) == i6 && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, objArrO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i8])) {
                    Object obj4 = objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i8];
                    objArrO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i8] = obj2;
                    accessEntry(i8);
                    return obj4;
                }
                int i10 = i9 & iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i2 <= iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                            iArrO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i8] = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i9, i2, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                            break;
                        }
                        iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO), iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i);
                        iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        break;
                    }
                    return convertToHashFloodingResistantImplementation().put(obj, obj2);
                }
                iO0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = i10;
                i4 = 1;
            }
        } else {
            if (i2 > iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO), iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, i);
                iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                break;
            }
            Object obj5 = this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            Objects.requireNonNull(obj5);
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(obj5, i3, i2);
        }
        int length = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(iMin);
        }
        insertEntry(i, obj, obj2, iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object remove(@CheckForNull Object obj) {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        Object objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj);
        if (objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == f3454O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return null;
        }
        return objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), i);
        this.keys = Arrays.copyOf(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), i);
        this.values = Arrays.copyOf(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<? extends Object, ? extends Object> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<Object, Object> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.f3455O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.f3457O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i < O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().length) {
            resizeEntries(i);
        }
        int iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(i);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        Collection<Object> collection = this.f3460O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionCreateValues = createValues();
        this.f3460O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<Object> valuesIterator() {
        Map<Object, Object> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(this, 2);
    }

    public O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(int i) {
        init(i);
    }
}
