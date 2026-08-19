package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static /* synthetic */ String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
