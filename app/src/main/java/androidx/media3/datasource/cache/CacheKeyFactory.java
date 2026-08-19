package androidx.media3.datasource.cache;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(14);

    String buildCacheKey(DataSpec dataSpec);
}
