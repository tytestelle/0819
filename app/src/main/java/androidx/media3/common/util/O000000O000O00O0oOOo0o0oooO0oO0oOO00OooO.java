package androidx.media3.common.util;

import android.net.Uri;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(BitmapLoader bitmapLoader, MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return bitmapLoader.decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return bitmapLoader.loadBitmap(uri);
        }
        return null;
    }
}
