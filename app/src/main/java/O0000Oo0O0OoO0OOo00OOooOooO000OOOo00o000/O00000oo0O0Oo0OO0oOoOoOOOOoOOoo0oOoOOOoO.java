package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import java.util.Date;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO extends WebSocketListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "";

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final JSONArray f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new JSONArray();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final String f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(String str) {
        this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i, String str) {
        super.onClosed(webSocket, i, str);
        this.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sb.append(String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onClosed", "关闭完成:" + i + "|" + str));
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sb.toString();
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(WebSocket webSocket, int i, String str) {
        super.onClosing(webSocket, i, str);
        this.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sb.append(String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onClosing", "关闭中" + i + "|" + str));
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sb.toString();
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
        super.onFailure(webSocket, th, response);
        this.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sb.append(String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onClosed", "遇到错误:" + th));
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sb.toString();
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        super.onMessage(webSocket, str);
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onMessage", "收到消息");
        this.f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(str);
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        super.onOpen(webSocket, response);
        this.f1530O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onOpen", "打开成功");
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, ByteString byteString) {
        super.onMessage(webSocket, byteString);
        this.f1531O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO += String.format("[%tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS:%1$tL] [%s] [%s]: %s\n", new Date(), this.f1533O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "onMessage", "收到消息");
        this.f1532O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(byteString.hex());
    }
}
