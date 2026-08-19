package org.fourthline.cling.support.lastchange;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.net.URI;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class EventedValueURI extends EventedValue<URI> {
    private static final Logger log = Logger.getLogger(EventedValueURI.class.getName());

    public EventedValueURI(URI uri) {
        super(uri);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return Datatype.Builtin.URI.getDatatype();
    }

    public EventedValueURI(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public URI valueOf(String str) {
        try {
            return (URI) super.valueOf(str);
        } catch (InvalidValueException e) {
            Logger logger = log;
            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Ignoring invalid URI in evented value '", str, "': ");
            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
            logger.info(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
            return null;
        }
    }
}
