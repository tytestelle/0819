package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m22boximpl(long j) {
        return new IntIntPair(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m23component1impl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m24component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m26constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m33unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m29getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m30getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32toStringimpl(long j) {
        return "(" + m29getFirstimpl(j) + ", " + m30getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m27equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m31hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m25constructorimpl(int i, int i2) {
        return m26constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }
}
