package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedIntegerFourBytes extends UnsignedVariableInteger {
    public UnsignedIntegerFourBytes(long j) {
        super(j);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits getBits() {
        return UnsignedVariableInteger.Bits.THIRTYTWO;
    }

    public UnsignedIntegerFourBytes(String str) {
        super(str);
    }
}
