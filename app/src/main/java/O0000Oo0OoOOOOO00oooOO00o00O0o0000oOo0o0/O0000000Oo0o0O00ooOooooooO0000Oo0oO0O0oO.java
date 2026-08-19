package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f1579O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    static {
        Pattern.compile("http((?!http).){20,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)\\?.*|http((?!http).){20,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)|http((?!http).)*?video/tos*|http((?!http).){20,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?dycdn-tos\\.pstatp[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
    }

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ContextWrapper contextWrapper) {
        try {
            return contextWrapper.getResources().getString(contextWrapper.getPackageManager().getPackageInfo(contextWrapper.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JsonObject jsonObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jsonObject.has("channelUrls")) {
                if (jsonObject.get("channelUrls").isJsonObject()) {
                    arrayList.add(jsonObject.get("channelUrls").getAsString());
                } else {
                    Iterator<JsonElement> it = jsonObject.getAsJsonArray("channelUrls").iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
