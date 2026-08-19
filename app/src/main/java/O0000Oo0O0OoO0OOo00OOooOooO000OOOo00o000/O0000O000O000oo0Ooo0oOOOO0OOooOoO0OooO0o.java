package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import com.quickjs.JSArray;
import com.quickjs.JSFunction;
import com.quickjs.JSObject;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o f1534O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public ConcurrentHashMap f1535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public OkHttpClient f1536O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1537O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public static O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (f1534O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o();
            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1535O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ConcurrentHashMap();
            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1536O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new OkHttpClient.Builder().build();
            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1537O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(12);
            f1534O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        }
        return f1534O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject, WebSocket webSocket, final O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        int i = 0;
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("send", new JSFunction(jSObject.getContext(), new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(webSocket, 0)));
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE, new JSFunction(jSObject.getContext(), new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, webSocket, i)));
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("task", new JSFunction(jSObject.getContext(), new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, i, o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, webSocket)));
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("removetask", new JSFunction(jSObject.getContext(), new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, 1)));
        final int i2 = 0;
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("message", new JSFunction(jSObject.getContext(), new com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
            @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
            public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject2, JSArray jSArray) {
                switch (i2) {
                    case 0:
                        return new JSArray(jSObject2.getContext(), o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    case 1:
                        return Integer.valueOf(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    default:
                        return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
            }
        }));
        final int i3 = 1;
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("status", new JSFunction(jSObject.getContext(), new com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
            @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
            public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject2, JSArray jSArray) {
                switch (i3) {
                    case 0:
                        return new JSArray(jSObject2.getContext(), o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    case 1:
                        return Integer.valueOf(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    default:
                        return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
            }
        }));
        final int i4 = 2;
        jSObject.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("log", new JSFunction(jSObject.getContext(), new com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
            @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
            public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject2, JSArray jSArray) {
                switch (i4) {
                    case 0:
                        return new JSArray(jSObject2.getContext(), o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    case 1:
                        return Integer.valueOf(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    default:
                        return o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                }
            }
        }));
    }
}
