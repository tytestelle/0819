package androidx.media3.datasource.cache;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Comparator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2311O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        this.f2311O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2311O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 1:
                return HlsMediaPlaylist.Interstitial.lambda$new$0((HlsMediaPlaylist.ClientDefinedAttribute) obj, (HlsMediaPlaylist.ClientDefinedAttribute) obj2);
            default:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
        }
    }
}
