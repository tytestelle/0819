package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedIntegerTwoBytes extends UnsignedVariableInteger {
    public UnsignedIntegerTwoBytes(long j) {
        super(j);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits getBits() {
        return UnsignedVariableInteger.Bits.SIXTEEN;
    }

    public UnsignedIntegerTwoBytes(String str) {
        super(str);
    }
}
