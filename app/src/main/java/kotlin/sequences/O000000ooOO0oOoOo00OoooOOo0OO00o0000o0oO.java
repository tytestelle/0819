package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f4024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f4025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, int i) {
        this.f4024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f4025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final Iterator iterator() {
        switch (this.f4024O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O((Function2) this.f4025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return (Iterator) this.f4025O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
    }
}
