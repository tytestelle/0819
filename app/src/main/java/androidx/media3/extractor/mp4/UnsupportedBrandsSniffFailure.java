package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, @Nullable int[] iArr) {
        this.majorBrand = i;
        this.compatibleBrands = iArr != null ? O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.copyOf(iArr) : O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.of();
    }
}
