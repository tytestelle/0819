package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j, byte[] bArr, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(16), (ArrayList) Assertions.checkNotNull(bundle.getParcelableArrayList(BUNDLE_FIELD_CUES))), j, bundle.getLong("d"));
    }
}
