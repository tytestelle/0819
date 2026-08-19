package org.seamless.swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URL;
import javax.swing.ImageIcon;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Window window) {
        Dimension size = window.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int i = (screenSize.width - size.width) / 2;
        int i2 = (screenSize.height - size.height) / 2;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        window.setLocation(i, i2);
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Window window, Window window2) {
        window.setLocation((int) (((window2.getSize().getWidth() / 2.0d) + ((double) window2.getX())) - (window.getSize().getWidth() / 2.0d)), (int) (((window2.getSize().getHeight() / 2.0d) + ((double) window2.getY())) - (window.getSize().getHeight() / 2.0d)));
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) {
        Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(str);
        systemClipboard.setContents(stringSelection, stringSelection);
    }

    public static ImageIcon O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Class cls, String str) {
        URL resource = cls.getResource(str);
        if (resource != null) {
            return new ImageIcon(resource, (String) null);
        }
        throw new RuntimeException("Couldn't find image icon on path: ".concat(str));
    }

    public static ImageIcon O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Class cls, String str) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cls, str);
    }
}
