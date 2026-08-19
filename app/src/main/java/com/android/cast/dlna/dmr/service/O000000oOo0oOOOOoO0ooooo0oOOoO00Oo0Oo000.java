package com.android.cast.dlna.dmr.service;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import com.android.cast.dlna.dmr.CastAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1 {
    final /* synthetic */ String $nextURI;
    final /* synthetic */ String $nextURIMetaData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str, String str2) {
        super(1);
        this.$nextURI = str;
        this.$nextURIMetaData = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CastAction) obj);
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final void invoke(CastAction startCastActivity) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(startCastActivity, "$this$startCastActivity");
        startCastActivity.f2787O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.$nextURI;
        startCastActivity.f2788O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.$nextURIMetaData;
    }
}
