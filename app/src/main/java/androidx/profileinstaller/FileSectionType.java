package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j) {
        this.mValue = j;
    }

    public static FileSectionType fromValue(long j) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i = 0; i < fileSectionTypeArrValues.length; i++) {
            if (fileSectionTypeArrValues[i].getValue() == j) {
                return fileSectionTypeArrValues[i];
            }
        }
        throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Unsupported FileSection Type ", j));
    }

    public long getValue() {
        return this.mValue;
    }
}
