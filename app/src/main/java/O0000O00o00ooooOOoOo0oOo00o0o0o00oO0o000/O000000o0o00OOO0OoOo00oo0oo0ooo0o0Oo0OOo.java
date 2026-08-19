package O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f783O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final WeakReference f784O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.f784O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new WeakReference(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f783O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f784O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                    ArrayList arrayList = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f787O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (!arrayList.isEmpty()) {
                        ImageView imageView = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f786O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == Integer.MIN_VALUE) {
                            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) it.next())).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
                                }
                                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                }
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f788O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f784O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
                    ArrayList arrayList2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        int paddingRight2 = imageView2.getPaddingRight() + imageView2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(imageView2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 == Integer.MIN_VALUE) {
                            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 > 0 || iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) it2.next())).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3, iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                }
                                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                                arrayList2.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        this.f784O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new WeakReference(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }
}
