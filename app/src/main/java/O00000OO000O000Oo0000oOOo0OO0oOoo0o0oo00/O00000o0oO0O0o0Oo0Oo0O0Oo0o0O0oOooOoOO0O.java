package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O implements O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public volatile Object f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Object obj) {
        this.f307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
            synchronized (this) {
                try {
                    if (((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
                        File cacheDir = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) ((O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f447O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getCacheDir();
                        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(file);
                        }
                        this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    }
                    if (((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
                        this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public Object get() {
        if (this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            synchronized (this) {
                try {
                    if (this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                        Object obj = ((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get();
                        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "Argument must not be null");
                        this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
