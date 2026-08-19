package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements ExtractorsFactory, Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Object f2619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2) {
        this.f2619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f2620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f2619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).lambda$downstreamFormatChanged$5((MediaLoadData) this.f2620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return ((DefaultMediaSourceFactory) this.f2619O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).lambda$createMediaSource$0((Format) this.f2620O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, uri, map);
    }
}
