package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.tencent.smtt.sdk.TbsListener;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
final class RtspClient implements Closeable {
    private static final int DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_DIVISOR = 2;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;

    @Nullable
    private KeepAliveMonitor keepAliveMonitor;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;

    @Nullable
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;

    @Nullable
    private RtspAuthenticationInfo rtspAuthenticationInfo;

    @Nullable
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    private final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    private final MessageSender messageSender = new MessageSender();
    private RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    private long sessionTimeoutMs = 60000;
    private long pendingSeekPositionUs = C.TIME_UNSET;
    private int rtspState = -1;

    public final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        public KeepAliveMonitor(long j) {
            this.intervalMs = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        public void start() {
            if (this.isStarted) {
                return;
            }
            this.isStarted = true;
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }
    }

    public final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler = Util.createHandlerForCurrentLooper();

        public MessageListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: handleRtspMessage, reason: merged with bridge method [inline-methods] */
        public void lambda$onRtspMessageReceived$0(List<String> list) {
            RtspClient.this.maybeLogMessage(list);
            if (RtspMessageUtil.isRtspResponse(list)) {
                handleRtspResponse(list);
            } else {
                handleRtspRequest(list);
            }
        }

        private void handleRtspRequest(List<String> list) {
            RtspClient.this.messageSender.sendMethodNotAllowedResponse(Integer.parseInt((String) Assertions.checkNotNull(RtspMessageUtil.parseRequest(list).headers.get(RtspHeaders.CSEQ))));
        }

