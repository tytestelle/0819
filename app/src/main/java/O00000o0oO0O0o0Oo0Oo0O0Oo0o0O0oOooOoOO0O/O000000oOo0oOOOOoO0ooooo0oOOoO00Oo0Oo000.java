package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 1:
                this.f583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                break;
            default:
                this.f583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                break;
        }
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final /* bridge */ /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f582O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ImageDecoder.createSource((ByteBuffer) obj), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            default:
                return this.f583O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ImageDecoder.createSource(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((InputStream) obj)), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        }
    }
}
