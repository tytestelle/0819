package com.orhanobut.hawk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
final class SharedPreferencesStorage implements Storage {
    private final SharedPreferences preferences;

    public SharedPreferencesStorage(Context context, String str) {
        this.preferences = context.getSharedPreferences(str, 0);
    }

    private SharedPreferences.Editor getEditor() {
        return this.preferences.edit();
    }

    @Override // com.orhanobut.hawk.Storage
    public boolean contains(String str) {
        return this.preferences.contains(str);
    }

    @Override // com.orhanobut.hawk.Storage
    public long count() {
        return this.preferences.getAll().size();
    }

    @Override // com.orhanobut.hawk.Storage
    public boolean delete(String str) {
        return getEditor().remove(str).commit();
    }

    @Override // com.orhanobut.hawk.Storage
    public boolean deleteAll() {
        return getEditor().clear().commit();
    }

    @Override // com.orhanobut.hawk.Storage
    public <T> T get(String str) {
        return (T) this.preferences.getString(str, null);
    }

    @Override // com.orhanobut.hawk.Storage
    public <T> boolean put(String str, T t) {
        HawkUtils.checkNull("key", str);
        return getEditor().putString(str, String.valueOf(t)).commit();
    }

    public SharedPreferencesStorage(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }
}
