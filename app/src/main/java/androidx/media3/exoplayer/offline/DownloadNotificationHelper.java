package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (Build.VERSION.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_failed);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    public Notification buildProgressNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        float percentDownloaded;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i7 = 0;
        boolean z9 = true;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Download download = list.get(i8);
            int i9 = download.state;
            if (i9 == 0) {
                z6 = true;
            } else if (i9 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            } else if (i9 == 5) {
                z8 = true;
            } else if (i9 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            }
        }
        if (!z5) {
            if (z6 && i2 != 0) {
                i3 = (i2 & 2) != 0 ? R.string.exo_download_paused_for_wifi : (i2 & 1) != 0 ? R.string.exo_download_paused_for_network : R.string.exo_download_paused;
                z = false;
            } else if (z8) {
                i4 = R.string.exo_download_removing;
            } else {
                z = true;
                i3 = 0;
            }
            if (z) {
                i5 = 0;
                i6 = 0;
                z2 = false;
            } else if (z5) {
                int i10 = (int) (f / i7);
                if (z9 && z7) {
                    z4 = true;
                }
                i6 = i10;
                z2 = z4;
                i5 = 100;
            } else {
                i5 = 100;
                i6 = 0;
                z2 = true;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
        }
        i4 = R.string.exo_download_downloading;
        i3 = i4;
        z = true;
        if (z) {
            i5 = 0;
            i6 = 0;
            z2 = false;
        } else if (z5) {
            int i11 = (int) (f / i7);
            if (z9) {
                z4 = true;
            }
            i6 = i11;
            z2 = z4;
            i5 = 100;
        } else {
            i5 = 100;
            i6 = 0;
            z2 = true;
        }
        return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
    }
}
