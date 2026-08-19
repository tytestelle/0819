package org.seamless.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements ErrorHandler, EntityResolver {
    protected Schema schema;
    protected Source[] schemaSources = null;
    private static Logger log = Logger.getLogger(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.class.getName());
    public static final URL XML_SCHEMA_RESOURCE = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    public static void accept(Node node, O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        if (node == null) {
            return;
        }
        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getClass();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                CDATASection cDATASection = (CDATASection) nodeItem;
                cDATASection.getParentNode().setTextContent(cDATASection.getData());
            }
            accept(nodeItem, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        }
    }

    public static String escape(String str) {
        return escape(str, false, false);
    }

    public static String stripElements(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("<([a-zA-Z]|/).*?>", "");
    }

    public static String wrap(String str, String str2) {
        return wrap(str, null, str2);
    }

    public abstract O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o createDOM(Document document);

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o createDocument() {
        try {
            return createDOM(createFactory(false).newDocumentBuilder().newDocument());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DocumentBuilderFactory createFactory(boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            if (z) {
                documentBuilderFactoryNewInstance.setXIncludeAware(true);
                documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/xinclude/fixup-base-uris", false);
                documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/xinclude/fixup-language", false);
                documentBuilderFactoryNewInstance.setSchema(getSchema());
                documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/validation/dynamic", true);
            }
            return documentBuilderFactoryNewInstance;
        } catch (ParserConfigurationException e) {
            throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(e);
        }
    }

    public Transformer createTransformer(String str, int i, boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            if (i > 0) {
                try {
                    transformerFactoryNewInstance.setAttribute("indent-number", Integer.valueOf(i));
                } catch (IllegalArgumentException unused) {
                }
            }
            Transformer transformerNewTransformer = transformerFactoryNewInstance.newTransformer();
            transformerNewTransformer.setOutputProperty("omit-xml-declaration", z ? "no" : "yes");
            if (z) {
                try {
                    transformerNewTransformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
                } catch (IllegalArgumentException unused2) {
                }
            }
            transformerNewTransformer.setOutputProperty("indent", i > 0 ? "yes" : "no");
            if (i > 0) {
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(i));
            }
            transformerNewTransformer.setOutputProperty("method", str);
            return transformerNewTransformer;
        } catch (Exception e) {
            throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(e);
        }
    }

    public XPath createXPath(NamespaceContext namespaceContext) {
        XPath xPathNewXPath = createXPathFactory().newXPath();
        xPathNewXPath.setNamespaceContext(namespaceContext);
        return xPathNewXPath;
    }

    public XPathFactory createXPathFactory() {
        return XPathFactory.newInstance();
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sAXParseException));
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sAXParseException));
    }

    public Schema getSchema() {
        if (this.schema == null) {
            try {
                SchemaFactory schemaFactoryNewInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
                schemaFactoryNewInstance.setResourceResolver(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this)));
                Source[] sourceArr = this.schemaSources;
                if (sourceArr != null) {
                    this.schema = schemaFactoryNewInstance.newSchema(sourceArr);
                } else {
                    this.schema = schemaFactoryNewInstance.newSchema();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return this.schema;
    }

    public Object getXPathResult(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, XPath xPath, String str, QName qName) {
        return getXPathResult(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getW3CDocument(), xPath, str, qName);
    }

    public boolean isIgnorableWSNode(Node node) {
        return node.getNodeType() == 3 && node.getTextContent().matches("[\\t\\n\\x0B\\f\\r\\s]+");
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(URL url) {
        return parse(url, true);
    }

    public String print(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        return print(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 4, true);
    }

    public String printHTML(Document document) {
        return printHTML(document, 4, true, true);
    }

    public void removeIgnorableWSNodes(Element element) {
        Node firstChild = element.getFirstChild();
        while (firstChild != null) {
            Node nextSibling = firstChild.getNextSibling();
            if (isIgnorableWSNode(firstChild)) {
                element.removeChild(firstChild);
            } else if (firstChild.getNodeType() == 1) {
                removeIgnorableWSNodes((Element) firstChild);
            }
            firstChild = nextSibling;
        }
    }

    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) {
        InputSource inputSource = str2.startsWith("file://") ? new InputSource(new FileInputStream(new File(URI.create(str2)))) : new InputSource(new ByteArrayInputStream(new byte[0]));
        inputSource.setPublicId(str);
        inputSource.setSystemId(str2);
        return inputSource;
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO unwrapException(Exception exc) {
        return (exc.getCause() == null || !(exc.getCause() instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) ? new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(exc) : (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) exc.getCause();
    }

    public void validate(URL url) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        if (url == null) {
            throw new IllegalArgumentException("Can't validate null URL");
        }
        log.fine("Validating XML of URL: " + url);
        validate(new StreamSource(url.toString()));
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        log.warning(sAXParseException.toString());
    }

    public static String escape(String str, boolean z, boolean z2) {
        String str2;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&#34;";
            } else if (cCharAt == '&') {
                str2 = "&#38;";
            } else if (cCharAt != '<') {
                str2 = cCharAt != '>' ? null : "&#62;";
            } else {
                str2 = "&#60;";
            }
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (z2) {
            Matcher matcher = Pattern.compile("(\\n+)(\\s*)(.*)").matcher(string);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(2);
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < strGroup.length(); i2++) {
                    sb2.append("&#160;");
                }
                matcher.appendReplacement(stringBuffer, "$1" + sb2.toString() + "$3");
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        return z ? string.replaceAll("\n", "<br/>") : string;
    }

    public static String wrap(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        if (str2 != null) {
            sb.append(" xmlns=\"");
            sb.append(str2);
            sb.append("\"");
        }
        sb.append(">");
        sb.append(str3);
        sb.append("</");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }

    public Object getXPathResult(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, XPath xPath, String str, QName qName) {
        return getXPathResult(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getW3CElement(), xPath, str, qName);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(String str) {
        return parse(str, true);
    }

    public String print(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, int i) {
        return print(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, i, true);
    }

    public String printHTML(Document document, int i, boolean z, boolean z2) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        Document document2 = (Document) document.cloneNode(true);
        Element documentElement = document2.getDocumentElement();
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f4522O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (short) 4;
        accept(documentElement, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        removeIgnorableWSNodes(document2.getDocumentElement());
        try {
            Transformer transformerCreateTransformer = createTransformer("html", i, z);
            if (z2) {
                transformerCreateTransformer.setOutputProperty("doctype-public", "-//W3C//DTD HTML 4.01 Transitional//EN");
                transformerCreateTransformer.setOutputProperty("doctype-system", "http://www.w3.org/TR/html4/loose.dtd");
            }
            StringWriter stringWriter = new StringWriter();
            transformerCreateTransformer.transform(new DOMSource(document2), new StreamResult(stringWriter));
            stringWriter.flush();
            return stringWriter.toString().replaceFirst("\\s*<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">", "").replaceFirst("<html xmlns=\"http://www.w3.org/1999/xhtml\">", "<html>");
        } catch (Exception e) {
            throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(e);
        }
    }

    public XPath createXPath(XPathFactory xPathFactory, NamespaceContext namespaceContext) {
        XPath xPathNewXPath = xPathFactory.newXPath();
        xPathNewXPath.setNamespaceContext(namespaceContext);
        return xPathNewXPath;
    }

    public Object getXPathResult(Node node, XPath xPath, String str, QName qName) {
        try {
            log.fine("Evaluating xpath query: " + str);
            return xPath.evaluate(str, node, qName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(File file) {
        return parse(file, true);
    }

    public String print(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, boolean z) {
        return print(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 4, z);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(InputStream inputStream) {
        return parse(inputStream, true);
    }

    public String print(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, int i, boolean z) {
        return print(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getW3CDocument(), i, z);
    }

    public void validate(String str) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        if (str != null) {
            log.fine("Validating XML string characters: " + str.length());
            validate(new SAXSource(new InputSource(new StringReader(str))));
            return;
        }
        throw new IllegalArgumentException("Can't validate null string");
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(URL url, boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        if (url != null) {
            try {
                return parse(url.openStream(), z);
            } catch (Exception e) {
                throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO("Parsing URL failed: " + url, e);
            }
        }
        throw new IllegalArgumentException("Can't parse null URL");
    }

    public String print(Document document, int i, boolean z) {
        removeIgnorableWSNodes(document.getDocumentElement());
        return print(new DOMSource(document.getDocumentElement()), i, z);
    }

    public String print(String str, int i, boolean z) {
        return print(new StreamSource(new StringReader(str)), i, z);
    }

    public void validate(Document document) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        validate(new DOMSource(document));
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(String str, boolean z) {
        if (str != null) {
            return parse(new InputSource(new StringReader(str)), z);
        }
        throw new IllegalArgumentException("Can't parse null string");
    }

    public String print(Source source, int i, boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        try {
            Transformer transformerCreateTransformer = createTransformer("xml", i, z);
            transformerCreateTransformer.setOutputProperty("encoding", "utf-8");
            StringWriter stringWriter = new StringWriter();
            transformerCreateTransformer.transform(source, new StreamResult(stringWriter));
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e) {
            throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(e);
        }
    }

    public void validate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        validate(new DOMSource(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getW3CDocument()));
    }

    public void validate(Source source) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        try {
            Validator validatorNewValidator = getSchema().newValidator();
            validatorNewValidator.setErrorHandler(this);
            validatorNewValidator.validate(source);
        } catch (Exception e) {
            throw unwrapException(e);
        }
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(File file, boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        if (file != null) {
            try {
                return parse(file.toURI().toURL(), z);
            } catch (Exception e) {
                throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO("Parsing file failed: " + file, e);
            }
        }
        throw new IllegalArgumentException("Can't parse null file");
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(InputStream inputStream, boolean z) {
        return parse(new InputSource(inputStream), z);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parse(InputSource inputSource, boolean z) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = createFactory(z).newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setEntityResolver(this);
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            Document document = documentBuilderNewDocumentBuilder.parse(inputSource);
            document.normalizeDocument();
            return createDOM(document);
        } catch (Exception e) {
            throw unwrapException(e);
        }
    }
}
