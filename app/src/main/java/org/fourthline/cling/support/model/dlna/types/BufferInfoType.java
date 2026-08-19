package org.fourthline.cling.support.model.dlna.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class BufferInfoType {
    static final Pattern pattern = Pattern.compile("^dejitter=(\\d{1,10})(;CDB=(\\d{1,10});BTM=(0|1|2))?(;TD=(\\d{1,10}))?(;BFR=(0|1))?$", 2);
    private CodedDataBuffer cdb;
    private Long dejitterSize;
    private Boolean fullnessReports;
    private Long targetDuration;

    public BufferInfoType(Long l) {
        this.dejitterSize = l;
    }

    public static BufferInfoType valueOf(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            try {
                return new BufferInfoType(Long.valueOf(Long.parseLong(matcher.group(1))), matcher.group(2) != null ? new CodedDataBuffer(Long.valueOf(Long.parseLong(matcher.group(3))), CodedDataBuffer.TransferMechanism.values()[Integer.parseInt(matcher.group(4))]) : null, matcher.group(5) != null ? Long.valueOf(Long.parseLong(matcher.group(6))) : null, matcher.group(7) != null ? Boolean.valueOf(matcher.group(8).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) : null);
            } catch (NumberFormatException unused) {
            }
        }
        throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse BufferInfoType: ", str));
    }

    public CodedDataBuffer getCdb() {
        return this.cdb;
    }

    public Long getDejitterSize() {
        return this.dejitterSize;
    }

    public String getString() {
        String string = "dejitter=" + this.dejitterSize.toString();
        if (this.cdb != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ";CDB=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(this.cdb.getSize().toString());
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(";BTM=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(this.cdb.getTranfer().ordinal());
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        if (this.targetDuration != null) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ";TD=");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.append(this.targetDuration.toString());
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.toString();
        }
        if (this.fullnessReports == null) {
            return string;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ";BFR=");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.append(this.fullnessReports.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0002.toString();
    }

    public Long getTargetDuration() {
        return this.targetDuration;
    }

    public Boolean isFullnessReports() {
        return this.fullnessReports;
    }

    public BufferInfoType(Long l, CodedDataBuffer codedDataBuffer, Long l2, Boolean bool) {
        this.dejitterSize = l;
        this.cdb = codedDataBuffer;
        this.targetDuration = l2;
        this.fullnessReports = bool;
    }
}
