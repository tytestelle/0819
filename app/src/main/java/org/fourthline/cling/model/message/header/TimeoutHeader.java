package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class TimeoutHeader extends UpnpHeader<Integer> {
    public static final Integer INFINITE_VALUE = Integer.MAX_VALUE;
    public static final Pattern PATTERN = Pattern.compile("Second-(?:([0-9]+)|infinite)");

    public TimeoutHeader() {
        setValue(1800);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        StringBuilder sb = new StringBuilder("Second-");
        sb.append(getValue().equals(INFINITE_VALUE) ? "infinite" : getValue());
        return sb.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse timeout seconds integer from: ", str));
        }
        if (matcher.group(1) != null) {
            setValue(Integer.valueOf(Integer.parseInt(matcher.group(1))));
        } else {
            setValue(INFINITE_VALUE);
        }
    }

    public TimeoutHeader(int i) {
        setValue(Integer.valueOf(i));
    }

    public TimeoutHeader(Integer num) {
        setValue(num);
    }
}
