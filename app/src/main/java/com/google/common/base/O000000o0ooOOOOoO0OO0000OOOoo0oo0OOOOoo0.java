package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final char f3351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(char c) {
        this.f3351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = c;
    }

    @Override // com.google.common.base.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(char c) {
        return c == this.f3351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f3351O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
