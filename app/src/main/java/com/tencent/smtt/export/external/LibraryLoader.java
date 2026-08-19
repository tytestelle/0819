package com.tencent.smtt.export.external;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public class LibraryLoader {
    private static String[] sLibrarySearchPaths;

    public static String[] getLibrarySearchPaths(Context context) {
        String[] strArr = sLibrarySearchPaths;
        if (strArr != null) {
            return strArr;
        }
        if (context == null) {
            return new String[]{"/system/lib"};
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNativeLibraryDir(context));
        arrayList.add("/system/lib");
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        sLibrarySearchPaths = strArr2;
        return strArr2;
    }

    public static String getNativeLibraryDir(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    public static void loadLibrary(Context context, String str) {
        String[] librarySearchPaths = getLibrarySearchPaths(context);
        String strMapLibraryName = System.mapLibraryName(str);
        for (String str2 : librarySearchPaths) {
            String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str2, ServiceReference.DELIMITER, strMapLibraryName);
            if (new File(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o).exists()) {
                try {
                    System.load(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        try {
            System.loadLibrary(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
