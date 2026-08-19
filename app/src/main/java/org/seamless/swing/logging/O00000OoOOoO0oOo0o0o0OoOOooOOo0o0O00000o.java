package org.seamless.swing.logging;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o extends DefaultTableCellRenderer {
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");

    public abstract ImageIcon getDebugIcon();

    public abstract ImageIcon getInfoIcon();

    public Component getTableCellRendererComponent(JTable jTable, Object obj, boolean z, boolean z2, int i, int i2) {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) obj;
        if (i2 != 0) {
            if (i2 == 1) {
                return super.getTableCellRendererComponent(jTable, this.dateFormat.format(new Date(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().longValue())), z, z2, i, i2);
            }
            if (i2 != 2) {
                return i2 != 3 ? super.getTableCellRendererComponent(jTable, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().replaceAll("\n", "<NL>").replaceAll("\r", "<CR>"), z, z2, i, i2) : super.getTableCellRendererComponent(jTable, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), z, z2, i, i2);
            }
            return super.getTableCellRendererComponent(jTable, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), z, z2, i, i2);
        }
        if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().equals(Level.SEVERE) || o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().equals(Level.WARNING)) {
            return new JLabel(getWarnErrorIcon());
        }
        if (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().equals(Level.FINE)) {
            return new JLabel(getDebugIcon());
        }
        return (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().equals(Level.FINER) || o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().equals(Level.FINEST)) ? new JLabel(getTraceIcon()) : new JLabel(getInfoIcon());
    }

    public abstract ImageIcon getTraceIcon();

    public abstract ImageIcon getWarnErrorIcon();
}
