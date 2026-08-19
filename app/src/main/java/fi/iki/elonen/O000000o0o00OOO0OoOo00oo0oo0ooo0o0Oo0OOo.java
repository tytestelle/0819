package fi.iki.elonen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final File f3947O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final FileOutputStream f3948O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f3947O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = fileCreateTempFile;
        this.f3948O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new FileOutputStream(fileCreateTempFile);
    }
}
