package org.fourthline.cling.support.model;

/* JADX INFO: loaded from: classes2.dex */
public class TransportSettings {
    private PlayMode playMode;
    private RecordQualityMode recQualityMode;

    public TransportSettings() {
        this.playMode = PlayMode.NORMAL;
        this.recQualityMode = RecordQualityMode.NOT_IMPLEMENTED;
    }

    public PlayMode getPlayMode() {
        return this.playMode;
    }

    public RecordQualityMode getRecQualityMode() {
        return this.recQualityMode;
    }

    public TransportSettings(PlayMode playMode) {
        this.playMode = PlayMode.NORMAL;
        this.recQualityMode = RecordQualityMode.NOT_IMPLEMENTED;
        this.playMode = playMode;
    }

    public TransportSettings(PlayMode playMode, RecordQualityMode recordQualityMode) {
        this.playMode = PlayMode.NORMAL;
        RecordQualityMode recordQualityMode2 = RecordQualityMode.EP;
        this.playMode = playMode;
        this.recQualityMode = recordQualityMode;
    }
}
