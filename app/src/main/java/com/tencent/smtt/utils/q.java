package com.tencent.smtt.utils;

import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class q {
    private b a = null;
    private b b = null;

    public class a {
        private String b;
        private long c;
        private long d;

        public a(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        public long a() {
            return this.c;
        }

        public long b() {
            return this.d;
        }
    }

    public class b {
        private Map<String, a> b;

        public b(File file) {
            HashMap map = new HashMap();
            this.b = map;
            map.clear();
            a(file);
        }

        public Map<String, a> a() {
            return this.b;
        }

        private void a(File file) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    a(file.getName(), file.length(), file.lastModified());
                    return;
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null || Build.VERSION.SDK_INT < 26) {
                for (File file2 : fileArrListFiles) {
                    a(file2);
                }
            }
        }

        private void a(String str, long j, long j2) {
            if (str == null || str.length() <= 0 || j <= 0 || j2 <= 0) {
                return;
            }
            a aVar = q.this.new a(str, j, j2);
            if (this.b.containsKey(str)) {
                return;
            }
            this.b.put(str, aVar);
        }
    }

    public void a(File file) {
        this.a = new b(file);
    }

    public void b(File file) {
        this.b = new b(file);
    }

    public boolean a() {
        b bVar = this.b;
        return bVar != null && this.a != null && bVar.a().size() == this.a.a().size() && a(this.a, this.b);
    }

    private boolean a(b bVar, b bVar2) {
        if (bVar == null || bVar.a() == null || bVar2 == null || bVar2.a() == null) {
            return false;
        }
        Map<String, a> mapA = bVar.a();
        Map<String, a> mapA2 = bVar2.a();
        for (Map.Entry<String, a> entry : mapA.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            if (mapA2.containsKey(key)) {
                a aVar = mapA2.get(key);
                if (value.a() != aVar.a() || value.b() != aVar.b()) {
                }
            }
            return false;
        }
        return true;
    }
}
