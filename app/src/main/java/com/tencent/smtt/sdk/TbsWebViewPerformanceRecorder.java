package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class TbsWebViewPerformanceRecorder {
    private long a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private long e = 0;
    private String f = "unknown";

    public void a(long j) {
        this.a = j;
    }

    public void b(long j) {
        this.b = j;
    }

    public long getAverageUrlLoadTime() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        return this.d / j;
    }

    public long getConstructTime() {
        return this.a;
    }

    public long getCoreInitTime() {
        return this.b;
    }

    public String getCurrentUrl() {
        return this.f;
    }

    public long getCurrentUrlLoadTime() {
        return this.e;
    }

    public String getLog() {
        StringBuilder sb = new StringBuilder("TbsWebViewPerformanceRecorder{constructTime=");
        sb.append(this.a);
        sb.append(", coreInitTime=");
        sb.append(this.b);
        sb.append(", currentUrlLoadTime=");
        sb.append(this.e);
        sb.append(", currentUrl='");
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, this.f, "'}");
    }

    public void a(long j, String str) {
        this.d += j;
        this.c++;
        this.e = j;
        this.f = str;
    }
}
