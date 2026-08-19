package androidx.media3.common.audio;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Pair;
import androidx.annotation.IntRange;
import androidx.media3.common.C;
import androidx.media3.common.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO;
import com.google.common.collect.O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
import com.google.common.collect.O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultGainProvider implements GainProcessor.GainProvider {
    private static final float GAIN_UNSET = -3.4028235E38f;
    private final float defaultGain;
    private final O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO gainMap;
    public static final FadeProvider FADE_IN_LINEAR = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(10);
    public static final FadeProvider FADE_OUT_LINEAR = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(11);
    public static final FadeProvider FADE_IN_EQUAL_POWER = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(12);
    public static final FadeProvider FADE_OUT_EQUAL_POWER = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(13);

    public static final class Builder {
        private final float defaultGain;
        private final O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO gainMap;

        public Builder(float f) {
            O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO = new O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO();
            this.gainMap = o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO;
            this.defaultGain = f;
            o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all(), new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$addFadeAt$1(long j, FadeProvider fadeProvider, long j2, Pair pair) {
            int iIntValue = ((Integer) pair.second).intValue();
            return Float.valueOf(fadeProvider.getGainFactorAt(((Long) pair.first).longValue() - Util.durationUsToSampleCount(j, iIntValue), Util.durationUsToSampleCount(j2, iIntValue)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$new$0(Pair pair) {
            return Float.valueOf(-3.4028235E38f);
        }

        @CanIgnoreReturnValue
        public Builder addFadeAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) final long j, @IntRange(from = 1) final long j2, final FadeProvider fadeProvider) {
            Assertions.checkArgument(j >= 0);
            Assertions.checkArgument(j2 > 1);
            this.gainMap.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.closedOpen(Long.valueOf(j), Long.valueOf(j + j2)), new com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.common.audio.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
                public final Object apply(Object obj) {
                    return DefaultGainProvider.Builder.lambda$addFadeAt$1(j, fadeProvider, j2, (Pair) obj);
                }
            });
            return this;
        }

        public DefaultGainProvider build() {
            return new DefaultGainProvider(this.gainMap, this.defaultGain);
        }
    }

    public interface FadeProvider {
        float getGainFactorAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j, @IntRange(from = 1) long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$0(long j, long j2) {
        return j / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$1(long j, long j2) {
        return (j2 - j) / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$2(long j, long j2) {
        return (float) Math.sin((j * 1.5707963267948966d) / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$3(long j, long j2) {
        return (float) Math.cos((j * 1.5707963267948966d) / j2);
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public float getGainFactorAtSamplePosition(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j, @IntRange(from = 1) int i) {
        Assertions.checkState(i > 0);
        Assertions.checkArgument(j >= 0);
        Map.Entry entryO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.gainMap.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Long.valueOf(Util.sampleCountToDurationUs(j, i)));
        float fFloatValue = ((Float) ((com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) Assertions.checkNotNull((com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) (entryO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null ? null : entryO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getValue()))).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        return fFloatValue == -3.4028235E38f ? this.defaultGain : fFloatValue;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public long isUnityUntil(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) long j, @IntRange(from = 1) int i) {
        Assertions.checkState(i > 0);
        Assertions.checkArgument(j >= 0);
        Map.Entry entry = (Map.Entry) Assertions.checkNotNull(this.gainMap.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Long.valueOf(Util.sampleCountToDurationUs(j, i))));
        float fFloatValue = ((Float) ((com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) entry.getValue()).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        if (fFloatValue == 1.0f) {
            return j + 1;
        }
        if (this.defaultGain != 1.0f || fFloatValue != -3.4028235E38f) {
            return C.TIME_UNSET;
        }
        if (((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entry.getKey()).hasUpperBound()) {
            return Util.durationUsToSampleCount(((Long) ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entry.getKey()).upperEndpoint()).longValue(), i);
        }
        return Long.MIN_VALUE;
    }

    private DefaultGainProvider(O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO, float f) {
        O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO2 = new O00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO();
        this.gainMap = o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO2;
        for (Map.Entry entry : ((O000o0oOOoOoooo00oooOoOOOO0o0O0oOoOoOooO) o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).entrySet()) {
            o00O000O0ooOoOOoooOoo0oo0oO0ooo0O0OOOOoO2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) entry.getKey(), entry.getValue());
        }
        this.defaultGain = f;
    }
}
