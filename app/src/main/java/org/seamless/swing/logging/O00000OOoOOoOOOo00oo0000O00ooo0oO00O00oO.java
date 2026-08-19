package org.seamless.swing.logging;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.tencent.smtt.sdk.TbsListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends org.seamless.swing.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private final JButton clearButton;
    private final JButton configureButton;
    private final JButton copyButton;
    private final JButton expandButton;
    private final JComboBox expirationComboBox;
    private final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO logCategorySelector;
    private final JTable logTable;
    private final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 logTableModel;
    private final JButton pauseButton;
    private final JLabel pauseLabel;
    private final JToolBar toolBar;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, List list) {
        super(new JPanel(new BorderLayout()), o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        JToolBar jToolBar = new JToolBar();
        this.toolBar = jToolBar;
        this.configureButton = createConfigureButton();
        this.clearButton = createClearButton();
        this.copyButton = createCopyButton();
        this.expandButton = createExpandButton();
        this.pauseButton = createPauseButton();
        this.pauseLabel = new JLabel(" (Active)");
        this.expirationComboBox = new JComboBox(O00000OOoOOO00O00o0ooooooooO000ooooO0000.values());
        this.logCategorySelector = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(list);
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(o00000OOoOOO00O00o0ooooooooO000ooooO0000.getSeconds());
        this.logTableModel = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        JTable jTable = new JTable(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        this.logTable = jTable;
        jTable.setDefaultRenderer(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.class, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this));
        jTable.setCellSelectionEnabled(false);
        jTable.setRowSelectionAllowed(true);
        jTable.getSelectionModel().addListSelectionListener(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo());
        adjustTableUI();
        initializeToolBar(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        getView().setPreferredSize(new Dimension(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 100));
        getView().setMinimumSize(new Dimension(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 50));
        getView().add(new JScrollPane(jTable), "Center");
        getView().add(jToolBar, "South");
    }

    public void adjustTableUI() {
        this.logTable.setFocusable(false);
        this.logTable.setRowHeight(18);
        this.logTable.getTableHeader().setReorderingAllowed(false);
        this.logTable.setBorder(BorderFactory.createEmptyBorder());
        this.logTable.getColumnModel().getColumn(0).setMinWidth(30);
        this.logTable.getColumnModel().getColumn(0).setMaxWidth(30);
        this.logTable.getColumnModel().getColumn(0).setResizable(false);
        this.logTable.getColumnModel().getColumn(1).setMinWidth(90);
        this.logTable.getColumnModel().getColumn(1).setMaxWidth(90);
        this.logTable.getColumnModel().getColumn(1).setResizable(false);
        this.logTable.getColumnModel().getColumn(2).setMinWidth(100);
        this.logTable.getColumnModel().getColumn(2).setMaxWidth(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.logTable.getColumnModel().getColumn(3).setPreferredWidth(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO);
        this.logTable.getColumnModel().getColumn(3).setMaxWidth(TbsListener.ErrorCode.INFO_CODE_BASE);
        this.logTable.getColumnModel().getColumn(4).setPreferredWidth(600);
    }

    public JButton createClearButton() {
        return new JButton("Clear Log", org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/removetext.png"));
    }

    public JButton createConfigureButton() {
        return new JButton("Options...", org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/configure.png"));
    }

    public JButton createCopyButton() {
        return new JButton("Copy", org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/copyclipboard.png"));
    }

    public JButton createExpandButton() {
        return new JButton("Expand", org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/viewtext.png"));
    }

    public JButton createPauseButton() {
        return new JButton("Pause/Continue Log", org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/pause.png"));
    }

    public ImageIcon getDebugIcon() {
        return org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/debug.png");
    }

    public int getExpandMessageCharacterLimit() {
        return 100;
    }

    public ImageIcon getInfoIcon() {
        return org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/info.png");
    }

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 getLogTableModel() {
        return this.logTableModel;
    }

    public List<O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o> getSelectedMessages() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.logTable.getSelectedRows()) {
            arrayList.add((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this.logTableModel.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i));
        }
        return arrayList;
    }

    public ImageIcon getTraceIcon() {
        return org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/trace.png");
    }

    public ImageIcon getWarnErrorIcon() {
        return org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/warn.png");
    }

    public void initializeToolBar(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.configureButton.setFocusable(false);
        this.configureButton.addActionListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO());
        this.clearButton.setFocusable(false);
        this.clearButton.addActionListener(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O());
        this.copyButton.setFocusable(false);
        this.copyButton.setEnabled(false);
        this.copyButton.addActionListener(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO());
        this.expandButton.setFocusable(false);
        this.expandButton.setEnabled(false);
        this.expandButton.addActionListener(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo());
        this.pauseButton.setFocusable(false);
        this.pauseButton.addActionListener(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0());
        this.expirationComboBox.setSelectedItem(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        this.expirationComboBox.setMaximumSize(new Dimension(100, 32));
        this.expirationComboBox.addActionListener(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00());
        this.toolBar.setFloatable(false);
        this.toolBar.add(this.copyButton);
        this.toolBar.add(this.expandButton);
        this.toolBar.add(Box.createHorizontalGlue());
        this.toolBar.add(this.configureButton);
        this.toolBar.add(this.clearButton);
        this.toolBar.add(this.pauseButton);
        this.toolBar.add(this.pauseLabel);
        this.toolBar.add(Box.createHorizontalGlue());
        this.toolBar.add(new JLabel("Clear after:"));
        this.toolBar.add(this.expirationComboBox);
    }

    public void pushMessage(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        SwingUtilities.invokeLater(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o));
    }
}
