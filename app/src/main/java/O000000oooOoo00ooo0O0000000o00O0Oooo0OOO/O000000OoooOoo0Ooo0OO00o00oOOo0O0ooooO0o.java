package O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public ByteBuffer f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final byte[] f156O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new byte[256];

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f159O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0;

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != 0;
    }

    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        byte[] bArr;
        if (this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            return this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f150O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f151O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f152O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & 128) != 0;
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f153O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (int) Math.pow(2.0d, (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & 7) + 1);
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f154O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.getClass();
            if (this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f152O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && !O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.f145O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.f153O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.f155O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.f145O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.f154O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO];
            }
        } else {
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
        }
        if (!O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
            boolean z = false;
            while (!z && !O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() && this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f147O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o <= Integer.MAX_VALUE) {
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 == 33) {
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == 1) {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    } else if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == 249) {
                        this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        int i2 = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 & 28) >> 2;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f140O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i2;
                        if (i2 == 0) {
                            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f140O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 1;
                        }
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f139O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 & 1) != 0;
                        short s = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f142O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = s * 10;
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f141O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    } else if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == 254) {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    } else if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 != 255) {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    } else {
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f156O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                                }
                                if (this.f159O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo <= 0) {
                                    break;
                                }
                            } while (!O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
                        } else {
                            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                        }
                    }
                } else if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 == 44) {
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f134O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f135O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f136O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f137O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getShort();
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    boolean z2 = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5 & 7) + 1);
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.f138O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5 & 64) != 0;
                    if (z2) {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.f144O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iPow);
                    } else {
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.f144O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
                    }
                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f143O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.position();
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    if (!O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6.f147O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o++;
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6.f149O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.add(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6.f148O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    }
                } else if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != 59) {
                    this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
                } else {
                    z = true;
                }
            }
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7 = this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7.f147O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < 0) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
            }
        }
        return this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        try {
            return this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get() & 255;
        } catch (Exception unused) {
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
            return 0;
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        this.f159O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f159O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(this.f156O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(this.f159O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    Log.d("GifHeaderParser", sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString(), e);
                }
                this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
                return;
            }
        }
    }

    public final int[] O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f146O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
        }
        return iArr;
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        do {
            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.position(Math.min(this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.position() + iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.limit()));
        } while (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > 0);
    }
}
