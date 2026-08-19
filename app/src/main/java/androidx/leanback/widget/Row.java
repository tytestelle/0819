package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class Row {
    private static final int FLAG_ID_USE_HEADER = 1;
    private static final int FLAG_ID_USE_ID = 0;
    private static final int FLAG_ID_USE_MASK = 1;
    private HeaderItem mHeaderItem;
    private int mFlags = 1;
    private long mId = -1;

    public Row(long j, HeaderItem headerItem) {
        setId(j);
        setHeaderItem(headerItem);
    }

    public final int getFlags() {
        return this.mFlags;
    }

    public final HeaderItem getHeaderItem() {
        return this.mHeaderItem;
    }

    public final long getId() {
        if ((this.mFlags & 1) != 1) {
            return this.mId;
        }
        HeaderItem headerItem = getHeaderItem();
        if (headerItem != null) {
            return headerItem.getId();
        }
        return -1L;
    }

    public boolean isRenderedAsRowView() {
        return true;
    }

    public final void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (~i2));
    }

    public final void setHeaderItem(HeaderItem headerItem) {
        this.mHeaderItem = headerItem;
    }

    public final void setId(long j) {
        this.mId = j;
        setFlags(0, 1);
    }

    public Row(HeaderItem headerItem) {
        setHeaderItem(headerItem);
    }

    public Row() {
    }
}
