package org.seamless.xml;

import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/* JADX INFO: loaded from: classes2.dex */
public class O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    private final XMLReader xr = create();
    private static final Logger log = Logger.getLogger(O00000OOoOOO00O00o0ooooooooO000ooooO0000.class.getName());
    public static final URI XML_SCHEMA_NAMESPACE = URI.create("http://www.w3.org/2001/xml.xsd");
    public static final URL XML_SCHEMA_RESOURCE = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    public XMLReader create() {
        try {
            if (getSchemaSources() == null) {
                return XMLReaderFactory.createXMLReader();
            }
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            sAXParserFactoryNewInstance.setSchema(createSchema(getSchemaSources()));
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(getErrorHandler());
            return xMLReader;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Schema createSchema(Source[] sourceArr) {
        try {
            SchemaFactory schemaFactoryNewInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            schemaFactoryNewInstance.setResourceResolver(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this)));
            return schemaFactoryNewInstance.newSchema(sourceArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ErrorHandler getErrorHandler() {
        return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
    }

    public Source[] getSchemaSources() {
        return null;
    }

    public void parse(InputSource inputSource) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        try {
            this.xr.parse(inputSource);
        } catch (Exception e) {
            throw new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(e);
        }
    }

    public void setContentHandler(ContentHandler contentHandler) {
        this.xr.setContentHandler(contentHandler);
    }
}
