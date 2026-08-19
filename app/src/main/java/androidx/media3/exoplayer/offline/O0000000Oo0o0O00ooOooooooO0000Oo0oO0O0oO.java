package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(DownloadCursor downloadCursor) {
        return downloadCursor.getCount() == 0 || downloadCursor.getPosition() == downloadCursor.getCount();
    }

    public static boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(DownloadCursor downloadCursor) {
        return downloadCursor.getCount() == 0 || downloadCursor.getPosition() == -1;
    }

    public static boolean O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(DownloadCursor downloadCursor) {
        return downloadCursor.getPosition() == 0 && downloadCursor.getCount() != 0;
    }

    public static boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(DownloadCursor downloadCursor) {
        int count = downloadCursor.getCount();
        return downloadCursor.getPosition() == count + (-1) && count != 0;
    }

    public static boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(0);
    }

    public static boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getCount() - 1);
    }

    public static boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getPosition() + 1);
    }

    public static boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getPosition() - 1);
    }
}
