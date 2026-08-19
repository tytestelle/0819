package org.fourthline.cling.support.shared;

import com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import com.tencent.smtt.sdk.TbsListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.LogManager;
import javax.inject.Inject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.fourthline.cling.support.shared.log.LogView;
import org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.swing.logging.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import org.seamless.swing.logging.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Main implements ShutdownHandler, Thread.UncaughtExceptionHandler {
    protected boolean isRegularShutdown;

    @Inject
    LogView.Presenter logPresenter;
    protected final JFrame errorWindow = new JFrame();
    protected final O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 loggingHandler = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: org.fourthline.cling.support.shared.Main.1
        @Override // org.seamless.swing.logging.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
        public void log(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
            Main.this.logPresenter.pushMessage(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        }
    };

    public abstract String getAppName();

    public void init() {
        try {
            if (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()) {
                NewPlatformApple.setup(this, getAppName());
            }
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception unused) {
        }
        this.errorWindow.setPreferredSize(new Dimension(900, TbsListener.ErrorCode.INFO_CODE_BASE));
        this.errorWindow.addWindowListener(new WindowAdapter() { // from class: org.fourthline.cling.support.shared.Main.2
            public void windowClosing(WindowEvent windowEvent) {
                Main.this.errorWindow.dispose();
            }
        });
        Thread.setDefaultUncaughtExceptionHandler(this);
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.fourthline.cling.support.shared.Main.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Main main = Main.this;
                if (main.isRegularShutdown) {
                    return;
                }
                main.shutdown();
            }
        });
        if (System.getProperty("java.util.logging.config.file") == null) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this.loggingHandler);
        } else {
            LogManager.getLogManager().getLogger("").addHandler(this.loggingHandler);
        }
    }

    public void removeLoggingHandler() {
        LogManager.getLogManager().getLogger("").removeHandler(this.loggingHandler);
    }

    @Override // org.fourthline.cling.support.shared.ShutdownHandler
    public void shutdown() {
        this.isRegularShutdown = true;
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.Main.4
            @Override // java.lang.Runnable
            public void run() {
                Main.this.errorWindow.dispose();
            }
        });
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, final Throwable th) {
        PrintStream printStream = System.err;
        printStream.println("In thread '" + thread + "' uncaught exception: " + th);
        th.printStackTrace(printStream);
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.Main.5
            @Override // java.lang.Runnable
            public void run() {
                Main.this.errorWindow.getContentPane().removeAll();
                JTextArea jTextArea = new JTextArea();
                jTextArea.setEditable(false);
                StringBuilder sb = new StringBuilder("An exceptional error occurred!\nYou can try to continue or exit the application.\n\nPlease tell us about this here:\nhttp://www.4thline.org/projects/mailinglists-cling.html\n\n-------------------------------------------------------------------------------------------------------------\n\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                sb.append(stringWriter.toString());
                jTextArea.setText(sb.toString());
                Main.this.errorWindow.getContentPane().add(new JScrollPane(jTextArea), "Center");
                JButton jButton = new JButton("Exit Application");
                jButton.addActionListener(new ActionListener() { // from class: org.fourthline.cling.support.shared.Main.5.1
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.exit(1);
                    }
                });
                Main.this.errorWindow.getContentPane().add(jButton, "South");
                Main.this.errorWindow.pack();
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Main.this.errorWindow);
                jTextArea.setCaretPosition(0);
                Main.this.errorWindow.setVisible(true);
            }
        });
    }
}
