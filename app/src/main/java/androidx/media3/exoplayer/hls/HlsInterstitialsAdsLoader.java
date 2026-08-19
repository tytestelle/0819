package androidx.media3.exoplayer.hls;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsInterstitialsAdsLoader implements AdsLoader {
    private static final String TAG = "HlsInterstitiaAdsLoader";
    private final Map<Object, AdPlaybackState> activeAdPlaybackStates;
    private final Map<Object, AdsLoader.EventListener> activeEventListeners;
    private final DataSource.Factory dataSourceFactory;
    private final Map<Object, Set<String>> insertedInterstitialIds;
    private boolean isReleased;
    private final List<Listener> listeners;

    @Nullable
    private Loader loader;

    @Nullable
    private PlayerMessage pendingAssetListResolutionMessage;

    @Nullable
    private ExoPlayer player;
    private final PlayerListener playerListener;
    private final Map<Object, AdPlaybackState> resumptionStates;
    private final Map<Object, TreeMap<Long, AssetListData>> unresolvedAssetLists;
    private final Set<Object> unsupportedAdsIds;

    public static final class AdsMediaSourceFactory implements MediaSource.Factory {
        private final AdViewProvider adViewProvider;
        private final HlsInterstitialsAdsLoader adsLoader;
        private final MediaSource.Factory mediaSourceFactory;

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, Context context) {
            this(hlsInterstitialsAdsLoader, context, null, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            MediaSource mediaSourceCreateMediaSource = this.mediaSourceFactory.createMediaSource(mediaItem);
            MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
            if (adsConfiguration == null) {
                return mediaSourceCreateMediaSource;
            }
            if (adsConfiguration.adsId instanceof String) {
                return new AdsMediaSource(mediaSourceCreateMediaSource, new DataSpec(mediaItem.localConfiguration.adsConfiguration.adTagUri), Assertions.checkNotNull(mediaItem.localConfiguration.adsConfiguration.adsId), this.mediaSourceFactory, this.adsLoader, this.adViewProvider, false);
            }
            throw new IllegalArgumentException("Please use an AdsConfiguration with an adsId of type String when using HlsInterstitialsAdsLoader");
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return androidx.media3.exoplayer.source.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return androidx.media3.exoplayer.source.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return androidx.media3.exoplayer.source.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return androidx.media3.exoplayer.source.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
        }

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, MediaSource.Factory factory) {
            this(hlsInterstitialsAdsLoader, null, factory, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public AdsMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public AdsMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        private AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, @Nullable Context context, @Nullable MediaSource.Factory factory, AdViewProvider adViewProvider) {
            boolean z = true;
            Assertions.checkArgument((context == null && factory == null) ? false : true);
            this.adsLoader = hlsInterstitialsAdsLoader;
            factory = factory == null ? new HlsMediaSource.Factory(new DefaultDataSource.Factory((Context) Assertions.checkNotNull(context))) : factory;
            this.mediaSourceFactory = factory;
            this.adViewProvider = adViewProvider;
            int[] supportedTypes = factory.getSupportedTypes();
            for (int i : supportedTypes) {
                if (i == 2) {
                    Assertions.checkState(z);
                }
            }
            z = false;
            Assertions.checkState(z);
        }
    }

    public static class AdsResumptionState {
        private static final String FIELD_ADS_ID = Util.intToStringMaxRadix(0);
        private static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(1);
        private final AdPlaybackState adPlaybackState;
        public final String adsId;

        public AdsResumptionState(String str, AdPlaybackState adPlaybackState) {
            Assertions.checkArgument(str.equals(adPlaybackState.adsId));
            this.adsId = str;
            this.adPlaybackState = adPlaybackState;
        }

        public static AdsResumptionState fromBundle(Bundle bundle) {
            String str = (String) Assertions.checkNotNull(bundle.getString(FIELD_ADS_ID));
            return new AdsResumptionState(str, AdPlaybackState.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_AD_PLAYBACK_STATE))).withAdsId(str));
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof AdsResumptionState)) {
                return false;
            }
            AdsResumptionState adsResumptionState = (AdsResumptionState) obj;
            return Objects.equals(this.adsId, adsResumptionState.adsId) && Objects.equals(this.adPlaybackState, adsResumptionState.adPlaybackState);
        }

        public int hashCode() {
            return Objects.hash(this.adsId, this.adPlaybackState);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_ADS_ID, this.adsId);
            bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle());
            return bundle;
        }
    }

    public static final class Asset {
        public final long durationUs;
        public final Uri uri;

        public Asset(Uri uri, long j) {
            this.uri = uri;
            this.durationUs = j;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj;
            return this.durationUs == asset.durationUs && Objects.equals(this.uri, asset.uri);
        }

        public int hashCode() {
            return Objects.hash(this.uri, Long.valueOf(this.durationUs));
        }
    }

    public static final class AssetList {
        static final AssetList EMPTY = new AssetList(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O assets;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O stringAttributes;

        public AssetList(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O2) {
            this.assets = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
            this.stringAttributes = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetList)) {
                return false;
            }
            AssetList assetList = (AssetList) obj;
            return Objects.equals(this.assets, assetList.assets) && Objects.equals(this.stringAttributes, assetList.stringAttributes);
        }

        public int hashCode() {
            return Objects.hash(this.assets, this.stringAttributes);
        }
    }

    public static class AssetListData {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Object adsId;
        private final HlsMediaPlaylist.Interstitial interstitial;
        private final MediaItem mediaItem;
        private final long targetDurationUs;

        public AssetListData(MediaItem mediaItem, Object obj, HlsMediaPlaylist.Interstitial interstitial, int i, int i2, long j) {
            Assertions.checkArgument(interstitial.assetListUri != null);
            this.mediaItem = mediaItem;
            this.adsId = obj;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
            this.targetDurationUs = j;
            this.interstitial = interstitial;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof AssetListData)) {
                return false;
            }
            AssetListData assetListData = (AssetListData) obj;
            return this.adGroupIndex == assetListData.adGroupIndex && this.adIndexInAdGroup == assetListData.adIndexInAdGroup && this.targetDurationUs == assetListData.targetDurationUs && Objects.equals(this.mediaItem, assetListData.mediaItem) && Objects.equals(this.adsId, assetListData.adsId) && Objects.equals(this.interstitial, assetListData.interstitial);
        }

        public int hashCode() {
            return (int) ((((long) (((((this.interstitial.hashCode() + ((this.adsId.hashCode() + (this.mediaItem.hashCode() * 31)) * 31)) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup)) * 31) + this.targetDurationUs);
        }
    }

    public interface Listener {
        void onAdCompleted(MediaItem mediaItem, Object obj, int i, int i2);

        void onAssetListLoadCompleted(MediaItem mediaItem, Object obj, int i, int i2, AssetList assetList);

        void onAssetListLoadFailed(MediaItem mediaItem, Object obj, int i, int i2, @Nullable IOException iOException, boolean z);

        void onAssetListLoadStarted(MediaItem mediaItem, Object obj, int i, int i2);

        void onContentTimelineChanged(MediaItem mediaItem, Object obj, Timeline timeline);

        void onMetadata(MediaItem mediaItem, Object obj, int i, int i2, Metadata metadata);

        void onPrepareCompleted(MediaItem mediaItem, Object obj, int i, int i2);

        void onPrepareError(MediaItem mediaItem, Object obj, int i, int i2, IOException iOException);

        void onStart(MediaItem mediaItem, Object obj, AdViewProvider adViewProvider);

        void onStop(MediaItem mediaItem, Object obj, AdPlaybackState adPlaybackState);
    }

    public class LoaderCallback implements Loader.Callback<ParsingLoadable<AssetList>> {
        private final AssetListData assetListData;

        public LoaderCallback(AssetListData assetListData) {
            this.assetListData = assetListData;
        }

        private void handleAssetResolutionFailed(@Nullable final IOException iOException, final boolean z) {
            HlsInterstitialsAdsLoader.this.notifyAssetResolutionFailed(this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup);
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f2562O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$handleAssetResolutionFailed$1(iOException, z, (HlsInterstitialsAdsLoader.Listener) obj);
                }
            });
            maybeContinueAssetResolution();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleAssetResolutionFailed$1(IOException iOException, boolean z, Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$0(AssetList assetList, Listener listener) {
            listener.onAssetListLoadCompleted(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, assetList);
        }

        private void maybeContinueAssetResolution() {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || exoPlayer.getPlaybackState() == 1 || !this.assetListData.mediaItem.equals(exoPlayer.getCurrentMediaItem())) {
                return;
            }
            long jMsToUs = Util.msToUs(exoPlayer.getContentPosition());
            Timeline currentTimeline = exoPlayer.getCurrentTimeline();
            long unresolvedAssetListWindowPositionForContentPositionUs = HlsInterstitialsAdsLoader.this.getUnresolvedAssetListWindowPositionForContentPositionUs(jMsToUs, currentTimeline, exoPlayer.getCurrentPeriodIndex());
            HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader = HlsInterstitialsAdsLoader.this;
            Object obj = this.assetListData.adsId;
            int currentMediaItemIndex = exoPlayer.getCurrentMediaItemIndex();
            if (unresolvedAssetListWindowPositionForContentPositionUs != C.TIME_UNSET) {
                jMsToUs = unresolvedAssetListWindowPositionForContentPositionUs;
            }
            hlsInterstitialsAdsLoader.maybeExecuteOrSetNextAssetListResolutionMessage(obj, currentTimeline, currentMediaItemIndex, jMsToUs);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final /* synthetic */ void onLoadStarted(Loader.Loadable loadable, long j, long j2, int i) {
            androidx.media3.exoplayer.upstream.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, loadable, j, j2, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<AssetList> parsingLoadable, long j, long j2, boolean z) {
            handleAssetResolutionFailed(null, true);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<AssetList> parsingLoadable, long j, long j2) {
            AssetList result = parsingLoadable.getResult();
            AdPlaybackState adPlaybackStateWithAvailableAdMediaItem = (AdPlaybackState) HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.get(this.assetListData.adsId);
            if (adPlaybackStateWithAvailableAdMediaItem == null || result == null || result.assets.isEmpty()) {
                if (adPlaybackStateWithAvailableAdMediaItem != null) {
                    handleAssetResolutionFailed(new IOException("empty asset list"), false);
                    return;
                }
                return;
            }
            AdPlaybackState.AdGroup adGroup = adPlaybackStateWithAvailableAdMediaItem.getAdGroup(this.assetListData.adGroupIndex);
            long j3 = 0;
            long j4 = adGroup.durationsUs[this.assetListData.adIndexInAdGroup] != C.TIME_UNSET ? adGroup.durationsUs[this.assetListData.adIndexInAdGroup] : 0L;
            int i = adGroup.count;
            if (result.assets.size() > 1) {
                adPlaybackStateWithAvailableAdMediaItem = adPlaybackStateWithAvailableAdMediaItem.withAdCount(this.assetListData.adGroupIndex, (result.assets.size() + i) - 1);
                adGroup = adPlaybackStateWithAvailableAdMediaItem.getAdGroup(this.assetListData.adGroupIndex);
            }
            int i2 = this.assetListData.adIndexInAdGroup;
            long[] jArr = (long[]) adGroup.durationsUs.clone();
            for (int i3 = 0; i3 < result.assets.size(); i3++) {
                Asset asset = (Asset) result.assets.get(i3);
                if (i3 > 0) {
                    i2 = (i + i3) - 1;
                }
                long j5 = asset.durationUs;
                jArr[i2] = j5;
                j3 += j5;
                adPlaybackStateWithAvailableAdMediaItem = adPlaybackStateWithAvailableAdMediaItem.withAvailableAdMediaItem(this.assetListData.adGroupIndex, i2, new MediaItem.Builder().setUri(asset.uri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
            }
            AdPlaybackState adPlaybackStateWithAdDurationsUs = adPlaybackStateWithAvailableAdMediaItem.withAdDurationsUs(this.assetListData.adGroupIndex, jArr);
            if (this.assetListData.interstitial.resumeOffsetUs == C.TIME_UNSET) {
                adPlaybackStateWithAdDurationsUs = adPlaybackStateWithAdDurationsUs.withContentResumeOffsetUs(this.assetListData.adGroupIndex, (adPlaybackStateWithAdDurationsUs.getAdGroup(this.assetListData.adGroupIndex).contentResumeOffsetUs - j4) + j3);
            }
            HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(this.assetListData.adsId, adPlaybackStateWithAdDurationsUs);
            HlsInterstitialsAdsLoader.this.notifyListeners(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, result, 0));
            maybeContinueAssetResolution();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<AssetList> parsingLoadable, long j, long j2, IOException iOException, int i) {
            handleAssetResolutionFailed(iOException, false);
            return Loader.DONT_RETRY;
        }
    }

    public class PlayerListener implements Player.Listener {
        private final Timeline.Period period;

        private PlayerListener() {
            this.period = new Timeline.Period();
        }

        private void markAdAsPlayedAndNotifyListeners(MediaItem mediaItem, Object obj, int i, int i2) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.get(obj);
            if (adPlaybackState == null || adPlaybackState.getAdGroup(i).states[i2] != 1) {
                return;
            }
            HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withPlayedAd(i, i2));
            HlsInterstitialsAdsLoader.this.notifyListeners(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, mediaItem, obj, i2, 0));
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(CueGroup cueGroup) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, i, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onEvents(Player player, Player.Events events) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, player, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || !exoPlayer.isPlayingAd()) {
                return;
            }
            exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
            Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                return;
            }
            MediaItem mediaItem = (MediaItem) Assertions.checkNotNull(exoPlayer.getCurrentMediaItem());
            HlsInterstitialsAdsLoader.this.notifyListeners(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(exoPlayer.getCurrentAdGroupIndex(), mediaItem, exoPlayer.getCurrentAdIndexInAdGroup(), obj, 0, metadata));
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (i == 4 && exoPlayer != null && exoPlayer.isPlayingAd()) {
                exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
                Object obj = this.period.adPlaybackState.adsId;
                if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                    return;
                }
                markAdAsPlayedAndNotifyListeners((MediaItem) Assertions.checkNotNull(exoPlayer.getCurrentMediaItem()), obj, exoPlayer.getCurrentAdGroupIndex(), exoPlayer.getCurrentAdIndexInAdGroup());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onRenderedFirstFrame() {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(this);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int i) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(this, i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i) {
            if (timeline.isEmpty()) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this, trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onTracksChanged(Tracks tracks) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(this, tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(this, videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float f) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(this, f);
        }

        @Override // androidx.media3.common.Player.Listener
        public final /* synthetic */ void onCues(List list) {
            androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            if (HlsInterstitialsAdsLoader.this.player == null || positionInfo.mediaItem == null || positionInfo2.mediaItem == null || i == 4) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            Timeline currentTimeline = HlsInterstitialsAdsLoader.this.player.getCurrentTimeline();
            Object obj = currentTimeline.getPeriod(positionInfo2.periodIndex, this.period).adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            if ((i == 0 || i == 3) && positionInfo.adGroupIndex != -1) {
                currentTimeline.getPeriod(positionInfo.periodIndex, this.period);
                markAdAsPlayedAndNotifyListeners(positionInfo.mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
            } else if (i == 1 || i == 2) {
                long jMsToUs = Util.msToUs(positionInfo2.contentPositionMs);
                long unresolvedAssetListWindowPositionForContentPositionUs = HlsInterstitialsAdsLoader.this.getUnresolvedAssetListWindowPositionForContentPositionUs(jMsToUs, currentTimeline, positionInfo2.periodIndex);
                HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(obj, currentTimeline, positionInfo2.mediaItemIndex, unresolvedAssetListWindowPositionForContentPositionUs != C.TIME_UNSET ? unresolvedAssetListWindowPositionForContentPositionUs : jMsToUs);
            }
        }
    }

    public static class RunnableAtPosition implements Runnable {
        public final long adStartTimeUs;
        private final Runnable runnable;
        private final long targetDurationUs;

        public RunnableAtPosition(long j, long j2, Runnable runnable) {
            this.adStartTimeUs = j;
            this.targetDurationUs = j2;
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runnable.run();
        }
    }

    public static final class StringAttribute {
        public final String name;
        public final String value;

        public StringAttribute(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringAttribute)) {
                return false;
            }
            StringAttribute stringAttribute = (StringAttribute) obj;
            return Objects.equals(this.name, stringAttribute.name) && Objects.equals(this.value, stringAttribute.value);
        }

        public int hashCode() {
            return Objects.hash(this.name, this.value);
        }
    }

    public HlsInterstitialsAdsLoader(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelPendingAssetListResolutionMessage() {
        PlayerMessage playerMessage = this.pendingAssetListResolutionMessage;
        if (playerMessage != null) {
            playerMessage.cancel();
            this.pendingAssetListResolutionMessage = null;
        }
    }

    private static long getClosestSegmentBoundaryUs(long j, HlsMediaPlaylist hlsMediaPlaylist) {
        long j2;
        long j3;
        long j4 = j - hlsMediaPlaylist.startTimeUs;
        if (j4 <= 0 || hlsMediaPlaylist.segments.isEmpty()) {
            return hlsMediaPlaylist.startTimeUs;
        }
        long j5 = hlsMediaPlaylist.durationUs;
        if (j4 >= j5) {
            return hlsMediaPlaylist.startTimeUs + j5;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get((int) Math.min(j4 / hlsMediaPlaylist.targetDurationUs, hlsMediaPlaylist.segments.size() - 1));
        long j6 = segment.relativeStartTimeUs;
        if (j4 - j6 < Math.abs(j4 - (j6 + segment.durationUs))) {
            j2 = hlsMediaPlaylist.startTimeUs;
            j3 = segment.relativeStartTimeUs;
        } else {
            j2 = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
            j3 = segment.durationUs;
        }
        return j2 + j3;
    }

    private Loader getLoader() {
        if (this.loader == null) {
            this.loader = new Loader("HLS-interstitials");
        }
        return this.loader;
    }

    private static int getLowestValidAdGroupInsertionIndex(AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount;
        while (true) {
            i--;
            int i2 = adPlaybackState.removedAdGroupCount;
            if (i < i2) {
                return i2;
            }
            for (int i3 : adPlaybackState.getAdGroup(i).states) {
                if (i3 != 0) {
                    return i + 1;
                }
            }
        }
    }

    @Nullable
    private RunnableAtPosition getNextAssetResolution(Object obj, long j) {
        final TreeMap treeMap = (TreeMap) Assertions.checkNotNull(this.unresolvedAssetLists.get(obj));
        for (final Long l : treeMap.keySet()) {
            if (treeMap.size() == 1 || j <= l.longValue()) {
                final AssetListData assetListData = (AssetListData) Assertions.checkNotNull((AssetListData) treeMap.get(l));
                return new RunnableAtPosition(l.longValue(), assetListData.targetDurationUs, new Runnable() { // from class: androidx.media3.exoplayer.hls.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
                    @Override // java.lang.Runnable
                    public final void run() {
                        Long l2 = l;
                        this.f2557O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$getNextAssetResolution$7(treeMap, l2, assetListData);
                    }
                });
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUnresolvedAssetListWindowPositionForContentPositionUs(long j, Timeline timeline, int i) {
        Timeline.Period period = timeline.getPeriod(i, new Timeline.Period());
        long j2 = j - period.positionInWindowUs;
        AdPlaybackState adPlaybackState = period.adPlaybackState;
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(j2, C.TIME_UNSET);
        if (adGroupIndexForPositionUs != -1) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
            TreeMap<Long, AssetListData> treeMap = this.unresolvedAssetLists.get(adPlaybackState.adsId);
            if (treeMap != null && treeMap.containsKey(Long.valueOf(adGroup.timeUs))) {
                return adGroup.timeUs - timeline.getWindow(period.windowIndex, new Timeline.Window()).positionInFirstPeriodUs;
            }
        }
        return C.TIME_UNSET;
    }

    private AdPlaybackState insertOrUpdateInterstitialInAdGroup(MediaItem mediaItem, HlsMediaPlaylist.Interstitial interstitial, AdPlaybackState adPlaybackState, int i, long j) {
        long[] jArr;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
        if (adGroup.getIndexOfAdId(interstitial.id) != -1) {
            return adPlaybackState;
        }
        int iMax = Math.max(adGroup.count, 0);
        long jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, C.TIME_UNSET);
        if (iMax == 0) {
            jArr = new long[1];
        } else {
            long[] jArr2 = adGroup.durationsUs;
            long[] jArr3 = new long[jArr2.length + 1];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        jArr[jArr.length - 1] = jResolveInterstitialDurationUs;
        long j2 = interstitial.resumeOffsetUs;
        if (j2 != C.TIME_UNSET) {
            jResolveInterstitialDurationUs = j2;
        } else if (jResolveInterstitialDurationUs == C.TIME_UNSET) {
            jResolveInterstitialDurationUs = 0;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withAdCount(i, iMax + 1).withAdId(i, iMax, interstitial.id).withAdDurationsUs(i, jArr).withContentResumeOffsetUs(i, adGroup.contentResumeOffsetUs + jResolveInterstitialDurationUs);
        if (interstitial.assetUri != null) {
            return adPlaybackStateWithContentResumeOffsetUs.withAvailableAdMediaItem(i, iMax, new MediaItem.Builder().setUri(interstitial.assetUri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
        }
        Object objCheckNotNull = Assertions.checkNotNull(adPlaybackStateWithContentResumeOffsetUs.adsId);
        TreeMap treeMap = (TreeMap) Assertions.checkNotNull(this.unresolvedAssetLists.get(objCheckNotNull));
        long j3 = adGroup.timeUs;
        if (j3 == Long.MIN_VALUE) {
            j3 = Long.MAX_VALUE;
        }
        treeMap.put(Long.valueOf(j3), new AssetListData(mediaItem, objCheckNotNull, interstitial, i, iMax, j));
        return adPlaybackStateWithContentResumeOffsetUs;
    }

    private static boolean isHlsMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        return Objects.equals(localConfiguration.mimeType, MimeTypes.APPLICATION_M3U8) || Util.inferContentType(localConfiguration.uri) == 2;
    }

    private static boolean isLiveMediaItem(MediaItem mediaItem, Timeline timeline) {
        int firstWindowIndex = timeline.getFirstWindowIndex(false);
        Timeline.Window window = new Timeline.Window();
        while (firstWindowIndex != -1) {
            timeline.getWindow(firstWindowIndex, window);
            if (window.mediaItem.equals(mediaItem)) {
                return window.isLive();
            }
            firstWindowIndex = timeline.getNextWindowIndex(firstWindowIndex, 0, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNextAssetResolution$7(TreeMap treeMap, Long l, AssetListData assetListData) {
        if (treeMap.remove(l) != null) {
            startLoadingAssetList(assetListData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleContentTimelineChanged$1(AdsMediaSource adsMediaSource, Object obj, Timeline timeline, Listener listener) {
        listener.onContentTimelineChanged(adsMediaSource.getMediaItem(), obj, timeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareComplete$2(AdsMediaSource adsMediaSource, Object obj, int i, int i2, Listener listener) {
        listener.onPrepareCompleted(adsMediaSource.getMediaItem(), obj, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareError$3(AdsMediaSource adsMediaSource, Object obj, int i, int i2, IOException iOException, Listener listener) {
        listener.onPrepareError(adsMediaSource.getMediaItem(), obj, i, i2, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startLoadingAssetList$5(AssetListData assetListData, Listener listener) {
        listener.onAssetListLoadStarted(assetListData.mediaItem, assetListData.adsId, assetListData.adGroupIndex, assetListData.adIndexInAdGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stop$4(AdsMediaSource adsMediaSource, AdPlaybackState adPlaybackState, Listener listener) {
        listener.onStop(adsMediaSource.getMediaItem(), adsMediaSource.getAdsId(), (AdPlaybackState) Assertions.checkNotNull(adPlaybackState));
    }

    private AdPlaybackState mapInterstitialsForLive(MediaItem mediaItem, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, long j, Set<String> set) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList(hlsMediaPlaylist.interstitials);
        AdPlaybackState adPlaybackStateInsertOrUpdateInterstitialInAdGroup = adPlaybackState;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) arrayList.get(i2);
            if (!set.contains(interstitial.id) && !interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
                long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist) - hlsMediaPlaylist.startTimeUs;
                if (jResolveInterstitialStartTimeUs >= 0) {
                    if ((hlsMediaPlaylist.targetDurationUs * 3) + hlsMediaPlaylist.durationUs >= jResolveInterstitialStartTimeUs) {
                        long j2 = j + jResolveInterstitialStartTimeUs;
                        int i3 = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.adGroupCount;
                        int i4 = i3 - 1;
                        int i5 = i3 - 2;
                        while (true) {
                            int i6 = i4;
                            i4 = i5;
                            z = true;
                            if (i4 < adPlaybackStateInsertOrUpdateInterstitialInAdGroup.removedAdGroupCount) {
                                i = i6;
                                break;
                            }
                            long j3 = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.getAdGroup(i4).timeUs;
                            if (j3 == j2) {
                                i = i4;
                                z = false;
                                break;
                            }
                            if (j3 < j2) {
                                i = i4 + 1;
                                break;
                            }
                            i5 = i4 - 1;
                        }
                        if (!z) {
                            adPlaybackStateInsertOrUpdateInterstitialInAdGroup = insertOrUpdateInterstitialInAdGroup(mediaItem, interstitial, adPlaybackStateInsertOrUpdateInterstitialInAdGroup, i, hlsMediaPlaylist.targetDurationUs);
                            set.add(interstitial.id);
                        } else if (i < getLowestValidAdGroupInsertionIndex(adPlaybackStateInsertOrUpdateInterstitialInAdGroup)) {
                            Log.w(TAG, "Skipping insertion of interstitial attempted to be inserted behind an already initialized ad group.");
                        } else {
                            adPlaybackStateInsertOrUpdateInterstitialInAdGroup = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.withNewAdGroup(i, j2);
                            adPlaybackStateInsertOrUpdateInterstitialInAdGroup = insertOrUpdateInterstitialInAdGroup(mediaItem, interstitial, adPlaybackStateInsertOrUpdateInterstitialInAdGroup, i, hlsMediaPlaylist.targetDurationUs);
                            set.add(interstitial.id);
                        }
                    }
                }
            }
        }
        return adPlaybackStateInsertOrUpdateInterstitialInAdGroup;
    }

    private AdPlaybackState mapInterstitialsForVod(Timeline.Window window, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, Set<String> set) {
        AdPlaybackState adPlaybackStateWithNewAdGroup = adPlaybackState;
        int i = 0;
        Assertions.checkArgument(adPlaybackStateWithNewAdGroup.adGroupCount == adPlaybackStateWithNewAdGroup.removedAdGroupCount);
        long j = hlsMediaPlaylist.startTimeUs + window.positionInFirstPeriodUs;
        long j2 = window.durationUs + j;
        for (O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = hlsMediaPlaylist.interstitials; i < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size(); o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i);
            long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist);
            if (jResolveInterstitialStartTimeUs < j && interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                jResolveInterstitialStartTimeUs = j;
            } else if (jResolveInterstitialStartTimeUs <= j2 || !interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
                if (jResolveInterstitialStartTimeUs < j || j2 < jResolveInterstitialStartTimeUs) {
                }
                i++;
            } else {
                jResolveInterstitialStartTimeUs = j2;
            }
            long j3 = j2 == jResolveInterstitialStartTimeUs ? Long.MIN_VALUE : jResolveInterstitialStartTimeUs - hlsMediaPlaylist.startTimeUs;
            int adGroupIndexForPositionUs = adPlaybackStateWithNewAdGroup.getAdGroupIndexForPositionUs(j3, hlsMediaPlaylist.durationUs);
            if (adGroupIndexForPositionUs == -1) {
                adGroupIndexForPositionUs = adPlaybackStateWithNewAdGroup.removedAdGroupCount;
                adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(adGroupIndexForPositionUs, j3);
            } else if (adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).timeUs != j3) {
                adGroupIndexForPositionUs++;
                adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(adGroupIndexForPositionUs, j3);
            }
            adPlaybackStateWithNewAdGroup = insertOrUpdateInterstitialInAdGroup(window.mediaItem, interstitial, adPlaybackStateWithNewAdGroup, adGroupIndexForPositionUs, hlsMediaPlaylist.targetDurationUs);
            set.add(interstitial.id);
            i++;
        }
        return adPlaybackStateWithNewAdGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeExecuteOrSetNextAssetListResolutionMessage(Object obj, Timeline timeline, int i, long j) {
        Loader loader = this.loader;
        if (loader == null || !loader.isLoading()) {
            cancelPendingAssetListResolutionMessage();
            Timeline.Window window = timeline.getWindow(i, new Timeline.Window());
            long j2 = window.positionInFirstPeriodUs + j;
            RunnableAtPosition nextAssetResolution = getNextAssetResolution(obj, j2);
            if (nextAssetResolution == null) {
                return;
            }
            long j3 = nextAssetResolution.adStartTimeUs;
            if (j3 == Long.MAX_VALUE) {
                j3 = window.durationUs;
            }
            long jMax = Math.max(j2, j3 - (nextAssetResolution.targetDurationUs * 3));
            if (jMax - j2 < 200000) {
                nextAssetResolution.run();
                return;
            }
            PlayerMessage position = ((ExoPlayer) Assertions.checkNotNull(this.player)).createMessage(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(nextAssetResolution)).setPayload(window.mediaItem).setLooper((Looper) Assertions.checkNotNull(Looper.myLooper())).setPosition(Util.usToMs(jMax - window.positionInFirstPeriodUs));
            this.pendingAssetListResolutionMessage = position;
            position.send();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAssetResolutionFailed(Object obj, int i, int i2) {
        AdPlaybackState adPlaybackState = this.activeAdPlaybackStates.get(obj);
        if (adPlaybackState == null) {
            return;
        }
        putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withAdLoadError(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners(Consumer<Listener> consumer) {
        for (int i = 0; i < this.listeners.size(); i++) {
            consumer.accept(this.listeners.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean putAndNotifyAdPlaybackStateUpdate(Object obj, AdPlaybackState adPlaybackState) {
        if (adPlaybackState.equals(this.activeAdPlaybackStates.put(obj, adPlaybackState))) {
            return false;
        }
        AdsLoader.EventListener eventListener = this.activeEventListeners.get(obj);
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
            return true;
        }
        this.activeAdPlaybackStates.remove(obj);
        this.insertedInterstitialIds.remove(obj);
        return false;
    }

    private static long resolveInterstitialDurationUs(HlsMediaPlaylist.Interstitial interstitial, long j) {
        long j2 = interstitial.playoutLimitUs;
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        long j3 = interstitial.durationUs;
        if (j3 != C.TIME_UNSET) {
            return j3;
        }
        long j4 = interstitial.endDateUnixUs;
        if (j4 != C.TIME_UNSET) {
            return j4 - interstitial.startDateUnixUs;
        }
        long j5 = interstitial.plannedDurationUs;
        return j5 != C.TIME_UNSET ? j5 : j;
    }

    private static long resolveInterstitialStartTimeUs(HlsMediaPlaylist.Interstitial interstitial, HlsMediaPlaylist hlsMediaPlaylist) {
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
            return hlsMediaPlaylist.startTimeUs;
        }
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            return hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        }
        if (interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT)) {
            return getClosestSegmentBoundaryUs(interstitial.startDateUnixUs, hlsMediaPlaylist);
        }
        if (!interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            return interstitial.startDateUnixUs;
        }
        long jResolveInterstitialDurationUs = interstitial.resumeOffsetUs;
        if (jResolveInterstitialDurationUs == C.TIME_UNSET) {
            jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, 0L);
        }
        return getClosestSegmentBoundaryUs(interstitial.startDateUnixUs + jResolveInterstitialDurationUs, hlsMediaPlaylist) - jResolveInterstitialDurationUs;
    }

    private void startLoadingAssetList(AssetListData assetListData) {
        cancelPendingAssetListResolutionMessage();
        getLoader().startLoading(new ParsingLoadable(this.dataSourceFactory.createDataSource(), (Uri) Assertions.checkNotNull(assetListData.interstitial.assetListUri), 6, new AssetListParser()), new LoaderCallback(assetListData), 1);
        notifyListeners(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(assetListData));
    }

    public void addAdResumptionState(AdsResumptionState adsResumptionState) {
        addAdResumptionState(adsResumptionState.adsId, adsResumptionState.adPlaybackState);
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearAllAdResumptionStates() {
        this.resumptionStates.clear();
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getAdsResumptionStates() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (AdPlaybackState adPlaybackState : this.activeAdPlaybackStates.values()) {
            boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
            if (zEndsWithLivePostrollPlaceHolder || !(adPlaybackState.adsId instanceof String)) {
                Log.i(TAG, zEndsWithLivePostrollPlaceHolder ? "getAdsResumptionStates(): ignoring active ad playback state of live stream. adsId=" + adPlaybackState.adsId : "getAdsResumptionStates(): ignoring active ad playback state when creating resumption states. `adsId` is not of type String: " + Util.castNonNull(adPlaybackState.adsId).getClass());
            } else {
                AdsResumptionState adsResumptionState = new AdsResumptionState((String) adPlaybackState.adsId, adPlaybackState.copy());
                int i2 = i + 1;
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArrCopyOf.length, i2);
                if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
                objArrCopyOf[i] = adsResumptionState;
                i = i2;
            }
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf, i);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public boolean handleContentTimelineChanged(AdsMediaSource adsMediaSource, Timeline timeline) {
        long jMsToUs;
        Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased) {
            AdsLoader.EventListener eventListenerRemove = this.activeEventListeners.remove(adsId);
            if (eventListenerRemove != null) {
                this.unsupportedAdsIds.remove(adsId);
                AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.remove(adsId));
                this.insertedInterstitialIds.remove(adsId);
                if (adPlaybackState.equals(AdPlaybackState.NONE)) {
                    eventListenerRemove.onAdPlaybackState(new AdPlaybackState(adsId, new long[0]));
                }
            }
            return false;
        }
        AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.get(adsId));
        AdPlaybackState adPlaybackState3 = AdPlaybackState.NONE;
        if (!adPlaybackState2.equals(adPlaybackState3) && !adPlaybackState2.endsWithLivePostrollPlaceHolder()) {
            return false;
        }
        if (adPlaybackState2.equals(adPlaybackState3)) {
            adPlaybackState2 = new AdPlaybackState(adsId, new long[0]);
            if (isLiveMediaItem(adsMediaSource.getMediaItem(), timeline)) {
                adPlaybackState2 = adPlaybackState2.withLivePostrollPlaceholderAppended(false);
            }
        }
        AdPlaybackState adPlaybackState4 = adPlaybackState2;
        Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
        Object obj = window.manifest;
        if (obj instanceof HlsManifest) {
            HlsMediaPlaylist hlsMediaPlaylist = ((HlsManifest) obj).mediaPlaylist;
            TreeMap treeMap = (TreeMap) Assertions.checkNotNull(this.unresolvedAssetLists.get(adsId));
            int size = treeMap.size();
            AdPlaybackState adPlaybackStateMapInterstitialsForLive = window.isLive() ? mapInterstitialsForLive(window.mediaItem, hlsMediaPlaylist, adPlaybackState4, window.positionInFirstPeriodUs, (Set) Assertions.checkNotNull(this.insertedInterstitialIds.get(adsId))) : mapInterstitialsForVod(window, hlsMediaPlaylist, adPlaybackState4, (Set) Assertions.checkNotNull(this.insertedInterstitialIds.get(adsId)));
            ExoPlayer exoPlayer = this.player;
            if (size != treeMap.size() && exoPlayer != null && Objects.equals(window.mediaItem, exoPlayer.getCurrentMediaItem())) {
                if (window.isLive()) {
                    jMsToUs = exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), new Timeline.Period()).isPlaceholder ? window.defaultPositionUs : Util.msToUs(exoPlayer.getContentPosition());
                } else {
                    jMsToUs = Util.msToUs(exoPlayer.getContentPosition());
                }
                int adGroupIndexForPositionUs = adPlaybackStateMapInterstitialsForLive.getAdGroupIndexForPositionUs(jMsToUs, window.durationUs);
                if (adGroupIndexForPositionUs != -1) {
                    jMsToUs = adPlaybackStateMapInterstitialsForLive.getAdGroup(adGroupIndexForPositionUs).timeUs;
                }
                maybeExecuteOrSetNextAssetListResolutionMessage(adsId, timeline, 0, jMsToUs);
            }
            adPlaybackState4 = adPlaybackStateMapInterstitialsForLive;
        }
        boolean zPutAndNotifyAdPlaybackStateUpdate = putAndNotifyAdPlaybackStateUpdate(adsId, adPlaybackState4);
        if (!this.unsupportedAdsIds.contains(adsId)) {
            notifyListeners(new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(adsMediaSource, 1, adsId, timeline));
        }
        return zPutAndNotifyAdPlaybackStateUpdate;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i2) {
        Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased || this.unsupportedAdsIds.contains(adsId)) {
            return;
        }
        notifyListeners(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, adsMediaSource, adsId, i2, 1));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException) {
        Object adsId = adsMediaSource.getAdsId();
        putAndNotifyAdPlaybackStateUpdate(adsId, ((AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.get(adsId))).withAdLoadError(i, i2));
        if (this.isReleased || this.unsupportedAdsIds.contains(adsId)) {
            return;
        }
        notifyListeners(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i, adsMediaSource, i2, adsId, 1, iOException));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        if (this.activeEventListeners.isEmpty()) {
            this.player = null;
        }
        clearAllAdResumptionStates();
        cancelPendingAssetListResolutionMessage();
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.isReleased = true;
    }

    public boolean removeAdResumptionState(Object obj) {
        return this.resumptionStates.remove(obj) != null;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(!this.isReleased);
        Assertions.checkArgument(player == null || (player instanceof ExoPlayer));
        if (Objects.equals(this.player, player)) {
            return;
        }
        if (this.player != null && !this.activeEventListeners.isEmpty()) {
            this.player.removeListener(this.playerListener);
        }
        if (player != null && !this.activeEventListeners.isEmpty()) {
            z = false;
        }
        Assertions.checkState(z);
        this.player = (ExoPlayer) player;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(int... iArr) {
        for (int i : iArr) {
            if (i == 2) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (this.isReleased) {
            eventListener.onAdPlaybackState(new AdPlaybackState(obj, new long[0]));
            return;
        }
        if (this.activeAdPlaybackStates.containsKey(obj) || this.unsupportedAdsIds.contains(obj)) {
            throw new IllegalStateException("media item with adsId='" + obj + "' already started. Make sure adsIds are unique within the same playlist.");
        }
        if (this.activeEventListeners.isEmpty()) {
            ((ExoPlayer) Assertions.checkStateNotNull(this.player, "setPlayer(Player) needs to be called")).addListener(this.playerListener);
        }
        this.activeEventListeners.put(obj, eventListener);
        MediaItem mediaItem = adsMediaSource.getMediaItem();
        if (!isHlsMediaItem(mediaItem)) {
            Log.w(TAG, "Unsupported media item. Playing without ads for adsId=" + obj);
            putAndNotifyAdPlaybackStateUpdate(obj, new AdPlaybackState(obj, new long[0]));
            this.unsupportedAdsIds.add(obj);
            return;
        }
        this.insertedInterstitialIds.put(obj, new HashSet());
        this.unresolvedAssetLists.put(obj, new TreeMap<>());
        if ((obj instanceof String) && this.resumptionStates.containsKey(obj)) {
            putAndNotifyAdPlaybackStateUpdate(obj, (AdPlaybackState) Assertions.checkNotNull(this.resumptionStates.remove(obj)));
        } else {
            this.activeAdPlaybackStates.put(obj, AdPlaybackState.NONE);
        }
        notifyListeners(new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(mediaItem, 2, obj, adViewProvider));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        Object adsId = adsMediaSource.getAdsId();
        this.activeEventListeners.remove(adsId);
        AdPlaybackState adPlaybackStateRemove = this.activeAdPlaybackStates.remove(adsId);
        if (this.player != null && this.activeEventListeners.isEmpty()) {
            this.player.removeListener(this.playerListener);
            if (this.isReleased) {
                this.player = null;
            }
        }
        if (!this.isReleased && !this.unsupportedAdsIds.contains(adsId)) {
            if (adPlaybackStateRemove != null && (adsId instanceof String) && this.resumptionStates.containsKey(adsId)) {
                this.resumptionStates.put(adsId, adPlaybackStateRemove);
            }
            notifyListeners(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(adsMediaSource, adPlaybackStateRemove, 1));
        }
        this.insertedInterstitialIds.remove(adsId);
        this.unsupportedAdsIds.remove(adsId);
        this.unresolvedAssetLists.remove(adsId);
        cancelPendingAssetListResolutionMessage();
        if (this.pendingAssetListResolutionMessage == null || !adsMediaSource.getMediaItem().equals(((PlayerMessage) Util.castNonNull(this.pendingAssetListResolutionMessage)).getPayload())) {
            return;
        }
        cancelPendingAssetListResolutionMessage();
    }

    public HlsInterstitialsAdsLoader(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.playerListener = new PlayerListener();
        this.activeEventListeners = new HashMap();
        this.activeAdPlaybackStates = new HashMap();
        this.insertedInterstitialIds = new HashMap();
        this.unresolvedAssetLists = new HashMap();
        this.resumptionStates = new HashMap();
        this.listeners = new ArrayList();
        this.unsupportedAdsIds = new HashSet();
    }

    public void addAdResumptionState(Object obj, AdPlaybackState adPlaybackState) {
        Assertions.checkArgument(!adPlaybackState.endsWithLivePostrollPlaceHolder());
        if (!this.activeAdPlaybackStates.containsKey(obj)) {
            this.resumptionStates.put(obj, adPlaybackState.copy().withAdsId(obj));
            return;
        }
        Log.w(TAG, "Attempting to add an ad resumption state for an adsId that is currently active. adsId=" + obj);
    }
}
