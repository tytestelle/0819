package org.fourthline.cling.support.model.dlna.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class NormalPlayTime {
    static final Pattern pattern = Pattern.compile("^(\\d+):(\\d{1,2}):(\\d{1,2})(\\.(\\d{1,3}))?|(\\d+)(\\.(\\d{1,3}))?$", 2);
    private long milliseconds;

    /* JADX INFO: renamed from: org.fourthline.cling.support.model.dlna.types.NormalPlayTime$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$fourthline$cling$support$model$dlna$types$NormalPlayTime$Format;

        static {
            int[] iArr = new int[Format.values().length];
            $SwitchMap$org$fourthline$cling$support$model$dlna$types$NormalPlayTime$Format = iArr;
            try {
                iArr[Format.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Format {
        SECONDS,
        TIME
    }

    public NormalPlayTime(long j) {
        if (j < 0) {
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter milliseconds: ", j));
        }
        this.milliseconds = j;
    }

    public static NormalPlayTime valueOf(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            try {
                if (matcher.group(1) != null) {
                    return new NormalPlayTime(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), Long.parseLong(matcher.group(5)) * ((long) ((int) Math.pow(10.0d, 3 - matcher.group(5).length()))));
                }
                return new NormalPlayTime((Long.parseLong(matcher.group(8)) * ((long) ((int) Math.pow(10.0d, 3 - matcher.group(8).length())))) + (Long.parseLong(matcher.group(6)) * 1000));
            } catch (NumberFormatException unused) {
            }
        }
        throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse NormalPlayTime: ", str));
    }

    public long getMilliseconds() {
        return this.milliseconds;
    }

    public String getString() {
        return getString(Format.SECONDS);
    }

    public void setMilliseconds(long j) {
        if (j < 0) {
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter milliseconds: ", j));
        }
        this.milliseconds = j;
    }

    public String getString(Format format) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.milliseconds);
        long j = this.milliseconds % 1000;
        if (AnonymousClass1.$SwitchMap$org$fourthline$cling$support$model$dlna$types$NormalPlayTime$Format[format.ordinal()] != 1) {
            return String.format(Locale.ROOT, "%d.%03d", Long.valueOf(seconds), Long.valueOf(j));
        }
        long seconds2 = timeUnit.toSeconds(this.milliseconds) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(this.milliseconds));
        return String.format(Locale.ROOT, "%d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(this.milliseconds)), Long.valueOf(timeUnit.toMinutes(this.milliseconds) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(this.milliseconds))), Long.valueOf(seconds2), Long.valueOf(j));
    }

    public NormalPlayTime(long j, long j2, long j3, long j4) {
        if (j < 0) {
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter hours: ", j));
        }
        if (j2 < 0 || j2 > 59) {
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter minutes: ", j));
        }
        if (j3 < 0 || j3 > 59) {
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter seconds: ", j));
        }
        if (j4 >= 0 && j4 <= 999) {
            this.milliseconds = (((j2 * 60) + (j * 3600) + j3) * 1000) + j4;
            return;
        }
        throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Invalid parameter milliseconds: ", j4));
    }
}
