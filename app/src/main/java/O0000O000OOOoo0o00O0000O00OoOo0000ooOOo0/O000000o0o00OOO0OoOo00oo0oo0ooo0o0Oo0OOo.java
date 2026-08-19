package O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;

/* JADX INFO: loaded from: classes.dex */
public enum O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(boolean z) {
        this.isComplete = z;
    }

    public boolean isComplete() {
        return this.isComplete;
    }
}
