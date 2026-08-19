package org.eclipse.jetty.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public boolean f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public boolean f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class.getName());
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        boolean z;
        Throwable th;
        boolean z2 = false;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol = this;
        while (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen() && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol == this) {
            try {
                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                Boolean boolValueOf = Boolean.valueOf(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen());
                org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4328O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("open={} more={}", boolValueOf, Boolean.valueOf((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) || ((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4329O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0())));
                synchronized (this) {
                    o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    while (o00000OOoOOO00O00o0ooooooooO000ooooO0000 == null) {
                        try {
                            wait();
                            o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                            if (this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                                throw new InterruptedException();
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                        throw th;
                    }
                }
                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("exchange {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                try {
                    if (!this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() && o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() == 2) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("commit", new Object[0]);
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    }
                    while (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() && !this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
                        if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OOoOOO00O00o0ooooooooO000ooooO0000() > 0) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("flushed", new Object[0]);
                        }
                        if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4256O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 2) {
                            if (this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                                this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o00000OOoOOO00O00o0ooooooooO000ooooO0000.getRequestContentChunk(null);
                            }
                            if (this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("complete", new Object[0]);
                                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            } else if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o()) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("addChunk", new Object[0]);
                                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 requestContentChunk = o00000OOoOOO00O00o0ooooooooO000ooooO0000.getRequestContentChunk(null);
                                this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = requestContentChunk;
                                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002, requestContentChunk == null);
                                if (this.f4206O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                                    o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(4);
                                }
                            }
                        }
                    }
                    if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && !this.f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("requestComplete", new Object[0]);
                        this.f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = true;
                        o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                    }
                    if (!this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("parsed", new Object[0]);
                    }
                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.flush();
                    O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {}", this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{}", this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (z2 || (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o())) {
                        boolean z3 = !z2 && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4336O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(z3);
                        this.f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                        this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = false;
                        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                        if (z3) {
                            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((int) this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4217O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                        }
                        synchronized (this) {
                            try {
                                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0001 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                if (o00000OOoOOO00O00o0ooooooooO000ooooO0001 != null) {
                                    o00000OOoOOO00O00o0ooooooooO000ooooO0001.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                }
                                if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101) {
                                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol = o00000OOoOOO00O00o0ooooooooO000ooooO0001.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                }
                                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0002 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                if (o00000OOoOOO00O00o0ooooooooO000ooooO0002 != null) {
                                    if (z3 && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol == this) {
                                        this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OOoOOO00O00o0ooooooooO000ooooO0002;
                                    } else {
                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0002);
                                    }
                                    this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                }
                                if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                    this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, !z3);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4 = f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Failure on " + this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, th3);
                        try {
                            synchronized (this) {
                                try {
                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 10 && o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 11 && !o00000OOoOOO00O00o0ooooooooO000ooooO0000.isDone() && o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                                        o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(th3);
                                    }
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {}", this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{}", this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(false);
                                    this.f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                                    this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = false;
                                    this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                                    synchronized (this) {
                                        try {
                                            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0003 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                            this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0003 != null) {
                                                o00000OOoOOO00O00o0ooooooooO000ooooO0003.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                            }
                                            if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101) {
                                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol = o00000OOoOOO00O00o0ooooooooO000ooooO0003.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                                this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                            }
                                            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0004 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0004 != null) {
                                                this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0004);
                                                this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                            }
                                            if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                                this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, true);
                                            }
                                            z2 = true;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z = true;
                            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5 = f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {}", this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{}", this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            if (z || (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o())) {
                                boolean z4 = !z && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4336O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(z4);
                                this.f4205O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                                this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = false;
                                this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                                if (z4) {
                                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((int) this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4217O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                                }
                                synchronized (this) {
                                    try {
                                        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0005 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                        this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0005 != null) {
                                            o00000OOoOOO00O00o0ooooooooO000ooooO0005.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                        }
                                        if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101) {
                                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol = o00000OOoOOO00O00o0ooooooooO000ooooO0005.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                            this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                        }
                                        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0006 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0006 != null) {
                                            if (z4 && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol == this) {
                                                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OOoOOO00O00o0ooooooooO000ooooO0006;
                                            } else {
                                                this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0006);
                                            }
                                            this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                        }
                                        if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                            this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, !z4);
                                        }
                                    } catch (Throwable th7) {
                                        throw th7;
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        z = z2;
                        th = th8;
                    }
                }
            } catch (Throwable th9) {
                this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                throw th9;
            }
        }
        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        try {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("onIdleExpired {}ms {} {}", Long.valueOf(j), this, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = true;
            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
        } catch (IOException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            try {
                this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
            } catch (IOException e2) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4204O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
            }
        }
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // org.eclipse.jetty.client.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        synchronized (this) {
            super.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            this.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = true;
            notifyAll();
        }
    }

    @Override // org.eclipse.jetty.client.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        boolean zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = super.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        if (zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            synchronized (this) {
                notifyAll();
            }
        }
        return zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }
}
