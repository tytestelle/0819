package androidx.leanback.database;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public abstract class CursorMapper {
    private Cursor mCursor;

    public abstract Object bind(Cursor cursor);

    public abstract void bindColumns(Cursor cursor);

    public Object convert(Cursor cursor) {
        if (cursor != this.mCursor) {
            this.mCursor = cursor;
            bindColumns(cursor);
        }
        return bind(this.mCursor);
    }
}
