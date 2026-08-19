package com.warkiz.widget;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.github.warkiz.widget.indicatorseekbar.R$styleable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class IndicatorSeekBar extends View {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Paint f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final TextPaint f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final Rect f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public float f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public float f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public float f3865O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public float f3866O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final boolean f3867O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public int f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public int f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public int f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public int f3872O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public float f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public float f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public boolean f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public float f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public float f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public float f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public final boolean f3879O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public int f3880O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public boolean f3881O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    public final boolean O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public final boolean f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public float[] f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
    public boolean O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;

    /* JADX INFO: renamed from: O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, reason: collision with root package name */
    public final boolean f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;

    /* JADX INFO: renamed from: O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, reason: collision with root package name */
    public final int f3885O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;

    /* JADX INFO: renamed from: O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, reason: collision with root package name */
    public String[] f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;

    /* JADX INFO: renamed from: O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, reason: collision with root package name */
    public float[] f3887O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;

    /* JADX INFO: renamed from: O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, reason: collision with root package name */
    public float[] f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;

    /* JADX INFO: renamed from: O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, reason: collision with root package name */
    public float f3889O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

    /* JADX INFO: renamed from: O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, reason: collision with root package name */
    public final int f3890O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;

    /* JADX INFO: renamed from: O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0, reason: collision with root package name */
    public final Typeface f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;

    /* JADX INFO: renamed from: O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o, reason: collision with root package name */
    public int f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;

    /* JADX INFO: renamed from: O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo, reason: collision with root package name */
    public int f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;

    /* JADX INFO: renamed from: O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o, reason: collision with root package name */
    public int f3894O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o;

    /* JADX INFO: renamed from: O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, reason: collision with root package name */
    public final CharSequence[] f3895O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

    /* JADX INFO: renamed from: O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;

    /* JADX INFO: renamed from: O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, reason: collision with root package name */
    public final int f3897O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;

    /* JADX INFO: renamed from: O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo, reason: collision with root package name */
    public final int f3898O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;

    /* JADX INFO: renamed from: O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, reason: collision with root package name */
    public boolean f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;

    /* JADX INFO: renamed from: O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo, reason: collision with root package name */
    public final int f3900O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;

    /* JADX INFO: renamed from: O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, reason: collision with root package name */
    public final View f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;

    /* JADX INFO: renamed from: O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000, reason: collision with root package name */
    public final View f3902O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;

    /* JADX INFO: renamed from: O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0, reason: collision with root package name */
    public final int f3903O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;

    /* JADX INFO: renamed from: O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, reason: collision with root package name */
    public String f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;

    /* JADX INFO: renamed from: O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO, reason: collision with root package name */
    public float[] f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

    /* JADX INFO: renamed from: O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, reason: collision with root package name */
    public int f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;

    /* JADX INFO: renamed from: O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, reason: collision with root package name */
    public int f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;

    /* JADX INFO: renamed from: O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, reason: collision with root package name */
    public int f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

    /* JADX INFO: renamed from: O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00, reason: collision with root package name */
    public float f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;

    /* JADX INFO: renamed from: O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, reason: collision with root package name */
    public Bitmap f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

    /* JADX INFO: renamed from: O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, reason: collision with root package name */
    public Bitmap f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

    /* JADX INFO: renamed from: O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, reason: collision with root package name */
    public Drawable f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;

    /* JADX INFO: renamed from: O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000, reason: collision with root package name */
    public final int f3913O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

    /* JADX INFO: renamed from: O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, reason: collision with root package name */
    public final boolean f3914O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

    /* JADX INFO: renamed from: O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0, reason: collision with root package name */
    public final boolean f3915O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0;

    /* JADX INFO: renamed from: O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo, reason: collision with root package name */
    public final int f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;

    /* JADX INFO: renamed from: O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo, reason: collision with root package name */
    public final boolean f3917O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;

    /* JADX INFO: renamed from: O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO, reason: collision with root package name */
    public final RectF f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
    public final RectF O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;

    /* JADX INFO: renamed from: O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO, reason: collision with root package name */
    public final int f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;

    /* JADX INFO: renamed from: O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo, reason: collision with root package name */
    public final int f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;

    /* JADX INFO: renamed from: O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o, reason: collision with root package name */
    public final int f3921O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;

    /* JADX INFO: renamed from: O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO, reason: collision with root package name */
    public final int f3922O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO;

    /* JADX INFO: renamed from: O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO, reason: collision with root package name */
    public float f3923O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;

    /* JADX INFO: renamed from: O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O, reason: collision with root package name */
    public float f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;

    /* JADX INFO: renamed from: O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO, reason: collision with root package name */
    public Bitmap f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO;

    /* JADX INFO: renamed from: O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO, reason: collision with root package name */
    public int f3926O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;

    /* JADX INFO: renamed from: O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, reason: collision with root package name */
    public final int f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;

    /* JADX INFO: renamed from: O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo, reason: collision with root package name */
    public Drawable f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

    /* JADX INFO: renamed from: O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO, reason: collision with root package name */
    public Bitmap f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;

    /* JADX INFO: renamed from: O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO, reason: collision with root package name */
    public int f3930O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO;

    /* JADX INFO: renamed from: O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo, reason: collision with root package name */
    public final boolean f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo;

    /* JADX INFO: renamed from: O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O, reason: collision with root package name */
    public float f3932O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;

    /* JADX INFO: renamed from: O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o, reason: collision with root package name */
    public final int f3933O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o;

    /* JADX INFO: renamed from: O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO, reason: collision with root package name */
    public boolean f3934O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;

    public IndicatorSeekBar(Context context, AttributeSet attributeSet) {
        Context context2;
        float f;
        super(context, attributeSet);
        this.f3865O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1.0f;
        this.f3866O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -1.0f;
        this.f3880O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = 1;
        this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
        int color = Color.parseColor("#FF4081");
        int color2 = Color.parseColor("#FFFFFF");
        int color3 = Color.parseColor("#D7D7D7");
        int color4 = Color.parseColor("#FF4081");
        int color5 = Color.parseColor("#FF4081");
        int color6 = Color.parseColor("#FF4081");
        int color7 = Color.parseColor("#FF4081");
        Typeface typeface = Typeface.DEFAULT;
        int color8 = Color.parseColor("#FF4081");
        int i = (int) ((context.getResources().getDisplayMetrics().scaledDensity * 14.0f) + 0.5f);
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 2.0f);
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 2.0f);
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 10.0f);
        int i2 = (int) ((13.0f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 14.0f);
        if (attributeSet == null) {
            this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = 100.0f;
            this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = 0.0f;
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = 0.0f;
            this.f3879O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = false;
            this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = 0;
            this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = false;
            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = false;
            this.f3881O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = true;
            this.f3867O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = false;
            this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = false;
            this.f3903O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = 2;
            this.f3897O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = color;
            this.f3898O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = color2;
            this.f3900O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = i;
            this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = null;
            this.f3902O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = null;
            this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            this.f3921O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = color3;
            this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2;
            this.f3922O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO = color4;
            this.f3917O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = false;
            this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4;
            this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo = null;
            this.f3933O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o = color5;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(null, color6);
            this.f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo = false;
            this.f3913O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = 0;
            this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3;
            this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = null;
            this.f3914O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = false;
            this.f3915O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = false;
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(null, color8);
            this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = false;
            this.f3890O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = i2;
            this.f3895O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = null;
            this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = typeface;
            O00000OOoOOO00O00o0ooooooooO000ooooO0000(null, color7);
            context2 = context;
        } else {
            context2 = context;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.IndicatorSeekBar);
            this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = typedArrayObtainStyledAttributes.getFloat(R$styleable.IndicatorSeekBar_isb_max, 100.0f);
            this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.IndicatorSeekBar_isb_min, 0.0f);
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.IndicatorSeekBar_isb_progress, 0.0f);
            this.f3879O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_progress_value_float, false);
            this.f3881O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_user_seekable, true);
            this.f3867O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_clear_default_padding, false);
            this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_only_thumb_draggable, false);
            this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_seek_smoothly, false);
            this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_r2l, false);
            this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_track_background_size, iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
            this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_track_progress_size, iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2);
            this.f3921O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = typedArrayObtainStyledAttributes.getColor(R$styleable.IndicatorSeekBar_isb_track_background_color, color3);
            this.f3922O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO = typedArrayObtainStyledAttributes.getColor(R$styleable.IndicatorSeekBar_isb_track_progress_color, color4);
            this.f3917O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_track_rounded_corners, false);
            this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_thumb_size, iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO4);
            this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo = typedArrayObtainStyledAttributes.getDrawable(R$styleable.IndicatorSeekBar_isb_thumb_drawable);
            this.f3934O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_thumb_adjust_auto, true);
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.IndicatorSeekBar_isb_thumb_color), color6);
            this.f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_show_thumb_text, false);
            this.f3933O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o = typedArrayObtainStyledAttributes.getColor(R$styleable.IndicatorSeekBar_isb_thumb_text_color, color5);
            this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = typedArrayObtainStyledAttributes.getInt(R$styleable.IndicatorSeekBar_isb_ticks_count, 0);
            this.f3913O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = typedArrayObtainStyledAttributes.getInt(R$styleable.IndicatorSeekBar_isb_show_tick_marks_type, 0);
            this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_tick_marks_size, iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO3);
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.IndicatorSeekBar_isb_tick_marks_color), color8);
            this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = typedArrayObtainStyledAttributes.getDrawable(R$styleable.IndicatorSeekBar_isb_tick_marks_drawable);
            this.f3915O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_tick_marks_swept_hide, false);
            this.f3914O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_tick_marks_ends_hide, false);
            this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IndicatorSeekBar_isb_show_tick_texts, false);
            this.f3890O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_tick_texts_size, i2);
            O00000OOoOOO00O00o0ooooooooO000ooooO0000(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.IndicatorSeekBar_isb_tick_texts_color), color7);
            this.f3895O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = typedArrayObtainStyledAttributes.getTextArray(R$styleable.IndicatorSeekBar_isb_tick_texts_array);
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.IndicatorSeekBar_isb_tick_texts_typeface, -1);
            if (i3 == 0) {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = typeface;
            } else if (i3 == 1) {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = Typeface.MONOSPACE;
            } else if (i3 == 2) {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = Typeface.SANS_SERIF;
            } else if (i3 == 3) {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = Typeface.SERIF;
            } else if (typeface == null) {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = typeface;
            } else {
                this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = typeface;
            }
            this.f3903O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 = typedArrayObtainStyledAttributes.getInt(R$styleable.IndicatorSeekBar_isb_show_indicator, 2);
            this.f3897O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = typedArrayObtainStyledAttributes.getColor(R$styleable.IndicatorSeekBar_isb_indicator_color, color);
            this.f3900O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndicatorSeekBar_isb_indicator_text_size, i);
            this.f3898O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = typedArrayObtainStyledAttributes.getColor(R$styleable.IndicatorSeekBar_isb_indicator_text_color, color2);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.IndicatorSeekBar_isb_indicator_content_layout, 0);
            if (resourceId > 0) {
                this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = View.inflate(context2, resourceId, null);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.IndicatorSeekBar_isb_indicator_top_content_layout, 0);
            if (resourceId2 > 0) {
                this.f3902O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = View.inflate(context2, resourceId2, null);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        int i4 = this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
        int i5 = this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
        if (i4 > i5) {
            this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = i5;
        }
        if (this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo == null) {
            f = 2.0f;
            float f2 = this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo / 2.0f;
            this.f3923O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO = f2;
            this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O = f2 * 1.2f;
        } else {
            f = 2.0f;
            float fMin = Math.min(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context2, 30.0f), this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) / 2.0f;
            this.f3923O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO = fMin;
            this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O = fMin;
        }
        if (this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo == null) {
            this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 = this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo / f;
        } else {
            this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 = Math.min(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context2, 30.0f), this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo) / f;
        }
        this.f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Math.max(this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O, this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00) * f;
        if (this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Paint();
        }
        if (this.f3917O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo) {
            this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setAntiAlias(true);
        int i6 = this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
        if (i6 > this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo) {
            this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = i6;
        }
        if (this.f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo || (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 0 && this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o)) {
            if (this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                TextPaint textPaint = new TextPaint();
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = textPaint;
                textPaint.setAntiAlias(true);
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTextAlign(Paint.Align.CENTER);
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTextSize(this.f3890O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o);
            }
            if (this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new Rect();
            }
            this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTypeface(this.f3891O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0);
            this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getTextBounds("j", 0, 1, this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            this.f3885O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.height() + ((int) ((3.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
        }
        this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = new RectF();
        this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = new RectF();
        if (!this.f3867O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context2, 16.0f);
            if (getPaddingLeft() == 0) {
                setPadding(iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
            if (getPaddingRight() == 0) {
                setPadding(getPaddingLeft(), getPaddingTop(), iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO5, getPaddingBottom());
            }
        }
        int i7 = this.f3903O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
        if (i7 != 0 && this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, this, this.f3897O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, i7, this.f3900O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo, this.f3898O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo, this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, this.f3902O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000);
            this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
    }

    private float getAmplitude() {
        float f = this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        float f2 = this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        if (f - f2 > 0.0f) {
            return f - f2;
        }
        return 1.0f;
    }

    private int getClosestIndex() {
        float fAbs = Math.abs(this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o - this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
            if (i >= fArr.length) {
                return i2;
            }
            float fAbs2 = Math.abs(fArr[i] - this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            if (fAbs2 <= fAbs) {
                i2 = i;
                fAbs = fAbs2;
            }
            i++;
        }
    }

    private int getLeftSideTickColor() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo : this.f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
    }

    private int getLeftSideTickTextsColor() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo : this.f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;
    }

    private int getLeftSideTrackSize() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO : this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
    }

    private int getRightSideTickColor() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo : this.f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
    }

    private int getRightSideTickTextsColor() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o : this.f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
    }

    private int getRightSideTrackSize() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo : this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
    }

    private float getThumbCenterX() {
        return this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.right : this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.right;
    }

    private int getThumbPosOnTick() {
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 0) {
            return Math.round((getThumbCenterX() - this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) / this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
        }
        return 0;
    }

    private float getThumbPosOnTickFloat() {
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 0) {
            return (getThumbCenterX() - this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) / this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeekListener(boolean z) {
        String[] strArr;
        if (this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return;
        }
        if (this.f3879O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            if (this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
                return;
            }
        } else if (Math.round(this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) == Math.round(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0)) {
            return;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1651O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this;
            this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1652O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = getProgress();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        getProgressFloat();
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.getClass();
        this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo > 2) {
            int thumbPosOnTick = getThumbPosOnTick();
            if (this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o && (strArr = this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) != null) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                String str = strArr[thumbPosOnTick];
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3.getClass();
            }
            if (this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
                this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
            } else {
                this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
            }
        }
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3868O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        int i = this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
        if (i < 0 || i > 50) {
            throw new IllegalArgumentException("the Argument: TICK COUNT must be limited between (0-50), Now is " + this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo);
        }
        if (i == 0) {
            return;
        }
        this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO = new float[i];
        if (this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            this.f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = new float[i];
            this.f3887O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = new float[i];
        }
        this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = new float[i];
        int i2 = 0;
        while (true) {
            float[] fArr = this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
            if (i2 >= fArr.length) {
                return;
            }
            float f = this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            float f2 = (this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o - f) * i2;
            int i3 = this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
            fArr[i2] = (f2 / (i3 + (-1) > 0 ? i3 - 1 : 1)) + f;
            i2++;
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Canvas canvas) {
        float thumbCenterX = getThumbCenterX();
        if (this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo == null) {
            if (this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(this.f3930O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO);
            } else {
                this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(this.f3926O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
            }
            canvas.drawCircle(thumbCenterX, this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top, this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o ? this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O : this.f3923O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            return;
        }
        if (this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO == null || this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO == null) {
            O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        }
        if (this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO == null || this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO == null) {
            throw new IllegalArgumentException("the format of the selector thumb drawable is wrong!");
        }
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setAlpha(255);
        if (this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
            Bitmap bitmap = this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
            canvas.drawBitmap(bitmap, thumbCenterX - (bitmap.getWidth() / 2.0f), this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top - (this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.getHeight() / 2.0f), this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        } else {
            Bitmap bitmap2 = this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO;
            canvas.drawBitmap(bitmap2, thumbCenterX - (bitmap2.getWidth() / 2.0f), this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top - (this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO.getHeight() / 2.0f), this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Canvas canvas) {
        Bitmap bitmap;
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 0) {
            if (this.f3913O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 == 0 && this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo == null) {
                return;
            }
            float thumbCenterX = getThumbCenterX();
            for (int i = 0; i < this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.length; i++) {
                float thumbPosOnTickFloat = getThumbPosOnTickFloat();
                if ((!this.f3915O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 || thumbCenterX < this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i]) && ((!this.f3914O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 || (i != 0 && i != this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.length - 1)) && (i != getThumbPosOnTick() || this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo <= 2 || this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O))) {
                    float f = i;
                    if (f <= thumbPosOnTickFloat) {
                        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(getLeftSideTickColor());
                    } else {
                        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(getRightSideTickColor());
                    }
                    if (this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo != null) {
                        if (this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo == null || this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 == null) {
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                        }
                        Bitmap bitmap2 = this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                        if (bitmap2 == null || (bitmap = this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) == null) {
                            throw new IllegalArgumentException("the format of the selector TickMarks drawable is wrong!");
                        }
                        if (f <= thumbPosOnTickFloat) {
                            canvas.drawBitmap(bitmap2, this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i] - (bitmap.getWidth() / 2.0f), this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top - (this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.getHeight() / 2.0f), this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        } else {
                            canvas.drawBitmap(bitmap, this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i] - (bitmap.getWidth() / 2.0f), this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top - (this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.getHeight() / 2.0f), this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        }
                    } else {
                        int i2 = this.f3913O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                        if (i2 == 1) {
                            canvas.drawCircle(this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i], this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top, this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        } else if (i2 == 3) {
                            int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 1.0f);
                            float leftSideTrackSize = thumbCenterX >= this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i] ? getLeftSideTrackSize() : getRightSideTrackSize();
                            float f2 = this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i];
                            float f3 = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                            float f4 = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top;
                            float f5 = leftSideTrackSize / 2.0f;
                            canvas.drawRect(f2 - f3, f4 - f5, f2 + f3, f4 + f5, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        } else if (i2 == 2) {
                            float f6 = this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i];
                            int i3 = this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
                            float f7 = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.top;
                            canvas.drawRect(f6 - (i3 / 2.0f), f7 - (i3 / 2.0f), (i3 / 2.0f) + f6, (i3 / 2.0f) + f7, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        }
                    }
                }
            }
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Canvas canvas) {
        if (this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == null) {
            return;
        }
        float thumbPosOnTickFloat = getThumbPosOnTickFloat();
        for (int i = 0; i < this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.length; i++) {
            if (i == getThumbPosOnTick() && i == thumbPosOnTickFloat) {
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setColor(this.f3894O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o);
            } else if (i < thumbPosOnTickFloat) {
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setColor(getLeftSideTickTextsColor());
            } else {
                this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setColor(getRightSideTickTextsColor());
            }
            int length = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? (this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.length - i) - 1 : i;
            if (i == 0) {
                canvas.drawText(this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000[length], (this.f3887O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00[length] / 2.0f) + this.f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o[i], this.f3889O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            } else {
                String[] strArr = this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                if (i == strArr.length - 1) {
                    canvas.drawText(strArr[length], this.f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o[i] - (this.f3887O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00[length] / 2.0f), this.f3889O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                } else {
                    canvas.drawText(strArr[length], this.f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o[i], this.f3889O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
            }
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Canvas canvas) {
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(this.f3922O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO);
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setStrokeWidth(this.f3920O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo);
        RectF rectF = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setColor(this.f3921O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o);
        this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setStrokeWidth(this.f3919O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO);
        RectF rectF2 = this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
        canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.f3859O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public final Bitmap O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Drawable drawable, boolean z) {
        int intrinsicHeight;
        if (drawable == null) {
            return null;
        }
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 30.0f);
        if (drawable.getIntrinsicWidth() > iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
            int i = z ? this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo : this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
            intrinsicHeight = Math.round(((i * 1.0f) * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth());
            if (i > iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
                intrinsicHeight = Math.round(((iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO * 1.0f) * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth());
            } else {
                iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = i;
            }
        } else {
            iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final String O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(float f) {
        char[] cArr;
        if (!this.f3879O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            return String.valueOf(Math.round(f));
        }
        double d = f;
        int i = this.f3880O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        char[][] cArr2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int iAbs = Math.abs(i);
        double dPow = (Math.pow(10.0d, iAbs) * Math.abs(d)) + 0.5d;
        if (dPow > 9.99999999999999E14d || iAbs > 16) {
            String string = new BigDecimal(Double.toString(d)).setScale(Math.abs(iAbs), RoundingMode.HALF_UP).toString();
            if (iAbs == 0) {
                return string;
            }
            int length = string.length() - 1;
            while (length >= 0 && string.charAt(length) == '0') {
                length--;
            }
            String strSubstring = string.substring(0, length + 1);
            return strSubstring.charAt(strSubstring.length() - 1) == '.' ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 0, strSubstring) : strSubstring;
        }
        long jNextUp = (long) Math.nextUp(dPow);
        if (jNextUp < 1) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        char[] charArray = Long.toString(jNextUp).toCharArray();
        if (charArray.length > iAbs) {
            int length2 = charArray.length - 1;
            int length3 = charArray.length - iAbs;
            while (length2 >= length3 && charArray[length2] == '0') {
                length2--;
            }
            if (length2 >= length3) {
                cArr = new char[length2 + 2];
                System.arraycopy(charArray, 0, cArr, 0, length3);
                cArr[length3] = '.';
                System.arraycopy(charArray, length3, cArr, length3 + 1, (length2 - length3) + 1);
            } else {
                cArr = new char[length3];
                System.arraycopy(charArray, 0, cArr, 0, length3);
            }
        } else {
            int length4 = charArray.length - 1;
            while (length4 >= 0 && charArray[length4] == '0') {
                length4--;
            }
            char[] cArr3 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iAbs - charArray.length];
            char[] cArrCopyOf = Arrays.copyOf(cArr3, cArr3.length + length4 + 1);
            System.arraycopy(charArray, 0, cArrCopyOf, cArr3.length, length4 + 1);
            cArr = cArrCopyOf;
        }
        return Math.signum(d) > 0.0d ? new String(cArr) : "-".concat(new String(cArr));
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        float f = this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        float f2 = this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        if (f < f2) {
            throw new IllegalArgumentException("the Argument: MAX's value must be larger than MIN's.");
        }
        if (this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 < f2) {
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f2;
        }
        if (this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > f) {
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f;
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = getMeasuredWidth();
        this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = getPaddingStart();
        this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = getPaddingEnd();
        this.f3872O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = getPaddingTop();
        float f = (this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 - this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) - this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000 = f;
        int i = this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
        this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = f / (i + (-1) > 0 ? i - 1 : 1);
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        String strValueOf;
        int i = this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
        if (i == 0) {
            return;
        }
        if (this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = new String[i];
        }
        int i2 = 0;
        while (i2 < this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.length) {
            if (this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                String[] strArr = this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                CharSequence[] charSequenceArr = this.f3895O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
                if (charSequenceArr == null) {
                    strValueOf = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0[i2]);
                } else {
                    strValueOf = i2 < charSequenceArr.length ? String.valueOf(charSequenceArr[i2]) : "";
                }
                strArr[i2] = strValueOf;
                TextPaint textPaint = this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String str = this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000[i2];
                textPaint.getTextBounds(str, 0, str.length(), this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                this.f3887O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00[i2] = this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.width();
                this.f3888O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o[i2] = (this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO * i2) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            }
            this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO[i2] = (this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO * i2) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            i2++;
        }
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        Drawable drawable = this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;
        if (drawable == null) {
            return;
        }
        if (!(drawable instanceof StateListDrawable)) {
            Bitmap bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(drawable, true);
            this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            return;
        }
        try {
            StateListDrawable stateListDrawable = (StateListDrawable) drawable;
            Class<?> cls = stateListDrawable.getClass();
            int iIntValue = ((Integer) cls.getMethod("getStateCount", null).invoke(stateListDrawable, null)).intValue();
            if (iIntValue != 2) {
                throw new IllegalArgumentException("the format of the selector thumb drawable is wrong!");
            }
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getStateSet", cls2);
            Method method2 = cls.getMethod("getStateDrawable", cls2);
            for (int i = 0; i < iIntValue; i++) {
                int[] iArr = (int[]) method.invoke(stateListDrawable, Integer.valueOf(i));
                if (iArr.length <= 0) {
                    this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), true);
                } else {
                    if (iArr[0] != 16842919) {
                        throw new IllegalArgumentException("the state of the selector thumb drawable is wrong!");
                    }
                    this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), true);
                }
            }
        } catch (Exception unused) {
            Bitmap bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo, true);
            this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
            this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        }
    }

    public final void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(ColorStateList colorStateList, int i) {
        if (colorStateList == null) {
            this.f3926O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = i;
            this.f3930O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr == null || iArr2 == null) {
                return;
            }
            if (iArr.length == 1) {
                int i2 = iArr2[0];
                this.f3926O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = i2;
                this.f3930O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO = i2;
            } else {
                if (iArr.length != 2) {
                    throw new IllegalArgumentException("the selector color file you set for the argument: isb_thumb_color is in wrong format.");
                }
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    int[] iArr3 = iArr[i3];
                    if (iArr3.length == 0) {
                        this.f3930O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO = iArr2[i3];
                    } else {
                        if (iArr3[0] != 16842919) {
                            throw new IllegalArgumentException("the selector color file you set for the argument: isb_thumb_color is in wrong format.");
                        }
                        this.f3926O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO = iArr2[i3];
                    }
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException("Something wrong happened when parseing thumb selector color.");
        }
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        Drawable drawable = this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        if (!(drawable instanceof StateListDrawable)) {
            Bitmap bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(drawable, false);
            this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            return;
        }
        StateListDrawable stateListDrawable = (StateListDrawable) drawable;
        try {
            Class<?> cls = stateListDrawable.getClass();
            int iIntValue = ((Integer) cls.getMethod("getStateCount", null).invoke(stateListDrawable, null)).intValue();
            if (iIntValue != 2) {
                throw new IllegalArgumentException("the format of the selector TickMarks drawable is wrong!");
            }
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getStateSet", cls2);
            Method method2 = cls.getMethod("getStateDrawable", cls2);
            for (int i = 0; i < iIntValue; i++) {
                int[] iArr = (int[]) method.invoke(stateListDrawable, Integer.valueOf(i));
                if (iArr.length <= 0) {
                    this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), false);
                } else {
                    if (iArr[0] != 16842913) {
                        throw new IllegalArgumentException("the state of the selector TickMarks drawable is wrong!");
                    }
                    this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), false);
                }
            }
        } catch (Exception unused) {
            Bitmap bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, false);
            this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
            this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = bitmapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        }
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(ColorStateList colorStateList, int i) {
        if (colorStateList == null) {
            this.f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = i;
            this.f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr == null || iArr2 == null) {
                return;
            }
            if (iArr.length == 1) {
                int i2 = iArr2[0];
                this.f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = i2;
                this.f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = i2;
            } else {
                if (iArr.length != 2) {
                    throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_marks_color is in wrong format.");
                }
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    int[] iArr3 = iArr[i3];
                    if (iArr3.length == 0) {
                        this.f3907O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = iArr2[i3];
                    } else {
                        if (iArr3[0] != 16842913) {
                            throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_marks_color is in wrong format.");
                        }
                        this.f3908O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = iArr2[i3];
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Something wrong happened when parsing thumb selector color." + e.getMessage());
        }
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(ColorStateList colorStateList, int i) {
        if (colorStateList == null) {
            this.f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = i;
            this.f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o = i;
            this.f3894O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr == null || iArr2 == null) {
                return;
            }
            if (iArr.length == 1) {
                int i2 = iArr2[0];
                this.f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = i2;
                this.f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o = i2;
                this.f3894O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o = i2;
                return;
            }
            if (iArr.length != 3) {
                throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_texts_color is in wrong format.");
            }
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int[] iArr3 = iArr[i3];
                if (iArr3.length == 0) {
                    this.f3893O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = iArr2[i3];
                } else {
                    int i4 = iArr3[0];
                    if (i4 == 16842913) {
                        this.f3892O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o = iArr2[i3];
                    } else {
                        if (i4 != 16843623) {
                            throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_texts_color is in wrong format.");
                        }
                        this.f3894O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o = iArr2[i3];
                    }
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException("Something wrong happened when parseing thumb selector color.");
        }
    }

    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(MotionEvent motionEvent) {
        View view;
        float x = motionEvent.getX();
        float fRound = this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (x >= fRound) {
            float x2 = motionEvent.getX();
            fRound = this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 - this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (x2 <= fRound) {
                fRound = motionEvent.getX();
            }
        }
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo > 2 && !this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
            fRound = (this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO * Math.round((fRound - this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) / this.f3874O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        }
        if (this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
            fRound = (this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO * 2) + (this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000 - fRound);
        }
        this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        float amplitude = (((fRound - this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) * getAmplitude()) / this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000) + this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = amplitude;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(amplitude);
        setSeekListener(true);
        invalidate();
        if (this.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
            return;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            return;
        }
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null && o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1643O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != 0 && (view = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) != null) {
            view.measure(0, 0);
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new PopupWindow(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, -2, -2, false);
        }
        PopupWindow popupWindow = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (popupWindow == null || !popupWindow.isShowing()) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
            float thumbCenterX = getThumbCenterX();
            IndicatorSeekBar indicatorSeekBar = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (indicatorSeekBar.isEnabled() && indicatorSeekBar.getVisibility() == 0) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                PopupWindow popupWindow2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (popupWindow2 != null) {
                    popupWindow2.getContentView().measure(0, 0);
                    PopupWindow popupWindow3 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    popupWindow3.showAsDropDown(indicatorSeekBar, (int) (thumbCenterX - (popupWindow3.getContentView().getMeasuredWidth() / 2.0f)), -(((o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredHeight() + indicatorSeekBar.getMeasuredHeight()) - indicatorSeekBar.getPaddingTop()) + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1640O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(thumbCenterX);
                    return;
                }
                return;
            }
            return;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
        float thumbCenterX2 = getThumbCenterX();
        IndicatorSeekBar indicatorSeekBar2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (indicatorSeekBar2.isEnabled() && indicatorSeekBar2.getVisibility() == 0) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            PopupWindow popupWindow4 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (popupWindow4 != null) {
                popupWindow4.getContentView().measure(0, 0);
                PopupWindow popupWindow5 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                popupWindow5.update(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1644O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, (int) (thumbCenterX2 - (popupWindow5.getContentView().getMeasuredWidth() / 2)), -(((o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getContentView().getMeasuredHeight() + indicatorSeekBar2.getMeasuredHeight()) - indicatorSeekBar2.getPaddingTop()) + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.f1640O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000), -1, -1);
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(thumbCenterX2);
            }
        }
    }

    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() {
        if (this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
            RectF rectF = this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
            float f = this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            rectF.left = f;
            rectF.top = this.f3872O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 + this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;
            rectF.right = ((1.0f - ((this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 - this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) / getAmplitude())) * this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000) + f;
            RectF rectF2 = this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
            float f2 = rectF2.top;
            rectF2.bottom = f2;
            RectF rectF3 = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
            rectF3.left = rectF2.right;
            rectF3.top = f2;
            rectF3.right = this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 - this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            rectF3.bottom = f2;
        } else {
            RectF rectF4 = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
            rectF4.left = this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            rectF4.top = this.f3872O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 + this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;
            rectF4.right = (((this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 - this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) * this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000) / getAmplitude()) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            RectF rectF5 = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
            float f3 = rectF5.top;
            rectF5.bottom = f3;
            RectF rectF6 = this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
            rectF6.left = rectF5.right;
            rectF6.top = f3;
            rectF6.right = this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 - this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            rectF6.bottom = f3;
        }
        if (this.f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo || (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 0 && this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o)) {
            this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getTextBounds("j", 0, 1, this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            float fRound = this.f3872O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 + this.f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + Math.round(this.f3862O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.height() - this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.descent()) + O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 3.0f);
            this.f3889O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = fRound;
            this.f3932O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O = fRound;
        }
        if (this.f3905O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO == null) {
            return;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo > 2) {
            float f4 = this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0[getClosestIndex()];
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f4;
            this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = f4;
        }
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
    }

    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(float f) {
        if (!this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
            this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.right = (((f - this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) * this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000) / getAmplitude()) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.left = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.right;
            return;
        }
        this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.right = ((1.0f - ((f - this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) / getAmplitude())) * this.f3873O00000OOoOOO00O00o0ooooooooO000ooooO0000) + this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.left = this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.right;
    }

    public final void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i;
        if (!this.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 || (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) == null) {
            return;
        }
        String indicatorTextString = getIndicatorTextString();
        View view = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (view instanceof O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            ((O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) view).setProgress(indicatorTextString);
        } else {
            TextView textView = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1637O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (textView != null) {
                textView.setText(indicatorTextString);
            }
        }
        int thumbCenterX = 0;
        this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.measure(0, 0);
        int measuredWidth = this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getMeasuredWidth();
        float thumbCenterX2 = getThumbCenterX();
        if (this.f3866O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == -1.0f) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                this.f3866O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = displayMetrics.widthPixels;
            }
        }
        float f = measuredWidth / 2;
        float f2 = f + thumbCenterX2;
        int i2 = this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        if (f2 > i2) {
            thumbCenterX = i2 - measuredWidth;
            i = (int) ((thumbCenterX2 - thumbCenterX) - f);
        } else if (thumbCenterX2 - f < 0.0f) {
            i = -((int) (f - thumbCenterX2));
        } else {
            thumbCenterX = (int) (getThumbCenterX() - f);
            i = 0;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.f1645O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, thumbCenterX, -1, -1, -1);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.f1636O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, i, -1, -1, -1);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getIndicator() {
        return this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
    }

    public View getIndicatorContentView() {
        return this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
    }

    public String getIndicatorTextString() {
        String[] strArr;
        String str = this.f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
        if (str == null || !str.contains("${TICK_TEXT}")) {
            String str2 = this.f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
            if (str2 != null && str2.contains("${PROGRESS}")) {
                return this.f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.replace("${PROGRESS}", O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0));
            }
        } else if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo > 2 && (strArr = this.f3886O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000) != null) {
            return this.f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.replace("${TICK_TEXT}", strArr[getThumbPosOnTick()]);
        }
        return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
    }

    public float getMax() {
        return this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    public float getMin() {
        return this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 getOnSeekChangeListener() {
        return this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public int getProgress() {
        return Math.round(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
    }

    public synchronized float getProgressFloat() {
        return BigDecimal.valueOf(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0).setScale(this.f3880O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, 4).floatValue();
    }

    public int getTickCount() {
        return this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(canvas);
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(canvas);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(canvas);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(canvas);
        if (this.f3931O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo && (!this.f3884O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o || this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo <= 2)) {
            this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setColor(this.f3933O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o);
            canvas.drawText(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0), getThumbCenterX(), this.f3932O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O, this.f3860O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.resolveSize(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 170.0f), i), Math.round(this.f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + getPaddingTop() + getPaddingBottom()) + this.f3885O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0);
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setProgress(bundle.getFloat("isb_progress"));
        super.onRestoreInstanceState(bundle.getParcelable("isb_instance_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("isb_instance_state", super.onSaveInstanceState());
        bundle.putFloat("isb_progress", this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 11));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        PopupWindow popupWindow;
        RectF rectF = this.f3918O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        if (!this.f3881O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            super.performClick();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f3865O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == -1.0f) {
                this.f3865O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 5.0f);
            }
            float f = this.f3869O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            float f2 = this.f3865O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            float f3 = f2 * 2.0f;
            boolean z = x >= f - f3 && x <= f3 + ((float) (this.f3871O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 - this.f3870O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo));
            float f4 = rectF.top;
            float f5 = this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O;
            boolean z2 = y >= (f4 - f5) - f2 && y <= (f4 + f5) + f2;
            if (z && z2) {
                if (this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
                    float f6 = this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO ? this.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.right : rectF.right;
                    float f7 = this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo / 2.0f;
                    if (f6 - f7 > x || x > f7 + f6) {
                        return false;
                    }
                }
                this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = true;
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 != null) {
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
                }
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(motionEvent);
                return true;
            }
        } else if (action == 1) {
            this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = false;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
            }
            if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo < 3 && this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O && this.f3934O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO) {
                int closestIndex = getClosestIndex();
                float f8 = this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, Math.abs(f8 - this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0[closestIndex]));
                valueAnimatorOfFloat.start();
                valueAnimatorOfFloat.addUpdateListener(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, f8, closestIndex));
            } else {
                invalidate();
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && (popupWindow = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1638O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) != null) {
                popupWindow.dismiss();
            }
        } else if (action == 2) {
            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(motionEvent);
        } else if (action == 3) {
            this.f3875O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = false;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
            }
            if (this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo < 3) {
                invalidate();
            } else {
                invalidate();
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3896O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                popupWindow.dismiss();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDecimalScale(int i) {
        this.f3880O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (z == isEnabled()) {
            return;
        }
        super.setEnabled(z);
        if (isEnabled()) {
            setAlpha(1.0f);
            if (this.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
                this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.setAlpha(1.0f);
                return;
            }
            return;
        }
        setAlpha(0.3f);
        if (this.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
            this.f3901O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.setAlpha(0.3f);
        }
    }

    public void setIndicatorStayAlways(boolean z) {
        this.f3899O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = z;
    }

    public void setIndicatorTextFormat(String str) {
        this.f3904O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = str;
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public synchronized void setMax(float f) {
        this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = Math.max(this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, f);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        invalidate();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public synchronized void setMin(float f) {
        this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = Math.min(this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, f);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        invalidate();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public void setOnSeekChangeListener(@NonNull O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.f3861O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public synchronized void setProgress(float f) {
        try {
            this.f3864O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
            float f2 = this.f3877O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
            if (f < f2) {
                f = f2;
            } else {
                f2 = this.f3876O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
                if (f > f2) {
                    f = f2;
                }
            }
            this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f;
            if (!this.f3882O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O && this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo > 2) {
                this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f3883O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0[getClosestIndex()];
            }
            setSeekListener(false);
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this.f3878O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            postInvalidate();
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setR2L(boolean z) {
        this.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = z;
        requestLayout();
        invalidate();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public void setThumbAdjustAuto(boolean z) {
        this.f3934O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO = z;
    }

    public void setThumbDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo = null;
            this.f3925O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO = null;
            this.f3929O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = null;
        } else {
            this.f3928O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo = drawable;
            float fMin = Math.min(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 30.0f), this.f3927O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) / 2.0f;
            this.f3923O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO = fMin;
            this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O = fMin;
            this.f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Math.max(fMin, this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00) * 2.0f;
            O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        }
        requestLayout();
        invalidate();
    }

    public synchronized void setTickCount(int i) {
        int i2 = this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
        if (i2 < 0 || i2 > 50) {
            throw new IllegalArgumentException("the Argument: TICK COUNT must be limited between (0-50), Now is " + this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo);
        }
        this.f3906O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = i;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        invalidate();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
    }

    public void setTickMarksDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = null;
            this.f3910O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = null;
            this.f3911O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = null;
        } else {
            this.f3912O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = drawable;
            float fMin = Math.min(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3858O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 30.0f), this.f3916O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo) / 2.0f;
            this.f3909O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 = fMin;
            this.f3863O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Math.max(this.f3924O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O, fMin) * 2.0f;
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        }
        invalidate();
    }

    public void setUserSeekAble(boolean z) {
        this.f3881O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = z;
    }
}
