package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.dlna.types.NormalPlayTimeRange;
import org.fourthline.cling.support.model.dlna.types.TimeSeekRangeType;

/* JADX INFO: loaded from: classes2.dex */
public class TimeSeekRangeHeader extends DLNAHeader<TimeSeekRangeType> {
    public TimeSeekRangeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        TimeSeekRangeType value = getValue();
        String string = value.getNormalPlayTimeRange().getString();
        if (value.getBytesRange() == null) {
            return string;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, " ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(value.getBytesRange().getString(true));
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() != 0) {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length > 0) {
                try {
                    TimeSeekRangeType timeSeekRangeType = new TimeSeekRangeType(NormalPlayTimeRange.valueOf(strArrSplit[0]));
                    if (strArrSplit.length > 1) {
                        timeSeekRangeType.setBytesRange(BytesRange.valueOf(strArrSplit[1]));
                    }
                    setValue(timeSeekRangeType);
                    return;
                } catch (InvalidValueException e) {
                    StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Invalid TimeSeekRange header value: ", str, "; ");
                    sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(e.getMessage());
                    throw new InvalidHeaderException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
                }
            }
        }
        throw new InvalidHeaderException("Invalid TimeSeekRange header value: ".concat(str));
    }

    public TimeSeekRangeHeader(TimeSeekRangeType timeSeekRangeType) {
        setValue(timeSeekRangeType);
    }
}
