package org.fourthline.cling.binding.annotations;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.AllowedValueProvider;
import org.fourthline.cling.binding.AllowedValueRangeProvider;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.meta.StateVariableAllowedValueRange;
import org.fourthline.cling.model.meta.StateVariableEventDetails;
import org.fourthline.cling.model.meta.StateVariableTypeDetails;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationStateVariableBinder {
    private static Logger log = Logger.getLogger(AnnotationLocalServiceBinder.class.getName());
    protected StateVariableAccessor accessor;
    protected UpnpStateVariable annotation;
    protected String name;
    protected Set<Class> stringConvertibleTypes;

    public AnnotationStateVariableBinder(UpnpStateVariable upnpStateVariable, String str, StateVariableAccessor stateVariableAccessor, Set<Class> set) {
        this.annotation = upnpStateVariable;
        this.name = str;
        this.accessor = stateVariableAccessor;
        this.stringConvertibleTypes = set;
    }

    public Datatype createDatatype() {
        String strDatatype = getAnnotation().datatype();
        if (strDatatype.length() == 0 && getAccessor() != null) {
            Class<?> returnType = getAccessor().getReturnType();
            log.finer("Using accessor return type as state variable type: " + returnType);
            if (ModelUtil.isStringConvertibleType(getStringConvertibleTypes(), returnType)) {
                log.finer("Return type is string-convertible, using string datatype");
                return Datatype.Default.STRING.getBuiltinType().getDatatype();
            }
            Datatype.Default byJavaType = Datatype.Default.getByJavaType(returnType);
            if (byJavaType != null) {
                log.finer("Return type has default UPnP datatype: " + byJavaType);
                return byJavaType.getBuiltinType().getDatatype();
            }
        }
        if (strDatatype.length() == 0 && (getAnnotation().allowedValues().length > 0 || getAnnotation().allowedValuesEnum() != Void.TYPE)) {
            log.finer("State variable has restricted allowed values, hence using 'string' datatype");
            strDatatype = TypedValues.Custom.S_STRING;
        }
        if (strDatatype.length() == 0) {
            throw new LocalServiceBindingException("Could not detect datatype of state variable: " + getName());
        }
        log.finer("Trying to find built-in UPnP datatype for detected name: ".concat(strDatatype));
        Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strDatatype);
        if (byDescriptorName == null) {
            throw new LocalServiceBindingException("No built-in UPnP datatype found, using CustomDataType (TODO: NOT IMPLEMENTED)");
        }
        log.finer("Found built-in UPnP datatype: " + byDescriptorName);
        return byDescriptorName.getDatatype();
    }

    public String createDefaultValue(Datatype datatype) {
        if (getAnnotation().defaultValue().length() == 0) {
            return null;
        }
        try {
            datatype.valueOf(getAnnotation().defaultValue());
            log.finer("Found state variable default value: " + getAnnotation().defaultValue());
            return getAnnotation().defaultValue();
        } catch (Exception e) {
            throw new LocalServiceBindingException("Default value doesn't match datatype of state variable '" + getName() + "': " + e.getMessage());
        }
    }

    public StateVariable createStateVariable() {
        String[] allowedValues;
        int iEventMinimumDelta;
        int iEventMaximumRateMilliseconds;
        log.fine("Creating state variable '" + getName() + "' with accessor: " + getAccessor());
        Datatype datatypeCreateDatatype = createDatatype();
        String strCreateDefaultValue = createDefaultValue(datatypeCreateDatatype);
        int i = 0;
        StateVariableAllowedValueRange allowedValueRange = null;
        if (Datatype.Builtin.STRING.equals(datatypeCreateDatatype.getBuiltin())) {
            Class clsAllowedValueProvider = getAnnotation().allowedValueProvider();
            Class cls = Void.TYPE;
            if (clsAllowedValueProvider != cls) {
                allowedValues = getAllowedValuesFromProvider();
            } else if (getAnnotation().allowedValues().length > 0) {
                allowedValues = getAnnotation().allowedValues();
            } else if (getAnnotation().allowedValuesEnum() != cls) {
                allowedValues = getAllowedValues(getAnnotation().allowedValuesEnum());
            } else if (getAccessor() == null || !getAccessor().getReturnType().isEnum()) {
                log.finer("Not restricting allowed values (of string typed state var): " + getName());
                allowedValues = null;
            } else {
                allowedValues = getAllowedValues(getAccessor().getReturnType());
            }
            if (allowedValues != null && strCreateDefaultValue != null) {
                int length = allowedValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Default value '", strCreateDefaultValue, "' is not in allowed values of: ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(getName());
                        throw new LocalServiceBindingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
                    }
                    if (allowedValues[i2].equals(strCreateDefaultValue)) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            allowedValues = null;
        }
        if (Datatype.Builtin.isNumeric(datatypeCreateDatatype.getBuiltin())) {
            if (getAnnotation().allowedValueRangeProvider() != Void.TYPE) {
                allowedValueRange = getAllowedRangeFromProvider();
            } else if (getAnnotation().allowedValueMinimum() > 0 || getAnnotation().allowedValueMaximum() > 0) {
                allowedValueRange = getAllowedValueRange(getAnnotation().allowedValueMinimum(), getAnnotation().allowedValueMaximum(), getAnnotation().allowedValueStep());
            } else {
                log.finer("Not restricting allowed value range (of numeric typed state var): " + getName());
            }
            if (strCreateDefaultValue != null && allowedValueRange != null) {
                try {
                    if (!allowedValueRange.isInRange(Long.valueOf(strCreateDefaultValue).longValue())) {
                        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Default value '", strCreateDefaultValue, "' is not in allowed range of: ");
                        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.append(getName());
                        throw new LocalServiceBindingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2.toString());
                    }
                } catch (Exception unused) {
                    StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Default value '", strCreateDefaultValue, "' is not numeric (for range checking) of: ");
                    sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.append(getName());
                    throw new LocalServiceBindingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3.toString());
                }
            }
        }
        boolean zSendEvents = getAnnotation().sendEvents();
        if (zSendEvents && getAccessor() == null) {
            throw new LocalServiceBindingException("State variable sends events but has no accessor for field or getter: " + getName());
        }
        if (zSendEvents) {
            if (getAnnotation().eventMaximumRateMilliseconds() > 0) {
                log.finer("Moderating state variable events using maximum rate (milliseconds): " + getAnnotation().eventMaximumRateMilliseconds());
                iEventMaximumRateMilliseconds = getAnnotation().eventMaximumRateMilliseconds();
            } else {
                iEventMaximumRateMilliseconds = 0;
            }
            if (getAnnotation().eventMinimumDelta() <= 0 || !Datatype.Builtin.isNumeric(datatypeCreateDatatype.getBuiltin())) {
                i = iEventMaximumRateMilliseconds;
                iEventMinimumDelta = 0;
            } else {
                log.finer("Moderating state variable events using minimum delta: " + getAnnotation().eventMinimumDelta());
                int i3 = iEventMaximumRateMilliseconds;
                iEventMinimumDelta = getAnnotation().eventMinimumDelta();
                i = i3;
            }
        } else {
            iEventMinimumDelta = 0;
        }
        return new StateVariable(getName(), new StateVariableTypeDetails(datatypeCreateDatatype, strCreateDefaultValue, allowedValues, allowedValueRange), new StateVariableEventDetails(zSendEvents, i, iEventMinimumDelta));
    }

    public StateVariableAccessor getAccessor() {
        return this.accessor;
    }

    public StateVariableAllowedValueRange getAllowedRangeFromProvider() {
        Class clsAllowedValueRangeProvider = getAnnotation().allowedValueRangeProvider();
        if (!AllowedValueRangeProvider.class.isAssignableFrom(clsAllowedValueRangeProvider)) {
            throw new LocalServiceBindingException("Allowed value range provider is not of type " + AllowedValueRangeProvider.class + ": " + getName());
        }
        try {
            AllowedValueRangeProvider allowedValueRangeProvider = (AllowedValueRangeProvider) clsAllowedValueRangeProvider.newInstance();
            return getAllowedValueRange(allowedValueRangeProvider.getMinimum(), allowedValueRangeProvider.getMaximum(), allowedValueRangeProvider.getStep());
        } catch (Exception e) {
            throw new LocalServiceBindingException("Allowed value range provider can't be instantiated: " + getName(), e);
        }
    }

    public StateVariableAllowedValueRange getAllowedValueRange(long j, long j2, long j3) {
        if (j2 >= j) {
            return new StateVariableAllowedValueRange(j, j2, j3);
        }
        throw new LocalServiceBindingException("Allowed value range maximum is smaller than minimum: " + getName());
    }

    public String[] getAllowedValues(Class cls) {
        if (!cls.isEnum()) {
            throw new LocalServiceBindingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Allowed values type is not an Enum: "));
        }
        log.finer("Restricting allowed values of state variable to Enum: " + getName());
        String[] strArr = new String[cls.getEnumConstants().length];
        for (int i = 0; i < cls.getEnumConstants().length; i++) {
            Object obj = cls.getEnumConstants()[i];
            if (obj.toString().length() > 32) {
                throw new LocalServiceBindingException("Allowed value string (that is, Enum constant name) is longer than 32 characters: " + obj.toString());
            }
            log.finer("Adding allowed value (converted to string): " + obj.toString());
            strArr[i] = obj.toString();
        }
        return strArr;
    }

    public String[] getAllowedValuesFromProvider() {
        Class clsAllowedValueProvider = getAnnotation().allowedValueProvider();
        if (AllowedValueProvider.class.isAssignableFrom(clsAllowedValueProvider)) {
            try {
                return ((AllowedValueProvider) clsAllowedValueProvider.newInstance()).getValues();
            } catch (Exception e) {
                throw new LocalServiceBindingException("Allowed value provider can't be instantiated: " + getName(), e);
            }
        }
        throw new LocalServiceBindingException("Allowed value provider is not of type " + AllowedValueProvider.class + ": " + getName());
    }

    public UpnpStateVariable getAnnotation() {
        return this.annotation;
    }

    public String getName() {
        return this.name;
    }

    public Set<Class> getStringConvertibleTypes() {
        return this.stringConvertibleTypes;
    }
}
