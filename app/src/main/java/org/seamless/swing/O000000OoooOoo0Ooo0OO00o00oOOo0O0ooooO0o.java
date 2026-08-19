package org.seamless.swing;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends ActionListener, WindowListener {
    void dispose();

    void fireEvent(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, boolean z);

    List getSubControllers();

    Container getView();
}
