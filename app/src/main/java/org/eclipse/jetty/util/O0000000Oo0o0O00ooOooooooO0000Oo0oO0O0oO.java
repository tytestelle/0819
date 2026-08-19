package org.eclipse.jetty.util;

import java.util.AbstractList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends AbstractList implements BlockingQueue {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f4434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final AtomicInteger f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new AtomicInteger();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f4436O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public volatile int f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Object[] f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final ReentrantLock f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final Condition f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public int f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final ReentrantLock f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public int f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = reentrantLock;
        this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = reentrantLock.newCondition();
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new ReentrantLock();
        this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new Object[i];
        this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f4436O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        this.f4434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Integer.MAX_VALUE;
    }

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i;
        if (this.f4436O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o <= 0) {
            return false;
        }
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            try {
                int i2 = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                int i3 = this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                int i4 = this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + this.f4436O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                Object[] objArr = new Object[i4];
                if (i2 < i3) {
                    i = i3 - i2;
                    System.arraycopy(this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, i2, objArr, 0, i);
                } else if (i2 > i3 || this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() > 0) {
                    int i5 = (this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + i3) - i2;
                    int i6 = this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i2;
                    System.arraycopy(this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, i2, objArr, 0, i6);
                    System.arraycopy(this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 0, objArr, i6, i3);
                    i = i5;
                } else {
                    i = 0;
                }
                this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = objArr;
                this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i4;
                this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 0;
                this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i;
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                return true;
            } catch (Throwable th) {
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.concurrent.BlockingQueue, java.util.Queue
    public final boolean add(Object obj) {
        return offer(obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ReentrantLock reentrantLock = this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        reentrantLock.lock();
        ReentrantLock reentrantLock2 = this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        try {
            reentrantLock2.lock();
            try {
                this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 0;
                this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = 0;
                this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.set(0);
                reentrantLock2.unlock();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objPeek = peek();
        if (objPeek != null) {
            return objPeek;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            if (i >= 0) {
                try {
                    if (i < this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get()) {
                        int i2 = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + i;
                        if (i2 >= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                            i2 -= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        }
                        Object obj = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2];
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                        return obj;
                    }
                } catch (Throwable th) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ")");
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() == 0;
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() < this.f4434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() == this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
                    try {
                        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        } else {
                            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        }
                    } catch (Throwable th) {
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        throw th;
                    }
                }
                Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                int i = this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                objArr[i] = obj;
                this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (i + 1) % this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                boolean z = this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndIncrement() == 0;
                this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                if (z) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
                    try {
                        this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
                    } finally {
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                    }
                }
                return true;
            }
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            return false;
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        AtomicInteger atomicInteger = this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (atomicInteger.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        reentrantLock.lock();
        try {
            return atomicInteger.get() > 0 ? this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo] : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object obj = null;
        if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() == 0) {
            return null;
        }
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
        try {
            if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() > 0) {
                int i = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                Object obj2 = objArr[i];
                objArr[i] = null;
                this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (i + 1) % this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.decrementAndGet() > 0) {
                    this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
                }
                obj = obj2;
            }
            return obj;
        } finally {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(Object obj) {
        if (!offer(obj)) {
            throw new IllegalStateException("full");
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            try {
                int i = this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                return i;
            } catch (Throwable th) {
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objPoll = poll();
        if (objPoll != null) {
            return objPoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        obj.getClass();
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            if (i >= 0) {
                try {
                    if (i < this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get()) {
                        int i2 = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + i;
                        if (i2 >= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                            i2 -= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        }
                        Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        Object obj2 = objArr[i2];
                        objArr[i2] = obj;
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                        return obj2;
                    }
                } catch (Throwable th) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ")");
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object take() throws InterruptedException {
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lockInterruptibly();
        while (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() == 0) {
            try {
                try {
                    this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.await();
                } catch (InterruptedException e) {
                    this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
                    throw e;
                }
            } catch (Throwable th) {
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                throw th;
            }
        }
        int i = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (i + 1) % this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.decrementAndGet() > 0) {
            this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
        }
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        obj.getClass();
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            if (i >= 0) {
                try {
                    if (i <= this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get()) {
                        if (i == this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get()) {
                            offer(obj);
                        } else {
                            if (this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && !O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                                throw new IllegalStateException("full");
                            }
                            int i2 = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + i;
                            if (i2 >= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                i2 -= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            }
                            this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.incrementAndGet();
                            int i3 = (this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + 1) % this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i3;
                            if (i2 < i3) {
                                Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
                                this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2] = obj;
                            } else {
                                if (i3 > 0) {
                                    Object[] objArr2 = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                    System.arraycopy(objArr2, 0, objArr2, 1, i3);
                                    Object[] objArr3 = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                    objArr3[0] = objArr3[this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 1];
                                }
                                Object[] objArr4 = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                System.arraycopy(objArr4, i2, objArr4, i2 + 1, (this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i2) - 1);
                                this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i2] = obj;
                            }
                        }
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ")");
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lock();
        try {
            this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lock();
            if (i >= 0) {
                try {
                    if (i < this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get()) {
                        int i2 = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo + i;
                        if (i2 >= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                            i2 -= this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        }
                        Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        Object obj = objArr[i2];
                        int i3 = this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        if (i2 < i3) {
                            System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                            this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO--;
                            this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.decrementAndGet();
                        } else {
                            System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - i2) - 1);
                            if (this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO > 0) {
                                Object[] objArr2 = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                int i4 = this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                Object[] objArr3 = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                objArr2[i4] = objArr3[0];
                                System.arraycopy(objArr3, 1, objArr3, 0, this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO - 1);
                                this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO--;
                            } else {
                                this.f4443O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo - 1;
                            }
                            this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.decrementAndGet();
                        }
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
                        return obj;
                    }
                } catch (Throwable th) {
                    this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ")");
        } catch (Throwable th2) {
            this.f4442O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object poll(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.lockInterruptibly();
        while (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() == 0) {
            try {
                try {
                    if (nanos <= 0) {
                        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                        return null;
                    }
                    nanos = this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
                    throw e;
                }
            } catch (Throwable th) {
                this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
                throw th;
            }
        }
        Object[] objArr = this.f4438O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f4441O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (i + 1) % this.f4437O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (this.f4435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.decrementAndGet() > 0) {
            this.f4440O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.signal();
        }
        this.f4439O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.unlock();
        return obj;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
