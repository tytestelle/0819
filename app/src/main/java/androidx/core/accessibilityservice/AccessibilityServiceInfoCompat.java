package androidx.core.accessibilityservice;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
    }

    @NonNull
    public static String capabilityToString(int i) {
        if (i == 1) {
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
        }
        if (i == 2) {
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        if (i != 4) {
            return i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
    }

    @NonNull
    public static String feedbackTypeToString(int i) {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("[");
        while (i > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~iNumberOfTrailingZeros;
            if (sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.length() > 1) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("FEEDBACK_GENERIC");
            }
        }
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("]");
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    @Nullable
    public static String flagToString(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @Nullable
    public static String loadDescription(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
