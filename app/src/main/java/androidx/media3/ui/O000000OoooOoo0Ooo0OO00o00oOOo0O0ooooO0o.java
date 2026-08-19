package androidx.media3.ui;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2750O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, int i) {
        this.f2750O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2750O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((PlayerControlView.AudioTrackSelectionAdapter) this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((PlayerControlView.SettingViewHolder) this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0(view);
                break;
            case 2:
                ((PlayerControlView.TextTrackSelectionAdapter) this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 3:
                ((PlayerControlViewLayoutManager) this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onOverflowButtonClick(view);
                break;
            default:
                ((PlayerControlView) this.f2751O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).onFullscreenButtonClicked(view);
                break;
        }
    }
}
