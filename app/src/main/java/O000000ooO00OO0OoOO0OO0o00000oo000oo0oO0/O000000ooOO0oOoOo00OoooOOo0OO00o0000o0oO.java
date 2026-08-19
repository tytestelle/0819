package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadException;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
import com.google.common.util.concurrent.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.fourthline.cling.model.gena.GENASubscription;
import org.fourthline.cling.support.contentdirectory.DIDLParser;
import org.fourthline.cling.support.lastchange.EventedValue;
import org.fourthline.cling.support.model.item.Item;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f85O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, int i, Object obj2, Object obj3) {
        this.f85O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Item> items;
        switch (this.f85O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O this$0 = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this$0, "this$0");
                GENASubscription subscription = (GENASubscription) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "$subscription");
                this$0.f90O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(subscription.getSubscriptionId(), (EventedValue) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 1:
                ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).mPlayerEventListener.onVideoSizeChanged(((Integer) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).intValue(), ((Integer) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).intValue());
                return;
            case 2:
                String str = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                ((LivePlayActivity) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 3, (Date) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 3:
                String str2 = (String) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String str3 = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                ((LivePlayActivity) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).getClass();
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                String str4 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f931O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                if (str4 == null) {
                    str4 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f919O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                }
                try {
                    try {
                        new JSONObject(str4);
                        JSONObject jSONObject = new JSONObject(str4);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setDomainIp(next, jSONObject.getString(next));
                        }
                        return;
                    } catch (Exception unused) {
                        O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setDomainIp(str2, str4);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "Host设置失败");
                    return;
                }
            case 4:
                String str5 = (String) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                LivePlayActivity livePlayActivity = (LivePlayActivity) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity.f2990O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0.f2791O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
                    kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("avTransportControl");
                    return;
                }
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(livePlayActivity);
                AddressItem addressItem = new AddressItem();
                addressItem.setLiveUrl((String) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                String title = "精彩视频";
                try {
                    if (!TextUtils.isEmpty(str5) && (items = new DIDLParser().parse(str5).getItems()) != null && !items.isEmpty()) {
                        title = items.get(0).getTitle();
                    }
                    break;
                } catch (Exception unused2) {
                }
                addressItem.setLiveUrlName(title);
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
                if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo == null) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(livePlayActivity);
                }
                ArrayList arrayList = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1335O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                arrayList.add(addressItem);
                livePlayActivity.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3177O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList.indexOf(addressItem));
                LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3286O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3175O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size() - 1);
                return;
            case 5:
                Util.lambda$transformFutureAsync$2((O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 6:
                Util.lambda$postOrRunWithCompletion$0((O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Runnable) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 7:
                ((AudioRendererEventListener.EventDispatcher) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$inputFormatChanged$2((Format) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (DecoderReuseEvaluation) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 8:
                ((DrmSessionEventListener.EventDispatcher) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$drmSessionManagerError$2((DrmSessionEventListener) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Exception) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 9:
                ((BasePreloadManager) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onPreloadError$4((PreloadException) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (MediaSource) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            case 10:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.getClass();
                ArrayList arrayList2 = new ArrayList((LinkedHashSet) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                ArrayList arrayList3 = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.notifyDataSetChanged();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList2);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已全部添加至订阅列表");
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.dismiss();
                return;
            default:
                Object[] objArr = (Object[]) this.f86O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f87O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                RuntimeException[] runtimeExceptionArr = (RuntimeException[]) this.f88O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                try {
                    objArr[0] = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.run();
                    break;
                } catch (RuntimeException e2) {
                    runtimeExceptionArr[0] = e2;
                }
                synchronized (objArr) {
                    objArr[1] = Boolean.TRUE;
                    objArr.notifyAll();
                    break;
                }
                return;
        }
    }
}
