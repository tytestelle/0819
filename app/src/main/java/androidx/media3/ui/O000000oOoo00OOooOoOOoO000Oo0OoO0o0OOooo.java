package androidx.media3.ui;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2762O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2763O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, int i) {
        this.f2762O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2763O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f2762O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((PlayerControlViewLayoutManager) this.f2763O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((PlayerControlView) this.f2763O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
