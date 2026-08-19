package org.seamless.swing.logging;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends JDialog {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final JPanel f4501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(List list) {
        JPanel jPanel = new JPanel();
        this.f4501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jPanel;
        setTitle("Select logging categories...");
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) it.next());
        }
        JScrollPane jScrollPane = new JScrollPane(this.f4501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(jScrollPane);
        setMaximumSize(new Dimension(750, 550));
        setResizable(false);
        pack();
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, JPanel jPanel) {
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, 1));
        Iterator it = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().iterator();
        while (it.hasNext()) {
            JCheckBox jCheckBox = new JCheckBox(((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) it.next()).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
            jCheckBox.setSelected(false);
            jCheckBox.setFocusable(false);
            jCheckBox.addItemListener(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o());
            jPanel2.add(jCheckBox);
        }
        JToolBar jToolBar = new JToolBar();
        jToolBar.setFloatable(false);
        JButton jButton = new JButton("All");
        jButton.setFocusable(false);
        jButton.addActionListener(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
        jToolBar.add(jButton);
        JButton jButton2 = new JButton("None");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0());
        jToolBar.add(jButton2);
        jPanel.add(jPanel2, "Center");
        jPanel.add(jToolBar, "North");
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setBorder(BorderFactory.createTitledBorder(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()));
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, jPanel);
        this.f4501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(jPanel);
    }
}
