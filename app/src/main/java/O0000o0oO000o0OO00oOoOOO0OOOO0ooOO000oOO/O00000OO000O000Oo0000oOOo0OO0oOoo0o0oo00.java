package O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;

/* JADX INFO: loaded from: classes2.dex */
public class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    private boolean permanent;
    private int seconds;
    private O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO servlet;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String str) {
        super(str);
        this.servlet = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.permanent = true;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getServlet() {
        return this.servlet;
    }

    public int getUnavailableSeconds() {
        if (this.permanent) {
            return -1;
        }
        return this.seconds;
    }

    public boolean isPermanent() {
        return this.permanent;
    }

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String str) {
        super(str);
        this.servlet = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (i <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i;
        }
        this.permanent = false;
    }

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str) {
        super(str);
        this.permanent = true;
    }

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str, int i) {
        super(str);
        if (i <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i;
        }
        this.permanent = false;
    }
}
