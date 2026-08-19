package androidx.media3.common.util;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface BitmapLoader {
    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 decodeBitmap(byte[] bArr);

    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 loadBitmap(Uri uri);

    @Nullable
    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 loadBitmapFromMetadata(MediaMetadata mediaMetadata);

    boolean supportsMimeType(String str);
}
