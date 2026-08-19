package org.eclipse.jetty.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends Exception {
    private Object nested;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        super("Multiple exceptions");
    }

    public void add(Throwable th) {
        if (!(th instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            this.nested = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(this.nested, th);
            return;
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) th;
        for (int i = 0; i < O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.nested); i++) {
            this.nested = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(this.nested, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.nested, i));
        }
    }

    public Throwable getThrowable(int i) {
        return (Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, i);
    }

    public List<Throwable> getThrowables() {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(this.nested);
    }

    public void ifExceptionThrow() throws Exception {
        int size = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                throw this;
            }
            Throwable th = (Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof Exception)) {
                throw this;
            }
            throw ((Exception) th);
        }
    }

    public void ifExceptionThrowMulti() throws O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
        if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested) > 0) {
            throw this;
        }
    }

    public void ifExceptionThrowRuntime() {
        int size = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested);
        if (size != 0) {
            if (size != 1) {
                throw new RuntimeException(this);
            }
            Throwable th = (Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw new RuntimeException(th);
            }
            throw ((RuntimeException) th);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        for (int i = 0; i < O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested); i++) {
            ((Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, i)).printStackTrace();
        }
    }

    public int size() {
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested) <= 0) {
            return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class.getSimpleName().concat("[]");
        }
        return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class.getSimpleName() + O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(this.nested);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i = 0; i < O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested); i++) {
            ((Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, i)).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i = 0; i < O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(this.nested); i++) {
            ((Throwable) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(this.nested, i)).printStackTrace(printWriter);
        }
    }
}
