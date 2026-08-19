package org.fourthline.cling.transport.impl;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.Constants;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NetworkAddressFactory;
import org.fourthline.cling.transport.spi.NoNetworkException;
import org.seamless.util.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkAddressFactoryImpl implements NetworkAddressFactory {
    public static final int DEFAULT_TCP_HTTP_LISTEN_PORT = 0;
    private static Logger log = Logger.getLogger(NetworkAddressFactoryImpl.class.getName());
    protected final List<InetAddress> bindAddresses;
    protected final List<NetworkInterface> networkInterfaces;
    protected int streamListenPort;
    protected final Set<String> useAddresses;
    protected final Set<String> useInterfaces;

    public NetworkAddressFactoryImpl() {
        this(0);
    }

    public void discoverBindAddresses() {
        try {
            synchronized (this.networkInterfaces) {
                try {
                    Iterator<NetworkInterface> it = this.networkInterfaces.iterator();
                    while (it.hasNext()) {
                        NetworkInterface next = it.next();
                        log.finer("Discovering addresses of interface: " + next.getDisplayName());
                        int i = 0;
                        for (InetAddress inetAddress : getInetAddresses(next)) {
                            if (inetAddress == null) {
                                log.warning("Network has a null address: " + next.getDisplayName());
                            } else if (isUsableAddress(next, inetAddress)) {
                                log.fine("Discovered usable network interface address: " + inetAddress.getHostAddress());
                                i++;
                                synchronized (this.bindAddresses) {
                                    this.bindAddresses.add(inetAddress);
                                }
                            } else {
                                log.finer("Ignoring non-usable network interface address: " + inetAddress.getHostAddress());
                            }
                        }
                        if (i == 0) {
                            log.finer("Network interface has no usable addresses, removing: " + next.getDisplayName());
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            throw new InitializationException(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Could not not analyze local network interfaces: ", e), e);
        }
    }

    public void discoverNetworkInterfaces() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                log.finer("Analyzing network interface: " + networkInterface.getDisplayName());
                if (isUsableNetworkInterface(networkInterface)) {
                    log.fine("Discovered usable network interface: " + networkInterface.getDisplayName());
                    synchronized (this.networkInterfaces) {
                        this.networkInterfaces.add(networkInterface);
                    }
                } else {
                    log.finer("Ignoring non-usable network interface: " + networkInterface.getDisplayName());
                }
            }
        } catch (Exception e) {
            throw new InitializationException(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Could not not analyze local network interfaces: ", e), e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public Short getAddressNetworkPrefixLength(InetAddress inetAddress) {
        synchronized (this.networkInterfaces) {
            try {
                Iterator<NetworkInterface> it = this.networkInterfaces.iterator();
                while (it.hasNext()) {
                    for (InterfaceAddress interfaceAddress : getInterfaceAddresses(it.next())) {
                        if (interfaceAddress != null && interfaceAddress.getAddress().equals(inetAddress)) {
                            short networkPrefixLength = interfaceAddress.getNetworkPrefixLength();
                            if (networkPrefixLength <= 0 || networkPrefixLength >= 32) {
                                return null;
                            }
                            return Short.valueOf(networkPrefixLength);
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InetAddress getBindAddressInSubnetOf(InetAddress inetAddress) {
        synchronized (this.networkInterfaces) {
            Iterator<NetworkInterface> it = this.networkInterfaces.iterator();
            while (it.hasNext()) {
                for (InterfaceAddress interfaceAddress : getInterfaceAddresses(it.next())) {
                    synchronized (this.bindAddresses) {
                        if (interfaceAddress != null) {
                            if (this.bindAddresses.contains(interfaceAddress.getAddress())) {
                                if (isInSubnet(inetAddress.getAddress(), interfaceAddress.getAddress().getAddress(), interfaceAddress.getNetworkPrefixLength())) {
                                    return interfaceAddress.getAddress();
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public Iterator<InetAddress> getBindAddresses() {
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.bindAddresses) { // from class: org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl.2
            @Override // org.seamless.util.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public void synchronizedRemove(int i) {
                synchronized (NetworkAddressFactoryImpl.this.bindAddresses) {
                    NetworkAddressFactoryImpl.this.bindAddresses.remove(i);
                }
            }
        };
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public InetAddress getBroadcastAddress(InetAddress inetAddress) {
        synchronized (this.networkInterfaces) {
            try {
                Iterator<NetworkInterface> it = this.networkInterfaces.iterator();
                while (it.hasNext()) {
                    for (InterfaceAddress interfaceAddress : getInterfaceAddresses(it.next())) {
                        if (interfaceAddress != null && interfaceAddress.getAddress().equals(inetAddress)) {
                            return interfaceAddress.getBroadcast();
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public byte[] getHardwareAddress(InetAddress inetAddress) {
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (Throwable th) {
            log.log(Level.WARNING, "Cannot get hardware address for: " + inetAddress, th);
            return null;
        }
    }

    public List<InetAddress> getInetAddresses(NetworkInterface networkInterface) {
        return Collections.list(networkInterface.getInetAddresses());
    }

    public List<InterfaceAddress> getInterfaceAddresses(NetworkInterface networkInterface) {
        return networkInterface.getInterfaceAddresses();
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public InetAddress getLocalAddress(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
        InetAddress bindAddressInSubnetOf = getBindAddressInSubnetOf(inetAddress);
        if (bindAddressInSubnetOf != null) {
            return bindAddressInSubnetOf;
        }
        log.finer("Could not find local bind address in same subnet as: " + inetAddress.getHostAddress());
        for (InetAddress inetAddress2 : getInetAddresses(networkInterface)) {
            if (z && (inetAddress2 instanceof Inet6Address)) {
                return inetAddress2;
            }
            if (!z && (inetAddress2 instanceof Inet4Address)) {
                return inetAddress2;
            }
        }
        throw new IllegalStateException("Can't find any IPv4 or IPv6 address on interface: " + networkInterface.getDisplayName());
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public InetAddress getMulticastGroup() {
        try {
            return InetAddress.getByName(Constants.IPV4_UPNP_MULTICAST_GROUP);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public int getMulticastPort() {
        return Constants.UPNP_MULTICAST_PORT;
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public Iterator<NetworkInterface> getNetworkInterfaces() {
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.networkInterfaces) { // from class: org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl.1
            @Override // org.seamless.util.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public void synchronizedRemove(int i) {
                synchronized (NetworkAddressFactoryImpl.this.networkInterfaces) {
                    NetworkAddressFactoryImpl.this.networkInterfaces.remove(i);
                }
            }
        };
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public int getStreamListenPort() {
        return this.streamListenPort;
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public boolean hasUsableNetwork() {
        return this.networkInterfaces.size() > 0 && this.bindAddresses.size() > 0;
    }

    public boolean isInSubnet(byte[] bArr, byte[] bArr2, short s) {
        if (bArr.length != bArr2.length || s / 8 > bArr.length) {
            return false;
        }
        int i = 0;
        while (s >= 8 && i < bArr.length) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
            s = (short) (s - 8);
        }
        if (i == bArr.length) {
            return true;
        }
        byte b = (byte) (~((1 << (8 - s)) - 1));
        return (bArr[i] & b) == (bArr2[i] & b);
    }

    public boolean isUsableAddress(NetworkInterface networkInterface, InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet4Address)) {
            log.finer("Skipping unsupported non-IPv4 address: " + inetAddress);
            return false;
        }
        if (inetAddress.isLoopbackAddress()) {
            log.finer("Skipping loopback address: " + inetAddress);
            return false;
        }
        if (this.useAddresses.size() <= 0 || this.useAddresses.contains(inetAddress.getHostAddress())) {
            return true;
        }
        log.finer("Skipping unwanted address: " + inetAddress);
        return false;
    }

    public boolean isUsableNetworkInterface(NetworkInterface networkInterface) {
        if (!networkInterface.isUp()) {
            log.finer("Skipping network interface (down): " + networkInterface.getDisplayName());
            return false;
        }
        if (getInetAddresses(networkInterface).size() == 0) {
            log.finer("Skipping network interface without bound IP addresses: " + networkInterface.getDisplayName());
            return false;
        }
        String name = networkInterface.getName();
        Locale locale = Locale.ROOT;
        if (name.toLowerCase(locale).startsWith("vmnet") || (networkInterface.getDisplayName() != null && networkInterface.getDisplayName().toLowerCase(locale).contains("vmnet"))) {
            log.finer("Skipping network interface (VMWare): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("vnic")) {
            log.finer("Skipping network interface (Parallels): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("vboxnet")) {
            log.finer("Skipping network interface (Virtual Box): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).contains("virtual")) {
            log.finer("Skipping network interface (named '*virtual*'): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.getName().toLowerCase(locale).startsWith("ppp")) {
            log.finer("Skipping network interface (PPP): " + networkInterface.getDisplayName());
            return false;
        }
        if (networkInterface.isLoopback()) {
            log.finer("Skipping network interface (ignoring loopback): " + networkInterface.getDisplayName());
            return false;
        }
        if (this.useInterfaces.size() > 0 && !this.useInterfaces.contains(networkInterface.getName())) {
            log.finer("Skipping unwanted network interface (-Dorg.fourthline.cling.network.useInterfaces): " + networkInterface.getName());
            return false;
        }
        if (networkInterface.supportsMulticast()) {
            return true;
        }
        log.warning("Network interface may not be multicast capable: " + networkInterface.getDisplayName());
        return true;
    }

    @Override // org.fourthline.cling.transport.spi.NetworkAddressFactory
    public void logInterfaceInformation() {
        synchronized (this.networkInterfaces) {
            try {
                if (this.networkInterfaces.isEmpty()) {
                    log.info("No network interface to display!");
                    return;
                }
                Iterator<NetworkInterface> it = this.networkInterfaces.iterator();
                while (it.hasNext()) {
                    try {
                        logInterfaceInformation(it.next());
                    } catch (SocketException e) {
                        log.log(Level.WARNING, "Exception while logging network interface information", (Throwable) e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean requiresNetworkInterface() {
        return true;
    }

    public NetworkAddressFactoryImpl(int i) {
        HashSet hashSet = new HashSet();
        this.useInterfaces = hashSet;
        HashSet hashSet2 = new HashSet();
        this.useAddresses = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.networkInterfaces = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.bindAddresses = arrayList2;
        System.setProperty("java.net.preferIPv4Stack", "true");
        String property = System.getProperty(NetworkAddressFactory.SYSTEM_PROPERTY_NET_IFACES);
        if (property != null) {
            hashSet.addAll(Arrays.asList(property.split(",")));
        }
        String property2 = System.getProperty(NetworkAddressFactory.SYSTEM_PROPERTY_NET_ADDRESSES);
        if (property2 != null) {
            hashSet2.addAll(Arrays.asList(property2.split(",")));
        }
        discoverNetworkInterfaces();
        discoverBindAddresses();
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            log.warning("No usable network interface or addresses found");
            if (requiresNetworkInterface()) {
                throw new NoNetworkException("Could not discover any usable network interfaces and/or addresses");
            }
        }
        this.streamListenPort = i;
    }

    public void logInterfaceInformation(NetworkInterface networkInterface) throws SocketException {
        log.info("---------------------------------------------------------------------------------");
        log.info("Interface display name: " + networkInterface.getDisplayName());
        if (networkInterface.getParent() != null) {
            log.info("Parent Info: " + networkInterface.getParent());
        }
        log.info("Name: " + networkInterface.getName());
        Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
        while (it.hasNext()) {
            log.info(String.format("InetAddress: %s", (InetAddress) it.next()));
        }
        for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
            if (interfaceAddress == null) {
                log.warning("Skipping null InterfaceAddress!");
            } else {
                log.info(" Interface Address");
                log.info("  Address: " + interfaceAddress.getAddress());
                log.info("  Broadcast: " + interfaceAddress.getBroadcast());
                log.info("  Prefix length: " + ((int) interfaceAddress.getNetworkPrefixLength()));
            }
        }
        for (NetworkInterface networkInterface2 : Collections.list(networkInterface.getSubInterfaces())) {
            if (networkInterface2 == null) {
                log.warning("Skipping null NetworkInterface sub-interface");
            } else {
                log.info("\tSub Interface Display name: " + networkInterface2.getDisplayName());
                log.info("\tSub Interface Name: " + networkInterface2.getName());
            }
        }
        log.info("Up? " + networkInterface.isUp());
        log.info("Loopback? " + networkInterface.isLoopback());
        log.info("PointToPoint? " + networkInterface.isPointToPoint());
        log.info("Supports multicast? " + networkInterface.supportsMulticast());
        log.info("Virtual? " + networkInterface.isVirtual());
        log.info("Hardware address: " + Arrays.toString(networkInterface.getHardwareAddress()));
        log.info("MTU: " + networkInterface.getMTU());
    }
}
