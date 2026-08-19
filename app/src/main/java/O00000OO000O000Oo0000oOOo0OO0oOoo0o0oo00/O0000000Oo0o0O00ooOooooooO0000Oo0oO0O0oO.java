package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.os.Environment;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import com.github.tvbox.osc.ui.dialog.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
import com.warkiz.widget.IndicatorSeekBar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, int i) {
        this.f210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.AbstractCollection, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.util.AbstractCollection, java.util.concurrent.BlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.util.AbstractCollection, java.util.concurrent.BlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.util.AbstractCollection, java.util.Queue] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        boolean z2 = false;
        switch (this.f210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).run();
                return;
            case 1:
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
                while (true) {
                    try {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) ((ReferenceQueue) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1030O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.postDelayed(this, 1000L);
                return;
            case 3:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                try {
                    o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.evaluateJavascript("localStorage.clear();", null);
                    o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.evaluateJavascript("sessionStorage.clear();", null);
                    o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.freeMemory();
                    Log.d("SimpleWebView", "DOM storage cleared successfully");
                    break;
                } catch (Exception e) {
                    Log.e("SimpleWebView", "Failed to clear DOM storage: " + e.getMessage());
                }
                o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getClass();
                return;
            case 4:
                ((View) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).setClickable(true);
                return;
            case 5:
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000((String) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, null);
                return;
            case 6:
                O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
                Object obj = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            case 7:
                O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.getClass();
                Object obj2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            case 8:
                O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.getClass();
                Object obj3 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            case 9:
                O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.getClass();
                Object obj4 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            case 10:
                O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5.getClass();
                Object obj5 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            case 11:
                ((IndicatorSeekBar) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).requestLayout();
                return;
            case 12:
                O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass();
                boolean z3 = true;
                while (z3) {
                    while (true) {
                        try {
                            try {
                                O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                                if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} replaced {}", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
                                } else {
                                    try {
                                        if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                            try {
                                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                            } catch (Throwable th) {
                                                try {
                                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th);
                                                    try {
                                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                                    } catch (IOException e2) {
                                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
                                                    }
                                                } catch (Throwable th2) {
                                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                                    throw th2;
                                                }
                                            }
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                        }
                                        z3 = !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z = true;
                                    }
                                }
                            } catch (ClosedChannelException e3) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                                if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                    try {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                    } catch (Throwable th4) {
                                        try {
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th4);
                                            try {
                                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                            } catch (IOException e4) {
                                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e4);
                                            }
                                        } catch (Throwable th5) {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                            throw th5;
                                        }
                                    }
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                }
                            } catch (Throwable th6) {
                                try {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("handle failed", th6);
                                    try {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                    } catch (IOException e5) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e5);
                                    }
                                    if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                        try {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                        } catch (Throwable th7) {
                                            try {
                                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th7);
                                                try {
                                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                                } catch (IOException e6) {
                                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e6);
                                                }
                                            } catch (Throwable th8) {
                                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                                throw th8;
                                            }
                                        }
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                    }
                                } catch (Throwable th9) {
                                    if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                        try {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                        } catch (Throwable th10) {
                                            try {
                                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th10);
                                                try {
                                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                                } catch (IOException e7) {
                                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e7);
                                                }
                                            } catch (Throwable th11) {
                                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                                throw th11;
                                            }
                                        }
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                    }
                                    z = true;
                                    z3 = !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                                    try {
                                        throw th9;
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                }
                            }
                            break;
                        } catch (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO e8) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EOF", e8);
                            try {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                            } catch (IOException e9) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e9);
                            }
                            if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                try {
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                } catch (Throwable th13) {
                                    try {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th13);
                                        try {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                        } catch (IOException e10) {
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e10);
                                        }
                                    } catch (Throwable th14) {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                        throw th14;
                                    }
                                }
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                            }
                            break;
                        } catch (IOException e11) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(e11.toString(), new Object[0]);
                            try {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                            } catch (IOException e12) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e12);
                            }
                            if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = true;
                                try {
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                } catch (Throwable th15) {
                                    try {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th15);
                                        try {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                                        } catch (IOException e13) {
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e13);
                                        }
                                    } catch (Throwable th16) {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                                        throw th16;
                                    }
                                }
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                            }
                            break;
                        }
                        th = th3;
                        z = true;
                        if (z3) {
                            for (boolean zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(); zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O ^ z; zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O()) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("SCEP.run() finally DISPATCHED", new Object[0]);
                            }
                        }
                        throw th;
                    }
                }
                if (z3) {
                    for (boolean zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(); !zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2; zO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O()) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("SCEP.run() finally DISPATCHED", new Object[0]);
                    }
                    return;
                }
                return;
            case 13:
                O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                try {
                    try {
                        AbstractCollection r0 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        AtomicInteger atomicInteger3 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2026O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        Runnable runnable = (Runnable) r0.poll();
                        boolean z4 = false;
                        while (true) {
                            try {
                                boolean zIsRunning = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isRunning();
                                org.eclipse.jetty.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                atomicInteger = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                if (zIsRunning) {
                                    while (runnable != null && o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isRunning()) {
                                        runnable.run();
                                        runnable = (Runnable) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.poll();
                                    }
                                    try {
                                        try {
                                            atomicInteger3.incrementAndGet();
                                            while (true) {
                                                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isRunning() && runnable == null) {
                                                    try {
                                                        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2032O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo <= 0) {
                                                            runnable = (Runnable) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.take();
                                                        } else {
                                                            int i = atomicInteger.get();
                                                            if (i > o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2034O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                                                                AtomicLong atomicLong = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2027O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                                                long j = atomicLong.get();
                                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                                if (j != 0) {
                                                                    atomicInteger2 = atomicInteger3;
                                                                    if (jCurrentTimeMillis - j > o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2032O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                                                    }
                                                                } else {
                                                                    atomicInteger2 = atomicInteger3;
                                                                }
                                                                boolean z5 = atomicLong.compareAndSet(j, jCurrentTimeMillis) && atomicInteger.compareAndSet(i, i + (-1));
                                                                if (z5) {
                                                                    atomicInteger2.decrementAndGet();
                                                                    if (!z5) {
                                                                    }
                                                                } else {
                                                                    z4 = z5;
                                                                }
                                                            } else {
                                                                atomicInteger2 = atomicInteger3;
                                                            }
                                                            try {
                                                                runnable = (Runnable) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2030O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.poll(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2032O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, TimeUnit.MILLISECONDS);
                                                                atomicInteger3 = atomicInteger2;
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                atomicInteger2.decrementAndGet();
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        atomicInteger2 = atomicInteger3;
                                                        atomicInteger2.decrementAndGet();
                                                        throw th;
                                                    }
                                                } else {
                                                    AtomicInteger atomicInteger4 = atomicInteger3;
                                                    atomicInteger4.decrementAndGet();
                                                    atomicInteger3 = atomicInteger4;
                                                    z2 = false;
                                                }
                                            }
                                        } catch (InterruptedException e14) {
                                            e = e14;
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                                            if (!z2) {
                                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.decrementAndGet();
                                            }
                                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Thread.currentThread());
                                            return;
                                        } catch (Exception e15) {
                                            e = e15;
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2024O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                                            if (!z2) {
                                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.decrementAndGet();
                                            }
                                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Thread.currentThread());
                                            return;
                                        }
                                    } catch (Throwable th19) {
                                        th = th19;
                                    }
                                } else if (!z4) {
                                }
                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.remove(Thread.currentThread());
                                return;
                            } catch (InterruptedException e16) {
                                e = e16;
                                z2 = z4;
                            } catch (Exception e17) {
                                e = e17;
                                z2 = z4;
                            } catch (Throwable th20) {
                                th = th20;
                                z2 = z4;
                                if (!z2) {
                                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2025O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.decrementAndGet();
                                }
                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2028O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Thread.currentThread());
                                throw th;
                            }
                        }
                        atomicInteger.decrementAndGet();
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.remove(Thread.currentThread());
                        return;
                    } catch (InterruptedException e18) {
                        e = e18;
                        z2 = false;
                    } catch (Exception e19) {
                        e = e19;
                        z2 = false;
                    } catch (Throwable th21) {
                        th = th21;
                        z2 = false;
                    }
                } catch (Throwable th22) {
                    th = th22;
                }
                break;
            case 14:
                com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f2866O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                return;
            case 15:
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                PopupWindow popupWindow = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    return;
                }
                o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.dismiss();
                return;
            case 16:
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                PopupWindow popupWindow2 = o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (popupWindow2 == null || !popupWindow2.isShowing()) {
                    return;
                }
                o0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.dismiss();
                return;
            case 17:
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                PopupWindow popupWindow3 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                if (popupWindow3 == null || !popupWindow3.isShowing()) {
                    return;
                }
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3276O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.dismiss();
                return;
            case 18:
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = (O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                try {
                    if (!Environment.getExternalStorageState().equals("mounted")) {
                        return;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3305O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).openConnection();
                    httpURLConnection.connect();
                    int contentLength = httpURLConnection.getContentLength();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    File file = new File(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3300O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3301O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3300O00000OOoOOO00O00o0ooooooooO000ooooO0000 + "ApkUpdate.apk";
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3301O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO));
                    byte[] bArr = new byte[1024];
                    int i2 = 0;
                    while (true) {
                        int i3 = inputStream.read(bArr);
                        i2 += i3;
                        o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3306O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (int) ((i2 / contentLength) * 100.0f);
                        o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3317O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.sendEmptyMessage(1);
                        if (i3 <= 0) {
                            o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3317O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.sendEmptyMessage(2);
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i3);
                    }
                } catch (Exception e20) {
                    e20.printStackTrace();
                    return;
                }
                break;
            default:
                ((com.lzy.okgo.request.base.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).getClass();
                return;
        }
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(com.lzy.okgo.request.base.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 19;
        this.f211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
