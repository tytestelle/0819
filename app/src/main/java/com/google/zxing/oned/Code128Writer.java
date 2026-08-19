package com.google.zxing.oned;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    /* JADX INFO: renamed from: com.google.zxing.oned.Code128Writer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch;

        static {
            int[] iArr = new int[MinimalEncoder.Charset.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset = iArr;
            try {
                iArr[MinimalEncoder.Charset.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MinimalEncoder.Latch.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch = iArr2;
            try {
                iArr2[MinimalEncoder.Latch.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.SHIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static final class MinimalEncoder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final String A = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ";
        static final String B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ";
        private static final int CODE_SHIFT = 98;
        private int[][] memoizedCost;
        private Latch[][] minPath;

        public enum Charset {
            A,
            B,
            C,
            NONE
        }

        public enum Latch {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private MinimalEncoder() {
        }

        private static void addPattern(Collection<int[]> collection, int i, int[] iArr, int[] iArr2, int i2) {
            collection.add(Code128Reader.CODE_PATTERNS[i]);
            if (i2 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = (i * iArr2[0]) + iArr[0];
        }

        private boolean canEncode(CharSequence charSequence, Charset charset, int i) {
            int i2;
            char cCharAt = charSequence.charAt(i);
            int i3 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[charset.ordinal()];
            if (i3 == 1) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || A.indexOf(cCharAt) >= 0;
            }
            if (i3 == 2) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || B.indexOf(cCharAt) >= 0;
            }
            if (i3 != 3) {
                return false;
            }
            return cCharAt == 241 || ((i2 = i + 1) < charSequence.length() && isDigit(cCharAt) && isDigit(charSequence.charAt(i2)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:30:0x009d  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:49:0x00de  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:69:0x00fd A[SYNTHETIC] */
        public boolean[] encode(String str) {
            Charset charset;
            int i;
            int i2 = 2;
            this.memoizedCost = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, str.length());
            this.minPath = (Latch[][]) Array.newInstance((Class<?>) Latch.class, 4, str.length());
            Charset charset2 = Charset.NONE;
            encode(str, charset2, 0);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {1};
            int length = str.length();
            int i3 = 0;
            while (i3 < length) {
                Latch latch = this.minPath[charset2.ordinal()][i3];
                int i4 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[latch.ordinal()];
                int iCharAt = 101;
                if (i4 == 1) {
                    charset = Charset.A;
                    addPattern(arrayList, i3 == 0 ? 103 : 101, iArr, iArr2, i3);
                } else if (i4 != i2) {
                    if (i4 == 3) {
                        charset = Charset.C;
                        addPattern(arrayList, i3 == 0 ? 105 : 99, iArr, iArr2, i3);
                    } else if (i4 == 4) {
                        addPattern(arrayList, 98, iArr, iArr2, i3);
                    }
                    if (charset2 == Charset.C) {
                        switch (str.charAt(i3)) {
                            case TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID /* 241 */:
                                iCharAt = 102;
                                break;
                            case TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION /* 242 */:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                if ((charset2 != Charset.A || latch == Latch.SHIFT) && (charset2 != Charset.B || latch != Latch.SHIFT)) {
                                }
                                break;
                            default:
                                iCharAt = str.charAt(i3) - ' ';
                                break;
                        }
                        if (((charset2 != Charset.A && latch != Latch.SHIFT) || (charset2 == Charset.B && latch == Latch.SHIFT)) && iCharAt < 0) {
                        }
                        addPattern(arrayList, iCharAt, iArr, iArr2, i3);
                    } else if (str.charAt(i3) == 241) {
                        addPattern(arrayList, 102, iArr, iArr2, i3);
                    } else {
                        addPattern(arrayList, Integer.parseInt(str.substring(i3, i3 + 2)), iArr, iArr2, i3);
                        i = i3 + 1;
                        if (i < length) {
                            i3 = i;
                        }
                    }
                    i3++;
                    i2 = 2;
                } else {
                    charset = Charset.B;
                    addPattern(arrayList, i3 == 0 ? 104 : 100, iArr, iArr2, i3);
                }
                charset2 = charset;
                if (charset2 == Charset.C) {
                    switch (str.charAt(i3)) {
                        case TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID /* 241 */:
                            iCharAt = 102;
                            break;
                        case TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION /* 242 */:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                            iCharAt = charset2 != Charset.A ? 100 : 100;
                            break;
                        default:
                            iCharAt = str.charAt(i3) - ' ';
                            break;
                    }
                    iCharAt = charset2 != Charset.A ? iCharAt + 96 : iCharAt + 96;
                    addPattern(arrayList, iCharAt, iArr, iArr2, i3);
                } else if (str.charAt(i3) == 241) {
                    addPattern(arrayList, 102, iArr, iArr2, i3);
                } else {
                    addPattern(arrayList, Integer.parseInt(str.substring(i3, i3 + 2)), iArr, iArr2, i3);
                    i = i3 + 1;
                    if (i < length) {
                        i3 = i;
                    }
                }
                i3++;
                i2 = 2;
            }
            this.memoizedCost = null;
            this.minPath = null;
            return Code128Writer.produceResult(arrayList, iArr[0]);
        }

        private static boolean isDigit(char c) {
            return c >= '0' && c <= '9';
        }

        public /* synthetic */ MinimalEncoder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int encode(CharSequence charSequence, Charset charset, int i) {
            int iEncode;
            int iEncode2;
            int i2 = this.memoizedCost[charset.ordinal()][i];
            if (i2 > 0) {
                return i2;
            }
            Latch latch = Latch.NONE;
            int i3 = i + 1;
            boolean z = i3 >= charSequence.length();
            Charset[] charsetArr = {Charset.A, Charset.B};
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 <= 1; i5++) {
                if (canEncode(charSequence, charsetArr[i5], i)) {
                    Latch latchValueOf = Latch.NONE;
                    Charset charset2 = charsetArr[i5];
                    if (charset != charset2) {
                        latchValueOf = Latch.valueOf(charset2.toString());
                        iEncode2 = 2;
                    } else {
                        iEncode2 = 1;
                    }
                    if (!z) {
                        iEncode2 += encode(charSequence, charsetArr[i5], i3);
                    }
                    if (iEncode2 < i4) {
                        latch = latchValueOf;
                        i4 = iEncode2;
                    }
                    if (charset == charsetArr[(i5 + 1) % 2]) {
                        Latch latch2 = Latch.SHIFT;
                        int iEncode3 = !z ? encode(charSequence, charset, i3) + 2 : 2;
                        if (iEncode3 < i4) {
                            latch = latch2;
                            i4 = iEncode3;
                        }
                    }
                }
            }
            Charset charset3 = Charset.C;
            if (canEncode(charSequence, charset3, i)) {
                Latch latch3 = Latch.NONE;
                if (charset != charset3) {
                    latch3 = Latch.C;
                    iEncode = 2;
                } else {
                    iEncode = 1;
                }
                int i6 = (charSequence.charAt(i) == 241 ? 1 : 2) + i;
                if (i6 < charSequence.length()) {
                    iEncode += encode(charSequence, charset3, i6);
                }
                if (iEncode < i4) {
                    latch = latch3;
                    i4 = iEncode;
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                this.memoizedCost[charset.ordinal()][i] = i4;
                this.minPath[charset.ordinal()][i] = latch;
                return i4;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i)));
        }
    }

    private static int check(String str, Map<EncodeHintType, ?> map) {
        int forcedCodeSet = -1;
        if (map != null && map.containsKey(EncodeHintType.FORCE_CODE_SET)) {
            String codeSetHint = map.get(EncodeHintType.FORCE_CODE_SET).toString();
            switch (codeSetHint) {
                case "A": forcedCodeSet = 101; break;
                case "B": forcedCodeSet = 100; break;
                case "C": forcedCodeSet = 99; break;
                default: throw new IllegalArgumentException("Unsupported code set hint: " + codeSetHint);
            }
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            switch (c) {
                case 241: case 242: case 243: case 244: break;
                default:
                    if (c > 127) throw new IllegalArgumentException("Bad character in input: ASCII value=" + (int)c);
            }
            switch (forcedCodeSet) {
                case 101:
                    if (c > 95 && c <= 127) throw new IllegalArgumentException("Bad character in input for forced code set A: ASCII value=" + (int)c);
                    break;
                case 100:
                    if (c < 32) throw new IllegalArgumentException("Bad character in input for forced code set B: ASCII value=" + (int)c);
                    break;
                case 99:
                    if (c < 48 || (c > 57 && c <= 127) || c == 242 || c == 243 || c == 244) {
                        throw new IllegalArgumentException("Bad character in input for forced code set C: ASCII value=" + (int)c);
                    }
                    break;
            }
        }
        return forcedCodeSet;
    }

        private static int chooseCode(CharSequence charSequence, int i, int i2) {
            CType cTypeFindCType;
            CType cTypeFindCType2;
            char cCharAt;
            CType cTypeFindCType3 = findCType(charSequence, i);
            CType cType = CType.ONE_DIGIT;
            if (cTypeFindCType3 == cType) {
                return i2 == 101 ? 101 : 100;
            }
            CType cType2 = CType.UNCODABLE;
            if (cTypeFindCType3 == cType2) {
                return (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (cCharAt >= '`' && (cCharAt < 241 || cCharAt > 244))))) ? 100 : 101;
            }
            if (i2 == 101 && cTypeFindCType3 == CType.FNC_1) {
                return 101;
            }
            if (i2 == 99) {
                return 99;
            }
            if (i2 != 100) {
                if (cTypeFindCType3 == CType.FNC_1) {
                    cTypeFindCType3 = findCType(charSequence, i + 1);
                }
                return cTypeFindCType3 == CType.TWO_DIGITS ? 99 : 100;
            }
            CType cType3 = CType.FNC_1;
            if (cTypeFindCType3 == cType3 || (cTypeFindCType = findCType(charSequence, i + 2)) == cType2 || cTypeFindCType == cType) {
                return 100;
            }
            if (cTypeFindCType == cType3) {
                return findCType(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
            }
            int i3 = i + 4;
            while (true) {
                cTypeFindCType2 = findCType(charSequence, i3);
                if (cTypeFindCType2 != CType.TWO_DIGITS) {
                    break;
                }
                i3 += 2;
            }
            return cTypeFindCType2 == CType.ONE_DIGIT ? 100 : 99;
        }

        private static boolean[] encodeFast(String str, int i) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1;
            while (i2 < length) {
                int iChooseCode = i == -1 ? chooseCode(str, i2, i4) : i;
                int iCharAt = 100;
                if (iChooseCode == i4) {
                    switch (str.charAt(i2)) {
                        case TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID /* 241 */:
                            iCharAt = 102;
                            break;
                        case TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION /* 242 */:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                            if (i4 == 101) {
                                iCharAt = 101;
                            }
                            break;
                        default:
                            if (i4 == 100) {
                                iCharAt = str.charAt(i2) - ' ';
                            } else if (i4 == 101) {
                                char cCharAt = str.charAt(i2);
                                iCharAt = cCharAt - ' ';
                                if (iCharAt < 0) {
                                    iCharAt = cCharAt + '@';
                                }
                            } else {
                                int i6 = i2 + 1;
                                if (i6 == length) {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                                iCharAt = Integer.parseInt(str.substring(i2, i2 + 2));
                                i2 = i6;
                            }
                            break;
                    }
                    i2++;
                } else {
                    if (i4 != 0) {
                        iCharAt = iChooseCode;
                    } else if (iChooseCode != 100) {
                        iCharAt = iChooseCode != 101 ? 105 : 103;
                    } else {
                        iCharAt = 104;
                    }
                    i4 = iChooseCode;
                }
                arrayList.add(Code128Reader.CODE_PATTERNS[iCharAt]);
                i3 += iCharAt * i5;
                if (i2 != 0) {
                    i5++;
                }
            }
            return produceResult(arrayList, i3);
        }

        private static CType findCType(CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i >= length) {
                return CType.UNCODABLE;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == 241) {
                return CType.FNC_1;
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return CType.UNCODABLE;
            }
            int i2 = i + 1;
            if (i2 >= length) {
                return CType.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i2);
            return (cCharAt2 < '0' || cCharAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
        }

        public static boolean[] produceResult(Collection<int[]> collection, int i) {
            int i2 = i % 103;
            if (i2 < 0) {
                throw new IllegalArgumentException("Unable to compute a valid input checksum");
            }
            int[][] iArr = Code128Reader.CODE_PATTERNS;
            collection.add(iArr[i2]);
            collection.add(iArr[106]);
            int iAppendPattern = 0;
            int i3 = 0;
            for (int[] iArr2 : collection) {
                for (int i4 : iArr2) {
                    i3 += i4;
                }
            }
            boolean[] zArr = new boolean[i3];
            Iterator<int[]> it = collection.iterator();
            while (it.hasNext()) {
                iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, it.next(), true);
            }
            return zArr;
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public boolean[] encode(String str) {
            return encode(str, null);
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public Collection<BarcodeFormat> getSupportedWriteFormats() {
            return Collections.singleton(BarcodeFormat.CODE_128);
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public boolean[] encode(String str, Map<EncodeHintType, ?> map) {
            int iCheck = check(str, map);
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.CODE128_COMPACT;
                if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                    return new MinimalEncoder(null).encode(str);
                }
            }
            return encodeFast(str, iCheck);
        }
    }
