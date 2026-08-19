package androidx.constraintlayout.motion.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class CustomSupport {
    private static final String TAG = "CustomSupport";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        String str;
        String str2 = "\"";
        Class<?> cls = view.getClass();
        String str3 = "set" + constraintAttribute.getName();
        try {
            try {
                try {
                    try {
                        try {
                            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[constraintAttribute.getType().ordinal()]) {
                                case 1:
                                    str = "\"";
                                    cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                                    return;
                                case 2:
                                    str = "\"";
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                    return;
                                case 3:
                                    str = "\"";
                                    Method method = cls.getMethod(str3, Drawable.class);
                                    int iClamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(iClamp);
                                    method.invoke(view, colorDrawable);
                                    return;
                                case 4:
                                    try {
                                        try {
                                            str = "\"";
                                            try {
                                                cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                                                return;
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("cannot access method ", str3, " on View \"");
                                                sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(Debug.getName(view));
                                                sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(str);
                                                Log.e(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
                                                e.printStackTrace();
                                                return;
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                str2 = str;
                                                StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no method ", str3, " on View \"");
                                                sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.append(Debug.getName(view));
                                                sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.append(str2);
                                                Log.e(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.toString());
                                                e.printStackTrace();
                                                return;
                                            }
                                        } catch (IllegalAccessException e3) {
                                            e = e3;
                                            str = "\"";
                                            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("cannot access method ", str3, " on View \"");
                                            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.append(Debug.getName(view));
                                            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.append(str);
                                            Log.e(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.toString());
                                            e.printStackTrace();
                                            return;
                                        } catch (NoSuchMethodException e4) {
                                            e = e4;
                                            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no method ", str3, " on View \"");
                                            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4.append(Debug.getName(view));
                                            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4.append(str2);
                                            Log.e(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4.toString());
                                            e.printStackTrace();
                                            return;
                                        }
                                    } catch (NoSuchMethodException e5) {
                                        e = e5;
                                        str = "\"";
                                    }
                                    break;
                                case 5:
                                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.getName());
                                case 6:
                                    cls.getMethod(str3, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                                    return;
                                case 7:
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                    return;
                                default:
                                    return;
                            }
                        } catch (IllegalAccessException e6) {
                            e = e6;
                        } catch (NoSuchMethodException e7) {
                            e = e7;
                        }
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                    }
                } catch (IllegalAccessException e9) {
                    e = e9;
                }
            } catch (NoSuchMethodException e10) {
                e = e10;
            }
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }
}
