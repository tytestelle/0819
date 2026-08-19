package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) message.obj).recycle();
        return true;
    }
}
