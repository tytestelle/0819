package O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;

import android.content.Context;
import android.view.SurfaceHolder;
import xyz.doikki.videoplayer.render.IRenderView;
import xyz.doikki.videoplayer.render.MeasureHelper;
import xyz.doikki.videoplayer.render.RenderViewFactory;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends RenderViewFactory {
    @Override // xyz.doikki.videoplayer.render.RenderViewFactory
    public final IRenderView createRenderView(Context context) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context);
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new MeasureHelper();
        SurfaceHolder holder = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getHolder();
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1043O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = holder;
        holder.addCallback(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        holder.setFormat(1);
        return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
