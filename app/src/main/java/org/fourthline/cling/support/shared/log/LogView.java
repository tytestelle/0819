package org.fourthline.cling.support.shared.log;

import java.util.List;
import org.fourthline.cling.support.shared.View;
import org.seamless.swing.logging.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.swing.logging.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

/* JADX INFO: loaded from: classes2.dex */
public interface LogView extends View<Presenter> {

    public interface LogCategories extends List<O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> {
    }

    public interface Presenter {
        void init();

        void onExpand(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);

        void pushMessage(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
    }

    void dispose();

    void pushMessage(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
}
