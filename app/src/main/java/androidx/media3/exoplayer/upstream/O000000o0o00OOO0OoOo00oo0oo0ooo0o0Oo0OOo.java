package androidx.media3.exoplayer.upstream;

import androidx.media3.common.MediaItem;
import com.google.common.collect.O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static /* synthetic */ CmcdConfiguration O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MediaItem mediaItem) {
        String string = UUID.randomUUID().toString();
        String str = mediaItem.mediaId;
        if (str == null) {
            str = "";
        }
        return new CmcdConfiguration(string, str, new CmcdConfiguration.RequestConfig() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.1
            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final /* synthetic */ O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 getCustomData() {
                return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
            }

            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final /* synthetic */ int getRequestedMaximumThroughputKbps(int i) {
                return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
            }

            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final /* synthetic */ boolean isKeyAllowed(String str2) {
                return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, str2);
            }
        });
    }
}
