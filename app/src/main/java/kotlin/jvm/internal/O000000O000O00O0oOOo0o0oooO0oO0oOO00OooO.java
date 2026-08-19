package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Serializable {
    public static final Object NO_RECEIVER = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4002O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO reflected;
    private final String signature;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        this(NO_RECEIVER);
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO compute() {
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.reflected;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOComputeReflected = computeReflected();
        this.reflected = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOComputeReflected;
        return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOComputeReflected;
    }

    public abstract O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO computeReflected();

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getOwner() {
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(cls);
        } else {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cls);
        }
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getReflected() {
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute = compute();
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute != this) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOCompute;
        }
        throw new O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        this(obj, null, null, null, false);
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
