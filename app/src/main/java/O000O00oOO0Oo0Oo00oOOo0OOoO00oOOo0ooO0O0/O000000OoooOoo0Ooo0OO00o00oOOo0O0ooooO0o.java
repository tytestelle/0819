package O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Executor {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public AbstractCollection f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final AtomicInteger f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new AtomicInteger();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final AtomicInteger f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new AtomicInteger();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final AtomicLong f2027O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new AtomicLong();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final org.eclipse.jetty.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new org.eclipse.jetty.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final Object f2029O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new Object();

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final int f2032O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 60000;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public int f2033O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = 254;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public int f2034O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = 8;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final int f2035O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = -1;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final int f2036O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = 5;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public boolean f2037O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final int f2038O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = 100;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2039O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 13);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public String f2031O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = "qtp" + super.hashCode();

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getName());
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        AtomicInteger atomicInteger = this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (atomicInteger.compareAndSet(i, i + 1)) {
            try {
                Thread thread = new Thread(this.f2039O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                thread.setDaemon(this.f2037O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                thread.setPriority(this.f2036O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                thread.setName(this.f2031O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + "-" + thread.getId());
                this.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.add(thread);
                thread.start();
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.concurrent.BlockingQueue] */
    @Override // O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final boolean dispatch(Runnable runnable) {
        int i;
        if (isRunning()) {
            int size = this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.size();
            int i2 = this.f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
            if (this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.offer(runnable)) {
                if ((i2 == 0 || size > i2) && (i = this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get()) < this.f2033O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i);
                }
                return true;
            }
        }
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStart() {
        AbstractCollection o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        super.doStart();
        AtomicInteger atomicInteger = this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        atomicInteger.set(0);
        if (this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
            int i = this.f2035O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (i > 0) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayBlockingQueue(i);
            } else {
                int i2 = this.f2034O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new org.eclipse.jetty.util.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i2, i2);
            }
            this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        for (int i3 = atomicInteger.get(); isRunning() && i3 < this.f2034O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO; i3 = atomicInteger.get()) {
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.AbstractCollection, java.util.concurrent.BlockingQueue] */
    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStop() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f2038O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 / 2) {
            Thread.sleep(1L);
        }
        this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.clear();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(0);
        int i = this.f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.offer(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            i = i2;
        }
        Thread.yield();
        if (this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get() > 0) {
            Iterator it = this.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
            while (it.hasNext()) {
                ((Thread) it.next()).interrupt();
            }
        }
        while (this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f2038O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            Thread.sleep(1L);
        }
        Thread.yield();
        int size = this.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4448O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
        if (size > 0) {
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                for (Thread thread : this.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4449O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000oooOoo00ooo0O0000000o00O0Oooo0OOO("Couldn't stop " + thread, new Object[0]);
                    for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f2029O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            this.f2029O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.notifyAll();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!dispatch(runnable)) {
            throw new RejectedExecutionException();
        }
    }

    @Override // O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final boolean isLowOnThreads() {
        return this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get() == this.f2033O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 && this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.size() >= this.f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2031O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        sb.append("{");
        sb.append(this.f2034O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        sb.append("<=");
        sb.append(this.f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get());
        sb.append("<=");
        sb.append(this.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get());
        sb.append(ServiceReference.DELIMITER);
        sb.append(this.f2033O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        sb.append(",");
        AbstractCollection abstractCollection = this.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, "}", abstractCollection == null ? -1 : abstractCollection.size());
    }
}
