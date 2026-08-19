package com.bumptech.glide.load.data;

import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2883O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        switch (this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
            case 2:
                break;
            default:
                ((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        switch (this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).rewind();
            case 2:
                return this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            default:
                O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.reset();
                return o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        }
    }

    public ParcelFileDescriptor O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).rewind();
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(InputStream inputStream, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 3;
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(inputStream, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.mark(5242880);
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        this.f2884O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    private final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
    }

    private final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }
}
