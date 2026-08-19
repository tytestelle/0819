package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    @Nullable
    public static String buildRangeRequestHeader(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j, BytesRange.PREFIX, "-");
        if (j2 != -1) {
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append((j + j2) - 1);
        }
        return sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString();
    }

    public static long getContentLength(@Nullable String str, @Nullable String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            Log.e(TAG, "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    public static String getCookieHeader(String str, Map<String, List<String>> map, @Nullable CookieHandler cookieHandler) {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> mapOf = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of();
        try {
            mapOf = cookieHandler.get(new URI(str), map);
        } catch (Exception e) {
            Log.w(TAG, "Failed to read cookies from CookieHandler", e);
        }
        StringBuilder sb = new StringBuilder();
        if (mapOf.containsKey(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_COOKIE) && (list = mapOf.get(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_KEY_COOKIE)) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        String string = sb.toString();
        int length = string.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(string, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return string.substring(0, length);
    }

    public static long getDocumentSize(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    public static void storeCookiesFromHeaders(String str, Map<String, List<String>> map, @Nullable CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e) {
            Log.w(TAG, "Failed to store cookies in CookieHandler", e);
        }
    }
}
