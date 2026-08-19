package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {
    private static final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo CUES_PRIORITY_COMPARATOR = O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural().onResultOf(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(15));

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O cues;

    @UnstableApi
    public final long presentationTimeUs;

    @UnstableApi
    public CueGroup(List<Cue> list, long j) {
        this.cues = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.sortedCopyOf(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j;
    }

    private static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O filterOutBitmapCues(List<Cue> list) {
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(list.get(i));
            }
        }
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of() : BundleCollectionUtil.fromBundleList(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(16), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(Cue cue) {
        return Integer.valueOf(cue.zIndex);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(17)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
