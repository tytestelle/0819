package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Object f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, boolean z) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setEventListener(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Exception exc) {
        org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setEventListener(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(exc);
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setEventListener(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(4);
        ((org.eclipse.jetty.client.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f4192O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        ((org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Throwable th) {
        org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setEventListener(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(th);
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        ((org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
    }

    @Override // O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Drawable drawable = (Drawable) o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.get();
        if (drawable instanceof BitmapDrawable) {
            return ((O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ((BitmapDrawable) drawable).getBitmap()), o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        }
        if (drawable instanceof O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return ((O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        }
        return null;
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i, String str) {
        ArrayList arrayList;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, i);
        ((HashMap) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        ((org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).put(str, (Object) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        while (true) {
            arrayList = (ArrayList) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (i - arrayList.size() < 0) {
                break;
            }
            arrayList.add(null);
        }
        if (arrayList.get(i) == null) {
            arrayList.add(i, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public Bitmap O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(BitmapFactory.Options options) {
        switch (this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 3:
                return BitmapFactory.decodeStream(new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((ByteBuffer) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)), null, options);
            case 4:
                O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) ((com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.reset();
                return BitmapFactory.decodeStream(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0().getFileDescriptor(), null, options);
        }
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(String str) {
        return (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) ((org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get(str);
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(byte[] bArr, int i, int i2) {
        Map.Entry bestEntry = ((org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getBestEntry(bArr, i, i2);
        if (bestEntry != null) {
            return (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) bestEntry.getValue();
        }
        return null;
    }

    public ImageHeaderParser$ImageType O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        switch (this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 3:
                return O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0((ArrayList) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((ByteBuffer) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
            case 4:
                O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) ((com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f2885O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.reset();
                return O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo((ArrayList) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                ArrayList arrayList = (ArrayList) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) arrayList.get(i);
                    O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = null;
                    try {
                        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3 = new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(new FileInputStream(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0().getFileDescriptor()), o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3);
                            o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                            if (imageHeaderParser$ImageTypeO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            }
                        } catch (Throwable th) {
                            th = th;
                            o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O3;
                            if (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2 != null) {
                                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            }
                            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public int O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            return ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1711O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null || !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            return -1;
        }
        return ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o).f1711O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public int O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(String str) {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) ((org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get(str);
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            return -1;
        }
        return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1711O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) ((HashMap) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(0, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), 0, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO());
    }

    public O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(String str) {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(str);
        return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null ? new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, -1) : o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOoooO00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    public String toString() {
        switch (this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 10:
                return "CACHE[bufferMap=" + ((HashMap) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) + ",stringMap=" + ((org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) + ",index=" + ((ArrayList) this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) + "]";
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                sb.append('{');
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                String str = "";
                while (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
                    Object obj = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    boolean z = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof com.google.common.base.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                    sb.append(str);
                    String str2 = (String) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, int i, Object obj2, Object obj3) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(LivePlayActivity livePlayActivity) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 8;
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashSet();
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 11:
                this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new AtomicLong();
                this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new AtomicLong();
                this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new AtomicLong();
                break;
            default:
                this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(true);
                this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();
                break;
        }
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 13;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(12, false);
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, ArrayList arrayList, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 4;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "Argument must not be null");
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(arrayList, "Argument must not be null");
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    private final void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() {
    }

    private final void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() {
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 5;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "Argument must not be null");
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(arrayList, "Argument must not be null");
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = arrayList;
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new com.bumptech.glide.load.data.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(parcelFileDescriptor);
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(org.eclipse.jetty.client.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.f226O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 14;
        this.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener();
    }

    @Override // org.eclipse.jetty.client.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
    }
}
