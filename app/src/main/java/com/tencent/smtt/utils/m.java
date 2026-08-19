package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class m implements Runnable {
    public static String a = "TBSFileLock";
    private static Object f = new Object();
    private static Object g = new Object();
    private static HashMap<m, Object> h;
    private static Handler i;
    File b;
    RandomAccessFile c = null;
    FileLock d = null;
    long e = 0;

    public m(File file, String str) {
        this.b = null;
        this.b = new File(file, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(".", str, ".lock"));
    }

    public Handler a() {
        if (i == null) {
            synchronized (m.class) {
                try {
                    if (i == null) {
                        HandlerThread handlerThread = new HandlerThread("QBFileLock.Thread");
                        handlerThread.start();
                        i = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:9:0x0014, B:11:0x0018, B:13:0x001e, B:15:0x0026, B:16:0x002f, B:18:0x0034, B:24:0x0048, B:28:0x0050, B:30:0x005f, B:27:0x004d, B:31:0x0066, B:22:0x003c, B:32:0x0091, B:34:0x0095, B:8:0x0011), top: B:39:0x0001, inners: #0, #1, #2 }] */
    public synchronized void b() {
        FileChannel channel;
        try {
            this.c = new RandomAccessFile(this.b, "rw");
        } catch (Exception e) {
            e.printStackTrace();
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null && (channel = randomAccessFile.getChannel()) != null) {
            if (this.e > 0) {
                a().postDelayed(this, this.e);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            FileLock fileLockLock = null;
            while (true) {
                try {
                    fileLockLock = channel.lock();
                    if (fileLockLock != null) {
                        break;
                    }
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    if (Math.abs(System.currentTimeMillis() - jCurrentTimeMillis) >= 1000) {
                        Log.d(a, ">>> lock timeout, quit...");
                        break;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    Log.d(a, ">>> lock failed, sleep...");
                }
            }
            this.d = fileLockLock;
            Log.d(a, ">>> lock [" + this.b.getName() + "] cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (this.d != null) {
                c();
            }
        } else if (this.d != null) {
            c();
        }
        throw th;
    }

    public void c() {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new HashMap<>();
                }
                h.put(this, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (g) {
            try {
                HashMap<m, Object> map = h;
                if (map == null) {
                    return;
                }
                map.remove(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        a(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d(a, ">>> releaseLock on TimeOut");
        e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001f, B:13:0x0029, B:14:0x002b, B:16:0x002f, B:20:0x0037, B:21:0x0039, B:23:0x003d, B:25:0x0045, B:27:0x004a, B:19:0x0034, B:12:0x0026), top: B:32:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001f, B:13:0x0029, B:14:0x002b, B:16:0x002f, B:20:0x0037, B:21:0x0039, B:23:0x003d, B:25:0x0045, B:27:0x004a, B:19:0x0034, B:12:0x0026), top: B:32:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004a A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001f, B:13:0x0029, B:14:0x002b, B:16:0x002f, B:20:0x0037, B:21:0x0039, B:23:0x003d, B:25:0x0045, B:27:0x004a, B:19:0x0034, B:12:0x0026), top: B:32:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized void a(boolean z) {
        RandomAccessFile randomAccessFile;
        Handler handler;
        Log.d(a, ">>> release lock: " + this.b.getName());
        FileLock fileLock = this.d;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.d = null;
            randomAccessFile = this.c;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.c = null;
                handler = i;
                if (handler != null && this.e > 0) {
                    handler.removeCallbacks(this);
                }
                if (z) {
                    d();
                }
            } else {
                handler = i;
                if (handler != null) {
                    handler.removeCallbacks(this);
                }
                if (z) {
                    d();
                }
            }
        } else {
            randomAccessFile = this.c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.c = null;
                handler = i;
                if (handler != null) {
                    handler.removeCallbacks(this);
                }
                if (z) {
                    d();
                }
            } else {
                handler = i;
                if (handler != null) {
                    handler.removeCallbacks(this);
                }
                if (z) {
                    d();
                }
            }
        }
        throw th;
    }
}
