package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o f581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, int i) {
        this.f580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= IjkMediaMeta.AV_CH_STEREO_LEFT) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f580O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = this.f581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((ByteBuffer) obj, 3, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f609O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f608O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f604O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
            default:
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = this.f581O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((ParcelFileDescriptor) obj, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.f609O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.f608O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f604O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        }
    }
}
