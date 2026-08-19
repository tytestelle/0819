package com.github.tvbox.osc.bean;

/* JADX INFO: loaded from: classes.dex */
public class Appoint {
    private String dateStr;
    private String timeStr;
    private int largeGroupIndex = -1;
    private int groupIndex = -1;
    private int itemIndex = -1;
    private int epgDateIndex = -1;
    private int epgIndex = -1;
    private long time = -1;

    public String getDateStr() {
        return this.dateStr;
    }

    public int getEpgDateIndex() {
        return this.epgDateIndex;
    }

    public int getEpgIndex() {
        return this.epgIndex;
    }

    public int getGroupIndex() {
        return this.groupIndex;
    }

    public int getItemIndex() {
        return this.itemIndex;
    }

    public int getLargeGroupIndex() {
        return this.largeGroupIndex;
    }

    public long getTime() {
        return this.time;
    }

    public String getTimeStr() {
        return this.timeStr;
    }

    public void setDateStr(String str) {
        this.dateStr = str;
    }

    public void setEpgDateIndex(int i) {
        this.epgDateIndex = i;
    }

    public void setEpgIndex(int i) {
        this.epgIndex = i;
    }

    public void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public void setItemIndex(int i) {
        this.itemIndex = i;
    }

    public void setLargeGroupIndex(int i) {
        this.largeGroupIndex = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTimeStr(String str) {
        this.timeStr = str;
    }
}
