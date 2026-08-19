package org.fourthline.cling.binding.xml;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.seamless.xml.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public class RecoveringUDA10DeviceDescriptorBinderImpl extends UDA10DeviceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(RecoveringUDA10DeviceDescriptorBinderImpl.class.getName());

    private String fixGarbageLeadingChars(String str) {
        int iIndexOf = str.indexOf("<?xml");
        return iIndexOf == -1 ? str : str.substring(iIndexOf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:25:0x007e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.processExcHandler(ExcHandlersRegionMaker.java:154)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:77)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderImpl, org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends org.fourthline.cling.model.meta.Device> D describe(D device, String descriptorXml) throws DescriptorBindingException {
        if (descriptorXml == null) throw new DescriptorBindingException("Null descriptor");
        String current = descriptorXml;
        DescriptorBindingException last = null;
        for (int attempt = 0; attempt < 4; attempt++) {
            try { return super.describe(device, current); }
            catch (DescriptorBindingException e) {
                last = e;
                String fixed = attempt == 0 ? fixGarbageLeadingChars(current) : null;
                if (fixed != null && !fixed.equals(current)) { current = fixed; continue; }
                fixed = fixGarbageTrailingChars(current, e);
                if (fixed != null && !fixed.equals(current)) { current = fixed; continue; }
                fixed = fixMissingNamespaces(current, e);
                if (fixed != null && !fixed.equals(current)) { current = fixed; continue; }
                break;
            }
        }
        handleInvalidDescriptor(current, last);
        return null;
    }

    public String fixGarbageTrailingChars(String str, DescriptorBindingException descriptorBindingException) {
        int iIndexOf = str.indexOf("</root>");
        if (iIndexOf == -1) {
            log.warning("No closing </root> element in descriptor");
            return null;
        }
        if (str.length() == iIndexOf + 7) {
            return null;
        }
        log.warning("Detected garbage characters after <root> node, removing");
        return str.substring(0, iIndexOf) + "</root>";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[PHI: r0
  0x0044: PHI (r0v7 java.util.regex.Matcher) = (r0v6 java.util.regex.Matcher), (r0v3 java.util.regex.Matcher) binds: [B:17:0x0040, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0044, please report this as an issue */
    public String fixMissingNamespaces(String str, DescriptorBindingException descriptorBindingException) {
        String message;
        Matcher matcher;
        Throwable cause = descriptorBindingException.getCause();
        if ((!(cause instanceof SAXParseException) && !(cause instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) || (message = cause.getMessage()) == null) {
            return null;
        }
        Matcher matcher2 = Pattern.compile("The prefix \"(.*)\" for element").matcher(message);
        if (matcher2.find() && matcher2.groupCount() == 1) {
            String strGroup = matcher2.group(1);
            log.warning("Fixing missing namespace declaration for: " + strGroup);
            matcher = Pattern.compile("<root([^>]*)").matcher(str);
            if (!matcher.find()) {
            }
            log.fine("Could not find <root> element attributes");
        } else {
            matcher2 = Pattern.compile("undefined prefix: ([^ ]*)").matcher(message);
            if (matcher2.find() && matcher2.groupCount() == 1) {
                String strGroup2 = matcher2.group(1);
                log.warning("Fixing missing namespace declaration for: " + strGroup2);
                matcher = Pattern.compile("<root([^>]*)").matcher(str);
                if (!matcher.find() && matcher.groupCount() == 1) {
                    String strGroup3 = matcher.group(1);
                    log.fine("Preserving existing <root> element attributes/namespace declarations: " + matcher.group(0));
                    Matcher matcher3 = Pattern.compile("<root[^>]*>(.*)</root>", 32).matcher(str);
                    if (!matcher3.find() || matcher3.groupCount() != 1) {
                        log.fine("Could not extract body of <root> element");
                        return null;
                    }
                    String strGroup4 = matcher3.group(1);
                    StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><root ");
                    Locale locale = Locale.ROOT;
                    sb.append("xmlns:" + strGroup2 + "=\"urn:schemas-dlna-org:device-1-0\"");
                    sb.append(strGroup3);
                    sb.append(">");
                    sb.append(strGroup4);
                    sb.append("</root>");
                    return sb.toString();
                }
                log.fine("Could not find <root> element attributes");
            }
        }
        return null;
    }

    public void handleInvalidDescriptor(String str, DescriptorBindingException descriptorBindingException) throws DescriptorBindingException {
        throw descriptorBindingException;
    }

    public <D extends Device> D handleInvalidDevice(String str, D d, ValidationException validationException) throws ValidationException {
        throw validationException;
    }
}