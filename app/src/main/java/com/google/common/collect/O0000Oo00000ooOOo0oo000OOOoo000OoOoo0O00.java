package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 extends O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f3451O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, int i) {
        this.f3451O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        this.f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$100(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, i);
        this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        int i = this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object obj = this.f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3451O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i == -1 || i >= o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.size() || !com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$100(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO))) {
            this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3451O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Map<Object, Object> mapDelegateOrNull = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(this.f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i = this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == -1) {
            return null;
        }
        return O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$600(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, i);
    }

    @Override // com.google.common.collect.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, java.util.Map.Entry
    public final Object setValue(Object obj) {
        O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f3451O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Map<Object, Object> mapDelegateOrNull = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.delegateOrNull();
        Object obj2 = this.f3449O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(obj2, obj);
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i = this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == -1) {
            o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.put(obj2, obj);
            return null;
        }
        Object objAccess$600 = O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$600(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, i);
        O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.access$1300(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, this.f3450O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, obj);
        return objAccess$600;
    }
}
