package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride {
    public final TrackGroup mediaTrackGroup;
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O trackIndices;
    private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
    private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);

    public TrackSelectionOverride(TrackGroup trackGroup, int i) {
        this(trackGroup, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(Integer.valueOf(i)));
    }

    @UnstableApi
    public static TrackSelectionOverride fromBundle(Bundle bundle) {
        return new TrackSelectionOverride(TrackGroup.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP))), (List<Integer>) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((int[]) Assertions.checkNotNull(bundle.getIntArray(FIELD_TRACKS))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionOverride.class != obj.getClass()) {
            return false;
        }
        TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
        return this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices);
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public int hashCode() {
        return (this.trackIndices.hashCode() * 31) + this.mediaTrackGroup.hashCode();
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.trackIndices));
        return bundle;
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
    }
}
