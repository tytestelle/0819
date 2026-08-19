package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final String[] f499O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = {"_data"};

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Object obj, Object obj2, int i) {
        this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return File.class;
            default:
                return ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        int i = this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        Object objWrap;
        switch (this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Cursor cursorQuery = ((Context) this.f501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).getContentResolver().query((Uri) this.f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, f499O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new File(string));
                    return;
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)));
                return;
            default:
                O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                byte[] bArr = (byte[]) this.f501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                switch (o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(objWrap);
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        int i = this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        switch (this.f500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.LOCAL;
    }

    private final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }

    private final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
    }

    private final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
    }

    private final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
    }
}
