package org.fourthline.cling.support.model.dlna;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DLNAAttribute<T> {
    private static final Logger log = Logger.getLogger(DLNAAttribute.class.getName());
    private T value;

    public enum Type {
        DLNA_ORG_PN("DLNA.ORG_PN", DLNAProfileAttribute.class),
        DLNA_ORG_OP("DLNA.ORG_OP", DLNAOperationsAttribute.class),
        DLNA_ORG_PS("DLNA.ORG_PS", DLNAPlaySpeedAttribute.class),
        DLNA_ORG_CI("DLNA.ORG_CI", DLNAConversionIndicatorAttribute.class),
        DLNA_ORG_FLAGS("DLNA.ORG_FLAGS", DLNAFlagsAttribute.class);

        private static Map<String, Type> byName = new HashMap<String, Type>() { // from class: org.fourthline.cling.support.model.dlna.DLNAAttribute.Type.1
            {
                for (Type type : Type.values()) {
                    put(type.getAttributeName().toUpperCase(Locale.ROOT), type);
                }
            }
        };
        private String attributeName;
        private Class<? extends DLNAAttribute>[] attributeTypes;

        @SafeVarargs
        Type(String str, Class... clsArr) {
            this.attributeName = str;
            this.attributeTypes = clsArr;
        }

        public static Type valueOfAttributeName(String str) {
            if (str == null) {
                return null;
            }
            return byName.get(str.toUpperCase(Locale.ROOT));
        }

        public String getAttributeName() {
            return this.attributeName;
        }

        public Class<? extends DLNAAttribute>[] getAttributeTypes() {
            return this.attributeTypes;
        }
    }

    public static DLNAAttribute newInstance(Type type, String str, String str2) {
        DLNAAttribute dLNAAttributeNewInstance;
        Exception e;
        DLNAAttribute dLNAAttribute = null;
        for (int i = 0; i < type.getAttributeTypes().length && dLNAAttribute == null; i++) {
            Class<? extends DLNAAttribute> cls = type.getAttributeTypes()[i];
            try {
                try {
                    log.finest("Trying to parse DLNA '" + type + "' with class: " + cls.getSimpleName());
                    dLNAAttributeNewInstance = cls.newInstance();
                    if (str != null) {
                        try {
                            dLNAAttributeNewInstance.setString(str, str2);
                        } catch (Exception e2) {
                            e = e2;
                            Logger logger = log;
                            logger.severe("Error instantiating DLNA attribute of type '" + type + "' with value: " + str);
                            logger.log(Level.SEVERE, "Exception root cause: ", O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
                        }
                    }
                } catch (Exception e3) {
                    dLNAAttributeNewInstance = dLNAAttribute;
                    e = e3;
                }
                dLNAAttribute = dLNAAttributeNewInstance;
            } catch (InvalidDLNAProtocolAttributeException e4) {
                log.finest("Invalid DLNA attribute value for tested type: " + cls.getSimpleName() + " - " + e4.getMessage());
                dLNAAttribute = null;
            }
        }
        return dLNAAttribute;
    }

    public abstract String getString();

    public T getValue() {
        return this.value;
    }

    public abstract void setString(String str, String str2);

    public void setValue(T t) {
        this.value = t;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + getValue() + "'";
    }
}
