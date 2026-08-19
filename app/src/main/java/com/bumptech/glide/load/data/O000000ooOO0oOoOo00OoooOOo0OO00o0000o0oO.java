package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ int f2890O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f2890O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f2890O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) throws IOException {
        switch (this.f2890O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final Object O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(AssetManager assetManager, String str) {
        switch (this.f2890O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
