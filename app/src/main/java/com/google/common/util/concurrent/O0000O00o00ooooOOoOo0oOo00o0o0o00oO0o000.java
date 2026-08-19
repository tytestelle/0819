package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 extends AbstractOwnableSynchronizer implements Runnable {
    private final O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 task;

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 o0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
        this.task = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
    }

    @CheckForNull
    public Thread getOwner() {
        return getExclusiveOwnerThread();
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public String toString() {
        return this.task.toString();
    }
}
