package O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.cast.dlna.dmr.CastAction;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(parcel, "parcel");
        return new CastAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), 16);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CastAction[i];
    }
}
