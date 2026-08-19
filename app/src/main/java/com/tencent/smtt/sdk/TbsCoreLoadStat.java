package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;

/* JADX INFO: loaded from: classes2.dex */
public class TbsCoreLoadStat {
    public static final int ERROR_CODE_INIT = -1;
    private static TbsCoreLoadStat a = null;
    public static String mErrorMessage = "";
    public static volatile int mLoadErrorCode = -1;

    private TbsCoreLoadStat() {
    }

    public static TbsCoreLoadStat getInstance() {
        if (a == null) {
            a = new TbsCoreLoadStat();
        }
        return a;
    }

    public static int getLoadErrorCode() {
        return mLoadErrorCode;
    }

    public static String getLoadErrorMessage() {
        return mErrorMessage;
    }

    public void a(Context context, int i) {
        TbsLog.e(TbsListener.tag_load_error, "" + i);
    }

    public synchronized void a(Context context, int i, Throwable th) {
        String str;
        String str2;
        try {
            TbsLog.e("TbsCoreLoadStat", "[loadError] errorCode: " + i + ", details:" + String.valueOf(th));
            if (th != null) {
                if (mLoadErrorCode == -1) {
                    mLoadErrorCode = i;
                    mErrorMessage = String.valueOf(th);
                    TbsLogReport.getInstance(context).setLoadErrorCode(i, th);
                    str = "TbsCoreLoadStat";
                    str2 = mLoadErrorCode + " report success!";
                } else {
                    str = "TbsCoreLoadStat";
                    str2 = mLoadErrorCode + " is reported, others will be saved in local TbsLog!";
                }
                TbsLog.i(str, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
