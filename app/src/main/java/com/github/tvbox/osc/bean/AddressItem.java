package com.github.tvbox.osc.bean;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AddressItem {
    private String Url;
    private String UrlName;
    private boolean b64decode;
    private String format;
    private String headers;
    private boolean isSelected;
    private String itemId;
    private String pass;
    private String requestUrl;
    private String user;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.UrlName, ((AddressItem) obj).UrlName);
    }

    public String getFormat() {
        return this.format;
    }

    public String getHeaders() {
        return this.headers;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getLiveUrl() {
        return this.Url;
    }

    public String getLiveUrlName() {
        return this.UrlName;
    }

    public String getPass() {
        return this.pass;
    }

    public String getRequestUrl() {
        return TextUtils.isEmpty(this.requestUrl) ? this.Url : this.requestUrl;
    }

    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        return Objects.hash(this.UrlName);
    }

    public boolean isB64decode() {
        return this.b64decode;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setB64decode(boolean z) {
        this.b64decode = z;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setHeaders(String str) {
        this.headers = str;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setLiveUrl(String str) {
        this.Url = str;
    }

    public void setLiveUrlName(String str) {
        this.UrlName = str;
    }

    public void setPass(String str) {
        this.pass = str;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setUser(String str) {
        this.user = str;
    }
}
