package androidx.media3.extractor.text.webvtt;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Comparator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2742O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2742O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2742O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj, (WebvttCueParser.Element) obj2);
            default:
                return WebvttSubtitle.lambda$getCues$0((WebvttCueInfo) obj, (WebvttCueInfo) obj2);
        }
    }
}
