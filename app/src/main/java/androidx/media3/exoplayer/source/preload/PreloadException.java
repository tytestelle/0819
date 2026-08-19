package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PreloadException extends Exception {
    public final MediaItem mediaItem;

    public PreloadException(MediaItem mediaItem, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.mediaItem = mediaItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r3 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean errorInfoEquals(@androidx.annotation.Nullable androidx.media3.exoplayer.source.preload.PreloadException r7) {
        if (this == r7) return true;
        if (r7 == null) return false;
        return java.util.Objects.equals(getMessage(), r7.getMessage());
    }
}
