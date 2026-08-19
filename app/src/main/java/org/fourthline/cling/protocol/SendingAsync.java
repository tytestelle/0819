package org.fourthline.cling.protocol;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SendingAsync implements Runnable {
    private static final Logger log = Logger.getLogger(UpnpService.class.getName());
    private final UpnpService upnpService;

    public SendingAsync(UpnpService upnpService) {
        this.upnpService = upnpService;
    }

    public abstract void execute();

    public UpnpService getUpnpService() {
        return this.upnpService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            execute();
        } catch (Exception e) {
            Throwable thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e);
            if (!(thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o instanceof InterruptedException)) {
                throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e, e);
            }
            log.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e, thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
