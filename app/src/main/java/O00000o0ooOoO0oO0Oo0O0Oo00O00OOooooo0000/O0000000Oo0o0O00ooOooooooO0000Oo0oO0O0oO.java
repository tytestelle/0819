package O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f642O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f642O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f642O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        switch (this.f642O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((ByteBuffer) obj, 9);
            case 1:
                return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
            default:
                return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo((ParcelFileDescriptor) obj);
        }
    }
}
