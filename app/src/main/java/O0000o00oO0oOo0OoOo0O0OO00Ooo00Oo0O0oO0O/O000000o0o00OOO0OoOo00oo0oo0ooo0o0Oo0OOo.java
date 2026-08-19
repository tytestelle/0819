package O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;

import android.animation.ValueAnimator;
import com.warkiz.widget.IndicatorSeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ float f1648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f1649O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ IndicatorSeekBar f1650O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(IndicatorSeekBar indicatorSeekBar, float f, int i) {
        this.f1650O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = indicatorSeekBar;
        this.f1648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = f;
        this.f1649O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IndicatorSeekBar indicatorSeekBar = this.f1650O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        indicatorSeekBar.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = indicatorSeekBar.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        float f = indicatorSeekBar.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0[this.f1649O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO];
        float f2 = this.f1648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (f2 - f > 0.0f) {
            indicatorSeekBar.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f2 - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else {
            indicatorSeekBar.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = ((Float) valueAnimator.getAnimatedValue()).floatValue() + f2;
        }
        indicatorSeekBar.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(indicatorSeekBar.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        indicatorSeekBar.setSeekListener(false);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = indicatorSeekBar.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && indicatorSeekBar.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            indicatorSeekBar.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
        }
        indicatorSeekBar.invalidate();
    }
}
