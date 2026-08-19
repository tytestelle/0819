package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0));
    private final long maxBytes;

    public LeastRecentlyUsedCacheEvictor(long j) {
        this.maxBytes = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j2 = cacheSpan2.lastTouchTimestamp;
        if (j - j2 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j < j2 ? -1 : 1;
    }

    private void evictCache(Cache cache, long j) {
        while (this.currentSize + j > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            evictCache(cache, j2);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
