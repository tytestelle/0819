package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Tracks {
    public static final Tracks EMPTY = new Tracks(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

        @UnstableApi
        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = false;
            Assertions.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.adaptiveSupported = z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        @UnstableApi
        public static Group fromBundle(Bundle bundle) {
            TrackGroup trackGroupFromBundle = TrackGroup.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        @UnstableApi
        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Group.class != obj.getClass()) {
                return false;
            }
            Group group = (Group) obj;
            return this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected);
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        @UnstableApi
        public int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            for (boolean z : this.trackSelected) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            return i2 == 4 || (z && i2 == 3);
        }
    }

    @UnstableApi
    public Tracks(List<Group> list) {
        this.groups = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
    }

    @UnstableApi
    public static Tracks fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : BundleCollectionUtil.fromBundleList(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(13), parcelableArrayList));
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            Group group = (Group) this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(12)));
        return bundle;
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i && ((Group) this.groups.get(i2)).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }
}
