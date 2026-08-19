package androidx.core.content;

import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.f2146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1(str);
                break;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0(str);
                break;
        }
    }
}
