package androidx.media3.extractor.ts;

import android.net.Uri;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements ReorderingBufferQueue.OutputConsumer, ExtractorsFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2744O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2745O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i) {
        this.f2744O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2745O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        switch (this.f2744O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((UserDataReader) this.f2745O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0(j, parsableByteArray);
                break;
            default:
                ((SeiReader) this.f2745O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0(j, parsableByteArray);
                break;
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return TsExtractor.lambda$newFactory$0((SubtitleParser.Factory) this.f2745O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, uri, map);
    }
}
