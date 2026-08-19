package O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Serializable {
    private static final long serialVersionUID = -2356139899636767776L;
    public transient MediaType contentType;
    public File file;
    public String fileName;
    public long fileSize;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(File file, String str, MediaType mediaType) {
        this.file = file;
        this.fileName = str;
        this.contentType = mediaType;
        this.fileSize = file.length();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.contentType = MediaType.parse((String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.contentType.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileWrapper{file=");
        sb.append(this.file);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", fileSize=");
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sb, this.fileSize, "}");
    }
}
