package androidx.media3.datasource;

import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static /* bridge */ /* synthetic */ HttpEngine O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj) {
        return (HttpEngine) obj;
    }

    public static /* bridge */ /* synthetic */ NetworkException O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        return (NetworkException) obj;
    }

    public static /* bridge */ /* synthetic */ UrlResponseInfo O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Object obj) {
        return obj instanceof NetworkException;
    }
}
