package O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O extends Thread {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f1931O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
        this.f1931O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        setDaemon(true);
        setName("ShutdownMonitor");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        Exception e;
        Socket socketAccept;
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f1931O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            return;
        }
        while (true) {
            ServerSocket serverSocket = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (serverSocket == null) {
                return;
            }
            Socket socket = null;
            try {
                socketAccept = serverSocket.accept();
                try {
                    try {
                        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(socketAccept.getInputStream()));
                        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(lineNumberReader.readLine())) {
                            OutputStream outputStream = socketAccept.getOutputStream();
                            String line = lineNumberReader.readLine();
                            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "command=%s", new Object[]{line});
                            if ("stop".equals(line)) {
                                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "Issuing graceful shutdown..", new Object[0]);
                                O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f2041O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.run();
                                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "Informing client that we are stopped.", new Object[0]);
                                outputStream.write("Stopped\r\n".getBytes("UTF-8"));
                                outputStream.flush();
                                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "Shutting down monitor", new Object[0]);
                                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, socketAccept);
                                ServerSocket serverSocket2 = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                if (serverSocket2 != null) {
                                    try {
                                        serverSocket2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                                if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1935O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "Killing JVM", new Object[0]);
                                    System.exit(0);
                                }
                            } else {
                                if ("status".equals(line)) {
                                    outputStream.write("OK\r\n".getBytes("UTF-8"));
                                    outputStream.flush();
                                }
                                socket = socketAccept;
                            }
                            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, socket);
                        } else {
                            System.err.println("Ignoring command with incorrect key");
                            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, socketAccept);
                        }
                    } catch (Throwable th) {
                        th = th;
                        socket = socketAccept;
                        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, socket);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        e.printStackTrace(System.err);
                    }
                    System.err.println(e.toString());
                }
            } catch (Exception e3) {
                e = e3;
                socketAccept = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        if (isAlive()) {
            System.err.printf("ShutdownMonitorThread already started", new Object[0]);
            return;
        }
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this.f1931O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 0) {
                try {
                    ServerSocket serverSocket = new ServerSocket(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 1, InetAddress.getByName("127.0.0.1"));
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = serverSocket;
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 0) {
                        int localPort = serverSocket.getLocalPort();
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = localPort;
                        System.out.printf("STOP.PORT=%d%n", Integer.valueOf(localPort));
                    }
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        String string = Long.toString((long) ((Math.random() * 9.223372036854776E18d) + ((double) hashCode()) + System.currentTimeMillis()), 36);
                        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = string;
                        System.out.printf("STOP.KEY=%s%n", string);
                    }
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.PORT=%d", new Object[]{Integer.valueOf(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)});
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.KEY=%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o});
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0});
                } catch (Exception e) {
                    if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        e.printStackTrace(System.err);
                    }
                    System.err.println("Error binding monitor port " + o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ": " + e.toString());
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.PORT=%d", new Object[]{Integer.valueOf(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)});
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.KEY=%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o});
                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0});
                }
            } else if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                System.err.println("ShutdownMonitor not in use (port < 0): " + o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
            if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                return;
            }
            if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1932O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                System.err.println("Starting ShutdownMonitorThread");
            }
            super.start();
        } catch (Throwable th) {
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.PORT=%d", new Object[]{Integer.valueOf(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1933O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)});
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "STOP.KEY=%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1934O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o});
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "%s", new Object[]{o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1936O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0});
            throw th;
        }
    }
}
