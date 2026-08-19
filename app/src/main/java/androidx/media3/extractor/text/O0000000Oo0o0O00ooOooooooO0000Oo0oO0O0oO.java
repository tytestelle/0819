package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2737O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
            default:
                return ((Cue) obj).toSerializableBundle();
        }
    }
}
