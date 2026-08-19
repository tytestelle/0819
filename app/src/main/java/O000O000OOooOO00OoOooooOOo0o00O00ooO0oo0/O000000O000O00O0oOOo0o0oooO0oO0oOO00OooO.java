package O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Properties;
import org.eclipse.jetty.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements PrivilegedAction {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.security.PrivilegedAction
    public final Object run() throws Throwable {
        InputStream inputStreamOpenStream;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        URL systemResource = null;
        while (systemResource == null && contextClassLoader != null) {
            systemResource = contextClassLoader.getResource("jetty-logging.properties");
            contextClassLoader = systemResource == null ? contextClassLoader.getParent() : null;
        }
        ClassLoader classLoader = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getClassLoader();
        while (systemResource == null && classLoader != 0) {
            systemResource = classLoader.getResource("jetty-logging.properties");
            classLoader = systemResource == null ? classLoader.getParent() : 0;
        }
        if (systemResource == null) {
            systemResource = ClassLoader.getSystemResource("jetty-logging.properties");
        }
        try {
            if (systemResource != null) {
                try {
                    inputStreamOpenStream = systemResource.openStream();
                    try {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.load(inputStreamOpenStream);
                        classLoader = inputStreamOpenStream;
                    } catch (IOException e) {
                        e = e;
                        PrintStream printStream = System.err;
                        printStream.println("Unable to load " + systemResource);
                        e.printStackTrace(printStream);
                        classLoader = inputStreamOpenStream;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamOpenStream = null;
                } catch (Throwable th) {
                    th = th;
                    classLoader = 0;
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(classLoader);
                    throw th;
                }
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(classLoader);
            }
            Enumeration<?> enumerationPropertyNames = System.getProperties().propertyNames();
            while (enumerationPropertyNames.hasMoreElements()) {
                String str = (String) enumerationPropertyNames.nextElement();
                String property = System.getProperty(str);
                if (property != null) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setProperty(str, property);
                }
            }
            Properties properties = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = properties.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Boolean.parseBoolean(properties.getProperty("org.eclipse.jetty.util.log.IGNORED", "false"));
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
