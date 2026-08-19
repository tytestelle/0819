package org.eclipse.jetty.servlet;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo extends O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, Comparable {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4424O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static final Map f4425O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public transient O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public transient O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public transient long f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final transient boolean f4430O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public transient O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4424O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.class.getName());
        f4425O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = Collections.emptyMap();
    }

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        super(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.EMBEDDED);
        this.f4430O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
        synchronized (this) {
            try {
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                    throw new IllegalArgumentException();
                }
                this.f4398O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass());
                if (this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
                    this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass().getName() + "-" + super.hashCode();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj) {
        if (obj == null) {
            return;
        }
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            Iterator it = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.destroy();
    }

    public final synchronized O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        try {
            long j = this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (j != 0) {
                if (j < 0 || (j > 0 && System.currentTimeMillis() < this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo)) {
                    throw this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                }
                this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 0L;
                this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
            }
            if (this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Servlet Not Initialized");
        }
        synchronized (this) {
            if (!isStarted()) {
                throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Servlet not initialized", -1);
            }
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null) {
                throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Could not instantiate " + this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
        }
        boolean z = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            try {
                if (!this.f4399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
                }
                if (this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
                    this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                }
                this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.service(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
            } catch (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 e) {
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(e);
                throw this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            }
        } catch (Throwable th) {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
            ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "javax.servlet.error.servlet_name");
            throw th;
        }
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(null, "org.apache.catalina.jsp_classpath");
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1950O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(null, "org.apache.catalina.jsp_classpath");
        throw null;
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000() throws O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
        try {
            if (this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
                this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
            }
            if (this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
                this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this);
            }
            if (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                throw null;
            }
            if (this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
                this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
            this.f4426O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
            this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.init(this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        } catch (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 e) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(e);
            this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            throw e;
        } catch (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 e2) {
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e2.getCause() == null ? e2 : e2.getCause());
            this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            throw e2;
        } catch (Exception e3) {
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e3);
            this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, e3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        boolean zEquals = false;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
            return false;
        }
        for (Class<?> superclass = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass(); superclass != null && !zEquals; superclass = superclass.getSuperclass()) {
            zEquals = "org.apache.jasper.servlet.JspServlet".equals(superclass.getName());
        }
        return zEquals;
    }

    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        if (this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 || this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == 0) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1956O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("unavailable", o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = -1L;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.isPermanent()) {
                this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = -1L;
            } else if (this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getUnavailableSeconds() > 0) {
                this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = System.currentTimeMillis() + ((long) (this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getUnavailableSeconds() * 1000));
            } else {
                this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = System.currentTimeMillis() + 5000;
            }
        }
    }

    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(Throwable th) {
        if (th instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) th);
            return;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4424O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 2) {
                StringBuilder sb = new StringBuilder(64);
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":INFO:", "unavailable", new Object[0]);
                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(sb, th);
                System.err.println(sb);
            }
        } else {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1956O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("unavailable", th);
        }
        this.f4431O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, String.valueOf(th), -1, th);
        this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = -1L;
    }

    public final O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() throws IllegalAccessException, InstantiationException, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
        try {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null ? (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.newInstance() : o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        } catch (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 e) {
            Throwable rootCause = e.getRootCause();
            if (rootCause instanceof InstantiationException) {
                throw ((InstantiationException) rootCause);
            }
            if (rootCause instanceof IllegalAccessException) {
                throw ((IllegalAccessException) rootCause);
            }
            throw e;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str;
        if (!(obj instanceof O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo)) {
            return 1;
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) obj;
        int iCompareTo = 0;
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == this) {
            return 0;
        }
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        String str2 = this.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (str2 != null && (str = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) != null) {
            iCompareTo = str2.compareTo(str);
        }
        return iCompareTo == 0 ? this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareTo(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) : iCompareTo;
    }

    @Override // org.eclipse.jetty.servlet.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStart() throws Exception {
        this.f4429O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 0L;
        if (this.f4430O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            try {
                super.doStart();
                try {
                    Class cls = this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (cls == null || !O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class.isAssignableFrom(cls)) {
                        throw new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Servlet " + this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " is not a javax.servlet.Servlet");
                    }
                    this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
                    this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this);
                    Class cls2 = this.f4395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (cls2 != null && O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.class.isAssignableFrom(cls2)) {
                        this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this);
                    }
                    if (this.f4398O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                        try {
                            O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                        } catch (Exception e) {
                            this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
                            throw e;
                        }
                    }
                } catch (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 e2) {
                    O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(e2);
                    this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
                    throw e2;
                }
            } catch (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 e3) {
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(e3);
                this.f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getClass();
                throw e3;
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStop() {
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            try {
                O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            } catch (Exception e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4424O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            }
        }
        if (!this.f4398O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            this.f4427O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
        }
        this.f4428O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
    }

    public final boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }

    public final int hashCode() {
        String str = this.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        return str == null ? System.identityHashCode(this) : str.hashCode();
    }
}
