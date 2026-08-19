package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj, int i, int i2) {
        this.f1113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1113O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i != -1) {
                    o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.notifyItemChanged(i);
                }
                int i2 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i2 != -1) {
                    o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.notifyItemChanged(i2);
                }
                break;
            case 1:
                O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i3 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1166O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1166O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i3 != -1) {
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.notifyItemChanged(i3);
                }
                int i4 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1166O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i4 != -1) {
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.notifyItemChanged(i4);
                }
                break;
            case 2:
                O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = (O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i5 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i5 != -1) {
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemChanged(i5);
                }
                int i6 = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i6 != -1) {
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemChanged(i6);
                }
                break;
            case 3:
                O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = (O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i7 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1191O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1191O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i7 != -1) {
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.notifyItemChanged(i7);
                }
                int i8 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1191O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i8 != -1) {
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.notifyItemChanged(i8);
                }
                break;
            case 4:
                O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO = (O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i9 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i9 != -1) {
                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.notifyItemChanged(i9);
                }
                int i10 = o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i10 != -1) {
                    o0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.notifyItemChanged(i10);
                }
                break;
            case 5:
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i11 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i11 != -1) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(i11);
                }
                int i12 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i12 != -1) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(i12);
                }
                break;
            case 6:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i13 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i13 != -1) {
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemChanged(i13);
                }
                int i14 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i14 != -1) {
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemChanged(i14);
                }
                break;
            case 7:
                CustomRecyclerView.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((CustomRecyclerView) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 8:
                Object obj = this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i15 = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                App app = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1418O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 != null) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1418O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.cancel();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1418O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = null;
                }
                View viewInflate = LayoutInflater.from(app).inflate(R.layout.dialog_toast_stytle, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.ToastText);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ToastStytle);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.ToastDrawable);
                textView.setText(obj + "");
                if (i15 == 0) {
                    linearLayout.setBackgroundResource(R.drawable.shape_toast_success_drawable);
                    textView.setTextColor(Color.parseColor("#ff67c23a"));
                    imageView.setImageResource(R.drawable.icon_toast_success);
                } else if (i15 == 1) {
                    linearLayout.setBackgroundResource(R.drawable.shape_toast_erreo_drawable);
                    textView.setTextColor(Color.parseColor("#fff56c6c"));
                    imageView.setImageResource(R.drawable.icon_toast_error);
                } else if (i15 == 2) {
                    linearLayout.setBackgroundResource(R.drawable.shape_toast_hint_drawable);
                    textView.setTextColor(Color.parseColor("#ffe6a23c"));
                    imageView.setImageResource(R.drawable.icon_toast_hint);
                }
                Toast toast = new Toast(app);
                toast.setDuration(0);
                toast.setView(viewInflate);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1418O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = toast;
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1418O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.show();
                break;
            case 9:
                ((ResourcesCompat.FontCallback) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$callbackFailAsync$1(this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 10:
                ((AudioRendererEventListener.EventDispatcher) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$audioSessionIdChanged$12(this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 11:
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i16 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i16 != -1) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.notifyItemChanged(i16);
                }
                int i17 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (i17 != -1) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.notifyItemChanged(i17);
                }
                break;
            case 12:
                O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O = ((com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f3292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int i18 = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i18 != -1) {
                    o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.notifyItemChanged(i18);
                }
                int i19 = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i19 != -1) {
                    o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.notifyItemChanged(i19);
                }
                break;
            default:
                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 = ((com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo) this.f1115O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f3294O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int i20 = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1114O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i20 != -1) {
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(i20);
                }
                int i21 = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (i21 != -1) {
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(i21);
                }
                break;
        }
    }
}
