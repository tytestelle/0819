package androidx.media3.datasource.cache;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static long O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ContentMetadata contentMetadata) {
        return contentMetadata.get(ContentMetadata.KEY_CONTENT_LENGTH, -1L);
    }

    public static Uri O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ContentMetadata contentMetadata) {
        String str = contentMetadata.get(ContentMetadata.KEY_REDIRECTED_URI, (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
