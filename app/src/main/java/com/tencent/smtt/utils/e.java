package com.tencent.smtt.utils;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UnknownFormatConversionException;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Closeable {
    static final char[] a = {127, 'E', 'L', 'F', 0};
    final char[] b;
    boolean c;
    j[] d;
    l[] e;
    byte[] f;
    private final com.tencent.smtt.utils.c g;
    private final a h;
    private final k[] i;
    private byte[] j;

    public static abstract class a {
        short a;
        short b;
        int c;
        int d;
        short e;
        short f;
        short g;
        short h;
        short i;
        short j;

        public abstract long a();

        public abstract long b();
    }

    public static class b extends a {
        int k;
        int l;
        int m;

        @Override // com.tencent.smtt.utils.e.a
        public long a() {
            return this.m;
        }

        @Override // com.tencent.smtt.utils.e.a
        public long b() {
            return this.l;
        }
    }

    public static class c extends j {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
    }

    public static class d extends k {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return this.d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.c;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$e, reason: collision with other inner class name */
    public static class C0020e extends l {
        int a;
        int b;
    }

    public static class f extends a {
        long k;
        long l;
        long m;

        @Override // com.tencent.smtt.utils.e.a
        public long a() {
            return this.m;
        }

        @Override // com.tencent.smtt.utils.e.a
        public long b() {
            return this.l;
        }
    }

    public static class g extends j {
        long a;
        long b;
        long c;
        long d;
        long e;
        long f;
    }

    public static class h extends k {
        long a;
        long b;
        long c;
        long d;
        long e;
        long f;

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return (int) this.d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.c;
        }
    }

    public static class i extends l {
        long a;
        long b;
    }

    public static abstract class j {
        int g;
        int h;
    }

    public static abstract class k {
        int g;
        int h;
        int i;
        int j;

        public abstract int a();

        public abstract long b();
    }

    public static abstract class l {
        int c;
        char d;
        char e;
        short f;
    }

    public e(File file) throws IOException {
        a aVar;
        char[] cArr = new char[16];
        this.b = cArr;
        com.tencent.smtt.utils.c cVar = new com.tencent.smtt.utils.c(file);
        this.g = cVar;
        cVar.a(cArr);
        if (!a()) {
            throw new UnknownFormatConversionException("Invalid elf magic: " + file);
        }
        cVar.a(e());
        boolean zD = d();
        if (zD) {
            f fVar = new f();
            fVar.a = cVar.a();
            fVar.b = cVar.a();
            fVar.c = cVar.b();
            fVar.k = cVar.c();
            fVar.l = cVar.c();
            fVar.m = cVar.c();
            aVar = fVar;
        } else {
            b bVar = new b();
            bVar.a = cVar.a();
            bVar.b = cVar.a();
            bVar.c = cVar.b();
            bVar.k = cVar.b();
            bVar.l = cVar.b();
            bVar.m = cVar.b();
            aVar = bVar;
        }
        this.h = aVar;
        a aVar2 = this.h;
        aVar2.d = cVar.b();
        aVar2.e = cVar.a();
        aVar2.f = cVar.a();
        aVar2.g = cVar.a();
        aVar2.h = cVar.a();
        aVar2.i = cVar.a();
        aVar2.j = cVar.a();
        this.i = new k[aVar2.i];
        for (int i2 = 0; i2 < aVar2.i; i2++) {
            cVar.a(aVar2.a() + ((long) (aVar2.h * i2)));
            if (zD) {
                h hVar = new h();
                hVar.g = cVar.b();
                hVar.h = cVar.b();
                hVar.a = cVar.c();
                hVar.b = cVar.c();
                hVar.c = cVar.c();
                hVar.d = cVar.c();
                hVar.i = cVar.b();
                hVar.j = cVar.b();
                hVar.e = cVar.c();
                hVar.f = cVar.c();
                this.i[i2] = hVar;
            } else {
                d dVar = new d();
                dVar.g = cVar.b();
                dVar.h = cVar.b();
                dVar.a = cVar.b();
                dVar.b = cVar.b();
                dVar.c = cVar.b();
                dVar.d = cVar.b();
                dVar.i = cVar.b();
                dVar.j = cVar.b();
                dVar.e = cVar.b();
                dVar.f = cVar.b();
                this.i[i2] = dVar;
            }
        }
        short s = aVar2.j;
        if (s > -1) {
            k[] kVarArr = this.i;
            if (s < kVarArr.length) {
                k kVar = kVarArr[s];
                if (kVar.h != 3) {
                    throw new UnknownFormatConversionException("Wrong string section e_shstrndx=" + ((int) aVar2.j));
                }
                this.j = new byte[kVar.a()];
                cVar.a(kVar.b());
                cVar.a(this.j);
                if (this.c) {
                    f();
                    return;
                }
                return;
            }
        }
        throw new UnknownFormatConversionException("Invalid e_shstrndx=" + ((int) aVar2.j));
    }

    private void f() throws IOException {
        a aVar = this.h;
        com.tencent.smtt.utils.c cVar = this.g;
        boolean zD = d();
        k kVarA = a(".dynsym");
        if (kVarA != null) {
            cVar.a(kVarA.b());
            int iA = kVarA.a() / (zD ? 24 : 16);
            this.e = new l[iA];
            char[] cArr = new char[1];
            for (int i2 = 0; i2 < iA; i2++) {
                if (zD) {
                    i iVar = new i();
                    iVar.c = cVar.b();
                    cVar.a(cArr);
                    iVar.d = cArr[0];
                    cVar.a(cArr);
                    iVar.e = cArr[0];
                    iVar.a = cVar.c();
                    iVar.b = cVar.c();
                    iVar.f = cVar.a();
                    this.e[i2] = iVar;
                } else {
                    C0020e c0020e = new C0020e();
                    c0020e.c = cVar.b();
                    c0020e.a = cVar.b();
                    c0020e.b = cVar.b();
                    cVar.a(cArr);
                    c0020e.d = cArr[0];
                    cVar.a(cArr);
                    c0020e.e = cArr[0];
                    c0020e.f = cVar.a();
                    this.e[i2] = c0020e;
                }
            }
            k kVar = this.i[kVarA.i];
            cVar.a(kVar.b());
            byte[] bArr = new byte[kVar.a()];
            this.f = bArr;
            cVar.a(bArr);
        }
        this.d = new j[aVar.g];
        for (int i3 = 0; i3 < aVar.g; i3++) {
            cVar.a(aVar.b() + ((long) (aVar.f * i3)));
            if (zD) {
                g gVar = new g();
                gVar.g = cVar.b();
                gVar.h = cVar.b();
                gVar.a = cVar.c();
                gVar.b = cVar.c();
                gVar.c = cVar.c();
                gVar.d = cVar.c();
                gVar.e = cVar.c();
                gVar.f = cVar.c();
                this.d[i3] = gVar;
            } else {
                c cVar2 = new c();
                cVar2.g = cVar.b();
                cVar2.h = cVar.b();
                cVar2.a = cVar.b();
                cVar2.b = cVar.b();
                cVar2.c = cVar.b();
                cVar2.d = cVar.b();
                cVar2.e = cVar.b();
                cVar2.f = cVar.b();
                this.d[i3] = cVar2;
            }
        }
    }

    private static boolean g() {
        String property = System.getProperty("java.vm.version");
        return property != null && property.startsWith(ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final k a(String str) {
        for (k kVar : this.i) {
            if (str.equals(a(kVar.g))) {
                return kVar;
            }
        }
        return null;
    }

    public final char b() {
        return this.b[4];
    }

    public final char c() {
        return this.b[5];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    public final boolean d() {
        return b() == 2;
    }

    public final boolean e() {
        return c() == 1;
    }

    public static boolean b(File file) {
        StringBuilder sb;
        if (!g() || !a(file)) {
            return true;
        }
        try {
            new e(file);
            return true;
        } catch (IOException e) {
            Log.e("ELF", "checkElfFile IOException: " + e);
            return false;
        } catch (UnknownFormatConversionException e2) {
            e = e2;
            sb = new StringBuilder("checkElfFile UnknownFormatConversionException: ");
            sb.append(e);
            Log.e("ELF", sb.toString());
            return true;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("checkElfFile Throwable: ");
            sb.append(e);
            Log.e("ELF", sb.toString());
            return true;
        }
    }

    public final String a(int i2) {
        if (i2 == 0) {
            return "SHN_UNDEF";
        }
        int i3 = i2;
        while (true) {
            byte[] bArr = this.j;
            if (bArr[i3] == 0) {
                return new String(bArr, i2, i3 - i2);
            }
            i3++;
        }
    }

    public final boolean a() {
        return this.b[0] == a[0];
    }

    public static boolean a(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            long j2 = randomAccessFile.readInt();
            randomAccessFile.close();
            return j2 == 2135247942;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
