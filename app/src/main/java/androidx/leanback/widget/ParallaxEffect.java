package androidx.leanback.widget;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParallaxEffect {
    final List<Parallax.PropertyMarkerValue> mMarkerValues = new ArrayList(2);
    final List<Float> mWeights = new ArrayList(2);
    final List<Float> mTotalWeights = new ArrayList(2);
    final List<ParallaxTarget> mTargets = new ArrayList(4);

    public static final class FloatEffect extends ParallaxEffect {
        @Override // androidx.leanback.widget.ParallaxEffect
        public Number calculateDirectValue(Parallax parallax) {
            if (this.mMarkerValues.size() != 2) {
                throw new RuntimeException("Must use two marker values for direct mapping");
            }
            if (this.mMarkerValues.get(0).getProperty() != this.mMarkerValues.get(1).getProperty()) {
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            float markerValue = ((Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(0)).getMarkerValue(parallax);
            float markerValue2 = ((Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(1)).getMarkerValue(parallax);
            if (markerValue > markerValue2) {
                markerValue2 = markerValue;
                markerValue = markerValue2;
            }
            Float f = ((Parallax.FloatProperty) this.mMarkerValues.get(0).getProperty()).get(parallax);
            if (f.floatValue() < markerValue) {
                return Float.valueOf(markerValue);
            }
            return f.floatValue() > markerValue2 ? Float.valueOf(markerValue2) : f;
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public float calculateFraction(Parallax parallax) {
            float maxValue;
            int i = 0;
            int i2 = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            while (i < this.mMarkerValues.size()) {
                Parallax.FloatPropertyMarkerValue floatPropertyMarkerValue = (Parallax.FloatPropertyMarkerValue) this.mMarkerValues.get(i);
                int index = floatPropertyMarkerValue.getProperty().getIndex();
                float markerValue = floatPropertyMarkerValue.getMarkerValue(parallax);
                float floatPropertyValue = parallax.getFloatPropertyValue(index);
                if (i == 0) {
                    if (floatPropertyValue >= markerValue) {
                        return 0.0f;
                    }
                } else {
                    if (i2 == index && f < markerValue) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (floatPropertyValue == Float.MAX_VALUE) {
                        return getFractionWithWeightAdjusted((f - f2) / parallax.getMaxValue(), i);
                    }
                    if (floatPropertyValue >= markerValue) {
                        if (i2 == index) {
                            maxValue = (f - floatPropertyValue) / (f - markerValue);
                        } else if (f2 != -3.4028235E38f) {
                            float f3 = (floatPropertyValue - f2) + f;
                            maxValue = (f3 - floatPropertyValue) / (f3 - markerValue);
                        } else {
                            maxValue = 1.0f - ((floatPropertyValue - markerValue) / parallax.getMaxValue());
                        }
                        return getFractionWithWeightAdjusted(maxValue, i);
                    }
                }
                i++;
                f = markerValue;
                i2 = index;
                f2 = floatPropertyValue;
            }
            return 1.0f;
        }
    }

    public static final class IntEffect extends ParallaxEffect {
        @Override // androidx.leanback.widget.ParallaxEffect
        public Number calculateDirectValue(Parallax parallax) {
            if (this.mMarkerValues.size() != 2) {
                throw new RuntimeException("Must use two marker values for direct mapping");
            }
            if (this.mMarkerValues.get(0).getProperty() != this.mMarkerValues.get(1).getProperty()) {
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            int markerValue = ((Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(0)).getMarkerValue(parallax);
            int markerValue2 = ((Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(1)).getMarkerValue(parallax);
            if (markerValue > markerValue2) {
                markerValue2 = markerValue;
                markerValue = markerValue2;
            }
            Integer num = ((Parallax.IntProperty) this.mMarkerValues.get(0).getProperty()).get(parallax);
            if (num.intValue() < markerValue) {
                return Integer.valueOf(markerValue);
            }
            return num.intValue() > markerValue2 ? Integer.valueOf(markerValue2) : num;
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public float calculateFraction(Parallax parallax) {
            float maxValue;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i < this.mMarkerValues.size()) {
                Parallax.IntPropertyMarkerValue intPropertyMarkerValue = (Parallax.IntPropertyMarkerValue) this.mMarkerValues.get(i);
                int index = intPropertyMarkerValue.getProperty().getIndex();
                int markerValue = intPropertyMarkerValue.getMarkerValue(parallax);
                int intPropertyValue = parallax.getIntPropertyValue(index);
                if (i == 0) {
                    if (intPropertyValue >= markerValue) {
                        return 0.0f;
                    }
                } else {
                    if (i2 == index && i3 < markerValue) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (intPropertyValue == Integer.MAX_VALUE) {
                        return getFractionWithWeightAdjusted((i3 - i4) / parallax.getMaxValue(), i);
                    }
                    if (intPropertyValue >= markerValue) {
                        if (i2 == index) {
                            maxValue = (i3 - intPropertyValue) / (i3 - markerValue);
                        } else if (i4 != Integer.MIN_VALUE) {
                            int i5 = (intPropertyValue - i4) + i3;
                            maxValue = (i5 - intPropertyValue) / (i5 - markerValue);
                        } else {
                            maxValue = 1.0f - ((intPropertyValue - markerValue) / parallax.getMaxValue());
                        }
                        return getFractionWithWeightAdjusted(maxValue, i);
                    }
                }
                i++;
                i3 = markerValue;
                i2 = index;
                i4 = intPropertyValue;
            }
            return 1.0f;
        }
    }

    public final void addTarget(ParallaxTarget parallaxTarget) {
        this.mTargets.add(parallaxTarget);
    }

    public abstract Number calculateDirectValue(Parallax parallax);

    public abstract float calculateFraction(Parallax parallax);

    public final float getFractionWithWeightAdjusted(float f, int i) {
        if (this.mMarkerValues.size() < 3) {
            return f;
        }
        if (this.mWeights.size() == this.mMarkerValues.size() - 1) {
            float fFloatValue = ((Float) O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.mTotalWeights, 1)).floatValue();
            float fFloatValue2 = (this.mWeights.get(i - 1).floatValue() * f) / fFloatValue;
            return i >= 2 ? (this.mTotalWeights.get(i - 2).floatValue() / fFloatValue) + fFloatValue2 : fFloatValue2;
        }
        float size = this.mMarkerValues.size() - 1;
        float f2 = f / size;
        return i >= 2 ? f2 + ((i - 1) / size) : f2;
    }

    public final List<Parallax.PropertyMarkerValue> getPropertyRanges() {
        return this.mMarkerValues;
    }

    public final List<ParallaxTarget> getTargets() {
        return this.mTargets;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final List<Float> getWeights() {
        return this.mWeights;
    }

    public final void performMapping(Parallax parallax) {
        if (this.mMarkerValues.size() < 2) {
            return;
        }
        if (this instanceof IntEffect) {
            parallax.verifyIntProperties();
        } else {
            parallax.verifyFloatProperties();
        }
        Number numberCalculateDirectValue = null;
        boolean z = false;
        float fCalculateFraction = 0.0f;
        for (int i = 0; i < this.mTargets.size(); i++) {
            ParallaxTarget parallaxTarget = this.mTargets.get(i);
            if (parallaxTarget.isDirectMapping()) {
                if (numberCalculateDirectValue == null) {
                    numberCalculateDirectValue = calculateDirectValue(parallax);
                }
                parallaxTarget.directUpdate(numberCalculateDirectValue);
            } else {
                if (!z) {
                    fCalculateFraction = calculateFraction(parallax);
                    z = true;
                }
                parallaxTarget.update(fCalculateFraction);
            }
        }
    }

    public final void removeTarget(ParallaxTarget parallaxTarget) {
        this.mTargets.remove(parallaxTarget);
    }

    public final void setPropertyRanges(Parallax.PropertyMarkerValue... propertyMarkerValueArr) {
        this.mMarkerValues.clear();
        for (Parallax.PropertyMarkerValue propertyMarkerValue : propertyMarkerValueArr) {
            this.mMarkerValues.add(propertyMarkerValue);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setWeights(float... fArr) {
        int length = fArr.length;
        int i = 0;
        while (true) {
            float f = 0.0f;
            if (i >= length) {
                this.mWeights.clear();
                this.mTotalWeights.clear();
                for (float f2 : fArr) {
                    this.mWeights.add(Float.valueOf(f2));
                    f += f2;
                    this.mTotalWeights.add(Float.valueOf(f));
                }
                return;
            }
            if (fArr[i] <= 0.0f) {
                throw new IllegalArgumentException();
            }
            i++;
        }
    }

    public final ParallaxEffect target(ParallaxTarget parallaxTarget) {
        this.mTargets.add(parallaxTarget);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final ParallaxEffect weights(float... fArr) {
        setWeights(fArr);
        return this;
    }

    public final ParallaxEffect target(Object obj, PropertyValuesHolder propertyValuesHolder) {
        this.mTargets.add(new ParallaxTarget.PropertyValuesHolderTarget(obj, propertyValuesHolder));
        return this;
    }

    public final <T, V extends Number> ParallaxEffect target(T t, Property<T, V> property) {
        this.mTargets.add(new ParallaxTarget.DirectPropertyTarget(t, property));
        return this;
    }
}
