package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private int asynchronousMode;

    @Nullable
    private final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O callbackThreadSupplier;

    @Nullable
    private final Context context;

    @Nullable
    private final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O queueingThreadSupplier;

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
        this.context = null;
        this.callbackThreadSupplier = null;
        this.queueingThreadSupplier = null;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        Context context = this.context;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) {
        int i;
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        if (Build.VERSION.SDK_INT < 23 || !((i = this.asynchronousMode) == 1 || (i == 0 && shouldUseAsynchronousAdapterInDefaultMode()))) {
            return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
        Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = this.callbackThreadSupplier;
        AsynchronousMediaCodecAdapter.Factory factory = (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 == null || (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = this.queueingThreadSupplier) == null) ? new AsynchronousMediaCodecAdapter.Factory(trackType) : new AsynchronousMediaCodecAdapter.Factory(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
        factory.experimentalSetAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        return factory.createAdapter(configuration);
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory experimentalSetAsyncCryptoFlagEnabled(boolean z) {
        this.asyncCryptoFlagEnabled = z;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public DefaultMediaCodecAdapterFactory(Context context) {
        this(context, null, null);
    }

    public DefaultMediaCodecAdapterFactory(Context context, @Nullable O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, @Nullable O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
        this.callbackThreadSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        this.queueingThreadSupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2;
    }
}
