package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;

/* JADX INFO: loaded from: classes2.dex */
public class DateSorter {
    public static int DAY_COUNT;
    private android.webkit.DateSorter a;
    private IX5DateSorter b;

    static {
        a();
        DAY_COUNT = 5;
    }

    public DateSorter(Context context) {
        u uVarA = u.a();
        if (uVarA == null || !uVarA.b()) {
            this.a = new android.webkit.DateSorter(context);
        } else {
            this.b = uVarA.c().h(context);
        }
    }

    private static boolean a() {
        u uVarA = u.a();
        return uVarA != null && uVarA.b();
    }

    public long getBoundary(int i) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? this.a.getBoundary(i) : this.b.getBoundary(i);
    }

    public int getIndex(long j) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? this.a.getIndex(j) : this.b.getIndex(j);
    }

    public String getLabel(int i) {
        u uVarA = u.a();
        return (uVarA == null || !uVarA.b()) ? this.a.getLabel(i) : this.b.getLabel(i);
    }
}
