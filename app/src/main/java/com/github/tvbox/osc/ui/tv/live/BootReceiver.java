package com.github.tvbox.osc.ui.tv.live;

import O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.github.tvbox.osc.ui.tv.live.BootReceiver;
import com.orhanobut.hawk.Hawk;

/* JADX INFO: loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static boolean f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Handler f3347O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Handler();

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(final Context context) {
        String strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(context);
        boolean zO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        Handler handler = this.f3347O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zO00000OOoOOO00O00o0ooooooooO000ooooO0000 && (strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null || strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.equals("0.0.0.0"))) {
            final int i = 0;
            handler.postDelayed(new Runnable(this) { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o

                /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
                public final /* synthetic */ BootReceiver f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

                {
                    this.f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    BootReceiver bootReceiver = this.f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    switch (i) {
                        case 0:
                            boolean z = BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            bootReceiver.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2);
                            break;
                        default:
                            boolean z2 = BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            bootReceiver.getClass();
                            Intent intent = new Intent(context2, (Class<?>) LoginActivity.class);
                            intent.addFlags(268435456);
                            context2.startActivity(intent);
                            BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
                            break;
                    }
                }
            }, 1000L);
        } else {
            final int i2 = 1;
            handler.postDelayed(new Runnable(this) { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o

                /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
                public final /* synthetic */ BootReceiver f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

                {
                    this.f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    BootReceiver bootReceiver = this.f1368O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    switch (i2) {
                        case 0:
                            boolean z = BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            bootReceiver.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2);
                            break;
                        default:
                            boolean z2 = BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            bootReceiver.getClass();
                            Intent intent = new Intent(context2, (Class<?>) LoginActivity.class);
                            intent.addFlags(268435456);
                            context2.startActivity(intent);
                            BootReceiver.f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
                            break;
                    }
                }
            }, 6000L);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zBooleanValue = ((Boolean) Hawk.get("开机自启", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1463O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0))).booleanValue();
        if (f3346O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO || !zBooleanValue) {
            return;
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context);
    }
}
