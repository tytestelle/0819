package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i));
        }
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(LocationListenerCompat locationListenerCompat, int i) {
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
    }
}
