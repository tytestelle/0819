package androidx.constraintlayout.core.parser;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CLContainer extends CLElement {
    ArrayList<CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.mElements.add(cLElement);
        if (CLParser.DEBUG) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public CLElement get(String str) throws CLParsingException {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("no element for key <", str, ">"), this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no array found for key <", str, ">, found [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement.getStrClass());
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] : ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement);
        throw new CLParsingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString(), this);
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no boolean found for key <", str, ">, found [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement.getStrClass());
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] : ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement);
        throw new CLParsingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString(), this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no float found for key <", str, ">, found [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement.getStrClass());
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] : ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement);
        throw new CLParsingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString(), this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no int found for key <", str, ">, found [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement.getStrClass());
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] : ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement);
        throw new CLParsingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString(), this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("no object found for key <", str, ">, found [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement.getStrClass());
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] : ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(cLElement);
        throw new CLParsingException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString(), this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (cLElement != null ? cLElement.getStrClass() : null) + "] : " + cLElement, this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        for (CLElement cLElement : this.mElements) {
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (CLElement cLElement : this.mElements) {
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f) {
        put(str, new CLNumber(f));
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        for (CLElement cLElement : this.mElements) {
            if (((CLKey) cLElement).content().equals(str)) {
                arrayList.add(cLElement);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.mElements.remove((CLElement) it.next());
        }
    }

    public int size() {
        return this.mElements.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CLElement cLElement : this.mElements) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public String getStringOrNull(int i) {
        CLElement orNull = getOrNull(i);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public CLElement getOrNull(int i) {
        if (i < 0 || i >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i);
    }

    public String getString(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no string at index "), this);
    }

    public float getFloat(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no float at index "), this);
    }

    public int getInt(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no int at index "), this);
    }

    public CLArray getArray(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no array at index "), this);
    }

    public boolean getBoolean(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no boolean at index "), this);
    }

    public CLObject getObject(int i) throws CLParsingException {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no object at index "), this);
    }

    public CLElement get(int i) throws CLParsingException {
        if (i >= 0 && i < this.mElements.size()) {
            return this.mElements.get(i);
        }
        throw new CLParsingException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "no element at index "), this);
    }
}
