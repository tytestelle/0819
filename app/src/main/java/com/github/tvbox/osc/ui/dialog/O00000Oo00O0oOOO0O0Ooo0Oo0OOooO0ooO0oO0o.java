package com.github.tvbox.osc.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.Iterator;
import org.fourthline.cling.model.meta.Device;

/* JADX INFO: loaded from: classes.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3098O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f3099O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public LivePlayActivity f3100O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f3101O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Device f3102O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public ImageView f3103O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    @Override // O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Device device) {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3098O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(device);
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.notifyDataSetChanged();
    }

    @Override // O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Device device) {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3098O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Iterator it = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            Device device2 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) it.next()).f889O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (device2 != null && device2.equals(device)) {
                return;
            }
        }
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f887O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = device.getDetails().getFriendlyName();
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f889O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = device;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f888O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = device.getIdentity().getUdn().getIdentifierString();
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        Device device = this.f3102O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (device != null) {
            this.f3101O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(device);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3098O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
        }
        Device device = this.f3102O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f3101O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (device != null) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(device);
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(null);
    }
}
