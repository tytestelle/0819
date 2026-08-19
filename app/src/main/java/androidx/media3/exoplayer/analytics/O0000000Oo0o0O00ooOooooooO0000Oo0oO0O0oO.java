package androidx.media3.exoplayer.analytics;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j) {
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    public static void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    public static void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    public static void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    public static void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, List list) {
    }

    public static void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    public static void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public static void O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(AnalyticsListener analyticsListener, Player player, AnalyticsListener.Events events) {
    }

    public static void O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public static void O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public static void O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public static void O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j) {
    }

    public static void O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    public static void O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    public static void O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    public static void O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    public static void O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    public static void O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    public static void O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j) {
    }

    public static void O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j) {
    }

    public static void O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public static void O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public static void O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i) {
    }

    public static void O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    public static void O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    public static void O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public static void O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    public static void O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    public static void O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, float f) {
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    public static void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    public static void O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    public static void O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
    }

    public static void O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    public static void O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    public static void O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Object obj, long j) {
    }

    public static void O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    public static void O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    public static void O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    public static void O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    public static void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    public static void O00000OOoOOO00O00o0ooooooooO000ooooO0000(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    public static void O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
    }

    public static void O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    public static void O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
    }

    public static void O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    public static void O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    public static void O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }
}
