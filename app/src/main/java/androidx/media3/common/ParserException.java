package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException createForMalformedContainer(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException createForMalformedManifest(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(@Nullable String str, @Nullable Throwable th) {
        return new ParserException(str, th, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(@Nullable String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, "}", this.dataType);
    }
}
