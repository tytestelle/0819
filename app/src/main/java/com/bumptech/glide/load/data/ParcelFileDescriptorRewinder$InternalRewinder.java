package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ParcelFileDescriptor f2898O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2898O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f2898O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
