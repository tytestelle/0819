package org.fourthline.cling.protocol;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReceivingAsync<M extends UpnpMessage> implements Runnable {
    private static final Logger log = Logger.getLogger(UpnpService.class.getName());
    private M inputMessage;
    private final UpnpService upnpService;

    public ReceivingAsync(UpnpService upnpService, M m) {
        this.upnpService = upnpService;
        this.inputMessage = m;
    }

    public abstract void execute();

    public <H extends UpnpHeader> H getFirstHeader(UpnpHeader.Type type, Class<H> cls) {
        return (H) getInputMessage().getHeaders().getFirstHeader(type, cls);
    }

    public M getInputMessage() {
        return this.inputMessage;
    }

    public UpnpService getUpnpService() {
        return this.upnpService;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zWaitBeforeExecution;
        try {
            zWaitBeforeExecution = waitBeforeExecution();
        } catch (InterruptedException unused) {
            log.info("Protocol wait before execution interrupted (on shutdown?): ".concat(getClass().getSimpleName()));
            zWaitBeforeExecution = false;
        }
        if (zWaitBeforeExecution) {
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
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public boolean waitBeforeExecution() {
        return true;
    }
}
