package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O interstitials;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;

    @Nullable
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    public static final class Interstitial {
        public static final String CUE_TRIGGER_ONCE = "ONCE";
        public static final String CUE_TRIGGER_POST = "POST";
        public static final String CUE_TRIGGER_PRE = "PRE";
        public static final String NAVIGATION_RESTRICTION_JUMP = "JUMP";
        public static final String NAVIGATION_RESTRICTION_SKIP = "SKIP";
        public static final String SNAP_TYPE_IN = "IN";
        public static final String SNAP_TYPE_OUT = "OUT";
        public static final String TIMELINE_OCCUPIES_POINT = "POINT";
        public static final String TIMELINE_OCCUPIES_RANGE = "RANGE";
        public static final String TIMELINE_STYLE_HIGHLIGHT = "HIGHLIGHT";
        public static final String TIMELINE_STYLE_PRIMARY = "PRIMARY";

        @Nullable
        public final Uri assetListUri;

        @Nullable
        public final Uri assetUri;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O clientDefinedAttributes;
        public final boolean contentMayVary;
        public final List<String> cue;
        public final long durationUs;
        public final long endDateUnixUs;
        public final boolean endOnNext;
        public final String id;
        public final long plannedDurationUs;
        public final long playoutLimitUs;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O restrictions;
        public final long resumeOffsetUs;
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O snapTypes;
        public final long startDateUnixUs;
        public final String timelineOccupies;
        public final String timelineStyle;

        public static final class Builder {
            private Uri assetListUri;
            private Uri assetUri;
            private Boolean contentMayVary;
            private boolean endOnNext;
            private final String id;
            private String timelineOccupies;
            private String timelineStyle;
            private final Map<String, ClientDefinedAttribute> clientDefinedAttributes = new HashMap();
            private long startDateUnixUs = C.TIME_UNSET;
            private long endDateUnixUs = C.TIME_UNSET;
            private long durationUs = C.TIME_UNSET;
            private long plannedDurationUs = C.TIME_UNSET;
            private List<String> cue = new ArrayList();
            private long resumeOffsetUs = C.TIME_UNSET;
            private long playoutLimitUs = C.TIME_UNSET;
            private List<String> snapTypes = new ArrayList();
            private List<String> restrictions = new ArrayList();

            public Builder(String str) {
                this.id = str;
            }

            @Nullable
            public Interstitial build() {
                Uri uri = this.assetListUri;
                if ((uri != null || this.assetUri == null) && (uri == null || this.assetUri != null)) {
                    return null;
                }
                long j = this.startDateUnixUs;
                if (j == C.TIME_UNSET) {
                    return null;
                }
                String str = this.id;
                Uri uri2 = this.assetUri;
                long j2 = this.endDateUnixUs;
                long j3 = this.durationUs;
                long j4 = this.plannedDurationUs;
                List<String> list = this.cue;
                boolean z = this.endOnNext;
                long j5 = this.resumeOffsetUs;
                long j6 = this.playoutLimitUs;
                List<String> list2 = this.snapTypes;
                List<String> list3 = this.restrictions;
                ArrayList arrayList = new ArrayList(this.clientDefinedAttributes.values());
                Boolean bool = this.contentMayVary;
                boolean z2 = bool == null || bool.booleanValue();
                String str2 = this.timelineOccupies;
                if (str2 == null) {
                    str2 = Interstitial.TIMELINE_OCCUPIES_POINT;
                }
                String str3 = str2;
                String str4 = this.timelineStyle;
                if (str4 == null) {
                    str4 = Interstitial.TIMELINE_STYLE_HIGHLIGHT;
                }
                return new Interstitial(str, uri2, uri, j, j2, j3, j4, list, z, j5, j6, list2, list3, arrayList, z2, str3, str4);
            }

            @CanIgnoreReturnValue
            public Builder setAssetListUri(@Nullable Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.assetListUri;
                if (uri2 != null) {
                    Assertions.checkArgument(uri2.equals(uri), "Can't change assetListUri from " + this.assetListUri + " to " + uri);
                }
                this.assetListUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAssetUri(@Nullable Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.assetUri;
                if (uri2 != null) {
                    Assertions.checkArgument(uri2.equals(uri), "Can't change assetUri from " + this.assetUri + " to " + uri);
                }
                this.assetUri = uri;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setClientDefinedAttributes(List<ClientDefinedAttribute> list) {
                if (list.isEmpty()) {
                    return this;
                }
                for (int i = 0; i < list.size(); i++) {
                    ClientDefinedAttribute clientDefinedAttribute = list.get(i);
                    String str = clientDefinedAttribute.name;
                    ClientDefinedAttribute clientDefinedAttribute2 = this.clientDefinedAttributes.get(str);
                    if (clientDefinedAttribute2 != null) {
                        boolean zEquals = clientDefinedAttribute2.equals(clientDefinedAttribute);
                        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Can't change ", str, " from ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(clientDefinedAttribute2.textValue);
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(" ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(clientDefinedAttribute2.doubleValue);
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(" to ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(clientDefinedAttribute.textValue);
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(" ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(clientDefinedAttribute.doubleValue);
                        Assertions.checkArgument(zEquals, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
                    }
                    this.clientDefinedAttributes.put(str, clientDefinedAttribute);
                }
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setContentMayVary(@Nullable Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.contentMayVary;
                if (bool2 != null) {
                    Assertions.checkArgument(bool2.equals(bool), "Can't change contentMayVary from " + this.contentMayVary + " to " + bool);
                }
                this.contentMayVary = bool;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCue(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.cue.isEmpty()) {
                    boolean zEquals = this.cue.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change cue from ");
                    List<String> list2 = this.cue;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    Assertions.checkArgument(zEquals, sb.toString());
                }
                this.cue = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.durationUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change durationUs from " + this.durationUs + " to " + j);
                }
                this.durationUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setEndDateUnixUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.endDateUnixUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change endDateUnixUs from " + this.endDateUnixUs + " to " + j);
                }
                this.endDateUnixUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setEndOnNext(boolean z) {
                if (!z) {
                    return this;
                }
                this.endOnNext = true;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlannedDurationUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.plannedDurationUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change plannedDurationUs from " + this.plannedDurationUs + " to " + j);
                }
                this.plannedDurationUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setPlayoutLimitUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.playoutLimitUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change playoutLimitUs from " + this.playoutLimitUs + " to " + j);
                }
                this.playoutLimitUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRestrictions(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.restrictions.isEmpty()) {
                    boolean zEquals = this.restrictions.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change restrictions from ");
                    List<String> list2 = this.restrictions;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    Assertions.checkArgument(zEquals, sb.toString());
                }
                this.restrictions = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setResumeOffsetUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.resumeOffsetUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change resumeOffsetUs from " + this.resumeOffsetUs + " to " + j);
                }
                this.resumeOffsetUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSnapTypes(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.snapTypes.isEmpty()) {
                    boolean zEquals = this.snapTypes.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
                    List<String> list2 = this.snapTypes;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    Assertions.checkArgument(zEquals, sb.toString());
                }
                this.snapTypes = list;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartDateUnixUs(long j) {
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j2 = this.startDateUnixUs;
                if (j2 != C.TIME_UNSET) {
                    Assertions.checkArgument(j2 == j, "Can't change startDateUnixUs from " + this.startDateUnixUs + " to " + j);
                }
                this.startDateUnixUs = j;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTimelineOccupies(@Nullable String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineOccupies;
                if (str2 != null) {
                    Assertions.checkArgument(str2.equals(str), "Can't change timelineOccupies from " + this.timelineOccupies + " to " + str);
                }
                this.timelineOccupies = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTimelineStyle(@Nullable String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineStyle;
                if (str2 != null) {
                    Assertions.checkArgument(str2.equals(str), "Can't change timelineStyle from " + this.timelineStyle + " to " + str);
                }
                this.timelineStyle = str;
                return this;
            }
        }

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface CueTriggerType {
        }

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface NavigationRestriction {
        }

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface SnapType {
        }

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TimelineOccupiesType {
        }

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TimelineStyleType {
        }

        public Interstitial(String str, @Nullable Uri uri, @Nullable Uri uri2, long j, long j2, long j3, long j4, List<String> list, boolean z, long j5, long j6, List<String> list2, List<String> list3, List<ClientDefinedAttribute> list4, boolean z2, String str2, String str3) {
            Assertions.checkArgument((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.id = str;
            this.assetUri = uri;
            this.assetListUri = uri2;
            this.startDateUnixUs = j;
            this.endDateUnixUs = j2;
            this.durationUs = j3;
            this.plannedDurationUs = j4;
            this.cue = list;
            this.endOnNext = z;
            this.resumeOffsetUs = j5;
            this.playoutLimitUs = j6;
            this.snapTypes = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list2);
            this.restrictions = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list3);
            this.clientDefinedAttributes = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(new androidx.media3.datasource.cache.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1), list4);
            this.contentMayVary = z2;
            this.timelineOccupies = str2;
            this.timelineStyle = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(ClientDefinedAttribute clientDefinedAttribute, ClientDefinedAttribute clientDefinedAttribute2) {
            return clientDefinedAttribute.name.compareTo(clientDefinedAttribute2.name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj;
            return this.startDateUnixUs == interstitial.startDateUnixUs && this.endDateUnixUs == interstitial.endDateUnixUs && this.durationUs == interstitial.durationUs && this.plannedDurationUs == interstitial.plannedDurationUs && this.endOnNext == interstitial.endOnNext && this.resumeOffsetUs == interstitial.resumeOffsetUs && this.playoutLimitUs == interstitial.playoutLimitUs && this.contentMayVary == interstitial.contentMayVary && Objects.equals(this.id, interstitial.id) && Objects.equals(this.assetUri, interstitial.assetUri) && Objects.equals(this.assetListUri, interstitial.assetListUri) && Objects.equals(this.cue, interstitial.cue) && Objects.equals(this.snapTypes, interstitial.snapTypes) && Objects.equals(this.restrictions, interstitial.restrictions) && Objects.equals(this.clientDefinedAttributes, interstitial.clientDefinedAttributes) && Objects.equals(this.timelineOccupies, interstitial.timelineOccupies) && Objects.equals(this.timelineStyle, interstitial.timelineStyle);
        }

        public int hashCode() {
            return Objects.hash(this.id, this.assetUri, this.assetListUri, Long.valueOf(this.startDateUnixUs), Long.valueOf(this.endDateUnixUs), Long.valueOf(this.durationUs), Long.valueOf(this.plannedDurationUs), this.cue, Boolean.valueOf(this.endOnNext), Long.valueOf(this.resumeOffsetUs), Long.valueOf(this.playoutLimitUs), this.snapTypes, this.restrictions, this.clientDefinedAttributes, Boolean.valueOf(this.contentMayVary), this.timelineOccupies, this.timelineStyle);
        }
    }

    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, @Nullable Segment segment, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, segment, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.isIndependent = z2;
            this.isPreload = z3;
        }

        public Part copyWith(long j, int i) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;

        @Nullable
        public final DrmInitData drmInitData;
        public final long durationUs;

        @Nullable
        public final String encryptionIV;

        @Nullable
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, @Nullable Segment segment, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j2;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j3;
            this.byteRangeLength = j4;
            this.hasGapTag = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            if (this.relativeStartTimeUs > l.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z, long j2, long j3, boolean z2) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z;
            this.holdBackUs = j2;
            this.partHoldBackUs = j3;
            this.canBlockReload = z2;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, @Nullable DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map, List<Interstitial> list4) {
        super(str, list, z3);
        this.playlistType = i;
        this.startTimeUs = j2;
        this.preciseStart = z;
        this.hasDiscontinuitySequence = z2;
        this.discontinuitySequence = i2;
        this.mediaSequence = j3;
        this.version = i3;
        this.targetDurationUs = j4;
        this.partTargetDurationUs = j5;
        this.hasEndTag = z4;
        this.hasProgramDateTime = z5;
        this.protectionSchemes = drmInitData;
        this.segments = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list2);
        this.trailingParts = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list3);
        this.renditionReports = O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.copyOf((Map) map);
        this.interstitials = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            Part part = (Part) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j != C.TIME_UNSET ? j >= 0 ? Math.min(this.durationUs, j) : Math.max(0L, this.durationUs + j) : C.TIME_UNSET;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(@Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist == null) {
            return true;
        }
        long j = this.mediaSequence;
        long j2 = hlsMediaPlaylist.mediaSequence;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.segments.size() - hlsMediaPlaylist.segments.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.trailingParts.size();
        int size3 = hlsMediaPlaylist.trailingParts.size();
        if (size2 <= size3) {
            return size2 == size3 && this.hasEndTag && !hlsMediaPlaylist.hasEndTag;
        }
        return true;
    }

    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j, long j2, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
        }

        public Segment copyWith(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                Part part = this.parts.get(i2);
                arrayList.add(part.copyWith(j2, i));
                j2 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, @Nullable Segment segment, String str2, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, List<Part> list) {
            super(str, segment, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.title = str2;
            this.parts = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
        }
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public static class ClientDefinedAttribute {
        public static final int TYPE_DOUBLE = 2;
        public static final int TYPE_HEX_TEXT = 1;
        public static final int TYPE_TEXT = 0;
        private final double doubleValue;
        public final String name;

        @Nullable
        private final String textValue;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public ClientDefinedAttribute(String str, double d) {
            this.name = str;
            this.type = 2;
            this.doubleValue = d;
            this.textValue = null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientDefinedAttribute)) {
                return false;
            }
            ClientDefinedAttribute clientDefinedAttribute = (ClientDefinedAttribute) obj;
            return this.type == clientDefinedAttribute.type && Double.compare(this.doubleValue, clientDefinedAttribute.doubleValue) == 0 && Objects.equals(this.name, clientDefinedAttribute.name) && Objects.equals(this.textValue, clientDefinedAttribute.textValue);
        }

        public double getDoubleValue() {
            Assertions.checkState(this.type == 2);
            return this.doubleValue;
        }

        public String getTextValue() {
            Assertions.checkState(this.type != 2);
            return (String) Assertions.checkNotNull(this.textValue);
        }

        public int hashCode() {
            return Objects.hash(this.name, Integer.valueOf(this.type), Double.valueOf(this.doubleValue), this.textValue);
        }

        public ClientDefinedAttribute(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            Assertions.checkState(z);
            this.name = str;
            this.type = i;
            this.textValue = str2;
            this.doubleValue = 0.0d;
        }
    }
}
