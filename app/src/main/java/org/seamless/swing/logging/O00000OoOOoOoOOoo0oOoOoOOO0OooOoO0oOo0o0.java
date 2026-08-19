package org.seamless.swing.logging;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 extends AbstractTableModel {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f4511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f4512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrayList f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(int i) {
        this.f4511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
        fireTableDataChanged();
    }

    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }

    public final Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        return this.f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(i);
    }

    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return this.f4512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final synchronized void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        try {
            if (this.f4512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                return;
            }
            if (this.f4511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != Integer.MAX_VALUE) {
                Iterator it = this.f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.iterator();
                long time = new Date().getTime();
                while (it.hasNext()) {
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) it.next();
                    if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().longValue() + ((long) (this.f4511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 1000)) < time) {
                        it.remove();
                    }
                }
            }
            this.f4513O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            fireTableDataChanged();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        this.f4511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(boolean z) {
        this.f4512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }
}
