package com.github.tvbox.osc.ui.tv.CustomView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MarqueeTextView extends TextView {
    public MarqueeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setSelected(true);
        setFocusable(true);
        setSingleLine(true);
        setMarqueeRepeatLimit(-1);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }
}
