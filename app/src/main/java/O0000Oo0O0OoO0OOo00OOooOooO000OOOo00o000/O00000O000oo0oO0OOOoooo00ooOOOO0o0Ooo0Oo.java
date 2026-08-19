package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.net.Uri;
import android.view.SurfaceView;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import com.quickjs.JSArray;
import com.quickjs.JSObject;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, Interpolator, DebugViewProvider, ListenerSet.Event, DefaultGainProvider.FadeProvider, CacheKeyFactory, ListenerSet.IterationFinishedEvent, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, ExtractorsFactory, Id3Decoder.FramePredicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0132 A[PHI: r0 r2
  0x0132: PHI (r0v3 java.net.HttpURLConnection) = (r0v2 java.net.HttpURLConnection), (r0v5 java.net.HttpURLConnection) binds: [B:82:0x0140, B:73:0x012e] A[DONT_GENERATE, DONT_INLINE]
  0x0132: PHI (r2v4 java.lang.String) = (r2v7 java.lang.String), (r2v5 java.lang.String) binds: [B:82:0x0140, B:73:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject, JSArray jSArray) throws Throwable {
        HttpURLConnection httpURLConnection;
        String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0);
        int r2 = 0;
        string = null;
        String string = null;
        String string2 = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() > 1 ? jSArray.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(1) != null ? jSArray.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(1).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000().toString() : jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(1) : null;
        boolean z = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() <= 2 || jSArray.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(2);
        String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() > 3 ? jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(3) : "GET";
        String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() > 4 ? jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(4) : null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo).openConnection();
                try {
                    try {
                        httpURLConnection.setInstanceFollowRedirects(z);
                        httpURLConnection.setRequestMethod(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.toUpperCase());
                        HashMap map = new HashMap();
                        if (string2 != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(string2);
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    map.put(next, jSONObject.getString(next));
                                }
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        if (HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST.equalsIgnoreCase(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2) && strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 != null) {
                            httpURLConnection.setDoOutput(true);
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getBytes());
                                outputStream.flush();
                                outputStream.close();
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        httpURLConnection.connect();
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            String key = entry2.getKey();
                            List value = entry2.getValue();
                            if (key == null) {
                                key = "null";
                            }
                            if (value.size() <= 1) {
                                value = value.get(0);
                            }
                            jSONObject2.put(key, value);
                        }
                        string = jSONObject2.toString();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (httpURLConnection != null) {
                        }
                        return string;
                    }
                } catch (JSONException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (httpURLConnection != null) {
                    }
                    return string;
                }
            } catch (IOException e4) {
                e = e4;
                httpURLConnection = null;
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return string;
            } catch (JSONException e5) {
                e = e5;
                httpURLConnection = null;
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
                if (r2 != 0) {
                    r2.disconnect();
                }
                throw th;
            }
            httpURLConnection.disconnect();
            return string;
        } catch (Throwable th4) {
            th = th4;
            r2 = strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (r2 != 0) {
                r2.disconnect();
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        return androidx.media3.datasource.cache.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(dataSpec);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 18:
                return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            case 19:
                return AmrExtractor.lambda$static$0();
            case 20:
                return FlacExtractor.lambda$static$0();
            case 21:
                return FlvExtractor.lambda$static$0();
            case 22:
            case 25:
            default:
                return Ac3Extractor.lambda$static$0();
            case 23:
                return MatroskaExtractor.lambda$static$1();
            case 24:
                return Mp3Extractor.lambda$static$0();
            case 26:
                return FragmentedMp4Extractor.lambda$static$1();
            case 27:
                return Mp4Extractor.lambda$static$1();
            case 28:
                return OggExtractor.lambda$static$0();
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        switch (this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 22:
                return Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
            default:
                return Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        int i2 = this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, z);
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        switch (this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 16:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        return androidx.media3.common.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2);
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        switch (this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 10:
                return DefaultGainProvider.lambda$static$0(j, j2);
            case 11:
                return DefaultGainProvider.lambda$static$1(j, j2);
            case 12:
                return DefaultGainProvider.lambda$static$2(j, j2);
            default:
                return DefaultGainProvider.lambda$static$3(j, j2);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch (this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return Transition.lambda$getInterpolator$1(f);
            case 2:
                return Transition.lambda$getInterpolator$2(f);
            case 3:
                return Transition.lambda$getInterpolator$3(f);
            case 4:
                return Transition.lambda$getInterpolator$4(f);
            case 5:
                return Transition.lambda$getInterpolator$5(f);
            case 6:
                return Transition.lambda$getInterpolator$6(f);
            default:
                return Transition.lambda$getInterpolator$7(f);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f1388O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, uri, map);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }
}
