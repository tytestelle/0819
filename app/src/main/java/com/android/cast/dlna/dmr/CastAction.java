package com.android.cast.dlna.dmr;

import O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class CastAction implements Parcelable {
    public static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO CREATOR = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public String f2785O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f2786O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f2787O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public String f2788O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public CastAction(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.f2785O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        this.f2786O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str2;
        this.f2787O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str3;
        this.f2788O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(parcel, "parcel");
        parcel.writeString(this.f2785O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        parcel.writeString(this.f2786O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        parcel.writeString(this.f2787O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        parcel.writeString(this.f2788O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }
}
