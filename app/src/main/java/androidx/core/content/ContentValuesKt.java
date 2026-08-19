package androidx.core.content;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0... o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr) {
        ContentValues contentValues = new ContentValues(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr.length);
        for (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0Arr) {
            String str = (String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1();
            Object objComponent2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2();
            if (objComponent2 == null) {
                contentValues.putNull(str);
            } else if (objComponent2 instanceof String) {
                contentValues.put(str, (String) objComponent2);
            } else if (objComponent2 instanceof Integer) {
                contentValues.put(str, (Integer) objComponent2);
            } else if (objComponent2 instanceof Long) {
                contentValues.put(str, (Long) objComponent2);
            } else if (objComponent2 instanceof Boolean) {
                contentValues.put(str, (Boolean) objComponent2);
            } else if (objComponent2 instanceof Float) {
                contentValues.put(str, (Float) objComponent2);
            } else if (objComponent2 instanceof Double) {
                contentValues.put(str, (Double) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                contentValues.put(str, (byte[]) objComponent2);
            } else if (objComponent2 instanceof Byte) {
                contentValues.put(str, (Byte) objComponent2);
            } else {
                if (!(objComponent2 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) objComponent2);
            }
        }
        return contentValues;
    }
}
