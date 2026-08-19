package com.bumptech.glide.load;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    private final boolean hasAlpha;

    ImageHeaderParser$ImageType(boolean z) {
        this.hasAlpha = z;
    }

    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    public boolean isWebp() {
        int i = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f183O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
