package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LinkedHashMap f818O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final long f819O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public long f820O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(long j) {
        this.f819O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
    }

    public final synchronized Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f818O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(obj);
        return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null;
    }

    public int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        return 1;
    }

    public final synchronized Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, Object obj2) {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj2);
        long j = iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (j >= this.f819O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f820O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o += j;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f818O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.put(obj, obj2 == null ? null : new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(obj2, iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
            this.f820O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o -= (long) o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(obj2)) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            }
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f819O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null;
    }

    public final synchronized void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(long j) {
        while (this.f820O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > j) {
            Iterator it = this.f818O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) entry.getValue();
            this.f820O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o -= (long) o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            Object key = entry.getKey();
            it.remove();
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(key, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2) {
    }
}
