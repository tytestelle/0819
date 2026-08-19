package O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final String[] f198O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = {"_data"};

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final String[] f199O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = {"_data"};

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ContentResolver f201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ContentResolver contentResolver, int i) {
        this.f200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = contentResolver;
    }

    @Override // O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Cursor O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Uri uri) {
        switch (this.f200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f198O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f201O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f199O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
