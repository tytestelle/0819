package O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f562O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f563O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f564O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f565O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final boolean f566O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f567O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        this.f562O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f563O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        this.f564O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f599O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        this.f565O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f595O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f602O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        this.f566O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) != null && ((Boolean) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)).booleanValue();
        this.f567O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f600O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f562O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f563O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f566O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f564O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this));
        Size size = imageInfo.getSize();
        int width = this.f562O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f563O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f565O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        int iRound2 = Math.round(size.getHeight() * fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = this.f567O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
