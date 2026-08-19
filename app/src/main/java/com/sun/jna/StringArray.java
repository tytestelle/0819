package com.sun.jna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    private String encoding;
    private List<NativeString> natives;
    private Object[] original;

    public StringArray(String[] strArr) {
        this(strArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        WString wString;
        String string;
        String wideString;
        boolean z = this.original instanceof WString[];
        boolean zEquals = "--WIDE-STRING--".equals(this.encoding);
        for (int i = 0; i < this.original.length; i++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i);
            if (pointer != null) {
                if (zEquals) {
                    wideString = pointer.getWideString(0L);
                } else {
                    string = pointer.getString(0L, this.encoding);
                }
                if (z) {
                    wString = string;
                    wString = wideString;
                    wString = new WString(wString);
                } else {
                    wString = string;
                    wString = wideString;
                }
            } else {
                wString = 0;
            }
            this.original[i] = wString;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("--WIDE-STRING--".equals(this.encoding) ? "const wchar_t*[]" : "const char*[]");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(Arrays.asList(this.original));
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    public StringArray(String[] strArr, boolean z) {
        this((Object[]) strArr, z ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }

    public StringArray(WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    private StringArray(Object[] objArr, String str) {
        super((objArr.length + 1) * Native.POINTER_SIZE);
        this.natives = new ArrayList();
        this.original = objArr;
        this.encoding = str;
        int i = 0;
        while (true) {
            Pointer pointer = null;
            if (i < objArr.length) {
                Object obj = objArr[i];
                if (obj != null) {
                    NativeString nativeString = new NativeString(obj.toString(), str);
                    this.natives.add(nativeString);
                    pointer = nativeString.getPointer();
                }
                setPointer(Native.POINTER_SIZE * i, pointer);
                i++;
            } else {
                setPointer(Native.POINTER_SIZE * objArr.length, null);
                return;
            }
        }
    }
}
