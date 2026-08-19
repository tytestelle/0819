package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
class u {
    private static u a;
    private static FileLock f;
    private v b;
    private boolean c;
    private boolean d = false;
    private boolean e;

    private u() {
    }

    public static u a() {
        if (a == null) {
            synchronized (u.class) {
                try {
                    if (a == null) {
                        a = new u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public FileLock b(Context context) {
        String str;
        String str2;
        TbsLog.i("X5CoreEngine", "tryTbsCoreLoadFileLock ##");
        FileLock fileLock = f;
        if (fileLock != null) {
            return fileLock;
        }
        synchronized (u.class) {
            try {
                if (f == null) {
                    FileLock fileLockD = FileUtil.d(context);
                    f = fileLockD;
                    if (fileLockD == null) {
                        str = "X5CoreEngine";
                        str2 = "init -- sTbsCoreLoadFileLock failed!";
                    } else {
                        str = "X5CoreEngine";
                        str2 = "init -- sTbsCoreLoadFileLock succeeded: " + f;
                    }
                    TbsLog.i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public v c() {
        if (QbSdk.a) {
            return null;
        }
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public v a(boolean z) {
        return z ? this.b : c();
    }

    public boolean b() {
        if (QbSdk.a || QbSdk.getIsSysWebViewForcedByOuter()) {
            return false;
        }
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b3 A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x01be A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4 A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01f5 A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0209 A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0220 A[Catch: all -> 0x0036, TryCatch #1 {, blocks: (B:4:0x0017, B:6:0x001b, B:8:0x0021, B:13:0x0039, B:16:0x0065, B:18:0x0069, B:29:0x00a5, B:31:0x00b3, B:32:0x00ba, B:35:0x00ce, B:37:0x00e5, B:55:0x014b, B:57:0x0157, B:58:0x0187, B:68:0x0225, B:60:0x018d, B:54:0x0142, B:61:0x01be, B:63:0x01c4, B:64:0x01f5, B:65:0x0209, B:67:0x0220, B:26:0x008d, B:27:0x009c, B:33:0x00be, B:41:0x00f6, B:43:0x00fc, B:47:0x010e, B:49:0x0112, B:50:0x0135, B:52:0x0139, B:19:0x007b, B:21:0x0083), top: B:73:0x0017, inners: #3, #4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01c4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0209, please report this as an issue */
    public synchronized void a(Context context) {
        Throwable th;
        String str;
        String str2;
        if (!this.d || QbSdk.isEnableX5WithoutRestart()) {
            TbsLog.i("X5CoreEngine", "init", "#1# Start init");
            f fVarA = f.a(true);
            fVarA.a(context, false, false);
            TbsLog.i("X5CoreEngine", "init", "#2# SDKEngine init finish");
            StringBuilder sb = new StringBuilder();
            s sVarA = fVarA.a();
            if (!fVarA.b() || sVarA == null) {
                this.c = false;
                TbsLog.e("X5CoreEngine", "init", "SDKEngine tbs not available!");
                sb.append("SDKEngine tbs not available_");
            } else {
                if (!this.e) {
                    TbsLog.i("X5CoreEngine", "init", "#3-1# X5CoreWizard start to load dex and so");
                    v vVar = new v(sVarA.c());
                    this.b = vVar;
                    try {
                        boolean zA = vVar.a();
                        this.c = zA;
                        if (!zA) {
                            sb.append("can not use X5 by x5corewizard return false");
                        }
                    } catch (NoSuchMethodException unused) {
                        this.c = true;
                        sb.append("NoSuchMethodException");
                    } catch (Throwable th2) {
                        th = th2;
                        this.c = false;
                        sb.append("can not use x5 by x5corewizard throwable ");
                        sb.append(Log.getStackTraceString(th));
                        sb.append("mCanUseX5 is ");
                        sb.append(this.c);
                        if (this.c) {
                            CookieManager.getInstance().a();
                        }
                        this.e = true;
                        TbsLog.i("X5CoreEngine", "init  mCanUseX5 is " + this.c);
                        if (this.c) {
                            TbsLog.i("X5CoreEngine", "init", "#5# sTbsCoreLoadFileLock is " + f);
                            if (f == null) {
                                b(context);
                            }
                        } else {
                            TbsLog.e("X5CoreEngine", "mCanUseX5 is false --> report");
                            if (!fVarA.b()) {
                                if (fVarA.b()) {
                                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, new Throwable("mCanUseX5=false, available true, reason: " + sb.toString()));
                                    str = "X5CoreEngine";
                                    str2 = "[LoadError] details: " + sb.toString();
                                } else {
                                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, new Throwable());
                                    str = "X5CoreEngine";
                                    str2 = "[LoadError] mCanUseX5=false, available=false";
                                }
                            } else if (fVarA.b()) {
                                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, new Throwable("mCanUseX5=false, available true, reason: " + sb.toString()));
                                str = "X5CoreEngine";
                                str2 = "[LoadError] details: " + sb.toString();
                            } else {
                                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, new Throwable());
                                str = "X5CoreEngine";
                                str2 = "[LoadError] mCanUseX5=false, available=false";
                            }
                            TbsLog.e(str, "init", str2);
                        }
                        this.d = true;
                        return;
                    }
                    th = null;
                    sb.append("mCanUseX5 is ");
                    sb.append(this.c);
                    if (this.c) {
                        CookieManager.getInstance().a();
                    }
                    this.e = true;
                }
                TbsLog.i("X5CoreEngine", "init  mCanUseX5 is " + this.c);
                if (this.c) {
                    TbsLog.e("X5CoreEngine", "mCanUseX5 is false --> report");
                    if (!fVarA.b() && sVarA != null && th == null) {
                        try {
                            DexLoader dexLoaderC = sVarA.c();
                            Object objInvokeStaticMethod = dexLoaderC != null ? dexLoaderC.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]) : null;
                            if (objInvokeStaticMethod instanceof Throwable) {
                                Throwable th3 = (Throwable) objInvokeStaticMethod;
                                sb.append("#");
                                sb.append(th3.getMessage());
                                sb.append("; cause: ");
                                sb.append(th3.getCause());
                                sb.append("; th: ");
                                sb.append(th3);
                            }
                            if (objInvokeStaticMethod instanceof String) {
                                sb.append("failure detail: ");
                                sb.append(objInvokeStaticMethod);
                            }
                        } catch (Throwable th4) {
                            TbsLog.e("X5CoreEngine", "init", Log.getStackTraceString(th4));
                        }
                        if (sb.toString().contains("isPreloadX5Disabled:-10000")) {
                            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, new Throwable("Core Crash, details: " + sb.toString()));
                            str = "X5CoreEngine";
                            str2 = "[LoadError] Core Crash, details: " + sb.toString();
                        } else {
                            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, new Throwable("Failed in Core, details: " + sb.toString()));
                            str = "X5CoreEngine";
                            str2 = "[LoadError] Failed in Core, details: " + sb.toString();
                        }
                    } else if (fVarA.b()) {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, new Throwable("mCanUseX5=false, available true, reason: " + sb.toString()));
                        str = "X5CoreEngine";
                        str2 = "[LoadError] details: " + sb.toString();
                    } else {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, new Throwable());
                        str = "X5CoreEngine";
                        str2 = "[LoadError] mCanUseX5=false, available=false";
                    }
                    TbsLog.e(str, "init", str2);
                } else {
                    TbsLog.i("X5CoreEngine", "init", "#5# sTbsCoreLoadFileLock is " + f);
                    if (f == null) {
                        b(context);
                    }
                }
                this.d = true;
                return;
            }
            th = null;
            TbsLog.i("X5CoreEngine", "init  mCanUseX5 is " + this.c);
            if (this.c) {
                TbsLog.e("X5CoreEngine", "mCanUseX5 is false --> report");
                if (!fVarA.b()) {
                    if (fVarA.b()) {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, new Throwable("mCanUseX5=false, available true, reason: " + sb.toString()));
                        str = "X5CoreEngine";
                        str2 = "[LoadError] details: " + sb.toString();
                    } else {
                        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, new Throwable());
                        str = "X5CoreEngine";
                        str2 = "[LoadError] mCanUseX5=false, available=false";
                    }
                } else if (fVarA.b()) {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, new Throwable("mCanUseX5=false, available true, reason: " + sb.toString()));
                    str = "X5CoreEngine";
                    str2 = "[LoadError] details: " + sb.toString();
                } else {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, new Throwable());
                    str = "X5CoreEngine";
                    str2 = "[LoadError] mCanUseX5=false, available=false";
                }
                TbsLog.e(str, "init", str2);
            } else {
                TbsLog.i("X5CoreEngine", "init", "#5# sTbsCoreLoadFileLock is " + f);
                if (f == null) {
                    b(context);
                }
            }
            this.d = true;
            return;
        }
        TbsLog.w("X5CoreEngine", "coreEngine has init, mCanUseX5=" + this.c);
    }
}
