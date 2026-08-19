package com.android.cast.dlna.dmr.service;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import com.android.cast.dlna.dmr.CastAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1 {
    final /* synthetic */ String $currentURI;
    final /* synthetic */ String $currentURIMetaData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(String str, String str2) {
        super(1);
        this.$currentURI = str;
        this.$currentURIMetaData = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CastAction) obj);
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final void invoke(CastAction startCastActivity) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(startCastActivity, "$this$startCastActivity");
        startCastActivity.f2785O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.$currentURI;
        startCastActivity.f2786O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.$currentURIMetaData;
    }
}
