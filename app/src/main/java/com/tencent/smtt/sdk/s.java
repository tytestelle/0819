package com.tencent.smtt.sdk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.utils.TbsLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class s {
    private Context a;
    private Context b;
    private String c;
    private String[] d;
    private DexLoader e;
    private String f;
    private String g = null;

    public s(Context context, Context context2, String str, String str2, String[] strArr, String str3) throws Exception {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "TbsDexOpt";
        TbsLog.i("TbsWizard", "construction start...");
        if (context == null || context2 == null || TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            throw new Exception("TbsWizard paramter error:-1callerContext:" + context + "hostcontext" + context2 + "isEmpty" + TextUtils.isEmpty(str) + "dexfileList" + strArr);
        }
        this.a = context.getApplicationContext();
        if (context2.getApplicationContext() != null) {
            this.b = context2.getApplicationContext();
        } else {
            this.b = context2;
        }
        this.c = str;
        this.d = strArr;
        this.f = str2;
        for (int i = 0; i < this.d.length; i++) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "#2 mDexFileList[", "]: ");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this.d[i]);
            TbsLog.i("TbsWizard", sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("new DexLoader #2 libraryPath is ", str3, " mCallerAppContext is ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.a);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(" dexOutPutDir is ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(str2);
        TbsLog.i("TbsWizard", sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
        this.e = new DexLoader(str3, this.a, this.d, str2, QbSdk.o);
        System.currentTimeMillis();
        a(context);
        libwebp.loadWepLibraryIfNeed(context2, this.c);
        Map<String, Object> map = QbSdk.o;
        if (map == null || !map.containsKey(TbsCoreSettings.MULTI_PROCESS_ENABLE)) {
            HashMap map2 = new HashMap();
            map2.put(TbsCoreSettings.MULTI_PROCESS_ENABLE, 0);
            QbSdk.initTbsSettings(map2);
            TbsLog.i("[MultiProcess]", "default not enable multi process!");
        }
        Map<String, Object> map3 = QbSdk.o;
        if (map3 != null) {
            this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[]{Map.class}, map3);
            b(context);
        }
        int iC = c(context);
        if (iC < 0) {
            StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(iC, "TbsWizard init error: ", "; msg: ");
            sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.append(this.g);
            throw new Exception(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.toString());
        }
        TbsLog.i("TbsWizard", "construction end...");
    }

    private int c(Context context) {
        int iIntValue;
        String str;
        TbsLog.i("TbsWizard", "initTesRuntimeEnvironment callerContext is " + context + " mHostContext is " + this.b + " mDexLoader is " + this.e + " mtbsInstallLocation is " + this.c + " mDexOptPath is " + this.f);
        DexLoader dexLoader = this.e;
        Object objInvokeStaticMethod = dexLoader.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, Integer.TYPE, String.class}, context, this.b, dexLoader, this.c, this.f, TbsConfig.TBS_SDK_VERSIONNAME, 44286, QbSdk.a());
        if (objInvokeStaticMethod == null) {
            d();
            e();
            DexLoader dexLoader2 = this.e;
            objInvokeStaticMethod = dexLoader2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class}, context, this.b, dexLoader2, this.c, this.f);
        }
        if (objInvokeStaticMethod == null) {
            iIntValue = -3;
        } else if (objInvokeStaticMethod instanceof Integer) {
            iIntValue = ((Integer) objInvokeStaticMethod).intValue();
        } else if (objInvokeStaticMethod instanceof Throwable) {
            TbsCoreLoadStat.getInstance().a(this.a, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, (Throwable) objInvokeStaticMethod);
            iIntValue = -5;
        } else {
            iIntValue = -4;
        }
        if (iIntValue < 0) {
            Object objInvokeStaticMethod2 = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
            if (objInvokeStaticMethod2 instanceof Throwable) {
                Throwable th = (Throwable) objInvokeStaticMethod2;
                this.g = "#" + th.getMessage() + "; cause: " + th.getCause() + "; th: " + th;
            }
            str = objInvokeStaticMethod2 instanceof String ? (String) objInvokeStaticMethod2 : null;
            return iIntValue;
        }
        this.g = str;
        return iIntValue;
    }

    private void d() {
        this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[]{String.class}, TbsConfig.TBS_SDK_VERSIONNAME);
    }

    private void e() {
        this.e.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", 44286);
    }

    public String a() {
        String string = null;
        Object objInvokeStaticMethod = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[]{Boolean.TYPE, String.class, String.class, Class[].class, Object[].class}, Boolean.TRUE, "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        if (objInvokeStaticMethod == null) {
            objInvokeStaticMethod = this.e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        }
        if (objInvokeStaticMethod != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String.valueOf(objInvokeStaticMethod), " ReaderPackName=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(TbsReaderView.gReaderPackName);
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(" ReaderPackVersion=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(TbsReaderView.gReaderPackVersion);
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        return string == null ? "X5 core get nothing..." : string;
    }

    public String b() {
        String string = null;
        Object objInvokeStaticMethod = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[]{Boolean.TYPE, String.class, String.class, Class[].class, Object[].class}, Boolean.TRUE, "com.tencent.smtt.util.CrashTracker", "getCrashExtraCacheInfo", null, new Object[0]);
        if (objInvokeStaticMethod == null) {
            objInvokeStaticMethod = this.e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraCacheInfo", null, new Object[0]);
        }
        if (objInvokeStaticMethod != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String.valueOf(objInvokeStaticMethod), " ReaderPackName=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(TbsReaderView.gReaderPackName);
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(" ReaderPackVersion=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(TbsReaderView.gReaderPackVersion);
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        return string == null ? "X5 core get cache nothing..." : string;
    }

    public DexLoader c() {
        return this.e;
    }

    private void b(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("tbss", 0).edit();
            Map<String, Object> map = QbSdk.o;
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    editorEdit.putString(str, (String) obj);
                    TbsLog.i("TbsWizard", "initTbsSettingsBySP key is " + str + " value is " + ((String) obj));
                }
            }
            editorEdit.commit();
        } catch (Throwable th) {
            TbsLog.i("TbsWizard", "stack is " + Log.getStackTraceString(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public void a(Context context) {
        boolean zBooleanValue;
        Map<String, Object> map = QbSdk.o;
        if (map != null) {
            Object obj = map.get(TbsCoreSettings.TBS_SETTINGS_CHECK_TBS_VALIDITY);
            if (obj instanceof Boolean) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                zBooleanValue = true;
            }
        } else {
            zBooleanValue = true;
        }
        if (zBooleanValue) {
            com.tencent.smtt.utils.n.b(context);
        }
    }

    public void a(Context context, Context context2, String str, String str2, String[] strArr, String str3) throws Exception {
        this.a = context.getApplicationContext();
        if (this.b.getApplicationContext() != null) {
            this.b = this.b.getApplicationContext();
        }
        this.c = str;
        this.d = strArr;
        this.f = str2;
        libwebp.loadWepLibraryIfNeed(context2, str);
        Map<String, Object> map = QbSdk.o;
        if (map != null) {
            this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[]{Map.class}, map);
        }
        int iC = c(context);
        if (iC >= 0) {
            return;
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(iC, "continueInit init error: ", "; msg: ");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this.g);
        throw new Exception(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public boolean a(Context context, String str, String str2, Bundle bundle) {
        Object objInvokeStaticMethod = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[]{Context.class, String.class, String.class, Bundle.class}, context, str, str2, bundle);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }
}
