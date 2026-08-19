package com.tencent.smtt.utils;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.smtt.sdk.WebView;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static DexClassLoader b;
    private static Looper c;
    private static d d;
    public String a;

    public interface a {
        void a();

        void a(int i);

        void a(Throwable th);
    }

    private d(Context context) {
        this.a = "";
        StringBuilder sb = new StringBuilder();
        sb.append(context.getDir("debugtbs", 0).getAbsolutePath());
        this.a = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, File.separator, "plugin");
    }

    public static d a(Context context) {
        if (d == null) {
            d = new d(context);
        }
        return d;
    }

    public void a(final String str, final WebView webView, final Context context) {
        final RelativeLayout relativeLayout = new RelativeLayout(context);
        final TextView textView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        textView.setText("加载中，请稍后...");
        relativeLayout.addView(textView, layoutParams);
        webView.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, File.separator, "DebugPlugin.tbs");
        FileUtil.b(new File(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00));
        a(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, new a() { // from class: com.tencent.smtt.utils.d.1
            @Override // com.tencent.smtt.utils.d.a
            public void a() {
                webView.post(new Runnable() { // from class: com.tencent.smtt.utils.d.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(context, "下载成功", 0).show();
                        relativeLayout.setVisibility(4);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        d.this.a(str, webView, context, d.c);
                    }
                });
            }

            @Override // com.tencent.smtt.utils.d.a
            public void a(final int i) {
                webView.post(new Runnable() { // from class: com.tencent.smtt.utils.d.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        textView.setText("已下载" + i + "%");
                    }
                });
            }

            @Override // com.tencent.smtt.utils.d.a
            public void a(Throwable th) {
                webView.post(new Runnable() { // from class: com.tencent.smtt.utils.d.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(context, "下载失败，请检查网络", 0).show();
                    }
                });
            }
        });
    }

    @SuppressLint({"NewApi"})
    public void a(String str, WebView webView, Context context, Looper looper) {
        TbsLog.i("debugtbs", "showPluginView -- url: " + str + "; webview: " + webView + "; context: " + context);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str2 = File.separator;
        String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, str2, "DebugPlugin.tbs");
        String str3 = this.a + str2 + "DebugPlugin.apk";
        File file = new File(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        File file2 = new File(str3);
        c = looper;
        if (file.exists()) {
            file2.delete();
            file.renameTo(file2);
        }
        if (!file2.exists()) {
            TbsLog.i("debugtbs", "showPluginView - going to download plugin...");
            a(str, webView, context);
            return;
        }
        try {
            String strA = b.a(context, true, new File(str3));
            if (!"308202fb308201e3a0030201020204375ef026300d06092a864886f70d01010b0500302e310b3009060355040613023836311f301d0603550403131674656e63656e7462726f7773696e6773657276696365301e170d3232303531383038333632345a170d3437303531323038333632345a302e310b3009060355040613023836311f301d0603550403131674656e63656e7462726f7773696e677365727669636530820122300d06092a864886f70d01010105000382010f003082010a0282010100c85799a78f706304be13eba6b9d824cf61f3bc15bf0536fb7272c0d93dd0e6574249cf13e0120e843a5b3d25c2ca899d175e0689633f4aac7de14011073fd35266d342e7da9a9f7ecd20872a1183556d5ef9a4b0a53f59cec0d877ea9472b974d1a4902d0031d3b6ace2a06a4fc3475cf8c5b759e9b5c1c6c252b6698a940971c81ff25e6e16e998f102128649db8465786dacd1adbadba0e1673099596eefa51ba245106d6e4121d83ef1540e546dbbabda80a1763094bc12abe5b667c7619ba194043c204ccd60a4b23ed9283cbb19d69f5a662b55f855d11048f9c91834b4849e711ae486c3337ae7cfa2dde3cb0e70c5e1ef30db86e3a9ec02ee3be90b690203010001a321301f301d0603551d0e041604148c544df62af09c37c889982a833dd664abc7ab63300d06092a864886f70d01010b050003820101003d67c21bcbc4d5ba11727a85157df542d35de5f0ead38aa3ee65017298ed5e9692f71993a44e7ece954da1314450324e6b93f0cd927b1ff836d1ff237c13e4a226a4d1d66d0f73681ee90b0a71606726799c4cb350d4c97e38076d27039762b5b117eaabc2fb2f8adaa0ca5be5b336dfbc47e3390803fadf3d62f208f5c5b213f113a77b59bf9a0706390e0963e11f9fa622b4091f7189ffa56042ba3d21b5299ecdc533eee59471169b20927288c5331e13c526918487664443cb7e6a40d6d7df3a17386c323ebf3b4066f73aee5c7381f52f0388c48b5a6e45bc6a524ca9f028a7428dc72388857a3acd56e6cf8458463cdb53b1547a272f2613970763ec12".equals(strA)) {
                TbsLog.e("debugtbs", "verifyPlugin apk: " + str3 + " signature failed - sig: " + strA);
                Toast.makeText(context, "插件校验失败，请重试", 0).show();
                file.delete();
                file2.delete();
                return;
            }
            String str4 = this.a + str2 + "opt";
            File file3 = new File(str4);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            if (b == null) {
                b = new DexClassLoader(str3, str4, null, context.getClassLoader());
            }
            HashMap map = new HashMap();
            map.put("url", str);
            map.put("tbs_version", "" + WebView.getTbsSDKVersion(context));
            map.put("tbs_core_version", "" + WebView.getTbsCoreVersion(context));
            if (c != null) {
                map.put("looper", looper);
            }
            Object objNewInstance = b.loadClass("com.tencent.tbs.debug.plugin.DebugView").getConstructor(Context.class, Map.class).newInstance(context, map);
            if (!(objNewInstance instanceof FrameLayout)) {
                TbsLog.e("debugtbs", "get debugview failure: " + objNewInstance);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) objNewInstance;
            webView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.i("debugtbs", "show " + frameLayout + " successful in " + webView);
        } catch (Exception e) {
            FileUtil.b(file2);
            e.printStackTrace();
        }
    }

    @SuppressLint({"NewApi"})
    public static void a(final String str, final a aVar) {
        new Thread() { // from class: com.tencent.smtt.utils.d.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                FileOutputStream fileOutputStream;
                InputStream inputStream = null;
                fileOutputStreamD = null;
                FileOutputStream fileOutputStreamD = null;
                inputStream = null;
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://tbs.imtt.qq.com/plugin/DebugPlugin_v2.tbs").openConnection();
                        int contentLength = httpURLConnection.getContentLength();
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.connect();
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            fileOutputStreamD = FileUtil.d(new File(str));
                            byte[] bArr = new byte[8192];
                            int i = 0;
                            while (true) {
                                int i2 = inputStream2.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                i += i2;
                                fileOutputStreamD.write(bArr, 0, i2);
                                aVar.a((i * 100) / contentLength);
                            }
                            aVar.a();
                            try {
                                inputStream2.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            fileOutputStreamD.close();
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStreamD;
                            inputStream = inputStream2;
                            try {
                                e.printStackTrace();
                                aVar.a(e);
                                try {
                                    inputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    inputStream.close();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStreamD;
                            inputStream = inputStream2;
                            inputStream.close();
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }.start();
    }
}
