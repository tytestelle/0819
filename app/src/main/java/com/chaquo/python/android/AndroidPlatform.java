package com.chaquo.python.android;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import com.chaquo.python.Python;
import com.chaquo.python.internal.Common;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AndroidPlatform extends Python.Platform {
    public static String ABI;
    private AssetManager am;
    private JSONObject buildJson;
    public Application mContext;
    private SharedPreferences sp;
    private static final String[] OBSOLETE_FILES = {"app.zip", "requirements.zip", "chaquopy.mp3", "stdlib.mp3", "chaquopy.zip", "lib-dynload", "stdlib.zip", "bootstrap.zip", "stdlib-common.zip", "ticket.txt"};
    private static final String[] OBSOLETE_CACHE = {"AssetFinder"};

    public AndroidPlatform(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.mContext = application;
        this.sp = application.getSharedPreferences(Common.ASSET_DIR, 0);
        this.am = this.mContext.getAssets();
        try {
            this.buildJson = new JSONObject(streamToString(this.am.open("chaquopy/build.json")));
            loadNativeLibs();
            ArrayList<String> arrayList = new ArrayList();
            Collections.addAll(arrayList, Build.SUPPORTED_ABIS);
            for (String str : arrayList) {
                try {
                    this.am.open("chaquopy/" + Common.assetZip(Common.ASSET_STDLIB, str));
                    ABI = str;
                    break;
                } catch (IOException unused) {
                }
            }
            if (ABI != null) {
                return;
            }
            throw new RuntimeException("None of this device's ABIs " + arrayList + " are supported by this app.");
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void cleanExtractedDir(String str, JSONObject jSONObject) {
        File file = new File(this.mContext.getFilesDir(), O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("chaquopy/", str));
        for (String str2 : file.list()) {
            File file2 = new File(file, str2);
            if (file2.isDirectory()) {
                cleanExtractedDir(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str, ServiceReference.DELIMITER, str2), jSONObject);
            } else {
                if (!jSONObject.has(str + ServiceReference.DELIMITER + str2)) {
                    file2.delete();
                }
            }
        }
    }

    private void deleteObsolete(File file, String[] strArr) {
        for (String str : strArr) {
            deleteRecursive(new File(file, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("chaquopy/", str.replace("<abi>", ABI))));
        }
    }

    private void deleteRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void extractAsset(JSONObject jSONObject, SharedPreferences.Editor editor, String str) throws JSONException, IOException {
        String strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("chaquopy/", str);
        File file = new File(this.mContext.getFilesDir(), strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
        String strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("asset.", str);
        String string = jSONObject.getString(str);
        if (file.exists() && this.sp.getString(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2, "").equals(string)) {
            return;
        }
        file.delete();
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Failed to create " + parentFile);
            }
        }
        InputStream inputStreamOpen = this.am.open(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
        File file2 = new File(parentFile, file.getName() + ".tmp");
        file2.delete();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            transferStream(inputStreamOpen, fileOutputStream);
            fileOutputStream.close();
            if (file2.renameTo(file)) {
                editor.putString(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2, string);
            } else {
                throw new IOException("Failed to create " + file);
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    private void extractAssets(List<String> list) throws JSONException, IOException {
        JSONObject jSONObject = this.buildJson.getJSONObject("assets");
        HashSet hashSet = new HashSet(list);
        HashSet hashSet2 = new HashSet();
        SharedPreferences.Editor editorEdit = this.sp.edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    if (!next.equals(next2)) {
                        if (next.startsWith(next2 + ServiceReference.DELIMITER)) {
                        }
                    }
                    extractAsset(jSONObject, editorEdit, next);
                    hashSet.remove(next2);
                    if (next.startsWith(next2 + ServiceReference.DELIMITER)) {
                        hashSet2.add(next2);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            throw new RuntimeException("Failed to find assets: " + hashSet);
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            cleanExtractedDir((String) it2.next(), jSONObject);
        }
        editorEdit.apply();
    }

    private void loadNativeLibs() {
        System.loadLibrary("crypto_chaquopy");
        System.loadLibrary("ssl_chaquopy");
        System.loadLibrary("sqlite3_chaquopy");
        System.loadLibrary("python" + this.buildJson.getString("python_version"));
        System.loadLibrary("chaquopy_java");
    }

    private String streamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    private void transferStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        int i = inputStream.read(bArr);
        while (i != -1) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public Application getApplication() {
        return this.mContext;
    }

    @Override // com.chaquo.python.Python.Platform
    public String getPath() {
        String str = this.mContext.getFilesDir() + "/chaquopy";
        ArrayList arrayList = new ArrayList(Arrays.asList(Common.assetZip(Common.ASSET_STDLIB, Common.ABI_COMMON), Common.assetZip(Common.ASSET_BOOTSTRAP), "bootstrap-native/" + ABI));
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = "";
        for (int i = 0; i < arrayList.size(); i++) {
            strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + str + ServiceReference.DELIMITER + ((String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, ":");
            }
        }
        Collections.addAll(arrayList, Common.ASSET_CACERT);
        try {
            deleteObsolete(this.mContext.getFilesDir(), OBSOLETE_FILES);
            deleteObsolete(this.mContext.getCacheDir(), OBSOLETE_CACHE);
            extractAssets(arrayList);
            return strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.chaquo.python.Python.Platform
    public void onStart(Python python) {
        python.getModule("java.android").callAttr("initialize", this.mContext, this.buildJson, new String[]{Common.ASSET_APP, "requirements", "stdlib-" + ABI});
    }

    public native void redirectStdioToLogcat();
}
