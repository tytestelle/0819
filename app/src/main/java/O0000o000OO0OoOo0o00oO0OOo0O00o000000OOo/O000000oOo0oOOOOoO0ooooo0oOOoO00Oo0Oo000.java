package O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Serializable {
    public static final String CURRENT_SIZE = "currentSize";
    public static final String DATE = "date";
    public static final int ERROR = 4;
    public static final String EXTRA1 = "extra1";
    public static final String EXTRA2 = "extra2";
    public static final String EXTRA3 = "extra3";
    public static final String FILE_NAME = "fileName";
    public static final String FILE_PATH = "filePath";
    public static final int FINISH = 5;
    public static final String FOLDER = "folder";
    public static final String FRACTION = "fraction";
    public static final int LOADING = 2;
    public static final int NONE = 0;
    public static final int PAUSE = 3;
    public static final String PRIORITY = "priority";
    public static final String REQUEST = "request";
    public static final String STATUS = "status";
    public static final String TAG = "tag";
    public static final String TOTAL_SIZE = "totalSize";
    public static final String URL = "url";
    public static final int WAITING = 1;
    private static final long serialVersionUID = 6353658567594109891L;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient long f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public long currentSize;
    public Throwable exception;
    public Serializable extra1;
    public Serializable extra2;
    public Serializable extra3;
    public String fileName;
    public String filePath;
    public String folder;
    public float fraction;
    public com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 request;
    public transient long speed;
    public int status;
    public String tag;
    public String url;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient long f1621O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = SystemClock.elapsedRealtime();
    public long totalSize = -1;
    public int priority = 0;
    public long date = System.currentTimeMillis();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient ArrayList f1622O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    public static ContentValues buildContentValues(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TAG, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.tag);
        contentValues.put("url", o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.url);
        contentValues.put(FOLDER, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.folder);
        contentValues.put("filePath", o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.filePath);
        contentValues.put(FILE_NAME, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fileName);
        contentValues.put(FRACTION, Float.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fraction));
        contentValues.put(TOTAL_SIZE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize));
        contentValues.put(CURRENT_SIZE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize));
        contentValues.put("status", Integer.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.status));
        contentValues.put(PRIORITY, Integer.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.priority));
        contentValues.put(DATE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.date));
        contentValues.put(REQUEST, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.request));
        contentValues.put(EXTRA1, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra1));
        contentValues.put(EXTRA2, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra2));
        contentValues.put(EXTRA3, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra3));
        return contentValues;
    }

    public static ContentValues buildUpdateContentValues(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FRACTION, Float.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fraction));
        contentValues.put(TOTAL_SIZE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize));
        contentValues.put(CURRENT_SIZE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize));
        contentValues.put("status", Integer.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.status));
        contentValues.put(PRIORITY, Integer.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.priority));
        contentValues.put(DATE, Long.valueOf(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.date));
        return contentValues;
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 changeProgress(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, long j, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        return changeProgress(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, j, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 parseCursorToBean(Cursor cursor) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.tag = cursor.getString(cursor.getColumnIndex(TAG));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.url = cursor.getString(cursor.getColumnIndex("url"));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.folder = cursor.getString(cursor.getColumnIndex(FOLDER));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.filePath = cursor.getString(cursor.getColumnIndex("filePath"));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fileName = cursor.getString(cursor.getColumnIndex(FILE_NAME));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fraction = cursor.getFloat(cursor.getColumnIndex(FRACTION));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize = cursor.getLong(cursor.getColumnIndex(TOTAL_SIZE));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize = cursor.getLong(cursor.getColumnIndex(CURRENT_SIZE));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.status = cursor.getInt(cursor.getColumnIndex("status"));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.priority = cursor.getInt(cursor.getColumnIndex(PRIORITY));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.date = cursor.getLong(cursor.getColumnIndex(DATE));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.request = (com.lzy.okgo.request.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(cursor.getBlob(cursor.getColumnIndex(REQUEST)));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra1 = (Serializable) com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(cursor.getBlob(cursor.getColumnIndex(EXTRA1)));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra2 = (Serializable) com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(cursor.getBlob(cursor.getColumnIndex(EXTRA2)));
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.extra3 = (Serializable) com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(cursor.getBlob(cursor.getColumnIndex(EXTRA3)));
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class != obj.getClass()) {
            return false;
        }
        String str = this.tag;
        String str2 = ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).tag;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public void from(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.totalSize = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize;
        this.currentSize = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize;
        this.fraction = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fraction;
        this.speed = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.speed;
        this.f1621O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1621O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public int hashCode() {
        String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Progress{fraction=" + this.fraction + ", totalSize=" + this.totalSize + ", currentSize=" + this.currentSize + ", speed=" + this.speed + ", status=" + this.status + ", priority=" + this.priority + ", folder=" + this.folder + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ", tag=" + this.tag + ", url=" + this.url + '}';
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 changeProgress(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, long j, long j2, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.totalSize = j2;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize += j;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO += j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime - o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1621O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (j3 >= 300 || o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize == j2) {
            if (j3 == 0) {
                j3 = 1;
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.fraction = (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.currentSize * 1.0f) / j2;
            long j4 = (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 1000) / j3;
            ArrayList arrayList = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1622O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            arrayList.add(Long.valueOf(j4));
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
            Iterator it = arrayList.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue = (long) (jLongValue + ((Long) it.next()).longValue());
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.speed = jLongValue / ((long) arrayList.size());
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1621O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = jElapsedRealtime;
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1620O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0L;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                com.lzy.okgo.request.base.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (com.lzy.okgo.request.base.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3774O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
                com.lzy.okgo.request.base.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3774O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
                O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
            }
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }
}
