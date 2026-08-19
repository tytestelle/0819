package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.tvbox.osc.bean.XmlTv;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static volatile O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f1375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ReentrantLock f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final LruCache f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Context context) {
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        if (((Boolean) Hawk.get("EPG缓存路径", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1485O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo))).booleanValue()) {
            String str = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            String str2 = LoginActivity.f3011O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            File file = new File(str);
            if (file.canRead() && file.canWrite()) {
                StringBuilder sb = new StringBuilder();
                sb.append(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                sb.append(ServiceReference.DELIMITER);
                strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, "/epgCache/tv_epg.db");
                File parentFile = new File(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00).getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
            } else {
                strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = "tv_epg.db";
            }
        } else {
            strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = "tv_epg.db";
        }
        super(context, strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, (SQLiteDatabase.CursorFactory) null, 1);
        this.f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ReentrantLock();
        this.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new LruCache((int) ((Runtime.getRuntime().maxMemory() / 8) / 1024));
    }

    public static JSONObject O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, String str2, ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_name", str);
        jSONObject.put(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.DATE, str2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            XmlTv xmlTv = (XmlTv) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TtmlNode.START, xmlTv.getStartTime());
            jSONObject2.put(TtmlNode.END, xmlTv.getEndTime());
            jSONObject2.put("title", xmlTv.getTitle());
            jSONObject2.put("desc", xmlTv.getDesc());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("epg_data", jSONArray);
        return jSONObject;
    }

    public static Set O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, HashMap map) {
        Set set = (Set) map.get(str);
        if (set != null && !set.isEmpty()) {
            return set;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str.contains(str2) || str2.contains(str)) {
                return (Set) entry.getValue();
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            for (String str3 : (Set) entry2.getValue()) {
                if (str.contains(str3) || str3.contains(str)) {
                    return (Set) entry2.getValue();
                }
            }
        }
        return null;
    }

    public static String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, String str2) {
        return str.toLowerCase() + "_" + str2;
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Context context) {
        if (f1375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            synchronized (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class) {
                try {
                    if (f1375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        f1375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1375O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(HashMap map, HashMap map2) throws Throwable {
        SQLiteDatabase writableDatabase;
        if (map2 == null || map2.isEmpty()) {
            return 0;
        }
        ReentrantLock reentrantLock = this.f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        reentrantLock.lock();
        try {
            writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                if (writableDatabase != null && writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                reentrantLock.unlock();
                return 0;
            }
            try {
                writableDatabase.beginTransaction();
                int i = 0;
                for (Map.Entry entry : map2.entrySet()) {
                    String[] strArrSplit = ((String) entry.getKey()).split("_");
                    if (strArrSplit.length >= 2) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        ArrayList arrayList = (ArrayList) entry.getValue();
                        Set setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (Set) map.get(str);
                        if (setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null || setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isEmpty()) {
                            setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(str, map);
                            if (setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && !setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isEmpty()) {
                            }
                        }
                        Iterator it = setO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.iterator();
                        while (it.hasNext()) {
                            String lowerCase = ((String) it.next()).toLowerCase();
                            try {
                                if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(writableDatabase, lowerCase, str2, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(lowerCase, str2, arrayList).toString())) {
                                    i++;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                reentrantLock.unlock();
                return i;
            } catch (Throwable th) {
                th = th;
                if (writableDatabase != null && writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            writableDatabase = null;
        }
    }

    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(str, str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel_key", strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        contentValues.put("channel_name", str.toLowerCase());
        contentValues.put(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.DATE, str2);
        contentValues.put("json_data", str3);
        contentValues.put("last_update", Long.valueOf(System.currentTimeMillis()));
        try {
            boolean z = sQLiteDatabase.insertWithOnConflict("epg_data", null, contentValues, 5) != -1;
            if (z) {
                this.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ReentrantLock reentrantLock = this.f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        reentrantLock.lock();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(str, str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_key", strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            contentValues.put("channel_name", str.toLowerCase());
            contentValues.put(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.DATE, str2);
            contentValues.put("json_data", str3);
            contentValues.put("last_update", Long.valueOf(System.currentTimeMillis()));
            if (writableDatabase.insertWithOnConflict("epg_data", null, contentValues, 5) != -1) {
                this.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            reentrantLock.unlock();
        }
        reentrantLock.unlock();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE epg_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,channel_key TEXT UNIQUE,channel_name TEXT NOT NULL,date TEXT NOT NULL,json_data TEXT,last_update INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_channel_key ON epg_data(channel_key)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_channel_date ON epg_data(channel_name, date)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS epg_data");
        onCreate(sQLiteDatabase);
        this.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.evictAll();
    }
}
