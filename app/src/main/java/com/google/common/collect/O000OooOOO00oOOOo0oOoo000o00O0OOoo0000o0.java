package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000OooOOO00oOOOo0oOoo000o00O0OOoo0000o0 extends O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo implements Serializable {
    private static final long serialVersionUID = 3;
    final int concurrencyLevel;
    transient ConcurrentMap<Object, Object> delegate;
    final com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO keyEquivalence;
    final O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO keyStrength;
    final com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO valueEquivalence;
    final O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO valueStrength;

    public O000OooOOO00oOOOo0oOoo000o00O0OOoo0000o0(O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO, O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2, com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2, int i, ConcurrentMap<Object, Object> concurrentMap) {
        this.keyStrength = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO;
        this.valueStrength = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2;
        this.keyEquivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.valueEquivalence = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2;
        this.concurrencyLevel = i;
        this.delegate = concurrentMap;
    }

    public void readEntries(ObjectInputStream objectInputStream) {
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            }
            this.delegate.put(object, objectInputStream.readObject());
        }
    }

    public O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo readMapMaker(ObjectInputStream objectInputStream) {
        int i = objectInputStream.readInt();
        O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo = new O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i >= 0);
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO = this.keyStrength;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Key strength was already set to %s", o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 == null, o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2);
        o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.getClass();
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO3 = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.STRONG;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO != o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO3) {
            o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        }
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO4 = this.valueStrength;
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO5 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Value strength was already set to %s", o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO5 == null, o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO5);
        o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO4.getClass();
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO4;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO4 != o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO3) {
            o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        }
        com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.keyEquivalence;
        com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("key equivalence was already set to %s", o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2 == null, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO2);
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
        int i2 = this.concurrencyLevel;
        int i3 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (!(i3 == -1)) {
            throw new IllegalStateException(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("concurrency level was already set to %s", Integer.valueOf(i3)));
        }
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2 > 0);
        o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        return o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo;
    }

    public void writeMapTo(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.delegate.size());
        for (Map.Entry<Object, Object> entry : this.delegate.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public ConcurrentMap<Object, Object> delegate() {
        return this.delegate;
    }
}
