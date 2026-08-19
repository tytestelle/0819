package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TbsBaseConfig {
    public static final String TAG = "TbsBaseConfig";
    Map<String, String> a;
    private Context b;

    private static File a(Context context, String str) {
        m.a();
        File fileO = m.o(context);
        if (fileO == null) {
            return null;
        }
        File file = new File(fileO, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.a.clear();
        commit();
    }

    public synchronized void commit() {
        writeTbsDownloadInfo();
    }

    public abstract String getConfigFileName();

    public Map<String, String> getPVCLocal() {
        return this.a;
    }

    public void init(Context context) {
        this.a = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        if (applicationContext == null) {
            this.b = context;
        }
        refreshSyncMap(context);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized void refreshSyncMap(Context context) {
        String str;
        String str2;
        BufferedInputStream bufferedInputStream = null;
        try {
            File fileA = a(this.b, getConfigFileName());
            TbsLog.i(TAG, "refreshSyncMap propFile is " + fileA);
            try {
                if (fileA == null) {
                    return;
                }
                this.a.clear();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileA));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream2);
                    for (String str3 : properties.stringPropertyNames()) {
                        this.a.put(str3, properties.getProperty(str3));
                    }
                    TbsLog.i(TAG, "refreshSyncMap pv mSyncMap is " + this.a.toString());
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception e) {
                        str = TAG;
                        str2 = "refreshSyncMap stack is " + Log.getStackTraceString(e);
                        TbsLog.i(str, str2);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    TbsLog.i(TAG, "refreshSyncMap stack is " + Log.getStackTraceString(th));
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e2) {
                            str = TAG;
                            str2 = "refreshSyncMap stack is " + Log.getStackTraceString(e2);
                            TbsLog.i(str, str2);
                        }
                    }
                }
                TbsLog.i(TAG, "refreshSyncMap stack is " + Log.getStackTraceString(th));
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Throwable th2) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e3) {
                        TbsLog.i(TAG, "refreshSyncMap stack is " + Log.getStackTraceString(e3));
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void update(Map<String, String> map) {
        this.a.clear();
        this.a.putAll(map);
        commit();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[Catch: all -> 0x00c8, SYNTHETIC, TryCatch #9 {, blocks: (B:4:0x0005, B:20:0x00c4, B:26:0x00e6, B:29:0x00ec, B:30:0x0103, B:25:0x00cc, B:38:0x0127, B:43:0x0148, B:46:0x014d, B:41:0x012c, B:52:0x016a, B:57:0x018b, B:61:0x01aa, B:60:0x0190, B:55:0x016f, B:36:0x010b), top: B:82:0x0005, inners: #0, #1, #2, #3, #4, #5, #6 }] */
    public synchronized void writeTbsDownloadInfo() {
        BufferedOutputStream bufferedOutputStream;
        String str;
        String str2;
        TbsLog.i(TAG, "writeTbsDownloadInfo #1");
        BufferedInputStream bufferedInputStream = null;
        try {
            File fileA = a(this.b, getConfigFileName());
            TbsLog.i(TAG, "writeTbsDownloadInfo propFile is " + fileA);
            try {
                if (fileA == null) {
                    return;
                }
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileA));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream2);
                    properties.clear();
                    Set<String> setKeySet = this.a.keySet();
                    TbsLog.i(TAG, "writeTbsDownloadInfo mSyncMap.size() is " + this.a.size());
                    for (String str3 : setKeySet) {
                        String str4 = this.a.get(str3);
                        properties.setProperty(str3, "" + ((Object) str4));
                        TbsLog.i(TAG, "writeTbsDownloadInfo key is " + str3 + " value is " + ((Object) str4));
                    }
                    this.a.clear();
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileA));
                    try {
                        properties.store(bufferedOutputStream, (String) null);
                        TbsLog.i(TAG, "writeTbsDownloadInfo end ");
                        try {
                            bufferedInputStream2.close();
                        } catch (Exception e) {
                            TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e));
                        }
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception e2) {
                            str = TAG;
                            str2 = "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e2);
                            TbsLog.i(str, str2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(th));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e3) {
                                TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e3));
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Exception e4) {
                                    str = TAG;
                                    str2 = "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e4);
                                    TbsLog.i(str, str2);
                                }
                            }
                        } else if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                }
                TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(th));
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                } else if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (Throwable th3) {
                if (bufferedInputStream == null) {
                    if (bufferedOutputStream != null) {
                        throw th3;
                    }
                    bufferedOutputStream.close();
                    throw th3;
                }
                try {
                    bufferedInputStream.close();
                } catch (Exception e5) {
                    TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e5));
                }
                if (bufferedOutputStream != null) {
                    throw th3;
                }
                try {
                    bufferedOutputStream.close();
                    throw th3;
                } catch (Exception e6) {
                    TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e6));
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
