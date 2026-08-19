package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f446O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Context f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Context context, int i) {
        this.f446O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return AssetFileDescriptor.class;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f446O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this);
            case 2:
                return new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0);
            default:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Integer.class, AssetFileDescriptor.class));
        }
    }
}
