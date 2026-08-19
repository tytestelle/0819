package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;

    @Nullable
    private static AudioManager audioManager;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    private AudioManagerCompat() {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        try {
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext != applicationContext2) {
                audioManager = null;
            }
            AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                return audioManager2;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                ConditionVariable conditionVariable = new ConditionVariable();
                BackgroundExecutor.get().execute(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(applicationContext2, conditionVariable, 11));
                conditionVariable.blockUninterruptible();
                return (AudioManager) Assertions.checkNotNull(audioManager);
            }
            AudioManager audioManager3 = (AudioManager) applicationContext2.getSystemService("audio");
            audioManager = audioManager3;
            return (AudioManager) Assertions.checkNotNull(audioManager3);
        } catch (Throwable th) {
            throw th;
        }
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public static int getStreamMaxVolume(AudioManager audioManager2, int i) {
        return audioManager2.getStreamMaxVolume(i);
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public static int getStreamMinVolume(AudioManager audioManager2, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager2.getStreamMinVolume(i);
        }
        return 0;
    }

    public static int getStreamVolume(AudioManager audioManager2, int i) {
        try {
            return audioManager2.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager2.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return audioManager2.isStreamMute(i);
        }
        return getStreamVolume(audioManager2, i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getStreamType(), audioFocusRequestCompat.getFocusGain());
    }
}
