package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo implements com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f516O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f517O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public List f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f519O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(ArrayList arrayList, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = arrayList;
        this.f515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return ((com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(0)).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        List list = this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (list != null) {
            this.f514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.release(list);
        }
        this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        Iterator it = this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) it.next()).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Exception exc) {
        List list = this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(list, "Argument must not be null");
        list.add(exc);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f516O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f517O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (List) this.f514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.acquire();
        ((com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(this.f515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, this);
        if (this.f519O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            cancel();
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        if (this.f519O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return;
        }
        if (this.f515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() - 1) {
            this.f515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o++;
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f516O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f517O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        } else {
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            this.f517O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000("Fetch failed", new ArrayList(this.f518O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)));
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) {
        if (obj != null) {
            this.f517O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        } else {
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        this.f519O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
        Iterator it = this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        return ((com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(0)).getDataSource();
    }
}
