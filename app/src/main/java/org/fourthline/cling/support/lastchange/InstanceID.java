package org.fourthline.cling.support.lastchange;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes2.dex */
public class InstanceID {
    protected UnsignedIntegerFourBytes id;
    protected List<EventedValue> values;

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        this(unsignedIntegerFourBytes, new ArrayList());
    }

    public UnsignedIntegerFourBytes getId() {
        return this.id;
    }

    public List<EventedValue> getValues() {
        return this.values;
    }

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes, List<EventedValue> list) {
        new ArrayList();
        this.id = unsignedIntegerFourBytes;
        this.values = list;
    }
}
