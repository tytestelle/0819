package O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final int f789O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = R$id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f790O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ImageView f791O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(ImageView imageView) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(imageView, "Argument must not be null");
        this.f791O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = imageView;
        this.f790O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(imageView);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.f791O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setTag(f789O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f790O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) throws Throwable {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f790O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ImageView imageView = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == Integer.MIN_VALUE) && (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == Integer.MIN_VALUE)) {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
            return;
        }
        ArrayList arrayList = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!arrayList.contains(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            arrayList.add(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            viewTreeObserver.addOnPreDrawListener(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        Object tag = this.f791O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getTag(f789O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        if (tag == null) {
            return null;
        }
        if (tag instanceof O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Drawable drawable) {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f790O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ViewTreeObserver viewTreeObserver = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
    }

    public final String toString() {
        return "Target for: " + this.f791O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStop() {
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Drawable drawable) {
    }
}
