package com.github.tvbox.osc.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CustomWebReceiver extends BroadcastReceiver {
    static {
        new ArrayList();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.content.movie.custom.web.Action".equals(intent.getAction()) || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("action");
        if (string.equals("parse")) {
            return;
        }
        string.equals("live");
    }
}
