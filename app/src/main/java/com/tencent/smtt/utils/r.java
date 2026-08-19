package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.tencent.smtt.sdk.TbsLogReport;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class r {
    private static r a;
    private boolean c = false;
    private Map<String, Long> b = new HashMap();

    private r() {
    }

    public static r a() {
        if (a == null) {
            synchronized (TbsLogReport.class) {
                try {
                    if (a == null) {
                        a = new r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    private long b(String str) {
        Long l = this.b.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        TbsLog.i("TbsTimeRecorder", b());
        this.c = true;
        TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
        tbsLogReport.eventReport(TbsLogReport.EventType.TYPE_CORE_LOAD_PERFORMANCE, tbsLogReport.tbsLogInfo());
    }

    public String b() {
        long jB = b("init_tbs_end") - b("init_tbs_Start");
        long jB2 = b("preinit_finish") - b("preinit_start");
        long jB3 = b("create_webview_end") - b("create_webview_start");
        long jB4 = b("core_load_end") - b("core_load_start");
        StringBuilder sb = new StringBuilder("initX5Environment: ");
        if (!a(jB)) {
            jB = -1;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sb, jB, ","), "preInit: ");
        if (!a(jB2)) {
            jB2 = -1;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, jB2, ","), "webview: ");
        if (!a(jB3)) {
            jB3 = -1;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001, jB3, ","), "coreLoadCost: ");
        if (!a(jB4)) {
            jB4 = -1;
        }
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.append(jB4);
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.toString();
    }

    public void a(String str) {
        this.b.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private boolean a(long j) {
        return j <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US && j > 0;
    }
}
