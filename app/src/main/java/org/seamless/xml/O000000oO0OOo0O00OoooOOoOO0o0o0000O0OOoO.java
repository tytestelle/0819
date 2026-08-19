package org.seamless.xml;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    private Element element;
    private final XPath xpath;
    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 PARENT_BUILDER = createParentBuilder(this);
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo CHILD_BUILDER = createChildBuilder(this);

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(XPath xPath, Element element) {
        this.xpath = xPath;
        this.element = element;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO adoptOrImport(Document document, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, boolean z) {
        if (document != null) {
            return z ? this.CHILD_BUILDER.build((Element) document.importNode(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getW3CElement(), true)) : this.CHILD_BUILDER.build((Element) document.adoptNode(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getW3CElement()));
        }
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO appendChild(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, boolean z) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport = adoptOrImport(getW3CElement().getOwnerDocument(), o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, z);
        getW3CElement().appendChild(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport.getW3CElement());
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO createChild(String str) {
        return createChild(str, null);
    }

    public abstract O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo createChildBuilder(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);

    public abstract O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 createParentBuilder(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO findChildWithIdentifier(String str) {
        Collection<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> xPathChildElements = getXPathChildElements(this.CHILD_BUILDER, "descendant::" + prefix("*") + "[@id=\"" + str + "\"]");
        if (xPathChildElements.size() == 1) {
            return xPathChildElements.iterator().next();
        }
        return null;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] findChildren(String str) {
        Collection<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> xPathChildElements = getXPathChildElements(this.CHILD_BUILDER, "descendant::" + prefix(str));
        return (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[]) xPathChildElements.toArray(this.CHILD_BUILDER.newChildrenArray(xPathChildElements.size()));
    }

    public String getAttribute(String str) {
        String attribute = getW3CElement().getAttribute(str);
        if (attribute.length() > 0) {
            return attribute;
        }
        return null;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] getChildren() {
        NodeList childNodes = getW3CElement().getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                arrayList.add(this.CHILD_BUILDER.build((Element) nodeItem));
            }
        }
        return (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[]) arrayList.toArray(this.CHILD_BUILDER.newChildrenArray(arrayList.size()));
    }

    public String getContent() {
        return getW3CElement().getTextContent();
    }

    public String getElementName() {
        return getW3CElement().getNodeName();
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getFirstChild(String str) {
        return getXPathChildElement(this.CHILD_BUILDER, prefix(str) + "[1]");
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getParent() {
        return this.PARENT_BUILDER.build((Element) getW3CElement().getParentNode());
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getRequiredChild(String str) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] children = getChildren(str);
        if (children.length == 1) {
            return children[0];
        }
        throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO("Required single child element of '" + getElementName() + "' not found: " + str);
    }

    public Element getW3CElement() {
        return this.element;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getXPathChildElement(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        Node node = (Node) getXPathResult(getW3CElement(), str, XPathConstants.NODE);
        if (node == null || node.getNodeType() != 1) {
            return null;
        }
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.build((Element) node);
    }

    public Collection<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> getXPathChildElements(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        return getXPathElements(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, str);
    }

    public Collection getXPathElements(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        ArrayList arrayList = new ArrayList();
        NodeList nodeList = (NodeList) getXPathResult(getW3CElement(), str, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            arrayList.add(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.build((Element) nodeList.item(i)));
        }
        return arrayList;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO getXPathParentElement(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        Node node = (Node) getXPathResult(getW3CElement(), str, XPathConstants.NODE);
        if (node == null || node.getNodeType() != 1) {
            return null;
        }
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.build((Element) node);
    }

    public Collection<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> getXPathParentElements(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        return getXPathElements(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, str);
    }

    public Object getXPathResult(String str, QName qName) {
        return getXPathResult(getW3CElement(), str, qName);
    }

    public String getXPathString(XPath xPath, String str) {
        return getXPathResult(getW3CElement(), str, null).toString();
    }

    public XPath getXpath() {
        return this.xpath;
    }

    public abstract String prefix(String str);

    public void removeChild(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        getW3CElement().removeChild(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getW3CElement());
    }

    public void removeChildren() {
        NodeList childNodes = getW3CElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            getW3CElement().removeChild(childNodes.item(i));
        }
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO replaceChild(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, boolean z) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport = adoptOrImport(getW3CElement().getOwnerDocument(), o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, z);
        getW3CElement().replaceChild(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport.getW3CElement(), o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getW3CElement());
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOAdoptOrImport;
    }

    public void replaceEqualChild(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, String str) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOFindChildWithIdentifier = findChildWithIdentifier(str);
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOFindChildWithIdentifier.getParent().replaceChild(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOFindChildWithIdentifier, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.findChildWithIdentifier(str), true);
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO setAttribute(String str, String str2) {
        getW3CElement().setAttribute(str, str2);
        return this;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO setContent(String str) {
        getW3CElement().setTextContent(str);
        return this;
    }

    public String toSimpleXMLString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getElementName());
        NamedNodeMap attributes = getW3CElement().getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node nodeItem = attributes.item(i);
            sb.append(" ");
            sb.append(nodeItem.getNodeName());
            sb.append("=\"");
            sb.append(nodeItem.getTextContent());
            sb.append("\"");
        }
        if (getContent().length() > 0) {
            sb.append(">");
            sb.append(getContent());
            sb.append("</");
            sb.append(getElementName());
            sb.append(">");
        } else {
            sb.append("/>");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(getClass().getSimpleName());
        sb.append(") ");
        sb.append(getW3CElement() == null ? "UNBOUND" : getElementName());
        return sb.toString();
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO createChild(String str, String str2) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOBuild = this.CHILD_BUILDER.build(str2 == null ? getW3CElement().getOwnerDocument().createElement(str) : getW3CElement().getOwnerDocument().createElementNS(str2, str));
        getW3CElement().appendChild(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOBuild.getW3CElement());
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOBuild;
    }

    public Object getXPathResult(Node node, String str, QName qName) {
        try {
            return qName == null ? this.xpath.evaluate(str, node) : this.xpath.evaluate(str, node, qName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] getChildren(String str) {
        Collection<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> xPathChildElements = getXPathChildElements(this.CHILD_BUILDER, prefix(str));
        return (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[]) xPathChildElements.toArray(this.CHILD_BUILDER.newChildrenArray(xPathChildElements.size()));
    }
}
