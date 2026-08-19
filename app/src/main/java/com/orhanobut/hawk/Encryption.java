package com.orhanobut.hawk;

/* JADX INFO: loaded from: classes2.dex */
interface Encryption {
    String decrypt(String str, String str2);

    String encrypt(String str, String str2);

    boolean init();
}
