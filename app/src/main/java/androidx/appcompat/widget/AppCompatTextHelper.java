package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.mView;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView2 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle &= 2;
            }
        }
        int i3 = R.styleable.TextAppearance_android_fontFamily;
        if (!tintTypedArray.hasValue(i3) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            int i4 = R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i4)) {
                this.mAsyncFontPending = false;
                int i5 = tintTypedArray.getInt(i4, 1);
                if (i5 == 1) {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.mFontTypeface = null;
        int i6 = R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i6)) {
            i3 = i6;
        }
        final int i7 = this.mFontWeight;
        final int i8 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i3, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* JADX INFO: renamed from: onFontRetrievalFailed */
                    public void lambda$callbackFailAsync$1(int i9) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* JADX INFO: renamed from: onFontRetrieved */
                    public void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
                        int i9;
                        if (Build.VERSION.SDK_INT >= 28 && (i9 = i7) != -1) {
                            typeface = Api28Impl.create(typeface, i9, (i8 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }
                });
                if (font != null) {
                    if (i < 28 || this.mFontWeight == -1) {
                        this.mFontTypeface = font;
                    } else {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        } else {
            this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        }
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:163:0x031f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0326  */
    /* JADX WARN: Code duplicated, block: B:168:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0331  */
    /* JADX WARN: Code duplicated, block: B:170:0x0338  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f  */
    @SuppressLint({"NewApi"})
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i) {
        String string;
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String string2;
        boolean z3;
        int i2;
        int i3;
        float dimensionPixelSize;
        int i4;
        int i5;
        int i6;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        int[] iArr = R.styleable.AppCompatTextHelper;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i7 = R.styleable.AppCompatTextHelper_android_drawableLeft;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i7)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i7, 0));
        }
        int i8 = R.styleable.AppCompatTextHelper_android_drawableTop;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i8, 0));
        }
        int i9 = R.styleable.AppCompatTextHelper_android_drawableRight;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i9, 0));
        }
        int i10 = R.styleable.AppCompatTextHelper_android_drawableBottom;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i10, 0));
        }
        int i11 = R.styleable.AppCompatTextHelper_android_drawableStart;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0));
        }
        int i12 = R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z4 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (z4) {
                z = false;
                z2 = false;
            } else {
                int i13 = R.styleable.TextAppearance_textAllCaps;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i13)) {
                    z = tintTypedArrayObtainStyledAttributes2.getBoolean(i13, false);
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes2);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 23) {
                int i15 = R.styleable.TextAppearance_android_textColor;
                colorStateList = tintTypedArrayObtainStyledAttributes2.hasValue(i15) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(i15) : null;
                int i16 = R.styleable.TextAppearance_android_textColorHint;
                colorStateList2 = tintTypedArrayObtainStyledAttributes2.hasValue(i16) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(i16) : null;
                int i17 = R.styleable.TextAppearance_android_textColorLink;
                colorStateList3 = tintTypedArrayObtainStyledAttributes2.hasValue(i17) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(i17) : null;
                i5 = R.styleable.TextAppearance_textLocale;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i5)) {
                    string = tintTypedArrayObtainStyledAttributes2.getString(i5);
                } else {
                    string = null;
                }
                if (i14 >= 26) {
                    i6 = R.styleable.TextAppearance_fontVariationSettings;
                    if (tintTypedArrayObtainStyledAttributes2.hasValue(i6)) {
                        string2 = tintTypedArrayObtainStyledAttributes2.getString(i6);
                    } else {
                        string2 = null;
                    }
                } else {
                    string2 = null;
                }
                tintTypedArrayObtainStyledAttributes2.recycle();
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            i5 = R.styleable.TextAppearance_textLocale;
            if (tintTypedArrayObtainStyledAttributes2.hasValue(i5)) {
                string = tintTypedArrayObtainStyledAttributes2.getString(i5);
            } else {
                string = null;
            }
            if (i14 >= 26) {
                i6 = R.styleable.TextAppearance_fontVariationSettings;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i6)) {
                    string2 = tintTypedArrayObtainStyledAttributes2.getString(i6);
                } else {
                    string2 = null;
                }
            } else {
                string2 = null;
            }
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            string = null;
            colorStateList = null;
            z = false;
            z2 = false;
            colorStateList2 = null;
            colorStateList3 = null;
            string2 = null;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (z4) {
            z3 = z2;
        } else {
            int i18 = R.styleable.TextAppearance_textAllCaps;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i18)) {
                z = tintTypedArrayObtainStyledAttributes3.getBoolean(i18, false);
                z3 = true;
            } else {
                z3 = z2;
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 < 23) {
            int i20 = R.styleable.TextAppearance_android_textColor;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i20)) {
                colorStateList = tintTypedArrayObtainStyledAttributes3.getColorStateList(i20);
            }
            int i21 = R.styleable.TextAppearance_android_textColorHint;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i21)) {
                colorStateList2 = tintTypedArrayObtainStyledAttributes3.getColorStateList(i21);
            }
            int i22 = R.styleable.TextAppearance_android_textColorLink;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i22)) {
                colorStateList3 = tintTypedArrayObtainStyledAttributes3.getColorStateList(i22);
            }
        }
        int i23 = R.styleable.TextAppearance_textLocale;
        if (tintTypedArrayObtainStyledAttributes3.hasValue(i23)) {
            string = tintTypedArrayObtainStyledAttributes3.getString(i23);
        }
        if (i19 >= 26) {
            int i24 = R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i24)) {
                string2 = tintTypedArrayObtainStyledAttributes3.getString(i24);
            }
        }
        if (i19 >= 28) {
            int i25 = R.styleable.TextAppearance_android_textSize;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i25) && tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(i25, -1) == 0) {
                this.mView.setTextSize(0, 0.0f);
            }
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (colorStateList != null) {
            this.mView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.mView.setHintTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.mView.setLinkTextColor(colorStateList3);
        }
        if (!z4 && z3) {
            setAllCaps(z);
        }
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(typeface, this.mStyle);
            } else {
                this.mView.setTypeface(typeface);
            }
        }
        if (string2 != null) {
            Api26Impl.setFontVariationSettings(this.mView, string2);
        }
        if (string != null) {
            if (i19 >= 24) {
                Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(string));
            } else {
                this.mView.setTextLocale(Api21Impl.forLanguageTag(string.split(",")[0]));
            }
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
        int resourceId2 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null);
        int i26 = R.styleable.AppCompatTextView_drawableTint;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i26)) {
            TextViewCompat.setCompoundDrawableTintList(this.mView, tintTypedArrayObtainStyledAttributes4.getColorStateList(i26));
        }
        int i27 = R.styleable.AppCompatTextView_drawableTintMode;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i27)) {
            i2 = -1;
            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(i27, -1), null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, i2);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int i28 = R.styleable.AppCompatTextView_lineHeight;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i28)) {
            TypedValue typedValuePeekValue = tintTypedArrayObtainStyledAttributes4.peekValue(i28);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i3 = -1;
                dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(i28, -1);
            } else {
                int unitFromComplexDimension = TypedValueCompat.getUnitFromComplexDimension(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
                i4 = unitFromComplexDimension;
                i3 = -1;
            }
            tintTypedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i3) {
                TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i3) {
                TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i4 == i3) {
                    TextViewCompat.setLineHeight(this.mView, (int) dimensionPixelSize);
                } else {
                    TextViewCompat.setLineHeight(this.mView, i4, dimensionPixelSize);
                }
            }
        }
        i3 = -1;
        dimensionPixelSize = -1.0f;
        i4 = -1;
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i3) {
            TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i4 == i3) {
                TextViewCompat.setLineHeight(this.mView, (int) dimensionPixelSize);
            } else {
                TextViewCompat.setLineHeight(this.mView, i4, dimensionPixelSize);
            }
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!textView.isAttachedToWindow()) {
                    textView.setTypeface(typeface, this.mStyle);
                } else {
                    final int i = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        int i2 = R.styleable.TextAppearance_textAllCaps;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i2)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = R.styleable.TextAppearance_android_textColor;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i4) && (colorStateList3 = tintTypedArrayObtainStyledAttributes.getColorStateList(i4)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i5 = R.styleable.TextAppearance_android_textColorLink;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i5) && (colorStateList2 = tintTypedArrayObtainStyledAttributes.getColorStateList(i5)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i6 = R.styleable.TextAppearance_android_textColorHint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i6) && (colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(i6)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i7 = R.styleable.TextAppearance_android_textSize;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i7) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i7, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        if (i3 >= 26) {
            int i8 = R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i8) && (string = tintTypedArrayObtainStyledAttributes.getString(i8)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i, float f) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}
