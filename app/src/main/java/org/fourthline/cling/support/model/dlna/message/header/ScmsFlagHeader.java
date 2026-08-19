package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.regex.Pattern;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.support.model.dlna.types.ScmsFlagType;

/* JADX INFO: loaded from: classes2.dex */
public class ScmsFlagHeader extends DLNAHeader<ScmsFlagType> {
    static final Pattern pattern = Pattern.compile("^[01]{2}$", 2);

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        ScmsFlagType value = getValue();
        boolean zIsCopyright = value.isCopyright();
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        String str2 = zIsCopyright ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (value.isOriginal()) {
            str = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        return str2.concat(str);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!pattern.matcher(str).matches()) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid ScmsFlag header value: ", str));
        }
        setValue(new ScmsFlagType(str.charAt(0) == '0', str.charAt(1) == '0'));
    }
}
