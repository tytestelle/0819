package com.google.zxing.oned.rss.expanded.decoders;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes2.dex */
final class AI01AndOtherAIs extends AI01decoder {
    private static final int HEADER_SIZE = 4;

    public AI01AndOtherAIs(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("(01)");
        int length = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.length();
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(getGeneralDecoder().extractNumericValueFromBitArray(4, 4));
        encodeCompressedGtinWithoutAI(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, 8, length);
        return getGeneralDecoder().decodeAllCodes(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, 48);
    }
}
