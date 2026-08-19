package androidx.core.widget;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1<Editable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $afterTextChanged;
    final /* synthetic */ Function4<CharSequence, Integer, Integer, Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $beforeTextChanged;
    final /* synthetic */ Function4<CharSequence, Integer, Integer, Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function5) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = function4;
        this.$onTextChanged = function5;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
