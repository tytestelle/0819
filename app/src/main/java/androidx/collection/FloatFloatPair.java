package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m10boximpl(long j) {
        return new FloatFloatPair(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m11component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m12component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m14constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m15equalsimpl(long j, Object obj) {
        return (obj instanceof FloatFloatPair) && j == ((FloatFloatPair) obj).m21unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m17getFirstimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m18getSecondimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m19hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m20toStringimpl(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m15equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m19hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m21unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m13constructorimpl(float f, float f2) {
        return m14constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
