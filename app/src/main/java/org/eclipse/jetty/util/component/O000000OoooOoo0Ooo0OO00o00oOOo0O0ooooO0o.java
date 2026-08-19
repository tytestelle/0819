package org.eclipse.jetty.util.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f4489O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getName());
    }

    public boolean O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Object obj) {
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(obj, ((obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) && ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).isStarted()) ? false : true);
    }

    public final boolean O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj, boolean z) {
        Iterator it = this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            if (((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) it.next()).f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == obj) {
                return false;
            }
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4487O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
        this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (!(obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            return true;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
        if (!z || !this.f4489O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return true;
        }
        try {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.start();
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj) {
        CopyOnWriteArrayList<O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> copyOnWriteArrayList = this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : copyOnWriteArrayList) {
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == obj) {
                copyOnWriteArrayList.remove(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        ArrayList<O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> arrayList = new ArrayList(this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        Collections.reverse(arrayList);
        for (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : arrayList) {
            if ((o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) && o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4487O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).destroy();
            }
        }
        this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void doStart() {
        for (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4487O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                Object obj = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
                    if (!o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isRunning()) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.start();
                    }
                }
            }
        }
        this.f4489O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public void doStop() {
        this.f4489O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        ArrayList<O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> arrayList = new ArrayList(this.f4488O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        Collections.reverse(arrayList);
        for (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO : arrayList) {
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4487O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                Object obj = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4486O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj;
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isRunning()) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.stop();
                    }
                }
            }
        }
    }
}
