package androidx.leanback.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public abstract class PresenterSelector {
    public abstract Presenter getPresenter(Object obj);

    @SuppressLint({"NullableCollection"})
    public Presenter[] getPresenters() {
        return null;
    }
}
