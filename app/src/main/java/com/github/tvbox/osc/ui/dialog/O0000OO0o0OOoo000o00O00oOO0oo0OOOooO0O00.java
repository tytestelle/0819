package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.recyclerview.widget.GridLayoutManager;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomEditText;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.google.zxing.common.StringUtils;
import com.player.ku9py.R;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 implements View.OnClickListener, TextWatcher {

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final ArrayMap f3204O00000OOoOOO00O00o0ooooooooO000ooooO0000 = new ArrayMap(CacheDataSink.DEFAULT_BUFFER_SIZE);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f3205O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final CustomRecyclerView f3206O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final CustomRecyclerView f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final CustomEditText f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final LinearLayout f3209O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final LinearLayout f3210O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO f3211O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public TextView f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final TextView f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final PopupWindow f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final View f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final Handler f3216O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new Handler();

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3217O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 15);

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public boolean f3218O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public String f3219O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    public O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(LivePlayActivity livePlayActivity) {
        this.f3205O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        View viewInflate = LayoutInflater.from(livePlayActivity).inflate(R.layout.dialog_search, (ViewGroup) null);
        this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = viewInflate;
        this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (CustomRecyclerView) viewInflate.findViewById(R.id.search_view);
        this.f3206O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (CustomRecyclerView) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.search_keyboardView);
        LinearLayout linearLayout = (LinearLayout) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.search_view_icon_group);
        this.f3210O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = linearLayout;
        linearLayout.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1352O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        this.f3209O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (LinearLayout) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.search_logo_group);
        ((LinearLayout) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.search_edit_layout)).setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1353O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (CustomEditText) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.search_edit);
        TextView textView = (TextView) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.clear_button);
        this.f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (TextView) this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.delete_button);
        textView.setNextFocusDownId(R.id.search_keyboardView);
        this.f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setNextFocusDownId(R.id.search_keyboardView);
        PopupWindow popupWindow = new PopupWindow(this.f3215O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, -2, -1);
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setFocusable(true);
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setOutsideTouchable(true);
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setClippingEnabled(false);
        if (!this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.isShowing()) {
            this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setAnimationStyle(R.style.Channel_Group_PopupAnimation);
        }
        this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.addTextChangedListener(this);
        textView.setOnClickListener(this);
        this.f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnClickListener(this);
        this.f3213O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
        ViewGroup.LayoutParams layoutParams = this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1433O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setLayoutParams(layoutParams);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        ArrayList arrayList = new ArrayList();
        for (char c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
            arrayList.add(String.valueOf(c));
        }
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            arrayList.add(String.valueOf(c2));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        LivePlayActivity livePlayActivity2 = this.f3205O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f3206O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setLayoutManager(new GridLayoutManager(livePlayActivity2, 6));
        O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = new O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(livePlayActivity2, arrayList2);
        this.f3206O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setAdapter(o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo);
        O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = new O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(livePlayActivity2);
        this.f3211O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setAdapter(o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO);
        this.f3211O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setOnItemClickListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 18));
        o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setOnSelectListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this, 5, o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo, arrayList2));
        if (this.f3211O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isEmpty()) {
            this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setVisibility(8);
        }
    }

    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2) {
        if (str == null || str2 == null || str2.isEmpty()) {
            return -1;
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf > -1) {
            return iIndexOf;
        }
        ArrayMap arrayMap = f3204O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        String upperCase = (String) arrayMap.get(str);
        if (upperCase == null) {
            String str3 = "";
            if (str.trim().length() != 0) {
                String string = "";
                int i = 0;
                while (i < str.length()) {
                    StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
                    int i2 = i + 1;
                    String strSubstring = str.substring(i, i2);
                    if (strSubstring == null || strSubstring.trim().length() == 0) {
                        strSubstring = "";
                    } else {
                        try {
                            strSubstring = new String(strSubstring.getBytes(StringUtils.GB2312), "ISO8859-1");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        if (strSubstring.length() > 1) {
                            char cCharAt = strSubstring.charAt(0);
                            int iCharAt = strSubstring.charAt(1) - 160;
                            int i3 = ((cCharAt - 160) * 100) + iCharAt;
                            if (i3 > 1600 && i3 < 5590 && i3 % 100 < 95) {
                                for (int i4 = 0; i4 < 23; i4++) {
                                    int[] iArr = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f872O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                    if (i3 >= iArr[i4] && i3 < iArr[i4 + 1]) {
                                        strSubstring = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f873O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i4];
                                        break;
                                    }
                                }
                            } else if (i3 <= 5590 || i3 >= 8795 || i3 % 100 >= 95) {
                                try {
                                    strSubstring = new String(strSubstring.getBytes("ISO8859-1"), StringUtils.GB2312);
                                } catch (UnsupportedEncodingException e2) {
                                    e2.printStackTrace();
                                }
                                strSubstring = strSubstring.substring(0, 1);
                            } else {
                                int i5 = ((cCharAt - 216) * 94) + iCharAt;
                                int i6 = i5 - 1;
                                if (i6 >= 0 && i6 <= 3007) {
                                    strSubstring = "cjwgnspgcgne[z[btzzzdxzkzgt[jnnjqmbsgzsczjszz[pgkbzgz[zwjkgkljzwkpjqhz[w[dzlsgmrzpzwwcckznkzzgttnjjnzkkzztcjnmczlqlzpzqfqrpzslwbtgkjfzxjwzltbncxjjjjtxdttsqzzcdxxhgck[phffss[zbgxlppbzll[hlxs[zm[jhsojnghdzqzklgjhsgqzhxqgkezzwzscscjxzezxadzpmdssmzjzqjzzc[j[wqjbzzpxgznzcpwhkxhqkmwfbpbzdtjzzkqhzlzgxfptzjzzzpszlfchmqshgmxxsxj[[dcsbbqbefsjzhxwgzkpzlqbgldlcctnmazddkssngzcsgxlzzazbnptsdkdzlhgzmzlcxpz[jndqjwxqxfzzfjlejpzrxccqwqqsbnkzmgplbmjrqcflnzmzqmsqzrbcjthztqfrxqhxmjjcjlxqgjmshzkbswzemzltxfszdswlzcjqxsjnqbsctzhbftdczzdjwzghqfrxwckqkxebptlpxjzsrmebwhjlbjslzzsmdxlclqkxlhxjrzjmfqhxhwzwsbhtrxxglhqhfnm[zkldzxzpzlgg[mtcfpajjzzljtzanjgbjplqgdzzqzaxbkzsecjsznslzzhsxlzcghpxzhznztdsbcjkdlzazfmzdlebbgqzzkxgldndnzskjshdlzxbcghxzpkdjmmzngmmclgwzszxzjfznmlzzthcszdbdllscddnlkjzkjszcjlkwhqasdknhcsganhdaashtcplcpqzbsdmpjlpzjoqlcdhjjzsprchn[nnlhlzzqzhwzptczgwwmzffjqqqqzxaclbhkdjxdgmmzdjxzllszgxgkjrzwzwzclzmssjzldbzd[fcxzhlxchzzjq[[qagmnzxpfrkssbjlzxzszglnscmhzwwmnzjjlxxhchsz[[ttxrzczxbzhcsmxjsznpwgpxxtazbgajcxlz[dccwzocwkccsbnhcpdzznfczztzckxkzbsqkkztqqxfcwchczkelzqbsqzjqcclmthszwhmktlkjlzcxwheqqhtqh[pq[qscfzmndmgbwhwlgsllzsdlmlxpthmjhwljzzhzjxhtxjlhxrswlwzjcbxmhzqxsdzpmgfcsglsxzmjshxpjxwmzqksmzplrthbxftpmhzxlchlhlzzlxgsssstclsldclrpbhzhxzzfhb[gdmzcnqqwlqhjj[zwjzzejjdhpblqxtqkwhlchqxagtlxljxmsl[htzkzjecxjcjnmfbz[sfzwzbjzgnzsdzsqzrsljpclpwxsdwejbjcbcnaztwgmpapclzqpclzxsbnmsggfnzjjbzsfzzndxhplqkzczwalsbccjx[zzgwkzpsgxfzfcdkhjgxdlqfsgdslqwzkxtmhsbgzmjzrglzjbpmlmsxlzjqqhzzjczzdjwbmzklddpmjegxzhzlxhlqzqhkzcwcjmzzxnatjhzccxzpcqlbzwwztwbqcmlpmzrjcccxfpznzzljplxxzztzlgdldcklzrzzgqtgjhhgjljaxfgfjzslcfdqzlclgjdjcsnzlljpjqdcclcjxmzzftsxgcgsbrzxjqqctzhgzqtjqqlzxjzlzlbczamcstzlpdjbzregklzzzhlzszqlznwczcllwjqjjjkdgjzolbbzppglghtgzxzghzmzcnqszczhbhgxkamtxzxnbskzzzgjzlqjdfcjxdzgjqjjpmgwgjjjpkqsbgbmmcjssclpqpdxcdzzkz[cjddzzgzwrhjrtgznzqldkljszzgzqzjgdzkshpzmtlcpwnjafzzdjcnmwesczglbtzcgmssllzxqsxsbsjsbbsgghfjlzpmzjnlzzwdqshzxtzzwhmzzhzwdbxbtlmszzzfsxjc[dxxlhjhf[sxzqhfzmzcztqcxzxrttdjhnnzzqqmnqdmmg[zdxmjgdhcdzzbffallztdltfxmxqzdngwqdbdczjdxbzgsqqddjcmbkzffxmkdmdszzszcmljdsznsbrskmkmpcklgdbqtfzswtfgglzplljzhgj[gzpzltcsmcnbtjbqfkthbzzgkpbbzmtdssxtbnpdklezcjnzddzkzddhqhsdzsctarlltkzlgecllkjlqjaqnbdkkghpjtzqksecshalqfmmgjnlzjbbtmlzzxdcjpldlpcqdhzzcbzsczbzmsljflkrzjsnfrgjhxpdhzjzbzgdlqcsezgxlblgzxtwmabchecmwzjzzlljjzhlg[djlslzgkdzpzxjzzzlwcxszfgwzzdlzhcljscmbjhblzzlzcblzdpdqzsxqzbztdkzxjz[cnrjmpdjgklcljbctbjddbblblczqrppxjcjlzcshltoljnmdddlngkaqhqhjgzkheznmshrp[qqjchgmfprxhjgdzchghlzrzqlczqjnzsqtkqjzmszswlcfqqqxzfggzptqwlmcrnfkkfszzlqbmqammmzxctpshcptxxzzsmphpshmclmldqfzqxszzzdzjzzhqpdszglstjbckbxzqzjsgpsxqzqzrqtbdkzxzkhhgflbcsmdldgdzdblzzzcxnncszbzbfglzzxswmsccmqnjqsbdqsjtxxmbltxzclzshzcxrqjgjzlxzfjphzmzqqzdfqjjlzznzjcdgzzgctxmzzsctlkphtxhtlbjxjlxscdqxcbbtjfqzfsltjbtkqbxxjjljchczdbzjdczjdcprnpqcjpfczlclzxzdmxmphjsgzgszzqlzlwtjpfszasmcjbtzkzcwmztcsjjljcqlwzmalbxzfbpnlsfhtgjwejjxxglljstgshjqlzfkcgnnnszfdeqfhbsaqtgzlbxmmzgszldzdqmjjrgbjtkgdhgkblqkbdmbzlxwcxzttzbkmrtjzxqjbhlmhmjjzmqasldczxzqdlqcafzwzxqhz".substring(i6, i5);
                                }
                            }
                        }
                    }
                    sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(strSubstring);
                    string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
                    i = i2;
                }
                str3 = string;
            }
            upperCase = str3.toUpperCase();
            arrayMap.put(str, upperCase);
        }
        return upperCase.indexOf(str2.toUpperCase());
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        ViewGroup.LayoutParams layoutParams = this.f3210O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getLayoutParams();
        if (this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new TextView(this.f3205O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
            layoutParams.width = (int) this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getPaint().measureText("0001-频道节目列表的宽度测量图标");
        } else if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
            layoutParams.width = (int) this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getPaint().measureText("0001-频道节目列表的宽度测量de");
        } else if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && !O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
            layoutParams.width = (int) this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getPaint().measureText("0001-频道节目列表的宽度测量");
        } else if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() && O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
            layoutParams.width = (int) this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getPaint().measureText("0001-频道节目列表的宽度");
        }
        this.f3210O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getLayoutParams();
        layoutParams2.width = (int) this.f3212O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getPaint().measureText("0001-键盘宽度宽度测量测量的");
        this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setLayoutParams(layoutParams2);
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        int iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
        LivePlayActivity livePlayActivity = this.f3205O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (iO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != 2) {
            livePlayActivity.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(true, this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getContentView());
        }
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.update();
        this.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.showAtLocation(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 8388627, 0, 0);
        String string = this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string);
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str) {
        if (str == null) {
            return;
        }
        if (this.f3218O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            this.f3219O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = str;
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "正在初始化搜索数据，请稍后！");
            return;
        }
        this.f3219O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = null;
        ArrayList arrayList = new ArrayList();
        Iterator it = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) it.next()).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
            while (it2.hasNext()) {
                for (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO : ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) it2.next()).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, str) >= 0) {
                        arrayList.add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    }
                }
            }
        }
        this.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, arrayList, 22));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        int length;
        int id = view.getId();
        if (id == R.id.clear_button) {
            this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setText("");
        } else if (id == R.id.delete_button && (length = (text = this.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getText()).length()) > 0) {
            text.delete(length - 1, length);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
