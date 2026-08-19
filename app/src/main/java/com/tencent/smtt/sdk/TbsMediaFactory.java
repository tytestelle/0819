package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;

/* JADX INFO: loaded from: classes2.dex */
public class TbsMediaFactory {
    private Context a;
    private s b = null;
    private DexLoader c = null;

    public TbsMediaFactory(Context context) {
        this.a = null;
        this.a = context.getApplicationContext();
        a();
    }

    private void a() {
        if (this.a == null) {
            Log.e("TbsVideo", "TbsVideo needs context !!");
            return;
        }
        if (this.b == null) {
            f.a(true).a(this.a, false, false);
            s sVarA = f.a(true).a();
            this.b = sVarA;
            if (sVarA != null) {
                this.c = sVarA.c();
            }
        }
        if (this.b == null || this.c == null) {
            throw new RuntimeException("tbs core dex(s) load failure !!!");
        }
    }

    public TbsMediaPlayer createPlayer() {
        DexLoader dexLoader;
        if (this.b == null || (dexLoader = this.c) == null) {
            throw new RuntimeException("tbs core dex(s) did not loaded !!!");
        }
        return new TbsMediaPlayer(new n(dexLoader, this.a));
    }
}
