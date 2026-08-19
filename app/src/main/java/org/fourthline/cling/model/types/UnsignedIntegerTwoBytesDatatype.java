package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes2.dex */
public class UnsignedIntegerTwoBytesDatatype extends AbstractDatatype<UnsignedIntegerTwoBytes> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public UnsignedIntegerTwoBytes valueOf(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return new UnsignedIntegerTwoBytes(str);
        } catch (NumberFormatException e) {
            throw new InvalidValueException("Can't convert string to number or not in range: ".concat(str), e);
        }
    }
}
