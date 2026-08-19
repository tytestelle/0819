package androidx.core.widget;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt {

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function4<CharSequence, Integer, Integer, Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function4<CharSequence, Integer, Integer, Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<Editable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Editable editable) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(Editable editable) {
            invoke2(editable);
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
    }

    public static final TextWatcher addTextChangedListener(TextView textView, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function5, Function1<? super Editable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function5);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, Function4 function4, Function4 function5, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function4 = AnonymousClass1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function5 = AnonymousClass2.INSTANCE;
        }
        if ((i & 4) != 0) {
            function1 = AnonymousClass3.INSTANCE;
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, function4, function5);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final Function1<? super Editable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                function1.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
