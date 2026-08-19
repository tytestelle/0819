package org.fourthline.cling.support.avtransport.impl;

import O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.avtransport.AVTransportErrorCode;
import org.fourthline.cling.support.avtransport.AVTransportException;
import org.fourthline.cling.support.avtransport.AbstractAVTransportService;
import org.fourthline.cling.support.avtransport.impl.state.AbstractState;
import org.fourthline.cling.support.lastchange.LastChange;
import org.fourthline.cling.support.model.AVTransport;
import org.fourthline.cling.support.model.DeviceCapabilities;
import org.fourthline.cling.support.model.MediaInfo;
import org.fourthline.cling.support.model.PlayMode;
import org.fourthline.cling.support.model.PositionInfo;
import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.SeekMode;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportInfo;
import org.fourthline.cling.support.model.TransportSettings;

/* JADX INFO: loaded from: classes2.dex */
public class AVTransportService<T extends AVTransport> extends AbstractAVTransportService {
    private static final Logger log = Logger.getLogger(AVTransportService.class.getName());
    final Class<? extends AbstractState> initialState;
    final Class<? extends AVTransportStateMachine> stateMachineDefinition;
    private final Map<Long, AVTransportStateMachine> stateMachines;
    final Class<? extends AVTransport> transportClass;

    public AVTransportService(Class<? extends AVTransportStateMachine> cls, Class<? extends AbstractState> cls2) {
        this(cls, cls2, AVTransport.class);
    }

    public AVTransportStateMachine createStateMachine(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        Class<? extends AVTransportStateMachine> cls = this.stateMachineDefinition;
        return (AVTransportStateMachine) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Arrays.asList(((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) cls.getAnnotation(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class)).value()), this.initialState, new Class[]{this.transportClass}, new Object[]{createTransport(unsignedIntegerFourBytes, getLastChange())}));
    }

    public AVTransport createTransport(UnsignedIntegerFourBytes unsignedIntegerFourBytes, LastChange lastChange) {
        return new AVTransport(unsignedIntegerFourBytes, lastChange, StorageMedium.NETWORK);
    }

    public AVTransportStateMachine findStateMachine(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return findStateMachine(unsignedIntegerFourBytes, true);
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeDelegator
    public UnsignedIntegerFourBytes[] getCurrentInstanceIds() {
        UnsignedIntegerFourBytes[] unsignedIntegerFourBytesArr;
        synchronized (this.stateMachines) {
            try {
                unsignedIntegerFourBytesArr = new UnsignedIntegerFourBytes[this.stateMachines.size()];
                Iterator<Long> it = this.stateMachines.keySet().iterator();
                int i = 0;
                while (it.hasNext()) {
                    unsignedIntegerFourBytesArr[i] = new UnsignedIntegerFourBytes(it.next().longValue());
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unsignedIntegerFourBytesArr;
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public TransportAction[] getCurrentTransportActions(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        try {
            return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getCurrentTransportActions();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o unused) {
            return new TransportAction[0];
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public DeviceCapabilities getDeviceCapabilities(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport().getDeviceCapabilities();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public MediaInfo getMediaInfo(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport().getMediaInfo();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public PositionInfo getPositionInfo(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport().getPositionInfo();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public TransportInfo getTransportInfo(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport().getTransportInfo();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public TransportSettings getTransportSettings(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        return ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport().getTransportSettings();
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void next(UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).next();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void pause(UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).pause();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void play(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).play(str);
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void previous(UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).previous();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void record(UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).record();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void seek(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str, String str2) throws AVTransportException {
        try {
            try {
                findStateMachine(unsignedIntegerFourBytes).seek(SeekMode.valueOrExceptionOf(str), str2);
            } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
                throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            throw new AVTransportException(AVTransportErrorCode.SEEKMODE_NOT_SUPPORTED, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Unsupported seek mode: ", str));
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void setAVTransportURI(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str, String str2) throws AVTransportException {
        try {
            try {
                findStateMachine(unsignedIntegerFourBytes, true).setTransportURI(new URI(str), str2);
            } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
                throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
            }
        } catch (Exception unused) {
            throw new AVTransportException(ErrorCode.INVALID_ARGS, "CurrentURI can not be null or malformed");
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void setNextAVTransportURI(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str, String str2) throws AVTransportException {
        try {
            try {
                findStateMachine(unsignedIntegerFourBytes, true).setNextTransportURI(new URI(str), str2);
            } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
                throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
            }
        } catch (Exception unused) {
            throw new AVTransportException(ErrorCode.INVALID_ARGS, "NextURI can not be null or malformed");
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void setPlayMode(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str) throws AVTransportException {
        AVTransport transport = ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport();
        try {
            transport.setTransportSettings(new TransportSettings(PlayMode.valueOf(str), transport.getTransportSettings().getRecQualityMode()));
        } catch (IllegalArgumentException unused) {
            throw new AVTransportException(AVTransportErrorCode.PLAYMODE_NOT_SUPPORTED, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Unsupported play mode: ", str));
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void setRecordQualityMode(UnsignedIntegerFourBytes unsignedIntegerFourBytes, String str) throws AVTransportException {
        AVTransport transport = ((AbstractState) findStateMachine(unsignedIntegerFourBytes).getCurrentState()).getTransport();
        try {
            transport.setTransportSettings(new TransportSettings(transport.getTransportSettings().getPlayMode(), RecordQualityMode.valueOrExceptionOf(str)));
        } catch (IllegalArgumentException unused) {
            throw new AVTransportException(AVTransportErrorCode.RECORDQUALITYMODE_NOT_SUPPORTED, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Unsupported record quality mode: ", str));
        }
    }

    @Override // org.fourthline.cling.support.avtransport.AbstractAVTransportService
    public void stop(UnsignedIntegerFourBytes unsignedIntegerFourBytes) throws AVTransportException {
        try {
            findStateMachine(unsignedIntegerFourBytes).stop();
        } catch (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o e) {
            throw new AVTransportException(AVTransportErrorCode.TRANSITION_NOT_AVAILABLE, e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AVTransportService(Class<? extends AVTransportStateMachine> cls, Class<? extends AbstractState> cls2, Class<T> cls3) {
        this.stateMachines = new ConcurrentHashMap();
        this.stateMachineDefinition = cls;
        this.initialState = cls2;
        this.transportClass = cls3;
    }

    public AVTransportStateMachine findStateMachine(UnsignedIntegerFourBytes unsignedIntegerFourBytes, boolean z) {
        AVTransportStateMachine aVTransportStateMachineCreateStateMachine;
        synchronized (this.stateMachines) {
            try {
                Long value = unsignedIntegerFourBytes.getValue();
                long jLongValue = value.longValue();
                aVTransportStateMachineCreateStateMachine = this.stateMachines.get(value);
                if (aVTransportStateMachineCreateStateMachine == null && jLongValue == 0 && z) {
                    log.fine("Creating default transport instance with ID '0'");
                    aVTransportStateMachineCreateStateMachine = createStateMachine(unsignedIntegerFourBytes);
                    this.stateMachines.put(value, aVTransportStateMachineCreateStateMachine);
                } else if (aVTransportStateMachineCreateStateMachine == null) {
                    throw new AVTransportException(AVTransportErrorCode.INVALID_INSTANCE_ID);
                }
                log.fine("Found transport control with ID '" + jLongValue + "'");
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVTransportStateMachineCreateStateMachine;
    }
}
