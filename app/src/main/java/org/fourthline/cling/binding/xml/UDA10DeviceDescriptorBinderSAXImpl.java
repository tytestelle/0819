package org.fourthline.cling.binding.xml;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.binding.staging.MutableDevice;
import org.fourthline.cling.binding.staging.MutableIcon;
import org.fourthline.cling.binding.staging.MutableService;
import org.fourthline.cling.binding.staging.MutableUDAVersion;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.types.DLNACaps;
import org.fourthline.cling.model.types.DLNADoc;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import org.seamless.xml.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class UDA10DeviceDescriptorBinderSAXImpl extends UDA10DeviceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(DeviceDescriptorBinder.class.getName());

    /* JADX INFO: renamed from: org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT;

        static {
            int[] iArr = new int[Descriptor.Device.ELEMENT.values().length];
            $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT = iArr;
            try {
                iArr[Descriptor.Device.ELEMENT.URLBase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.major.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.minor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.deviceType.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.friendlyName.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.manufacturer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.manufacturerURL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.modelDescription.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.modelName.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.modelNumber.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.modelURL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.presentationURL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.UPC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.serialNumber.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.UDN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.X_DLNADOC.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.X_DLNACAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.width.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.height.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.depth.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.url.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.mimetype.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.serviceType.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.serviceId.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.SCPDURL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.controlURL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[Descriptor.Device.ELEMENT.eventSubURL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static class DeviceDescriptorHandler<I> extends O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {
        public DeviceDescriptorHandler(I i) {
            super(i, null, null);
        }

        public void endElement(Descriptor.Device.ELEMENT element) {
        }

        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return false;
        }

        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
        }

        public DeviceDescriptorHandler(I i, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            super(i, o00000OOoOOO00O00o0ooooooooO000ooooO0000, null);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            super.endElement(str, str2, str3);
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            endElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
        public boolean isLastElement(String str, String str2, String str3) {
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            return elementValueOrNullOf != null && isLastElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            super.startElement(str, str2, str3, attributes);
            Descriptor.Device.ELEMENT elementValueOrNullOf = Descriptor.Device.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            startElement(elementValueOrNullOf, attributes);
        }

        public DeviceDescriptorHandler(I i, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(i, deviceDescriptorHandler);
        }

        public DeviceDescriptorHandler(I i, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(i, o00000OOoOOO00O00o0ooooooooO000ooooO0000, deviceDescriptorHandler);
        }
    }

    public static class DeviceHandler extends DeviceDescriptorHandler<MutableDevice> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.device;

        public DeviceHandler(MutableDevice mutableDevice, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableDevice, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) {
            switch (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[element.ordinal()]) {
                case 4:
                    ((MutableDevice) getInstance()).deviceType = getCharacters();
                    break;
                case 5:
                    ((MutableDevice) getInstance()).friendlyName = getCharacters();
                    break;
                case 6:
                    ((MutableDevice) getInstance()).manufacturer = getCharacters();
                    break;
                case 7:
                    ((MutableDevice) getInstance()).manufacturerURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 8:
                    ((MutableDevice) getInstance()).modelDescription = getCharacters();
                    break;
                case 9:
                    ((MutableDevice) getInstance()).modelName = getCharacters();
                    break;
                case 10:
                    ((MutableDevice) getInstance()).modelNumber = getCharacters();
                    break;
                case 11:
                    ((MutableDevice) getInstance()).modelURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 12:
                    ((MutableDevice) getInstance()).presentationURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 13:
                    ((MutableDevice) getInstance()).upc = getCharacters();
                    break;
                case 14:
                    ((MutableDevice) getInstance()).serialNumber = getCharacters();
                    break;
                case 15:
                    ((MutableDevice) getInstance()).udn = UDN.valueOf(getCharacters());
                    break;
                case 16:
                    String characters = getCharacters();
                    try {
                        ((MutableDevice) getInstance()).dlnaDocs.add(DLNADoc.valueOf(characters));
                    } catch (InvalidValueException unused) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.info("Invalid X_DLNADOC value, ignoring value: " + characters);
                        return;
                    }
                    break;
                case 17:
                    ((MutableDevice) getInstance()).dlnaCaps = DLNACaps.valueOf(getCharacters());
                    break;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
            if (element.equals(IconListHandler.EL)) {
                ArrayList arrayList = new ArrayList();
                ((MutableDevice) getInstance()).icons = arrayList;
                new IconListHandler(arrayList, this);
            }
            if (element.equals(ServiceListHandler.EL)) {
                ArrayList arrayList2 = new ArrayList();
                ((MutableDevice) getInstance()).services = arrayList2;
                new ServiceListHandler(arrayList2, this);
            }
            if (element.equals(DeviceListHandler.EL)) {
                ArrayList arrayList3 = new ArrayList();
                ((MutableDevice) getInstance()).embeddedDevices = arrayList3;
                new DeviceListHandler(arrayList3, this);
            }
        }
    }

    public static class DeviceListHandler extends DeviceDescriptorHandler<List<MutableDevice>> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.deviceList;

        public DeviceListHandler(List<MutableDevice> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
            if (element.equals(DeviceHandler.EL)) {
                MutableDevice mutableDevice = new MutableDevice();
                ((List) getInstance()).add(mutableDevice);
                new DeviceHandler(mutableDevice, this);
            }
        }
    }

    public static class IconHandler extends DeviceDescriptorHandler<MutableIcon> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.icon;

        public IconHandler(MutableIcon mutableIcon, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableIcon, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) {
            switch (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[element.ordinal()]) {
                case 18:
                    ((MutableIcon) getInstance()).width = Integer.valueOf(getCharacters()).intValue();
                    break;
                case 19:
                    ((MutableIcon) getInstance()).height = Integer.valueOf(getCharacters()).intValue();
                    break;
                case 20:
                    try {
                        ((MutableIcon) getInstance()).depth = Integer.valueOf(getCharacters()).intValue();
                    } catch (NumberFormatException e) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.warning("Invalid icon depth '" + getCharacters() + "', using 16 as default: " + e);
                        ((MutableIcon) getInstance()).depth = 16;
                        return;
                    }
                    break;
                case 21:
                    ((MutableIcon) getInstance()).uri = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                    break;
                case 22:
                    try {
                        ((MutableIcon) getInstance()).mimeType = getCharacters();
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((MutableIcon) getInstance()).mimeType);
                    } catch (IllegalArgumentException unused) {
                        UDA10DeviceDescriptorBinderSAXImpl.log.warning("Ignoring invalid icon mime type: " + ((MutableIcon) getInstance()).mimeType);
                        ((MutableIcon) getInstance()).mimeType = "";
                        return;
                    }
                    break;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }
    }

    public static class IconListHandler extends DeviceDescriptorHandler<List<MutableIcon>> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.iconList;

        public IconListHandler(List<MutableIcon> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
            if (element.equals(IconHandler.EL)) {
                MutableIcon mutableIcon = new MutableIcon();
                ((List) getInstance()).add(mutableIcon);
                new IconHandler(mutableIcon, this);
            }
        }
    }

    public static class RootHandler extends DeviceDescriptorHandler<MutableDevice> {
        public RootHandler(MutableDevice mutableDevice, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            super(mutableDevice, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) throws SAXException {
            if (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[element.ordinal()] != 1) {
                return;
            }
            try {
                String characters = getCharacters();
                if (characters == null || characters.length() <= 0) {
                    return;
                }
                ((MutableDevice) getInstance()).baseURL = new URL(characters);
            } catch (Exception e) {
                throw new SAXException("Invalid URLBase: " + e.toString());
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
            if (element.equals(SpecVersionHandler.EL)) {
                MutableUDAVersion mutableUDAVersion = new MutableUDAVersion();
                ((MutableDevice) getInstance()).udaVersion = mutableUDAVersion;
                new SpecVersionHandler(mutableUDAVersion, this);
            }
            if (element.equals(DeviceHandler.EL)) {
                new DeviceHandler((MutableDevice) getInstance(), this);
            }
        }
    }

    public static class ServiceHandler extends DeviceDescriptorHandler<MutableService> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.service;

        public ServiceHandler(MutableService mutableService, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableService, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) {
            try {
                switch (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[element.ordinal()]) {
                    case 23:
                        ((MutableService) getInstance()).serviceType = ServiceType.valueOf(getCharacters());
                        break;
                    case 24:
                        ((MutableService) getInstance()).serviceId = ServiceId.valueOf(getCharacters());
                        break;
                    case 25:
                        ((MutableService) getInstance()).descriptorURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                    case 26:
                        ((MutableService) getInstance()).controlURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                    case 27:
                        ((MutableService) getInstance()).eventSubscriptionURI = UDA10DeviceDescriptorBinderImpl.parseURI(getCharacters());
                        break;
                }
            } catch (InvalidValueException e) {
                UDA10DeviceDescriptorBinderSAXImpl.log.warning("UPnP specification violation, skipping invalid service declaration. " + e.getMessage());
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }
    }

    public static class ServiceListHandler extends DeviceDescriptorHandler<List<MutableService>> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.serviceList;

        public ServiceListHandler(List<MutableService> list, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(list, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            boolean zEquals = element.equals(EL);
            if (zEquals) {
                Iterator it = ((List) getInstance()).iterator();
                while (it.hasNext()) {
                    MutableService mutableService = (MutableService) it.next();
                    if (mutableService.serviceType == null || mutableService.serviceId == null) {
                        it.remove();
                    }
                }
            }
            return zEquals;
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void startElement(Descriptor.Device.ELEMENT element, Attributes attributes) {
            if (element.equals(ServiceHandler.EL)) {
                MutableService mutableService = new MutableService();
                ((List) getInstance()).add(mutableService);
                new ServiceHandler(mutableService, this);
            }
        }
    }

    public static class SpecVersionHandler extends DeviceDescriptorHandler<MutableUDAVersion> {
        public static final Descriptor.Device.ELEMENT EL = Descriptor.Device.ELEMENT.specVersion;

        public SpecVersionHandler(MutableUDAVersion mutableUDAVersion, DeviceDescriptorHandler deviceDescriptorHandler) {
            super(mutableUDAVersion, deviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public void endElement(Descriptor.Device.ELEMENT element) {
            int i = AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Device$ELEMENT[element.ordinal()];
            if (i == 2) {
                String strTrim = getCharacters().trim();
                if (!strTrim.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    UDA10DeviceDescriptorBinderSAXImpl.log.warning("Unsupported UDA major version, ignoring: ".concat(strTrim));
                    strTrim = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                }
                ((MutableUDAVersion) getInstance()).major = Integer.valueOf(strTrim).intValue();
                return;
            }
            if (i != 3) {
                return;
            }
            String strTrim2 = getCharacters().trim();
            if (!strTrim2.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                UDA10DeviceDescriptorBinderSAXImpl.log.warning("Unsupported UDA minor version, ignoring: ".concat(strTrim2));
                strTrim2 = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            ((MutableUDAVersion) getInstance()).minor = Integer.valueOf(strTrim2).intValue();
        }

        @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderSAXImpl.DeviceDescriptorHandler
        public boolean isLastElement(Descriptor.Device.ELEMENT element) {
            return element.equals(EL);
        }
    }

    @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderImpl, org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends Device> D describe(D d, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            log.fine("Populating device from XML descriptor: " + d);
            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            MutableDevice mutableDevice = new MutableDevice();
            new RootHandler(mutableDevice, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.parse(new InputSource(new StringReader(str.trim())));
            return (D) mutableDevice.build(d);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse device descriptor: " + e2.toString(), e2);
        }
    }
}
