package androidx.leanback.widget.picker;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.core.view.ViewCompat;
import androidx.leanback.R;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class TimePicker extends Picker {
    private static final int AM_INDEX = 0;
    private static final int HOURS_IN_HALF_DAY = 12;
    private static final int PM_INDEX = 1;
    static final String TAG = "TimePicker";
    PickerColumn mAmPmColumn;
    int mColAmPmIndex;
    int mColHourIndex;
    int mColMinuteIndex;
    private final PickerUtility.TimeConstant mConstant;
    private int mCurrentAmPmIndex;
    private int mCurrentHour;
    private int mCurrentMinute;
    PickerColumn mHourColumn;
    private boolean mIs24hFormat;
    PickerColumn mMinuteColumn;
    private String mTimePickerFormat;

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.timePickerStyle);
    }

    private String extractTimeFields() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        boolean z = TextUtils.getLayoutDirectionFromLocale(this.mConstant.locale) == 1;
        boolean z2 = bestHourMinutePattern.indexOf(97) < 0 || bestHourMinutePattern.indexOf(CmcdData.OBJECT_TYPE_AUDIO_ONLY) > bestHourMinutePattern.indexOf("m");
        String str = z ? "mh" : "hm";
        if (is24Hour()) {
            return str;
        }
        return z2 ? str.concat(CmcdData.OBJECT_TYPE_AUDIO_ONLY) : CmcdData.OBJECT_TYPE_AUDIO_ONLY.concat(str);
    }

    private static boolean isAnyOf(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    private void setAmPmValue() {
        if (is24Hour()) {
            return;
        }
        setColumnValue(this.mColAmPmIndex, this.mCurrentAmPmIndex, false);
    }

    private void updateColumns() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        if (TextUtils.equals(bestHourMinutePattern, this.mTimePickerFormat)) {
            return;
        }
        this.mTimePickerFormat = bestHourMinutePattern;
        String strExtractTimeFields = extractTimeFields();
        List<CharSequence> listExtractSeparators = extractSeparators();
        if (listExtractSeparators.size() != strExtractTimeFields.length() + 1) {
            throw new IllegalStateException("Separators size: " + listExtractSeparators.size() + " must equal the size of timeFieldsPattern: " + strExtractTimeFields.length() + " + 1");
        }
        setSeparators(listExtractSeparators);
        String upperCase = strExtractTimeFields.toUpperCase(this.mConstant.locale);
        this.mAmPmColumn = null;
        this.mMinuteColumn = null;
        this.mHourColumn = null;
        this.mColAmPmIndex = -1;
        this.mColMinuteIndex = -1;
        this.mColHourIndex = -1;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < upperCase.length(); i++) {
            char cCharAt = upperCase.charAt(i);
            if (cCharAt == 'A') {
                PickerColumn pickerColumn = new PickerColumn();
                this.mAmPmColumn = pickerColumn;
                arrayList.add(pickerColumn);
                this.mAmPmColumn.setStaticLabels(this.mConstant.ampm);
                this.mColAmPmIndex = i;
                updateMin(this.mAmPmColumn, 0);
                updateMax(this.mAmPmColumn, 1);
            } else if (cCharAt == 'H') {
                PickerColumn pickerColumn2 = new PickerColumn();
                this.mHourColumn = pickerColumn2;
                arrayList.add(pickerColumn2);
                this.mHourColumn.setStaticLabels(this.mConstant.hours24);
                this.mColHourIndex = i;
            } else {
                if (cCharAt != 'M') {
                    throw new IllegalArgumentException("Invalid time picker format.");
                }
                PickerColumn pickerColumn3 = new PickerColumn();
                this.mMinuteColumn = pickerColumn3;
                arrayList.add(pickerColumn3);
                this.mMinuteColumn.setStaticLabels(this.mConstant.minutes);
                this.mColMinuteIndex = i;
            }
        }
        setColumns(arrayList);
    }

    private void updateColumnsRange() {
        updateMin(this.mHourColumn, !this.mIs24hFormat ? 1 : 0);
        updateMax(this.mHourColumn, this.mIs24hFormat ? 23 : 12);
        updateMin(this.mMinuteColumn, 0);
        updateMax(this.mMinuteColumn, 59);
        PickerColumn pickerColumn = this.mAmPmColumn;
        if (pickerColumn != null) {
            updateMin(pickerColumn, 0);
            updateMax(this.mAmPmColumn, 1);
        }
    }

    private static void updateMax(PickerColumn pickerColumn, int i) {
        if (i != pickerColumn.getMaxValue()) {
            pickerColumn.setMaxValue(i);
        }
    }

    private static void updateMin(PickerColumn pickerColumn, int i) {
        if (i != pickerColumn.getMinValue()) {
            pickerColumn.setMinValue(i);
        }
    }

    public List<CharSequence> extractSeparators() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'H', 'h', 'K', 'k', 'm', 'M', 'a'};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < bestHourMinutePattern.length(); i++) {
            char cCharAt = bestHourMinutePattern.charAt(i);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (z || !isAnyOf(cCharAt, cArr)) {
                        sb.append(cCharAt);
                    } else if (cCharAt != c) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public String getBestHourMinutePattern() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.mConstant.locale, this.mIs24hFormat ? "Hma" : "hma");
        return TextUtils.isEmpty(bestDateTimePattern) ? "h:mma" : bestDateTimePattern;
    }

    public int getHour() {
        if (this.mIs24hFormat) {
            return this.mCurrentHour;
        }
        return this.mCurrentAmPmIndex == 0 ? this.mCurrentHour % 12 : (this.mCurrentHour % 12) + 12;
    }

    public int getMinute() {
        return this.mCurrentMinute;
    }

    public boolean is24Hour() {
        return this.mIs24hFormat;
    }

    public boolean isPm() {
        return this.mCurrentAmPmIndex == 1;
    }

    @Override // androidx.leanback.widget.picker.Picker
    public void onColumnValueChanged(int i, int i2) {
        if (i == this.mColHourIndex) {
            this.mCurrentHour = i2;
        } else if (i == this.mColMinuteIndex) {
            this.mCurrentMinute = i2;
        } else {
            if (i != this.mColAmPmIndex) {
                throw new IllegalArgumentException("Invalid column index.");
            }
            this.mCurrentAmPmIndex = i2;
        }
    }

    public void setHour(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED, to = 23) int i) {
        if (i < 0 || i > 23) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "hour: ", " is not in [0-23] range in"));
        }
        this.mCurrentHour = i;
        if (!is24Hour()) {
            int i2 = this.mCurrentHour;
            if (i2 >= 12) {
                this.mCurrentAmPmIndex = 1;
                if (i2 > 12) {
                    this.mCurrentHour = i2 - 12;
                }
            } else {
                this.mCurrentAmPmIndex = 0;
                if (i2 == 0) {
                    this.mCurrentHour = 12;
                }
            }
            setAmPmValue();
        }
        setColumnValue(this.mColHourIndex, this.mCurrentHour, false);
    }

    public void setIs24Hour(boolean z) {
        if (this.mIs24hFormat == z) {
            return;
        }
        int hour = getHour();
        int minute = getMinute();
        this.mIs24hFormat = z;
        updateColumns();
        updateColumnsRange();
        setHour(hour);
        setMinute(minute);
        setAmPmValue();
    }

    public void setMinute(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED, to = 59) int i) {
        if (i < 0 || i > 59) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "minute: ", " is not in [0-59] range."));
        }
        this.mCurrentMinute = i;
        setColumnValue(this.mColMinuteIndex, i, false);
    }

    @SuppressLint({"CustomViewStyleable"})
    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PickerUtility.TimeConstant timeConstantInstance = PickerUtility.getTimeConstantInstance(Locale.getDefault(), context.getResources());
        this.mConstant = timeConstantInstance;
        int[] iArr = R.styleable.lbTimePicker;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.mIs24hFormat = typedArrayObtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_is24HourFormat, DateFormat.is24HourFormat(context));
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_useCurrentTime, true);
            typedArrayObtainStyledAttributes.recycle();
            updateColumns();
            updateColumnsRange();
            if (z) {
                Calendar calendarForLocale = PickerUtility.getCalendarForLocale(null, timeConstantInstance.locale);
                setHour(calendarForLocale.get(11));
                setMinute(calendarForLocale.get(12));
                setAmPmValue();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
