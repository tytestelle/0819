package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MetadataRetriever implements AutoCloseable {
    public static final int DEFAULT_MAXIMUM_PARALLEL_RETRIEVALS = 5;

    @GuardedBy("lock")
    private final List<com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000> allFutures;
    private final Clock clock;

    @GuardedBy("lock")
    private MetadataRetrieverInternal internalRetriever;
    private final Object lock;
    private final MediaItem mediaItem;
    private final MediaSource.Factory mediaSourceFactory;

    @GuardedBy("lock")
    private com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 preparationFuture;

    @GuardedBy("lock")
    private boolean released;

    public static final class Builder {
        private Clock clock;

        @Nullable
        private final Context context;
        private final MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;

        public Builder(@Nullable Context context, MediaItem mediaItem) {
            this.context = context != null ? context.getApplicationContext() : null;
            this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
            this.clock = Clock.DEFAULT;
        }

        public MetadataRetriever build() {
            if (this.mediaSourceFactory == null) {
                Assertions.checkStateNotNull(this.context, "Context must be provided if MediaSource.Factory is not set.");
                this.mediaSourceFactory = new DefaultMediaSourceFactory(this.context, new DefaultExtractorsFactory().setMp4ExtractorFlags(6));
            }
            return new MetadataRetriever(this.mediaItem, (MediaSource.Factory) Assertions.checkNotNull(this.mediaSourceFactory), this.clock);
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            this.clock = (Clock) Assertions.checkNotNull(clock);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }
    }

    public static final class InternalResult {
        public final Timeline timeline;
        public final TrackGroupArray trackGroups;

        public InternalResult(TrackGroupArray trackGroupArray, Timeline timeline) {
            this.trackGroups = trackGroupArray;
            this.timeline = timeline;
        }
    }

    public static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private static final SharedWorkerThread SHARED_WORKER_THREAD = new SharedWorkerThread();
        private final MediaItem mediaItem;
        private final MediaSource.Factory mediaSourceFactory;
        private final HandlerWrapper mediaSourceHandler;
        private final OnFailureListener onFailureListener;
        private final OnPreparedListener onPreparedListener;

        public final class MediaSourceHandlerCallback implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final MediaSourceCaller mediaSourceCaller = new MediaSourceCaller();
            private boolean released;
            private Timeline timeline;

            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final MediaPeriodCallback mediaPeriodCallback = new MediaPeriodCallback();
                private final Allocator allocator = new DefaultAllocator(true, 65536);

                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    private MediaPeriodCallback() {
                    }

                    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        MetadataRetrieverInternal.this.onPreparedListener.onPrepared(mediaPeriod.getTrackGroups(), (Timeline) Assertions.checkNotNull(MediaSourceHandlerCallback.this.timeline));
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }

                    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }
                }

                public MediaSourceCaller() {
                }

                @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                    MediaSourceHandlerCallback.this.timeline = timeline;
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    MediaSourceHandlerCallback.this.mediaPeriod = mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.allocator, 0L);
                    MediaSourceHandlerCallback.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }
            }

            public MediaSourceHandlerCallback() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (this.released) {
                    return true;
                }
                int i = message.what;
                if (i == 1) {
                    MediaSource mediaSourceCreateMediaSource = MetadataRetrieverInternal.this.mediaSourceFactory.createMediaSource((MediaItem) message.obj);
                    this.mediaSource = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.mediaSourceCaller, null, PlayerId.UNSET);
                    MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessage(2);
                    return true;
                }
                if (i == 2) {
                    try {
                        MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            ((MediaSource) Assertions.checkNotNull(this.mediaSource)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100);
                    } catch (IOException e) {
                        MetadataRetrieverInternal.this.onFailureListener.onFailure(e);
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(4).sendToTarget();
                    }
                    return true;
                }
                if (i == 3) {
                    ((MediaPeriod) Assertions.checkNotNull(this.mediaPeriod)).continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                if (this.mediaPeriod != null) {
                    ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
                }
                MediaSource mediaSource = this.mediaSource;
                if (mediaSource != null) {
                    mediaSource.releaseSource(this.mediaSourceCaller);
                }
                MetadataRetrieverInternal.this.mediaSourceHandler.removeCallbacksAndMessages(null);
                MetadataRetrieverInternal.SHARED_WORKER_THREAD.removeWorker();
                this.released = true;
                return true;
            }
        }

        public interface OnFailureListener {
            void onFailure(Exception exc);
        }

        public interface OnPreparedListener {
            void onPrepared(TrackGroupArray trackGroupArray, Timeline timeline);
        }

        public MetadataRetrieverInternal(MediaSource.Factory factory, MediaItem mediaItem, Clock clock, OnPreparedListener onPreparedListener, OnFailureListener onFailureListener) {
            this.mediaSourceFactory = factory;
            this.mediaItem = mediaItem;
            this.onPreparedListener = onPreparedListener;
            this.onFailureListener = onFailureListener;
            this.mediaSourceHandler = clock.createHandler(SHARED_WORKER_THREAD.addWorker(), new MediaSourceHandlerCallback());
        }

        public void queueRetrieval() {
            SHARED_WORKER_THREAD.startRetrieval(this);
        }

        public void release() {
            this.mediaSourceHandler.obtainMessage(4).sendToTarget();
        }

        public void start() {
            this.mediaSourceHandler.obtainMessage(1, this.mediaItem).sendToTarget();
        }
    }

    public static final class SharedWorkerThread {
        public static final AtomicInteger MAX_PARALLEL_RETRIEVALS = new AtomicInteger(5);

        @Nullable
        private HandlerThread mediaSourceThread;
        private final Deque<MetadataRetrieverInternal> pendingRetrievals = new ArrayDeque();
        private int referenceCount;

        @GuardedBy("this")
        private void maybeStartNewRetrieval() {
            if (!this.pendingRetrievals.isEmpty() && this.referenceCount - this.pendingRetrievals.size() < MAX_PARALLEL_RETRIEVALS.get()) {
                this.pendingRetrievals.removeFirst().start();
            }
        }

        public synchronized Looper addWorker() {
            try {
                if (this.mediaSourceThread == null) {
                    Assertions.checkState(this.referenceCount == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    this.mediaSourceThread = handlerThread;
                    handlerThread.start();
                }
                this.referenceCount++;
            } catch (Throwable th) {
                throw th;
            }
            return ((HandlerThread) Assertions.checkNotNull(this.mediaSourceThread)).getLooper();
        }

        public synchronized void removeWorker() {
            try {
                int i = this.referenceCount - 1;
                this.referenceCount = i;
                if (i == 0) {
                    ((HandlerThread) Assertions.checkNotNull(this.mediaSourceThread)).quit();
                    this.mediaSourceThread = null;
                    this.pendingRetrievals.clear();
                } else {
                    maybeStartNewRetrieval();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void startRetrieval(MetadataRetrieverInternal metadataRetrieverInternal) {
            this.pendingRetrievals.addLast(metadataRetrieverInternal);
            maybeStartNewRetrieval();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        synchronized (this.lock) {
            try {
                MetadataRetrieverInternal metadataRetrieverInternal = this.internalRetriever;
                if (metadataRetrieverInternal != null) {
                    metadataRetrieverInternal.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPreparation$0(TrackGroupArray trackGroupArray, Timeline timeline) {
        synchronized (this.lock) {
            ((com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) Assertions.checkNotNull(this.preparationFuture)).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(new InternalResult(trackGroupArray, timeline));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPreparation$1(Exception exc) {
        synchronized (this.lock) {
            ((com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) Assertions.checkNotNull(this.preparationFuture)).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(exc);
        }
    }

    @Deprecated
    public static com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveMetadata(Context context, MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, Clock.DEFAULT);
    }

    public static void setMaximumParallelRetrievals(int i) {
        Assertions.checkArgument(i >= 1);
        SharedWorkerThread.MAX_PARALLEL_RETRIEVALS.set(i);
    }

    @GuardedBy("lock")
    private void startPreparation() {
        if (this.preparationFuture == null) {
            this.preparationFuture = new com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
            MetadataRetrieverInternal metadataRetrieverInternal = new MetadataRetrieverInternal(this.mediaSourceFactory, this.mediaItem, this.clock, new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(this), new O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(this));
            this.internalRetriever = metadataRetrieverInternal;
            metadataRetrieverInternal.queueRetrieval();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.released) {
                    return;
                }
                this.released = true;
                new com.google.common.util.concurrent.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Iterable) this.allFutures), com.google.common.util.concurrent.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 5), 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveDurationUs() {
        synchronized (this.lock) {
            try {
                if (this.released) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = new com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                    o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(illegalStateException);
                    return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                }
                com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTimeline = retrieveTimeline();
                final com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
                this.allFutures.add(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0);
                com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.MetadataRetriever.3
                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onFailure(Throwable th) {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
                    }

                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onSuccess(Timeline timeline) {
                        if (timeline.isEmpty()) {
                            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Long.valueOf(C.TIME_UNSET));
                        } else {
                            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Long.valueOf(timeline.getWindow(0, new Timeline.Window()).getDurationUs()));
                        }
                    }
                };
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTimeline.addListener(new com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTimeline, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, 0), com.google.common.util.concurrent.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE);
                return o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveTimeline() {
        synchronized (this.lock) {
            try {
                if (this.released) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = new com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                    o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(illegalStateException);
                    return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                }
                startPreparation();
                final com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
                this.allFutures.add(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0);
                com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) Assertions.checkNotNull(this.preparationFuture);
                com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.MetadataRetriever.2
                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onFailure(Throwable th) {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
                    }

                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onSuccess(InternalResult internalResult) {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(internalResult.timeline);
                    }
                };
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.addListener(new com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, 0), com.google.common.util.concurrent.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE);
                return o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveTrackGroups() {
        synchronized (this.lock) {
            try {
                if (this.released) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = new com.google.common.util.concurrent.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
                    o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(illegalStateException);
                    return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                }
                startPreparation();
                final com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0();
                this.allFutures.add(o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0);
                com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) Assertions.checkNotNull(this.preparationFuture);
                com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.exoplayer.MetadataRetriever.1
                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onFailure(Throwable th) {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
                    }

                    @Override // com.google.common.util.concurrent.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                    public void onSuccess(InternalResult internalResult) {
                        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(internalResult.trackGroups);
                    }
                };
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.addListener(new com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, 0), com.google.common.util.concurrent.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE);
                return o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private MetadataRetriever(MediaItem mediaItem, MediaSource.Factory factory, Clock clock) {
        this.mediaItem = mediaItem;
        this.mediaSourceFactory = factory;
        this.clock = clock;
        this.lock = new Object();
        this.allFutures = new ArrayList();
    }

    @Deprecated
    public static com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem) {
        return retrieveMetadata(factory, mediaItem, Clock.DEFAULT);
    }

    @VisibleForTesting
    @Deprecated
    public static com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
        MetadataRetriever metadataRetrieverBuild = new Builder(context, mediaItem).setClock(clock).build();
        try {
            com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTrackGroups = metadataRetrieverBuild.retrieveTrackGroups();
            metadataRetrieverBuild.close();
            return o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTrackGroups;
        } catch (Throwable th) {
            if (metadataRetrieverBuild != null) {
                try {
                    metadataRetrieverBuild.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    private static com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem, Clock clock) {
        MetadataRetriever metadataRetrieverBuild = new Builder(null, mediaItem).setMediaSourceFactory(factory).setClock(clock).build();
        try {
            com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTrackGroups = metadataRetrieverBuild.retrieveTrackGroups();
            metadataRetrieverBuild.close();
            return o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000RetrieveTrackGroups;
        } catch (Throwable th) {
            if (metadataRetrieverBuild != null) {
                try {
                    metadataRetrieverBuild.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
