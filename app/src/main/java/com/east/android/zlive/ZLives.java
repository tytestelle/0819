package com.east.android.zlive;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public class ZLives {
    private static final int PORT = 6677;
    private final String BASE = "http://127.0.0.1:6677/stream/";
    private boolean init;

    public static class Loader {
        static volatile ZLives INSTANCE = new ZLives();

        private Loader() {
        }
    }

    public static ZLives get() {
        return Loader.INSTANCE;
    }

    private String getLive(String str) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("http://127.0.0.1:6677/stream/live?uuid=", str);
    }

    private String getOpen(String str) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("http://127.0.0.1:6677/stream/open?uuid=", str);
    }

    public String fetch(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        if (!this.init) {
            init();
        }
        String[] strArrSplit = str.split(ServiceReference.DELIMITER);
        // 防止异常频道格式继续进入直播解析流程
        if (strArrSplit.length < 4) {
            return str.replace("zlive", "http");
        }
        if (strArrSplit[2] == null || strArrSplit[3] == null || strArrSplit[3].length() == 0) {
            return null;
        }
        String str2 = strArrSplit[2];
        String str3 = strArrSplit[3];
        String str4 = getLive(str3) + "&server=" + str2 + "&group=5850&mac=00:00:00:00:00:00&dir=" + FileUtil.getCacheDir();
        new Thread(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getOpen(str3), 5)).start();
        return str4;
    }

    public synchronized void init() {
        if (this.init) {
            return;
        }
        try {
            ZLive.INSTANCE.OnLiveStart(6677L);
            this.init = true;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError | RuntimeException unused) {
            this.init = false;
        }
    }

    public synchronized void stop() {
        try {
            if (this.init) {
                ZLive.INSTANCE.OnLiveStop();
            }
            this.init = false;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError | RuntimeException e) {
            e.printStackTrace();
            this.init = false;
        }
    }
}
