package org.fourthline.cling.support.shared;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes2.dex */
public class AWTExceptionHandler {
    public void handle(Throwable th) {
        PrintStream printStream = System.err;
        printStream.println("============= The application encountered an unrecoverable error, exiting... =============");
        th.printStackTrace(printStream);
        printStream.println("==========================================================================================");
        System.exit(1);
    }
}
