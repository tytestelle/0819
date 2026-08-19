package okhttp3.dnsoverhttps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public class DnsOverHttps implements Dns {
    public static final MediaType DNS_MESSAGE = MediaType.get("application/dns-message");
    public static final int MAX_RESPONSE_SIZE = 65536;
    private final OkHttpClient client;
    private HashMap<String, InetAddress> hostMap = new HashMap<>();
    private final boolean includeIPv6;
    private final boolean post;
    private final boolean resolvePrivateAddresses;
    private final boolean resolvePublicAddresses;
    private HttpUrl url;

    public static final class Builder {

        @Nullable
        OkHttpClient client = null;

        @Nullable
        HttpUrl url = null;
        boolean includeIPv6 = true;
        boolean post = false;
        Dns systemDns = Dns.SYSTEM;

        @Nullable
        List<InetAddress> bootstrapDnsHosts = null;
        boolean resolvePrivateAddresses = false;
        boolean resolvePublicAddresses = true;

        public Builder bootstrapDnsHosts(@Nullable List<InetAddress> list) {
            this.bootstrapDnsHosts = list;
            return this;
        }

        public DnsOverHttps build() {
            return new DnsOverHttps(this);
        }

        public Builder client(OkHttpClient okHttpClient) {
            this.client = okHttpClient;
            return this;
        }

        public Builder includeIPv6(boolean z) {
            this.includeIPv6 = z;
            return this;
        }

        public Builder post(boolean z) {
            this.post = z;
            return this;
        }

        public Builder resolvePrivateAddresses(boolean z) {
            this.resolvePrivateAddresses = z;
            return this;
        }

        public Builder resolvePublicAddresses(boolean z) {
            this.resolvePublicAddresses = z;
            return this;
        }

        public Builder systemDns(Dns dns) {
            this.systemDns = dns;
            return this;
        }

        public Builder url(HttpUrl httpUrl) {
            this.url = httpUrl;
            return this;
        }

        public Builder bootstrapDnsHosts(InetAddress... inetAddressArr) {
            return bootstrapDnsHosts(Arrays.asList(inetAddressArr));
        }
    }

    public DnsOverHttps(Builder builder) {
        OkHttpClient okHttpClient = builder.client;
        if (okHttpClient == null) {
            throw new NullPointerException("client not set");
        }
        this.url = builder.url;
        this.includeIPv6 = builder.includeIPv6;
        this.post = builder.post;
        this.resolvePrivateAddresses = builder.resolvePrivateAddresses;
        this.resolvePublicAddresses = builder.resolvePublicAddresses;
        this.client = okHttpClient.newBuilder().dns(buildBootstrapClient(builder)).build();
    }

    private static Dns buildBootstrapClient(Builder builder) {
        List<InetAddress> list = builder.bootstrapDnsHosts;
        return list != null ? new BootstrapDns(builder.url.host(), list) : builder.systemDns;
    }

    private void buildRequest(String str, List<Call> list, List<InetAddress> list2, List<Exception> list3, int i) {
        Request requestBuildRequest = buildRequest(str, i);
        Response cacheOnlyResponse = getCacheOnlyResponse(requestBuildRequest);
        if (cacheOnlyResponse != null) {
            processResponse(cacheOnlyResponse, str, list2, list3);
        } else {
            list.add(this.client.newCall(requestBuildRequest));
        }
    }

    private void executeRequests(final String str, List<Call> list, final List<InetAddress> list2, final List<Exception> list3) {
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator<Call> it = list.iterator();
        while (it.hasNext()) {
            it.next().enqueue(new Callback() { // from class: okhttp3.dnsoverhttps.DnsOverHttps.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    synchronized (list3) {
                        list3.add(iOException);
                    }
                    countDownLatch.countDown();
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    DnsOverHttps.this.processResponse(response, str, list2, list3);
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            list3.add(e);
        }
    }

    private byte[] executeRequestsSync(String str, int i) {
        Request requestBuildRequest = buildRequest(str, i);
        Response cacheOnlyResponse = getCacheOnlyResponse(requestBuildRequest);
        if (cacheOnlyResponse == null) {
            cacheOnlyResponse = this.client.newCall(requestBuildRequest).execute();
        }
        return cacheOnlyResponse.body().bytes();
    }

    @Nullable
    private Response getCacheOnlyResponse(Request request) {
        if (this.post || this.client.cache() == null) {
            return null;
        }
        try {
            Response responseExecute = this.client.newCall(request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build()).execute();
            if (responseExecute.code() != 504) {
                return responseExecute;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private String getHostnameFromUrl(String str) {
        try {
            HttpUrl httpUrl = HttpUrl.parse(str);
            return httpUrl != null ? httpUrl.host() : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isPrivateHost(String str) {
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(str) == null;
    }

    private List<InetAddress> lookupHttps(String str) {
        List<Call> arrayList = new ArrayList<>(2);
        List<Exception> arrayList2 = new ArrayList<>(2);
        ArrayList arrayList3 = new ArrayList(5);
        buildRequest(str, arrayList, arrayList3, arrayList2, 1);
        if (this.includeIPv6) {
            buildRequest(str, arrayList, arrayList3, arrayList2, 28);
        }
        executeRequests(str, arrayList, arrayList3, arrayList2);
        return !arrayList3.isEmpty() ? arrayList3 : Dns.SYSTEM.lookup(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(Response response, String str, List<InetAddress> list, List<Exception> list2) {
        try {
            List<InetAddress> response2 = readResponse(str, response);
            synchronized (list) {
                list.addAll(response2);
            }
        } catch (Exception e) {
            synchronized (list2) {
                list2.add(e);
            }
        }
    }

    private List<InetAddress> readResponse(String str, Response response) {
        if (response.cacheResponse() == null && response.protocol() != Protocol.HTTP_2) {
            Platform.get().log(5, "Incorrect protocol: " + response.protocol(), null);
        }
        try {
            if (!response.isSuccessful()) {
                throw new IOException("response: " + response.code() + " " + response.message());
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody.contentLength() <= 65536) {
                List<InetAddress> listDecodeAnswers = DnsRecordCodec.decodeAnswers(str, responseBodyBody.source().readByteString());
                response.close();
                return listDecodeAnswers;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + responseBodyBody.contentLength() + " bytes");
        } catch (Throwable th) {
            response.close();
            throw th;
        }
    }

    public OkHttpClient client() {
        return this.client;
    }

    public boolean includeIPv6() {
        return this.includeIPv6;
    }

    @Override // okhttp3.Dns
    @NonNull
    public List<InetAddress> lookup(@NonNull String str) throws UnknownHostException {
        HashMap<String, InetAddress> map = this.hostMap;
        if (map != null && map.containsKey(str)) {
            return Collections.singletonList(this.hostMap.get(str));
        }
        if (this.url == null) {
            return Dns.SYSTEM.lookup(str);
        }
        if (!this.resolvePrivateAddresses || !this.resolvePublicAddresses) {
            boolean zIsPrivateHost = isPrivateHost(str);
            if (zIsPrivateHost && !this.resolvePrivateAddresses) {
                throw new UnknownHostException("private hosts not resolved");
            }
            if (!zIsPrivateHost && !this.resolvePublicAddresses) {
                throw new UnknownHostException("public hosts not resolved");
            }
        }
        return lookupHttps(str);
    }

    public String lookupHost(String str) {
        HashMap<String, InetAddress> map = this.hostMap;
        return (map == null || !map.containsKey(str)) ? "" : this.hostMap.get(str).getHostName();
    }

    public byte[] lookupHttpsForwardSync(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(executeRequestsSync(str, 1));
        byteArrayOutputStream.write(executeRequestsSync(str, 28));
        return byteArrayOutputStream.toByteArray();
    }

    public boolean post() {
        return this.post;
    }

    public void resethostMap() {
        this.hostMap.clear();
    }

    public boolean resolvePrivateAddresses() {
        return this.resolvePrivateAddresses;
    }

    public boolean resolvePublicAddresses() {
        return this.resolvePublicAddresses;
    }

    public void setDomainIp(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        try {
            this.hostMap.put(getHostnameFromUrl(str), InetAddress.getByName(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUrl(HttpUrl httpUrl) {
        this.url = httpUrl;
    }

    public HttpUrl url() {
        return this.url;
    }

    private Request buildRequest(String str, int i) {
        Request.Builder builderUrl;
        Request.Builder builder = new Request.Builder();
        MediaType mediaType = DNS_MESSAGE;
        Request.Builder builderHeader = builder.header("Accept", mediaType.toString());
        ByteString byteStringEncodeQuery = DnsRecordCodec.encodeQuery(str, i);
        if (this.post) {
            builderUrl = builderHeader.url(this.url).post(RequestBody.create(mediaType, byteStringEncodeQuery));
        } else {
            builderUrl = builderHeader.url(this.url.newBuilder().addQueryParameter("dns", byteStringEncodeQuery.base64Url().replace("=", "")).build());
        }
        return builderUrl.build();
    }
}
