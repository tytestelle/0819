package org.seamless.swing.logging;

/* JADX INFO: loaded from: classes2.dex */
public enum O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    TEN_SECONDS(10, "10 Seconds"),
    SIXTY_SECONDS(60, "60 Seconds"),
    FIVE_MINUTES(300, "5 Minutes"),
    NEVER(Integer.MAX_VALUE, "Never");

    private String label;
    private int seconds;

    O00000OOoOOO00O00o0ooooooooO000ooooO0000(int i, String str) {
        this.seconds = i;
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }

    public int getSeconds() {
        return this.seconds;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getLabel();
    }
}
