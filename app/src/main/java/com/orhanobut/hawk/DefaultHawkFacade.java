package com.orhanobut.hawk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultHawkFacade implements HawkFacade {
    private final Converter converter;
    private final Encryption encryption;
    private final LogInterceptor logInterceptor;
    private final Serializer serializer;
    private final Storage storage;

    public DefaultHawkFacade(HawkBuilder hawkBuilder) {
        Encryption encryption = hawkBuilder.getEncryption();
        this.encryption = encryption;
        this.storage = hawkBuilder.getStorage();
        this.converter = hawkBuilder.getConverter();
        this.serializer = hawkBuilder.getSerializer();
        LogInterceptor logInterceptor = hawkBuilder.getLogInterceptor();
        this.logInterceptor = logInterceptor;
        logInterceptor.onLog("Hawk.init -> Encryption : ".concat(encryption.getClass().getSimpleName()));
    }

    private void log(String str) {
        this.logInterceptor.onLog(str);
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public boolean contains(String str) {
        return this.storage.contains(str);
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public long count() {
        return this.storage.count();
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public boolean delete(String str) {
        return this.storage.delete(str);
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public boolean deleteAll() {
        return this.storage.deleteAll();
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public void destroy() {
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public <T> T get(String str) {
        String strDecrypt;
        log(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Hawk.get -> key: ", str));
        T t = null;
        if (str == null) {
            log("Hawk.get -> null key, returning null value ");
            return null;
        }
        String str2 = (String) this.storage.get(str);
        log(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Hawk.get -> Fetched from storage : ", str2));
        if (str2 == null) {
            log("Hawk.get -> Fetching from storage failed");
            return null;
        }
        DataInfo dataInfoDeserialize = this.serializer.deserialize(str2);
        log("Hawk.get -> Deserialized");
        if (dataInfoDeserialize == null) {
            log("Hawk.get -> Deserialization failed");
            return null;
        }
        try {
            strDecrypt = this.encryption.decrypt(str, dataInfoDeserialize.cipherText);
            try {
                log("Hawk.get -> Decrypted to : " + strDecrypt);
            } catch (Exception e) {
                e = e;
                log("Hawk.get -> Decrypt failed: " + e.getMessage());
            }
        } catch (Exception e2) {
            e = e2;
            strDecrypt = null;
        }
        if (strDecrypt == null) {
            log("Hawk.get -> Decrypt failed");
            return null;
        }
        try {
            t = (T) this.converter.fromString(strDecrypt, dataInfoDeserialize);
            log("Hawk.get -> Converted to : " + t);
            return t;
        } catch (Exception unused) {
            log("Hawk.get -> Converter failed");
            return t;
        }
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public boolean isBuilt() {
        return true;
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public <T> boolean put(String str, T t) {
        HawkUtils.checkNull("Key", str);
        log("Hawk.put -> key: " + str + ", value: " + t);
        if (t == null) {
            log("Hawk.put -> Value is null. Any existing value will be deleted with the given key");
            return delete(str);
        }
        String string = this.converter.toString(t);
        log(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Hawk.put -> Converted to ", string));
        if (string == null) {
            log("Hawk.put -> Converter failed");
            return false;
        }
        String strEncrypt = null;
        try {
            strEncrypt = this.encryption.encrypt(str, string);
            log("Hawk.put -> Encrypted to  " + strEncrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (strEncrypt == null) {
            log("Hawk.put -> Encryption failed");
            return false;
        }
        String strSerialize = this.serializer.serialize(strEncrypt, t);
        log(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Hawk.put -> Serialized to", strSerialize));
        if (strSerialize == null) {
            log("Hawk.put -> Serialization failed");
            return false;
        }
        if (this.storage.put(str, strSerialize)) {
            log("Hawk.put -> Stored successfully");
            return true;
        }
        log("Hawk.put -> Store operation failed");
        return false;
    }

    @Override // com.orhanobut.hawk.HawkFacade
    public <T> T get(String str, T t) {
        T t2 = (T) get(str);
        return t2 == null ? t : t2;
    }
}
