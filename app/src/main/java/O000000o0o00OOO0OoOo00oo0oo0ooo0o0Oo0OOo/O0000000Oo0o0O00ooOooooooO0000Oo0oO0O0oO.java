package O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static /* bridge */ /* synthetic */ NotificationChannel O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* synthetic */ JobWorkItem O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ AutofillId O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Object obj) {
        return (AutofillId) obj;
    }
}
