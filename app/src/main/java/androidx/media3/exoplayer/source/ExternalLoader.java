package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExternalLoader {

    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }

    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 load(LoadRequest loadRequest);
}
