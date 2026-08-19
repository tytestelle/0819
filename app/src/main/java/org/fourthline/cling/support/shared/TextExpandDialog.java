package org.fourthline.cling.support.shared;

import com.tencent.smtt.sdk.TbsListener;
import java.awt.Dimension;
import java.awt.Frame;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.fourthline.cling.model.ModelUtil;
import org.seamless.swing.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.xml.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.seamless.xml.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class TextExpandDialog extends JDialog {
    private static Logger log = Logger.getLogger(TextExpandDialog.class.getName());

    public TextExpandDialog(Frame frame, String str) {
        super(frame);
        setResizable(true);
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setPreferredSize(new Dimension(TbsListener.ErrorCode.INFO_CODE_MINIQB, TbsListener.ErrorCode.INFO_CODE_BASE));
        add(jScrollPane);
        if (str.startsWith("<") && str.endsWith(">")) {
            try {
                str = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() { // from class: org.fourthline.cling.support.shared.TextExpandDialog.1
                    @Override // org.seamless.xml.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
                    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o createDOM(Document document) {
                        return null;
                    }
                }.print(str, 2, false);
            } catch (Exception e) {
                log.severe("Error pretty printing XML: " + e.toString());
            }
        } else if (str.startsWith("http-get")) {
            str = ModelUtil.commaToNewline(str);
        }
        jTextArea.setEditable(false);
        jTextArea.setText(str);
        pack();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, getOwner());
        setVisible(true);
    }
}
