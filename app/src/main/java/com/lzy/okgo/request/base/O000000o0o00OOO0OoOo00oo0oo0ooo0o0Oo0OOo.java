package com.lzy.okgo.request.base;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends RequestBody {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public RequestBody f3775O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        try {
            return this.f3775O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f3775O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        BufferedSink bufferedSinkBuffer = Okio.buffer(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, bufferedSink));
        this.f3775O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}
