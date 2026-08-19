package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedIntegerOneByte extends UnsignedVariableInteger {
    public UnsignedIntegerOneByte(long j) {
        super(j);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits getBits() {
        return UnsignedVariableInteger.Bits.EIGHT;
    }

    public UnsignedIntegerOneByte(String str) {
        super(str);
    }
}
