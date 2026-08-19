package androidx.collection;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1431}, m = "invokeSuspend")
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Function2<kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.this$0 = mutableScatterMap;
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:23:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:20:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0088 -> B:20:0x008b). Please report as a decompilation issue!!! */
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
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r12 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r12
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r22)
            goto L8b
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r2 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L99
            r8 = 0
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L94
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r2
            r2 = 0
            r18 = r11
            r11 = r6
            r6 = r18
            r19 = r9
            r10 = r7
            r9 = r8
            r7 = r19
        L61:
            if (r2 >= r6) goto L8e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L8b
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r3
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r13 = r12.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(r14, r0)
            if (r13 != r1) goto L8b
            return r1
        L8b:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L61
        L8e:
            if (r6 != r5) goto L99
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L94:
            if (r8 == r7) goto L99
            int r8 = r8 + 1
            goto L3d
        L99:
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO r1 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            return r1
        */
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }
}