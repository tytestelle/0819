package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BasePreloadManager<T, PreloadStatusT> {
    private final Handler applicationHandler;
    private final ListenerSet<PreloadManagerListener> listeners;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> mediaItemMediaSourceHolderMap;
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;

    @GuardedBy("lock")
    private final PriorityQueue<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> sourceHolderPriorityQueue;
    private final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;

    @Nullable
    @GuardedBy("lock")
    private PreloadStatusT targetPreloadStatusOfCurrentPreloadingSource;

    public static abstract class BuilderBase<T, PreloadStatusT> {
        protected O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O mediaSourceFactorySupplier;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        }

        public abstract BasePreloadManager<T, PreloadStatusT> build();
    }

    public final class MediaSourceHolder implements Comparable<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;

        public MediaSourceHolder(MediaSource mediaSource, T t) {
            this.mediaSource = mediaSource;
            this.rankingData = t;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    public BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(handlerCreateHandlerForCurrentOrMainLooper.getLooper(), Clock.DEFAULT, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o());
        this.mediaItemMediaSourceHolderMap = new HashMap();
        this.sourceHolderPriorityQueue = new PriorityQueue<>();
    }

    @GuardedBy("lock")
    private boolean isPreloading(MediaSource mediaSource) {
        return !this.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(PreloadManagerListener preloadManagerListener, FlagSet flagSet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPreloadCompleted$1(MediaSource mediaSource, PreloadManagerListener preloadManagerListener) {
        preloadManagerListener.onCompleted(mediaSource.getMediaItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadCompleted$2(MediaSource mediaSource) {
        this.listeners.sendEvent(-1, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(mediaSource, 0));
        lambda$onPreloadSkipped$5(mediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadError$4(PreloadException preloadException, MediaSource mediaSource) {
        this.listeners.sendEvent(-1, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(preloadException, 1));
        lambda$onPreloadSkipped$5(mediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: maybeAdvanceToNextSource, reason: merged with bridge method [inline-methods] */
    public void lambda$onPreloadSkipped$5(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    do {
                        this.sourceHolderPriorityQueue.poll();
                        if (this.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("lock")
    private boolean maybeStartPreloadNextSource() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
        PreloadStatusT targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        preloadSourceInternal(mediaSourceHolder.mediaSource, targetPreloadStatus);
        return true;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public final void add(MediaItem mediaItem, T t) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t);
    }

    public void addListener(PreloadManagerListener preloadManagerListener) {
        this.listeners.add(preloadManagerListener);
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public abstract void clearSourceInternal(MediaSource mediaSource);

    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    public final PreloadStatusT getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!isPreloading(mediaSource)) {
                    return null;
                }
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadCompleted(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, mediaSource, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadError(PreloadException preloadException, MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, 9, preloadException, mediaSource));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadSkipped(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    Util.postOrRun(this.applicationHandler, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, mediaSource, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void preloadSourceInternal(MediaSource mediaSource, @Nullable PreloadStatusT preloadstatust);

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public void releaseInternal() {
    }

    public abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public void removeListener(PreloadManagerListener preloadManagerListener) {
        verifyApplicationThread();
        this.listeners.remove(preloadManagerListener);
    }

    public final void reset() {
        Iterator<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public final void add(MediaSource mediaSource, T t) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(mediaSourceCreateMediaSourceForPreloading, t));
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }
}
