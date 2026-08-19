package org.eclipse.jetty.servlet;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.jetty.http.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import org.eclipse.jetty.http.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4407O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[] f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public ArrayList f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public org.eclipse.jetty.util.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[] f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[0];

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final boolean f4412O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = true;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[0];

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public final HashMap f4415O00000OOoOOO00O00o0ooooooooO000ooooO0000 = new HashMap();

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public final HashMap f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new HashMap();

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public final ConcurrentMap[] f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new ConcurrentMap[31];

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public final Queue[] f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new Queue[31];

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class.getName());
        f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4407O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("unhandled");
    }

    public static void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Not Found " + ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), new Object[0]);
        }
    }

    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 = this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 != null && o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 != o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, null, "filter", true);
            this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, null, "filterMapping", true);
            this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, null, "servlet", true);
            this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, null, "servletMapping", true);
        }
        super.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null || o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1 == o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
            return;
        }
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, null, this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, "filter", true);
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, null, this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, "filterMapping", true);
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, null, this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, "servlet", true);
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, null, this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, "servletMapping", true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ab A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d8 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01de A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x020c A[Catch: all -> 0x00bc, TRY_ENTER, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0210 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0214 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0221  */
    /* JADX WARN: Code duplicated, block: B:135:0x022c  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0141 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0145 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x014e A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0168 A[Catch: all -> 0x00bc, TryCatch #5 {all -> 0x00bc, blocks: (B:44:0x008d, B:46:0x00af, B:49:0x00bf, B:51:0x00cf, B:52:0x00d3, B:87:0x0139, B:89:0x013d, B:91:0x0141, B:93:0x0145, B:95:0x014e, B:105:0x01b8, B:107:0x01cb, B:109:0x01cf, B:111:0x01d8, B:112:0x01de, B:113:0x01e4, B:114:0x01ea, B:96:0x0168, B:98:0x016c, B:101:0x0171, B:103:0x01a1, B:104:0x01ab, B:121:0x020c, B:122:0x020f, B:123:0x0210, B:124:0x0213, B:125:0x0214, B:126:0x0217), top: B:138:0x0050 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x01ea, please report this as an issue */
    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(String str, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws Throwable {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2;
        Throwable th;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr2;
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1898O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1910O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        Exception exc = null;
        if (str.startsWith(ServiceReference.DELIMITER)) {
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null || (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr2 = this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) == null || o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr2.length <= 0) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
            } else {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, str, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            }
        } else if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null || (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr = this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) == null || o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr.length <= 0) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
        } else {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, null, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        Object[] objArr = {o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o};
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("chain={}", objArr);
        try {
            try {
                try {
                    try {
                        try {
                            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            } else if (this.f1963O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                                O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            } else {
                                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(str, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            }
                            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                            }
                        } catch (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO e) {
                            throw e;
                        } catch (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o e2) {
                            throw e2;
                        }
                    } catch (O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO e3) {
                        throw e3;
                    } catch (Error e4) {
                        if (!O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.REQUEST.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) && !O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.ASYNC.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                            throw e4;
                        }
                        StringBuilder sb = new StringBuilder("Error for ");
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        sb.append(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb.toString(), e4);
                        if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.toString(), new Object[0]);
                        }
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e4.getClass(), "javax.servlet.error.exception_type");
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e4, "javax.servlet.error.exception");
                        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Response already committed for handling ", e4);
                        } else {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(TbsListener.ErrorCode.INFO_CODE_MINIQB);
                        }
                        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                        }
                        if (!o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                            return;
                        }
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    }
                } catch (Exception e5) {
                    if (!O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.REQUEST.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) && !O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.ASYNC.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                        if (e5 instanceof IOException) {
                            throw ((IOException) e5);
                        }
                        if (e5 instanceof RuntimeException) {
                            throw ((RuntimeException) e5);
                        }
                        if (e5 instanceof O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                            throw ((O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) e5);
                        }
                    }
                    try {
                        if (!(e5 instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00)) {
                            if (e5 instanceof O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e5);
                                Throwable rootCause = ((O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) e5).getRootCause();
                                if (rootCause != null) {
                                    th = rootCause;
                                }
                            }
                            if (!(th instanceof org.eclipse.jetty.http.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                                throw ((org.eclipse.jetty.http.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) th);
                            }
                            if (!(th instanceof O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o)) {
                                throw ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) th);
                            }
                            if (!(th instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) {
                                throw ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) th);
                            }
                            if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4.toString(), new Object[0]);
                            } else if (!(th instanceof IOException) || (th instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00)) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                            } else {
                                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Error Processing URI: {} - ({}) {}", o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th.getClass().getName(), th.getMessage());
                                O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = f4407O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                                if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                                }
                            }
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th.getClass(), "javax.servlet.error.exception_type");
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th, "javax.servlet.error.exception");
                            if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Response already committed for handling " + th, new Object[0]);
                            } else if (th instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(TbsListener.ErrorCode.INFO_CODE_MINIQB);
                            } else if (((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) th).isPermanent()) {
                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST);
                            } else {
                                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(503);
                            }
                            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                            }
                            if (!o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                                return;
                            }
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e5);
                        th = e5;
                        if (!(th instanceof org.eclipse.jetty.http.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                            throw ((org.eclipse.jetty.http.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) th);
                        }
                        if (!(th instanceof O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o)) {
                            throw ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) th);
                        }
                        if (!(th instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) {
                            throw ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) th);
                        }
                        if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO6 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO6.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO6.toString(), new Object[0]);
                        } else if (th instanceof IOException) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                        } else {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(), th);
                        }
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th.getClass(), "javax.servlet.error.exception_type");
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th, "javax.servlet.error.exception");
                        if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Response already committed for handling " + th, new Object[0]);
                        } else if (th instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(TbsListener.ErrorCode.INFO_CODE_MINIQB);
                        } else if (((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) th).isPermanent()) {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST);
                        } else {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(503);
                        }
                        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                        }
                        if (!o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                            return;
                        }
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    } catch (Throwable th2) {
                        th = th2;
                        exc = e5;
                        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                        }
                        if (exc != null) {
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                }
                if (exc != null) {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            exc = null;
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1900O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
            }
            if (exc != null) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O()) {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                }
            }
            throw th;
        }
    }

    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(String str, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        String strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        String str2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1903O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1898O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (str.startsWith(ServiceReference.DELIMITER)) {
            O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 match = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo == null ? null : o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.getMatch(str);
            if (match != null) {
                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) match.f4386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                String str3 = match.f4385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                String strPathMatch = match.f4387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (strPathMatch == null) {
                    strPathMatch = O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.pathMatch(str3, str);
                }
                String strPathInfo = O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.pathInfo(str3, str);
                if (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.INCLUDE.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(strPathMatch, "javax.servlet.include.servlet_path");
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(strPathInfo, "javax.servlet.include.path_info");
                } else {
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1912O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = strPathMatch;
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1903O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = strPathInfo;
                }
            } else {
                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            }
        } else {
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.get(str);
        }
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("servlet {}|{}|{} -> {}", o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1897O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(), o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1903O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        try {
            O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1910O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1910O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1966O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(str, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            } else {
                O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = this.f1965O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.O00000OOoOOO00O00o0ooooooooO000ooooO0000(str, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                } else {
                    O00000OOoOOO00O00o0ooooooooO000ooooO0000(str, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
            }
            if (o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 != null) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1910O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2;
            }
        } finally {
            if (0 != 0) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1910O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = null;
            }
            if (!O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.INCLUDE.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1912O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = strO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1903O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = str2;
            }
        }
    }

    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, String str, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        org.eclipse.jetty.util.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        ArrayList arrayList;
        ConcurrentMap[] concurrentMapArr;
        String str2 = str == null ? o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : str;
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1898O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4390O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.ordinal()];
        char c = 1;
        if (i != 1) {
            c = 2;
            if (i == 2) {
                c = 16;
            } else if (i != 3) {
                c = 4;
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalArgumentException(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.toString());
                    }
                    c = '\b';
                }
            }
        }
        if (this.f4412O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo && (concurrentMapArr = this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) != null) {
        }
        if (str != null && (arrayList = this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) != null && arrayList.size() > 0) {
            this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.get(0).getClass();
            throw new ClassCastException();
        }
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null || (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) == null || o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size() <= 0 || this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.size() <= 0) {
            return null;
        }
        Object obj = this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.get(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj) > 0) {
            org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj, 0).getClass();
            throw new ClassCastException();
        }
        Object obj2 = this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.get("*");
        if (org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(obj2) <= 0) {
            return null;
        }
        org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(obj2, 0).getClass();
        throw new ClassCastException();
    }

    public final void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() throws Exception {
        org.eclipse.jetty.util.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new org.eclipse.jetty.util.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[] o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr = this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr != null && o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr.length > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr[0];
            throw null;
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr != null) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[]) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.clone();
            Arrays.sort(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2);
            for (int i = 0; i < o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2.length; i++) {
                try {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2[i];
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4397O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    }
                    o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr2[i].start();
                } catch (Throwable th) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EXCEPTION ", th);
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.add(th);
                }
            }
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.ifExceptionThrow();
        }
    }

    public final void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() {
        Queue[] queueArr = this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        Queue queue = queueArr[1];
        if (queue != null) {
            queue.clear();
            queueArr[2].clear();
            queueArr[4].clear();
            queueArr[8].clear();
            queueArr[16].clear();
            ConcurrentMap[] concurrentMapArr = this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
            concurrentMapArr[1].clear();
            concurrentMapArr[2].clear();
            concurrentMapArr[4].clear();
            concurrentMapArr[8].clear();
            concurrentMapArr[16].clear();
        }
    }

    public final synchronized void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr) {
        try {
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f1946O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null) {
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr, "servlet", true);
            }
            this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr;
            O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
            O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x013f A[Catch: all -> 0x000c, Exception -> 0x0133, TRY_LEAVE, TryCatch #1 {Exception -> 0x0133, blocks: (B:48:0x0128, B:50:0x012c, B:59:0x013f, B:55:0x0135, B:57:0x0139), top: B:69:0x0128, outer: #0 }] */
    public final synchronized void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() {
        String[] strArr;
        try {
            if (this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
                this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = null;
                this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
            } else {
                this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new ArrayList();
                this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new org.eclipse.jetty.util.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr = this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr.length > 0) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oArr[0];
                    throw null;
                }
            }
            if (this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = null;
            } else {
                O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                int i = 0;
                while (true) {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[] o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr = this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    if (i >= o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr.length) {
                        this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                        break;
                    }
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.get(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0Arr[i].f4433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null) {
                        throw new IllegalStateException("No such servlet: " + this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[i].f4433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    }
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4430O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 && (strArr = this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[i].f4432O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) != null) {
                        for (String str : strArr) {
                            if (str != null) {
                                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.put(str, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                            }
                        }
                    }
                    i++;
                }
            }
            ConcurrentMap[] concurrentMapArr = this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
            if (concurrentMapArr != null) {
                int length = concurrentMapArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    ConcurrentMap concurrentMap = this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[i2];
                    if (concurrentMap != null) {
                        concurrentMap.clear();
                    }
                    length = i2;
                }
            }
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
            if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("filterNameMap=" + this.f4415O00000OOoOOO00O00o0ooooooooO000ooooO0000, new Object[0]);
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("pathFilters=" + this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, new Object[0]);
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("servletFilterMap=" + this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, new Object[0]);
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("servletPathMap=" + this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, new Object[0]);
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("servletNameMap=" + this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, new Object[0]);
            }
            try {
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null && o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.isStarted()) {
                    O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                } else if (this.f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null && isStarted()) {
                    O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() {
        try {
            this.f4415O00000OOoOOO00O00o0ooooooooO000ooooO0000.clear();
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[] o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr = this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            int i = 0;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr != null && o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr.length > 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr[0];
                throw null;
            }
            this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.clear();
            if (this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 != null) {
                while (true) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    if (i >= o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.length) {
                        break;
                    }
                    HashMap map = this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i];
                    map.put(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i].f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this;
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final synchronized void doStart() {
        try {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1948O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.get();
            this.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null ? null : o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            this.f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
                Object objO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(null, O0000ooOoo00O0Oo0OOoOoO0OO00o0oo00oo0Oo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class);
                if (objO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 != null) {
                    o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(objO00000O00oOOo000000OOOo00OOOo0OooOO00OO0, 0);
                }
                if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                    throw new ClassCastException();
                }
            }
            O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
            O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
            if (this.f4412O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[1] = new ConcurrentHashMap();
                this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[2] = new ConcurrentHashMap();
                this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[4] = new ConcurrentHashMap();
                this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[8] = new ConcurrentHashMap();
                this.f4420O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0[16] = new ConcurrentHashMap();
                this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O[1] = new ConcurrentLinkedQueue();
                this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O[2] = new ConcurrentLinkedQueue();
                this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O[4] = new ConcurrentLinkedQueue();
                this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O[8] = new ConcurrentLinkedQueue();
                this.f4421O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O[16] = new ConcurrentLinkedQueue();
            }
            super.doStart();
            if (this.f4408O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0014, B:9:0x001a, B:10:0x001c, B:14:0x0021, B:15:0x002e, B:16:0x002f, B:18:0x0052, B:21:0x0057, B:25:0x0069, B:27:0x0073, B:28:0x007e, B:30:0x0084, B:32:0x0098, B:33:0x009c, B:24:0x0060, B:35:0x00a1), top: B:44:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0014, B:9:0x001a, B:10:0x001c, B:14:0x0021, B:15:0x002e, B:16:0x002f, B:18:0x0052, B:21:0x0057, B:25:0x0069, B:27:0x0073, B:28:0x007e, B:30:0x0084, B:32:0x0098, B:33:0x009c, B:24:0x0060, B:35:0x00a1), top: B:44:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0014, B:9:0x001a, B:10:0x001c, B:14:0x0021, B:15:0x002e, B:16:0x002f, B:18:0x0052, B:21:0x0057, B:25:0x0069, B:27:0x0073, B:28:0x007e, B:30:0x0084, B:32:0x0098, B:33:0x009c, B:24:0x0060, B:35:0x00a1), top: B:44:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0014, B:9:0x001a, B:10:0x001c, B:14:0x0021, B:15:0x002e, B:16:0x002f, B:18:0x0052, B:21:0x0057, B:25:0x0069, B:27:0x0073, B:28:0x007e, B:30:0x0084, B:32:0x0098, B:33:0x009c, B:24:0x0060, B:35:0x00a1), top: B:44:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0014, B:9:0x001a, B:10:0x001c, B:14:0x0021, B:15:0x002e, B:16:0x002f, B:18:0x0052, B:21:0x0057, B:25:0x0069, B:27:0x0073, B:28:0x007e, B:30:0x0084, B:32:0x0098, B:33:0x009c, B:24:0x0060, B:35:0x00a1), top: B:44:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1 A[EDGE_INSN: B:45:0x00a1->B:35:0x00a1 BREAK  A[LOOP:0: B:19:0x0053->B:34:0x009f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x007e A[SYNTHETIC] */
    @Override // O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final synchronized void doStop() {
        ArrayList arrayList;
        List listArray2List;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr;
        int length;
        int i;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        ListIterator listIterator;
        super.doStop();
        ArrayList arrayList2 = new ArrayList();
        List listArray2List2 = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.array2List(this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[] o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr = this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr != null) {
            int length2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr.length;
            int i2 = length2 - 1;
            if (length2 > 0) {
                try {
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOArr[i2];
                    throw null;
                } catch (Exception e) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("EXCEPTION ", e);
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O[i2];
                    throw null;
                }
            }
            this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(arrayList2, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class);
            this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(listArray2List2, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class);
            arrayList = new ArrayList();
            listArray2List = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.array2List(this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr != null) {
                length = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.length;
                while (true) {
                    i = length - 1;
                    if (length > 0) {
                        break;
                    }
                    try {
                        this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i].stop();
                    } catch (Exception e2) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4406O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("EXCEPTION ", e2);
                    }
                    o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i];
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4394O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.EMBEDDED) {
                        this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.remove(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                        listIterator = listArray2List.listIterator();
                        while (listIterator.hasNext()) {
                            if (((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) listIterator.next()).f4433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i].f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
                                listIterator.remove();
                            }
                        }
                    } else {
                        arrayList.add(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    }
                    length = i;
                }
            }
            this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(arrayList, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.class);
            this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(listArray2List, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.class);
            this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = null;
            this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
            this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = null;
        } else {
            this.f4410O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(arrayList2, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class);
            this.f4411O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(listArray2List2, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class);
            arrayList = new ArrayList();
            listArray2List = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.array2List(this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr != null) {
                length = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr.length;
                while (true) {
                    i = length - 1;
                    if (length > 0) {
                        break;
                        break;
                    }
                    this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i].stop();
                    o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i];
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4394O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.EMBEDDED) {
                        this.f4418O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.remove(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                        listIterator = listArray2List.listIterator();
                        while (listIterator.hasNext()) {
                            if (((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) listIterator.next()).f4433O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[i].f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
                                listIterator.remove();
                            }
                        }
                    } else {
                        arrayList.add(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    }
                    length = i;
                }
            }
            this.f4413O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(arrayList, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.class);
            this.f4414O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0[]) org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.toArray(listArray2List, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.class);
            this.f4416O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = null;
            this.f4417O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = null;
            this.f4419O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = null;
        }
        throw th;
    }
}