        private void handleRtspResponse(List<String> list) {
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf;
            RtspResponse response = RtspMessageUtil.parseResponse(list);
            int i = Integer.parseInt((String) Assertions.checkNotNull(response.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(i);
            if (rtspRequest == null) {
                return;
            }
            RtspClient.this.pendingRequests.remove(i);
            int i2 = rtspRequest.method;
            try {
                try {
                    int i3 = response.status;
                    if (i3 == 200) {
                        switch (i2) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                onDescribeResponseReceived(new RtspDescribeResponse(response.headers, i3, SessionDescriptionParser.parse(response.messageBody)));
                                return;
                            case 4:
                                onOptionsResponseReceived(new RtspOptionsResponse(i3, RtspMessageUtil.parsePublicHeader(response.headers.get(RtspHeaders.PUBLIC))));
                                return;
                            case 5:
                                onPauseResponseReceived();
                                return;
                            case 6:
                                String str = response.headers.get("Range");
                                RtspSessionTiming timing = str == null ? RtspSessionTiming.DEFAULT : RtspSessionTiming.parseTiming(str);
                                try {
                                    String str2 = response.headers.get(RtspHeaders.RTP_INFO);
                                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = str2 == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : RtspTrackTiming.parseTrackTiming(str2, RtspClient.this.uri);
                                } catch (ParserException unused) {
                                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
                                }
                                onPlayResponseReceived(new RtspPlayResponse(response.status, timing, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf));
                                return;
                            case 10:
                                String str3 = response.headers.get(RtspHeaders.SESSION);
                                String str4 = response.headers.get(RtspHeaders.TRANSPORT);
                                if (str3 == null || str4 == null) {
                                    throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                                }
                                onSetupResponseReceived(new RtspSetupResponse(response.status, RtspMessageUtil.parseSessionHeader(str3), str4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i3 == 401) {
                        if (RtspClient.this.rtspAuthUserInfo == null || RtspClient.this.receivedAuthorizationRequest) {
                            RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i2) + " " + response.status));
                            return;
                        }
                        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues = response.headers.values(RtspHeaders.WWW_AUTHENTICATE);
                        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues.isEmpty()) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i4 = 0; i4 < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues.size(); i4++) {
                            RtspClient.this.rtspAuthenticationInfo = RtspMessageUtil.parseWwwAuthenticateHeader((String) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues.get(i4));
                            if (RtspClient.this.rtspAuthenticationInfo.authenticationMechanism == 2) {
                                break;
                            }
                        }
                        RtspClient.this.messageSender.retryLastRequest();
                        RtspClient.this.receivedAuthorizationRequest = true;
                        return;
                    }
                    if (i3 == 461) {
                        String str5 = RtspMessageUtil.toMethodString(i2) + " " + response.status;
                        RtspClient.this.dispatchRtspError((i2 != 10 || ((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.TRANSPORT))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str5) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str5));
                        return;
                    }
                    if (i3 != 301 && i3 != 302) {
                        RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i2) + " " + response.status));
                        return;
                    }
                    if (RtspClient.this.rtspState != -1) {
                        RtspClient.this.rtspState = 0;
                    }
                    String str6 = response.headers.get("Location");
                    if (str6 == null) {
                        RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("Redirection without new location.", null);
                        return;
                    }
                    RtspClient.this.uri = Uri.parse(str6);
                    RtspMessageUtil.RtspAuthUserInfo userInfo = RtspMessageUtil.parseUserInfo(RtspClient.this.uri);
                    if (userInfo != null) {
                        RtspClient.this.rtspAuthUserInfo = userInfo;
                    }
                    RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                } catch (ParserException e) {
                    e = e;
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming timing = RtspSessionTiming.DEFAULT;
            String str = (String) rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            if (str != null) {
                try {
                    timing = RtspSessionTiming.parseTiming(str);
                } catch (ParserException e) {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e);
                    return;
                }
            }
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OBuildTrackList = RtspClient.buildTrackList(rtspDescribeResponse, RtspClient.this.uri);
            if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OBuildTrackList.isEmpty()) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineUpdated(timing, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OBuildTrackList);
                RtspClient.this.hasUpdatedTimelineAndTracks = true;
            }
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
            if (RtspClient.this.keepAliveMonitor != null) {
                return;
            }
            if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void onPauseResponseReceived() {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            RtspClient.this.rtspState = 1;
            RtspClient.this.hasPendingPauseRequest = false;
            if (RtspClient.this.pendingSeekPositionUs != C.TIME_UNSET) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(Util.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            boolean z = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z = false;
            }
            Assertions.checkState(z);
            RtspClient.this.rtspState = 2;
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.keepAliveMonitor = rtspClient.new KeepAliveMonitor(rtspClient.sessionTimeoutMs / 2);
                RtspClient.this.keepAliveMonitor.start();
            }
            RtspClient.this.pendingSeekPositionUs = C.TIME_UNSET;
            RtspClient.this.playbackEventListener.onPlaybackStarted(Util.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
            Assertions.checkState(RtspClient.this.rtspState != -1);
            RtspClient.this.rtspState = 1;
            RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.sessionTimeoutMs = rtspSetupResponse.sessionHeader.timeoutMs;
            RtspClient.this.continueSetupRtspTrack();
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public final /* synthetic */ void onReceivingFailed(Exception exc) {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, exc);
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> list) {
            this.messageHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.rtsp.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2608O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$onRtspMessageReceived$0(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public final /* synthetic */ void onSendingFailed(List list, Exception exc) {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, list, exc);
        }
    }

    public final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;

        private MessageSender() {
        }

        private RtspRequest getRequestWithCommonHeaders(int i, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = RtspClient.this.userAgent;
            int i2 = this.cSeq;
            this.cSeq = i2 + 1;
            RtspHeaders.Builder builder = new RtspHeaders.Builder(str2, str, i2);
            if (RtspClient.this.rtspAuthenticationInfo != null) {
                Assertions.checkStateNotNull(RtspClient.this.rtspAuthUserInfo);
                try {
                    builder.add(RtspHeaders.AUTHORIZATION, RtspClient.this.rtspAuthenticationInfo.getAuthorizationHeaderValue(RtspClient.this.rtspAuthUserInfo, uri, i));
                } catch (ParserException e) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            builder.addAll(map);
            return new RtspRequest(uri, i, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) {
            int i = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(i) == null);
            RtspClient.this.pendingRequests.append(i, rtspRequest);
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeRequest = RtspMessageUtil.serializeRequest(rtspRequest);
            RtspClient.this.maybeLogMessage(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeRequest);
            RtspClient.this.messageChannel.send(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeRequest);
            this.lastRequest = rtspRequest;
        }

        private void sendResponse(RtspResponse rtspResponse) {
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeResponse = RtspMessageUtil.serializeResponse(rtspResponse);
            RtspClient.this.maybeLogMessage(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeResponse);
            RtspClient.this.messageChannel.send(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OSerializeResponse);
        }

        public void retryLastRequest() {
            Assertions.checkStateNotNull(this.lastRequest);
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap = this.lastRequest.headers.asMultiMap();
            HashMap map = new HashMap();
            for (String str : o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.keySet()) {
                if (!str.equals(RtspHeaders.CSEQ) && !str.equals("User-Agent") && !str.equals(RtspHeaders.SESSION) && !str.equals(RtspHeaders.AUTHORIZATION)) {
                    map.put(str, (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.get((Object) str)));
                }
            }
            sendRequest(getRequestWithCommonHeaders(this.lastRequest.method, RtspClient.this.sessionId, map, this.lastRequest.uri));
        }

        public void sendDescribeRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(2, str, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of("Accept", MimeTypes.APPLICATION_SDP), uri));
        }

        public void sendMethodNotAllowedResponse(int i) {
            sendResponse(new RtspResponse(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, new RtspHeaders.Builder(RtspClient.this.userAgent, RtspClient.this.sessionId, i).build()));
            this.cSeq = Math.max(this.cSeq, i + 1);
        }

        public void sendOptionsRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(4, str, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of(), uri));
        }

        public void sendPauseRequest(Uri uri, String str) {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            sendRequest(getRequestWithCommonHeaders(5, str, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of(), uri));
            RtspClient.this.hasPendingPauseRequest = true;
        }

        public void sendPlayRequest(Uri uri, long j, String str) {
            boolean z = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z = false;
            }
            Assertions.checkState(z);
            sendRequest(getRequestWithCommonHeaders(6, str, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of("Range", RtspSessionTiming.getOffsetStartTimeTiming(j)), uri));
        }

        public void sendSetupRequest(Uri uri, String str, @Nullable String str2) {
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(10, str2, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of(RtspHeaders.TRANSPORT, str), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) {
            if (RtspClient.this.rtspState == -1 || RtspClient.this.rtspState == 0) {
                return;
            }
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(12, str, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of(), uri));
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O);

        void onRtspSetupCompleted();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RtspState {
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, @Nullable Throwable th);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.sessionInfoListener = sessionInfoListener;
        this.playbackEventListener = playbackEventListener;
        this.userAgent = str;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z;
        this.uri = RtspMessageUtil.removeUserInfo(uri);
        this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O buildTrackList(RtspDescribeResponse rtspDescribeResponse, Uri uri) {
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO();
        for (int i = 0; i < rtspDescribeResponse.sessionDescription.mediaDescriptionList.size(); i++) {
            MediaDescription mediaDescription = (MediaDescription) rtspDescribeResponse.sessionDescription.mediaDescriptionList.get(i);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(new RtspMediaTrack(rtspDescribeResponse.headers, mediaDescription, uri));
            }
        }
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueSetupRtspTrack() {
        RtspMediaPeriod.RtpLoadInfo rtpLoadInfoPollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (rtpLoadInfoPollFirst == null) {
            this.playbackEventListener.onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(rtpLoadInfoPollFirst.getTrackUri(), rtpLoadInfoPollFirst.getTransport(), this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRtspError(Throwable th) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th : new RtspMediaSource.RtspPlaybackException(th);
        if (this.hasUpdatedTimelineAndTracks) {
            this.playbackEventListener.onPlaybackError(rtspPlaybackException);
            return;
        }
        SessionInfoListener sessionInfoListener = this.sessionInfoListener;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        sessionInfoListener.onSessionTimelineRequestFailed(message, th);
    }

    private Socket getSocket(Uri uri) {
        Assertions.checkArgument(uri.getHost() != null);
        return this.socketFactory.createSocket((String) Assertions.checkNotNull(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : RtspMessageChannel.DEFAULT_RTSP_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeLogMessage(List<String> list) {
        if (this.debugLoggingEnabled) {
            Log.d(TAG, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("\n").O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        KeepAliveMonitor keepAliveMonitor = this.keepAliveMonitor;
        if (keepAliveMonitor != null) {
            keepAliveMonitor.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public int getState() {
        return this.rtspState;
    }

    public void registerInterleavedDataChannel(int i, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.messageChannel.registerInterleavedBinaryDataListener(i, interleavedBinaryDataListener);
    }

    public void retryWithRtpTcp() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.open(getSocket(this.uri));
            this.sessionId = null;
            this.receivedAuthorizationRequest = false;
            this.rtspAuthenticationInfo = null;
        } catch (IOException e) {
            this.playbackEventListener.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e));
        }
    }

    public void seekToUs(long j) {
        if (this.rtspState == 2 && !this.hasPendingPauseRequest) {
            this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.pendingSeekPositionUs = j;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void signalPlaybackEnded() {
        this.rtspState = 1;
    }

    public void start() {
        try {
            this.messageChannel.open(getSocket(this.uri));
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e) {
            Util.closeQuietly(this.messageChannel);
            throw e;
        }
    }

    public void startPlayback(long j) {
        this.messageSender.sendPlayRequest(this.uri, j, (String) Assertions.checkNotNull(this.sessionId));
    }
}
