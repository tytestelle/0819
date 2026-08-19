package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.android.AndroidUpnpService;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.meta.Device;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends RecyclerView.Adapter implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f1108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) viewHolder;
        int layoutPosition = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getLayoutPosition();
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.itemView.setTag(Integer.valueOf(layoutPosition));
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f887O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setText(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f888O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setImageResource(R.drawable.icon_cast_tv);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        int iIntValue = ((Integer) view.getTag()).intValue();
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
            Device device = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(iIntValue)).f889O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3102O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = device;
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3101O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(device, "device");
            AndroidUpnpService androidUpnpService = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f55O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            UpnpService upnpService = androidUpnpService != null ? androidUpnpService.get() : null;
            if (upnpService == null) {
                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f92O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            } else {
                LinkedHashMap linkedHashMap = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f58O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) linkedHashMap.get(device);
                if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    ControlPoint controlPoint = upnpService.getControlPoint();
                    kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(controlPoint, "getControlPoint(...)");
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(controlPoint, device, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                    linkedHashMap.put(device, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                }
                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            }
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3099O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_cast, viewGroup, false));
    }

    public void setOnSelectListener(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f1108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }
}
