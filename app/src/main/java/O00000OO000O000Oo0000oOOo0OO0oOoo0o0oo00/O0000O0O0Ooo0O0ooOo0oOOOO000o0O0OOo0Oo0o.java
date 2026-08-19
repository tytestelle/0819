package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final List f366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String f367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(Class cls, Class cls2, Class cls3, List list, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = list;
        this.f367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        List list = (List) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.acquire();
        try {
            List list2 = this.f366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            int size = list2.size();
            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O00000OOoOOO00O00o0ooooooooO000ooooO0000) list2.get(i3)).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                } catch (O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 e) {
                    list.add(e);
                }
                if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    break;
                }
            }
            if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.release(list);
                return o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
            throw new O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this.f367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, new ArrayList(list));
        } catch (Throwable th) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.release(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toArray()) + '}';
    }
}
