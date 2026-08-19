package androidx.collection;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", l = {744}, m = "invokeSuspend")
public final class ScatterMap$MapWrapper$values$1$iterator$1 extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Function2<kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$values$1$iterator$1(ScatterMap<K, V> scatterMap, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.this$0 = scatterMap;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$1 = new ScatterMap$MapWrapper$values$1$iterator$1(this.this$0, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        scatterMap$MapWrapper$values$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$values$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:20:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:20:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r1 = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r13 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r13
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r22)
            goto L8d
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r2 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.this$0
            java.lang.Object[] r7 = r6.values
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9b
            r9 = 0
        L43:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L96
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = 0
            r19 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r19
        L64:
            if (r2 >= r6) goto L90
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L8d
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r3
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r14 = r13.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(r14, r0)
            if (r14 != r1) goto L8d
            return r1
        L8d:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L64
        L90:
            if (r6 != r5) goto L9b
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L96:
            if (r9 == r8) goto L9b
            int r9 = r9 + 1
            goto L43
        L9b:
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO r1 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            return r1
        */
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return ((ScatterMap$MapWrapper$values$1$iterator$1) create(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }
}