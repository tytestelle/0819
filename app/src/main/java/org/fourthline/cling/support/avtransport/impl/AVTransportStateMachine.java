package org.fourthline.cling.support.avtransport.impl;

import java.net.URI;
import org.fourthline.cling.support.model.SeekMode;

/* JADX INFO: loaded from: classes2.dex */
public interface AVTransportStateMachine {
    /* synthetic */ void forceState(Class cls);

    Object getCurrentState();

    void next();

    void pause();

    void play(String str);

    void previous();

    void record();

    void seek(SeekMode seekMode, String str);

    void setNextTransportURI(URI uri, String str);

    void setTransportURI(URI uri, String str);

    void stop();
}
