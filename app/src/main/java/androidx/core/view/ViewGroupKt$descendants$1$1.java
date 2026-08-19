package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupKt$descendants$1$1 extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<View, Iterator<? extends View>> {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<View> invoke(View view) {
        kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
