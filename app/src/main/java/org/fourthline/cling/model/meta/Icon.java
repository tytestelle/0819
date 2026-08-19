package org.fourthline.cling.model.meta;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.types.BinHexDatatype;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import org.seamless.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.seamless.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class Icon implements Validatable {
    private static final Logger log = Logger.getLogger(StateVariable.class.getName());
    private final byte[] data;
    private final int depth;
    private Device device;
    private final int height;
    private final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO mimeType;
    private final URI uri;
    private final int width;

    public Icon(String str, int i, int i2, int i3, URI uri) {
        this((str == null || str.length() <= 0) ? null : O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str), i, i2, i3, uri, (byte[]) null);
    }

    public Icon deepCopy() {
        return new Icon(getMimeType(), getWidth(), getHeight(), getDepth(), getUri(), getData());
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDepth() {
        return this.depth;
    }

    public Device getDevice() {
        return this.device;
    }

    public int getHeight() {
        return this.height;
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO getMimeType() {
        return this.mimeType;
    }

    public URI getUri() {
        return this.uri;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDevice(Device device) {
        if (this.device != null) {
            throw new IllegalStateException("Final value has been set already, model is immutable");
        }
        this.device = device;
    }

    public String toString() {
        return "Icon(" + getWidth() + "x" + getHeight() + ", MIME: " + getMimeType() + ") " + getUri();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (getMimeType() == null) {
            Logger logger = log;
            logger.warning("UPnP specification violation of: " + getDevice());
            logger.warning("Invalid icon, missing mime type: " + this);
        }
        if (getWidth() == 0) {
            Logger logger2 = log;
            logger2.warning("UPnP specification violation of: " + getDevice());
            logger2.warning("Invalid icon, missing width: " + this);
        }
        if (getHeight() == 0) {
            Logger logger3 = log;
            logger3.warning("UPnP specification violation of: " + getDevice());
            logger3.warning("Invalid icon, missing height: " + this);
        }
        if (getDepth() == 0) {
            Logger logger4 = log;
            logger4.warning("UPnP specification violation of: " + getDevice());
            logger4.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (getUri() == null) {
            arrayList.add(new ValidationError(getClass(), "uri", "URL is required"));
        } else {
            try {
                if (getUri().toURL() == null) {
                    throw new MalformedURLException();
                }
            } catch (IllegalArgumentException unused) {
            } catch (MalformedURLException e) {
                arrayList.add(new ValidationError(getClass(), "uri", "URL must be valid: " + e.getMessage()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Icon(String str, int i, int i2, int i3, URL url) {
        URI uri;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4517O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (url == null) {
            uri = null;
        } else {
            try {
                uri = url.toURI();
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
        this(str, i, i2, i3, new File(uri));
    }

    public Icon(String str, int i, int i2, int i3, File file) throws IOException {
        String name = file.getName();
        int i4 = O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f2123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(fileInputStream);
            fileInputStream.close();
            this(str, i, i2, i3, name, bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public Icon(String str, int i, int i2, int i3, String str2, InputStream inputStream) {
        this(str, i, i2, i3, str2, O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream));
    }

    public Icon(String str, int i, int i2, int i3, String str2, byte[] bArr) {
        this((str == null || str.length() <= 0) ? null : O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str), i, i2, i3, URI.create(str2), bArr);
    }

    public Icon(String str, int i, int i2, int i3, String str2, String str3) {
        this(str, i, i2, i3, str2, (str3 == null || str3.equals("")) ? null : new BinHexDatatype().valueOf(str3));
    }

    public Icon(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, int i, int i2, int i3, URI uri, byte[] bArr) {
        this.mimeType = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.width = i;
        this.height = i2;
        this.depth = i3;
        this.uri = uri;
        this.data = bArr;
    }
}
