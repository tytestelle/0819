package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, O00000OOoOOO00O00o0ooooooooO000ooooO0000 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f2085O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i, boolean z) {
        this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(assetManager, str, 1);
    }

    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (((Thread) this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) == Thread.currentThread()) {
            return;
        }
        throw new Error("All QuickJS methods must be called on the same thread. Invalid QuickJS thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + ((Thread) this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o
    public com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Uri uri) {
        return new com.bumptech.glide.load.data.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((ContentResolver) this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, uri, 1);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 3:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((AssetManager) this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this);
            default:
                return new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this);
        }
    }

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, int i) {
        this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 4:
                this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(500L);
                break;
            case 5:
            default:
                this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                new HashMap();
                break;
            case 6:
                this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                break;
        }
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(com.bumptech.glide.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 8;
        this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Collections.unmodifiableMap(new HashMap(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Context context) {
        this.f2086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(context, 0);
    }
}
