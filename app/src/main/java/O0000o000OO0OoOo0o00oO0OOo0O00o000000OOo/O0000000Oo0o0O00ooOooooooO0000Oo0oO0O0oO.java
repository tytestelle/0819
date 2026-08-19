package O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Serializable {
    public static final String FORMAT_HTTP_DATA = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static final TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
    public static final String HEAD_KEY_ACCEPT = "Accept";
    public static final String HEAD_KEY_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEAD_KEY_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String HEAD_KEY_CACHE_CONTROL = "Cache-Control";
    public static final String HEAD_KEY_CONNECTION = "Connection";
    public static final String HEAD_KEY_CONTENT_DISPOSITION = "Content-Disposition";
    public static final String HEAD_KEY_CONTENT_ENCODING = "Content-Encoding";
    public static final String HEAD_KEY_CONTENT_LENGTH = "Content-Length";
    public static final String HEAD_KEY_CONTENT_RANGE = "Content-Range";
    public static final String HEAD_KEY_CONTENT_TYPE = "Content-Type";
    public static final String HEAD_KEY_COOKIE = "Cookie";
    public static final String HEAD_KEY_COOKIE2 = "Cookie2";
    public static final String HEAD_KEY_DATE = "Date";
    public static final String HEAD_KEY_EXPIRES = "Expires";
    public static final String HEAD_KEY_E_TAG = "ETag";
    public static final String HEAD_KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final String HEAD_KEY_IF_NONE_MATCH = "If-None-Match";
    public static final String HEAD_KEY_LAST_MODIFIED = "Last-Modified";
    public static final String HEAD_KEY_LOCATION = "Location";
    public static final String HEAD_KEY_PRAGMA = "Pragma";
    public static final String HEAD_KEY_RANGE = "Range";
    public static final String HEAD_KEY_RESPONSE_CODE = "ResponseCode";
    public static final String HEAD_KEY_RESPONSE_MESSAGE = "ResponseMessage";
    public static final String HEAD_KEY_SET_COOKIE = "Set-Cookie";
    public static final String HEAD_KEY_SET_COOKIE2 = "Set-Cookie2";
    public static final String HEAD_KEY_USER_AGENT = "User-Agent";
    public static final String HEAD_VALUE_ACCEPT_ENCODING = "gzip, deflate";
    public static final String HEAD_VALUE_CONNECTION_CLOSE = "close";
    public static final String HEAD_VALUE_CONNECTION_KEEP_ALIVE = "keep-alive";

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static String f1616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static String f1617O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
    private static final long serialVersionUID = 8458647755751403873L;
    public LinkedHashMap<String, String> headersMap = new LinkedHashMap<>();

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
    }

    public static String formatMillisToGMT(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_HTTP_DATA, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIME_ZONE);
        return simpleDateFormat.format(date);
    }

    public static String getAcceptLanguage() {
        if (!TextUtils.isEmpty(f1616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
            return f1616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
            sb.append(',');
            sb.append(language);
            sb.append(";q=0.8");
        }
        String string = sb.toString();
        f1616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = string;
        return string;
    }

    public static String getCacheControl(String str, String str2) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    public static long getDate(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static long getExpiration(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public static long getLastModified(String str) {
        try {
            return parseGMTToMillis(str);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String getUserAgent() {
        if (!TextUtils.isEmpty(f1617O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
            return f1617O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        try {
            O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(null, "please call OkGo.getInstance().init() first in application!");
            throw null;
        } catch (Exception unused) {
            String str = TextUtils.isEmpty(null) ? "okhttp-okgo/jeasonlzy" : null;
            Locale locale = Locale.getDefault();
            StringBuffer stringBuffer = new StringBuffer();
            String str2 = Build.VERSION.RELEASE;
            if (str2.length() > 0) {
                stringBuffer.append(str2);
            } else {
                stringBuffer.append("1.0");
            }
            stringBuffer.append("; ");
            String language = locale.getLanguage();
            if (language != null) {
                stringBuffer.append(language.toLowerCase(locale));
                String country = locale.getCountry();
                if (!TextUtils.isEmpty(country)) {
                    stringBuffer.append("-");
                    stringBuffer.append(country.toLowerCase(locale));
                }
            } else {
                stringBuffer.append("en");
            }
            if ("REL".equals(Build.VERSION.CODENAME)) {
                String str3 = Build.MODEL;
                if (str3.length() > 0) {
                    stringBuffer.append("; ");
                    stringBuffer.append(str3);
                }
            }
            String str4 = Build.ID;
            if (str4.length() > 0) {
                stringBuffer.append(" Build/");
                stringBuffer.append(str4);
            }
            String str5 = String.format(str, stringBuffer, "Mobile ");
            f1617O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str5;
            return str5;
        }
    }

    public static long parseGMTToMillis(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_HTTP_DATA, Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIME_ZONE);
        return simpleDateFormat.parse(str).getTime();
    }

    public static void setAcceptLanguage(String str) {
        f1616O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
    }

    public static void setUserAgent(String str) {
        f1617O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    public void clear() {
        this.headersMap.clear();
    }

    public String get(String str) {
        return this.headersMap.get(str);
    }

    public Set<String> getNames() {
        return this.headersMap.keySet();
    }

    public void put(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.headersMap.put(str, str2);
    }

    public String remove(String str) {
        return this.headersMap.remove(str);
    }

    public final String toJSONString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.headersMap.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "HttpHeaders{headersMap=" + this.headersMap + '}';
    }

    public static String getDate(long j) {
        return formatMillisToGMT(j);
    }

    public void put(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        LinkedHashMap<String, String> linkedHashMap;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || (linkedHashMap = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.headersMap) == null || linkedHashMap.isEmpty()) {
            return;
        }
        this.headersMap.putAll(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.headersMap);
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2) {
        put(str, str2);
    }
}
