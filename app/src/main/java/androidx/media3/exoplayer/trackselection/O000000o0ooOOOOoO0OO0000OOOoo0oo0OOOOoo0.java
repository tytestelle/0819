package androidx.media3.exoplayer.trackselection;

import android.os.Bundle;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2697O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2697O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((TrackGroupArray) obj).toBundle();
            case 1:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 2:
                return TrackGroupArray.fromBundle((Bundle) obj);
            default:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
        }
    }
}
