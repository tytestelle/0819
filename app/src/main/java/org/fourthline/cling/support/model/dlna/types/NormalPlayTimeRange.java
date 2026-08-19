package org.fourthline.cling.support.model.dlna.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class NormalPlayTimeRange {
    public static final String PREFIX = "npt=";
    private NormalPlayTime timeDuration;
    private NormalPlayTime timeEnd;
    private NormalPlayTime timeStart;

    public NormalPlayTimeRange(long j, long j2) {
        this.timeStart = new NormalPlayTime(j);
        this.timeEnd = new NormalPlayTime(j2);
    }

    public static NormalPlayTimeRange valueOf(String str) {
        return valueOf(str, false);
    }

    public String getString() {
        return getString(true);
    }

    public NormalPlayTime getTimeDuration() {
        return this.timeDuration;
    }

    public NormalPlayTime getTimeEnd() {
        return this.timeEnd;
    }

    public NormalPlayTime getTimeStart() {
        return this.timeStart;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    public static NormalPlayTimeRange valueOf(String str, boolean z) {
        NormalPlayTime normalPlayTimeValueOf;
        if (str.startsWith(PREFIX)) {
            String[] strArrSplit = str.substring(4).split("[-/]");
            int length = strArrSplit.length;
            NormalPlayTime normalPlayTimeValueOf2 = null;
            if (length == 1) {
                normalPlayTimeValueOf = null;
            } else if (length == 2) {
                normalPlayTimeValueOf = null;
                if (strArrSplit[1].length() != 0) {
                    normalPlayTimeValueOf2 = NormalPlayTime.valueOf(strArrSplit[1]);
                }
            } else if (length == 3) {
                if (strArrSplit[2].length() == 0 || strArrSplit[2].equals("*")) {
                    normalPlayTimeValueOf = null;
                } else {
                    normalPlayTimeValueOf = NormalPlayTime.valueOf(strArrSplit[2]);
                }
                if (strArrSplit[1].length() != 0) {
                    normalPlayTimeValueOf2 = NormalPlayTime.valueOf(strArrSplit[1]);
                }
            }
            if (strArrSplit[0].length() != 0 && (!z || (z && strArrSplit.length > 1))) {
                return new NormalPlayTimeRange(NormalPlayTime.valueOf(strArrSplit[0]), normalPlayTimeValueOf2, normalPlayTimeValueOf);
            }
        }
        throw new InvalidValueException("Can't parse NormalPlayTimeRange: ".concat(str));
    }

    public String getString(boolean z) {
        String string = PREFIX + this.timeStart.getString() + "-";
        if (this.timeEnd != null) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.timeEnd.getString());
            string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        if (!z) {
            return string;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ServiceReference.DELIMITER);
        NormalPlayTime normalPlayTime = this.timeDuration;
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(normalPlayTime != null ? normalPlayTime.getString() : "*");
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }

    public NormalPlayTimeRange(NormalPlayTime normalPlayTime, NormalPlayTime normalPlayTime2) {
        this.timeStart = normalPlayTime;
        this.timeEnd = normalPlayTime2;
    }

    public NormalPlayTimeRange(NormalPlayTime normalPlayTime, NormalPlayTime normalPlayTime2, NormalPlayTime normalPlayTime3) {
        this.timeStart = normalPlayTime;
        this.timeEnd = normalPlayTime2;
        this.timeDuration = normalPlayTime3;
    }
}
