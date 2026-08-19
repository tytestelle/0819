package O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends View {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Path f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Paint f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public float f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public float f1630O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public float f1631O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public String f1632O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setColor(this.f1626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        canvas.drawPath(this.f1627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        this.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setColor(this.f1625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        canvas.drawText(this.f1632O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 / 2.0f, (this.f1631O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 / 4.0f) + (this.f1630O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO / 2.0f), this.f1628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((int) this.f1629O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, (int) this.f1630O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public void setProgress(String str) {
        this.f1632O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = str;
        invalidate();
    }
}
