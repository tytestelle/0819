package androidx.activity.contextaware;

import android.content.Context;
import com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1<Context, R> function1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, Function1<Context, R> function1, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
    }
}
