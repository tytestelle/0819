package org.eclipse.jetty.http;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final TimeZone f4291O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final String[] f4292O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final String[] f4293O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4294O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final String[] f4295O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4296O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final ConcurrentHashMap f4297O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final int f4298O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList(20);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final HashMap f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap(32);

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class.getName());
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f4291O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = timeZone;
        Locale locale = Locale.US;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -1L;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = -1L;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4460O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = -1;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4461O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = locale;
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(TimeZone.getDefault());
        timeZone.setID("GMT");
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(timeZone);
        f4292O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new String[]{"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        f4293O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};
        f4294O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(3);
        f4295O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};
        f4296O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(4);
        new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0L));
        StringBuilder sb = new StringBuilder(28);
        GregorianCalendar gregorianCalendar = ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) f4294O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.get()).f4285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        gregorianCalendar.setTimeInMillis(0L);
        int i = gregorianCalendar.get(7);
        int i2 = gregorianCalendar.get(5);
        int i3 = gregorianCalendar.get(2);
        int i4 = gregorianCalendar.get(1) % 10000;
        int i5 = (int) ((0 / 1000) % TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC);
        int i6 = i5 % 60;
        int i7 = i5 / 60;
        sb.append(f4292O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i]);
        sb.append(',');
        sb.append(' ');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i2);
        sb.append('-');
        sb.append(f4293O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i3]);
        sb.append('-');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i4 / 100);
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i4 % 100);
        sb.append(' ');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i7 / 60);
        sb.append(':');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i7 % 60);
        sb.append(':');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i6);
        sb.append(" GMT");
        sb.toString().getClass();
        f4297O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new ConcurrentHashMap();
        f4298O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = Integer.getInteger("org.eclipse.jetty.http.HttpFields.CACHE", 2000).intValue();
        Float f = new Float("1.0");
        Float f2 = new Float("0.0");
        org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put((String) null, (Object) f);
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("1.0", (Object) f);
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (Object) f);
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.9", (Object) new Float("0.9"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.8", (Object) new Float("0.8"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.7", (Object) new Float("0.7"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.66", (Object) new Float("0.66"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.6", (Object) new Float("0.6"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.5", (Object) new Float("0.5"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.4", (Object) new Float("0.4"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.33", (Object) new Float("0.33"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.3", (Object) new Float("0.3"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.2", (Object) new Float("0.2"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.1", (Object) new Float("0.1"));
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put(SessionDescription.SUPPORTED_SDP_VERSION, (Object) f2);
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.put("0.0", (Object) f2);
    }

    public static O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        ConcurrentHashMap concurrentHashMap = f4297O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) concurrentHashMap.get(str);
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        }
        try {
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(str, "ISO-8859-1");
            int i = f4298O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (i <= 0) {
                return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            }
            if (concurrentHashMap.size() > i) {
                concurrentHashMap.clear();
            }
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) concurrentHashMap.putIfAbsent(str, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null ? o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 : o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(long j) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) f4294O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.get();
        StringBuilder sb = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4284O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        sb.setLength(0);
        GregorianCalendar gregorianCalendar = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4285O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        gregorianCalendar.setTimeInMillis(j);
        int i = gregorianCalendar.get(7);
        int i2 = gregorianCalendar.get(5);
        int i3 = gregorianCalendar.get(2);
        int i4 = gregorianCalendar.get(1);
        int i5 = gregorianCalendar.get(11);
        int i6 = gregorianCalendar.get(12);
        int i7 = gregorianCalendar.get(13);
        sb.append(f4292O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[i]);
        sb.append(',');
        sb.append(' ');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i2);
        sb.append(' ');
        sb.append(f4293O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i3]);
        sb.append(' ');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i4 / 100);
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i4 % 100);
        sb.append(' ');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i5);
        sb.append(':');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i6);
        sb.append(':');
        org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb, i7);
        sb.append(" GMT");
        return sb.toString();
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 == null) {
            throw new IllegalArgumentException("null value");
        }
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4313O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 1 || iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 5 || iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 10) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4313O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
            }
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        HashMap map = this.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        for (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) map.get(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o); o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 != null; o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f4289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO2 = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2);
        this.f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO2);
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO2;
        } else {
            map.put(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO2);
        }
    }

    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        return (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo));
    }

    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str) {
        return (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(str));
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 == null) {
            return;
        }
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4313O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001)).O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
        this.f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        this.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, String str) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo), O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str));
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo)) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4316O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        for (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000); o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null; o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        }
    }

    public final String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f4299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i >= arrayList.size()) {
                    stringBuffer.append("\r\n");
                    return stringBuffer.toString();
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList.get(i);
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
                    String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4287O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                        stringBuffer.append(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    }
                    stringBuffer.append(": ");
                    String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
                        stringBuffer.append(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2);
                    }
                    stringBuffer.append("\r\n");
                }
                i++;
            }
        } catch (Exception e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return e.toString();
        }
    }
}
