package O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final int f775O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = R$id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ImageView f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Animatable f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ int f779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ImageView imageView, int i) {
        this.f779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(imageView, "Argument must not be null");
        this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = imageView;
        this.f777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(imageView);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTag(f775O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(obj);
        if (!(obj instanceof Animatable)) {
            this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = animatable;
        animatable.start();
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) throws Throwable {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ImageView imageView = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == Integer.MIN_VALUE) && (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == Integer.MIN_VALUE)) {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
            return;
        }
        ArrayList arrayList = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!arrayList.contains(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            arrayList.add(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            viewTreeObserver.addOnPreDrawListener(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Drawable drawable) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(null);
        this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setImageDrawable(drawable);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Drawable drawable) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(null);
        this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setImageDrawable(drawable);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        Object tag = this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getTag(f775O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        if (tag == null) {
            return null;
        }
        if (tag instanceof O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return (O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Drawable drawable) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f777O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ViewTreeObserver viewTreeObserver = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
        Animatable animatable = this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (animatable != null) {
            animatable.stop();
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(null);
        this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setImageDrawable(drawable);
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Object obj) {
        switch (this.f779O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            case 0:
                this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStart() {
        Animatable animatable = this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void onStop() {
        Animatable animatable = this.f778O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
