package org.fourthline.cling.model.types;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class BooleanDatatype extends AbstractDatatype<Boolean> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public boolean isHandlingJavaType(Class cls) {
        return cls == Boolean.TYPE || Boolean.class.isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public Boolean valueOf(String str) {
        if (str.equals("")) {
            return null;
        }
        if (!str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            Locale locale = Locale.ROOT;
            if (!str.toUpperCase(locale).equals("YES") && !str.toUpperCase(locale).equals("TRUE")) {
                if (str.equals(SessionDescription.SUPPORTED_SDP_VERSION) || str.toUpperCase(locale).equals("NO") || str.toUpperCase(locale).equals("FALSE")) {
                    return Boolean.FALSE;
                }
                throw new InvalidValueException("Invalid boolean value string: ".concat(str));
            }
        }
        return Boolean.TRUE;
    }
}
