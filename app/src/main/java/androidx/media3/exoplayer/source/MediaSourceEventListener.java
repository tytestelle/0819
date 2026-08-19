package androidx.media3.exoplayer.source;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void dispatchEvent(Consumer<MediaSourceEventListener> consumer) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(consumer, listenerAndHandler.listener, 1));
            }
        }

        public void downstreamFormatChanged(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
            downstreamFormatChanged(new MediaLoadData(1, i, format, i2, obj, Util.usToMs(j), C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i) {
            loadCanceled(loadEventInfo, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i) {
            loadCompleted(loadEventInfo, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i, IOException iOException, boolean z) {
            loadError(loadEventInfo, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i) {
            loadStarted(loadEventInfo, i, 0);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new MediaLoadData(1, i, null, 3, null, Util.usToMs(j), Util.usToMs(j2)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadCanceled(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadCompleted(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            loadError(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)), iOException, z);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i, int i2) {
            loadStarted(loadEventInfo, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i2);
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadStarted(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        public void downstreamFormatChanged(MediaLoadData mediaLoadData) {
            dispatchEvent(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, mediaLoadData));
        }

        public void upstreamDiscarded(MediaLoadData mediaLoadData) {
            dispatchEvent(new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, 3, (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId), mediaLoadData));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            dispatchEvent(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, loadEventInfo, mediaLoadData, 1));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            dispatchEvent(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, loadEventInfo, mediaLoadData, 0));
        }

        public void loadError(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            dispatchEvent(new androidx.media3.exoplayer.analytics.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, loadEventInfo, mediaLoadData, iOException, z));
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, int i4) {
            loadStarted(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)), i4);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            loadStarted(loadEventInfo, mediaLoadData, 0);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
            dispatchEvent(new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, loadEventInfo, mediaLoadData, i, 2));
        }
    }

    void onDownstreamFormatChanged(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2);

    void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
