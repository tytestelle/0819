package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ int f2874O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ContentResolver contentResolver, Uri uri, int i) {
        super(1, uri, contentResolver);
        this.f2874O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f2874O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) throws IOException {
        switch (this.f2874O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final Object O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        switch (this.f2874O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
