package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public final /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, i, mediaPeriodId, i2);
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public final /* synthetic */ void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, i, mediaPeriodId);
            }
        });
    }

    private DrmSession acquireFirstSessionOnHandlerThread(final int i, @Nullable final byte[] bArr, final Format format) {
        Assertions.checkNotNull(format.drmInitData);
        final O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.O00000OOoOOO00O00o0ooooooooO000ooooO0000
            @Override // java.lang.Runnable
            public final void run() {
                O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
                this.f2552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$acquireFirstSessionOnHandlerThread$2(i, bArr, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1, format);
            }
        });
        try {
            DrmSession drmSession = (DrmSession) o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.get();
            this.drmListenerConditionVariable.block();
            O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
            this.handler.post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(drmSession, this, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1));
            try {
                if (o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.get() == null) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, @Nullable byte[] bArr, Format format) {
        DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, format);
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
        this.handler.post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, drmSessionAcquireFirstSessionOnHandlerThread, 2));
        try {
            try {
                byte[] bArr2 = (byte[]) Assertions.checkNotNull((byte[]) o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.get());
                releaseManagerOnHandlerThread();
                return bArr2;
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (Throwable th) {
            releaseManagerOnHandlerThread();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$2(int i, byte[] bArr, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, Format format) {
        try {
            this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i, bArr);
                o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo((DrmSession) Assertions.checkNotNull(this.drmSessionManager.acquireSession(this.eventDispatcher, format)));
            } catch (Throwable th) {
                this.drmSessionManager.release();
                throw th;
            }
        } catch (Throwable th2) {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(DrmSession drmSession, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(error);
        } catch (Throwable th) {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, DrmSession drmSession) {
        try {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(drmSession.getOfflineLicenseKeySetId());
        } catch (Throwable th) {
            try {
                o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLicenseDurationRemainingSec$0(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, DrmSession drmSession) {
        try {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } catch (Throwable th) {
            try {
                o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
            } finally {
                drmSession.release(this.eventDispatcher);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) {
        try {
            this.drmSessionManager.release();
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(null);
        } catch (Throwable th) {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(MediaItem.DrmConfiguration drmConfiguration, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Assertions.checkArgument(drmConfiguration.scheme.equals(C.WIDEVINE_UUID));
        return newWidevineInstance(((Uri) Assertions.checkNotNull(drmConfiguration.licenseUri)).toString(), drmConfiguration.forceDefaultLicenseUri, drmConfiguration.licenseRequestHeaders, factory, null, eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
        this.handler.post(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, 1));
        try {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public synchronized byte[] downloadLicense(Format format) {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) {
        Pair<Long, Long> pair;
        Assertions.checkNotNull(bArr);
        try {
            DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
            this.handler.post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, drmSessionAcquireFirstSessionOnHandlerThread, 0));
            try {
                try {
                    pair = (Pair) o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.get();
                    releaseManagerOnHandlerThread();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                releaseManagerOnHandlerThread();
                throw th;
            }
        } catch (DrmSession.DrmSessionException e2) {
            if (e2.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e2;
        }
        return pair;
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, null, factory, map, eventDispatcher);
    }

    private static OfflineLicenseHelper newWidevineInstance(String str, boolean z, @Nullable Map<String, String> map, DataSource.Factory factory, @Nullable Map<String, String> map2, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(str, z, factory);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpMediaDrmCallback.setKeyRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map2).build(httpMediaDrmCallback), eventDispatcher);
    }
}
