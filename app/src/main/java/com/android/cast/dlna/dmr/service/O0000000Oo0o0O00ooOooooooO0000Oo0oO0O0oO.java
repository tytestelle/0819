package com.android.cast.dlna.dmr.service;

import org.fourthline.cling.support.model.TransportState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int[] f2794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        int[] iArr = new int[TransportState.values().length];
        try {
            iArr[TransportState.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportState.PAUSED_PLAYBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2794O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iArr;
    }
}
