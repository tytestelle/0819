package androidx.media3.ui;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2760O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, int i) {
        this.f2760O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2760O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((PlayerControlViewLayoutManager) this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0(valueAnimator);
                break;
            case 1:
                ((PlayerControlViewLayoutManager) this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$1(valueAnimator);
                break;
            case 2:
                ((PlayerControlViewLayoutManager) this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$2(valueAnimator);
                break;
            case 3:
                ((PlayerControlViewLayoutManager) this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$3(valueAnimator);
                break;
            default:
                ((DefaultTimeBar) this.f2761O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$1(valueAnimator);
                break;
        }
    }
}
