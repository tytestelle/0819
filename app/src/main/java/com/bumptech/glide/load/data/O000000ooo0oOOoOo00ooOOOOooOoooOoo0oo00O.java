package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f2891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f2892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public HttpURLConnection f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public InputStream f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public volatile boolean f2895O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, int i) {
        this.f2891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        this.f2892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        InputStream inputStream = this.f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(com.bumptech.glide.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        StringBuilder sb;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f2891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f815O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), 0, null, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jElapsedRealtimeNanos));
            }
        }
    }

    public final InputStream O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(URL url, int i, URL url2, Map map) throws O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
        if (i >= 5) {
            throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.f2892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getInputStream();
                if (this.f2895O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                    return null;
                }
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                int i3 = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = httpURLConnection2.getInputStream();
                        }
                        return this.f2894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    } catch (IOException e) {
                        throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("Failed to obtain InputStream", O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == -1) {
                        throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    }
                    try {
                        throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getResponseMessage(), iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    } catch (IOException e2) {
                        throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("Failed to get a response message", iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, e2);
                    }
                }
                String headerField = this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("Received empty or null redirect url", iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Bad redirect url: ", headerField), iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, e3);
                }
            } catch (IOException e4) {
                throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("Failed to connect or obtain data", O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2893O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), e4);
            }
        } catch (IOException e5) {
            throw new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void cancel() {
        this.f2895O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
    }

    @Override // com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getDataSource() {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.REMOTE;
    }
}
