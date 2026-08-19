package O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        switch (i) {
            case 1:
                this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
                break;
            default:
                this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
                break;
        }
    }

    public synchronized O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Class cls) {
        int size = this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
        for (int i = 0; i < size; i++) {
            O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i);
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f712O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls)) {
                return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f713O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            }
        }
        return null;
    }

    public synchronized O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        for (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f698O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls) && cls2.isAssignableFrom(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f699O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f700O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : this.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            if ((o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f698O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls) && cls2.isAssignableFrom(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f699O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) && !arrayList.contains(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f699O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                arrayList.add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f699O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
        }
        return arrayList;
    }
}
