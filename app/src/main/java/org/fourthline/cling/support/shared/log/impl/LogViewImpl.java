package org.fourthline.cling.support.shared.log.impl;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.tencent.smtt.sdk.TbsListener;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Singleton;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.fourthline.cling.support.shared.CenterWindow;
import org.fourthline.cling.support.shared.log.LogView;
import org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.swing.logging.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import org.seamless.swing.logging.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.seamless.swing.logging.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import org.seamless.swing.logging.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import org.seamless.swing.logging.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import org.seamless.swing.logging.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
public class LogViewImpl extends JPanel implements LogView {

    @Inject
    protected Event<CenterWindow> centerWindowEvent;

    @Inject
    protected LogView.LogCategories logCategories;
    protected O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO logCategorySelector;
    protected JTable logTable;
    protected O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 logTableModel;
    protected LogView.Presenter presenter;
    protected final JToolBar toolBar = new JToolBar();
    protected final JButton configureButton = new JButton("Options...", O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/configure.png"));
    protected final JButton clearButton = new JButton("Clear Log", O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/removetext.png"));
    protected final JButton copyButton = new JButton("Copy", O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/copyclipboard.png"));
    protected final JButton expandButton = new JButton("Expand", O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/viewtext.png"));
    protected final JButton pauseButton = new JButton("Pause/Continue Log", O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/pause.png"));
    protected final JLabel pauseLabel = new JLabel(" (Active)");
    protected final JComboBox expirationComboBox = new JComboBox(O00000OOoOOO00O00o0ooooooooO000ooooO0000.values());

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
        this.logTable.getColumnModel().getColumn(2).setMinWidth(110);
        this.logTable.getColumnModel().getColumn(2).setMaxWidth(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.logTable.getColumnModel().getColumn(3).setPreferredWidth(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO);
        this.logTable.getColumnModel().getColumn(3).setMaxWidth(TbsListener.ErrorCode.INFO_CODE_BASE);
        this.logTable.getColumnModel().getColumn(4).setPreferredWidth(600);
    }

    @Override // org.fourthline.cling.support.shared.View
    public Component asUIComponent() {
        return this;
    }

    @Override // org.fourthline.cling.support.shared.log.LogView
    public void dispose() {
        this.logCategorySelector.dispose();
    }

    public ImageIcon getDebugIcon() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/debug.png");
    }

    public O00000OOoOOO00O00o0ooooooooO000ooooO0000 getDefaultExpiration() {
        return O00000OOoOOO00O00o0ooooooooO000ooooO0000.SIXTY_SECONDS;
    }

    public int getExpandMessageCharacterLimit() {
        return 100;
    }

    public ImageIcon getInfoIcon() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/info.png");
    }

    public List<O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o> getSelectedMessages() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.logTable.getSelectedRows()) {
            arrayList.add((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this.logTableModel.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i));
        }
        return arrayList;
    }

    public ImageIcon getTraceIcon() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/trace.png");
    }

