package com.quickjs;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Method f3845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Method method, O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f3845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = method;
        this.f3846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject, JSArray jSArray) {
        Method method = this.f3845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            return method.invoke(this.f3846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, JSObject.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(method, jSArray));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override // com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JSArray jSArray) {
        Method method = this.f3845O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            method.invoke(this.f3846O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, JSObject.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(method, jSArray));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
