package androidx.media3.exoplayer.offline;

import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements RequirementsWatcher.Listener, CacheWriter.ProgressListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Object f2599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj) {
        this.f2599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.f2599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).onProgress(j, j2, j3);
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.f2599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
