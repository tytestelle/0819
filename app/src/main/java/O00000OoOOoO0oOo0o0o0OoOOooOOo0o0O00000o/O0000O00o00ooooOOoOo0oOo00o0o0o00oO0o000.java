package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 f534O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(0);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(int i) {
        this.f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public static ByteArrayInputStream O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        switch (this.f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, File file, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws Throwable {
        try {
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f536O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class, InputStream.class));
            case 2:
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(1), 0);
            case 4:
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(3), 0);
            case 6:
                return new O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(1);
            case 10:
                return new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Uri.class, AssetFileDescriptor.class), 0);
            case 11:
                return new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Uri.class, ParcelFileDescriptor.class), 0);
            case 12:
                return new O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Uri.class, InputStream.class), 0);
        }
    }
}
