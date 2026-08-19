package O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.warkiz.widget.indicatorseekbar.R$drawable;
import com.github.warkiz.widget.indicatorseekbar.R$id;
import com.github.warkiz.widget.indicatorseekbar.R$layout;
import com.warkiz.widget.ArrowView;
import com.warkiz.widget.IndicatorSeekBar;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f1634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int[] f1635O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new int[2];

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrowView f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public TextView f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public PopupWindow f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LinearLayout f1639O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final int f1640O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final int f1641O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final Context f1642O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final int f1643O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final IndicatorSeekBar f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final View f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final View f1646O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final View f1647O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context, IndicatorSeekBar indicatorSeekBar, int i, int i2, int i3, int i4, View view, View view2) {
        View viewFindViewById;
        this.f1642O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = context;
        this.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = indicatorSeekBar;
        this.f1641O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i;
        this.f1643O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i2;
        this.f1646O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = view;
        this.f1647O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = view2;
        float f = i3;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f1634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = windowManager != null ? windowManager.getDefaultDisplay().getWidth() : 0;
        this.f1640O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 2.0f);
        if (i2 == 4) {
            if (view == null) {
                throw new IllegalArgumentException("the attr：indicator_custom_layout must be set while you set the indicator type to CUSTOM.");
            }
            this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = view;
            int identifier = context.getResources().getIdentifier("isb_progress", TtmlNode.ATTR_ID, context.getApplicationContext().getPackageName());
            if (identifier <= 0 || (viewFindViewById = this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.findViewById(identifier)) == null) {
                return;
            }
            if (!(viewFindViewById instanceof TextView)) {
                throw new ClassCastException("the view identified by isb_progress in indicator custom layout can not be cast to TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = textView;
            textView.setText(indicatorSeekBar.getIndicatorTextString());
            this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextSize((int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
            this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextColor(i4);
            return;
        }
        if (i2 == 1) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, null, 0);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i4;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
            Paint paint = new Paint();
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = paint;
            paint.setAntiAlias(true);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setStrokeWidth(1.0f);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextAlign(Paint.Align.CENTER);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextSize(f);
            Rect rect = new Rect();
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getTextBounds("1000", 0, 4, rect);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 4.0f) + rect.width();
            float fO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 36.0f);
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 < fO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = fO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1631O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = rect.height();
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1630O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 * 1.2f;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Path();
            float f2 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.arcTo(new RectF(0.0f, 0.0f, f2, f2), 135.0f, 270.0f);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lineTo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 / 2.0f, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1630O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
            this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setProgress(indicatorSeekBar.getIndicatorTextString());
            return;
        }
        View viewInflate = View.inflate(context, R$layout.isb_indicator, null);
        this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = viewInflate;
        this.f1639O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (LinearLayout) viewInflate.findViewById(R$id.indicator_container);
        ArrowView arrowView = (ArrowView) this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.findViewById(R$id.indicator_arrow);
        this.f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = arrowView;
        arrowView.setColor(i);
        TextView textView2 = (TextView) this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.findViewById(R$id.isb_progress);
        this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = textView2;
        textView2.setText(indicatorSeekBar.getIndicatorTextString());
        this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextSize((int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextColor(i4);
        this.f1639O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setBackground(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
        if (view2 != null) {
            int identifier2 = context.getResources().getIdentifier("isb_progress", TtmlNode.ATTR_ID, context.getApplicationContext().getPackageName());
            if (identifier2 <= 0) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view2, null);
                return;
            }
            View viewFindViewById2 = view2.findViewById(identifier2);
            if (viewFindViewById2 == null || !(viewFindViewById2 instanceof TextView)) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view2, null);
            } else {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(view2, (TextView) viewFindViewById2);
            }
        }
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(View view, int i, int i2, int i3, int i4) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (i == -1) {
                i = marginLayoutParams.leftMargin;
            }
            if (i2 == -1) {
                i2 = marginLayoutParams.topMargin;
            }
            if (i3 == -1) {
                i3 = marginLayoutParams.rightMargin;
            }
            if (i4 == -1) {
                i4 = marginLayoutParams.bottomMargin;
            }
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(float f) {
        int i = this.f1643O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (i == 4 || i == 1) {
            return;
        }
        IndicatorSeekBar indicatorSeekBar = this.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        int[] iArr = this.f1635O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        indicatorSeekBar.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        if (i2 + f < this.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredWidth() / 2) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, -((int) (((this.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredWidth() / 2) - i2) - f)), -1, -1, -1);
            return;
        }
        float f2 = (this.f1634O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO - i2) - f;
        if (f2 < this.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredWidth() / 2) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (int) ((this.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredWidth() / 2) - f2), -1, -1, -1);
        } else {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0, 0, 0, 0);
        }
    }

    public final GradientDrawable O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        int i = this.f1643O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        Context context = this.f1642O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        GradientDrawable gradientDrawable = i == 2 ? (GradientDrawable) context.getResources().getDrawable(R$drawable.isb_indicator_rounded_corners) : (GradientDrawable) context.getResources().getDrawable(R$drawable.isb_indicator_square_corners);
        gradientDrawable.setColor(this.f1641O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        return gradientDrawable;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        String indicatorTextString = this.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getIndicatorTextString();
        View view = this.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (view instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) view).setProgress(indicatorTextString);
            return;
        }
        TextView textView = this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (textView != null) {
            textView.setText(indicatorTextString);
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(View view, TextView textView) {
        this.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = textView;
        this.f1639O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.removeAllViews();
        view.setBackground(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
        this.f1639O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.addView(view);
    }
}
