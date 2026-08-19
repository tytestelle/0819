package org.seamless.xml;

import java.util.HashMap;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends HashMap implements NamespaceContext {
    public abstract String getDefaultNamespaceURI();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.xml.namespace.NamespaceContext
    public String getNamespaceURI(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No prefix provided!");
        }
        if (str.equals("")) {
            return getDefaultNamespaceURI();
        }
        return get(str) != 0 ? (String) get(str) : "";
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getPrefix(String str) {
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public Iterator getPrefixes(String str) {
        return null;
    }
}
