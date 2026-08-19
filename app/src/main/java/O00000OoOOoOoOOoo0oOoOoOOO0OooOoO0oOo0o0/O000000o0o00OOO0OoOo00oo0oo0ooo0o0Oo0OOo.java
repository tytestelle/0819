package O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final String[] f546O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = {"_data"};

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f548O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f549O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Uri f550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final int f552O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f553O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final Class f554O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public volatile boolean f555O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f556O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Context context, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1, Uri uri, int i, int i2, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, Class cls) {
        this.f547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context.getApplicationContext();
        this.f548O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f549O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1;
        this.f550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = uri;
        this.f551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
        this.f552O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i2;
        this.f553O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f554O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = cls;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f554O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f556O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    public final com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() throws Throwable {
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f553O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        int i = this.f552O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int i2 = this.f551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f546O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f548O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file, i2, i, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            boolean zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(requireOriginal);
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f549O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO && requireOriginal.getPathSegments().contains("picker")) {
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(requireOriginal, i2, i, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(requireOriginal, i2, i, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            }
        }
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f509O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) throws Throwable {
        try {
            com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new IllegalArgumentException("Failed to build fetcher for: " + this.f550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
            } else {
                this.f556O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (this.f555O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    cancel();
                } else {
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                }
            }
        } catch (FileNotFoundException e) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        this.f555O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = true;
        com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f556O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.LOCAL;
    }
}
