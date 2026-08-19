package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Descriptor;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.ChunkSampleStream;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {
    private static final Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final Allocator allocator;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private MediaPeriod.Callback callback;
    private final DashChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private List<EventStream> eventStreams;
    final int id;
    private long initialStartTimeUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final PlayerEmsgHandler playerEmsgHandler;
    private final PlayerId playerId;
    private final TrackGroupInfo[] trackGroupInfos;
    private final TrackGroupArray trackGroups;

    @Nullable
    private final TransferListener transferListener;
    private boolean canReportInitialDiscontinuity = true;
    private ChunkSampleStream<DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private EventSampleStream[] eventSampleStreams = new EventSampleStream[0];
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new IdentityHashMap<>();

    public static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O embeddedClosedCaptionTrackOriginalFormats;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        private TrackGroupInfo(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
            this.trackType = i;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i2;
            this.primaryTrackGroupIndex = i3;
            this.embeddedEventMessageTrackGroupIndex = i4;
            this.embeddedClosedCaptionTrackGroupIndex = i5;
            this.eventStreamGroupIndex = i6;
            this.embeddedClosedCaptionTrackOriginalFormats = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        }

        public static TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
            return new TrackGroupInfo(3, 1, iArr, i, -1, -1, -1, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O);
        }

        public static TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i) {
            return new TrackGroupInfo(5, 1, iArr, i, -1, -1, -1, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
        }

        public static TrackGroupInfo mpdEventTrack(int i) {
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
        }

        public static TrackGroupInfo primaryTrack(int i, int[] iArr, int i2, int i3, int i4) {
            return new TrackGroupInfo(i, 0, iArr, i2, i3, i4, -1, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
        }
    }

    public DashMediaPeriod(int i, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i2, DashChunkSource.Factory factory, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, long j, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, PlayerId playerId) {
        this.id = i;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i2;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.playerEmsgHandler = new PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        Period period = dashManifest.getPeriod(i2);
        List<EventStream> list = period.eventStreams;
        this.eventStreams = list;
        Pair<TrackGroupArray, TrackGroupInfo[]> pairBuildTrackGroups = buildTrackGroups(drmSessionManager, factory, period.adaptationSets, list);
        this.trackGroups = (TrackGroupArray) pairBuildTrackGroups.first;
        this.trackGroupInfos = (TrackGroupInfo[]) pairBuildTrackGroups.second;
    }

    private static void buildManifestEventTrackGroupInfos(List<EventStream> list, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            EventStream eventStream = list.get(i2);
            trackGroupArr[i] = new TrackGroup(eventStream.id() + ":" + i2, new Format.Builder().setId(eventStream.id()).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfoArr[i] = TrackGroupInfo.mpdEventTrack(i2);
            i2++;
            i++;
        }
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, int[][] iArr, int i, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, TrackGroupInfo[] trackGroupInfoArr) {
        int i2;
        int i3;
        char c = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).representations);
            }
            int size = arrayList.size();
            Format[] formatArr2 = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                Format format = ((Representation) arrayList.get(i7)).format;
                formatArr2[i7] = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build();
            }
            AdaptationSet adaptationSet = list.get(iArr2[c]);
            long j = adaptationSet.id;
            String string = j != -1 ? Long.toString(j) : O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i4, "unset:");
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (formatArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            maybeUpdateFormatsForParsedText(factory, formatArr2);
            trackGroupArr[i5] = new TrackGroup(string, formatArr2);
            trackGroupInfoArr[i5] = TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(string, ":emsg");
                trackGroupArr[i8] = new TrackGroup(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, new Format.Builder().setId(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
                trackGroupInfoArr[i8] = TrackGroupInfo.embeddedEmsgTrack(iArr2, i5);
            }
            if (i2 != -1) {
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(string, ":cc");
                trackGroupInfoArr[i2] = TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i5, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf(formatArr[i4]));
                maybeUpdateFormatsForParsedText(factory, formatArr[i4]);
                trackGroupArr[i2] = new TrackGroup(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2, formatArr[i4]);
            }
            i4++;
            i5 = i3;
            c = 0;
        }
        return i5;
    }

    private ChunkSampleStream<DashChunkSource> buildSampleStream(TrackGroupInfo trackGroupInfo, ExoTrackSelection exoTrackSelection, long j) {
        TrackGroup trackGroup;
        int i;
        int i2;
        int i3 = trackGroupInfo.embeddedEventMessageTrackGroupIndex;
        boolean z = i3 != -1;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = null;
        if (z) {
            trackGroup = this.trackGroups.get(i3);
            i = 1;
        } else {
            trackGroup = null;
            i = 0;
        }
        int i4 = trackGroupInfo.embeddedClosedCaptionTrackGroupIndex;
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = i4 != -1 ? this.trackGroupInfos[i4].embeddedClosedCaptionTrackOriginalFormats : O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
        int size = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.size() + i;
        Format[] formatArr = new Format[size];
        int[] iArr = new int[size];
        if (z) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.size(); i5++) {
            Format format = (Format) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.get(i5);
            formatArr[i2] = format;
            iArr[i2] = 3;
            arrayList.add(format);
            i2++;
        }
        if (this.manifest.dynamic && z) {
            playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = this.playerEmsgHandler.newPlayerTrackEmsgHandler();
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream<>(trackGroupInfo.trackType, iArr, formatArr, this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z, arrayList, playerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration), this, this.allocator, j, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher, this.canReportInitialDiscontinuity, null);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
        }
        return chunkSampleStream;
    }

    private static Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups(DrmSessionManager drmSessionManager, DashChunkSource.Factory factory, List<AdaptationSet> list, List<EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int size = list2.size() + identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length;
        TrackGroup[] trackGroupArr = new TrackGroup[size];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[size];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    private static boolean canMergeAdaptationSets(AdaptationSet adaptationSet, AdaptationSet adaptationSet2) {
        if (adaptationSet.type != adaptationSet2.type) {
            return false;
        }
        if (adaptationSet.representations.isEmpty() || adaptationSet2.representations.isEmpty()) {
            return true;
        }
        Format format = adaptationSet.representations.get(0).format;
        Format format2 = adaptationSet2.representations.get(0).format;
        return Objects.equals(format.language, format2.language) && (format.roleFlags & (-16385)) == (format2.roleFlags & (-16385));
    }

    @Nullable
    private static Descriptor findAdaptationSetSwitchingProperty(List<Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    private static Descriptor findDescriptor(List<Descriptor> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    @Nullable
    private static Descriptor findTrickPlayProperty(List<Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] getClosedCaptionTrackFormats(List<AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            AdaptationSet adaptationSet = list.get(i);
            List<Descriptor> list2 = list.get(i).accessibilityDescriptors;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Descriptor descriptor = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).setId(adaptationSet.id + ":cea608").build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA708).setId(adaptationSet.id + ":cea708").build());
                }
            }
        }
        return new Format[0];
    }

    private static int[][] getGroupedAdaptationSetIndices(List<AdaptationSet> list) {
        Descriptor descriptorFindAdaptationSetSwitchingProperty;
        Integer num;
        int size = list.size();
        HashMap map = new HashMap(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            map.put(Long.valueOf(list.get(i).id), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            AdaptationSet adaptationSet = list.get(i2);
            Descriptor descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (descriptorFindTrickPlayProperty == null) {
                descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            int iIntValue = (descriptorFindTrickPlayProperty == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(descriptorFindTrickPlayProperty.value)))) == null || !canMergeAdaptationSets(adaptationSet, list.get(num.intValue()))) ? i2 : num.intValue();
            if (iIntValue == i2 && (descriptorFindAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (String str : Util.split(descriptorFindAdaptationSetSwitchingProperty.value, ",")) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && canMergeAdaptationSets(adaptationSet, list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] iArrO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((Collection) arrayList.get(i3));
            iArr[i3] = iArrO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            Arrays.sort(iArrO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
        }
        return iArr;
    }

    private int getPrimaryStreamIndex(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.trackGroupInfos[i2].primaryTrackGroupIndex;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.trackGroupInfos[i5].trackGroupCategory == 0) {
                return i4;
            }
        }
        return -1;
    }

    private int[] getStreamIndexToTrackGroupIndex(ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                iArr[i] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private static boolean hasEventMessageTrack(List<AdaptationSet> list, int[] iArr) {
        for (int i : iArr) {
            List<Representation> list2 = list.get(i).representations;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int identifyEmbeddedTracks(int i, List<AdaptationSet> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (hasEventMessageTrack(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i3]);
            formatArr[i3] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTracks$0(ChunkSampleStream chunkSampleStream) {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(Integer.valueOf(chunkSampleStream.primaryTrackType));
    }

    private static void maybeUpdateFormatsForParsedText(DashChunkSource.Factory factory, Format[] formatArr) {
        for (int i = 0; i < formatArr.length; i++) {
            formatArr[i] = factory.getOutputTextFormat(formatArr[i]);
        }
    }

    private static ChunkSampleStream<DashChunkSource>[] newSampleStreamArray(int i) {
        return new ChunkSampleStream[i];
    }

    private static Format[] parseClosedCaptionDescriptor(Descriptor descriptor, Pattern pattern, Format format) {
        String str = descriptor.value;
        if (str == null) {
            return new Format[]{format};
        }
        String[] strArrSplit = Util.split(str, ";");
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            formatArr[i] = format.buildUpon().setId(format.id + ":" + i2).setAccessibilityChannel(i2).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private void releaseDisabledStreams(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (exoTrackSelectionArr[i] == null || !zArr[i]) {
                SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i] = null;
            }
        }
    }

    private void releaseOrphanEmbeddedStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            if ((sampleStream instanceof EmptySampleStream) || (sampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) {
                int primaryStreamIndex = getPrimaryStreamIndex(i, iArr);
                if (primaryStreamIndex == -1) {
                    z = sampleStreamArr[i] instanceof EmptySampleStream;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i];
                    z = (sampleStream2 instanceof ChunkSampleStream.EmbeddedSampleStream) && ((ChunkSampleStream.EmbeddedSampleStream) sampleStream2).parent == sampleStreamArr[primaryStreamIndex];
                }
                if (!z) {
                    SampleStream sampleStream3 = sampleStreamArr[i];
                    if (sampleStream3 instanceof ChunkSampleStream.EmbeddedSampleStream) {
                        ((ChunkSampleStream.EmbeddedSampleStream) sampleStream3).release();
                    }
                    sampleStreamArr[i] = null;
                }
            }
        }
    }

    private void selectNewStreams(ExoTrackSelection[] exoTrackSelectionArr, SampleStream[] sampleStreamArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream == null) {
                    zArr[i] = true;
                    TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i]];
                    int i2 = trackGroupInfo.trackGroupCategory;
                    if (i2 == 0) {
                        sampleStreamArr[i] = buildSampleStream(trackGroupInfo, exoTrackSelection, j);
                    } else if (i2 == 2) {
                        sampleStreamArr[i] = new EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            if (sampleStreamArr[i3] == null && exoTrackSelectionArr[i3] != null) {
                TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i3]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i3, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i3] = new EmptySampleStream();
                    } else {
                        sampleStreamArr[i3] = ((ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        List<AdaptationSet> list2 = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroupInfo trackGroupInfo = this.trackGroupInfos[this.trackGroups.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.trackGroupCategory == 0) {
                int[] iArr = trackGroupInfo.adaptationSetIndices;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < exoTrackSelection.length(); i++) {
                    iArr2[i] = exoTrackSelection.getIndexInTrackGroup(i);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).representations.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list2.get(iArr[i2]).representations.size();
                            i3 = i6;
                        }
                    }
                    arrayList.add(new StreamKey(this.periodIndex, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.consumeInitialDiscontinuity()) {
                return this.initialStartTimeUs;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (!chunkSampleStream.isLoading()) {
                chunkSampleStream.discardUpstreamSamplesForClippedDuration(this.manifest.getPeriodDurationUs(this.periodIndex));
            }
        }
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j, streamIndexToTrackGroupIndex);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList2.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(arrayList, new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()));
        if (this.canReportInitialDiscontinuity) {
            this.canReportInitialDiscontinuity = false;
            this.initialStartTimeUs = j;
        }
        return j;
    }

    public void updateManifest(DashManifest dashManifest, int i) {
        this.manifest = dashManifest;
        this.periodIndex = i;
        this.playerEmsgHandler.updateManifest(dashManifest);
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = this.sampleStreams;
        if (chunkSampleStreamArr != null) {
            for (ChunkSampleStream<DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(dashManifest, i);
            }
            this.callback.onContinueLoadingRequested(this);
        }
        this.eventStreams = dashManifest.getPeriod(i).eventStreams;
        for (EventSampleStream eventSampleStream : this.eventSampleStreams) {
            for (EventStream eventStream : this.eventStreams) {
                if (eventStream.id().equals(eventSampleStream.eventStreamId())) {
                    eventSampleStream.updateEventStream(eventStream, dashManifest.dynamic && i == dashManifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }
}
