package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class MANHeader extends UpnpHeader<String> {
    public String namespace;
    public static final Pattern PATTERN = Pattern.compile("\"(.+?)\"(;.+?)??");
    public static final Pattern NAMESPACE_PATTERN = Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})");

    public MANHeader() {
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        if (getValue() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(getValue());
        sb.append("\"");
        if (getNamespace() != null) {
            sb.append("; ns=");
            sb.append(getNamespace());
        }
        return sb.toString();
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid MAN header value: ", str));
        }
        setValue(matcher.group(1));
        if (matcher.group(2) != null) {
            Matcher matcher2 = NAMESPACE_PATTERN.matcher(matcher.group(2));
            if (!matcher2.matches()) {
                throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid namespace in MAN header value: ", str));
            }
            setNamespace(matcher2.group(1));
        }
    }

    public MANHeader(String str) {
        setValue(str);
    }

    public MANHeader(String str, String str2) {
        this(str);
        this.namespace = str2;
    }
}
