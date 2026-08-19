package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tbs.video.interfaces.IUserStateChangedListener;

/* JADX INFO: loaded from: classes2.dex */
class p {
    private static p e;
    r a;
    Context b;
    com.tencent.tbs.video.interfaces.a c;
    IUserStateChangedListener d;

    private p(Context context) {
        this.a = null;
        this.b = context.getApplicationContext();
        this.a = new r(this.b);
    }

    public static synchronized p a(Context context) {
        try {
            if (e == null) {
                e = new p(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public void a(int i, int i2, Intent intent) {
        com.tencent.tbs.video.interfaces.a aVar = this.c;
        if (aVar != null) {
            aVar.a(i, i2, intent);
        }
    }

    public void a(Activity activity, int i) {
        this.a.a(activity, i);
    }

    public boolean a() {
        this.a.a();
        return this.a.b();
    }

    public boolean a(String str, Bundle bundle, com.tencent.tbs.video.interfaces.a aVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("videoUrl", str);
        }
        if (aVar != null) {
            this.a.a();
            if (!this.a.b()) {
                return false;
            }
            this.c = aVar;
            IUserStateChangedListener iUserStateChangedListener = new IUserStateChangedListener() { // from class: com.tencent.smtt.sdk.p.1
                @Override // com.tencent.tbs.video.interfaces.IUserStateChangedListener
                public void onUserStateChanged() {
                    p.this.a.c();
                }
            };
            this.d = iUserStateChangedListener;
            this.c.a(iUserStateChangedListener);
            bundle.putInt("callMode", 3);
        } else {
            bundle.putInt("callMode", 1);
        }
        this.a.a(bundle, aVar == null ? null : this);
        return true;
    }
}
