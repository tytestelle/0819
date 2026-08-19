package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final SimpleDateFormat f1564O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return new int[]{-1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22}[O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()];
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(FilterInputStream filterInputStream) {
        try {
            try {
                try {
                    SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
                    sAXParserFactoryNewInstance.setNamespaceAware(false);
                    sAXParserFactoryNewInstance.setValidating(false);
                    XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                    O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo();
                    HashMap map = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1569O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    HashMap map2 = o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1568O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    xMLReader.setContentHandler(o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo);
                    InputSource inputSource = new InputSource(new BufferedInputStream(filterInputStream, 65536));
                    inputSource.setEncoding("UTF-8");
                    xMLReader.parse(inputSource);
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "解析完成并保存" + O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(map2, map) + "个节目至本地");
                    LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.clear();
                    map2.clear();
                    map.clear();
                    filterInputStream.close();
                } catch (Throwable th) {
                    try {
                        filterInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "XmlTv EPG解析出错: " + e2.getMessage());
                filterInputStream.close();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
