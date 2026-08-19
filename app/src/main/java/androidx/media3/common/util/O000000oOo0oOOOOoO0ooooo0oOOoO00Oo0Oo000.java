package androidx.media3.common.util;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    public static /* bridge */ /* synthetic */ AudioDeviceCallback O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Object obj) {
        return (AudioDeviceCallback) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ PlaybackParams O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
