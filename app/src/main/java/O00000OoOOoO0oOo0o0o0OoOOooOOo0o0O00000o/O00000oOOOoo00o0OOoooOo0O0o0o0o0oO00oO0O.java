package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f520O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(ArrayList arrayList, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f520O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = arrayList;
        this.f521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        Iterator it = this.f520O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            if (((O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) it.next()).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ArrayList arrayList = this.f520O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        for (int i3 = 0; i3 < size; i3++) {
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) arrayList.get(i3);
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj) && (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj, i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) != null) {
                arrayList2.add(o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f509O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
        }
        if (arrayList2.isEmpty() || o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            return null;
        }
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(arrayList2, this.f521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f520O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toArray()) + '}';
    }
}
