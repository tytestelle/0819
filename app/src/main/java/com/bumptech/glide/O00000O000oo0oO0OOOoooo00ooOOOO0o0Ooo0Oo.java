package com.bumptech.glide;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f2839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f2843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f2845O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2846O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(9);

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2847O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2848O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new Pools.SynchronizedPool(20), new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
        this.f2848O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f2839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        this.f2840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(7);
        this.f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(10);
        this.f2842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1);
        this.f2843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        this.f2844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
        this.f2845O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(6);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        synchronized (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Class cls, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f2840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        synchronized (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            ((ArrayList) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add(new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(cls, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Class cls, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f2842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        synchronized (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cls, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00));
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Class cls, Class cls2, O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f2839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        synchronized (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(cls, cls2, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            ((HashMap) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).clear();
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, Class cls, Class cls2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        synchronized (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(str).add(new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(cls, cls2, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0));
        }
    }

    public final ArrayList O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(cls, cls2)) {
            for (Class cls5 : this.f2844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(cls4, cls3)) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f2841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                synchronized (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).iterator();
                    while (it.hasNext()) {
                        List<O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> list = (List) ((HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get((String) it.next());
                        if (list != null) {
                            for (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : list) {
                                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls) && cls4.isAssignableFrom(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                                    arrayList.add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f711O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOO00O00o0ooooooooO000ooooO0000(cls, cls4, cls5, arrayList, this.f2844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(cls4, cls5), this.f2848O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO));
            }
        }
        return arrayList2;
    }

    public final ArrayList O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        ArrayList arrayList;
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f2845O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            arrayList = (ArrayList) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        if (arrayList.isEmpty()) {
            throw new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        }
        return arrayList;
    }

    public final List O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj) {
        List listUnmodifiableList;
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f2839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.getClass();
        Class<?> cls = obj.getClass();
        synchronized (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
            O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) ((HashMap) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(cls);
            listUnmodifiableList = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O == null ? null : o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.f510O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(cls));
                if (((O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) ((HashMap) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(cls, new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj);
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) listUnmodifiableList.get(i);
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj, (List<O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0>) listUnmodifiableList);
        }
        return listEmptyList;
    }

    public final com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        com.bumptech.glide.load.data.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f2843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        synchronized (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            try {
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
                com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((HashMap) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(obj.getClass());
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                    for (com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 : ((HashMap) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).values()) {
                        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().isAssignableFrom(obj.getClass())) {
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                            break;
                        }
                    }
                }
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2883O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                }
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f2845O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            ((ArrayList) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(com.bumptech.glide.load.data.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f2843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        synchronized (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            ((HashMap) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Class cls, Class cls2, O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f2844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        synchronized (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(cls, cls2, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        }
    }
}
