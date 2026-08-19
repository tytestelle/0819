package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Arrays;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O parseTrackTiming(String str, Uri uri) throws ParserException {
        byte b;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String[] strArrSplit = Util.split(str, ",");
        int length = strArrSplit.length;
        char c = 0;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = strArrSplit[i];
            String[] strArrSplit2 = Util.split(str2, ";");
            int length2 = strArrSplit2.length;
            int i3 = 0;
            Uri uriResolveUri = null;
            int i4 = -1;
            long j = C.TIME_UNSET;
            while (i3 < length2) {
                String str3 = strArrSplit2[i3];
                try {
                    String[] strArrSplitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = strArrSplitAtFirst[c];
                    String str5 = strArrSplitAtFirst[1];
                    int iHashCode = str4.hashCode();
                    String[] strArr = strArrSplit;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str4.equals("rtptime")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str4.equals("url")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str4.equals("seq")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        uriResolveUri = resolveUri(str5, uri);
                    } else if (b == 1) {
                        i4 = Integer.parseInt(str5);
                    } else {
                        if (b != 2) {
                            throw ParserException.createForMalformedManifest(str4, null);
                        }
                        j = Long.parseLong(str5);
                    }
                    i3++;
                    strArrSplit = strArr;
                    c = 0;
                } catch (Exception e) {
                    throw ParserException.createForMalformedManifest(str3, e);
                }
            }
            String[] strArr2 = strArrSplit;
            if (uriResolveUri != null && uriResolveUri.getScheme() != null) {
                long j2 = j;
                if (i4 != -1 || j2 != C.TIME_UNSET) {
                    RtspTrackTiming rtspTrackTiming = new RtspTrackTiming(j2, i4, uriResolveUri);
                    int i5 = i2 + 1;
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArrCopyOf.length, i5);
                    if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    }
                    objArrCopyOf[i2] = rtspTrackTiming;
                    i++;
                    i2 = i5;
                    strArrSplit = strArr2;
                    c = 0;
                }
            }
            throw ParserException.createForMalformedManifest(str2, null);
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf, i2);
    }

    @VisibleForTesting
    public static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        return string.endsWith(ServiceReference.DELIMITER) ? UriUtil.resolveToUri(string, str) : UriUtil.resolveToUri(string.concat(ServiceReference.DELIMITER), str);
    }
}
