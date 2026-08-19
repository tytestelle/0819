package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f473O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f474O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, int i) {
        this.f473O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f474O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f473O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f473O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(bArr), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(bArr, (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f474O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 1));
            case 1:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj), new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(1, obj.toString(), (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f474O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
            default:
                File file = (File) obj;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file), new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(2, file, (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f474O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        }
    }
}
