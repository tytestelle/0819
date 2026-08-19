package com.chaquo.python.internal;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Common {
    public static final String ABI_COMMON = "common";
    public static final String ASSET_APP = "app";
    public static final String ASSET_BOOTSTRAP = "bootstrap";
    public static final String ASSET_BOOTSTRAP_NATIVE = "bootstrap-native";
    public static final String ASSET_BUILD_JSON = "build.json";
    public static final String ASSET_CACERT = "cacert.pem";
    public static final String ASSET_DIR = "chaquopy";
    public static final String ASSET_REQUIREMENTS = "requirements";
    public static final String ASSET_STDLIB = "stdlib";
    public static final int COMPILE_SDK_VERSION = 34;
    public static final String DEFAULT_PYTHON_VERSION = "3.8";
    public static final String MIN_AGP_VERSION = "7.0.0";
    public static final int MIN_SDK_VERSION = 21;
    public static final String PYTHON_IMPLEMENTATION = "cp";
    public static final Map<String, String> PYTHON_VERSIONS;
    public static List<String> PYTHON_VERSIONS_SHORT;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PYTHON_VERSIONS = linkedHashMap;
        linkedHashMap.put("3.8.18", SessionDescription.SUPPORTED_SDP_VERSION);
        linkedHashMap.put("3.9.18", SessionDescription.SUPPORTED_SDP_VERSION);
        linkedHashMap.put("3.10.13", SessionDescription.SUPPORTED_SDP_VERSION);
        linkedHashMap.put("3.11.6", SessionDescription.SUPPORTED_SDP_VERSION);
        linkedHashMap.put("3.12.1", SessionDescription.SUPPORTED_SDP_VERSION);
        PYTHON_VERSIONS_SHORT = new ArrayList();
        for (String str : linkedHashMap.keySet()) {
            PYTHON_VERSIONS_SHORT.add(str.substring(0, str.lastIndexOf(46)));
        }
    }

    public static String assetZip(String str) {
        return assetZip(str, null);
    }

    public static String findExecutable(String str) throws FileNotFoundException {
        File file = new File(str);
        if (file.isAbsolute()) {
            if (file.exists()) {
                return str;
            }
            throw new FileNotFoundException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("'", str, "' does not exist"));
        }
        ArrayList<String> arrayList = new ArrayList();
        String lowerCase = System.getProperty("os.name").toLowerCase();
        if (lowerCase.startsWith("mac")) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/etc/paths"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    System.out.println("Warning: while reading /etc/paths: " + e);
                }
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Warning: while reading /etc/paths: " + e);
            }
        }
        Collections.addAll(arrayList, System.getenv("PATH").split(File.pathSeparator));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("");
        if (lowerCase.startsWith("win")) {
            arrayList2.add(".exe");
            arrayList2.add(".bat");
        }
        for (String str2 : arrayList) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                File file2 = new File(str2, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, (String) it.next()));
                if (file2.exists()) {
                    return file2.toString();
                }
            }
        }
        throw new FileNotFoundException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Couldn't find '", str, "' on PATH"));
    }

    public static String osName() {
        String property = System.getProperty("os.name");
        String[] strArr = {"linux", "mac", "windows"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (property.toLowerCase(Locale.ENGLISH).startsWith(str)) {
                return str;
            }
        }
        throw new RuntimeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("unknown os.name: ", property));
    }

    public static List<String> supportedAbis(String str) {
        if (!PYTHON_VERSIONS_SHORT.contains(str)) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Unknown Python version: '", str, "'"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("arm64-v8a");
        arrayList.add("x86_64");
        if (Arrays.asList(DEFAULT_PYTHON_VERSION, "3.9", "3.10", "3.11").contains(str)) {
            arrayList.add("armeabi-v7a");
            arrayList.add("x86");
        }
        arrayList.sort(null);
        return arrayList;
    }

    public static String assetZip(String str, String str2) {
        if (str2 == null) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, ".imy");
        }
        return str + "-" + str2 + ".imy";
    }
}
