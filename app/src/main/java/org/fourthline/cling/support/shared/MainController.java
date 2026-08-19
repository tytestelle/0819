package org.fourthline.cling.support.shared;

import com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import java.awt.Dimension;
import java.awt.Frame;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.UIManager;
import org.fourthline.cling.UpnpService;
import org.seamless.swing.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.swing.logging.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.seamless.swing.logging.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import org.seamless.swing.logging.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import org.seamless.swing.logging.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MainController extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private final O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO logController;
    private final JPanel logPanel;

    public static class ShutdownWindow extends JWindow {
        public static final JWindow INSTANCE = new ShutdownWindow();

        public ShutdownWindow() {
            JLabel jLabel = new JLabel("Shutting down, please wait...");
            jLabel.setHorizontalAlignment(0);
            getContentPane().add(jLabel);
            setPreferredSize(new Dimension(300, 30));
            pack();
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
        }
    }

    public MainController(JFrame jFrame, List<org.seamless.swing.logging.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> list) {
        super(jFrame);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Unable to load native look and feel: " + e.toString());
        }
        System.setProperty("sun.awt.exception.handler", AWTExceptionHandler.class.getName());
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.fourthline.cling.support.shared.MainController.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (MainController.this.getUpnpService() != null) {
                    MainController.this.getUpnpService().shutdown();
                }
            }
        });
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, list) { // from class: org.fourthline.cling.support.shared.MainController.2
            {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000.SIXTY_SECONDS;
            }

            public void expand(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                fireEventGlobal(new TextExpandEvent(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4510O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0));
            }

            public Frame getParentWindow() {
                return MainController.this.getView();
            }
        };
        this.logController = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        JPanel view = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getView();
        this.logPanel = view;
        view.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: org.fourthline.cling.support.shared.MainController.3
            @Override // org.seamless.swing.logging.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
            public void log(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                MainController.this.logController.pushMessage(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            }
        };
        if (System.getProperty("java.util.logging.config.file") == null) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        } else {
            LogManager.getLogManager().getLogger("").addHandler(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        }
    }

    @Override // org.seamless.swing.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void dispose() {
        super.dispose();
        ShutdownWindow.INSTANCE.setVisible(true);
        new Thread() { // from class: org.fourthline.cling.support.shared.MainController.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                System.exit(0);
            }
        }.start();
    }

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO getLogController() {
        return this.logController;
    }

    public JPanel getLogPanel() {
        return this.logPanel;
    }

    public abstract UpnpService getUpnpService();

    public void log(Level level, String str) {
        log(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(level, null, str));
    }

    public void log(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        getLogController().pushMessage(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
    }
}
