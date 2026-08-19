package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable {
    private final RandomAccessFile a;
    private final File b;
    private final byte[] c;
    private boolean d;

    public c(File file) {
        this.c = new byte[8];
        this.b = file;
        this.a = new RandomAccessFile(file, "r");
    }

    public final int a(byte[] bArr) {
        return this.a.read(bArr);
    }

    public final int b() throws IOException {
        int i = this.a.readInt();
        if (!this.d) {
            return i;
        }
        return ((i & (-16777216)) >>> 24) | ((i & 255) << 24) | ((65280 & i) << 8) | ((16711680 & i) >>> 8);
    }

    public final long c() throws IOException {
        if (!this.d) {
            return this.a.readLong();
        }
        this.a.readFully(this.c, 0, 8);
        byte[] bArr = this.c;
        return ((long) (bArr[0] & 255)) | (((long) bArr[7]) << 56) | (((long) (bArr[6] & 255)) << 48) | (((long) (bArr[5] & 255)) << 40) | (((long) (bArr[4] & 255)) << 32) | (((long) (bArr[3] & 255)) << 24) | (((long) (bArr[2] & 255)) << 16) | (((long) (bArr[1] & 255)) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public c(String str) {
        this(new File(str));
    }

    public final int a(char[] cArr) throws IOException {
        byte[] bArr = new byte[cArr.length];
        int i = this.a.read(bArr);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = (char) bArr[i2];
        }
        return i;
    }

    public final short a() throws IOException {
        short s = this.a.readShort();
        if (!this.d) {
            return s;
        }
        return (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
    }

    public void a(long j) throws IOException {
        this.a.seek(j);
    }

    public void a(boolean z) {
        this.d = z;
    }
}
