package com.tencent.smtt.sdk;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.tencent.smtt.export.external.DexLoader;

/* JADX INFO: loaded from: classes2.dex */
class n {
    private DexLoader a;
    private Object b;

    public n(DexLoader dexLoader, Context context) {
        this.b = null;
        this.a = dexLoader;
        this.b = dexLoader.newInstance("com.tencent.tbs.player.TbsMediaPlayerProxy", new Class[]{Context.class}, context);
    }

    public void a(float f) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setVolume", new Class[]{Float.TYPE}, Float.valueOf(f));
    }

    public float b() {
        Float f = (Float) this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "getVolume", new Class[0], new Object[0]);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public void c() {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "pause", new Class[0], new Object[0]);
    }

    public void d() {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "play", new Class[0], new Object[0]);
    }

    public void e() {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE, new Class[0], new Object[0]);
    }

    public void a(int i) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "subtitle", new Class[]{Integer.TYPE}, Integer.valueOf(i));
    }

    public void b(int i) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "audio", new Class[]{Integer.TYPE}, Integer.valueOf(i));
    }

    public void a(long j) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "seek", new Class[]{Long.TYPE}, Long.valueOf(j));
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setSurfaceTexture", new Class[]{SurfaceTexture.class}, surfaceTexture);
    }

    public void a(TbsMediaPlayer.TbsMediaPlayerListener tbsMediaPlayerListener) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setPlayerListener", new Class[]{Object.class}, tbsMediaPlayerListener);
    }

    public void a(String str, Bundle bundle) {
        this.a.invokeMethod(this.b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "startPlay", new Class[]{String.class, Bundle.class}, str, bundle);
    }

    public boolean a() {
        return this.b != null;
    }
}
