package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.google.common.collect.O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO;
import com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioCapabilities {

    @VisibleForTesting
    static final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;

    @VisibleForTesting
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;

    @VisibleForTesting
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(AudioProfile.DEFAULT_AUDIO_PROFILE));

    @SuppressLint({"InlinedApi"})
    private static final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O EXTERNAL_SURROUND_SOUND_ENCODINGS = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(2, 5, 6);

    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        private static O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 getAllBluetoothDeviceTypes() {
            O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4);
            o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(8, 7);
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(26, 27);
            }
            if (i >= 33) {
                o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(30);
            }
            return o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }

        public static boolean isBluetoothConnected(AudioManager audioManager, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            AudioDeviceInfo[] devices = audioDeviceInfoApi23 == null ? ((AudioManager) Assertions.checkNotNull(audioManager)).getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfoApi23.audioDeviceInfo};
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
            O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(num);
                }
            }
            o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2);
            return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2, AudioAttributes audioAttributes) {
            for (int i3 = 10; i3 > 0; i3--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i3);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    @RequiresApi(33)
    public static final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes)));
        }

        @Nullable
        public static AudioDeviceInfoApi23 getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            List audioDevicesForAttributes = ((AudioManager) Assertions.checkNotNull(audioManager)).getAudioDevicesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new AudioDeviceInfoApi23(androidx.media3.common.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(audioDevicesForAttributes.get(0)));
        }
    }

    static {
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(4);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(5, 6);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(17, 6);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(7, 6);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(30, 10);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(18, 6);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(6, 8);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(8, 8);
        o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    @SuppressLint({"WrongConstant"})
    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getAudioProfiles(List<android.media.AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(12)));
        for (int i = 0; i < list.size(); i++) {
            android.media.AudioProfile audioProfileO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(list.get(i));
            if (audioProfileO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getEncapsulationType() != 1) {
                int format = audioProfileO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) Assertions.checkNotNull((Set) map.get(Integer.valueOf(format)))).addAll(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(audioProfileO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(audioProfileO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getChannelMasks())));
                    }
                }
            }
        }
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
        for (Map.Entry entry : map.entrySet()) {
            o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfoApi23);
    }

    private static int getChannelConfigForPassthrough(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        return Util.getAudioTrackChannelConfig(i);
    }

    @Nullable
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    @Nullable
    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return (Util.contentHashCode(this.encodingToAudioProfile) * 31) + this.maxChannelCount;
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    public boolean supportsEncoding(int i) {
        return Util.contains(this.encodingToAudioProfile, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + "]";
    }

    @Deprecated
    public AudioCapabilities(@Nullable int[] iArr, int i) {
        this(getAudioProfiles(iArr, i));
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return getCapabilitiesInternal(context, audioAttributes, (Build.VERSION.SDK_INT < 23 || audioDeviceInfo == null) ? null : new AudioDeviceInfoApi23(audioDeviceInfo));
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioAttributes audioAttributes) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        AudioProfile audioProfile = (AudioProfile) Assertions.checkNotNull(this.encodingToAudioProfile.get(encoding));
        int maxSupportedChannelCountForPassthrough = format.channelCount;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i = format.sampleRate;
            if (i == -1) {
                i = 48000;
            }
            maxSupportedChannelCountForPassthrough = audioProfile.getMaxSupportedChannelCountForPassthrough(i, audioAttributes);
        } else if (!format.sampleMimeType.equals(MimeTypes.AUDIO_DTS_X) || Build.VERSION.SDK_INT >= 33) {
            if (!audioProfile.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    private AudioCapabilities(List<AudioProfile> list) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = list.get(i);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.encodingToAudioProfile.size(); i2++) {
            iMax = Math.max(iMax, this.encodingToAudioProfile.valueAt(i2).maxChannelCount);
        }
        this.maxChannelCount = iMax;
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, @Nullable Intent intent, AudioAttributes audioAttributes, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        AudioManager audioManager = AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfoApi23 == null) {
            audioDeviceInfoApi23 = Build.VERSION.SDK_INT >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes);
        }
        if (i >= 23 && Api23.isBluetoothConnected(audioManager, audioDeviceInfoApi23)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4);
        o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2);
        if (i >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Api29.getDirectPlaybackSupportedEncodings(audioAttributes));
            return new AudioCapabilities(getAudioProfiles(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(intArrayExtra));
            }
            return new AudioCapabilities(getAudioProfiles(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new AudioCapabilities(getAudioProfiles(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()), 10));
    }

    public static final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;

        @Nullable
        private final O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = Build.VERSION.SDK_INT >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        @RequiresApi(33)
        public AudioProfile(int i, Set<Integer> set) {
            this.encoding = i;
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CopyOf = O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.copyOf((Collection) set);
            this.channelMasks = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CopyOf;
            O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0CopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.maxChannelCount = iMax;
        }

        private static O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 getAllChannelMasksForMaxChannelCount(int i) {
            O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO = new O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO(4);
            for (int i2 = 1; i2 <= i; i2++) {
                o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Integer.valueOf(Util.getAudioTrackChannelConfig(i2)));
            }
            return o000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i, AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            return Build.VERSION.SDK_INT >= 29 ? Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i, audioAttributes) : ((Integer) Assertions.checkNotNull((Integer) AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(this.encoding), 0))).intValue();
        }

        public int hashCode() {
            int i = ((this.encoding * 31) + this.maxChannelCount) * 31;
            O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 = this.channelMasks;
            return i + (o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 == null ? 0 : o000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.hashCode());
        }

        public boolean supportsChannelCount(int i) {
            if (this.channelMasks == null) {
                return i <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i, int i2) {
            this.encoding = i;
            this.maxChannelCount = i2;
            this.channelMasks = null;
        }
    }

    private static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O getAudioProfiles(@Nullable int[] iArr, int i) {
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new AudioProfile(i2, i));
        }
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }
}
