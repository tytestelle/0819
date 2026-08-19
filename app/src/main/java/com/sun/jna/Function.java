package com.sun.jna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Function extends Pointer {
    public static final int ALT_CONVENTION = 63;
    public static final int C_CONVENTION = 0;
    private static final int MASK_CC = 63;
    public static final int MAX_NARGS = 256;
    static final String OPTION_INVOKING_METHOD = "invoking-method";
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 384;
    final int callFlags;
    final String encoding;
    private final String functionName;
    private NativeLibrary library;
    final Map<String, ?> options;
    static final Integer INTEGER_TRUE = -1;
    static final Integer INTEGER_FALSE = 0;
    private static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

    public static class NativeMappedArray extends Memory implements PostCallRead {
        private final NativeMapped[] original;

        public NativeMappedArray(NativeMapped[] nativeMappedArr) {
            super(Native.getNativeSize(nativeMappedArr.getClass(), nativeMappedArr));
            this.original = nativeMappedArr;
            setValue(0L, nativeMappedArr, nativeMappedArr.getClass());
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            getValue(0L, this.original.getClass(), this.original);
        }
    }

    public static class PointerArray extends Memory implements PostCallRead {
        private final Pointer[] original;

        public PointerArray(Pointer[] pointerArr) {
            super((pointerArr.length + 1) * Native.POINTER_SIZE);
            this.original = pointerArr;
            for (int i = 0; i < pointerArr.length; i++) {
                setPointer(Native.POINTER_SIZE * i, pointerArr[i]);
            }
            setPointer(Native.POINTER_SIZE * pointerArr.length, null);
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            Pointer[] pointerArr = this.original;
            read(0L, pointerArr, 0, pointerArr.length);
        }
    }

    public interface PostCallRead {
        void read();
    }

    public Function(NativeLibrary nativeLibrary, String str, int i, String str2) {
        checkCallingConvention(i & 63);
        if (str == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.library = nativeLibrary;
        this.functionName = str;
        this.callFlags = i;
        this.options = nativeLibrary.options;
        this.encoding = str2 == null ? Native.getDefaultStringEncoding() : str2;
        try {
            this.peer = nativeLibrary.getSymbolAddress(str);
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Error looking up function '", str, "': ");
            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(e.getMessage());
            throw new UnsatisfiedLinkError(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
        }
    }

    private void checkCallingConvention(int i) {
        if ((i & 63) != i) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Unrecognized calling convention: "));
        }
    }

    public static Object[] concatenateVarArgs(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return objArr;
        }
        Object obj = objArr[objArr.length - 1];
        Class<?> cls = obj != null ? obj.getClass() : null;
        if (cls == null || !cls.isArray()) {
            return objArr;
        }
        Object[] objArr2 = (Object[]) obj;
        for (int i = 0; i < objArr2.length; i++) {
            Object obj2 = objArr2[i];
            if (obj2 instanceof Float) {
                objArr2[i] = Double.valueOf(((Float) obj2).floatValue());
            }
        }
        int length = objArr.length + objArr2.length;
        Object[] objArr3 = new Object[length];
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length - 1);
        System.arraycopy(objArr2, 0, objArr3, objArr.length - 1, objArr2.length);
        objArr3[length - 1] = null;
        return objArr3;
    }

    private Object convertArgument(Object[] objArr, int i, Method method, TypeMapper typeMapper, boolean z, Class<?> cls) {
        Object obj = objArr[i];
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            ToNativeConverter nativeMappedConverter = NativeMapped.class.isAssignableFrom(cls2) ? NativeMappedConverter.getInstance(cls2) : typeMapper != null ? typeMapper.getToNativeConverter(cls2) : null;
            if (nativeMappedConverter != null) {
                obj = nativeMappedConverter.toNative(obj, method != null ? new MethodParameterContext(this, objArr, i, method) : new FunctionParameterContext(this, objArr, i));
            }
        }
        if (obj == null || isPrimitiveArray(obj.getClass())) {
            return obj;
        }
        Class<?> cls3 = obj.getClass();
        if (obj instanceof Structure) {
            Structure structure = (Structure) obj;
            structure.autoWrite();
            if (structure instanceof Structure.ByValue) {
                Class<?> cls4 = structure.getClass();
                if (method != null) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (!IS_VARARGS.isVarArgs(method) || i < parameterTypes.length - 1) {
                        cls4 = parameterTypes[i];
                    } else {
                        Class<?> componentType = parameterTypes[parameterTypes.length - 1].getComponentType();
                        if (componentType != Object.class) {
                            cls4 = componentType;
                        }
                    }
                }
                if (Structure.ByValue.class.isAssignableFrom(cls4)) {
                    return structure;
                }
            }
            return structure.getPointer();
        }
        if (obj instanceof Callback) {
            return CallbackReference.getFunctionPointer((Callback) obj);
        }
        if (obj instanceof String) {
            return new NativeString((String) obj, false).getPointer();
        }
        if (obj instanceof WString) {
            return new NativeString(obj.toString(), true).getPointer();
        }
        if (obj instanceof Boolean) {
            return Boolean.TRUE.equals(obj) ? INTEGER_TRUE : INTEGER_FALSE;
        }
        if (String[].class == cls3) {
            return new StringArray((String[]) obj, this.encoding);
        }
        if (WString[].class == cls3) {
            return new StringArray((WString[]) obj);
        }
        if (Pointer[].class == cls3) {
            return new PointerArray((Pointer[]) obj);
        }
        if (NativeMapped[].class.isAssignableFrom(cls3)) {
            return new NativeMappedArray((NativeMapped[]) obj);
        }
        if (!Structure[].class.isAssignableFrom(cls3)) {
            if (cls3.isArray()) {
                throw new IllegalArgumentException("Unsupported array argument type: " + cls3.getComponentType());
            }
            if (z || Native.isSupportedNativeType(obj.getClass())) {
                return obj;
            }
            throw new IllegalArgumentException("Unsupported argument type " + obj.getClass().getName() + " at parameter " + i + " of function " + getName());
        }
        Structure[] structureArr = (Structure[]) obj;
        Class<?> componentType2 = cls3.getComponentType();
        boolean zIsAssignableFrom = Structure.ByReference.class.isAssignableFrom(componentType2);
        if (cls != null && !Structure.ByReference[].class.isAssignableFrom(cls)) {
            if (zIsAssignableFrom) {
                throw new IllegalArgumentException("Function " + getName() + " declared Structure[] at parameter " + i + " but array of " + componentType2 + " was passed");
            }
            for (int i2 = 0; i2 < structureArr.length; i2++) {
                if (structureArr[i2] instanceof Structure.ByReference) {
                    StringBuilder sb = new StringBuilder("Function ");
                    sb.append(getName());
                    sb.append(" declared Structure[] at parameter ");
                    sb.append(i);
                    sb.append(" but element ");
                    throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, " is of Structure.ByReference type", i2));
                }
            }
        }
        if (zIsAssignableFrom) {
            Structure.autoWrite(structureArr);
            Pointer[] pointerArr = new Pointer[structureArr.length + 1];
            for (int i3 = 0; i3 < structureArr.length; i3++) {
                Structure structure2 = structureArr[i3];
                pointerArr[i3] = structure2 != null ? structure2.getPointer() : null;
            }
            return new PointerArray(pointerArr);
        }
        if (structureArr.length == 0) {
            throw new IllegalArgumentException("Structure array must have non-zero length");
        }
        if (structureArr[0] == null) {
            Structure.newInstance(componentType2).toArray(structureArr);
            return structureArr[0].getPointer();
        }
        Structure.autoWrite(structureArr);
        return structureArr[0].getPointer();
    }

    public static int fixedArgs(Method method) {
        return IS_VARARGS.fixedArgs(method);
    }

    public static Function getFunction(String str, String str2) {
        return NativeLibrary.getInstance(str).getFunction(str2);
    }

    private Pointer invokePointer(int i, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.peer, i, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    private String invokeString(int i, Object[] objArr, boolean z) {
        Pointer pointerInvokePointer = invokePointer(i, objArr);
        if (pointerInvokePointer != null) {
            return z ? pointerInvokePointer.getWideString(0L) : pointerInvokePointer.getString(0L, this.encoding);
        }
        return null;
    }

    private boolean isPrimitiveArray(Class<?> cls) {
        return cls.isArray() && cls.getComponentType().isPrimitive();
    }

    public static boolean isVarArgs(Method method) {
        return IS_VARARGS.isVarArgs(method);
    }

    public static Boolean valueOf(boolean z) {
        return z ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Function function = (Function) obj;
        return function.callFlags == this.callFlags && function.options.equals(this.options) && function.peer == this.peer;
    }

    public int getCallingConvention() {
        return this.callFlags & 63;
    }

    public String getName() {
        return this.functionName;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.options.hashCode() + this.callFlags + super.hashCode();
    }

    public Object invoke(Class<?> cls, Object[] objArr) {
        return invoke(cls, objArr, this.options);
    }

    public double invokeDouble(Object[] objArr) {
        return ((Double) invoke(Double.class, objArr)).doubleValue();
    }

    public float invokeFloat(Object[] objArr) {
        return ((Float) invoke(Float.class, objArr)).floatValue();
    }

    public int invokeInt(Object[] objArr) {
        return ((Integer) invoke(Integer.class, objArr)).intValue();
    }

    public long invokeLong(Object[] objArr) {
        return ((Long) invoke(Long.class, objArr)).longValue();
    }

    public Object invokeObject(Object[] objArr) {
        return invoke(Object.class, objArr);
    }

    public void invokeVoid(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        if (this.library == null) {
            return "native function@0x" + Long.toHexString(this.peer);
        }
        return "native function " + this.functionName + "(" + this.library.getName() + ")@0x" + Long.toHexString(this.peer);
    }

    public static Function getFunction(String str, String str2, int i) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, null);
    }

    public Object invoke(Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Method method = (Method) map.get(OPTION_INVOKING_METHOD);
        return invoke(method, method != null ? method.getParameterTypes() : null, cls, objArr, map);
    }

    public static Function getFunction(String str, String str2, int i, String str3) {
        return NativeLibrary.getInstance(str).getFunction(str2, i, str3);
    }

    public Pointer invokePointer(Object[] objArr) {
        return (Pointer) invoke(Pointer.class, objArr);
    }

    public static Function getFunction(Pointer pointer) {
        return getFunction(pointer, 0, (String) null);
    }

    public String invokeString(Object[] objArr, boolean z) {
        Object objInvoke = invoke(z ? WString.class : String.class, objArr);
        if (objInvoke != null) {
            return objInvoke.toString();
        }
        return null;
    }

    public static Function getFunction(Pointer pointer, int i) {
        return getFunction(pointer, i, (String) null);
    }

    public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Object[] objArr2;
        FromNativeConverter fromNativeConverter;
        Class<?> clsNativeType;
        FromNativeConverter fromNativeConverter2;
        FromNativeConverter fromNativeConverter3;
        FromNativeContext functionResultContext;
        Class<?> componentType;
        Object[] objArr3 = new Object[0];
        if (objArr == null) {
            objArr2 = objArr3;
        } else if (objArr.length <= 256) {
            int length = objArr.length;
            Object[] objArr4 = new Object[length];
            System.arraycopy(objArr, 0, objArr4, 0, length);
            objArr2 = objArr4;
        } else {
            throw new UnsupportedOperationException("Maximum argument count is 256");
        }
        TypeMapper typeMapper = (TypeMapper) map.get(Library.OPTION_TYPE_MAPPER);
        boolean zEquals = Boolean.TRUE.equals(map.get(Library.OPTION_ALLOW_OBJECTS));
        boolean zIsVarArgs = (objArr2.length <= 0 || method == null) ? false : isVarArgs(method);
        int iFixedArgs = (objArr2.length <= 0 || method == null) ? 0 : fixedArgs(method);
        int i = 0;
        while (true) {
            fromNativeConverter = null;
            if (i >= objArr2.length) {
                break;
            }
            if (method != null) {
                componentType = (!zIsVarArgs || i < clsArr.length + (-1)) ? clsArr[i] : clsArr[clsArr.length - 1].getComponentType();
            } else {
                componentType = null;
            }
            int i2 = i;
            objArr2[i2] = convertArgument(objArr2, i, method, typeMapper, zEquals, componentType);
            i = i2 + 1;
            iFixedArgs = iFixedArgs;
        }
        int i3 = iFixedArgs;
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            clsNativeType = nativeMappedConverter.nativeType();
            fromNativeConverter3 = nativeMappedConverter;
        } else if (typeMapper == null || (fromNativeConverter2 = typeMapper.getFromNativeConverter(cls)) == null) {
            fromNativeConverter = fromNativeConverter2;
            clsNativeType = cls;
            fromNativeConverter3 = fromNativeConverter;
        } else {
            fromNativeConverter = fromNativeConverter2;
            clsNativeType = fromNativeConverter2.nativeType();
            fromNativeConverter3 = fromNativeConverter2;
        }
        Object objInvoke = invoke(objArr2, clsNativeType, zEquals, i3);
        if (fromNativeConverter3 != null) {
            if (method != null) {
                functionResultContext = new MethodResultContext(cls, this, objArr, method);
            } else {
                functionResultContext = new FunctionResultContext(cls, this, objArr);
            }
            objInvoke = fromNativeConverter3.fromNative(objInvoke, functionResultContext);
        }
        if (objArr != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    if (obj instanceof Structure) {
                        if (!(obj instanceof Structure.ByValue)) {
                            ((Structure) obj).autoRead();
                        }
                    } else {
                        Object obj2 = objArr2[i4];
                        if (obj2 instanceof PostCallRead) {
                            ((PostCallRead) obj2).read();
                            Object obj3 = objArr2[i4];
                            if (obj3 instanceof PointerArray) {
                                PointerArray pointerArray = (PointerArray) obj3;
                                if (Structure.ByReference[].class.isAssignableFrom(obj.getClass())) {
                                    Class<?> componentType2 = obj.getClass().getComponentType();
                                    Structure[] structureArr = (Structure[]) obj;
                                    for (int i5 = 0; i5 < structureArr.length; i5++) {
                                        structureArr[i5] = Structure.updateStructureByReference(componentType2, structureArr[i5], pointerArray.getPointer(Native.POINTER_SIZE * i5));
                                    }
                                }
                            }
                        } else if (Structure[].class.isAssignableFrom(obj.getClass())) {
                            Structure.autoRead((Structure[]) obj);
                        }
                    }
                }
            }
        }
        return objInvoke;
    }

    public static Function getFunction(Pointer pointer, int i, String str) {
        return new Function(pointer, i, str);
    }

    public Function(Pointer pointer, int i, String str) {
        checkCallingConvention(i & 63);
        if (pointer != null && pointer.peer != 0) {
            this.functionName = pointer.toString();
            this.callFlags = i;
            this.peer = pointer.peer;
            this.options = Collections.EMPTY_MAP;
            this.encoding = str == null ? Native.getDefaultStringEncoding() : str;
            return;
        }
        throw new NullPointerException("Function address may not be null");
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z) {
        return invoke(objArr, cls, z, 0);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
        int i2 = this.callFlags | ((i & 3) << 7);
        if (cls != null && cls != Void.TYPE && cls != Void.class) {
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return valueOf(Native.invokeInt(this, this.peer, i2, objArr) != 0);
            }
            if (cls != Byte.TYPE && cls != Byte.class) {
                if (cls != Short.TYPE && cls != Short.class) {
                    if (cls != Character.TYPE && cls != Character.class) {
                        if (cls != Integer.TYPE && cls != Integer.class) {
                            if (cls != Long.TYPE && cls != Long.class) {
                                if (cls != Float.TYPE && cls != Float.class) {
                                    if (cls != Double.TYPE && cls != Double.class) {
                                        if (cls == String.class) {
                                            return invokeString(i2, objArr, false);
                                        }
                                        if (cls == WString.class) {
                                            String strInvokeString = invokeString(i2, objArr, true);
                                            if (strInvokeString != null) {
                                                return new WString(strInvokeString);
                                            }
                                            return null;
                                        }
                                        if (Pointer.class.isAssignableFrom(cls)) {
                                            return invokePointer(i2, objArr);
                                        }
                                        if (Structure.class.isAssignableFrom(cls)) {
                                            if (Structure.ByValue.class.isAssignableFrom(cls)) {
                                                Structure structureInvokeStructure = Native.invokeStructure(this, this.peer, i2, objArr, Structure.newInstance(cls));
                                                structureInvokeStructure.autoRead();
                                                return structureInvokeStructure;
                                            }
                                            Pointer pointerInvokePointer = invokePointer(i2, objArr);
                                            if (pointerInvokePointer == null) {
                                                return pointerInvokePointer;
                                            }
                                            Structure structureNewInstance = Structure.newInstance((Class<Structure>) cls, pointerInvokePointer);
                                            structureNewInstance.conditionalAutoRead();
                                            return structureNewInstance;
                                        }
                                        if (Callback.class.isAssignableFrom(cls)) {
                                            Pointer pointerInvokePointer2 = invokePointer(i2, objArr);
                                            return pointerInvokePointer2 != null ? CallbackReference.getCallback(cls, pointerInvokePointer2) : pointerInvokePointer2;
                                        }
                                        if (cls == String[].class) {
                                            Pointer pointerInvokePointer3 = invokePointer(i2, objArr);
                                            if (pointerInvokePointer3 != null) {
                                                return pointerInvokePointer3.getStringArray(0L, this.encoding);
                                            }
                                            return null;
                                        }
                                        if (cls == WString[].class) {
                                            Pointer pointerInvokePointer4 = invokePointer(i2, objArr);
                                            if (pointerInvokePointer4 == null) {
                                                return null;
                                            }
                                            String[] wideStringArray = pointerInvokePointer4.getWideStringArray(0L);
                                            WString[] wStringArr = new WString[wideStringArray.length];
                                            for (int i3 = 0; i3 < wideStringArray.length; i3++) {
                                                wStringArr[i3] = new WString(wideStringArray[i3]);
                                            }
                                            return wStringArr;
                                        }
                                        if (cls == Pointer[].class) {
                                            Pointer pointerInvokePointer5 = invokePointer(i2, objArr);
                                            if (pointerInvokePointer5 != null) {
                                                return pointerInvokePointer5.getPointerArray(0L);
                                            }
                                            return null;
                                        }
                                        if (z) {
                                            Object objInvokeObject = Native.invokeObject(this, this.peer, i2, objArr);
                                            if (objInvokeObject == null || cls.isAssignableFrom(objInvokeObject.getClass())) {
                                                return objInvokeObject;
                                            }
                                            throw new ClassCastException("Return type " + cls + " does not match result " + objInvokeObject.getClass());
                                        }
                                        throw new IllegalArgumentException("Unsupported return type " + cls + " in function " + getName());
                                    }
                                    return Double.valueOf(Native.invokeDouble(this, this.peer, i2, objArr));
                                }
                                return Float.valueOf(Native.invokeFloat(this, this.peer, i2, objArr));
                            }
                            return Long.valueOf(Native.invokeLong(this, this.peer, i2, objArr));
                        }
                        return Integer.valueOf(Native.invokeInt(this, this.peer, i2, objArr));
                    }
                    return Character.valueOf((char) Native.invokeInt(this, this.peer, i2, objArr));
                }
                return Short.valueOf((short) Native.invokeInt(this, this.peer, i2, objArr));
            }
            return Byte.valueOf((byte) Native.invokeInt(this, this.peer, i2, objArr));
        }
        Native.invokeVoid(this, this.peer, i2, objArr);
        return null;
    }

    public void invoke(Object[] objArr) {
        invoke(Void.class, objArr);
    }
}
