package androidx.media3.exoplayer;

import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.text.TextOutput;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements TextOutput {
    @Override // androidx.media3.exoplayer.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public final /* synthetic */ void onCues(List list) {
        androidx.media3.exoplayer.text.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, list);
    }
}
