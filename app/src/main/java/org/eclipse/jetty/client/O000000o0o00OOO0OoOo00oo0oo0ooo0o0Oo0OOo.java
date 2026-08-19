package org.eclipse.jetty.client;

import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public boolean f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f4203O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class.getName());
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        super(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        this.f4203O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x02d3 A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x02d7 A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x02db A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02de A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x02e4 A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x02e7 A[Catch: all -> 0x025d, TryCatch #7 {all -> 0x025d, blocks: (B:133:0x0237, B:135:0x023f, B:137:0x0247, B:139:0x024d, B:141:0x0255, B:144:0x0260, B:170:0x02cf, B:172:0x02d3, B:174:0x02d7, B:176:0x02db, B:177:0x02dd, B:178:0x02de, B:179:0x02e3, B:180:0x02e4, B:181:0x02e6, B:182:0x02e7, B:183:0x02e9), top: B:250:0x0237, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02cf A[SYNTHETIC] */
    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        boolean z;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol2;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol3;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        boolean z2 = true;
        boolean z3 = false;
        while (z2 && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == this) {
            try {
                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                Boolean boolValueOf = Boolean.valueOf(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen());
                org.eclipse.jetty.http.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f4328O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("while open={} more={} progress={}", boolValueOf, Boolean.valueOf((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) || ((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f4329O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0())), Boolean.valueOf(z2));
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("exchange {} on {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000, this);
                try {
                    if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() || o00000OOoOOO00O00o0ooooooooO000ooooO0000 == null || o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 2) {
                        z = false;
                    } else {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("commit {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                        try {
                            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            try {
                                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Failure on " + this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, th);
                                try {
                                    synchronized (this) {
                                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
                                            if (!(th instanceof IOException)) {
                                                throw ((IOException) th);
                                            }
                                            if (!(th instanceof Error)) {
                                                throw ((Error) th);
                                            }
                                            if (th instanceof RuntimeException) {
                                                throw ((RuntimeException) th);
                                            }
                                            throw new RuntimeException(th);
                                        }
                                        try {
                                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 10 && o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 11 && !o00000OOoOOO00O00o0ooooooooO000ooooO0000.isDone() && o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                                                o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(th);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unhandle {} on {}", this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z3 = true;
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("finally {} on {} progress={} {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000, this, Boolean.valueOf(z), this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    if (z3 || (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o())) {
                                        boolean z4 = !z3 && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4336O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(z4);
                                        this.f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                                        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                                        if (z4) {
                                            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((int) this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4217O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                                        }
                                        synchronized (this) {
                                            try {
                                                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0001 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                                this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                                if (o00000OOoOOO00O00o0ooooooooO000ooooO0001 != null) {
                                                    o00000OOoOOO00O00o0ooooooooO000ooooO0001.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                                }
                                                if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101 && (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol = o00000OOoOOO00O00o0ooooooooO000ooooO0001.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) != null) {
                                                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0002 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0002 != null) {
                                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0002);
                                                    }
                                                    this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol;
                                                }
                                                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0003 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                                if (o00000OOoOOO00O00o0ooooooooO000ooooO0003 != null) {
                                                    if (z4 && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == this) {
                                                        this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OOoOOO00O00o0ooooooooO000ooooO0003;
                                                    } else {
                                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0003);
                                                    }
                                                    this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                                }
                                                if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                                    this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, !z4);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            throw th;
                        }
                    }
                    try {
                        if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() && !this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
                            if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OOoOOO00O00o0ooooooooO000ooooO0000() > 0) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("flushed", new Object[0]);
                                z = true;
                            }
                            if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4256O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 2) {
                                if (this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                                    this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o00000OOoOOO00O00o0ooooooooO000ooooO0000.getRequestContentChunk(null);
                                }
                                if (this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 != null) {
                                    if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o()) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("addChunk", new Object[0]);
                                        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                                        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 requestContentChunk = o00000OOoOOO00O00o0ooooooooO000ooooO0000.getRequestContentChunk(null);
                                        this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = requestContentChunk;
                                        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002, requestContentChunk == null);
                                        if (this.f4202O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                                            o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(4);
                                        }
                                    }
                                    this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                                    this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unhandle {} on {}", this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    throw th;
                                }
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("complete {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                                if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() < 4) {
                                    o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(4);
                                }
                                z = true;
                            }
                        }
                        if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && !this.f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("requestComplete {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            this.f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = true;
                            o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                            z = true;
                        }
                        if (!this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("parsed {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            z = true;
                        }
                        this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.flush();
                        if (this.f4203O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("hasProgressed {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            z = true;
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("finally {} on {} progress={} {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000, this, Boolean.valueOf(z), this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        if (z3 || (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o())) {
                            boolean z5 = !z3 && this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4336O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                            this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(z5);
                            this.f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                            this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                            this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                            if (z5) {
                                this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((int) this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4217O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                            }
                            synchronized (this) {
                                try {
                                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0004 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0004 != null) {
                                        o00000OOoOOO00O00o0ooooooooO000ooooO0004.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                    }
                                    if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101 && (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol3 = o00000OOoOOO00O00o0ooooooooO000ooooO0004.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) != null) {
                                        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0005 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0005 != null) {
                                            this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0005);
                                        }
                                        this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol3;
                                    }
                                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0006 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0006 != null) {
                                        if (z5 && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == this) {
                                            this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OOoOOO00O00o0ooooooooO000ooooO0006;
                                        } else {
                                            this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0006);
                                        }
                                        this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                    }
                                    if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, !z5);
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                        z2 = z;
                    } catch (Throwable th7) {
                        th = th7;
                        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Failure on " + this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, th);
                        synchronized (this) {
                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof Error)) {
                                    throw ((Error) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                throw new RuntimeException(th);
                            }
                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() != 10) {
                                o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(th);
                            }
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("finally {} on {} progress={} {}", o00000OOoOOO00O00o0ooooooooO000ooooO0000, this, Boolean.valueOf(z), this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(false);
                            this.f4201O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = false;
                            this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                            this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                            synchronized (this) {
                                try {
                                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0007 = this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                    this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0007 != null) {
                                        o00000OOoOOO00O00o0ooooooooO000ooooO0007.cancelTimeout(this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                                    }
                                    if (this.f4193O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == 101 && (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol2 = o00000OOoOOO00O00o0ooooooooO000ooooO0007.onSwitchProtocol(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) != null) {
                                        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0008 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0008 != null) {
                                            this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0008);
                                        }
                                        this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00OnSwitchProtocol2;
                                    }
                                    O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0009 = this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0009 != null) {
                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000OOoOOO00O00o0ooooooooO000ooooO0009);
                                        this.f4195O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                                    }
                                    if (this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                                        this.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, true);
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                            this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                            this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unhandle {} on {}", this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            throw th;
                        }
                        z2 = z;
                        z3 = true;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    z = false;
                }
            } catch (Throwable th10) {
                this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unhandle {} on {}", this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                throw th10;
            }
        }
        this.f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4200O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unhandle {} on {}", this.f4194O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        if (this.f4191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        }
    }

    @Override // org.eclipse.jetty.client.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        boolean zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = super.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        if (zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            this.f4203O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
        }
        return zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }
}
