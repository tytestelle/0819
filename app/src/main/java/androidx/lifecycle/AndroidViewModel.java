package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
