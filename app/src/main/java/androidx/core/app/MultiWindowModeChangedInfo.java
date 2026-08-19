package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean isInMultiWindowMode;

    @RequiresApi(26)
    private Configuration newConfiguration;

    public MultiWindowModeChangedInfo(boolean z) {
        this.isInMultiWindowMode = z;
    }

    @RequiresApi(26)
    public final Configuration getNewConfig() {
        Configuration configuration = this.newConfiguration;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean isInMultiWindowMode() {
        return this.isInMultiWindowMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z, Configuration newConfig) {
        this(z);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(newConfig, "newConfig");
        this.newConfiguration = newConfig;
    }
}
