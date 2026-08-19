package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class TbsReaderPredownload {
    public static final int READER_SO_SUCCESS = 2;
    public static final int READER_WAIT_IN_QUEUE = 3;
    static final String[] b = {"docx", "pptx", "xlsx", "pdf", "epub", "txt"};
    Handler a = null;
    LinkedList<String> c = new LinkedList<>();
    boolean d = false;
    ReaderWizard e = null;
    TbsReaderView.ReaderCallback f = null;
    Object g = null;
    Context h = null;
    ReaderPreDownloadCallback i = null;
    String j = "";

    public interface ReaderPreDownloadCallback {
        public static final int NOTIFY_PLUGIN_FAILED = -1;
        public static final int NOTIFY_PLUGIN_SUCCESS = 0;

        void onEvent(String str, int i, boolean z);
    }

    public TbsReaderPredownload(ReaderPreDownloadCallback readerPreDownloadCallback) {
        throw new IllegalAccessError("Current SDK not support Reader.");
    }

    private void a() {
        b(3);
    }

    public void b(int i) {
        this.a.removeMessages(i);
    }

    public boolean c(int i) {
        return this.a.hasMessages(i);
    }

    public boolean init(Context context) {
        if (context == null) {
            return false;
        }
        this.h = context.getApplicationContext();
        boolean zA = TbsReaderView.a(context.getApplicationContext());
        TbsReaderView.ReaderCallback readerCallback = new TbsReaderView.ReaderCallback() { // from class: com.tencent.smtt.sdk.TbsReaderPredownload.1
            @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
            public void onCallBackAction(Integer num, Object obj, Object obj2) {
                int iIntValue;
                if (num.intValue() == 5012 && 5014 != (iIntValue = ((Integer) obj).intValue())) {
                    if (5013 == iIntValue || iIntValue == 0) {
                        TbsReaderPredownload.this.a(0);
                    } else {
                        TbsReaderPredownload.this.a(-1);
                    }
                    TbsReaderPredownload tbsReaderPredownload = TbsReaderPredownload.this;
                    tbsReaderPredownload.j = "";
                    tbsReaderPredownload.a(3, 100);
                }
            }
        };
        this.f = readerCallback;
        try {
            if (this.e == null) {
                this.e = new ReaderWizard(readerCallback);
            }
            if (this.g == null) {
                this.g = this.e.getTbsReader();
            }
            Object obj = this.g;
            return obj != null ? this.e.initTbsReader(obj, context.getApplicationContext()) : zA;
        } catch (NullPointerException unused) {
            Log.e("TbsReaderPredownload", "Unexpect null object!");
            return false;
        }
    }

    public void pause() {
        this.d = true;
    }

    public void shutdown() {
        this.i = null;
        this.d = false;
        this.c.clear();
        a();
        ReaderWizard readerWizard = this.e;
        if (readerWizard != null) {
            readerWizard.destroy(this.g);
            this.g = null;
        }
        this.h = null;
    }

    public void start(String str) {
        this.d = false;
        b(3);
        this.c.add(str);
        a(3, 100);
    }

    public void startAll() {
        this.d = false;
        if (c(3)) {
            return;
        }
        a(3, 100);
    }

    public void a(int i) {
        if (this.i != null) {
            this.i.onEvent(this.j, i, this.c.isEmpty());
        }
    }

    public void a(int i, int i2) {
        this.a.sendMessageDelayed(this.a.obtainMessage(i), i2);
    }
}
