package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 f525O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 f526O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(2);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 f528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final HashSet f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f530O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = f525O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();
        this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashSet();
        this.f530O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
    }

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Class cls, Class cls2, O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(cls, cls2, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        ArrayList arrayList = this.f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        arrayList.add(arrayList.size(), o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
    }

    public final synchronized O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O : this.f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                if (this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.contains(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O)) {
                    z = true;
                } else if (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls) && o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isAssignableFrom(cls2)) {
                    this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    arrayList.add(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this));
                    this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.remove(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                }
            }
            if (arrayList.size() > 1) {
                O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = this.f528O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f530O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getClass();
                return new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(arrayList, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            }
            if (arrayList.size() == 1) {
                return (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) arrayList.get(0);
            }
            if (!z) {
                throw new com.bumptech.glide.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO((Class<?>) cls, (Class<?>) cls2);
            }
            return f526O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        } catch (Throwable th) {
            this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
            throw th;
        }
    }

    public final synchronized ArrayList O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O : this.f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                if (!this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.contains(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) && o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls)) {
                    this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                    arrayList.add(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f524O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this));
                    this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.remove(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                }
            }
        } catch (Throwable th) {
            this.f529O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O : this.f527O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            if (!arrayList.contains(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls)) {
                arrayList.add(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f523O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
        }
        return arrayList;
    }
}
