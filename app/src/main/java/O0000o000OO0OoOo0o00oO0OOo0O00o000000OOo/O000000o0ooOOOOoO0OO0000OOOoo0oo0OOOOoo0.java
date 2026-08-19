package O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

import java.io.File;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Serializable {
    public static final boolean IS_REPLACE = true;
    private static final long serialVersionUID = 7369819159227055048L;
    public static final MediaType MEDIA_TYPE_PLAIN = MediaType.parse("text/plain;charset=utf-8");
    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json;charset=utf-8");
    public static final MediaType MEDIA_TYPE_STREAM = MediaType.parse("application/octet-stream");
    public LinkedHashMap<String, List<String>> urlParamsMap = new LinkedHashMap<>();
    public LinkedHashMap<String, List<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo>> fileParamsMap = new LinkedHashMap<>();

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2, boolean z) {
        if (str == null || str2 == null) {
            return;
        }
        List<String> arrayList = this.urlParamsMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.urlParamsMap.put(str, arrayList);
        }
        if (z) {
            arrayList.clear();
        }
        arrayList.add(str2);
    }

    public void clear() {
        this.urlParamsMap.clear();
        this.fileParamsMap.clear();
    }

    public void put(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            LinkedHashMap<String, List<String>> linkedHashMap = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.urlParamsMap;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                this.urlParamsMap.putAll(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.urlParamsMap);
            }
            LinkedHashMap<String, List<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo>> linkedHashMap2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.fileParamsMap;
            if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
                return;
            }
            this.fileParamsMap.putAll(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.fileParamsMap);
        }
    }

    public void putFileParams(String str, List<File> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            put(str, it.next());
        }
    }

    public void putFileWrapperParams(String str, List<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> it = list.iterator();
        while (it.hasNext()) {
            put(str, it.next());
        }
    }

    public void putUrlParams(String str, List<String> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, it.next(), false);
        }
    }

    public void remove(String str) {
        removeUrl(str);
        removeFile(str);
    }

    public void removeFile(String str) {
        this.fileParamsMap.remove(str);
    }

    public void removeUrl(String str) {
        this.urlParamsMap.remove(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : this.urlParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, List<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo>> entry2 : this.fileParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue());
        }
        return sb.toString();
    }

    public void put(Map<String, String> map, boolean... zArr) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue(), zArr);
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, String str2) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, str2, true);
    }

    public void put(String str, String str2, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, str2, zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, str2, true);
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, File file) {
        put(str, file);
    }

    public void put(String str, int i, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(i), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(i), true);
        }
    }

    public void put(String str, long j, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(j), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(j), true);
        }
    }

    public void put(String str, float f, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(f), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(f), true);
        }
    }

    public void put(String str, double d, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(d), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(d), true);
        }
    }

    public void put(String str, char c, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(c), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(c), true);
        }
    }

    public void put(String str, boolean z, boolean... zArr) {
        if (zArr != null && zArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(z), zArr[0]);
        } else {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, String.valueOf(z), true);
        }
    }

    public void put(String str, File file) {
        put(str, file, file.getName());
    }

    public void put(String str, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        if (str == null || o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return;
        }
        put(str, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.file, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.fileName, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.contentType);
    }

    public void put(String str, File file, String str2, MediaType mediaType) {
        if (str != null) {
            List<O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> arrayList = this.fileParamsMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.fileParamsMap.put(str, arrayList);
            }
            arrayList.add(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(file, str2, mediaType));
        }
    }

    public void put(String str, File file, String str2) {
        MediaType mediaType;
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str2.replace("#", ""));
        if (contentTypeFor == null) {
            mediaType = MEDIA_TYPE_STREAM;
        } else {
            mediaType = MediaType.parse(contentTypeFor);
        }
        put(str, file, str2, mediaType);
    }
}
