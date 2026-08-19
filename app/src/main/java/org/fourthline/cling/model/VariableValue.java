package org.fourthline.cling.model;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class VariableValue {
    private static final Logger log = Logger.getLogger(VariableValue.class.getName());
    private final Datatype datatype;
    private final Object value;

    public VariableValue(Datatype datatype, Object obj) {
        this.datatype = datatype;
        this.value = obj instanceof String ? datatype.valueOf((String) obj) : obj;
        if (ModelUtil.ANDROID_RUNTIME) {
            return;
        }
        if (getDatatype().isValid(getValue())) {
            logInvalidXML(toString());
            return;
        }
        throw new InvalidValueException("Invalid value for " + getDatatype() + ": " + getValue());
    }

    public Datatype getDatatype() {
        return this.datatype;
    }

    public Object getValue() {
        return this.value;
    }

    public void logInvalidXML(String str) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 13 && ((iCodePointAt < 32 || iCodePointAt > 55295) && ((iCodePointAt < 57344 || iCodePointAt > 65533) && (iCodePointAt < 65536 || iCodePointAt > 1114111)))) {
                log.warning("Found invalid XML char code: " + iCodePointAt);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public String toString() {
        return getDatatype().getString(getValue());
    }
}
