package xyz.doikki.videoplayer.exo;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.datasource.rtmp.RtmpDataSource;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.exoplayer.drm.LocalMediaDrmCallback;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorsFactory;
import com.github.tvbox.osc.base.App;
import com.google.androidx.media3.exoplayer.ext.okhttp.OkHttpDataSource;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import okhttp3.OkHttpClient;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ExoMediaSourceHelper {
    private static volatile ExoMediaSourceHelper sInstance;
    private final Context mAppContext;
    private Cache mCache;
    private OkHttpDataSource.Factory mHttpDataSourceFactory;
    private OkHttpClient mOkClient = null;
    private final String mUserAgent;

    @SuppressLint({"UnsafeOptInUsageError"})
    private ExoMediaSourceHelper(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mUserAgent = Util.getUserAgent(applicationContext, applicationContext.getApplicationInfo().name);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private DataSource.Factory getCacheDataSourceFactory() {
        if (this.mCache == null) {
            this.mCache = newCache();
        }
        return new CacheDataSource.Factory().setCache(this.mCache).setUpstreamDataSourceFactory(getDataSourceFactory()).setFlags(2);
    }

    private DataSource.Factory getDataSourceFactory() {
        return new DefaultDataSource.Factory(this.mAppContext, getHttpDataSourceFactory());
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private static synchronized ExtractorsFactory getExtractorsFactory() {
        return new DefaultExtractorsFactory().setTsExtractorFlags(64).setTsExtractorTimestampSearchBytes(338400);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private DataSource.Factory getHttpDataSourceFactory() {
        if (this.mHttpDataSourceFactory == null) {
            this.mHttpDataSourceFactory = new OkHttpDataSource.Factory(this.mOkClient).setUserAgent(this.mUserAgent);
        }
        return this.mHttpDataSourceFactory;
    }

    public static ExoMediaSourceHelper getInstance(Context context) {
        if (sInstance == null) {
            synchronized (ExoMediaSourceHelper.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ExoMediaSourceHelper(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private static MediaItem getMediaItem(String str, int i) {
        MediaItem.Builder uri = new MediaItem.Builder().setUri(Uri.parse(str.trim().replace("\\", "")));
        if (i == 3003) {
            uri.setMimeType(MimeTypes.APPLICATION_M3U8);
        }
        return uri.build();
    }

    private byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private int inferContentType(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains(".mpd") || lowerCase.contains("type=mpd")) {
            return 0;
        }
        return lowerCase.contains("m3u8") ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DrmSessionManager lambda$getMediaSource$0(DefaultDrmSessionManager defaultDrmSessionManager, MediaItem mediaItem) {
        return defaultDrmSessionManager;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private Cache newCache() {
        int i = O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return new SimpleCache(new File(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getExternalCacheDir().getAbsolutePath(), "exo-video-cache"), new LeastRecentlyUsedCacheEvictor(IjkMediaMeta.AV_CH_STEREO_LEFT), new StandaloneDatabaseProvider(this.mAppContext));
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    private void setHeaders(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        if (map.containsKey("User-Agent")) {
            String strRemove = map.remove("User-Agent");
            if (!TextUtils.isEmpty(strRemove)) {
                try {
                    Field declaredField = this.mHttpDataSourceFactory.getClass().getDeclaredField("userAgent");
                    declaredField.setAccessible(true);
                    declaredField.set(this.mHttpDataSourceFactory, strRemove.trim());
                } catch (Exception unused) {
                }
            }
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (str2 != null) {
                map.put(str, str2.trim());
            }
        }
        this.mHttpDataSourceFactory.setDefaultRequestProperties(map);
    }

    public MediaSource getMediaSource(String str) {
        return getMediaSource(str, null, false);
    }

    public void setCache(Cache cache) {
        this.mCache = cache;
    }

    public void setOkClient(OkHttpClient okHttpClient) {
        this.mOkClient = okHttpClient;
    }

    public MediaSource getMediaSource(String str, Map<String, String> map) {
        return getMediaSource(str, map, false);
    }

    public MediaSource getMediaSource(String str, boolean z) {
        return getMediaSource(str, null, z);
    }

    public MediaSource getMediaSource(String str, Map<String, String> map, boolean z) {
        return getMediaSource(str, map, z, -1);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public MediaSource getMediaSource(String str, Map<String, String> map, boolean z, int i) {
        DataSource.Factory dataSourceFactory;
        UUID uuid;
        Uri uri = Uri.parse(str);
        if ("rtmp".equals(uri.getScheme())) {
            return new ProgressiveMediaSource.Factory(new RtmpDataSource.Factory()).createMediaSource(MediaItem.fromUri(uri));
        }
        if ("rtsp".equals(uri.getScheme())) {
            return new RtspMediaSource.Factory().setForceUseRtpTcp(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() == 0).createMediaSource(MediaItem.fromUri(uri));
        }
        int iInferContentType = inferContentType(str);
        if (z) {
            dataSourceFactory = getCacheDataSourceFactory();
        } else {
            dataSourceFactory = getDataSourceFactory();
        }
        if (this.mHttpDataSourceFactory != null) {
            setHeaders(map);
        }
        if (i == 3003 || i == 3002 || i == 3001 || i == 2000 || i == 1004) {
            new MediaItem.Builder().setUri(str).setMimeType(MimeTypes.APPLICATION_M3U8);
            return new DefaultMediaSourceFactory(getDataSourceFactory(), getExtractorsFactory()).createMediaSource(getMediaItem(str, i));
        }
        if (iInferContentType != 0) {
            if (iInferContentType != 2) {
                return new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(MediaItem.fromUri(uri));
            }
            return new HlsMediaSource.Factory(this.mHttpDataSourceFactory).setAllowChunklessPreparation(true).setExtractorFactory(new MyHlsExtractorFactory()).createMediaSource(MediaItem.fromUri(uri));
        }
        if (str.contains("ku9-drm-mpd")) {
            try {
                Uri uri2 = Uri.parse(uri.getQueryParameters("url").get(0));
                String str2 = uri.getQueryParameters("manifest_type").get(0);
                String str3 = uri.getQueryParameters("license_type").get(0);
                String str4 = uri.getQueryParameters("license_key").get(0);
                if (str2.equals("mpd") || str2.equals("dash")) {
                    if (!str4.equals("#4")) {
                        if (str3.contains("clearkey") && !str4.startsWith("http")) {
                            if (!str4.contains("\"keys\":")) {
                                String[] strArrSplit = str4.split(":");
                                String str5 = strArrSplit[0];
                                str4 = "{\"keys\":[{\"kty\":\"oct\",\"k\":\"" + Base64.encodeToString(hexStringToByteArray(strArrSplit[1]), 11) + "\",\"kid\":\"" + Base64.encodeToString(hexStringToByteArray(str5), 11) + "\"}],\"type\":\"temporary\"}";
                            }
                            final DefaultDrmSessionManager defaultDrmSessionManagerBuild = new DefaultDrmSessionManager.Builder().setMultiSession(false).setUuidAndExoMediaDrmProvider(C.CLEARKEY_UUID, FrameworkMediaDrm.DEFAULT_PROVIDER).build(new LocalMediaDrmCallback(str4.getBytes()));
                            return new DashMediaSource.Factory(dataSourceFactory).setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: xyz.doikki.videoplayer.exo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
                                @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
                                public final DrmSessionManager get(MediaItem mediaItem) {
                                    return ExoMediaSourceHelper.lambda$getMediaSource$0(defaultDrmSessionManagerBuild, mediaItem);
                                }
                            }).createMediaSource(MediaItem.fromUri(uri2));
                        }
                        MediaItem.Builder uri3 = new MediaItem.Builder().setUri(uri2);
                        if (str3.contains("clearkey")) {
                            uuid = C.CLEARKEY_UUID;
                        } else {
                            uuid = str3.contains("widevine") ? C.WIDEVINE_UUID : C.UUID_NIL;
                        }
                        MediaItem.DrmConfiguration.Builder licenseUri = new MediaItem.DrmConfiguration.Builder(uuid).setLicenseUri(str4);
                        if (C.CLEARKEY_UUID.equals(uuid)) {
                            HashMap map2 = new HashMap();
                            map.put("Content-Type", "application/json");
                            licenseUri.setLicenseRequestHeaders(map2);
                        }
                        uri3.setDrmConfiguration(licenseUri.build());
                        return new DashMediaSource.Factory(dataSourceFactory).createMediaSource(uri3.build());
                    }
                }
                return null;
            } catch (Exception e) {
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("设置加密Dash源失败："), 1);
                return null;
            }
        }
        return new DashMediaSource.Factory(dataSourceFactory).createMediaSource(MediaItem.fromUri(uri));
    }
}
