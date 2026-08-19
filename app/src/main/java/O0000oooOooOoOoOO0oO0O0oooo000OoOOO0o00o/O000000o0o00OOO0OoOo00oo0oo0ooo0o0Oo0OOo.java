package O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends Writer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1862O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        org.eclipse.jetty.http.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1838O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO {
        this.f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.flush();
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        while (i2 > 512) {
            write(str, i, 512);
            i += 512;
            i2 -= 512;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1842O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1842O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new char[512];
        }
        char[] cArr = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1842O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        str.getChars(i, i + i2, cArr, 0);
        write(cArr, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173 A[SYNTHETIC] */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int codePoint;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        while (i6 > 0) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.reset();
            int length = i6 <= 512 ? i6 : 512;
            int i7 = this.f1846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (i7 != 0) {
                int i8 = 1;
                int i9 = 0;
                if (i7 == 1) {
                    byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    int count = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getCount();
                    if (length > bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length - count) {
                        length = bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length - count;
                    }
                    while (i9 < length) {
                        char c = cArr[i5 + i9];
                        int i10 = count + 1;
                        if (c >= 256) {
                            c = '?';
                        }
                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[count] = (byte) c;
                        i9++;
                        count = i10;
                    }
                    if (count >= 0) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(count);
                    }
                } else if (i7 == 2) {
                    byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    int count2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getCount();
                    if (count2 + length > bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                        length = bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length - count2;
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        char c2 = cArr[i5 + i11];
                        if (this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0) {
                            if (Character.isHighSurrogate(c2)) {
                                codePoint = c2;
                                this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = c2;
                            }
                            i11 += i8;
                        } else {
                            char c3 = c2;
                            if (Character.isLowSurrogate(c3)) {
                                codePoint = Character.toCodePoint((char) this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, c3);
                            } else {
                                int i12 = this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                i11--;
                                codePoint = i12;
                            }
                        }
                        codePoint = c2;
                        if ((codePoint & (-128)) != 0) {
                            if ((codePoint & (-2048)) == 0) {
                                i4 = count2 + 2;
                                if (i4 <= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) ((codePoint >> 6) | PsExtractor.AUDIO_STREAM);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 1] = (byte) ((codePoint & 63) | 128);
                                    count2 = i4;
                                    this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                    if (count2 == bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                        i11++;
                                    } else {
                                        i8 = 1;
                                        i11 += i8;
                                    }
                                }
                            } else if (((-65536) & codePoint) == 0) {
                                i4 = count2 + 3;
                                if (i4 <= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) ((codePoint >> 12) | 224);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 2] = (byte) ((codePoint & 63) | 128);
                                    count2 = i4;
                                    this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                    if (count2 == bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                        i11++;
                                    } else {
                                        i8 = 1;
                                        i11 += i8;
                                    }
                                }
                            } else if (((-14680064) & codePoint) == 0) {
                                i4 = count2 + 4;
                                if (i4 <= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) ((codePoint >> 18) | 240);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 3] = (byte) ((codePoint & 63) | 128);
                                    count2 = i4;
                                    this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                    if (count2 == bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                        i11++;
                                    } else {
                                        i8 = 1;
                                        i11 += i8;
                                    }
                                }
                            } else if (((-201326592) & codePoint) == 0) {
                                i3 = count2 + 5;
                                if (i3 <= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) ((codePoint >> 24) | 248);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 1] = (byte) (((codePoint >> 18) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 2] = (byte) (((codePoint >> 12) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 3] = (byte) (((codePoint >> 6) & 63) | 128);
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 4] = (byte) ((codePoint & 63) | 128);
                                    count2 = i3;
                                    this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                    if (count2 == bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                        i11++;
                                    } else {
                                        i8 = 1;
                                        i11 += i8;
                                    }
                                }
                            } else {
                                if ((Integer.MIN_VALUE & codePoint) == 0) {
                                    i3 = count2 + 6;
                                    if (i3 <= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) ((codePoint >> 30) | 252);
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 1] = (byte) (((codePoint >> 24) & 63) | 128);
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 2] = (byte) (((codePoint >> 18) & 63) | 128);
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 3] = (byte) (((codePoint >> 12) & 63) | 128);
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 4] = (byte) (((codePoint >> 6) & 63) | 128);
                                        bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2 + 5] = (byte) ((codePoint & 63) | 128);
                                    }
                                } else {
                                    i3 = count2 + 1;
                                    bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = 63;
                                }
                                count2 = i3;
                                this.f1847O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
                                if (count2 == bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                                    i11++;
                                } else {
                                    i8 = 1;
                                    i11 += i8;
                                }
                            }
                            length = i11;
                            break;
                        }
                        if (count2 >= bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.length) {
                            length = i11;
                            break;
                        } else {
                            bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2[count2] = (byte) codePoint;
                            count2++;
                            i11 += i8;
                        }
                    }
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(count2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1841O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1841O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new OutputStreamWriter(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, (String) null);
                }
                OutputStreamWriter outputStreamWriter = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1841O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                outputStreamWriter.write(cArr, i5, length);
                outputStreamWriter.flush();
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1843O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.writeTo(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            i6 -= length;
            i5 += length;
        }
    }
}
