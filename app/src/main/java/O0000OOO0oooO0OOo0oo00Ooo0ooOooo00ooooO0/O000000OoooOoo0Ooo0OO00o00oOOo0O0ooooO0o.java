package O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Date f890O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Date f891O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public String f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public String f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final String f895O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final Date f896O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public long f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public long f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final SimpleDateFormat f899O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final SimpleDateFormat f900O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final SimpleDateFormat f901O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public String f902O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public String f903O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Date date, String str, String str2, String str3, String str4) {
        if (str == null || date == null || str2 == null || str3 == null) {
            return;
        }
        this.f896O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = date;
        this.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
        this.f895O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = str4;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(date, str2, str3);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Date date, String str, String str2) {
        String liveUrl = ((AddressItem) O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3290O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00())).getLiveUrl();
        TimeZone timeZone = TimeZone.getTimeZone(liveUrl);
        SimpleDateFormat simpleDateFormat = this.f899O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        simpleDateFormat.setTimeZone(timeZone);
        TimeZone timeZone2 = TimeZone.getTimeZone(liveUrl);
        SimpleDateFormat simpleDateFormat2 = this.f900O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        simpleDateFormat2.setTimeZone(timeZone2);
        this.f902O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = simpleDateFormat.format(date) + " " + str + ":00";
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(date));
        sb.append(" ");
        sb.append(str2);
        sb.append(str2.equals("23:59") ? ":59" : ":00");
        this.f903O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = sb.toString();
        this.f902O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo += " " + liveUrl;
        this.f903O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 += " " + liveUrl;
        this.f890O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = simpleDateFormat2.parse(this.f902O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, new ParsePosition(0));
        Date date2 = simpleDateFormat2.parse(this.f903O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, new ParsePosition(0));
        this.f891O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = date2;
        Date date3 = this.f890O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (date3 == null || date2 == null) {
            return;
        }
        this.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = date3.getTime();
        this.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f891O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getTime();
        Date date4 = this.f890O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        SimpleDateFormat simpleDateFormat3 = this.f901O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = simpleDateFormat3.format(date4);
        this.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = simpleDateFormat3.format(this.f891O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }
}
