package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import com.tencent.smtt.sdk.ValueCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f995O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, int i) {
        this.f994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f995O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f994O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f995O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                final int i = 1;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.evaluateJavascript("javascript: play()", new ValueCallback() { // from class: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
                    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        switch (i) {
                            case 0:
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                                break;
                            default:
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = this.f995O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                final int i2 = 0;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f1010O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.evaluateJavascript("javascript: pause()", new ValueCallback() { // from class: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
                    @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        switch (i2) {
                            case 0:
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
                                break;
                            default:
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f1013O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
