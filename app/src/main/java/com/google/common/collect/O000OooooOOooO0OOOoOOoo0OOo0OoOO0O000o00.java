package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 extends ReentrantLock {
    volatile int count;

    @Weak
    final O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO map;
    int modCount;
    final AtomicInteger readCount = new AtomicInteger();

    @CheckForNull
    volatile AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> table;
    int threshold;

    public O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        this.map = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO;
        initTable(newEntryArray(i));
    }

    public static <K, V, E extends O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> boolean isCollected(E e) {
        return e.getValue() == null;
    }

    public abstract O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 castForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);

    public void clear() {
        if (this.count != 0) {
            lock();
            try {
                AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
                for (int i = 0; i < atomicReferenceArray.length(); i++) {
                    atomicReferenceArray.set(i, null);
                }
                maybeClearReferenceQueues();
                this.readCount.set(0);
                this.modCount++;
                this.count = 0;
            } finally {
                unlock();
            }
        }
    }

    public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    @CanIgnoreReturnValue
    public boolean clearValueForTesting(Object obj, int i, O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        lock();
        try {
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    if (((O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() != o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
                        return false;
                    }
                    atomicReferenceArray.set(length, removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                    return true;
                }
            }
            return false;
        } finally {
            unlock();
        }
    }

    public boolean containsKey(Object obj, int i) {
        try {
            boolean z = false;
            if (this.count == 0) {
                return false;
            }
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 liveEntry = getLiveEntry(obj, i);
            if (liveEntry != null && liveEntry.getValue() != null) {
                z = true;
            }
            return z;
        } finally {
            postReadCleanup();
        }
    }

    public boolean containsValue(Object obj) {
        try {
            if (this.count != 0) {
                AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
                int length = atomicReferenceArray.length();
                for (int i = 0; i < length; i++) {
                    for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = atomicReferenceArray.get(i); o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                        Object liveValue = getLiveValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                        if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            postReadCleanup();
        }
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 copyEntry(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
        return this.map.entryHelper.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(self(), o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001);
    }

    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 copyForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, @CheckForNull O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
        return this.map.entryHelper.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(self(), castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000), castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001));
    }

    @GuardedBy("this")
    public void drainKeyReferenceQueue(ReferenceQueue<Object> referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            this.map.reclaimKey((O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) objPoll);
            i++;
        } while (i != 16);
    }

    @GuardedBy("this")
    public void drainValueReferenceQueue(ReferenceQueue<Object> referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            this.map.reclaimValue((O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) objPoll);
            i++;
        } while (i != 16);
    }

    @GuardedBy("this")
    public void expand() {
        AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.count;
        AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
        this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
        int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = atomicReferenceArray.get(i2);
            if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() & length2;
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == null) {
                    atomicReferenceArrayNewEntryArray.set(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                } else {
                    O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    while (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 != null) {
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() & length2;
                        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                            o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
                        }
                        o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                    atomicReferenceArrayNewEntryArray.set(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);
                    while (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() & length2;
                        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry = copyEntry(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, atomicReferenceArrayNewEntryArray.get(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3));
                        if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry != null) {
                            atomicReferenceArrayNewEntryArray.set(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry);
                        } else {
                            i--;
                        }
                        o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                }
            }
        }
        this.table = atomicReferenceArrayNewEntryArray;
        this.count = i;
    }

    @CheckForNull
    public Object get(Object obj, int i) {
        try {
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 liveEntry = getLiveEntry(obj, i);
            if (liveEntry == null) {
                return null;
            }
            Object value = liveEntry.getValue();
            if (value == null) {
                tryDrainReferenceQueues();
            }
            return value;
        } finally {
            postReadCleanup();
        }
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 getEntry(Object obj, int i) {
        if (this.count == 0) {
            return null;
        }
        for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 first = getFirst(i); first != null; first = first.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            if (first.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i) {
                Object key = first.getKey();
                if (key == null) {
                    tryDrainReferenceQueues();
                } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                    return first;
                }
            }
        }
        return null;
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 getFirst(int i) {
        AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
        return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
    }

    public ReferenceQueue<Object> getKeyReferenceQueueForTesting() {
        throw new AssertionError();
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 getLiveEntry(Object obj, int i) {
        return getEntry(obj, i);
    }

    @CheckForNull
    public Object getLiveValue(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.getKey() == null) {
            tryDrainReferenceQueues();
            return null;
        }
        Object value = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.getValue();
        if (value != null) {
            return value;
        }
        tryDrainReferenceQueues();
        return null;
    }

    @CheckForNull
    public Object getLiveValueForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return getLiveValue(castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    public ReferenceQueue<Object> getValueReferenceQueueForTesting() {
        throw new AssertionError();
    }

    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO getWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        throw new AssertionError();
    }

    public void initTable(AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray) {
        this.threshold = (atomicReferenceArray.length() * 3) / 4;
        this.table = atomicReferenceArray;
    }

    public void maybeClearReferenceQueues() {
    }

    @GuardedBy("this")
    public void maybeDrainReferenceQueues() {
    }

    public AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> newEntryArray(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 newEntryForTesting(Object obj, int i, @CheckForNull O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return this.map.entryHelper.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(self(), obj, i, castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO newWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, Object obj) {
        throw new AssertionError();
    }

    public void postReadCleanup() {
        if ((this.readCount.incrementAndGet() & 63) == 0) {
            runCleanup();
        }
    }

    @GuardedBy("this")
    public void preWriteCleanup() {
        runLockedCleanup();
    }

    @CheckForNull
    public Object put(Object obj, int i, Object obj2, boolean z) {
        lock();
        try {
            preWriteCleanup();
            int i2 = this.count + 1;
            if (i2 > this.threshold) {
                expand();
                i2 = this.count + 1;
            }
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue();
                    if (value == null) {
                        this.modCount++;
                        setValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2);
                        this.count = this.count;
                        return null;
                    }
                    if (z) {
                        return value;
                    }
                    this.modCount++;
                    setValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2);
                    return value;
                }
            }
            this.modCount++;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.map.entryHelper.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(self(), obj, i, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);
            setValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, obj2);
            atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            this.count = i2;
            return null;
        } finally {
            unlock();
        }
    }

    @CanIgnoreReturnValue
    public boolean reclaimKey(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, int i) {
        lock();
        try {
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = i & (atomicReferenceArray.length() - 1);
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
                    this.modCount++;
                    O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        } finally {
            unlock();
        }
    }

    @CanIgnoreReturnValue
    public boolean reclaimValue(Object obj, int i, O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        lock();
        try {
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    if (((O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() != o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
                        return false;
                    }
                    this.modCount++;
                    O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                    this.count = i2;
                    return true;
                }
            }
            return false;
        } finally {
            unlock();
        }
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public Object remove(Object obj, int i) {
        lock();
        try {
            preWriteCleanup();
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue();
                    if (value == null && !isCollected(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                        return null;
                    }
                    this.modCount++;
                    O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                    this.count = i2;
                    return value;
                }
            }
            return null;
        } finally {
            unlock();
        }
    }

    @GuardedBy("this")
    public boolean removeEntryForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
        int length = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & (atomicReferenceArray.length() - 1);
        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001 = atomicReferenceArray.get(length);
        for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
                this.modCount++;
                O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                int i = this.count - 1;
                atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                this.count = i;
                return true;
            }
        }
        return false;
    }

    @CheckForNull
    @GuardedBy("this")
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 removeFromChain(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
        int i = this.count;
        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        while (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 != o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry = copyEntry(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry != null) {
                o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000CopyEntry;
            } else {
                i--;
            }
            o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        this.count = i;
        return o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 removeFromChainForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
        return removeFromChain(castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000), castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001));
    }

    @CanIgnoreReturnValue
    public boolean removeTableEntryForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return removeEntryForTesting(castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    public boolean replace(Object obj, int i, Object obj2, Object obj3) {
        lock();
        try {
            preWriteCleanup();
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue();
                    if (value != null) {
                        if (!this.map.valueEquivalence().equivalent(obj2, value)) {
                            return false;
                        }
                        this.modCount++;
                        setValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj3);
                        return true;
                    }
                    if (isCollected(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                        this.modCount++;
                        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                        int i2 = this.count - 1;
                        atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                        this.count = i2;
                    }
                    return false;
                }
            }
            return false;
        } finally {
            unlock();
        }
    }

    public void runCleanup() {
        runLockedCleanup();
    }

    public void runLockedCleanup() {
        if (tryLock()) {
            try {
                maybeDrainReferenceQueues();
                this.readCount.set(0);
            } finally {
                unlock();
            }
        }
    }

    public abstract O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 self();

    public void setTableEntryForTesting(int i, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        this.table.set(i, castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    public void setValue(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, Object obj) {
        this.map.entryHelper.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(self(), o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, obj);
    }

    public void setValueForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, Object obj) {
        this.map.entryHelper.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(self(), castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000), obj);
    }

    public void setWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        throw new AssertionError();
    }

    public void tryDrainReferenceQueues() {
        if (tryLock()) {
            try {
                maybeDrainReferenceQueues();
            } finally {
                unlock();
            }
        }
    }

    public boolean remove(Object obj, int i, Object obj2) {
        lock();
        try {
            preWriteCleanup();
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
            while (true) {
                boolean z = false;
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                    return false;
                }
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    if (this.map.valueEquivalence().equivalent(obj2, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue())) {
                        z = true;
                    } else if (!isCollected(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                        return false;
                    }
                    this.modCount++;
                    O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    int i2 = this.count - 1;
                    atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                    this.count = i2;
                    return z;
                }
                o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        } finally {
            unlock();
        }
    }

    @CheckForNull
    public Object replace(Object obj, int i, Object obj2) {
        lock();
        try {
            preWriteCleanup();
            AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 = atomicReferenceArray.get(length);
            for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                Object key = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getKey();
                if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                    Object value = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getValue();
                    if (value == null) {
                        if (isCollected(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                            this.modCount++;
                            O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain = removeFromChain(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                            int i2 = this.count - 1;
                            atomicReferenceArray.set(length, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000RemoveFromChain);
                            this.count = i2;
                        }
                        return null;
                    }
                    this.modCount++;
                    setValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj2);
                    return value;
                }
            }
            return null;
        } finally {
            unlock();
        }
    }
}
