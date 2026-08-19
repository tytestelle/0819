package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.tvbox.osc.bean.XmlTv;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo extends DefaultHandler {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final SimpleDateFormat f1565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new SimpleDateFormat("yyyyMMddHHmmss Z", Locale.getDefault());

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final SimpleDateFormat f1566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final SimpleDateFormat f1567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final HashMap f1568O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new HashMap();

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final HashMap f1569O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new HashMap();

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final StringBuilder f1570O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new StringBuilder();

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f1571O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = false;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public boolean f1573O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public boolean f1574O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = false;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public boolean f1575O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = false;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public String f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public XmlTv f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public String f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.f1574O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO || this.f1575O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O || this.f1573O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            this.f1570O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        XmlTv xmlTv;
        XmlTv xmlTv2;
        XmlTv xmlTv3;
        Set set;
        StringBuilder sb = this.f1570O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        String strTrim = sb.toString().trim();
        str3.getClass();
        switch (str3) {
            case "programme":
                if (this.f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && (xmlTv = this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) != null && this.f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 != null) {
                    if (xmlTv.getTitle() == null || this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getTitle().isEmpty()) {
                        this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setTitle("未知节目");
                    }
                    ArrayList arrayList = (ArrayList) this.f1569O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(this.f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                    if (arrayList != null) {
                        arrayList.add(this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                    }
                }
                this.f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = false;
                this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                this.f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = null;
                break;
            case "desc":
                if (this.f1575O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O && (xmlTv2 = this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) != null) {
                    if (strTrim.isEmpty()) {
                        strTrim = "暂无描述信息";
                    }
                    xmlTv2.setDesc(strTrim);
                }
                this.f1575O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = false;
                break;
            case "title":
                if (this.f1574O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO && (xmlTv3 = this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) != null) {
                    xmlTv3.setTitle(strTrim);
                }
                this.f1574O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = false;
                break;
            case "channel":
                this.f1571O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
                this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                break;
            case "display-name":
                if (this.f1573O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 && this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO != null && !strTrim.isEmpty() && (set = (Set) this.f1568O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) != null) {
                    set.add(strTrim);
                }
                this.f1573O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;
                break;
        }
        sb.setLength(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Date date;
        Date date2;
        byte b = 0;
        this.f1570O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setLength(0);
        str3.getClass();
        switch (str3.hashCode()) {
            case -968778980:
                if (!str3.equals("programme")) {
                    b = -1;
                }
                break;
            case 3079825:
                if (!str3.equals("desc")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 110371416:
                if (!str3.equals("title")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 738950403:
                if (!str3.equals("channel")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1568910518:
                if (!str3.equals("display-name")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
                String value = attributes.getValue("channel");
                String value2 = attributes.getValue(TtmlNode.START);
                String value3 = attributes.getValue("stop");
                try {
                    if (value == null || value2 == null || value3 == null) {
                        this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                    } else {
                        SimpleDateFormat simpleDateFormat = this.f1565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        try {
                            date = simpleDateFormat.parse(value2);
                        } catch (Exception unused) {
                            date = new Date();
                            date.setTime(0L);
                        }
                        try {
                            date2 = simpleDateFormat.parse(value3);
                        } catch (Exception unused2) {
                            date2 = new Date();
                            date2.setTime(0L);
                        }
                        if ((new Date().getTime() - date.getTime()) / 86400000 <= 6) {
                            XmlTv xmlTv = new XmlTv();
                            this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = xmlTv;
                            SimpleDateFormat simpleDateFormat2 = this.f1566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            xmlTv.setStartTime(simpleDateFormat2.format(date));
                            this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setEndTime(simpleDateFormat2.format(date2));
                            this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setDesc("暂无描述信息");
                            String str4 = value + "_" + this.f1567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.format(date);
                            this.f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = str4;
                            HashMap map = this.f1569O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            if (!map.containsKey(str4)) {
                                map.put(this.f1578O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, new ArrayList());
                            }
                        } else {
                            this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                        }
                    }
                } catch (Exception unused3) {
                    this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                }
                break;
            case 1:
                if (this.f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                    this.f1575O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = true;
                    break;
                }
                break;
            case 2:
                if (this.f1572O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && this.f1577O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                    this.f1574O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                    break;
                }
                break;
            case 3:
                this.f1571O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
                String value4 = attributes.getValue(TtmlNode.ATTR_ID);
                this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = value4;
                if (value4 != null && !value4.isEmpty()) {
                    HashMap map2 = this.f1568O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (!map2.containsKey(this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
                        map2.put(this.f1576O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, new HashSet());
                    }
                    break;
                }
                break;
            case 4:
                if (this.f1571O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    this.f1573O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = true;
                }
                break;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
