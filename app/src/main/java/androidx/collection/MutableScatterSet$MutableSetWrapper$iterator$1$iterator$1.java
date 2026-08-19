package androidx.collection;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1060}, m = "invokeSuspend")
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Function2<kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableScatterSet<E> this$0;
    final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.this$0 = mutableScatterSet;
        this.this$1 = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:23:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r1 = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r5 = 8
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$3
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$2
            androidx.collection.MutableScatterSet r12 = (androidx.collection.MutableScatterSet) r12
            java.lang.Object r13 = r0.L$1
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1) r13
            java.lang.Object r14 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r14 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r14
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r24)
            goto L9d
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r24)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r2 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r2
            androidx.collection.MutableScatterSet<E> r6 = r0.this$0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r7 = r0.this$1
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lb0
            r10 = 0
        L47:
            r11 = r8[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto Lab
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r20 = r11
            r12 = r6
            r11 = r8
            r6 = r13
            r13 = r7
            r7 = r20
            r22 = r10
            r10 = r9
            r9 = r22
        L6d:
            if (r2 >= r6) goto La0
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L9d
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.setCurrent(r15)
            java.lang.Object[] r4 = r12.elements
            r4 = r4[r15]
            r0.L$0 = r14
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r3
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r4 = r14.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(r4, r0)
            if (r4 != r1) goto L9d
            return r1
        L9d:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L6d
        La0:
            if (r6 != r5) goto Lb0
            r8 = r11
            r6 = r12
            r7 = r13
            r2 = r14
            r20 = r10
            r10 = r9
            r9 = r20
        Lab:
            if (r10 == r9) goto Lb0
            int r10 = r10 + 1
            goto L47
        Lb0:
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO r1 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            return r1
        */
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }
}