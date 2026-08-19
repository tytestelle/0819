package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements Appendable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Appendable f362O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;

    public O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(Appendable appendable) {
        this.f362O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Appendable appendable = this.f362O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
            appendable.append("  ");
        }
        this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Appendable appendable = this.f362O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        boolean z2 = false;
        if (z) {
            this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f363O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
