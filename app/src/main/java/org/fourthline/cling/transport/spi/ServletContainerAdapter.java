package org.fourthline.cling.transport.spi;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface ServletContainerAdapter {
    int addConnector(String str, int i);

    void registerServlet(String str, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);

    void removeConnector(String str, int i);

    void setExecutorService(ExecutorService executorService);

    void startIfNotRunning();

    void stopIfRunning();
}
