package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.UnsignedIntegerTwoBytes;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.item.VideoItem;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public Object f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Context context) {
        this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new UnsignedIntegerTwoBytes(0L);
        Object systemService = context.getSystemService("audio");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = audioManager;
        this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new UnsignedIntegerTwoBytes((((long) audioManager.getStreamVolume(3)) * 100) / ((long) audioManager.getStreamMaxVolume(3)));
        this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("AudioRenderController", 0);
    }

    @Override // O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String uri, String title, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        Object obj = this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(uri, "uri");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(title, "title");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "SetAVTransportURI: " + title + ", " + uri);
        Service service = (Service) obj;
        boolean z = (service != null ? service.getAction("SetAVTransportURI") : null) == null;
        if (z) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "[Unsupported]".concat("SetAVTransportURI"));
        }
        if (z) {
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, "Service not support this action.", 2);
                if (kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper.myLooper(), Looper.getMainLooper())) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.run();
                    return;
                } else {
                    ((Handler) this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).post(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    return;
                }
            }
            return;
        }
        VideoItem videoItem = new VideoItem(title, "-1", title, (String) null, new Res[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("<item id=\"" + title + "\" parentID=\"-1\" restricted=\"1\">");
        sb.append("<dc:title>" + title + "</dc:title>");
        sb.append("<upnp:class>" + videoItem.getClazz().getValue() + "</upnp:class>");
        sb.append("<res protocolInfo=\"http-get:*:video/mp4:*;DLNA.ORG_OP=01;\">" + uri + "</res>");
        sb.append("</item>");
        String string = sb.toString();
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "toString(...)");
        String str = String.format("<?xml version=\"1.0\"?><DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\">%s</DIDL-Lite>", Arrays.copyOf(new Object[]{string}, 1));
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "SetAVTransportURI: ".concat(str));
        ((ControlPoint) this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).execute(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(uri, str, this, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, (Service) obj), true));
    }

    public synchronized void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) ((HashMap) this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, (ReferenceQueue) this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f214O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
        }
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
        synchronized (this) {
            ((HashMap) this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).remove(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f213O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f214O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null) {
                ((O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, true, false, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
            }
        }
    }

    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        long jAddAndGet = ((AtomicLong) this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).addAndGet(j);
        long jIncrementAndGet = ((AtomicLong) this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).incrementAndGet();
        if (jIncrementAndGet > 1) {
            long j2 = (10 * j) - ((jAddAndGet * 10) / jIncrementAndGet);
            ((AtomicLong) this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).addAndGet(j2 * j2);
        }
        AtomicLong atomicLong = (AtomicLong) this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (long j3 = atomicLong.get(); j > j3 && !atomicLong.compareAndSet(j3, j); j3 = atomicLong.get()) {
        }
    }

    public void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String channelName, UnsignedIntegerTwoBytes desiredVolume) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(channelName, "channelName");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(desiredVolume, "desiredVolume");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "setVolume: " + desiredVolume.getValue());
        this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = desiredVolume;
        int iLongValue = (int) desiredVolume.getValue().longValue();
        AudioManager audioManager = (AudioManager) this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        audioManager.setStreamVolume(3, (audioManager.getStreamMaxVolume(3) * iLongValue) / 100, 5);
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        switch (i) {
            case 2:
                this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new AtomicLong();
                this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new AtomicLong();
                this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new AtomicLong();
                this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new AtomicLong();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
                this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();
                this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ReferenceQueue();
                this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 1));
                break;
        }
    }

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(ControlPoint controlPoint, Service service) {
        this.f72O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = controlPoint;
        this.f73O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = service;
        this.f74O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new Handler(Looper.getMainLooper());
        this.f75O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("AvTransportService", 0);
    }
}
