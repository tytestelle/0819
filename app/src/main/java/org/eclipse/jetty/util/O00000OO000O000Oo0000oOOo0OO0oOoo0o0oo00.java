package org.eclipse.jetty.util;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Map.Entry {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public char[] f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public char[] f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public String f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public Object f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, int i) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        char[] cArr = this.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int length = cArr.length - i;
        this.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new char[i];
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new char[length];
        System.arraycopy(cArr, 0, this.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, i);
        System.arraycopy(cArr, i, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, length);
        char[] cArr2 = this.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (cArr2 != null) {
            this.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new char[i];
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new char[length];
            System.arraycopy(cArr2, 0, this.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, i);
            System.arraycopy(cArr2, i, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, length);
        }
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO._entrySet.remove(this)) {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO._entrySet.add(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        }
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO._width;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[i2];
        this.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[0] % i2] = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        char[] cArr3 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (cArr3 != null) {
            int i3 = cArr3[0] % i2;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[i3] != o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[i3] = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            }
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(StringBuilder sb) {
        sb.append("{[");
        if (this.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            int i = 0;
            while (true) {
                char[] cArr = this.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i >= cArr.length) {
                    break;
                }
                sb.append(cArr[i]);
                i++;
            }
        } else {
            sb.append('-');
        }
        sb.append(':');
        sb.append(this.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        sb.append('=');
        sb.append(this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        sb.append(']');
        if (this.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            for (int i2 = 0; i2 < this.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.length; i2++) {
                sb.append('|');
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2];
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sb);
                } else {
                    sb.append("-");
                }
            }
        }
        sb.append('}');
        if (this.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
            sb.append(",\n");
            this.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sb);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(sb);
        return sb.toString();
    }
}
