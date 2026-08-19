package com.sun.jna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.sun.jna.internal.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface Library {
    public static final String OPTION_ALLOW_OBJECTS = "allow-objects";
    public static final String OPTION_CALLING_CONVENTION = "calling-convention";
    public static final String OPTION_CLASSLOADER = "classloader";
    public static final String OPTION_FUNCTION_MAPPER = "function-mapper";
    public static final String OPTION_INVOCATION_MAPPER = "invocation-mapper";
    public static final String OPTION_OPEN_FLAGS = "open-flags";
    public static final String OPTION_STRING_ENCODING = "string-encoding";
    public static final String OPTION_STRUCTURE_ALIGNMENT = "structure-alignment";
    public static final String OPTION_TYPE_MAPPER = "type-mapper";

    public static class Handler implements InvocationHandler {
        static final Method OBJECT_EQUALS;
        static final Method OBJECT_HASHCODE;
        static final Method OBJECT_TOSTRING;
        private final Map<Method, FunctionInfo> functions = new WeakHashMap();
        private final Class<?> interfaceClass;
        private final InvocationMapper invocationMapper;
        private final NativeLibrary nativeLibrary;
        private final Map<String, Object> options;

        static {
            try {
                OBJECT_TOSTRING = Object.class.getMethod("toString", null);
                OBJECT_HASHCODE = Object.class.getMethod("hashCode", null);
                OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
            } catch (Exception unused) {
                throw new Error("Error retrieving Object.toString() method");
            }
        }

        public Handler(String str, Class<?> cls, Map<String, ?> map) {
            if (str != null && "".equals(str.trim())) {
                throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Invalid library name \"", str, "\""));
            }
            if (!cls.isInterface()) {
                StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, " does not implement an interface: ");
                sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(cls.getName());
                throw new IllegalArgumentException(sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString());
            }
            this.interfaceClass = cls;
            HashMap map2 = new HashMap(map);
            this.options = map2;
            int i = AltCallingConvention.class.isAssignableFrom(cls) ? 63 : 0;
            if (map2.get(Library.OPTION_CALLING_CONVENTION) == null) {
                map2.put(Library.OPTION_CALLING_CONVENTION, Integer.valueOf(i));
            }
            if (map2.get(Library.OPTION_CLASSLOADER) == null) {
                map2.put(Library.OPTION_CLASSLOADER, cls.getClassLoader());
            }
            this.nativeLibrary = NativeLibrary.getInstance(str, map2);
            this.invocationMapper = (InvocationMapper) map2.get(Library.OPTION_INVOCATION_MAPPER);
        }

        public Class<?> getInterfaceClass() {
            return this.interfaceClass;
        }

        public String getLibraryName() {
            return this.nativeLibrary.getName();
        }

        public NativeLibrary getNativeLibrary() {
            return this.nativeLibrary;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Function function;
            Class<?>[] clsArr;
            HashMap map;
            if (OBJECT_TOSTRING.equals(method)) {
                return "Proxy interface to " + this.nativeLibrary;
            }
            if (OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(hashCode());
            }
            if (OBJECT_EQUALS.equals(method)) {
                Object obj2 = objArr[0];
                if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                    return Boolean.FALSE;
                }
                return Function.valueOf(Proxy.getInvocationHandler(obj2) == this);
            }
            FunctionInfo functionInfo = this.functions.get(method);
            if (functionInfo == null) {
                synchronized (this.functions) {
                    try {
                        functionInfo = this.functions.get(method);
                        if (functionInfo == null) {
                            if (ReflectionUtils.isDefault(method)) {
                                functionInfo = new FunctionInfo(ReflectionUtils.getMethodHandle(method));
                            } else {
                                boolean zIsVarArgs = Function.isVarArgs(method);
                                InvocationMapper invocationMapper = this.invocationMapper;
                                InvocationHandler invocationHandler = invocationMapper != null ? invocationMapper.getInvocationHandler(this.nativeLibrary, method) : null;
                                if (invocationHandler == null) {
                                    Function function2 = this.nativeLibrary.getFunction(method.getName(), method);
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    HashMap map2 = new HashMap(this.options);
                                    map2.put("invoking-method", method);
                                    clsArr = parameterTypes;
                                    map = map2;
                                    function = function2;
                                } else {
                                    function = null;
                                    clsArr = null;
                                    map = null;
                                }
                                functionInfo = new FunctionInfo(invocationHandler, function, clsArr, zIsVarArgs, map);
                            }
                            this.functions.put(method, functionInfo);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Object obj3 = functionInfo.methodHandle;
            if (obj3 != null) {
                return ReflectionUtils.invokeDefaultMethod(obj, obj3, objArr);
            }
            if (functionInfo.isVarArgs) {
                objArr = Function.concatenateVarArgs(objArr);
            }
            Object[] objArr2 = objArr;
            InvocationHandler invocationHandler2 = functionInfo.handler;
            return invocationHandler2 != null ? invocationHandler2.invoke(obj, method, objArr2) : functionInfo.function.invoke(method, functionInfo.parameterTypes, method.getReturnType(), objArr2, functionInfo.options);
        }

        public static final class FunctionInfo {
            final Function function;
            final InvocationHandler handler;
            final boolean isVarArgs;
            final Object methodHandle;
            final Map<String, ?> options;
            final Class<?>[] parameterTypes;

            public FunctionInfo(Object obj) {
                this.handler = null;
                this.function = null;
                this.isVarArgs = false;
                this.options = null;
                this.parameterTypes = null;
                this.methodHandle = obj;
            }

            public FunctionInfo(InvocationHandler invocationHandler, Function function, Class<?>[] clsArr, boolean z, Map<String, ?> map) {
                this.handler = invocationHandler;
                this.function = function;
                this.isVarArgs = z;
                this.options = map;
                this.parameterTypes = clsArr;
                this.methodHandle = null;
            }
        }
    }
}
