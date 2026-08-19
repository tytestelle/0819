package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    public static final class LivePositionSupplier implements PositionSupplier {
        private long finalValue = C.TIME_UNSET;
        private final PositionSupplier livePosition;

        public LivePositionSupplier(PositionSupplier positionSupplier) {
            this.livePosition = positionSupplier;
        }

        public void disconnect(long j) {
            this.finalValue = j;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public long get() {
            long j = this.finalValue;
            return j != C.TIME_UNSET ? j : this.livePosition.get();
        }
    }

    public static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;

        @Nullable
        public final MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public final Object manifest;
        public final MediaItem mediaItem;

        @Nullable
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;

            @Nullable
            private MediaItem.LiveConfiguration liveConfiguration;

            @Nullable
            private Object manifest;
            private MediaItem mediaItem;

            @Nullable
            private MediaMetadata mediaMetadata;
            private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            @CanIgnoreReturnValue
            public Builder setDefaultPositionUs(long j) {
                Assertions.checkArgument(j >= 0);
                this.defaultPositionUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j) {
                Assertions.checkArgument(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setElapsedRealtimeEpochOffsetMs(long j) {
                this.elapsedRealtimeEpochOffsetMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsDynamic(boolean z) {
                this.isDynamic = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsSeekable(boolean z) {
                this.isSeekable = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setLiveConfiguration(@Nullable MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setManifest(@Nullable Object obj) {
                this.manifest = obj;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMediaMetadata(@Nullable MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPeriods(List<PeriodData> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    Assertions.checkArgument(list.get(i).durationUs != C.TIME_UNSET, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        Assertions.checkArgument(!list.get(i).uid.equals(list.get(i3).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.periods = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPositionInFirstPeriodUs(long j) {
                Assertions.checkArgument(j >= 0);
                this.positionInFirstPeriodUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPresentationStartTimeMs(long j) {
                this.presentationStartTimeMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setWindowStartTimeMs(long j) {
                this.windowStartTimeMs = j;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C.TIME_UNSET;
                this.windowStartTimeMs = C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
            }

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i, Timeline.Period period, Timeline.Window window) {
            boolean z = SimpleBasePlayer.getCurrentMediaItemIndexInternal(state) == i;
            state.timeline.getWindow(i, window);
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
            for (int i2 = window.firstPeriodIndex; i2 <= window.lastPeriodIndex; i2++) {
                state.timeline.getPeriod(i2, period, true);
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new PeriodData.Builder(Assertions.checkNotNull(period.uid)).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            return new Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem).setMediaMetadata(z ? state.currentMetadata : null).setPeriods(o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs).setTracks(z ? state.currentTracks : Tracks.EMPTY).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i, int i2, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                long j = this.positionInFirstPeriodUs;
                period.set(obj, obj, i, j + this.durationUs, -j, AdPlaybackState.NONE, this.isPlaceholder);
            } else {
                PeriodData periodData = (PeriodData) this.periods.get(i2);
                Object obj2 = periodData.uid;
                period.set(obj2, Pair.create(this.uid, obj2), i, periodData.durationUs, this.periodPositionInWindowUs[i2], periodData.adPlaybackState, periodData.isPlaceholder);
            }
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, ((PeriodData) this.periods.get(i)).uid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i, Timeline.Window window) {
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i, (i + (this.periods.isEmpty() ? 1 : this.periods.size())) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && Objects.equals(this.manifest, mediaItemData.manifest) && Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public int hashCode() {
            int iHashCode = (this.mediaItem.hashCode() + ((this.tracks.hashCode() + ((this.uid.hashCode() + TbsListener.ErrorCode.INCR_UPDATE_FAIL) * 31)) * 31)) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode2 = (iHashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode4 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            int i = (((iHashCode3 + iHashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return this.periods.hashCode() + ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31);
        }

        private MediaItemData(Builder builder) {
            int i = 0;
            if (builder.liveConfiguration == null) {
                Assertions.checkArgument(builder.presentationStartTimeMs == C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.windowStartTimeMs == C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C.TIME_UNSET && builder.windowStartTimeMs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j;
            this.isPlaceholder = builder.isPlaceholder;
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = builder.periods;
            this.periods = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
            long[] jArr = new long[o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size()];
            this.periodPositionInWindowUs = jArr;
            if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.isEmpty()) {
                return;
            }
            jArr[0] = -j;
            while (i < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i2 = i + 1;
                jArr2[i2] = jArr2[i] + ((PeriodData) this.periods.get(i)).durationUs;
                i = i2;
            }
        }
    }

    public static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            public PeriodData build() {
                return new PeriodData(this);
            }

            @CanIgnoreReturnValue
            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j) {
                Assertions.checkArgument(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public int hashCode() {
            int iHashCode = (this.uid.hashCode() + TbsListener.ErrorCode.INCR_UPDATE_FAIL) * 31;
            long j = this.durationUs;
            return ((this.adPlaybackState.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }
    }

    public static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    public static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i = 0; i < size; i++) {
                MediaItemData mediaItemData = list.get(i);
                this.firstPeriodIndexByWindowIndex[i] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new HashMap<>();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MediaItemData mediaItemData2 = list.get(i3);
                for (int i4 = 0; i4 < getPeriodCountInMediaItem(mediaItemData2); i4++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i4), Integer.valueOf(i2));
                    this.windowIndexByPeriodIndex[i2] = i3;
                    i2++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return ((MediaItemData) this.playlist.get(i2)).getPeriod(i2, i - this.firstPeriodIndexByWindowIndex[i2], period);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            return getPeriod(((Integer) Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return ((MediaItemData) this.playlist.get(i2)).getPeriodUid(i - this.firstPeriodIndexByWindowIndex[i2]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return ((MediaItemData) this.playlist.get(i)).getWindow(this.firstPeriodIndexByWindowIndex[i], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }
    }

    public interface PositionSupplier {
        public static final PositionSupplier ZERO = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0);

        long get();
    }

    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;

        @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;

        @Nullable
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        private final boolean usesDerivedMediaMetadata;
        public final VideoSize videoSize;

        @FloatRange(from = 0.0d, to = 1.0d)
        public final float volume;

        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;

            @Nullable
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;

            @Nullable
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;

            @Nullable
            private MediaMetadata currentMetadata;

            @Nullable
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;

            @Nullable
            private PlaybackException playerError;

            @Nullable
            private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            public State build() {
                return new State(this);
            }

            @CanIgnoreReturnValue
            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(long j) {
                this.adPositionMs = Long.valueOf(j);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(long j) {
                this.contentPositionMs = Long.valueOf(j);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentAd(int i, int i2) {
                Assertions.checkArgument((i == -1) == (i2 == -1));
                this.currentAdGroupIndex = i;
                this.currentAdIndexInAdGroup = i2;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCurrentMediaItemIndex(int i) {
                this.currentMediaItemIndex = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeviceVolume(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
                Assertions.checkArgument(i >= 0);
                this.deviceVolume = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsDeviceMuted(boolean z) {
                this.isDeviceMuted = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setIsLoading(boolean z) {
                this.isLoading = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaxSeekToPreviousPositionMs(long j) {
                this.maxSeekToPreviousPositionMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setNewlyRenderedFirstFrame(boolean z) {
                this.newlyRenderedFirstFrame = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackState(int i) {
                this.playbackState = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackSuppressionReason(int i) {
                this.playbackSuppressionReason = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayerError(@Nullable PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    Assertions.checkArgument(hashSet.add(list.get(i).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPositionDiscontinuity(int i, long j) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i;
                this.discontinuityPositionMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRepeatMode(int i) {
                this.repeatMode = i;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSeekBackIncrementMs(long j) {
                this.seekBackIncrementMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSeekForwardIncrementMs(long j) {
                this.seekForwardIncrementMs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setShuffleModeEnabled(boolean z) {
                this.shuffleModeEnabled = z;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
                Assertions.checkArgument(f >= 0.0f && f <= 1.0f);
                this.volume = f;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
                this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
                this.playlist = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(C.TIME_UNSET);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlaylist(Timeline timeline, Tracks tracks, @Nullable MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                Timeline timeline = state.timeline;
                this.timeline = timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.usesDerivedMediaMetadata ? null : state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builderWithExpectedSize(this.timeline.getWindowCount());
            for (int i = 0; i < this.timeline.getWindowCount(); i++) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(MediaItemData.buildFromState(this, i, period, window));
            }
            return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }

        public int hashCode() {
            int iHashCode = (((((((((this.availableCommands.hashCode() + TbsListener.ErrorCode.INCR_UPDATE_FAIL) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            PlaybackException playbackException = this.playerError;
            int iHashCode2 = (((((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j = this.seekBackIncrementMs;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.seekForwardIncrementMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxSeekToPreviousPositionMs;
            int iHashCode3 = (((((this.totalBufferedDurationMsSupplier.hashCode() + ((this.adBufferedPositionMsSupplier.hashCode() + ((this.contentBufferedPositionMsSupplier.hashCode() + ((this.adPositionMsSupplier.hashCode() + ((this.contentPositionMsSupplier.hashCode() + ((((((((this.playlistMetadata.hashCode() + ((this.currentMetadata.hashCode() + ((this.currentTracks.hashCode() + ((this.timeline.hashCode() + ((this.timedMetadata.hashCode() + ((((this.surfaceSize.hashCode() + ((((((this.deviceInfo.hashCode() + ((this.currentCues.hashCode() + ((this.videoSize.hashCode() + ((Float.floatToRawIntBits(this.volume) + ((this.audioAttributes.hashCode() + ((this.trackSelectionParameters.hashCode() + ((this.playbackParameters.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31)) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j4 = this.discontinuityPositionMs;
            return iHashCode3 + ((int) (j4 ^ (j4 >>> 32)));
        }

        /* JADX WARN: Code duplicated, block: B:56:0x010c  */
        /* JADX WARN: Code duplicated, block: B:58:0x0112  */
        /* JADX WARN: Code duplicated, block: B:64:0x0124  */
        /* JADX WARN: Code duplicated, block: B:67:0x0139  */
        /* JADX WARN: Code duplicated, block: B:78:0x0175  */
        /* JADX WARN: Code duplicated, block: B:81:0x018b  */
        /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
        private State(Builder builder) {
            boolean z;
            PositionSupplier positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            PositionSupplier positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
            Tracks tracks = builder.currentTracks;
            MediaMetadata combinedMediaMetadata = builder.currentMetadata;
            if (!builder.timeline.isEmpty()) {
                int i = builder.currentMediaItemIndex;
                if (i == -1) {
                    i = 0;
                } else {
                    Assertions.checkArgument(builder.currentMediaItemIndex < builder.timeline.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                }
                if (builder.currentAdGroupIndex != -1) {
                    Timeline.Period period = new Timeline.Period();
                    builder.timeline.getPeriod(SimpleBasePlayer.getPeriodIndexFromWindowPosition(builder.timeline, i, builder.contentPositionMs != null ? builder.contentPositionMs.longValue() : builder.contentPositionMsSupplier.get(), new Timeline.Window(), period), period);
                    Assertions.checkArgument(builder.currentAdGroupIndex < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.currentAdGroupIndex);
                    if (adCountInAdGroup != -1) {
                        Assertions.checkArgument(builder.currentAdIndexInAdGroup < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
                if (builder.playlist != null) {
                    MediaItemData mediaItemData = (MediaItemData) builder.playlist.get(i);
                    Tracks tracks2 = mediaItemData.tracks;
                    combinedMediaMetadata = mediaItemData.mediaMetadata;
                    tracks = tracks2;
                }
                if (combinedMediaMetadata == null) {
                    combinedMediaMetadata = SimpleBasePlayer.getCombinedMediaMetadata(builder.timeline.getWindow(i, new Timeline.Window()).mediaItem, (Tracks) Assertions.checkNotNull(tracks));
                    z = true;
                }
                if (builder.playerError != null) {
                    Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
                }
                if (builder.playbackState != 1 || builder.playbackState == 4) {
                    Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
                }
                positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = builder.contentPositionMsSupplier;
                if (builder.contentPositionMs != null) {
                    if (builder.currentAdGroupIndex != -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0 && builder.contentPositionMs.longValue() != C.TIME_UNSET) {
                        positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(builder.contentPositionMs.longValue(), builder.playbackParameters.speed);
                    } else {
                        positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.contentPositionMs.longValue());
                    }
                }
                positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = builder.adPositionMsSupplier;
                if (builder.adPositionMs != null) {
                    if (builder.currentAdGroupIndex == -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0) {
                        positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(builder.adPositionMs.longValue(), 1.0f);
                    } else {
                        positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.adPositionMs.longValue());
                    }
                }
                this.availableCommands = builder.availableCommands;
                this.playWhenReady = builder.playWhenReady;
                this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
                this.playbackState = builder.playbackState;
                this.playbackSuppressionReason = builder.playbackSuppressionReason;
                this.playerError = builder.playerError;
                this.repeatMode = builder.repeatMode;
                this.shuffleModeEnabled = builder.shuffleModeEnabled;
                this.isLoading = builder.isLoading;
                this.seekBackIncrementMs = builder.seekBackIncrementMs;
                this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
                this.playbackParameters = builder.playbackParameters;
                this.trackSelectionParameters = builder.trackSelectionParameters;
                this.audioAttributes = builder.audioAttributes;
                this.volume = builder.volume;
                this.videoSize = builder.videoSize;
                this.currentCues = builder.currentCues;
                this.deviceInfo = builder.deviceInfo;
                this.deviceVolume = builder.deviceVolume;
                this.isDeviceMuted = builder.isDeviceMuted;
                this.surfaceSize = builder.surfaceSize;
                this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
                this.timedMetadata = builder.timedMetadata;
                this.timeline = builder.timeline;
                this.currentTracks = (Tracks) Assertions.checkNotNull(tracks);
                this.currentMetadata = combinedMediaMetadata;
                this.playlistMetadata = builder.playlistMetadata;
                this.currentMediaItemIndex = builder.currentMediaItemIndex;
                this.currentAdGroupIndex = builder.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
                this.contentPositionMsSupplier = positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                this.adPositionMsSupplier = positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
                this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
                this.discontinuityPositionMs = builder.discontinuityPositionMs;
                this.usesDerivedMediaMetadata = z;
            }
            Assertions.checkArgument(builder.playbackState == 1 || builder.playbackState == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
            Assertions.checkArgument(builder.currentAdGroupIndex == -1 && builder.currentAdIndexInAdGroup == -1, "Ads not allowed if playlist is empty");
            tracks = tracks == null ? Tracks.EMPTY : tracks;
            if (combinedMediaMetadata == null) {
                combinedMediaMetadata = MediaMetadata.EMPTY;
            }
            z = false;
            if (builder.playerError != null) {
                Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
            }
            if (builder.playbackState != 1) {
                Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            } else {
                Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = builder.contentPositionMsSupplier;
            if (builder.contentPositionMs != null) {
                if (builder.currentAdGroupIndex != -1) {
                    positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.contentPositionMs.longValue());
                } else {
                    positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.contentPositionMs.longValue());
                }
            }
            positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = builder.adPositionMsSupplier;
            if (builder.adPositionMs != null) {
                if (builder.currentAdGroupIndex == -1) {
                    positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.adPositionMs.longValue());
                } else {
                    positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(builder.adPositionMs.longValue());
                }
            }
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
            this.playbackState = builder.playbackState;
            this.playbackSuppressionReason = builder.playbackSuppressionReason;
            this.playerError = builder.playerError;
            this.repeatMode = builder.repeatMode;
            this.shuffleModeEnabled = builder.shuffleModeEnabled;
            this.isLoading = builder.isLoading;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.playbackParameters = builder.playbackParameters;
            this.trackSelectionParameters = builder.trackSelectionParameters;
            this.audioAttributes = builder.audioAttributes;
            this.volume = builder.volume;
            this.videoSize = builder.videoSize;
            this.currentCues = builder.currentCues;
            this.deviceInfo = builder.deviceInfo;
            this.deviceVolume = builder.deviceVolume;
            this.isDeviceMuted = builder.isDeviceMuted;
            this.surfaceSize = builder.surfaceSize;
            this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
            this.timedMetadata = builder.timedMetadata;
            this.timeline = builder.timeline;
            this.currentTracks = (Tracks) Assertions.checkNotNull(tracks);
            this.currentMetadata = combinedMediaMetadata;
            this.playlistMetadata = builder.playlistMetadata;
            this.currentMediaItemIndex = builder.currentMediaItemIndex;
            this.currentAdGroupIndex = builder.currentAdGroupIndex;
            this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
            this.contentPositionMsSupplier = positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            this.adPositionMsSupplier = positionSupplierO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
            this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
            this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
            this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
            this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
            this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
            this.discontinuityPositionMs = builder.discontinuityPositionMs;
            this.usesDerivedMediaMetadata = z;
        }
    }

    public SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        if (state.timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) state.timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(state.timeline.getWindowCount());
        for (int i = 0; i < state.timeline.getWindowCount(); i++) {
            arrayList.add(MediaItemData.buildFromState(state, i, period, window));
        }
        return arrayList;
    }

    private static State buildStateForNewPosition(State.Builder builder, State state, long j, Timeline timeline, int i, long j2, boolean z, Timeline.Window window) {
        long defaultPositionMs;
        int i2 = i;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, state, window);
        boolean z2 = false;
        if (timeline.isEmpty() || (i2 != -1 && i2 < timeline.getWindowCount())) {
            defaultPositionMs = j2;
        } else {
            defaultPositionMs = -9223372036854775807L;
            i2 = 0;
        }
        if (!timeline.isEmpty() && defaultPositionMs == C.TIME_UNSET) {
            defaultPositionMs = timeline.getWindow(i2, window).getDefaultPositionMs();
        }
        boolean z3 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z4 = (z3 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i2, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i2);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z3 && !z4) {
                z2 = true;
            }
            builder.setPlaylist(timeline, z2 ? state.currentTracks : Tracks.EMPTY, z2 ? state.currentMetadata : null);
        }
        if (z3 || z4 || defaultPositionMs < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(defaultPositionMs)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (defaultPositionMs == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i2);
            if (state.currentAdGroupIndex == -1 || !z) {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem));
            } else {
                builder.setTotalBufferedDurationMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            }
        } else {
            builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Math.max(getContentBufferedPositionMsInternal(state, window), defaultPositionMs))).setTotalBufferedDurationMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (defaultPositionMs - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    private void clearVideoOutput(@Nullable Object obj) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i = 0; i < size; i++) {
            Tracks.Group group = (Tracks.Group) tracks.getGroups().get(i);
            for (int i2 = 0; i2 < group.length; i2++) {
                if (group.isTrackSelected(i2)) {
                    Format trackFormat = group.getTrackFormat(i2);
                    if (trackFormat.metadata != null) {
                        for (int i3 = 0; i3 < trackFormat.metadata.length(); i3++) {
                            trackFormat.metadata.get(i3).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i = state.currentMediaItemIndex;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i, Timeline.Period period, Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
        Object objCheckNotNull = Assertions.checkNotNull(timeline.getPeriod(timeline.getWindow(i, window).firstPeriodIndex, period, true).uid);
        if (timeline2.getIndexOfPeriod(objCheckNotNull) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(objCheckNotNull, period).windowIndex;
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i, boolean z, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(state, window) <= getContentPositionMsInternal(state2, window)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i, long j, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, Util.msToUs(j)).first);
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i = state.currentAdGroupIndex;
        return Util.usToMs(i == -1 ? period.durationUs : period.getAdDurationUs(i, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj;
        Object obj2;
        MediaItem mediaItem;
        int i;
        long j;
        long contentPositionMsInternal;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            obj = null;
            obj2 = null;
            mediaItem = null;
            i = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            Object obj4 = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            mediaItem = window.mediaItem;
            obj2 = obj3;
            obj = obj4;
            i = currentPeriodIndexInternal;
        }
        if (z) {
            j = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j : getContentPositionMsInternal(state, window);
        } else {
            long contentPositionMsInternal2 = getContentPositionMsInternal(state, window);
            j = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal2;
            contentPositionMsInternal = contentPositionMsInternal2;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i, j, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static long getPositionOrDefaultInMediaItem(long j, State state, Timeline.Window window) {
        if (j != C.TIME_UNSET) {
            return j;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        State.Builder builderBuildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? C.TIME_UNSET : j;
        for (int i = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i < timeline.getWindowCount(); i++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i, period, window);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(builderBuildUpon, state, j, playlistTimeline, mediaItemIndexInNewPlaylist, j2, true, window);
    }

    private static State getStateWithNewPlaylistAndPosition(State state, @Nullable List<MediaItemData> list, int i, long j, Timeline.Window window) {
        State.Builder builderBuildUpon = state.buildUpon();
        Timeline playlistTimeline = list == null ? state.timeline : new PlaylistTimeline(list);
        if (state.playbackState != 1) {
            if (playlistTimeline.isEmpty() || (i != -1 && i >= playlistTimeline.getWindowCount())) {
                builderBuildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                builderBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i, j, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i, window).uid;
            Object obj2 = timeline2.getWindow(i, window).uid;
            boolean z = (obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$addMediaItems$3(State state, List list, int i) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i2 = 0; i2 < list.size(); i2++) {
            listBuildMutablePlaylistFromState.add(i2 + i, getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$clearVideoOutput$21(State state) {
        return state.buildUpon().setSurfaceSize(Size.ZERO).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$decreaseDeviceVolume$26(State state) {
        return state.buildUpon().setDeviceVolume(Math.max(0, state.deviceVolume - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$decreaseDeviceVolume$27(State state) {
        return state.buildUpon().setDeviceVolume(Math.max(0, state.deviceVolume - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 lambda$handleReplaceMediaItems$31(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, Object obj) {
        return o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$increaseDeviceVolume$24(State state) {
        return state.buildUpon().setDeviceVolume(state.deviceVolume + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$increaseDeviceVolume$25(State state) {
        return state.buildUpon().setDeviceVolume(state.deviceVolume + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$moveMediaItems$4(State state, int i, int i2, int i3) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.moveItems(listBuildMutablePlaylistFromState, i, i2, i3);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$prepare$7(State state) {
        return state.buildUpon().setPlayerError(null).setPlaybackState(state.timeline.isEmpty() ? 4 : 2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$release$13(State state) {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$removeMediaItems$6(State state, int i, int i2) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.removeRange(listBuildMutablePlaylistFromState, i, i2);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$replaceMediaItems$5(State state, List list, int i, int i2) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i3 = 0; i3 < list.size(); i3++) {
            listBuildMutablePlaylistFromState.add(i3 + i, getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
        if (i2 >= i) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(listBuildMutablePlaylistFromState, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylist, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$seekTo$10(boolean z, State state, int i, long j) {
        return z ? state : getStateWithNewPlaylistAndPosition(state, null, i, j, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setAudioAttributes$30(State state, AudioAttributes audioAttributes) {
        return state.buildUpon().setAudioAttributes(audioAttributes).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceMuted$28(State state, boolean z) {
        return state.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceMuted$29(State state, boolean z) {
        return state.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceVolume$22(State state, int i) {
        return state.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceVolume$23(State state, int i) {
        return state.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$setMediaItemsInternal$2(List list, State state, int i, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i, j, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlayWhenReady$1(State state, boolean z) {
        return state.buildUpon().setPlayWhenReady(z, 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlaybackParameters$11(State state, PlaybackParameters playbackParameters) {
        return state.buildUpon().setPlaybackParameters(playbackParameters).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlaylistMetadata$15(State state, MediaMetadata mediaMetadata) {
        return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setRepeatMode$8(State state, int i) {
        return state.buildUpon().setRepeatMode(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setShuffleModeEnabled$9(State state, boolean z) {
        return state.buildUpon().setShuffleModeEnabled(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setTrackSelectionParameters$14(State state, TrackSelectionParameters trackSelectionParameters) {
        return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurface$17(State state) {
        return state.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurfaceHolder$18(State state, SurfaceHolder surfaceHolder) {
        return state.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceHolder)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurfaceView$19(State state, SurfaceView surfaceView) {
        return state.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceView.getHolder())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoTextureView$20(State state, Size size) {
        return state.buildUpon().setSurfaceSize(size).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVolume$16(State state, float f) {
        return state.buildUpon().setVolume(f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$stop$12(State state) {
        return state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getContentPositionMsInternal(state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$32(State state, int i, Player.Listener listener) {
        listener.onTimelineChanged(state.timeline, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$33(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$35(State state, Player.Listener listener) {
        listener.onPlayerErrorChanged(state.playerError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$36(State state, Player.Listener listener) {
        listener.onPlayerError((PlaybackException) Util.castNonNull(state.playerError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$37(State state, Player.Listener listener) {
        listener.onTrackSelectionParametersChanged(state.trackSelectionParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$38(State state, Player.Listener listener) {
        listener.onTracksChanged(state.currentTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$39(State state, Player.Listener listener) {
        listener.onMediaMetadataChanged(state.currentMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$40(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$41(State state, Player.Listener listener) {
        listener.onPlayerStateChanged(state.playWhenReady, state.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$42(State state, Player.Listener listener) {
        listener.onPlaybackStateChanged(state.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$43(State state, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(state.playWhenReady, state.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$44(State state, Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$45(State state, Player.Listener listener) {
        listener.onIsPlayingChanged(isPlaying(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$46(State state, Player.Listener listener) {
        listener.onPlaybackParametersChanged(state.playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$47(State state, Player.Listener listener) {
        listener.onRepeatModeChanged(state.repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$48(State state, Player.Listener listener) {
        listener.onShuffleModeEnabledChanged(state.shuffleModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$49(State state, Player.Listener listener) {
        listener.onSeekBackIncrementChanged(state.seekBackIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$50(State state, Player.Listener listener) {
        listener.onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$51(State state, Player.Listener listener) {
        listener.onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$52(State state, Player.Listener listener) {
        listener.onAudioAttributesChanged(state.audioAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$53(State state, Player.Listener listener) {
        listener.onVideoSizeChanged(state.videoSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$54(State state, Player.Listener listener) {
        listener.onDeviceInfoChanged(state.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$55(State state, Player.Listener listener) {
        listener.onPlaylistMetadataChanged(state.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$56(State state, Player.Listener listener) {
        listener.onSurfaceSizeChanged(state.surfaceSize.getWidth(), state.surfaceSize.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$57(State state, Player.Listener listener) {
        listener.onVolumeChanged(state.volume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$58(State state, Player.Listener listener) {
        listener.onDeviceVolumeChanged(state.deviceVolume, state.isDeviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$59(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$60(State state, Player.Listener listener) {
        listener.onMetadata(state.timedMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$61(State state, Player.Listener listener) {
        listener.onAvailableCommandsChanged(state.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$62(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) {
        Util.castNonNull(this.state);
        this.pendingOperations.remove(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    @RequiresNonNull({"state"})
    private void setMediaItemsInternal(final List<MediaItem> list, final int i, final long j) {
        Assertions.checkArgument(i == -1 || i >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i, j), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    return this.f2259O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$setMediaItemsInternal$2(list, state, i, j);
                }
            });
        }
    }

    @RequiresNonNull({"state"})
    private boolean shouldHandleCommand(int i) {
        return !this.released && this.state.availableCommands.contains(i);
    }

    @RequiresNonNull({"state"})
    private void updateStateAndInformListeners(final State state, boolean z, boolean z2) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z3 = state2.playWhenReady != state.playWhenReady;
        boolean z4 = state2.playbackState != state.playbackState;
        int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z, this.window, this.period);
        boolean zEquals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z2, this.window);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.timeline, state.timeline, this.window);
            final int i = 1;
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.common.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i) {
                        case 0:
                            ((Player.Listener) obj).onMediaItemTransition((MediaItem) state, timelineChangeReason);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$32((SimpleBasePlayer.State) state, timelineChangeReason, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            this.listeners.queueEvent(11, new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(getPositionInfo(state2, false, this.window, this.period), getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period), positionDiscontinuityReason));
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem;
            final int i2 = 0;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.common.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            ((Player.Listener) obj).onMediaItemTransition((MediaItem) mediaItem, mediaItemTransitionReason);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$32((SimpleBasePlayer.State) mediaItem, mediaItemTransitionReason, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!Objects.equals(state2.playerError, state.playerError)) {
            final int i3 = 14;
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i3) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
            if (state.playerError != null) {
                final int i4 = 15;
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        switch (i4) {
                            case 0:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                                break;
                            case 1:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                                break;
                            case 2:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                                break;
                            case 3:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                                break;
                            case 4:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                                break;
                            case 5:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                                break;
                            case 6:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                                break;
                            case 7:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                                break;
                            case 8:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                                break;
                            case 9:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                                break;
                            case 10:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                                break;
                            case 11:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                                break;
                            case 12:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                                break;
                            case 13:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                                break;
                            case 14:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                                break;
                            case 15:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                                break;
                            case 16:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                                break;
                            case 17:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                                break;
                            case 18:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                                break;
                            case 19:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                                break;
                            case 20:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                                break;
                            case 21:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                                break;
                            case 22:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                                break;
                            case 23:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                                break;
                            case 24:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                                break;
                            case 25:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                                break;
                            default:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                                break;
                        }
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            final int i5 = 16;
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
            final int i6 = 17;
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i6) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            final int i7 = 18;
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i7) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            final int i8 = 19;
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i8) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z3 || z4) {
            final int i9 = 20;
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i9) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z4) {
            final int i10 = 21;
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z3 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            final int i11 = 22;
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            final int i12 = 23;
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            final int i13 = 24;
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i13) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            final int i14 = 25;
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            final int i15 = 26;
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            final int i16 = 0;
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            final int i17 = 1;
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i17) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            final int i18 = 2;
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i18) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            final int i19 = 3;
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i19) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            final int i20 = 4;
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i20) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            final int i21 = 5;
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i21) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            final int i22 = 6;
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i22) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            final int i23 = 7;
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i23) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(9));
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            final int i24 = 8;
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i24) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.volume != state.volume) {
            final int i25 = 9;
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i25) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            final int i26 = 10;
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i26) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            final int i27 = 11;
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i27) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C.TIME_UNSET) {
            final int i28 = 12;
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i28) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            final int i29 = 13;
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.common.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    switch (i29) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state, (Player.Listener) obj);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state, (Player.Listener) obj);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state, (Player.Listener) obj);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state, (Player.Listener) obj);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state, (Player.Listener) obj);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state, (Player.Listener) obj);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state, (Player.Listener) obj);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state, (Player.Listener) obj);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state, (Player.Listener) obj);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state, (Player.Listener) obj);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (Player.Listener) obj);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state, (Player.Listener) obj);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state, (Player.Listener) obj);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$35(state, (Player.Listener) obj);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$36(state, (Player.Listener) obj);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state, (Player.Listener) obj);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state, (Player.Listener) obj);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (Player.Listener) obj);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state, (Player.Listener) obj);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state, (Player.Listener) obj);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state, (Player.Listener) obj);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state, (Player.Listener) obj);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state, (Player.Listener) obj);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state, (Player.Listener) obj);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state, (Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        this.listeners.flushEvents();
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        updateStateForPendingOperation(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, false, false);
    }

    @EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i, windowCount);
        updateStateForPendingOperation(handleAddMediaItems(iMin, list), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
            @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
            public final Object get() {
                return this.f2267O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$addMediaItems$3(state, list, iMin);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(@Nullable TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 2));
        }
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get()) : getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
        Timeline.Period period = this.period;
        State state = this.state;
        return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    @ForOverride
    public MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @ForOverride
    public State getPlaceholderState(State state) {
        return state;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @ForOverride
    public abstract State getState();

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleAddMediaItems(int i, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleClearVideoOutput(@Nullable Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleDecreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleIncreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleMoveMediaItems(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleRemoveMediaItems(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleReplaceMediaItems(int i, int i2, List<MediaItem> list) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000HandleAddMediaItems = handleAddMediaItems(i2, list);
        return i == i2 ? o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000HandleAddMediaItems : Util.transformFutureAsync(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000HandleAddMediaItems, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(handleRemoveMediaItems(i, i2), 5));
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSeek(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetDeviceMuted(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetDeviceVolume(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetMediaItems(List<MediaItem> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlayWhenReady(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetRepeatMode(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetShuffleModeEnabled(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleSetVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @ForOverride
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 5));
        }
    }

    public final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount) {
            return;
        }
        final int iMin = Math.min(i2, windowCount);
        final int iMin2 = Math.min(i3, windowCount - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        updateStateForPendingOperation(handleMoveMediaItems(i, iMin, iMin2), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
            @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
            public final Object get() {
                return this.f2273O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$moveMediaItems$4(state, i, iMin, iMin2);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 6));
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 3));
            this.released = true;
            this.listeners.release();
            this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getContentPositionMsInternal(state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i, int i2) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i2 >= i);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount || i == (iMin = Math.min(i2, windowCount))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i, iMin), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
            @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
            public final Object get() {
                return this.f2283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$removeMediaItems$6(state, i, iMin);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i, int i2, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i <= i2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || i > windowCount) {
            return;
        }
        final int iMin = Math.min(i2, windowCount);
        updateStateForPendingOperation(handleReplaceMediaItems(i, iMin, list), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000OOoOOO00O00o0ooooooooO000ooooO0000
            @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
            public final Object get() {
                return this.f2254O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$replaceMediaItems$5(state, list, iMin, i);
            }
        });
    }

    @Override // androidx.media3.common.BasePlayer
    public final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i == -1 || i >= 0);
        final State state = this.state;
        if (shouldHandleCommand(i2)) {
            boolean z2 = i == -1 || isPlayingAd() || (!state.timeline.isEmpty() && i >= state.timeline.getWindowCount());
            final boolean z3 = z2;
            updateStateForPendingOperation(handleSeek(i, j, i2), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    return this.f2278O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$seekTo$10(z3, state, i, j);
                }
            }, !z2, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, audioAttributes, 4));
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, 1), new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(state, z, 2));
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, 1), new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(state, i, 0));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.state.currentMediaItemIndex, z ? C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(state, z, 0));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, playbackParameters, 6));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, mediaMetadata, 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i), new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(state, i, 2));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z), new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(state, z, 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, trackSelectionParameters, 7));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(@Nullable Surface surface) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 0));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, surfaceHolder, 2));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, surfaceView, 3));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(textureView), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(state, textureView.isAvailable() ? new Size(textureView.getWidth(), textureView.getHeight()) : Size.ZERO, 0));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f), new com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() { // from class: androidx.media3.common.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
                @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
                public final Object get() {
                    return SimpleBasePlayer.lambda$setVolume$16(state, f);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, state));
        }
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    public SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 4));
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, boolean z, boolean z2) {
        if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z, z2);
            return;
        }
        this.pendingOperations.add(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
        updateStateAndInformListeners(getPlaceholderState((State) o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.get()), z, z2);
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.addListener(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, 10), new Executor() { // from class: androidx.media3.common.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f2266O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(@Nullable Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            State state = this.state;
            int i2 = state.currentMediaItemIndex;
            long j2 = state.contentPositionMsSupplier.get();
            i = i2;
            j = j2;
        }
        setMediaItemsInternal(list, i, j);
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 7));
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(state, 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(boolean z, int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, i), new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(state, z, 3));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(int i, int i2) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, i2), new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(state, i, 1));
        }
    }
}
