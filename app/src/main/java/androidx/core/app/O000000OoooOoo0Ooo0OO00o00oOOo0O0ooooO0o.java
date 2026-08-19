package androidx.core.app;

import android.content.ClipData;
import android.location.LocationRequest;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static /* bridge */ /* synthetic */ LocationRequest O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* synthetic */ ContentInfo.Builder O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
    }
}
