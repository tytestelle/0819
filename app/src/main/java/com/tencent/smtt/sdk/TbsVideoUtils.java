package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;

/* JADX INFO: loaded from: classes2.dex */
public class TbsVideoUtils {
    private static q a;

    private static void a(Context context) {
        synchronized (TbsVideoUtils.class) {
            try {
                if (a == null) {
                    f.a(true).a(context, false, false);
                    s sVarA = f.a(true).a();
                    DexLoader dexLoaderC = sVarA != null ? sVarA.c() : null;
                    if (dexLoaderC != null) {
                        a = new q(dexLoaderC);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void deleteVideoCache(Context context, String str) {
        a(context);
        q qVar = a;
        if (qVar != null) {
            qVar.a(context, str);
        }
    }

    public static String getCurWDPDecodeType(Context context) {
        a(context);
        q qVar = a;
        return qVar != null ? qVar.a(context) : "";
    }
}
