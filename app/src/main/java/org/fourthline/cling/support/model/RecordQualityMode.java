package org.fourthline.cling.support.model;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.ArrayList;
import org.fourthline.cling.model.ModelUtil;

/* JADX INFO: loaded from: classes2.dex */
public enum RecordQualityMode {
    EP("0:EP"),
    LP("1:LP"),
    SP("2:SP"),
    BASIC("0:BASIC"),
    MEDIUM("1:MEDIUM"),
    HIGH("2:HIGH"),
    NOT_IMPLEMENTED("NOT_IMPLEMENTED");

    private String protocolString;

    RecordQualityMode(String str) {
        this.protocolString = str;
    }

    public static RecordQualityMode[] valueOfCommaSeparatedList(String str) {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        if (strArrFromCommaSeparatedList == null) {
            return new RecordQualityMode[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrFromCommaSeparatedList) {
            for (RecordQualityMode recordQualityMode : values()) {
                if (recordQualityMode.protocolString.equals(str2)) {
                    arrayList.add(recordQualityMode);
                }
            }
        }
        return (RecordQualityMode[]) arrayList.toArray(new RecordQualityMode[arrayList.size()]);
    }

    public static RecordQualityMode valueOrExceptionOf(String str) {
        for (RecordQualityMode recordQualityMode : values()) {
            if (recordQualityMode.protocolString.equals(str)) {
                return recordQualityMode;
            }
        }
        throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid record quality mode string: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocolString;
    }
}
