package O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

import com.android.cast.dlna.dmr.DLNARendererService;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.support.lastchange.LastChangeAwareServiceManager;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends LastChangeAwareServiceManager {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f96O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ DLNARendererService f97O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(LocalService localService, DLNARendererService dLNARendererService, LastChangeParser lastChangeParser, int i) {
        super(localService, lastChangeParser);
        this.f96O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f97O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = dLNARendererService;
    }

    @Override // org.fourthline.cling.model.DefaultServiceManager
    public final Object createServiceInstance() {
        switch (this.f96O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f97O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2791O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    return new com.android.cast.dlna.dmr.service.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("avTransportControl");
                throw null;
            default:
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f97O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2792O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                    return new com.android.cast.dlna.dmr.service.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("audioControl");
                throw null;
        }
    }
}
