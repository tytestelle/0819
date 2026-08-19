package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoooooOoOOooOoo0ooOooOOooooOoO0O0OO0 extends O000OooOOO00oOOOo0oOoo000o00O0OOoo0000o0 {
    private static final long serialVersionUID = 3;

    public O000OoooooOoOOooOoo0ooOooOOooooOoO0O0OO0(O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO, O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2, com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2, int i, ConcurrentMap<Object, Object> concurrentMap) {
        super(o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO, o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ConcurrentMap<Object, Object> concurrentMapCreate;
        objectInputStream.defaultReadObject();
        O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo mapMaker = readMapMaker(objectInputStream);
        if (mapMaker.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            concurrentMapCreate = O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.create(mapMaker);
        } else {
            int i = mapMaker.f3574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (i == -1) {
                i = 16;
            }
            int i2 = mapMaker.f3575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (i2 == -1) {
                i2 = 4;
            }
            concurrentMapCreate = new ConcurrentHashMap<>(i, 0.75f, i2);
        }
        this.delegate = concurrentMapCreate;
        readEntries(objectInputStream);
    }

    private Object readResolve() {
        return this.delegate;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        writeMapTo(objectOutputStream);
    }
}
