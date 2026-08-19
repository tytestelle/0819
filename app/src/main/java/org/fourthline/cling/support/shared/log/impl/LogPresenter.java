package org.fourthline.cling.support.shared.log.impl;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.fourthline.cling.support.shared.TextExpand;
import org.fourthline.cling.support.shared.log.LogView;
import org.seamless.swing.logging.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

/* JADX INFO: loaded from: classes2.dex */
@ApplicationScoped
public class LogPresenter implements LogView.Presenter {

    @Inject
    protected Event<TextExpand> textExpandEvent;

    @Inject
    protected LogView view;

    @PreDestroy
    public void destroy() {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.log.impl.LogPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                LogPresenter.this.view.dispose();
            }
        });
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void init() {
        this.view.setPresenter(this);
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void onExpand(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        this.textExpandEvent.fire(new TextExpand(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()));
    }

    @Override // org.fourthline.cling.support.shared.log.LogView.Presenter
    public void pushMessage(final O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.shared.log.impl.LogPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                LogPresenter.this.view.pushMessage(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            }
        });
    }
}
