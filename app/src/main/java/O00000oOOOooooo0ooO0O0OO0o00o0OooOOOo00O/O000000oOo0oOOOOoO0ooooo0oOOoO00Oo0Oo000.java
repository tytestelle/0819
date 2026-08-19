package O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

import android.os.Handler;
import android.os.Message;
import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Handler.Callback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f674O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, int i) {
        this.f673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f674O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                int i = message.what;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f674O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i == 1) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) message.obj);
                    return true;
                }
                if (i == 2) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f678O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) message.obj);
                }
                return false;
            default:
                int i2 = message.what;
                O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f674O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                switch (i2) {
                    case TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM /* 201 */:
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1032O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(0);
                        return false;
                    case TbsListener.ErrorCode.APK_PATH_ERROR /* 202 */:
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1032O00000OOoOOO00O00o0ooooooooO000ooooO0000.setVisibility(8);
                        return false;
                    case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1033O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setVisibility(0);
                        return false;
                    case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1033O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setVisibility(8);
                        return false;
                    default:
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                        return false;
                }
        }
    }
}
