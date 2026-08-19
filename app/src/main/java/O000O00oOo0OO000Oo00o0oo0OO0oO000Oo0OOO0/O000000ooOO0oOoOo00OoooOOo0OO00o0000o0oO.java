package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
    int priority() default 0;

    boolean sticky() default false;

    ThreadMode threadMode() default ThreadMode.POSTING;
}
