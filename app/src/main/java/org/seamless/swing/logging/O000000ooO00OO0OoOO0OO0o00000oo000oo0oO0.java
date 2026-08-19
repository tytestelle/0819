package org.seamless.swing.logging;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o f4503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f4504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        this.f4504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        this.f4503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.f4504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.logTableModel.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f4503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.logTableModel.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
            return;
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.logTable.scrollRectToVisible(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.logTable.getCellRect(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.logTableModel.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() - 1, 0, true));
    }
}
