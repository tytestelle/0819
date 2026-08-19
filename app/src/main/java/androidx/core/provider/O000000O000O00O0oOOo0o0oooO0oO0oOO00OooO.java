package androidx.core.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static FontProvider.ContentQueryWrapper O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new FontProvider.ContentQueryWrapperApi16Impl(context, uri) : new FontProvider.ContentQueryWrapperApi24Impl(context, uri);
    }
}
