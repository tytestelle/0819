package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, @StringRes int i, @StringRes int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
            androidx.emoji2.text.flatbuffer.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
            NotificationChannel notificationChannelO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = androidx.emoji2.text.flatbuffer.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i3, str, context.getString(i));
            if (i2 != 0) {
                notificationChannelO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannelO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
    }

    public static void setNotification(Context context, int i, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }
}
