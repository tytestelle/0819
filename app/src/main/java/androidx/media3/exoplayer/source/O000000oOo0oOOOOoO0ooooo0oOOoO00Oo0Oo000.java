package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MediaSource mediaSource, MediaItem mediaItem) {
        return false;
    }

    public static Timeline O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(MediaSource mediaSource) {
        return null;
    }

    public static boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(MediaSource mediaSource) {
        return true;
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener) {
        mediaSource.prepareSource(mediaSourceCaller, transferListener, PlayerId.UNSET);
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(MediaSource mediaSource, MediaItem mediaItem) {
    }
}
