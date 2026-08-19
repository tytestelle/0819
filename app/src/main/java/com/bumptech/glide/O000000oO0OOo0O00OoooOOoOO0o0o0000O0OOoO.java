package com.bumptech.glide;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2836O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final HashMap f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        this.f2836O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 1:
                this.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                break;
            default:
                this.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                break;
        }
    }

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, String str) {
        HashMap map = this.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }

    public String toString() {
        switch (this.f2836O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return this.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toString();
            default:
                return super.toString();
        }
    }
}
