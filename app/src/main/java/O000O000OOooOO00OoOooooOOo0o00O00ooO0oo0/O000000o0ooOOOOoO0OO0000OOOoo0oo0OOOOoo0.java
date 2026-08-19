package O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;

import java.security.AccessControlException;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final String f1973O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final org.eclipse.jetty.util.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1974O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final Properties f1975O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final boolean f1976O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static final boolean f1977O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1979O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final String f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final String f1983O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    static {
        Properties properties = new Properties();
        f1975O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = properties;
        Properties properties2 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1976O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = Boolean.parseBoolean(properties2.getProperty("org.eclipse.jetty.util.log.SOURCE", properties2.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", "false")));
        f1977O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = Boolean.parseBoolean(properties2.getProperty("org.eclipse.jetty.util.log.stderr.LONG", "false"));
        properties.putAll(properties2);
        String[] strArr = {"DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (System.getProperty(str) != null) {
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", str);
            }
        }
        try {
            org.eclipse.jetty.util.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new org.eclipse.jetty.util.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -1L;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = -1L;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4460O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = -1;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4461O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "yyyy-MM-dd HH:mm:ss";
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(TimeZone.getDefault());
            f1974O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str) {
        int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        Properties properties = f1975O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        boolean z = f1976O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        this.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        this.f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1977O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        str = str == null ? "" : str;
        this.f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str;
        this.f1983O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str);
        while (true) {
            if (str == null || str.length() <= 0) {
                iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO("log.LEVEL", properties.getProperty("log.LEVEL", "INFO"));
                break;
            }
            iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str.concat(".LEVEL"), properties.getProperty(str.concat(".LEVEL")));
            if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != -1) {
                break;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            str = iLastIndexOf >= 0 ? str.substring(0, iLastIndexOf) : null;
        }
        this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        this.f1979O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        try {
            this.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Boolean.parseBoolean(properties.getProperty(this.f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ".SOURCE", Boolean.toString(this.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)));
        } catch (AccessControlException unused) {
            this.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            sb.append(strArrSplit[i].charAt(0));
        }
        if (sb.length() > 0) {
            sb.append('.');
        }
        sb.append(strArrSplit[strArrSplit.length - 1]);
        return sb.toString();
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                sb.append(cCharAt);
            } else if (cCharAt == '\n') {
                sb.append('|');
            } else if (cCharAt == '\r') {
                sb.append('<');
            } else {
                sb.append('?');
            }
        }
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(StringBuilder sb, String str, Object... objArr) {
        if (str == null) {
            str = "";
            for (int i = 0; i < objArr.length; i++) {
                str = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, "{} ");
            }
        }
        int length = 0;
        for (Object obj : objArr) {
            int iIndexOf = str.indexOf("{}", length);
            if (iIndexOf < 0) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(sb, str.substring(length));
                sb.append(" ");
                sb.append(obj);
                length = str.length();
            } else {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(sb, str.substring(length, iIndexOf));
                sb.append(String.valueOf(obj));
                length = iIndexOf + 2;
            }
        }
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(sb, str.substring(length));
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(StringBuilder sb, Throwable th) {
        if (th == null) {
            sb.append("null");
            return;
        }
        String str = f1973O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        sb.append(str);
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(sb, th.toString(), new Object[0]);
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (int i = 0; stackTrace != null && i < stackTrace.length; i++) {
            sb.append(str);
            sb.append("\tat ");
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(sb, stackTrace[i].toString(), new Object[0]);
        }
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return;
        }
        sb.append(str);
        sb.append("Caused by: ");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(sb, cause);
    }

    public static int O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(String str, String str2) {
        if (str2 == null) {
            return -1;
        }
        String strTrim = str2.trim();
        if ("ALL".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        if ("DEBUG".equalsIgnoreCase(strTrim)) {
            return 1;
        }
        if ("INFO".equalsIgnoreCase(strTrim)) {
            return 2;
        }
        if ("WARN".equalsIgnoreCase(strTrim)) {
            return 3;
        }
        System.err.println("Unknown StdErrLog level [" + str + "]=[" + strTrim + "], expecting only [ALL, DEBUG, INFO, WARN] as values.");
        return -1;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, Throwable th) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 1) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":DBUG:", str, new Object[0]);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(sb, th);
            System.err.println(sb);
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, Object... objArr) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 1) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":DBUG:", str, objArr);
            System.err.println(sb);
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Throwable th) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("", th);
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(StringBuilder sb, String str, String str2, Object... objArr) {
        int i;
        String string;
        org.eclipse.jetty.util.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1974O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4460O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (int) (jCurrentTimeMillis % 1000);
        synchronized (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            long j = jCurrentTimeMillis / 1000;
            long j2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            if (j < j2 || (j2 > 0 && j > 3600 + j2)) {
                string = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.format(new Date(jCurrentTimeMillis));
            } else if (j2 == j) {
                string = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4461O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            } else {
                Date date = new Date(jCurrentTimeMillis);
                long j3 = j / 60;
                if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != j3) {
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = j3;
                    String str3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4454O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.format(date);
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4455O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = str3;
                    int iIndexOf = str3.indexOf("ss");
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4456O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4455O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.substring(0, iIndexOf);
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4457O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4455O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.substring(iIndexOf + 2);
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = j;
                StringBuilder sb2 = new StringBuilder(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4455O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.length());
                sb2.append(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4456O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                int i2 = (int) (j % 60);
                if (i2 < 10) {
                    sb2.append('0');
                }
                sb2.append(i2);
                sb2.append(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4457O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                string = sb2.toString();
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4461O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = string;
            }
        }
        int i3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4460O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        sb.setLength(0);
        sb.append(string);
        if (i3 > 99) {
            sb.append('.');
        } else if (i3 > 9) {
            sb.append(".0");
        } else {
            sb.append(".00");
        }
        sb.append(i3);
        sb.append(str);
        if (this.f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            sb.append(this.f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        } else {
            sb.append(this.f1983O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
        sb.append(':');
        if (this.f1980O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (!className.equals(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.class.getName()) && !className.equals(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getName())) {
                    if (this.f1981O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo || !className.startsWith("org.eclipse.jetty.")) {
                        sb.append(className);
                    } else {
                        sb.append(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(className));
                    }
                    sb.append('#');
                    sb.append(stackTraceElement.getMethodName());
                    if (stackTraceElement.getFileName() != null) {
                        sb.append('(');
                        sb.append(stackTraceElement.getFileName());
                        sb.append(':');
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(')');
                    }
                    sb.append(':');
                    break;
                }
            }
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(sb, str2, objArr);
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Throwable th) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 0) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":IGNORED:", "", new Object[0]);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(sb, th);
            System.err.println(sb);
        }
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(String str, Object... objArr) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 2) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":INFO:", str, objArr);
            System.err.println(sb);
        }
    }

    public final boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        return this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 1;
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(String str, Throwable th) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 3) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":WARN:", str, new Object[0]);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(sb, th);
            System.err.println(sb);
        }
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str, Object... objArr) {
        if (this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO <= 3) {
            StringBuilder sb = new StringBuilder(64);
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(sb, ":WARN:", str, objArr);
            System.err.println(sb);
        }
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(Throwable th) {
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("", th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StdErrLog:");
        sb.append(this.f1982O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        sb.append(":LEVEL=");
        int i = this.f1978O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 0) {
            sb.append("ALL");
        } else if (i == 1) {
            sb.append("DEBUG");
        } else if (i == 2) {
            sb.append("INFO");
        } else if (i != 3) {
            sb.append("?");
        } else {
            sb.append("WARN");
        }
        return sb.toString();
    }
}
