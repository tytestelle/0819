package org.fourthline.cling.binding.annotations;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.binding.LocalServiceBinder;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.action.ActionExecutor;
import org.fourthline.cling.model.action.QueryStateVariableExecutor;
import org.fourthline.cling.model.meta.Action;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.QueryStateVariableAction;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.FieldStateVariableAccessor;
import org.fourthline.cling.model.state.GetterStateVariableAccessor;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDAServiceId;
import org.fourthline.cling.model.types.UDAServiceType;
import org.fourthline.cling.model.types.csv.CSV;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationLocalServiceBinder implements LocalServiceBinder {
    private static Logger log = Logger.getLogger(AnnotationLocalServiceBinder.class.getName());

    public static String toJavaActionName(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Variable name must be at least 1 character long");
        }
        return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
    }

    public static String toJavaStateVariableName(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Variable name must be at least 1 character long");
        }
        return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
    }

    public static String toUpnpActionName(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Action name must be at least 1 character long");
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

    public static String toUpnpStateVariableName(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Variable name must be at least 1 character long");
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

    public boolean isActionExcluded(Action action) {
        return false;
    }

    @Override // org.fourthline.cling.binding.LocalServiceBinder
    public LocalService read(Class<?> cls) {
        log.fine("Reading and binding annotations of service implementation class: " + cls);
        if (!cls.isAnnotationPresent(UpnpService.class)) {
            throw new LocalServiceBindingException("Given class is not an @UpnpService");
        }
        UpnpService upnpService = (UpnpService) cls.getAnnotation(UpnpService.class);
        UpnpServiceId upnpServiceIdServiceId = upnpService.serviceId();
        UpnpServiceType upnpServiceTypeServiceType = upnpService.serviceType();
        return read(cls, upnpServiceIdServiceId.namespace().equals(UDAServiceId.DEFAULT_NAMESPACE) ? new UDAServiceId(upnpServiceIdServiceId.value()) : new ServiceId(upnpServiceIdServiceId.namespace(), upnpServiceIdServiceId.value()), upnpServiceTypeServiceType.namespace().equals("schemas-upnp-org") ? new UDAServiceType(upnpServiceTypeServiceType.value(), upnpServiceTypeServiceType.version()) : new ServiceType(upnpServiceTypeServiceType.namespace(), upnpServiceTypeServiceType.value(), upnpServiceTypeServiceType.version()), upnpService.supportsQueryStateVariables(), readStringConvertibleTypes(upnpService.stringConvertibleTypes()));
    }

    public Map<Action, ActionExecutor> readActions(Class<?> cls, Map<StateVariable, StateVariableAccessor> map, Set<Class> set) {
        HashMap map2 = new HashMap();
        Iterator it = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(cls, UpnpAction.class).iterator();
        while (it.hasNext()) {
            Action actionAppendAction = new AnnotationActionBinder((Method) it.next(), map, set).appendAction(map2);
            if (isActionExcluded(actionAppendAction)) {
                map2.remove(actionAppendAction);
            }
        }
        return map2;
    }

    public Map<StateVariable, StateVariableAccessor> readStateVariables(Class<?> cls, Set<Class> set) {
        StateVariableAccessor getterStateVariableAccessor;
        Field declaredField;
        HashMap map = new HashMap();
        if (cls.isAnnotationPresent(UpnpStateVariables.class)) {
            UpnpStateVariables upnpStateVariables = (UpnpStateVariables) cls.getAnnotation(UpnpStateVariables.class);
            for (UpnpStateVariable upnpStateVariable : upnpStateVariables.value()) {
                if (upnpStateVariable.name().length() == 0) {
                    throw new LocalServiceBindingException("Class-level @UpnpStateVariable name attribute value required");
                }
                String javaStateVariableName = toJavaStateVariableName(upnpStateVariable.name());
                Method methodO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(cls, javaStateVariableName);
                Class<?> superclass = cls;
                while (true) {
                    getterStateVariableAccessor = null;
                    if (superclass == null || superclass == Object.class) {
                        declaredField = null;
                        break;
                    }
                    try {
                        declaredField = superclass.getDeclaredField(javaStateVariableName);
                        break;
                    } catch (NoSuchFieldException unused) {
                        superclass = superclass.getSuperclass();
                    }
                }
                if (methodO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null && declaredField != null) {
                    getterStateVariableAccessor = upnpStateVariables.preferFields() ? new FieldStateVariableAccessor(declaredField) : new GetterStateVariableAccessor(methodO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                } else if (declaredField != null) {
                    getterStateVariableAccessor = new FieldStateVariableAccessor(declaredField);
                } else if (methodO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 != null) {
                    getterStateVariableAccessor = new GetterStateVariableAccessor(methodO00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
                } else {
                    log.finer("No field or getter found for state variable, skipping accessor: " + upnpStateVariable.name());
                }
                map.put(new AnnotationStateVariableBinder(upnpStateVariable, upnpStateVariable.name(), getterStateVariableAccessor, set).createStateVariable(), getterStateVariableAccessor);
            }
        }
        ArrayList<Field> arrayList = new ArrayList();
        for (Class<?> superclass2 = cls; superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
            for (Field field : superclass2.getDeclaredFields()) {
                if (field.isAnnotationPresent(UpnpStateVariable.class)) {
                    arrayList.add(field);
                }
            }
        }
        for (Field field2 : arrayList) {
            UpnpStateVariable upnpStateVariable2 = (UpnpStateVariable) field2.getAnnotation(UpnpStateVariable.class);
            FieldStateVariableAccessor fieldStateVariableAccessor = new FieldStateVariableAccessor(field2);
            map.put(new AnnotationStateVariableBinder(upnpStateVariable2, upnpStateVariable2.name().length() == 0 ? toUpnpStateVariableName(field2.getName()) : upnpStateVariable2.name(), fieldStateVariableAccessor, set).createStateVariable(), fieldStateVariableAccessor);
        }
        for (Method method : O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(cls, UpnpStateVariable.class)) {
            String strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(method.getName());
            if (strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O == null) {
                throw new LocalServiceBindingException("Annotated method is not a getter method (: " + method);
            }
            if (method.getParameterTypes().length > 0) {
                throw new LocalServiceBindingException("Getter method defined as @UpnpStateVariable can not have parameters: " + method);
            }
            UpnpStateVariable upnpStateVariable3 = (UpnpStateVariable) method.getAnnotation(UpnpStateVariable.class);
            GetterStateVariableAccessor getterStateVariableAccessor2 = new GetterStateVariableAccessor(method);
            map.put(new AnnotationStateVariableBinder(upnpStateVariable3, upnpStateVariable3.name().length() == 0 ? toUpnpStateVariableName(strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) : upnpStateVariable3.name(), getterStateVariableAccessor2, set).createStateVariable(), getterStateVariableAccessor2);
        }
        return map;
    }

    public Set<Class> readStringConvertibleTypes(Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                throw new LocalServiceBindingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Declared string-convertible type must be public: "));
            }
            try {
                cls.getConstructor(String.class);
            } catch (NoSuchMethodException unused) {
                throw new LocalServiceBindingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Declared string-convertible type needs a public single-argument String constructor: "));
            }
        }
        HashSet hashSet = new HashSet(Arrays.asList(clsArr));
        hashSet.add(URI.class);
        hashSet.add(URL.class);
        hashSet.add(CSV.class);
        return hashSet;
    }

    @Override // org.fourthline.cling.binding.LocalServiceBinder
    public LocalService read(Class<?> cls, ServiceId serviceId, ServiceType serviceType, boolean z, Class[] clsArr) {
        return read(cls, serviceId, serviceType, z, new HashSet(Arrays.asList(clsArr)));
    }

    public LocalService read(Class<?> cls, ServiceId serviceId, ServiceType serviceType, boolean z, Set<Class> set) {
        Map<StateVariable, StateVariableAccessor> stateVariables = readStateVariables(cls, set);
        Map<Action, ActionExecutor> actions = readActions(cls, stateVariables, set);
        if (z) {
            actions.put(new QueryStateVariableAction(), new QueryStateVariableExecutor());
        }
        try {
            return new LocalService(serviceType, serviceId, actions, stateVariables, set, z);
        } catch (ValidationException e) {
            log.severe("Could not validate device model: " + e.toString());
            Iterator<ValidationError> it = e.getErrors().iterator();
            while (it.hasNext()) {
                log.severe(it.next().toString());
            }
            throw new LocalServiceBindingException("Validation of model failed, check the log");
        }
    }
}
