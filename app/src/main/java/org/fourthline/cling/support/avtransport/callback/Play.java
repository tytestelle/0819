package org.fourthline.cling.support.avtransport.callback;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.logging.Logger;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Play extends ActionCallback {
    private static Logger log = Logger.getLogger(Play.class.getName());

    public Play(Service service) {
        this(new UnsignedIntegerFourBytes(0L), service, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        log.fine("Execution successful");
    }

    public Play(Service service, String str) {
        this(new UnsignedIntegerFourBytes(0L), service, str);
    }

    public Play(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Service service) {
        this(unsignedIntegerFourBytes, service, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public Play(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Service service, String str) {
        super(new ActionInvocation(service.getAction("Play")));
        getActionInvocation().setInput("InstanceID", unsignedIntegerFourBytes);
        getActionInvocation().setInput(RtspHeaders.SPEED, str);
    }
}
