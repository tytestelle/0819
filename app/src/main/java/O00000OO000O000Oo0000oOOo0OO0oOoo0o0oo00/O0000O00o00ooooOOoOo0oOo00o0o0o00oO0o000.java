package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 extends Exception {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final StackTraceElement[] f364O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO dataSource;
    private String detailMessage;

    @Nullable
    private Exception exception;
    private O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo key;

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Throwable th, ArrayList arrayList) {
        if (!(th instanceof O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) th).getCauses().iterator();
        while (it.hasNext()) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(it.next(), arrayList);
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(List list, O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
        try {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(list, o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(List list, O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.append("Cause (");
            int i2 = i + 1;
            o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.append(String.valueOf(i2));
            o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.append(" of ");
            o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.append(String.valueOf(size));
            o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) {
                O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) th;
                o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.getClass();
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.getCauses(), new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0));
            } else {
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th, o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
            }
            i = i2;
        }
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        setLoggingDetails(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, null);
    }

    public void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, printStream);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getCauses(), new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(printStream));
    }

    public void setLoggingDetails(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Class<?> cls) {
        this.key = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.dataSource = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.dataClass = cls;
    }

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f364O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, printWriter);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getCauses(), new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(printWriter));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
