package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.quickjs.QuickJS;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends com.quickjs.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final HashMap f1381O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1382O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, QuickJS quickJS) {
        super(quickJS, quickJS.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._createContext(quickJS.f3852O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        this.f1382O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f1381O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new HashMap();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0() { // from class: com.quickjs.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            /* JADX WARN: Code duplicated, block: B:9:0x003e  */
            @Override // com.quickjs.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
            public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JSObject jSObject, JSArray jSArray) {
                String str;
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f3776O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
                if (jSObject.isUndefined()) {
                    str = null;
                } else {
                    JSObject jSObject2 = (JSObject) jSObject.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_OBJECT, "module");
                    if (jSObject2.isUndefined()) {
                        str = null;
                    } else {
                        jSObject2.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                        if (jSObject2.getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._contains(jSObject2.getContextPtr(), jSObject2, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME)) {
                            str = (String) jSObject2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.STRING, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME);
                        } else {
                            str = null;
                        }
                    }
                }
                String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0);
                String strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(str, strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                HashMap map = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1381O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                JSObject jSObject3 = (JSObject) map.get(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                if (jSObject3 == null) {
                    String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                    if (strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
                        throw new RuntimeException("'moduleName' script is null");
                    }
                    String strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(null, strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                    jSObject3 = (JSObject) o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN, "(function () {var module = { exports: {}, children: [] }; #CODE ; return module;})();".replace("#CODE", strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00), strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1);
                    jSObject3.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1, TtmlNode.ATTR_ID);
                    jSObject3.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME);
                    if (strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1 != null) {
                        map.put(strO00000O00oOOo000000OOOo00OOOo0OooOO00OO1, jSObject3);
                    }
                }
                return jSObject3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN, "exports");
            }
        }, "require");
    }

    public static String O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            str2 = str2.replace("//", ServiceReference.DELIMITER);
            if (str2.startsWith("./")) {
                str2 = str2.substring(2);
            }
            if (str2.charAt(0) == '/') {
                return str2;
            }
            if (str != null && str.length() != 0) {
                String strReplace = str.replace("//", ServiceReference.DELIMITER);
                if (strReplace.startsWith("./")) {
                    strReplace = strReplace.substring(2);
                }
                if (strReplace.equals(ServiceReference.DELIMITER)) {
                    return ServiceReference.DELIMITER.concat(str2);
                }
                if (strReplace.endsWith(ServiceReference.DELIMITER)) {
                    return strReplace.concat(str2);
                }
                String[] strArrSplit = strReplace.split(ServiceReference.DELIMITER);
                String[] strArrSplit2 = str2.split(ServiceReference.DELIMITER);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Collections.addAll(arrayList, strArrSplit);
                Collections.addAll(arrayList2, strArrSplit2);
                while (!arrayList2.isEmpty() && ((String) arrayList2.get(0)).equals("..")) {
                    arrayList2.remove(0);
                    arrayList.remove(arrayList.size() - 1);
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                StringBuilder sb = new StringBuilder();
                if (strReplace.startsWith(ServiceReference.DELIMITER)) {
                    sb.append(ServiceReference.DELIMITER);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(ServiceReference.DELIMITER);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append(ServiceReference.DELIMITER);
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
        }
        return str2;
    }

    public final String O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(String str) {
        HashMap map = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1384O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        String strO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this.f1382O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1386O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "js/" + str + ".js");
        map.put(str, strO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        return strO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // com.quickjs.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, com.quickjs.JSValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1381O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.clear();
        super.close();
    }
}
