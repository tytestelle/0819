package org.fourthline.cling.binding.annotations;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.Constants;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.action.ActionExecutor;
import org.fourthline.cling.model.action.MethodActionExecutor;
import org.fourthline.cling.model.meta.Action;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.state.GetterStateVariableAccessor;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationActionBinder {
    private static Logger log = Logger.getLogger(AnnotationLocalServiceBinder.class.getName());
    protected UpnpAction annotation;
    protected Method method;
    protected Map<StateVariable, StateVariableAccessor> stateVariables;
    protected Set<Class> stringConvertibleTypes;

    public AnnotationActionBinder(Method method, Map<StateVariable, StateVariableAccessor> map, Set<Class> set) {
        this.annotation = (UpnpAction) method.getAnnotation(UpnpAction.class);
        this.stateVariables = map;
        this.method = method;
        this.stringConvertibleTypes = set;
    }

    public Action appendAction(Map<Action, ActionExecutor> map) {
        String strName = getAnnotation().name().length() != 0 ? getAnnotation().name() : AnnotationLocalServiceBinder.toUpnpActionName(getMethod().getName());
        log.fine("Creating action and executor: " + strName);
        List<ActionArgument> listCreateInputArguments = createInputArguments();
        Map<ActionArgument<LocalService>, StateVariableAccessor> mapCreateOutputArguments = createOutputArguments();
        listCreateInputArguments.addAll(mapCreateOutputArguments.keySet());
        Action action = new Action(strName, (ActionArgument[]) listCreateInputArguments.toArray(new ActionArgument[listCreateInputArguments.size()]));
        map.put(action, createExecutor(mapCreateOutputArguments));
        return action;
    }

    public ActionExecutor createExecutor(Map<ActionArgument<LocalService>, StateVariableAccessor> map) {
        return new MethodActionExecutor(map, getMethod());
    }

    public List<ActionArgument> createInputArguments() {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = getMethod().getParameterAnnotations();
        int i = 0;
        for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
            for (Annotation annotation : parameterAnnotations[i2]) {
                if (annotation instanceof UpnpInputArgument) {
                    UpnpInputArgument upnpInputArgument = (UpnpInputArgument) annotation;
                    i++;
                    String strName = upnpInputArgument.name();
                    StateVariable stateVariableFindRelatedStateVariable = findRelatedStateVariable(upnpInputArgument.stateVariable(), strName, getMethod().getName());
                    if (stateVariableFindRelatedStateVariable == null) {
                        throw new LocalServiceBindingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Could not detected related state variable of argument: ", strName));
                    }
                    validateType(stateVariableFindRelatedStateVariable, getMethod().getParameterTypes()[i2]);
                    arrayList.add(new ActionArgument(strName, upnpInputArgument.aliases(), stateVariableFindRelatedStateVariable.getName(), ActionArgument.Direction.IN));
                }
            }
        }
        if (i >= getMethod().getParameterTypes().length || RemoteClientInfo.class.isAssignableFrom(this.method.getParameterTypes()[this.method.getParameterTypes().length - 1])) {
            return arrayList;
        }
        throw new LocalServiceBindingException("Method has parameters that are not input arguments: " + getMethod().getName());
    }

    public Map<ActionArgument<LocalService>, StateVariableAccessor> createOutputArguments() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpnpAction upnpAction = (UpnpAction) getMethod().getAnnotation(UpnpAction.class);
        if (upnpAction.out().length == 0) {
            return linkedHashMap;
        }
        boolean z = upnpAction.out().length > 1;
        for (UpnpOutputArgument upnpOutputArgument : upnpAction.out()) {
            String strName = upnpOutputArgument.name();
            StateVariable stateVariableFindRelatedStateVariable = findRelatedStateVariable(upnpOutputArgument.stateVariable(), strName, getMethod().getName());
            if (stateVariableFindRelatedStateVariable == null && upnpOutputArgument.getterName().length() > 0) {
                stateVariableFindRelatedStateVariable = findRelatedStateVariable(null, null, upnpOutputArgument.getterName());
            }
            if (stateVariableFindRelatedStateVariable == null) {
                throw new LocalServiceBindingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Related state variable not found for output argument: ", strName));
            }
            StateVariableAccessor stateVariableAccessorFindOutputArgumentAccessor = findOutputArgumentAccessor(stateVariableFindRelatedStateVariable, upnpOutputArgument.getterName(), z);
            log.finer("Found related state variable for output argument '" + strName + "': " + stateVariableFindRelatedStateVariable);
            linkedHashMap.put(new ActionArgument(strName, stateVariableFindRelatedStateVariable.getName(), ActionArgument.Direction.OUT, z ^ true), stateVariableAccessorFindOutputArgumentAccessor);
        }
        return linkedHashMap;
    }

    public StateVariableAccessor findOutputArgumentAccessor(StateVariable stateVariable, String str, boolean z) {
        if (getMethod().getReturnType().equals(Void.TYPE)) {
            if (str == null || str.length() <= 0) {
                log.finer("Action method is void, trying to find existing accessor of related: " + stateVariable);
                return getStateVariables().get(stateVariable);
            }
            log.finer("Action method is void, will use getter method named: ".concat(str));
            Method methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(getMethod().getDeclaringClass(), str);
            if (methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 != null) {
                validateType(stateVariable, methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.getReturnType());
                return new GetterStateVariableAccessor(methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            }
            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Declared getter method '", str, "' not found on: ");
            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(getMethod().getDeclaringClass());
            throw new LocalServiceBindingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
        }
        if (str == null || str.length() <= 0) {
            if (z) {
                return null;
            }
            log.finer("Action method is not void, will use the returned instance: " + getMethod().getReturnType());
            validateType(stateVariable, getMethod().getReturnType());
            return null;
        }
        log.finer("Action method is not void, will use getter method on returned instance: ".concat(str));
        Method methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(getMethod().getReturnType(), str);
        if (methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 != null) {
            validateType(stateVariable, methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1.getReturnType());
            return new GetterStateVariableAccessor(methodO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1);
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Declared getter method '", str, "' not found on return type: ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.append(getMethod().getReturnType());
        throw new LocalServiceBindingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.toString());
    }

    public StateVariable findRelatedStateVariable(String str, String str2, String str3) {
        String strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        StateVariable stateVariable = (str == null || str.length() <= 0) ? null : getStateVariable(str);
        if (stateVariable == null && str2 != null && str2.length() > 0) {
            String upnpStateVariableName = AnnotationLocalServiceBinder.toUpnpStateVariableName(str2);
            log.finer("Finding related state variable with argument name (converted to UPnP name): " + upnpStateVariableName);
            stateVariable = getStateVariable(str2);
        }
        if (stateVariable == null && str2 != null && str2.length() > 0) {
            String strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(Constants.ARG_TYPE_PREFIX, AnnotationLocalServiceBinder.toUpnpStateVariableName(str2));
            log.finer("Finding related state variable with prefixed argument name (converted to UPnP name): " + strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
            stateVariable = getStateVariable(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
        }
        if (stateVariable != null || str3 == null || str3.length() <= 0 || (strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str3)) == null) {
            return stateVariable;
        }
        log.finer("Finding related state variable with method property name: ".concat(strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O));
        return getStateVariable(AnnotationLocalServiceBinder.toUpnpStateVariableName(strO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O));
    }

    public UpnpAction getAnnotation() {
        return this.annotation;
    }

    public Method getMethod() {
        return this.method;
    }

    public StateVariable getStateVariable(String str) {
        for (StateVariable stateVariable : getStateVariables().keySet()) {
            if (stateVariable.getName().equals(str)) {
                return stateVariable;
            }
        }
        return null;
    }

    public Map<StateVariable, StateVariableAccessor> getStateVariables() {
        return this.stateVariables;
    }

    public Set<Class> getStringConvertibleTypes() {
        return this.stringConvertibleTypes;
    }

    public void validateType(StateVariable stateVariable, Class cls) {
        Datatype.Default byJavaType = ModelUtil.isStringConvertibleType(getStringConvertibleTypes(), cls) ? Datatype.Default.STRING : Datatype.Default.getByJavaType(cls);
        log.finer("Expecting '" + stateVariable + "' to match default mapping: " + byJavaType);
        if (byJavaType != null && !stateVariable.getTypeDetails().getDatatype().isHandlingJavaType(byJavaType.getJavaType())) {
            throw new LocalServiceBindingException("State variable '" + stateVariable + "' datatype can't handle action argument's Java type (change one): " + byJavaType.getJavaType());
        }
        if (byJavaType != null || stateVariable.getTypeDetails().getDatatype().getBuiltin() == null) {
            log.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
            return;
        }
        throw new LocalServiceBindingException("State variable '" + stateVariable + "' should be custom datatype (action argument type is unknown Java type): " + cls.getSimpleName());
    }
}
