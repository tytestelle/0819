package com.github.tvbox.osc.ui.tv.CustomView;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes.dex */
public class CustomEditText extends AppCompatEditText {
    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i != i2 || TextUtils.isEmpty(getText())) {
            return;
        }
        setSelection(getText().length());
    }
}
