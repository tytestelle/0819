package androidx.constraintlayout.core.parser;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            this.mLineNumber = cLElement.getLine();
        } else {
            this.mElementClass = "unknown";
            this.mLineNumber = 0;
        }
    }

    public String reason() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mReason);
        sb.append(" (");
        sb.append(this.mElementClass);
        sb.append(" at line ");
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, ")", this.mLineNumber);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
