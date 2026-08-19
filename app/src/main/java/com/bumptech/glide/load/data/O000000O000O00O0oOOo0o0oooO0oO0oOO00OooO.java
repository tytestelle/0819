package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f2876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Comparable f2877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Object f2878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, Comparable comparable, Object obj) {
        this.f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj;
        this.f2877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = comparable;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        switch (this.f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Object obj = this.f2876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (obj != null) {
                    try {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f2876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (obj2 != null) {
                    try {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        switch (this.f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                try {
                    Object objO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((AssetManager) this.f2878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (String) this.f2877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    this.f2876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = objO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(objO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
                    return;
                }
                break;
            default:
                try {
                    Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo((Uri) this.f2877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (ContentResolver) this.f2878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    this.f2876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e2);
                    }
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e2);
                }
                break;
        }
    }

    public abstract void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj);

    public abstract Object O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(AssetManager assetManager, String str);

    public abstract Object O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        int i = this.f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        switch (this.f2875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.LOCAL;
    }

    private final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }

    private final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
    }
}
