package org.eclipse.jetty.client;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4189O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final org.eclipse.jetty.http.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public int f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public volatile O00000OOoOOO00O00o0ooooooooO000ooooO0000 f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public O00000OOoOOO00O00o0ooooooooO000ooooO0000 f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f4196O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final AtomicBoolean f4197O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4189O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class.getName());
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        super(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        this.f4196O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
        this.f4197O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new AtomicBoolean(false);
        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new org.eclipse.jetty.http.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2, o00000OOoOOO00O00o0ooooooooO000ooooO0000, new O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, 1));
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        boolean z;
        synchronized (this) {
            z = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null;
        }
        return z;
    }

    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        synchronized (this) {
            try {
                if (!this.f4197O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.compareAndSet(true, false)) {
                    return false;
                }
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f4196O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        String string;
        String str;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null && !o00000OOoOOO00O00o0ooooooooO000ooooO0000.isDone()) {
            switch (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus()) {
                case 6:
                    if (!this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() || !this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(1)) {
                        string = o00000OOoOOO00O00o0ooooooooO000ooooO0000.toString();
                        if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen()) {
                            str = "closed: ";
                        } else if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                            str = "half closed: ";
                        } else {
                            str = "local close: ";
                        }
                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                            o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, string)));
                        }
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    string = o00000OOoOOO00O00o0ooooooooO000ooooO0000.toString();
                    if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen()) {
                        str = "closed: ";
                    } else if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                        str = "half closed: ";
                    } else {
                        str = "local close: ";
                    }
                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                        o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, string)));
                    }
                    break;
            }
        }
        if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen()) {
            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
            this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, true);
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        synchronized (this) {
            try {
                this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
                if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getStatus() != 2) {
                    throw new IllegalStateException();
                }
                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setStatus(3);
                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getVersion());
                String method = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getMethod();
                String requestURI = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getRequestURI();
                this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
                org.eclipse.jetty.http.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                if (method == null || "GET".equals(method)) {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4260O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = org.eclipse.jetty.http.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4323O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                } else {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4260O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = org.eclipse.jetty.http.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f4322O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(method);
                }
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4261O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = requestURI;
                if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4258O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 9) {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4266O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = true;
                }
                this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4345O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = "HEAD".equalsIgnoreCase(method);
                org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO requestFields = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getRequestFields();
                if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getVersion() >= 11) {
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4317O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    if (!requestFields.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsKey(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo))) {
                        requestFields.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4233O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    }
                }
                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 requestContent = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getRequestContent();
                if (requestContent != null) {
                    long jO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) requestContent).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                    requestFields.getClass();
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0("Content-Length");
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(32);
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, jO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                    requestFields.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(requestFields, false);
                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(requestContent), true);
                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setStatus(4);
                } else if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getRequestContentSource() != null) {
                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(requestFields, false);
                } else {
                    requestFields.getClass();
                    requestFields.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(org.eclipse.jetty.http.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0("Content-Length"));
                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(requestFields, true);
                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setStatus(4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        synchronized (this) {
            if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                try {
                    this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, true);
                } catch (IOException e) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4189O000000oooOoo00ooo0O0000000o00O0Oooo0OOO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                }
            }
        }
    }

    public boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4189O000000oooOoo00ooo0O0000000o00O0Oooo0OOO).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Send {} on {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000, this);
        synchronized (this) {
            try {
                if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
                    if (this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                        this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
                        return true;
                    }
                    throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                }
                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.associate(this);
                if (!this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen()) {
                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.disassociate();
                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                    return false;
                }
                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setStatus(2);
                long timeout = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getTimeout();
                if (timeout <= 0) {
                    timeout = this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4218O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                }
                long jO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                if (timeout > 0 && timeout > jO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((int) timeout) * 2);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        synchronized (this) {
            try {
                if (!this.f4197O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.compareAndSet(false, true)) {
                    throw new IllegalStateException();
                }
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4221O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4196O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final void onClose() {
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final String toString() {
        String string = super.toString();
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        return String.format("%s %s g=%s p=%s", string, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null ? "?.?.?.?:??" : o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }
}
