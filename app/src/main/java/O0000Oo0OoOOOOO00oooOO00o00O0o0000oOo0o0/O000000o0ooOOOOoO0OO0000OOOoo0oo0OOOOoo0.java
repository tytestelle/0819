package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final HashMap f1585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new HashMap();

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, Bitmap bitmap) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "logo.png");
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        int iAbs = Math.abs(str.hashCode());
        return Color.HSVToColor(new float[]{iAbs % 360, (((iAbs >> 8) % 25) / 100.0f) + 0.55f, (((iAbs >> 16) % 10) / 100.0f) + 0.75f});
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, ImageView imageView, boolean z) {
        Drawable drawable;
        HashMap map;
        String[] strArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        HashMap map2;
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null || imageView == null || TextUtils.isEmpty(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            return;
        }
        String lowerCase = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.toLowerCase();
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().getClass();
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        if (!TextUtils.isEmpty(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            String lowerCase2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.toLowerCase();
            HashMap map3 = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f1423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (map3 != null && map3.containsKey(lowerCase2)) {
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) map3.get(lowerCase2);
            }
            if ((TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) || "null".equals(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) && (map = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f1424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) != null && map.containsKey(lowerCase2)) {
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) map.get(lowerCase2);
            }
            for (String str : ((Boolean) Hawk.get("M3U图标优先", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1479O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00))).booleanValue() ? new String[]{"m3u", "epg"} : new String[]{"epg", "m3u"}) {
                if (TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) || "null".equals(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                    if ("m3u".equals(str) && !TextUtils.isEmpty(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f950O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) {
                        strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f950O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    } else if ("epg".equals(str) && (map2 = O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1563O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) != null && map2.containsKey(lowerCase2)) {
                        strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String) map2.get(lowerCase2);
                    }
                }
            }
            if ((TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) || "null".equals(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) && (strArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) != null) {
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = strArrO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[0];
            }
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f946O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            }
        }
        App app = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        HashMap map4 = f1585O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            String str2 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1510O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
            if (((Boolean) Hawk.get("图标首字", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1484O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo))).booleanValue()) {
                drawable = (Drawable) map4.get(lowerCase);
                if (drawable == null) {
                    int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (TextUtils.isEmpty(str2) || "null".equals(str2)) ? O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(lowerCase) : Color.parseColor(str2);
                    String upperCase = String.valueOf(lowerCase.charAt(0)).toUpperCase();
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f34O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (int) app.getResources().getDimension(R.dimen.tv_channel_logo_drawable_width);
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f35O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (int) app.getResources().getDimension(R.dimen.tv_channel_logo_drawable_height);
                    drawable = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (int) app.getResources().getDimension(R.dimen.tv_channel_logo_radius), upperCase);
                    map4.put(lowerCase, drawable);
                }
            } else {
                drawable = ContextCompat.getDrawable(app, R.drawable.img_logo);
            }
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(app);
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
            ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f2864O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Bitmap.class, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f2865O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f2863O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O).O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.PREFER_RGB_565)).O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(z ? imageView.getDrawable() : drawable)).O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(drawable)).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f290O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)).O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(false)).O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(Integer.MIN_VALUE, Integer.MIN_VALUE)).O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()))).O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()).O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(lowerCase)).O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00(imageView);
        } catch (Resources.NotFoundException e) {
            e = e;
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e = e2;
            e.printStackTrace();
        } catch (NullPointerException e3) {
            e = e3;
            e.printStackTrace();
        } catch (OutOfMemoryError unused) {
            map4.clear();
            com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            System.gc();
        }
    }

    public static String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        String str = LoginActivity.f3011O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        return str != null ? str : new SimpleDateFormat("yyyyMMddHHmmss", Locale.CHINESE).format(new Date());
    }
}
