package androidx.collection;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function2;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    @O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", l = {1328}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Function2<kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
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
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0057  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:25:0x00be). Please report as a decompilation issue!!! */
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
                androidx.collection.MutableScatterMap r12 = (androidx.collection.MutableScatterMap) r12
                java.lang.Object r13 = r0.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r13 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r13
                java.lang.Object r14 = r0.L$0
                kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r14 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r14
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r24)
                goto La7
            L2c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L34:
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(r24)
                java.lang.Object r2 = r0.L$0
                kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo r2 = (kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) r2
                androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r7 = r0.this$1
                long[] r8 = r6.metadata
                int r9 = r8.length
                int r9 = r9 + (-2)
                if (r9 < 0) goto Lc5
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
                if (r17 == 0) goto Lbc
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
                if (r2 >= r6) goto Lae
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r19 >= 0) goto La7
                int r15 = r9 << 3
                int r15 = r15 + r2
                r13.setCurrent(r15)
                androidx.collection.MutableMapEntry r15 = new androidx.collection.MutableMapEntry
                java.lang.Object[] r4 = r12.keys
                java.lang.Object[] r5 = r12.values
                int r3 = r13.getCurrent()
                r15.<init>(r4, r5, r3)
                r0.L$0 = r14
                r0.L$1 = r13
                r0.L$2 = r12
                r0.L$3 = r11
                r0.I$0 = r10
                r0.I$1 = r9
                r0.J$0 = r7
                r0.I$2 = r6
                r0.I$3 = r2
                r3 = 1
                r0.label = r3
                kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r4 = r14.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(r15, r0)
                if (r4 != r1) goto La7
                return r1
            La7:
                r4 = 8
                long r7 = r7 >> r4
                int r2 = r2 + r3
                r5 = 8
                goto L6d
            Lae:
                r4 = 8
                if (r6 != r4) goto Lc5
                r8 = r11
                r6 = r12
                r7 = r13
                r2 = r14
                r20 = r10
                r10 = r9
                r9 = r20
                goto Lbe
            Lbc:
                r4 = 8
            Lbe:
                if (r10 == r9) goto Lc5
                int r10 = r10 + 1
                r5 = 8
                goto L47
            Lc5:
                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO r1 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
                return r1
            */
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((AnonymousClass1) create(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(new AnonymousClass1(mutableScatterMap, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.current;
        if (i != -1) {
            this.this$0.removeValueAt(i);
            this.current = -1;
        }
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}