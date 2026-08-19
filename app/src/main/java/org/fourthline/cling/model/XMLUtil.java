package org.fourthline.cling.model;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public class XMLUtil {
    public static Element appendNewElement(Document document, Element element, Enum r2) {
        return appendNewElement(document, element, r2.toString());
    }

    public static Element appendNewElementIfNotNull(Document document, Element element, Enum r3, Object obj) {
        return appendNewElementIfNotNull(document, element, r3, obj, (String) null);
    }

    public static String documentToFragmentString(Document document) {
        return nodeToString(document.getDocumentElement(), new HashSet(), document.getDocumentElement().getNamespaceURI());
    }

    public static String documentToString(Document document) {
        return documentToString(document, true);
    }

    public static String encodeText(String str) {
        return encodeText(str, true);
    }

    public static String getTextContent(Node node) {
        StringBuffer stringBuffer = new StringBuffer();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 3) {
                stringBuffer.append(nodeItem.getNodeValue());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String nodeToString(Node node, Set<String> set, String str) {
        StringBuilder sb = new StringBuilder();
        if (node == null) {
            return "";
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            sb.append("<");
            sb.append(element.getNodeName());
            HashMap map = new HashMap();
            if (element.getPrefix() != null && !set.contains(element.getPrefix())) {
                map.put(element.getPrefix(), element.getNamespaceURI());
            }
            if (element.hasAttributes()) {
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node nodeItem = attributes.item(i);
                    if (!nodeItem.getNodeName().startsWith("xmlns")) {
                        if (nodeItem.getPrefix() != null && !set.contains(nodeItem.getPrefix())) {
                            map.put(nodeItem.getPrefix(), element.getNamespaceURI());
                        }
                        sb.append(" ");
                        sb.append(nodeItem.getNodeName());
                        sb.append("=\"");
                        sb.append(nodeItem.getNodeValue());
                        sb.append("\"");
                    }
                }
            }
            if (str != null && !map.containsValue(str) && !str.equals(element.getParentNode().getNamespaceURI())) {
                sb.append(" xmlns=\"");
                sb.append(str);
                sb.append("\"");
            }
            for (Map.Entry entry : map.entrySet()) {
                sb.append(" xmlns:");
                sb.append((String) entry.getKey());
                sb.append("=\"");
                sb.append((String) entry.getValue());
                sb.append("\"");
                set.add(entry.getKey());
            }
            NodeList childNodes = element.getChildNodes();
            int i2 = 0;
            while (true) {
                if (i2 >= childNodes.getLength()) {
                    sb.append("/>");
                    break;
                }
                if (childNodes.item(i2).getNodeType() != 2) {
                    sb.append(">");
                    for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                        sb.append(nodeToString(childNodes.item(i3), set, childNodes.item(i3).getNamespaceURI()));
                    }
                    sb.append("</");
                    sb.append(element.getNodeName());
                    sb.append(">");
                    break;
                }
                i2++;
            }
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                set.remove((String) it.next());
            }
        } else if (node.getNodeValue() != null) {
            sb.append(encodeText(node.getNodeValue(), node instanceof Attr));
        }
        return sb.toString();
    }

    public static Element appendNewElement(Document document, Element element, String str) {
        Element elementCreateElement = document.createElement(str);
        element.appendChild(elementCreateElement);
        return elementCreateElement;
    }

    public static Element appendNewElementIfNotNull(Document document, Element element, Enum r2, Object obj, String str) {
        return appendNewElementIfNotNull(document, element, r2.toString(), obj, str);
    }

    public static String documentToString(Document document, boolean z) {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\""), z ? "yes" : "no", "\"?>"));
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(nodeToString(document.getDocumentElement(), new HashSet(), document.getDocumentElement().getNamespaceURI()));
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    public static String encodeText(String str, boolean z) {
        String strReplaceAll = str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        return z ? strReplaceAll.replaceAll("'", "&apos;").replaceAll("\"", "&quot;") : strReplaceAll;
    }

    public static Element appendNewElementIfNotNull(Document document, Element element, String str, Object obj) {
        return appendNewElementIfNotNull(document, element, str, obj, (String) null);
    }

    public static Element appendNewElement(Document document, Element element, String str, Object obj) {
        return appendNewElement(document, element, str, obj, null);
    }

    public static Element appendNewElementIfNotNull(Document document, Element element, String str, Object obj, String str2) {
        return obj == null ? element : appendNewElement(document, element, str, obj, str2);
    }

    public static Element appendNewElement(Document document, Element element, String str, Object obj, String str2) {
        Element elementCreateElement;
        if (str2 != null) {
            elementCreateElement = document.createElementNS(str2, str);
        } else {
            elementCreateElement = document.createElement(str);
        }
        if (obj != null) {
            elementCreateElement.appendChild(document.createTextNode(obj.toString()));
        }
        element.appendChild(elementCreateElement);
        return elementCreateElement;
    }
}
