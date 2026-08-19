package O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import org.eclipse.jetty.http.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import org.eclipse.jetty.http.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";
    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";
    private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);

    public void doDelete(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        String str = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1905O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        String string = lStrings.getString("http.method_delete_not_supported");
        if (str.endsWith("1.1")) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, string);
        } else {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CODE_BASE, string);
        }
    }

    public void doGet(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        String str = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1905O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        String string = lStrings.getString("http.method_get_not_supported");
        if (str.endsWith("1.1")) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, string);
        } else {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CODE_BASE, string);
        }
    }

    public void doHead(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            throw new IllegalArgumentException("Response cannot be null");
        }
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1659O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1661O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1662O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        doGet(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1663O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return;
        }
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1661O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public void doOptions(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        int i;
        Class<?> superclass = getClass();
        Method[] methodArr = null;
        while (true) {
            if (superclass.equals(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class)) {
                break;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            if (methodArr == null || methodArr.length <= 0) {
                methodArr = declaredMethods;
            } else {
                Method[] methodArr2 = new Method[declaredMethods.length + methodArr.length];
                System.arraycopy(declaredMethods, 0, methodArr2, 0, declaredMethods.length);
                System.arraycopy(methodArr, 0, methodArr2, declaredMethods.length, methodArr.length);
                methodArr = methodArr2;
            }
            superclass = superclass.getSuperclass();
        }
        if (methodArr == null) {
            methodArr = new Method[0];
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.equals("doGet")) {
                z = true;
                z2 = true;
            } else if (name.equals("doPost")) {
                z3 = true;
            } else if (name.equals("doPut")) {
                z4 = true;
            } else if (name.equals("doDelete")) {
                z5 = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(METHOD_GET);
        }
        if (z2) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(METHOD_HEAD);
        }
        if (z3) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("POST");
        }
        if (z4) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(METHOD_PUT);
        }
        if (z5) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(METHOD_DELETE);
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(METHOD_TRACE);
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(METHOD_OPTIONS);
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(RtspHeaders.ALLOW, sb.toString());
    }

    public void doPost(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        String str = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1905O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        String string = lStrings.getString("http.method_post_not_supported");
        if (str.endsWith("1.1")) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, string);
        } else {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CODE_BASE, string);
        }
    }

    public void doPut(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        String str = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1905O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        String string = lStrings.getString("http.method_put_not_supported");
        if (str.endsWith("1.1")) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, string);
        } else {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TbsListener.ErrorCode.INFO_CODE_BASE, string);
        }
    }

    public void doTrace(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws IOException {
        StringBuilder sb = new StringBuilder("TRACE ");
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        sb.append(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
        sb.append(" ");
        sb.append(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1905O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        Enumeration enumeration = Collections.enumeration(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1856O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4300O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keySet());
        while (enumeration.hasMoreElements()) {
            String string = enumeration.nextElement().toString();
            sb.append("\r\n");
            sb.append(string);
            sb.append(": ");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1856O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(string);
            sb.append(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null ? null : O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        }
        sb.append("\r\n");
        int length = sb.length();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("message/http");
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(length);
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(sb.toString());
    }

    public long getLastModified(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        return -1L;
    }

    public void service(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws IOException {
        long time;
        int i = 1;
        int i2 = 0;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        String str = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1902O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (!str.equals(METHOD_GET)) {
            if (str.equals(METHOD_HEAD)) {
                long lastModified = getLastModified(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() && lastModified >= 0) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("Last-Modified", lastModified);
                }
                doHead(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            }
            if (str.equals("POST")) {
                doPost(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            }
            if (str.equals(METHOD_PUT)) {
                doPut(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            }
            if (str.equals(METHOD_DELETE)) {
                doDelete(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            }
            if (str.equals(METHOD_OPTIONS)) {
                doOptions(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            } else if (str.equals(METHOD_TRACE)) {
                doTrace(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return;
            } else {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(501, MessageFormat.format(lStrings.getString("http.method_not_implemented"), str));
                return;
            }
        }
        long lastModified2 = getLastModified(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        long j = -1;
        if (lastModified2 == -1) {
            doGet(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            return;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1856O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("If-Modified-Since");
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            } else {
                int iIndexOf = strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.indexOf(59);
                if (iIndexOf >= 0) {
                    strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.substring(0, iIndexOf).trim();
                }
            }
            if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4296O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get();
                int i3 = 0;
                while (true) {
                    SimpleDateFormat[] simpleDateFormatArr = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4286O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (i3 >= simpleDateFormatArr.length) {
                        if (!strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.endsWith(" GMT")) {
                            time = -1;
                            break;
                        }
                        String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(4, 0, strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        while (true) {
                            if (i2 >= simpleDateFormatArr.length) {
                                time = -1;
                                break;
                            } else {
                                try {
                                    time = ((Date) simpleDateFormatArr[i2].parseObject(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)).getTime();
                                    break;
                                } catch (Exception unused) {
                                    i2 += i;
                                }
                            }
                        }
                    } else {
                        if (simpleDateFormatArr[i3] == null) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4295O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo[i3], Locale.US);
                            simpleDateFormatArr[i3] = simpleDateFormat;
                            simpleDateFormat.setTimeZone(org.eclipse.jetty.http.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4291O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                        }
                        try {
                            continue;
                            time = ((Date) simpleDateFormatArr[i3].parseObject(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)).getTime();
                            break;
                        } catch (Exception unused2) {
                            i3 += i;
                        }
                    }
                }
                if (time == -1) {
                    throw new IllegalArgumentException("Cannot convert date: ".concat(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
                }
                j = time;
            }
        }
        if (j >= lastModified2) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(304);
            return;
        }
        if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() && lastModified2 >= 0) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("Last-Modified", lastModified2);
        }
        doGet(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void service(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) throws IOException, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
        if ((o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            service((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            return;
        }
        throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0("non-HTTP request or response");
    }
}
