package O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import android.webkit.JavascriptInterface;
import com.quickjs.JSArray;
import com.quickjs.JSObject;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final HashMap f1624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();

    @JavascriptInterface
    public void clear() {
        log("This 'console.clear' function is not supported");
    }

    @JavascriptInterface
    public final int count() {
        return this.f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @JavascriptInterface
    public final void error(String str) {
        this.f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO++;
        ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this).f1380O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(str);
    }

    @JavascriptInterface
    public void group(String str) {
        log("This 'console.group' function is not supported");
    }

    @JavascriptInterface
    public void groupCollapsed(String str) {
        log("This 'console.groupCollapsed' function is not supported");
    }

    @JavascriptInterface
    public void groupEnd(String str) {
        log("This 'console.groupEnd' function is not supported");
    }

    @JavascriptInterface
    public final void info(String str) {
        this.f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO++;
        ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this).f1380O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(str);
    }

    @JavascriptInterface
    public final void log(String str) {
        this.f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO++;
        ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this).f1380O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(str);
    }

    @JavascriptInterface
    public final void table(JSObject jSObject) {
        if (jSObject instanceof JSArray) {
            log(((JSArray) jSObject).O00000OOoOOO00O00o0ooooooooO000ooooO0000().toString());
        } else if (jSObject != null) {
            log(jSObject.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000().toString());
        }
    }

    @JavascriptInterface
    public final void time(String str) {
        HashMap map = this.f1624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!map.containsKey(str)) {
            map.put(str, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        warn("Timer '" + str + "' already exists");
    }

    @JavascriptInterface
    public final void timeEnd(String str) {
        HashMap map = this.f1624O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Long l = (Long) map.get(str);
        if (l != null) {
            log(str + ": " + (System.currentTimeMillis() - l.longValue()) + " ms");
        }
        map.remove(str);
    }

    @JavascriptInterface
    public void trace() {
        log("This 'console.trace' function is not supported");
    }

    @JavascriptInterface
    public final void warn(String str) {
        this.f1623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO++;
        ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this).f1380O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(str);
    }
}
