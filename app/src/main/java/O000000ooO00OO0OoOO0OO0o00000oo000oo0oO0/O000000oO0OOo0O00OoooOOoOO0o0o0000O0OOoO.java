package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Base64;
import androidx.collection.ArrayMap;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.support.lastchange.EventedValue;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, boolean z) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(String str, int i, byte[] bArr) {
        if (bArr.length == i) {
            return;
        }
        throw new IllegalStateException(str + " should be " + i + " bytes long but is " + bArr.length);
    }

    public static O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(ImageDecoder.Source source, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO));
        if (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(drawableDecodeDrawable)) {
            return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(drawableDecodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TRANSFORMED;
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, EventedValue eventedValue) {
        if (((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f81O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return;
        }
        ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getClass();
    }

    @Override // com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Exception exc) {
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 == null || o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 != o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
            return;
        }
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3 = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f509O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, exc, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getDataSource());
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        if (((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f81O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return;
        }
        com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3099O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3100O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getmUrl(), LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "连接成功！");
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        if (((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f81O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return;
        }
        ((com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)).getClass();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无法连接！");
    }

    @Override // com.bumptech.glide.load.data.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) {
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f399O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 == null || o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 != o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
            return;
        }
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3 = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f394O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f245O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        if (obj != null && o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f509O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getDataSource())) {
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f398O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SWITCH_TO_SOURCE_SERVICE);
        } else {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f395O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o3.f509O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, obj, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getDataSource(), o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O1.f400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        synchronized (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
            o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f625O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f623O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length;
        }
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        if (((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f81O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return;
        }
        ((com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)).getClass();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无法连接！");
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, File file, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return ((O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ((BitmapDrawable) ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) obj).get()).getBitmap()), file, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO
    public void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap) throws IOException {
        IOException iOException = ((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f810O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bitmap);
            throw iOException;
        }
    }

    public void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        ArrayList<fi.iki.elonen.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> arrayList = (ArrayList) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        for (fi.iki.elonen.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo : arrayList) {
            try {
                fi.iki.elonen.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3948O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                File file = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3947O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (!file.delete()) {
                    throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
                }
            } catch (Exception e) {
                fi.iki.elonen.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    public synchronized void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        try {
            O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 != null) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f2091O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            } else {
                if (((O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        HashMap map = (HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) map.get(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            map.put(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        } else {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        ArrayList arrayList = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(size - 1);
        }
        return null;
    }

    public byte[] O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        byte[] bArr;
        byte[] bArrDecode;
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        synchronized (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            try {
                if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f842O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                    int i = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f838O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.keyLength;
                    SharedPreferences sharedPreferences = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f839O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    String string = sharedPreferences.getString("cipher_key", null);
                    if (string == null) {
                        bArrDecode = new byte[i];
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f840O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.nextBytes(bArrDecode);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString("cipher_key", Base64.encodeToString(bArrDecode, 0));
                        editorEdit.commit();
                    } else {
                        bArrDecode = Base64.decode(string, 0);
                    }
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f841O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = bArrDecode;
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f842O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                bArr = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f841O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0("Key", ((O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).keyLength, bArr);
        return bArr;
    }

    public synchronized List O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(String str) {
        List arrayList;
        if (!((ArrayList) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).contains(str)) {
            ((ArrayList) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).add(str);
        }
        arrayList = (List) ((HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized ArrayList O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).iterator();
        while (it.hasNext()) {
            List<O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> list = (List) ((HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get((String) it.next());
            if (list != null) {
                for (O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : list) {
                    if ((o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isAssignableFrom(cls) && cls2.isAssignableFrom(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) && !arrayList.contains(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                        arrayList.add(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() {
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
            O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f2091O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 == null) {
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            }
        }
        return o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    public synchronized O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        try {
            if (((O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) == null) {
                wait(1000);
            }
        } catch (Throwable th) {
            throw th;
        }
        return O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
    }

    public void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, Object obj) {
        HashMap map = (HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) map.get(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            map.put(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        } else {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
        }
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(obj);
    }

    public void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((ArrayMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            ((ArrayMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).put(new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(cls, cls2, cls3), list);
        }
    }

    public void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String str) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(str);
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "Argument must not be null");
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj;
                int i = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
                int i2 = i - 1;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
                if (i2 == 0) {
                    O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) ((HashMap) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).remove(str);
                    if (!o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.equals(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ", but actually removed: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 + ", safeKey: " + str);
                    }
                    ((O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f439O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.unlock();
    }

    public Object O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() {
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        while (true) {
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                return null;
            }
            ArrayList arrayList = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3;
            HashMap map = (HashMap) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f403O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            map.remove(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f406O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
    }

    public Object clone() {
        switch (this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 13:
                return new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO((com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return super.clone();
        }
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public String getInitParameter(String str) {
        HashMap map = ((org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f4396O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public Enumeration getInitParameterNames() {
        HashMap map = ((org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f4396O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return map == null ? Collections.enumeration(Collections.EMPTY_LIST) : Collections.enumeration(map.keySet());
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo getServletContext() {
        return ((org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f4401O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4409O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public String getServletName() {
        return ((org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f4400O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public String toString() {
        switch (this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 3:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                boolean z = false;
                while (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.equals(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                    sb.append('{');
                    sb.append(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f403O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    sb.append(':');
                    ArrayList arrayList = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f404O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f405O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, Object obj, int i) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, Object obj2, int i) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 4:
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1);
                break;
            case 9:
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new AtomicReference();
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayMap();
                break;
            case 10:
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();
                break;
            case 12:
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new Handler();
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();
                break;
            case 16:
                File file = new File(System.getProperty("java.io.tmpdir"));
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = file;
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();
                break;
            default:
                this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(null);
                this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();
                break;
        }
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 15;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, Device device) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 13;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1605O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCacheMode().ordinal()];
        if (i == 1) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 0);
        } else if (i == 2) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 2);
        } else if (i == 3) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 3);
        } else if (i == 4) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 1);
        } else if (i == 5) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 4);
        }
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCachePolicy() != null) {
            this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getCachePolicy();
        }
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "policy == null");
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.f76O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 18;
        this.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        this.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }
}
