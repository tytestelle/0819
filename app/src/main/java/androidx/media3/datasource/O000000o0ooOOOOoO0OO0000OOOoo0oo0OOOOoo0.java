package androidx.media3.datasource;

import android.net.Uri;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Callable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2307O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ DataSourceBitmapLoader f2308O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2309O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(DataSourceBitmapLoader dataSourceBitmapLoader, Object obj, int i) {
        this.f2307O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2308O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = dataSourceBitmapLoader;
        this.f2309O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2307O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f2308O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$decodeBitmap$1((byte[]) this.f2309O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return this.f2308O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$loadBitmap$2((Uri) this.f2309O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }
}
