package androidx.media3.common;

import android.os.Bundle;
import android.util.Pair;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.common.collect.O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2233O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        this.f2233O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2233O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((Label) obj).toBundle();
            case 1:
                return Label.fromBundle((Bundle) obj);
            case 2:
                return Format.lambda$toLogString$0((Label) obj);
            case 3:
                return ((StreamKey) obj).toBundle();
            case 4:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 5:
                return StreamKey.fromBundle((Bundle) obj);
            case 6:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 7:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 8:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 9:
                return Format.fromBundle((Bundle) obj);
            case 10:
                return ((TrackSelectionOverride) obj).toBundle();
            case 11:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 12:
                return ((Tracks.Group) obj).toBundle();
            case 13:
                return Tracks.Group.fromBundle((Bundle) obj);
            case 14:
                return DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
            case 15:
                return CueGroup.lambda$static$0((Cue) obj);
            case 16:
                return Cue.fromBundle((Bundle) obj);
            case 17:
                return ((Cue) obj).toBinderBasedBundle();
            case 18:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            case 19:
                return ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj).lowerBound();
            case 20:
                return ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj).upperBound();
            default:
                return ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) obj).lowerBound();
        }
    }
}
