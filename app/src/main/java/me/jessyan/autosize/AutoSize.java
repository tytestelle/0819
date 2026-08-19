package me.jessyan.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import java.util.Locale;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.unit.Subunits;
import me.jessyan.autosize.utils.AutoSizeLog;
import me.jessyan.autosize.utils.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoSize {
    private static final int MODE_DEVICE_SIZE = Integer.MIN_VALUE;
    private static final int MODE_MASK = -1073741824;
    private static final int MODE_ON_WIDTH = 1073741824;
    private static final int MODE_SHIFT = 30;
    private static SparseArray<DisplayMetricsInfo> mCache = new SparseArray<>();

    /* JADX INFO: renamed from: me.jessyan.autosize.AutoSize$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$me$jessyan$autosize$unit$Subunits;

        static {
            int[] iArr = new int[Subunits.values().length];
            $SwitchMap$me$jessyan$autosize$unit$Subunits = iArr;
            try {
                iArr[Subunits.PT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.MM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$me$jessyan$autosize$unit$Subunits[Subunits.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AutoSize() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void autoConvertDensity(Activity activity, float f, boolean z) {
        float density;
        int densityDpi;
        float scaledDensity;
        int screenWidthDp;
        int screenHeightDp;
        float f2;
        float initScaledDensity;
        Preconditions.checkNotNull(activity, "activity == null");
        Preconditions.checkMainThread();
        float designWidth = z ? AutoSizeConfig.getInstance().getUnitsManager().getDesignWidth() : AutoSizeConfig.getInstance().getUnitsManager().getDesignHeight();
        if (designWidth <= 0.0f) {
            designWidth = f;
        }
        int iRound = Math.round(AutoSizeConfig.getInstance().getInitScaledDensity() * (f + designWidth + (z ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight())));
        int i = z ? 1073741824 | (iRound & 1073741823) : iRound & 1073741823;
        int i2 = AutoSizeConfig.getInstance().isUseDeviceSize() ? i | Integer.MIN_VALUE : i & Integer.MAX_VALUE;
        DisplayMetricsInfo displayMetricsInfo = mCache.get(i2);
        if (displayMetricsInfo == null) {
            density = ((z ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / f;
            if (AutoSizeConfig.getInstance().getPrivateFontScale() > 0.0f) {
                initScaledDensity = AutoSizeConfig.getInstance().getPrivateFontScale() * density;
            } else {
                initScaledDensity = (AutoSizeConfig.getInstance().isExcludeFontScale() ? 1.0f : (AutoSizeConfig.getInstance().getInitScaledDensity() * 1.0f) / AutoSizeConfig.getInstance().getInitDensity()) * density;
            }
            densityDpi = (int) (160.0f * density);
            screenWidthDp = (int) (AutoSizeConfig.getInstance().getScreenWidth() / density);
            screenHeightDp = (int) (AutoSizeConfig.getInstance().getScreenHeight() / density);
            float screenWidth = ((z ? AutoSizeConfig.getInstance().getScreenWidth() : AutoSizeConfig.getInstance().getScreenHeight()) * 1.0f) / designWidth;
            mCache.put(i2, new DisplayMetricsInfo(density, densityDpi, initScaledDensity, screenWidth, screenWidthDp, screenHeightDp));
            scaledDensity = initScaledDensity;
            f2 = screenWidth;
        } else {
            density = displayMetricsInfo.getDensity();
            densityDpi = displayMetricsInfo.getDensityDpi();
            scaledDensity = displayMetricsInfo.getScaledDensity();
            float xdpi = displayMetricsInfo.getXdpi();
            screenWidthDp = displayMetricsInfo.getScreenWidthDp();
            screenHeightDp = displayMetricsInfo.getScreenHeightDp();
            f2 = xdpi;
        }
        setDensity(activity, density, densityDpi, scaledDensity, f2);
        setScreenSizeDp(activity, screenWidthDp, screenHeightDp);
        AutoSizeLog.d(String.format(Locale.ENGLISH, "The %s has been adapted! \n%s Info: isBaseOnWidth = %s, %s = %f, %s = %f, targetDensity = %f, targetScaledDensity = %f, targetDensityDpi = %d, targetXdpi = %f, targetScreenWidthDp = %d, targetScreenHeightDp = %d", activity.getClass().getName(), activity.getClass().getSimpleName(), Boolean.valueOf(z), z ? "designWidthInDp" : "designHeightInDp", Float.valueOf(f), z ? "designWidthInSubunits" : "designHeightInSubunits", Float.valueOf(designWidth), Float.valueOf(density), Float.valueOf(scaledDensity), Integer.valueOf(densityDpi), Float.valueOf(f2), Integer.valueOf(screenWidthDp), Integer.valueOf(screenHeightDp)));
    }

    public static void autoConvertDensityBaseOnHeight(Activity activity, float f) {
        autoConvertDensity(activity, f, false);
    }

    public static void autoConvertDensityBaseOnWidth(Activity activity, float f) {
        autoConvertDensity(activity, f, true);
    }

    public static void autoConvertDensityOfCustomAdapt(Activity activity, CustomAdapt customAdapt) {
        Preconditions.checkNotNull(customAdapt, "customAdapt == null");
        float sizeInDp = customAdapt.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = customAdapt.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(activity, sizeInDp, customAdapt.isBaseOnWidth());
    }

    public static void autoConvertDensityOfExternalAdaptInfo(Activity activity, ExternalAdaptInfo externalAdaptInfo) {
        Preconditions.checkNotNull(externalAdaptInfo, "externalAdaptInfo == null");
        float sizeInDp = externalAdaptInfo.getSizeInDp();
        if (sizeInDp <= 0.0f) {
            sizeInDp = externalAdaptInfo.isBaseOnWidth() ? AutoSizeConfig.getInstance().getDesignWidthInDp() : AutoSizeConfig.getInstance().getDesignHeightInDp();
        }
        autoConvertDensity(activity, sizeInDp, externalAdaptInfo.isBaseOnWidth());
    }

    public static void autoConvertDensityOfGlobal(Activity activity) {
        if (AutoSizeConfig.getInstance().isBaseOnWidth()) {
            autoConvertDensityBaseOnWidth(activity, AutoSizeConfig.getInstance().getDesignWidthInDp());
        } else {
            autoConvertDensityBaseOnHeight(activity, AutoSizeConfig.getInstance().getDesignHeightInDp());
        }
    }

    public static void cancelAdapt(Activity activity) {
        float f;
        Preconditions.checkMainThread();
        float initXdpi = AutoSizeConfig.getInstance().getInitXdpi();
        int i = AnonymousClass1.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i != 1) {
            f = i == 2 ? 25.4f : 72.0f;
            setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
            setScreenSizeDp(activity, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
        }
        initXdpi /= f;
        setDensity(activity, AutoSizeConfig.getInstance().getInitDensity(), AutoSizeConfig.getInstance().getInitDensityDpi(), AutoSizeConfig.getInstance().getInitScaledDensity(), initXdpi);
        setScreenSizeDp(activity, AutoSizeConfig.getInstance().getInitScreenWidthDp(), AutoSizeConfig.getInstance().getInitScreenHeightDp());
    }

    public static void checkAndInit(Application application) {
        if (checkInit()) {
            return;
        }
        AutoSizeConfig.getInstance().setLog(true).init(application).setUseDeviceSize(false);
    }

    public static boolean checkInit() {
        return AutoSizeConfig.getInstance().getInitDensity() != -1.0f;
    }

    private static DisplayMetrics getMetricsOnMiui(Resources resources) {
        if (AutoSizeConfig.getInstance().isMiui() && AutoSizeConfig.getInstance().getTmpMetricsField() != null) {
            try {
                return (DisplayMetrics) AutoSizeConfig.getInstance().getTmpMetricsField().get(resources);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void initCompatMultiProcess(Context context) {
        context.getContentResolver().query(Uri.parse("content://" + context.getPackageName() + ".autosize-init-provider"), null, null, null, null);
    }

    private static void setDensity(Activity activity, float f, int i, float f2, float f3) {
        setDensity(activity.getResources().getDisplayMetrics(), f, i, f2, f3);
        setDensity(AutoSizeConfig.getInstance().getApplication().getResources().getDisplayMetrics(), f, i, f2, f3);
        DisplayMetrics metricsOnMiui = getMetricsOnMiui(activity.getResources());
        DisplayMetrics metricsOnMiui2 = getMetricsOnMiui(AutoSizeConfig.getInstance().getApplication().getResources());
        if (metricsOnMiui != null) {
            setDensity(metricsOnMiui, f, i, f2, f3);
        }
        if (metricsOnMiui2 != null) {
            setDensity(metricsOnMiui2, f, i, f2, f3);
        }
    }

    private static void setScreenSizeDp(Activity activity, int i, int i2) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP() && AutoSizeConfig.getInstance().getUnitsManager().isSupportScreenSizeDP()) {
            setScreenSizeDp(activity.getResources().getConfiguration(), i, i2);
            setScreenSizeDp(AutoSizeConfig.getInstance().getApplication().getResources().getConfiguration(), i, i2);
        }
    }

    private static void setScreenSizeDp(Configuration configuration, int i, int i2) {
        configuration.screenWidthDp = i;
        configuration.screenHeightDp = i2;
    }

    private static void setDensity(DisplayMetrics displayMetrics, float f, int i, float f2, float f3) {
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportDP()) {
            displayMetrics.density = f;
            displayMetrics.densityDpi = i;
        }
        if (AutoSizeConfig.getInstance().getUnitsManager().isSupportSP()) {
            displayMetrics.scaledDensity = f2;
        }
        int i2 = AnonymousClass1.$SwitchMap$me$jessyan$autosize$unit$Subunits[AutoSizeConfig.getInstance().getUnitsManager().getSupportSubunits().ordinal()];
        if (i2 == 1) {
            displayMetrics.xdpi = f3 * 72.0f;
        } else if (i2 == 2) {
            displayMetrics.xdpi = f3 * 25.4f;
        } else {
            if (i2 != 4) {
                return;
            }
            displayMetrics.xdpi = f3;
        }
    }
}
