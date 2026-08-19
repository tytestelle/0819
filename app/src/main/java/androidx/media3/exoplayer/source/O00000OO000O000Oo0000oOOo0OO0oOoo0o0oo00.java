package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.datasource.DataSource;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2636O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2637O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2638O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Object obj, Object obj2, int i) {
        this.f2636O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2637O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2638O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2636O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f2637O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Consumer) this.f2638O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            case 1:
                return SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f2637O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Consumer) this.f2638O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            default:
                return ((DefaultMediaSourceFactory.DelegateFactoryLoader) this.f2637O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$loadSupplier$4((DataSource.Factory) this.f2638O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }
}