    public ImageIcon getWarnErrorIcon() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class, "img/warn.png");
    }

    @PostConstruct
    public void init() {
        setLayout(new BorderLayout());
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 defaultExpiration = getDefaultExpiration();
        this.logCategorySelector = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.logCategories);
        this.logTableModel = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(defaultExpiration.getSeconds());
        JTable jTable = new JTable(this.logTableModel);
        this.logTable = jTable;
        jTable.setDefaultRenderer(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.class, new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.1
            @Override // org.seamless.swing.logging.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
            public ImageIcon getDebugIcon() {
                return LogViewImpl.this.getDebugIcon();
            }

            @Override // org.seamless.swing.logging.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
            public ImageIcon getInfoIcon() {
                return LogViewImpl.this.getInfoIcon();
            }

            @Override // org.seamless.swing.logging.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
            public ImageIcon getTraceIcon() {
                return LogViewImpl.this.getTraceIcon();
            }

            @Override // org.seamless.swing.logging.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
            public ImageIcon getWarnErrorIcon() {
                return LogViewImpl.this.getWarnErrorIcon();
            }
        });
        this.logTable.setCellSelectionEnabled(false);
        this.logTable.setRowSelectionAllowed(true);
        this.logTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.2
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (!listSelectionEvent.getValueIsAdjusting() && listSelectionEvent.getSource() == LogViewImpl.this.logTable.getSelectionModel()) {
                    int[] selectedRows = LogViewImpl.this.logTable.getSelectedRows();
                    if (selectedRows == null || selectedRows.length == 0) {
                        LogViewImpl.this.copyButton.setEnabled(false);
                        LogViewImpl.this.expandButton.setEnabled(false);
                    } else {
                        if (selectedRows.length != 1) {
                            LogViewImpl.this.copyButton.setEnabled(true);
                            LogViewImpl.this.expandButton.setEnabled(false);
                            return;
                        }
                        LogViewImpl.this.copyButton.setEnabled(true);
                        if (((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) LogViewImpl.this.logTableModel.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(selectedRows[0])).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().length() > LogViewImpl.this.getExpandMessageCharacterLimit()) {
                            LogViewImpl.this.expandButton.setEnabled(true);
                        } else {
                            LogViewImpl.this.expandButton.setEnabled(false);
                        }
                    }
                }
            }
        });
        adjustTableUI();
        initializeToolBar(defaultExpiration);
        setPreferredSize(new Dimension(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 100));
        setMinimumSize(new Dimension(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 50));
        add(new JScrollPane(this.logTable), "Center");
        add(this.toolBar, "South");
    }

    public void initializeToolBar(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.configureButton.setFocusable(false);
        this.configureButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.3
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl logViewImpl = LogViewImpl.this;
                logViewImpl.centerWindowEvent.fire(new CenterWindow(logViewImpl.logCategorySelector));
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LogViewImpl.this.logCategorySelector;
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setVisible(!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isVisible());
            }
        });
        this.clearButton.setFocusable(false);
        this.clearButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.4
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl.this.logTableModel.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        });
        this.copyButton.setFocusable(false);
        this.copyButton.setEnabled(false);
        this.copyButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.5
            public void actionPerformed(ActionEvent actionEvent) {
                StringBuilder sb = new StringBuilder();
                Iterator<O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o> it = LogViewImpl.this.getSelectedMessages().iterator();
                while (it.hasNext()) {
                    sb.append(it.next().toString());
                    sb.append("\n");
                }
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(sb.toString());
            }
        });
        this.expandButton.setFocusable(false);
        this.expandButton.setEnabled(false);
        this.expandButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.6
            public void actionPerformed(ActionEvent actionEvent) {
                List<O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o> selectedMessages = LogViewImpl.this.getSelectedMessages();
                if (selectedMessages.size() != 1) {
                    return;
                }
                LogViewImpl.this.presenter.onExpand(selectedMessages.get(0));
            }
        });
        this.pauseButton.setFocusable(false);
        this.pauseButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.7
            public void actionPerformed(ActionEvent actionEvent) {
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = LogViewImpl.this.logTableModel;
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(!o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
                if (LogViewImpl.this.logTableModel.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
                    LogViewImpl.this.pauseLabel.setText(" (Paused)");
                } else {
                    LogViewImpl.this.pauseLabel.setText(" (Active)");
                }
            }
        });
        this.expirationComboBox.setSelectedItem(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        this.expirationComboBox.setMaximumSize(new Dimension(100, 32));
        this.expirationComboBox.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.log.impl.LogViewImpl.8
            public void actionPerformed(ActionEvent actionEvent) {
                LogViewImpl.this.logTableModel.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(((O00000OOoOOO00O00o0ooooooooO000ooooO0000) ((JComboBox) actionEvent.getSource()).getSelectedItem()).getSeconds());
            }
        });
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

    @Override // org.fourthline.cling.support.shared.log.LogView
    public void pushMessage(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        this.logTableModel.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        if (this.logTableModel.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
            return;
        }
        JTable jTable = this.logTable;
        jTable.scrollRectToVisible(jTable.getCellRect(this.logTableModel.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() - 1, 0, true));
    }

    @Override // org.fourthline.cling.support.shared.View
    public void setPresenter(LogView.Presenter presenter) {
        this.presenter = presenter;
    }
}
