package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.dlna.types.AvailableSeekRangeType;
import org.fourthline.cling.support.model.dlna.types.NormalPlayTimeRange;

/* JADX INFO: loaded from: classes2.dex */
public class AvailableSeekRangeHeader extends DLNAHeader<AvailableSeekRangeType> {
    public AvailableSeekRangeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        AvailableSeekRangeType value = getValue();
        String string = Integer.toString(value.getModeFlag().ordinal());
        if (value.getNormalPlayTimeRange() != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, " ");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(value.getNormalPlayTimeRange().getString(false));
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        if (value.getBytesRange() == null) {
            return string;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, " ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.append(value.getBytesRange().getString(false));
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        NormalPlayTimeRange normalPlayTimeRangeValueOf;
        if (str.length() != 0) {
            String[] strArrSplit = str.split(" ");
            boolean z = true;
            try {
                if (strArrSplit.length > 1) {
                    try {
                        AvailableSeekRangeType.Mode modeValueOf = AvailableSeekRangeType.Mode.valueOf("MODE_" + strArrSplit[0]);
                        BytesRange bytesRangeValueOf = null;
                        try {
                            try {
                                normalPlayTimeRangeValueOf = NormalPlayTimeRange.valueOf(strArrSplit[1], true);
                            } catch (InvalidValueException unused) {
                                throw new InvalidValueException("Invalid AvailableSeekRange Range");
                            }
                        } catch (InvalidValueException unused2) {
                            normalPlayTimeRangeValueOf = null;
                            bytesRangeValueOf = BytesRange.valueOf(strArrSplit[1]);
                            z = false;
                        }
                        if (!z) {
                            setValue(new AvailableSeekRangeType(modeValueOf, bytesRangeValueOf));
                            return;
                        } else if (strArrSplit.length > 2) {
                            setValue(new AvailableSeekRangeType(modeValueOf, normalPlayTimeRangeValueOf, BytesRange.valueOf(strArrSplit[2])));
                            return;
                        } else {
                            setValue(new AvailableSeekRangeType(modeValueOf, normalPlayTimeRangeValueOf));
                            return;
                        }
                    } catch (IllegalArgumentException unused3) {
                        throw new InvalidValueException("Invalid AvailableSeekRange Mode");
                    }
                }
            } catch (InvalidValueException e) {
                StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Invalid AvailableSeekRange header value: ", str, "; ");
                sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(e.getMessage());
                throw new InvalidHeaderException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
            }
        }
        throw new InvalidHeaderException("Invalid AvailableSeekRange header value: ".concat(str));
    }

    public AvailableSeekRangeHeader(AvailableSeekRangeType availableSeekRangeType) {
        setValue(availableSeekRangeType);
    }
}
