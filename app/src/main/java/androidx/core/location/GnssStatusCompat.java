package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class GnssStatusCompat {

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_BEIDOU = 5;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GALILEO = 6;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GLONASS = 3;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GPS = 1;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_IRNSS = 7;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_QZSS = 4;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_SBAS = 2;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_UNKNOWN = 0;

    public static abstract class Callback {
        public void onFirstFix(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        }

        public void onSatelliteStatusChanged(@NonNull GnssStatusCompat gnssStatusCompat) {
        }

        public void onStarted() {
        }

        public void onStopped() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ConstellationType {
    }

    @NonNull
    @RequiresApi(24)
    public static GnssStatusCompat wrap(@NonNull GnssStatus gnssStatus) {
        return new GnssStatusWrapper(gnssStatus);
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public abstract float getAzimuthDegrees(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @FloatRange(from = 0.0d, to = 63.0d)
    public abstract float getBasebandCn0DbHz(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @FloatRange(from = 0.0d)
    public abstract float getCarrierFrequencyHz(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @FloatRange(from = 0.0d, to = 63.0d)
    public abstract float getCn0DbHz(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract int getConstellationType(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @FloatRange(from = -90.0d, to = 90.0d)
    public abstract float getElevationDegrees(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public abstract int getSatelliteCount();

    @IntRange(from = 1, to = 200)
    public abstract int getSvid(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract boolean hasAlmanacData(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract boolean hasBasebandCn0DbHz(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract boolean hasCarrierFrequencyHz(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract boolean hasEphemerisData(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    public abstract boolean usedInFix(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i);

    @NonNull
    @SuppressLint({"ReferencesDeprecated"})
    public static GnssStatusCompat wrap(@NonNull GpsStatus gpsStatus) {
        return new GpsStatusWrapper(gpsStatus);
    }
}
