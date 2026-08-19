package O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import com.bumptech.glide.load.data.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Comparable f203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Object f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, Comparable comparable, Object obj) {
        this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = comparable;
        this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    public static O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context, Uri uri, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(0, uri, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context).f2818O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context).f2819O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return InputStream.class;
            case 1:
                ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getClass();
                return InputStream.class;
            default:
                return ((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        switch (this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                InputStream inputStream = (InputStream) this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).close();
                } catch (IOException unused2) {
                    return;
                }
                break;
            default:
                Object obj = this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (obj != null) {
                    try {
                        switch (((O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) throws Throwable {
        Object objOpen;
        switch (this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                try {
                    InputStream inputStreamO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                    this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = inputStreamO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(inputStreamO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
                    }
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
                    return;
                }
                break;
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((String) this.f203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = byteArrayInputStreamO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(byteArrayInputStreamO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                } catch (IllegalArgumentException e2) {
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e2);
                }
                break;
            default:
                try {
                    O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    File file = (File) this.f203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    switch (o0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.f535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f205O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = objOpen;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(objOpen);
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e3);
                    }
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e3);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    public InputStream O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() throws Throwable {
        Cursor cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object r6;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        Uri uri = (Uri) this.f203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f204O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f206O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(uri);
                if (cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    try {
                        if (cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.moveToFirst()) {
                            string = cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getString(0);
                            cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
                        }
                    } catch (SecurityException e) {
                        e = e;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                        }
                        string = null;
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f208O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f209O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, inputStreamOpenInputStream2, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (IOException | NullPointerException e2) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = -1;
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = -1;
                        }
                        if (iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != -1) {
                            return new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(inputStreamOpenInputStream, iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                        }
                        return inputStreamOpenInputStream;
                    }
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f208O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e3) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e3));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f209O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, inputStreamOpenInputStream2, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = -1;
                    }
                    if (iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != -1) {
                        return new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(inputStreamOpenInputStream, iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
                }
            } catch (SecurityException e4) {
                e = e4;
                cursorO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
            } catch (Throwable th2) {
                th = th2;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
            string = null;
            zIsEmpty = TextUtils.isEmpty(string);
            contentResolver = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f208O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (zIsEmpty) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f209O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, inputStreamOpenInputStream2, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = -1;
            }
            if (iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != -1) {
                return new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(inputStreamOpenInputStream, iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        int i = this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        switch (this.f202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            case 1:
                break;
        }
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.LOCAL;
    }

    private final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
    }

    private final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
    }

    private final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
    }
}
