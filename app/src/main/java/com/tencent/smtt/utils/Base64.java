package com.tencent.smtt.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean a = true;

    public static abstract class a {
        public byte[] a;
        public int b;
    }

    public static class b extends a {
        private static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int e;
        private int f;
        private final int[] g;

        public b(int i, byte[] bArr) {
            this.a = bArr;
            this.g = (i & 8) == 0 ? c : d;
            this.e = 0;
            this.f = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.e;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.f;
            byte[] bArr2 = this.a;
            int[] iArr = this.g;
            int i6 = i5;
            int i7 = 0;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i6 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i7 + 2] = (byte) i6;
                        bArr2[i7 + 1] = (byte) (i6 >> 8);
                        bArr2[i7] = (byte) (i6 >> 16);
                        i7 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i12 != -1) {
                                        this.e = 6;
                                        return false;
                                    }
                                } else if (i12 == -2) {
                                    i8++;
                                } else if (i12 != -1) {
                                    this.e = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                int i13 = i12 | (i6 << 6);
                                bArr2[i7 + 2] = (byte) i13;
                                bArr2[i7 + 1] = (byte) (i13 >> 8);
                                bArr2[i7] = (byte) (i13 >> 16);
                                i7 += 3;
                                i6 = i13;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i7 + 1] = (byte) (i6 >> 2);
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 += 2;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.e = 6;
                                return false;
                            }
                        } else if (i12 >= 0) {
                            i12 |= i6 << 6;
                            i8++;
                            i6 = i12;
                        } else if (i12 == -2) {
                            bArr2[i7] = (byte) (i6 >> 4);
                            i7++;
                            i8 = 4;
                        } else if (i12 != -1) {
                            this.e = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        i12 |= i6 << 6;
                        i8++;
                        i6 = i12;
                    } else if (i12 != -1) {
                        this.e = 6;
                        return false;
                    }
                } else if (i12 >= 0) {
                    i8++;
                    i6 = i12;
                } else if (i12 != -1) {
                    this.e = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.e = i8;
                this.f = i6;
            } else {
                if (i8 == 1) {
                    this.e = 6;
                    return false;
                }
                if (i8 == 2) {
                    bArr2[i7] = (byte) (i6 >> 4);
                    i7++;
                } else if (i8 == 3) {
                    int i14 = i7 + 1;
                    bArr2[i7] = (byte) (i6 >> 10);
                    i7 += 2;
                    bArr2[i14] = (byte) (i6 >> 2);
                } else if (i8 == 4) {
                    this.e = 6;
                    return false;
                }
                this.e = i8;
            }
            this.b = i7;
            return true;
        }
    }

    public static class c extends a {
        static final /* synthetic */ boolean g = true;
        private static final byte[] h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte[] j;
        private int k;
        private final byte[] l;

        public c(int i2, byte[] bArr) {
            this.a = bArr;
            this.d = (i2 & 1) == 0;
            boolean z = (i2 & 2) == 0;
            this.e = z;
            this.f = (i2 & 4) != 0;
            this.l = (i2 & 8) == 0 ? h : i;
            this.j = new byte[2];
            this.c = 0;
            this.k = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e3]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:25:0x0090->B:33:0x00e3, LOOP_END] */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        public boolean a(byte[] input, int offset, int len, boolean finish) {
            int end = offset + len;
            int out = 0;
            int lineCount = this.k;
            int state = this.c;
            byte[] tail = this.j;
            byte[] outBuf = this.a;
            byte[] alphabet = this.l;
            while (offset + 2 < end) {
                int v = ((input[offset] & 0xFF) << 16) | ((input[offset + 1] & 0xFF) << 8) | (input[offset + 2] & 0xFF);
                outBuf[out++] = alphabet[(v >>> 18) & 63];
                outBuf[out++] = alphabet[(v >>> 12) & 63];
                outBuf[out++] = alphabet[(v >>> 6) & 63];
                outBuf[out++] = alphabet[v & 63];
                offset += 3;
                if (this.e) {
                    if (--lineCount == 0) {
                        if (this.f) outBuf[out++] = 13;
                        outBuf[out++] = 10;
                        lineCount = 19;
                    }
                }
            }
            int remaining = end - offset;
            if (finish) {
                if (remaining == 1) {
                    int v = input[offset] & 0xFF;
                    outBuf[out++] = alphabet[v >>> 2];
                    outBuf[out++] = alphabet[(v & 3) << 4];
                    if (this.d) { outBuf[out++] = 61; outBuf[out++] = 61; }
                } else if (remaining == 2) {
                    int v = ((input[offset] & 0xFF) << 8) | (input[offset + 1] & 0xFF);
                    outBuf[out++] = alphabet[v >>> 10];
                    outBuf[out++] = alphabet[(v >>> 4) & 63];
                    outBuf[out++] = alphabet[(v & 15) << 2];
                    if (this.d) outBuf[out++] = 61;
                }
                this.c = 0;
                this.k = lineCount;
            } else {
                if (remaining > 0) {
                    for (int i = 0; i < remaining; i++) tail[i] = input[offset + i];
                    this.c = remaining;
                } else {
                    this.c = state;
                }
                this.k = lineCount;
            }
            this.b = out;
            return true;
        }
    }

    private Base64() {
    }

    public static byte[] a(String str, int i) {
        return a(str.getBytes(), i);
    }

    public static byte[] b(byte[] bArr, int i) {
        return b(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!cVar.d) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.e && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (cVar.f ? 2 : 1);
        }
        cVar.a = new byte[i4];
        cVar.a(bArr, i, i2, true);
        if (a || cVar.b == i4) {
            return cVar.a;
        }
        throw new AssertionError();
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (!bVar.a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i4 = bVar.b;
        byte[] bArr2 = bVar.a;
        if (i4 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr2, 0, bArr3, 0, i4);
        return bArr3;
    }
}
