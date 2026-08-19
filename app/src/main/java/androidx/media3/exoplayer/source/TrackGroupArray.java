package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackGroupArray {
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private static final String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O trackGroups;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.trackGroups = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public static TrackGroupArray fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return parcelableArrayList == null ? new TrackGroupArray(new TrackGroup[0]) : new TrackGroupArray((TrackGroup[]) BundleCollectionUtil.fromBundleList(new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(4), parcelableArrayList).toArray(new TrackGroup[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getTrackTypes$0(TrackGroup trackGroup) {
        return Integer.valueOf(trackGroup.type);
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.trackGroups.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.trackGroups.size(); i3++) {
                if (((TrackGroup) this.trackGroups.get(i)).equals(this.trackGroups.get(i3))) {
                    Log.e(TAG, "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups);
    }

    public TrackGroup get(int i) {
        return (TrackGroup) this.trackGroups.get(i);
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getTrackTypes() {
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(this.trackGroups, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(2)));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
        }
        return this.hashCode;
    }

    public int indexOf(TrackGroup trackGroup) {
        int iIndexOf = this.trackGroups.indexOf(trackGroup);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.trackGroups, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(3)));
        return bundle;
    }

    public String toString() {
        return this.trackGroups.toString();
    }
}
