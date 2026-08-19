package org.seamless.swing.logging;

import java.util.Arrays;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 extends Handler {
    public int sourcePathElements = 3;

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    public String getSource(LogRecord logRecord) {
        StringBuilder sb = new StringBuilder(180);
        String[] strArrSplit = logRecord.getSourceClassName().split("\\.");
        int length = strArrSplit.length;
        int i = this.sourcePathElements;
        if (length > i) {
            strArrSplit = (String[]) Arrays.copyOfRange(strArrSplit, strArrSplit.length - i, strArrSplit.length);
        }
        for (String str : strArrSplit) {
            sb.append(str);
            sb.append(".");
        }
        sb.append(logRecord.getSourceMethodName());
        return sb.toString();
    }

    public abstract void log(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        log(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(logRecord.getLevel(), getSource(logRecord), logRecord.getMessage()));
    }
}
