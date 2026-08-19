package com.lzy.okgo.request.base;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends ForwardingSink {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3773O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f3774O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, BufferedSink bufferedSink) {
        super(bufferedSink);
        this.f3774O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        this.f3773O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.contentLength();
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer buffer, long j) {
        super.write(buffer, j);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.changeProgress(this.f3773O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, j, new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 9));
    }
}
