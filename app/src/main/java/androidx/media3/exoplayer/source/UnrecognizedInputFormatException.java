package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class UnrecognizedInputFormatException extends ParserException {
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O sniffFailures;
    public final Uri uri;

    @InlineMe(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
    }
}
