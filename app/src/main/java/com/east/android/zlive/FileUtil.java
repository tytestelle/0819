package com.east.android.zlive;

import com.github.tvbox.osc.base.App;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {
    private static final String TAG = "FileUtil";

    public static File getCacheDir() {
        return App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getCacheDir();
    }

    public static String getCachePath() {
        return getCacheDir().getAbsolutePath();
    }
}
