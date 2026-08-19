package O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Serializable {
    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private transient O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 config;

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public String getInitParameter(String str) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public Enumeration<String> getInitParameterNames() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 getServletConfig() {
        return this.config;
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo getServletContext() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public String getServletInfo() {
        return "";
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public String getServletName() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void init(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.config = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        init();
    }

    public void log(String str) {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo servletContext = getServletContext();
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) ((org.eclipse.jetty.servlet.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) servletContext).f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1956O00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(getServletName() + ": " + str, new Object[0]);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public abstract void service(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);

    public void init() {
    }

    public void log(String str, Throwable th) {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) ((org.eclipse.jetty.servlet.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) getServletContext()).f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1956O00000OOoOOO00O00o0ooooooooO000ooooO0000).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(getServletName() + ": " + str, th);
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void destroy() {
    }
}
