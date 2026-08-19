package xyz.doikki.videoplayer.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerUtils {
    public static final int NETWORK_CLOSED = 1;
    public static final int NETWORK_ETHERNET = 2;
    public static final int NETWORK_MOBILE = 4;
    public static final int NETWORK_UNKNOWN = -1;
    public static final int NETWORK_WIFI = 3;
    public static final int NO_NETWORK = 0;
    private static long lastTimeStamp;
    private static long lastTotalRxBytes;

    private PlayerUtils() {
    }

    public static int dp2px(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    @SuppressLint({"PrivateApi"})
    @Deprecated
    public static Application getApplication() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getCurrentSystemTime() {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
    }

    public static int getNavigationBarHeight(Context context) {
        if (!hasNavigationBar(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static long getNetSpeed(Context context) {
        if (context == null) {
            return 0L;
        }
        long totalRxBytes = TrafficStats.getUidRxBytes(context.getApplicationInfo().uid) == -1 ? 0L : TrafficStats.getTotalRxBytes();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - lastTimeStamp;
        if (j == 0) {
            return j;
        }
        long j2 = ((totalRxBytes - lastTotalRxBytes) * 1000) / j;
        lastTimeStamp = jCurrentTimeMillis;
        lastTotalRxBytes = totalRxBytes;
        return j2;
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        if (!activeNetworkInfo.isConnected()) {
            return 1;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 2;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 3;
        }
        if (activeNetworkInfo.getType() != 0) {
            return -1;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 20) {
            return 4;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 4;
            default:
                return -1;
        }
    }

    public static int getScreenHeight(Context context, boolean z) {
        if (!z) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return getNavigationBarHeight(context) + context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context, boolean z) {
        if (!z) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return getNavigationBarHeight(context) + context.getResources().getDisplayMetrics().widthPixels;
    }

    @NonNull
    public static <T> List<T> getSnapshot(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static double getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static double getStatusBarHeightPortrait(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height_portrait", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static WindowManager getWindowManager(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static boolean hasNavigationBar(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return (point2.x == point.x && point2.y == point.y) ? false : true;
    }

    public static boolean isEdge(Context context, MotionEvent motionEvent) {
        int iDp2px = dp2px(context, 40.0f);
        float f = iDp2px;
        return motionEvent.getRawX() < f || motionEvent.getRawX() > ((float) (getScreenWidth(context, true) - iDp2px)) || motionEvent.getRawY() < f || motionEvent.getRawY() > ((float) (getScreenHeight(context, true) - iDp2px));
    }

    public static Activity scanForActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int sp2px(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static String stringForTime(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        return i5 > 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public static String stringForTimeVod(int i) {
        int i2 = i / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i2 / 3600), Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }
}
