package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CueEncoder {
    public byte[] encode(List<Cue> list, long j) {
        ArrayList<Bundle> bundleArrayList = BundleCollectionUtil.toBundleArrayList(list, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
