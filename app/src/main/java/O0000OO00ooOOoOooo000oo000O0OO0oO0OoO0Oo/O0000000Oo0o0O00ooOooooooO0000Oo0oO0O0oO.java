package O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import android.os.Environment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final int[] f872O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = {1601, 1637, 1833, 2078, 2274, 2302, 2433, 2594, 2787, 3106, 3212, 3472, 3635, 3722, 3730, 3858, 4027, 4086, 4390, 4558, 4684, 4925, 5249, 5590};

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final String[] f873O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = {CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", "f", "g", CmcdData.STREAMING_FORMAT_HLS, "j", "k", CmcdData.STREAM_TYPE_LIVE, "m", "n", "o", TtmlNode.TAG_P, "q", "r", CmcdData.STREAMING_FORMAT_SS, "t", "w", "x", "y", "z"};

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(FileInputStream fileInputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb.toString();
                        bufferedReader.close();
                        return string;
                    }
                    sb.append(line);
                    sb.append("\n");
                    e.printStackTrace();
                    return "";
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        try {
            File file = new File(str.replace("file:/", ""));
            File file2 = new File(str.replace("file:/", Environment.getExternalStorageDirectory().getAbsolutePath()));
            if (file2.exists()) {
                file = file2;
            } else if (!file.exists()) {
                file = new File(str);
            }
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "原文件不存在!");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getParent());
        File file2 = new File(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, File.separator, str2));
        if (!file2.exists()) {
            return file.renameTo(file2);
        }
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "目标文件已经存在!");
        return false;
    }

    public static String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, String str2, String str3) {
        File file = new File(str);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(46));
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(strSubstring);
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = name.equals(sb.toString()) ? name : O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str3, strSubstring);
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(file.getParent()), File.separator, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        if (!strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.equals(name)) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(str2, strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        return strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }
}
